"""
Surgical fixer for remaining compile errors.
Only fixes exact patterns that we KNOW are wrong.
No replaceAll — each fix is a single-target edit.
"""
import subprocess, re, os

SRC = '/home/jaja/Documents/TSF20/sources/sources'

def get_errors():
    """Run build and return (file, line, msg) for each error."""
    result = subprocess.run(
        ['./gradlew', 'compileDebugJavaWithJavac'],
        capture_output=True, text=True, cwd='/home/jaja/Documents/TSF20',
        timeout=180
    )
    stderr = result.stderr + result.stdout
    errors = []
    for line in stderr.split('\n'):
        if 'error:' in line and not line.startswith('Note:'):
            parts = line.split(':', 2)
            if len(parts) >= 3 and parts[0].endswith('.java'):
                fpath = parts[0].strip()
                try:
                    lineno = int(parts[1].strip())
                except ValueError:
                    continue
                msg = parts[2].strip()
                errors.append((fpath, lineno, msg))
    return errors

def read_line(filepath, lineno):
    with open(filepath) as f:
        lines = f.readlines()
    if 1 <= lineno <= len(lines):
        return lines[lineno-1].rstrip()
    return None

# Known rename mappings from git
# Format: (old_classname, new_classname) for specific packages
# These are the MOST COMMON single-letter renames we need to fix
RENAMES = {
    # shell/manager/f/
    'com.tsf.shell.manager.f': {
        'j': 'WorkspaceScene',  # wait, this was the same file
        'e': 'ScreenFadeController',
        'a': 'LauncherInitController',
        'k': 'ViewportController',
    },
    # shell/e/
    'com.tsf.shell.e': {
        'a': 'TSFAppWidgetHost',
        'b': 'WidgetContainer',
        'c': 'CellLayout',
        'd': 'DragLayer',
        'g': 'Workspace3D',
        'n': 'Workspace3D',  # page manager type
    },
    # shell/manager/wallpaper/
    'com.tsf.shell.manager.wallpaper': {
        'e': 'WallpaperMenuContainer',
        'c': 'WallpaperRenderer',
        'l': 'ToggleRowItem',
        'g': 'WallpaperDragHandler',
        'm': 'LiveWallpaperMenuItem',
    },
    # shell/f/e/b/
    'com.tsf.shell.f.e.b': {
        'a': 'ResizeButtonNode',
        'b': 'ResizeConfig',
        'c': 'ResizeState',
        'd': 'ResizeConstants',
        'e': 'ResizeTextureManager',
        'f': 'ResizeShader',
    },
    # shell/manager/p/
    'com.tsf.shell.manager.p': {
        'a': 'ThemeTransitionAnimator',
        'b': 'GestureTipElement',
        'c': 'ThemePreferenceStore',
        'd': 'ThemeConfigStore',
        'e': 'ThemePreferenceProvider',
    },
    # shell/Home.java types
    'com.tsf.shell': {
        'A': 'ShellBackgroundRenderer',
        'B': 'ShellCleanupTask',
        'D': 'ShellDataProvider',
        'E': 'ShellThemeProvider',
    },
}

# For packages where old_name.java was renamed, extract from git
def build_rename_map():
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
        if not old_path.startswith('sources/sources/') or not new_path.startswith('sources/sources/'):
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

def fix_file(filepath, errors_for_file, pkg_map):
    """Fix all errors in one file."""
    with open(filepath, 'r') as f:
        content = f.read()
    original = content
    lines = content.split('\n')
    
    # Get the package declaration
    pkg = ''
    for line in lines:
        if line.startswith('package '):
            pkg = line[len('package '):].rstrip(';').strip()
            break
    
    # Get relative path for package directory lookup
    rel_path = os.path.relpath(os.path.dirname(filepath), SRC)
    pkg_as_dir = rel_path  # e.g., "com/tsf/shell/manager/f"
    
    changed = False
    
    for lineno, msg in errors_for_file:
        if lineno < 1 or lineno > len(lines):
            continue
        old_line = lines[lineno-1]
        
        # Extract the missing symbol from error message
        symbol_match = re.search(r'symbol:\s+(?:class|interface|enum)\s+(\w+)', msg)
        if not symbol_match:
            # Try: cannot find symbol: class X
            symbol_match = re.search(r'cannot find symbol.*?\bclass\s+(\w+)', msg)
        if not symbol_match:
            # Try: package X does not exist
            symbol_match = re.search(r'package\s+(\w+)\s+does not exist', msg)
            if symbol_match:
                # This is a package reference error, not simple
                continue
        if not symbol_match:
            continue
        
        missing = symbol_match.group(1)
        
        # Skip single Java keywords
        if missing in ('int', 'float', 'double', 'boolean', 'void', 'long', 'short', 'byte', 'char'):
            continue
        
        # Determine correct new name
        new_name = None
        
        # Check if the missing type is a single-letter type in the same package
        if len(missing) == 1 and pkg_as_dir in pkg_map and missing in pkg_map[pkg_as_dir]:
            new_name = pkg_map[pkg_as_dir][missing]
        
        # Check parent package
        parent_dir = os.path.dirname(pkg_as_dir)
        if new_name is None and len(missing) == 1 and parent_dir in pkg_map and missing in pkg_map[parent_dir]:
            new_name = pkg_map[parent_dir][missing]
        
        # Check subdirectories of the same package
        if new_name is None and len(missing) == 1:
            for pkg_dir, pkg_renames in pkg_map.items():
                if pkg_dir.startswith(pkg_as_dir + '/') and missing in pkg_renames:
                    new_name = pkg_renames[missing]
                    break
        
        if new_name and new_name != missing:
            new_line = old_line
            # Only replace the exact missing type reference, not all occurrences on the line
            # Use word boundaries
            new_line = re.sub(
                r'\b' + re.escape(missing) + r'\b',
                new_name,
                old_line,
                count=1  # Only replace the FIRST occurrence (the type reference)
            )
            if new_line != old_line:
                lines[lineno-1] = new_line
                changed = True
                print(f"  {os.path.basename(filepath)}:{lineno}: {missing} -> {new_name}: {old_line.strip()}")
    
    if changed:
        with open(filepath, 'w') as f:
            f.write('\n'.join(lines))
        return True
    return False

def main():
    print("Building rename map from git...")
    pkg_map = build_rename_map()
    print(f"Found {sum(len(v) for v in pkg_map.values())} renames in {len(pkg_map)} packages")
    
    print("Getting compile errors...")
    errors = get_errors()
    print(f"Total errors: {len(errors)}")
    
    # Group errors by file
    file_errors = {}
    for fpath, lineno, msg in errors:
        if fpath not in file_errors:
            file_errors[fpath] = []
        file_errors[fpath].append((lineno, msg))
    
    fixed_count = 0
    for filepath, file_errs in sorted(file_errors.items()):
        if not os.path.exists(filepath):
            print(f"WARNING: {filepath} not found")
            continue
        if fix_file(filepath, file_errs, pkg_map):
            fixed_count += 1
    
    print(f"\nFixed {fixed_count} files")
    
    if fixed_count > 0:
        print("\nRunning build to verify...")
        new_errors = get_errors()
        print(f"Remaining errors: {len(new_errors)}")

if __name__ == '__main__':
    main()
