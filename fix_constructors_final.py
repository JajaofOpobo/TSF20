"""Fix constructor names that don't match their class name (case mismatch).
For each file, find class declarations, then fix constructors with wrong case.
Safe: only replaces the name token, keeps everything else intact."""
import os, re, subprocess

SOURCES = '/home/ubuntu/Documents/TSF20/sources/sources'

# Get list of files with constructor mismatches from build errors
result = subprocess.run(
    ['grep', 'invalid method declaration', 'docs/build-output-round1.txt'],
    capture_output=True, text=True
)

error_files = set()
for line in result.stdout.strip().split('\n'):
    if '/sources/sources/' in line:
        fpath = line.split('/sources/sources/')[1].split(':')[0]
        error_files.add(os.path.join(SOURCES, fpath))

print(f"Files to fix: {len(error_files)}")

fixed_count = 0
for fpath in error_files:
    if not os.path.exists(fpath):
        continue
    
    with open(fpath, 'r') as f:
        lines = f.readlines()
    
    original = list(lines)
    
    # Find class declarations and their names
    class_info = []  # (line_idx, class_name, body_end)
    for i, line in enumerate(lines):
        m = re.search(r'\b(?:(?:public|protected|private|static|abstract|final|strictfp)\s+)*(?:class|interface|enum)\s+(\w+)', line)
        if m:
            class_info.append((i, m.group(1)))
    
    for cls_idx, cls_name in class_info:
        # Scan forward to find constructors with wrong case (within same brace level)
        depth = 0
        for i in range(cls_idx, len(lines)):
            line = lines[i]
            
            # Track brace depth
            depth += line.count('{') - line.count('}')
            if depth <= 0 and i > cls_idx:
                break  # exited class scope
            
            if i == cls_idx:
                continue  # skip the declaration line itself
            
            # Check for wrong-case constructor on this line
            for wrong_case in [cls_name.lower(), cls_name.upper()]:
                if wrong_case == cls_name:
                    continue
                # Match: optional modifiers + [optional comment] + wrongCase + (
                # Must be at a position that looks like a constructor declaration
                # Pattern: start of line (after whitespace), then modifiers, then wrongCase(
                m = re.search(
                    r'^(\s*)(?:(?:public|protected|private|static)\s+)*(?:/\*.*?\*/\s+)?' + re.escape(wrong_case) + r'(\s*\()',
                    line
                )
                if m:
                    # Only fix if this looks like a constructor (line doesn't end with ; and has { or opening paren)
                    stripped = line.strip()
                    if stripped.rstrip().endswith(';'):
                        continue  # method call, not constructor
                    # Replace just the wrong_case with cls_name
                    old_con = wrong_case + '('
                    new_con = cls_name + '('
                    new_line = line.replace(old_con, new_con, 1)
                    lines[i] = new_line
                    print(f'  {os.path.relpath(fpath, SOURCES)}:{i+1}: {wrong_case}() -> {cls_name}()')
                    break  # only one fix per line
    
    if lines != original:
        with open(fpath, 'w') as f:
            f.writelines(lines)
        fixed_count += 1

print(f'Fixed {fixed_count} files')
