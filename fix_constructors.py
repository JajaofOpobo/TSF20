"""Fix constructor names that don't match their class name (case mismatch)."""
import os, re

SOURCES = '/home/ubuntu/Documents/TSF20/sources/sources'

fixed = 0
for dirpath, _, filenames in os.walk(SOURCES):
    for fn in filenames:
        if not fn.endswith('.java'):
            continue
        fpath = os.path.join(dirpath, fn)
        with open(fpath, 'r') as f:
            content = f.read()
        
        original = content
        
        # Find all class/interface/enum declarations
        for m in re.finditer(r'^\s*(?:(?:public|protected|private|static|abstract|final|strictfp)\s+)*(class|interface|enum)\s+(\w+)', content, re.MULTILINE):
            cls_name = m.group(2)
            # Try both lower and upper case variants
            for wrong_case in [cls_name.lower(), cls_name.upper()]:
                if wrong_case == cls_name:
                    continue
                # Replace wrong_case( when it looks like a constructor
                # Match at line start with optional modifiers
                pattern = r'^(\s*)(?:(?:public|protected|private)\s+)*' + re.escape(wrong_case) + r'\s*\('
                replacement = r'\g<1>'
                if re.search(r'(?:public|protected|private)\s+' + re.escape(wrong_case) + r'\s*\(', content):
                    replacement = r'\g<1>' + cls_name + '('
                else:
                    replacement = r'\g<1>' + cls_name + '('
                new_content = re.sub(pattern, replacement, content, flags=re.MULTILINE)
                if new_content != content:
                    print(f'  {os.path.relpath(fpath, SOURCES)}: {wrong_case}() -> {cls_name}()')
                    content = new_content
        
        if content != original:
            with open(fpath, 'w') as f:
                f.write(content)
            fixed += 1

print(f'Fixed {fixed} files')
