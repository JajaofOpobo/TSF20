package com.censivn.C3DEngine.c.a.a;
/* loaded from: classes.dex */
public class a {
    private b a;
    private b b;
    private float c;
    private float d;

    public a(b bVar, b bVar2, float f, float f2) {
        this.d = 0.5f;
        this.a = bVar;
        this.b = bVar2;
        this.c = f;
        this.d = f2;
    }

    public void a(float f) {
        this.d = f;
    }

    public void a() {
        float b = this.a.b();
        float b2 = this.b.b();
        float c = this.a.c();
        float c2 = this.b.c();
        float f = b2 - b;
        float f2 = c2 - c;
        float d = this.b.d() - this.a.d();
        float sqrt = (float) Math.sqrt((f * f) + (f2 * f2) + (d * d));
        if (sqrt != this.c) {
            float f3 = ((this.c - sqrt) / sqrt) * this.d;
            float f4 = f * f3;
            float f5 = f2 * f3;
            float f6 = d * f3;
            if (!this.a.d || !this.b.d) {
                f4 *= 2.0f;
            }
            if (!this.a.e || !this.b.e) {
                f5 *= 2.0f;
            }
            if (!this.a.f || !this.b.f) {
                f6 *= 2.0f;
            }
            if (this.a.d) {
                this.a.a(this.a.b() - f4);
            }
            if (this.a.e) {
                this.a.b(this.a.c() - f5);
            }
            if (this.a.f) {
                this.a.c(this.a.d() - f6);
            }
            if (this.b.d) {
                this.b.a(f4 + this.b.b());
            }
            if (this.b.e) {
                this.b.b(f5 + this.b.c());
            }
            if (this.b.f) {
                this.b.c(this.b.d() + f6);
            }
        }
    }
}
