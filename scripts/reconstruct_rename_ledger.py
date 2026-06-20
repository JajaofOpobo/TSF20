#!/usr/bin/env python3
"""Infer Java rename pairs by comparing adjacent Git snapshots.

This goes beyond Git's built-in rename detector. For every commit touching a
scope, it compares the parent and child Java file sets, then scores deleted
files against added files using source similarity and Java metadata.
"""

from __future__ import annotations

import argparse
import difflib
import hashlib
import re
import subprocess
from dataclasses import dataclass
from pathlib import Path


CLASS_RE = re.compile(r"\b(?:class|interface|enum)\s+([A-Za-z_$][\w$]*)")
PACKAGE_RE = re.compile(r"^\s*package\s+([\w.]+)\s*;", re.MULTILINE)
IMPORT_RE = re.compile(r"^\s*import\s+([\w.*]+)\s*;", re.MULTILINE)
METHOD_RE = re.compile(r"\b([A-Za-z_$][\w$]*)\s*\([^;{}]*\)\s*(?:throws\s+[\w.,\s]+)?\{")
IDENT_RE = re.compile(r"\b[A-Za-z_$][\w$]*\b")
JAVA_KEYWORDS = frozenset({
    "abstract", "assert", "boolean", "break", "byte", "case", "catch", "char",
    "class", "const", "continue", "default", "do", "double", "else", "enum",
    "extends", "final", "finally", "float", "for", "goto", "if", "implements",
    "import", "instanceof", "int", "interface", "long", "native", "new",
    "package", "private", "protected", "public", "return", "short", "static",
    "strictfp", "super", "switch", "synchronized", "this", "throw", "throws",
    "transient", "try", "void", "volatile", "while", "true", "false", "null",
})


@dataclass(frozen=True)
class JavaFile:
    path: str
    text: str
    normalized: str
    sha1: str
    package: str
    primary_type: str
    imports: frozenset[str]
    methods: frozenset[str]
    identifiers: frozenset[str]


def git(args: list[str]) -> str:
    return subprocess.check_output(["git", *args], text=True, stderr=subprocess.DEVNULL)


def java_paths(rev: str, scope: str) -> list[str]:
    out = git(["ls-tree", "-r", "--name-only", rev, "--", scope])
    return [line for line in out.splitlines() if line.endswith(".java")]


def blob(rev: str, path: str) -> str:
    return git(["show", f"{rev}:{path}"])


def normalize(text: str) -> str:
    text = re.sub(r"/\*.*?\*/", "", text, flags=re.DOTALL)
    text = re.sub(r"//.*", "", text)
    text = re.sub(r"\s+", " ", text)
    return text.strip()


def metadata(rev: str, path: str) -> JavaFile:
    text = blob(rev, path)
    normalized = normalize(text)
    package = next(iter(PACKAGE_RE.findall(text)), "")
    primary_type = next(iter(CLASS_RE.findall(text)), "")
    imports = frozenset(IMPORT_RE.findall(text))
    methods = frozenset(name for name in METHOD_RE.findall(text) if name not in {"if", "for", "while", "switch"})
    identifiers = frozenset(
        name for name in IDENT_RE.findall(text)
        if name not in JAVA_KEYWORDS and len(name) > 1
    )
    sha1 = hashlib.sha1(normalized.encode("utf-8")).hexdigest()
    return JavaFile(path, text, normalized, sha1, package, primary_type, imports, methods, identifiers)


def jaccard(a: frozenset[str], b: frozenset[str]) -> float:
    if not a and not b:
        return 0.0
    return len(a & b) / len(a | b)


def basename(path: str) -> str:
    return Path(path).stem


def type_is_obfuscated(name: str) -> bool:
    return bool(re.fullmatch(r"[A-Za-z]", name))


