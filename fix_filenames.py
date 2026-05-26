#!/usr/bin/env python3
"""Fix Java filename/classname mismatches from case-insensitive FS migration."""
import os
import re
import shutil

SOURCES = "/home/ubuntu/Documents/TSF20/sources/sources"

def find_class_name(content):
    """Find the public class/interface/enum name declared in a Java file."""
    m = re.search(r'\bpublic\s+(?:static\s+|abstract\s+|final\s+|strictfp\s+)*(?:class|interface|@interface|enum)\s+(\w+)', content)
    return m.group(1) if m else None

def find_all_class_names(content):
    """Find ALL class/interface names declared (including non-public/inner)."""
    names = set()
    for m in re.finditer(r'\b(?:public\s+|protected\s+|private\s+)?(?:static\s+|abstract\s+|final\s+|strictfp\s+)*(?:class|interface|@interface|enum)\s+(\w+)', content):
        names.add(m.group(1))
    return names

fixed = 0
skipped = 0
problems = []

for root, dirs, files in os.walk(SOURCES):
    for f in files:
        if not f.endswith('.java'):
            continue
        
        fpath = os.path.join(root, f)
        basename = f[:-5]  # Strip .java
        
        try:
            with open(fpath, 'r', encoding='utf-8', errors='replace') as fh:
                content = fh.read()
        except Exception as e:
            problems.append(f"Can't read {fpath}: {e}")
            continue
        
        class_name = find_class_name(content)
        if class_name is None:
            continue
        
        if class_name != basename:
            new_fpath = os.path.join(root, class_name + '.java')
            
            # Check if target already exists
            if os.path.exists(new_fpath):
                # Both files exist — compare contents
                try:
                    with open(new_fpath, 'r', encoding='utf-8', errors='replace') as fh2:
                        existing_content = fh2.read()
                except:
                    existing_content = ""
                
                if content.strip() == existing_content.strip():
                    # They're the same — just remove the duplicate
                    os.remove(fpath)
                    print(f"REMOVED {fpath} (duplicate of {new_fpath})")
                    fixed += 1
                else:
                    problems.append(f"CONFLICT: {fpath} wants {class_name}.java but {new_fpath} exists with DIFFERENT content")
                    skipped += 1
            else:
                shutil.move(fpath, new_fpath)
                print(f"RENAMED {fpath} -> {new_fpath}")
                fixed += 1

print(f"\nFixed: {fixed}, Skipped: {skipped}, Problems: {len(problems)}")
for p in problems[:30]:
    print(f"  PROBLEM: {p}")
