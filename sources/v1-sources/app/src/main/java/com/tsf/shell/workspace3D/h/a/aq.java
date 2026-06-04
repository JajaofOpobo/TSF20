package com.tsf.shell.workspace3D.h.a;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
final class aq implements Runnable {
    final /* synthetic */ ap a;

    aq(ap apVar) {
        this.a = apVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x xVar;
        ArrayList arrayList;
        x xVar2;
        com.censivn.C3DEngine.b.v vVar;
        x xVar3;
        com.censivn.C3DEngine.b.v vVar2;
        int i;
        x xVar4;
        e eVar;
        x xVar5;
        ArrayList arrayList2;
        xVar = this.a.E;
        arrayList = xVar.al;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            e eVar2 = (e) it.next();
            xVar4 = this.a.E;
            eVar = xVar4.ad;
            if (eVar2 != eVar) {
                xVar5 = this.a.E;
                arrayList2 = xVar5.ak;
                eVar2.a(arrayList2);
            }
        }
        this.a.F = false;
        xVar2 = this.a.E;
        vVar = xVar2.ab;
        vVar.e(true);
        xVar3 = this.a.E;
        vVar2 = xVar3.aq;
        vVar2.e(true);
        i = this.a.G;
        if (i != -1) {
            com.censivn.C3DEngine.a.a().c(new ar(this));
        }
    }
}
