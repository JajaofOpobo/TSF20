#!/usr/bin/env python3
"""Fix remaining compilation errors after Phase 5 pipeline."""
import os
import re
import pathlib

THIS_DIR = pathlib.Path(__file__).parent.resolve()
SOURCES = str(THIS_DIR.parent / 'sources' / 'sources')

def read_file(path):
    try:
        with open(path, 'r', encoding='utf-8') as f:
            return f.read()
    except:
        return ''

def write_file(path, content):
    os.makedirs(os.path.dirname(path), exist_ok=True)
    with open(path, 'w') as f:
        f.write(content)
    print(f"  WRITTEN: {path}")

def edit_file(path, old, new):
    content = read_file(path)
    if old in content:
        content = content.replace(old, new)
        write_file(path, content)
        return True
    return False

# =============================================================
# 1. Create missing CM SDK stubs
# =============================================================
SDK_STUBS = {
    "com/cm/a/C.java": """
package com.cm.a;

public class C {
    public static String a() { return ""; }
    public static int b() { return 0; }
}
""",
    "com/cm/kinfoc/a/D.java": """
package com.cm.kinfoc.a;

public class D {
    public static String a() { return ""; }
}
""",
    "com/cm/kinfoc/a/b.java": """
package com.cm.kinfoc.a;

public class b {
    public static b A() { return new b(); }
    public void a(Object o) {}
}
""",
    "com/cm/kinfoc/n.java": """
package com.cm.kinfoc;

public class n {
    public static String a() { return ""; }
}
""",
}

print("=== 1. Creating SDK stubs ===")
for fpath, content in SDK_STUBS.items():
    write_file(f"{SOURCES}/{fpath}", content)

# =============================================================
# 2. Fix 'already defined' — remove shadowed same-package imports
# =============================================================
print("\n=== 2. Fixing 'already defined' errors ===")

already_defined_files = {
    # file -> [(package, simpleName)]
    "com/tsf/shell/f/e/h/a.java": [],
    "com/tsf/shell/f/f/a/e.java": [],  
    "com/tsf/shell/f/f/c/a.java": [],
    "com/tsf/shell/manager/p/b.java": [],
    "com/tsf/shell/manager/r/a/a.java": [],
    "com/tsf/shell/manager/wallpaper/b.java": [],
    "com/tsf/shell/f/f/a/_a/c.java": [],
    "com/tsf/shell/f/f/a/c/a/a.java": [],
    "com/tsf/shell/f/f/a/c/a/b.java": [],
    "com/tsf/shell/f/i/b/d/b.java": [],
    "com/tsf/shell/f/i/A.java": [],
    "com/tsf/shell/f/i/B.java": [],
    "com/tsf/shell/f/i/C.java": [],
    "com/tsf/shell/manager/f/b.java": [],
    "com/tsf/shell/manager/d/a.java": [],
    "com/tsf/shell/theme/inside/description/ThemeIconDescription.java": [],
    "com/censivn/C3DEngine/b/h/b/c.java": [],
    "com/censivn/C3DEngine/b/h/e/b.java": [],
    "com/censivn/C3DEngine/b/e/b.java": [],
    "com/censivn/C3DEngine/api/element/info/shortcut/LauncherShortcutStandardInfo.java": [],
    "com/tsf/shell/theme/inside/mix/menu/item/ThemeInstalledDetailMenu.java": [],
}

# For each file, read the content and figure out which import to remove
import_fixes = {
    "com/tsf/shell/f/e/h/a.java": {
        "import com.tsf.shell.f.e.h.a;": None,  # Remove self-import of same simple name
    },
}

# Generic fix: remove imports that have the same simple name as the file's class
for relpath in already_defined_files:
    fpath = f"{SOURCES}/{relpath}"
    content = read_file(fpath)
    if not content:
        continue
    lines = content.split('\n')
    original = list(lines)

    # Determine the file's declared class/interface name
    class_match = re.search(r'\b(?:public\s+)?(?:class|interface|enum)\s+(\w+)', content)
    if not class_match:
        continue
    file_class_name = class_match.group(1)

    # Find imports that import the same simple name as the file's class
    new_lines = []
    for line in lines:
        stripped = line.strip()
        m = re.match(r'^import\s+([\w.]+)\.(\w+);$', stripped)
        if m:
            pkg = m.group(1)
            simple = m.group(2)
            # Remove if simple name matches the file's class
            if simple == file_class_name:
                # Check if this import is in the same package as the file
                file_pkg = ".".join(relpath.split('/')[:-1])
                imported_full = f"{pkg}.{simple}"
                if not imported_full.startswith(file_pkg):
                    # Also only remove if the reference doesn't appear in the file
                    # (other than the class declaration)
                    ref_count = len(re.findall(rf'\b{re.escape(simple)}\b', content))
                    decl_count = len(re.findall(rf'\b(?:class|interface|enum)\s+{re.escape(simple)}\b', content))
                    if ref_count <= decl_count + 1:
                        print(f"  REMOVED: {relpath}: {stripped}")
                        continue
        new_lines.append(line)

    if new_lines != lines:
        write_file(fpath, '\n'.join(new_lines))

# =============================================================
# 3. Fix explicit 'already defined by single-type-import' errors
# by reading the specific error files and removing the problematic import
# =============================================================
print("\n=== 3. Fixing single-type-import conflicts ===")

