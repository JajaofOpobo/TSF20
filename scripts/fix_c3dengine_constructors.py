#!/usr/bin/env python3
"""Fix constructor names that don't match their enclosing class name in C3DEngine.

Brace-depth aware: only fixes constructors at class-body level (depth 0),
not method calls inside blocks.
"""
import re, os

C3D_DIR = '/home/jaja/Documents/TSF20/sources/sources/com/censivn/C3DEngine'

# Match class/interface/enum declaration to get the type name
CLASS_DECL = re.compile(
    r'(?:public\s+)?(?:abstract\s+|static\s+|final\s+)?(?:class|interface|enum)\s+(\w+)'
)

def find_type_name(content):
    """Find all type declarations and their line ranges."""
    types = []
    lines = content.split('\n')
    depth = 0
    current_type = None
    type_start = -1
    
    for i, line in enumerate(lines):
        stripped = line.strip()
        # Track depth
        depth += stripped.count('{') - stripped.count('}')
        
        m = CLASS_DECL.search(stripped)
        if m:
            current_type = m.group(1)
            type_start = i
            # Type starts with depth 0 before the opening brace
            types.append({'name': current_type, 'start_line': i, 'depth_at_start': depth})
    
    return types

def fix_file(filepath):
    with open(filepath) as f:
        content = f.read()
    
    lines = content.split('\n')
    
    # Find the outer type declaration
    outer_name = None
    for line in lines:
        stripped = line.strip()
        if stripped.startswith('//') or stripped.startswith('/*') or stripped.startswith('*'):
            continue
        m = CLASS_DECL.search(stripped)
        if m:
            outer_name = m.group(1)
            break
    
    if not outer_name:
        return False
    
    # Track type stack and depth for each line
    # We need to know for each line what the current enclosing type is
    # and whether we're at class-body level or inside a method/block
    
    type_stack = []  # stack of (type_name, depth_when_opened)
    depth = 0
    class_body_depth = {}  # line_index -> type_name (only when at class-body level)
    
    # Also track inner type declarations to know which type names are valid
    inner_types = set()
    for m in CLASS_DECL.finditer(content):
        inner_types.add(m.group(1))
    
    for i, line in enumerate(lines):
        stripped = line.strip()
        
        # Skip comments
        if stripped.startswith('//') or stripped.startswith('/*') or stripped.startswith('*'):
            continue
        
        # Check for type declaration
        m = CLASS_DECL.search(stripped)
        if m:
            tname = m.group(1)
            # Only push if this is actually a new declaration (not after 'new' or in a string)
            type_stack.append((tname, depth))
        
        # Determine current type
        current_type = type_stack[-1][0] if type_stack else None
        
        # We're at class-body level if depth == last pushed + 1 (inside type but inside its body)
        # Actually: class Foo { <- this { increments depth. So class body starts at depth+1
        if type_stack:
            _, push_depth = type_stack[-1]
            # At class-body level means we're inside the class body but not inside a method/block
            # depth == push_depth + 1 means we're directly inside the class
            if depth == push_depth + 1:
                class_body_depth[i] = current_type
        
        # Count braces AFTER checking type declarations
        depth += stripped.count('{') - stripped.count('}')
        
        # Pop type if we've exited it
        while type_stack and depth <= type_stack[-1][1]:
            type_stack.pop()
    
    # Now fix constructors at class-body level
    changed = False
    new_lines = list(lines)
    
    for i, line in enumerate(lines):
        if i not in class_body_depth:
            continue
        
        enclosing_type = class_body_depth[i]
        
        # Pattern 1: access_modifier + single_letter + (  ->  access_modifier + TYPE_NAME + (
        m1 = re.match(r'(\s*(?:public|private|protected)\s+)([a-zA-Z])\s*\(', line)
        if m1 and m1.group(2) != enclosing_type:
            old_line = line
            new_line = m1.group(1) + enclosing_type + '('
            # Append the rest of the line after the opening paren
            rest = line[m1.end():]
            new_line += rest
            if new_line != old_line:
                new_lines[i] = new_line
                changed = True
                print(f"  {os.path.basename(filepath)}:{i+1}: {m1.group(2)}() -> {enclosing_type}()")
            continue
        
        # Pattern 2: bare single_letter at class-body level (enum constructors, inner class ctors)
        # Match: whitespace, single_letter, whitespace, (, but NOT part of a method declaration
        # (no return type, no dot before it)
        m2 = re.match(r'(\s+)([a-zA-Z])\s*\(', line)
        if m2 and m2.group(2) != enclosing_type:
            # Verify it's not preceded by any type keyword or return type
            before_ctor = line[:line.find(m2.group(2))]
            before_ctor_stripped = before_ctor.strip()
            # If there's anything other than whitespace/access modifiers before it,
            # it's not a constructor declaration
            if before_ctor_stripped in ('', 'public', 'private', 'protected'):
                old_line = line
                new_line = m2.group(1) + enclosing_type + '('
                rest = line[m2.end():]
                new_line += rest
                if new_line != old_line:
                    new_lines[i] = new_line
                    changed = True
                    print(f"  {os.path.basename(filepath)}:{i+1}: {m2.group(2)}() -> {enclosing_type}()")
    
    if changed:
        with open(filepath, 'w') as f:
            f.write('\n'.join(new_lines))
        return True
    
    return False

def main():
    fixed = 0
    total_changes = 0
    
    for root, dirs, files in os.walk(C3D_DIR):
        for fn in sorted(files):
            if not fn.endswith('.java'):
                continue
            fp = os.path.join(root, fn)
            try:
                if fix_file(fp):
                    fixed += 1
            except Exception as e:
                print(f"  ERROR: {os.path.relpath(fp, C3D_DIR)}: {e}")
    
    print(f"\nFixed {fixed} files with constructor mismatches")
    return 0

if __name__ == '__main__':
    raise SystemExit(main())
