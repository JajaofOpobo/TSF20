package com.tsf.shell.workspace3D.g.c;

import com.censivn.C3DEngine.b.v;
import com.censivn.C3DEngine.g.s;
import com.censivn.C3DEngine.g.u;
import com.tsf.shell.theme.inside.ThemeShellDescription;

/* loaded from: classes.dex */
final class j extends v {
    public e E;
    final /* synthetic */ a H;
    public boolean a = false;
    public boolean A = false;
    public float B = 0.0f;
    public boolean C = false;
    public boolean D = false;
    public boolean G = false;
    public com.censivn.C3DEngine.e.b F = new com.censivn.C3DEngine.e.b(84.0f, 84.0f);

    public j(a aVar) {
        this.H = aVar;
        d(this.F);
    }

    public final void g(float f) {
        this.F.h(f);
    }

    public final void h(float f) {
        this.F.a_(f);
    }

    public final void a(int i, com.censivn.C3DEngine.g.r rVar) {
        float f = (this.C ? (-i) * 18 : i * 18) + this.B;
        k kVar = new k(this);
        kVar.e(f);
        kVar.a(rVar);
        s.a(this);
        s.a(this, ThemeShellDescription.PAGE_PREVIEW_SELECT, kVar);
        u uVar = new u();
        uVar.e(-f);
        uVar.a(rVar);
        s.a(this.F);
        s.a(this.F, ThemeShellDescription.PAGE_PREVIEW_SELECT, uVar);
    }

    public final void a(int i, int i2, com.censivn.C3DEngine.g.r rVar) {
        M().z = (this.C ? (-i) * 18 : i * 18) + this.B;
        this.F.M().z = (-M().z) + 360.0f;
        u uVar = new u();
        uVar.h(a.a);
        uVar.j(1.0f);
        uVar.k(1.0f);
        uVar.e(-M().z);
        if (i2 != 0) {
            uVar.b(i2);
        }
        uVar.a(rVar);
        s.a(this.F);
        s.a(this.F, ThemeShellDescription.PAGE_PREVIEW_SELECT, uVar);
    }

    public final void a(int i) {
        l lVar = new l(this);
        lVar.h(0.0f);
        lVar.e((-M().z) + 360.0f);
        lVar.j(0.0f);
        lVar.k(0.0f);
        lVar.b(i * 120);
        lVar.a(com.censivn.C3DEngine.g.a.e);
        s.a(this.F);
        s.a(this.F, ThemeShellDescription.PAGE_PREVIEW_SELECT, lVar);
    }

    public final void i() {
        Q();
        this.a = false;
        this.A = false;
        this.F.z().d();
        this.E = null;
    }

    public final void a(int i, boolean z) {
        u nVar;
        if (z) {
            nVar = new m(this);
        } else {
            nVar = new n(this);
        }
        nVar.h(0.0f);
        nVar.e((-M().z) + 360.0f);
        nVar.j(0.0f);
        nVar.k(0.0f);
        nVar.b(i * 120);
        nVar.a(com.censivn.C3DEngine.g.a.e);
        s.a(this.F, ThemeShellDescription.PAGE_PREVIEW_SELECT, nVar);
    }
}
