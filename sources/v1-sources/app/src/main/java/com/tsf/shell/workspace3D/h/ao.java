package com.tsf.shell.workspace3D.h;

import android.view.KeyEvent;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Number3d;

/* loaded from: classes.dex */
public final class ao implements com.tsf.shell.at {
    private com.censivn.C3DEngine.b.v A;
    private double B;
    private float C;
    private az D;
    private boolean E;
    private boolean F;
    private com.censivn.C3DEngine.b.l G;
    private com.censivn.C3DEngine.g.b.b H;
    private com.censivn.C3DEngine.g.u I;
    private a K;
    private Runnable L;
    final /* synthetic */ l c;
    private float d;
    private float e;
    private au f;
    private float m;
    private float n;
    private float o;
    private float u;
    private com.censivn.C3DEngine.b.v z;
    private boolean g = false;
    private boolean h = true;
    private boolean i = false;
    private boolean j = true;
    private boolean k = false;
    private boolean l = false;
    private float p = 0.0f;
    private float q = 0.0f;
    private float r = 0.0f;
    private float s = 0.0f;
    private float t = 0.0f;
    private boolean v = true;
    private float w = 0.03f;
    private boolean x = false;
    private boolean y = false;
    public float a = 0.125f;
    public float b = 0.3f;
    private boolean J = false;

    public final boolean a() {
        return !this.j;
    }

