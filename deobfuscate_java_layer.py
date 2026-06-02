"""Generate deobfuscation map for TSF Shell Java layer (com.tsf.*, com.cm.*)."""
import re

V1_FILE = "docs/runtime_analysis/v1.9.9.7.6_all_classes.txt"
V3_FILE = "docs/runtime_analysis/all_loaded_classes.txt"
OUT_FILE = "docs/runtime_analysis/tsf_shell_deobfuscation_map.txt"

def parse_v1_classes(filepath):
    classes = {}
    with open(filepath) as f:
        for line in f:
            line = line.strip()
            m = re.match(r'L([\w.]+/[\w.$]+);', line)
            if not m:
                m = re.match(r'L([\w./$]+);', line)
            if m:
                name = m.group(1).replace('/', '.')
                # Categorize by package
                for pkg_prefix in ['com.tsf.', 'com.cm.', 'com.censivn.', 'com.kinfoc.', 'com.surp.']:
                    if name.startswith(pkg_prefix):
                        classes[name] = True
                        break
    return set(classes.keys())

def parse_v3_classes(filepath, package_prefixes):
    classes = set()
    with open(filepath) as f:
        for line in f:
            line = line.strip()
            for p in package_prefixes:
                if line.startswith(p):
                    # Remove inner class suffix for comparison
                    classes.add(line)
                    break
    return classes

# Parse
v1_all = parse_v1_classes(V1_FILE)
v3_prefixes = ['com.tsf.', 'com.cm.', 'com.censivn.', 'com.kinfoc.', 'com.surp.', 'com.extend.']
v3_all = parse_v3_classes(V3_FILE, v3_prefixes)

# Focus on com.tsf.shell and com.tsf packages
v1_shell = {c for c in v1_all if c.startswith('com.tsf.shell.') or c == 'com.tsf.shell'}
v1_tsf = {c for c in v1_all if c.startswith('com.tsf.') or c == 'com.tsf'}
v1_cm = {c for c in v1_all if c.startswith('com.cm.')}
v1_censivn = {c for c in v1_all if c.startswith('com.censivn.')}
v1_others = v1_all - v1_tsf - v1_cm - v1_censivn

v3_shell = {c for c in v3_all if c.startswith('com.tsf.shell.') or c == 'com.tsf.shell'}
v3_tsf = {c for c in v3_all if c.startswith('com.tsf.') or c == 'com.tsf'}
v3_cm = {c for c in v3_all if c.startswith('com.cm.')}
v3_censivn = {c for c in v3_all if c.startswith('com.censivn.')}
v3_extend = {c for c in v3_all if c.startswith('com.extend.')}
v3_others = v3_all - v3_tsf - v3_cm - v3_censivn - v3_extend

