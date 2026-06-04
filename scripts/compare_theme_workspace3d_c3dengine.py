"""
Deep comparison across steps 1, 2, 3:
1. Theme classes (v1 readable -> v3)
2. workspace3D -> f/ mapping
3. C3DEngine internals v1 b/* vs v3 b/*
"""
import os
import re
import ast

V1_DIR = "/home/jaja/Documents/TSF20/sources/v1-sources/app/src/main/java"
V3_DIR = "/home/jaja/Documents/TSF20/sources/sources"
OUTPUT_DIR = "/home/jaja/Documents/TSF20/docs/runtime_analysis"

CLASS_DECL = re.compile(
    r'(?:public\s+)?(?:abstract\s+|final\s+|static\s+|strictfp\s+)*'
    r'(?:class|interface|@interface|enum)\s+(\w+)'
    r'(?:\s+extends\s+(\w+(?:\.\w+)*))?'
    r'(?:\s+implements\s+([^{]+))?'
)
METHOD_DECL = re.compile(
    r'(?:public|private|protected|static|final|abstract|synchronized|native)\s+'
    r'(?:<[^>]+>\s+)?'
    r'(?:[\w\[\]<>.,?\s]+)\s+'
    r'(\w+)\s*\(([^)]*)\)'
    r'(?:\s*throws\s+[\w\s,]+)?'
    r'\s*[{;]'
)
PACKAGE_LINE = re.compile(r'^package\s+([\w.]+);')

SKIP_CLASSES = {'R', 'R$anim', 'R$array', 'R$attr', 'R$bool', 'R$color',
                'R$dimen', 'R$drawable', 'R$id', 'R$integer', 'R$layout',
                'R$raw', 'R$string', 'R$style', 'R$styleable', 'R$xml'}


def get_package_and_class(filepath):
    with open(filepath, 'r', errors='ignore') as f:
        content = f.read(8192)
    pkg = ''
    m = PACKAGE_LINE.search(content)
    if m:
        pkg = m.group(1)
    fname = os.path.basename(filepath).replace('.java', '')
    return pkg, fname, content


def extract_structure(filepath):
    with open(filepath, 'r', errors='ignore') as f:
        content = f.read()
    pkg = ''
    m = PACKAGE_LINE.search(content)
    if m:
        pkg = m.group(1)
    cm = CLASS_DECL.search(content)
    cls_name = cm.group(1) if cm else os.path.basename(filepath).replace('.java', '')
    superclass = cm.group(2) if cm and cm.group(2) else None
    interfaces = [x.strip() for x in cm.group(3).split(',')] if cm and cm.group(3) else []
    methods = []
    for m in METHOD_DECL.finditer(content):
        methods.append(m.group(1))
    return {
        'package': pkg,
        'class': cls_name,
        'superclass': superclass,
        'interfaces': interfaces,
        'method_count': len(methods),
        'method_names': sorted(set(methods)),
        'has_runtime_exception': 'throw new RuntimeException' in content or
                                  'throw new UnsupportedOperationException' in content,
        'fq': f"{pkg}.{cls_name}",
    }


def scan_package(base_dir, package_filter=None):
    classes = {}
    for root, dirs, files in os.walk(base_dir):
        for f in files:
            if not f.endswith('.java'):
                continue
            filepath = os.path.join(root, f)
            info = extract_structure(filepath)
            if package_filter and not info['package'].startswith(package_filter):
                continue
            if info['class'] in SKIP_CLASSES:
                continue
            key = info['fq']
            classes[key] = info
            classes[key]['filepath'] = filepath
    return classes


def print_section(title):
    print(f"\n{'='*70}")
    print(f"  {title}")
    print(f"{'='*70}")


print("=" * 70)
print("  Steps 1-3: Theme, workspace3D/f, and C3DEngine comparison")
print("=" * 70)

# ============================================================================
# STEP 1: Theme class comparison
# ============================================================================
print_section("Step 1: Theme Class Comparison (v1 readable -> v3)")

