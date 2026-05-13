package com.censivn.C3DEngine.c.b;

import com.censivn.C3DEngine.c.a.d;
import com.censivn.C3DEngine.c.a.e;
import java.util.ArrayList;
/* loaded from: classes.dex */
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
            float a = this.a.a(this.e);
            float b = this.a.b(this.e) - a;
            ArrayList<e> a2 = this.a.a();
            int size = a2.size();
            float c = (c() * b) + a;
            float b2 = (float) ((b / 3.141592653589793d) / b());
            float f = (float) ((b / ((b2 * 3.141592653589793d) * 2.0d)) * 6.283185307179586d);
            for (int i = 0; i < size; i++) {
                e eVar = a2.get(i);
                float b3 = eVar.b(this.e);
                if ((d() != -1 || b3 > c()) && (d() != 1 || b3 < c())) {
                    float c2 = (float) ((1.5707963267948966d - (c() * f)) + (b3 * f));
                    eVar.a(this.f, (float) ((Math.sin(c2) * (eVar.a(this.f) + b2)) - b2));
                    eVar.a(this.e, (float) (c - (Math.cos(c2) * (eVar.a(this.f) + b2))));
                }
            }
        }
    }
}
