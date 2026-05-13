package com.tsf.shell.f.h.a;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.b.b.a.d;
import com.censivn.C3DEngine.b.f.i;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.f.k;
import com.tsf.b;
import com.tsf.shell.manager.b.e;
/* loaded from: classes.dex */
public class a {
    private j a;
    private com.censivn.C3DEngine.b.h.d.c b;
    private d c;
    private TextureElement d;
    private k e;
    private boolean f = true;
    private boolean g = false;
    private boolean h;
    private boolean i;

    public a() {
        this.h = true;
        this.h = e.aB() == 0;
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
        this.e.setMouseEventListener(new com.censivn.C3DEngine.b.d.a(this.e) { // from class: com.tsf.shell.f.h.a.a.1
            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent) {
                a.this.x();
            }
        });
        this.a = new j();
        this.b = new com.censivn.C3DEngine.b.h.d.c(com.censivn.C3DEngine.b.b.a.a(96.0f), b.d.ring_small, com.censivn.C3DEngine.b.b.a.a(74.0f));
        this.b.setAABBPX(com.censivn.C3DEngine.b.b.a.a(130.0f), com.censivn.C3DEngine.b.b.a.a(130.0f));
        this.b.a(b.d.ico_setting);
        this.c = new d() { // from class: com.tsf.shell.f.h.a.a.2
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
        this.a.addChild(this.e);
        if (!e.av()) {
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
        e.v(this.h ? 0 : 1);
        a(this.e, b(this.g ? false : true), y(), com.censivn.C3DEngine.b.b.a.a(100.0f));
        if (this.f) {
            a(this.c, z(), 0.0f, com.censivn.C3DEngine.b.b.a.a(200.0f));
        } else {
            this.c.position().y = z();
        }
    }

    private void a(final i iVar, final float f, final float f2, final float f3) {
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.h.a.a.3
            @Override // com.censivn.C3DEngine.b.g.d
            public void a() {
                iVar.position().y = (f > 0.0f ? f3 : -f3) + f;
                com.censivn.C3DEngine.b.g.d dVar2 = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.h.a.a.3.1
                    @Override // com.censivn.C3DEngine.b.g.d
                    public void a() {
                    }
                };
                dVar2.h(f);
                dVar2.a(255);
                iVar.rotation().z = f2;
                com.censivn.C3DEngine.b.g.c.a(iVar);
                com.censivn.C3DEngine.b.g.c.a(iVar, 250, dVar2);
            }
        };
        if (iVar.position().y <= 0.0f) {
            f3 = -f3;
        }
        dVar.h(iVar.position().y + f3);
        dVar.a(0);
        com.censivn.C3DEngine.b.g.c.a(iVar);
        com.censivn.C3DEngine.b.g.c.a(iVar, 250, dVar);
    }

    public j c() {
        return this.a;
    }

    public void a(i iVar) {
        this.c.c(iVar);
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
                com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.h.a.a.4
                    @Override // com.censivn.C3DEngine.b.g.d
                    public void a() {
                        if (z2) {
                            a.this.A();
                        }
                        a.this.c.e();
                    }
                };
                dVar.h(z());
                dVar.a(255);
                dVar.a(com.censivn.C3DEngine.b.g.a.e);
                com.censivn.C3DEngine.b.g.c.a(this.c);
                com.censivn.C3DEngine.b.g.c.a(this.c, 500, dVar);
                com.censivn.C3DEngine.b.g.d dVar2 = new com.censivn.C3DEngine.b.g.d();
                if (this.h) {
                    dVar2.e(90.0f);
                } else {
                    dVar2.e(-90.0f);
                }
                dVar2.h(b(this.g ? false : true));
                dVar2.a(com.censivn.C3DEngine.b.g.a.e);
                com.censivn.C3DEngine.b.g.c.a(this.e);
                com.censivn.C3DEngine.b.g.c.a(this.e, 500, dVar2);
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
                com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.h.a.a.5
                    @Override // com.censivn.C3DEngine.b.g.d
                    public void a() {
                        if (z2) {
                            a.this.D();
                        }
                        a.this.c.visible(false);
                    }
                };
                dVar.h(z());
                dVar.a(0);
                dVar.a(com.censivn.C3DEngine.b.g.a.e);
                com.censivn.C3DEngine.b.g.c.a(this.c);
                com.censivn.C3DEngine.b.g.c.a(this.c, 500, dVar);
                com.censivn.C3DEngine.b.g.d dVar2 = new com.censivn.C3DEngine.b.g.d();
                if (this.h) {
                    dVar2.e(-90.0f);
                } else {
                    dVar2.e(90.0f);
                }
                dVar2.h(b(this.g ? false : true));
                dVar2.a(com.censivn.C3DEngine.b.g.a.e);
                com.censivn.C3DEngine.b.g.c.a(this.e);
                com.censivn.C3DEngine.b.g.c.a(this.e, 500, dVar2);
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
        new com.censivn.C3DEngine.b.g.d();
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
        dVar.a(0);
        dVar.h(b(false));
        dVar.a(com.censivn.C3DEngine.b.g.a.e);
        com.censivn.C3DEngine.b.g.c.a(this.e);
        com.censivn.C3DEngine.b.g.c.a(this.e, 500, dVar);
        this.e.mouseEnabled(false);
    }

    public void i() {
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.h.a.a.6
            @Override // com.censivn.C3DEngine.b.g.d
            public void a() {
                a.this.e.mouseEnabled(true);
            }
        };
        dVar.a(255);
        dVar.h(b(true));
        dVar.a(com.censivn.C3DEngine.b.g.a.e);
        com.censivn.C3DEngine.b.g.c.a(this.e);
        com.censivn.C3DEngine.b.g.c.a(this.e, 500, dVar);
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
                com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
                dVar.h(f);
                dVar.a(255);
                dVar.a(com.censivn.C3DEngine.b.g.a.e);
                com.censivn.C3DEngine.b.g.c.a(this.c);
                com.censivn.C3DEngine.b.g.c.a(this.c, 500, dVar);
            }
        }
        if (this.d.id == 0) {
            com.censivn.C3DEngine.a.g().a(this.d, b.d.scrollcontainer_arrow);
        }
        com.censivn.C3DEngine.b.g.d dVar2 = new com.censivn.C3DEngine.b.g.d();
        dVar2.a(255);
        com.censivn.C3DEngine.b.g.c.a(this.a);
        com.censivn.C3DEngine.b.g.c.a(this.a, VEasing.Linear.easeNone, dVar2);
    }

    public void k() {
        if (this.f) {
            B();
        }
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.h.a.a.7
            @Override // com.censivn.C3DEngine.b.g.d
            public void a() {
                if (a.this.f) {
                    a.this.C();
                }
                a.this.E();
                com.tsf.shell.manager.a.j.b(a.this.a);
            }
        };
        dVar.a(0);
        com.censivn.C3DEngine.b.g.c.a(this.a);
        com.censivn.C3DEngine.b.g.c.a(this.a, VEasing.Linear.easeNone, dVar);
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
