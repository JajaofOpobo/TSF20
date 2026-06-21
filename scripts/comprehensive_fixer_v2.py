#!/usr/bin/env python3
"""Comprehensive fixer for remaining deobfuscation compilation errors.

Strategy:
1. Parse javac output to identify every error (file:line + symbol)
2. For each error, determine the old single-letter name and map to new name via ledger
3. Fix same-package refs (safe patterns: X.ident, extends X, new X(), @X)
4. Fix cross-package refs (add import + replace reference)
5. Fix JADX field-collision artifacts (rename duplicate fields)

Usage: python3 scripts/comprehensive_fixer_v2.py
"""
import os, re, subprocess, sys, json
from collections import defaultdict

BASE_SRC = os.path.join(os.path.dirname(os.path.dirname(os.path.abspath(__file__))), 'sources/sources')
LEDGER = os.path.join(os.path.dirname(os.path.dirname(os.path.abspath(__file__))), 'docs/deobfuscation_rename_ledger_complete.tsv')
PROJECT_DIR = os.path.dirname(os.path.dirname(os.path.abspath(__file__)))

NO_FIX_PACKAGES = {'com.censivn.C3DEngine'}  # C3DEngine is fully fixed

def build_type_map():
    """Build (pkg_dir, old_name) -> (new_name, new_pkg_dir) mapping from ledger."""
    pkg_map = {}
    with open(LEDGER) as f:
        for line in f:
            line = line.strip()
            if not line or line.startswith('#'):
                continue
            parts = line.split('\t')
            if len(parts) != 2:
                continue
            old_path, new_path = parts
            old_name = old_path.rsplit('/', 1)[-1].replace('.java', '')
            new_name = new_path.rsplit('/', 1)[-1].replace('.java', '')
            if not old_name or not new_name or old_name == new_name:
                continue
            if old_path.startswith(BASE_SRC):
                rel = old_path[len(BASE_SRC)+1:]
            else:
                rel = old_path
            pkg_dir = rel.rsplit('/', 1)[0] if '/' in rel else ''
            # Store uppercase/lowercase variants
            pkg_map[(pkg_dir, old_name)] = (new_name, pkg_dir)
            if old_name.islower():
                pkg_map[(pkg_dir, old_name.upper())] = (new_name, pkg_dir)
            if old_name.isupper() and len(old_name) == 1:
                pkg_map[(pkg_dir, old_name.lower())] = (new_name, pkg_dir)
    return pkg_map


def get_errors():
    """Run gradle build and parse all errors."""
    print("  Running gradle compile...", flush=True)
    result = subprocess.run(
        ['./gradlew', ':app:compileDebugJavaWithJavac'],
        capture_output=True, text=True, timeout=600,
        cwd=PROJECT_DIR
    )
    output = (result.stdout or '') + (result.stderr or '')
    
    errors = []  # (rel_path, lineno, message, extra_info)
    for line in output.split('\n'):
        m = re.match(r'^(/[^:]+\.java):(\d+): error: (.+)$', line.strip())
        if m:
            fpath, lineno, msg = m.groups()
            rel_path = os.path.relpath(fpath, BASE_SRC)
            errors.append((rel_path, int(lineno), msg.strip(), line.strip()))
    
    return errors, output


def classify_errors(errors):
    """Classify errors into categories."""
    categories = defaultdict(list)
    for rel_path, lineno, msg, raw in errors:
        if 'package ' in msg and ' does not exist' in msg:
            pkg_name = re.search(r"package (\w+) does not exist", msg)
            categories['package'].append((rel_path, lineno, pkg_name.group(1) if pkg_name else '?'))
        elif 'cannot find symbol' in msg:
            categories['symbol'].append((rel_path, lineno, msg, raw))
        elif 'variable ' in msg and ' already defined' in msg:
            var_name = re.search(r"variable (\w+) is already defined", msg)
            categories['vardef'].append((rel_path, lineno, var_name.group(1) if var_name else '?'))
        elif 'method ' in msg and ' already defined' in msg:
            categories['methoddef'].append((rel_path, lineno, msg))
        else:
            categories['other'].append((rel_path, lineno, msg))
    return categories


