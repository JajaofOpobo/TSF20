import logging, os, sys
logging.disable(logging.CRITICAL)
os.environ['ANDROGUARD_LOGGING'] = 'CRITICAL'

from androguard.misc import AnalyzeAPK

apk_path = "/home/jaja/Documents/TSF20/sources/resources/com.tsf.shell-3.9.4-free-www.apksum.com.apk"
a, d_list, dx = AnalyzeAPK(apk_path)
dex = d_list[0]

# Find classes containing n$c
for cls in dex.get_classes():
    name = cls.get_name()
    if "n$c" in name:
        sys.stdout.write("Found class: %s\n" % name)
        sys.stdout.write("Fields:\n")
        for f in cls.get_fields():
            sys.stdout.write("  %s : %s\n" % (f.get_name(), f.get_descriptor()))

sys.stdout.write("---\n")

# Try a broader search for n and D fields
for cls in dex.get_classes():
    name = cls.get_name()
    for f in cls.get_fields():
        if f.get_name() == "n" or f.get_name() == "D":
            sys.stdout.write("Field %s in class %s type %s\n" % (f.get_name(), name, f.get_descriptor()))

sys.stdout.write("DONE\n")
sys.stdout.flush()
