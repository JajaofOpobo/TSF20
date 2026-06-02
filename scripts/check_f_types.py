#!/usr/bin/env python3
"""Check if both f and F types exist in DEX."""
import subprocess
import re

DEX = "/tmp/classes.dex"
DEXDUMP = "/opt/android-sdk/build-tools/34.0.0/dexdump"

result = subprocess.run([DEXDUMP, "-d", DEX], capture_output=True, timeout=180)
output_raw = result.stdout + result.stderr
output = output_raw.decode('utf-8', errors='replace')
output = re.sub(r'\x1b\[[0-9;]*[mH]', '', output)

targets = [
    'Lcom/tsf/shell/f/e/f;',
    'Lcom/tsf/shell/f/e/F;',
    'Lcom/tsf/shell/f/i/f;',
    'Lcom/tsf/shell/f/i/F;',
    'Lcom/tsf/shell/f/d;', 
    'Lcom/tsf/shell/f/d/d;',
    'Lcom/tsf/shell/a;',
    'Lcom/tsf/shell/f;',
    'Lcom/tsf/shell/f/e/d;',
    'Lcom/tsf/shell/f/e/h;',
]

found = set()
for line in output.split('\n'):
    m = re.search(r'Class descriptor\s+:\s+\'(L[^;]+)\'', line)
    if m:
        desc = m.group(1)
        if desc in targets:
            found.add(desc)
            print(f'FOUND: {desc}')

# Also do a substring search
for line in output.split('\n'):
    for t in targets:
        short = t.replace('Lcom/tsf/shell/', '').replace(';', '')
        if 'Class descriptor' in line and short in line and t not in found:
            found.add(t)
            print(f'SUBSTR FOUND: {t}')

not_found = [t for t in targets if t not in found]
for t in not_found:
    print(f'NOT FOUND: {t}')
