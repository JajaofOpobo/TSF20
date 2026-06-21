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
        float f = b2 - b;
        float c2 = this.b.c() - c;
        float d = this.b.d() - this.a.d();
        float sqrt = (float) Math.sqrt((f * f) + (c2 * c2) + (d * d));
        if (sqrt != this.c) {
            float f2 = ((this.c - sqrt) / sqrt) * this.d;
            float f3 = f * f2;
            float f4 = c2 * f2;
            float f5 = d * f2;
            if (!this.a.d || !this.b.d) {
                f3 *= 2.0f;
            }
            if (!this.a.e || !this.b.e) {
                f4 *= 2.0f;
            }
            if (!this.a.f || !this.b.f) {
                f5 *= 2.0f;
            }
            if (this.a.d) {
                this.a.a(this.a.b() - f3);
            }
            if (this.a.e) {
                this.a.b(this.a.c() - f4);
            }
            if (this.a.f) {
                this.a.c(this.a.d() - f5);
            }
            if (this.b.d) {
                this.b.a(f3 + this.b.b());
            }
            if (this.b.e) {
                this.b.b(f4 + this.b.c());
            }
            if (this.b.f) {
                this.b.c(this.b.d() + f5);
            }
        }
    }
}
