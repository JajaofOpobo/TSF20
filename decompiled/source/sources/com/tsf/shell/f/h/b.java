package com.tsf.shell.f.h;

import android.view.KeyEvent;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.b.c.b;
import com.censivn.C3DEngine.b.c.e;
import com.censivn.C3DEngine.b.f.j;
import com.tsf.b;
import com.tsf.shell.manager.f.b;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.utils.x;
/* loaded from: classes.dex */
public class b implements b.a, e.a {
    public static int b = -1725816286;
    private j d;
    private com.tsf.shell.f.e.c.a e;
    private c f;
    private j g;
    private e k;
    private b.a l;
    private float m;
    private float o;
    private float p;
    private a r;
    private com.tsf.shell.f.h.a.c s;
    public int a = 47;
    private float c = 0.0f;
    private boolean h = true;
    private boolean i = false;
    private boolean j = false;
    private boolean n = false;
    private boolean q = false;
    private boolean t = false;

    public void a(boolean z, int i) {
        this.t = z;
        if (z) {
            this.a = i;
            this.g.mouseEnabled(true);
        } else {
            this.a = 0;
            this.g.mouseEnabled(false);
        }
        this.e.a((int) ((this.a / 100.0f) * 255.0f));
    }

    public com.tsf.shell.f.h.a.c a() {
        return this.s;
    }

    public com.tsf.shell.f.e.c.a b() {
        return this.e;
    }

    public c c() {
        return this.f;
    }

    public float d() {
        return this.o;
    }

    public float e() {
        return this.p;
    }

    public void f() {
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
        dVar.h((-com.censivn.C3DEngine.b.b.a.E) / 2.0f);
        dVar.a(0);
        com.censivn.C3DEngine.b.g.c.a(this.d);
        com.censivn.C3DEngine.b.g.c.a(this.d, 350, dVar);
    }

    public void g() {
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
        dVar.h(0.0f);
        dVar.a(255);
        dVar.a(com.censivn.C3DEngine.b.g.a.a);
        com.censivn.C3DEngine.b.g.c.a(this.d);
        com.censivn.C3DEngine.b.g.c.a(this.d, 500, dVar);
    }

