#!/usr/bin/env python3
"""Fix constructor names that don't match their enclosing class name in com.tsf.extend.*

Key insight: Only lines at class-body level (brace depth == class_depth + 1) 
can be constructors. Lines inside method bodies are method calls, not constructors.
"""
import re, os

EXTEND_DIR = '/home/jaja/Documents/TSF20/sources/sources/com/tsf/extend'

CLASS_DECL = re.compile(
    r'(?:public\s+)?(?:abstract\s+|static\s+|final\s+)?(?:class|interface|enum)\s+(\w+)'
)

def fix_file(filepath):
    with open(filepath) as f:
        lines = f.readlines()
    
    content = ''.join(lines)
    
    # Build class-body-level line set
    type_stack = []  # (type_name, depth_at_declaration_before_brace)
    depth = 0
    class_body_lines = set()  # line indices that are at class-body level
    
    for i, line in enumerate(lines):
        stripped = line.strip()
        if stripped.startswith('//') or stripped.startswith('/*') or stripped.startswith('*'):
            depth += stripped.count('{') - stripped.count('}')
            continue
        
        m = CLASS_DECL.search(stripped)
        if m:
            tname = m.group(1)
            # depth here is the depth BEFORE this type's opening brace
            type_stack.append((tname, depth))
        
        if type_stack:
            _, push_depth = type_stack[-1]
            # Class body starts at push_depth + 1
            if depth == push_depth + 1:
                class_body_lines.add(i)
        
        depth += stripped.count('{') - stripped.count('}')
        while type_stack and depth <= type_stack[-1][1]:
            type_stack.pop()
    
    # Build line -> enclosing type map for class-body lines only
    # (re-do the loop to get the type at class-body level)
    type_stack = []
    depth = 0
    line_type_map = {}
    
    for i, line in enumerate(lines):
        stripped = line.strip()
        if stripped.startswith('//') or stripped.startswith('/*') or stripped.startswith('*'):
            depth += stripped.count('{') - stripped.count('}')
            continue
        
        m = CLASS_DECL.search(stripped)
        if m:
            tname = m.group(1)
            type_stack.append((tname, depth))
        
        if type_stack and i in class_body_lines:
            line_type_map[i] = type_stack[-1][0]
        
        depth += stripped.count('{') - stripped.count('}')
        while type_stack and depth <= type_stack[-1][1]:
            type_stack.pop()
    
    # Now fix constructors at class-body level only
    changed = False
    new_lines = list(lines)
    
    for i, line in enumerate(lines):
        if i not in line_type_map:
            continue
        enclosing_type = line_type_map[i]
        if not enclosing_type:
            continue
        
        # Pattern 1: access_modifier + name + (  →  access_modifier + CLASS_NAME + (
        # Name can be single letter or multi-letter (any length)
        m1 = re.match(r'(\s*(?:public|private|protected)\s+)(\w+)\s*\(', line)
        if m1 and m1.group(2) != enclosing_type:
            new_line = line[:m1.start(2)] + enclosing_type + line[m1.end(2):]
            if new_line != line:
                new_lines[i] = new_line
                changed = True
                rel = os.path.relpath(filepath, EXTEND_DIR)
                print(f"  {rel}:{i+1}: {m1.group(2)}() -> {enclosing_type}()")
            continue
        
        # Pattern 2: bare name at class-body level (enum/private ctor)
        # Must be a declaration, not a statement: look for ){ or ) { on same line
        m2 = re.match(r'(\s+)(\w+)\s*\(', line)
        if m2 and m2.group(2) != enclosing_type:
            before_ctor = line[:line.find(m2.group(2))].strip()
            if before_ctor in ('', 'public', 'private', 'protected'):
                # Verify this is a declaration (has body { ) not a method call (ends with ;)
                # Look for ){ or ) { pattern indicating constructor body
                after_open = line[m2.end() - 1:]  # from the ( onwards
                if '){' in after_open or ') {' in after_open or ')  {' in after_open:
                    new_line = line[:m2.start(2)] + enclosing_type + line[m2.end(2):]
                    if new_line != line:
                        new_lines[i] = new_line
                        changed = True
                        rel = os.path.relpath(filepath, EXTEND_DIR)
                        print(f"  {rel}:{i+1}: {m2.group(2)}() -> {enclosing_type}()")
    
    if changed:
        with open(filepath, 'w') as f:
            f.writelines(new_lines)
        return True
    return False

def main():
    fixed = 0
    for root, dirs, files in os.walk(EXTEND_DIR):
        for fn in sorted(files):
            if not fn.endswith('.java'):
                continue
            fp = os.path.join(root, fn)
            try:
                if fix_file(fp):
                    fixed += 1
            except Exception as e:
                print(f"  ERROR: {os.path.relpath(fp, EXTEND_DIR)}: {e}")
    print(f"\nFixed {fixed} files with constructor mismatches")
    return 0

if __name__ == '__main__':
    raise SystemExit(main())
