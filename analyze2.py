import logging, os, sys
logging.disable(logging.CRITICAL)
os.environ['ANDROGUARD_LOGGING'] = 'CRITICAL'

from androguard.misc import AnalyzeAPK

apk_path = "/home/jaja/Documents/TSF20/sources/resources/com.tsf.shell-3.9.4-free-www.apksum.com.apk"
a, d_list, dx = AnalyzeAPK(apk_path)
dex = d_list[0]

TARGET = "com/tsf/shell/f/f/n$c"

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

for cls in dex.get_classes():
    if TARGET == cls.get_name():
        sys.stdout.write("CLASS: " + cls.get_name() + "\n")
        sys.stdout.write("Fields:\n")
        for f in cls.get_fields():
            sys.stdout.write("  %s : %s\n" % (f.get_name(), f.get_descriptor()))
        sys.stdout.write("\nALL iput in n$c:\n")
        for m in cls.get_methods():
            for idx, inst in get_insts(m):
                s = str(inst)
                if "iput" in s:
                    sys.stdout.write("%s:%04d: %s\n" % (m.get_name(), idx, s))
        sys.stdout.write("\nFiltered for field 'n' or 'D':\n")
        for m in cls.get_methods():
            for idx, inst in get_insts(m):
                s = str(inst)
                # check if string contains iput AND (target field is n or D)
                if "iput" in s:
                    # fields in the instruction are at the end like "Lcom/...;->n F"
                    # or "Lcom/...;->n I"
                    for fn in (" n ", " n,", " D ", " D,"):
                        if fn in s:
                            sys.stdout.write("FOUND: %s:%04d: %s\n" % (m.get_name(), idx, s))
                if "iput" in s:
                    # Also check for field name at end of string
                    if s.endswith(" n") or s.endswith(" D"):
                        sys.stdout.write("FOUND: %s:%04d: %s\n" % (m.get_name(), idx, s))
        sys.stdout.write("\n")
        sys.stdout.flush()
sys.stdout.write("DONE\n")
sys.stdout.flush()
