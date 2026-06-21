package com.tsf.shell.e.e;

import android.view.KeyEvent;

/* loaded from: classes.dex */
public class x extends com.censivn.C3DEngine.b.f.l implements com.censivn.C3DEngine.b.c.d, com.censivn.C3DEngine.b.c.k {
    private static x a;
    private static y b;
    private static boolean c = false;
    private static com.tsf.shell.e.i.c d;
    private static Runnable e;

    public static void a() {
        if (c) {
            com.censivn.C3DEngine.a.a().c(e);
        }
    }

    public static void a(float f, float f2) {
        com.censivn.C3DEngine.b.g.x xVar = new com.censivn.C3DEngine.b.g.x();
        xVar.f(a.position().x + f);
        xVar.h(a.position().y + f2);
        com.censivn.C3DEngine.b.g.w.a(a);
        com.censivn.C3DEngine.b.g.w.a(a, 250, xVar);
    }

    public static void b() {
        a.d();
    }

    public static void c() {
        a = new x();
        e = new Runnable() { // from class: com.tsf.shell.e.e.x.1
            @Override // java.lang.Runnable
            public void run() {
                x.b();
            }
        };
        b = new y(500.0f, 500.0f, new com.censivn.C3DEngine.b.f.b.b(15.0f, 17.0f, 15.0f, 17.0f, 32.0f, 32.0f));
        a.addChild(b);
    }

    public static void a(com.tsf.shell.e.i.c cVar) {
        c = true;
        d = cVar;
        d.W();
        a.removeFromParent();
        a.rotation().z = cVar.rotation().z;
        a.position().setAllFrom(cVar.position());
        com.tsf.shell.manager.a.j.a(a);
        a.e().a(Math.abs(cVar.minX() * cVar.u()), Math.abs(cVar.maxX() * cVar.u()), Math.abs(cVar.minY() * cVar.u()), Math.abs(cVar.maxY() * cVar.u()));
        a.e().setFocus();
        a.e().h();
        com.censivn.C3DEngine.b.c.c.a(a);
        com.tsf.shell.manager.a.b.a(a);
        com.censivn.C3DEngine.b.g.x xVar = new com.censivn.C3DEngine.b.g.x();
        xVar.a(255);
        com.censivn.C3DEngine.b.g.w.a(a);
        com.censivn.C3DEngine.b.g.w.a(a, 250, xVar);
    }

    @Override // com.censivn.C3DEngine.b.c.k
    public void a(int i, int i2, int i3, int i4) {
        d();
    }

    @Override // com.censivn.C3DEngine.b.c.d
    public void a(int i, KeyEvent keyEvent) {
        if (i == 4) {
            d();
        }
    }

    @Override // com.censivn.C3DEngine.b.c.d
    public void b(int i, KeyEvent keyEvent) {
    }

    public void d() {
        if (c) {
            b.i();
            d.X();
            d = null;
            com.censivn.C3DEngine.b.g.x xVar = new com.censivn.C3DEngine.b.g.x() { // from class: com.tsf.shell.e.e.x.2
                @Override // com.censivn.C3DEngine.b.g.x
                public void a() {
                    x.a.removeFromParent();
                }
            };
            xVar.a(0);
            com.censivn.C3DEngine.b.g.w.a(this);
            com.censivn.C3DEngine.b.g.w.a(this, 250, xVar);
            com.censivn.C3DEngine.b.c.c.b(this);
            com.tsf.shell.manager.a.b.b(a);
            c = false;
        }
    }

    public y e() {
        return b;
    }
}
