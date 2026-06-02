#!/usr/bin/env python3
"""
###############################################################################
# CURRENT — Standalone tool
# Created: Jaja 2026-05-26 | Cataloged: opencode 2026-06-02
# Renames clash dirs (a/→_a/) and updates package declarations/imports.
# Handles 3 known clashes: com/tsf/shell/a, com/tsf/shell/f/d, f/f/a/_d/a.
# See fix_scripts_CATALOG.md for hierarchy
###############################################################################
Fix class/package clashes by renaming directories to underscore prefix
and updating all package declarations within them.
"""
import os
import re
import pathlib

THIS_DIR = pathlib.Path(__file__).parent.resolve()
SOURCES = str(THIS_DIR.parent / 'sources' / 'sources')

def sp(*parts):
    return os.path.join(SOURCES, *parts)

# Clashes found: (parent_dir, clashing_name)
CLASHES = [
    (sp("com/tsf/shell"), "a"),
    (sp("com/tsf/shell/f"), "d"),
    (sp("com/tsf/shell/f/f/a/_d"), "a"),
    (sp("com/tsf/shell/f/e"), "g"),
    (sp("com/tsf/shell/f/e"), "G"),
]

# Also check if f/f/a has a clash
if os.path.isdir(sp("com/tsf/shell/f/f/a/a")) and os.path.isfile(sp("com/tsf/shell/f/f/a/a.java")):
    CLASHES.append((sp("com/tsf/shell/f/f/a"), "a"))

for parent, name in CLASHES:
    dir_path = os.path.join(parent, name)
    new_dir_path = os.path.join(parent, f"_{name}")
    file_path = os.path.join(parent, f"{name}.java")
    
    print(f"\nClash: {name}/ (dir) and {name}.java in {parent}")
    
    if not os.path.isdir(dir_path):
        print(f"  SKIP: dir {dir_path} doesn't exist")
        continue
    
    if not os.path.isfile(file_path):
        print(f"  SKIP: file {file_path} doesn't exist")
        continue
    
    # Check if new dir name already exists
    if os.path.exists(new_dir_path):
        print(f"  ERROR: {new_dir_path} already exists!")
        continue
    
    # Rename directory
    os.rename(dir_path, new_dir_path)
    print(f"  RENAMED DIR: {name}/ -> _{name}/")
    
    # Update all package declarations in renamed directory
    old_pkg_prefix = ""
    new_pkg_prefix = ""
    
    # Determine package prefix for this directory
    rel = os.path.relpath(parent, SOURCES)
    old_pkg = rel.replace(os.sep, '.') + '.' + name
    new_pkg = rel.replace(os.sep, '.') + '.' + f"_{name}"
    
    print(f"  Updating package declarations from '{old_pkg}' to '{new_pkg}'")
    
    updated = 0
    for root, dirs, files in os.walk(new_dir_path):
        for f in files:
            if not f.endswith('.java'):
                continue
            fpath = os.path.join(root, f)
            try:
                with open(fpath, 'r', encoding='utf-8', errors='replace') as fh:
                    content = fh.read()
            except:
                continue
            
            # Update package declaration
            new_content = content.replace(f'package {old_pkg};', f'package {new_pkg};')
            # Also update imports that reference the old package
            new_content = new_content.replace(f'import {old_pkg}.', f'import {new_pkg}.')
            
            if new_content != content:
                with open(fpath, 'w') as fh:
                    fh.write(new_content)
                updated += 1
    
    print(f"  Updated {updated} files")

print("\nDone!")
