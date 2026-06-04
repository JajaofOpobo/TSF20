#!/usr/bin/env python3
"""
Phase 5 deep fixer: handles remaining structural issues after batch import fixes.
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

# ====================================================
# 1. Fix cyclic inheritance: a.InterfaceC0025a -> fully qualified
# ====================================================
fixed_cyclic = 0
for root, dirs, files in os.walk(SOURCES):
    for fn in files:
        if not fn.endswith('.java'):
            continue
        fpath = os.path.join(root, fn)
        content = read_file(fpath)
        if 'cyclic inheritance' in content:  # rough check
            pass
        if not content:
            continue
        
        original = content
        # a.InterfaceC0025a -> com.censivn.C3DEngine.b.c.a.InterfaceC0025a
        content = content.replace(
            'implements a.InterfaceC0025a',
            'implements com.censivn.C3DEngine.b.c.a.InterfaceC0025a'
        )
        content = content.replace(
            '(a.InterfaceC0025a)',
            '(com.censivn.C3DEngine.b.c.a.InterfaceC0025a)'
        )
        content = content.replace(
            'a.InterfaceC0025a c0130a',
            'com.censivn.C3DEngine.b.c.a.InterfaceC0025a c0130a'
        )
        
        if content != original:
            write_file(fpath, content)
            fixed_cyclic += 1

print(f"1. Fixed cyclic inheritance: {fixed_cyclic} files")

# ====================================================
# 2. Create stubs for the most-missing types 
#    based on "cannot find symbol" patterns
# ====================================================
# These are the most commonly missing classes (from build output analysis)
# We create them as minimal interfaces in the correct packages
MISSING_TYPES = [
    # (package, class_name, kind)
    ('com.tsf.shell.f.f.a', 'C0133a', 'interface'),     # already created but may be in wrong location
    ('com.tsf.shell.f.f.a._d', 'a', 'class'),            # created by fix_all.py, verify
    ('com.tsf.shell.f.e._e', 'a', 'interface'),          # e.a is referenced as an interface
    ('com.tsf.shell.manager.r.c', 'a', 'interface'),     # r.c.a is referenced
    ('com.censivn.C3DEngine.b.g', 'c', 'interface'),     # b.g.c referenced
    ('com.tsf.shell.f.e._c', 'a', 'interface'),           # e._c.a referenced
]

created = 0
for pkg, name, kind in MISSING_TYPES:
    dir_path = os.path.join(SOURCES, pkg.replace('.', '/'))
    file_path = os.path.join(dir_path, name + '.java')
    if os.path.exists(file_path):
        continue
    
    if kind == 'interface':
        stub = f'package {pkg};\n\npublic interface {name} {{\n}}\n'
    else:
        stub = f'package {pkg};\n\npublic class {name} {{\n}}\n'
    
    os.makedirs(dir_path, exist_ok=True)
    write_file(file_path, stub)
    created += 1
    print(f"  Created: {pkg}.{name}")

print(f"2. Created stubs: {created}")

# ====================================================
# 3. Fix modifier errors in files where fields
#    are inside an interface body
# ====================================================
fixed_modifier = 0
for root, dirs, files in os.walk(SOURCES):
    for fn in files:
        if not fn.endswith('.java'):
            continue
        fpath = os.path.join(root, fn)
        content = read_file(fpath)
        if not content:
            continue
        
        # Check if there's an interface with fields (which is wrong)
        # Pattern: public interface X { private static ...; }
        if 'interface' in content and ('private static' in content or 'private ' in content):
            original = content
            
            # Fix: if a class has `implements a.InterfaceC0025a` and it's still wrong,
            # check for the a. prefix issue
            # This was already handled above
            
            if content != original:
                write_file(fpath, content)
                fixed_modifier += 1

print(f"3. Fixed modifier errors: {fixed_modifier} files")

# ====================================================
# 4. Fix d.a is not public in ThemeIconDesignerMenu.java
#    The issue is that `a` in `private a mCalStyle` refers to
#    an inner class `a` of `d` which is not public
# ====================================================
tdm_path = os.path.join(SOURCES, 'com/tsf/shell/theme/inside/mix/menu/item/ThemeIconDesignerMenu.java')
if os.path.exists(tdm_path):
    content = read_file(tdm_path)
    if 'd.a is not public' in content or 'd.a' in content:
        print("4. Checking ThemeIconDesignerMenu.java for d.a issue...")

# ====================================================
# 5. Remove remaining import conflicts
#    For files where local class name conflicts with import
#    simple name AND there's no way to use the import
# ====================================================
fixed_imports = 0
for root, dirs, files in os.walk(SOURCES):
    for fn in files:
        if not fn.endswith('.java'):
            continue
        fn_stem = fn[:-5]
        if len(fn_stem) != 1:
            continue  # only single-letter class names
        
        fpath = os.path.join(root, fn)
        content = read_file(fpath)
        if not content:
            continue
        
        original = content
        
        # Find single-type imports whose simple name equals the file stem
        lines = content.split('\n')
        new_lines = []
        for line in lines:
            m = re.match(r'^import\s+([\w.]+)\.(\w+);', line)
            if m and m.group(2) == fn_stem:
                # Check if the imported type is actually used in the file
                imported_simple = m.group(2)
                if imported_simple not in content.replace(line, ''):
                    # Not used elsewhere - safe to comment out
                    line = '//' + line
            new_lines.append(line)
        
        content = '\n'.join(new_lines)
        if content != original:
            write_file(fpath, content)
            fixed_imports += 1

print(f"5. Fixed additional import conflicts: {fixed_imports} files")

# ====================================================
# 6. Re-add essential removed imports for InterfaceC0025a
#    Files that had import com.censivn.C3DEngine.b.c.a removed
#    need it back if they reference a.InterfaceC0025a
# ====================================================
fixed_c0025a = 0
for root, dirs, files in os.walk(SOURCES):
    for fn in files:
        if not fn.endswith('.java'):
            continue
        fpath = os.path.join(root, fn)
        content = read_file(fpath)
        if not content:
            continue
        
        # Check if file has a.InterfaceC0025a in code but no import for it
        if 'InterfaceC0025a' in content and 'import com.censivn.C3DEngine.b.c.a;' not in content:
            # Replace all `a.InterfaceC0025a` with fully-qualified name
            original = content
            content = re.sub(r'(?<![.\w])a\.InterfaceC0025a(?![.\w(])', 
                           'com.censivn.C3DEngine.b.c.a.InterfaceC0025a', content)
            if content != original:
                write_file(fpath, content)
                fixed_c0025a += 1

print(f"6. Fixed a.InterfaceC0025a references: {fixed_c0025a} files")

print("\n=== PHASE 5 DEEP FIXER DONE ===")
