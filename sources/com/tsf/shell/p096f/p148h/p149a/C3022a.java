package com.tsf.shell.p096f.p148h.p149a;

import android.view.MotionEvent;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p033b.p034a.C0897d;
import com.censivn.C3DEngine.p031b.p036d.C0937a;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.censivn.C3DEngine.p031b.p041g.C0986a;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.censivn.C3DEngine.p031b.p046h.p050d.C1057c;
import com.tsf.C1306b;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.p168b.C3430e;
/* renamed from: com.tsf.shell.f.h.a.a */
/* loaded from: classes.dex */
public class C3022a {

    /* renamed from: a */
    private C0980j f9836a;

    /* renamed from: b */
    private C1057c f9837b;

    /* renamed from: c */
    private C0897d f9838c;

    /* renamed from: d */
    private TextureElement f9839d;

    /* renamed from: e */
    private C0981k f9840e;

    /* renamed from: f */
    private boolean f9841f = true;

    /* renamed from: g */
    private boolean f9842g = false;

    /* renamed from: h */
    private boolean f9843h;

    /* renamed from: i */
    private boolean f9844i;

    public C3022a() {
        this.f9843h = true;
        this.f9843h = C3430e.m2534aB() == 0;
        this.f9839d = new TextureElement(0, false);
        this.f9840e = C0892a.m10741a(24.0f, 45.0f);
        this.f9840e.textures().addElement(this.f9839d);
        if (this.f9843h) {
            this.f9840e.rotation().f2528z = 90.0f;
        } else {
            this.f9840e.rotation().f2528z = -90.0f;
        }
        this.f9840e.calAABB(3.0f, 5.0f, 1.0f);
        this.f9840e.alpha(200.0f);
        this.f9840e.setMouseEventListener(new C0937a(this.f9840e) { // from class: com.tsf.shell.f.h.a.a.1
            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo502a(MotionEvent motionEvent) {
                C3022a.this.m3774x();
            }
        });
        this.f9836a = new C0980j();
        this.f9837b = new C1057c(C0892a.m10742a(96.0f), C1306b.C1310d.ring_small, C0892a.m10742a(74.0f));
        this.f9837b.setAABBPX(C0892a.m10742a(130.0f), C0892a.m10742a(130.0f));
        this.f9837b.m10111a(C1306b.C1310d.ico_setting);
        this.f9838c = new C0897d() { // from class: com.tsf.shell.f.h.a.a.2
            @Override // com.censivn.C3DEngine.p031b.p033b.p034a.C0897d
            /* renamed from: a */
            public void mo730a(int i, float f) {
                if (f > 1.0f) {
                    f = 1.0f;
                }
                C3022a.this.f9837b.m10112a(f);
            }

            @Override // com.censivn.C3DEngine.p031b.p033b.p034a.C0897d
            /* renamed from: d */
            public void mo729d(int i) {
                C3022a.this.m3776v();
            }

            @Override // com.censivn.C3DEngine.p031b.p033b.p034a.C0897d
            /* renamed from: e */
            public void mo728e(int i) {
                C3022a.this.m3775w();
            }

            @Override // com.censivn.C3DEngine.p031b.p033b.p034a.C0897d
            /* renamed from: a */
            public void mo3771a(int i) {
                if (i == 0) {
                    C3022a.this.f9837b.m10087c(0);
                } else {
                    C3022a.this.f9837b.m10087c(1);
                }
                C3022a.this.mo3659b(i);
            }

            @Override // com.censivn.C3DEngine.p031b.p033b.p034a.C0897d
            /* renamed from: b */
            public boolean mo3770b(int i) {
                return C3022a.this.mo3658c(i);
            }
        };
        this.f9838c.m10699e(0.0f);
        this.f9838c.m10710b(this.f9837b);
        this.f9836a.addChild(this.f9840e);
        if (!C3430e.m2503av()) {
            m3803a(false, false, false);
        }
    }

    /* renamed from: a */
    public int m3809a() {
        return this.f9843h ? 0 : 1;
    }

