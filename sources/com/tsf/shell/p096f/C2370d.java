package com.tsf.shell.p096f;

import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.p030a.C0854a;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.p168b.C3430e;
import com.tsf.shell.manager.p174f.C3479c;
/* renamed from: com.tsf.shell.f.d */
/* loaded from: classes.dex */
public class C2370d {

    /* renamed from: b */
    private static C2370d f7763b;

    /* renamed from: c */
    private static C3479c f7764c;

    /* renamed from: a */
    private C0854a f7765a;

    public C2370d(C0854a c0854a) {
        f7763b = this;
        this.f7765a = c0854a;
        m5685h();
    }

    /* renamed from: c */
    public static C2370d m5690c() {
        return f7763b;
    }

    /* renamed from: h */
    private void m5685h() {
        this.f7765a.setEGLContextClientVersion(2);
        if (C3430e.m2516ai()) {
            this.f7765a.setEGLConfigChooser(8, 8, 8, 8, 16, 8);
            this.f7765a.getHolder().setFormat(-3);
        } else {
            this.f7765a.setEGLConfigChooser(5, 6, 5, 0, 16, 8);
            this.f7765a.getHolder().setFormat(4);
        }
        f7764c = new C3479c(this.f7765a);
    }

    /* renamed from: a */
    public void mo5693a() {
    }

    /* renamed from: b */
    public void mo5691b() {
    }

    /* renamed from: d */
    public static void m5689d() {
        C3359a.f11095i.m1634d();
        C3359a.f11098l.m1869a();
        C3359a.f11092f.m1577h();
        C3359a.f11093g.m5952b();
    }

    /* renamed from: e */
    public void m5688e() {
        Runnable runnable = new Runnable() { // from class: com.tsf.shell.f.d.1
            @Override // java.lang.Runnable
            public void run() {
                C2370d.this.f7765a.onResume();
                C1014c.m10321c();
                C2370d.f7764c.m2239f();
            }
        };
        C0853a.m10855e().m10760j();
        C0853a.m10865a().m10583c(runnable);
    }

    /* renamed from: f */
    public void m5687f() {
        Runnable runnable = new Runnable() { // from class: com.tsf.shell.f.d.2
            @Override // java.lang.Runnable
            public void run() {
                C1014c.m10324b();
                C2370d.f7764c.m2238g();
                C2370d.this.f7765a.onPause();
            }
        };
        C0853a.m10855e().m10760j();
        C0853a.m10865a().m10583c(runnable);
    }
}
