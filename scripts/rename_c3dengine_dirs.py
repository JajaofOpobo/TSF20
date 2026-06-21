#!/usr/bin/env python3
"""Rename 4 single-letter directories in C3DEngine and propagate all references."""
import os, shutil, subprocess, sys

BASE = '/home/jaja/Documents/TSF20/sources/sources/com/censivn/C3DEngine'
PROJECT = '/home/jaja/Documents/TSF20'
ALL_SOURCES = [
    '/home/jaja/Documents/TSF20/sources/sources',
    '/home/jaja/Documents/TSF20/sources/v1-sources',
]

# Old dir suffix -> new dir suffix
RENAME_MAP = {
    'b/f/a': 'b/f/sprite',
    'b/f/b': 'b/f/ninepatch',
    'c/a/a': 'c/a/spring',
    'b/g/_c/a': 'b/g/_c/orbit',
}

# Package old -> new for reference updates
PKG_MAP = {}
for old_suffix, new_suffix in RENAME_MAP.items():
    old_pkg = 'com.censivn.C3DEngine.' + old_suffix.replace('/', '.')
    new_pkg = 'com.censivn.C3DEngine.' + new_suffix.replace('/', '.')
    PKG_MAP[old_pkg] = new_pkg

def scan_java_files(dirs):
    """Yield all .java file paths under given directories."""
    for d in dirs:
        for root, dirs_, files in os.walk(d):
            for fn in files:
                if fn.endswith('.java'):
                    yield os.path.join(root, fn)

def print_pkg(old_pkg, new_pkg):
    print(f"  {old_pkg} -> {new_pkg}")

def main():
    # Step 1: Git mv directories
    print("=== Moving directories ===")
    for old_suffix, new_suffix in RENAME_MAP.items():
        old_path = os.path.join(BASE, old_suffix)
        new_path = os.path.join(BASE, new_suffix)
        if not os.path.isdir(old_path):
            print(f"  SKIP (not found): {old_suffix}")
            continue
        # Ensure parent of new path exists
        os.makedirs(os.path.dirname(new_path), exist_ok=True)
        subprocess.run(['git', 'mv', old_path, new_path], cwd=PROJECT, check=True)
        print(f"  MOVED: {old_suffix}/ -> {new_suffix}/")
    
    print()
    
    # Step 2: Update references in all Java files
    print("=== Updating references ===")
    updates = 0
    
    # Build old->new string replacements
    # Imports: `import com.censivn.C3DEngine.b.f.a.` -> `import com.censivn.C3DEngine.b.f.sprite.`
    # FQN: `com.censivn.C3DEngine.b.f.a.` -> `com.censivn.C3DEngine.b.f.sprite.`
    # Package decl: `package com.censivn.C3DEngine.b.f.a;` -> `package com.censivn.C3DEngine.b.f.sprite;`
    
    for fp in scan_java_files(ALL_SOURCES):
        with open(fp) as f:
            content = f.read()
        
        original = content
        for old_pkg, new_pkg in PKG_MAP.items():
            content = content.replace(old_pkg, new_pkg)
        
        if content != original:
            with open(fp, 'w') as f:
                f.write(content)
            rel = os.path.relpath(fp, PROJECT)
            print(f"  UPDATED: {rel}")
            updates += 1
    
    print(f"\nUpdated {updates} files")
    print()
    
    # Step 3: Show the mapping for the ledger
    print("=== New mappings (for ledger) ===")
    for old_suffix, new_suffix in RENAME_MAP.items():
        old_pkg = 'com.censivn.C3DEngine.' + old_suffix.replace('/', '.')
        new_pkg = 'com.censivn.C3DEngine.' + new_suffix.replace('/', '.')
        print(f"  {old_pkg} -> {new_pkg}")
    
    print("\nDone!")

if __name__ == '__main__':
    main()
