package com.tsf.shell.workspace3D.k.c.b;

/* loaded from: classes.dex */
final class j extends com.censivn.C3DEngine.g.u {
    final /* synthetic */ c a;
    private final /* synthetic */ com.tsf.shell.workspace3D.k.ab x;

    j(c cVar, com.tsf.shell.workspace3D.k.ab abVar) {
        this.a = cVar;
        this.x = abVar;
    }

    @Override // com.censivn.C3DEngine.g.u
    public final void a(float f) {
        if (this.x.bK() != 0.0f) {
            this.x.j(1.0f - f);
        }
    }
}
