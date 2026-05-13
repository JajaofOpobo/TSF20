package com.tsf.shell.p096f.p153i.p161c;

import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.core.VObject3dContainer;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.tsf.shell.p096f.p153i.p161c.p162a.InterfaceC3324k;
/* renamed from: com.tsf.shell.f.i.c.b */
/* loaded from: classes.dex */
public class C3330b extends C3343g {

    /* renamed from: k */
    private C0980j f10995k;

    /* renamed from: l */
    private InterfaceC3324k f10996l;

    /* renamed from: m */
    private float f10997m;

    /* renamed from: n */
    private float f10998n;

    /* renamed from: o */
    private float f10999o;

    /* renamed from: p */
    private boolean f11000p = true;

    /* renamed from: q */
    private Runnable f11001q = new Runnable() { // from class: com.tsf.shell.f.i.c.b.1
        @Override // java.lang.Runnable
        public void run() {
            C3330b.this.f11002r = null;
            if (C3330b.this.f10996l != null) {
                C3330b.this.f10996l.mo2833b();
            }
        }
    };

    /* renamed from: r */
    private Runnable f11002r;

    public C3330b(float f, float f2, float f3) {
        this.f10997m = 1.0f;
        this.f10997m = f;
        this.f10998n = f2;
        this.f10999o = f3;
    }

    @Override // com.tsf.shell.p096f.p153i.p161c.C3343g, com.tsf.shell.p096f.p153i.p161c.AbstractC3341e
    /* renamed from: b */
    public void mo1623b() {
        if (!this.f11000p) {
            this.f11000p = true;
            if (this.f10996l != null) {
                this.f10996l.mo2831d();
            }
        }
        super.mo1623b();
    }

    /* renamed from: c */
    private void m2826c(boolean z) {
        if (this.f11000p) {
            this.f11000p = false;
            if (this.f10996l != null) {
                this.f10996l.mo2834a(z);
            }
        }
    }

    @Override // com.tsf.shell.p096f.p153i.p161c.C3343g
    /* renamed from: c */
    public void mo2795c() {
        if (this.f11002r != null) {
            C0853a.m10865a().m10578g(this.f11002r);
            this.f11002r = null;
        }
        if (this.f10996l != null) {
            this.f10996l.mo2832c();
        }
    }

    @Override // com.tsf.shell.p096f.p153i.p161c.C3343g
    /* renamed from: d */
    public void mo2794d() {
        if (this.f10996l != null && this.f11002r == null) {
            this.f11002r = this.f11001q;
            C0853a.m10865a().m10584b(this.f11002r, 500L);
        }
    }

    @Override // com.tsf.shell.p096f.p153i.p161c.C3343g
    /* renamed from: a */
    public C0975i mo2798a(boolean z) {
        if (this.f10995k == null) {
            this.f10995k = m2825d(z);
            this.f11000p = false;
        } else {
            m2826c(z);
        }
        return this.f10995k;
    }

    /* renamed from: d */
    private C0980j m2825d(boolean z) {
        C0980j c0980j = new C0980j();
        this.f10996l = mo1621g_();
        C0980j c0980j2 = (C0980j) ((VObject3dContainer) this.f10996l).getVirtualTarget();
        c0980j2.scale().setAll(this.f10997m, this.f10997m, 1.0f);
        c0980j2.position().setAll(this.f10998n, this.f10999o, 0.0f);
        c0980j.addChild(c0980j2);
        m2826c(z);
        return c0980j;
    }

    /* renamed from: g_ */
    public InterfaceC3324k mo1621g_() {
        return null;
    }
}
