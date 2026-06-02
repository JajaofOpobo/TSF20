import logging, sys, os
logging.disable(logging.CRITICAL)
os.environ['ANDROGUARD_VERBOSE'] = '0'
import warnings
warnings.filterwarnings('ignore')

from androguard.misc import AnalyzeAPK

apk_path = "sources/resources/com.tsf.shell-3.9.4-free-www.apksum.com.apk"
a, d, dx = AnalyzeAPK(apk_path)

# Known categories from runtime_analysis.md + deobfuscation map
KNOWN_CATEGORIES = {
    'a': 'Engine Core (SurfaceView, GL Thread, context, lifecycle)',
    'b': 'Worker Subsystems (scene/container/layout managers)',
    'c': 'Data Parser Layer (XML/JSON/Bitmap/Binary parsing)',
    'd': 'Notification State Manager',
    'e': 'Theme/Widget/Drawable System',
    'f': 'Internal Scene Graph (VObject3d/VObject3dContainer equivalents)',
    'g': 'Page Transition Engine',
    'h': 'Interaction/Widget Display System (folder, drawer, touch)',
    'i': 'Engine Core Utilities',
    'Utils': 'Engine Utils (native methods)',
    'core': 'Public API - Core Scene Graph',
    'element': 'Public API - Element Types',
    'effects': 'Public API - Effects Stack',
    'event': 'Public API - Mouse Events',
    'message': 'Public API - Message Queue',
    'primitives': 'Public API - Primitives (Rectangle, Button)',
    'renderer': 'Public API - MatrixStack, ShaderManager',
    'resources': 'Public API - Resource',
    'shader': 'Public API - Shader Programs',
    'shell': 'Public API - Shell Utilities',
    'tween': 'Public API - Tween/Animation',
}

# Collect all C3DEngine classes with metadata
c3d_classes = []
for cls in dx.get_classes():
    name = str(cls.name)
    if 'Lcom/censivn/C3DEngine' not in name:
        continue
    name_clean = name.replace('L', '').replace(';', '').replace('/', '.')
    
    # Get superclass via VM class
    sup = ''
    try:
        vm = cls.get_vm_class()
        if vm:
            s = vm.get_superclassname()
            if s:
                sup = str(s).replace('L', '').replace(';', '').replace('/', '.')
    except:
        pass
    
    # Get interfaces via VM class
    interfaces = []
    try:
        vm = cls.get_vm_class()
        if vm:
            for iface in vm.get_interfaces():
                ifstr = str(iface).replace('L', '').replace(';', '').replace('/', '.')
                interfaces.append(ifstr)
    except:
        pass
    
    # Get fields
    fields = []
    try:
        for f in cls.get_fields():
            fields.append(str(f.name))
    except:
        pass
    
    # Get methods
    methods = []
    try:
        for m in cls.get_methods():
            mname = str(m.name)
            mdesc = str(m.get_descriptor())
            try:
                macc = str(m.get_access_flags_string())
            except:
                macc = ''
            methods.append((mname, mdesc, macc))
    except:
        pass
    
    c3d_classes.append({
        'name': name_clean,
        'super': sup,
        'interfaces': interfaces,
        'fields': fields,
        'methods': methods,
        'is_inner': '$' in name_clean,
        'is_anonymous': name_clean.count('$') >= 2 or (name_clean.endswith('$1') or name_clean.endswith('$2') or name_clean.endswith('$3') or name_clean.endswith('$4') or name_clean.endswith('$5') or name_clean.endswith('$6') or name_clean.endswith('$7') or name_clean.endswith('$8') or name_clean.endswith('$9') or name_clean.endswith('$0'))
    })

# Determine sub-package for categorization
def get_subpackage(name):
    parts = name.split('.')
    if len(parts) >= 5:
        base = parts[4]
        # Strip inner class suffixes for grouping
        base_clean = base.split('$')[0]
        if base_clean in ('api', 'common', 'n'):
            if len(parts) >= 6:
                sub = parts[5].split('$')[0]
                return f'{base_clean}.{sub}'
            return base_clean
        return base_clean
    return 'root'