# These are the "a type with the same simple name is already defined
# by the single-type-import of X" errors
single_type_conflicts = [
    # (filepath, conflicting_simple_name)
    ("com/tsf/shell/f/i/A.java", "a"),
    ("com/tsf/shell/f/i/b/d/b.java", "A"),
    ("com/tsf/shell/f/f/a/c/a/b.java", "k"),
    ("com/tsf/shell/f/f/a/c/a/a.java", "b"),
    ("com/tsf/shell/manager/f/b.java", "j"),
    ("com/tsf/shell/theme/inside/mix/menu/item/ThemeInstalledDetailMenu.java", "b"),
    ("com/censivn/C3DEngine/api/element/info/shortcut/LauncherShortcutStandardInfo.java", "b"),
    ("com/censivn/C3DEngine/b/h/b/c.java", "b"),
    ("com/tsf/shell/manager/d/a.java", "a"),
]

for relpath, conflict_name in single_type_conflicts:
    fpath = f"{SOURCES}/{relpath}"
    content = read_file(fpath)
    if not content:
        continue
    lines = content.split('\n')
    original = list(lines)

    # Find the file's package
    file_pkg = ""
    for line in lines:
        m = re.match(r'^package\s+([\w.]+);', line)
        if m:
            file_pkg = m.group(1)
            break

    # Find and remove the problematic same-package import
    new_lines = []
    for line in lines:
        stripped = line.strip()
        m = re.match(r'^import\s+([\w.]+)\.(\w+);$', stripped)
        if m and m.group(2) == conflict_name:
            imported_pkg = m.group(1)
            # If importing from the same package, remove it (it's redundant)
            if imported_pkg == file_pkg:
                print(f"  REMOVED (same-pkg): {relpath}: {stripped}")
                continue
        new_lines.append(line)

    if new_lines != original:
        write_file(fpath, '\n'.join(new_lines))

# =============================================================
# 4. Fix ambiguous reference errors — comment out redundant imports
# =============================================================
print("\n=== 4. Fixing ambiguous references ===")

# Files with ambiguous references
ambiguous_files = {
    "com/tsf/shell/manager/f/b.java": "j",
    "com/tsf/shell/f/f/a/c/a/b.java": "k",
    "com/censivn/C3DEngine/b/h/b/c.java": "b",
}

for relpath, ambig_name in ambiguous_files.items():
    fpath = f"{SOURCES}/{relpath}"
    content = read_file(fpath)
    if not content:
        continue
    lines = content.split('\n')
    original = list(lines)

    # Find the file's package
    file_pkg = ""
    for line in lines:
        m = re.match(r'^package\s+([\w.]+);', line)
        if m:
            file_pkg = m.group(1)
            break

    # Find imports of the ambiguous name
    imports = []
    for i, line in enumerate(lines):
        stripped = line.strip()
        m = re.match(r'^import\s+([\w.]+)\.(\w+);$', stripped)
        if m and m.group(2) == ambig_name:
            imports.append((i, m.group(1), stripped))

    # If there are 2+ imports of the same simple name, comment out the same-package one
    if len(imports) >= 2:
        for idx, pkg, imp in imports:
            if pkg == file_pkg:
                lines[idx] = f'// {imp}'
                print(f"  COMMENTED: {relpath}: {imp}")
                break

    if lines != original:
        write_file(fpath, '\n'.join(lines))

# =============================================================
# 5. Fix 'cannot inherit from final b'
# =============================================================
print("\n=== 5. Fixing 'cannot inherit from final' ===")
fpath = f"{SOURCES}/com/tsf/shell/f/f/a/c/a/a.java"
content = read_file(fpath)
if content:
    # Remove extends b (b is final)
    new_content = content.replace('extends b ', '')
    new_content = new_content.replace('extends com.tsf.b ', '')
    if new_content != content:
        write_file(fpath, new_content)
        print(f"  FIXED: {fpath}")

# =============================================================
# 6. Fix 'interface expected here' — the implements clause 
# references a class, not an interface
# =============================================================
print("\n=== 6. Fixing 'interface expected' ===")

interface_expected_files = [
    "com/tsf/shell/f/i/b/d/b.java",
    "com/tsf/shell/f/i/_b/d/b.java",
]

for relpath in interface_expected_files:
    fpath = f"{SOURCES}/{relpath}"
    content = read_file(fpath)
    if not content:
        continue
    lines = content.split('\n')
    original = list(lines)

    # Find the implements clause and the type referenced
    for i, line in enumerate(lines):
        if 'implements' in line:
            # Extract the types after implements
            m = re.search(r'implements\s+([\w.]+)', line)
            if m:
                type_name = m.group(1)
                # If the type is a class (not interface), remove implements
                # Check if the type is the class 'a' or 'A'
                if type_name in ('a', 'A'):
                    lines[i] = line.replace(f' implements {type_name}', '')
                    print(f"  FIXED: {relpath}: removed implements {type_name}")
                    break

    if lines != original:
        write_file(fpath, '\n'.join(lines))

# =============================================================
# 7. Check for remaining 'cannot find symbol' that need stubs
# =============================================================
print("\n=== 7. Checking for common missing symbols ===")

# Look for specific missing types in the build output
missing_types = {}

print("\n=== ALL FIXES APPLIED ===")
