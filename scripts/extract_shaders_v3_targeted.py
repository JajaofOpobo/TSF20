"""Extract GLSL shader strings from v3.9.4 DEX - targeted approach."""
import logging, os
logging.disable(logging.CRITICAL)
os.environ['ANDROGUARD_VERBOSE'] = '0'
import warnings
warnings.filterwarnings('ignore')
from androguard.misc import AnalyzeAPK

apk_path = "sources/resources/com.tsf.shell-3.9.4-free-www.apksum.com.apk"
a, d, dx = AnalyzeAPK(apk_path)

OUT = "docs/runtime_analysis/shaders_v3"
os.makedirs(OUT, exist_ok=True)

def extract_const_strings(meth):
    """Extract all const-string values from a method."""
    strings = []
    code = meth.get_code()
    if not code:
        return strings
    bc = code.get_bc()
    for instr in bc.get_bc():
        if instr.get_name() == 'const-string':
            try:
                sval = instr.get_string()
                strings.append(sval)
            except:
                pass
    return strings

def save_shader(short_name, source_name, vertex_str, frag_str):
    """Save vertex and fragment shader strings."""
    vfn = f"{OUT}/{short_name}_{source_name}_VERTEX.glsl"
    ffn = f"{OUT}/{short_name}_{source_name}_FRAGMENT.glsl"
    with open(vfn, 'w') as f:
        f.write(vertex_str)
    with open(ffn, 'w') as f:
        f.write(frag_str)
    print(f"  Saved: {vfn} ({len(vertex_str)} chars)")
    print(f"  Saved: {ffn} ({len(frag_str)} chars)")

# Strategy A: Check all Shader* subclass createProgram() methods for embedded strings
print("=== Strategy A: Embedded strings in Shader* createProgram() ===")
shader_base = 'Lcom/censivn/C3DEngine/common/shader/Shader'
for cls in dx.get_classes():
    name = str(cls.name)
    if not name.startswith(shader_base):
        continue
    short = name.split('/')[-1].rstrip(';')
    
    for m in cls.get_methods():
        if m.name != 'createProgram':
            continue
        strings = extract_const_strings(m)
        # Look for pairs of GLSL strings
        vertex = None
        fragment = None
        for s in strings:
            if 'attribute' in s or 'gl_Position' in s:
                vertex = s
            elif 'gl_FragColor' in s or 'precision' in s:
                fragment = s
        
        if vertex and fragment:
            print(f"\n{short}.{m.name}: embedded shaders found")
            save_shader(short, 'embedded', vertex, fragment)
        elif strings:
            print(f"\n{short}.{m.name}: {len(strings)} strings, {len([s for s in strings if len(s) > 50])} long")

# Strategy B: Check ShaderColor.<init> for the strings passed to createProgram
print("\n\n=== Strategy B: ShaderColor construction ===")
for cls in dx.get_classes():
    name = str(cls.name)
    if 'Lcom/censivn/C3DEngine/common/shader/ShaderColor;' not in name:
        continue
    for m in cls.get_methods():
        if m.name == '<init>':
            strings = extract_const_strings(m)
            vertex = None
            fragment = None
            for s in strings:
                if 'attribute' in s or 'gl_Position' in s:
                    vertex = s
                elif 'gl_FragColor' in s or 'precision' in s:
                    fragment = s
            if vertex and fragment:
                print(f"\nShaderColor.<init>: embedded shaders found")
                save_shader('ShaderColor', 'init', vertex, fragment)

# Strategy C: Check callers of ShaderColor.<init> for shader string sources
print("\n\n=== Strategy C: External callers of ShaderColor() ===")
for cls in dx.get_classes():
    name = str(cls.name)
    if name != 'Lcom/censivn/C3DEngine/common/shader/ShaderColor;':
        continue
    for m in cls.get_methods():
        if m.name == '<init>':
            # Find xref from this constructor
            for caller_cls, caller_meth, offset in m.get_xref_from():
                caller = f"{caller_cls.name}.{caller_meth.name}"
                print(f"\nCaller of ShaderColor.<init>: {caller}")
                strings = extract_const_strings(caller_meth)
                vertex = None
                fragment = None
                for s in strings:
                    if 'attribute' in s or 'gl_Position' in s or 'gl_Position' in s:
                        vertex = s
                    elif 'gl_FragColor' in s or 'precision' in s or 'main()' in s:
                        fragment = s
                if vertex and fragment:
                    print(f"  Shader strings found!")
                    caller_short = caller.replace('/', '_').replace('L', '').replace(';', '')
                    save_shader(f'caller_{caller_short}', 'args', vertex, fragment)
                else:
                    for s in strings:
                        if len(s) > 100:
                            print(f"  [{len(s)}c]: {s[:80]}...")

# Strategy D: Check ShaderManager for shader string definitions
print("\n\n=== Strategy D: ShaderManager ===")
for cls in dx.get_classes():
    name = str(cls.name)
    if 'ShaderManager' not in name:
        continue
    print(f"\nShaderManager class: {name}")
    for m in cls.get_methods():
        strings = extract_const_strings(m)
        for s in strings:
            if len(s) > 100:
                is_shader = 'attribute' in s or 'gl_FragColor' in s
                marker = ' [SHADER]' if is_shader else ''
                print(f"  {m.name}: [{len(s)}c]{marker}: {s[:80]}...")
                if is_shader:
                    typ = 'VERTEX' if 'attribute' in s else 'FRAGMENT'
                    fn = f"{OUT}/ShaderManager_{m.name}_{typ}.glsl"
                    with open(fn, 'w') as f:
                        f.write(s)
                    print(f"    -> saved to {fn}")

print(f"\nDone. Shaders saved to {OUT}/")
