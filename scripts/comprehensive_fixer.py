"""
Comprehensive fixer for remaining single-letter type references.
Reads git rename history and fixes all remaining compile errors.
"""
import subprocess, os, re

SRC = '/home/jaja/Documents/TSF20/sources/sources'

def build_pkg_rename_map():
    """Build package-specific old->new name map from git."""
    result = subprocess.run(
        ['git', 'log', '--all', '--name-status', '--diff-filter=R', '--', 'sources/sources/**/*.java'],
        capture_output=True, text=True, cwd='/home/jaja/Documents/TSF20'
    )
    pkg_map = {}
    for line in result.stdout.split('\n'):
        if not line.startswith('R'):
            continue
        parts = line.split('\t')
        if len(parts) < 3:
            continue
        old_path = parts[1]
        new_path = parts[2]
        if not old_path.startswith('sources/sources/'):
            continue
        old_path = old_path[len('sources/sources/'):]
        new_path = new_path[len('sources/sources/'):]
        old_name = os.path.splitext(os.path.basename(old_path))[0]
        new_name = os.path.splitext(os.path.basename(new_path))[0]
        pkg_dir = os.path.dirname(old_path)
        if pkg_dir not in pkg_map:
            pkg_map[pkg_dir] = {}
        pkg_map[pkg_dir][old_name] = new_name
    return pkg_map

def get_errors():
    """Run build and parse errors."""
    result = subprocess.run(
        ['./gradlew', 'compileDebugJavaWithJavac'],
        capture_output=True, text=True, cwd='/home/jaja/Documents/TSF20',
        timeout=180
    )
    stderr = result.stderr + result.stdout
    errors = {}
    for line in stderr.split('\n'):
        if 'error:' not in line:
            continue
        parts = line.split(':', 2)
        if len(parts) >= 3 and parts[0].endswith('.java'):
            fpath = parts[0].strip()
            if fpath not in errors:
                errors[fpath] = []
            errors[fpath].append(parts[2].strip())
    return errors

def check_file_for_stale_refs(fpath, pkg_map):
    """Check a file for single-letter type references that should be renamed."""
    with open(fpath, 'r') as f:
        content = f.read()
    
    rel_path = os.path.relpath(os.path.dirname(fpath), SRC)
    lines = content.split('\n')
    orig_lines = lines[:]
    
    # Find current class name from file
    file_class = os.path.splitext(os.path.basename(fpath))[0]
    
    # Get the package declaration
    pkg = ''
    for line in lines:
        if line.startswith('package '):
            pkg = line[8:].rstrip(';').strip()
            break
    
    changed = False
    
    # Get rename mappings for this package and parent packages
    for lineno, line in enumerate(lines):
        if line.strip().startswith('package ') or line.strip().startswith('import '):
            continue
        
        # Find single-letter type references in specific contexts
        # Pattern 1: extends SingleLetter
        m = re.search(r'\bextends\s+([a-zA-Z])\b', line)
        if m:
            old = m.group(1)
            new = find_new_name(old, rel_path, pkg_map)
            if new and new != old and new != file_class:
                lines[lineno] = line.replace(f'extends {old}', f'extends {new}', 1)
                changed = True
                print(f"  {os.path.basename(fpath)}:{lineno+1}: extends {old} -> {new}")
                continue
        
        # Pattern 2: implements SingleLetter
        m = re.search(r'\bimplements\s+([a-zA-Z])\b', line)
        if m:
            old = m.group(1)
            new = find_new_name(old, rel_path, pkg_map)
            if new and new != old and new != file_class:
                lines[lineno] = line.replace(f'implements {old}', f'implements {new}', 1)
                changed = True
                print(f"  {os.path.basename(fpath)}:{lineno+1}: implements {old} -> {new}")
                continue
        
        # Pattern 3: new SingleLetter(
        m = re.search(r'\bnew\s+([a-zA-Z])\s*\(', line)
        if m:
            old = m.group(1)
            new = find_new_name(old, rel_path, pkg_map)
            if new and new != old and new != file_class:
                lines[lineno] = line.replace(f'new {old}(', f'new {new}(', 1)
                changed = True
                print(f"  {os.path.basename(fpath)}:{lineno+1}: new {old}() -> {new}()")
                continue
        
        # Pattern 4: <SingleLetter> in generic types
        m = re.search(r'(?<![\w.])([A-Z])(?=\s+\w+\s*[;(,=)])', line)
        if m:
            old = m.group(1)
            new = find_new_name(old, rel_path, pkg_map)
            if new and new != old and new != file_class:
                lines[lineno] = re.sub(r'\b' + old + r'(?=\s+\w+\s*[;(,=)])', new, line, count=1)
                changed = True
                print(f"  {os.path.basename(fpath)}:{lineno+1}: {old} -> {new}")
    
    if changed:
        with open(fpath, 'w') as f:
            f.write('\n'.join(lines))
        return True
    return False

def find_new_name(old_name, rel_path, pkg_map):
    """Find the new name for an old single-letter type in the given package."""
    # Check this package
    if rel_path in pkg_map and old_name in pkg_map[rel_path]:
        return pkg_map[rel_path][old_name]
    
    # Check parent directories
    parts = rel_path.split('/')
    for i in range(len(parts)-1, 0, -1):
        parent = '/'.join(parts[:i])
        if parent in pkg_map and old_name in pkg_map[parent]:
            return pkg_map[parent][old_name]
    
    return None

# Also add common known mappings for immediate fixes
COMMON_FIXES = {
    # (old_type, new_type, package_path_pattern)
    'com.tsf.shell.manager.wallpaper': {'e': 'WallpaperMenuContainer'},
}

def main():
    print("Building rename map from git...")
    pkg_map = build_pkg_rename_map()
    print(f"Map has {sum(len(v) for v in pkg_map.values())} entries")
    
    print("Getting compile errors...")
    errors = get_errors()
    print(f"Total error files: {len(errors)}")
    
    fixed = 0
    for fpath in sorted(errors.keys()):
        if not os.path.exists(fpath):
            continue
        if check_file_for_stale_refs(fpath, pkg_map):
            fixed += 1
    
    print(f"\nFixed {fixed} files")
    
    if fixed > 0:
        print("Running build to verify...")
        new_errors = get_errors()
        print(f"Remaining error files: {len(new_errors)}")

if __name__ == '__main__':
    main()
