package com.censivn.C3DEngine.e.a;

import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.b.l;
import com.censivn.C3DEngine.b.r;
import com.censivn.C3DEngine.b.v;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class a extends v {
    public int A;
    private float B;
    private float C;
    private c D;
    private ArrayList E;
    private r F;
    private boolean G;
    private l H;
    private boolean I;
    private int a;

    public a(int i, int i2, int i3) {
        super(((i * 2) - 1) * 4 * 1, ((i * 2) - 1) * 2 * 1);
        this.A = 16;
        this.G = false;
        this.I = false;
        this.a = i;
        this.A = i2;
        this.B = i3;
        this.C = i3;
        this.E = new ArrayList();
        a((i * 2) - 1, new Color4(255, 50, 0, 100));
    }

    @Override // com.censivn.C3DEngine.b.r
    public void c() {
        this.G = true;
    }

    public a(int i, int i2, int i3, int i4) {
        super(((i * 2) - 1) * 4 * 1, ((i * 2) - 1) * 2 * 1);
        this.A = 16;
        this.G = false;
        this.I = false;
        this.a = i;
        this.A = i2;
        this.B = i3;
        this.C = i4;
        this.E = new ArrayList();
        a((i * 2) - 1, new Color4(255, 50, 0, 100));
    }

    public a(int i, int i2, int i3, int i4, r rVar) {
        super(((i * 2) - 1) * 4 * 1, ((i * 2) - 1) * 2 * 1);
        this.A = 16;
        this.G = false;
        this.I = false;
        this.a = i;
        this.A = i2;
        this.B = i3;
        this.C = i4;
        this.E = new ArrayList();
        this.F = rVar;
        a((i * 2) - 1, new Color4(255, 50, 0, 100));
    }

    private void a(int i, Color4 color4) {
        float f = 100.0f / i;
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 > 1) {
                break;
            }
            for (int i4 = 0; i4 <= i; i4++) {
                short s = color4.r;
                short s2 = color4.g;
                short s3 = color4.b;
                short s4 = color4.a;
                x().a(1.0f - ((i4 * f) - 50.0f), (i3 * 100.0f) - 50.0f, 0.0f, 1.0f - (i4 / i), 1.0f - (i3 / 1.0f), 0.0f, 0.0f, -1.0f);
            }
            i2 = i3 + 1;
        }
        int i5 = i + 1;
        for (int i6 = 1; i6 <= 1; i6++) {
            for (int i7 = 1; i7 <= i; i7++) {
                if (i7 % 2 != 0) {
                    int i8 = (i5 * 1) + i7;
                    int i9 = i8 - i5;
                    com.censivn.C3DEngine.h.a.a(this, i9 - 1, i9, i8, i8 - 1);
                }
            }
        }
        int i10 = this.a * 2;
        for (int i11 = 0; i11 < this.a; i11++) {
            c cVar = new c(this);
            cVar.H = i11;
            cVar.a = i11 * 2;
            cVar.b = cVar.a + 1;
            cVar.c = cVar.a + i10;
            cVar.d = cVar.b + i10;
            this.E.add(cVar);
        }
        this.H = new b(this, this.F == null ? this : this.F);
        a(this.H);
    }

    public final void a(c cVar) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        int i = cVar.e;
        int i2 = cVar.f;
        if (cVar.x) {
            float f12 = cVar.A / this.B;
            float f13 = cVar.y / this.B;
            float f14 = cVar.B / this.C;
            f = cVar.z / this.C;
            f2 = f12;
            f3 = f13;
            f4 = f14;
            f5 = f12;
            f6 = f13;
            f7 = f14;
            f8 = f;
        } else {
            float f15 = ((i * this.A) + (cVar.g * this.A)) / this.B;
            float f16 = (cVar.g * this.A) / this.B;
            float f17 = ((cVar.h * this.A) + (i2 * this.A)) / this.C;
            f = (cVar.h * this.A) / this.C;
            f2 = f15;
            f3 = f16;
            f4 = f17;
            f5 = f15;
            f6 = f16;
            f7 = f17;
            f8 = f;
        }
        if (cVar.i) {
            f9 = f5;
            f10 = f3;
        } else {
            float f18 = f6;
            f9 = f3;
            f3 = f2;
            f10 = f5;
            f5 = f18;
        }
        if (cVar.j) {
            f7 = f8;
            f11 = f8;
            f8 = f4;
        } else {
            float f19 = f;
            f11 = f4;
            f4 = f19;
        }
        x().d().set(cVar.a, f10, f11);
        x().d().set(cVar.b, f9, f7);
        x().d().set(cVar.c, f3, f8);
        x().d().set(cVar.d, f5, f4);
        if (this.G) {
            if (ab()) {
                ae();
            } else {
                com.censivn.C3DEngine.a.d().g();
            }
        }
    }

    public final void b(c cVar) {
        float f = cVar.f() / 2.0f;
        float h = cVar.h() / 2.0f;
        cVar.p.x = cVar.j() + f;
        cVar.p.y = (-h) + cVar.l();
        cVar.q.x = (-f) + cVar.j();
        cVar.q.y = (-h) + cVar.l();
        cVar.r.x = cVar.j() + f;
        cVar.r.y = cVar.l() + h;
        cVar.s.x = (-f) + cVar.j();
        cVar.s.y = h + cVar.l();
        if (cVar.k) {
            cVar.p.x *= cVar.o.x;
            cVar.q.x *= cVar.o.x;
            cVar.r.x *= cVar.o.x;
            cVar.s.x *= cVar.o.x;
            cVar.p.y *= cVar.o.y;
            cVar.q.y *= cVar.o.y;
            cVar.r.y *= cVar.o.y;
            cVar.s.y *= cVar.o.y;
        } else {
            cVar.p.x = 0.0f;
            cVar.q.x = 0.0f;
            cVar.r.x = 0.0f;
            cVar.s.x = 0.0f;
            cVar.p.y = 0.0f;
            cVar.q.y = 0.0f;
            cVar.r.y = 0.0f;
            cVar.s.y = 0.0f;
        }
        cVar.t.setAllFrom(cVar.p);
        cVar.u.setAllFrom(cVar.q);
        cVar.v.setAllFrom(cVar.r);
        cVar.w.setAllFrom(cVar.s);
        if (cVar.D != null) {
            cVar.t.x *= cVar.D.x;
            cVar.t.y *= cVar.D.y;
        } else {
            cVar.t.x *= cVar.C.x;
            cVar.t.y *= cVar.C.y;
        }
        if (cVar.E != null) {
            cVar.u.x *= cVar.E.x;
            cVar.u.y *= cVar.E.y;
        } else {
            cVar.u.x *= cVar.C.x;
            cVar.u.y *= cVar.C.y;
        }
        if (cVar.F != null) {
            cVar.v.x *= cVar.F.x;
            cVar.v.y *= cVar.F.y;
        } else {
            cVar.v.x *= cVar.C.x;
            cVar.v.y *= cVar.C.y;
        }
        if (cVar.G != null) {
            cVar.w.x *= cVar.G.x;
            cVar.w.y *= cVar.G.y;
        } else {
            cVar.w.x *= cVar.C.x;
            cVar.w.y *= cVar.C.y;
        }
        float f2 = (float) ((cVar.n.x * 3.141592653589793d) / 180.0d);
        float f3 = (float) ((cVar.n.y * 3.141592653589793d) / 180.0d);
        float f4 = (float) ((cVar.n.z * 3.141592653589793d) / 180.0d);
        cVar.p.rotateX(f2);
        cVar.q.rotateX(f2);
        cVar.r.rotateX(f2);
        cVar.s.rotateX(f2);
        cVar.t.rotateX(f2);
        cVar.u.rotateX(f2);
        cVar.v.rotateX(f2);
        cVar.w.rotateX(f2);
        cVar.p.rotateY(f3);
        cVar.q.rotateY(f3);
        cVar.r.rotateY(f3);
        cVar.s.rotateY(f3);
        cVar.t.rotateY(f3);
        cVar.u.rotateY(f3);
        cVar.v.rotateY(f3);
        cVar.w.rotateY(f3);
        cVar.p.rotateZ(f4);
        cVar.q.rotateZ(f4);
        cVar.r.rotateZ(f4);
        cVar.s.rotateZ(f4);
        cVar.t.rotateZ(f4);
        cVar.u.rotateZ(f4);
        cVar.v.rotateZ(f4);
        cVar.w.rotateZ(f4);
        cVar.p.add(cVar.m);
        cVar.q.add(cVar.m);
        cVar.r.add(cVar.m);
        cVar.s.add(cVar.m);
        cVar.t.add(cVar.m);
        cVar.u.add(cVar.m);
        cVar.v.add(cVar.m);
        cVar.w.add(cVar.m);
        E().setPX(cVar.a, cVar.p);
        E().setPX(cVar.b, cVar.q);
        E().setPX(cVar.c, cVar.r);
        E().setPX(cVar.d, cVar.s);
        if (this.G) {
            if (ab()) {
                ad();
            } else {
                com.censivn.C3DEngine.a.d().g();
            }
        }
    }

    public final void i() {
        this.I = true;
    }

    @Override // com.censivn.C3DEngine.b.r
    public final boolean b(float f, float f2) {
        if (this.I) {
            return super.b(f, f2);
        }
        if (a(f, f2) == null) {
            return false;
        }
        return true;
    }

    public final c a(int i) {
        return (c) this.E.get(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public c a(float f, float f2) {
        for (int i = 0; i < this.a; i++) {
            c cVar = (c) this.E.get(i);
            this.k[0] = cVar.t.x;
            this.k[1] = cVar.t.y;
            this.k[2] = cVar.t.z;
            this.k[3] = 1.0f;
            this.l[0] = cVar.u.x;
            this.l[1] = cVar.u.y;
            this.l[2] = cVar.u.z;
            this.l[3] = 1.0f;
            this.m[0] = cVar.v.x;
            this.m[1] = cVar.v.y;
            this.m[2] = cVar.v.z;
            this.m[3] = 1.0f;
            this.n[0] = cVar.w.x;
            this.n[1] = cVar.w.y;
            this.n[2] = cVar.w.z;
            this.n[3] = 1.0f;
            if (super.b(f, f2) && cVar.l != null) {
                return cVar;
            }
        }
        return null;
    }
}
