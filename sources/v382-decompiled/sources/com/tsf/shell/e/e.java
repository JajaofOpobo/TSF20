package com.tsf.shell.e;

import com.censivn.C3DEngine.b.g.w;
import com.tsf.shell.manager.b.g;

/* loaded from: classes.dex */
public class e {
    private static e b;
    private static com.tsf.shell.manager.f.d c;
    private com.censivn.C3DEngine.a.a a;

    public e(com.censivn.C3DEngine.a.a aVar) {
        b = this;
        this.a = aVar;
        h();
    }

    public static e c() {
        return b;
    }

    private void h() {
        this.a.setEGLContextClientVersion(2);
        if (g.ag()) {
            this.a.setEGLConfigChooser(8, 8, 8, 8, 16, 8);
            this.a.getHolder().setFormat(-3);
        } else {
            this.a.setEGLConfigChooser(5, 6, 5, 0, 16, 8);
            this.a.getHolder().setFormat(4);
        }
        c = new com.tsf.shell.manager.f.d(this.a);
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
        Runnable runnable = new Runnable() { // from class: com.tsf.shell.e.e.1
            @Override // java.lang.Runnable
            public void run() {
                e.this.a.onResume();
                w.c();
                e.c.f();
            }
        };
        com.censivn.C3DEngine.a.e().j();
        com.censivn.C3DEngine.a.a().c(runnable);
    }

    public void f() {
        Runnable runnable = new Runnable() { // from class: com.tsf.shell.e.e.2
            @Override // java.lang.Runnable
            public void run() {
                w.b();
                e.c.g();
                e.this.a.onPause();
            }
        };
        com.censivn.C3DEngine.a.e().j();
        com.censivn.C3DEngine.a.a().c(runnable);
    }
}
