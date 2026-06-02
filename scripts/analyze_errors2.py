#!/usr/bin/env python3
"""Analyze all errors and categorize missing symbols."""
import re

with open('/home/ubuntu/Documents/TSF20/docs/build-output-linux3.txt', encoding='utf-8', errors='replace') as f:
    content = f.read()

# Remove ANSI codes
content = re.sub(r'\x1b\[[0-9;]*[mH]', '', content)

# Parse all errors
errors = []
lines = content.split('\n')
i = 0
while i < len(lines):
    line = lines[i]
    m = re.match(r'(.+):(\d+): error: (.+)', line)
    if m:
        fpath = m.group(1)
        lineno = int(m.group(2))
        msg = m.group(3)
        
        # Look ahead for next lines
        detail_lines = []
        j = i + 1
        while j < len(lines) and lines[j].startswith('  ') and not lines[j].startswith('  Note:'):
            detail_lines.append(lines[j].strip())
            j += 1
        
        # Extract symbol and location
        symbol = None
        location = None
        for dl in detail_lines:
            sm = re.search(r'symbol:\s+(class|variable|method)\s+(\S+)', dl)
            if sm:
                symbol = sm.group(2)
            lm = re.search(r'location:\s+(class|package)\s+(\S+)', dl)
            if lm:
                location = lm.group(2)
        
        # Extract the actual code line
        code_line = ''
        if j > i + 1:
            code_line = lines[i+1].strip() if i+1 < len(lines) else ''
        
        errors.append({
            'file': fpath.split('/sources/')[-1] if '/sources/' in fpath else fpath,
            'line': lineno,
            'msg': msg,
            'symbol': symbol,
            'location': location,
            'code': code_line,
        })
        i = j - 1
    i += 1

# Categorize
from collections import Counter
categories = Counter()
for e in errors:
    if 'cyclic inheritance' in e['msg']:
        categories['cyclic_inheritance'] += 1
    elif 'cannot inherit from final' in e['msg']:
        categories['extends_final'] += 1
    elif 'modifier' in e['msg']:
        categories['modifier_error'] += 1
    elif 'package a does not exist' in e['msg']:
        categories['package_a_not_exist'] += 1
    elif e['symbol'] == 'Object':
        categories['missing_Object'] += 1
    elif e['symbol']:
        categories[f"missing_{e['symbol']}"] += 1
    else:
        categories[f"other_{e['msg'][:40]}"] += 1

print("=== ERROR CATEGORIES ===")
for k, v in categories.most_common(50):
    print(f"  {v:3d}x {k}")

print("\n=== MISSING SYMBOLS (by package location) ===")
missing = [(e['location'] or '?', e['symbol'] or '?', e['file'], e['line']) for e in errors if e['symbol']]
for loc, sym, f, l in sorted(set(missing)):
    print(f"  {loc} : {sym}  (first seen in {f}:{l})")

print("\n=== ALL ERRORS ===")
for e in errors:
    print(f"  {e['file']}:{e['line']}: {e['msg'][:60]}")
    if e['code']:
        print(f"    code: {e['code'][:80]}")
    print()
