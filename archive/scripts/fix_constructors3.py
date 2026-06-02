"""Fix constructor names that don't match their class name.
For each class declaration, find wrong-case constructors within its brace scope."""
"""
###############################################################################
# OBSOLETE — Superseded by fix_constructors_precise.py
# Created: Jaja 2026-05-26 | Cataloged: opencode 2026-06-02
# See fix_scripts_CATALOG.md for hierarchy
###############################################################################
"""
import os, re

SOURCES = '/home/ubuntu/Documents/TSF20/sources/sources'

def get_scope_until_closing_brace(lines, start_line):
    """Given a class declaration at start_line, return the line range of its body."""
    depth = 0
    started = False
    for i in range(start_line, len(lines)):
        line = lines[i]
        for ch in line:
            if ch == '{':
                depth += 1
                started = True
            elif ch == '}':
                depth -= 1
        if started and depth == 0:
            return i  # closing brace line
    return len(lines) - 1

fixed = 0
for dirpath_str, _, filenames in os.walk(SOURCES):
    for fn in filenames:
        if not fn.endswith('.java'):
            continue
        fpath = os.path.join(dirpath_str, fn)
        
        with open(fpath, 'r') as f:
            content = f.read()
        
        original = content
        lines = content.split('\n')
        changed = False
        
        # Find all class declarations
        for i, line in enumerate(lines):
            m = re.search(r'\b(?:(?:public|protected|private|static|abstract|final|strictfp)\s+)*(?:class|interface|enum)\s+(\w+)', line)
            if not m:
                continue
            cls_name = m.group(1)
            end_line = get_scope_until_closing_brace(lines, i)
            
            # Scan the class body for wrong-case constructors
            for j in range(i + 1, end_line + 1):
                body_line = lines[j]
                # Find constructors: optional modifiers + wrongCaseName + ( + )
                # Must not be a method call (preceded by . or not at line start)
                for wrong_case in {cls_name.lower(), cls_name.upper()}:
                    if wrong_case == cls_name:
                        continue
                    # Match: at line start with optional modifiers
                    # Include the /* synthetic */ comment possibility
                    match = re.search(
                        r'^(\s*)(?:(?:public|protected|private)\s+)*(?:/\*.*?\*/\s+)?' + re.escape(wrong_case) + r'(\s*\()',
                        body_line
                    )
                    if match:
                        indent, paren = match.groups()
                        new_line = indent + cls_name + paren
                        lines[j] = new_line
                        changed = True
                        print(f'  {os.path.relpath(fpath, SOURCES)}:{j+1}: {wrong_case}() -> {cls_name}()')
        
        if changed:
            with open(fpath, 'w') as f:
                f.write('\n'.join(lines))
            fixed += 1

print(f'Fixed {fixed} files')
