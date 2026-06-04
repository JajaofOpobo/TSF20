package com.tsf.shell.workspace3D;

/* loaded from: classes.dex */
final class t extends com.censivn.C3DEngine.g.u {
    final /* synthetic */ r a;
    private final /* synthetic */ Runnable x;
    private final /* synthetic */ com.tsf.shell.workspace3D.h.a y;

    t(r rVar, Runnable runnable, com.tsf.shell.workspace3D.h.a aVar) {
        this.a = rVar;
        this.x = runnable;
        this.y = aVar;
    }

    @Override // com.censivn.C3DEngine.g.u
    public final void a() {
        com.censivn.C3DEngine.b.v vVar;
        if (this.x != null) {
            this.x.run();
            if (this.y instanceof com.tsf.shell.workspace3D.h.a.x) {
                ((com.tsf.shell.workspace3D.h.a.x) this.y).bG();
            }
        }
        vVar = this.a.f;
        vVar.e(true);
        this.a.w = true;
    }
}
