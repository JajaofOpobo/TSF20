package com.censivn.C3DEngine.p031b.p041g.p042a;

import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.censivn.C3DEngine.p031b.p041g.InterfaceC1011b;
/* renamed from: com.censivn.C3DEngine.b.g.a.b */
/* loaded from: classes.dex */
public class C1008b extends AbstractC1009c {

    /* renamed from: c */
    private C1017d f2982c;

    /* renamed from: d */
    private C0975i f2983d;

    /* renamed from: e */
    private int f2984e;

    /* renamed from: f */
    private long f2985f = 0;

    /* renamed from: g */
    private long f2986g = 0;

    /* renamed from: h */
    private Runnable f2987h;

    /* renamed from: i */
    private InterfaceC1011b f2988i;

    /* renamed from: j */
    private float f2989j;

    /* renamed from: k */
    private float f2990k;

    /* renamed from: l */
    private float f2991l;

    /* renamed from: m */
    private float f2992m;

    /* renamed from: n */
    private float f2993n;

    /* renamed from: o */
    private float f2994o;

    /* renamed from: p */
    private float f2995p;

    /* renamed from: q */
    private float f2996q;

    /* renamed from: r */
    private float f2997r;

    /* renamed from: s */
    private float f2998s;

    public C1008b(C0975i c0975i, int i, C1017d c1017d) {
        this.f2984e = 0;
        c1017d.m10312a(c0975i);
        c0975i.setTweenChild(this);
        this.f2983d = c0975i;
        this.f2984e = i;
        this.f2982c = c1017d;
        this.f2988i = c1017d.m10304e();
        m10338b();
    }

    @Override // com.censivn.C3DEngine.p031b.p041g.p042a.AbstractC1009c
    /* renamed from: a */
    public C1017d mo10337a() {
        return this.f2982c;
    }

    /* renamed from: b */
    public void m10338b() {
        if (this.f2982c.f3032g) {
            this.f2989j = this.f2983d.position().f2526x;
        }
        if (this.f2982c.f3033h) {
            this.f2990k = this.f2983d.position().f2527y;
        }
        if (this.f2982c.f3034i) {
            this.f2991l = this.f2983d.position().f2528z;
        }
        if (this.f2982c.f3035j) {
            this.f2992m = this.f2983d.rotation().f2526x;
        }
        if (this.f2982c.f3036k) {
            this.f2993n = this.f2983d.rotation().f2527y;
        }
        if (this.f2982c.f3037l) {
            this.f2994o = this.f2983d.rotation().f2528z;
        }
        if (this.f2982c.f3038m) {
            this.f2995p = this.f2983d.scale().f2526x;
        }
        if (this.f2982c.f3039n) {
            this.f2996q = this.f2983d.scale().f2527y;
        }
        if (this.f2982c.f3040o) {
            this.f2997r = this.f2983d.scale().f2528z;
        }
        if (this.f2982c.f3041p) {
            this.f2998s = this.f2983d.alpha();
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p041g.p042a.AbstractC1009c
    /* renamed from: c */
    public void mo10335c() {
        if (this.f2999a == 0 || this.f2999a == 2) {
            if (this.f2999a == 2) {
                this.f2985f = System.currentTimeMillis() - this.f2986g;
                this.f2999a = 0;
            }
            if (this.f2985f == 0) {
                this.f2985f = System.currentTimeMillis();
                this.f2982c.mo10310b();
            }
            this.f2986g = (int) (System.currentTimeMillis() - this.f2985f);
            if (this.f2986g >= this.f2984e || this.f2986g < 0) {
                this.f2986g = this.f2984e;
                C1014c.m10323b(this);
                m10339a(1.0f);
                this.f2982c.mo558b(1.0f);
                this.f2982c.mo518a(1.0f);
                this.f2983d.setTweenChild(null);
                this.f2982c.mo732a();
                if (this.f2982c.m10300g() != null) {
                    this.f2982c.m10300g().run();
                    return;
                }
                return;
            }
            float f = ((float) this.f2986g) / this.f2984e;
            float mo10331a = this.f2988i.mo10331a(f);
            m10339a(mo10331a);
            this.f2982c.mo558b(f);
            this.f2982c.mo518a(mo10331a);
        }
    }

    /* renamed from: a */
    private void m10339a(float f) {
        if (this.f2982c.f3032g) {
            this.f2983d.position().f2526x = this.f2989j + ((this.f2982c.f3043r - this.f2989j) * f);
        }
        if (this.f2982c.f3033h) {
            this.f2983d.position().f2527y = this.f2990k + ((this.f2982c.f3044s - this.f2990k) * f);
        }
        if (this.f2982c.f3034i) {
            this.f2983d.position().f2528z = this.f2991l + ((this.f2982c.f3045t - this.f2991l) * f);
        }
        if (this.f2982c.f3035j) {
            this.f2983d.rotation().f2526x = this.f2992m + ((this.f2982c.f3046u - this.f2992m) * f);
        }
        if (this.f2982c.f3036k) {
            this.f2983d.rotation().f2527y = this.f2993n + ((this.f2982c.f3047v - this.f2993n) * f);
        }
        if (this.f2982c.f3037l) {
            this.f2983d.rotation().f2528z = this.f2994o + ((this.f2982c.f3048w - this.f2994o) * f);
        }
        if (this.f2982c.f3038m) {
            this.f2983d.scale().f2526x = this.f2995p + ((this.f2982c.f3049x - this.f2995p) * f);
        }
        if (this.f2982c.f3039n) {
            this.f2983d.scale().f2527y = this.f2996q + ((this.f2982c.f3050y - this.f2996q) * f);
        }
        if (this.f2982c.f3040o) {
            this.f2983d.scale().f2528z = this.f2997r + ((this.f2982c.f3051z - this.f2997r) * f);
        }
        if (this.f2982c.f3041p) {
            this.f2983d.alpha(this.f2998s + ((this.f2982c.f3026A - this.f2998s) * f));
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p041g.p042a.AbstractC1009c
    /* renamed from: a */
    public void mo10336a(Runnable runnable) {
        this.f2987h = runnable;
    }

    @Override // com.censivn.C3DEngine.p031b.p041g.p042a.AbstractC1009c
    /* renamed from: d */
    public Runnable mo10334d() {
        return this.f2987h;
    }

    @Override // com.censivn.C3DEngine.p031b.p041g.p042a.AbstractC1009c
    /* renamed from: e */
    public void mo10333e() {
        this.f2999a = 1;
    }

    @Override // com.censivn.C3DEngine.p031b.p041g.p042a.AbstractC1009c
    /* renamed from: f */
    public void mo10332f() {
        this.f2999a = 2;
    }
}
