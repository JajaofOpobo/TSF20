package com.censivn.C3DEngine.p031b.p041g.p044c.p045a;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.tsf.shell.utils.C4189x;
/* renamed from: com.censivn.C3DEngine.b.g.c.a.a */
/* loaded from: classes.dex */
public class C1016a extends C1017d {

    /* renamed from: C */
    private float f3016C;

    /* renamed from: D */
    private float f3017D;

    /* renamed from: E */
    private float f3018E;

    /* renamed from: a */
    private Number3d f3020a;

    /* renamed from: b */
    private double f3021b;

    /* renamed from: e */
    private float f3024e;

    /* renamed from: f */
    private float f3025f;

    /* renamed from: c */
    private boolean f3022c = false;

    /* renamed from: d */
    private Number3d f3023d = new Number3d();

    /* renamed from: F */
    private boolean f3019F = true;

    public C1016a(C0975i c0975i, int i, float f) {
        this.f3020a = c0975i.position();
        this.f3021b = 3.141592653589793d * i;
        this.f3018E = f;
        this.f3024e = c0975i.position().f2526x;
        this.f3025f = c0975i.position().f2527y;
    }

    @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
    /* renamed from: f */
    public void mo10301f(float f) {
        this.f3043r = f;
        m10315h();
    }

    /* renamed from: a */
    public void m10317a(boolean z) {
        this.f3019F = z;
    }

    @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
    /* renamed from: h */
    public void mo10298h(float f) {
        this.f3044s = f;
        m10315h();
    }

    /* renamed from: h */
    private void m10315h() {
        this.f3016C = C4189x.m594b(this.f3024e, this.f3025f, this.f3043r, this.f3044s);
        this.f3017D = C4189x.m587d(this.f3024e, this.f3025f, this.f3043r, this.f3044s);
    }

    /* renamed from: b */
    public void m10316b(boolean z) {
        this.f3022c = z;
    }

    @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
    /* renamed from: a */
    public void mo518a(float f) {
        this.f3023d.f2526x = this.f3016C * f;
        if (this.f3019F) {
            this.f3023d.f2527y = ((float) Math.sin(this.f3021b * f)) * this.f3018E * (1.0f - f);
        } else {
            this.f3023d.f2527y = ((float) Math.sin(this.f3021b * f)) * this.f3018E * f;
        }
        if (this.f3022c) {
            this.f3023d.f2527y = -this.f3023d.f2527y;
        }
        this.f3023d.rotateDegressZ(this.f3017D);
        this.f3020a.f2526x = this.f3023d.f2526x + this.f3024e;
        this.f3020a.f2527y = this.f3023d.f2527y + this.f3025f;
    }
}
