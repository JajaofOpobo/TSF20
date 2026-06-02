"""
###############################################################################
# OBSOLETE — Superseded by fix_refs_final.py
# Created: Jaja 2026-05-26 | Cataloged: opencode 2026-06-02
# See fix_scripts_CATALOG.md for hierarchy
###############################################################################
Fix type references from lowercase to uppercase for renamed types.
Only changes UNAMBIGUOUS type references: imports, extends, implements,
new, annotations, type declarations, and fully-qualified references."""
import os, re, subprocess

SOURCES = '/home/ubuntu/Documents/TSF20/sources/sources'

# Build the map of renamed types (package -> {lower -> upper})
result = subprocess.run(['git', 'diff', '--diff-filter=D', '--name-only', 'HEAD'],
                       capture_output=True, text=True, cwd=SOURCES)

renamed = {}
for line in result.stdout.strip().split('\n'):
    if not line.endswith('.java'):
        continue
    if line.startswith('sources/sources/'):
        line = line[len('sources/sources/'):]
    dirpath = os.path.dirname(line)
    oldname = os.path.basename(line)[:-5]
    newname = oldname.upper()
    if oldname == newname:
        continue
    pkg = dirpath.replace('/', '.')
    if pkg not in renamed:
        renamed[pkg] = {}
    renamed[pkg][oldname] = newname

print(f"Found {sum(len(v) for v in renamed.values())} renamed types in {len(renamed)} packages")

total_fixes = 0

for dirpath_str, _, filenames in os.walk(SOURCES):
    for fn in filenames:
        if not fn.endswith('.java'):
            continue
        fpath = os.path.join(dirpath_str, fn)
        rel_dir = os.path.relpath(dirpath_str, SOURCES)
        
        with open(fpath, 'r') as f:
            content = f.read()
        
        original = content
        
        for src_pkg, renames in renamed.items():
            for oldname, newname in renames.items():
                # 1. Fix imports
                import_old = f'import {src_pkg}.{oldname};'
                import_new = f'import {src_pkg}.{newname};'
                if import_old in content:
                    content = content.replace(import_old, import_new)
                    total_fixes += 1
                
                # 2. Fix fully-qualified type references (used inline)
                # e.g., "com.tsf.shell.f.d " as a type reference
                fq_old = f'{src_pkg}.{oldname}'
                fq_new = f'{src_pkg}.{newname}'
                # Match when followed by non-alphanumeric (type context)
                content = re.sub(
                    rf'(?<![.\w]){re.escape(fq_old)}(?=[\s;,.<\)\]\[\]])',
                    fq_new, content
                )
                
                # 3. Same-package bare type references
                if rel_dir == src_pkg.replace('.', '/'):
                    # The type 'a' in 'a a' (declaration), 'a a(' (return type+method),
                    # 'extends a', 'implements a', 'new a()'
                    
                    # extends a -> extends A
                    content = re.sub(
                        rf'(extends\s+){oldname}(?=\s|$)',
                        rf'\g<1>{newname}', content
                    )
                    # implements a -> implements A
                    content = re.sub(
                        rf'(implements\s+){oldname}(?=\s|$)',
                        rf'\g<1>{newname}', content
                    )
                    # new a( -> new A(
                    content = re.sub(
                        rf'(new\s+){oldname}(?=\s*\()',
                        rf'\g<1>{newname}', content
                    )
                    # new a[ -> new A[
                    content = re.sub(
                        rf'(new\s+){oldname}(?=\s*\[)',
                        rf'\g<1>{newname}', content
                    )
                    # @a -> @A
                    content = re.sub(
                        rf'(@){oldname}(?=\s|$)',
                        rf'\g<1>{newname}', content
                    )
                    
                    # Type + variable/method declaration patterns:
                    # "oldname varName" or "oldname methodName("
                    content = re.sub(
                        rf'(?<![.\w]){oldname}(?=\s+[a-z]\w*(?:\s|\[|;|=|,|\)))',
                        newname, content
                    )
        
        if content != original:
            with open(fpath, 'w') as f:
                f.write(content)

print(f"Total fixes applied: {total_fixes}")
