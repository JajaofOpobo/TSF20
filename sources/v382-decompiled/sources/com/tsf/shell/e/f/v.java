package com.tsf.shell.e.f;

import android.view.KeyEvent;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.tween.VEasing;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes.dex */
public class v implements com.censivn.C3DEngine.b.c.d {
    private com.censivn.C3DEngine.b.f.l A;
    private com.censivn.C3DEngine.b.f.l B;
    private double C;
    private float D;
    private w E;
    private com.censivn.C3DEngine.b.d.a F;
    private com.censivn.C3DEngine.b.g.b.b G;
    private com.censivn.C3DEngine.b.g.x H;
    private g I;
    private float J;
    private float K;
    private g L;
    private Runnable M;
    p c;
    final /* synthetic */ r e;
    private float f;
    private float g;
    private float n;
    private float o;
    private float p;
    private float v;
    private boolean h = false;
    private boolean i = true;
    private boolean j = false;
    private boolean k = true;
    private boolean l = false;
    private boolean m = false;
    private float q = 0.0f;
    private float r = 0.0f;
    private float s = 0.0f;
    private float t = 0.0f;
    private float u = 0.0f;
    private boolean w = true;
    private float x = 0.03f;
    private boolean y = false;
    private boolean z = false;
    public float a = 0.125f;
    public float b = 0.3f;
    boolean d = false;
    private boolean N = true;

    public void a(float f) {
        this.r = f;
    }

    public void b(float f) {
        this.q = f;
    }

    public boolean a() {
        return !this.k;
    }

    public boolean b() {
        return this.j;
    }

    public void a(int i, int i2, int i3, int i4) {
        if (this.B != null) {
            this.B.setAABBPX(com.censivn.C3DEngine.b.b.a.z, com.censivn.C3DEngine.b.b.a.C, 0.0f, com.censivn.C3DEngine.b.b.a.A, com.censivn.C3DEngine.b.b.a.B, 0.0f);
        }
        this.n = m();
        if (!this.w) {
            this.o = -this.n;
            this.p = -((int) (this.n * 3.5f));
            int i5 = 0;
            while (true) {
                int i6 = i5;
                if (i6 < this.e.n) {
                    g gVar = (g) this.e.k.get(i6);
                    gVar.position().z = (float) (Math.cos(i6 * this.C) * this.n);
                    gVar.position().x = (float) (Math.sin(i6 * this.C) * this.n);
                    gVar.rotation().y = this.D * i6;
                    i5 = i6 + 1;
                } else {
                    this.u = this.A.rotation().y;
                    this.v = this.A.position().z;
                    this.s = (this.o + this.p) / 3.0f;
                    this.A.position().z = this.s;
                    return;
                }
            }
        }
    }

    public v(r rVar) {
        this.e = rVar;
        com.censivn.C3DEngine.a.h.d().c().a(this);
        this.G = new com.censivn.C3DEngine.b.g.b.b();
        this.E = new w(this);
        i();
    }

