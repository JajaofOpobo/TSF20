package com.tsf.shell.workspace3D.h.a;

import android.graphics.Bitmap;
import android.view.KeyEvent;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.tsf.shell.at;
import com.tsf.shell.bd;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.ThemeShellDescription;

/* loaded from: classes.dex */
public class n extends com.censivn.C3DEngine.b.v implements at, j {
    public static TextureElement a;
    public com.censivn.C3DEngine.e.a.a A;
    public com.censivn.C3DEngine.e.a.a B;
    private com.censivn.C3DEngine.e.b F;
    private TextureElement G;
    private com.censivn.C3DEngine.e.b I;
    private v J;
    private com.censivn.C3DEngine.e.a.c K;
    private int L;
    private int M;
    private int N;
    private int O;
    private int P;
    private int Q;
    private int T;
    private int U;
    public boolean C = false;
    private boolean H = false;
    public int D = -1;
    private n E = this;
    private int R = 0;
    private int S = 0;

    public n(v vVar) {
        this.J = vVar;
        this.T = (int) (((this.J.a.length * 55) * com.censivn.C3DEngine.a.a) - (70.0f * com.censivn.C3DEngine.a.a));
        this.U = (int) (this.T + (com.censivn.C3DEngine.a.a * 100.0f));
        this.P = (int) (this.T + (com.censivn.C3DEngine.a.a * 100.0f));
        this.Q = (int) (-(this.T + (com.censivn.C3DEngine.a.a * 100.0f)));
        p();
        this.I = new com.censivn.C3DEngine.e.b(64.0f, 64.0f, 1, 1);
        this.F = new com.censivn.C3DEngine.e.b(64.0f, 64.0f, 2, 1);
        if (a == null) {
            Bitmap bitmap = ThemeManager.mix.page.getTheme().getBitmap(400);
            a = com.censivn.C3DEngine.a.f().a(bitmap, true);
            bitmap.recycle();
        }
        this.F.z().c(a);
        d(this.F);
        this.I.z().c(com.tsf.shell.workspace3D.i.a.b);
        this.I.a((Boolean) false);
        this.I.ar();
        this.I.a((com.censivn.C3DEngine.b.l) new o(this, this.I));
        this.F.d(this.I);
        int length = this.J.a.length;
        if (this.J.b == null) {
            this.A = new com.censivn.C3DEngine.e.a.a(length, 32, 128);
        } else {
            this.A = new com.censivn.C3DEngine.e.a.a(length + 1, 32, 128);
            int i = this.J.b[0];
            int i2 = this.J.b[1];
            int i3 = this.J.b[2];
            int i4 = this.J.b[3];
            this.K = this.A.a(length);
            this.K.m.y = 0.0f;
            this.K.b(i, i2, i3, i4);
            this.K.e();
        }
        for (int i5 = 0; i5 < length; i5++) {
            int[] iArr = this.J.a[i5];
            com.censivn.C3DEngine.e.a.c a2 = this.A.a(i5);
            a2.m.spY(0.0f);
            a2.c(1, 1);
            a2.c();
            a2.C.setAll(2.0f, 3.0f, 1.0f);
            b(i5, false);
            a2.l = new p(this, this.A, iArr);
        }
        Bitmap bitmap2 = ThemeManager.mix.page.getTheme().getBitmap(this.J.c);
        this.G = com.censivn.C3DEngine.a.f().a(bitmap2, true);
        bitmap2.recycle();
        this.A.z().c(this.G);
        this.A.a((Boolean) false);
        this.A.L().y = -1.0f;
        this.F.d(this.A);
        this.B = new com.censivn.C3DEngine.e.a.a(1, 32, 128);
        com.censivn.C3DEngine.e.a.c a3 = this.B.a(0);
        a3.m.spY(-1.0f);
        a3.c(1, 1);
        a3.c();
        q qVar = new q(this, this.B);
        a3.C.setAll(3.0f, 3.0f, 1.0f);
        a3.l = qVar;
        this.B.z().c(this.G);
        d(this.B);
        f(bd.c());
        aG();
    }

    public void q_() {
        Bitmap bitmap = ThemeManager.mix.page.getTheme().getBitmap(this.J.c);
        this.G = com.censivn.C3DEngine.a.f().a(this.G, bitmap);
        bitmap.recycle();
    }

    public final void k() {
        p();
        q();
    }

