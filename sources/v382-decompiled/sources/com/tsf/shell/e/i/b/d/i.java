package com.tsf.shell.e.i.b.d;

import com.censivn.C3DEngine.b.f.m;

/* loaded from: classes.dex */
public class i extends m {
    private float a;
    private float d;

    public i(float f, float f2) {
        super(f, f2, 1, 1, false);
        useVBO(false);
        float f3 = f2 / 2.0f;
        this.d = f3;
        this.a = f3;
    }

    public void c(float f) {
        points().pxY(2, f);
        points().pxY(3, f);
        this.a = f;
    }

    public void d(float f) {
        points().pxY(0, -f);
        points().pxY(1, -f);
        this.d = f;
    }
}
