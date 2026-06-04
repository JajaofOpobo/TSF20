package com.tsf.shell.workspace3D.h;

/* loaded from: classes.dex */
final class at extends com.censivn.C3DEngine.g.u {
    final /* synthetic */ ao a;
    private final /* synthetic */ a x;
    private final /* synthetic */ float y;
    private final /* synthetic */ float z;

    at(ao aoVar, a aVar, float f, float f2) {
        this.a = aoVar;
        this.x = aVar;
        this.y = f;
        this.z = f2;
    }

    @Override // com.censivn.C3DEngine.g.u
    public final void a() {
        this.a.i = false;
        this.a.l = false;
        this.a.e = 0.0f;
        this.a.c.a(this.x, false);
    }

    @Override // com.censivn.C3DEngine.g.u
    public final void a(float f) {
        this.a.e = this.y + ((this.z - this.y) * f);
    }
}
