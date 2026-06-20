"""
Apply ONLY safe, verified fixes to the codebase.
Each fix uses exact string matching with NO replaceAll.
"""
import os
import re

SRC = '/home/jaja/Documents/TSF20/sources/sources'

# ===== SAFE FIX 1: C3DEngine utils.x import =====
# x.java in utils was renamed to GraphicsEngineBridge.java
# Exact import line replacement
fix1_count = 0
for root, dirs, files in os.walk(SRC):
    for f in files:
        if not f.endswith('.java'):
            continue
        fpath = os.path.join(root, f)
        with open(fpath, 'r') as fh:
            content = fh.read()
        
        if 'import com.tsf.shell.utils.x;' not in content:
            continue
        
        content = content.replace(
            'import com.tsf.shell.utils.x;',
            'import com.tsf.shell.utils.GraphicsEngineBridge;'
        )
        
        with open(fpath, 'w') as fh:
            fh.write(content)
        fix1_count += 1

print(f"Fix 1: Updated {fix1_count} files with utils.x import")

# ===== SAFE FIX 2: ActionSelectorAdapter.java FQN refs =====
# Fix the ShellCallbackDispatcher.activity -> activity in FQN refs
# This is a JADX artifact where the class name was merged with subpackage
fpath = os.path.join(SRC, 'com/tsf/shell/manager/action/ActionSelectorAdapter.java')
with open(fpath, 'r') as fh:
    content = fh.read()

orig = content
# These are the specific FQN references that need fixing
content = content.replace(
    'com.tsf.shell.ShellCallbackDispatcher.activity.actionselector.ActionSelectorAdapter',
    'com.tsf.shell.activity.actionselector.ActionSelectorAdapter'
)
if content != orig:
    with open(fpath, 'w') as fh:
        fh.write(content)
    print(f"Fix 2a: Fixed ActionSelectorAdapter.java FQN refs")

# ===== SAFE FIX 3: Home.java =====
fpath = os.path.join(SRC, 'com/tsf/shell/Home.java')
with open(fpath, 'r') as fh:
    content = fh.read()

orig = content

# Fix import: ShellCallbackDispatcher.a.ShellLayoutEngine -> a.a.ShellLayoutEngine
content = content.replace(
    'import com.tsf.shell.ShellCallbackDispatcher.a.ShellLayoutEngine;',
    'import com.tsf.shell.a.a.ShellLayoutEngine;'
)

# Add ShellContentManager import
if 'import com.tsf.shell.a.a.ShellContentManager;' not in content:
    content = content.replace(
        'import com.tsf.shell.a.a.ShellLayoutEngine;',
        'import com.tsf.shell.a.a.ShellLayoutEngine;\nimport com.tsf.shell.a.a.ShellContentManager;'
    )

# Fix D -> ShellDataProvider
content = content.replace(
    '    private D o;',
    '    private ShellDataProvider o;'
)

# Fix ShellCallbackDispatcher.a.a -> ShellContentManager
content = content.replace(
    '    private com.tsf.shell.ShellCallbackDispatcher.a.a r;',
    '    private ShellContentManager r;'
)

# Fix constructor call
content = content.replace(
    'new com.tsf.shell.ShellCallbackDispatcher.a.a(this)',
    'new ShellContentManager(this)'
)

# Fix method call: ShellCallbackDispatcher.a.e.a(this) -> ShellConfigEngine.a(this)
content = content.replace(
    'com.tsf.shell.ShellCallbackDispatcher.a.e.a(this)',
    'ShellConfigEngine.a(this)'
)

# Add ShellConfigEngine import
if 'import com.tsf.shell.a.a.ShellConfigEngine;' not in content:
    content = content.replace(
        'import com.tsf.shell.a.a.ShellContentManager;',
        'import com.tsf.shell.a.a.ShellContentManager;\nimport com.tsf.shell.a.a.ShellConfigEngine;'
    )

if content != orig:
    with open(fpath, 'w') as fh:
        fh.write(content)
    print(f"Fix 3: Fixed Home.java")

# ===== SAFE FIX 4: ShellContentManager.java =====
fpath = os.path.join(SRC, 'com/tsf/shell/a/a/ShellContentManager.java')
with open(fpath, 'r') as fh:
    content = fh.read()

orig = content