    private void i() {
        this.o = -this.n;
        this.p = -((int) (this.n * 3.5f));
        this.B = new com.censivn.C3DEngine.b.f.l();
        this.A = new com.censivn.C3DEngine.b.f.l() { // from class: com.tsf.shell.e.f.v.1
            @Override // com.censivn.C3DEngine.b.f.l
            public void onDrawChildStart() {
                boolean z;
                Iterator it = v.this.A.children().iterator();
                while (it.hasNext()) {
                    com.censivn.C3DEngine.b.f.j jVar = (com.censivn.C3DEngine.b.f.j) it.next();
                    g gVar = (g) jVar;
                    float a = com.tsf.shell.utils.x.a(jVar.rotation().y + rotation().y);
                    if (a <= 90.0f || a >= 270.0f) {
                        z = true;
                    } else {
                        z = false;
                    }
                    gVar.b(z);
                }
            }

            @Override // com.censivn.C3DEngine.b.f.j
            public void onDrawEnd() {
                if (!v.this.w && !v.this.z) {
                    Collections.sort(children(), v.this.E);
                    position().z += (v.this.s - position().z) * 0.2f;
                    float abs = v.this.y ? 255.0f : Math.abs((position().z - v.this.o) / (v.this.p - v.this.o)) * 255.0f;
                    int i = 0;
                    while (true) {
                        int i2 = i;
                        if (i2 >= v.this.e.n) {
                            break;
                        }
                        ((g) v.this.e.k.get(i2)).a(abs);
                        i = i2 + 1;
                    }
                    if (v.this.I == null) {
                        if (v.this.y) {
                            rotation().y += (v.this.q - rotation().y) * 0.3f;
                            rotation().x += (v.this.r - rotation().x) * 0.3f;
                            return;
                        }
                        rotation().y += (v.this.q - rotation().y) * v.this.x;
                        rotation().x += (v.this.r - rotation().x) * v.this.x;
                        if (Math.abs(v.this.q - rotation().y) <= 0.1f && Math.abs(v.this.r - rotation().x) <= 0.1f) {
                            rotation().y = v.this.q;
                            rotation().x = v.this.r;
                            v.this.w = true;
                            position().z = v.this.o;
                            v.this.k();
                            return;
                        }
                        float f = (v.this.A.rotation().y - v.this.u) / v.this.t;
                        float abs2 = 1.0f - (Math.abs(f - 0.5f) * 2.0f);
                        if (f < 0.5d) {
                            v.this.s = (abs2 * (v.this.p - v.this.v)) + v.this.v;
                        } else {
                            v.this.s = (abs2 * (v.this.p - v.this.o)) + v.this.o;
                        }
                        if (f > 0.9d) {
                            v.this.x += 0.008f;
                        }
                        if (f > 0.9d) {
                            float f2 = (1.0f - f) * 10.0f;
                            int i3 = 0;
                            while (true) {
                                int i4 = i3;
                                if (i4 < v.this.e.n) {
                                    g gVar = (g) v.this.e.k.get(i4);
                                    if (gVar != v.this.e.m) {
                                        gVar.J().alpha((int) (255.0f * f2));
                                    }
                                    i3 = i4 + 1;
                                } else {
                                    return;
                                }
                            }
                        }
                    } else {
                        rotation().y += (v.this.q - rotation().y) * 0.2f;
                        rotation().x += (v.this.r - rotation().x) * 0.2f;
                        if (Math.abs(v.this.q - rotation().y) <= 10.0f) {
                            v.this.I = null;
                            v.this.B.mouseEnabled(true);
                            v.this.F.f(null);
                        }
                    }
                }
            }
        };
        this.A.renderChildren(false);
        this.A.position().z = this.o;
        this.B.setAABBPX(com.censivn.C3DEngine.b.b.a.z, com.censivn.C3DEngine.b.b.a.C, 0.0f, com.censivn.C3DEngine.b.b.a.A, com.censivn.C3DEngine.b.b.a.B, 0.0f);
        com.censivn.C3DEngine.b.d.a aVar = new com.censivn.C3DEngine.b.d.a(this.B) { // from class: com.tsf.shell.e.f.v.3
            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent, MotionEvent motionEvent2) {
                v.this.q = v.this.J + (((motionEvent2.getX() - motionEvent.getX()) / com.censivn.C3DEngine.b.b.a.F) * 360.0f * 1.2f);
                float y = ((motionEvent2.getY() - motionEvent.getY()) / com.censivn.C3DEngine.b.b.a.G) * 180.0f;
                v.this.r = v.this.K + y;
                if (v.this.r > 45.0f) {
                    v.this.r = 45.0f;
                    v.this.K = v.this.r - y;
                } else if (v.this.r < -45.0f) {
                    v.this.r = -45.0f;
                    v.this.K = v.this.r - y;
                }
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void e(MotionEvent motionEvent) {
                v.this.x = 0.03f;
                com.censivn.C3DEngine.b.g.w.a(v.this.A);
                v.this.h = false;
                v.this.y = true;
                v.this.z = false;
                v vVar = v.this;
                v vVar2 = v.this;
                float f = v.this.A.rotation().y;
                vVar2.q = f;
                vVar.J = f;
                v vVar3 = v.this;
                v vVar4 = v.this;
                float f2 = v.this.A.rotation().x;
                vVar4.r = f2;
                vVar3.K = f2;
                v.this.s = (v.this.o + v.this.p) / 3.0f;
                v.this.j();
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void f(MotionEvent motionEvent) {
                v.this.a((g) null);
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                v.this.h = true;
                v.this.q = ((((int) (v.this.A.rotation().y + (f / 4.0f))) / 360) * 360) + v.this.l();
                v.this.u = v.this.A.rotation().y;
                v.this.v = v.this.A.position().z;
                v.this.t = v.this.q - v.this.A.rotation().y;
                v.this.j();
            }
        };
        this.F = aVar;
        this.B.setMouseEventListener(aVar);
        this.B.addChild(this.A);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.e.n) {
                g gVar = (g) this.e.k.get(i2);
                if (gVar != this.e.m) {
                    gVar.J().alpha(255.0f);
                }
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    @Override // com.censivn.C3DEngine.b.c.d
    public void a(int i, KeyEvent keyEvent) {
        if (i == 4 && !this.z && this.A.numChildren() > 0) {
            this.F.f(null);
        }
    }

    @Override // com.censivn.C3DEngine.b.c.d
    public void b(int i, KeyEvent keyEvent) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        this.B.removeFromParent();
        for (int i = 0; i < this.e.n; i++) {
            g gVar = (g) this.e.k.get(i);
            gVar.f(false);
            gVar.position().z = 0.0f;
            gVar.position().x = 0.0f;
            gVar.rotation().y = 0.0f;
            gVar.e(false);
            gVar.removeFromParent();
            gVar.J().alpha(255.0f);
        }
        this.e.m.H();
        this.e.m.M();
        this.e.i.addChild(this.e.m);
        com.tsf.shell.manager.a.c.a(this.e.I, true);
        com.tsf.shell.manager.a.c.b(this.e.I);
        com.censivn.C3DEngine.b.c.c.b(this);
        a(false);
        this.e.al();
    }

    public float a(int i) {
        return (-i) * this.D;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float l() {
        return a(this.e.m.r());
    }

    private float m() {
        return ((float) (((com.censivn.C3DEngine.b.b.a.F * 0.9f) / 2.0f) / Math.sin((((360 / this.e.n) / 2) * 3.141592653589793d) / 180.0d))) + (200.0f * com.censivn.C3DEngine.b.b.a.b);
    }

    public void c(float f) {
        this.x = 0.03f;
        com.censivn.C3DEngine.b.c.c.a(this);
        this.n = m();
        this.o = -this.n;
        this.p = -((int) (this.n * 3.5f));
        this.C = 6.283185307179586d / this.e.n;
        this.D = 360.0f / this.e.n;
        if (this.w) {
            this.e.ak();
            com.tsf.shell.manager.a.c.a(this.e.I);
            com.tsf.shell.manager.a.c.c(this.e.I);
            this.w = false;
            for (int i = 0; i < this.e.n; i++) {
                g gVar = (g) this.e.k.get(i);
                if (gVar != this.e.m) {
                    gVar.O();
                }
                gVar.f(false);
                gVar.L();
                gVar.H();
                gVar.z();
                gVar.e(true);
                gVar.position().z = (float) (Math.cos(i * this.C) * this.n);
                gVar.position().x = (float) (Math.sin(i * this.C) * this.n);
                gVar.rotation().y = this.D * i;
                gVar.J().scale().setAll(1.0f, 1.0f, 1.0f);
                this.A.addChild(gVar);
            }
            Number3d rotation = this.A.rotation();
            float l = l();
            rotation.y = l;
            this.q = l;
            this.B.removeFromParent();
            this.e.h.addChild(this.B);
        }
        this.u = this.A.rotation().y;
        this.v = this.A.position().z;
        j();
    }

    public void c() {
        boolean z;
        if (this.c != null && !this.c.a()) {
            com.tsf.shell.manager.a.v.c.b.a(true);
            com.tsf.shell.manager.a.v.c.b.a(this.e.m);
        } else {
            com.tsf.shell.manager.a.v.c.b.a(false);
        }
        if (!this.k) {
            if (this.L != null) {
                if (this.g < 0.0f) {
                    this.c.b(this.e.m.g, this.g);
                    this.e.m.a(this.e.m, this.g, true, false, this.c);
                    z = false;
                } else {
                    this.c.b(this.e.m.g, this.g);
                    this.e.m.a(this.e.m, this.g, false, true, this.c);
                    z = false;
                }
            } else if (this.j) {
                float f = this.e.m.g + ((this.g - this.e.m.g) * 0.25f);
                this.c.b(this.e.m.g, f);
                if (f < 0.0f) {
                    this.e.m.a(this.e.m, f, true, false, this.c);
                    z = false;
                } else {
                    this.e.m.a(this.e.m, f, false, true, this.c);
                    z = false;
                }
            } else if (!this.c.b() || Math.abs(this.e.m.g - this.g) >= 0.001d) {
                float f2 = this.e.m.g + ((this.g - this.e.m.g) * this.b);
                this.c.b(this.e.m.g, f2);
                if (f2 < 0.0f) {
                    this.e.m.a(this.e.m, f2, true, false, this.c);
                    z = false;
                } else {
                    this.e.m.a(this.e.m, f2, false, true, this.c);
                    z = false;
                }
            } else {
                this.c.b(this.e.m.g, this.g);
                this.e.m.a(this.e.m, this.g, true, false, this.c);
                z = true;
            }
            if (this.L == null && !z) {
                this.e.a(false, "onDrawFrame");
            }
            this.e.i.a();
            Iterator it = this.e.i.children().iterator();
            while (it.hasNext()) {
                g gVar = (g) ((com.censivn.C3DEngine.b.f.j) it.next());
                gVar.i();
                gVar.af();
            }
            if (z) {
                a(true);
            }
        }
    }

    public void d() {
        a((p) null);
    }

    public void a(p pVar) {
        if (this.i) {
            if (pVar == null) {
                pVar = (p) com.tsf.shell.manager.a.v.a.a.h();
            }
            this.c = pVar;
            this.c.d();
            com.tsf.shell.manager.a.v.a.a.a(this.c);
            this.h = false;
            this.i = false;
            this.f = this.e.m.g;
            this.e.h.setAnimationObjectState(true);
            this.e.h.invalidate();
            if (this.k) {
                this.k = false;
                this.e.ag();
                this.e.m.V();
            }
            this.e.i.position().x = 0.0f;
            com.tsf.shell.manager.a.n.i();
        }
    }

    public void a(g gVar) {
        this.y = false;
        this.r = 0.0f;
        if (!this.h) {
            if (gVar == null) {
                if (this.A.numChildren() != 0) {
                    this.e.a((g) this.A.getChildAt(this.A.numChildren() - 1), false, true);
                }
            } else {
                this.e.a(gVar, false, true);
            }
            this.e.m.g = 0.0f;
            this.e.v.a(this.e.m);
            this.e.a(true, "RotationUp");
            float l = (((int) (this.A.rotation().y / 360.0f)) * 360) + 360 + l();
            float l2 = (((int) (this.A.rotation().y / 360.0f)) * 360) + l();
            float l3 = ((((int) (this.A.rotation().y / 360.0f)) * 360) - 360) + l();
            float abs = Math.abs(l - this.A.rotation().y);
            float abs2 = Math.abs(l2 - this.A.rotation().y);
            float abs3 = Math.abs(l3 - this.A.rotation().y);
            if (abs < abs2 && abs < abs3) {
                this.q = l;
            } else if (abs2 < abs && abs2 < abs3) {
                this.q = l2;
            } else {
                this.q = l3;
            }
            this.u = this.A.rotation().y;
            this.v = this.A.position().z;
            this.t = this.q - this.A.rotation().y;
            this.z = true;
            for (int i = 0; i < this.e.n; i++) {
                ((g) this.e.k.get(i)).A();
            }
            com.censivn.C3DEngine.b.g.x xVar = new com.censivn.C3DEngine.b.g.x() { // from class: com.tsf.shell.e.f.v.4
                @Override // com.censivn.C3DEngine.b.g.x
                public void a(float f) {
                    int i2 = 0;
                    while (true) {
                        int i3 = i2;
                        if (i3 < v.this.e.n) {
                            g gVar2 = (g) v.this.e.k.get(i3);
                            if (gVar2 != v.this.e.m) {
                                gVar2.J().alpha((int) (255.0f - (255.0f * f)));
                            }
                            gVar2.a(gVar2.B() * (1.0f - f));
                            i2 = i3 + 1;
                        } else {
                            return;
                        }
                    }
                }

                @Override // com.censivn.C3DEngine.b.g.x
                public void a() {
                    v.this.w = true;
                    v.this.z = false;
                    v.this.k();
                }
            };
            xVar.c(0.0f);
            xVar.d(this.q);
            xVar.j(this.o);
            com.censivn.C3DEngine.b.g.w.a(this.A);
            com.censivn.C3DEngine.b.g.w.a(this.A, 500, xVar);
        }
    }

    public void a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (!this.i && this.l) {
            this.h = true;
            if (Math.abs(f) > 300.0f) {
                if (f < 0.0f) {
                    o();
                } else {
                    p();
                }
            }
        }
    }

    public boolean e() {
        if (!this.i) {
            return false;
        }
        d();
        this.k = true;
        c(0.0f);
        this.F.e(null);
        this.r = 30.0f;
        this.K = 30.0f;
        return true;
    }

    public void a(MotionEvent motionEvent, MotionEvent motionEvent2) {
        this.F.a(motionEvent, motionEvent2);
    }

    public void a(MotionEvent motionEvent) {
        this.F.f(motionEvent);
    }

    public void b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.F.b(motionEvent, motionEvent2, f, f2);
    }

