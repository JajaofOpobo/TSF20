from androguard.misc import AnalyzeAPK

apk_path = "/home/jaja/Documents/TSF20/sources/resources/com.tsf.shell-3.9.4-free-www.apksum.com.apk"
a, d_list, dx = AnalyzeAPK(apk_path)

dex = d_list[0]

TARGET_CLASS = "com/tsf/shell/f/f/n$c"
PARENT_CLASS = "com/tsf/shell/f/f/n"
FIELD_NAMES = ["n", "D"]

def get_instructions(method):
    code = method.get_code()
    if code is None:
        return []
    bc = code.get_bc()
    instructions = []
    idx = 0
    while True:
        try:
            inst = bc.get_instruction(idx)
            instructions.append((idx, inst))
            idx += 1
        except IndexError:
            break
    return instructions

def dump_method(method):
    print(f"  Method: {method.get_name()} {method.get_descriptor()}")
    for idx, inst in get_instructions(method):
        print(f"    {idx:04d}: {inst}")

def field_refers_to_target(inst, field_name):
    """Check if an iput/sput instruction references field_name of target class."""
    s = str(inst)
    # Check if the instruction string contains the field name
    return field_name in s

# ============================================================
# PART 1: Enumerate ALL methods in n$c, check for iput to n or D
# ============================================================
print("=" * 80)
print("PART 1: Methods in com/tsf/shell/f/f/n$c with iput to field 'n' or 'D'")
print("=" * 80)

for cls in dex.get_classes():
    if TARGET_CLASS in cls.get_name():
        print(f"\nClass: {cls.get_name()}")
        all_methods = list(cls.get_methods())
        print(f"Total methods: {len(all_methods)}")
        for method in cls.get_methods():
            found = False
            for idx, inst in get_instructions(method):
                for fn in FIELD_NAMES:
                    if fn in str(inst) and ("iput" in str(inst) or "sput" in str(inst)):
                        found = True
                        break
                if found:
                    break
            if found:
                print(f"\n  +++ Found writes to target fields +++")
                print(f"  Method: {method.get_name()} {method.get_descriptor()}")
                for idx, inst in get_instructions(method):
                    print(f"    {idx:04d}: {inst}")
                # Print the full method in a more readable format
                print()
                # Also print disassembled version
                if method.get_code():
                    print(f"  === Full disassembly of {method.get_name()} ===")
                    for idx, inst in get_instructions(method):
                        print(f"    {idx:04d}: {inst}")
        # Also print all methods even without writes
        print(f"\n  --- All methods in {cls.get_name()} ---")
        for method in cls.get_methods():
            print(f"    Method: {method.get_name()} {method.get_descriptor()}")

# ============================================================
# PART 2: Search ALL classes for iput/sput referencing n or D of n$c
# ============================================================
print("\n" + "=" * 80)
print("PART 2: ALL classes - any iput/sput referencing field 'n' or 'D' of n$c")
print("=" * 80)

for cls in dex.get_classes():
    class_name = cls.get_name()
    for method in cls.get_methods():
        for idx, inst in get_instructions(method):
            for fn in FIELD_NAMES:
                s = str(inst)
                if fn in s and ("iput" in s or "sput" in s):
                    print(f"\nClass: {class_name}")
                    print(f"  Method: {method.get_name()} {method.get_descriptor()}")
                    print(f"  Instruction: {idx:04d}: {inst}")

# ============================================================
# PART 3: Parent class com/tsf/shell/f/f/n fields and methods
# ============================================================
print("\n" + "=" * 80)
print("PART 3: Parent class com/tsf/shell/f/f/n - fields, methods, field 'n' sets")
print("=" * 80)

for cls in dex.get_classes():
    if PARENT_CLASS in cls.get_name():
        print(f"\nClass: {cls.get_name()}")
        print("\n  Fields:")
        for field in cls.get_fields():
            print(f"    {field.get_name()} : {field.get_descriptor()}")
        print("\n  Methods:")
        for method in cls.get_methods():
            print(f"\n    Method: {method.get_name()} {method.get_descriptor()}")
            if method.get_code():
                for idx, inst in get_instructions(method):
                    print(f"      {idx:04d}: {inst}")
        # Search for iput of field n within parent
        print("\n  --- iput of field 'n' or 'D' in parent ---")
        for method in cls.get_methods():
            for idx, inst in get_instructions(method):
                s = str(inst)
                for fn in FIELD_NAMES:
                    if fn in s and ("iput" in s or "sput" in s):
                        print(f"  Method: {method.get_name()} {method.get_descriptor()}")
                        print(f"  {idx:04d}: {inst}")

# ============================================================
# PART 4: Search for new-instance or constructor call of n$c
# ============================================================
print("\n" + "=" * 80)
print("PART 4: new-instance / constructor calls of n$c across entire APK")
print("=" * 80)

# The constructor descriptor for n$c
# Look for "new-instance" + TARGET_CLASS or invoke of <init> on TARGET_CLASS
for cls in dex.get_classes():
    class_name = cls.get_name()
    for method in cls.get_methods():
        for idx, inst in get_instructions(method):
            s = str(inst)
            if "new-instance" in s and TARGET_CLASS in s:
                print(f"\nClass: {class_name}")
                print(f"  Method: {method.get_name()} {method.get_descriptor()}")
                print(f"  {idx:04d}: {inst}")
                # Print surrounding context
                instrs = get_instructions(method)
                for j in range(max(0, idx - 2), min(len(instrs), idx + 10)):
                    print(f"    {instrs[j][0]:04d}: {instrs[j][1]}")
            if "invoke" in s and TARGET_CLASS in s and "<init>" in s:
                print(f"\nClass: {class_name}")
                print(f"  Method: {method.get_name()} {method.get_descriptor()}")
                print(f"  {idx:04d}: {inst}")
                instrs = get_instructions(method)
                for j in range(max(0, idx - 5), min(len(instrs), idx + 3)):
                    print(f"    {instrs[j][0]:04d}: {instrs[j][1]}")

print("\n" + "=" * 80)
print("DONE")
print("=" * 80)
