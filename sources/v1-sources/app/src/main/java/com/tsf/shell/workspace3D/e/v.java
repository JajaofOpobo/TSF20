package com.tsf.shell.workspace3D.e;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
final class v implements Runnable {
    final /* synthetic */ p a;
    private final /* synthetic */ String b;

    v(p pVar, String str) {
        this.a = pVar;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String[] strArr;
        e eVar;
        e eVar2;
        ArrayList arrayList;
        e eVar3;
        e eVar4;
        e eVar5;
        e eVar6;
        if (com.tsf.shell.a.t.i()) {
            com.tsf.shell.a.t.h();
            Iterator it = com.tsf.shell.g.b.a(5).iterator();
            while (it.hasNext()) {
                com.tsf.shell.workspace3D.k.j jVar = (com.tsf.shell.workspace3D.k.j) it.next();
                eVar5 = this.a.af;
                eVar5.a(jVar, true);
                eVar6 = this.a.af;
                eVar6.d((com.censivn.C3DEngine.b.r) jVar);
            }
            eVar4 = this.a.af;
            eVar4.aL();
        } else {
            if (this.b != null) {
                strArr = this.b.split(",");
            } else {
                strArr = new String[0];
            }
            for (String str : strArr) {
                com.tsf.shell.workspace3D.k.j a = p.a(this.a, str);
                if (a != null) {
                    eVar = this.a.af;
                    eVar.a(a, false);
                    eVar2 = this.a.af;
                    eVar2.d((com.censivn.C3DEngine.b.r) a);
                }
            }
        }
        arrayList = this.a.aw;
        arrayList.clear();
        eVar3 = this.a.af;
        eVar3.aJ();
    }
}
