"""
###############################################################################
# CURRENT — Final version of the constructor-fixer family
# Created: Jaja 2026-05-26 | Cataloged: opencode 2026-06-02
# Replaces: fix_constructors.py, fix_constructors2.py, fix_constructors3.py,
#           fix_constructors_final.py
# Key improvements: return-type detection (skips actual methods), targeted
#   fix from build error lines.
# See fix_scripts_CATALOG.md for hierarchy
###############################################################################
Fix constructor names precisely by reading build errors line by line."""
import os, re, subprocess

SOURCES = '/home/jaja/Documents/TSF20/sources/sources'

result = subprocess.run(
    ['grep', 'invalid method declaration', 'docs/build-output-current.txt'],
    capture_output=True, text=True
)

# Parse all errors: file:line -> {line_number -> wrong_name}
errors = {}  # fpath -> {line_num: wrong_name}
for line in result.stdout.strip().split('\n'):
    if '/sources/sources/' not in line:
        continue
    # /path/sources/sources/com/foo.java:123: error: ...
    fpath = line.split('/sources/sources/')[1].split(':')[0]
    linenum = int(line.split(':')[1])
    fpath_full = os.path.join(SOURCES, fpath)
    if not os.path.exists(fpath_full):
        continue
    if fpath_full not in errors:
        errors[fpath_full] = set()
    errors[fpath_full].add(linenum)

fixed_count = 0
for fpath, linenums in errors.items():
    with open(fpath, 'r') as f:
        lines = f.readlines()
    
    original = list(lines)
    
    for linenum in sorted(linenums, reverse=True):
        idx = linenum - 1
        line = lines[idx]
        
        # Find the constructor name: the word right before '('
        m = re.search(r'(\w+)\s*\(', line)
        if not m:
            continue
        name = m.group(1)
        # Capitalize it
        new_name = name[0].upper() + name[1:] if name else name
        if new_name == name:
            continue  # already correct
        
        # Make sure the name is at the right position: after modifiers/comment
        # and is not preceded by a return type
        prefix_match = re.match(
            r'^(\s*)(?:(?:public|protected|private|static|final|abstract|synchronized|native|strictfp)\s+)*(?:/\*.*?\*/\s+)?' +
            re.escape(name) + r'(\s*\()',
            line
        )
        if not prefix_match:
            continue
        
        # Check this is NOT a method by verifying there's no return type
        # before the name. A constructor has only modifiers before the name.
        before_name = line[:m.start()]
        after_modifiers = re.sub(
            r'^(?:(?:public|protected|private|static|final|abstract|synchronized|native|strictfp)\s+)*(?:/\*.*?\*/\s+)?',
            '', before_name
        )
        if after_modifiers.strip():
            continue  # something between modifiers and name -> likely return type
        
        lines[idx] = line.replace(name, new_name, 1)
        print(f'  {os.path.relpath(fpath, SOURCES)}:{linenum}: {name}() -> {new_name}()')
    
    if lines != original:
        with open(fpath, 'w') as f:
            f.writelines(lines)
        fixed_count += 1

print(f'Fixed {fixed_count} files')
