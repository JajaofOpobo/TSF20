#!/usr/bin/env python3
"""
Phase 5 batch fixer: handles the most common error categories at once.
"""
import os, re, shutil, pathlib

THIS_DIR = pathlib.Path(__file__).parent.resolve()
SOURCES = str(THIS_DIR.parent / 'sources' / 'sources')
BUNDLED = str(THIS_DIR.parent / 'sources' / 'bundled-libs')

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
# 1. Fix import conflicts
#    Remove redundant single-type imports of com.tsf.X
#    when the local package also has a class X.
# ====================================================
CONFLICT_IMPORTS = [
    # (import to remove, local class names to check)
    ('com.tsf.b', 'b'),
    ('com.tsf.a', 'a'),
    ('com.tsf.i', 'i'),
    ('com.tsf.h', 'h'),
    ('com.tsf.d', 'd'),
    ('com.tsf.g', 'g'),
]

fixed_imports = 0
for root, dirs, files in os.walk(SOURCES):
    for fn in files:
        if not fn.endswith('.java'):
            continue
        fpath = os.path.join(root, fn)
        content = read_file(fpath)
        if not content:
            continue
        
        original = content
        pkg = None
        m = re.search(r'^package\s+([\w.]+);', content, re.MULTILINE)
        if m:
            pkg = m.group(1)
        
        for import_pkg, local_name in CONFLICT_IMPORTS:
            # Check if this file has the import
            import_line = f'import {import_pkg};'
            if import_line not in content:
                continue
            
            # Check if the local class name matches
            # (the file's simple name or its package's leaf component)
            fn_stem = fn[:-5]
            if fn_stem != local_name:
                continue
            
            # Remove the import
            content = content.replace(import_line + '\n', '')
            content = content.replace(import_line, '')
        
        if content != original:
            write_file(fpath, content)
            fixed_imports += 1

print(f"1. Fixed import conflicts: {fixed_imports} files")

# ====================================================
# 2. Copy missing badlogic files from bundled-libs
#    Only copy files that don't already exist in sources
# ====================================================
MISSING_BADLOGIC = [
    'com/badlogic/gdx/physics/box2d/Joint.java',
    'com/badlogic/gdx/physics/box2d/JointDef.java',
    'com/badlogic/gdx/physics/box2d/JointEdge.java',
    'com/badlogic/gdx/physics/box2d/Fixture.java',
    'com/badlogic/gdx/physics/box2d/ContactFilter.java',
    'com/badlogic/gdx/physics/box2d/ContactImpulse.java',
    'com/badlogic/gdx/physics/box2d/Contact.java',
    'com/badlogic/gdx/physics/box2d/ContactListener.java',
    'com/badlogic/gdx/physics/box2d/DestructionListener.java',
    'com/badlogic/gdx/physics/box2d/Filter.java',
    'com/badlogic/gdx/physics/box2d/CircleShape.java',
    'com/badlogic/gdx/physics/box2d/Transform.java',
    'com/badlogic/gdx/physics/box2d/Manifold.java',
    'com/badlogic/gdx/physics/box2d/MassData.java',
    'com/badlogic/gdx/physics/box2d/WorldManifold.java',
    'com/badlogic/gdx/physics/box2d/QueryCallback.java',
    'com/badlogic/gdx/physics/box2d/RayCastCallback.java',
    'com/badlogic/gdx/physics/box2d/joints/DistanceJoint.java',
    'com/badlogic/gdx/physics/box2d/joints/DistanceJointDef.java',
    'com/badlogic/gdx/physics/box2d/joints/FrictionJoint.java',
    'com/badlogic/gdx/physics/box2d/joints/FrictionJointDef.java',
    'com/badlogic/gdx/physics/box2d/joints/GearJoint.java',
    'com/badlogic/gdx/physics/box2d/joints/GearJointDef.java',
    'com/badlogic/gdx/physics/box2d/joints/LineJoint.java',
    'com/badlogic/gdx/physics/box2d/joints/LineJointDef.java',
    'com/badlogic/gdx/physics/box2d/joints/MouseJoint.java',
    'com/badlogic/gdx/physics/box2d/joints/MouseJointDef.java',
    'com/badlogic/gdx/physics/box2d/joints/PrismaticJoint.java',
    'com/badlogic/gdx/physics/box2d/joints/PrismaticJointDef.java',
    'com/badlogic/gdx/physics/box2d/joints/PulleyJoint.java',
    'com/badlogic/gdx/physics/box2d/joints/PulleyJointDef.java',
    'com/badlogic/gdx/physics/box2d/joints/RevoluteJoint.java',
    'com/badlogic/gdx/physics/box2d/joints/WeldJoint.java',
    'com/badlogic/gdx/physics/box2d/joints/WeldJointDef.java',
]

