package com.tsf.shell.workspace3D.k.c.b;

import com.tsf.shell.workspace3D.bf;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
final class h implements Runnable {
    final /* synthetic */ f a;

    h(f fVar) {
        this.a = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.censivn.C3DEngine.e.b bVar;
        com.tsf.shell.workspace3D.k.ab abVar;
        com.tsf.shell.workspace3D.k.ab abVar2;
        com.tsf.shell.workspace3D.k.ab abVar3;
        com.tsf.shell.workspace3D.k.ab abVar4;
        com.tsf.shell.workspace3D.k.ab abVar5;
        com.tsf.shell.workspace3D.k.ab abVar6;
        com.tsf.shell.workspace3D.k.ab abVar7;
        com.censivn.C3DEngine.e.b bVar2;
        com.tsf.shell.workspace3D.h.a k = bf.j().k();
        bVar = this.a.a.P;
        if (bVar != null) {
            com.tsf.shell.workspace3D.e.p s = bf.s();
            bVar2 = this.a.a.P;
            s.a(bVar2, (com.censivn.C3DEngine.b.r) this.a.a.g);
            this.a.a.P = null;
        } else {
            this.a.a.g.Q();
            k.g(this.a.a.g);
        }
        abVar = this.a.a.D;
        if (abVar != null) {
            abVar2 = this.a.a.D;
            abVar2.Q();
            abVar3 = this.a.a.D;
            k.g(abVar3);
            abVar4 = this.a.a.D;
            ArrayList bH = abVar4.bH();
            if (bH != null && bH.size() > 0) {
                Iterator it = bH.iterator();
                while (it.hasNext()) {
                    ((a) ((com.tsf.shell.workspace3D.k.j) it.next()).aw()).a();
                }
            }
            abVar5 = this.a.a.D;
            if (!((a) abVar5.aw()).a()) {
                abVar7 = this.a.a.D;
                abVar7.bG();
            }
            abVar6 = this.a.a.D;
            abVar6.e(true);
            this.a.a.D = null;
        }
        this.a.a.g.f(false);
        c.d.e();
        bf.m().a();
        this.a.a.G();
        this.a.a.A = c.b;
    }
}
