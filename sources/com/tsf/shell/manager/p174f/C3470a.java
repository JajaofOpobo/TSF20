package com.tsf.shell.manager.p174f;

import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.censivn.C3DEngine.p031b.p041g.p043b.C1013b;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.p168b.C3430e;
import com.tsf.shell.p096f.p131f.C2932g;
/* renamed from: com.tsf.shell.manager.f.a */
/* loaded from: classes.dex */
public class C3470a {

    /* renamed from: c */
    private static C0980j f11459c;

    /* renamed from: d */
    private static C0975i f11460d;

    /* renamed from: f */
    private int f11462f = 1;

    /* renamed from: g */
    private boolean f11463g;

    /* renamed from: e */
    private static C1013b f11461e = new C1013b();

    /* renamed from: a */
    public static int f11457a = 50;

    /* renamed from: b */
    public static int f11458b = 86;

    /* renamed from: d */
    private static int m2279d(int i) {
        if (i < 0) {
            return 0;
        }
        if (i > 100) {
            return 100;
        }
        return i;
    }

    /* renamed from: a */
    public static void m2288a(final int i) {
        final int i2 = f11457a;
        C1017d c1017d = new C1017d() { // from class: com.tsf.shell.manager.f.a.1
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo518a(float f) {
                C3470a.m2283b((int) (i2 + ((i - i2) * f)));
            }
        };
        C1014c.m10326a(f11461e);
        C1014c.m10325a(f11461e, 500, c1017d);
    }

    /* renamed from: b */
    public static void m2283b(int i) {
        f11457a = m2279d(i);
        if (f11460d != null && C3359a.f11094h.m4031n().m4181t() == -1) {
            if (f11460d != C3359a.f11092f.m1579g()) {
                if (f11457a == 100) {
                    f11460d.removeFromParent();
                } else if (f11460d.parent() == null) {
                    f11459c.addChild(f11460d);
                }
            }
            f11460d.alpha((int) ((1.0f - (f11457a / 100.0f)) * 255.0f));
        }
    }

    public C3470a(C0980j c0980j) {
        this.f11463g = false;
        f11459c = c0980j;
        this.f11463g = C3430e.m2516ai();
        if (this.f11463g) {
            f11460d = new C0981k(C0892a.f2555F, C0892a.f2556G, false);
            f11460d.setDefaultColor(new Color4(0, 0, 0, 255));
            return;
        }
        f11460d = C3359a.f11092f.m1579g();
    }

    /* renamed from: a */
    public void m2289a() {
        if (this.f11462f != 2) {
            this.f11462f = 2;
            m2281c((int) ((1.0f - (f11457a / 100.0f)) * 255.0f));
        }
    }

    /* renamed from: b */
    public void m2284b() {
        if (this.f11462f != 0) {
            this.f11462f = 0;
            m2281c(f11458b);
        }
    }

    /* renamed from: c */
    public void m2281c(int i) {
        if (this.f11463g && f11460d.parent() == null) {
            f11459c.addChild(f11460d);
            f11460d.alpha(0.0f);
        }
        C1017d c1017d = new C1017d() { // from class: com.tsf.shell.manager.f.a.2
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo732a() {
                if (C3470a.this.f11463g && C3470a.f11460d.alpha() == 0.0f) {
                    C3470a.f11460d.removeFromParent();
                }
            }
        };
        c1017d.m10314a(i);
        C1014c.m10326a(f11460d);
        C1014c.m10325a(f11460d, 350, c1017d);
    }

    /* renamed from: c */
    public void m2282c() {
        if (this.f11462f != 1) {
            this.f11462f = 1;
            C1017d c1017d = new C1017d() { // from class: com.tsf.shell.manager.f.a.3
                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: a */
                public void mo732a() {
                    if (C3470a.this.f11463g) {
                        C3470a.f11460d.removeFromParent();
                    }
                }
            };
            c1017d.m10314a(0);
            C1014c.m10326a(f11460d);
            C1014c.m10325a(f11460d, 350, c1017d);
        }
    }

    /* renamed from: d */
    public void m2280d() {
        m2286a(C3359a.f11094h.m4031n());
    }

    /* renamed from: a */
    public void m2286a(C2932g c2932g) {
        if (c2932g.m4181t() == -1 && f11457a != 100) {
            m2289a();
        } else {
            m2282c();
        }
    }

    /* renamed from: a */
    public void m2287a(int i, int i2, int i3, int i4) {
        if (this.f11463g) {
            ((C0981k) f11460d).mo10368a(C0892a.f2555F);
            ((C0981k) f11460d).mo5215b(C0892a.f2556G);
        }
    }
}
