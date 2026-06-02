"""
###############################################################################
# CURRENT — Final version of the refs-fixer family
# Created: Jaja 2026-05-26 | Cataloged: opencode 2026-06-02
# Replaces: fix_refs.py, fix_refs2.py, fix_refs3.py
# Key improvements: subpackage/type conflict detection, line-by-line processing,
#   context-checking callback.
# See fix_scripts_CATALOG.md for hierarchy
###############################################################################
Fix references for renamed types, safely handling subpackage/type coexistence."""
import os, re, subprocess

SOURCES = '/home/ubuntu/Documents/TSF20/sources/sources'

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
            # Check if this src_pkg has subdirectories matching oldname
            # (meaning it's a real subpackage, not just a type)
            src_dir = src_pkg.replace('.', '/')
            has_conflict = False
            for oldname in renames:
                subdir = os.path.join(SOURCES, src_dir, oldname)
                if os.path.isdir(subdir):
                    has_conflict = True
                    break
            
            for oldname, newname in renames.items():
                # Apply import and FQ fixes to ALL files (conflict or not).
                # The regex patterns are safe: they only match when oldname is the
                # LAST component, so subpackage references are never corrupted.
                # Package declarations are protected by line-by-line checking.
                
                # Process line-by-line to protect package declarations
                lines = content.split('\n')
                for i, line in enumerate(lines):
                    stripped = line.strip()
                    if stripped.startswith('package '):
                        continue
                    # Import fix - match only when oldname is the LAST component
                    lines[i] = re.sub(
                        r'import\s+' + re.escape(src_pkg) + r'\.' + oldname +
                        r'(?=\s|;|,|$)',
                        lambda m: m.group(0).replace(
                            f'{src_pkg}.{oldname}', f'{src_pkg}.{newname}'
                        ),
                        line
                    )
                content = '\n'.join(lines)
                
                # FQ inline fix - only match when oldname is the LAST component
                # Use callback to skip matches on package declarations
                def fix_fq(m):
                    line_start = content.rfind('\n', 0, m.start()) + 1
                    line_end = content.find('\n', m.end())
                    if line_end == -1:
                        line_end = len(content)
                    line = content[line_start:line_end]
                    if line.strip().startswith('package '):
                        return m.group(0)
                    return f'{src_pkg}.{newname}'
                
                fq_pattern = re.compile(
                    r'(?<![.\w])' + re.escape(src_pkg) + r'\.' + oldname +
                    r'(?![.\w])'
                )
                content = fq_pattern.sub(fix_fq, content)
                
                # Same-package bare type references
                if rel_dir == src_dir:
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
                    content = re.sub(
                        r'(\(\s*)' + oldname + r'(\s*\))',
                        r'\g<1>' + newname + r'\g<2>', content)
                    # Type in declaration (followed by variable name)
                    content = re.sub(
                        r'(?<![.\w])' + oldname + r'(?=\s+[a-z][\w$]*(?:\s|\[|;|=|,|\)|\.))',
                        newname, content)

        
        if content != original:
            with open(fpath, 'w') as f:
                f.write(content)
            changed_files += 1

print(f"Changed {changed_files} files")
