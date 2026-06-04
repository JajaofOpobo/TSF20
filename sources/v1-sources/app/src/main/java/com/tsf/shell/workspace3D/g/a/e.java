package com.tsf.shell.workspace3D.g.a;

import com.censivn.C3DEngine.b.ac;
import com.censivn.C3DEngine.b.r;
import com.tsf.shell.workspace3D.g.b.n;
import com.tsf.shell.workspace3D.k.ah;
import com.tsf.shell.workspace3D.k.b.ap;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class e extends n {
    e(float f, float f2, float f3, float f4, float f5) {
        super(f, f2, f3, f4, f5);
    }

    @Override // com.tsf.shell.workspace3D.g.b.n
    public final r a(int i, r rVar) {
        r rVar2;
        ArrayList arrayList;
        if (rVar == null) {
            rVar2 = ap.c();
            ((com.censivn.C3DEngine.e.a.a) rVar2).i();
            rVar2.ar();
        } else {
            rVar2 = rVar;
        }
        rVar2.z().d();
        ac z = rVar2.z();
        arrayList = c.p;
        z.c(((ah) arrayList.get(i)).C);
        return rVar2;
    }

    @Override // com.tsf.shell.workspace3D.g.b.n
    public final int i() {
        ArrayList arrayList;
        arrayList = c.p;
        return arrayList.size();
    }

    @Override // com.tsf.shell.workspace3D.g.b.n
    public final void b(r rVar, int i) {
        ArrayList arrayList;
        a aVar;
        ArrayList arrayList2;
        ArrayList arrayList3;
        arrayList = c.p;
        ah ahVar = (ah) arrayList.get(i);
        aVar = c.o;
        aVar.a(rVar, ahVar);
        arrayList2 = c.p;
        arrayList2.remove(i);
        a(i);
        k();
        arrayList3 = c.p;
        if (arrayList3.size() == 0) {
            c.a();
        }
    }
}