    public boolean f() {
        return this.m;
    }

    public boolean g() {
        return this.l;
    }

    public void b(MotionEvent motionEvent) {
    }

    public void c(MotionEvent motionEvent) {
        if (!this.m) {
            this.m = true;
            this.l = false;
        }
    }

    public void c(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (!this.m) {
            this.b = this.a;
            int abs = (int) Math.abs(motionEvent2.getX() - motionEvent.getX());
            int abs2 = (int) Math.abs(motionEvent2.getY() - motionEvent.getY());
            if ((abs * abs) + (abs2 * abs2) > com.censivn.C3DEngine.a.b.b / 2.0f) {
                if (abs > abs2) {
                    this.l = true;
                } else {
                    this.l = false;
                }
                this.m = true;
            }
        }
        if (this.m && this.l) {
            if (this.i) {
                com.tsf.shell.e.e.g.e.onTempleteHide();
                com.censivn.C3DEngine.a.a().b(new Runnable() { // from class: com.tsf.shell.e.f.v.5
                    @Override // java.lang.Runnable
                    public void run() {
                        v.this.d();
                    }
                });
            }
            this.g = this.f + (((motionEvent.getX() - motionEvent2.getX()) / com.censivn.C3DEngine.b.b.a.F) * (this.e.n - 1) * 1.7f);
            this.j = true;
        }
    }