v1_theme = scan_package(V1_DIR, 'com.tsf.shell.theme')
v1_theme.update(scan_package(V1_DIR, 'com.tsf.shell.plugin.theme'))
v3_theme = scan_package(V3_DIR, 'com.tsf.shell.theme')
v3_theme.update(scan_package(V3_DIR, 'com.tsf.shell.plugin.theme'))
v3_theme.update(scan_package(V3_DIR, 'com.tsf.extend.theme'))

print(f"  v1 theme classes: {len(v1_theme)}")
print(f"  v3 theme classes: {len(v3_theme)}")

v1_keys = set(v1_theme.keys())
v3_keys = set(v3_theme.keys())
common = v1_keys & v3_keys
v1_only = v1_keys - v3_keys
v3_only = v3_keys - v1_keys

print(f"  Same FQ: {len(common)}")
print(f"  v1-only: {len(v1_only)}")
print(f"  v3-only: {len(v3_only)}")

# Readable v1 theme classes (class name starts with uppercase)
print("\n  --- Readable v1 theme classes ---")
v1_readable = {k: v for k, v in v1_theme.items()
               if v['class'][0].isupper() and not v['class'].startswith('Theme') == False}
# Actually just find all with readable names
v1_readable = {k: v for k, v in v1_theme.items()
               if v['class'][0].isupper()}

for fq, info in v1_readable.items():
    status = "SAME IN V3" if fq in v3_keys else "v3-only or renamed"
    if fq in v3_keys:
        v3info = v3_theme[fq]
        same = info['method_count'] == v3info['method_count']
        status = f"SAME ({info['method_count']} methods)" if same else \
                 f"DIFFERS (v1:{info['method_count']}m vs v3:{v3info['method_count']}m)"
    print(f"    {fq:65s} [{status}]")

# Try to find renames: match v1 readable names to v3 by class name
print("\n  --- v1 readable theme classes matched by name in v3 ---")
for fq, info in sorted(v1_readable.items()):
    cls = info['class']
    matches = [(k, v) for k, v in v3_theme.items() if v['class'] == cls]
    if matches:
        for k, v in matches:
            if k != fq:
                diff = "SAME" if info['method_count'] == v['method_count'] else \
                       f"DIFF (v1:{info['method_count']}m vs v3:{v['method_count']}m)"
                print(f"    {fq:60s} -> {k:60s} [{diff}]")
    else:
        # Check if the class name exists in v3 somewhere
        pass

# See which v1 theme readable classes are completely absent from v3
print("\n  --- v1 readable theme classes ABSENT from v3 ---")
for fq, info in sorted(v1_readable.items()):
    cls = info['class']
    found = any(v['class'] == cls for v in v3_theme.values())
    if not found:
        print(f"    {fq:65s} ({info['method_count']} methods)")

# See what's new in v3 theme that wasn't in v1
print("\n  --- v3 theme classes with readable names (new since v1) ---")
v3_readable_new = {k: v for k, v in sorted(v3_theme.items())
                   if v['class'][0].isupper() and k not in v1_keys}
for fq, info in list(v3_readable_new.items())[:30]:
    print(f"    {fq} ({info['method_count']} methods)")


# ============================================================================
# STEP 2: workspace3D -> f/ mapping
# ============================================================================
print_section("Step 2: workspace3D -> f/ mapping")

v1_ws = scan_package(V1_DIR, 'com.tsf.shell.workspace3D')
v3_f = scan_package(V3_DIR, 'com.tsf.shell.f')

print(f"  v1 workspace3D classes: {len(v1_ws)}")
print(f"  v3 f/ classes: {len(v3_f)}")

# Group by subpackage
v1_ws_pkgs = {}
for fq, info in v1_ws.items():
    pkg = info['package']
    if pkg not in v1_ws_pkgs:
        v1_ws_pkgs[pkg] = []
    v1_ws_pkgs[pkg].append(info)

v3_f_pkgs = {}
for fq, info in v3_f.items():
    pkg = info['package']
    if pkg not in v3_f_pkgs:
        v3_f_pkgs[pkg] = []
    v3_f_pkgs[pkg].append(info)

