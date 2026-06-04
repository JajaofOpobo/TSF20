package com.tsf.shell.workspace3D.g.d;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.tsf.shell.theme.inside.ThemeManager;

/* loaded from: classes.dex */
public final class a extends com.censivn.C3DEngine.e.a.a {
    private c B;
    private c C;
    private c D;
    private c E;
    private c F;
    private c G;
    private c H;
    private TextureElement I;
    private float J;
    private float K;
    private float L;
    private int M;
    private float N;
    private com.censivn.C3DEngine.g.b.b O;
    private c a;

    public a(int i, float f) {
        super(2, 32, 32);
        this.N = 0.0f;
        this.M = i;
        Bitmap bitmap = ThemeManager.getInstance().getCurrentThemeDescription().optionMenu.getBitmap(i);
        this.J = bitmap.getWidth() * com.censivn.C3DEngine.a.b;
        this.K = bitmap.getHeight() * com.censivn.C3DEngine.a.b;
        bitmap.recycle();
        this.L = f;
        this.E = new c(this, 0.0f, ((-this.K) / 2.0f) + f);
        this.F = new c(this, -this.J, ((-this.K) / 2.0f) + f);
        this.G = new c(this, 0.0f, (this.K / 2.0f) + f);
        this.H = new c(this, -this.J, (this.K / 2.0f) + f);
        this.a = new c(this, this.J, ((-this.K) / 2.0f) + f);
        this.B = new c(this, 0.0f, ((-this.K) / 2.0f) + f);
        this.C = new c(this, this.J, (this.K / 2.0f) + f);
        this.D = new c(this, 0.0f, (this.K / 2.0f) + f);
        com.censivn.C3DEngine.e.a.c a = a(0);
        F().set(a.a, 1.0f, 1.0f);
        F().set(a.b, 0.0f, 1.0f);
        F().set(a.c, 1.0f, 0.0f);
        F().set(a.d, 0.0f, 0.0f);
        com.censivn.C3DEngine.e.a.c a2 = a(1);
        F().set(a2.b, 1.0f, 1.0f);
        F().set(a2.a, 0.0f, 1.0f);
        F().set(a2.d, 1.0f, 0.0f);
        F().set(a2.c, 0.0f, 0.0f);
        this.O = new com.censivn.C3DEngine.g.b.b();
        l();
    }

    public final void j() {
        k();
        Bitmap bitmap = ThemeManager.getInstance().getCurrentThemeDescription().optionMenu.getBitmap(this.M);
        this.I = com.censivn.C3DEngine.a.f().a(bitmap, false);
        bitmap.recycle();
        z().c(this.I);
    }

    public final void k() {
        if (this.I != null) {
            com.censivn.C3DEngine.a.f().a(this.I);
            this.I = null;
        }
        z().d();
    }

    public final void g(float f) {
        b bVar = new b(this, this.N, f);
        com.censivn.C3DEngine.g.s.a(this.O);
        com.censivn.C3DEngine.g.s.a(this.O, 300, bVar);
    }

    public final void h(float f) {
        this.N = f;
        this.E.a();
        this.F.a();
        this.G.a();
        this.H.a();
        float f2 = this.L - (this.K / 2.0f);
        float f3 = this.L + (this.K / 2.0f);
        float tan = (float) (Math.tan((f * 3.141592653589793d) / 180.0d) * f2);
        float tan2 = (float) (Math.tan((f * 3.141592653589793d) / 180.0d) * f3);
        this.E.x -= tan;
        this.G.x -= tan2;
        this.E.rotateDegressZ(-f);
        this.F.rotateDegressZ(-f);
        this.G.rotateDegressZ(-f);
        this.H.rotateDegressZ(-f);
        this.a.a();
        this.B.a();
        this.C.a();
        this.D.a();
        this.B.x += tan;
        this.D.x += tan2;
        this.a.rotateDegressZ(f);
        this.B.rotateDegressZ(f);
        this.C.rotateDegressZ(f);
        this.D.rotateDegressZ(f);
        com.censivn.C3DEngine.e.a.c a = a(0);
        F().set(a.a, (this.J - tan) / this.J, 1.0f);
        F().set(a.b, 0.0f, 1.0f);
        F().set(a.c, (this.J - tan2) / this.J, 0.0f);
        F().set(a.d, 0.0f, 0.0f);
        com.censivn.C3DEngine.e.a.c a2 = a(1);
        F().set(a2.b, (this.J - tan) / this.J, 1.0f);
        F().set(a2.a, 0.0f, 1.0f);
        F().set(a2.d, (this.J - tan2) / this.J, 0.0f);
        F().set(a2.c, 0.0f, 0.0f);
        l();
    }

    private void l() {
        com.censivn.C3DEngine.e.a.c a = a(0);
        E().setPX(a.a, this.E);
        E().setPX(a.b, this.F);
        E().setPX(a.c, this.G);
        E().setPX(a.d, this.H);
        com.censivn.C3DEngine.e.a.c a2 = a(1);
        E().setPX(a2.a, this.a);
        E().setPX(a2.b, this.B);
        E().setPX(a2.c, this.C);
        E().setPX(a2.d, this.D);
        ag();
        ah();
    }
}
