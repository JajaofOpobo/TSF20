"""
Systematic v1 vs v3 deobfuscation map extractor.
Scans all decompiled Java files from both versions and produces
a comprehensive structural comparison mapping.
"""
import os
import re
import json
from collections import defaultdict

V1_DIR = "/home/jaja/Documents/TSF20/sources/v1-sources/app/src/main/java"
V3_DIR = "/home/jaja/Documents/TSF20/sources/sources"
OUTPUT_DIR = "/home/jaja/Documents/TSF20/docs/runtime_analysis"
EXISTING_MAP = os.path.join(OUTPUT_DIR, "tsf_shell_deobfuscation_map.txt")

# Regex patterns
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
FIELD_DECL = re.compile(
    r'(?:public|private|protected|static|final|volatile|transient)\s+'
    r'(?:[\w\[\]<>.,?\s]+)\s+'
    r'(\w+)\s*(?:=\s*[^;]+)?;'
)
IMPORT_LINE = re.compile(r'^import\s+(?:static\s+)?([\w.]+);')
PACKAGE_LINE = re.compile(r'^package\s+([\w.]+);')

SKIP_PACKAGES = {
    'android.support', 'com.flurry', 'com.badlogic.gdx',
    'com.android.vending',
}


def get_package(filepath, base_dir):
    rel = os.path.relpath(filepath, base_dir)
    parts = rel.replace(os.sep, '/').split('/')
    # Find the package by reading the file
    with open(filepath, 'r', errors='ignore') as f:
        content = f.read(4096)
    m = PACKAGE_LINE.search(content)
    if m:
        return m.group(1)
    # Fallback: derive from path minus filename
    if len(parts) > 1:
        return '.'.join(parts[:-1]).replace('.java', '')
    return ''


def extract_class_info(filepath, base_dir):
    """Extract structural info from a Java file."""
    with open(filepath, 'r', errors='ignore') as f:
        content = f.read()

    pkg = get_package(filepath, base_dir)
    filename = os.path.basename(filepath)

    class_info = {
        'file': os.path.relpath(filepath, base_dir),
        'package': pkg,
        'filename': filename,
        'class_name': None,
        'kind': None,  # class, interface, enum
        'superclass': None,
        'interfaces': [],
        'fields': [],
        'methods': [],
        'imports': [],
        'has_stub': False,
    }

    # Check for RuntimeException stub
    if 'throw new RuntimeException' in content or \
       'throw new UnsupportedOperationException' in content:
        class_info['has_stub'] = True
    if 'Method not decompiled' in content:
        class_info['has_stub'] = True

    # Package
    m = PACKAGE_LINE.search(content)
    if m:
        class_info['package'] = m.group(1)

    # Imports
    for m in IMPORT_LINE.finditer(content):
        class_info['imports'].append(m.group(1))

    # Class declaration
    m = CLASS_DECL.search(content)
    if m:
        class_info['class_name'] = m.group(1)
        if 'class ' in m.group(0):
            class_info['kind'] = 'class'
        elif 'interface ' in m.group(0):
            class_info['kind'] = 'interface'
        elif 'enum ' in m.group(0):
            class_info['kind'] = 'enum'
        elif '@interface ' in m.group(0):
            class_info['kind'] = 'annotation'
        class_info['superclass'] = m.group(2) if m.group(2) else None
        if m.group(3):
            class_info['interfaces'] = [x.strip() for x in m.group(3).split(',')]

    # Fields
    for m in FIELD_DECL.finditer(content):
        # Filter out obvious non-field matches
        name = m.group(1)
        if name and not name.startswith('//') and len(name) < 100:
            class_info['fields'].append(name)

    # Methods
    for m in METHOD_DECL.finditer(content):
        name = m.group(1)
        params = m.group(2) if m.group(2) else ''
        if name and not name.startswith('//') and name != 'if' and name != 'for':
            param_types = [p.strip().split()[-1] for p in params.split(',') if p.strip()]
            class_info['methods'].append({
                'name': name,
                'param_count': len(param_types),
                'param_types': param_types,
            })

    return class_info


def scan_all_files(base_dir):
    """Scan all Java files and extract class info."""
    classes = {}
    for root, dirs, files in os.walk(base_dir):
        for f in files:
            if f.endswith('.java'):
                filepath = os.path.join(root, f)
                info = extract_class_info(filepath, base_dir)
                if info['class_name']:
                    fq_name = f"{info['package']}.{info['class_name']}"
                    classes[fq_name] = info
    return classes


def fingerprint_class(info):
    """Generate a structural fingerprint for matching obfuscated classes."""
    return {
        'field_count': len(info['fields']),
        'method_count': len(info['methods']),
        'method_names': sorted(set(m['name'] for m in info['methods'])),
        'method_sigs': sorted(f"{m['name']}({','.join(m['param_types'])})" for m in info['methods']),
        'superclass': info['superclass'],
        'kind': info['kind'],
        'has_stub': info['has_stub'],
        'fields_sorted': sorted(info['fields']),
    }


