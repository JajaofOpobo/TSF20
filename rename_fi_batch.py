#!/usr/bin/env python3
import re
from pathlib import Path

V3 = Path("/home/jaja/Documents/TSF20/sources/sources/com/tsf/shell")

# Comprehensive rename for all remaining f/i single-letter files
renames = {
    # === b/ subpackages (standard items) ===
    "com.tsf.shell.f.i.b.a.a": "com.tsf.shell.f.i.b.a.ItemContainer",
    "com.tsf.shell.f.i.b.a.b": "com.tsf.shell.f.i.b.a.ItemContainerPageItem",
    "com.tsf.shell.f.i.b.b.a": "com.tsf.shell.f.i.b.b.ItemShell",
    "com.tsf.shell.f.i.b.b.b": "com.tsf.shell.f.i.b.b.IItemShell",
    "com.tsf.shell.f.i.b.c.a": "com.tsf.shell.f.i.b.c.ItemDataConfig",
    "com.tsf.shell.f.i.b.c.b": "com.tsf.shell.f.i.b.c.ItemDataState",
    "com.tsf.shell.f.i.b.d.a": "com.tsf.shell.f.i.b.d.FolderTouchHandler",
    "com.tsf.shell.f.i.b.d.b": "com.tsf.shell.f.i.b.d.FolderShortcutItem",
    "com.tsf.shell.f.i.b.d.c": "com.tsf.shell.f.i.b.d.FolderItemState",
    "com.tsf.shell.f.i.b.d.d": "com.tsf.shell.f.i.b.d.FolderItemLayout",
    "com.tsf.shell.f.i.b.d.e": "com.tsf.shell.f.i.b.d.FolderItemAnimation",
    "com.tsf.shell.f.i.b.d.f": "com.tsf.shell.f.i.b.d.FolderItemBackground",
    "com.tsf.shell.f.i.b.d.g": "com.tsf.shell.f.i.b.d.FolderItemGrid",
    "com.tsf.shell.f.i.b.d.h": "com.tsf.shell.f.i.b.d.FolderItemIndicator",
    "com.tsf.shell.f.i.b.d.i": "com.tsf.shell.f.i.b.d.FolderItemDotIndicator",
    "com.tsf.shell.f.i.b.d.j": "com.tsf.shell.f.i.b.d.FolderItemPositioner",
    "com.tsf.shell.f.i.b.d.k": "com.tsf.shell.f.i.b.d.FolderItemSorter",
    "com.tsf.shell.f.i.b.e.a": "com.tsf.shell.f.i.b.e.DrawerItemBase",
    "com.tsf.shell.f.i.b.e.b": "com.tsf.shell.f.i.b.e.DrawerShortcutItemBase",
    "com.tsf.shell.f.i.b.e.c": "com.tsf.shell.f.i.b.e.DrawerItemGather",
    "com.tsf.shell.f.i.b.e.d": "com.tsf.shell.f.i.b.e.DrawerItemAction",
    "com.tsf.shell.f.i.b.e.e": "com.tsf.shell.f.i.b.e.DrawerItemEffect",
    "com.tsf.shell.f.i.b.e.f": "com.tsf.shell.f.i.b.e.DrawerItemEditAction",
    "com.tsf.shell.f.i.b.e.g": "com.tsf.shell.f.i.b.e.DrawerItemVisual",
    "com.tsf.shell.f.i.b.e.h": "com.tsf.shell.f.i.b.e.DrawerItemButton",
    "com.tsf.shell.f.i.b.e.i": "com.tsf.shell.f.i.b.e.DrawerItemLaunchAction",
    "com.tsf.shell.f.i.b.e.j": "com.tsf.shell.f.i.b.e.DrawerItemSettingsAction",
    
    # === _b/ subpackages (widget items) ===
    "com.tsf.shell.f.i._b.a.a": "com.tsf.shell.f.i._b.a.WidgetContainer",
    "com.tsf.shell.f.i._b.a.b": "com.tsf.shell.f.i._b.a.WidgetContainerPageItem",
    "com.tsf.shell.f.i._b.b.a": "com.tsf.shell.f.i._b.b.WidgetShell",
    "com.tsf.shell.f.i._b.c.b": "com.tsf.shell.f.i._b.c.WidgetItemData",
    "com.tsf.shell.f.i._b.d.a": "com.tsf.shell.f.i._b.d.WidgetTouchHandler",
    "com.tsf.shell.f.i._b.d.c": "com.tsf.shell.f.i._b.d.WidgetItemState",
    "com.tsf.shell.f.i._b.d.d": "com.tsf.shell.f.i._b.d.WidgetItemLayout",
    "com.tsf.shell.f.i._b.d.e": "com.tsf.shell.f.i._b.d.WidgetItemAnimation",
    "com.tsf.shell.f.i._b.d.f": "com.tsf.shell.f.i._b.d.WidgetItemBackground",
    "com.tsf.shell.f.i._b.d.g": "com.tsf.shell.f.i._b.d.WidgetItemGrid",
    "com.tsf.shell.f.i._b.d.h": "com.tsf.shell.f.i._b.d.WidgetItemIndicator",
    "com.tsf.shell.f.i._b.d.j": "com.tsf.shell.f.i._b.d.WidgetItemPositioner",
    "com.tsf.shell.f.i._b.e.a": "com.tsf.shell.f.i._b.e.WidgetDrawerItemBase",
    "com.tsf.shell.f.i._b.e.b": "com.tsf.shell.f.i._b.e.WidgetDrawerItemBase",
    "com.tsf.shell.f.i._b.e.c": "com.tsf.shell.f.i._b.e.WidgetDrawerItemGather",
    "com.tsf.shell.f.i._b.e.d": "com.tsf.shell.f.i._b.e.WidgetDrawerItemAction",
    "com.tsf.shell.f.i._b.e.e": "com.tsf.shell.f.i._b.e.WidgetDrawerItemEffect",
    "com.tsf.shell.f.i._b.e.f": "com.tsf.shell.f.i._b.e.WidgetDrawerItemEditAction",
    "com.tsf.shell.f.i._b.e.g": "com.tsf.shell.f.i._b.e.WidgetDrawerItemVisual",
    "com.tsf.shell.f.i._b.e.h": "com.tsf.shell.f.i._b.e.WidgetDrawerItemButton",
    "com.tsf.shell.f.i._b.e.i": "com.tsf.shell.f.i._b.e.WidgetDrawerItemLaunchAction",
    "com.tsf.shell.f.i._b.e.j": "com.tsf.shell.f.i._b.e.WidgetDrawerItemSettingsAction",
    
    # === _c/a/ (widget item scene nodes) ===
    "com.tsf.shell.f.i._c.a.i": "com.tsf.shell.f.i._c.a.IAsyncTaskListener",
    "com.tsf.shell.f.i._c.a.k": "com.tsf.shell.f.i._c.a.ITextureCallback",
    "com.tsf.shell.f.i._c.a.j": "com.tsf.shell.f.i._c.a.AsyncTextureNode",
    "com.tsf.shell.f.i._c.a.A": "com.tsf.shell.f.i._c.a.FolderSceneNode",
    "com.tsf.shell.f.i._c.a.B": "com.tsf.shell.f.i._c.a.DockSceneNode",
    "com.tsf.shell.f.i._c.a.C": "com.tsf.shell.f.i._c.a.DrawerSceneNode",
    "com.tsf.shell.f.i._c.a.d": "com.tsf.shell.f.i._c.a.PageSceneNode",
    "com.tsf.shell.f.i._c.a.e": "com.tsf.shell.f.i._c.a.NodeConfig",
    "com.tsf.shell.f.i._c.a.f": "com.tsf.shell.f.i._c.a.LabelSceneNode",
    "com.tsf.shell.f.i._c.a.g": "com.tsf.shell.f.i._c.a.GridSceneNode",
    "com.tsf.shell.f.i._c.a.h": "com.tsf.shell.f.i._c.a.BackgroundSceneNode",
    "com.tsf.shell.f.i._c.a.l": "com.tsf.shell.f.i._c.a.NodeConstants",
    "com.tsf.shell.f.i._c.a.m": "com.tsf.shell.f.i._c.a.CompositeSceneNode",
    "com.tsf.shell.f.i._c.a.a.a": "com.tsf.shell.f.i._c.a.a.TextureElementA",
    "com.tsf.shell.f.i._c.a.a.b": "com.tsf.shell.f.i._c.a.a.TextureElementB",
    "com.tsf.shell.f.i._c.a.a.c": "com.tsf.shell.f.i._c.a.a.TextureElementC",
    "com.tsf.shell.f.i._c.a.a.d": "com.tsf.shell.f.i._c.a.a.TextureElementD",
    "com.tsf.shell.f.i._c.a.a.e": "com.tsf.shell.f.i._c.a.a.TextureElementE",
    "com.tsf.shell.f.i._c.a.a.f": "com.tsf.shell.f.i._c.a.a.TextureElementF",
    "com.tsf.shell.f.i._c.a.a.g": "com.tsf.shell.f.i._c.a.a.TextureElementG",
    "com.tsf.shell.f.i._c.a.a.h": "com.tsf.shell.f.i._c.a.a.TextureElementH",
    "com.tsf.shell.f.i._c.a.b.a": "com.tsf.shell.f.i._c.a.b.SceneComponentA",
    "com.tsf.shell.f.i._c.a.b.b": "com.tsf.shell.f.i._c.a.b.SceneComponentB",
    "com.tsf.shell.f.i._c.a.b.c": "com.tsf.shell.f.i._c.a.b.SceneComponentC",
    "com.tsf.shell.f.i._c.a.b.d": "com.tsf.shell.f.i._c.a.b.SceneComponentD",
    "com.tsf.shell.f.i._c.a.b.e": "com.tsf.shell.f.i._c.a.b.SceneComponentE",
    "com.tsf.shell.f.i._c.a.b.f": "com.tsf.shell.f.i._c.a.b.SceneComponentF",
    "com.tsf.shell.f.i._c.a.b.g": "com.tsf.shell.f.i._c.a.b.SceneComponentG",
    "com.tsf.shell.f.i._c.a.b.h": "com.tsf.shell.f.i._c.a.b.SceneComponentH",
    "com.tsf.shell.f.i._c.a.b.i": "com.tsf.shell.f.i._c.a.b.SceneComponentI",
    "com.tsf.shell.f.i._c.a.b.j": "com.tsf.shell.f.i._c.a.b.SceneComponentJ",
    "com.tsf.shell.f.i._c.a.b.k": "com.tsf.shell.f.i._c.a.b.SceneComponentK",
    "com.tsf.shell.f.i._c.a.b.l": "com.tsf.shell.f.i._c.a.b.SceneComponentL",
    "com.tsf.shell.f.i._c.a.b.m": "com.tsf.shell.f.i._c.a.b.SceneComponentM",
    "com.tsf.shell.f.i._c.a.b.n": "com.tsf.shell.f.i._c.a.b.SceneComponentN",
    "com.tsf.shell.f.i._c.a.b.o": "com.tsf.shell.f.i._c.a.b.SceneComponentO",
    "com.tsf.shell.f.i._c.a.b.p": "com.tsf.shell.f.i._c.a.b.SceneComponentP",
    "com.tsf.shell.f.i._c.a.c.a": "com.tsf.shell.f.i._c.a.c.SceneRendererA",
    "com.tsf.shell.f.i._c.a.c.b": "com.tsf.shell.f.i._c.a.c.SceneRendererB",
    "com.tsf.shell.f.i._c.a.c.c": "com.tsf.shell.f.i._c.a.c.SceneRendererC",
    "com.tsf.shell.f.i._c.a.c.d": "com.tsf.shell.f.i._c.a.c.SceneRendererD",
    "com.tsf.shell.f.i._c.a.c.e": "com.tsf.shell.f.i._c.a.c.SceneRendererE",
    
    # === c/a/ (standard item scene nodes) ===
    "com.tsf.shell.f.i.c.a.i": "com.tsf.shell.f.i.c.a.IAsyncTaskListener",
    "com.tsf.shell.f.i.c.a.k": "com.tsf.shell.f.i.c.a.ITextureCallback",
    "com.tsf.shell.f.i.c.a.j": "com.tsf.shell.f.i.c.a.AsyncTextureNode",
    "com.tsf.shell.f.i.c.a.A": "com.tsf.shell.f.i.c.a.FolderSceneNode",
    "com.tsf.shell.f.i.c.a.B": "com.tsf.shell.f.i.c.a.DockSceneNode",
    "com.tsf.shell.f.i.c.a.C": "com.tsf.shell.f.i.c.a.DrawerSceneNode",
    "com.tsf.shell.f.i.c.a.d": "com.tsf.shell.f.i.c.a.PageSceneNode",
    "com.tsf.shell.f.i.c.a.e": "com.tsf.shell.f.i.c.a.NodeConfig",
    "com.tsf.shell.f.i.c.a.f": "com.tsf.shell.f.i.c.a.LabelSceneNode",
    "com.tsf.shell.f.i.c.a.g": "com.tsf.shell.f.i.c.a.GridSceneNode",
    "com.tsf.shell.f.i.c.a.h": "com.tsf.shell.f.i.c.a.BackgroundSceneNode",
    "com.tsf.shell.f.i.c.a.l": "com.tsf.shell.f.i.c.a.NodeConstants",
    "com.tsf.shell.f.i.c.a.m": "com.tsf.shell.f.i.c.a.CompositeSceneNode",
    "com.tsf.shell.f.i.c.a.a.a": "com.tsf.shell.f.i.c.a.a.TextureElementA",
    "com.tsf.shell.f.i.c.a.a.b": "com.tsf.shell.f.i.c.a.a.TextureElementB",
    "com.tsf.shell.f.i.c.a.a.c": "com.tsf.shell.f.i.c.a.a.TextureElementC",
    "com.tsf.shell.f.i.c.a.a.d": "com.tsf.shell.f.i.c.a.a.TextureElementD",
    "com.tsf.shell.f.i.c.a.a.e": "com.tsf.shell.f.i.c.a.a.TextureElementE",
    "com.tsf.shell.f.i.c.a.a.f": "com.tsf.shell.f.i.c.a.a.TextureElementF",
    "com.tsf.shell.f.i.c.a.a.g": "com.tsf.shell.f.i.c.a.a.TextureElementG",
    "com.tsf.shell.f.i.c.a.a.h": "com.tsf.shell.f.i.c.a.a.TextureElementH",
    "com.tsf.shell.f.i.c.a.b.a": "com.tsf.shell.f.i.c.a.b.SceneComponentA",
    "com.tsf.shell.f.i.c.a.b.b": "com.tsf.shell.f.i.c.a.b.SceneComponentB",
    "com.tsf.shell.f.i.c.a.b.c": "com.tsf.shell.f.i.c.a.b.SceneComponentC",
    "com.tsf.shell.f.i.c.a.b.d": "com.tsf.shell.f.i.c.a.b.SceneComponentD",
    "com.tsf.shell.f.i.c.a.b.e": "com.tsf.shell.f.i.c.a.b.SceneComponentE",
    "com.tsf.shell.f.i.c.a.b.f": "com.tsf.shell.f.i.c.a.b.SceneComponentF",
    "com.tsf.shell.f.i.c.a.b.g": "com.tsf.shell.f.i.c.a.b.SceneComponentG",
    "com.tsf.shell.f.i.c.a.b.h": "com.tsf.shell.f.i.c.a.b.SceneComponentH",
    "com.tsf.shell.f.i.c.a.b.i": "com.tsf.shell.f.i.c.a.b.SceneComponentI",
    "com.tsf.shell.f.i.c.a.b.j": "com.tsf.shell.f.i.c.a.b.SceneComponentJ",
    "com.tsf.shell.f.i.c.a.b.k": "com.tsf.shell.f.i.c.a.b.SceneComponentK",
    "com.tsf.shell.f.i.c.a.b.l": "com.tsf.shell.f.i.c.a.b.SceneComponentL",
    "com.tsf.shell.f.i.c.a.b.m": "com.tsf.shell.f.i.c.a.b.SceneComponentM",
    "com.tsf.shell.f.i.c.a.b.n": "com.tsf.shell.f.i.c.a.b.SceneComponentN",
    "com.tsf.shell.f.i.c.a.b.o": "com.tsf.shell.f.i.c.a.b.SceneComponentO",
    "com.tsf.shell.f.i.c.a.b.p": "com.tsf.shell.f.i.c.a.b.SceneComponentP",
    "com.tsf.shell.f.i.c.a.c.a": "com.tsf.shell.f.i.c.a.c.SceneRendererA",
    "com.tsf.shell.f.i.c.a.c.b": "com.tsf.shell.f.i.c.a.c.SceneRendererB",
    "com.tsf.shell.f.i.c.a.c.c": "com.tsf.shell.f.i.c.a.c.SceneRendererC",
    "com.tsf.shell.f.i.c.a.c.d": "com.tsf.shell.f.i.c.a.c.SceneRendererD",
    "com.tsf.shell.f.i.c.a.c.e": "com.tsf.shell.f.i.c.a.c.SceneRendererE",
}