# Analyze superclass hierarchy for hints
def classify_by_super(sup):
    if not sup:
        return ''
    if 'java.lang.Object' in sup:
        return ''
    if 'java.lang.Enum' in sup:
        return 'Enum'
    if 'java.lang.Thread' in sup:
        return 'Thread'
    if 'java.lang.Runnable' in sup:
        return 'Runnable'
    if 'android.os.HandlerThread' in sup:
        return 'HandlerThread'
    if 'android.os.AsyncTask' in sup:
        return 'AsyncTask'
    if 'VObject3d' in sup or 'VObject3dContainer' in sup or 'VWidgetContainer' in sup:
        return 'SceneGraphNode'
    if 'VRectangle' in sup or 'VButton' in sup or 'VVirtualObject' in sup or 'VBox' in sup:
        return 'Primitive'
    if 'Shader' in sup:
        return 'Shader'
    if 'ItemInfo' in sup or 'Launcher' in sup:
        return 'ItemInfo'
    if 'VTween' in sup or 'VTweenTarget' in sup or 'VTweenParam' in sup:
        return 'Tween'
    if 'VIEffects' in sup:
        return 'Effect'
    if 'VMouseEventListener' in sup:
        return 'EventListener'
    if 'Number3d' in sup or 'Color4' in sup or 'PositionNumber3d' in sup:
        return 'MathType'
    if 'TextureElement' in sup or 'TextureDescription' in sup:
        return 'TextureType'
    return ''

# Detect common patterns in method names
def detect_role(methods, fields, super_name):
    mnames = set(m[0] for m in methods)
    mnames_all = [m[0] for m in methods]
    descs = [m[1] for m in methods]
    
    hints = []
    
    # Thread/Runnable patterns
    if 'run' in mnames and ('java.lang.Runnable' in str(methods) or super_name == 'java.lang.Runnable'):
        hints.append('Runnable')
    if 'run' in mnames and ('handleMessage' in mnames or 'Looper' in super_name):
        hints.append('Handler')
    
    # Render patterns
    if 'onDrawStart' in mnames or 'onDrawEnd' in mnames:
        hints.append('DrawCallback')
    if 'drawElement' in mnames or 'onDrawFrame' in mnames:
        hints.append('Renderer')
    if 'cacheToTexture' in mnames:
        hints.append('TextureCacher')
    
    # Scene graph patterns
    if 'addChild' in mnames or 'removeChild' in mnames or 'getChildAt' in mnames:
        hints.append('SceneContainer')
    if 'addChildAt' in mnames:
        hints.append('SceneArray')
    
    # Touch patterns
    if 'onTouch' in mnames or 'onClick' in mnames or 'calTouchCollision' in mnames:
        hints.append('TouchHandler')
    if 'onKillFocus' in mnames or 'onFocusChange' in mnames:
        hints.append('FocusHandler')
    
    # Animation patterns
    if 'getInterpolation' in mnames:
        hints.append('Easing')
    
    # Texture patterns
    if any('Texture' in d for d in descs) or any('Bitmap' in d for d in descs):
        if 'load' in mnames_all or 'getTexture' in mnames:
            hints.append('TextureLoader')
    if any('createTexture' in mnames_all[0] if mnames_all else '' for _ in [1]):
        hints.append('TextureCreator')
    
    # Layout/measure patterns
    if 'onMeasure' in mnames or 'onLayout' in mnames:
        hints.append('Layout')
    
    # Callback patterns
    if 'onDrawStart' in mnames and len(methods) <= 3:
        hints.append('DrawStartCallback')
    
    # Manager patterns
    if 'getInstance' in mnames or 'init' in mnames:
        hints.append('Singleton')
    
    # Animation/tween patterns
    if 'tween' in ''.join(mnames_all).lower() or 'animate' in ''.join(mnames_all).lower():
        hints.append('Animation')
    
    # GL patterns
    if 'gl' in ''.join(mnames_all).lower() or 'shader' in ''.join(mnames_all).lower():
        hints.append('GL')
    
    # Position transform patterns
    if 'position' in mnames or 'scale' in mnames or 'rotation' in mnames:
        if 'setPosition' not in mnames and 'setScale' not in mnames:
            hints.append('TransformAccessor')
    
    return hints


