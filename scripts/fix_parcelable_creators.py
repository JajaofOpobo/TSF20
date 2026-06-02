"""
###############################################################################
# CURRENT — Standalone CLI tool
# Created: Jaja 2026-05-18 | Cataloged: opencode 2026-06-02
# Converts anonymous Parcelable.Creator<> to named private static inner class.
# Takes file paths as CLI arguments.
# See fix_scripts_CATALOG.md for hierarchy
###############################################################################
"""
import re
import sys

def fix_file(filepath):
    with open(filepath, 'r', encoding='utf-8') as f:
        content = f.read()
    
    # Find the public static final Parcelable.Creator<Type> CREATOR = ... pattern
    pattern = r'public static final Parcelable\.Creator<(\w+)>\s+CREATOR\s*=\s*new\s+Parcelable\.Creator<\w+>\s*\(\s*\)\s*\{(.*?)\n\s+\};'
    
    match = re.search(pattern, content, re.DOTALL)
    if not match:
        print(f"No match in {filepath}")
        return False
    
    type_param = match.group(1)
    anon_body = match.group(2)
    
    # Clean up JADX comments and other annotations from the body
    lines = anon_body.split('\n')
    # Remove the first newline if present
    if lines and lines[0].strip() == '':
        lines = lines[1:]
    
    clean_lines = []
    for i, line in enumerate(lines):
        # Remove JADX INFO comments
        line = re.sub(r'/\* JADX INFO: [^*]* \*/', '', line)
        # Remove "// from class: ..." comments
        line = re.sub(r'// from class: [^\n]*$', '', line)
        # Remove "@Override // ..." keep just @Override
        line = re.sub(r'@Override //.*$', '@Override', line)
        clean_lines.append(line.rstrip())
    
    body_clean = '\n'.join(clean_lines)
    
    # Check if the body ends with just whitespace before the closing
    body_clean = body_clean.rstrip()
    
    # Build the new inner class and replacement
    old_decl = match.group(0)
    
    new_inner_class = f"""
    private static final class Creator implements Parcelable.Creator<{type_param}> {{"""
    new_inner_class += f"""
{body_clean}
    }}
    
    public static final Parcelable.Creator<{type_param}> CREATOR = new Creator();"""

    
    new_content = content.replace(old_decl, new_inner_class.strip())
    
    with open(filepath, 'w', encoding='utf-8') as f:
        f.write(new_content)
    
    print(f"Fixed: {filepath}")
    return True

if __name__ == '__main__':
    files = sys.argv[1:]
    if not files:
        print("Usage: python fix_parcelable_creators.py <file1> <file2> ...")
        sys.exit(1)
    
    for f in files:
        fix_file(f)
    
    print(f"\nFixed {len(files)} file(s)")
