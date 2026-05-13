package com.censivn.C3DEngine.p052c.p053a.p054a;

import com.censivn.C3DEngine.p052c.p053a.C1077e;
/* renamed from: com.censivn.C3DEngine.c.a.a.b */
/* loaded from: classes.dex */
public class C1073b {

    /* renamed from: a */
    public float f3355a;

    /* renamed from: b */
    public float f3356b;

    /* renamed from: c */
    public float f3357c;

    /* renamed from: d */
    public boolean f3358d = true;

    /* renamed from: e */
    public boolean f3359e = true;

    /* renamed from: f */
    public boolean f3360f = true;

    /* renamed from: g */
    private C1077e f3361g;

    /* renamed from: h */
    private float f3362h;

    /* renamed from: i */
    private float f3363i;

    /* renamed from: j */
    private float f3364j;

    public C1073b(C1077e c1077e) {
        this.f3361g = c1077e;
        m9965a(this.f3361g.m9932a(), this.f3361g.m9925b(), this.f3361g.m9921c());
    }

    /* renamed from: a */
    public void m9965a(float f, float f2, float f3) {
        this.f3355a = f;
        this.f3362h = f;
        this.f3356b = f2;
        this.f3363i = f2;
        this.f3357c = f3;
        this.f3364j = f3;
        this.f3361g.m9931a(f);
        this.f3361g.m9924b(f2);
        this.f3361g.m9920c(f3);
    }

    /* renamed from: a */
    public void m9967a() {
        if (this.f3358d) {
            float m9963b = m9963b();
            m9966a(m9963b() + m9957e());
            this.f3355a = m9963b;
        }
        if (this.f3359e) {
            float m9961c = m9961c();
            m9962b(m9961c() + m9955f());
            this.f3356b = m9961c;
        }
        if (this.f3360f) {
            float m9959d = m9959d();
            m9960c(m9959d() + m9953g());
            this.f3357c = m9959d;
        }
    }

    /* renamed from: b */
    public float m9963b() {
        return this.f3362h;
    }

    /* renamed from: a */
    public void m9966a(float f) {
        this.f3362h = f;
        if (!this.f3358d) {
            this.f3355a = f;
        }
        this.f3361g.m9931a(f);
    }

    /* renamed from: c */
    public float m9961c() {
        return this.f3363i;
    }

    /* renamed from: b */
    public void m9962b(float f) {
        this.f3363i = f;
        if (!this.f3359e) {
            this.f3356b = f;
        }
        this.f3361g.m9924b(f);
    }

    /* renamed from: d */
    public float m9959d() {
        return this.f3364j;
    }

    /* renamed from: c */
    public void m9960c(float f) {
        this.f3364j = f;
        if (!this.f3360f) {
            this.f3357c = f;
        }
        this.f3361g.m9920c(f);
    }

    /* renamed from: e */
    public float m9957e() {
        return this.f3362h - this.f3355a;
    }

    /* renamed from: d */
    public void m9958d(float f) {
        this.f3355a = this.f3362h - f;
    }

    /* renamed from: f */
    public float m9955f() {
        return this.f3363i - this.f3356b;
    }

    /* renamed from: e */
    public void m9956e(float f) {
        this.f3356b = this.f3363i - f;
    }

    /* renamed from: g */
    public float m9953g() {
        return this.f3364j - this.f3357c;
    }

    /* renamed from: f */
    public void m9954f(float f) {
        this.f3357c = this.f3364j - f;
    }

    /* renamed from: a */
    public float m9964a(C1073b c1073b) {
        return (float) Math.sqrt(((m9963b() - c1073b.m9963b()) * (m9963b() - c1073b.m9963b())) + ((m9961c() - c1073b.m9961c()) * (m9961c() - c1073b.m9961c())) + ((m9959d() - c1073b.m9959d()) * (m9959d() - c1073b.m9959d())));
    }
}
