package com.tsf.shell.workspace3D;

/* loaded from: classes.dex */
public final class bf extends com.censivn.a.b {
    public static String a = "EVENT_READY";
    public static String b = "EVENT_INIT_COMPLETE";
    private static bf d;
    private static r e;
    private com.tsf.shell.h.q c;

    public bf(com.tsf.shell.h.q qVar) {
        d = this;
        this.c = qVar;
        this.c.setEGLContextClientVersion(2);
        if (com.tsf.shell.a.t.G()) {
            this.c.setEGLConfigChooser(8, 8, 8, 8, 16, 0);
            this.c.getHolder().setFormat(-3);
        } else {
            this.c.getHolder().setFormat(4);
            this.c.setEGLConfigChooser(true);
        }
        e = new r(this.c);
    }

    public static bf a() {
        return d;
    }

    public final void b() {
        a("EVENT_READY");
    }

    public final void c() {
        a("EVENT_INIT_COMPLETE");
    }

    public static void d() {
        e.f();
        com.tsf.shell.workspace3D.k.b.k.u();
        e.l();
        e.m();
        ShellWallpaperManager.k();
        e.o().f();
        com.tsf.shell.c.a.a.b();
    }

    public final void e() {
        bg bgVar = new bg(this);
        com.censivn.C3DEngine.a.d().g();
        com.censivn.C3DEngine.a.a().c(bgVar);
    }

    public final void f() {
        bh bhVar = new bh(this);
        com.censivn.C3DEngine.a.d().g();
        com.censivn.C3DEngine.a.a().c(bhVar);
    }

    public static void a(boolean z) {
        e.a(z);
    }

    public static boolean g() {
        return e.d();
    }

    public static com.tsf.shell.workspace3D.j.n h() {
        return e.k();
    }

    public static com.tsf.shell.workspace3D.h.ba i() {
        return e.g();
    }

    public static com.tsf.shell.workspace3D.h.l j() {
        return e.i();
    }

    public static com.tsf.shell.workspace3D.f.c k() {
        return e.h();
    }

    public static com.tsf.shell.workspace3D.k.b.k l() {
        return e.f();
    }

    public static al m() {
        return e.j();
    }

    public static r n() {
        return e;
    }

    public static q o() {
        return e.e();
    }

    public static com.tsf.shell.workspace3D.b.a p() {
        return e.l();
    }

    public static ShellWallpaperManager q() {
        return e.m();
    }

    public static ap r() {
        return e.n();
    }

    public static com.tsf.shell.workspace3D.e.p s() {
        return e.o();
    }
}
