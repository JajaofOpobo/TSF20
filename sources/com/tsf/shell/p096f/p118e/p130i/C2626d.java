package com.tsf.shell.p096f.p118e.p130i;

import com.censivn.C3DEngine.p031b.p038f.p039a.C0964b;
/* renamed from: com.tsf.shell.f.e.i.d */
/* loaded from: classes.dex */
public class C2626d {

    /* renamed from: a */
    private C0964b f8637a;

    /* renamed from: b */
    private float f8638b = 0.0f;

    /* renamed from: c */
    private float f8639c = 0.0f;

    /* renamed from: d */
    private float f8640d = 0.0f;

    /* renamed from: e */
    private float f8641e = 0.0f;

    /* renamed from: f */
    private float f8642f = 0.0f;

    /* renamed from: g */
    private float f8643g = 0.0f;

    /* renamed from: h */
    private float f8644h = 0.0f;

    /* renamed from: i */
    private float f8645i = 0.0f;

    public C2626d(C0964b c0964b) {
        this.f8637a = c0964b;
    }

    /* renamed from: a */
    public void m5127a() {
        this.f8638b = 0.0f;
        this.f8639c = 0.0f;
        this.f8640d = 0.0f;
        this.f8642f = 0.0f;
        this.f8643g = 0.0f;
        this.f8644h = 0.0f;
        this.f8641e = 0.0f;
        this.f8637a.m10443a(255.0f);
        float random = (float) Math.random();
        this.f8637a.m10405k().setAll(random, random, random);
        this.f8637a.m10421c(0, 0, 1, 1);
        this.f8637a.m10408h();
        this.f8642f = m5126a(1.0f, 5.0f);
        this.f8643g = m5126a(1.0f, 5.0f);
        this.f8644h = m5126a(5.0f, 15.0f);
        this.f8645i = m5126a(10.0f, 10.0f);
        this.f8637a.m10407i().spX(this.f8638b);
        this.f8637a.m10407i().spY(this.f8639c);
        this.f8637a.m10407i().spZ(this.f8640d);
        this.f8637a.m10406j().f2528z = this.f8641e;
        this.f8637a.m10408h();
    }

    /* renamed from: a */
    public float m5126a(float f, float f2) {
        float random = (float) (Math.random() * f2);
        float f3 = Math.random() > 0.5d ? 1.0f : -1.0f;
        return (f3 * f) + (random * f3);
    }

    /* renamed from: b */
    public boolean m5125b() {
        this.f8642f *= 0.98f;
        this.f8638b += this.f8642f;
        this.f8643g -= 0.05f;
        this.f8643g *= 0.98f;
        this.f8639c += this.f8643g;
        this.f8644h *= 0.98f;
        this.f8640d += this.f8644h;
        this.f8645i = 0.98f * this.f8645i;
        this.f8641e += this.f8645i;
        this.f8637a.m10407i().spX(this.f8638b);
        this.f8637a.m10407i().spY(this.f8639c);
        this.f8637a.m10407i().spZ(this.f8640d);
        this.f8637a.m10406j().f2528z = this.f8641e;
        this.f8637a.m10408h();
        return true;
    }
}
