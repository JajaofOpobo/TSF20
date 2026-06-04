package com.tsf.shell.workspace3D.k.b;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
final class n implements Runnable {
    final /* synthetic */ k a;
    private final /* synthetic */ ArrayList b;

    n(k kVar, ArrayList arrayList) {
        this.a = kVar;
        this.b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tsf.shell.workspace3D.k.s a;
        ArrayList arrayList;
        au auVar;
        ai aiVar;
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            a = this.a.a(((com.tsf.shell.h.b) it.next()).c.getClassName());
            if (a != null) {
                arrayList = this.a.j;
                arrayList.remove(a);
                switch (a.i) {
                    case 0:
                        aiVar = this.a.o;
                        aiVar.a(a.d);
                        break;
                    case 1:
                        auVar = this.a.n;
                        auVar.a(a.d);
                        break;
                }
                a.d();
            }
        }
    }
}
