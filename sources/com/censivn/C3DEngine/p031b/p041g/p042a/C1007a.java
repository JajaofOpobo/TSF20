package com.censivn.C3DEngine.p031b.p041g.p042a;

import com.censivn.C3DEngine.p031b.p038f.p039a.C0964b;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.censivn.C3DEngine.p031b.p041g.InterfaceC1011b;
/* renamed from: com.censivn.C3DEngine.b.g.a.a */
/* loaded from: classes.dex */
public class C1007a extends AbstractC1009c {

    /* renamed from: c */
    private C1017d f2966c;

    /* renamed from: d */
    private C0964b f2967d;

    /* renamed from: e */
    private int f2968e;

    /* renamed from: f */
    private long f2969f;

    /* renamed from: g */
    private long f2970g;

    /* renamed from: h */
    private Runnable f2971h;

    /* renamed from: i */
    private InterfaceC1011b f2972i;

    /* renamed from: j */
    private float f2973j;

    /* renamed from: k */
    private float f2974k;

    /* renamed from: l */
    private float f2975l;

    /* renamed from: m */
    private float f2976m;

    /* renamed from: n */
    private float f2977n;

    /* renamed from: o */
    private float f2978o;

    /* renamed from: p */
    private float f2979p;

    /* renamed from: q */
    private float f2980q;

    /* renamed from: r */
    private float f2981r;

    public C1007a(C0964b c0964b, int i, C1017d c1017d) {
        c1017d.m10312a(c0964b);
        c0964b.setTweenChild(this);
        this.f2967d = c0964b;
        this.f2968e = i;
        this.f2966c = c1017d;
        this.f2972i = c1017d.m10304e();
        m10340b();
    }

    @Override // com.censivn.C3DEngine.p031b.p041g.p042a.AbstractC1009c
    /* renamed from: a */
    public C1017d mo10337a() {
        return this.f2966c;
    }

    /* renamed from: b */
    public void m10340b() {
        if (this.f2966c.f3032g) {
            this.f2973j = this.f2967d.f2853m.f2526x;
        }
        if (this.f2966c.f3033h) {
            this.f2974k = this.f2967d.f2853m.f2527y;
        }
        if (this.f2966c.f3034i) {
            this.f2975l = this.f2967d.f2853m.f2528z;
        }
        if (this.f2966c.f3035j) {
            this.f2976m = this.f2967d.f2854n.f2526x;
        }
        if (this.f2966c.f3036k) {
            this.f2977n = this.f2967d.f2854n.f2527y;
        }
        if (this.f2966c.f3037l) {
            this.f2978o = this.f2967d.f2854n.f2528z;
        }
        if (this.f2966c.f3038m) {
            this.f2979p = this.f2967d.f2855o.f2526x;
        }
        if (this.f2966c.f3039n) {
            this.f2980q = this.f2967d.f2855o.f2527y;
        }
        if (this.f2966c.f3040o) {
            this.f2981r = this.f2967d.f2855o.f2528z;
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p041g.p042a.AbstractC1009c
    /* renamed from: c */
    public void mo10335c() {
        if (this.f2999a == 0 || this.f2999a == 2) {
            if (this.f2999a == 2) {
                this.f2969f = System.currentTimeMillis() - this.f2970g;
                this.f2999a = 0;
            }
            if (this.f2969f == 0) {
                this.f2969f = System.currentTimeMillis();
                this.f2966c.mo10310b();
            }
            this.f2970g = (int) (System.currentTimeMillis() - this.f2969f);
            if (this.f2970g >= this.f2968e) {
                this.f2970g = this.f2968e;
                C1014c.m10323b(this);
                m10341a(1.0f);
                this.f2966c.mo558b(1.0f);
                this.f2966c.mo518a(1.0f);
                this.f2967d.setTweenChild(null);
                this.f2966c.mo732a();
                if (this.f2966c.m10300g() != null) {
                    this.f2966c.m10300g().run();
                }
                this.f2967d.m10411f();
                return;
            }
            float f = ((float) this.f2970g) / this.f2968e;
            float mo10331a = this.f2972i.mo10331a(f);
            m10341a(mo10331a);
            this.f2966c.mo558b(f);
            this.f2966c.mo518a(mo10331a);
            this.f2967d.m10411f();
        }
    }

    /* renamed from: a */
    private void m10341a(float f) {
        if (this.f2966c.f3032g) {
            this.f2967d.f2853m.f2526x = this.f2973j + ((this.f2966c.f3043r - this.f2973j) * f);
        }
        if (this.f2966c.f3033h) {
            this.f2967d.f2853m.f2527y = this.f2974k + ((this.f2966c.f3044s - this.f2974k) * f);
        }
        if (this.f2966c.f3034i) {
            this.f2967d.f2853m.f2528z = this.f2975l + ((this.f2966c.f3045t - this.f2975l) * f);
        }
        if (this.f2966c.f3035j) {
            this.f2967d.f2854n.f2526x = this.f2976m + ((this.f2966c.f3046u - this.f2976m) * f);
        }
        if (this.f2966c.f3036k) {
            this.f2967d.f2854n.f2527y = this.f2977n + ((this.f2966c.f3047v - this.f2977n) * f);
        }
        if (this.f2966c.f3037l) {
            this.f2967d.f2854n.f2528z = this.f2978o + ((this.f2966c.f3048w - this.f2978o) * f);
        }
        if (this.f2966c.f3038m) {
            this.f2967d.f2855o.f2526x = this.f2979p + ((this.f2966c.f3049x - this.f2979p) * f);
        }
        if (this.f2966c.f3039n) {
            this.f2967d.f2855o.f2527y = this.f2980q + ((this.f2966c.f3050y - this.f2980q) * f);
        }
        if (this.f2966c.f3040o) {
            this.f2967d.f2855o.f2528z = this.f2981r + ((this.f2966c.f3051z - this.f2981r) * f);
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p041g.p042a.AbstractC1009c
    /* renamed from: a */
    public void mo10336a(Runnable runnable) {
        this.f2971h = runnable;
    }

    @Override // com.censivn.C3DEngine.p031b.p041g.p042a.AbstractC1009c
    /* renamed from: d */
    public Runnable mo10334d() {
        return this.f2971h;
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