    public void a(j jVar) {
        com.tsf.shell.manager.a.b.a(this);
        this.t = com.tsf.shell.manager.b.e.ac();
        this.a = this.t ? com.tsf.shell.manager.b.e.ab() : 0;
        this.c = 80.0f * com.censivn.C3DEngine.b.b.a.c;
        this.s = new com.tsf.shell.f.h.a.c();
        this.d = new j();
        this.k = new e();
        this.k.b(0.0f);
        this.l = new b.a() { // from class: com.tsf.shell.f.h.b.1
            @Override // com.tsf.shell.manager.f.b.a
            public void a() {
                if (b.this.s.e()) {
                    b.this.s.d();
                } else {
                    b.this.o();
                }
            }
        };
        this.e = new com.tsf.shell.f.e.c.a(128.0f, ThemeManager.mix.smartButton.getTheme().shell.smartButtonWindowsColor, (int) ((this.a / 100.0f) * 255.0f), x.a(b.d.bubble_icon), 1000, com.censivn.C3DEngine.b.b.a.c) { // from class: com.tsf.shell.f.h.b.2
            @Override // com.tsf.shell.f.e.c.a
            public void d() {
            }

            @Override // com.tsf.shell.f.e.c.a, com.censivn.C3DEngine.b.f.i
            public void onKillFocus() {
                if (!b.this.q) {
                }
            }

            @Override // com.censivn.C3DEngine.b.f.i
            public void onDrawStart() {
                if (getAnimationObjectState()) {
                    position().x += (b.this.o - position().x) * b.this.m;
                    position().y += (b.this.p - position().y) * b.this.m;
                    if (Math.abs(position().x - b.this.o) < 0.2f && Math.abs(position().y - b.this.p) < 0.2f && !b.this.n) {
                        position().x = b.this.o;
                        position().y = b.this.p;
                        setAnimationObjectState(false);
                    }
                }
            }
        };
        r();
        this.g = this.e.c();
        this.g.mouseEnabled(this.t);
        this.f = new c(this);
        this.e.a(this.f);
        this.g.setMouseEventListener(new d(this, this.g) { // from class: com.tsf.shell.f.h.b.3
            @Override // com.tsf.shell.f.h.d, com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent) {
                super.a(motionEvent);
                if (!b.this.e.getAnimationObjectState()) {
                    b.this.n();
                }
            }

            @Override // com.tsf.shell.f.h.d, com.censivn.C3DEngine.b.d.a
            public void e(MotionEvent motionEvent) {
                if (!b.this.i) {
                    super.e(motionEvent);
                    b.this.l();
                }
            }

            @Override // com.tsf.shell.f.h.d, com.censivn.C3DEngine.b.d.a
            public void f(MotionEvent motionEvent) {
                super.f(motionEvent);
                b.this.m();
            }

            @Override // com.tsf.shell.f.h.d, com.censivn.C3DEngine.b.d.a
            public void c(MotionEvent motionEvent) {
                super.c(motionEvent);
                b.this.m();
            }
        });
        this.d.addChild(this.e);
        jVar.addChild(this.d);
        this.r = new a();
        this.d.addChild(this.r);
    }

    private void r() {
        Number3d w = com.censivn.C3DEngine.b.b.a.O ? com.tsf.shell.manager.b.e.w() : com.tsf.shell.manager.b.e.x();
        if (w.x == 0.0f && w.y == 0.0f) {
            w.x = com.censivn.C3DEngine.b.b.a.z + (70.0f * com.censivn.C3DEngine.b.b.a.c);
            w.y = com.censivn.C3DEngine.b.b.a.C + (300.0f * com.censivn.C3DEngine.b.b.a.c);
        }
        a(w.x, w.y, false);
    }

    public void h() {
        this.e.b(ThemeManager.mix.smartButton.getTheme().shell.smartButtonWindowsColor);
        c().e();
    }

    public void i() {
        if (!this.h && !this.e.getAnimationObjectState()) {
            this.h = true;
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.h.b.4
                @Override // com.censivn.C3DEngine.b.g.d
                public void a() {
                    b.this.d.mouseEnabled(true);
                }
            };
            dVar.a(255);
            com.censivn.C3DEngine.b.g.c.a(this.d);
            com.censivn.C3DEngine.b.g.c.a(this.d, 250, dVar);
        }
    }

    public void a(float f) {
        this.q = true;
        float a = this.f.a(f);
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
        dVar.h(a);
        com.censivn.C3DEngine.b.g.c.a(this.d);
        com.censivn.C3DEngine.b.g.c.a(this.d, 500, dVar);
        this.s.f();
    }

    public void j() {
        this.q = false;
        this.f.a();
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
        dVar.h(0.0f);
        com.censivn.C3DEngine.b.g.c.a(this.d);
        com.censivn.C3DEngine.b.g.c.a(this.d, 500, dVar);
        this.g.setFocus();
        this.s.g();
        com.tsf.shell.manager.a.n.i();
    }

    public void k() {
        if (this.h && !this.i) {
            this.h = false;
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
            dVar.a(0);
            com.censivn.C3DEngine.b.g.c.a(this.d);
            com.censivn.C3DEngine.b.g.c.a(this.d, 250, dVar);
            this.d.mouseEnabled(false);
        }
    }

    public void l() {
        if (!this.j) {
            this.j = true;
            this.k.position().setAllFrom(this.e.position());
            this.k.removeFromParent();
            com.tsf.shell.manager.a.j.a(this.k);
            this.k.a(60.0f);
            float f = this.e.position().x;
            float f2 = this.e.position().y;
            double atan = (Math.atan(f / f2) * 180.0d) / 3.141592653589793d;
            if (f2 > 0.0f) {
                atan += 180.0d;
            }
            this.k.rotation().z = (float) (-atan);
        }
    }

    public void m() {
        if (this.j) {
            this.j = false;
            this.k.a(0.0f, new Runnable() { // from class: com.tsf.shell.f.h.b.5
                @Override // java.lang.Runnable
                public void run() {
                    b.this.k.removeFromParent();
                }
            });
        }
    }

    public void n() {
        if (!com.censivn.C3DEngine.a.e.l()) {
            com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.f.h.b.6
                @Override // java.lang.Runnable
                public void run() {
                    b.this.n();
                }
            });
        } else if (com.tsf.shell.f.e.g.d.mCurrentMenu == null && this.h && !this.i && com.tsf.shell.manager.a.h.B() && !com.tsf.shell.manager.a.h.s().a() && !com.tsf.shell.manager.a.v.e.e()) {
            com.tsf.shell.f.b.a();
            this.e.a(0.0f, 0.0f, this.f.c(), this.f.d(), 204, !this.t);
            com.censivn.C3DEngine.b.c.b.a(this);
            this.i = true;
            this.f.mouseEnabled(true);
            this.f.b();
            com.tsf.shell.manager.a.e.a(this.l);
            this.s.j();
            com.tsf.shell.manager.a.n.i();
        }
    }

    protected void o() {
        if (this.i && !this.q) {
            this.e.a(this.o, this.p, null, !this.t);
            com.censivn.C3DEngine.b.c.b.b(this);
            this.i = false;
            this.f.setAnimationObjectState(false);
            this.f.mouseEnabled(false);
            com.tsf.shell.manager.a.e.e();
            com.tsf.shell.manager.a.n.j();
            this.s.k();
        }
    }

    public void p() {
        if (!this.i) {
            this.m = 0.4f;
            this.n = true;
            this.o = this.e.position().x;
            this.p = this.e.position().y;
            this.e.setAnimationObjectState(true);
            this.e.invalidate();
        }
    }

    public void a(float f, float f2) {
        if (this.n) {
            this.o = f;
            this.p = f2;
            float f3 = this.c / 2.0f;
            if (this.o > com.censivn.C3DEngine.b.b.a.A - f3) {
                this.o = com.censivn.C3DEngine.b.b.a.A - f3;
            } else if (this.o < com.censivn.C3DEngine.b.b.a.z + f3) {
                this.o = com.censivn.C3DEngine.b.b.a.z + f3;
            }
            if (this.p > com.censivn.C3DEngine.b.b.a.B - f3) {
                this.p = com.censivn.C3DEngine.b.b.a.B - f3;
            } else if (this.p < com.censivn.C3DEngine.b.b.a.C + f3) {
                this.p = f3 + com.censivn.C3DEngine.b.b.a.C;
            }
        }
    }

    public void q() {
        if (this.n) {
            this.n = false;
            this.m = 0.2f;
            a(false);
            if (com.censivn.C3DEngine.b.b.a.O) {
                com.tsf.shell.manager.b.e.c(this.o, this.p);
            } else {
                com.tsf.shell.manager.b.e.d(this.o, this.p);
            }
        }
    }

    private void a(boolean z) {
        float f = this.c / 2.0f;
        if (this.o > com.censivn.C3DEngine.b.b.a.A - f) {
            this.o = com.censivn.C3DEngine.b.b.a.A - f;
        } else if (this.o < com.censivn.C3DEngine.b.b.a.z + f) {
            this.o = com.censivn.C3DEngine.b.b.a.z + f;
        }
        if (this.p > com.censivn.C3DEngine.b.b.a.B - f) {
            this.p = com.censivn.C3DEngine.b.b.a.B - f;
        } else if (this.p < com.censivn.C3DEngine.b.b.a.C + f) {
            this.p = f + com.censivn.C3DEngine.b.b.a.C;
        }
        float abs = Math.abs(this.o - com.censivn.C3DEngine.b.b.a.z);
        float abs2 = Math.abs(com.censivn.C3DEngine.b.b.a.A - this.o);
        float abs3 = Math.abs(com.censivn.C3DEngine.b.b.a.B - this.p);
        float abs4 = Math.abs(this.p - com.censivn.C3DEngine.b.b.a.C);
        if (abs < abs2 && abs < abs3 && abs < abs4) {
            this.o = com.censivn.C3DEngine.b.b.a.z + this.c;
        } else if (abs2 < abs && abs2 < abs3 && abs2 < abs4) {
            this.o = com.censivn.C3DEngine.b.b.a.A - this.c;
        } else if (abs3 < abs && abs3 < abs2 && abs3 < abs4) {
            this.p = com.censivn.C3DEngine.b.b.a.B - this.c;
        } else {
            this.p = com.censivn.C3DEngine.b.b.a.C + this.c;
        }
    }

    @Override // com.censivn.C3DEngine.b.c.b.a
    public void a(int i, KeyEvent keyEvent) {
        if (i == 4) {
            o();
        }
    }

    @Override // com.censivn.C3DEngine.b.c.b.a
    public void b(int i, KeyEvent keyEvent) {
    }

    @Override // com.censivn.C3DEngine.b.c.e.a
    public void a(int i, int i2, int i3, int i4) {
        r();
        this.s.l();
    }

    private void a(float f, float f2, boolean z) {
        this.o = f;
        this.p = f2;
        a(z);
        if (!this.i) {
            this.e.position().setAll(this.o, this.p, 0.0f);
        }
    }
}