def find_best_match(v1_info, v3_classes, v1_fq):
    """Find the best v3 match for a v1 class using structural fingerprinting."""
    v1_fp = fingerprint_class(v1_info)

    # Exact FQ match
    if v1_fq in v3_classes:
        return ('exact', v1_fq, 1.0)

    # Try same simple name in same package
    simple = v1_info['class_name']
    pkg = v1_info['package']
    candidates = []

    for v3_fq, v3_info in v3_classes.items():
        if v3_info['class_name'] == simple:
            candidates.append((v3_fq, v3_info))
            continue

        v3_fp = fingerprint_class(v3_info)

        score = 0
        max_score = 0

        # Method count match (weighted)
        max_score += 10
        if v1_fp['method_count'] == v3_fp['method_count'] and v1_fp['method_count'] > 0:
            score += 10
        elif abs(v1_fp['method_count'] - v3_fp['method_count']) <= 2:
            score += 5

        # Field count match
        max_score += 5
        if v1_fp['field_count'] == v3_fp['field_count'] and v1_fp['field_count'] > 0:
            score += 5
        elif abs(v1_fp['field_count'] - v3_fp['field_count']) <= 2:
            score += 2

        # Method signature overlap
        if v1_fp['method_sigs'] and v3_fp['method_sigs']:
            common = set(v1_fp['method_sigs']) & set(v3_fp['method_sigs'])
            if common:
                max_score += 20
                score += 20 * len(common) / max(len(v1_fp['method_sigs']), len(v3_fp['method_sigs']))

        # Same kind
        if v1_fp['kind'] == v3_fp['kind']:
            score += 2

        # Same superclass
        if v1_fp['superclass'] and v1_fp['superclass'] == v3_fp['superclass']:
            score += 5

        if score > 0:
            candidates.append((v3_fq, v3_info, score / max(max_score, 1)))

    if candidates:
        best = max(candidates, key=lambda x: x[2] if len(x) > 2 else 0)
        if len(best) > 2 and best[2] > 0.3:
            return ('structural', best[0], best[2])

    return ('unmatched', None, 0)


def parse_existing_map(filepath):
    """Parse the existing deobfuscation map into sections."""
    sections = {
        'unchanged': [],
        'v1_only': [],
        'v3_only': [],
        'patterns': [],
    }
    current_section = None

    if not os.path.exists(filepath):
        return sections

    with open(filepath, 'r') as f:
        for line in f:
            line = line.rstrip()
            if '=== UNCHANGED CLASSES' in line:
                current_section = 'unchanged'
            elif '=== V1-ONLY CLASSES' in line:
                current_section = 'v1_only'
            elif '=== V3-ONLY CLASSES' in line:
                current_section = 'v3_only'
            elif '=== SINGLE-LETTER OBFUSCATION PATTERNS' in line:
                current_section = 'patterns'
            elif '=== SUMMARY' in line:
                current_section = None
            elif current_section and line.strip() and not line.startswith('=') and not line.startswith('V1') and not line.startswith('V3'):
                if current_section == 'patterns':
                    sections['patterns'].append(line)
                elif line.strip().startswith('com.'):
                    sections[current_section].append(line.strip())

    return sections


