#!/usr/bin/env python3
"""Fix remaining same-package bare type references."""
import os, re, subprocess, sys

BASE_SRC = os.path.join(os.path.dirname(os.path.dirname(os.path.abspath(__file__))), 'sources/sources')
LEDGER = os.path.join(os.path.dirname(os.path.dirname(os.path.abspath(__file__))), 'docs/deobfuscation_rename_ledger_complete.tsv')
PROJECT_DIR = os.path.dirname(os.path.dirname(os.path.abspath(__file__)))


def build_type_map():
    """Build (pkg_dir, old_name) -> new_name from ledger.
    Handles both FILE RENAME entries (old_path→new_path) and
    CONSTRUCTOR entries (new_path→(ctor oldName→newName)).
    """
    pkg_map = {}
    with open(LEDGER) as f:
        for line in f:
            line = line.strip()
            if not line or line.startswith('#') or not '\t' in line: continue
            parts = line.split('\t')
            if len(parts) != 2: continue
            left, right = parts
            
            # Determine package directory from the path side
            
            if right.startswith('(ctor '):
                # Constructor entry:  new_path.java → (ctor oldName→newName)
                m = re.match(r'\(ctor\s+(\w+)→(\w+)\)', right)
                if m:
                    old_name, new_name = m.group(1), m.group(2)
                    pkg_path = left
                    if left.startswith('sources/sources/'):
                        pkg_path = left[len('sources/sources/'):]
                    pkg_dir = pkg_path.rsplit('/', 1)[0] if '/' in pkg_path else ''
                    pkg_map[(pkg_dir, old_name)] = new_name
            elif left.endswith('.java') and right.endswith('.java'):
                # File rename entry:  old_path.java → new_path.java
                old_name = left.rsplit('/', 1)[-1].replace('.java', '')
                new_name = right.rsplit('/', 1)[-1].replace('.java', '')
                
                if left.startswith('sources/sources/'):
                    rel = left[len('sources/sources/'):]
                elif left.startswith(BASE_SRC):
                    rel = left[len(BASE_SRC)+1:]
                else:
                    rel = left
                pkg_dir = rel.rsplit('/', 1)[0] if '/' in rel else ''
                if new_name != old_name:
                    pkg_map[(pkg_dir, old_name)] = new_name
    return pkg_map


def run_build():
    result = subprocess.run(['./gradlew', ':app:compileDebugJavaWithJavac'],
        capture_output=True, text=True, timeout=600, cwd=PROJECT_DIR)
    output = (result.stdout or '') + (result.stderr or '')
    errors = set()
    for line in output.split('\n'):
        m = re.match(r'^(/[^:]+\.java):(\d+): error: (.+)$', line.strip())
        if m:
            errors.add(os.path.relpath(m.group(1), BASE_SRC))
    return errors, output


def main():
    pkg_map = build_type_map()
    print(f"[1] Loaded {len(pkg_map)} type mappings")

    # Build per-package mapping
    pkg_types = {}
    for (pkg, old), new in pkg_map.items():
        if len(old) == 1 and old.isalpha():
            pkg_types.setdefault(pkg, {})[old] = new

    errors, output = run_build()
    before = len(errors)
    print(f"[2] Initial errors: {before}")

    error_dir_cache = {}
    total_replaced = 0
    total_files = 0

    for fpath in sorted(errors):
        rel_dir = fpath.rsplit('/', 1)[0] if '/' in fpath else ''
        
        old_names = pkg_types.get(rel_dir, {})
        if not old_names:
            continue

        full_path = os.path.join(BASE_SRC, fpath)
        with open(full_path) as f:
            content = f.read()

        changed = False
        for old_name, new_name in sorted(old_names.items(), key=lambda x: -len(x[0])):
            if old_name == new_name or len(old_name) != 1:
                continue
            new_content = content
            # Patterns: X.Identifier (inner class ref) or X.this (outer class ref)
            new_content = re.sub(
                r'(?<![a-zA-Z_$.0-9])' + re.escape(old_name) + r'\.(?=[A-Z]\w*|this\b)',
                new_name + '.',
                new_content
            )
            # extends X / implements X / super X
            new_content = re.sub(
                r'(extends|implements|super)\s+' + re.escape(old_name) + r'\b(?!\s*\.)',
                r'\1 ' + new_name,
                new_content
            )
            # new X(
            new_content = re.sub(
                r'new\s+' + re.escape(old_name) + r'\s*\(',
                'new ' + new_name + '(',
                new_content
            )
            # @X (annotation)
            new_content = re.sub(
                r'@' + re.escape(old_name) + r'\b',
                '@' + new_name,
                new_content
            )
            # (X) cast
            new_content = re.sub(
                r'\(\s*' + re.escape(old_name) + r'\s*\)',
                '(' + new_name + ')',
                new_content
            )
            # <X> generic parameter
            new_content = re.sub(
                r'<\s*' + re.escape(old_name) + r'\s*(?=[,>])',
                '<' + new_name,
                new_content
            )
            if new_content != content:
                changed = True
                total_replaced += 1
            content = new_content

        if changed:
            total_files += 1
            with open(full_path, 'w') as f:
                f.write(content)

    print(f"[3] Modified {total_files} files ({total_replaced} replacements)")

    errors2, output2 = run_build()
    after = len(errors2)
    
    # Categorize remaining
    pkg_ct = sum(1 for e in errors2 if 'package ' in output2.split(e + ':')[1].split('\n')[0] if e in output2)
    
    print(f"[4] Before: {before}, After: {after}, Change: {after-before}")
    return 0


if __name__ == '__main__':
    sys.exit(main())
