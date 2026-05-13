package com.censivn.C3DEngine.p031b.p046h.p047a;

import com.censivn.C3DEngine.p031b.p038f.p039a.C0964b;
/* renamed from: com.censivn.C3DEngine.b.h.a.b */
/* loaded from: classes.dex */
public class C1022b {

    /* renamed from: a */
    private C0964b f3074a;

    /* renamed from: b */
    private float f3075b = 0.0f;

    /* renamed from: c */
    private float f3076c = 0.0f;

    /* renamed from: d */
    private float f3077d = 0.0f;

    /* renamed from: e */
    private float f3078e = 0.0f;

    /* renamed from: f */
    private float f3079f = 0.0f;

    /* renamed from: g */
    private float f3080g = 0.0f;

    public C1022b(C0964b c0964b) {
        this.f3074a = c0964b;
        float random = (float) Math.random();
        this.f3074a.m10405k().setAll(random, random, random);
        this.f3074a.m10421c(0, 0, 1, 1);
        this.f3074a.m10408h();
        m10271c();
    }

    /* renamed from: a */
    public void m10275a() {
        this.f3075b = 0.0f;
        this.f3076c = 0.0f;
        this.f3077d = 0.0f;
        m10271c();
        this.f3074a.m10407i().spX(0.0f);
        this.f3074a.m10407i().spY(0.0f);
        this.f3074a.m10407i().spZ(0.0f);
        this.f3074a.m10443a(255.0f);
        this.f3074a.m10408h();
    }

    /* renamed from: c */
    private void m10271c() {
        this.f3078e = m10274a(3.0f, 3.0f);
        this.f3079f = m10274a(3.0f, 3.0f);
        this.f3080g = m10274a(8.0f, 8.0f);
    }

    /* renamed from: a */
    public void m10273a(int i) {
        this.f3074a.f2830H.set(i);
        this.f3074a.m10408h();
    }

    /* renamed from: a */
    public float m10274a(float f, float f2) {
        float random = (float) (Math.random() * f2);
        float f3 = Math.random() > 0.5d ? 1.0f : -1.0f;
        return (f3 * f) + (random * f3);
    }

    /* renamed from: b */
    public boolean m10272b() {
        this.f3078e *= 0.98f;
        this.f3075b += this.f3078e;
        this.f3079f -= 0.05f;
        this.f3079f *= 0.98f;
        this.f3076c += this.f3079f;
        this.f3080g = 0.98f * this.f3080g;
        this.f3077d += this.f3080g;
        float abs = Math.abs(this.f3078e);
        if (abs < 2.0f && abs >= 1.0f) {
            this.f3074a.m10443a(((abs - 1.0f) / 1.0f) * 255.0f);
        }
        this.f3074a.m10407i().spX(this.f3075b);
        this.f3074a.m10407i().spY(this.f3076c);
        this.f3074a.m10407i().spZ(this.f3077d);
        this.f3074a.m10408h();
        return Math.abs(this.f3078e) >= 1.0f;
    }
}
