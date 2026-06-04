#!/usr/bin/env python3
"""
Phase 5 import conflict fixer v2: removes imports whose simple name
matches ANY class in the same package (not just the file's own class).
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

# Parse build output for all "single-type-import" errors
build_output_file = str(THIS_DIR.parent / 'docs' / 'build-output-phase5g2.txt')

# Collect all conflicting imports from error messages
conflict_files = set()
if os.path.exists(build_output_file):
    with open(build_output_file) as f:
        for line in f:
            if 'single-type-import' in line or 'already defined' in line:
                m = re.match(r'^(\./)?(.+?\.java):\d+:\s*error:', line)
                if m:
                    conflict_files.add(m.group(2))

print(f"Files with import conflicts: {len(conflict_files)}")

CONFLICT_PKGS = [
    ('com.tsf', ['a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z']),
    ('com.tsf.shell', ['a','b','c','d','e','f','g','h','i','j','k']),
    ('com.tsf.shell.manager', ['a','b','c','d','e','f','g','h','i','j','k']),
    ('com.censivn.C3DEngine', ['a','b','c','d','e','f','g','h','i','j','k']),
]

fixed = 0
for fpath in sorted(conflict_files):
    if not os.path.exists(fpath):
        continue
    content = read_file(fpath)
    if not content:
        continue
    
    original = content
    
    # Get the package of this file
    pkg_match = re.search(r'^package\s+([\w.]+);', content, re.MULTILINE)
    if not pkg_match:
        continue
    file_pkg = pkg_match.group(1)
    
    # Get the directory of this file
    file_dir = os.path.dirname(fpath)
    
    # Get all class files in the same directory
    same_pkg_classes = set()
    if os.path.isdir(file_dir):
        for f in os.listdir(file_dir):
            if f.endswith('.java'):
                same_pkg_classes.add(f[:-5])
    
    # Also check classes referenced via inner classes in the file itself
    own_classes = set()
    own_classes.add(os.path.splitext(os.path.basename(fpath))[0])
    for m in re.finditer(r'(?:public\s+)?(?:class|interface|enum)\s+(\w+)', content):
        own_classes.add(m.group(1))
    
    # Find single-type imports that conflict with any class in this package
    import_lines = re.findall(r'^(import\s+([\w.]+)\.(\w+);)', content, re.MULTILINE)
    for full_import, import_pkg, simple_name in import_lines:
        if simple_name in same_pkg_classes or simple_name in own_classes:
            # This import conflicts with a same-package class
            content = content.replace(full_import + '\n', '')
            content = content.replace(full_import, '')
    
    if content != original:
        write_file(fpath, content)
        fixed += 1
        print(f"Fixed: {fpath}")

print(f"\nTotal fixed: {fixed}")
