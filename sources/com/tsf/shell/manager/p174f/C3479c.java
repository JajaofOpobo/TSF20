package com.tsf.shell.manager.p174f;

import android.opengl.GLSurfaceView;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.p030a.C0864d;
import com.censivn.C3DEngine.p030a.C0870f;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p035c.C0922d;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.tsf.shell.Home;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.action.C3386b;
import com.tsf.shell.manager.action.C3398f;
import com.tsf.shell.manager.p169c.C3464b;
import com.tsf.shell.manager.p172d.C3466a;
import com.tsf.shell.manager.p173e.C3469a;
import com.tsf.shell.manager.p174f.C3474b;
import com.tsf.shell.manager.p176h.C3490a;
import com.tsf.shell.manager.p178j.C3513c;
import com.tsf.shell.manager.p180l.C3523b;
import com.tsf.shell.manager.p181m.C3529b;
import com.tsf.shell.manager.p182n.C3550a;
import com.tsf.shell.manager.p183o.C3568d;
import com.tsf.shell.manager.p185p.C3591c;
import com.tsf.shell.manager.p185p.C3595e;
import com.tsf.shell.manager.p186q.C3600a;
import com.tsf.shell.manager.p187r.p188a.C3620b;
import com.tsf.shell.manager.p187r.p193c.C3720e;
import com.tsf.shell.manager.wallpaper.ShellWallpaperManager;
import com.tsf.shell.p095e.C2265e;
import com.tsf.shell.p096f.C2370d;
import com.tsf.shell.p096f.p097a.p098a.C2274b;
import com.tsf.shell.p096f.p097a.p099b.C2276a;
import com.tsf.shell.p096f.p101c.C2286a;
import com.tsf.shell.p096f.p107d.C2373a;
import com.tsf.shell.p096f.p118e.C2448a;
import com.tsf.shell.p096f.p118e.C2463b;
import com.tsf.shell.p096f.p118e.C2650p;
import com.tsf.shell.p096f.p118e.C2656s;
import com.tsf.shell.p096f.p118e.C2663t;
import com.tsf.shell.p096f.p118e.p120b.C2474e;
import com.tsf.shell.p096f.p118e.p125e.C2539c;
import com.tsf.shell.p096f.p118e.p127g.AbstractC2593d;
import com.tsf.shell.p096f.p131f.C2932g;
import com.tsf.shell.p096f.p131f.C2951n;
import com.tsf.shell.p096f.p148h.C3084b;
import com.tsf.shell.p096f.p153i.p154a.C3107a;
import com.tsf.shell.p096f.p153i.p155b.p159d.C3145b;
import com.tsf.shell.preference.p196a.C4081d;
import com.tsf.shell.services.C4100c;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.utils.C4184t;
/* renamed from: com.tsf.shell.manager.f.c */
/* loaded from: classes.dex */
public class C3479c extends C0870f {

    /* renamed from: c */
    private C0980j f11484c;

    /* renamed from: d */
    private C0980j f11485d;

    /* renamed from: e */
    private C0980j f11486e;

    /* renamed from: f */
    private boolean f11487f;

    /* renamed from: g */
    private boolean f11488g;

    /* renamed from: h */
    private Object f11489h;

    public C3479c(GLSurfaceView gLSurfaceView) {
        super(gLSurfaceView, "Launcher");
        this.f11487f = false;
        this.f11488g = true;
        this.f11489h = null;
        C3359a.f11086D = new C3513c();
        C3359a.f11087a = new C3595e();
        C3359a.f11085C = new C4100c();
        C3359a.f11105s = new C0922d();
        C3359a.f11083A = new C3490a();
        C3359a.f11089c = this;
        C0853a.m10862a(gLSurfaceView);
        C0892a.m10743a();
        C3359a.f11111y = new C3469a();
        C3359a.f11106t = new C2274b();
        C3359a.f11107u = new C2276a();
        C3359a.f11104r = new C3600a();
        ThemeManager.initThemeManager();
        C3359a.f11090d = new C3386b();
        C3398f.m2646a(C0853a.m10856d());
        C3359a.f11112z = new C3464b();
        C3359a.f11101o = new C3084b();
        C3359a.f11100n = new C3529b();
        C3359a.f11092f = new ShellWallpaperManager(C0853a.m10856d());
        C3359a.f11096j = new C3483d((C2265e) gLSurfaceView.getParent());
        C3359a.f11094h = new C2951n();
        C3359a.f11102p = new C2539c();
        C3359a.f11103q = new C3550a();
        C3359a.f11093g = new C2286a();
        C3359a.f11110x = new C3523b();
        C3359a.f11095i = new C3720e();
        C3359a.f11097k = new C3466a();
        C3359a.f11098l = new C3620b();
        C3359a.f11099m = new C2650p();
        if (!C4184t.m628a(C0853a.m10856d())) {
            C4100c.f13361a = false;
        }
        this.f11485d = new C0980j();
    }

    /* renamed from: h */
    private void m2237h() {
        C2463b.m5513a();
        C2663t.m5022b();
        C2656s.m5045c();
        C2448a.m5538a();
    }