print("\n  --- v1 workspace3D subpackages ---")
for pkg in sorted(v1_ws_pkgs.keys()):
    classes = v1_ws_pkgs[pkg]
    readable = sum(1 for c in classes if c['class'][0].isupper() or c['class'][0].isdigit())
    print(f"    {pkg:55s}: {len(classes):3d} files ({readable} readable)")

print("\n  --- v3 f/ subpackages ---")
for pkg in sorted(v3_f_pkgs.keys()):
    classes = v3_f_pkgs[pkg]
    readable = sum(1 for c in classes if c['class'][0].isupper() or c['class'][0].isdigit())
    print(f"    {pkg:55s}: {len(classes):3d} files ({readable} readable)")

# Check if v1 workspace3D subpackage names match v3 f/ subpackage names
print("\n  --- Mapping v1 workspace3D letter -> v3 f/ subpackage ---")
v1_letters = set()
for fq, info in v1_ws.items():
    parts = fq.split('.')
    for i, p in enumerate(parts):
        if p == 'workspace3D' and i + 1 < len(parts):
            v1_letters.add(parts[i + 1])
v1_letters = sorted(v1_letters)

v3_letters = set()
for fq, info in v3_f.items():
    parts = fq.split('.')
    for i, p in enumerate(parts):
        if p == 'f' and i + 1 < len(parts) and parts[i + 1] not in ('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'):
            pass
    if info['package'].startswith('com.tsf.shell.f.'):
        sub = info['package'].replace('com.tsf.shell.f.', '').split('.')[0]
        v3_letters.add(sub)

print(f"  v1 workspace3D subdirs: {sorted(v1_letters)}")
# Find all v3 f/ subpackage short names
v3_f_subs = set()
for pkg in v3_f_pkgs:
    parts = pkg.split('.')
    if len(parts) > 4 and parts[3] == 'f':
        sub = '.'.join(parts[4:])
        v3_f_subs.add(sub)
print(f"  v3 f/* subpackages ({len(v3_f_subs)}): {sorted(v3_f_subs)[:40]}")


# ============================================================================
# STEP 3: C3DEngine internals v1 b/* vs v3 b/*
# ============================================================================
print_section("Step 3: C3DEngine Internals (v1 b/* vs v3 b/*)")

v1_c3de = scan_package(V1_DIR, 'com.censivn.C3DEngine')
v3_c3de = scan_package(V3_DIR, 'com.censivn.C3DEngine')

# Filter to obfuscated internal packages
v1_internal = {k: v for k, v in v1_c3de.items()
               if any(f'.{p}.' in k or k.endswith(f'.{p}')
                      for p in ['b', 'c', 'd', 'e', 'f', 'g', 'h', 'i'])}
v3_internal = {k: v for k, v in v3_c3de.items()
               if any(f'.{p}.' in k or k.endswith(f'.{p}')
                      for p in ['b', 'c', 'd', 'e', 'f', 'g', 'h', 'i'])}

print(f"  v1 C3DEngine internal classes: {len(v1_internal)}")
print(f"  v3 C3DEngine internal classes: {len(v3_internal)}")

# Group by subpackage
for ver_name, classes in [("v1", v1_internal), ("v3", v3_internal)]:
    pkgs = {}
    for fq, info in classes.items():
        pkg = info['package']
        if pkg not in pkgs:
            pkgs[pkg] = []
        pkgs[pkg].append(info)
    print(f"\n  {ver_name} internal packages:")
    for pkg in sorted(pkgs.keys()):
        count = len(pkgs[pkg])
        print(f"    {pkg:55s}: {count:3d} files")

# Compare v1.b vs v3.b top-level classes
print("\n  --- v1.C3DEngine.b vs v3.C3DEngine.b (top-level) ---")
v1_b = {k: v for k, v in v1_c3de.items() if v['package'] == 'com.censivn.C3DEngine.b'}
v3_b = {k: v for k, v in v3_c3de.items() if v['package'] == 'com.censivn.C3DEngine.b'}
print(f"  v1.b: {len(v1_b)} files")
print(f"  v3.b: {len(v3_b)} files")

