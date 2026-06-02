"""Fix constructor names that don't match their class name (case mismatch)."""
"""
###############################################################################
# OBSOLETE — Superseded by fix_constructors_precise.py
# Created: Jaja 2026-05-26 | Cataloged: opencode 2026-06-02
# See fix_scripts_CATALOG.md for hierarchy
###############################################################################
"""
import os, re

SOURCES = '/home/ubuntu/Documents/TSF20/sources/sources'

fixed = 0
for dirpath, _, filenames in os.walk(SOURCES):
    for fn in filenames:
        if not fn.endswith('.java'):
            continue
        fpath = os.path.join(dirpath, fn)
        with open(fpath, 'r') as f:
            content = f.read()
        
        original = content
        
        # For each class, get its name and find wrong-case constructors
        for m in re.finditer(r'(?:^|\n)\s*(?:(?:public|protected|private|static|abstract|final|strictfp)\s+)*(?:class|interface|enum)\s+(\w+)', content):
            cls_name = m.group(1)
            for wrong_case in {cls_name.lower(), cls_name.upper()}:
                if wrong_case == cls_name:
                    continue
                # Match: optional modifiers + wrong_case + (   at line start
                pattern = r'(^|\n)(\s*)(?:(?:public|protected|private)\s+)*' + re.escape(wrong_case) + r'(\s*\()'
                replacement = r'\1\2' + cls_name + r'\3'
                content = re.sub(pattern, replacement, content)
        
        if content != original:
            with open(fpath, 'w') as f:
                f.write(content)
            fixed += 1

print(f'Fixed {fixed} files')
