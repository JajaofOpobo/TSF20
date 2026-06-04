package com.tsf.shell.workspace3D;

/* loaded from: classes.dex */
public final class a {
    public static int a = 100;
    public static int b = 180;
    private static com.censivn.C3DEngine.b.v c;
    private static com.censivn.C3DEngine.b.r d;
    private int e = 1;
    private boolean f;

    public static void a(int i) {
        if (i < 0) {
            i = 0;
        } else if (i > 100) {
            i = 100;
        }
        a = i;
        if (d != null && bf.j().k().aG() == -1) {
            if (a == 100) {
                d.Q();
            } else if (d.P() == null) {
                c.d(d);
            }
            d.b((int) ((1.0f - (a / 100.0f)) * 255.0f));
        }
    }

    public static int a() {
        return a;
    }

    public a(com.censivn.C3DEngine.b.v vVar) {
        this.f = false;
        c = vVar;
        this.f = com.tsf.shell.a.t.G();
        if (this.f) {
            com.censivn.C3DEngine.e.b bVar = new com.censivn.C3DEngine.e.b(com.censivn.C3DEngine.a.l, com.censivn.C3DEngine.a.m, (byte) 0);
            d = bVar;
            bVar.a(255, 0, 0, 0);
            return;
        }
        d = ShellWallpaperManager.a().j();
    }

    public final void b() {
        if (this.e != 0) {
            this.e = 0;
            b(b);
        }
    }

    private void b(int i) {
        if (this.f && d.P() == null) {
            c.d(d);
            d.b(0.0f);
        }
        b bVar = new b(this);
        bVar.a(i);
        com.censivn.C3DEngine.g.s.a(d);
        com.censivn.C3DEngine.g.s.a(d, 350, bVar);
    }

    public final void a(com.tsf.shell.workspace3D.h.a aVar) {
        if (aVar.aG() == -1 && a != 100) {
            if (this.e != 2) {
                this.e = 2;
                b((int) ((1.0f - (a / 100.0f)) * 255.0f));
                return;
            }
            return;
        }
        if (this.e != 1) {
            this.e = 1;
            c cVar = new c(this);
            cVar.a(0);
            com.censivn.C3DEngine.g.s.a(d);
            com.censivn.C3DEngine.g.s.a(d, 350, cVar);
        }
    }

    public final void c() {
        if (this.f) {
            ((com.censivn.C3DEngine.e.b) d).a_(com.censivn.C3DEngine.a.l);
            ((com.censivn.C3DEngine.e.b) d).h(com.censivn.C3DEngine.a.m);
        }
    }
}
