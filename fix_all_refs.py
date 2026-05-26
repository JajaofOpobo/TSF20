import os, re, subprocess

SOURCES = '/home/ubuntu/Documents/TSF20/sources/sources'

# Get renamed files from git diff
result = subprocess.run(['git', 'diff', '--diff-filter=D', '--name-only', 'HEAD'], 
                       capture_output=True, text=True, cwd=SOURCES)

# Map of package -> {old_lower -> new_upper}
renamed = {}

for line in result.stdout.strip().split('\n'):
    if not line.endswith('.java'):
        continue
    # Strip sources/sources/ prefix
    rel_line = line
    if rel_line.startswith('sources/sources/'):
        rel_line = rel_line[len('sources/sources/'):]
    dirpath = os.path.dirname(rel_line)
    oldname = os.path.basename(rel_line)[:-5]
    newname = oldname.upper()
    if oldname == newname:
        continue
    pkg = dirpath.replace('/', '.')
    if pkg not in renamed:
        renamed[pkg] = {}
    renamed[pkg][oldname] = newname

print(f"Found {sum(len(v) for v in renamed.values())} renamed types in {len(renamed)} packages")

# For each renamed type, find all references and fix them
total_fixes = 0

for dirpath_str, dir_entries, filenames in os.walk(SOURCES):
    for fn in filenames:
        if not fn.endswith('.java'):
            continue
        fpath = os.path.join(dirpath_str, fn)
        rel_dir = os.path.relpath(dirpath_str, SOURCES)
        pkg = rel_dir.replace('/', '.')
        
        with open(fpath, 'r') as f:
            content = f.read()
        
        original = content
        in_pkg = rel_dir  # relative path of this file's package
        
        for src_pkg, renames in renamed.items():
            # For each renamed type, check:
            # 1. Import statements: import src_pkg.oldname;
            # 2. Fully qualified references: src_pkg.oldname used as type
            # 3. If this file is in the same package, bare oldname references
            
            for oldname, newname in renames.items():
                # Fix imports
                import_old = f'import {src_pkg}.{oldname};'
                import_new = f'import {src_pkg}.{newname};'
                if import_old in content:
                    content = content.replace(import_old, import_new)
                    total_fixes += 1
                
                # Fix fully qualified type references like "com.tsf.shell.f.d b"
                # Match: the full package+name as a type reference
                # Pattern: <package>.<oldname> followed by whitespace, semicolon, comma, closing paren
                fq_pattern = f'{src_pkg}.{oldname}(?=\\s|;|,|\\)|<|>|\\[)'
                if re.search(fq_pattern, content):
                    content = re.sub(fq_pattern, f'{src_pkg}.{newname}', content)
                    total_fixes += 1
                
                # Fix same-package bare type references (only for files in the same package as the renamed type)
                if in_pkg == src_pkg.replace('.', '/'):
                    # Replace bare oldname as a type reference
                    # Match: standalone oldname surrounded by non-alphanumeric chars
                    # Be careful: oldname is a single letter
                    bare_pattern = r'(?<![.\w])' + oldname + r'(?=\s*[;,)<\]]|\s+\w|\s*\{|\s*extends\s|\s*implements\s|\s*instanceof\s|\s*new\s)'
                    if re.search(bare_pattern, content):
                        content = re.sub(bare_pattern, newname, content)
                        total_fixes += 1
        
        if content != original:
            with open(fpath, 'w') as f:
                f.write(content)

print(f"Total fixes applied: {total_fixes}")
