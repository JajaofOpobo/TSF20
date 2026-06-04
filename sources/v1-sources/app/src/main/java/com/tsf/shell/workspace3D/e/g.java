package com.tsf.shell.workspace3D.e;

import com.censivn.C3DEngine.api.element.Number3d;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class g implements Runnable {
    final /* synthetic */ e a;

    g(e eVar) {
        this.a = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        float f;
        Number3d number3d;
        Number3d number3d2;
        p pVar;
        p pVar2;
        p pVar3;
        com.tsf.shell.workspace3D.e.b.a aVar = p.p;
        arrayList = this.a.K;
        ArrayList aD = this.a.aD();
        int size = this.a.aD().size();
        float f2 = this.a.A;
        float f3 = this.a.C;
        float f4 = this.a.B;
        f = this.a.P;
        number3d = this.a.ac;
        float f5 = number3d.x;
        number3d2 = this.a.ac;
        int a = aVar.a(arrayList, aD, size, f2, f3, f4, f, f5, number3d2.y);
        if (a != -3 && a != -4) {
            if (a == -1 || a == -2) {
                pVar = this.a.Q;
                pVar.o();
                this.a.a((com.tsf.shell.workspace3D.k.j) null);
            } else {
                pVar2 = this.a.Q;
                if (!pVar2.u()) {
                    pVar3 = this.a.Q;
                    pVar3.n();
                }
                this.a.a((com.tsf.shell.workspace3D.k.j) this.a.aD().get(a));
            }
        } else {
            this.a.a((com.tsf.shell.workspace3D.k.j) null);
            this.a.n();
            this.a.W = true;
        }
        this.a.M = false;
        this.a.a_(true);
        e eVar = this.a;
        e.u();
    }
}
