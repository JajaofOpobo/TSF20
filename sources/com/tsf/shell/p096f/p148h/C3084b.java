package com.tsf.shell.p096f.p148h;

import android.view.KeyEvent;
import android.view.MotionEvent;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.p030a.C0869e;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p035c.C0915b;
import com.censivn.C3DEngine.p031b.p035c.C0925e;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p041g.C0986a;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.tsf.C1306b;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.p168b.C3430e;
import com.tsf.shell.manager.p174f.C3474b;
import com.tsf.shell.p096f.C2279b;
import com.tsf.shell.p096f.p118e.p121c.C2478a;
import com.tsf.shell.p096f.p118e.p127g.AbstractC2593d;
import com.tsf.shell.p096f.p148h.p149a.C3082c;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.utils.C4189x;
/* renamed from: com.tsf.shell.f.h.b */
/* loaded from: classes.dex */
public class C3084b implements C0915b.InterfaceC0918a, C0925e.InterfaceC0934a {

    /* renamed from: b */
    public static int f9983b = -1725816286;

    /* renamed from: d */
    private C0980j f9986d;

    /* renamed from: e */
    private C2478a f9987e;

    /* renamed from: f */
    private C3091c f9988f;

    /* renamed from: g */
    private C0980j f9989g;

    /* renamed from: k */
    private C3095e f9993k;

    /* renamed from: l */
    private C3474b.C3478a f9994l;

    /* renamed from: m */
    private float f9995m;

    /* renamed from: o */
    private float f9997o;

    /* renamed from: p */
    private float f9998p;

    /* renamed from: r */
    private C3021a f10000r;

    /* renamed from: s */
    private C3082c f10001s;

    /* renamed from: a */
    public int f9984a = 47;

    /* renamed from: c */
    private float f9985c = 0.0f;

    /* renamed from: h */
    private boolean f9990h = true;

    /* renamed from: i */
    private boolean f9991i = false;

    /* renamed from: j */
    private boolean f9992j = false;

    /* renamed from: n */
    private boolean f9996n = false;

    /* renamed from: q */
    private boolean f9999q = false;

    /* renamed from: t */
    private boolean f10002t = false;

    /* renamed from: a */
    public void m3626a(boolean z, int i) {
        this.f10002t = z;
        if (z) {
            this.f9984a = i;
            this.f9989g.mouseEnabled(true);
        } else {
            this.f9984a = 0;
            this.f9989g.mouseEnabled(false);
        }
        this.f9987e.m5467a((int) ((this.f9984a / 100.0f) * 255.0f));
    }

    /* renamed from: a */
    public C3082c m3633a() {
        return this.f10001s;
    }

    /* renamed from: b */
    public C2478a m3625b() {
        return this.f9987e;
    }

    /* renamed from: c */
    public C3091c m3623c() {
        return this.f9988f;
    }

    /* renamed from: d */
    public float m3621d() {
        return this.f9997o;
    }

    /* renamed from: e */
    public float m3619e() {
        return this.f9998p;
    }

    /* renamed from: f */
    public void m3617f() {
        C1017d c1017d = new C1017d();
        c1017d.mo10298h((-C0892a.f2554E) / 2.0f);
        c1017d.m10314a(0);
        C1014c.m10326a(this.f9986d);
        C1014c.m10325a(this.f9986d, 350, c1017d);
    }

    /* renamed from: g */
    public void m3615g() {
        C1017d c1017d = new C1017d();
        c1017d.mo10298h(0.0f);
        c1017d.m10314a(255);
        c1017d.m10313a(C0986a.f2946a);
        C1014c.m10326a(this.f9986d);
        C1014c.m10325a(this.f9986d, 500, c1017d);
    }

