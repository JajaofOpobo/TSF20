import os, re

SOURCES = '/home/ubuntu/Documents/TSF20/sources/sources'

fixed = 0
for dirpath, _, filenames in os.walk(SOURCES):
    for fn in filenames:
        if not fn.endswith('.java'):
            continue
        fstem = fn[:-5]
        fpath = os.path.join(dirpath, fn)
        
        with open(fpath, 'r') as f:
            content = f.read()
        
        # Find the first top-level class/interface/enum declaration
        # Pattern: [modifiers] (class|interface|enum) Name
        match = re.search(r'\b(?:public\s+)?(?:static\s+|abstract\s+|final\s+|strictfp\s+)*(class|interface|enum)\s+([A-Za-z0-9_$]+)', content)
        if not match:
            continue
        
        decl_kind = match.group(1)
        decl_name = match.group(2)
        
        lower_name = fstem
        
        # Only fix if the case-insensitive names match but cases differ
        if decl_name.lower() != lower_name.lower():
            continue
        if decl_name == lower_name:
            continue
        
        old_decl = f'{decl_kind} {decl_name}'
        new_decl = f'{decl_kind} {lower_name}'
        content = content.replace(old_decl, new_decl)
        
        # Fix constructors: replace decl_name( with lower_name(
        content = re.sub(rf'(?<=[\s(]){re.escape(decl_name)}\s*\(', f'{lower_name} (', content)
        
        # Also fix initial uppercase used as self-reference in same file
        # e.g., D.this -> d.this, D.c() -> d.c(), new D() -> new d()
        content = re.sub(rf'(?<=[\s.(]){re.escape(decl_name)}(?=\s*[.)])', lower_name, content)
        
        with open(fpath, 'w') as f:
            f.write(content)
        
        print(f'  Fixed: {os.path.relpath(fpath, SOURCES)}: {decl_name} -> {lower_name}')
        fixed += 1

print(f'\nFixed {fixed} files')