    public void d(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (!this.m) {
            this.b = this.a;
            int abs = (int) Math.abs(motionEvent2.getX() - motionEvent.getX());
            int abs2 = (int) Math.abs(motionEvent2.getY() - motionEvent.getY());
            if ((abs * abs) + (abs2 * abs2) > com.censivn.C3DEngine.a.b.b) {
                if (abs > abs2) {
                    this.l = true;
                } else {
                    this.l = false;
                }
                this.m = true;
            }
        }
        if (this.m && this.l) {
            if (this.i) {
                com.tsf.shell.e.e.g.e.onTempleteHide();
                com.censivn.C3DEngine.a.a().b(new Runnable() { // from class: com.tsf.shell.e.f.v.6
                    @Override // java.lang.Runnable
                    public void run() {
                        v.this.d();
                    }
                });
            }
            this.g = this.f + ((motionEvent2.getX() - motionEvent.getX()) / com.censivn.C3DEngine.b.b.a.F);
            if (this.e.m.ah() == null && this.g < 0.0f) {
                this.g = com.tsf.shell.e.e.d.a(this.g);
            }
            if (this.e.m.ag() == null && this.g > 0.0f) {
                this.g = com.tsf.shell.e.e.d.a(this.g);
            }
            this.j = true;
        }
    }

