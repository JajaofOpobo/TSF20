#!/usr/bin/env python3
"""Fix all remaining 'cannot find symbol' errors."""
import os, re, subprocess, sys
from collections import defaultdict

BASE_SRC = os.path.join(os.path.dirname(os.path.dirname(os.path.abspath(__file__))), 'sources/sources')
LEDGER = os.path.join(os.path.dirname(os.path.dirname(os.path.abspath(__file__))), 'docs/deobfuscation_rename_ledger_complete.tsv')
PROJECT_DIR = os.path.dirname(os.path.dirname(os.path.abspath(__file__)))

print("=== Fix All Symbol Errors ===")

pkg_map = {}
old_candidates = defaultdict(list)
with open(LEDGER) as f:
    for line in f:
        line = line.strip()
        if not line or line.startswith('#') or '\t' not in line: continue
        left, right = line.split('\t', 1)
        old_pkg_dir = new_pkg_dir = old_name = new_name = None
        
        if right.startswith('(ctor '):
            m = re.match(r'\(ctor\s+(\w+)→(\w+)\)', right)
            if m:
                old_name, new_name = m.group(1), m.group(2)
                fp = left
                if fp.startswith('sources/sources/'):
                    fp = fp[len('sources/sources/'):]
                old_pkg_dir = new_pkg_dir = fp.rsplit('/', 1)[0] if '/' in fp else ''
        elif left.endswith('.java') and right.endswith('.java'):
            old_name = left.rsplit('/', 1)[-1].replace('.java', '')
            new_name = right.rsplit('/', 1)[-1].replace('.java', '')
            if new_name == old_name: continue
            fp_left = left
            fp_right = right
            if fp_left.startswith('sources/sources/'):
                fp_left = fp_left[len('sources/sources/'):]
            if fp_right.startswith('sources/sources/'):
                fp_right = fp_right[len('sources/sources/'):]
            old_pkg_dir = fp_left.rsplit('/', 1)[0] if '/' in fp_left else ''
            new_pkg_dir = fp_right.rsplit('/', 1)[0] if '/' in fp_right else ''
        
        if old_name and new_name and old_pkg_dir and len(old_name) == 1 and old_name.isalpha():
            pkg_map[(old_pkg_dir, old_name)] = new_name
            old_candidates[old_name].append((old_pkg_dir, new_pkg_dir, new_name))

print(f"[1] Loaded {len(pkg_map)} mappings")

result = subprocess.run(['./gradlew', ':app:compileDebugJavaWithJavac'],
    capture_output=True, text=True, timeout=600, cwd=PROJECT_DIR)
output = (result.stdout or '') + (result.stderr or '')

error_files = set()
for line in output.split('\n'):
    m = re.match(r'^(/[^:]+\.java):\d+: error: cannot find symbol$', line.strip())
    if m:
        error_files.add(os.path.relpath(m.group(1), BASE_SRC))

print(f"[2] {len(error_files)} files with 'cannot find symbol' errors")