# Categorize all classes
def categorize():
    # Group by subpackage
    by_pkg = {}
    for c in c3d_classes:
        pkg = get_subpackage(c['name'])
        by_pkg.setdefault(pkg, []).append(c)
    
    print("=" * 80)
    print("C3DEngine v3.9.4 - Full Class Categorization")
    print(f"Total: {len(c3d_classes)} classes")
    print("=" * 80)
    
    # Known API categories (already done)
    known_pkgs = {
        'api.core': ('API Core - Scene Graph', []),
        'api.core.renderer': ('API Core - Renderer', []),
        'api.element': ('API Element - Math/Texture/Types', []),
        'api.element.info': ('API Element - Item Info', []),
        'api.element.info.shortcut': ('API Element - Shortcut Info', []),
        'api.event': ('API Events', []),
        'api.message': ('API Message Queue', []),
        'api.primitives': ('API Primitives', []),
        'api.primitives.button': ('API Primitives - Button', []),
        'api.primitives.ninepath': ('API Primitives - NinePatch', []),
        'api.resources': ('API Resources', []),
        'api.shell': ('API Shell Utilities', []),
        'api.tween': ('API Tween/Animation', []),
        'api.effects': ('API Effects', []),
        'common.shader': ('Shaders', []),
        'common.renderer': ('Renderer', []),
    }
    
    # Dump by package
    for pkg in sorted(by_pkg.keys()):
        classes = by_pkg[pkg]
        
        # Determine category header
        cat = KNOWN_CATEGORIES.get(pkg, '')
        role_hints = {}
        for c in classes:
            sup_hint = classify_by_super(c['super'])
            hints = detect_role(c['methods'], c['fields'], c['super'])
            if sup_hint:
                hints.append(sup_hint)
            role_hints[c['name']] = list(set(hints)) if hints else []
        
        print(f"\n{'=' * 60}")
        header = f"Package: com.censivn.C3DEngine.{pkg} ({len(classes)} classes)"
        if cat:
            header += f"\n  Category: {cat}"
        print(header)
        print(f"{'=' * 60}")
        
        for c in sorted(classes, key=lambda x: x['name']):
            name_short = c['name'].split('.')[-1]
            print(f"\n  {name_short}")
            if c['super'] and c['super'] != 'java.lang.Object':
                sup_short = c['super'].split('.')[-1]
                print(f"    extends: {sup_short}")
            if c['interfaces']:
                ifaces = [i.split('.')[-1] for i in c['interfaces']]
                print(f"    implements: {', '.join(ifaces)}")
            if role_hints[c['name']]:
                print(f"    roles: {', '.join(role_hints[c['name']])}")
            if c['fields']:
                print(f"    fields: {', '.join(c['fields'][:8])}")
            # Show interesting methods
            interesting = [m for m in c['methods'] if m[0] not in ('<init>', '<clinit>')]
            if interesting:
                for m in interesting[:5]:
                    desc_short = m[1].replace('Lcom/censivn/C3DEngine/', 'C3D:')
                    print(f"    {m[0]}{desc_short}")


