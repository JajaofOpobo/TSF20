package com.tsf.shell.manager.f;

import android.opengl.GLSurfaceView;
import com.censivn.C3DEngine.a.f;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.b.f.j;
import com.tsf.shell.Home;
import com.tsf.shell.f.e.p;
import com.tsf.shell.f.e.s;
import com.tsf.shell.f.f.g;
import com.tsf.shell.f.f.n;
import com.tsf.shell.manager.f.b;
import com.tsf.shell.manager.p.e;
import com.tsf.shell.manager.wallpaper.ShellWallpaperManager;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.utils.t;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class c extends f {
    private j c;
    private j d;
    private j e;
    private boolean f;
    private boolean g;
    private Object h;

    public c(GLSurfaceView gLSurfaceView) {
        super(gLSurfaceView, "Launcher");
        this.f = false;
        this.g = true;
        this.h = null;
        com.tsf.shell.manager._a.D = new com.tsf.shell.manager.j.c();
        com.tsf.shell.manager._a.a = new e();
        com.tsf.shell.manager._a.C = new com.tsf.shell.services.c();
        com.tsf.shell.manager._a.s = new com.censivn.C3DEngine.b.c.d();
        com.tsf.shell.manager._a.A = new com.tsf.shell.manager.h.a();
        com.tsf.shell.manager._a.c = this;
        com.censivn.C3DEngine.a.a(gLSurfaceView);
        com.censivn.C3DEngine.b.b.A.a();
        com.tsf.shell.manager._a.y = new com.tsf.shell.manager.e.a();
        com.tsf.shell.manager._a.t = new com.tsf.shell.f.a.a.b();
        com.tsf.shell.manager._a.u = new com.tsf.shell.f.a.b.a();
        com.tsf.shell.manager._a.r = new com.tsf.shell.manager.q.a();
        ThemeManager.initThemeManager();
        com.tsf.shell.manager._a.d = new com.tsf.shell.manager.action.b();
        com.tsf.shell.manager.action.f.a(com.censivn.C3DEngine.A.d());
        com.tsf.shell.manager._a.z = new com.tsf.shell.manager.c.b();
        com.tsf.shell.e.e eVar = (com.tsf.shell.e.e) gLSurfaceView.getParent();
        com.tsf.shell.manager._a.o = new com.tsf.shell.f.h.b();
        com.tsf.shell.manager._a.n = new com.tsf.shell.manager.m.b();
        com.tsf.shell.manager._a.f = new ShellWallpaperManager(com.censivn.C3DEngine.A.d());
        com.tsf.shell.manager._a.j = new d(eVar);
        com.tsf.shell.manager._a.h = new n();
        com.tsf.shell.manager._a.p = new com.tsf.shell.f.e.e.c();
        com.tsf.shell.manager._a.q = new com.tsf.shell.manager.n.a();
        com.tsf.shell.manager._a.g = new com.tsf.shell.f.c.A();
        com.tsf.shell.manager._a.x = new com.tsf.shell.manager.l.b();
        com.tsf.shell.manager._a.i = new com.tsf.shell.manager.r.c.e();
        com.tsf.shell.manager._a.k = new com.tsf.shell.manager.d.a();
        com.tsf.shell.manager._a.l = new com.tsf.shell.manager.r.a.b();
        com.tsf.shell.manager._a.m = new p();
        if (!t.a(com.censivn.C3DEngine.A.d())) {
            com.tsf.shell.services.c.a = false;
        }
        this.d = new j();
    }

    private void h() {
        com.tsf.shell.f.e.b.a();
        com.tsf.shell.f.e.t.b();
        s.c();
        com.tsf.shell.f.e.a.a();
    }

    @Override // com.censivn.C3DEngine.a.f, com.censivn.C3DEngine.d.b
    public void b() {
        Home.c.a("initScene start");
        Home.q();
        com.tsf.shell.f.e.b.e.a();
        com.tsf.shell.manager._a.B = new com.tsf.shell.preference.a.d();
        com.tsf.shell.manager._a.v = new com.tsf.shell.f._d.A();
        com.tsf.shell.f.i.b.d.b.k();
        new com.tsf.shell.manager.o.d();
        com.censivn.C3DEngine.a.d.d().a(new com.tsf.shell.f.i.a.a(new j()));
        com.tsf.shell.manager._a.e = new b();
        this.d = new j();
        this.e = new j();
        com.tsf.shell.manager.p.c.a();
        com.tsf.shell.manager._a.p.a();
        com.tsf.shell.manager._a.f.b();
        com.tsf.shell.manager._a.j.a(this.a);
        this.c = com.tsf.shell.manager._a.h.f();
        com.tsf.shell.manager._a.o.a(this.e);
        com.tsf.shell.manager._a.n.a(this.e);
        com.tsf.shell.manager._a.g.a(this.d);
        com.tsf.shell.manager._a.i.a();
        com.tsf.shell.manager._a.l.b();
        com.tsf.shell.manager._a.q.a(this.d);
        com.tsf.shell.manager._a.e.addChild(com.tsf.shell.manager._a.f.g());
        com.tsf.shell.manager._a.e.addChild(this.c);
        com.tsf.shell.manager._a.e.addChild(this.d);
        this.a.addChild(com.tsf.shell.manager._a.e);
        this.a.addChild(this.e);
        h();
        com.tsf.shell.f._d.c().a();
        Home.c.a("initScene end");
        this.f = true;
    }

    public boolean c() {
        return this.g;
    }

    public void d() {
        com.tsf.shell.f.e._g.d.hideAll();
        a((Object) this);
        c(this);
        this.c.mouseEnabled(false);
    }

    public void e() {
        b(this);
        a((Object) this, true);
        this.c.mouseEnabled(true);
    }

    public void a(Object obj) {
        com.tsf.shell.manager._a.g.a.m();
        com.tsf.shell.manager._a.g.b.y();
    }

    public void a(Object obj, boolean z) {
        if (!z || !com.tsf.shell.manager._a.h.E()) {
            com.tsf.shell.manager._a.g.a.n();
            com.tsf.shell.manager._a.g.b.z();
        }
    }

    public void b(Object obj) {
        if (this.h == obj) {
            this.h = null;
            com.tsf.shell.manager._a.o.i();
            com.tsf.shell.manager._a.g.b.z();
            com.tsf.shell.manager._a.n.j();
        }
    }

    public void c(Object obj) {
        if (this.h == null) {
            this.h = obj;
            com.tsf.shell.manager._a.o.k();
            com.tsf.shell.manager._a.g.b.y();
            com.tsf.shell.manager._a.n.i();
        }
    }

    public void a(Runnable runnable, int i) {
        a(null, runnable, i);
    }

    public void a(b.a aVar, Runnable runnable, int i) {
        this.g = false;
        com.tsf.shell.f.e._g.d.hideAll();
        com.tsf.shell.manager._a.o.k();
        com.tsf.shell.manager._a.n.i();
        com.tsf.shell.manager.action.f.a();
        com.tsf.shell.manager._a.e.a(aVar, i, runnable);
    }

    public void a(final Runnable runnable, boolean z) {
        if (this.h == null) {
            com.tsf.shell.manager._a.o.i();
            com.tsf.shell.manager._a.n.j();
        }
        com.tsf.shell.manager._a.e.a(new Runnable() { // from class: com.tsf.shell.manager.f.c.1
            @Override // java.lang.Runnable
            public void run() {
                c.this.g = true;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }, z);
    }

    public void a(Runnable runnable) {
        b(runnable, ItemInfo.APP_INTENT);
    }

    public void b(final Runnable runnable, int i) {
        final boolean zA = com.tsf.shell.manager._a.v.d.b().a();
        g gVarN = com.tsf.shell.manager._a.h.n();
        gVarN.ab();
        gVarN.a(new Runnable() { // from class: com.tsf.shell.manager.f.c.2
            @Override // java.lang.Runnable
            public void run() {
                if (!zA) {
                    c.this.c.visible(false);
                }
                if (runnable != null) {
                    runnable.run();
                }
            }
        }, i);
        this.c.mouseEnabled(false);
    }

    public void b(final Runnable runnable, boolean z) {
        this.c.visible(true);
        final g gVarN = com.tsf.shell.manager._a.h.n();
        gVarN.a(new Runnable() { // from class: com.tsf.shell.manager.f.c.3
            @Override // java.lang.Runnable
            public void run() {
                c.this.g = true;
                gVarN.ac();
                if (runnable != null) {
                    runnable.run();
                }
                c.this.c.mouseEnabled(true);
            }
        }, z);
    }

    public void f() {
        if (this.f) {
            com.tsf.shell.manager._a.h.O();
            com.tsf.shell.manager._a.l.d();
        }
    }

    public void g() {
        if (this.f) {
            com.tsf.shell.manager._a.h.P();
            com.tsf.shell.manager._a.l.c();
        }
    }
}
