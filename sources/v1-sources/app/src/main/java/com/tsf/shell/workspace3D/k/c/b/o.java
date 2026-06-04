package com.tsf.shell.workspace3D.k.c.b;

/* loaded from: classes.dex */
final class o extends com.censivn.C3DEngine.g.u {
    final /* synthetic */ c a;
    private final /* synthetic */ com.tsf.shell.workspace3D.k.ab x;
    private final /* synthetic */ int y;
    private final /* synthetic */ int z;

    o(c cVar, com.tsf.shell.workspace3D.k.ab abVar, int i, int i2) {
        this.a = cVar;
        this.x = abVar;
        this.y = i;
        this.z = i2;
    }

    @Override // com.censivn.C3DEngine.g.u
    public final void a(float f) {
        this.x.a((Boolean) true);
        this.x.j(f);
    }

    @Override // com.censivn.C3DEngine.g.u
    public final void a() {
        if (this.y == this.z) {
            this.a.I();
        }
        this.x.e(true);
    }
}