def score_pair(old: JavaFile, new: JavaFile) -> tuple[float, str]:
    if old.sha1 == new.sha1:
        return 1.0, "exact-normalized"

    import_score = jaccard(old.imports, new.imports)
    method_score = jaccard(old.methods, new.methods)
    identifier_score = jaccard(old.identifiers, new.identifiers)
    package_parent_score = 0.0
    if old.package and new.package:
        old_parent = ".".join(old.package.split(".")[:-1])
        new_parent = ".".join(new.package.split(".")[:-1])
        package_parent_score = 1.0 if old_parent == new_parent else 0.0

    type_score = 0.0
    if old.primary_type and new.primary_type:
        if old.primary_type == new.primary_type:
            type_score = 1.0
        elif type_is_obfuscated(old.primary_type) and not type_is_obfuscated(new.primary_type):
            type_score = 0.55

    path_score = difflib.SequenceMatcher(None, old.path, new.path).ratio()
    size_ratio = min(len(old.normalized), len(new.normalized)) / max(len(old.normalized), len(new.normalized), 1)

    cheap_score = (
        identifier_score * 0.34
        + method_score * 0.22
        + import_score * 0.18
        + type_score * 0.10
        + path_score * 0.10
        + size_ratio * 0.06
    )
    if cheap_score < 0.33 or size_ratio < 0.35:
        reason = (
            f"cheap={cheap_score:.3f};size={size_ratio:.3f};methods={method_score:.3f};"
            f"imports={import_score:.3f};ids={identifier_score:.3f};type={type_score:.3f};"
            f"path={path_score:.3f}"
        )
        return cheap_score, reason

    seq = difflib.SequenceMatcher(None, old.normalized, new.normalized)
    content_score = seq.quick_ratio()
    if content_score > 0.80:
        content_score = seq.ratio()

    score = (
        content_score * 0.46
        + method_score * 0.15
        + import_score * 0.12
        + identifier_score * 0.09
        + type_score * 0.10
        + package_parent_score * 0.04
        + path_score * 0.04
    )
    reason = (
        f"content={content_score:.3f};methods={method_score:.3f};"
        f"imports={import_score:.3f};ids={identifier_score:.3f};"
        f"type={type_score:.3f};path={path_score:.3f}"
    )
    return score, reason


def best_matches(old_files: list[JavaFile], new_files: list[JavaFile], threshold: float) -> list[tuple[float, JavaFile, JavaFile, str]]:
    candidates: list[tuple[float, JavaFile, JavaFile, str]] = []
    for old in old_files:
        for new in new_files:
            score, reason = score_pair(old, new)
            if score >= threshold:
                candidates.append((score, old, new, reason))

    candidates.sort(key=lambda item: item[0], reverse=True)
    used_old: set[str] = set()
    used_new: set[str] = set()
    matches: list[tuple[float, JavaFile, JavaFile, str]] = []
    for score, old, new, reason in candidates:
        if old.path in used_old or new.path in used_new:
            continue
        used_old.add(old.path)
        used_new.add(new.path)
        matches.append((score, old, new, reason))
    return matches


def revs_for_scope(scope: str) -> list[str]:
    return git(["rev-list", "--reverse", "HEAD", "--", scope]).splitlines()


def added_deleted(parent: str, rev: str, scope: str) -> tuple[list[str], list[str]]:
    out = git(["diff", "--name-status", "--diff-filter=AD", parent, rev, "--", scope])
    added: list[str] = []
    deleted: list[str] = []
    for line in out.splitlines():
        parts = line.split("\t")
        if len(parts) != 2 or not parts[1].endswith(".java"):
            continue
        if parts[0] == "A":
            added.append(parts[1])
        elif parts[0] == "D":
            deleted.append(parts[1])
    return sorted(added), sorted(deleted)


def reconstruct(scope: str, threshold: float) -> list[list[str]]:
    rows: list[list[str]] = []
    for rev in revs_for_scope(scope):
        parents = git(["rev-list", "--parents", "-n", "1", rev]).split()
        if len(parents) < 2:
            continue
        parent = parents[1]
        subject = git(["log", "-n", "1", "--format=%s", rev]).strip()

        added, deleted = added_deleted(parent, rev, scope)
        if not deleted or not added:
            continue

        old_files = [metadata(parent, path) for path in deleted]
        new_files = [metadata(rev, path) for path in added]
        for score, old, new, reason in best_matches(old_files, new_files, threshold):
            rows.append([
                rev,
                subject,
                f"{score:.3f}",
                old.path,
                new.path,
                old.package,
                new.package,
                old.primary_type or basename(old.path),
                new.primary_type or basename(new.path),
                reason,
            ])
    return rows


def write_tsv(rows: list[list[str]], output: Path) -> None:
    output.parent.mkdir(parents=True, exist_ok=True)
    header = [
        "commit",
        "subject",
        "score",
        "old_path",
        "new_path",
        "old_package",
        "new_package",
        "old_type",
        "new_type",
        "reason",
    ]
    with output.open("w", encoding="utf-8") as handle:
        handle.write("\t".join(header) + "\n")
        for row in rows:
            handle.write("\t".join(cell.replace("\t", " ") for cell in row) + "\n")


def main() -> int:
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("--scope", default="sources/sources/com/tsf/shell")
    parser.add_argument("--output", default="docs/deobfuscation_rename_ledger_inferred.tsv")
    parser.add_argument("--threshold", type=float, default=0.62)
    args = parser.parse_args()

    rows = reconstruct(args.scope, args.threshold)
    write_tsv(rows, Path(args.output))
    print(f"wrote {len(rows)} inferred rename rows to {args.output}")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
