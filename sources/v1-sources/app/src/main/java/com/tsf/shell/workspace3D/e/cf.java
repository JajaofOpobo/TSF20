package com.tsf.shell.workspace3D.e;

/* loaded from: classes.dex */
public final class cf extends com.censivn.C3DEngine.b.v {
    private float A;
    private com.censivn.C3DEngine.e.b a;

    public cf(com.censivn.C3DEngine.e.b bVar, float f, float f2) {
        this.a = bVar;
        a(f, f2);
        this.A = this.a.L().y;
        d(this.a);
    }

    public final void a(float f, float f2) {
        this.a.L().x = f;
        this.a.L().y = f2;
    }

    public final void i() {
        com.censivn.C3DEngine.g.s.a(this.a);
    }

    public static void j() {
    }
}
