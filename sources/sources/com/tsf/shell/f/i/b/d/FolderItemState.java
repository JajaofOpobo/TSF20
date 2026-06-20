package com.tsf.shell.f.i.b.d;

import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class FolderItemState {
    protected void a(b bVar) {
        if (com.tsf.shell.manager.app.FeatureConfig.a()) {
            ArrayList arrayList = new ArrayList();
            for (com.censivn.C3DEngine.b.f.IRenderable iVar : bVar.aG()) {
                if (iVar instanceof com.tsf.shell.f.i.b.e.DrawerItemVisual) {
                    com.tsf.shell.f.i.b.e.DrawerItemVisual gVar = (com.tsf.shell.f.i.b.e.DrawerItemVisual) iVar;
                    if (gVar.bd() != null) {
                        arrayList.add(gVar.bd());
                    }
                }
            }
            com.tsf.shell.f.e.a.AlignmentEngine.a(bVar, arrayList);
        }
    }
}
