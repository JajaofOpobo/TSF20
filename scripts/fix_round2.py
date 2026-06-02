"""
###############################################################################
# CURRENT — Final version of the round-2 fixer family
# Created: Jaja 2026-05-26 | Cataloged: opencode 2026-06-02
# Replaces: fix_remaining.py
# Key improvements: discovers inner type renames by scanning all files, better
#   load/save helpers, reads docs/build-output-r2.txt.
# See fix_scripts_CATALOG.md for hierarchy
###############################################################################
Round 2: Fix remaining errors after constructor fixer.
Handles:
1. Inner type references (prefix.lowercase → prefix.UPPERCASE)
2. Remove redundant same-package imports to resolve ambiguity
3. Fix corrupted package imports
"""
import os, re, subprocess

SOURCES = '/home/jaja/Documents/TSF20/sources/sources'
BUILD_OUT = 'docs/build-output-r2.txt'

# ---------------------------------------------------------------
# STEP 1: Collect ALL inner type declarations (class/interface/enum)
# that are single lowercase letters. These were likely renamed to
# uppercase by JADX but references may still use lowercase.
# ---------------------------------------------------------------
def find_renamed_inner_types():
    """Return dict: (outerTypeName, innerLowercaseName) -> innerUppercaseName"""
    renamed = {}
    for root, dirs, files in os.walk(SOURCES):
        for fn in files:
            if not fn.endswith('.java'):
                continue
            fpath = os.path.join(root, fn)
            with open(fpath, 'r', encoding='utf-8', errors='replace') as f:
                content = f.read()
            
            # Find inner class/interface/enum declarations
            # Pattern: class/interface/enum preceded by modifiers, at any indent
            for m in re.finditer(
                r'(?m)^(\s*)(?:(?:public|protected|private|static|final|abstract)\s+)*(class|interface|@interface|enum)\s+(\w+)',
                content
            ):
                indent = m.group(1)
                type_kind = m.group(2)
                type_name = m.group(3)
                
                # Single lowercase letter: likely renamed
                if len(type_name) == 1 and type_name.islower():
                    # Check if the JADX comment says it was renamed
                    # or if the class IN the file uses uppercase
                    # For inner types, the file may have multiple classes...
                    upper_name = type_name.upper()
                    # Check if this inner type has a corresponding uppercase reference
                    # by looking at the class content
                    if '*' not in content:  # rough indicator
                        renamed[(os.path.basename(fn)[:-5], type_name)] = upper_name
    
    return renamed

# Renamed inner types across ALL files
inner_renames = find_renamed_inner_types()
print(f"Found {len(inner_renames)} potential inner-type renames")

# ---------------------------------------------------------------
# STEP 2: Parse build errors and collect problematic references
# ---------------------------------------------------------------
result = subprocess.run(
    ['grep', 'error:', BUILD_OUT],
    capture_output=True, text=True
)

# Collect all error info
cannot_find_errors = []  # (fpath, lineno, relpath)
ambiguous_errors = []    # (fpath, lineno, symbol, relpath)
pkg_errors = []          # (fpath, lineno, pkg_name, relpath)

for line in result.stdout.strip().split('\n'):
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
        cannot_find_errors.append((fpath, lineno, relpath))
    elif 'reference to ' in line and ' is ambiguous' in line:
        m = re.search(r'reference to (\w+) is ambiguous', line)
        if m:
            ambiguous_errors.append((fpath, lineno, m.group(1), relpath))
    elif 'package ' in line and ' does not exist' in line:
        m = re.search(r'package (\S+) does not exist', line)
        if m:
            pkg_errors.append((fpath, lineno, m.group(1), relpath))

# ---------------------------------------------------------------
# STEP 3: Fix inner type references (prefix.lowercase → prefix.UPPERCASE)
# ---------------------------------------------------------------
def load_lines(fpath):
    with open(fpath, 'r') as f:
        return f.readlines()

def save_lines(fpath, lines):
    with open(fpath, 'w') as f:
        f.writelines(lines)

fixed_inner = set()
for fpath, lineno, relpath in cannot_find_errors:
    lines = load_lines(fpath)
    original = list(lines)
    idx = lineno - 1
    
    # Find patterns: word.lowercaseLetter (where lowercaseLetter is an inner type)
    line = lines[idx]
    
    # Pattern: var.lowercase followed by non-word or single-letter type reference
    m = re.search(r'(?<![.\w])(\w+)\.([a-z])(?![.\w(])', line)
    if m:
        prefix = m.group(1)
        old_inner = m.group(2)
        new_inner = old_inner.upper()
        
        # Check if this inner type was actually renamed by looking at the file
        # that defines the outer type
        outer_file = os.path.join(os.path.dirname(fpath), prefix + '.java')
        if os.path.exists(outer_file):
            with open(outer_file, 'r') as f:
                outer_content = f.read()
            # Look for inner type declaration with this name in the outer file
            if re.search(r'\b(class|interface|enum)\s+' + re.escape(old_inner) + r'\b', outer_content):
                continue  # inner type still uses lowercase, no fix needed
        
        lines[idx] = line[:m.start(2)] + new_inner + line[m.end(2):]
        print(f'INNER REF: {relpath}:{lineno}: {prefix}.{old_inner} -> {prefix}.{new_inner}')
        fixed_inner.add(relpath)
    
    if lines != original:
        save_lines(fpath, lines)

print(f"Fixed inner-type refs in {len(fixed_inner)} files")

# ---------------------------------------------------------------
# STEP 4: Fix ambiguous references by removing redundant imports
# ---------------------------------------------------------------
fixed_ambig = set()
for fpath, lineno, symbol, relpath in ambiguous_errors:
    lines = load_lines(fpath)
    original = list(lines)
    
    # Find the package of this file
    pkg = None
    for line in lines:
        m = re.match(r'^package\s+([\w.]+);', line)
        if m:
            pkg = m.group(1)
            break
    
    if not pkg:
        continue
    
    # Remove redundant same-package import: import pkg.Symbol;
    redundant = f'import {pkg}.{symbol};'
    for i, line in enumerate(lines):
        if line.strip() == redundant:
            lines[i] = f'// {redundant}\n'
            print(f'AMBIG: {relpath}:{lineno}: removed {redundant}')
    
    if lines != original:
        save_lines(fpath, lines)
        fixed_ambig.add(relpath)

print(f"Fixed ambiguous refs in {len(fixed_ambig)} files")

# ---------------------------------------------------------------
# STEP 5: Fix package import errors
# ---------------------------------------------------------------
fixed_pkg = set()
for fpath, lineno, pkg_name, relpath in pkg_errors:
    lines = load_lines(fpath)
    original = list(lines)
    
    # Look for the import that references this package
    idx = lineno - 1
    for i in range(max(0, idx - 2), min(len(lines), idx + 2)):
        line = lines[i]
        if 'import ' in line and pkg_name in line:
            # Try capitalizing the last component
            parts = pkg_name.split('.')
            if parts and len(parts[-1]) == 1 and parts[-1].islower():
                parts[-1] = parts[-1].upper()
                new_pkg = '.'.join(parts)
                lines[i] = line.replace(pkg_name, new_pkg, 1)
                print(f'PKG: {relpath}:{lineno}: {pkg_name} -> {new_pkg}')
                break
    
    if lines != original:
        save_lines(fpath, lines)
        fixed_pkg.add(relpath)

print(f"Fixed package errors in {len(fixed_pkg)} files")