    public void d(MotionEvent motionEvent) {
        if (this.m) {
            com.tsf.shell.e.e.g.e.onTempleteShow();
            this.m = false;
            this.i = true;
            this.j = false;
            this.g = 0.0f;
            if (!this.h && this.L == null && !this.k) {
                g n = n();
                if (n != null && n != this.e.m) {
                    this.e.a(n, false, true);
                    return;
                }
                return;
            }
            this.h = false;
        }
    }

    private g n() {
        float f;
        g gVar;
        g gVar2 = null;
        float f2 = Float.MAX_VALUE;
        int i = 1;
        while (i < this.e.n) {
            g gVar3 = (g) this.e.k.get(i);
            float abs = Math.abs(gVar3.g);
            if (abs < f2) {
                gVar = gVar3;
                f = abs;
            } else {
                f = f2;
                gVar = gVar2;
            }
            i++;
            gVar2 = gVar;
            f2 = f;
        }
        return gVar2;
    }

    private void a(boolean z) {
        this.i = true;
        this.k = true;
        this.d = false;
        this.e.h.setAnimationObjectState(false);
        if (z) {
            this.e.m.a(this.c);
        }
        this.e.I();
        com.tsf.shell.manager.b.g.m(this.e.m.t());
        this.e.m.W();
        g gVar = this.e.m;
        this.f = 0.0f;
        gVar.g = 0.0f;
        if (this.c != null) {
            this.c.c();
        }
        this.e.ae();
        this.e.g();
        com.tsf.shell.manager.a.v.a.a();
        i.a(false);
        com.tsf.shell.manager.a.n.j();
    }

