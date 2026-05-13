package com.tsf.shell.manager.p178j;

import android.view.MotionEvent;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p036d.C0937a;
import com.censivn.C3DEngine.p031b.p038f.C0973g;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.censivn.C3DEngine.p031b.p038f.C0982l;
import com.censivn.C3DEngine.p031b.p038f.C0984m;
import com.censivn.C3DEngine.p031b.p038f.p040b.C0968b;
import com.censivn.C3DEngine.p031b.p041g.C0986a;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.censivn.C3DEngine.p031b.p041g.InterfaceC1011b;
import com.tsf.C1306b;
import com.tsf.shell.Home;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.p096f.p118e.p130i.C2622b;
import com.tsf.shell.utils.C4175k;
import com.tsf.shell.utils.C4178n;
/* renamed from: com.tsf.shell.manager.j.b */
/* loaded from: classes.dex */
public class C3505b extends C0980j {

    /* renamed from: c */
    public static int f11585c;

    /* renamed from: d */
    public static int f11586d;

    /* renamed from: j */
    public static float f11592j;

    /* renamed from: k */
    public static float f11593k;

    /* renamed from: l */
    public static float f11594l;

    /* renamed from: m */
    public static float f11595m;

    /* renamed from: a */
    public C2622b f11596a;

    /* renamed from: n */
    private C3500a f11597n;

    /* renamed from: o */
    private C3517d f11598o;

    /* renamed from: p */
    private C0981k f11599p;

    /* renamed from: q */
    private C0973g f11600q;

    /* renamed from: r */
    private C0973g f11601r;

    /* renamed from: s */
    private C0982l f11602s;

    /* renamed from: t */
    private C0982l f11603t;

    /* renamed from: u */
    private C0984m f11604u = new C0984m();

    /* renamed from: b */
    public static final int f11584b = C0892a.m10735b(820.0f);

    /* renamed from: e */
    public static int f11587e = C0892a.m10735b(100.0f);

    /* renamed from: f */
    public static int f11588f = C0892a.m10735b(60.0f);

    /* renamed from: g */
    public static final int f11589g = C0892a.m10735b(400.0f);

    /* renamed from: h */
    public static final int f11590h = C0892a.m10735b(125.0f);

    /* renamed from: i */
    public static final int f11591i = C0892a.m10735b(23.0f);

    public C3505b() {
        this.f11604u.m10347d(45);
        this.f11604u.m10349c(C1306b.C1315i.text_rate_message);
        this.f11604u.m10345e(-10066330);
        this.f11604u.m10354a(true);
        this.f11604u.m10356a(1);
        this.f11604u.m10352b(0);
        this.f11604u.m10344f(f11584b - f11587e);
        this.f11604u.m10353b();
        f11586d = (int) this.f11604u.minY();
        f11585c = ((f11589g + f11588f) - f11586d) + f11588f + f11590h + f11591i + f11590h;
        this.f11598o = new C3517d(f11584b, f11585c, C0892a.f2567c, new C0968b(19.0f, 119.0f, 1.0f, 101.0f, 138.0f, 160.0f), C1306b.C1310d.rate_window_shadow);
        this.f11598o.m10388c(f11584b, f11585c);
        this.f11599p = new C0981k(f11584b, f11585c, false);
        this.f11599p.setDefaultColor(new Color4(-2236963));
        addChild(this.f11599p);
        this.f11600q = new C0973g() { // from class: com.tsf.shell.manager.j.b.1
            @Override // com.censivn.C3DEngine.p031b.p038f.C0973g, com.censivn.C3DEngine.p031b.p038f.C0975i
            public void onDrawStart() {
                super.onDrawStart();
                position().f2527y = ((C3505b.f11585c - C3505b.f11589g) / 2.0f) + C3505b.this.f11599p.position().f2527y;
            }
        };
        this.f11600q.m10375a(C1306b.C1310d.rate_window_blue_background);
        this.f11600q.mo5013a(f11584b, f11589g);
        this.f11597n = new C3500a();
        this.f11597n.position().f2527y = -C0892a.m10742a(120.0f);
        this.f11600q.addChild(this.f11597n);
        f11595m = ((f11585c / 2.0f) - f11589g) - f11588f;
        addChild(this.f11604u);
        this.f11602s = new C0982l(f11584b, f11590h, -32768, -3841536) { // from class: com.tsf.shell.manager.j.b.2
            @Override // com.censivn.C3DEngine.p031b.p038f.C0982l
            /* renamed from: a */
            public void mo2165a() {
                C0853a.m10865a().m10588a(new Runnable() { // from class: com.tsf.shell.manager.j.b.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        C4175k.m671a(Home.m6177b(), C0853a.m10858b());
                    }
                });
            }
        };
        this.f11602s.m10362b(45);
        this.f11602s.m10364a(C1306b.C1315i.text_rate_first_rate);
        addChild(this.f11602s);
        this.f11603t = new C0982l(f11584b, f11590h, -16735271, -16748909) { // from class: com.tsf.shell.manager.j.b.3
            @Override // com.censivn.C3DEngine.p031b.p038f.C0982l
            /* renamed from: a */
            public void mo2165a() {
                C0853a.m10865a().m10588a(new Runnable() { // from class: com.tsf.shell.manager.j.b.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        C4178n.m666a(Home.m6177b());
                    }
                });
            }