    /* renamed from: a */
    public void m3629a(C0980j c0980j) {
        C3359a.f11088b.m10565a(this);
        this.f10002t = C3430e.m2522ac();
        this.f9984a = this.f10002t ? C3430e.m2523ab() : 0;
        this.f9985c = 80.0f * C0892a.f2567c;
        this.f10001s = new C3082c();
        this.f9986d = new C0980j();
        this.f9993k = new C3095e();
        this.f9993k.m3586b(0.0f);
        this.f9994l = new C3474b.C3478a() { // from class: com.tsf.shell.f.h.b.1
            @Override // com.tsf.shell.manager.p174f.C3474b.C3478a
            /* renamed from: a */
            public void mo2070a() {
                if (C3084b.this.f10001s.m3794e()) {
                    C3084b.this.f10001s.mo3657d();
                } else {
                    C3084b.this.m3603o();
                }
            }
        };
        this.f9987e = new C2478a(128.0f, ThemeManager.mix.smartButton.getTheme().shell.smartButtonWindowsColor, (int) ((this.f9984a / 100.0f) * 255.0f), C4189x.m609a(C1306b.C1310d.bubble_icon), 1000, C0892a.f2567c) { // from class: com.tsf.shell.f.h.b.2
            @Override // com.tsf.shell.p096f.p118e.p121c.C2478a
            /* renamed from: d */
            public void mo3599d() {
            }

            @Override // com.tsf.shell.p096f.p118e.p121c.C2478a, com.censivn.C3DEngine.p031b.p038f.C0975i
            public void onKillFocus() {
                if (!C3084b.this.f9999q) {
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
            public void onDrawStart() {
                if (getAnimationObjectState()) {
                    position().f2526x += (C3084b.this.f9997o - position().f2526x) * C3084b.this.f9995m;
                    position().f2527y += (C3084b.this.f9998p - position().f2527y) * C3084b.this.f9995m;
                    if (Math.abs(position().f2526x - C3084b.this.f9997o) < 0.2f && Math.abs(position().f2527y - C3084b.this.f9998p) < 0.2f && !C3084b.this.f9996n) {
                        position().f2526x = C3084b.this.f9997o;
                        position().f2527y = C3084b.this.f9998p;
                        setAnimationObjectState(false);
                    }
                }
            }
        };
        m3600r();
        this.f9989g = this.f9987e.m5462c();
        this.f9989g.mouseEnabled(this.f10002t);
        this.f9988f = new C3091c(this);
        this.f9987e.m5466a(this.f9988f);
        this.f9989g.setMouseEventListener(new C3094d(this, this.f9989g) { // from class: com.tsf.shell.f.h.b.3
            @Override // com.tsf.shell.p096f.p148h.C3094d, com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo502a(MotionEvent motionEvent) {
                super.mo502a(motionEvent);
                if (!C3084b.this.f9987e.getAnimationObjectState()) {
                    C3084b.this.m3604n();
                }
            }

            @Override // com.tsf.shell.p096f.p148h.C3094d, com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: e */
            public void mo1654e(MotionEvent motionEvent) {
                if (!C3084b.this.f9991i) {
                    super.mo1654e(motionEvent);
                    C3084b.this.m3606l();
                }
            }

            @Override // com.tsf.shell.p096f.p148h.C3094d, com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: f */
            public void mo1653f(MotionEvent motionEvent) {
                super.mo1653f(motionEvent);
                C3084b.this.m3605m();
            }

            @Override // com.tsf.shell.p096f.p148h.C3094d, com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: c */
            public void mo2122c(MotionEvent motionEvent) {
                super.mo2122c(motionEvent);
                C3084b.this.m3605m();
            }
        });
        this.f9986d.addChild(this.f9987e);
        c0980j.addChild(this.f9986d);
        this.f10000r = new C3021a();
        this.f9986d.addChild(this.f10000r);
    }

    /* renamed from: r */
    private void m3600r() {
        Number3d m2413w = C0892a.f2564O ? C3430e.m2413w() : C3430e.m2411x();
        if (m2413w.f2526x == 0.0f && m2413w.f2527y == 0.0f) {
            m2413w.f2526x = C0892a.f2590z + (70.0f * C0892a.f2567c);
            m2413w.f2527y = C0892a.f2552C + (300.0f * C0892a.f2567c);
        }
        m3630a(m2413w.f2526x, m2413w.f2527y, false);
    }

    /* renamed from: h */
    public void m3613h() {
        this.f9987e.m5463b(ThemeManager.mix.smartButton.getTheme().shell.smartButtonWindowsColor);
        m3623c().m3589e();
    }

    /* renamed from: i */
    public void m3611i() {
        if (!this.f9990h && !this.f9987e.getAnimationObjectState()) {
            this.f9990h = true;
            C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.h.b.4
                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: a */
                public void mo732a() {
                    C3084b.this.f9986d.mouseEnabled(true);
                }
            };
            c1017d.m10314a(255);
            C1014c.m10326a(this.f9986d);
            C1014c.m10325a(this.f9986d, 250, c1017d);
        }
    }

