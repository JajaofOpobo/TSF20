package com.tsf.shell.workspace3D.h;

import java.util.Iterator;

/* loaded from: classes.dex */
final class i implements Runnable {
    final /* synthetic */ g a;

    i(g gVar) {
        this.a = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.a.B.aD().iterator();
        while (it.hasNext()) {
            com.censivn.C3DEngine.b.r rVar = (com.censivn.C3DEngine.b.r) it.next();
            if (rVar instanceof com.tsf.shell.workspace3D.k.j) {
                com.tsf.shell.workspace3D.k.b.ap.a((com.tsf.shell.workspace3D.k.j) rVar, 0, null);
            }
        }
    }
}
