package com.tsf.shell.workspace3D.k.b;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
final class x implements Runnable {
    final /* synthetic */ k a;
    private final /* synthetic */ ArrayList b;

    x(k kVar, ArrayList arrayList) {
        this.a = kVar;
        this.b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tsf.shell.workspace3D.k.s a;
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            com.tsf.shell.h.b bVar = (com.tsf.shell.h.b) it.next();
            a = this.a.a(bVar.c.getClassName());
            if (a != null) {
                k.a(this.a, a, bVar);
            }
        }
    }
}