    /* renamed from: a */
    public void m3632a(float f) {
        this.f9999q = true;
        float m3597a = this.f9988f.m3597a(f);
        C1017d c1017d = new C1017d();
        c1017d.mo10298h(m3597a);
        C1014c.m10326a(this.f9986d);
        C1014c.m10325a(this.f9986d, 500, c1017d);
        this.f10001s.m3791f();
    }

    /* renamed from: j */
    public void m3609j() {
        this.f9999q = false;
        this.f9988f.m3598a();
        C1017d c1017d = new C1017d();
        c1017d.mo10298h(0.0f);
        C1014c.m10326a(this.f9986d);
        C1014c.m10325a(this.f9986d, 500, c1017d);
        this.f9989g.setFocus();
        this.f10001s.m3789g();
        C3359a.f11100n.m2084i();
    }

    /* renamed from: k */
    public void m3607k() {
        if (this.f9990h && !this.f9991i) {
            this.f9990h = false;
            C1017d c1017d = new C1017d();
            c1017d.m10314a(0);
            C1014c.m10326a(this.f9986d);
            C1014c.m10325a(this.f9986d, 250, c1017d);
            this.f9986d.mouseEnabled(false);
        }
    }

    /* renamed from: l */
    public void m3606l() {
        if (!this.f9992j) {
            this.f9992j = true;
            this.f9993k.position().setAllFrom(this.f9987e.position());
            this.f9993k.removeFromParent();
            C3359a.f11096j.m2232a(this.f9993k);
            this.f9993k.m3588a(60.0f);
            float f = this.f9987e.position().f2526x;
            float f2 = this.f9987e.position().f2527y;
            double atan = (Math.atan(f / f2) * 180.0d) / 3.141592653589793d;
            if (f2 > 0.0f) {
                atan += 180.0d;
            }
            this.f9993k.rotation().f2528z = (float) (-atan);
        }
    }

    /* renamed from: m */
    public void m3605m() {
        if (this.f9992j) {
            this.f9992j = false;
            this.f9993k.m3587a(0.0f, new Runnable() { // from class: com.tsf.shell.f.h.b.5
                @Override // java.lang.Runnable
                public void run() {
                    C3084b.this.f9993k.removeFromParent();
                }
            });
        }
    }

    /* renamed from: n */
    public void m3604n() {
        if (!C0869e.m10758l()) {
            C0853a.m10865a().m10583c(new Runnable() { // from class: com.tsf.shell.f.h.b.6
                @Override // java.lang.Runnable
                public void run() {
                    C3084b.this.m3604n();
                }
            });
        } else if (AbstractC2593d.mCurrentMenu == null && this.f9990h && !this.f9991i && C3359a.f11094h.m4127B() && !C3359a.f11094h.m4021s().m3938a() && !C3359a.f11108v.f7772e.m5603e()) {
            C2279b.m5964a();
            this.f9987e.m5469a(0.0f, 0.0f, this.f9988f.m3591c(), this.f9988f.m3590d(), 204, !this.f10002t);
            C0915b.m10597a(this);
            this.f9991i = true;
            this.f9988f.mouseEnabled(true);
            this.f9988f.m3592b();
            C3359a.f11091e.m2270a(this.f9994l);
            this.f10001s.m3783j();
            C3359a.f11100n.m2084i();
        }
    }

