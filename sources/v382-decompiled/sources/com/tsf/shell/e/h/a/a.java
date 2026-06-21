package com.tsf.shell.e.h.a;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.f.l;
import com.censivn.C3DEngine.b.f.m;
import com.censivn.C3DEngine.b.g.w;
import com.censivn.C3DEngine.b.g.x;
import com.censivn.C3DEngine.b.h.d.e;
import com.tsf.shell.R;
import com.tsf.shell.manager.b.g;

/* loaded from: classes.dex */
public class a {
    private l a;
    private e b;
    private com.censivn.C3DEngine.b.b.a.d c;
    private TextureElement d;
    private m e;
    private boolean f = true;
    private boolean g = false;
    private boolean h;
    private boolean i;

    public a() {
        this.h = true;
        this.h = g.az() == 0;
        this.d = new TextureElement(0, false);
        this.e = com.censivn.C3DEngine.b.b.a.a(24.0f, 45.0f);
        this.e.textures().addElement(this.d);
        if (this.h) {
            this.e.rotation().z = 90.0f;
        } else {
            this.e.rotation().z = -90.0f;
        }
        this.e.calAABB(3.0f, 5.0f, 1.0f);
        this.e.alpha(200.0f);
        this.e.setMouseEventListener(new com.censivn.C3DEngine.b.d.a(this.e) { // from class: com.tsf.shell.e.h.a.a.1
            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent) {
                a.this.x();
            }
        });
        this.a = new l();
        this.b = new e(com.censivn.C3DEngine.b.b.a.a(96.0f), R.drawable.ring_small, com.censivn.C3DEngine.b.b.a.a(74.0f));
        this.b.setAABBPX(com.censivn.C3DEngine.b.b.a.a(130.0f), com.censivn.C3DEngine.b.b.a.a(130.0f));
        this.b.a(R.drawable.ico_setting);
        this.c = new com.censivn.C3DEngine.b.b.a.d() { // from class: com.tsf.shell.e.h.a.a.2
            @Override // com.censivn.C3DEngine.b.b.a.d
            public void a(int i, float f) {
                if (f > 1.0f) {
                    f = 1.0f;
                }
                a.this.b.a(f);
            }

            @Override // com.censivn.C3DEngine.b.b.a.d
            public void d(int i) {
                a.this.v();
            }

            @Override // com.censivn.C3DEngine.b.b.a.d
            public void e(int i) {
                a.this.w();
            }

            @Override // com.censivn.C3DEngine.b.b.a.d
            public void a(int i) {
                if (i == 0) {
                    a.this.b.c(0);
                } else {
                    a.this.b.c(1);
                }
                a.this.b(i);
            }

            @Override // com.censivn.C3DEngine.b.b.a.d
            public boolean b(int i) {
                return a.this.c(i);
            }
        };
        this.c.e(0.0f);
        this.c.b(this.b);
        this.a.addChild(this.c);
        this.a.addChild(this.e);
        if (!g.at()) {
            a(false, false, false);
        }
    }

    public int a() {
        return this.h ? 0 : 1;
    }

    public void a(int i) {
        if (this.h && i != 0) {
            this.h = false;
            b();
        } else if (!this.h && i != 1) {
            this.h = true;
            b();
        }
    }

    public void b() {
        g.u(this.h ? 0 : 1);
        a(this.e, b(this.g ? false : true), y(), com.censivn.C3DEngine.b.b.a.a(100.0f));
        if (this.f) {
            a(this.c, z(), 0.0f, com.censivn.C3DEngine.b.b.a.a(200.0f));
        } else {
            this.c.position().y = z();
        }
    }

    private void a(final j jVar, final float f, final float f2, final float f3) {
        x xVar = new x() { // from class: com.tsf.shell.e.h.a.a.3
            @Override // com.censivn.C3DEngine.b.g.x
            public void a() {
                jVar.position().y = (f > 0.0f ? f3 : -f3) + f;
                x xVar2 = new x() { // from class: com.tsf.shell.e.h.a.a.3.1
                    @Override // com.censivn.C3DEngine.b.g.x
                    public void a() {
                    }
                };
                xVar2.h(f);
                xVar2.a(255);
                jVar.rotation().z = f2;
                w.a(jVar);
                w.a(jVar, 250, xVar2);
            }
        };
        if (jVar.position().y <= 0.0f) {
            f3 = -f3;
        }
        xVar.h(jVar.position().y + f3);
        xVar.a(0);
        w.a(jVar);
        w.a(jVar, 250, xVar);
    }

    public l c() {
        return this.a;
    }

    public void a(j jVar) {
        this.c.c(jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        this.g = true;
        this.a.mouseEnabled(false);
        com.tsf.shell.manager.a.o.f();
        h();
        t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        this.g = false;
        this.a.mouseEnabled(true);
        i();
        com.tsf.shell.manager.a.o.g();
    }

    public void d() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        if (this.f) {
            a(true, true, true);
        } else {
            b(true, true, true);
        }
    }

    public boolean e() {
        return this.g;
    }

    public void f() {
        this.i = this.f;
        this.g = true;
        this.e.mouseEnabled(false);
        if (this.f) {
            a(true, false, false);
        } else {
            h();
        }
    }

    public void g() {
        this.g = false;
        this.e.mouseEnabled(true);
        if (this.i) {
            b(true, false, false);
        } else {
            i();
        }
    }

    private void b(boolean z, final boolean z2, boolean z3) {
        if (!this.f) {
            this.f = true;
            if (z3) {
                a(true);
            }
            if (z) {
                this.c.visible(true);
                x xVar = new x() { // from class: com.tsf.shell.e.h.a.a.4
                    @Override // com.censivn.C3DEngine.b.g.x
                    public void a() {
                        if (z2) {
                            a.this.A();
                        }
                        a.this.c.e();
                    }
                };
                xVar.h(z());
                xVar.a(255);
                xVar.a(com.censivn.C3DEngine.b.g.a.e);
                w.a(this.c);
                w.a(this.c, 500, xVar);
                x xVar2 = new x();
                if (this.h) {
                    xVar2.e(90.0f);
                } else {
                    xVar2.e(-90.0f);
                }
                xVar2.h(b(this.g ? false : true));
                xVar2.a(com.censivn.C3DEngine.b.g.a.e);
                w.a(this.e);
                w.a(this.e, 500, xVar2);
                return;
            }
            this.c.position().y = z();
            this.c.alpha(255.0f);
            this.c.visible(true);
            if (this.h) {
                this.e.rotation().z = 90.0f;
            } else {
                this.e.rotation().z = -90.0f;
            }
            this.e.position().y = b(this.g ? false : true);
            this.c.e();
        }
    }

    public void a(boolean z, final boolean z2, boolean z3) {
        if (this.f) {
            this.f = false;
            if (z3) {
                a(false);
            }
            if (z2) {
                B();
            }
            this.c.d();
            if (z) {
                x xVar = new x() { // from class: com.tsf.shell.e.h.a.a.5
                    @Override // com.censivn.C3DEngine.b.g.x
                    public void a() {
                        if (z2) {
                            a.this.D();
                        }
                        a.this.c.visible(false);
                    }
                };
                xVar.h(z());
                xVar.a(0);
                xVar.a(com.censivn.C3DEngine.b.g.a.e);
                w.a(this.c);
                w.a(this.c, 500, xVar);
                x xVar2 = new x();
                if (this.h) {
                    xVar2.e(-90.0f);
                } else {
                    xVar2.e(90.0f);
                }
                xVar2.h(b(this.g ? false : true));
                xVar2.a(com.censivn.C3DEngine.b.g.a.e);
                w.a(this.e);
                w.a(this.e, 500, xVar2);
                return;
            }
            if (z2) {
                D();
            }
            this.c.position().y = z();
            this.c.alpha(0.0f);
            this.c.visible(false);
            if (this.h) {
                this.e.rotation().z = -90.0f;
            } else {
                this.e.rotation().z = 90.0f;
            }
            this.e.position().y = b(this.g ? false : true);
        }
    }

    private float b(boolean z) {
        return z ? this.h ? com.censivn.C3DEngine.b.b.a.B - com.censivn.C3DEngine.b.b.a.a(38.0f) : com.censivn.C3DEngine.b.b.a.C + com.censivn.C3DEngine.b.b.a.a(38.0f) : this.h ? com.censivn.C3DEngine.b.b.a.B + com.censivn.C3DEngine.b.b.a.a(100.0f) : com.censivn.C3DEngine.b.b.a.C - com.censivn.C3DEngine.b.b.a.a(100.0f);
    }

    private int y() {
        return this.h ? this.f ? 90 : -90 : this.f ? -90 : 90;
    }

    private float z() {
        return this.f ? this.h ? com.censivn.C3DEngine.b.b.a.B - com.censivn.C3DEngine.b.b.a.a(170.0f) : com.censivn.C3DEngine.b.b.a.C + com.censivn.C3DEngine.b.b.a.a(230.0f) : this.h ? com.censivn.C3DEngine.b.b.a.B + com.censivn.C3DEngine.b.b.a.a(100.0f) : com.censivn.C3DEngine.b.b.a.C - com.censivn.C3DEngine.b.b.a.a(100.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A() {
        this.c.j();
        m();
    }

    private void B() {
        n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C() {
        o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D() {
        p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E() {
        com.censivn.C3DEngine.a.g().a(this.d);
        r();
    }

    private void F() {
        q();
    }

    public void h() {
        new x();
        x xVar = new x();
        xVar.a(0);
        xVar.h(b(false));
        xVar.a(com.censivn.C3DEngine.b.g.a.e);
        w.a(this.e);
        w.a(this.e, 500, xVar);
        this.e.mouseEnabled(false);
    }

    public void i() {
        x xVar = new x() { // from class: com.tsf.shell.e.h.a.a.6
            @Override // com.censivn.C3DEngine.b.g.x
            public void a() {
                a.this.e.mouseEnabled(true);
            }
        };
        xVar.a(255);
        xVar.h(b(true));
        xVar.a(com.censivn.C3DEngine.b.g.a.e);
        w.a(this.e);
        w.a(this.e, 500, xVar);
    }

    public void j() {
        if (this.a.parent() == null) {
            com.tsf.shell.manager.a.j.a(this.a);
            G();
            F();
            if (this.f) {
                A();
                float f = this.c.position().y;
                if (this.h) {
                    this.c.position().y -= com.censivn.C3DEngine.b.b.a.a(100.0f);
                } else {
                    this.c.position().y += com.censivn.C3DEngine.b.b.a.a(100.0f);
                }
                this.c.alpha(0.0f);
                x xVar = new x();
                xVar.h(f);
                xVar.a(255);
                xVar.a(com.censivn.C3DEngine.b.g.a.e);
                w.a(this.c);
                w.a(this.c, 500, xVar);
            }
        }
        if (this.d.id == 0) {
            com.censivn.C3DEngine.a.g().a(this.d, R.drawable.scrollcontainer_arrow);
        }
        x xVar2 = new x();
        xVar2.a(255);
        w.a(this.a);
        w.a(this.a, VEasing.Linear.easeNone, xVar2);
    }

    public void k() {
        if (this.f) {
            B();
        }
        x xVar = new x() { // from class: com.tsf.shell.e.h.a.a.7
            @Override // com.censivn.C3DEngine.b.g.x
            public void a() {
                if (a.this.f) {
                    a.this.C();
                }
                a.this.E();
                com.tsf.shell.manager.a.j.b(a.this.a);
            }
        };
        xVar.a(0);
        w.a(this.a);
        w.a(this.a, VEasing.Linear.easeNone, xVar);
    }

    private void G() {
        this.c.setAABBPX(0.0f, (-com.censivn.C3DEngine.b.b.a.a(500.0f)) / 2.0f, 0.0f, com.censivn.C3DEngine.b.b.a.D, com.censivn.C3DEngine.b.b.a.a(500.0f) / 2.0f, 0.0f);
        this.c.k();
        this.c.position().x = com.censivn.C3DEngine.b.b.a.z;
        this.c.position().y = z();
        this.e.position().y = b(!this.g);
    }

    public void l() {
        G();
        this.c.a(0.0f, 0.0f, 0.0f, 0.0f);
        s();
    }

    public void m() {
    }

    public void n() {
    }

    public void o() {
    }

    public void p() {
    }

    public void q() {
    }

    public void r() {
    }

    public void s() {
    }

    public void a(boolean z) {
    }

    public void b(int i) {
    }

    public boolean c(int i) {
        return true;
    }

    public void d(int i) {
        this.b.a(i);
    }

    public void e(int i) {
        this.b.b(i);
    }

    public void a(String str) {
        this.b.a(str);
    }

    public void t() {
    }

    public void u() {
        this.c.g();
    }
}