    private void a(g gVar, Runnable runnable) {
        a(gVar, runnable, (p) null);
    }

    private void a(g gVar, Runnable runnable, p pVar) {
        i.a(true);
        com.censivn.C3DEngine.a.h.d().c().a(false);
        this.L = gVar;
        this.e.a(this.L, true, "hdieSelect");
        if (this.M != null) {
            this.M.run();
        }
        this.M = runnable;
        this.e.v.a(gVar);
        a(pVar);
        this.k = false;
        this.j = true;
        this.m = true;
    }

    private void a(final g gVar, int i, Runnable runnable, final boolean z, final p pVar) {
        if (this.d || gVar == null || this.L == gVar || gVar == this.e.m || !this.k) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        this.d = true;
        this.e.b(this.e.m);
        this.e.e(gVar);
        this.e.G.a(gVar);
        a(gVar, runnable, pVar);
        final g gVar2 = this.e.m;
        final g ag = gVar2.ag();
        final g ah = gVar2.ah();
        final g ag2 = gVar.ag();
        final g ah2 = gVar.ah();
        pVar.b(gVar2, true);
        pVar.a(gVar, true);
        if (z) {
            gVar.b(gVar2);
            gVar.a((g) null);
            gVar2.a(gVar);
            gVar2.b((g) null);
        } else {
            gVar.b((g) null);
            gVar.a(gVar2);
            gVar2.a((g) null);
            gVar2.b(gVar);
        }
        final float f = z ? 1 : -1;
        this.H = new com.censivn.C3DEngine.b.g.x() { // from class: com.tsf.shell.e.f.v.7
            @Override // com.censivn.C3DEngine.b.g.x
            public void a() {
                pVar.a(gVar2, false);
                v.this.j = false;
                v.this.m = false;
                v.this.g = 0.0f;
                gVar2.a(gVar2, z ? 1 : -1, false, false, v.this.c);
                gVar2.a(ag);
                gVar2.b(ah);
                gVar.a(ag2);
                gVar.b(ah2);
                v.this.e.a(gVar, false, true);
                com.censivn.C3DEngine.a.h.d().c().a(true);
                v.this.L = null;
                if (v.this.M == null) {
                    return;
                }
                com.censivn.C3DEngine.a.a().c(v.this.M);
                v.this.M = null;
            }

            @Override // com.censivn.C3DEngine.b.g.x
            public void a(float f2) {
                v.this.g = f * f2;
            }
        };
        com.censivn.C3DEngine.b.g.w.a(this.G);
        com.censivn.C3DEngine.b.g.w.a(this.G, i, this.H);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final g gVar, Runnable runnable) {
        if (!this.d && this.L != gVar && gVar != this.e.m) {
            this.e.G.a(gVar);
            this.e.e(gVar);
            this.e.b(this.e.m);
            a(gVar, runnable);
            int r = gVar.r() - this.e.m.r();
            final float f = this.e.m.g;
            final float f2 = -r;
            this.H = new com.censivn.C3DEngine.b.g.x() { // from class: com.tsf.shell.e.f.v.8
                @Override // com.censivn.C3DEngine.b.g.x
                public void a() {
                    v.this.j = false;
                    v.this.m = false;
                    v.this.g = 0.0f;
                    v.this.e.a(gVar, false, true);
                    com.censivn.C3DEngine.a.h.d().c().a(true);
                    v.this.L = null;
                    if (v.this.M != null) {
                        com.censivn.C3DEngine.a.a().c(v.this.M);
                        v.this.M = null;
                    }
                }

                @Override // com.censivn.C3DEngine.b.g.x
                public void a(float f3) {
                    if (f3 > 0.5d) {
                        v.this.j = false;
                    }
                    v.this.g = f + ((f2 - f) * f3);
                }
            };
            com.censivn.C3DEngine.b.g.w.a(this.G);
            int abs = Math.abs(r * 150);
            com.censivn.C3DEngine.b.g.w.a(this.G, abs >= 500 ? abs : 500, this.H);
            return;
        }
        runnable.run();
    }