def get_full_error_context(errors, output):
    """Extract full error context including symbol info from raw output."""
    # javac output with -Xdiags:verbose gives symbol info on subsequent lines
    context = {}
    lines = output.split('\n')
    for i, line in enumerate(lines):
        m = re.match(r'^(/[^:]+\.java):(\d+): error: (.+)$', line.strip())
        if m:
            fpath, lineno, msg = m.groups()
            rel_path = os.path.relpath(fpath, BASE_SRC)
            # Look ahead for symbol/location info
            symbol_info = ''
            for j in range(i+1, min(i+5, len(lines))):
                next_line = lines[j].strip()
                if next_line.startswith('symbol:') or next_line.startswith('location:'):
                    symbol_info += next_line + ' '
                elif next_line.startswith('  '):
                    pass  # continue looking
                else:
                    break
            context[(rel_path, int(lineno))] = (msg, symbol_info.strip())
    return context


def read_file(rel_path):
    """Read a source file."""
    fpath = os.path.join(BASE_SRC, rel_path)
    with open(fpath) as f:
        return f.read()


def write_file(rel_path, content):
    """Write a source file."""
    fpath = os.path.join(BASE_SRC, rel_path)
    with open(fpath, 'w') as f:
        f.write(content)


def get_pkg_dir(rel_path):
    """Get the package directory for a file."""
    return rel_path.rsplit('/', 1)[0] if '/' in rel_path else ''


def get_full_package(rel_path):
    """Read the package from a Java file."""
    content = read_file(rel_path)
    m = re.search(r'^package\s+([\w.]+);', content, re.MULTILINE)
    return m.group(1) if m else ''


def fix_same_package_type_refs(rel_path, old_name, new_name):
    """Fix same-package type references using safe patterns.
    Returns True if changes were made.
    """
    content = read_file(rel_path)
    lines = content.split('\n')
    new_lines = []
    changed = False
    
    # Patterns for type references (SAFE only):
    # 1. old_name.Identifier  (qualified inner type)
    # 2. extends/implements/super old_name
    # 3. new old_name(
    # 4. @old_name
    # 5. (old_name)  — cast
    # 6. old_name<  — generic type
    
    pat_qualified = re.compile(r'(?<![a-zA-Z_$.])(' + re.escape(old_name) + r')\.([A-Za-z_]\w*)')
    pat_extends = re.compile(r'(extends|implements|super)\s+(' + re.escape(old_name) + r')\b(?!\s*[.(])')
    pat_new = re.compile(r'new\s+(' + re.escape(old_name) + r')\s*\(')
    pat_annotation = re.compile(r'@(' + re.escape(old_name) + r')\b')
    pat_cast = re.compile(r'\(\s*(' + re.escape(old_name) + r')\s*\)')
    pat_generic = re.compile(r'(?<=[<,\s])(' + re.escape(old_name) + r')(?=[>\s,])')
    pat_declaration = re.compile(
        r'(?:(?:public|private|protected|static|final|abstract|synchronized|volatile|transient)\s+)*'
        r'(' + re.escape(old_name) + r')\s+(?=[A-Za-z_]\w*\s*[;=,])'
    )
    
    for line in lines:
        stripped = line.strip()
        if (stripped.startswith('package ') or stripped.startswith('import ') or
            stripped.startswith('//') or stripped.startswith('/*') or stripped.startswith('*') or
            stripped.startswith('@')):
            new_lines.append(line)
            continue
        
        modified = line
        
        # Pattern 1: qualified inner type
        modified = pat_qualified.sub(new_name + r'.\1', modified)
        
        # Pattern 2: extends/implements/super
        modified = pat_extends.sub(r'\1 ' + new_name, modified)
        
        # Pattern 3: new oldName(
        modified = pat_new.sub('new ' + new_name + '(', modified)
        
        # Pattern 4: @oldName
        modified = pat_annotation.sub('@' + new_name, modified)
        
        # Pattern 5: (oldName) cast
        modified = pat_cast.sub('(' + new_name + ')', modified)
        
        # Pattern 6: <oldName> generic
        modified = pat_generic.sub(new_name, modified)
        
        if modified != line:
            changed = True
        new_lines.append(modified)
    
    if changed:
        write_file(rel_path, '\n'.join(new_lines))
    return changed


