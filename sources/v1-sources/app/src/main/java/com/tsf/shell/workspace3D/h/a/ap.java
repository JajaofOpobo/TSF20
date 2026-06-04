package com.tsf.shell.workspace3D.h.a;

import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
final class ap extends as {
    final /* synthetic */ x E;
    private boolean F = false;
    private int G;

    ap(x xVar) {
        this.E = xVar;
    }

    @Override // com.tsf.shell.workspace3D.h.a.n
    public final void i(boolean z) {
        l lVar;
        k kVar;
        as asVar;
        l lVar2;
        k kVar2;
        if (!z) {
            this.E.aA = null;
            lVar = this.E.aC;
            lVar.n();
            kVar = this.E.aB;
            kVar.n();
            return;
        }
        x xVar = this.E;
        asVar = this.E.aD;
        xVar.aA = asVar;
        lVar2 = this.E.aC;
        lVar2.j();
        kVar2 = this.E.aB;
        kVar2.j();
    }

    @Override // com.tsf.shell.workspace3D.h.a.as, com.tsf.shell.workspace3D.h.a.n
    public final boolean e(int i) {
        if (!super.e(i)) {
            return false;
        }
        g(i);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(int i) {
        ArrayList arrayList;
        com.censivn.C3DEngine.b.v vVar;
        com.censivn.C3DEngine.b.v vVar2;
        ArrayList arrayList2;
        e eVar;
        ArrayList arrayList3;
        com.tsf.shell.a.t.l(i);
        if (this.F) {
            this.G = i;
            return;
        }
        a.a(i);
        arrayList = this.E.ak;
        if (arrayList.size() != 0) {
            this.G = -1;
            this.F = true;
            vVar = this.E.ab;
            vVar.e(false);
            vVar2 = this.E.aq;
            vVar2.e(false);
            arrayList2 = this.E.ak;
            Collections.sort(arrayList2, a.d);
            aq aqVar = new aq(this);
            eVar = this.E.ad;
            arrayList3 = this.E.ak;
            eVar.a(arrayList3, (Runnable) aqVar);
        }
    }
}
