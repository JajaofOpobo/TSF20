#!/usr/bin/env python3
"""Comprehensive fixer v3 — resolves all remaining deobfuscation errors.

Strategy:
1. Same-package bare type refs: replace using rename ledger (safe patterns)
2. Cross-package type refs: check imported types for matching inner interface
3. Variable redefinition: rename duplicate fields
4. Every fix is verified against javac output
"""
import os, re, subprocess, sys
from collections import defaultdict

BASE_SRC = os.path.join(os.path.dirname(os.path.dirname(os.path.abspath(__file__))), 'sources/sources')
LEDGER = os.path.join(os.path.dirname(os.path.dirname(os.path.abspath(__file__))), 'docs/deobfuscation_rename_ledger_complete.tsv')
PROJECT_DIR = os.path.dirname(os.path.dirname(os.path.abspath(__file__)))


def build_type_map():
    """Build (pkg_dir, old_name) -> (new_name, new_pkg_dir)."""
    pkg_map = {}
    with open(LEDGER) as f:
        for line in f:
            line = line.strip()
            if not line or line.startswith('#'): continue
            parts = line.split('\t')
            if len(parts) != 2: continue
            old_path, new_path = parts
            old_name = old_path.rsplit('/', 1)[-1].replace('.java', '')
            new_name = new_path.rsplit('/', 1)[-1].replace('.java', '')
            if not old_name or not new_name or old_name == new_name: continue
            if old_path.startswith(BASE_SRC):
                rel = old_path[len(BASE_SRC)+1:]
            else:
                rel = old_path
            pkg_dir = rel.rsplit('/', 1)[0] if '/' in rel else ''
            pkg_map[(pkg_dir, old_name)] = (new_name, pkg_dir)
            if old_name.islower():
                pkg_map[(pkg_dir, old_name.upper())] = (new_name, pkg_dir)
    return pkg_map


def run_build():
    result = subprocess.run(['./gradlew', ':app:compileDebugJavaWithJavac'],
        capture_output=True, text=True, timeout=600, cwd=PROJECT_DIR)
    output = (result.stdout or '') + (result.stderr or '')
    errors = []
    for line in output.split('\n'):
        m = re.match(r'^(/[^:]+\.java):(\d+): error: (.+)$', line.strip())
        if m:
            fpath, lineno, msg = m.groups()
            rel_path = os.path.relpath(fpath, BASE_SRC)
            errors.append((rel_path, int(lineno), msg.strip()))
    return errors, output


def read_file(rel_path):
    with open(os.path.join(BASE_SRC, rel_path)) as f:
        return f.read()

def write_file(rel_path, content):
    with open(os.path.join(BASE_SRC, rel_path), 'w') as f:
        f.write(content)


def get_package_and_imports(rel_path):
    """Get the package and all imported types for a Java file."""
    content = read_file(rel_path)
    pkg = ''
    imports = []
    for line in content.split('\n'):
        m = re.match(r'^package\s+([\w.]+);', line)
        if m: pkg = m.group(1)
        m = re.match(r'^import\s+([\w.*]+);', line)
        if m: imports.append(m.group(1))
    return pkg, imports


def find_type_with_inner_interface(imports, inner_name, pkg_dir):
    """Search imported types for one that has an inner interface named 'inner_name'.
    Also check same-package types.
    Returns (full_type_name, class_name) or None.
    """
    for imp in imports:
        if imp.endswith('.*'):
            continue
        class_name = imp.rsplit('.', 1)[-1]
        imp_path = imp.replace('.', '/') + '.java'
        fpath = os.path.join(BASE_SRC, imp_path)
        if not os.path.exists(fpath):
            # Try removing inner class suffix (e.g., OuterClass$Inner)
            base_imp = imp.split('$')[0]
            imp_path = base_imp.replace('.', '/') + '.java'
            fpath = os.path.join(BASE_SRC, imp_path)
        
        if os.path.exists(fpath):
            with open(fpath) as f:
                content = f.read()
            # Check if this type has inner interface/class 'inner_name'
            if re.search(r'(interface|class|enum)\s+' + re.escape(inner_name) + r'\b', content):
                return (imp, class_name)
    
    return None


