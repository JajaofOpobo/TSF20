package com.tsf.shell.setting.a;

import com.censivn.C3DEngine.api.element.TextureElement;
import com.tsf.shell.theme.inside.ThemeShellDescription;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
class b extends com.censivn.C3DEngine.b.v {
    private int H;
    private boolean A = false;
    private float B = 0.0f;
    private float C = 0.0f;
    private float D = 0.0f;
    private float E = 128.0f * com.censivn.C3DEngine.a.a;
    private int I = 0;
    private b a = this;
    private ArrayList G = new ArrayList();
    private com.censivn.C3DEngine.b.v F = new com.censivn.C3DEngine.b.v();

    public b(int i, int i2, int i3, int i4) {
        this.F.b(i, i2, 0.0f, i3, i4);
        this.F.a((com.censivn.C3DEngine.b.l) new c(this, this.F));
    }

    public final boolean i() {
        return l() != this.I;
    }

    public final com.censivn.C3DEngine.b.r j() {
        return this.F;
    }

    public final void k() {
        this.D = (-this.I) * this.E;
        a_(true);
        com.censivn.C3DEngine.a.d().g();
    }

    public final void a(int i) {
        this.D = (-i) * this.E;
        a_(true);
        com.censivn.C3DEngine.a.d().g();
    }

    public final int l() {
        int round = Math.round((-L().x) / this.E);
        if (round > this.H - 1) {
            return this.H - 1;
        }
        if (round < 0) {
            return 0;
        }
        return round;
    }

    public final void a(int i, int i2) {
        this.H = i;
        this.I = i2;
        this.B = (-this.E) * (this.H - 1);
        for (int i3 = 0; i3 < this.H; i3++) {
            com.censivn.C3DEngine.b.r e = e(i3);
            e.L().x = i3 * this.E;
            e.a(Integer.valueOf(i3));
            this.G.add(e.z().a(0).textureElement);
            d(e);
        }
        this.D = (-i2) * this.E;
        L().x = this.D;
    }

    public com.censivn.C3DEngine.b.r e(int i) {
        return null;
    }

    public final void g(float f) {
        Iterator it = aD().iterator();
        while (it.hasNext()) {
            com.censivn.C3DEngine.b.r rVar = (com.censivn.C3DEngine.b.r) it.next();
            if (rVar instanceof com.censivn.C3DEngine.e.a.a) {
                com.censivn.C3DEngine.e.a.c a = ((com.censivn.C3DEngine.e.a.a) rVar).a(0);
                com.censivn.C3DEngine.g.u uVar = new com.censivn.C3DEngine.g.u();
                uVar.j(f);
                uVar.k(f);
                uVar.a((com.censivn.C3DEngine.g.r) new com.censivn.C3DEngine.g.k());
                com.censivn.C3DEngine.g.s.a(a);
                com.censivn.C3DEngine.g.s.a(a, ThemeShellDescription.UNREAD_COUNT_BG, uVar);
            }
        }
    }

    @Override // com.censivn.C3DEngine.b.r
    public final void c() {
        if (this.A) {
            L().x += (this.D - L().x) * 0.5f;
            return;
        }
        L().x += (this.D - L().x) * 0.2f;
        if (L().x < this.B && this.D < this.B) {
            this.D += (this.B - this.D) * 0.3f;
        } else if (L().x > this.C && this.D > this.C) {
            this.D += (this.C - this.D) * 0.3f;
        }
        if (Math.abs(L().x - this.D) < 0.1d && w()) {
            a_(false);
            L().x = this.D;
            l();
            m();
        }
    }

    public void m() {
    }

    @Override // com.censivn.C3DEngine.b.v, com.censivn.C3DEngine.b.r
    public final void H() {
        Iterator it = this.G.iterator();
        while (it.hasNext()) {
            com.censivn.C3DEngine.a.f().a((TextureElement) it.next());
        }
        this.G.clear();
        this.F.H();
        super.H();
    }
}
