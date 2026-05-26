#!/usr/bin/env python3
"""
Batch fix for remaining compilation errors.
Fixes specific files based on build output analysis.
"""
import os
import re

SOURCES = "/home/ubuntu/Documents/TSF20/sources/sources"

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
    print(f"  FIXED: {path}")

# ================================================================
# FIX 1: ItemInfo.java - b type
# The type `b` is used but not imported. Looking at how it's used
# (widget getter/setter pattern), it might be `com.tsf.shell.f.i.B`
# which is already imported! Let me check.
# ================================================================
iteminfo = read_file(f"{SOURCES}/com/censivn/C3DEngine/api/element/info/ItemInfo.java")
# It imports `com.tsf.shell.f.i.B` - is `b` supposed to be `B`?
# In the DEX, B extends j implements f - B is a container/UI class
# `b widget` type b → could be com.tsf.shell.f.i.B since B represents a 3D widget
# Let's change `b` to `B` and see if it compiles
if 'private b widget;' in iteminfo:
    iteminfo = iteminfo.replace('private b widget;', 'private com.tsf.shell.f.i.B widget;')
    iteminfo = iteminfo.replace('public void setWidget(b bVar)', 'public void setWidget(com.tsf.shell.f.i.B bVar)')
    iteminfo = iteminfo.replace('public b getWidget()', 'public com.tsf.shell.f.i.B getWidget()')
    iteminfo = iteminfo.replace('public void onUpdateLayoutInformation(ContentValues contentValues, b bVar)', 'public void onUpdateLayoutInformation(ContentValues contentValues, com.tsf.shell.f.i.B bVar)')
    write_file(f"{SOURCES}/com/censivn/C3DEngine/api/element/info/ItemInfo.java", iteminfo)

# ================================================================
# FIX 2: Home.java - lowercase a and d references
# `implements com.tsf.shell.a` → should be `com.tsf.shell.A` (JADX renamed)
# `private com.tsf.shell.f.d n` → type `d` doesn't exist as separate class
#   In DEX: Lcom/tsf/shell/f/d; exists (lowercase). On disk: D.java exists (class D).
#   JADX renamed `d` to `D` for the file. Home.java uses lowercase `d`.
#   Fix: change com.tsf.shell.f.d to com.tsf.shell.f.D
# `a.InterfaceC0025a` → `a` is inner class of Home, need InterfaceC0025a defined
# ================================================================
home = read_file(f"{SOURCES}/com/tsf/shell/Home.java")
if 'com.tsf.shell.a' in home:
    home = home.replace('com.tsf.shell.a,', 'com.tsf.shell.A,')
    print("  Fixed Home.java: com.tsf.shell.a -> A")
if 'private com.tsf.shell.f.d' in home:
    home = home.replace('private com.tsf.shell.f.d n', 'private com.tsf.shell.f.D n')
    print("  Fixed Home.java: f.d -> f.D")
# Check if InterfaceC0025a is defined in Home.java
if 'InterfaceC0025a' in home and 'interface InterfaceC0025a' not in home:
    # Define it as an inner interface of Home
    # Find where to insert - before the closing } of Home class or after last inner class
    # Find the last class-level inner class or the end
    lines = home.split('\n')
    # Find `class a` inside Home (inner class)
    # Look for patterns like "static class a" or "class a"
    insert_pos = -1
    for i, line in enumerate(lines):
        if re.search(r'\b(class|interface)\s+a\b', line.strip()) and '{' in line:
            # This is the inner class `a`
            # Find its closing brace and insert before it
            depth = 0
            started = False
            for j in range(i, len(lines)):
                depth += lines[j].count('{') - lines[j].count('}')
                if depth > 0:
                    started = True
                if started and depth <= 0:
                    insert_pos = j
                    break
            if insert_pos > 0:
                break
    
    if insert_pos > 0:
        interface_def = '''
    /* JADX INFO: added from: classes.dex */
    public interface InterfaceC0025a {
        void onActivityResult(int i, int i2, Intent intent);
    }
'''
        lines.insert(insert_pos, interface_def)
        home = '\n'.join(lines)
        write_file(f"{SOURCES}/com/tsf/shell/Home.java", home)
        print("  FIXED Home.java: added InterfaceC0025a interface")

# ================================================================
# FIX 3: _h/a.java - missing import and modifier errors
# The class `a` in _h package shadows the import for `a.InterfaceC0025a`
# Fix: use fully qualified name com.censivn.C3DEngine.b.c.a.InterfaceC0025a
# Also fix modifier errors by properly structuring the class
# ================================================================
h_a = read_file(f"{SOURCES}/com/tsf/shell/f/e/_h/a.java")
if 'implements a.InterfaceC0025a' in h_a:
    h_a = h_a.replace(
        'public class a implements a.InterfaceC0025a {',
        'public class a implements com.censivn.C3DEngine.b.c.a.InterfaceC0025a {'
    )
    h_a = h_a.replace(
        '(a.InterfaceC0025a) this',
        '(com.censivn.C3DEngine.b.c.a.InterfaceC0025a) this'
    )
    write_file(f"{SOURCES}/com/tsf/shell/f/e/_h/a.java", h_a)
    print("  FIXED _h/a.java: fully qualified InterfaceC0025a")

