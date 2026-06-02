from androguard.misc import AnalyzeAPK

APK_PATH = "/home/jaja/Documents/TSF20/sources/resources/com.tsf.shell-3.9.4-free-www.apksum.com.apk"

a, d, dx = AnalyzeAPK(APK_PATH)
dex = d[0]


def print_method_bytecode(method):
    print(f"  Method: {method.get_name()}")
    print(f"  Descriptor: {method.get_descriptor()}")
    access = method.get_access_flags()
    is_native = bool(access & 0x0100)
    is_abstract = bool(access & 0x0400)
    print(f"  Access flags: 0x{access:04x} {'(NATIVE)' if is_native else ''}{'(ABSTRACT)' if is_abstract else ''}")
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
    except Exception as e:
        print(f"  No bytecode: {e}")
    print()


def process_class(class_name, label=None):
    if label is None:
        label = class_name
    try:
        clazz = dex.get_class(class_name)
    except Exception as e:
        print(f"{'='*60}")
        print(f"CLASS: {label} -- NOT FOUND: {e}")
        print(f"{'='*60}\n")
        return

    methods = clazz.get_methods()
    print(f"{'='*60}")
    print(f"CLASS: {label}")
    print(f"Total methods: {len(methods)}")
    print(f"{'='*60}\n")

    for m in methods:
        print_method_bytecode(m)


# 1. n$c -- all methods, but highlight d()V
process_class("Lcom/tsf/shell/f/f/n$c;", "com.tsf.shell.f.f.n$c")

# 2. n$c$7
process_class("Lcom/tsf/shell/f/f/n$c$7;", "com.tsf.shell.f.f.n$c$7")

# 3. n$c$6
process_class("Lcom/tsf/shell/f/f/n$c$6;", "com.tsf.shell.f.f.n$c$6")

# 4. n$c$3
process_class("Lcom/tsf/shell/f/f/n$c$3;", "com.tsf.shell.f.f.n$c$3")

# 5. n$c$2
process_class("Lcom/tsf/shell/f/f/n$c$2;", "com.tsf.shell.f.f.n$c$2")
