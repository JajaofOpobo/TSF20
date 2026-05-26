package com.tsf.shell.f.e.c.a;

import com.censivn.C3DEngine.api.primitives.VRectangle;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class b extends VRectangle {
    public float a;
    private float b;
    private float c;
    private float d;
    private float e;
    private e f;

    public b(float f, e eVar) {
        super(f, f);
        this.b = 0.0f;
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.a = 0.0f;
        a(f);
        this.f = eVar;
    }

    public void a(e eVar) {
        this.f = eVar;
    }

    public void a(float f, float f2) {
        this.b = f2;
        this.c = f;
        this.e = f2 / 2.0f;
        this.d = f / 2.0f;
        point().setPX(0, this.d, -this.e, 0.0f);
        point().setPX(1, -this.d, -this.e, 0.0f);
        point().setPX(2, this.d, this.e, 0.0f);
        point().setPX(3, -this.d, this.e, 0.0f);
        updatePointsVBO();
    }

    public void a(float f) {
        this.a = f;
        a(this.a * 2.0f, this.a * 2.0f);
    }

    public void b(float f) {
        float f2 = this.f.a - f;
        float f3 = this.f.b;
        a(((float) Math.sqrt((f2 * f2) + (f3 * f3))) - this.f.c);
        position().x = f;
    }

    public float a() {
        float fAbs = Math.abs((this.a * position().x) / (this.f.c + this.a));
        if (position().x < 0.0f) {
            return fAbs + position().x;
        }
        return position().x - fAbs;
    }
}
