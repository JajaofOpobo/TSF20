package com.tsf.shell.f.e.c.a;
/* loaded from: classes.dex */
public class e {
    public float a;
    public float b;
    public float c;

    public e(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    public float a(e eVar) {
        float abs = Math.abs((this.c * this.a) / (eVar.c + this.c));
        if (this.a < 0.0f) {
            return abs + this.a;
        }
        return this.a - abs;
    }

    public float b(e eVar) {
        float abs = Math.abs((this.c * eVar.b) / (eVar.c + this.c));
        if (eVar.b < 0.0f) {
            return abs * (-1.0f);
        }
        return abs;
    }
}
