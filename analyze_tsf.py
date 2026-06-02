from androguard.misc import AnalyzeAPK

APK_PATH = "/home/jaja/Documents/TSF20/sources/resources/com.tsf.shell-3.9.4-free-www.apksum.com.apk"

a, d, dx = AnalyzeAPK(APK_PATH)


def print_method_info(method):
    print(f"  Method: {method.get_name()}")
    print(f"  Descriptor: {method.get_descriptor()}")
    access_flags = method.get_access_flags()
    is_native = bool(access_flags & 0x0100)
    print(f"  Access flags: 0x{access_flags:04x} {'(NATIVE)' if is_native else ''}")
    try:
        code = method.get_code()
        bc = code.get_bc()
        idx = 0
        instrs = []
        while True:
            try:
                inst = bc.get_instruction(idx)
                instrs.append(f"  {idx:04d}: {inst}")
                idx += 1
            except IndexError:
                break
        print(f"  Instruction count: {len(instrs)}")
        for line in instrs:
            print(line)
    except AttributeError as e:
        print(f"  No bytecode (likely native/abstract): {e}")
    print()


def process_class(class_name):
    print(f"{'='*60}")
    print(f"CLASS: {class_name}")
    print(f"{'='*60}")
    try:
        clazz = dx.get_class(class_name)
    except Exception as e:
        print(f"  ERROR: Could not find class - {e}\n")
        return
    methods = clazz.get_methods()
    print(f"  Total methods found: {len(methods)}\n")
    for method in methods:
        print_method_info(method)


CLASSES = [
    "Lcom/tsf/shell/f/f/n$c;",
    "Lcom/tsf/shell/f/f/n$c$7;",
    "Lcom/tsf/shell/f/f/n$c$6;",
    "Lcom/tsf/shell/f/f/n$c$3;",
    "Lcom/tsf/shell/f/f/n$c$2;",
]

for cls in CLASSES:
    process_class(cls)