    private void p() {
        this.L = (int) (((-64.0f) * com.censivn.C3DEngine.a.a) + com.censivn.C3DEngine.a.e);
        this.M = (int) ((64.0f * com.censivn.C3DEngine.a.a) + com.censivn.C3DEngine.a.f);
        this.N = com.censivn.C3DEngine.a.e;
        this.O = com.censivn.C3DEngine.a.f;
    }

    @Override // com.tsf.shell.workspace3D.h.a.j
    public final boolean a() {
        return this.C;
    }

    public final void l() {
        if (!this.C) {
            if (this.D == 0) {
                this.F.E().spX(2, -31.0f);
                this.F.E().spX(5, -31.0f);
                this.F.ag();
            } else {
                this.F.E().spX(0, 31.0f);
                this.F.E().spX(3, 31.0f);
                this.F.ag();
            }
        }
    }

    public final void m() {
        if (!this.C) {
            if (this.D == 0) {
                this.F.E().pxX(2, -this.U);
                this.F.E().pxY(5, -this.U);
                this.F.ag();
            } else {
                this.F.E().pxX(0, this.U);
                this.F.E().pxX(3, this.U);
                this.F.ag();
            }
        }
    }

    public void f(int i) {
        if (this.D != i) {
            com.censivn.C3DEngine.g.s.a(this.F);
            com.censivn.C3DEngine.g.s.a(this);
            this.D = i;
            q();
        }
    }

