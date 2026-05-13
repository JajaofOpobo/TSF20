package com.censivn.C3DEngine.p052c.p053a;
/* renamed from: com.censivn.C3DEngine.c.a.b */
/* loaded from: classes.dex */
public class C1074b {

    /* renamed from: a */
    public float f3365a = 1.0f;

    /* renamed from: b */
    public float f3366b = 0.0f;

    /* renamed from: c */
    public float f3367c = 0.0f;

    /* renamed from: d */
    public float f3368d = 0.0f;

    /* renamed from: e */
    public float f3369e = 0.0f;

    /* renamed from: f */
    public float f3370f = 1.0f;

    /* renamed from: g */
    public float f3371g = 0.0f;

    /* renamed from: h */
    public float f3372h = 0.0f;

    /* renamed from: i */
    public float f3373i = 0.0f;

    /* renamed from: j */
    public float f3374j = 0.0f;

    /* renamed from: k */
    public float f3375k = 1.0f;

    /* renamed from: l */
    public float f3376l = 0.0f;

    /* renamed from: m */
    public float f3377m = 0.0f;

    /* renamed from: n */
    public float f3378n = 0.0f;

    /* renamed from: o */
    public float f3379o = 0.0f;

    /* renamed from: p */
    public float f3380p = 1.0f;

    /* renamed from: a */
    public static C1074b m9952a(float f, float f2, float f3) {
        C1074b c1074b = new C1074b();
        c1074b.f3368d = f;
        c1074b.f3372h = f2;
        c1074b.f3376l = f3;
        return c1074b;
    }

    /* renamed from: a */
    public static C1074b m9951a(float f, float f2, float f3, float f4) {
        return m9950a(f, f2, f3, f4, null);
    }

    /* renamed from: a */
    public static C1074b m9950a(float f, float f2, float f3, float f4, C1074b c1074b) {
        if (c1074b == null) {
            c1074b = new C1074b();
        }
        float cos = (float) Math.cos(f4);
        float sin = (float) Math.sin(f4);
        float f5 = 1.0f - cos;
        float f6 = f * f2 * f5;
        float f7 = f2 * f3 * f5;
        float f8 = f * f3 * f5;
        float f9 = sin * f3;
        float f10 = sin * f2;
        float f11 = sin * f;
        c1074b.f3365a = (f * f * f5) + cos;
        c1074b.f3366b = (-f9) + f6;
        c1074b.f3367c = f10 + f8;
        c1074b.f3368d = 0.0f;
        c1074b.f3369e = f6 + f9;
        c1074b.f3370f = (f2 * f2 * f5) + cos;
        c1074b.f3371g = (-f11) + f7;
        c1074b.f3372h = 0.0f;
        c1074b.f3373i = (-f10) + f8;
        c1074b.f3374j = f11 + f7;
        c1074b.f3375k = cos + (f3 * f3 * f5);
        c1074b.f3376l = 0.0f;
        return c1074b;
    }

    /* renamed from: a */
    public void m9949a(C1074b c1074b, C1074b c1074b2) {
        float f = c1074b.f3365a;
        float f2 = c1074b2.f3365a;
        float f3 = c1074b.f3369e;
        float f4 = c1074b2.f3369e;
        float f5 = c1074b.f3373i;
        float f6 = c1074b2.f3373i;
        float f7 = c1074b.f3366b;
        float f8 = c1074b2.f3366b;
        float f9 = c1074b.f3370f;
        float f10 = c1074b2.f3370f;
        float f11 = c1074b.f3374j;
        float f12 = c1074b2.f3374j;
        float f13 = c1074b.f3367c;
        float f14 = c1074b2.f3367c;
        float f15 = c1074b.f3371g;
        float f16 = c1074b2.f3371g;
        float f17 = c1074b.f3375k;
        float f18 = c1074b2.f3375k;
        float f19 = c1074b.f3368d;
        float f20 = c1074b2.f3368d;
        float f21 = c1074b.f3372h;
        float f22 = c1074b2.f3372h;
        float f23 = c1074b.f3376l;
        float f24 = c1074b2.f3376l;
        this.f3365a = (f * f2) + (f7 * f4) + (f13 * f6);
        this.f3366b = (f * f8) + (f7 * f10) + (f13 * f12);
        this.f3367c = (f * f14) + (f7 * f16) + (f13 * f18);
        this.f3368d = (f * f20) + (f7 * f22) + (f13 * f24) + f19;
        this.f3369e = (f3 * f2) + (f9 * f4) + (f15 * f6);
        this.f3370f = (f3 * f8) + (f9 * f10) + (f15 * f12);
        this.f3371g = (f3 * f14) + (f9 * f16) + (f15 * f18);
        this.f3372h = (f3 * f20) + (f9 * f22) + (f15 * f24) + f21;
        this.f3373i = (f5 * f2) + (f11 * f4) + (f17 * f6);
        this.f3374j = (f5 * f8) + (f11 * f10) + (f17 * f12);
        this.f3375k = (f5 * f14) + (f11 * f16) + (f17 * f18);
        this.f3376l = (f5 * f20) + (f11 * f22) + (f17 * f24) + f23;
    }

    /* renamed from: b */
    public static C1074b m9948b(C1074b c1074b, C1074b c1074b2) {
        C1074b c1074b3 = new C1074b();
        c1074b3.m9949a(c1074b, c1074b2);
        return c1074b3;
    }
}