# ================================================================
# FIX 4: _b/d/b.java - InterfaceC0113a
# Missing import for InterfaceC0113a
# ================================================================
bd_b = read_file(f"{SOURCES}/com/tsf/shell/f/i/_b/d/b.java")
if 'InterfaceC0113a' in bd_b and 'import com.tsf.shell.f.i._a.InterfaceC0113a' not in bd_b:
    # Need to create InterfaceC0113a stub and import it
    write_file(f"{SOURCES}/com/tsf/shell/f/i/_a/InterfaceC0113a.java", """\
package com.tsf.shell.f.i._a;

import com.censivn.C3DEngine.b.f.i;
import java.util.ArrayList;

/* loaded from: classes.dex */
public interface InterfaceC0113a {
    ArrayList<i> b();
}
""")
    # Add import
    lines = bd_b.split('\n')
    last_import = -1
    for i, line in enumerate(lines):
        if line.startswith('import '):
            last_import = i
    if last_import >= 0:
        lines.insert(last_import + 1, 'import com.tsf.shell.f.i._a.InterfaceC0113a;')
        bd_b = '\n'.join(lines)
        write_file(f"{SOURCES}/com/tsf/shell/f/i/_b/d/b.java", bd_b)
        print("  FIXED _b/d/b.java: added InterfaceC0113a import")

# ================================================================
# FIX 5: f/i/A.java - InterfaceC0113a
# A.java references InterfaceC0113a in the _a package
# ================================================================
fi_A = read_file(f"{SOURCES}/com/tsf/shell/f/i/A.java")
if 'InterfaceC0113a' in fi_A and 'import com.tsf.shell.f.i._a.InterfaceC0113a' not in fi_A:
    if 'import com.tsf.shell.f.i._a.InterfaceC0113a;' not in fi_A:
        lines = fi_A.split('\n')
        last_import = -1
        for i, line in enumerate(lines):
            if line.startswith('import '):
                last_import = i
        if last_import >= 0:
            lines.insert(last_import + 1, 'import com.tsf.shell.f.i._a.InterfaceC0113a;')
            fi_A = '\n'.join(lines)
            write_file(f"{SOURCES}/com/tsf/shell/f/i/A.java", fi_A)
            print("  FIXED f/i/A.java: added InterfaceC0113a import")

# ================================================================
# FIX 6: _a/c.java - mangled package path
# Has `com.censivn.C3DEngine.b.com.tsf.shell.f.f.a._a.B` which is wrong
# Should be `com.tsf.shell.f.f.a._a.B`
# ================================================================
c_java = read_file(f"{SOURCES}/com/tsf/shell/f/f/a/_a/c.java")
mangled = 'com.censivn.C3DEngine.b.com.tsf.shell.f.f.a._a.B'
fixed = 'com.tsf.shell.f.f.a._a.B'
if mangled in c_java:
    c_java = c_java.replace(mangled, fixed)
    write_file(f"{SOURCES}/com/tsf/shell/f/f/a/_a/c.java", c_java)
    print("  FIXED _a/c.java: fixed mangled package path")

# ================================================================
# FIX 7: _c/a/a.java - extends final b
# The import com.tsf.b shadows the local b. Fix: remove import,
# use fully qualified for com.tsf.b references if needed.
# But the local class `b` (in f/f/a/_c/a/) is the intended superclass.
# Remove import com.tsf.b so `extends b` resolves to the local class.
# ================================================================
ca_a = read_file(f"{SOURCES}/com/tsf/shell/f/f/a/_c/a/a.java")
if 'import com.tsf.b;' in ca_a:
    ca_a = ca_a.replace('import com.tsf.b;\n', '')
    write_file(f"{SOURCES}/com/tsf/shell/f/f/a/_c/a/a.java", ca_a)
    print("  FIXED _c/a/a.java: removed import com.tsf.b (shadowing local b)")

# ================================================================
# FIX 8: f/f/a/h.java - package a does not exist
# The error is: `implements b.a, a.InterfaceC0101a, c.a, d.a`
# `a.InterfaceC0101a` - `a` is being treated as a package
# This is a type `a` in the same package that has inner interface InterfaceC0101a
# Fix: create InterfaceC0101a as standalone interface
# ================================================================
h_java = read_file(f"{SOURCES}/com/tsf/shell/f/f/a/h.java")
if 'a.InterfaceC0101a' in h_java:
    # Create InterfaceC0101a
    write_file(f"{SOURCES}/com/tsf/shell/f/f/a/InterfaceC0101a.java", """\
package com.tsf.shell.f.f.a;

/* loaded from: classes.dex */
public interface InterfaceC0101a {
    void a(Object obj);
    void b(Object obj);
}
""")
    # Fix h.java to reference InterfaceC0101a directly
    h_java = h_java.replace('a.InterfaceC0101a', 'InterfaceC0101a')
    # Add import for InterfaceC0101a
    if 'import com.tsf.shell.f.f.a.InterfaceC0101a;' not in h_java:
        lines = h_java.split('\n')
        last_import = -1
        for i, line in enumerate(lines):
            if line.startswith('import '):
                last_import = i
        if last_import >= 0:
            lines.insert(last_import + 1, 'import com.tsf.shell.f.f.a.InterfaceC0101a;')
            h_java = '\n'.join(lines)
    write_file(f"{SOURCES}/com/tsf/shell/f/f/a/h.java", h_java)
    print("  FIXED h.java: package a reference")