# Also handle the InterfaceC0113a in f/i/b/d
renames["com.tsf.shell.f.i.b.d.C0127a"] = "com.tsf.shell.f.i.b.d.HitTargetHelper"

total_files = 0
total_xrefs = 0

for old_fqn, new_fqn in renames.items():
    parts = old_fqn.split('.')
    rel_path = '/'.join(parts[3:]) + '.java'
    path = V3 / rel_path
    
    if not path.exists():
        print(f"  SKIP: {rel_path}")
        continue
    
    content = path.read_text(errors='replace')
    old_class = path.stem
    new_name = new_fqn.split('.')[-1]
    
    # Check for simple-name collision: old_class == new_name means no change needed
    if old_class == new_name:
        print(f"  SKIP (same name): {rel_path}")
        continue
    
    content = re.sub(r'\bclass ' + re.escape(old_class) + r'\b', 'class ' + new_name, content)
    content = re.sub(r'\babstract class ' + re.escape(old_class) + r'\b', 'abstract class ' + new_name, content)
    content = re.sub(r'\binterface ' + re.escape(old_class) + r'\b', 'interface ' + new_name, content)
    content = content.replace(old_fqn, new_fqn)
    path.write_text(content)
    
    new_path = path.parent / f"{new_name}.java"
    if path != new_path:
        path.rename(new_path)
    
    count = 0
    for f in sorted(V3.rglob('*.java')):
        if f.resolve() == new_path.resolve():
            continue
        old_c = f.read_text(errors='replace')
        if old_fqn in old_c:
            new_c = old_c.replace(old_fqn, new_fqn)
            f.write_text(new_c)
            count += 1
    
    total_files += 1
    total_xrefs += count

print(f"=== {total_files} files renamed, {total_xrefs} cross-ref updates ===")
