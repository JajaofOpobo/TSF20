package com.censivn.C3DEngine.c.b;

import com.censivn.C3DEngine.c.a.d;
import com.censivn.C3DEngine.c.a.e;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class a extends d implements com.censivn.C3DEngine.c.b {
    private float b;
    private float c;
    private int d = 0;
    private int e = 0;
    private int f = 0;

    public a(float f, float f2) {
        a(f);
        b(f2);
    }

    public void a(float f) {
        this.b = f;
    }

    public float b() {
        return this.b;
    }

    public void b(float f) {
        this.c = f;
        this.c = Math.max(0.0f, f);
        this.c = Math.min(1.0f, f);
    }

    public float c() {
        return this.c;
    }

    public int d() {
        return this.d;
    }

    public void a(int i) {
        this.e = i;
    }

    @Override // com.censivn.C3DEngine.c.b
    public void a() {
        if (b() != 0.0f) {
            if (this.e == 0) {
                this.e = this.a.i();
            }
            if (this.f == 0) {
                this.f = this.a.j();
            }
            float fA = this.a.a(this.e);
            float fB = this.a.b(this.e) - fA;
            ArrayList<e> arrayListA = this.a.a();
            int size = arrayListA.size();
            float fC = (c() * fB) + fA;
            float fB2 = (float) ((((double) fB) / 3.141592653589793d) / ((double) b()));
            float f = (float) ((((double) fB) / ((((double) fB2) * 3.141592653589793d) * 2.0d)) * 6.283185307179586d);
            for (int i = 0; i < size; i++) {
                e eVar = arrayListA.get(i);
                float fB3 = eVar.b(this.e);
                if ((d() != -1 || fB3 > c()) && (d() != 1 || fB3 < c())) {
                    float fC2 = (float) ((1.5707963267948966d - ((double) (c() * f))) + ((double) (fB3 * f)));
                    float fSin = (float) ((Math.sin(fC2) * ((double) (eVar.a(this.f) + fB2))) - ((double) fB2));
                    float fCos = (float) (((double) fC) - (Math.cos(fC2) * ((double) (eVar.a(this.f) + fB2))));
                    eVar.a(this.f, fSin);
                    eVar.a(this.e, fCos);
                }
            }
        }
    }
}
