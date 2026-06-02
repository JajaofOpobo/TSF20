"""
###############################################################################
# OBSOLETE — Superseded by fix_refs_final.py
# Created: Jaja 2026-05-26 | Cataloged: opencode 2026-06-02
# Bug: duplicated code block (lines 67-110 duplicated at 112-140)
# See fix_scripts_CATALOG.md for hierarchy
###############################################################################
Fix type references from lowercase to uppercase for renamed types.
Handles imports with nested types, fully-qualified references, and bare references."""
import os, re, subprocess

SOURCES = '/home/ubuntu/Documents/TSF20/sources/sources'

# Build the map of renamed types
result = subprocess.run(['git', 'diff', '--diff-filter=D', '--name-only', 'HEAD'],
                       capture_output=True, text=True, cwd=SOURCES)

# Map: pkg -> {old_lower -> new_upper, ...}
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
                # 1. Fix import statements - handle both simple and nested imports
                # e.g., "import src_pkg.oldname;" or "import src_pkg.oldname.Something;"
                import_pattern = rf'import\s+{re.escape(src_pkg)}\.{oldname}(?:[.\s;]|$)'
                content = re.sub(
                    import_pattern,
                    lambda m: m.group(0).replace(f'{src_pkg}.{oldname}', f'{src_pkg}.{newname}'),
                    content
                )
                
                # 2. Fix fully-qualified inline type references (word-boundary protected)
                # e.g., "src_pkg.oldname varName" or "new src_pkg.oldname("
                fq_old = f'{src_pkg}.{oldname}'
                fq_new = f'{src_pkg}.{newname}'
                escaped_fq = re.escape(fq_old)
                content = re.sub(
                    r'(?<![.\w])' + escaped_fq + r'(?=\s*[;,)<>\]]|$)',
                    fq_new, content
                )
                
                # 3. Same-package bare type references (only for files in the same package)
                if rel_dir == src_pkg.replace('.', '/'):
                    # extends oldname -> extends Newname (word-boundary protected)
                    content = re.sub(
                        rf'(extends\s+){oldname}(?=\s|$)',
                        rf'\g<1>{newname}', content)
                    # implements oldname -> implements Newname
                    content = re.sub(
                        rf'(implements\s+){oldname}(?=\s|$)',
                        rf'\g<1>{newname}', content)
                    # new oldname( -> new Newname(
                    content = re.sub(
                        rf'(new\s+){oldname}(?=\s*\()',
                        rf'\g<1>{newname}', content)
                    # new oldname[ -> new Newname[
                    content = re.sub(
                        rf'(new\s+){oldname}(?=\s*\[)',
                        rf'\g<1>{newname}', content)
                    # @oldname -> @Newname
                    content = re.sub(
                        rf'(@){oldname}(?=\s|$)',
                        rf'\g<1>{newname}', content)
                    # Cast: (oldname) -> (Newname)
                    content = re.sub(
                        rf'(\(\s*){oldname}(\s*\))',
                        rf'\g<1>{newname}\g<2>', content)
                    # oldname.this -> Newname.this (negative lookbehind prevents matching inside words)
                    content = re.sub(
                        rf'(?<!\w){oldname}\.this',
                        f'{newname}.this', content)
                    # generic type: <oldname> -> <Newname>
                    content = re.sub(
                        rf'(<){oldname}(>)',
                        rf'\g<1>{newname}\g<2>', content)
                    # generic type with extends: <oldname extends ...> -> <Newname extends ...>
                    content = re.sub(
                        rf'(<\s*){oldname}(\s+extends)',
                        rf'\g<1>{newname}\g<2>', content)
                    
                    # Type in declaration: oldname[ ]? varName
                    # "type varName" where oldname is a type and following identifier is variable/method name
                    content = re.sub(
                        rf'(?<![.\w]){oldname}(?=\s+[a-z][\w$]*(?:\s|\[|;|=|,|\)|\.))',
                        newname, content
                    )
                
                # 3. Same-package bare type references (only for files in the same package)
                if rel_dir == src_pkg.replace('.', '/'):
                    # extends oldname -> extends Newname
                    content = re.sub(rf'(extends\s+){oldname}(?=\s|$)',
                                    rf'\g<1>{newname}', content)
                    # implements oldname -> implements Newname
                    content = re.sub(rf'(implements\s+){oldname}(?=\s|$)',
                                    rf'\g<1>{newname}', content)
                    # new oldname( -> new Newname(
                    content = re.sub(rf'(new\s+){oldname}(?=\s*\()',
                                    rf'\g<1>{newname}', content)
                    # new oldname[ -> new Newname[
                    content = re.sub(rf'(new\s+){oldname}(?=\s*\[)',
                                    rf'\g<1>{newname}', content)
                    # @oldname -> @Newname
                    content = re.sub(rf'(@){oldname}(?=\s|$)',
                                    rf'\g<1>{newname}', content)
                    # Cast: (oldname) -> (Newname)
                    content = re.sub(rf'(\(\s*){oldname}(\s*\))',
                                    rf'\g<1>{newname}\g<2>', content)
                    # oldname.this -> Newname.this
                    content = re.sub(rf'{oldname}\.this', f'{newname}.this', content)
                    
                    # Type in declaration: oldname[ ]? varName
                    # "type varName" where oldname is a type and following identifier is variable/method name
                    content = re.sub(
                        rf'(?<![.\w]){oldname}(?=\s+[a-z][\w$]*(?:\s|\[|;|=|,|\)|\.))',
                        newname, content
                    )
        
        if content != original:
            with open(fpath, 'w') as f:
                f.write(content)
            total_fixes += sum(1 for a, b in zip(original, content) if a != b)
            changed_files += 1

print(f"Changed {changed_files} files with ~{total_fixes} fixes")