def generate_summary():
    """Generate a categorized summary by subpackage with role distribution"""
    by_pkg = {}
    for c in c3d_classes:
        pkg = get_subpackage(c['name'])
        by_pkg.setdefault(pkg, []).append(c)
    
    print("=" * 80)
    print("C3DEngine v3.9.4 - Categorization Summary")
    print(f"Total: {len(c3d_classes)} classes")
    print("=" * 80)
    
    summaries = {
        'a': ('Engine Core (GL thread, context, main loop, initialization)', 
              'Main engine controller. SurfaceView/GLThread bridge. Handles init(), render loop, input dispatch, engine lifecycle. Contains inner classes for async operations.'),
        'b': ('Worker Subsystems (Scene/Page/Widget/Mesh management)', 
              'Complex package with 7+ subsystems: b.b.* (scene containers/layout), b.c.* (widget/data management including WidgetManager HandlerThread), b.d.* (touch/mouse event dispatch), b.e.* (texture loading), b.f.* (scene graph nodes), b.g.* (page/scene orchestration), b.h.* (UI interactions, drawer/folder/widget touch handling). Contains Runnable callbacks, gesture detectors, layout managers.'),
        'c': ('Resource/Data Parser Layer (XML, JSON, Bitmap)', 
              'Resource loading and parsing. c.a.* for asset/resource I/O, c.b.* for XML/JSON/config parsing, c.c.* and c.d.* for data model objects (themed icons, resource references). Includes file downloaders, Bitmap decoders, data caches.'),
        'd': ('Notification/State/Event System', 
              'Notification badge management, app state tracking, unread count handling. Works with Android NotificationManager. Contains state enums (uninstalled, upgraded, normal).'),
        'e': ('Theme/Widget/Drawable System', 
              'Theme resource management, widget data models, clock/cube widget rendering. e.a.* = theme parsing/application, e.b.* = widget data descriptions, e.c.* = drawable/icon loading.'),
        'f': ('Scene Graph Core (b.f.i = VObject3d equivalent)', 
              'The internal scene graph implementation. f.* contains b.f.i (main scene node, VObject3d substitute with position/scale/rotation/visibility), b.f.j (VObject3dContainer substitute with children management), b.f.k (specialized container), b.f.c (render batches), b.f.a.* (render task/display list).'),
        'g': ('Page/Transition System', 
              'Page management and transition effects. b.g.* contains page container, page state machine, page change listeners, cube/rotation/scroll transition implementations.'),
        'h': ('Interaction/Widget Display System', 
              'Touch interaction, folder display, drawer display, widget display. b.h.a.* = screen/folder data, b.h.b.* = drag-and-drop touch handlers (long press, scroll, fling), b.h.c.* = drawer panel display, b.h.d.* = edit mode actions, b.h.e.* = folder preview/animation, b.h.* = transition animations.'),
        'i': ('Utility/Misc Engine Core', 
              'Small utility package. Engine-level initialization/utility support.'),
    }
    
    # By subpackage
    for pkg_key in ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i']:
        classes = by_pkg.get(pkg_key, [])
        if pkg_key in summaries:
            title, desc = summaries[pkg_key]
        else:
            title, desc = f'Package {pkg_key}', ''
        
        print(f"\n{'=' * 60}")
        print(f"com.censivn.C3DEngine.{pkg_key}.*  ({len(classes)} classes)")
        print(f"  {title}")
        if desc:
            print(f"  {desc}")
        print(f"{'=' * 60}")
        
        # Sub-packages within this package
        subpkgs = {}
        for c in classes:
            parts = c['name'].split('.')
            # Get sub-key (e.g. b.b, b.c, etc.)
            if len(parts) >= 6:
                subkey = '.'.join(parts[4:6])
            else:
                subkey = pkg_key
            subpkgs.setdefault(subkey, []).append(c['name'])
        
        for sub in sorted(subpkgs.keys()):
            names = sorted(subpkgs[sub])
            print(f"    {sub}: {len(names)} classes")
            # Show class short names
            short_names = [n.split('.')[-1] for n in names]
            print(f"      {', '.join(short_names)}")
        
        # Collect role counts for this package
        role_counts = {}
        abstract_count = 0
        interface_count = 0
        for c in classes:
            if 'abstract' in str(c.get('methods', [])):
                abstract_count += 1
            if c['interfaces']:
                interface_count += 1
        print(f"    Abstract: {abstract_count}, Implements interfaces: {interface_count}")
    
    # API packages (non-obfuscated public API)
    api_order = ['core', 'element', 'effects', 'event', 'message', 'primitives', 'renderer', 'resources', 'shader', 'shell', 'tween']
    others = []
    for pkg_key in sorted(by_pkg.keys()):
        if pkg_key in api_order:
            continue
        if pkg_key in ('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i'):
            continue
        if pkg_key == 'root':
            continue
        others.append(pkg_key)
    
    for pkg_key in api_order:
        if pkg_key in by_pkg:
            classes = by_pkg[pkg_key]
            cat = KNOWN_CATEGORIES.get(pkg_key, 'Unknown')
            print(f"\n  com.censivn.C3DEngine.{pkg_key}.*  ({len(classes)} classes)")
            print(f"    {cat}")
    
    if others:
        print(f"\n  Other packages: {', '.join(others)}")
    
    # Root package (com.censivn.C3DEngine.a - the main engine class)
    if 'root' in by_pkg:
        print(f"\n  com.censivn.C3DEngine.a (root engine class)  ({len(by_pkg['root'])} classes)")
        print(f"    Main engine singleton (a.a = engine instance accessor)")

if __name__ == '__main__':
    import sys
    if '--summary' in sys.argv:
        generate_summary()
    else:
        categorize()