            @Override // com.censivn.C3DEngine.p031b.p038f.C0982l
            /* renamed from: b */
            public void mo2164b() {
                C3505b.this.f11597n.m2187a();
            }

            @Override // com.censivn.C3DEngine.p031b.p038f.C0982l
            /* renamed from: c */
            public void mo2163c() {
                C3505b.this.f11597n.m2183b();
            }

            @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
            public void onDrawStart() {
                float f = (C3505b.this.f11603t.position().f2527y - (C3505b.f11590h / 2.0f)) + C3505b.this.f11599p.position().f2527y;
                float f2 = C3505b.this.f11599p.points().getAsNumber3dPX(0).f2527y;
                float f3 = ((f - f2) * 0.25f) + f2;
                C3505b.this.f11599p.points().setYPX(0, f3);
                C3505b.this.f11599p.points().setYPX(1, f3);
                C3505b.this.f11599p.updatePointsVBO();
            }
        };
        this.f11603t.m10362b(45);
        this.f11603t.m10364a(C1306b.C1315i.text_rate_dislike);
        addChild(this.f11603t);
        f11593k = ((-f11585c) / 2.0f) + (f11590h / 2.0f);
        f11592j = f11593k + f11590h + f11591i;
        this.f11596a = new C2622b();
        this.f11596a.position().f2527y = C0892a.m10742a(50.0f);
        this.f11600q.addChild(this.f11596a);
        this.f11601r = new C0973g();
        this.f11601r.position().f2526x = (f11584b / 2.0f) - C0892a.m10742a(40.0f);
        f11594l = (f11585c / 2.0f) - C0892a.m10742a(40.0f);
        this.f11601r.m10375a(C1306b.C1310d.rate_window_close);
        this.f11601r.mo5013a(C0892a.m10742a(32.0f), C0892a.m10742a(32.0f));
        this.f11601r.setMouseEventListener(new C0937a(this.f11601r) { // from class: com.tsf.shell.manager.j.b.4
            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo502a(MotionEvent motionEvent) {
                C3359a.f11086D.m2160b();
            }
        });
        this.f11601r.calAABB(4.0f, 4.0f, 1.0f);
        addChild(this.f11600q);
        addChild(this.f11601r);
    }

    /* renamed from: f */
    private void m2166f() {
        float f = (this.f11603t.position().f2527y - (f11590h / 2.0f)) + this.f11599p.position().f2527y;
        this.f11599p.points().setYPX(0, f);
        this.f11599p.points().setYPX(1, f);
        this.f11599p.updatePointsVBO();
    }

    /* renamed from: a */
    public void m2175a() {
        this.f11596a.m5135b();
        m2174a(this.f11599p, 0.0f, 750, 0, C0986a.f2959n, new Runnable() { // from class: com.tsf.shell.manager.j.b.5
            @Override // java.lang.Runnable
            public void run() {
                C3505b.this.f11596a.m5134c();
            }
        });
        m2174a(this.f11601r, f11594l, 750, 0, C0986a.f2959n, null);
        m2174a(this.f11604u, f11595m, 750, 100, C0986a.f2959n, null);
        m2174a(this.f11602s, f11592j, 750, VEasing.Back.easeIn, C0986a.f2959n, null);
        m2174a(this.f11603t, f11593k, 750, 300, C0986a.f2959n, null);
        m2166f();
    }

    /* renamed from: a */
    private void m2174a(C0975i c0975i, float f, int i, int i2, InterfaceC1011b interfaceC1011b, Runnable runnable) {
        c0975i.position().f2527y = (C0892a.f2552C - f11585c) - f;
        C1017d c1017d = new C1017d();
        c1017d.m10311a(runnable);
        c1017d.mo10298h(f);
        c1017d.m10313a(interfaceC1011b);
        c1017d.m10309b(i2);
        C1014c.m10326a(c0975i);
        C1014c.m10325a(c0975i, i, c1017d);
    }

    /* renamed from: b */
    public void m2172b() {
    }

    /* renamed from: c */
    public void m2170c() {
    }

    /* renamed from: d */
    public void m2168d() {
        this.f11596a.m5136a();
        this.f11601r.m10376a();
        this.f11604u.m10358a();
        this.f11602s.m10359d();
        this.f11603t.m10359d();
        this.f11600q.m10376a();
        this.f11597n.m2181c();
    }

    /* renamed from: e */
    public void m2167e() {
    }
}
