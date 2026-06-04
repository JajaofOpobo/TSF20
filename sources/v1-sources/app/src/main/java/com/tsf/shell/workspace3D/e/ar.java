package com.tsf.shell.workspace3D.e;

/* loaded from: classes.dex */
final class ar extends com.censivn.C3DEngine.g.u {
    final /* synthetic */ p a;
    private final /* synthetic */ float x;
    private final /* synthetic */ boolean y;

    ar(p pVar, float f, boolean z) {
        this.a = pVar;
        this.x = f;
        this.y = z;
    }

    @Override // com.censivn.C3DEngine.g.u
    public final void a(float f) {
        this.a.a(this.x * (1.0f - f), this.y);
    }

    @Override // com.censivn.C3DEngine.g.u
    public final void a() {
    }
}
