import logging, sys, os
logging.disable(logging.CRITICAL)
os.environ['ANDROGUARD_VERBOSE'] = '0'
import warnings
warnings.filterwarnings('ignore')

from androguard.misc import AnalyzeAPK
logging.getLogger().setLevel(logging.CRITICAL)

apk_path = "sources/resources/com.tsf.shell-3.9.4-free-www.apksum.com.apk"
a, d, dx = AnalyzeAPK(apk_path)

# Track all packages
pkgs = set()
for cls in dx.get_classes():
    name = str(cls.name)
    # Strip L prefix and ; suffix from JVM internal type format
    name_clean = name.replace('L', '').replace(';', '').replace('/', '.')
    for p in ['com.tsf', 'com.censivn', 'com.ksmobile']:
        if p in name_clean:
            pkgs.add(name_clean)
            break

print(f"=== Total classes in app packages: {len(pkgs)} ===")

# Filter by package
tsf = sorted([c for c in pkgs if 'com.tsf' in c])
censivn = sorted([c for c in pkgs if 'com.censivn' in c])
ksmobile = sorted([c for c in pkgs if 'com.ksmobile' in c])
print(f"com.tsf.*:     {len(tsf)} classes")
print(f"com.censivn.*: {len(censivn)} classes")
print(f"com.ksmobile.*: {len(ksmobile)} classes")

# C3DEngine breakdown
# C3DEngine breakdown
print("\n=== C3DEngine package breakdown ===")
c3d = {}
for c in censivn:
    parts = c.split('.')
    if len(parts) >= 5:
        key = parts[4]  # e.g. 'api', 'b', 'common'
    else:
        key = 'root'
    c3d.setdefault(key, []).append(c)
for k in sorted(c3d.keys()):
    print(f"  com.censivn.C3DEngine.{k}: {len(c3d[k])} classes")

# Find all callers of C3DEngine from TSF classes
print("\n=== TSF CLASSES THAT CALL C3DEngine ===")
callers_map = {}
for method in dx.get_methods():
    for _, call, offset in method.get_xref_to():
        cn = str(call)
        if 'Lcom/censivn/C3DEngine' not in cn:
            continue
        caller = f"{method.class_name}.{method.name}"
        callee = cn.replace('L', '').replace(';', '').replace('/', '.')
        if 'com.tsf.' in callee or 'com.tsf.' in caller:
            callers_map.setdefault(caller, set()).add(callee)

for caller in sorted(callers_map.keys()):
    print(f"  {caller}")
    for callee in sorted(callers_map[caller])[:3]:
        print(f"    -> {callee}")
    if len(callers_map[caller]) > 3:
        print(f"    ... and {len(callers_map[caller])-3} more")

# Android components
print("\n=== ANDROID COMPONENTS (Activity/Service/Provider/Receiver) ===")
for cls in dx.get_classes():
    name = str(cls.name).replace('L', '').replace(';', '').replace('/', '.')
    if 'com.tsf' not in name and 'com.censivn' not in name:
        continue
    try:
        sup = cls.get_superclass()
        if sup:
            s = str(sup)
            for kw in ['Activity', 'Service', 'Provider', 'Receiver', 'Application']:
                if kw in s:
                    short = s.split('/')[-1].split(';')[0].replace('L', '').replace(';', '')
                    print(f"  {name} extends {short}")
                    break
    except:
        pass