    /* renamed from: o */
    protected void m3603o() {
        if (this.f9991i && !this.f9999q) {
            this.f9987e.m5468a(this.f9997o, this.f9998p, null, !this.f10002t);
            C0915b.m10594b(this);
            this.f9991i = false;
            this.f9988f.setAnimationObjectState(false);
            this.f9988f.mouseEnabled(false);
            C3359a.f11091e.m2257e();
            C3359a.f11100n.m2083j();
            this.f10001s.m3781k();
        }
    }

    /* renamed from: p */
    public void m3602p() {
        if (!this.f9991i) {
            this.f9995m = 0.4f;
            this.f9996n = true;
            this.f9997o = this.f9987e.position().f2526x;
            this.f9998p = this.f9987e.position().f2527y;
            this.f9987e.setAnimationObjectState(true);
            this.f9987e.invalidate();
        }
    }

    /* renamed from: a */
    public void m3631a(float f, float f2) {
        if (this.f9996n) {
            this.f9997o = f;
            this.f9998p = f2;
            float f3 = this.f9985c / 2.0f;
            if (this.f9997o > C0892a.f2550A - f3) {
                this.f9997o = C0892a.f2550A - f3;
            } else if (this.f9997o < C0892a.f2590z + f3) {
                this.f9997o = C0892a.f2590z + f3;
            }
            if (this.f9998p > C0892a.f2551B - f3) {
                this.f9998p = C0892a.f2551B - f3;
            } else if (this.f9998p < C0892a.f2552C + f3) {
                this.f9998p = f3 + C0892a.f2552C;
            }
        }
    }

    /* renamed from: q */
    public void m3601q() {
        if (this.f9996n) {
            this.f9996n = false;
            this.f9995m = 0.2f;
            m3627a(false);
            if (C0892a.f2564O) {
                C3430e.m2488c(this.f9997o, this.f9998p);
            } else {
                C3430e.m2481d(this.f9997o, this.f9998p);
            }
        }
    }

    /* renamed from: a */
    private void m3627a(boolean z) {
        float f = this.f9985c / 2.0f;
        if (this.f9997o > C0892a.f2550A - f) {
            this.f9997o = C0892a.f2550A - f;
        } else if (this.f9997o < C0892a.f2590z + f) {
            this.f9997o = C0892a.f2590z + f;
        }
        if (this.f9998p > C0892a.f2551B - f) {
            this.f9998p = C0892a.f2551B - f;
        } else if (this.f9998p < C0892a.f2552C + f) {
            this.f9998p = f + C0892a.f2552C;
        }
        float abs = Math.abs(this.f9997o - C0892a.f2590z);
        float abs2 = Math.abs(C0892a.f2550A - this.f9997o);
        float abs3 = Math.abs(C0892a.f2551B - this.f9998p);
        float abs4 = Math.abs(this.f9998p - C0892a.f2552C);
        if (abs < abs2 && abs < abs3 && abs < abs4) {
            this.f9997o = C0892a.f2590z + this.f9985c;
        } else if (abs2 < abs && abs2 < abs3 && abs2 < abs4) {
            this.f9997o = C0892a.f2550A - this.f9985c;
        } else if (abs3 < abs && abs3 < abs2 && abs3 < abs4) {
            this.f9998p = C0892a.f2551B - this.f9985c;
        } else {
            this.f9998p = C0892a.f2552C + this.f9985c;
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p035c.C0915b.InterfaceC0918a
    /* renamed from: a */
    public void mo727a(int i, KeyEvent keyEvent) {
        if (i == 4) {
            m3603o();
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p035c.C0915b.InterfaceC0918a
    /* renamed from: b */
    public void mo726b(int i, KeyEvent keyEvent) {
    }

    @Override // com.censivn.C3DEngine.p031b.p035c.C0925e.InterfaceC0934a
    /* renamed from: a */
    public void mo1664a(int i, int i2, int i3, int i4) {
        m3600r();
        this.f10001s.m3779l();
    }

    /* renamed from: a */
    private void m3630a(float f, float f2, boolean z) {
        this.f9997o = f;
        this.f9998p = f2;
        m3627a(z);
        if (!this.f9991i) {
            this.f9987e.position().setAll(this.f9997o, this.f9998p, 0.0f);
        }
    }
}
