package com.tsf.shell.workspace3D.e;

/* loaded from: classes.dex */
final class as extends com.censivn.C3DEngine.g.u {
    private final /* synthetic */ Runnable A;
    final /* synthetic */ p a;
    private final /* synthetic */ float x;
    private final /* synthetic */ float y;
    private final /* synthetic */ boolean z;

    as(p pVar, float f, float f2, boolean z, Runnable runnable) {
        this.a = pVar;
        this.x = f;
        this.y = f2;
        this.z = z;
        this.A = runnable;
    }

    @Override // com.censivn.C3DEngine.g.u
    public final void a(float f) {
        this.a.a(this.x + ((this.y - this.x) * f), this.z);
    }

    @Override // com.censivn.C3DEngine.g.u
    public final void a() {
        if (this.A != null) {
            this.A.run();
        }
    }
}
