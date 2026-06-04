package com.tsf.shell.workspace3D.h.a;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
final class ai implements Runnable {
    final /* synthetic */ x a;

    ai(x xVar) {
        this.a = xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        ArrayList arrayList2;
        arrayList = this.a.ak;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((com.tsf.shell.workspace3D.k.ah) it.next()).cd();
        }
        arrayList2 = this.a.am;
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            ((com.tsf.shell.workspace3D.k.ah) it2.next()).cd();
        }
    }
}