    public final void b() {
        if (this.f != null) {
            this.f.i();
        }
        if (this.A != null) {
            this.A.b(com.censivn.C3DEngine.a.e, com.censivn.C3DEngine.a.h, 0.0f, com.censivn.C3DEngine.a.f, com.censivn.C3DEngine.a.g);
        }
        this.m = o();
        if (!this.v) {
            this.n = -this.m;
            this.o = -((int) (this.m * 3.5f));
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < this.c.l) {
                    a aVar = (a) this.c.i.get(i2);
                    aVar.L().z = (float) (Math.cos(i2 * this.B) * this.m);
                    aVar.L().x = (float) (Math.sin(i2 * this.B) * this.m);
                    aVar.M().y = this.C * i2;
                    i = i2 + 1;
                } else {
                    this.t = this.z.M().y;
                    this.u = this.z.L().z;
                    this.r = (this.n + this.o) / 3.0f;
                    this.z.L().z = this.r;
                    return;
                }
            }
        }
    }

    public ao(l lVar) {
        this.c = lVar;
        com.censivn.C3DEngine.b.m.d().c().a(this);
        this.H = new com.censivn.C3DEngine.g.b.b();
        this.f = new au(this);
        this.D = new az(this);
        this.n = -this.m;
        this.o = -((int) (this.m * 3.5f));
        this.A = new com.censivn.C3DEngine.b.v();
        this.z = new ap(this);
        this.z.g(false);
        this.z.L().z = this.n;
        this.A.b(com.censivn.C3DEngine.a.e, com.censivn.C3DEngine.a.h, 0.0f, com.censivn.C3DEngine.a.f, com.censivn.C3DEngine.a.g);
        aq aqVar = new aq(this, this.A);
        this.G = aqVar;
        this.A.a((com.censivn.C3DEngine.b.l) aqVar);
        this.A.d(this.z);
        this.E = com.tsf.shell.a.t.H();
        this.F = com.tsf.shell.a.t.I();
    }

    public final void a(boolean z) {
        this.E = z;
    }

    public final boolean c() {
        return this.E;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.c.l) {
                a aVar = (a) this.c.i.get(i2);
                if (aVar != this.c.k) {
                    aVar.aS().b(255.0f);
                }
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    @Override // com.tsf.shell.at
    public final void a(int i) {
        if (i == 4 && !this.y) {
            this.G.f(null);
        }
    }

    @Override // com.tsf.shell.at
    public final void a(int i, KeyEvent keyEvent) {
    }

    static /* synthetic */ void n(ao aoVar) {
        aoVar.A.Q();
        for (int i = 0; i < aoVar.c.l; i++) {
            a aVar = (a) aoVar.c.i.get(i);
            aVar.m(false);
            aVar.L().z = 0.0f;
            aVar.L().x = 0.0f;
            aVar.M().y = 0.0f;
            aVar.k(false);
            aVar.Q();
            aVar.aS().b(255.0f);
        }
        aoVar.c.k.aR();
        aoVar.c.k.aU();
        aoVar.c.g.d(aoVar.c.k);
        aoVar.c.t.a(aoVar.c.k);
        com.tsf.shell.workspace3D.bf.q().a(aoVar.c.k, true);
        com.tsf.shell.workspace3D.bf.i().g();
        com.tsf.shell.workspace3D.bf.s().E();
        com.tsf.shell.aq.b(aoVar);
        aoVar.b(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float n() {
        return (-this.c.k.p()) * this.C;
    }

    private float o() {
        return ((float) (((com.censivn.C3DEngine.a.l * 0.9f) / 2.0f) / Math.sin((((360 / this.c.l) / 2) * 3.141592653589793d) / 180.0d))) + (200.0f * com.censivn.C3DEngine.a.b);
    }

    public final void d() {
        if (!this.j) {
            if (this.i) {
                float f = this.c.k.D + ((this.e - this.c.k.D) * 0.25f);
                if (f < 0.0f) {
                    this.c.k.a(this.c.k, f, true, false);
                } else {
                    this.c.k.a(this.c.k, f, false, true);
                }
            } else if (Math.abs(this.c.k.D - this.e) >= 0.002d) {
                float f2 = this.c.k.D + ((this.e - this.c.k.D) * this.b);
                if (f2 < 0.0f) {
                    this.c.k.a(this.c.k, f2, true, false);
                } else {
                    this.c.k.a(this.c.k, f2, false, true);
                }
            } else {
                b(true);
            }
            com.tsf.shell.workspace3D.bf.q().a(this.c.k, true);
        }
    }

    public final void e() {
        if (this.h) {
            this.g = false;
            this.h = false;
            this.d = this.c.k.D;
            this.c.f.a_(true);
            com.censivn.C3DEngine.b.v unused = this.c.f;
            com.censivn.C3DEngine.b.v.u();
            if (this.j) {
                this.j = false;
                l lVar = this.c;
                com.tsf.shell.h.r.a(false);
                this.c.k.bb();
            }
            this.c.g.L().x = 0.0f;
        }
    }

    public final void a(float f) {
        if (this.k) {
            this.g = true;
            if (Math.abs(f) > 300.0f) {
                if (f < 0.0f) {
                    k();
                } else {
                    l();
                }
            }
        }
    }

    public final boolean f() {
        if (!this.h) {
            return false;
        }
        e();
        this.j = true;
        this.w = 0.03f;
        com.tsf.shell.aq.a(this);
        this.m = o();
        this.n = -this.m;
        this.o = -((int) (this.m * 3.5f));
        this.B = 6.283185307179586d / this.c.l;
        this.C = 360.0f / this.c.l;
        if (this.v) {
            com.tsf.shell.workspace3D.bf.s().D();
            com.tsf.shell.workspace3D.bf.i().f();
            this.v = false;
            for (int i = 0; i < this.c.l; i++) {
                a aVar = (a) this.c.i.get(i);
                if (aVar != this.c.k) {
                    aVar.aW();
                }
                aVar.m(false);
                aVar.aT();
                aVar.aR();
                a.aJ();
                aVar.k(true);
                aVar.L().z = (float) (Math.cos(i * this.B) * this.m);
                aVar.L().x = (float) (Math.sin(i * this.B) * this.m);
                aVar.M().y = this.C * i;
                aVar.aS().N().setAll(1.0f, 1.0f, 1.0f);
                this.z.d(aVar);
            }
            Number3d M = this.z.M();
            float n = n();
            M.y = n;
            this.p = n;
            this.A.Q();
            this.c.f.d(this.A);
        }
        this.t = this.z.M().y;
        this.u = this.z.L().z;
        m();
        this.G.e(null);
        return true;
    }

    public final void a(MotionEvent motionEvent, MotionEvent motionEvent2) {
        this.G.a(motionEvent, motionEvent2);
    }

    public final void a(MotionEvent motionEvent) {
        this.G.f(motionEvent);
    }

    public final void a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.G.b(motionEvent, motionEvent2, f, f2);
    }

    public final boolean g() {
        return this.l;
    }

    public final boolean h() {
        return this.k;
    }

    public final void i() {
        if (!this.l) {
            this.l = true;
            this.k = false;
        }
    }

    public final void b(MotionEvent motionEvent, MotionEvent motionEvent2) {
        if (!this.l) {
            this.b = this.a;
            int abs = (int) Math.abs(motionEvent2.getX() - motionEvent.getX());
            int abs2 = (int) Math.abs(motionEvent2.getY() - motionEvent.getY());
            if ((abs * abs) + (abs2 * abs2) > com.censivn.C3DEngine.b.b.TouchState) {
                if (abs > abs2) {
                    this.k = true;
                } else {
                    this.k = false;
                }
                this.l = true;
            }
        }
        if (this.k) {
            if (this.h) {
                com.censivn.C3DEngine.a.a().b(new as(this));
            }
            float x = this.d + ((motionEvent2.getX() - motionEvent.getX()) / com.censivn.C3DEngine.a.l);
            if (x > this.e) {
                this.J = true;
            } else {
                this.J = false;
            }
            this.e = x;
            this.i = true;
        }
    }

    public final void j() {
        float f;
        a aVar;
        if (this.l) {
            this.l = false;
            this.h = true;
            this.i = false;
            this.e = 0.0f;
            if (!this.g && this.K == null) {
                a aVar2 = null;
                float f2 = Float.MAX_VALUE;
                int i = 1;
                while (i < this.c.l) {
                    a aVar3 = (a) this.c.i.get(i);
                    if (!aVar3.bf()) {
                        float abs = Math.abs(aVar3.D);
                        if (abs < f2) {
                            aVar = aVar3;
                            f = abs;
                            i++;
                            aVar2 = aVar;
                            f2 = f;
                        }
                    }
                    f = f2;
                    aVar = aVar2;
                    i++;
                    aVar2 = aVar;
                    f2 = f;
                }
                if (aVar2 != null && aVar2 != this.c.k) {
                    this.c.a(aVar2, false);
                    return;
                }
                return;
            }
            this.g = false;
        }
    }

    private void b(boolean z) {
        if (this.K != null) {
            com.censivn.C3DEngine.b.m.d().c().a(true);
            this.K = null;
            if (this.L != null) {
                com.censivn.C3DEngine.a.a().c(this.L);
                this.L = null;
            }
        }
        this.h = true;
        this.j = true;
        this.c.f.a_(false);
        if (z) {
            this.c.k.bi();
        }
        this.c.C();
        com.tsf.shell.a.t.j(this.c.k.aG());
        this.c.k.bc();
        a aVar = this.c.k;
        this.d = 0.0f;
        aVar.D = 0.0f;
        this.c.Q();
        this.c.g().d();
        this.c.d();
    }

    static /* synthetic */ void a(ao aoVar, a aVar, Runnable runnable) {
        if (aoVar.K == aVar && aVar != aoVar.c.k) {
            runnable.run();
            return;
        }
        com.censivn.C3DEngine.b.m.d().c().a(false);
        aoVar.K = aVar;
        if (aoVar.L != null) {
            aoVar.L.run();
        }
        aoVar.L = runnable;
        aoVar.c.t.a(aVar);
        aoVar.e();
        aoVar.f.a(aVar);
        int p = aVar.p() - aoVar.c.k.p();
        aoVar.I = new at(aoVar, aVar, aoVar.c.k.D, -p);
        com.censivn.C3DEngine.g.s.a(aoVar.H);
        com.censivn.C3DEngine.g.s.a(aoVar.H, Math.abs(p * 150), aoVar.I);
        aoVar.j = false;
        aoVar.i = true;
        aoVar.l = true;
    }

    public final void k() {
        if (this.c.k.bh() != null) {
            this.c.k.a(this.c.k, this.c.k.D, true, false);
            this.c.a(this.c.k.bh(), false);
            this.c.k.f(1);
            this.e = 0.0f;
            this.f.k();
        }
    }

    public final void l() {
        if (this.c.k.bg() != null) {
            this.c.k.a(this.c.k, this.c.k.D, false, true);
            this.c.a(this.c.k.bg(), false);
            this.c.k.f(0);
            this.e = 0.0f;
            this.f.k();
        }
    }
}
