#!/usr/bin/env python3
"""DEX-vs-tree completeness census (GOAL Step 0).
For every app class in the v3.9.4 DEX, determine its tree counterpart status:
  EXACT    - same FQN exists in tree (unrenamed survivors)
  LEDGER   - ledger maps dex-old-path -> tree-new-path
  OUTER    - inner class whose outer file is EXACT/LEDGER
  MISSING  - no counterpart (recovery target)
Also lists tree files with no DEX preimage (contamination suspects).
Usage: dex_tree_census.py <classes.dex> ; writes docs/DEX_TREE_CENSUS.md
"""
import struct
import subprocess
import sys

DEX = sys.argv[1]
data = open(DEX, 'rb').read()
assert data[:8] == b'dex\n035\0'
u32 = lambda off: struct.unpack('<I', data[off:off + 4])[0]
so, to, co, nc = u32(0x3C), u32(0x44), u32(0x64), u32(0x60)


def gs(i):
    p = u32(so + 4 * i)
    while data[p] & 0x80:
        p += 1
    return data[p + 1:data.index(b'\x00', p + 1)].decode('utf-8', errors='replace')


dex = set()
for ci in range(nc):
    base = co + 32 * ci
    dex.add(gs(u32(to + 4 * u32(base))))

APP_PREFIX = ('Lcom/tsf/', 'Lcom/censivn/', 'Lcom/cm/', 'Lcom/ksmobile/')
app = sorted(t for t in dex if t.startswith(APP_PREFIX))
print(f'dex total={len(dex)} app={len(app)}', file=sys.stderr)

# tree files -> path-derived FQNs
out = subprocess.run(['git', 'ls-files', 'sources/sources'],
                     capture_output=True, text=True, cwd='/home/jaja/Documents/TSF20').stdout
tree = {}
for line in out.split():
    if not line.endswith('.java'):
        continue
    fq = 'L' + line[len('sources/sources/'):-len('.java')] + ';'
    tree[fq] = line

# ledgers: old_path -> new_path (as FQNs)
led = {}


def load_ledger(path, old_i=0, new_i=1):
    try:
        f = open(path)
    except FileNotFoundError:
        return
    head = f.readline()
    for line in f:
        parts = line.rstrip('\n').split('\t')
        if len(parts) <= max(old_i, new_i):
            continue
        o, n = parts[old_i], parts[new_i]
        if not o.endswith('.java') or not n.endswith('.java'):
            continue
        of = 'L' + o[len('sources/sources/'):-5] + ';' if '/' in o else None
        nf = 'L' + n[len('sources/sources/'):-5] + ';' if '/' in n else None
        if of and nf:
            led[of] = nf


load_ledger('/home/jaja/Documents/TSF20/docs/deobfuscation_rename_ledger_definitive.tsv')
load_ledger('/home/jaja/Documents/TSF20/docs/deobfuscation_rename_ledger_complete.tsv')
load_ledger('/home/jaja/Documents/TSF20/docs/deobfuscation_rename_ledger.tsv')
print(f'ledger pairs={len(led)}', file=sys.stderr)

exact, ledg, outer, missing = [], [], [], []
covered_new = set()
for t in app:
    if t in tree:
        exact.append(t)
        covered_new.add(t)
        continue
    if t in led and led[t] in tree:
        ledg.append(t)
        covered_new.add(led[t])
        continue
    if '$' in t and t.split('$')[0] + ';' in tree:
        outer.append(t)
        continue
    # inner whose outer mapped via ledger
    if '$' in t:
        o = t.split('$')[0] + ';'
        if o in led and led[o] in tree:
            ledg.append(t)
            covered_new.add(led[o])
            continue
    missing.append(t)

orphans = sorted(p for fq, p in tree.items() if fq not in covered_new)

with open('/home/jaja/Documents/TSF20/docs/DEX_TREE_CENSUS.md', 'w') as f:
    f.write('# DEX-vs-Tree Completeness Census\n\n')
    f.write(f'Generated from v3.9.4 apksum DEX ({len(app)} app classes) vs '
            f'HEAD tree ({len(tree)} files).\n\n')
    f.write(f'- EXACT (unrenamed survivors): {len(exact)}\n')
    f.write(f'- LEDGER (rename-mapped): {len(ledg)}\n')
    f.write(f'- OUTER (inner of covered file): {len(outer)}\n')
    f.write(f'- MISSING (recovery targets): {len(missing)}\n')
    f.write(f'- ORPHANS (tree files, no DEX preimage): {len(orphans)}\n\n')
    f.write('## MISSING (dex class -> ?)\n\n')
    for t in missing:
        f.write(f'- `{t}`\n')
    f.write('\n## ORPHANS (tree file, no dex preimage)\n\n')
    for p in orphans:
        f.write(f'- `{p}`\n')

print(f'EXACT={len(exact)} LEDGER={len(ledg)} OUTER={len(outer)} '
      f'MISSING={len(missing)} ORPHANS={len(orphans)}')
