"""
###############################################################################
# OBSOLETE — Superseded by fix_round2.py
# Created: Jaja 2026-05-26 | Cataloged: opencode 2026-06-02
# See fix_scripts_CATALOG.md for hierarchy
###############################################################################
Fix remaining errors after constructor fixer:
1. Inner-type references (n.c → n.C) — lowercase inner type after dot
2. Ambiguous imports — remove redundant same-package imports
3. Package imports — fix corrupted package references
4. Interface expected — create stub when referenced as interface
"""
import os, re, subprocess, sys

SOURCES = '/home/ubuntu/Documents/TSF20/sources/sources'

# Read build errors
result = subprocess.run(
    ['grep', 'error:', 'docs/build-output-round2.txt'],
    capture_output=True, text=True
)
error_lines = result.stdout.strip().split('\n')

# Collect all errors by type
cannot_find = []  # (fpath, lineno, symbol, context)
ambiguous = []    # (fpath, lineno, symbol, types)
pkg_errors = []   # (fpath, lineno, pkg_name)

for line in error_lines:
    if '/sources/sources/' not in line:
        continue
    parts = line.split('/sources/sources/')[1].split(':')
    if len(parts) < 2:
        continue
    try:
        lineno = int(parts[1])
    except ValueError:
        continue
    relpath = parts[0]
    fpath = os.path.join(SOURCES, relpath)
    
    if 'cannot find symbol' in line:
        cannot_find.append((fpath, lineno, relpath))
    elif 'reference to' in line and 'is ambiguous' in line:
        m = re.search(r'reference to (\w+) is ambiguous', line)
        if m:
            ambiguous.append((fpath, lineno, m.group(1), relpath))
    elif 'package' in line and 'does not exist' in line:
        m = re.search(r'package (\S+) does not exist', line)
        if m:
            pkg_errors.append((fpath, lineno, m.group(1), relpath))

# ============================================================
# FIX 1: Inner type references
# For lines like `n.c b;` (where c is an inner type renamed to C)
# Extract the symbol after dot and capitalize it
# ============================================================
def fix_inner_type_refs():
    """Fix lowercase inner type names referenced after a dot."""
    fixed_files = set()
    for fpath, lineno, relpath in cannot_find:
        with open(fpath, 'r') as f:
            lines = f.readlines()
        original = list(lines)
        
        idx = lineno - 1
        line = lines[idx]
        
        # Look for patterns: TypeName.lowercaseSingleLetter
        m = re.search(r'(?<![.\w])(\w+)\.([a-z])(?![.\w(])', line)
        if m:
            prefix = m.group(1)
            old_inner = m.group(2)
            new_inner = old_inner.upper()
            
            if old_inner != new_inner:
                new_line = line[:m.start(2)] + new_inner + line[m.end(2):]
                lines[idx] = new_line
                print(f'INNER: {relpath}:{lineno}: {prefix}.{old_inner} -> {prefix}.{new_inner}')
        
        if lines != original:
            with open(fpath, 'w') as f:
                f.writelines(lines)
            fixed_files.add(relpath)
    
    print(f'Fixed {len(fixed_files)} files for inner-type refs')
    return fixed_files

# ============================================================
# FIX 2: Ambiguous references
# Remove redundant same-package imports that shadow the local type
# ============================================================
def fix_ambiguous():
    fixed_files = set()
    for fpath, lineno, symbol, relpath in ambiguous:
        with open(fpath, 'r') as f:
            content = f.read()
        original = content
        
        # Get the package of this file
        pkg_m = re.search(r'^package\s+([\w.]+);', content, re.MULTILINE)
        if not pkg_m:
            continue
        cur_pkg = pkg_m.group(1)
        
        # Remove redundant same-package import for this symbol
        # e.g., if cur_pkg is com.tsf.shell.f.f.a and import is com.tsf.shell.f.f.a.A
        redundant_import = f'import {cur_pkg}.{symbol};'
        if redundant_import in content:
            content = content.replace(redundant_import, f'// {redundant_import}')
            print(f'AMBIG: {relpath}:{lineno}: removed redundant import {cur_pkg}.{symbol}')
        
        if content != original:
            with open(fpath, 'w') as f:
                f.write(content)
            fixed_files.add(relpath)
    
    print(f'Fixed {len(fixed_files)} files for ambiguous refs')
    return fixed_files

# ============================================================
# FIX 3: Package does not exist
# Fix corrupted import lines where package name got wrong-cased
# ============================================================
def fix_package_errors():
    fixed_files = set()
    for fpath, lineno, pkg_name, relpath in pkg_errors:
        with open(fpath, 'r') as f:
            lines = f.readlines()
        original = list(lines)
        
        idx = lineno - 1
        # Read lines around the error to find the import
        # The package error usually references the first invalid token
        # We need to find: import com.tsf.shell.b.Something (where b should be B)
        for i in range(max(0, idx - 3), min(len(lines), idx + 3)):
            line = lines[i]
            if 'import ' + pkg_name in line or pkg_name in line:
                # Check if the package name is a renamed type prefix
                # e.g., if b is renamed to B, fix the path
                old_parts = pkg_name.split('.')
                new_parts = []
                for part in old_parts:
                    if len(part) == 1 and part.islower():
                        new_parts.append(part.upper())
                    else:
                        new_parts.append(part)
                new_pkg = '.'.join(new_parts)
                if new_pkg != pkg_name:
                    lines[i] = line.replace(pkg_name, new_pkg)
                    print(f'PKG: {relpath}:{lineno}: {pkg_name} -> {new_pkg}')
                    break
        
        if lines != original:
            with open(fpath, 'w') as f:
                f.writelines(lines)
            fixed_files.add(relpath)
    
    print(f'Fixed {len(fixed_files)} files for package errors')
    return fixed_files

fix_inner_type_refs()
fix_ambiguous()
fix_package_errors()
