import logging, os, sys
logging.disable(logging.CRITICAL)
os.environ['ANDROGUARD_LOGGING'] = 'CRITICAL'
from androguard.misc import AnalyzeAPK

apk_path = "/home/jaja/Documents/TSF20/sources/resources/com.tsf.shell-3.9.4-free-www.apksum.com.apk"
a, d_list, dx = AnalyzeAPK(apk_path)
dex = d_list[0]

TARGET = "Lcom/tsf/shell/f/f/n$c;"
PARENT = "Lcom/tsf/shell/f/f/n;"

def get_insts(m):
    if m.get_code() is None: return []
    bc = m.get_code().get_bc()
    res = []
    i = 0
    while True:
        try:
            res.append((i, bc.get_instruction(i)))
            i += 1
        except:
            break
    return res

# ==========================================================
# PART 1: n$c - enumerate methods, find iput to n or D
# ==========================================================
print("=" * 80)
print("PART 1: Methods in n$c with iput to field 'n' or 'D'")
print("=" * 80)

for cls in dex.get_classes():
    if TARGET == cls.get_name():
        print("Class:", cls.get_name())
        print("Fields:")
        for f in cls.get_fields():
            print("  %s : %s" % (f.get_name(), f.get_descriptor()))
        print()
        
        all_methods = list(cls.get_methods())
        print("Total methods:", len(all_methods))
        print()
        
        for m in all_methods:
            insts = get_insts(m)
            # Check if this method has any iput to n or D
            has_write = False
            for idx, inst in insts:
                s = str(inst)
                if "iput" in s:
                    # Extract field reference (everything after ';->')
                    arrow = s.find(";->")
                    if arrow >= 0:
                        rest = s[arrow+3:]
                        for fn in ("n ", "n,", "D ", "D,"):
                            if rest.startswith(fn):
                                has_write = True
                                break
            if has_write:
                print(">>> %s %s <<< (CONTAINS WRITES TO n/D)" % (m.get_name(), m.get_descriptor()))
                for idx, inst in insts:
                    print("  %04d: %s" % (idx, inst))
                print()
        
        # Show ALL methods
        print("--- All methods in n$c ---")
        for m in all_methods:
            print("  %s %s" % (m.get_name(), m.get_descriptor()))
        print()

# ==========================================================
# PART 2: ALL classes - iput/sput referencing n/D of n$c
# ==========================================================
print("=" * 80)
print("PART 2: ALL classes - iput/sput referencing field n or D of n$c")
print("=" * 80)

target_fields = [
    "Lcom/tsf/shell/f/f/n$c;->n",
    "Lcom/tsf/shell/f/f/n$c;->D",
]

for cls in dex.get_classes():
    cn = cls.get_name()
    for m in cls.get_methods():
        for idx, inst in get_insts(m):
            s = str(inst)
            if "iput" in s or "sput" in s:
                for tf in target_fields:
                    if tf in s:
                        print("Class: %s" % cn)
                        print("  Method: %s %s" % (m.get_name(), m.get_descriptor()))
                        print("  %04d: %s" % (idx, inst))
                        print()

# ==========================================================
# PART 3: Parent class n fields, where n is set
# ==========================================================
print("=" * 80)
print("PART 3: Parent class n - fields and iput of field n")
print("=" * 80)

for cls in dex.get_classes():
    if PARENT == cls.get_name():
        print("Class:", cls.get_name())
        print("Fields:")
        for f in cls.get_fields():
            print("  %s : %s" % (f.get_name(), f.get_descriptor()))
        print()
        print("--- iput to field n in parent ---")
        for m in cls.get_methods():
            for idx, inst in get_insts(m):
                s = str(inst)
                if "iput" in s and ";->n " in s:
                    print("  %s %s" % (m.get_name(), m.get_descriptor()))
                    print("    %04d: %s" % (idx, inst))
        print()
        print("--- iput to field D in parent ---")
        for m in cls.get_methods():
            for idx, inst in get_insts(m):
                s = str(inst)
                if "iput" in s and ";->D " in s:
                    print("  %s %s" % (m.get_name(), m.get_descriptor()))
                    print("    %04d: %s" % (idx, inst))

# ==========================================================
# PART 4: new-instance of n$c
# ==========================================================
print()
print("=" * 80)
print("PART 4: new-instance / constructor calls of n$c across entire APK")
print("=" * 80)

for cls in dex.get_classes():
    cn = cls.get_name()
    for m in cls.get_methods():
        for idx, inst in get_insts(m):
            s = str(inst)
            if "new-instance" in s and "Lcom/tsf/shell/f/f/n$c;" in s:
                print("Class: %s" % cn)
                print("  Method: %s %s" % (m.get_name(), m.get_descriptor()))
                print("  %04d: %s" % (idx, inst))
                # Show some context
                insts = get_insts(m)
                for j in range(max(0, idx-1), min(len(insts), idx+6)):
                    print("    %04d: %s" % (insts[j][0], insts[j][1]))
                print()
            if "invoke" in s and "<init>" in s and "Lcom/tsf/shell/f/f/n$c;" in s:
                print("Class: %s" % cn)
                print("  Method: %s %s" % (m.get_name(), m.get_descriptor()))
                print("  %04d: %s" % (idx, inst))
                insts = get_insts(m)
                for j in range(max(0, idx-2), min(len(insts), idx+3)):
                    print("    %04d: %s" % (insts[j][0], insts[j][1]))
                print()

print("DONE")
