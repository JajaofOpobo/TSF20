package com.tsf.shell.workspace3D.k.c.b;

/* loaded from: classes.dex */
public final class am extends com.censivn.C3DEngine.e.b {
    private float C;
    private float a;

    public am(float f, float f2) {
        super(f, f2, 1, 1, false);
        c((Boolean) false);
        float f3 = f2 / 2.0f;
        this.C = f3;
        this.a = f3;
    }

    public final void i(float f) {
        E().pxY(2, f);
        E().pxY(3, f);
        this.a = f;
    }

    public final void j(float f) {
        E().pxY(0, -f);
        E().pxY(1, -f);
        this.C = f;
    }
}
