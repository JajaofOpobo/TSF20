package com.tsf.shell.f.e.c.a;

import com.censivn.C3DEngine.api.primitives.VRectangle;
/* loaded from: classes.dex */
public class a extends VRectangle {
    private float a;
    private float b;
    private float c;
    private float d;

    public a(float f, float f2) {
        super(f, f2);
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = 0.0f;
        this.d = 0.0f;
        a(f, f2);
    }

    public void a(float f, float f2) {
        this.a = f2;
        this.b = f;
        this.d = f2 / 2.0f;
        this.c = f / 2.0f;
        point().setPX(0, this.c, -this.d, 0.0f);
        point().setPX(1, -this.c, -this.d, 0.0f);
        point().setPX(2, this.c, this.d, 0.0f);
        point().setPX(3, -this.c, this.d, 0.0f);
        updatePointsVBO();
    }

    public void b(float f, float f2) {
        point().setPX(0, f2, -this.d, 0.0f);
        point().setPX(1, f, -this.d, 0.0f);
        point().setPX(2, f2, this.d, 0.0f);
        point().setPX(3, f, this.d, 0.0f);
        updatePointsVBO();
    }
}