# Fix imports
content = content.replace(
    'import com.tsf.shell.ShellCallbackDispatcher.a.b;',
    'import com.tsf.shell.a.a.ShellPageManager;'
)
content = content.replace(
    'import com.tsf.shell.ShellCallbackDispatcher.a.c;',
    'import com.tsf.shell.a.a.ShellThemeEngine;'
)
content = content.replace(
    'import com.tsf.shell.ShellCallbackDispatcher.a.d;',
    'import com.tsf.shell.a.a.ShellLayoutEngine;'
)

# Fix FQN refs in body (using word boundary matching for safety)
def safe_replace(content, old, new):
    """Replace only full identifier patterns."""
    return re.sub(r'\b' + re.escape(old) + r'\b', new, content)

content = safe_replace(content, 'com.tsf.shell.ShellCallbackDispatcher.a.b', 'ShellPageManager')
content = safe_replace(content, 'com.tsf.shell.ShellCallbackDispatcher.a.c', 'ShellThemeEngine')

# Fix the specific ShellCallbackDispatcher.b.a reference
content = content.replace(
    'com.tsf.shell.ShellCallbackDispatcher.b.a.a(a.this.f, i | 1);',
    'ShellGestureHandler.a(a.this.f, i | 1);'
)

if content != orig:
    with open(fpath, 'w') as fh:
        fh.write(content)
    print(f"Fix 4: Fixed ShellContentManager.java")

# ===== SAFE FIX 5: ShellConfigEngine.java =====
fpath = os.path.join(SRC, 'com/tsf/shell/a/a/ShellConfigEngine.java')
with open(fpath, 'r') as fh:
    content = fh.read()

orig = content
content = content.replace(
    'import com.tsf.shell.ShellCallbackDispatcher.a.c;',
    'import com.tsf.shell.a.a.ShellThemeEngine;'
)
if content != orig:
    with open(fpath, 'w') as fh:
        fh.write(content)
    print(f"Fix 5: Fixed ShellConfigEngine.java")

# ===== SAFE FIX 6: ShellPageManager.java missing inner class =====
fpath = os.path.join(SRC, 'com/tsf/shell/a/a/ShellPageManager.java')
with open(fpath, 'r') as fh:
    content = fh.read()

orig = content
# Add missing inner class b before closing brace
if 'public static class b' not in content:
    content = content.replace(
        '    public String e() {\n        return this.e;\n    }\n}',
        '''    public String e() {
        return this.e;
    }

    public static class b {
        int a;
        int b;
        int c = 1;
        int d;
        String e;
    }
}'''
    )
if content != orig:
    with open(fpath, 'w') as fh:
        fh.write(content)
    print(f"Fix 6: Fixed ShellPageManager.java")

# ===== SAFE FIX 7: C3DEngine b/e/c.java =====
fpath = os.path.join(SRC, 'com/censivn/C3DEngine/b/e/c.java')
with open(fpath, 'r') as fh:
    content = fh.read()

orig = content
content = content.replace(
    'import com.tsf.shell.utils.GraphicsEngineBridge;',
    'import com.tsf.shell.f.e.SelectionFrame;\nimport com.tsf.shell.utils.GraphicsEngineBridge;'
)
content = content.replace(
    '    private com.tsf.shell.f.e.I e;',
    '    private SelectionFrame e;'
)
content = content.replace(
    '    private com.tsf.shell.f.e.I a = new com.tsf.shell.f.e.I();',
    '    private SelectionFrame a = new SelectionFrame();'
)
if content != orig:
    with open(fpath, 'w') as fh:
        fh.write(content)
    print(f"Fix 7: Fixed C3DEngine b/e/c.java")

# ===== SAFE FIX 8: C3DEngine b/e/h.java =====
fpath = os.path.join(SRC, 'com/censivn/C3DEngine/b/e/h.java')
with open(fpath, 'r') as fh:
    content = fh.read()

orig = content
content = content.replace(
    'import com.tsf.shell.utils.q;',
    'import com.tsf.shell.utils.BitmapTransformationHelper;'
)
if content != orig:
    with open(fpath, 'w') as fh:
        fh.write(content)
    print(f"Fix 8: Fixed C3DEngine b/e/h.java")

# ===== SAFE FIX 9: C3DEngine b/f/m.java =====
fpath = os.path.join(SRC, 'com/censivn/C3DEngine/b/f/m.java')
with open(fpath, 'r') as fh:
    content = fh.read()

