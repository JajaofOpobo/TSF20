"""
###############################################################################
# OBSOLETE — Superseded by fix_refs_final.py
# Created: Jaja 2026-05-26 | Cataloged: opencode 2026-06-02
# See fix_scripts_CATALOG.md for hierarchy
###############################################################################
Fix type references from lowercase to uppercase for renamed types."""
import os, re, subprocess

SOURCES = '/home/ubuntu/Documents/TSF20/sources/sources'

# Build the map of renamed types
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

changed_files = 0

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
                # 1. Fix import statements - match src_pkg.oldname anywhere in import line
                # Replace only the src_pkg.oldname portion (not the rest of the path)
                import_pattern = re.compile(
                    r'import\s+' + re.escape(src_pkg) + r'\.' + oldname +
                    r'(?=[.\s;,]|$)'  # oldname must be a complete component name
                )
                content = import_pattern.sub(
                    lambda m: m.group(0).replace(
                        f'{src_pkg}.{oldname}', f'{src_pkg}.{newname}'
                    ),
                    content
                )
                content = import_pattern.sub(
                    lambda m: m.group(0).replace(
                        f'{src_pkg}.{oldname}', f'{src_pkg}.{newname}'
                    ),
                    content
                )
                
                # 2. Fix fully-qualified inline type references
                # "src_pkg.oldname" not followed by \w or . (to avoid matching nested types)
                # Temporarily protect package declarations and imports from FQ matching
                fq_old_name = f'{src_pkg}.{oldname}'
                fq_new_name = f'{src_pkg}.{newname}'
                
                # Protect package and import lines: replace them with placeholders
                placeholder_map = {}
                def protect(m):
                    key = f'__PKG_{len(placeholder_map)}__'
                    placeholder_map[key] = m.group(0)
                    return key
                
                content_protected = re.sub(
                    r'^package\s+' + re.escape(fq_old_name) + r'\s*;.*$',
                    protect, content, flags=re.MULTILINE
                )
                content_protected = re.sub(
                    r'^import\s+' + re.escape(fq_old_name) + r'\s*;.*$',
                    protect, content_protected, flags=re.MULTILINE
                )
                
                # Now apply the FQ pattern to the protected content
                fq_pattern = re.compile(
                    r'(?<![.\w])' + re.escape(fq_old_name) +
                    r'(?![.\w])'
                )
                content_protected = fq_pattern.sub(fq_new_name, content_protected)
                
                # Restore placeholders
                for key, val in placeholder_map.items():
                    content_protected = content_protected.replace(key, val)
                content = content_protected
                
                # 3. Same-package bare type references
                if rel_dir == src_pkg.replace('.', '/'):
                    # extends oldname -> extends Newname
                    content = re.sub(
                        r'(extends\s+)' + oldname + r'(?![.\w])',
                        r'\g<1>' + newname, content)
                    content = re.sub(
                        r'(implements\s+)' + oldname + r'(?![.\w])',
                        r'\g<1>' + newname, content)
                    content = re.sub(
                        r'(new\s+)' + oldname + r'(?=\s*\()',
                        r'\g<1>' + newname, content)
                    content = re.sub(
                        r'(new\s+)' + oldname + r'(?=\s*\[)',
                        r'\g<1>' + newname, content)
                    content = re.sub(
                        r'(@)' + oldname + r'(?![.\w])',
                        r'\g<1>' + newname, content)
                    # Cast: (oldname) -> (Newname)
                    content = re.sub(
                        r'(\(\s*)' + oldname + r'(\s*\))',
                        r'\g<1>' + newname + r'\g<2>', content)
                    # oldname.this -> Newname.this (not preceded by word char)
                    content = re.sub(
                        r'(?<!\w)' + oldname + r'\.this',
                        newname + '.this', content)
                    
                    # Type in declaration: oldname followed by space + identifier
                    # Single-letter types only: a, b, c, etc.
                    content = re.sub(
                        r'(?<![.\w])' + oldname + r'(?=\s+[a-z][\w$]*(?:\s|\[|;|=|,|\)|\.))',
                        newname, content)
        
        if content != original:
            with open(fpath, 'w') as f:
                f.write(content)
            changed_files += 1

print(f"Changed {changed_files} files")
