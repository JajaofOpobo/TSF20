#!/usr/bin/env python3
"""Extract Git-detected file rename pairs into a TSV ledger."""

from __future__ import annotations

import argparse
import subprocess
from pathlib import Path


def run_git(scope: str | None, rename_limit: int) -> str:
    cmd = [
        "git",
        "-c",
        f"diff.renameLimit={rename_limit}",
        "log",
        "--all",
        "--name-status",
        "--find-renames=40%",
        "--format=commit %H%x09%s",
    ]
    if scope:
        cmd.extend(["--", scope])
    return subprocess.check_output(cmd, text=True)


def parse_renames(log_text: str) -> list[tuple[str, str, str, str, str]]:
    current_commit = ""
    current_subject = ""
    rows: list[tuple[str, str, str, str, str]] = []

    for raw_line in log_text.splitlines():
        line = raw_line.rstrip("\n")
        if not line:
            continue
        if line.startswith("commit "):
            payload = line[len("commit ") :]
            parts = payload.split("\t", 1)
            current_commit = parts[0]
            current_subject = parts[1] if len(parts) > 1 else ""
            continue

        parts = line.split("\t")
        if len(parts) != 3 or not parts[0].startswith("R"):
            continue

        similarity = parts[0][1:] or "unknown"
        old_path = parts[1]
        new_path = parts[2]
        rows.append((current_commit, current_subject, similarity, old_path, new_path))

    return rows


def write_tsv(rows: list[tuple[str, str, str, str, str]], output: Path) -> None:
    output.parent.mkdir(parents=True, exist_ok=True)
    with output.open("w", encoding="utf-8") as handle:
        handle.write("commit\tsubject\tsimilarity\told_path\tnew_path\n")
        for row in rows:
            handle.write("\t".join(cell.replace("\t", " ") for cell in row))
            handle.write("\n")


def main() -> int:
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("--scope", help="Optional path scope, e.g. sources/sources/com/tsf/shell")
    parser.add_argument("--output", default="docs/deobfuscation_rename_ledger.tsv")
    parser.add_argument("--rename-limit", type=int, default=10000)
    args = parser.parse_args()

    log_text = run_git(args.scope, args.rename_limit)
    rows = parse_renames(log_text)
    write_tsv(rows, Path(args.output))
    print(f"wrote {len(rows)} rename rows to {args.output}")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