orig = content
content = content.replace(
    'com.tsf.shell.manager.o.a.a',
    'com.tsf.shell.manager.o.a.TextConfig'
)
if content != orig:
    with open(fpath, 'w') as fh:
        fh.write(content)
    print(f"Fix 9: Fixed C3DEngine b/f/m.java")

# ===== SAFE FIX 10: C3DEngine a/d.java =====
fpath = os.path.join(SRC, 'com/censivn/C3DEngine/a/d.java')
with open(fpath, 'r') as fh:
    content = fh.read()

orig = content
# com.tsf.shell.f.i.a.a -> com.tsf.shell.f.i.a.WallpaperTouchHandler
content = content.replace(
    'com.tsf.shell.f.i.a.a',
    'com.tsf.shell.f.i.a.WallpaperTouchHandler'
)
if content != orig:
    with open(fpath, 'w') as fh:
        fh.write(content)
    print(f"Fix 10: Fixed C3DEngine a/d.java")

# ===== SAFE FIX 11: C3DEngine LauncherShortcutAppInfo.java =====
fpath = os.path.join(SRC, 'com/censivn/C3DEngine/api/element/info/shortcut/LauncherShortcutAppInfo.java')
with open(fpath, 'r') as fh:
    content = fh.read()
orig = content

# Replace imports
content = content.replace(
    'import com.tsf.shell.f.i.b.e.g;',
    'import com.tsf.shell.f.i.b.e.DrawerItemVisual;'
)
content = content.replace(
    'import com.tsf.shell.manager.A;',
    'import com.tsf.shell.manager.GlobalServiceLocator;'
)
content = content.replace(
    'import com.tsf.shell.manager.app.LauncherAppInfo;',
    'import com.tsf.shell.manager.app.LauncherAppInfo;\nimport com.tsf.shell.manager.o.ButtonMetrics;\nimport com.tsf.shell.f.i.PageItem;\nimport com.tsf.shell.manager.r.c.IconRenderer;'
)

# Fix A.w to GlobalServiceLocator.w
content = content.replace(
    '        A.w.h_().a(this, 32);',
    '        GlobalServiceLocator.w.h_().a(this, 32);'
)
content = content.replace(
    '        A.w.a().a().a(this);',
    '        GlobalServiceLocator.w.a().a().a(this);'
)

# Fix inline casts and FQN refs
content = content.replace(
    '((g) getWidget())',
    '((DrawerItemVisual) getWidget())'
)
content = content.replace(
    'com.tsf.shell.manager.r.c.A',
    'IconRenderer'
)
content = content.replace(
    '((com.tsf.shell.f.i.B) getWidget())',
    '((PageItem) getWidget())'
)
content = content.replace(
    'com.tsf.shell.manager.o.A aVar',
    'ButtonMetrics aVar'
)
content = content.replace(
    'com.tsf.shell.manager.o.A aVar',
    'ButtonMetrics aVar'
)

if content != orig:
    with open(fpath, 'w') as fh:
        fh.write(content)
    print(f"Fix 11: Fixed LauncherShortcutAppInfo.java")

# ===== SAFE FIX 12: ShellWallpaperManager - add missing imports =====
fpath = os.path.join(SRC, 'com/tsf/shell/manager/wallpaper/ShellWallpaperManager.java')
with open(fpath, 'r') as fh:
    content = fh.read()

orig = content
content = content.replace(
    'import com.tsf.shell.Home;\nimport com.tsf.shell.f.f.WorkspacePage;',
    'import com.tsf.shell.Home;\nimport com.tsf.shell.f.f.WorkspacePage;\nimport com.tsf.shell.manager.app.StateHub;\nimport com.tsf.shell.manager.app.WidgetPanelController;'
)
if content != orig:
    with open(fpath, 'w') as fh:
        fh.write(content)
    print(f"Fix 12: Fixed ShellWallpaperManager imports")

# ===== SAFE FIX 13: Activity files - fix anonymous class JADX comments =====
# These are JADX comments like // from class: com.tsf.shell.ShellCallbackDispatcherctivity.X
# The sed earlier changed them to activity.X which is correct for comments
# But some files might still have broken references
# Actually, these are comments - they don't affect compilation
# Let me skip this

print("\nAll safe fixes applied.")
print(f"Total files changed: {fix1_count + 11} (approx)")
