package com.tsf.shell.workspace3D.g.b;

import com.censivn.C3DEngine.api.element.PositionNumber3d;
import com.censivn.C3DEngine.b.r;
import com.censivn.C3DEngine.b.v;
import com.censivn.C3DEngine.g.s;
import com.censivn.C3DEngine.g.u;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class n extends v {
    private float C;
    private float D;
    private float E;
    private int a = 0;
    private float F = 0.0f;
    private boolean G = true;
    private boolean H = false;
    private float I = 0.0f;
    private float J = 0.0f;
    private ArrayList A = new ArrayList();
    private v B = new v();

    public n(float f, float f2, float f3, float f4, float f5) {
        this.C = 0.0f;
        this.D = 0.0f;
        this.C = f;
        this.D = f2;
        this.E = f5;
        d(this.B);
        b(f, f3, 0.0f, f2, f4);
        a((com.censivn.C3DEngine.b.l) new o(this, this));
        k();
        j();
    }

    public final void a(float f, float f2, float f3, float f4) {
        b(f, f3, f3, f2, f4);
        this.C = f;
        this.D = f2;
        k();
        m();
    }

    public final void a(int i) {
        int aB = this.B.aB();
        int i2 = 0;
        while (true) {
            if (i2 >= aB) {
                i2 = -1;
                break;
            }
            r d = this.B.d(i2);
            if (d.t() != i) {
                i2++;
            } else {
                d.Q();
                this.A.add(d);
                break;
            }
        }
        if (i2 != -1) {
            int aB2 = this.B.aB();
            while (i2 < aB2) {
                r d2 = this.B.d(i2);
                if (i2 == aB2 - 1) {
                    a(d2, i, new p(this));
                } else {
                    a(d2, i, (Runnable) null);
                }
                i++;
                i2++;
            }
        }
    }

    public final void j() {
        PositionNumber3d L = this.B.L();
        float f = this.I;
        this.F = f;
        L.x = f;
        Iterator it = this.B.aD().iterator();
        while (it.hasNext()) {
            this.A.add((r) it.next());
        }
        this.B.aD().clear();
    }

    public final void k() {
        this.a = i() - 1;
        this.I = (int) (com.censivn.C3DEngine.a.e + (this.E / 2.0f));
        this.J = (int) ((((-this.a) * this.E) + com.censivn.C3DEngine.a.f) - (this.E / 2.0f));
        this.G = false;
        this.B.a_(true);
        v vVar = this.B;
        com.censivn.C3DEngine.a.d().g();
    }

    @Override // com.censivn.C3DEngine.b.r
    public final void c() {
        if (!this.G) {
            if (this.H) {
                float f = (this.F - this.B.L().x) * 0.5f;
                PositionNumber3d L = this.B.L();
                L.x = f + L.x;
            } else {
                float f2 = (this.F - this.B.L().x) * 0.1f;
                PositionNumber3d L2 = this.B.L();
                L2.x = f2 + L2.x;
                if (this.B.L().x > this.I && this.F > this.I) {
                    this.F += (this.I - this.F) * 0.2f;
                } else if (this.B.L().x < this.J && this.F < this.J) {
                    this.F += (this.J - this.F) * 0.2f;
                }
                if (Math.abs(this.B.L().x - this.F) < 0.5f) {
                    this.B.L().x = this.F;
                    this.B.a_(false);
                    this.G = true;
                }
            }
            m();
        }
    }

    private void m() {
        while (true) {
            int aB = this.B.aB();
            for (int i = 0; i < aB; i++) {
                r d = this.B.d(i);
                if (i != aB - 1) {
                    if (i == 0 && d.L().x + this.B.L().x < this.C - this.E) {
                        d.Q();
                        this.A.add(d);
                    }
                } else if (d.L().x + this.B.L().x > this.D + (this.E * 2.0f)) {
                    d.Q();
                    this.A.add(d);
                }
            }
            l();
            return;
        }
    }

    public final void l() {
        r a;
        while (this.a >= 0) {
            int i = (int) ((this.C - this.B.L().x) / this.E);
            if ((this.C - this.B.L().x) % this.E == 0.0f) {
                i--;
            }
            if (i < 0) {
                i = 0;
            } else if (i > this.a) {
                i = this.a;
            }
            int aB = this.B.aB();
            int i2 = i;
            for (int i3 = 0; i3 < aB; i3++) {
                r d = this.B.d(i3);
                if (i3 != aB - 1 || d.t() == this.a) {
                    if (i3 == 0 && d.L().x + this.B.L().x > this.C && d.t() != 0 && (a = a(i2, n())) != null) {
                        this.B.a(a, 0);
                        a.L().x = d.L().x - this.E;
                        m();
                        return;
                    }
                } else if (d.L().x + this.B.L().x < this.D + this.E && i2 < this.a) {
                    r a2 = a(i2 + 1, n());
                    this.B.d(a2);
                    a2.L().x = d.L().x + this.E;
                    m();
                    return;
                }
                c(d, i2);
                i2++;
            }
            if (aB == 0) {
                r a3 = a(i2, n());
                c(a3, i2);
                this.B.d(a3);
            } else {
                return;
            }
        }
    }

    private r n() {
        int size = this.A.size();
        if (size == 0) {
            return null;
        }
        return (r) this.A.remove(size - 1);
    }

    private void a(r rVar, int i, Runnable runnable) {
        r a;
        if (rVar.t() != i && (a = a(i, rVar)) != null) {
            a.b_(i);
            u uVar = new u();
            uVar.a(runnable);
            uVar.f(i * this.E);
            s.a(a);
            s.a(a, 300, uVar);
        }
    }

    private void c(r rVar, int i) {
        r a;
        if (rVar.t() != i && (a = a(i, rVar)) != null) {
            a.b_(i);
            a.L().x = i * this.E;
        }
    }

    public void b(r rVar, int i) {
    }

    public int i() {
        return 0;
    }

    public r a(int i, r rVar) {
        return null;
    }
}
