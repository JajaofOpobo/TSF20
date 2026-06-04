package com.tsf.shell.workspace3D.h;

/* loaded from: classes.dex */
final class ae extends com.censivn.C3DEngine.g.u {
    final /* synthetic */ ab a;
    private final /* synthetic */ a x;

    ae(ab abVar, a aVar) {
        this.a = abVar;
        this.x = aVar;
    }

    @Override // com.censivn.C3DEngine.g.u
    public final void a() {
        a aVar;
        this.x.Q();
        this.x.H();
        this.x.N().setAll(1.0f, 1.0f, 1.0f);
        if (this.x.o()) {
            this.x.h(false);
        }
        if (this.a.a.l < 13) {
            aVar = this.a.F;
            if (aVar == null) {
                this.a.f();
            }
        }
    }
}
