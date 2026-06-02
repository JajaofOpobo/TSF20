#!/usr/bin/env python3
"""
###############################################################################
# CURRENT — Standalone tool
# Created: Jaja 2026-05-26 | Cataloged: opencode 2026-06-02
# Updates imports and FQ refs after manual package renames
#   (com.tsf.shell.a→com.tsf.shell._a).
# See fix_scripts_CATALOG.md for hierarchy
###############################################################################
Update all references to renamed packages across the codebase.
"""
import os
import re
import pathlib

THIS_DIR = pathlib.Path(__file__).parent.resolve()
SOURCES = str(THIS_DIR.parent / 'sources' / 'sources')

# Package renames: old -> new
# Only include renames where the directory was actually renamed by fix_clashes.py.
# Skip entries where the original directory still exists (no actual clash).
RENAMES = {
    'com.tsf.shell.a': 'com.tsf.shell._a',
    'com.tsf.shell.f.d': 'com.tsf.shell.f._d',
    'com.tsf.shell.f.f.a._d.a': 'com.tsf.shell.f.f.a._d._a',
    'com.tsf.shell.f.e.g': 'com.tsf.shell.f.e._g',
    'com.tsf.shell.f.f.a.a': 'com.tsf.shell.f.f.a._a',
    'com.censivn.C3DEngine.b.g.b': 'com.censivn.C3DEngine.b.g._b',
}

updated = 0
for root, dirs, files in os.walk(SOURCES):
    for f in files:
        if not f.endswith('.java'):
            continue
        fpath = os.path.join(root, f)
        try:
            with open(fpath, 'r', encoding='utf-8', errors='replace') as fh:
                content = fh.read()
        except:
            continue
        
        new_content = content
        for old_pkg, new_pkg in RENAMES.items():
            # Replace import statements
            new_content = re.sub(
                rf'\bimport\s+{re.escape(old_pkg)}\.',
                f'import {new_pkg}.',
                new_content
            )
            # Replace fully qualified references in code
            new_content = re.sub(
                rf'\b{re.escape(old_pkg)}\.',
                f'{new_pkg}.',
                new_content
            )
        
        if new_content != content:
            with open(fpath, 'w') as fh:
                fh.write(new_content)
            updated += 1

print(f"Updated {updated} files with package reference fixes")