SAFE_PATTERNS = [
    (r'(extends|implements|super)\s+{c}\b(\.\w+)?', lambda m, n: m.group(1) + ' ' + n + (m.group(2) or '')),
    (r',\s*{c}\b(\.\w+)?', lambda m, n: ', ' + n + (m.group(1) or '')),
    (r'new\s+{c}\s*\(', lambda m, n: 'new ' + n + '('),
    (r'<\s*{c}\s*(?=[,>])', lambda m, n: '<' + n),
    (r'@{c}\b', lambda m, n: '@' + n),
    (r'\(\s*{c}\s*\)(?=\s+\w)', lambda m, n: '(' + n + ')'),
    # Static method call on single-letter type: Type.method(
    (r'\b{c}(\.\w+\s*\()', lambda m, n: n + m.group(1)),
    # Field type (with possible .InnerClass suffix)
    (r'(private|public|protected)\s+(static\s+)?(final\s+)?(transient\s+)?\b{c}\b(\.\w+)?(?=\s+\w+\s*(?:[=;]|$))',
     lambda m, n: m.group(1) + ' ' + (m.group(2) or '') + (m.group(3) or '') + (m.group(4) or '') + n + (m.group(5) or '')),
    # Parameter type (with possible .InnerClass suffix)
    (r'\(\s*(final\s+)?\b{c}\b(\.\w+)?(?=\s+\w+\s*(?:[,)]))',
     lambda m, n: '(' + (m.group(1) or '') + n + (m.group(2) or '')),
    # Return type (with possible .InnerClass suffix)
    (r'(private|public|protected)\s+(static\s+)?\b{c}\b(\.\w+)?(?=\s+\w+\s*\()',
     lambda m, n: m.group(1) + ' ' + (m.group(2) or '') + n + (m.group(3) or '')),
    # Import type (last segment is a single letter)
    (r'^(import\s+(?:static\s+)?[\w.]*\.){c}(?=\s*;)',
     lambda m, n: m.group(1) + n + ';'),
]

modified = replaced = 0

