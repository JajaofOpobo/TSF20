package com.tsf.shell.f;

import com.tsf.shell.manager.b.e;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class d {
    private static d b;
    private static com.tsf.shell.manager.f.c c;
    private com.censivn.C3DEngine.a.a a;

    public d(com.censivn.C3DEngine.a.a aVar) {
        b = this;
        this.a = aVar;
        h();
    }

    public static d c() {
        return b;
    }

    private void h() {
        this.a.setEGLContextClientVersion(2);
        if (e.ai()) {
            this.a.setEGLConfigChooser(8, 8, 8, 8, 16, 8);
            this.a.getHolder().setFormat(-3);
        } else {
            this.a.setEGLConfigChooser(5, 6, 5, 0, 16, 8);
            this.a.getHolder().setFormat(4);
        }
        c = new com.tsf.shell.manager.f.c(this.a);
    }

    public void a() {
    }

    public void b() {
    }

    public static void d() {
        com.tsf.shell.manager.a.i.d();
        com.tsf.shell.manager.a.l.a();
        com.tsf.shell.manager.a.f.h();
        com.tsf.shell.manager.a.g.b();
    }

    public void e() {
        Runnable runnable = new Runnable() { // from class: com.tsf.shell.f.d.1
            @Override // java.lang.Runnable
            public void run() {
                d.this.a.onResume();
                com.censivn.C3DEngine.b.g.c.c();
                d.c.f();
            }
        };
        com.censivn.C3DEngine.a.e().j();
        com.censivn.C3DEngine.a.a().c(runnable);
    }

    public void f() {
        Runnable runnable = new Runnable() { // from class: com.tsf.shell.f.d.2
            @Override // java.lang.Runnable
            public void run() {
                com.censivn.C3DEngine.b.g.c.b();
                d.c.g();
                d.this.a.onPause();
            }
        };
        com.censivn.C3DEngine.a.e().j();
        com.censivn.C3DEngine.a.a().c(runnable);
    }
}
