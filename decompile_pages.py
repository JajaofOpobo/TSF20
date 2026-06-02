import logging, sys
for name in ["", "androguard", "androguard.core", "androguard.core.bytecodes", "androguard.core.analysis"]:
    logging.getLogger(name).setLevel(logging.CRITICAL)

from androguard.misc import AnalyzeAPK

APK_PATH = "/home/jaja/Documents/TSF20/sources/resources/com.tsf.shell-3.9.4-free-www.apksum.com.apk"

a, d, dx = AnalyzeAPK(APK_PATH)

TARGETS = [
    "com/tsf/shell/f/e/j",
    "com/tsf/shell/f/e/j$2",
    "com/tsf/shell/f/e/j$4",
    "com/tsf/shell/f/e/j$5",
    "com/tsf/shell/f/f/b/a",
    "com/tsf/shell/f/f/b/a$1",
    "com/tsf/shell/f/f/b/a$2",
    "com/tsf/shell/f/f/l",
]

SEP = "=" * 80
SUBSEP = "-" * 60

def print_instructions(em):
    try:
        code = em.get_code()
        if code is None:
            print("  (no code / native/abstract)")
            return
        bc = code.get_bc()
        instructions = list(bc.get_instructions())
        print(f"  Instruction Count: {len(instructions)}")
        print()
        for i, ins in enumerate(instructions):
            try:
                print(f"    {i:4d}: {ins.get_name()} {ins.get_output()}")
            except IndexError:
                print(f"    {i:4d}: {ins.get_name()} (output unavailable)")
            except Exception as e2:
                print(f"    {i:4d}: {ins.get_name()} - error: {e2}")
    except AttributeError:
        print("  Instruction Count: 0 (no bytecode)")
    except Exception as e:
        print(f"  (bytecode error: {e})")

def print_method(ma):
    em = ma.get_method()
    print(f"  Method: {em.name}")
    print(f"  Descriptor: {em.descriptor}")
    print(f"  Access Flags: {em.get_access_flags_string()}")
    print_instructions(em)
    print()

for target in TARGETS:
    print(SEP)
    print(f"CLASS: {target}")
    print(SEP)
    full_name = target if target.startswith("L") else f"L{target};"
    try:
        cl = dx.classes[full_name]
    except KeyError:
        print("  CLASS NOT FOUND")
        print()
        continue
    methods = cl.get_methods()
    for m in methods:
        print(SUBSEP)
        print_method(m)

print(SEP)
print("DONE")
