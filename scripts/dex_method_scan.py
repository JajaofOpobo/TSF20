#!/usr/bin/env python3
"""DEX structural scanner: list classes/methods by shape, not by name.
Usage: dexscan.py <classes.dex> [--methods FQN...] [--multic NAME]
Ground-truth arbiter for session-given renames (GOAL Step 0 / iterations).
"""
import struct
import sys

data = open(sys.argv[1], 'rb').read()
assert data[:8] == b'dex\n035\0', data[:8]
u32 = lambda off: struct.unpack('<I', data[off:off+4])[0]
u16 = lambda off: struct.unpack('<H', data[off:off+2])[0]
so, mo, to, po = u32(0x3C), u32(0x5C), u32(0x44), u32(0x4C)
ns, nt, co, nc = u32(0x38), u32(0x40), u32(0x64), u32(0x60)

def gs(i):
    p = u32(so + 4 * i)
    while data[p] & 0x80:
        p += 1
    return data[p + 1:data.index(b'\x00', p + 1)].decode('utf-8', errors='replace')

def tname(i):
    return gs(u32(to + 4 * i))

def uleb(p):
    r = s = 0
    while True:
        b = data[p]
        p += 1
        r |= (b & 0x7f) << s
        s += 7
        if not b & 0x80:
            return r, p

def methods_of(ci):
    """Return [(name, return_type, params_off_or_None)] for virtual+direct."""
    base = co + 32 * ci
    p = u32(base + 24)
    out = []
    if p == 0:
        return out  # no class_data (e.g. interfaces without defaults)
    # class_data_item: the four counts come FIRST, then the four arrays
    # (interleaving count+entries was the misalignment bug — verified against
    # smali b/d/a: static=0, instance=1, direct=1, virtual=14).
    counts = []
    for _ in range(4):
        n, p = uleb(p)
        counts.append(n)
    for section, n in zip(('static', 'instance', 'direct', 'virtual'), counts):
        # NB: field and method index diffs each restart per list; the
        # accumulator must NOT leak across sections (GOAL: verify, don't assume).
        last = 0
        for _ in range(n):
            d, p = uleb(p)
            last += d
            midx = last
            acc, p = uleb(p)
            if section in ('static', 'instance'):
                continue
            code, p = uleb(p)
            mproto = u16(mo + 8 * midx + 2)
            mname = u32(mo + 8 * midx + 4)
            out.append((gs(mname), tname(u32(po + 12 * mproto + 4))))
    return out

def class_index():
    idx = {}
    for ci in range(nc):
        idx[tname(u32(co + 32 * ci))] = ci
    return idx

if __name__ == '__main__':
    if '--multic' in sys.argv:
        target = sys.argv[sys.argv.index('--multic') + 1]
        for ci in range(nc):
            ms = methods_of(ci)
            rets = sorted({r for (n, r) in ms if n == target})
            if len(rets) > 1:
                print(tname(u32(co + 32 * ci)), '->', rets)
    elif '--methods' in sys.argv:
        idx = class_index()
        for fq in sys.argv[sys.argv.index('--methods') + 1:]:
            if fq.startswith('--'):
                break
            if fq not in idx:
                print(fq, 'ABSENT'); continue
            print('CLASS', fq)
            for n, r in methods_of(idx[fq]):
                if len(n) <= 3:
                    print('  ', n, '->', r.split('/')[-1].rstrip(';'))
