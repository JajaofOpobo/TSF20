package com.tsf.shell.workspace3D.e;

import java.util.Iterator;

/* loaded from: classes.dex */
final class m implements Runnable {
    final /* synthetic */ e a;

    m(e eVar) {
        this.a = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.ah = false;
        Iterator it = this.a.aD().iterator();
        String str = "";
        while (it.hasNext()) {
            com.censivn.C3DEngine.b.r rVar = (com.censivn.C3DEngine.b.r) it.next();
            if (rVar instanceof com.tsf.shell.workspace3D.k.j) {
                str = String.valueOf(str) + ((com.tsf.shell.workspace3D.k.j) rVar).be().appWidgetId + ",";
            }
        }
        com.censivn.C3DEngine.a.a().d(new n(this, str));
    }
}
