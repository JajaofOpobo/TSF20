package com.tsf.shell.workspace3D.g;

import com.censivn.C3DEngine.api.element.Number3d;
import com.tsf.shell.workspace3D.bf;

/* loaded from: classes.dex */
final class u implements Runnable {
    final /* synthetic */ t a;
    private final /* synthetic */ boolean b;

    u(t tVar, boolean z) {
        this.a = tVar;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        com.censivn.C3DEngine.e.b bVar;
        com.tsf.shell.workspace3D.k.j jVar;
        com.censivn.C3DEngine.e.b bVar2;
        com.censivn.C3DEngine.e.b bVar3;
        com.censivn.C3DEngine.e.b bVar4;
        com.tsf.shell.workspace3D.k.j jVar2;
        com.tsf.shell.workspace3D.k.j jVar3;
        com.tsf.shell.workspace3D.k.j jVar4;
        com.censivn.C3DEngine.e.b bVar5;
        com.tsf.shell.workspace3D.k.j jVar5;
        com.tsf.shell.workspace3D.k.j jVar6;
        com.tsf.shell.workspace3D.k.c.b.c cVar;
        com.censivn.C3DEngine.e.b bVar6;
        com.tsf.shell.workspace3D.k.j jVar7;
        com.censivn.C3DEngine.e.b bVar7;
        com.tsf.shell.workspace3D.k.j jVar8;
        com.censivn.C3DEngine.e.b bVar8;
        com.censivn.C3DEngine.e.b bVar9;
        float f;
        com.tsf.shell.workspace3D.k.j jVar9;
        com.tsf.shell.workspace3D.k.j jVar10;
        com.censivn.C3DEngine.e.b bVar10;
        com.censivn.C3DEngine.e.b bVar11;
        z = this.a.a.u;
        if (!z) {
            bVar = this.a.a.v;
            if (bVar != null) {
                jVar = this.a.a.e;
                float f2 = jVar.N().x;
                bVar2 = this.a.a.v;
                if (f2 != bVar2.N().x) {
                    com.censivn.C3DEngine.g.u uVar = new com.censivn.C3DEngine.g.u();
                    bVar3 = this.a.a.v;
                    uVar.j(bVar3.N().x);
                    bVar4 = this.a.a.v;
                    uVar.k(bVar4.N().y);
                    jVar2 = this.a.a.e;
                    com.censivn.C3DEngine.g.s.a(jVar2);
                    jVar3 = this.a.a.e;
                    com.censivn.C3DEngine.g.s.a(jVar3, 250, uVar);
                }
            }
        } else if (!this.b) {
            bVar7 = this.a.a.v;
            if (bVar7 != null) {
                jVar8 = this.a.a.e;
                Number3d N = jVar8.N();
                bVar8 = this.a.a.v;
                N.setAllFrom(bVar8.N());
            }
        } else {
            com.censivn.C3DEngine.g.u uVar2 = new com.censivn.C3DEngine.g.u();
            bVar9 = this.a.a.v;
            if (bVar9 != null) {
                bVar10 = this.a.a.v;
                uVar2.j(bVar10.N().x);
                bVar11 = this.a.a.v;
                uVar2.k(bVar11.N().y);
            }
            f = this.a.a.t;
            uVar2.e(f);
            jVar9 = this.a.a.e;
            com.censivn.C3DEngine.g.s.a(jVar9);
            jVar10 = this.a.a.e;
            com.censivn.C3DEngine.g.s.a(jVar10, 250, uVar2);
        }
        com.tsf.shell.workspace3D.h.a k = bf.j().k();
        jVar4 = this.a.a.e;
        jVar4.Q();
        bVar5 = this.a.a.v;
        if (bVar5 == null) {
            jVar5 = this.a.a.e;
            k.g(jVar5);
        } else {
            com.tsf.shell.workspace3D.e.p s = bf.s();
            bVar6 = this.a.a.v;
            jVar7 = this.a.a.e;
            s.a(bVar6, (com.censivn.C3DEngine.b.r) jVar7);
            this.a.a.v = null;
        }
        jVar6 = this.a.a.e;
        jVar6.f(false);
        cVar = this.a.a.c;
        cVar.c(true);
        bf.m().a();
        com.tsf.shell.i.a().b("LineViewer");
        this.a.a.k = 0;
        p.h(this.a.a);
    }
}