def main():
    print("=== Step 4: Systematic Deobfuscation Map Extraction ===\n")

    print("Scanning v1 sources...")
    v1_classes = scan_all_files(V1_DIR)
    print(f"  Found {len(v1_classes)} v1 classes")

    print("Scanning v3 sources...")
    v3_classes = scan_all_files(V3_DIR)
    print(f"  Found {len(v3_classes)} v3 classes")

    # Filter to relevant packages
    relevant_pkgs = ['com.tsf.shell', 'com.censivn', 'com.ksmobile', 'com.cm']
    v1_filtered = {k: v for k, v in v1_classes.items()
                   if any(k.startswith(p) for p in relevant_pkgs)}
    v3_filtered = {k: v for k, v in v3_classes.items()
                   if any(k.startswith(p) for p in relevant_pkgs)}
    print(f"  Relevant v1: {len(v1_filtered)}")
    print(f"  Relevant v3: {len(v3_filtered)}")

    # Load existing map
    existing = parse_existing_map(EXISTING_MAP)
    print(f"  Existing unchanged: {len(existing['unchanged'])}")
    print(f"  Existing v1-only: {len(existing['v1_only'])}")
    print(f"  Existing v3-only: {len(existing['v3_only'])}")

    # Build FQ name lookup from existing unchanged
    unchanged_set = set()
    for raw in existing['unchanged']:
        entry = raw.strip()
        if entry.startswith('com.'):
            unchanged_set.add(entry)

    # --- ANALYSIS 1: Verify unchanged classes ---
    print("\n--- Analysis 1: Verifying unchanged classes ---")
    verified = []
    unverified = []
    for fq in sorted(unchanged_set):
        in_v1 = fq in v1_filtered
        in_v3 = fq in v3_filtered
        if in_v1 and in_v3:
            v1_fp = fingerprint_class(v1_filtered[fq])
            v3_fp = fingerprint_class(v3_filtered[fq])
            match = v1_fp == v3_fp
            verified.append((fq, 'exact match' if match else 'structural diff', match))
        elif in_v1 and not in_v3:
            unverified.append((fq, 'missing in v3'))
        elif not in_v1 and in_v3:
            unverified.append((fq, 'missing in v1'))

    print(f"  Verified unchanged: {len([v for v in verified if v[2]])}")
    print(f"  Structural diffs: {len([v for v in verified if not v[2]])}")
    print(f"  Missing from v3: {len([v for v in unverified if 'v3' in v[1]])}")
    print(f"  Missing from v1: {len([v for v in unverified if 'v1' in v[1]])}")

    for fq, status, ok in verified[:20]:
        if not ok:
            v1c = v1_filtered.get(fq, {})
            v3c = v3_filtered.get(fq, {})
            v1_mc = len(v1c.get('methods', []))
            v1_fc = len(v1c.get('fields', []))
            v3_mc = len(v3c.get('methods', []))
            v3_fc = len(v3c.get('fields', []))
            print(f"    DIFF: {fq} - {status}")
            print(f"      v1: {v1_mc} methods, {v1_fc} fields, super={v1c.get('superclass')}")
            print(f"      v3: {v3_mc} methods, {v3_fc} fields, super={v3c.get('superclass')}")

    # --- ANALYSIS 2: Find renamed classes (v1->v3) ---
    print("\n--- Analysis 2: Finding renamed/moved classes ---")
    v1_remaining = {k: v for k, v in v1_filtered.items() if k not in unchanged_set}
    v3_remaining = {k: v for k, v in v3_filtered.items() if k not in unchanged_set}

    matches = []
    unmatched_v1 = []
    for v1_fq, v1_info in sorted(v1_remaining.items()):
        result = find_best_match(v1_info, v3_remaining, v1_fq)
        if result[0] == 'structural':
            matches.append((v1_fq, result[1], result[2]))
        else:
            unmatched_v1.append((v1_fq, result))

    print(f"  Structural matches found: {len(matches)}")
    print(f"  Unmatched v1 classes: {len(unmatched_v1)}")

    # Top matches by score
    matches.sort(key=lambda x: -x[2])
    print("\n  Top structural matches (v1 -> v3):")
    for v1_fq, v3_fq, score in matches[:30]:
        print(f"    {v1_fq:60s} -> {v3_fq:60s} (score={score:.2f})")

    # --- ANALYSIS 3: Package-level mapping ---
    print("\n--- Analysis 3: Package-level mapping ---")
    v1_pkgs = defaultdict(list)
    v3_pkgs = defaultdict(list)
    for fq, info in v1_filtered.items():
        v1_pkgs[info['package']].append(fq)
    for fq, info in v3_filtered.items():
        v3_pkgs[info['package']].append(fq)

    print(f"  v1 packages: {len(v1_pkgs)}")
    print(f"  v3 packages: {len(v3_pkgs)}")

    # Compare package names
    v1_pkg_names = set(v1_pkgs.keys())
    v3_pkg_names = set(v3_pkgs.keys())
    common_pkgs = v1_pkg_names & v3_pkg_names
    v1_only_pkgs = v1_pkg_names - v3_pkg_names
    v3_only_pkgs = v3_pkg_names - v1_pkg_names

    print(f"  Common packages: {len(common_pkgs)}")
    print(f"  v1-only packages: {len(v1_only_pkgs)}")
    print(f"  v3-only packages: {len(v3_only_pkgs)}")

    print("\n  v1-only packages:")
    for p in sorted(v1_only_pkgs)[:20]:
        print(f"    {p} ({len(v1_pkgs[p])} files)")

    print("\n  v3-only packages:")
    for p in sorted(v3_only_pkgs)[:30]:
        print(f"    {p} ({len(v3_pkgs[p])} files)")

    # --- ANALYSIS 4: Theme class comparison ---
    print("\n--- Analysis 4: Theme class comparison ---")
    v1_theme = {k: v for k, v in v1_filtered.items() if 'theme' in k}
    v3_theme = {k: v for k, v in v3_filtered.items() if 'theme' in k}
    print(f"  v1 theme classes: {len(v1_theme)}")
    print(f"  v3 theme classes: {len(v3_theme)}")

    v1_theme_names = set(v1_theme.keys())
    v3_theme_names = set(v3_theme.keys())
    common_theme = v1_theme_names & v3_theme_names
    v1_only_theme = v1_theme_names - v3_theme_names
    v3_only_theme = v3_theme_names - v1_theme_names

    print(f"  Common theme classes: {len(common_theme)}")
    print(f"  v1-only theme classes: {len(v1_only_theme)}")
    print(f"  v3-only theme classes: {len(v3_only_theme)}")

    print("\n  Common theme classes:")
    for c in sorted(common_theme):
        print(f"    {c}")

    print("\n  v1-only theme classes (potential renames):")
    for c in sorted(v1_only_theme)[:20]:
        print(f"    {c}")

    # --- ANALYSIS 5: workspace3D -> f/ mapping ---
    print("\n--- Analysis 5: workspace3D -> f/ mapping ---")
    v1_ws = {k: v for k, v in v1_filtered.items() if 'workspace3D' in k}
    v3_f = {k: v for k, v in v3_filtered.items() if '.f.' in k or k.endswith('.f')}
    # Also include com.tsf.shell.f subpackages
    v3_f.update({k: v for k, v in v3_filtered.items() if k.startswith('com.tsf.shell.f.')})
    print(f"  v1 workspace3D classes: {len(v1_ws)}")
    print(f"  v3 f/ package classes: {len(v3_f)}")

    # --- OUTPUT: Generate improved map sections ---
    print("\n--- Generating improved deobfuscation data ---")

    # Output v1 package inventory
    output_file = os.path.join(OUTPUT_DIR, "v1_package_inventory.txt")
    with open(output_file, 'w') as f:
        f.write("=== v1 Package Inventory ===\n\n")
        for pkg in sorted(v1_pkgs.keys()):
            classes = sorted(v1_pkgs[pkg])
            readable = sum(1 for c in classes if not c.split('.')[-1][0].islower() and c.split('.')[-1] != c.split('.')[-1].lower())
            obfuscated = len(classes) - readable
            f.write(f"{pkg}: {len(classes)} files ({readable} readable, {obfuscated} obfuscated)\n")
            for c in classes:
                info = v1_filtered[c]
                mc = info.get('method_count', 0) or 0
            fc = info.get('field_count', 0) or 0
            f.write(f"  {c} ({info.get('kind') or 'class'}, {mc} methods, {fc} fields)\n")
            f.write("\n")
    print(f"  Wrote {output_file}")

    # Output improved mapping
    map_file = os.path.join(OUTPUT_DIR, "deobfuscation_map_v2.txt")
    with open(map_file, 'w') as f:
        f.write("=== Improved Deobfuscation Map (v1.9.9.7.6 vs v3.9.4) ===\n")
        f.write(f"Generated by systematic structural analysis\n\n")

        f.write("=== UNCHANGED CLASSES (verified) ===\n")
        for fq, status, ok in sorted(verified):
            if ok:
                f.write(f"  {fq}\n")

        f.write("\n=== STRUCTURAL DIFFERENCES (same FQ, different structure) ===\n")
        for fq, status, ok in sorted(verified):
            if not ok:
                f.write(f"  {fq} - {status}\n")
                v1c = v1_filtered.get(fq, {})
                v3c = v3_filtered.get(fq, {})
                if v1c and v3c:
                    v1_mc = len(v1c.get('methods', []))
                    v1_fc = len(v1c.get('fields', []))
                    v3_mc = len(v3c.get('methods', []))
                    v3_fc = len(v3c.get('fields', []))
                    f.write(f"    v1: {v1_mc} methods, {v1_fc} fields, super={v1c.get('superclass')}\n")
                    f.write(f"    v3: {v3_mc} methods, {v3_fc} fields, super={v3c.get('superclass')}\n")

        f.write("\n=== RENAMED CLASSES (structural matches) ===\n")
        for v1_fq, v3_fq, score in matches:
            f.write(f"  {v1_fq} -> {v3_fq} (confidence={score:.2f})\n")

        f.write("\n=== UNMATCHED v1 CLASSES ===\n")
        for v1_fq, result in unmatched_v1:
            f.write(f"  {v1_fq}\n")

    print(f"  Wrote {map_file}")

    print("\n=== Extraction Complete ===")
    print(f"\nSummary:")
    print(f"  v1 classes analyzed: {len(v1_filtered)}")
    print(f"  v3 classes analyzed: {len(v3_filtered)}")
    print(f"  Verified unchanged: {len([v for v in verified if v[2]])}")
    print(f"  Structural matches (renamed): {len(matches)}")
    print(f"  Unmatched v1: {len(unmatched_v1)}")
    print(f"  v1 packages: {len(v1_pkgs)}")
    print(f"  v3 packages: {len(v3_pkgs)}")


if __name__ == '__main__':
    main()