    /* renamed from: a */
    public void m3808a(int i) {
        if (this.f9843h && i != 0) {
            this.f9843h = false;
            m3802b();
        } else if (!this.f9843h && i != 1) {
            this.f9843h = true;
            m3802b();
        }
    }

    /* renamed from: b */
    public void m3802b() {
        C3430e.m2415v(this.f9843h ? 0 : 1);
        m3806a(this.f9840e, m3800b(this.f9842g ? false : true), m3773y(), C0892a.m10742a(100.0f));
        if (this.f9841f) {
            m3806a(this.f9838c, m3772z(), 0.0f, C0892a.m10742a(200.0f));
        } else {
            this.f9838c.position().f2527y = m3772z();
        }
    }

    /* renamed from: a */
    private void m3806a(final C0975i c0975i, final float f, final float f2, final float f3) {
        C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.h.a.a.3
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo732a() {
                c0975i.position().f2527y = (f > 0.0f ? f3 : -f3) + f;
                C1017d c1017d2 = new C1017d() { // from class: com.tsf.shell.f.h.a.a.3.1
                    @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                    /* renamed from: a */
                    public void mo732a() {
                    }
                };
                c1017d2.mo10298h(f);
                c1017d2.m10314a(255);
                c0975i.rotation().f2528z = f2;
                C1014c.m10326a(c0975i);
                C1014c.m10325a(c0975i, 250, c1017d2);
            }
        };
        if (c0975i.position().f2527y <= 0.0f) {
            f3 = -f3;
        }
        c1017d.mo10298h(c0975i.position().f2527y + f3);
        c1017d.m10314a(0);
        C1014c.m10326a(c0975i);
        C1014c.m10325a(c0975i, 250, c1017d);
    }

    /* renamed from: c */
    public C0980j m3798c() {
        return this.f9836a;
    }

    /* renamed from: a */
    public void m3807a(C0975i c0975i) {
        this.f9838c.m10704c(c0975i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public void m3776v() {
        this.f9842g = true;
        this.f9836a.mouseEnabled(false);
        C3359a.f11101o.m3617f();
        m3787h();
        mo3650t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public void m3775w() {
        this.f9842g = false;
        this.f9836a.mouseEnabled(true);
        m3785i();
        C3359a.f11101o.m3615g();
    }

    /* renamed from: d */
    public void mo3657d() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public void m3774x() {
        if (this.f9841f) {
            m3803a(true, true, true);
        } else {
            m3799b(true, true, true);
        }
    }

    /* renamed from: e */
    public boolean m3794e() {
        return this.f9842g;
    }

    /* renamed from: f */
    public void m3791f() {
        this.f9844i = this.f9841f;
        this.f9842g = true;
        this.f9840e.mouseEnabled(false);
        if (this.f9841f) {
            m3803a(true, false, false);
        } else {
            m3787h();
        }
    }

    /* renamed from: g */
    public void m3789g() {
        this.f9842g = false;
        this.f9840e.mouseEnabled(true);
        if (this.f9844i) {
            m3799b(true, false, false);
        } else {
            m3785i();
        }
    }

    /* renamed from: b */
    private void m3799b(boolean z, final boolean z2, boolean z3) {
        if (!this.f9841f) {
            this.f9841f = true;
            if (z3) {
                mo3660a(true);
            }
            if (z) {
                this.f9838c.visible(true);
                C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.h.a.a.4
                    @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                    /* renamed from: a */
                    public void mo732a() {
                        if (z2) {
                            C3022a.this.m3816A();
                        }
                        C3022a.this.f9838c.m10700e();
                    }
                };
                c1017d.mo10298h(m3772z());
                c1017d.m10314a(255);
                c1017d.m10313a(C0986a.f2950e);
                C1014c.m10326a(this.f9838c);
                C1014c.m10325a(this.f9838c, 500, c1017d);
                C1017d c1017d2 = new C1017d();
                if (this.f9843h) {
                    c1017d2.m10303e(90.0f);
                } else {
                    c1017d2.m10303e(-90.0f);
                }
                c1017d2.mo10298h(m3800b(this.f9842g ? false : true));
                c1017d2.m10313a(C0986a.f2950e);
                C1014c.m10326a(this.f9840e);
                C1014c.m10325a(this.f9840e, 500, c1017d2);
                return;
            }
            this.f9838c.position().f2527y = m3772z();
            this.f9838c.alpha(255.0f);
            this.f9838c.visible(true);
            if (this.f9843h) {
                this.f9840e.rotation().f2528z = 90.0f;
            } else {
                this.f9840e.rotation().f2528z = -90.0f;
            }
            this.f9840e.position().f2527y = m3800b(this.f9842g ? false : true);
            this.f9838c.m10700e();
        }
    }

    /* renamed from: a */
    public void m3803a(boolean z, final boolean z2, boolean z3) {
        if (this.f9841f) {
            this.f9841f = false;
            if (z3) {
                mo3660a(false);
            }
            if (z2) {
                m3815B();
            }
            this.f9838c.m10703d();
            if (z) {
                C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.h.a.a.5
                    @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                    /* renamed from: a */
                    public void mo732a() {
                        if (z2) {
                            C3022a.this.m3813D();
                        }
                        C3022a.this.f9838c.visible(false);
                    }
                };
                c1017d.mo10298h(m3772z());
                c1017d.m10314a(0);
                c1017d.m10313a(C0986a.f2950e);
                C1014c.m10326a(this.f9838c);
                C1014c.m10325a(this.f9838c, 500, c1017d);
                C1017d c1017d2 = new C1017d();
                if (this.f9843h) {
                    c1017d2.m10303e(-90.0f);
                } else {
                    c1017d2.m10303e(90.0f);
                }
                c1017d2.mo10298h(m3800b(this.f9842g ? false : true));
                c1017d2.m10313a(C0986a.f2950e);
                C1014c.m10326a(this.f9840e);
                C1014c.m10325a(this.f9840e, 500, c1017d2);
                return;
            }
            if (z2) {
                m3813D();
            }
            this.f9838c.position().f2527y = m3772z();
            this.f9838c.alpha(0.0f);
            this.f9838c.visible(false);
            if (this.f9843h) {
                this.f9840e.rotation().f2528z = -90.0f;
            } else {
                this.f9840e.rotation().f2528z = 90.0f;
            }
            this.f9840e.position().f2527y = m3800b(this.f9842g ? false : true);
        }
    }

    /* renamed from: b */
    private float m3800b(boolean z) {
        return z ? this.f9843h ? C0892a.f2551B - C0892a.m10742a(38.0f) : C0892a.f2552C + C0892a.m10742a(38.0f) : this.f9843h ? C0892a.f2551B + C0892a.m10742a(100.0f) : C0892a.f2552C - C0892a.m10742a(100.0f);
    }

    /* renamed from: y */
    private int m3773y() {
        return this.f9843h ? this.f9841f ? 90 : -90 : this.f9841f ? -90 : 90;
    }

    /* renamed from: z */
    private float m3772z() {
        return this.f9841f ? this.f9843h ? C0892a.f2551B - C0892a.m10742a(170.0f) : C0892a.f2552C + C0892a.m10742a(230.0f) : this.f9843h ? C0892a.f2551B + C0892a.m10742a(100.0f) : C0892a.f2552C - C0892a.m10742a(100.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public void m3816A() {
        this.f9838c.m10689j();
        mo3656m();
    }

    /* renamed from: B */
    private void m3815B() {
        mo3655n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public void m3814C() {
        mo3654o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D */
    public void m3813D() {
        mo3653p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E */
    public void m3812E() {
        C0853a.m10853g().m10543a(this.f9839d);
        mo3652r();
    }

    /* renamed from: F */
    private void m3811F() {
        m3777q();
    }

    /* renamed from: h */
    public void m3787h() {
        new C1017d();
        C1017d c1017d = new C1017d();
        c1017d.m10314a(0);
        c1017d.mo10298h(m3800b(false));
        c1017d.m10313a(C0986a.f2950e);
        C1014c.m10326a(this.f9840e);
        C1014c.m10325a(this.f9840e, 500, c1017d);
        this.f9840e.mouseEnabled(false);
    }

    /* renamed from: i */
    public void m3785i() {
        C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.h.a.a.6
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo732a() {
                C3022a.this.f9840e.mouseEnabled(true);
            }
        };
        c1017d.m10314a(255);
        c1017d.mo10298h(m3800b(true));
        c1017d.m10313a(C0986a.f2950e);
        C1014c.m10326a(this.f9840e);
        C1014c.m10325a(this.f9840e, 500, c1017d);
    }

    /* renamed from: j */
    public void m3783j() {
        if (this.f9836a.parent() == null) {
            C3359a.f11096j.m2232a(this.f9836a);
            m3810G();
            m3811F();
            if (this.f9841f) {
                m3816A();
                float f = this.f9838c.position().f2527y;
                if (this.f9843h) {
                    this.f9838c.position().f2527y -= C0892a.m10742a(100.0f);
                } else {
                    this.f9838c.position().f2527y += C0892a.m10742a(100.0f);
                }
                this.f9838c.alpha(0.0f);
                C1017d c1017d = new C1017d();
                c1017d.mo10298h(f);
                c1017d.m10314a(255);
                c1017d.m10313a(C0986a.f2950e);
                C1014c.m10326a(this.f9838c);
                C1014c.m10325a(this.f9838c, 500, c1017d);
            }
        }
        if (this.f9839d.f2529id == 0) {
            C0853a.m10853g().m10542a(this.f9839d, C1306b.C1310d.scrollcontainer_arrow);
        }
        C1017d c1017d2 = new C1017d();
        c1017d2.m10314a(255);
        C1014c.m10326a(this.f9836a);
        C1014c.m10325a(this.f9836a, VEasing.Linear.easeNone, c1017d2);
    }

    /* renamed from: k */
    public void m3781k() {
        if (this.f9841f) {
            m3815B();
        }
        C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.h.a.a.7
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo732a() {
                if (C3022a.this.f9841f) {
                    C3022a.this.m3814C();
                }
                C3022a.this.m3812E();
                C3359a.f11096j.m2223b(C3022a.this.f9836a);
            }
        };
        c1017d.m10314a(0);
        C1014c.m10326a(this.f9836a);
        C1014c.m10325a(this.f9836a, VEasing.Linear.easeNone, c1017d);
    }

    /* renamed from: G */
    private void m3810G() {
        this.f9838c.setAABBPX(0.0f, (-C0892a.m10742a(500.0f)) / 2.0f, 0.0f, C0892a.f2553D, C0892a.m10742a(500.0f) / 2.0f, 0.0f);
        this.f9838c.m10687k();
        this.f9838c.position().f2526x = C0892a.f2590z;
        this.f9838c.position().f2527y = m3772z();
        this.f9840e.position().f2527y = m3800b(!this.f9842g);
    }

    /* renamed from: l */
    public void m3779l() {
        m3810G();
        this.f9838c.m10720a(0.0f, 0.0f, 0.0f, 0.0f);
        mo3651s();
    }

    /* renamed from: m */
    public void mo3656m() {
    }

    /* renamed from: n */
    public void mo3655n() {
    }

    /* renamed from: o */
    public void mo3654o() {
    }

    /* renamed from: p */
    public void mo3653p() {
    }

    /* renamed from: q */
    public void m3777q() {
    }

    /* renamed from: r */
    public void mo3652r() {
    }

    /* renamed from: s */
    public void mo3651s() {
    }

    /* renamed from: a */
    public void mo3660a(boolean z) {
    }

    /* renamed from: b */
    public void mo3659b(int i) {
    }

    /* renamed from: c */
    public boolean mo3658c(int i) {
        return true;
    }

    /* renamed from: d */
    public void m3796d(int i) {
        this.f9837b.m10111a(i);
    }

    /* renamed from: e */
    public void m3793e(int i) {
        this.f9837b.m10089b(i);
    }

    /* renamed from: a */
    public void m3804a(String str) {
        this.f9837b.m10090a(str);
    }

    /* renamed from: t */
    public void mo3650t() {
    }

    /* renamed from: u */
    public void mo3649u() {
        this.f9838c.m10695g();
    }
}
