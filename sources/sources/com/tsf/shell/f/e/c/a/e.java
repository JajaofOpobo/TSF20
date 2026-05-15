package com.tsf.shell.f.e.c.a;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
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
        float fAbs = Math.abs((this.c * this.a) / (eVar.c + this.c));
        if (this.a < 0.0f) {
            return fAbs + this.a;
        }
        return this.a - fAbs;
    }

    public float b(e eVar) {
        float fAbs = Math.abs((this.c * eVar.b) / (eVar.c + this.c));
        if (eVar.b < 0.0f) {
            return fAbs * (-1.0f);
        }
        return fAbs;
    }
}