with open(OUT_FILE, 'w') as f:
    f.write("=== TSF Shell Java Layer Deobfuscation Map (v1.9.9.7.6 vs v3.9.4) ===\n\n")
    
    f.write(f"V1 total TSF+CM+Kinfoc+Surp+CensivN classes: {len(v1_all)}\n")
    f.write(f"V3 total runtime TSF+CM+CensivN+Extend classes: {len(v3_all)}\n\n")
    
    # 1. Classes with same name in both versions (unchanged)
    unchanged_shell = v1_shell & v3_shell
    unchanged_tsf = v1_tsf & v3_tsf
    unchanged_cm = v1_cm & v3_cm
    unchanged_censivn = v1_censivn & v3_censivn
    
    f.write("=== UNCHANGED CLASSES (same name in both versions) ===\n")
    f.write(f"\n--- com.tsf.shell.* ({len(unchanged_shell)}) ---\n")
    for c in sorted(unchanged_shell):
        f.write(f"  {c}\n")
    
    f.write(f"\n--- com.tsf.* ({len(unchanged_tsf)}) ---\n")
    for c in sorted(unchanged_tsf):
        f.write(f"  {c}\n")
    
    f.write(f"\n--- com.cm.* ({len(unchanged_cm)}) ---\n")
    for c in sorted(unchanged_cm):
        f.write(f"  {c}\n")
    
    f.write(f"\n--- com.censivn.* ({len(unchanged_censivn)}) ---\n")
    for c in sorted(unchanged_censivn):
        f.write(f"  {c}\n")
    
    # 2. Classes only in v1 (removed or not loaded at runtime)
    v1_only_shell = v1_shell - v3_shell
    v1_only_tsf = v1_tsf - v3_tsf
    v1_only_cm = v1_cm - v3_cm
    v1_only_censivn = v1_censivn - v3_censivn
    
    f.write(f"\n=== V1-ONLY CLASSES (present in v1, NOT loaded at runtime in v3) ===\n")
    f.write(f"\n--- com.tsf.shell.* ({len(v1_only_shell)}) ---\n")
    for c in sorted(v1_only_shell):
        f.write(f"  {c}\n")
    
    f.write(f"\n--- com.tsf.* ({len(v1_only_tsf)}) ---\n")
    for c in sorted(v1_only_tsf):
        f.write(f"  {c}\n")
    
    f.write(f"\n--- com.cm.* ({len(v1_only_cm)}) ---\n")
    for c in sorted(v1_only_cm):
        f.write(f"  {c}\n")
    
    f.write(f"\n--- com.censivn.* ({len(v1_only_censivn)}) ---\n")
    for c in sorted(v1_only_censivn):
        f.write(f"  {c}\n")
    
    # 3. Classes only in v3 runtime (new or obfuscated names)
    v3_only_shell = v3_shell - v1_shell
    v3_only_tsf = v3_tsf - v1_tsf
    v3_only_cm = v3_cm - v1_cm
    v3_only_censivn = v3_censivn - v1_censivn
    v3_only_extend = v3_extend
    
    f.write(f"\n=== V3-ONLY CLASSES (loaded at runtime in v3, NOT in v1) ===\n")
    f.write(f"\n--- com.tsf.shell.* ({len(v3_only_shell)}) ---\n")
    for c in sorted(v3_only_shell):
        f.write(f"  {c}\n")
    
    f.write(f"\n--- com.tsf.* ({len(v3_only_tsf)}) ---\n")
    for c in sorted(v3_only_tsf):
        f.write(f"  {c}\n")
    
    f.write(f"\n--- com.cm.* ({len(v3_only_cm)}) ---\n")
    for c in sorted(v3_only_cm):
        f.write(f"  {c}\n")
    
    f.write(f"\n--- com.censivn.* ({len(v3_only_censivn)}) ---\n")
    for c in sorted(v3_only_censivn):
        f.write(f"  {c}\n")
    
    f.write(f"\n--- com.extend.* ({len(v3_only_extend)}) ---\n")
    for c in sorted(v3_only_extend):
        f.write(f"  {c}\n")
    
    # 4. Cross-reference: single-letter class analysis
    f.write(f"\n\n=== SINGLE-LETTER OBFUSCATION PATTERNS ===\n")
    f.write(f"These are classes with single-letter/digit short names (potential obfuscation):\n\n")
    
    single_v1_shell = {c for c in v1_shell if re.search(r'\.\w$', c)}
    single_v3_shell = {c for c in v3_shell if re.search(r'\.\w$', c)}
    
    f.write(f"V1 single-letter shell classes ({len(single_v1_shell)}):\n")
    for c in sorted(single_v1_shell):
        f.write(f"  {c}\n")
    
    f.write(f"\nV3 single-letter shell classes ({len(single_v3_shell)}):\n")
    for c in sorted(single_v3_shell):
        f.write(f"  {c}\n")
    
    # Determine common single-letter bases
    v1_bases = {c.rsplit('.', 1)[-1] for c in single_v1_shell}
    v3_bases = {c.rsplit('.', 1)[-1] for c in single_v3_shell}
    
    common_bases = v1_bases & v3_bases
    v1_only_bases = v1_bases - v3_bases
    v3_only_bases = v3_bases - v1_bases
    
    f.write(f"\nCommon single-letter names: {sorted(common_bases)}\n")
    f.write(f"V1-only single-letter names: {sorted(v1_only_bases)}\n")
    f.write(f"V3-only single-letter names: {sorted(v3_only_bases)}\n")
    
    # 5. Summary
    f.write(f"\n\n=== SUMMARY ===\n")
    f.write(f"Total v1 classes (TSF+CM+CensivN+Kinfoc+Surp): {len(v1_all)}\n")
    f.write(f"Total v3 runtime classes (same packages + Extend): {len(v3_all)}\n")
    f.write(f"Unchanged com.tsf.shell.*: {len(unchanged_shell)}\n")
    f.write(f"Unchanged com.tsf.*: {len(unchanged_tsf)}\n")
    f.write(f"Unchanged com.cm.*: {len(unchanged_cm)}\n")
    f.write(f"Unchanged com.censivn.* (C3DEngine): {len(unchanged_censivn)}\n")
    f.write(f"V1-only com.tsf.shell.*: {len(v1_only_shell)}\n")
    f.write(f"V3-only com.tsf.shell.* (new/renamed): {len(v3_only_shell)}\n")
    f.write(f"V3-only com.extend.* (new module): {len(v3_only_extend)}\n")

print(f"Deobfuscation map written to {OUT_FILE}")

# Print summary to stdout
print(f"\n=== Quick Stats ===")
print(f"V1 total: {len(v1_all)}")
print(f"V3 total: {len(v3_all)}")
print(f"Unchanged shell: {len(unchanged_shell)}, V1-only shell: {len(v1_only_shell)}, V3-only shell: {len(v3_only_shell)}")
print(f"Unchanged tsf: {len(unchanged_tsf)}, V1-only tsf: {len(v1_only_tsf)}, V3-only tsf: {len(v3_only_tsf)}")
print(f"Unchanged cm: {len(unchanged_cm)}, V1-only cm: {len(v1_only_cm)}, V3-only cm: {len(v3_only_cm)}")
print(f"Extend (v3-only): {len(v3_only_extend)}")