copied = 0
for relpath in MISSING_BADLOGIC:
    src = os.path.join(BUNDLED, relpath)
    dst = os.path.join(SOURCES, relpath)
    if os.path.exists(src) and not os.path.exists(dst):
        os.makedirs(os.path.dirname(dst), exist_ok=True)
        shutil.copy2(src, dst)
        copied += 1

print(f"2. Copied missing badlogic files: {copied}")

# ====================================================
# 3. Fix C0133a import package errors
#    Files import com.tsf.shell.f.f.C0133a but should import
#    com.tsf.shell.f.f.a.C0133a
#    Also fix remaining a.C0133a references
# ====================================================
fixed_c0133a = 0
for root, dirs, files in os.walk(SOURCES):
    for fn in files:
        if not fn.endswith('.java'):
            continue
        fpath = os.path.join(root, fn)
        content = read_file(fpath)
        if not content:
            continue
        
        original = content
        
        # Fix wrong package import
        content = content.replace(
            'import com.tsf.shell.f.f.C0133a;',
            'import com.tsf.shell.f.f.a.C0133a;'
        )
        
        # Fix remaining a.C0133a references (should have been fixed by fix_all.py)
        # But only in files that aren't themselves `a`
        if not fn.endswith('/a.java'):
            content = re.sub(r'(?<![.\w])a\.C0133a(?![.\w(])', 'C0133a', content)
        
        if content != original:
            write_file(fpath, content)
            fixed_c0133a += 1

print(f"3. Fixed C0133a references: {fixed_c0133a} files")

# ====================================================
# 4. Create InterfaceC0101a stub if still missing
# ====================================================
intf_path = os.path.join(SOURCES, 'com/tsf/shell/f/f/a/InterfaceC0101a.java')
if not os.path.exists(intf_path):
    write_file(intf_path, """\
package com.tsf.shell.f.f.a;

public interface InterfaceC0101a {
    void a(Object aVar);
    void b(Object aVar);
}
""")
    print("4. Created InterfaceC0101a stub")
else:
    print("4. InterfaceC0101a already exists")

# ====================================================
# 5. Create C0095a stubs in the packages that need them
# ====================================================
# Find which packages reference C0095a
c0095a_pkgs = set()
for root, dirs, files in os.walk(SOURCES):
    for fn in files:
        if not fn.endswith('.java'):
            continue
        fpath = os.path.join(root, fn)
        content = read_file(fpath)
        if 'C0095a' in content and ' class C0095a' not in content and ' interface C0095a' not in content:
            # It's referenced but not defined
            # Find its package
            m = re.search(r'import\s+([\w.]+)\.C0095a', content)
            if m:
                c0095a_pkgs.add(m.group(1))

print(f"5. C0095a referenced from packages: {c0095a_pkgs}")

# ====================================================
# 6. Fix interface expected error in C3DEngine b/h/b/c.java
# ====================================================
c_path = os.path.join(SOURCES, 'com/censivn/C3DEngine/b/h/b/c.java')
if os.path.exists(c_path):
    content = read_file(c_path)
    # Check if there's an "interface expected here" issue
    # This usually happens when a class tries to extend an interface with default methods
    # or when a method signature is broken
    if 'interface expected' in content:
        print("6. interface expected in b/h/b/c.java - checking...")
        # Read the full file to understand the issue
        lines = content.split('\n')
        for i, line in enumerate(lines):
            if 'interface expected' in line or i >= 20:
                break

# ====================================================
# 7. Fix _h/a.java - add Override annotations / fix interface methods
# ====================================================
ha_path = os.path.join(SOURCES, 'com/tsf/shell/f/e/_h/a.java')
if os.path.exists(ha_path):
    content = read_file(ha_path)
    # The "modifier not allowed here" errors suggest fields inside an interface body
    # Check the structure
    if 'private static a a;' in content or 'private InterfaceC0098a b;' in content:
        print("7. Checking _h/a.java for field-in-interface issue...")

print("\n=== PHASE 5 BATCH FIXER DONE ===")
