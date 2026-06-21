package com.tsf.shell.f.i._b.d;

import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class WidgetItemState {
    protected void a(WorkspaceShortcutItem bVar) {
        if (com.tsf.shell.manager.app.FeatureConfig.a()) {
            ArrayList arrayList = new ArrayList();
            for (com.censivn.C3DEngine.b.f.IRenderable iVar : bVar.aG()) {
                if (iVar instanceof com.tsf.shell.f.i._b.e.WidgetDrawerItemVisual) {
                    com.tsf.shell.f.i._b.e.WidgetDrawerItemVisual gVar = (com.tsf.shell.f.i._b.e.WidgetDrawerItemVisual) iVar;
                    if (gVar.bd() != null) {
                        arrayList.add(gVar.bd());
                    }
                }
            }
            com.tsf.shell.f.e._a.DropTargetItem.a(bVar, arrayList);
        }
    }
}
