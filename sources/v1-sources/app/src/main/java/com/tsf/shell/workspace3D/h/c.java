package com.tsf.shell.workspace3D.h;

/* loaded from: classes.dex */
final class c extends com.tsf.shell.workspace3D.g.c.o {
    final /* synthetic */ a a;

    c(a aVar) {
        this.a = aVar;
    }

    @Override // com.tsf.shell.workspace3D.g.c.o
    public final void a(com.tsf.shell.workspace3D.k.z zVar) {
        if (zVar instanceof com.tsf.shell.workspace3D.k.c.b.ac) {
            com.tsf.shell.workspace3D.k.b.ap.a(zVar, 0, null, null);
        } else {
            com.tsf.shell.workspace3D.k.b.ap.a(zVar, 0, null);
        }
    }

    @Override // com.censivn.C3DEngine.b.v, com.censivn.C3DEngine.d.b
    public final void d(com.censivn.C3DEngine.b.r rVar) {
        super.d(rVar);
        this.a.E.a(rVar);
    }
}