    @Override // com.censivn.C3DEngine.p030a.C0870f, com.censivn.C3DEngine.p056d.InterfaceC1083b
    /* renamed from: b */
    public void mo2247b() {
        Home.f7122c.m6178a("initScene start");
        Home.m6159q();
        C2474e.m5491a();
        C3359a.f11084B = new C4081d();
        C3359a.f11108v = new C2373a();
        C3145b.m3315k();
        new C3568d();
        C0864d.m10805d().m10819a(new C3107a(new C0980j()));
        C3359a.f11091e = new C3474b();
        this.f11485d = new C0980j();
        this.f11486e = new C0980j();
        C3591c.m1945a();
        C3359a.f11102p.m5317a();
        C3359a.f11092f.m1599b();
        C3359a.f11096j.m2233a(this.f2497a);
        this.f11484c = C3359a.f11094h.m4047f();
        C3359a.f11101o.m3629a(this.f11486e);
        C3359a.f11100n.m2108a(this.f11486e);
        C3359a.f11093g.m5953a(this.f11485d);
        C3359a.f11095i.m1651a();
        C3359a.f11098l.m1865b();
        C3359a.f11103q.m2045a(this.f11485d);
        C3359a.f11091e.addChild(C3359a.f11092f.m1579g());
        C3359a.f11091e.addChild(this.f11484c);
        C3359a.f11091e.addChild(this.f11485d);
        this.f2497a.addChild(C3359a.f11091e);
        this.f2497a.addChild(this.f11486e);
        m2237h();
        C2370d.m5690c().mo5693a();
        Home.f7122c.m6178a("initScene end");
        this.f11487f = true;
    }

    /* renamed from: c */
    public boolean m2243c() {
        return this.f11488g;
    }

    /* renamed from: d */
    public void m2241d() {
        AbstractC2593d.hideAll();
        m2252a((Object) this);
        m2242c(this);
        this.f11484c.mouseEnabled(false);
    }

    /* renamed from: e */
    public void m2240e() {
        m2246b(this);
        m2251a((Object) this, true);
        this.f11484c.mouseEnabled(true);
    }

    /* renamed from: a */
    public void m2252a(Object obj) {
        C3359a.f11093g.f7458a.m5706m();
        C3359a.f11093g.f7459b.m5788y();
    }

    /* renamed from: a */
    public void m2251a(Object obj, boolean z) {
        if (!z || !C3359a.f11094h.m4122E()) {
            C3359a.f11093g.f7458a.m5705n();
            C3359a.f11093g.f7459b.m5787z();
        }
    }

    /* renamed from: b */
    public void m2246b(Object obj) {
        if (this.f11489h == obj) {
            this.f11489h = null;
            C3359a.f11101o.m3611i();
            C3359a.f11093g.f7459b.m5787z();
            C3359a.f11100n.m2083j();
        }
    }

    /* renamed from: c */
    public void m2242c(Object obj) {
        if (this.f11489h == null) {
            this.f11489h = obj;
            C3359a.f11101o.m3607k();
            C3359a.f11093g.f7459b.m5788y();
            C3359a.f11100n.m2084i();
        }
    }

    /* renamed from: a */
    public void m2249a(Runnable runnable, int i) {
        m2255a(null, runnable, i);
    }

    /* renamed from: a */
    public void m2255a(C3474b.C3478a c3478a, Runnable runnable, int i) {
        this.f11488g = false;
        AbstractC2593d.hideAll();
        C3359a.f11101o.m3607k();
        C3359a.f11100n.m2084i();
        C3398f.m2651a();
        C3359a.f11091e.m2269a(c3478a, i, runnable);
    }

    /* renamed from: a */
    public void m2248a(final Runnable runnable, boolean z) {
        if (this.f11489h == null) {
            C3359a.f11101o.m3611i();
            C3359a.f11100n.m2083j();
        }
        C3359a.f11091e.m2266a(new Runnable() { // from class: com.tsf.shell.manager.f.c.1
            @Override // java.lang.Runnable
            public void run() {
                C3479c.this.f11488g = true;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }, z);
    }

    /* renamed from: a */
    public void m2250a(Runnable runnable) {
        m2245b(runnable, ItemInfo.APP_INTENT);
    }

    /* renamed from: b */
    public void m2245b(final Runnable runnable, int i) {
        final boolean mo5548a = C3359a.f11108v.f7771d.m5539b().mo5548a();
        C2932g m4031n = C3359a.f11094h.m4031n();
        m4031n.mo4146ab();
        m4031n.m4221a(new Runnable() { // from class: com.tsf.shell.manager.f.c.2
            @Override // java.lang.Runnable
            public void run() {
                if (!mo5548a) {
                    C3479c.this.f11484c.visible(false);
                }
                if (runnable != null) {
                    runnable.run();
                }
            }
        }, i);
        this.f11484c.mouseEnabled(false);
    }

    /* renamed from: b */
    public void m2244b(final Runnable runnable, boolean z) {
        this.f11484c.visible(true);
        final C2932g m4031n = C3359a.f11094h.m4031n();
        m4031n.m4220a(new Runnable() { // from class: com.tsf.shell.manager.f.c.3
            @Override // java.lang.Runnable
            public void run() {
                C3479c.this.f11488g = true;
                m4031n.mo4145ac();
                if (runnable != null) {
                    runnable.run();
                }
                C3479c.this.f11484c.mouseEnabled(true);
            }
        }, z);
    }

    /* renamed from: f */
    public void m2239f() {
        if (this.f11487f) {
            C3359a.f11094h.m4112O();
            C3359a.f11098l.m1861d();
        }
    }

    /* renamed from: g */
    public void m2238g() {
        if (this.f11487f) {
            C3359a.f11094h.m4111P();
            C3359a.f11098l.m1863c();
        }
    }
}