def fix_cross_package_ref(rel_path, old_name, new_full_pkg, new_name):
    """Fix a cross-package type reference: add import + replace reference.
    Returns True if changes were made.
    """
    content = read_file(rel_path)
    
    # Add import if not present
    import_stmt = f'import {new_full_pkg}.{new_name};'
    if import_stmt in content:
        return False  # import already exists
    
    # Add import after package line or last existing import
    lines = content.split('\n')
    new_lines = []
    import_added = False
    last_import_line = -1
    
    for i, line in enumerate(lines):
        if line.strip().startswith('import ') and ';' in line:
            last_import_line = i
        new_lines.append(line)
    
    # Insert import after package or last import
    insert_pos = 0
    for i, line in enumerate(lines):
        if line.strip().startswith('package ') and ';' in line:
            insert_pos = i + 1
            break
    if last_import_line >= 0:
        insert_pos = last_import_line + 1
    
    new_lines.insert(insert_pos, import_stmt)
    content = '\n'.join(new_lines)
    
    # Replace old_name. with new_name. (qualified type reference)
    content = re.sub(r'(?<![a-zA-Z_$.])' + re.escape(old_name) + r'\.(?=[A-Za-z_])', new_name + '.', content)
    
    write_file(rel_path, content)
    return True


def fix_variable_redefinition(rel_path, var_name, lineno):
    """Fix a variable redefinition by renaming the duplicate field.
    Returns True if changes were made.
    """
    content = read_file(rel_path)
    lines = content.split('\n')
    
    if lineno <= 0 or lineno > len(lines):
        return False
    
    # Find the problematic line
    target_line = lines[lineno - 1]
    
    # The error is "variable X is already defined" - we need to find another declaration
    # of the same variable name. Let's find all field declarations with this name.
    
    # Find all field declarations
    field_pattern = re.compile(
        r'((?:public|private|protected|static|final|transient|volatile)\s+)+(\w[\w.]*)\s+(\w+)\s*(?:=.*)?;'
    )
    
    # Find all fields named var_name
    var_fields = []
    for i, line in enumerate(lines):
        m = field_pattern.search(line)
        if m and m.group(3) == var_name:
            var_fields.append((i + 1, m.group(2), line.strip()))
    
    if len(var_fields) < 2:
        return False
    
    # Rename the SECOND occurrence to avoid the duplicate
    # Use a descriptive name based on the type
    _, ftype, _ = var_fields[1]
    
    new_name = var_name + 'Field'
    if ftype and len(ftype) > 1:
        # Use type name as hint
        short_type = ftype.split('.')[-1]
        new_name = short_type[0].lower() + short_type[1:] if len(short_type) > 1 else var_name + '2'
        # Make sure it doesn't conflict
        if new_name == var_name:
            new_name = var_name + 'Value'
    
    # Also update all references to this field within the class
    # (any usage of just var_name or this.var_name)
    # This is complex - for now just rename the field
    old_field_line = lines[var_fields[1][0] - 1]
    new_field_line = old_field_line.replace(
        f' {var_name};',
        f' {new_name};'
    ).replace(
        f' {var_name} =',
        f' {new_name} ='
    )
    
    if new_field_line == old_field_line:
        # Try more specific replacement
        new_field_line = re.sub(
            r'\b' + re.escape(var_name) + r'\b(?!\s*\()',
            new_name,
            old_field_line, count=1
        )
    
    if new_field_line != old_field_line:
        lines[var_fields[1][0] - 1] = new_field_line
        write_file(rel_path, '\n'.join(lines))
        print(f"      Renamed field '{var_name}' -> '{new_name}' at line {var_fields[1][0]}")
        return True
    
    return False


