package com.tsf.shell.f.i.c.a.c;

import com.censivn.C3DEngine.b.f.k;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class d extends k {
    private float a;
    private float d;
    private float e;
    private float f;

    public d(float f, float f2) {
        super(f, f2);
        this.a = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 0.0f;
        b(f, f2);
    }

    public void b(float f, float f2) {
        this.a = f2;
        this.d = f;
        this.f = f2 / 2.0f;
        this.e = f / 2.0f;
        points().setPX(0, this.e, -this.f, 0.0f);
        points().setPX(1, -this.e, -this.f, 0.0f);
        points().setPX(2, this.e, this.f, 0.0f);
        points().setPX(3, -this.e, this.f, 0.0f);
        updatePointsVBO();
    }
}
