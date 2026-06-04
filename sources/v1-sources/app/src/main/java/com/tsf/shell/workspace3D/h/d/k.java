package com.tsf.shell.workspace3D.h.d;

import com.censivn.C3DEngine.g.r;
import com.censivn.C3DEngine.g.s;

/* loaded from: classes.dex */
public final class k implements a {
    private int a = 2;

    @Override // com.tsf.shell.workspace3D.h.d.a
    public final int a() {
        return this.a;
    }

    @Override // com.tsf.shell.workspace3D.h.d.a
    public final void a(com.tsf.shell.workspace3D.k.j jVar, int i) {
        jVar.a((a) this);
        l lVar = new l(this, jVar);
        lVar.a((r) new com.censivn.C3DEngine.g.m());
        if (i == 0) {
            lVar.d(35.0f);
        } else {
            lVar.d(-35.0f);
        }
        s.a(jVar);
        s.a(jVar, 250, lVar);
    }

    @Override // com.tsf.shell.workspace3D.h.d.a
    public final void a(com.tsf.shell.workspace3D.k.j jVar) {
        jVar.M().y = 0.0f;
        jVar.a((a) null);
    }

    @Override // com.tsf.shell.workspace3D.h.d.a
    public final void a(com.censivn.C3DEngine.e.b bVar, int i, Runnable runnable) {
        n nVar = new n(this, bVar, runnable);
        nVar.a((r) new com.censivn.C3DEngine.g.m());
        if (i == 0) {
            nVar.d(35.0f);
        } else {
            nVar.d(-35.0f);
        }
        s.a(bVar);
        s.a(bVar, 250, nVar);
    }
}