# ================================================================
# FIX 9: f/a/b/b.java - a.C0079a
# Create C0079a as standalone interface
# ================================================================
b_b = read_file(f"{SOURCES}/com/tsf/shell/f/a/b/b.java")
if 'a.C0079a' in b_b:
    write_file(f"{SOURCES}/com/tsf/shell/f/a/b/C0079a.java", """\
package com.tsf.shell.f.a.b;

/* loaded from: classes.dex */
public interface C0079a {
    void a();
}
""")
    b_b = b_b.replace('a.C0079a', 'C0079a')
    if 'import com.tsf.shell.f.a.b.C0079a;' not in b_b:
        lines = b_b.split('\n')
        last_import = -1
        for i, line in enumerate(lines):
            if line.startswith('import '):
                last_import = i
        if last_import >= 0:
            lines.insert(last_import + 1, 'import com.tsf.shell.f.a.b.C0079a;')
            b_b = '\n'.join(lines)
    write_file(f"{SOURCES}/com/tsf/shell/f/a/b/b.java", b_b)
    print("  FIXED f/a/b/b.java: C0079a reference")

# ================================================================
# FIX 10: _c/i.java - a.C0133a
# ================================================================
ci = read_file(f"{SOURCES}/com/tsf/shell/f/f/a/_c/i.java")
if 'a.C0133a' in ci:
    write_file(f"{SOURCES}/com/tsf/shell/f/f/a/C0133a.java", """\
package com.tsf.shell.f.f.a;

/* loaded from: classes.dex */
public interface C0133a {
    void a(Object obj);
    void b(Object obj);
    void c(Object obj);
}
""")
    ci = ci.replace('a.C0133a', 'C0133a')
    if 'import com.tsf.shell.f.f.a.C0133a;' not in ci:
        lines = ci.split('\n')
        last_import = -1
        for i, line in enumerate(lines):
            if line.startswith('import '):
                last_import = i
        if last_import >= 0:
            lines.insert(last_import + 1, 'import com.tsf.shell.f.f.a.C0133a;')
            ci = '\n'.join(lines)
    write_file(f"{SOURCES}/com/tsf/shell/f/f/a/_c/i.java", ci)
    print("  FIXED _c/i.java: C0133a reference")

# Also fix h.java which references a.C0133a
if 'a.C0133a' in h_java:
    h_java = h_java.replace('a.C0133a', 'C0133a')
    if 'import com.tsf.shell.f.f.a.C0133a;' not in h_java:
        lines = h_java.split('\n')
        last_import = -1
        for i, line in enumerate(lines):
            if line.startswith('import '):
                last_import = i
        if last_import >= 0:
            lines.insert(last_import + 1, 'import com.tsf.shell.f.f.a.C0133a;')
            h_java = '\n'.join(lines)
    write_file(f"{SOURCES}/com/tsf/shell/f/f/a/h.java", h_java)
    print("  FIXED h.java: C0133a reference")

# ================================================================
# FIX 11: f/e/n.java - private h r
# The `h` type is missing. Check if it should be `H` in f/e package
# DEX says Lcom/tsf/shell/f/e/h; exists (lowercase)
# Current file is H.java (renamed from h.java) with class H
# Fix: change `h` to `H` in n.java
# ================================================================
n_java = read_file(f"{SOURCES}/com/tsf/shell/f/e/n.java")
if 'private h r;' in n_java:
    n_java = n_java.replace('private h r;', 'private H r;')
    n_java = n_java.replace('public void a(h hVar)', 'public void a(H hVar)')
    write_file(f"{SOURCES}/com/tsf/shell/f/e/n.java", n_java)
    print("  FIXED f/e/n.java: h -> H")

# ================================================================
# FIX 12: Other lowercase type references
# Search for common patterns of lowercase single-letter types used
# that should be uppercase
# ================================================================
# Check f/f/a/A.java - references `a` as a type
# In the f/f/a/ package, `a` is used as a type (interface/class)
# This should match the file a.java in the same package, but we can't
# create a.java because a/ subpackage dir exists.
# Instead, we need to create the interface `a` as uppercase A
# But A.java already exists as class A...
# 
# The DEX has:
# - Lcom/tsf/shell/f/f/a/A; (class A)
# - Lcom/tsf/shell/f/f/a/a; (interface a - not found, probably lowercase)
# 
# Actually let me check if f/f/a/A.java is the class or the interface
a_ffa = read_file(f"{SOURCES}/com/tsf/shell/f/f/a/A.java")
if 'public class A' in a_ffa:
    print("  f/f/a/A.java is a CLASS")
elif 'public interface A' in a_ffa:
    print("  f/f/a/A.java is an INTERFACE")

print("\n=== Fixes applied. Rebuild to check. ===")