    private void q() {
        if (this.D == 0) {
            if (this.H) {
                L().x = this.L;
                e(false);
            } else {
                L().x = this.N;
                e(true);
            }
            if (this.C) {
                this.F.L().x = this.P;
            } else {
                this.F.L().x = this.R;
            }
            this.I.L().spX(83.0f);
            if (this.K != null) {
                this.K.m.x = (int) ((-55.0f) * com.censivn.C3DEngine.a.a);
                this.K.c();
            }
            com.censivn.C3DEngine.e.a.c a2 = this.B.a(0);
            a2.m.spX(19.0f);
            a2.c();
            this.A.L().x = -this.T;
        } else {
            if (this.H) {
                L().x = this.M;
                e(false);
            } else {
                L().x = this.O;
                e(true);
            }
            if (this.C) {
                this.F.L().x = this.Q;
            } else {
                this.F.L().x = this.S;
            }
            this.I.L().spX(-75.0f);
            if (this.K != null) {
                this.K.m.x = (int) (55.0f * com.censivn.C3DEngine.a.a);
                this.K.c();
            }
            com.censivn.C3DEngine.e.a.c a3 = this.B.a(0);
            a3.m.spX(-18.0f);
            a3.c();
            this.A.L().x = this.T;
        }
        aG();
        int length = this.J.a.length;
        for (int i = 0; i < length; i++) {
            com.censivn.C3DEngine.e.a.c a4 = this.A.a(i);
            if (this.D == 0) {
                a4.m.spX((i * 55) - 23);
            } else {
                a4.m.spX((i * (-55)) + 23);
            }
            a4.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aG() {
        if (this.C) {
            if (this.D == 0) {
                this.F.E().spX(0, 49.0f);
                this.F.E().spX(3, 49.0f);
                this.F.E().spX(1, 0.0f);
                this.F.E().spX(4, 0.0f);
                this.F.F().setU(0, 1.0f);
                this.F.F().setU(3, 1.0f);
                this.F.F().setU(1, 0.234375f);
                this.F.F().setU(4, 0.234375f);
                this.F.E().pxX(2, -this.U);
                this.F.E().pxX(5, -this.U);
                this.F.F().setU(2, 0.0f);
                this.F.F().setU(5, 0.0f);
            } else {
                this.F.E().spX(2, -49.0f);
                this.F.E().spX(5, -49.0f);
                this.F.E().spX(1, 0.0f);
                this.F.E().spX(4, 0.0f);
                this.F.F().setU(2, 1.0f);
                this.F.F().setU(5, 1.0f);
                this.F.F().setU(1, 0.234375f);
                this.F.F().setU(4, 0.234375f);
                this.F.E().pxX(0, this.U);
                this.F.E().pxX(3, this.U);
                this.F.F().setU(0, 0.0f);
                this.F.F().setU(3, 0.0f);
            }
        } else if (this.D == 0) {
            this.F.E().spX(0, 49.0f);
            this.F.E().spX(3, 49.0f);
            this.F.E().spX(1, 0.0f);
            this.F.E().spX(4, 0.0f);
            this.F.F().setU(0, 1.0f);
            this.F.F().setU(3, 1.0f);
            this.F.F().setU(1, 0.234375f);
            this.F.F().setU(4, 0.234375f);
            this.F.E().spX(2, 0.0f);
            this.F.E().spX(5, 0.0f);
            this.F.F().setU(2, 0.0f);
            this.F.F().setU(5, 0.0f);
        } else {
            this.F.E().spX(2, -49.0f);
            this.F.E().spX(5, -49.0f);
            this.F.E().spX(1, 0.0f);
            this.F.E().spX(4, 0.0f);
            this.F.F().setU(2, 1.0f);
            this.F.F().setU(5, 1.0f);
            this.F.F().setU(1, 0.234375f);
            this.F.F().setU(4, 0.234375f);
            this.F.E().spX(0, 0.0f);
            this.F.E().spX(3, 0.0f);
            this.F.F().setU(0, 0.0f);
            this.F.F().setU(3, 0.0f);
        }
        this.F.ag();
        this.F.ah();
    }

    public final void a(int i, boolean z) {
        if (z) {
            this.B.a(0).a(this.J.a[i][2], this.J.a[i][3]);
        } else {
            this.B.a(0).a(this.J.a[i][0], this.J.a[i][1]);
        }
    }

    public void j() {
        this.H = true;
        e(false);
        com.censivn.C3DEngine.g.u uVar = new com.censivn.C3DEngine.g.u();
        uVar.a(0);
        com.censivn.C3DEngine.g.s.a(this);
        com.censivn.C3DEngine.g.s.a(this, 250, uVar);
    }

    public final void n() {
        this.H = false;
        r rVar = new r(this);
        rVar.a(255);
        com.censivn.C3DEngine.g.s.a(this);
        com.censivn.C3DEngine.g.s.a(this, 250, rVar);
    }

    static /* synthetic */ void b(n nVar) {
        if (nVar.C) {
            return;
        }
        nVar.A.a((Boolean) true);
        nVar.C = true;
        nVar.aG();
        nVar.i(nVar.C);
        nVar.e(false);
        s sVar = new s(nVar);
        if (nVar.D == 0) {
            sVar.f(nVar.P);
        } else {
            sVar.f(nVar.Q);
        }
        com.censivn.C3DEngine.g.s.a(nVar.F);
        com.censivn.C3DEngine.g.s.a(nVar.F, 250, sVar);
    }

    public void i(boolean z) {
    }

    public boolean e(int i) {
        return true;
    }

    public void a(float f, boolean z) {
    }

    public void h(boolean z) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aH() {
        if (o()) {
            com.tsf.shell.aq.b(this);
        }
        if (this.C) {
            this.C = false;
            e(false);
            t tVar = new t(this);
            if (this.D == 0) {
                tVar.f(this.R);
            } else {
                tVar.f(this.S);
            }
            com.censivn.C3DEngine.g.s.a(this.F);
            com.censivn.C3DEngine.g.s.a(this.F, 250, tVar);
            u uVar = new u(this);
            uVar.a(0);
            com.censivn.C3DEngine.g.s.a(this.I);
            com.censivn.C3DEngine.g.s.a(this.I, 250, uVar);
        }
    }

    static /* synthetic */ void d(n nVar) {
        nVar.I.a((Boolean) true);
        nVar.I.b(0.0f);
        nVar.I.M().z = 180.0f;
        com.censivn.C3DEngine.g.u uVar = new com.censivn.C3DEngine.g.u();
        uVar.a(255);
        uVar.e(0.0f);
        com.censivn.C3DEngine.g.s.a(nVar.I);
        com.censivn.C3DEngine.g.s.a(nVar.I, ThemeShellDescription.PAGE_PREVIEW_SELECT, uVar);
    }

    public final void b(int i, boolean z) {
        com.censivn.C3DEngine.e.a.c a2 = this.A.a(i);
        int[] iArr = this.J.a[i];
        if (z) {
            a2.a(iArr[2], iArr[3]);
        } else {
            a2.a(iArr[0], iArr[1]);
        }
    }

    public boolean o() {
        return true;
    }

    @Override // com.tsf.shell.at
    public final void a(int i) {
        if (i == 4 && au()) {
            aH();
        }
    }

    @Override // com.tsf.shell.at
    public final void a(int i, KeyEvent keyEvent) {
    }
}
