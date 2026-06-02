"""Extract shader source strings from v3.9.4 DEX.
Finds all callers of Shader.createProgram(String, String) and extracts vertex/fragment GLSL."""
import logging, os, sys
logging.disable(logging.CRITICAL)
os.environ['ANDROGUARD_VERBOSE'] = '0'
import warnings
warnings.filterwarnings('ignore')

from androguard.misc import AnalyzeAPK

apk_path = "sources/resources/com.tsf.shell-3.9.4-free-www.apksum.com.apk"
a, d, dx = AnalyzeAPK(apk_path)

OUT = "docs/runtime_analysis/shaders_v3"
os.makedirs(OUT, exist_ok=True)

# Strategy 1: Check each Shader* class for embedded GLSL strings in <clinit> or createProgram
print("=== Strategy 1: Check Shader* classes for embedded strings ===")
shader_prefix = 'Lcom/censivn/C3DEngine/common/shader/Shader'
for cls in d.get_classes():
    name = str(cls.get_name())
    if not name.startswith(shader_prefix):
        continue
    clean = name.replace('/', '.').lstrip('L').rstrip(';')
    short = name.split('/')[-1].rstrip(';')
    
    # Check all methods for const-string with GLSL
    found_shaders = []
    for meth in cls.get_methods():
        code = meth.get_code()
        if not code: 
            continue
        bc = code.get_bc()
        for instr in bc.get_bc():
            if instr.get_name() == 'const-string':
                try:
                    sval = instr.get_string()
                    if 'attribute' in sval or 'varying' in sval or 'gl_Position' in sval or 'gl_FragColor' in sval or 'precision' in sval:
                        typ = 'VERTEX' if 'attribute' in sval else 'FRAGMENT'
                        found_shaders.append((meth.get_name(), typ, sval))
                except:
                    pass
    
    if found_shaders:
        print(f"\n{clean} ({len(found_shaders)} shader strings):")
        for mname, typ, sval in found_shaders:
            fn = f"{OUT}/{short}_{mname}_{typ}.glsl"
            print(f"  {mname}: {typ} ({len(sval)} chars)")
            with open(fn, 'w') as f:
                f.write(sval)

# Strategy 2: Find all callers of Shader.createProgram(String, String)
print(f"\n\n=== Strategy 2: Find createProgram(String,String) callers ===")

# Find the Shader.createProgram method reference
target_method = None
for cls in d.get_classes():
    if str(cls.get_name()) == 'Lcom/censivn/C3DEngine/common/shader/Shader;':
        for m in cls.get_methods():
            if m.get_name() == 'createProgram':
                target_method = m
                break

if target_method:
    print(f"Found Shader.createProgram: {target_method.get_descriptor()}")
    
    # Get all xref to this method
    callers = set()
    for meth in dx.get_methods():
        for _, call, offset in meth.get_xref_to():
            if str(call) == str(target_method):
                caller_key = f"{meth.class_name}.{meth.name}"
                callers.add(caller_key)
                # Extract const-string values from this method
                print(f"\nCaller: {caller_key}")
                code = meth.get_code()
                if code:
                    bc = code.get_bc()
                    strings_found = []
                    for instr in bc.get_bc():
                        if instr.get_name() == 'const-string':
                            try:
                                sval = instr.get_string()
                                if len(sval) > 50:  # Only print long strings (potential GLSL)
                                    strings_found.append(sval)
                            except:
                                pass
                    for i, s in enumerate(strings_found):
                        is_shader = 'attribute' in s or 'varying' in s or 'gl_Position' in s or 'gl_FragColor' in s or 'precision' in s
                        marker = ' [SHADER]' if is_shader else ' [LONG STRING]'
                        print(f"  [{i}] ({len(s)} chars){marker}: {'...' if len(s) > 200 else s}")
                        if is_shader:
                            # Determine type
                            typ = 'VERTEX' if 'attribute' in s else 'FRAGMENT'
                            caller_short = caller_key.replace('/', '.').replace('L', '').split(';')[0] if ';' in caller_key else caller_key
                            fn = f"{OUT}/caller_{caller_short.replace('.', '_')}_{typ}.glsl"
                            # Check for duplicates
                            if not os.path.exists(fn):
                                with open(fn, 'w') as f:
                                    f.write(s)
                                print(f"    -> saved to {fn}")

print(f"\nDone. Shaders saved to {OUT}/")
