package com.tsf.shell.workspace3D.h.c.a;

import com.censivn.C3DEngine.b.v;
import com.censivn.C3DEngine.g.s;
import com.censivn.C3DEngine.g.u;
import com.tsf.shell.workspace3D.h.l;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a implements h {
    public int a;
    public int b;
    private l c;
    private com.tsf.shell.workspace3D.h.c.a d;
    private v e;
    private int f;
    private int g;
    private int h;
    private int i;
    private boolean j;
    private int k;
    private int l;

    @Override // com.tsf.shell.workspace3D.h.c.a.h
    public final void a() {
        if (this.e.L().x != this.i) {
            s.a(this.e);
            this.e.L().x = (float) (r0.x + ((this.i - this.e.L().x) * 0.1d));
            this.e.a_(true);
            if (Math.abs(this.i - this.e.L().x) < 0.01d) {
                this.e.L().x = this.i;
                this.e.a_(false);
            }
        }
    }

    @Override // com.tsf.shell.workspace3D.h.c.a.h
    public final void a(com.tsf.shell.workspace3D.h.a aVar, com.censivn.C3DEngine.g.b.a aVar2) {
        s.a(aVar2);
        s.a(aVar2, 350, new b(this, aVar, aVar.M().y));
    }

    @Override // com.tsf.shell.workspace3D.h.c.a.h
    public final void b(com.tsf.shell.workspace3D.h.a aVar, com.censivn.C3DEngine.g.b.a aVar2) {
        c cVar = new c(this, aVar, aVar.M().y);
        s.a(aVar2);
        s.a(aVar2, 350, cVar);
    }

    @Override // com.tsf.shell.workspace3D.h.c.a.h
    public final void b() {
        this.a = (l.a - 100) / 2;
        a(this.l);
    }

    @Override // com.tsf.shell.workspace3D.h.c.a.h
    public final void a(int i) {
        this.l = i;
        this.b = (int) (60.0f * com.censivn.C3DEngine.a.a);
        this.k = (int) ((i - 1) * l.c);
        if (this.k + l.a + (20.0f * com.censivn.C3DEngine.a.a) > com.censivn.C3DEngine.a.j) {
            this.j = true;
            this.f = (int) (com.censivn.C3DEngine.a.e + (l.a / 2) + (com.censivn.C3DEngine.a.a * 10.0f));
            this.g = (int) ((((0 - this.k) + com.censivn.C3DEngine.a.f) - (l.a / 2)) - (com.censivn.C3DEngine.a.a * 10.0f));
        } else {
            this.j = false;
            this.i = (-this.k) / 2;
            this.f = this.i;
            this.g = this.i;
        }
        if (((int) ((this.b * (i - 1)) + l.b + (com.censivn.C3DEngine.a.a * 10.0f * 2.0f))) > com.censivn.C3DEngine.a.k) {
            this.b = (int) (((com.censivn.C3DEngine.a.k - l.b) - ((com.censivn.C3DEngine.a.a * 10.0f) * 2.0f)) / (i - 1));
        }
        this.h = 0 - ((this.b * (i - 1)) / 2);
    }

    @Override // com.tsf.shell.workspace3D.h.c.a.h
    public final void a(com.tsf.shell.workspace3D.h.a aVar) {
        if (this.k > com.censivn.C3DEngine.a.j) {
            l lVar = this.c;
            this.i = (int) (-(aVar.p() * l.c));
        } else {
            this.i = (-this.k) / 2;
        }
        this.e.L().x = this.i;
    }

    @Override // com.tsf.shell.workspace3D.h.c.a.h
    public final void a(u uVar, com.tsf.shell.workspace3D.h.a aVar) {
        uVar.f(aVar.p() * l.c);
        uVar.h(this.h + (aVar.p() * this.b));
        uVar.i(0.0f);
        uVar.d(0.0f);
        uVar.c(0.0f);
    }

    @Override // com.tsf.shell.workspace3D.h.c.a.h
    public final void a(int i, ArrayList arrayList, com.tsf.shell.workspace3D.h.a aVar, boolean z) {
        u dVar;
        if (this.i > this.f) {
            this.i = this.f;
        } else if (this.i < this.g) {
            this.i = this.g;
        }
        int i2 = 0;
        for (int i3 = z ? 1 : 0; i3 < i; i3++) {
            com.tsf.shell.workspace3D.h.a aVar2 = (com.tsf.shell.workspace3D.h.a) arrayList.get(i3);
            aVar2.m();
            aVar2.L().x = l.c * i2;
            if (aVar2 != aVar) {
                aVar2.aW();
                if (aVar2.P() == null) {
                    aVar2.M().y = 50.0f;
                    aVar2.j(false);
                    aVar2.Q();
                    this.e.d(aVar2);
                }
                dVar = new u();
                dVar.h(this.h + (this.b * i2));
            } else {
                dVar = new d(this);
                dVar.d(0.0f);
                dVar.h(this.h + (this.b * i2));
            }
            i2++;
            s.a(aVar2);
            s.a(aVar2, 350, dVar);
        }
        if (z && aVar.aG() == -1) {
            e eVar = new e(this);
            eVar.h(com.censivn.C3DEngine.a.h - (200.0f * com.censivn.C3DEngine.a.b));
            s.a(aVar);
            this.c.a(this.c.l(), true);
            s.a(aVar, 350, eVar);
            return;
        }
        aVar.aO();
    }

    @Override // com.tsf.shell.workspace3D.h.c.a.h
    public final void a(ArrayList arrayList, com.tsf.shell.workspace3D.h.a aVar, boolean z) {
        int size = arrayList.size();
        for (int i = z ? 1 : 0; i < size; i++) {
            com.tsf.shell.workspace3D.h.a aVar2 = (com.tsf.shell.workspace3D.h.a) arrayList.get(i);
            if (aVar2 != aVar) {
                f fVar = new f(this);
                fVar.h((com.censivn.C3DEngine.a.h - (l.b / 2)) - (100.0f * com.censivn.C3DEngine.a.b));
                s.a(aVar2);
                s.a(aVar2, 350, fVar);
            }
        }
        g gVar = new g(this);
        aVar.aQ();
        aVar.aP();
        gVar.h(0.0f);
        gVar.d(0.0f);
        s.a(aVar);
        s.a(aVar, 350, gVar);
        u uVar = new u();
        if (z) {
            l lVar = this.c;
            uVar.f(-((aVar.p() - 1) * l.c));
        } else {
            l lVar2 = this.c;
            uVar.f(-(aVar.p() * l.c));
        }
        s.a(this.e);
        s.a(this.e, 250, uVar);
    }

    @Override // com.tsf.shell.workspace3D.h.c.a.h
    public final void a(float f, boolean z) {
        if (this.j) {
            if (z && this.f != this.g) {
                this.i = (int) (this.f + (((this.g + this.a) - this.f) * (f / com.censivn.C3DEngine.a.j)));
            } else {
                this.i = (int) (this.f + ((this.g - this.f) * (f / com.censivn.C3DEngine.a.j)));
            }
        }
    }

    @Override // com.tsf.shell.workspace3D.h.c.a.h
    public final int a(int i, float f, boolean z) {
        if (z) {
            int i2 = ((int) (((f - (com.censivn.C3DEngine.a.j / 2)) - this.e.L().x) / this.a)) + 1;
            if (i2 <= 0) {
                return 1;
            }
            if (i2 >= i) {
                return i - 1;
            }
            return i2;
        }
        int i3 = (int) (((f - (com.censivn.C3DEngine.a.j / 2)) - this.e.L().x) / this.a);
        if (i3 < 0) {
            return 0;
        }
        if (i3 >= i) {
            return i - 1;
        }
        return i3;
    }

    @Override // com.tsf.shell.workspace3D.h.c.a.h
    public final void a(l lVar) {
        this.c = lVar;
    }

    @Override // com.tsf.shell.workspace3D.h.c.a.h
    public final void a(com.tsf.shell.workspace3D.h.c.a aVar) {
        this.d = aVar;
    }

    @Override // com.tsf.shell.workspace3D.h.c.a.h
    public final void a(v vVar) {
        this.e = vVar;
    }
}
