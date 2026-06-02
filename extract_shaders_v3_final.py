"""Extract GLSL shader strings from v3.9.4 DEX - from constructor field assignments."""
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

def extract_glsl(class_filter, method_names=('<init>',), descriptor='()V'):
    """Extract vertex/fragment GLSL from const-strings in a method."""
    vertex = None
    fragment = None
    for cls in dx.get_classes():
        if class_filter not in str(cls.name):
            continue
        vm = cls.get_vm_class()
        for m in vm.get_methods():
            if m.get_name() not in method_names or m.get_descriptor() != descriptor:
                continue
            code = m.get_code()
            if not code:
                continue
            bc = code.get_bc()
            n_ins = len(bc.cached_instructions) if hasattr(bc, 'cached_instructions') and bc.cached_instructions else bc.size
            for i in range(n_ins):
                try:
                    ins = bc.get_instruction(i)
                except IndexError:
                    break
                if ins.get_name() == 'const-string':
                    try:
                        sval = ins.get_string()
                        if 'gl_Position' in sval or 'attribute' in sval:
                            vertex = sval
                        elif 'gl_FragColor' in sval or 'texture2D' in sval:
                            fragment = sval
                    except:
                        pass
    return vertex, fragment

shader_classes = [
    'ShaderAlpha', 'ShaderColor', 'ShaderColorMatrixTexture',
    'ShaderColorTexture', 'ShaderFillColorTexture', 'ShaderStandard',
    'ShaderTextureMatrix'
]

for sc in shader_classes:
    v, f = extract_glsl(sc, method_names=('<clinit>', '<init>'))
    if v:
        p = f"{OUT}/{sc}_VERTEX.glsl"
        with open(p, 'w') as fh:
            fh.write(v)
        print(f"{sc}: VERTEX ({len(v)} chars) -> {p}")
    if f:
        p = f"{OUT}/{sc}_FRAGMENT.glsl"
        with open(p, 'w') as fh:
            fh.write(f)
        print(f"{sc}: FRAGMENT ({len(f)} chars) -> {p}")
    if not v and not f:
        print(f"{sc}: no GLSL strings found")

print("\nDone.")