def main():
    print("=== Comprehensive Fixer v2 ===")
    
    # Step 1: Build type mapping
    print("\n[1] Building type map from ledger...")
    pkg_map = build_type_map()
    print(f"    Loaded {len(pkg_map)} type mappings")
    
    # Step 2: Get current errors
    print("\n[2] Getting compilation errors...")
    errors, output = get_errors()
    categories = classify_errors(errors)
    print(f"    Total errors: {len(errors)}")
    print(f"    Package errors: {len(categories['package'])}")
    print(f"    Symbol errors: {len(categories['symbol'])}")
    print(f"    Variable def errors: {len(categories['vardef'])}")
    
    # Step 3: Get error context
    error_context = get_full_error_context(errors, output)
    
    # Step 4: Fix same-package type references
    print("\n[3] Fixing same-package type references...")
    same_pkg_fixes = 0
    for rel_path, lineno, pkg_name in categories['package']:
        pkg_dir = get_pkg_dir(rel_path)
        # Get the actual line to see the pattern
        content = read_file(rel_path)
        lines = content.split('\n')
        if lineno > len(lines):
            continue
        line = lines[lineno - 1]
        
        # The package error "package X does not exist" is actually a type reference
        # like "X.Identifier". Find what X maps to in this file's context.
        
        # First check: is X in the same package?
        mapping = pkg_map.get((pkg_dir, pkg_name))
        
        if mapping:
            new_name, new_pkg = mapping
            if new_pkg == pkg_dir:
                # Same-package type
                if fix_same_package_type_refs(rel_path, pkg_name, new_name):
                    same_pkg_fixes += 1
                    print(f"    Same-pkg: {rel_path}:{lineno} {pkg_name} -> {new_name}")
                continue
        
        # Cross-package: try to find the type
        # Search ledger for this old_name anywhere
        for (_, old_n), (new_n, new_p) in pkg_map.items():
            if old_n == pkg_name:
                # Found! Get the full package
                full_new_pkg = new_p.replace('/', '.')
                if fix_cross_package_ref(rel_path, pkg_name, full_new_pkg, new_n):
                    same_pkg_fixes += 1
                    print(f"    Cross-pkg: {rel_path}:{lineno} {pkg_name} -> {full_new_pkg}.{new_n}")
                break
    
    print(f"    Fixed {same_pkg_fixes} package errors")
    
    # Step 5: Fix cannot-find-symbol errors
    print("\n[4] Fixing cannot-find-symbol errors...")
    symbol_fixes = 0
    for rel_path, lineno, msg, raw in categories['symbol']:
        # Get error context to determine the symbol
        context = error_context.get((rel_path, lineno), ('', ''))
        msg_full, symbol_info = context
        
        # The error has the actual problematic line in the output
        # Parse the raw error to understand what symbol is missing
        # javac often shows: "symbol: class X" on the next line
        symbol_match = re.search(r'symbol:\s*(?:class|variable|method)\s+(\w+)', symbol_info + ' ' + raw)
        if not symbol_match:
            continue
        
        missing_sym = symbol_match.group(1)
        pkg_dir = get_pkg_dir(rel_path)
        
        # Check if this is a same-package type
        mapping = pkg_map.get((pkg_dir, missing_sym))
        if mapping:
            new_name, new_pkg = mapping
            if fix_same_package_type_refs(rel_path, missing_sym, new_name):
                symbol_fixes += 1
                print(f"    {rel_path}:{lineno} {missing_sym} -> {new_name}")
            continue
        
        # Try to find in any package
        for (_, old_n), (new_n, new_p) in pkg_map.items():
            if old_n == missing_sym:
                full_new_pkg = new_p.replace('/', '.')
                if fix_cross_package_ref(rel_path, missing_sym, full_new_pkg, new_n):
                    symbol_fixes += 1
                    print(f"    {rel_path}:{lineno} {missing_sym} -> {full_new_pkg}.{new_n}")
                break
    
    print(f"    Fixed {symbol_fixes} symbol errors")
    
    # Step 6: Fix variable redefinition errors
    print("\n[5] Fixing variable redefinition errors...")
    var_fixes = 0
    for rel_path, lineno, var_name in categories['vardef']:
        if fix_variable_redefinition(rel_path, var_name, lineno):
            var_fixes += 1
            print(f"    Fixed variable '{var_name}' in {rel_path}")
    print(f"    Fixed {var_fixes} variable redefinition errors")
    
    # Step 7: Verify
    print("\n[6] Rebuilding to verify...")
    final_errors, final_output = get_errors()
    final_categories = classify_errors(final_errors)
    
    print(f"\n=== Results ===")
    print(f"  Before: {len(errors)} errors")
    print(f"  After:  {len(final_errors)} errors")
    print(f"  Net change: {len(final_errors) - len(errors)}")
    print(f"\n  Remaining by category:")
    for cat, items in sorted(final_categories.items()):
        print(f"    {cat}: {len(items)}")
    
    return 0 if len(final_errors) <= len(errors) else 1


if __name__ == '__main__':
    sys.exit(main())
