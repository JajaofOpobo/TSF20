package com.tsf.shell.plugin.crop;
/* renamed from: com.tsf.shell.plugin.crop.b */
/* loaded from: classes.dex */
public class C3788b {

    /* renamed from: a */
    public float f12434a;

    /* renamed from: b */
    public float f12435b;

    /* renamed from: c */
    public float f12436c;

    /* renamed from: d */
    public float f12437d;

    /* renamed from: e */
    public float f12438e;

    /* renamed from: f */
    public float f12439f;

    /* renamed from: g */
    public float f12440g;

    /* renamed from: h */
    public float f12441h;

    /* renamed from: i */
    public float f12442i;

    /* renamed from: j */
    public float f12443j;

    /* renamed from: k */
    public float f12444k;

    /* renamed from: l */
    public float f12445l;

    /* renamed from: m */
    private InterfaceC3789a f12446m;

    /* renamed from: com.tsf.shell.plugin.crop.b$a */
    /* loaded from: classes.dex */
    public interface InterfaceC3789a {
        /* renamed from: a */
        void mo1436a();
    }

    /* renamed from: a */
    public void m1481a(InterfaceC3789a interfaceC3789a) {
        this.f12446m = interfaceC3789a;
    }

    /* renamed from: a */
    public void m1479a(C3788b c3788b, C3788b c3788b2) {
        float f = this.f12434a - c3788b.f12434a;
        float f2 = this.f12435b - c3788b.f12435b;
        float f3 = this.f12436c - c3788b.f12434a;
        float f4 = this.f12437d - c3788b.f12435b;
        c3788b2.m1476b(f, f2, f3, f4);
        c3788b2.f12442i = f / c3788b.f12440g;
        c3788b2.f12443j = f2 / c3788b.f12441h;
        c3788b2.f12444k = f3 / c3788b.f12440g;
        c3788b2.f12445l = f4 / c3788b.f12441h;
    }

    /* renamed from: b */
    public void m1475b(C3788b c3788b, C3788b c3788b2) {
        m1476b(c3788b.f12434a + (c3788b.f12440g * c3788b2.f12442i), c3788b.f12435b + (c3788b.f12441h * c3788b2.f12443j), c3788b.f12434a + (c3788b.f12440g * c3788b2.f12444k), c3788b.f12435b + (c3788b.f12441h * c3788b2.f12445l));
    }

    /* renamed from: a */
    public void m1483a(float f, float f2) {
        this.f12438e = f;
        this.f12439f = f2;
        m1472d();
    }

    /* renamed from: a */
    public void m1484a(float f) {
        this.f12438e = f;
        m1472d();
    }

    /* renamed from: b */
    public void m1477b(float f) {
        this.f12439f = f;
        m1472d();
    }

    /* renamed from: c */
    public void m1473c(float f) {
        this.f12440g = f;
        m1472d();
    }

    /* renamed from: d */
    public void m1471d(float f) {
        this.f12441h = f;
        m1472d();
    }

    /* renamed from: e */
    public void m1470e(float f) {
        this.f12434a = f;
        m1474c();
    }

    /* renamed from: f */
    public void m1469f(float f) {
        this.f12435b = f;
        m1474c();
    }

    /* renamed from: g */
    public void m1468g(float f) {
        this.f12437d = f;
        m1474c();
    }

    /* renamed from: h */
    public void m1467h(float f) {
        this.f12436c = f;
        m1474c();
    }

    /* renamed from: a */
    public void m1480a(C3788b c3788b) {
        this.f12438e = c3788b.f12438e;
        this.f12439f = c3788b.f12439f;
        this.f12440g = c3788b.f12440g;
        this.f12441h = c3788b.f12441h;
        m1472d();
    }

    /* renamed from: a */
    public void m1482a(float f, float f2, float f3, float f4) {
        this.f12438e = f;
        this.f12439f = f2;
        this.f12440g = f3;
        this.f12441h = f4;
        m1472d();
    }

    /* renamed from: b */
    public void m1476b(float f, float f2, float f3, float f4) {
        this.f12434a = f;
        this.f12435b = f2;
        this.f12436c = f3;
        this.f12437d = f4;
        m1474c();
    }

    /* renamed from: c */
    private void m1474c() {
        this.f12438e = this.f12434a;
        this.f12439f = this.f12435b;
        this.f12440g = this.f12436c - this.f12434a;
        this.f12441h = this.f12437d - this.f12435b;
        if (this.f12446m != null) {
            this.f12446m.mo1436a();
        }
    }

    /* renamed from: d */
    private void m1472d() {
        this.f12434a = this.f12438e;
        this.f12435b = this.f12439f;
        this.f12436c = this.f12438e + this.f12440g;
        this.f12437d = this.f12439f + this.f12441h;
        if (this.f12446m != null) {
            this.f12446m.mo1436a();
        }
    }

    /* renamed from: a */
    public float m1485a() {
        return this.f12438e + (this.f12440g / 2.0f);
    }

    /* renamed from: b */
    public float m1478b() {
        return this.f12439f + (this.f12441h / 2.0f);
    }
}
