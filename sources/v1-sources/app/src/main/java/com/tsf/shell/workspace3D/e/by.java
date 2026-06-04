package com.tsf.shell.workspace3D.e;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.tsf.shell.R;

/* loaded from: classes.dex */
public final class by extends com.censivn.C3DEngine.e.a.a {
    private static TextureElement J;
    private static TextureElement K;
    private cc B;
    private cc C;
    private cc D;
    private cc E;
    private cc F;
    private cc G;
    private cc H;
    private cc I;
    private float L;
    private float M;
    private float N;
    private com.censivn.C3DEngine.g.b.b O;
    private com.censivn.C3DEngine.e.b P;
    public float a;

    public by() {
        super(2, 32, 32);
        this.L = 0.0f;
        this.M = 0.0f;
        this.N = 0.0f;
        if (J == null) {
            Bitmap a = com.censivn.C3DEngine.h.a.a(com.censivn.C3DEngine.a.c(), R.drawable.dock_operation_border);
            J = com.censivn.C3DEngine.a.f().a(a, false);
            a.recycle();
            Bitmap a2 = com.censivn.C3DEngine.h.a.a(com.censivn.C3DEngine.a.c(), R.drawable.dock_operation_border_point);
            K = com.censivn.C3DEngine.a.f().a(a2, false);
            a2.recycle();
        }
        this.L = J.width * com.censivn.C3DEngine.a.b;
        this.M = J.height * com.censivn.C3DEngine.a.b;
        this.a = this.L;
        z().c(J);
        this.P = new com.censivn.C3DEngine.e.b(K.width * com.censivn.C3DEngine.a.b, K.height * com.censivn.C3DEngine.a.b, (byte) 0);
        this.P.z().c(K);
        this.P.b(0.0f);
        d(this.P);
        this.F = new cc(this, 0.0f, 0.0f);
        this.G = new cc(this, -this.L, 0.0f);
        this.H = new cc(this, 0.0f, this.M);
        this.I = new cc(this, -this.L, this.M);
        this.B = new cc(this, this.L, 0.0f);
        this.C = new cc(this, 0.0f, 0.0f);
        this.D = new cc(this, this.L, this.M);
        this.E = new cc(this, 0.0f, this.M);
        com.censivn.C3DEngine.e.a.c a3 = a(0);
        F().set(a3.a, 1.0f, 1.0f);
        F().set(a3.b, 0.0f, 1.0f);
        F().set(a3.c, 1.0f, 0.0f);
        F().set(a3.d, 0.0f, 0.0f);
        com.censivn.C3DEngine.e.a.c a4 = a(1);
        F().set(a4.b, 1.0f, 1.0f);
        F().set(a4.a, 0.0f, 1.0f);
        F().set(a4.d, 1.0f, 0.0f);
        F().set(a4.c, 0.0f, 0.0f);
        this.O = new com.censivn.C3DEngine.g.b.b();
        j();
    }

    public final void g(float f) {
        a(f, (Runnable) null);
    }

    public final void a(float f, Runnable runnable) {
        cb cbVar = new cb(this, this.N, f, runnable);
        com.censivn.C3DEngine.g.s.a(this.O);
        com.censivn.C3DEngine.g.s.a(this.O, 300, cbVar);
        if (f == 0.0f) {
            ca caVar = new ca(this);
            caVar.a(0);
            com.censivn.C3DEngine.g.s.a(this.P);
            com.censivn.C3DEngine.g.s.a(this.P, 300, caVar);
            return;
        }
        this.P.L().y = 0.0f;
        bz bzVar = new bz(this);
        bzVar.h(this.a + (20.0f * com.censivn.C3DEngine.a.b));
        bzVar.a(255);
        com.censivn.C3DEngine.g.s.a(this.P);
        com.censivn.C3DEngine.g.s.a(this.P, 300, bzVar);
    }

    public final void h(float f) {
        this.N = f;
        this.F.a();
        this.G.a();
        this.H.a();
        this.I.a();
        this.B.a();
        this.C.a();
        this.D.a();
        this.E.a();
        float f2 = 90.0f - (f / 2.0f);
        if (f2 < 45.0f) {
            float cos = (float) (this.a / Math.cos((f2 * 3.141592653589793d) / 180.0d));
            float tan = (float) (Math.tan((f2 * 3.141592653589793d) / 180.0d) * this.a);
            this.G.rotateDegressZ(-f2);
            this.H.x = 0.0f;
            this.H.y = cos;
            this.I.rotateDegressZ(-f2);
            this.B.rotateDegressZ(f2);
            this.E.x = 0.0f;
            this.E.y = cos;
            this.D.rotateDegressZ(f2);
            com.censivn.C3DEngine.e.a.c a = a(0);
            F().set(a.a, 1.0f, 1.0f);
            F().set(a.b, 0.0f, 1.0f);
            F().set(a.c, (this.a - tan) / this.a, 0.0f);
            F().set(a.d, 0.0f, 0.0f);
            com.censivn.C3DEngine.e.a.c a2 = a(1);
            F().set(a2.a, 0.0f, 1.0f);
            F().set(a2.b, 1.0f, 1.0f);
            F().set(a2.c, 0.0f, 0.0f);
            F().set(a2.d, (this.a - tan) / this.a, 0.0f);
        } else {
            float f3 = f / 2.0f;
            float tan2 = (float) (Math.tan((f3 * 3.141592653589793d) / 180.0d) * this.a);
            float cos2 = (float) (this.a / Math.cos((f3 * 3.141592653589793d) / 180.0d));
            this.G.rotateDegressZ((-90.0f) + f3);
            cc ccVar = this.H;
            this.I.x = 0.0f;
            ccVar.x = 0.0f;
            cc ccVar2 = this.H;
            this.I.y = cos2;
            ccVar2.y = cos2;
            this.B.rotateDegressZ(90.0f - f3);
            cc ccVar3 = this.D;
            this.E.x = 0.0f;
            ccVar3.x = 0.0f;
            cc ccVar4 = this.D;
            this.E.y = cos2;
            ccVar4.y = cos2;
            com.censivn.C3DEngine.e.a.c a3 = a(0);
            F().set(a3.a, 1.0f, 1.0f);
            F().set(a3.b, 0.0f, 1.0f);
            F().set(a3.c, 0.0f, (this.a - tan2) / this.a);
            F().set(a3.d, 0.0f, (this.a - tan2) / this.a);
            a3.m.x = 1.0f;
            com.censivn.C3DEngine.e.a.c a4 = a(1);
            F().set(a4.a, 0.0f, 1.0f);
            F().set(a4.b, 1.0f, 1.0f);
            F().set(a4.c, 0.0f, (this.a - tan2) / this.a);
            F().set(a4.d, 0.0f, (this.a - tan2) / this.a);
            a4.m.x = -1.0f;
        }
        j();
    }

    private void j() {
        com.censivn.C3DEngine.e.a.c a = a(0);
        E().setPX(a.a, this.F);
        E().setPX(a.b, this.G);
        E().setPX(a.c, this.H);
        E().setPX(a.d, this.I);
        com.censivn.C3DEngine.e.a.c a2 = a(1);
        E().setPX(a2.a, this.B);
        E().setPX(a2.b, this.C);
        E().setPX(a2.c, this.D);
        E().setPX(a2.d, this.E);
        ag();
        ah();
    }
}
