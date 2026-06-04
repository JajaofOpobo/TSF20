package com.tsf.shell.workspace3D.k;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.tsf.shell.R;
import com.tsf.shell.workspace3D.bf;
import com.tsf.shell.workspace3D.k.b.ap;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class ab extends z implements com.tsf.shell.workspace3D.g.x {
    private static TextureElement K;
    private static TextureElement O;
    private static ArrayList P = new ArrayList();
    private static com.censivn.C3DEngine.e.b a;
    public TextureElement C;
    public com.censivn.C3DEngine.e.a.a D;
    public com.censivn.C3DEngine.e.a.c E;
    public com.censivn.C3DEngine.e.a.c F;
    private ab H;
    private com.censivn.C3DEngine.e.b J;
    private int R;
    private boolean I = true;
    public boolean G = false;
    private int Q = 0;
    private boolean S = false;
    private boolean T = false;

    public ab() {
        o(false);
        this.H = this;
        this.D = ap.c();
        this.E = this.D.a(0);
        this.F = this.D.a(1);
        ((j) this).M = 1.2f;
    }

    public final void h(boolean z) {
        this.I = z;
    }

    public final boolean bI() {
        return this.I;
    }

    @Override // com.tsf.shell.workspace3D.k.z, com.censivn.C3DEngine.b.v
    public final void aF() {
        super.aF();
    }

    @Override // com.tsf.shell.workspace3D.k.j, com.tsf.shell.workspace3D.g.g
    public final boolean f(com.tsf.shell.workspace3D.g.g gVar) {
        bb();
        return super.f(gVar);
    }

    public final TextureElement bJ() {
        return this.C;
    }

    public final float bK() {
        return this.F.o.x;
    }

    public final void j(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f != this.F.o.x) {
            this.F.o.x = f;
            this.F.o.y = f;
            this.F.c();
            if (f == 0.0f) {
                bL();
            } else if (!this.F.k) {
                bM();
            }
        }
    }

    public final void bL() {
        this.F.a((Boolean) false);
        bN();
    }

    public final void bM() {
        this.F.a((Boolean) true);
        bN();
    }

    public final void bN() {
        if (this.F.k) {
            b(ap.N, ap.P, 0.0f, ap.O, ap.Q);
        } else {
            b(ap.R, ap.T, 0.0f, ap.S, ap.U);
        }
    }

    public final void bO() {
        e(c(new Number3d(0.0f, 0.0f, 0.0f)));
    }

    public final void e(Number3d number3d) {
        if (this.C != null) {
            if (a == null) {
                com.censivn.C3DEngine.e.b bVar = new com.censivn.C3DEngine.e.b(128.0f, 128.0f);
                a = bVar;
                bVar.c((Boolean) false);
            }
            a.Q();
            a.z().b();
            a.z().c(this.C);
            a.b(150.0f);
            a.K();
            a.N().setAll(1.0f, 1.0f, 1.0f);
            ac acVar = new ac(this);
            Number3d a2 = a(new Number3d(0.0f, 0.0f, 0.0f));
            a.L().setAllFrom(number3d);
            a.M().setAllFrom(a2);
            bf.m().a(a);
            acVar.j(2.0f);
            acVar.k(2.0f);
            acVar.a(0);
            com.censivn.C3DEngine.g.s.a(a);
            com.censivn.C3DEngine.g.s.a(a, 250, acVar);
        }
    }

    public void bP() {
    }

    public final boolean bQ() {
        return this.S;
    }

    public final void bR() {
        this.S = true;
        if (K == null) {
            Bitmap a2 = com.censivn.C3DEngine.h.a.a(com.censivn.C3DEngine.a.c(), R.drawable.widget_app_fire);
            K = com.censivn.C3DEngine.a.f().a(a2, true);
            a2.recycle();
            Bitmap a3 = com.censivn.C3DEngine.h.a.a(com.censivn.C3DEngine.a.c(), R.drawable.widget_app_fire2);
            O = com.censivn.C3DEngine.a.f().a(a3, true);
            a3.recycle();
        }
        if (this.J == null) {
            this.J = new ad(this);
            this.J.a_(true);
            this.J.F().set(0, 0.25f, 0.25f);
            this.J.F().set(1, 0.0f, 0.25f);
            this.J.F().set(2, 0.25f, 0.0f);
            this.J.F().set(3, 0.0f, 0.0f);
            this.J.L().y = 105.0f * com.censivn.C3DEngine.a.a;
            this.J.c((Boolean) false);
            this.J.e(false);
            this.J.Q();
            d(this.J);
            this.J.z().c(K);
        } else {
            d(this.J);
        }
        if (!P.contains(this)) {
            P.add(this);
        }
    }

    public final void bS() {
        this.S = false;
        this.J.Q();
        this.J.z().b();
        this.J.H();
        this.J = null;
        if (P.contains(this)) {
            P.remove(this);
        }
        if (P.size() == 0) {
            com.censivn.C3DEngine.a.f().a(K);
            com.censivn.C3DEngine.a.f().a(O);
            K = null;
            O = null;
        }
    }

    @Override // com.tsf.shell.workspace3D.g.x
    public final boolean a() {
        return this.T;
    }

    @Override // com.tsf.shell.workspace3D.g.x
    public final void a(boolean z) {
        this.T = z;
    }

    @Override // com.tsf.shell.workspace3D.g.x
    public final boolean b() {
        return true;
    }
}