    public void b(int i) {
        a(i, (Runnable) null);
    }

    public void a(int i, final Runnable runnable) {
        if (this.N) {
            this.N = false;
            final float f = this.e.m.g;
            com.censivn.C3DEngine.b.g.x xVar = new com.censivn.C3DEngine.b.g.x() { // from class: com.tsf.shell.e.f.v.9
                @Override // com.censivn.C3DEngine.b.g.x
                public void a() {
                    v.this.j = false;
                    v.this.m = false;
                    v.this.g = 0.0f;
                    if (runnable != null) {
                        runnable.run();
                    }
                }

                @Override // com.censivn.C3DEngine.b.g.x
                public void a(float f2) {
                    v.this.g = f + ((0.0f - f) * f2);
                }
            };
            com.censivn.C3DEngine.b.g.w.a(this.G);
            com.censivn.C3DEngine.b.g.w.a(this.G, i, xVar);
        }
    }

    public void h() {
        c(VEasing.Linear.easeNone);
    }

    public void c(final int i) {
        if (com.censivn.C3DEngine.a.i.l()) {
            if (this.e.t().aJ() && this.k) {
                g n = this.e.n();
                if (n.t() == -1) {
                    ((com.tsf.shell.e.f.a.m) n).aB();
                    g k = this.e.k();
                    if (k == null || k.t() == -1) {
                        k = this.e.o();
                    }
                    a(k, i, null, false, (p) com.tsf.shell.manager.a.v.a.b.h());
                    com.tsf.shell.manager.a.c.a(this.e.I, false);
                    return;
                }
                a(this.e.t(), i, null, true, (p) com.tsf.shell.manager.a.v.a.b.h());
                com.tsf.shell.manager.a.c.a(this.e.I);
                return;
            }
            return;
        }
        com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.e.f.v.10
            @Override // java.lang.Runnable
            public void run() {
                v.this.c(i);
            }
        });
    }

    public void d(int i) {
        c(i);
    }

    public void a(int i, final int i2) {
        this.N = true;
        final boolean z = this.e.m.ah() != null;
        d();
        final float f = this.e.m.g;
        com.censivn.C3DEngine.b.g.x xVar = new com.censivn.C3DEngine.b.g.x() { // from class: com.tsf.shell.e.f.v.2
            @Override // com.censivn.C3DEngine.b.g.x
            public void a() {
                v.this.b(i2);
            }

            @Override // com.censivn.C3DEngine.b.g.x
            public void a(float f2) {
                if (z) {
                    v.this.g = f - ((f + 1.0f) * f2);
                } else {
                    v.this.g = f - ((f - 1.0f) * f2);
                }
            }
        };
        com.censivn.C3DEngine.b.g.w.a(this.G);
        com.censivn.C3DEngine.b.g.w.a(this.G, i, xVar);
        this.k = false;
        this.j = true;
        this.m = true;
    }

    private void o() {
        if (this.e.m.ah() != null) {
            this.e.m.a(this.e.m, this.e.m.g, true, false, this.c);
            this.e.a(this.e.m.ah(), false, true);
            this.g = 0.0f;
        }
    }

    private void p() {
        if (this.e.m.ag() != null) {
            this.e.m.a(this.e.m, this.e.m.g, false, true, this.c);
            this.e.a(this.e.m.ag(), false, true);
            this.g = 0.0f;
        }
    }
}
