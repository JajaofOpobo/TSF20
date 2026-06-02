from androguard.misc import AnalyzeAPK

APK_PATH = "/home/jaja/Documents/TSF20/sources/resources/com.tsf.shell-3.9.4-free-www.apksum.com.apk"

TARGET_CLASSES = [
    "Lcom/tsf/shell/f/f/n$c$1;",
    "Lcom/tsf/shell/f/f/n$c$4;",
    "Lcom/tsf/shell/f/f/n$c$5;",
    "Lcom/tsf/shell/f/f/n$c$8;",
    "Lcom/tsf/shell/f/f/n$c$9;",
    "Lcom/tsf/shell/f/f/n$c$a;",
]

a, d, dx = AnalyzeAPK(APK_PATH)

for cls_name in TARGET_CLASSES:
    print(f"\n{'='*80}")
    print(f"CLASS: {cls_name}")
    print(f"{'='*80}")

    cls = dx.classes.get(cls_name)
    if cls is None:
        print(f"  [NOT FOUND]")
        continue

    methods = cls.get_methods()
    print(f"  Total methods: {len(methods)}")
    print()

    for method in methods:
        m = method.get_method() if hasattr(method, 'get_method') else method.method
        print(f"  --- Method: {m.name} ---")
        print(f"    Descriptor:   {m.descriptor}")
        print(f"    Access Flags: {m.get_access_flags_string()}")
        if not hasattr(m, 'get_code') or m.get_code() is None:
            print(f"    [NO CODE / ABSTRACT / NATIVE]")
            print()
            continue
        code = m.get_code()
        bc = code.get_bc()
        inst_count = bc.get_length()
        print(f"    Instruction count: {inst_count}")
        print()

        idx = 0
        while True:
            try:
                inst = bc.get_instruction(idx)
                print(f"      {idx:04d}: {inst}")
                idx += 1
            except IndexError:
                break
        print()
