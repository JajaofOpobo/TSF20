"""
###############################################################################
# OBSOLETE — Superseded by fix_class_decls2.py
# Created: Jaja 2026-05-26 | Cataloged: opencode 2026-06-02
# See fix_scripts_CATALOG.md for hierarchy
###############################################################################
"""
import os, re, subprocess

SOURCES = '/home/ubuntu/Documents/TSF20/sources/sources'

fixed = 0
for dirpath, _, filenames in os.walk(SOURCES):
    for fn in filenames:
        if not fn.endswith('.java'):
            continue
        stem = fn[:-5]
        fpath = os.path.join(dirpath, fn)
        
        with open(fpath, 'r') as f:
            content = f.read()
        
        # Find the public class/interface/enum declaration (with optional modifiers)
        match = re.search(r'\bpublic\s+(?:\w+\s+)*(class|interface|enum)\s+([A-Z]\w*)', content)
        if not match:
            continue
        
        decl_kind = match.group(1)
        decl_name = match.group(2)
        
        # Lowercase the class name to match filename
        lower_name = stem  # stem is already lowercase from filename
        
        # Only fix if the uppercase version matches (case-insensitive) the filename
        if decl_name.lower() != lower_name.lower():
            continue
        
        if decl_name == lower_name:
            continue  # already lowercase, skip
        
        # Fix the class/interface/enum declaration
        old_decl = f'{decl_kind} {decl_name}'
        new_decl = f'{decl_kind} {lower_name}'
        content = content.replace(old_decl, new_decl)
        
        # Also fix its own constructor name if it matches
        # e.g., if class D becomes class d, constructor D() should become d()
        content = re.sub(rf'\b{decl_name}\s*\(', f'{lower_name} (', content)
        
        # Fix self-references: the class itself referencing its own name
        # e.g., in d.java (now class d), references to D should become d
        # But only when D is used as a type (not in method calls to some other D)
        
        with open(fpath, 'w') as f:
            f.write(content)
        
        print(f'  Fixed: {os.path.relpath(fpath, SOURCES)}: {decl_name} -> {lower_name}')
        fixed += 1

print(f'\nFixed {fixed} files')
