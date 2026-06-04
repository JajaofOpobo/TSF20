package com.tsf.shell.setting.a;

import com.censivn.C3DEngine.api.element.TextureElement;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
final class d extends com.censivn.C3DEngine.b.v {
    private float A;
    private float B;
    private int C;
    private float D;
    private int E;
    private ArrayList F;
    private com.censivn.C3DEngine.b.v G;
    private com.censivn.C3DEngine.b.v H;
    private int I;
    private float J;
    private boolean K = false;
    private int L;
    private a M;
    private int N;
    private float a;

    public final ArrayList i() {
        return this.F;
    }

    public final void j() {
        Iterator it = this.F.iterator();
        while (it.hasNext()) {
            com.censivn.C3DEngine.a.f().a(((f) it.next()).c);
        }
        this.F.clear();
        this.G.H();
        this.H.H();
        H();
    }

    public final f k() {
        return (f) this.F.get(n());
    }

    public final boolean l() {
        return n() != this.L;
    }

    public final void a(int i) {
        this.L = i;
    }

    public final void m() {
        e(this.L);
    }

    public final void e(int i) {
        this.a = i * this.D * (-this.I);
        this.H.a_(true);
        com.censivn.C3DEngine.b.v vVar = this.H;
        com.censivn.C3DEngine.a.d().g();
    }

    public d(boolean z, ArrayList arrayList, a aVar) {
        this.M = aVar;
        this.I = z ? -1 : 1;
        this.H = new com.censivn.C3DEngine.b.v();
        float f = com.censivn.C3DEngine.a.q ? com.censivn.C3DEngine.a.l : com.censivn.C3DEngine.a.m;
        float f2 = com.censivn.C3DEngine.a.q ? com.censivn.C3DEngine.a.m : com.censivn.C3DEngine.a.l;
        this.J = f / 2.0f;
        this.C = (int) ((f * 3.141592653589793d) / (136.0f * com.censivn.C3DEngine.a.b));
        this.N = this.C / 2;
        this.D = 360.0f / this.C;
        this.E = arrayList.size();
        if (z) {
            this.B = (this.E - 1) * this.D;
            this.A = 0.0f;
        } else {
            this.B = 0.0f;
            this.A = (this.E - 1) * this.D * (-1.0f);
        }
        this.F = new ArrayList();
        double d = (360.0f / this.C) * 0.017453292519943295d;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.C) {
                com.censivn.C3DEngine.e.b bVar = new com.censivn.C3DEngine.e.b(128.0f * com.censivn.C3DEngine.a.b, 128.0f * com.censivn.C3DEngine.a.b, (byte) 0);
                bVar.a(String.valueOf(i2));
                bVar.c((Boolean) false);
                bVar.z().a(new TextureElement(1, true));
                bVar.a((Boolean) false);
                bVar.L().y = (float) (Math.sin(i2 * d) * this.J);
                bVar.L().x = ((float) (Math.cos(i2 * d) * this.J)) * this.I;
                bVar.M().z = this.D * i2 * this.I;
                bVar.a(-32.0f, -32.0f, 0.0f, 32.0f, 32.0f);
                this.H.d(bVar);
                i = i2 + 1;
            } else {
                this.F = arrayList;
                this.G = new com.censivn.C3DEngine.b.v();
                this.G.b((-f) / 2.0f, (-f2) / 2.0f, 0.0f, f / 2.0f, f2 / 2.0f);
                this.G.a((com.censivn.C3DEngine.b.l) new e(this, this.G));
                d(this.G);
                d(this.H);
                o();
                return;
            }
        }
    }

    @Override // com.censivn.C3DEngine.b.r
    public final void c() {
        if (this.K) {
            this.H.M().z += (this.a - this.H.M().z) * 0.5f;
        } else {
            this.H.M().z += (this.a - this.H.M().z) * 0.2f;
            if (this.H.M().z < this.A && this.a < this.A) {
                this.a += (this.A - this.a) * 0.3f;
            } else if (this.H.M().z > this.B && this.a > this.B) {
                this.a += (this.B - this.a) * 0.3f;
            }
            if (Math.abs(this.H.M().z - this.a) < 0.01d && this.H.w()) {
                this.H.a_(false);
                this.H.M().z = this.a;
                int n = n();
                a aVar = this.M;
                n();
                aVar.a((f) this.F.get(n));
            }
        }
        if (this.H.w()) {
            o();
        }
    }

    private int n() {
        int round = Math.round(this.H.M().z / this.D) * (-this.I);
        if (round > this.E - 1) {
            return this.E - 1;
        }
        if (round < 0) {
            return 0;
        }
        return round;
    }

    private void o() {
        if (this.H.aB() != 0 && this.F.size() != 0) {
            int n = n();
            int i = n % this.C;
            int i2 = 0;
            int i3 = i;
            while (i2 < this.N) {
                com.censivn.C3DEngine.e.b bVar = (com.censivn.C3DEngine.e.b) this.H.d(i3);
                if (n + i2 < this.E) {
                    bVar.a((Boolean) true);
                    bVar.z().a(0).textureElement.id = ((f) this.F.get(n + i2)).c.id;
                    bVar.a(String.valueOf(n + i2));
                } else {
                    bVar.a((Boolean) false);
                }
                int i4 = i3 + 1;
                if (i4 == this.C) {
                    i4 = 0;
                }
                i2++;
                i3 = i4;
            }
            for (int i5 = 0; i5 < this.N; i5++) {
                com.censivn.C3DEngine.e.b bVar2 = (com.censivn.C3DEngine.e.b) this.H.d(i);
                if (n - i5 >= 0) {
                    bVar2.a((Boolean) true);
                    bVar2.z().a(0).textureElement.id = ((f) this.F.get(n - i5)).c.id;
                    bVar2.a(String.valueOf(n - i5));
                } else {
                    bVar2.a((Boolean) false);
                }
                i--;
                if (i == -1) {
                    i = this.C - 1;
                }
            }
        }
    }
}
