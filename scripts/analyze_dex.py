#!/usr/bin/env python3
"""Extract class info from dexdump output for missing types."""
import subprocess
import re
import sys

DEX = "/tmp/classes.dex"
DEXDUMP = "/opt/android-sdk/build-tools/34.0.0/dexdump"

# Run dexdump
print(f"Running dexdump on {DEX}...", file=sys.stderr)
result = subprocess.run([DEXDUMP, "-d", DEX], capture_output=True, timeout=180)
# Decode with error handling and strip ANSI codes
output_raw = result.stdout + result.stderr
output = output_raw.decode('utf-8', errors='replace')
# Strip ANSI escape codes
output = re.sub(r'\x1b\[[0-9;]*[mH]', '', output)

# Targets to find
targets = [
    "Lcom/tsf/shell/f/i/a;",
    "Lcom/tsf/shell/f/i/b;",
    "Lcom/tsf/shell/f/i/c;",
    "Lcom/tsf/shell/f/i/f;",
    "Lcom/tsf/shell/f/e/f;",
    "Lcom/tsf/shell/f/e/d;",
    "Lcom/tsf/shell/f/e/h;",
    "Lcom/tsf/shell/f/d/a;",
    "Lcom/tsf/shell/a;",
    "Lcom/tsf/shell/f/d;",
    "Lcom/tsf/shell/f/d/d;",
    "Lcom/tsf/shell/f;",
    "Lcom/tsf/shell/A;",
    "Lcom/tsf/shell/B;",
    "Lcom/tsf/shell/C;",
    "Lcom/tsf/shell/D;",
    "Lcom/tsf/shell/E;",
    "Lcom/tsf/shell/F;",
    "Lcom/tsf/shell/f/D;",
    "Lcom/tsf/shell/f/e/F;",
    "Lcom/tsf/shell/f/e/f;",
    "Lcom/tsf/shell/f/i/a;",
    "Lcom/tsf/shell/f/i/A;",
    "Lcom/tsf/shell/f/i/b;",
    "Lcom/tsf/shell/f/i/B;",
    "Lcom/tsf/shell/f/i/c;",
    "Lcom/tsf/shell/f/i/C;",
    "Lcom/censivn/C3DEngine/api/element/info/b;",
    "Lcom/censivn/C3DEngine/api/element/info/B;",
]

in_class = None
class_info = {}

for line in output.split('\n'):
    # Check for class descriptor
    cm = re.search(r"Class descriptor\s+:\s+'([^']+)'", line)
    if cm:
        desc = cm.group(1)
        # Check if it matches any target
        for t in targets:
            if desc == t:
                in_class = desc
                class_info[desc] = {"access": "", "superclass": "", "interfaces": [], "fields": []}
                break
            elif in_class is not None:
                if desc != in_class:
                    in_class = None
        continue
    
    if in_class is None:
        continue
    
    # Access flags
    am = re.search(r"Access flags\s+:\s+(0x[0-9a-fA-F]+)\s+\((.+?)\)", line)
    if am:
        class_info[in_class]["access"] = am.group(2)
        continue
    
    # Superclass
    sm = re.search(r"Superclass\s+:\s+'([^']+)'", line)
    if sm:
        class_info[in_class]["superclass"] = sm.group(1)
        continue
    
    # Interfaces
    im = re.search(r"#\d+\s+:\s+'([^']+)'", line)
    if im:
        class_info[in_class]["interfaces"].append(im.group(1))
        continue
    
    # Fields
    nm = re.search(r"name\s+:\s+'(\w+)'", line)
    tm = re.search(r"type\s+:\s+'([^']+)'", line)
    if nm:
        class_info[in_class]["_last_name"] = nm.group(1)
    if tm and "_last_name" in class_info[in_class]:
        field_name = class_info[in_class].pop("_last_name")
        class_info[in_class]["fields"].append((field_name, tm.group(1)))

# Print results
for desc, info in class_info.items():
    print(f"=== {desc} ===")
    print(f"  Access: {info['access']}")
    print(f"  Superclass: {info['superclass']}")
    print(f"  Interfaces: {info['interfaces']}")
    print(f"  Fields:")
    for name, typ in info['fields'][:20]:
        print(f"    {name} : {typ}")
    print()