for rel_path in sorted(error_files):
    if rel_path == 'com/tsf/shell/f/f/a/d/DrawerSortManager.java':
        print("  DEBUG: Processing DrawerSortManager")
    full_path = os.path.join(BASE_SRC, rel_path)
    pkg_dir = rel_path.rsplit('/', 1)[0] if '/' in rel_path else ''
    
    with open(full_path) as f:
        content = f.read()
    
    # Get imported types: (full_import_path, simple_name, package_path)
    imports = []
    for m in re.finditer(r'^import\s+([\w.]+);', content, re.MULTILINE):
        imp = m.group(1)
        if not imp.endswith('.*'):
            simple = imp.rsplit('.', 1)[-1]
            pkg_path = imp.rsplit('.', 1)[0].replace('.', '/') if '.' in imp else ''
            imports.append((imp, simple, pkg_path))
    
    # Find single-letter type references in the file (to minimize scanning)
    text = content
    used_chars = set()
    for m in re.finditer(
        r'(?:extends|implements|super)\s+([a-zA-Z])\b'
        r'|new\s+([a-zA-Z])\s*\('
        r'|<\s*([a-zA-Z])\s*(?:[,>])'
        r'|@([a-zA-Z])\b'
        r'|\(\s*([a-zA-Z])\s*\)(?=\s+\w)'
        r'|,\s*([a-zA-Z])\s*(?:\.\w+)?(?=\s*(?:,|{|$))',
        text
    ):
        for c in m.groups():
            if c is not None:
                used_chars.add(c)
    
    # Also find type references in field/return type/parameter patterns
    for m in re.finditer(
        r'(?:^|\s)(private|public|protected)\s+(static\s+)?(final\s+)?(transient\s+)?'
        r'([a-zA-Z])(?:\.\w+)?\s+\w+\s*(?:[=;]|$)',
        text, re.MULTILINE
    ):
        if m.group(5):
            used_chars.add(m.group(5))
    
    for m in re.finditer(
        r'\(\s*(final\s+)?([a-zA-Z])(?:\.\w+)?\s+\w+\s*(?:[,)])',
        text
    ):
        if m.group(2):
            used_chars.add(m.group(2))
    
    for m in re.finditer(
        r'(?:^|\s)(public|private|protected)\s+(static\s+)?([a-zA-Z])(?:\.\w+)?\s+\w+\s*\(',
        text, re.MULTILINE
    ):
        if m.group(3):
            used_chars.add(m.group(3))
    
    # Find import statements referencing single-letter types
    for m in re.finditer(r'^import\s+(?:static\s+)?[\w.]*\.([a-zA-Z])(?=\s*;)', text, re.MULTILINE):
        if m.group(1):
            used_chars.add(m.group(1))
    
    # Find static method calls on single-letter types: Type.method(
    for m in re.finditer(r'\b(?!(?:this|super)\b)([a-zA-Z])\.\w+\s*\(', text):
        if m.group(1):
            used_chars.add(m.group(1))
    
    # Remove any None values
    used_chars.discard(None)
    
    changed = False
    applied = []
    
    for old_char in sorted(used_chars, key=lambda x: -ord(x)):
        new_name = None
        
        # 1. Try cross-package via import matching FIRST (prefer over same-package)
        candidates = old_candidates.get(old_char, [])
        matched = []
        for old_pkg, new_pkg, cand_new in candidates:
            for imp_full, imp_simple, imp_pkg in imports:
                if cand_new == imp_simple and new_pkg == imp_pkg:
                    matched.append((new_pkg, cand_new))
        
        if len(matched) == 1:
            new_name = matched[0][1]
        elif len(matched) > 1:
            # Pick one matching current package prefix
            for p, n in matched:
                p_base = '/'.join(pkg_dir.split('/')[:3]) if '/' in pkg_dir else ''
                if p.startswith(p_base):
                    new_name = n
                    break
            if not new_name:
                new_name = matched[0][1]
        
        # 2. Try same-package (only if no import match)
        if not new_name:
            new_name = pkg_map.get((pkg_dir, old_char))
        
        # 3. If still not found, check if any candidate has import already but pkg mismatch
        #    (e.g., fully-qualified usage like a.b.TypeName)
        if not new_name:
            candidates = old_candidates.get(old_char, [])
            for old_pkg2, new_pkg2, cand_new in candidates:
                if old_pkg2.startswith(pkg_dir + '/') or pkg_dir.startswith(old_pkg2 + '/'):
                    cand_fqn = new_pkg2.replace('/', '.') + '.' + cand_new
                    if cand_new in content or cand_fqn in content:
                        new_name = cand_new
                        import_stmt = f'import {cand_fqn};'
                        if import_stmt not in content:
                            lines = content.split('\n')
                            last_import = 0
                            for i, li in enumerate(lines):
                                if li.strip().startswith('import ') and ';' in li.strip():
                                    last_import = i
                            if last_import > 0:
                                lines.insert(last_import + 1, import_stmt)
                                content = '\n'.join(lines)
                            elif lines[0].strip().startswith('package '):
                                lines.insert(1, '')
                                lines.insert(2, import_stmt)
                                content = '\n'.join(lines)
                        print(f"  ++ added import {import_stmt} for {old_char}->{new_name}")
                        break
        
        if not new_name or new_name == old_char:
            continue
        
        # Apply safe replacements
        new_content = content
        for pattern_tmpl, repl_fn in SAFE_PATTERNS:
            pattern = pattern_tmpl.format(c=re.escape(old_char))
            new_content = re.sub(pattern, lambda m, n=new_name: repl_fn(m, n), new_content)
        
        if new_content != content:
            applied.append(f'{old_char}->{new_name}')
            content = new_content
            changed = True
    
    if changed:
        modified += 1
        replaced += len(applied)
        with open(full_path, 'w') as f:
            f.write(content)
        print(f"  {rel_path}: {', '.join(applied)}")

print(f"\n[3] Modified {modified} files ({replaced} replacements)")

# Verify
result = subprocess.run(['./gradlew', ':app:compileDebugJavaWithJavac'],
    capture_output=True, text=True, timeout=600, cwd=PROJECT_DIR)
output = (result.stdout or '') + (result.stderr or '')
total = sum(1 for l in output.split('\n') if ' error:' in l)
pkg_ct = sum(1 for l in output.split('\n') if 'error: package' in l)
sym_ct = sum(1 for l in output.split('\n') if 'error: cannot find symbol' in l)
var_ct = sum(1 for l in output.split('\n') if 'already defined' in l)
print(f"\n=== Results ===")
print(f"  Package: {pkg_ct}, Symbol: {sym_ct}, VarDef: {var_ct}, Total: {total}")
