package com.censivn.C3DEngine.p052c.p053a.p054a;
/* renamed from: com.censivn.C3DEngine.c.a.a.a */
/* loaded from: classes.dex */
public class C1072a {

    /* renamed from: a */
    private C1073b f3351a;

    /* renamed from: b */
    private C1073b f3352b;

    /* renamed from: c */
    private float f3353c;

    /* renamed from: d */
    private float f3354d;

    public C1072a(C1073b c1073b, C1073b c1073b2, float f, float f2) {
        this.f3354d = 0.5f;
        this.f3351a = c1073b;
        this.f3352b = c1073b2;
        this.f3353c = f;
        this.f3354d = f2;
    }

    /* renamed from: a */
    public void m9968a(float f) {
        this.f3354d = f;
    }

    /* renamed from: a */
    public void m9969a() {
        float m9963b = this.f3351a.m9963b();
        float m9963b2 = this.f3352b.m9963b();
        float m9961c = this.f3351a.m9961c();
        float m9961c2 = this.f3352b.m9961c();
        float f = m9963b2 - m9963b;
        float f2 = m9961c2 - m9961c;
        float m9959d = this.f3352b.m9959d() - this.f3351a.m9959d();
        float sqrt = (float) Math.sqrt((f * f) + (f2 * f2) + (m9959d * m9959d));
        if (sqrt != this.f3353c) {
            float f3 = ((this.f3353c - sqrt) / sqrt) * this.f3354d;
            float f4 = f * f3;
            float f5 = f2 * f3;
            float f6 = m9959d * f3;
            if (!this.f3351a.f3358d || !this.f3352b.f3358d) {
                f4 *= 2.0f;
            }
            if (!this.f3351a.f3359e || !this.f3352b.f3359e) {
                f5 *= 2.0f;
            }
            if (!this.f3351a.f3360f || !this.f3352b.f3360f) {
                f6 *= 2.0f;
            }
            if (this.f3351a.f3358d) {
                this.f3351a.m9966a(this.f3351a.m9963b() - f4);
            }
            if (this.f3351a.f3359e) {
                this.f3351a.m9962b(this.f3351a.m9961c() - f5);
            }
            if (this.f3351a.f3360f) {
                this.f3351a.m9960c(this.f3351a.m9959d() - f6);
            }
            if (this.f3352b.f3358d) {
                this.f3352b.m9966a(f4 + this.f3352b.m9963b());
            }
            if (this.f3352b.f3359e) {
                this.f3352b.m9962b(f5 + this.f3352b.m9961c());
            }
            if (this.f3352b.f3360f) {
                this.f3352b.m9960c(this.f3352b.m9959d() + f6);
            }
        }
    }
}
