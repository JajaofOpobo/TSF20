package com.tsf.shell.manager.f;

import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.b.f.i;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.f.k;
import com.tsf.shell.f.f.g;
import com.tsf.shell.manager.b.e;
/* loaded from: classes.dex */
public class a {
    private static j c;
    private static i d;
    private int f = 1;
    private boolean g;
    private static com.censivn.C3DEngine.b.g.b.b e = new com.censivn.C3DEngine.b.g.b.b();
    public static int a = 50;
    public static int b = 86;

    private static int d(int i) {
        if (i < 0) {
            return 0;
        }
        if (i > 100) {
            return 100;
        }
        return i;
    }

    public static void a(final int i) {
        final int i2 = a;
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.manager.f.a.1
            @Override // com.censivn.C3DEngine.b.g.d
            public void a(float f) {
                a.b((int) (i2 + ((i - i2) * f)));
            }
        };
        com.censivn.C3DEngine.b.g.c.a(e);
        com.censivn.C3DEngine.b.g.c.a(e, 500, dVar);
    }

    public static void b(int i) {
        a = d(i);
        if (d != null && com.tsf.shell.manager.a.h.n().t() == -1) {
            if (d != com.tsf.shell.manager.a.f.g()) {
                if (a == 100) {
                    d.removeFromParent();
                } else if (d.parent() == null) {
                    c.addChild(d);
                }
            }
            d.alpha((int) ((1.0f - (a / 100.0f)) * 255.0f));
        }
    }

    public a(j jVar) {
        this.g = false;
        c = jVar;
        this.g = e.ai();
        if (this.g) {
            d = new k(com.censivn.C3DEngine.b.b.a.F, com.censivn.C3DEngine.b.b.a.G, false);
            d.setDefaultColor(new Color4(0, 0, 0, 255));
            return;
        }
        d = com.tsf.shell.manager.a.f.g();
    }

    public void a() {
        if (this.f != 2) {
            this.f = 2;
            c((int) ((1.0f - (a / 100.0f)) * 255.0f));
        }
    }

    public void b() {
        if (this.f != 0) {
            this.f = 0;
            c(b);
        }
    }

    public void c(int i) {
        if (this.g && d.parent() == null) {
            c.addChild(d);
            d.alpha(0.0f);
        }
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.manager.f.a.2
            @Override // com.censivn.C3DEngine.b.g.d
            public void a() {
                if (a.this.g && a.d.alpha() == 0.0f) {
                    a.d.removeFromParent();
                }
            }
        };
        dVar.a(i);
        com.censivn.C3DEngine.b.g.c.a(d);
        com.censivn.C3DEngine.b.g.c.a(d, 350, dVar);
    }

    public void c() {
        if (this.f != 1) {
            this.f = 1;
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.manager.f.a.3
                @Override // com.censivn.C3DEngine.b.g.d
                public void a() {
                    if (a.this.g) {
                        a.d.removeFromParent();
                    }
                }
            };
            dVar.a(0);
            com.censivn.C3DEngine.b.g.c.a(d);
            com.censivn.C3DEngine.b.g.c.a(d, 350, dVar);
        }
    }

    public void d() {
        a(com.tsf.shell.manager.a.h.n());
    }

    public void a(g gVar) {
        if (gVar.t() == -1 && a != 100) {
            a();
        } else {
            c();
        }
    }

    public void a(int i, int i2, int i3, int i4) {
        if (this.g) {
            ((k) d).a(com.censivn.C3DEngine.b.b.a.F);
            ((k) d).b(com.censivn.C3DEngine.b.b.a.G);
        }
    }
}