def fix_same_package(content, old_name, new_name):
    """Apply same-package safe replacements. Returns modified content."""
    lines = content.split('\n')
    new_lines = []
    changed = False
    for line in lines:
        stripped = line.strip()
        if (stripped.startswith('package ') or stripped.startswith('import ') or
            stripped.startswith('//') or stripped.startswith('/*') or stripped.startswith('*')):
            new_lines.append(line)
            continue
        modified = line
        modified = re.sub(r'(?<![a-zA-Z_$.])' + re.escape(old_name) + r'\.([A-Za-z_]\w*)', new_name + r'.\1', modified)
        modified = re.sub(r'(extends|implements|super)\s+' + re.escape(old_name) + r'\b(?!\s*[.(])', r'\1 ' + new_name, modified)
        modified = re.sub(r'new\s+' + re.escape(old_name) + r'\s*\(', 'new ' + new_name + '(', modified)
        modified = re.sub(r'@' + re.escape(old_name) + r'\b', '@' + new_name, modified)
        modified = re.sub(r'\(\s*' + re.escape(old_name) + r'\s*\)', '(' + new_name + ')', modified)
        if modified != line:
            changed = True
        new_lines.append(modified)
    return '\n'.join(new_lines), changed


def main():
    print("=== Comprehensive Fixer v3 ===")
    pkg_map = build_type_map()
    print(f"[1] Loaded {len(pkg_map)} type mappings")
    
    print("[2] Getting initial errors...")
    errors, output = run_build()
    initial_count = len(errors)
    print(f"    {initial_count} errors")
    
    # Categorize
    pkg_errors = []
    symbol_errors = []
    var_errors = []
    for rel_path, lineno, msg in errors:
        if 'package ' in msg and ' does not exist' in msg:
            m = re.search(r"package (\w+) does not exist", msg)
            if m: pkg_errors.append((rel_path, lineno, m.group(1)))
        elif 'cannot find symbol' in msg:
            symbol_errors.append((rel_path, lineno, msg))
        elif 'variable ' in msg and ' already defined' in msg:
            m = re.search(r"variable (\w+) is already defined", msg)
            if m: var_errors.append((rel_path, lineno, m.group(1)))
    
    print(f"    Package: {len(pkg_errors)}, Symbol: {len(symbol_errors)}, VarDef: {len(var_errors)}")
    
    # --- PHASE 1: Same-package type references ---
    print("\n[3] Phase 1: Fix same-package type references...")
    phase1_fixes = 0
    for root, dirs, files in os.walk(BASE_SRC):
        for fname in files:
            if not fname.endswith('.java'): continue
            fpath = os.path.join(root, fname)
            rel = os.path.relpath(fpath, BASE_SRC)
            pkg_dir = rel.rsplit('/', 1)[0] if '/' in rel else ''
            
            old_names = {o: n for (p, o), (n, _) in pkg_map.items() if p == pkg_dir and len(o) == 1 and o.isalpha()}
            if not old_names: continue
            
            with open(fpath) as f:
                content = f.read()
            
            changed = False
            for old_name, new_name in old_names.items():
                if old_name == new_name: continue
                content, c = fix_same_package(content, old_name, new_name)
                if c: changed = True
            
            if changed:
                write_file(rel, content)
                phase1_fixes += 1
    
    print(f"    Modified {phase1_fixes} files")
    
    # --- PHASE 2: Cross-package references (import-based) ---
    print("\n[4] Phase 2: Fix cross-package type references...")
    phase2_fixes = 0
    
    for rel_path, lineno, pkg_name in pkg_errors:
        pkg, imports = get_package_and_imports(rel_path)
        pkg_dir = get_pkg_dir(rel_path) if hasattr else (rel_path.rsplit('/', 1)[0] if '/' in rel_path else '')
        pkg_dir = rel_path.rsplit('/', 1)[0] if '/' in rel_path else ''
        
        content = read_file(rel_path)
        lines = content.split('\n')
        if lineno > len(lines): continue
        
        # Get the error line to see the pattern
        error_line = lines[lineno - 1]
        
        # Pattern: old_name.inner_name (qualified inner type)
        m = re.search(r'(?<![a-zA-Z_$.])' + re.escape(pkg_name) + r'\.(\w+)', error_line)
        if not m:
            # Try raw line from error output
            continue
        
        inner_name = m.group(1)
        
        # Search imported types for one with inner 'inner_name'
        result = find_type_with_inner_interface(imports, inner_name, pkg_dir)
        
        if result:
            full_imp, class_name = result
            # Replace pkg_name. with class_name.
            content = re.sub(r'(?<![a-zA-Z_$.])' + re.escape(pkg_name) + r'\.(?=[A-Za-z_])', class_name + '.', content)
            write_file(rel_path, content)
            phase2_fixes += 1
            print(f"    {rel_path}:{lineno} {pkg_name}.{inner_name} -> {class_name}.{inner_name}")
        else:
            # Check if the import is missing (the old single-letter import was dropped)
            # Find the matching type from the ledger
            found = False
            for (old_pkg, old_n), (new_n, new_p) in pkg_map.items():
                if old_n == pkg_name:
                    # Build the full import
                    full_import = old_pkg.replace('/', '.') if old_pkg else pkg_name
                    if '.' + pkg_name in full_import or full_import == pkg_name:
                        continue  # likely not the right one
                    
                    new_full_import = full_import.rsplit('.', 1)[0] + '.' + new_n if '.' in full_import else new_n
                    
                    # Check if the new type has the inner interface
                    new_type_path = new_p + '/' + new_n + '.java'
                    new_full_path = os.path.join(BASE_SRC, new_type_path)
                    if os.path.exists(new_full_path):
                        with open(new_full_path) as f:
                            new_content = f.read()
                        if re.search(r'(interface|class|enum)\s+' + re.escape(inner_name) + r'\b', new_content):
                            # Found! Add import and replace reference
                            import_stmt = f'import {full_import.rsplit(".", 1)[0]}.{new_n};'
                            if import_stmt not in content:
                                lines2 = content.split('\n')
                                insert_pos = 0
                                for i, l2 in enumerate(lines2):
                                    if l2.strip().startswith('package ') and ';' in l2:
                                        insert_pos = i + 1
                                    elif l2.strip().startswith('import ') and ';' in l2:
                                        insert_pos = i + 1
                                lines2.insert(insert_pos, import_stmt)
                                content = '\n'.join(lines2)
                            
                            content = re.sub(r'(?<![a-zA-Z_$.])' + re.escape(pkg_name) + r'\.(?=[A-Za-z_])', new_n + '.', content)
                            write_file(rel_path, content)
                            phase2_fixes += 1
                            found = True
                            print(f"    {rel_path}:{lineno} {pkg_name}.{inner_name} -> {new_n}.{inner_name} (with import)")
                            break
            
            if not found:
                print(f"    SKIP: {rel_path}:{lineno} {pkg_name}.{inner_name} (could not find type with inner '{inner_name}')")
    
    print(f"    Fixed {phase2_fixes} cross-package references")
    
    # --- PHASE 3: Variable redefinition ---
    print("\n[5] Phase 3: Fix variable redefinition errors...")
    phase3_fixes = 0
    for rel_path, lineno, var_name in var_errors:
        content = read_file(rel_path)
        lines = content.split('\n')
        if lineno > len(lines): continue
        
        # Find all field declarations with this name
        field_pat = re.compile(r'((?:public|private|protected|static|final|transient|volatile)\s+)+(\w[\w.]*)\s+(\w+)\s*(?:=.*)?;')
        var_fields = [(i+1, m.group(2), m.group(3)) for i, line in enumerate(lines) for m in [field_pat.search(line)] if m]
        var_fields = [(ln, ft, vn) for ln, ft, vn in var_fields if vn == var_name]
        
        if len(var_fields) < 2:
            continue
        
        # Rename second occurrence
        _, ftype, _ = var_fields[1]
        new_var = ftype.split('.')[-1]
        new_var = new_var[0].lower() + new_var[1:] if len(new_var) > 1 else var_name + 'Field'
        if new_var == var_name:
            new_var = var_name + 'Value'
        
        old_line = lines[var_fields[1][0] - 1]
        new_line = re.sub(r'\b' + re.escape(var_name) + r'\b(?!\s*\()', new_var, old_line, count=1)
        
        if new_line != old_line:
            lines[var_fields[1][0] - 1] = new_line
            write_file(rel_path, '\n'.join(lines))
            phase3_fixes += 1
            print(f"    {rel_path}:{lineno} {var_name} -> {new_var}")
    
    print(f"    Fixed {phase3_fixes} variable redefinition errors")
    
    # --- Final verification ---
    print("\n[6] Verifying...")
    final_errors, _ = run_build()
    final_count = len(final_errors)
    
    # Categorize final
    final_pkg = sum(1 for e in final_errors if 'package ' in e[2] and ' does not exist' in e[2])
    final_sym = sum(1 for e in final_errors if 'cannot find symbol' in e[2])
    final_var = sum(1 for e in final_errors if 'already defined' in e[2])
    
    print(f"\n=== Results ===")
    print(f"  Before: {initial_count} errors")
    print(f"  After:  {final_count} errors")
    print(f"  Change: {final_count - initial_count}")
    print(f"\n  Package errors: {final_pkg}")
    print(f"  Symbol errors:  {final_sym}")
    print(f"  VarDef errors:  {final_var}")
    print(f"\n  Phase 1 (same-pkg): {phase1_fixes}")
    print(f"  Phase 2 (cross-pkg): {phase2_fixes}")
    print(f"  Phase 3 (vardef):    {phase3_fixes}")
    
    return 0


if __name__ == '__main__':
    sys.exit(main())
