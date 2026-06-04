#!/usr/bin/env python3
"""
Phase 5 import conflict fixer: fixes remaining import conflicts
by removing conflicting single-type imports where the local class
name matches the import's simple name.
"""
import os, re, pathlib

THIS_DIR = pathlib.Path(__file__).parent.resolve()
SOURCES = str(THIS_DIR.parent / 'sources' / 'sources')

def read_file(path):
    try:
        with open(path, 'r', encoding='utf-8', errors='replace') as f:
            return f.read()
    except:
        return ''

def write_file(path, content):
    os.makedirs(os.path.dirname(path), exist_ok=True)
    with open(path, 'w') as f:
        f.write(content)

# Parse build output for error files
build_output_file = str(THIS_DIR.parent / 'docs' / 'build-output-phase5g2.txt')
error_files = set()

if os.path.exists(build_output_file):
    with open(build_output_file) as f:
        for line in f:
            if 'error:' in line:
                m = re.match(r'^(\./)?(.+?\.java):\d+:\s*error:', line)
                if m:
                    error_files.add(m.group(2))

print(f"Files with errors: {len(error_files)}")

fixed = 0
for fpath in sorted(error_files):
    if not os.path.exists(fpath):
        continue
    content = read_file(fpath)
    if not content:
        continue
    
    original = content
    fn_stem = os.path.splitext(os.path.basename(fpath))[0]
    
    # Find single-type imports matching local class name
    import_lines = re.findall(r'^(import\s+[\w.]+\.(\w+);)', content, re.MULTILINE)
    for full_import, simple_name in import_lines:
        if simple_name != fn_stem:
            continue
        content = content.replace(full_import + '\n', '')
        content = content.replace(full_import, '')
    
    if content != original:
        write_file(fpath, content)
        fixed += 1
        print(f"Fixed: {fpath} (removed import for '{fn_stem}')")

print(f"\nTotal fixed: {fixed}")
