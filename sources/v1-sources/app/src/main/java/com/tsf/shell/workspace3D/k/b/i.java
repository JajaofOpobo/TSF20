package com.tsf.shell.workspace3D.k.b;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
final class i implements Runnable {
    final /* synthetic */ e a;
    private final /* synthetic */ ArrayList b;

    i(e eVar, ArrayList arrayList) {
        this.a = eVar;
        this.b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ap.a((com.tsf.shell.workspace3D.k.j) it.next(), 0, null);
        }
    }
}
