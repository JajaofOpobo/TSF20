package com.tsf.shell.workspace3D.g.d;

import android.graphics.Bitmap;
import android.graphics.Color;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.ThemeOptionMenuDescription;

/* loaded from: classes.dex */
public final class k extends com.censivn.C3DEngine.b.v implements o {
    private static TextureElement U;
    public float A;
    public float B;
    public float C;
    public float D;
    public float E;
    public float F;
    public float G;
    public float H;
    protected com.censivn.C3DEngine.e.b I;
    private float K;
    private int L;
    private boolean M;
    private float N;
    private com.censivn.C3DEngine.g.u O;
    private com.censivn.C3DEngine.g.u P;
    private d R;
    private r S;
    private com.censivn.C3DEngine.e.b T;
    public float a;
    private boolean J = false;
    private float Q = (-50.0f) * com.censivn.C3DEngine.a.b;

    public k(d dVar, float f, float f2, float f3, int i, int i2, com.censivn.C3DEngine.b.l lVar) {
        this.M = false;
        this.R = dVar;
        if (i == 0 && i2 == 0) {
            this.M = false;
        } else {
            this.M = true;
        }
        this.I = new l(this, f, f2);
        d(this.I);
        this.N = f3;
        aG();
        this.I.ar();
        this.I.e(this.I.l[0] + (com.censivn.C3DEngine.a.b * 30.0f));
        this.I.c(this.I.k[0] - (com.censivn.C3DEngine.a.b * 30.0f));
        this.I.f(this.I.k[1] + (com.censivn.C3DEngine.a.b * 30.0f));
        this.I.d(this.I.m[1] - (com.censivn.C3DEngine.a.b * 30.0f));
        this.I.a(lVar);
        this.F = Color.red(i);
        this.G = Color.green(i);
        this.H = Color.blue(i);
        this.C = Color.red(i2);
        this.D = Color.green(i2);
        this.E = Color.blue(i2);
        aI();
        this.O = new m(this, dVar);
        this.O.h(this.Q + f3);
        this.O.a(0);
        this.P = new com.censivn.C3DEngine.g.u();
        this.P.h(f3);
        this.P.a(255);
        this.P.a(com.censivn.C3DEngine.g.a.a);
    }

    public final void i() {
        if (U == null) {
            Bitmap bitmap = ThemeManager.getInstance().getCurrentThemeDescription().optionMenu.getBitmap(ThemeOptionMenuDescription.OPTION_MENU_FAVORITE_DELETE);
            U = com.censivn.C3DEngine.a.f().a(bitmap, false);
            bitmap.recycle();
        }
        if (this.T == null) {
            this.T = new com.censivn.C3DEngine.e.b(U.width * com.censivn.C3DEngine.a.b, U.height * com.censivn.C3DEngine.a.b, (byte) 0);
        } else {
            this.T.a_(U.width * com.censivn.C3DEngine.a.b);
            this.T.h(U.height * com.censivn.C3DEngine.a.b);
        }
        this.T.L().y = com.censivn.C3DEngine.a.b * 20.0f;
        this.T.L().x = com.censivn.C3DEngine.a.b * 20.0f;
        if (this.T.P() == null) {
            this.I.d(this.T);
            this.T.N().setAll(0.0f, 0.0f, 1.0f);
            this.T.b(255.0f);
        }
        this.T.z().d();
        this.T.z().c(U);
        com.censivn.C3DEngine.g.u uVar = new com.censivn.C3DEngine.g.u();
        uVar.j(1.0f);
        uVar.k(1.0f);
        uVar.a(255);
        com.censivn.C3DEngine.g.s.a(this.T);
        com.censivn.C3DEngine.g.s.a(this.T, 250, uVar);
    }

    public final void j() {
        n nVar = new n(this);
        nVar.j(0.0f);
        nVar.k(0.0f);
        com.censivn.C3DEngine.g.s.a(this.T);
        com.censivn.C3DEngine.g.s.a(this.T, 250, nVar);
    }

    public final void k() {
        if (this.T != null) {
            this.T.z().d();
            this.T.Q();
        }
    }

    @Override // com.tsf.shell.workspace3D.g.d.o
    public final Number3d l() {
        Number3d.TEMPNUMBER3D4.reset();
        this.I.c(Number3d.TEMPNUMBER3D4);
        return Number3d.TEMPNUMBER3D4;
    }

    @Override // com.tsf.shell.workspace3D.g.d.o
    public final void a(r rVar) {
        this.S = rVar;
    }

    @Override // com.tsf.shell.workspace3D.g.d.o
    public final r m() {
        return this.S;
    }

    @Override // com.tsf.shell.workspace3D.g.d.o
    public final void n() {
        b(0.0f);
        aG();
        k();
    }

    @Override // com.tsf.shell.workspace3D.g.d.o
    public final float o() {
        return this.K;
    }

    @Override // com.tsf.shell.workspace3D.g.d.o
    public final void g(float f) {
        this.K = f;
    }

    @Override // com.tsf.shell.workspace3D.g.d.o
    public final void a(TextureElement textureElement) {
        this.I.z().d();
        this.I.z().c(textureElement);
    }

    @Override // com.tsf.shell.workspace3D.g.d.o
    public final void p() {
        this.I.z().d();
    }

    @Override // com.tsf.shell.workspace3D.g.d.o
    public final void a(int i, float f) {
        M().z = f;
        com.censivn.C3DEngine.g.s.a(this.I);
        com.censivn.C3DEngine.g.s.a(this.I, 300, this.P);
    }

    public final void q() {
        com.censivn.C3DEngine.g.s.a(this.I);
        com.censivn.C3DEngine.g.s.a(this.I, 300, this.O);
    }

    public final void aG() {
        this.I.L().y = this.N - this.Q;
    }

    @Override // com.tsf.shell.workspace3D.g.d.o
    public final void a(int i) {
        this.L = i;
    }

    @Override // com.tsf.shell.workspace3D.g.d.o
    public final int aH() {
        return this.L;
    }

    @Override // com.tsf.shell.workspace3D.g.d.o
    public final void aI() {
        this.a = this.F;
        this.A = this.G;
        this.B = this.H;
        this.I.J().r = (short) this.F;
        this.I.J().g = (short) this.G;
        this.I.J().b = (short) this.H;
    }

    @Override // com.tsf.shell.workspace3D.g.d.o
    public final void h(boolean z) {
        this.J = z;
        if (this.J) {
            this.a = this.C;
            this.A = this.D;
            this.B = this.E;
        } else {
            this.a = this.F;
            this.A = this.G;
            this.B = this.H;
        }
    }
}