# Find method count overlaps to suggest mapping
print("\n  Method count comparison (v1.b vs v3.b):")
v1_method_counts = {}
for fq, info in v1_b.items():
    mc = info['method_count']
    cls = info['class']
    if mc not in v1_method_counts:
        v1_method_counts[mc] = []
    v1_method_counts[mc].append(cls)

v3_method_counts = {}
for fq, info in v3_b.items():
    mc = info['method_count']
    cls = info['class']
    if mc not in v3_method_counts:
        v3_method_counts[mc] = []
    v3_method_counts[mc].append(cls)

# Find exact matches
for mc in sorted(set(v1_method_counts.keys()) & set(v3_method_counts.keys())):
    v1_classes = v1_method_counts[mc]
    v3_classes = v3_method_counts[mc]
    print(f"  {mc:3d} methods: v1={v1_classes} -> v3={v3_classes}")

# Deeper: compare method signatures
print("\n  --- Detailed signature matching (same method count) ---")
for mc in sorted(set(v1_method_counts.keys()) & set(v3_method_counts.keys())):
    if mc == 0:
        continue
    for v1_cls in v1_method_counts[mc]:
        v1_info = v1_c3de.get(f'com.censivn.C3DEngine.b.{v1_cls}')
        if not v1_info:
            continue
        v1_methods = set(v1_info['method_names'])
        for v3_cls in v3_method_counts[mc]:
            v3_info = v3_c3de.get(f'com.censivn.C3DEngine.b.{v3_cls}')
            if not v3_info:
                continue
            v3_methods = set(v3_info['method_names'])
            common = v1_methods & v3_methods
            if common:
                print(f"    v1.b.{v1_cls}({v1_info['method_count']}m) <-> v3.b.{v3_cls}({v3_info['method_count']}m): {len(common)} common methods: {sorted(common)}")

# Compare v1.g (tween in v1) vs v3.b.g (tween in v3)
print("\n  --- Tween engine: v1.g vs v3.b.g ---")
v1_g = {k: v for k, v in v1_c3de.items() if v['package'].startswith('com.censivn.C3DEngine.g')}
v3_bg = {k: v for k, v in v3_c3de.items() if v['package'].startswith('com.censivn.C3DEngine.b.g')}
print(f"  v1.g: {len(v1_g)} files")
print(f"  v3.b.g: {len(v3_bg)} files")

for ver, classes in [("v1.g", v1_g), ("v3.b.g", v3_bg)]:
    print(f"\n  {ver}:")
    for fq, info in sorted(classes.items()):
        print(f"    {fq:55s} ({info['method_count']} methods, super={info['superclass']})")

# Compare common shader classes in detail
print("\n  --- Shader classes (common/shader/) ---")
v1_shaders = {k: v for k, v in v1_c3de.items()
              if v['package'].startswith('com.censivn.C3DEngine.common.shader')}
v3_shaders = {k: v for k, v in v3_c3de.items()
              if v['package'].startswith('com.censivn.C3DEngine.common.shader')}
for fq in sorted(set(v1_shaders.keys()) | set(v3_shaders.keys())):
    v1_info = v1_shaders.get(fq)
    v3_info = v3_shaders.get(fq)
    if v1_info and v3_info:
        same = v1_info['method_count'] == v3_info['method_count']
        print(f"  {fq:60s} v1:{v1_info['method_count']}m v3:{v3_info['method_count']}m [{'SAME' if same else 'DIFF'}]")
    elif v1_info:
        print(f"  {fq:60s} v1:{v1_info['method_count']}m [V1 ONLY]")
    else:
        print(f"  {fq:60s} v3:{v3_info['method_count']}m [V3 ONLY]")

print(f"\n{'='*70}")
print("  COMPLETE")
print(f"{'='*70}")
