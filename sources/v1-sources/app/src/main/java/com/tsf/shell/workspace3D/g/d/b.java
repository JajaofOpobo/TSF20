package com.tsf.shell.workspace3D.g.d;

/* loaded from: classes.dex */
final class b extends com.censivn.C3DEngine.g.u {
    final /* synthetic */ a a;
    private final /* synthetic */ float x;
    private final /* synthetic */ float y;

    b(a aVar, float f, float f2) {
        this.a = aVar;
        this.x = f;
        this.y = f2;
    }

    @Override // com.censivn.C3DEngine.g.u
    public final void a(float f) {
        this.a.h(this.x + ((this.y - this.x) * f));
    }
}
