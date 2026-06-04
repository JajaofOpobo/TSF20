package com.tsf.shell.workspace3D.h;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.shell.VPage;
import com.censivn.C3DEngine.common.renderer.MatrixStack;
import com.tsf.shell.R;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.ThemeParser;
import com.tsf.shell.theme.inside.ThemeShellDescription;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class a extends com.censivn.C3DEngine.b.v implements com.tsf.shell.bj {
    public static com.tsf.shell.workspace3D.c.a C;
    private static com.censivn.C3DEngine.e.b O;
    protected com.tsf.shell.h.j A;
    protected com.tsf.shell.workspace3D.g.c.o B;
    protected com.tsf.shell.workspace3D.k.o E;
    public com.tsf.shell.workspace3D.e.a.h H;
    private com.censivn.C3DEngine.e.b N;
    private com.censivn.C3DEngine.e.b.a P;
    private com.censivn.C3DEngine.e.b.a Q;
    private VPage R;
    private com.censivn.C3DEngine.b.l U;
    private com.censivn.C3DEngine.b.l V;
    private a W;
    private a X;
    private int Y;
    private int Z;
    protected a a;
    private ArrayList ab;
    private com.censivn.C3DEngine.g.b.a ae;
    private com.tsf.shell.workspace3D.h.b.g ah;
    private static TextureElement J = null;
    private static TextureElement K = null;
    private static TextureElement L = null;
    private static TextureElement M = null;
    private static int S = 0;
    private static int T = 0;
    private TextureElement I = null;
    public float D = 0.0f;
    private boolean aa = false;
    private boolean ac = false;
    private boolean ad = false;
    private float af = 255.0f;
    private boolean ag = true;
    boolean F = false;
    public ArrayList G = new ArrayList();

    public a() {
        bl();
        this.H = new b(this, this.G);
        this.ab = new ArrayList();
        this.R = new VPage();
        this.R.vTarget = this;
        this.ae = new com.censivn.C3DEngine.g.b.b();
        this.a = this;
        com.tsf.shell.bd.a(this);
        this.B = new c(this);
        this.E = new com.tsf.shell.workspace3D.k.o(this.B, 1);
        d(this.B);
        this.P = new com.censivn.C3DEngine.e.b.a(l.a, l.b, new com.censivn.C3DEngine.e.b.b(60.0f, 68.0f, 60.0f, 68.0f, 128.0f, 128.0f));
        this.Q = new com.censivn.C3DEngine.e.b.a(l.a, l.b, new com.censivn.C3DEngine.e.b.b(4.0f, 124.0f, 4.0f, 124.0f, 128.0f, 128.0f));
        this.Q.a(com.censivn.C3DEngine.a.l, com.censivn.C3DEngine.a.m);
        this.Q.b(true);
        this.Q.L().z = (-200.0f) * com.censivn.C3DEngine.a.b;
        ThemeShellDescription theme = ThemeManager.mix.page.getTheme();
        if (L == null) {
            Bitmap bitmap = theme.getBitmap(ThemeShellDescription.PAGE_PREVIEW_BACKGROUND);
            L = com.censivn.C3DEngine.a.f().a(bitmap, true);
            bitmap.recycle();
        }
        this.Q.z().c(L);
        if (J == null) {
            Bitmap bitmap2 = theme.getBitmap(ThemeShellDescription.PAGE_PREVIEW_UNSELECT);
            J = com.censivn.C3DEngine.a.f().a(bitmap2, true);
            bitmap2.recycle();
        }
        if (K == null) {
            Bitmap bitmap3 = theme.getBitmap(ThemeShellDescription.PAGE_PREVIEW_SELECT);
            K = com.censivn.C3DEngine.a.f().a(bitmap3, true);
            bitmap3.recycle();
        }
        if (M == null) {
            Bitmap bitmap4 = theme.getBitmap(ThemeShellDescription.PAGE_PREVIEW_HOMEPAGE_MARK);
            M = com.censivn.C3DEngine.a.f().a(bitmap4, true);
            bitmap4.recycle();
        }
        if (O == null) {
            com.censivn.C3DEngine.e.b bVar = new com.censivn.C3DEngine.e.b(64.0f, 64.0f);
            O = bVar;
            bVar.z().c(M);
            O.L().x = ((-l.a) / 2) + 45;
            O.L().y = (l.b / 2) - 45;
        }
        this.P.z().c(J);
        this.N = new com.censivn.C3DEngine.e.b(com.censivn.C3DEngine.a.l, com.censivn.C3DEngine.a.m, 1, 1, false);
        this.N.F().set(0, 1.0f, 0.0f);
        this.N.F().set(1, 0.0f, 0.0f);
        this.N.F().set(2, 1.0f, 1.0f);
        this.N.F().set(3, 0.0f, 1.0f);
        d(this.N);
    }

    @Override // com.censivn.C3DEngine.b.v, com.censivn.C3DEngine.b.r
    public final void f() {
        super.f();
    }

    public final void i() {
        com.tsf.shell.bd.a(this);
    }

    public final VPage j() {
        return this.R;
    }

    public final void b(com.censivn.C3DEngine.b.l lVar) {
        this.U = lVar;
    }

    public final void c(com.censivn.C3DEngine.b.l lVar) {
        this.V = lVar;
    }

    public final com.tsf.shell.workspace3D.k.o k() {
        return this.E;
    }

    public final com.censivn.C3DEngine.b.r l() {
        return this.P;
    }

    public final void m() {
        this.P.a(this.U);
    }

    public final void n() {
        this.P.a(this.V);
    }

    public final void h(boolean z) {
        if (z) {
            com.censivn.C3DEngine.e.b c = com.tsf.shell.workspace3D.bf.j().e().c();
            c.Q();
            d(c);
        } else {
            com.tsf.shell.workspace3D.bf.j().e().c().Q();
        }
        this.aa = z;
    }

    public final boolean o() {
        return this.aa;
    }

    public final void a(int i) {
        this.Z = i;
    }

    public final int p() {
        return this.Z;
    }

    public final com.tsf.shell.h.j q() {
        return this.A;
    }

    public final void e(int i) {
        this.Y = i;
    }

    public final int aG() {
        return this.Y;
    }

    @Override // com.censivn.C3DEngine.b.v, com.censivn.C3DEngine.b.r
    public final void H() {
        com.tsf.shell.bd.b(this);
        Iterator it = ((ArrayList) this.B.aD().clone()).iterator();
        while (it.hasNext()) {
            com.censivn.C3DEngine.b.r rVar = (com.censivn.C3DEngine.b.r) it.next();
            if (rVar instanceof com.tsf.shell.workspace3D.k.j) {
                com.tsf.shell.workspace3D.bf.l().a((com.tsf.shell.workspace3D.k.j) rVar);
            }
        }
        this.E.c();
        this.ab.clear();
        if (this.I != null) {
            com.censivn.C3DEngine.a.f().a(this.I);
            this.I = null;
            this.N.z().b();
        }
    }

    @Override // com.tsf.shell.bj
    public void b_(int i, int i2, int i3, int i4) {
        this.P.a(l.a, l.b);
        O.L().x = ((-l.a) / 2) + 45;
        O.L().y = (l.b / 2) - 45;
        this.N.a_(com.censivn.C3DEngine.a.l);
        this.N.h(com.censivn.C3DEngine.a.m);
        this.Q.a(com.censivn.C3DEngine.a.l, com.censivn.C3DEngine.a.m);
        Iterator it = this.B.aD().iterator();
        while (it.hasNext()) {
            com.censivn.C3DEngine.b.r rVar = (com.censivn.C3DEngine.b.r) it.next();
            if (rVar instanceof com.tsf.shell.workspace3D.k.j) {
                com.tsf.shell.workspace3D.k.j jVar = (com.tsf.shell.workspace3D.k.j) rVar;
                jVar.a(com.censivn.C3DEngine.a.l, com.censivn.C3DEngine.a.m);
                jVar.i_();
            }
        }
    }

    public static void aH() {
        ThemeShellDescription theme = ThemeManager.mix.page.getTheme();
        Bitmap bitmap = theme.getBitmap(ThemeShellDescription.PAGE_PREVIEW_BACKGROUND);
        L = com.censivn.C3DEngine.a.f().a(L, bitmap);
        bitmap.recycle();
        Bitmap bitmap2 = theme.getBitmap(ThemeShellDescription.PAGE_PREVIEW_UNSELECT);
        J = com.censivn.C3DEngine.a.f().a(J, bitmap2);
        bitmap2.recycle();
        Bitmap bitmap3 = theme.getBitmap(ThemeShellDescription.PAGE_PREVIEW_SELECT);
        K = com.censivn.C3DEngine.a.f().a(K, bitmap3);
        bitmap3.recycle();
        Bitmap bitmap4 = theme.getBitmap(ThemeShellDescription.PAGE_PREVIEW_HOMEPAGE_MARK);
        M = com.censivn.C3DEngine.a.f().a(M, bitmap4);
        bitmap4.recycle();
    }

    public static void aI() {
        if (C != null) {
            com.tsf.shell.workspace3D.c.b.a(C);
        }
        if (l.a > l.b) {
            S = (int) (com.censivn.C3DEngine.a.l * 0.4f);
            T = (l.b * S) / l.a;
        } else {
            T = (int) (com.censivn.C3DEngine.a.m * 0.4f);
            S = (l.a * T) / l.b;
        }
        C = com.tsf.shell.workspace3D.c.b.a(S, T);
    }

    public final void i(boolean z) {
        if (A()) {
            MatrixStack.glPushMatrix();
            e();
            if (z) {
                this.Q.f();
                this.N.f();
            } else {
                this.N.f();
                this.Q.f();
            }
            MatrixStack.glPopMatrix();
        }
    }

    public static void aJ() {
    }

    public final void aK() {
        this.af = this.Q.I();
    }

    public final float aL() {
        return this.af;
    }

    public final void g(float f) {
        this.Q.b(f);
    }

    @Override // com.censivn.C3DEngine.b.r
    public final void aA() {
        aP();
        com.tsf.shell.workspace3D.bf.j().n().b(this, this.ae);
    }

    @Override // com.censivn.C3DEngine.b.r
    public final void az() {
        aO();
        com.tsf.shell.workspace3D.bf.j().n().a(this, this.ae);
    }

    public final void aM() {
        O.Q();
        d(O);
    }

    public static void aN() {
        O.Q();
    }

    public final void aO() {
        this.P.z().d();
        this.P.z().c(K);
        ax();
    }

    public final void aP() {
        this.P.z().d();
        this.P.z().c(J);
    }

    public final void aQ() {
        this.P.Q();
        com.censivn.C3DEngine.g.u uVar = new com.censivn.C3DEngine.g.u();
        uVar.j(1.0f);
        uVar.k(1.0f);
        com.censivn.C3DEngine.g.s.a(this.N);
        com.censivn.C3DEngine.g.s.a(this.N, 350, uVar);
    }

    public final void aR() {
        this.P.Q();
    }

    private void bn() {
        if (this.P.P() == null) {
            a(this.P, 0);
        }
    }

    public final void j(boolean z) {
        bn();
        this.N.N().setAll(1.0f, 1.0f, 1.0f);
        aT();
        if (z) {
            com.censivn.C3DEngine.g.u uVar = new com.censivn.C3DEngine.g.u();
            uVar.j(0.28f);
            uVar.k(0.28f);
            com.censivn.C3DEngine.g.s.a(this.N);
            com.censivn.C3DEngine.g.s.a(this.N, 350, uVar);
            return;
        }
        this.N.N().x = 0.28f;
        this.N.N().y = 0.28f;
    }

    public final com.censivn.C3DEngine.b.r aS() {
        return this.N;
    }

    public final void k(boolean z) {
        this.N.b(z);
    }

    public final void l(boolean z) {
        this.ag = true;
        if (z) {
            aX();
        }
        this.B.a((Boolean) false);
        bd();
        if (this.I == null) {
            this.N.a((Boolean) false);
        } else {
            this.N.a((Boolean) true);
        }
    }

    public final void aT() {
        if (!this.ag) {
            this.ag = true;
            this.B.a((Boolean) false);
            bd();
            aX();
            if (this.I == null) {
                this.N.a((Boolean) false);
                return;
            } else {
                this.N.a((Boolean) true);
                return;
            }
        }
        if (this.I != null && !this.N.A()) {
            this.N.a((Boolean) true);
        }
    }

    public final void aU() {
        if (this.ag) {
            this.ag = false;
            be();
            this.N.a((Boolean) false);
            this.B.a((Boolean) true);
        }
    }

    public final void aV() {
        this.ac = true;
    }

    public final void aW() {
        if (this.ac) {
            aX();
        }
    }

    public final void aX() {
        if (aY() == 0 && this.Y != -1) {
            if (this.I != null) {
                com.censivn.C3DEngine.a.f().a(this.I);
                this.I = null;
                this.N.z().d();
            }
            this.ac = false;
            return;
        }
        Number3d clone = L().m2clone();
        L().setAll(0.0f, 0.0f, 0.0f);
        if (this.I == null || this.I.width != S || this.I.height != T) {
            if (this.I != null) {
                com.censivn.C3DEngine.a.f().a(this.I);
                this.I = null;
                this.N.z().d();
            }
            this.I = com.censivn.C3DEngine.a.f().a(S, T);
            this.N.z().c(this.I);
        }
        com.tsf.shell.workspace3D.c.b.a(C, this.I);
        GLES20.glBindFramebuffer(36160, C.a);
        GLES20.glViewport(0, 0, S, T);
        GLES20.glClear(ThemeParser.TYPE_WALLPAPER);
        boolean A = this.B.A();
        this.B.a((Boolean) true);
        this.B.T();
        this.B.a(Boolean.valueOf(A));
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glViewport(0, 0, com.censivn.C3DEngine.a.l, com.censivn.C3DEngine.a.m);
        L().setAllFrom(clone);
        this.ac = false;
    }

    public final void g(com.censivn.C3DEngine.b.r rVar) {
        if (rVar instanceof com.tsf.shell.workspace3D.k.j) {
            com.tsf.shell.workspace3D.k.j jVar = (com.tsf.shell.workspace3D.k.j) rVar;
            jVar.a(this);
            if (jVar.be() != null) {
                jVar.be().screen = this.Y;
                jVar.be().container = -1;
            }
        }
        this.B.d(rVar);
        this.ac = true;
    }

    public final void b(com.censivn.C3DEngine.b.r rVar, int i) {
        if (rVar instanceof com.tsf.shell.workspace3D.k.j) {
            com.tsf.shell.workspace3D.k.j jVar = (com.tsf.shell.workspace3D.k.j) rVar;
            jVar.a(this);
            if (jVar.be() != null) {
                jVar.be().screen = this.Y;
            }
        }
        this.B.a(rVar, i);
        this.ac = true;
    }

    public final void h(com.censivn.C3DEngine.b.r rVar) {
        if (this.B.aD().contains(rVar)) {
            this.B.e(rVar);
            if (rVar instanceof com.tsf.shell.workspace3D.k.j) {
                ((com.tsf.shell.workspace3D.k.j) rVar).aW();
            }
            this.ac = true;
        }
    }

    public final boolean i(com.censivn.C3DEngine.b.r rVar) {
        return this.B.aD().contains(rVar);
    }

    public final int aY() {
        Iterator it = this.B.aD().iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((com.censivn.C3DEngine.b.r) it.next()) instanceof com.tsf.shell.workspace3D.k.j) {
                i++;
            }
        }
        return i;
    }

    public final ArrayList aZ() {
        return this.B.aD();
    }

    public final int j(com.censivn.C3DEngine.b.r rVar) {
        return this.B.f(rVar);
    }

    public final com.censivn.C3DEngine.b.v ba() {
        return this.B;
    }

    public final void bb() {
        this.F = true;
        if (this.A != null) {
            d dVar = new d(this);
            com.censivn.C3DEngine.a.a();
            com.censivn.C3DEngine.b.w.a(dVar);
        }
    }

    public final void bc() {
        this.F = false;
        this.D = 0.0f;
        if (this.A != null) {
            e eVar = new e(this);
            com.censivn.C3DEngine.a.a();
            com.censivn.C3DEngine.b.w.a(eVar);
        }
    }

    public void bd() {
        if (!this.ad) {
            this.ad = true;
            e(false);
            this.B.aR();
            Iterator it = this.ab.iterator();
            while (it.hasNext()) {
                ((f) it.next()).d();
            }
        }
    }

    public void be() {
        if (this.ad) {
            this.ad = false;
            e(true);
            Iterator it = this.ab.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public final boolean bf() {
        return this.ad;
    }

    public final void f(int i) {
        Iterator it = this.B.aD().iterator();
        while (it.hasNext()) {
            com.censivn.C3DEngine.b.r rVar = (com.censivn.C3DEngine.b.r) it.next();
            if (rVar instanceof com.tsf.shell.workspace3D.k.j) {
                ((com.tsf.shell.workspace3D.k.j) rVar).f(i);
            }
        }
    }

    public final void a(a aVar) {
        this.X = aVar;
    }

    public final a bg() {
        return this.X;
    }

    public final void b(a aVar) {
        this.W = aVar;
    }

    public final a bh() {
        return this.W;
    }

    public final void m(boolean z) {
        if (z) {
            if (P() == null) {
                com.tsf.shell.workspace3D.bf.j().q().d(this);
                aU();
                this.P.Q();
                return;
            }
            return;
        }
        if (P() != null) {
            Q();
            aT();
            bn();
            bo();
        }
    }

    private void bo() {
        Number3d N = N();
        N().y = 1.0f;
        N.x = 1.0f;
        M().y = 0.0f;
        M().z = 0.0f;
    }

    public final void bi() {
        a(this, 0.0f, true, true);
    }

    public final void a(a aVar, float f, boolean z, boolean z2) {
        while (true) {
            if (this.D * f < 0.0f) {
                if (f < 0.0f) {
                    if (this.X != null && this.X != aVar) {
                        this.X.m(false);
                    }
                } else if (this.W != null && this.W != aVar) {
                    this.W.m(false);
                }
            }
            this.D = f;
            if (f < 1.0f && f > -1.0f) {
                this.m(true);
                Iterator it = this.B.aD().iterator();
                while (it.hasNext()) {
                    if (((com.censivn.C3DEngine.b.r) it.next()) instanceof com.tsf.shell.workspace3D.k.j) {
                        com.tsf.shell.workspace3D.k.j.aU();
                    }
                }
                if (this.ah != j.b) {
                    this.ah = j.b;
                    this.bo();
                }
                this.ah.a(this, f);
            } else {
                this.m(false);
            }
            if (z && this.W != null && this.W != aVar) {
                this.W.a(aVar, f + 1.0f, true, false);
            }
            if (z2 && this.X != null && this.X != aVar) {
                this = this.X;
                f -= 1.0f;
                z2 = true;
                z = false;
            } else {
                return;
            }
        }
    }

    public void bj() {
        com.censivn.C3DEngine.b.r rVar = com.censivn.C3DEngine.b.m.d().f().b;
        Iterator it = this.B.aD().iterator();
        while (it.hasNext()) {
            com.censivn.C3DEngine.b.r rVar2 = (com.censivn.C3DEngine.b.r) it.next();
            if ((rVar2 instanceof com.tsf.shell.workspace3D.k.j) && rVar2 != rVar) {
                com.censivn.C3DEngine.g.u uVar = new com.censivn.C3DEngine.g.u();
                uVar.h((com.censivn.C3DEngine.a.g - (com.censivn.C3DEngine.a.b * 200.0f)) + (((float) Math.random()) * 200.0f * com.censivn.C3DEngine.a.b));
                uVar.f(0.0f);
                uVar.d(h(50));
                uVar.e(h(180));
                uVar.c(h(50));
                uVar.j(0.0f);
                uVar.k(0.0f);
                com.censivn.C3DEngine.g.s.a(rVar2);
                com.censivn.C3DEngine.g.s.a(rVar2, 250, uVar);
            }
        }
    }

    private static float h(int i) {
        return (float) (i - ((i * 2) * Math.random()));
    }

    public void bk() {
        Iterator it = this.B.aD().iterator();
        while (it.hasNext()) {
            com.censivn.C3DEngine.b.r rVar = (com.censivn.C3DEngine.b.r) it.next();
            if (rVar instanceof com.tsf.shell.workspace3D.k.j) {
                com.tsf.shell.workspace3D.k.j jVar = (com.tsf.shell.workspace3D.k.j) rVar;
                com.censivn.C3DEngine.g.u uVar = new com.censivn.C3DEngine.g.u();
                uVar.b((int) (Math.random() * 250.0d));
                if (jVar instanceof com.tsf.shell.workspace3D.k.a) {
                    com.tsf.shell.workspace3D.k.a aVar = (com.tsf.shell.workspace3D.k.a) jVar;
                    if (com.censivn.C3DEngine.a.q) {
                        uVar.f(aVar.a(jVar.be().cellX));
                        uVar.h(aVar.e(jVar.be().cellY));
                        uVar.e(0.0f);
                    } else {
                        uVar.f(aVar.a(jVar.be().cellXH));
                        uVar.h(aVar.e(jVar.be().cellYH));
                        uVar.e(0.0f);
                    }
                } else if (com.censivn.C3DEngine.a.q) {
                    uVar.f(jVar.be().cellX);
                    uVar.h(jVar.be().cellY);
                    uVar.e(jVar.be().rotation);
                } else {
                    uVar.f(jVar.be().cellXH);
                    uVar.h(jVar.be().cellYH);
                    uVar.e(jVar.be().rotationH);
                }
                uVar.j(1.0f);
                uVar.k(1.0f);
                uVar.c(0.0f);
                uVar.d(0.0f);
                uVar.a(com.censivn.C3DEngine.g.a.a);
                com.censivn.C3DEngine.g.s.a(rVar);
                com.censivn.C3DEngine.g.s.a(rVar, 400, uVar);
            }
        }
    }

    @Override // com.tsf.shell.bj
    public void b(int i) {
    }

    @Override // com.tsf.shell.bj
    public void p_() {
    }

    public void bl() {
    }

    public final void g(int i) {
        switch (i) {
            case 0:
                com.tsf.shell.workspace3D.bf.h().c();
                break;
            case 1:
                com.tsf.shell.workspace3D.bf.j().K();
                break;
            case 2:
                com.tsf.shell.workspace3D.bf.j();
                l.d(this);
                break;
            case 4:
                com.tsf.shell.workspace3D.bf.j().a(this);
                com.tsf.shell.au.a(R.string.notic_set_homepage_success);
                break;
            case 5:
                com.tsf.shell.workspace3D.bf.j();
                if (this instanceof g) {
                    com.tsf.shell.au.a(R.string.pop_menu_delete_notic, R.string.public_action_ok, new i((g) this), null);
                    break;
                }
                break;
            case 6:
                com.tsf.shell.workspace3D.bf.j().F();
                break;
            case R.styleable.CellLayout_longAxisCells /* 7 */:
                com.tsf.shell.workspace3D.bf.j().k().E.a();
                break;
        }
    }

    public void bm() {
    }
}
