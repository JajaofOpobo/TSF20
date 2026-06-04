package com.tsf.shell.workspace3D.k;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.PositionNumber3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.element.info.LauncherAppWidgetInfo;
import com.censivn.C3DEngine.api.element.info.LauncherItem3DInfo;
import com.tsf.shell.theme.inside.ThemeShellDescription;
import com.tsf.shell.workspace3D.be;
import com.tsf.shell.workspace3D.bf;
import com.tsf.shell.workspace3D.g.ao;

/* loaded from: classes.dex */
public final class a extends j {
    public com.censivn.C3DEngine.e.b A;
    public String B;
    public com.tsf.shell.h.d C;
    public TextureElement D;
    public Object E;
    public Runnable F;
    private a G;
    private com.tsf.shell.workspace3D.a.d H;
    private com.tsf.shell.workspace3D.b.a I;
    private Runnable J;
    public boolean a = false;
    private boolean K = false;

    @Override // com.censivn.C3DEngine.b.r
    public final /* bridge */ /* synthetic */ com.censivn.C3DEngine.b.l aw() {
        return this.H;
    }

    public a(LauncherAppWidgetInfo launcherAppWidgetInfo, String str) {
        launcherAppWidgetInfo.setTarget(this);
        this.J = new b(this);
        this.E = new Object();
        this.G = this;
        o(false);
        a((LauncherItem3DInfo) launcherAppWidgetInfo);
        this.B = str;
        if (com.censivn.C3DEngine.a.q) {
            this.A = new com.censivn.C3DEngine.e.b(launcherAppWidgetInfo.width, launcherAppWidgetInfo.height, 1, 1, false);
            b(launcherAppWidgetInfo.cellX, launcherAppWidgetInfo.cellY);
        } else {
            this.A = new com.censivn.C3DEngine.e.b(launcherAppWidgetInfo.widthH, launcherAppWidgetInfo.heightH, 1, 1, false);
            b(launcherAppWidgetInfo.cellXH, launcherAppWidgetInfo.cellYH);
        }
        d(this.A);
        this.A.a((Boolean) false);
        this.H = new com.tsf.shell.workspace3D.a.d(this);
        l(false);
        j(true);
        this.I = bf.p();
        this.I.a(this);
    }

    @Override // com.tsf.shell.workspace3D.k.j
    public final void i_() {
        ao.i();
        LauncherItem3DInfo be = be();
        com.tsf.shell.h.l lVar = (com.tsf.shell.h.l) this.C.getLayoutParams();
        if (com.censivn.C3DEngine.a.q) {
            lVar.a = be.cellX;
            lVar.b = be.cellY;
            lVar.d = be.width;
            lVar.e = be.height;
            int[] iArr = {lVar.a, lVar.b, lVar.d, lVar.e};
            if (be.c(iArr)) {
                int i = iArr[0];
                lVar.a = i;
                be.cellX = i;
                int i2 = iArr[1];
                lVar.b = i2;
                be.cellY = i2;
                int i3 = iArr[2];
                lVar.d = i3;
                be.width = i3;
                int i4 = iArr[3];
                lVar.e = i4;
                be.height = i4;
            }
            b(be.cellX, be.cellY);
        } else {
            lVar.a = be.cellXH;
            lVar.b = be.cellYH;
            lVar.d = be.widthH;
            lVar.e = be.heightH;
            int[] iArr2 = {lVar.a, lVar.b, lVar.d, lVar.e};
            if (be.c(iArr2)) {
                int i5 = iArr2[0];
                lVar.a = i5;
                be.cellXH = i5;
                int i6 = iArr2[1];
                lVar.b = i6;
                be.cellYH = i6;
                int i7 = iArr2[2];
                lVar.d = i7;
                be.widthH = i7;
                int i8 = iArr2[3];
                lVar.e = i8;
                be.heightH = i8;
            }
            b(be.cellXH, be.cellYH);
        }
        aK();
        M().z = be.rotation;
    }

    public final void a(Bitmap bitmap) {
        if (this.D == null) {
            this.D = com.censivn.C3DEngine.a.f().a(bitmap, false);
            this.A.z().c(this.D);
            this.A.a((Boolean) true);
        } else if (bitmap.getWidth() != this.D.width || bitmap.getHeight() != this.D.height) {
            com.censivn.C3DEngine.a.f();
            com.censivn.C3DEngine.b.ad.c(this.D, bitmap);
            int i = this.D.width;
            int i2 = this.D.height;
            this.A.a_(i);
            this.A.h(i2);
            com.tsf.shell.h.l lVar = (com.tsf.shell.h.l) this.C.getLayoutParams();
            b(lVar.a, lVar.b);
        } else {
            com.censivn.C3DEngine.a.f();
            com.censivn.C3DEngine.b.ad.b(this.D, bitmap);
        }
        com.censivn.C3DEngine.a.d().g();
    }

    @Override // com.censivn.C3DEngine.b.r
    public final void c() {
        synchronized (this.E) {
            if (this.F != null) {
                this.F.run();
                this.F = null;
            }
        }
    }

    public final com.tsf.shell.workspace3D.a.d aH() {
        return this.H;
    }

    @Override // com.tsf.shell.workspace3D.k.j
    public final void aI() {
        com.censivn.C3DEngine.a.a().c(this.J);
    }

    public final void aJ() {
        this.A.b(0.0f);
        com.censivn.C3DEngine.g.u uVar = new com.censivn.C3DEngine.g.u();
        uVar.a(255);
        com.censivn.C3DEngine.g.s.a(this.A);
        com.censivn.C3DEngine.g.s.a(this.A, ThemeShellDescription.PAGE_PREVIEW_SELECT, uVar);
    }

    public final void aK() {
        c cVar = new c(this);
        com.censivn.C3DEngine.a.a();
        com.censivn.C3DEngine.b.w.a(cVar);
    }

    @Override // com.tsf.shell.workspace3D.k.j
    public final void a_() {
        this.K = false;
        com.censivn.C3DEngine.g.s.a(this);
        com.censivn.C3DEngine.g.u uVar = new com.censivn.C3DEngine.g.u();
        uVar.a(180);
        com.censivn.C3DEngine.g.s.a(this.A);
        com.censivn.C3DEngine.g.s.a(this.A, ThemeShellDescription.PAGE_PREVIEW_SELECT, uVar);
        a_(true);
        ao.a(this);
    }

    @Override // com.tsf.shell.workspace3D.k.j
    public final void b_() {
        a((Runnable) null);
        if (this.G != null) {
            this.G.a_(false);
        }
    }

    @Override // com.tsf.shell.workspace3D.k.j
    public final void o() {
        super.o();
        com.censivn.C3DEngine.g.u uVar = new com.censivn.C3DEngine.g.u();
        uVar.a(255);
        com.censivn.C3DEngine.g.s.a(this.A);
        com.censivn.C3DEngine.g.s.a(this.A, ThemeShellDescription.PAGE_PREVIEW_SELECT, uVar);
        if (!this.a) {
            com.tsf.shell.h.l lVar = (com.tsf.shell.h.l) this.C.getLayoutParams();
            int i = lVar.a;
            int i2 = lVar.b;
            float n_ = (i + (this.A.n_() / 2.0f)) - com.censivn.C3DEngine.a.n;
            float o_ = com.censivn.C3DEngine.a.o - (i2 + (this.A.o_() / 2.0f));
            d dVar = new d(this);
            dVar.f(n_);
            dVar.h(o_);
            com.censivn.C3DEngine.g.s.a(this);
            com.censivn.C3DEngine.g.s.a(this, 250, dVar);
        }
    }

    @Override // com.tsf.shell.workspace3D.k.j
    public final void a(com.tsf.shell.workspace3D.h.a aVar) {
        super.a(aVar);
        if (aVar != null && be().screen != aVar.aG()) {
            be().screen = aVar.aG();
            e eVar = new e(this, aVar);
            com.censivn.C3DEngine.a.a();
            com.censivn.C3DEngine.b.w.a(eVar);
        }
    }

    @Override // com.tsf.shell.workspace3D.k.j
    public final void e_() {
        super.e_();
        this.a = true;
        this.A.e(false);
    }

    @Override // com.tsf.shell.workspace3D.k.j, com.censivn.C3DEngine.b.v, com.censivn.C3DEngine.b.r
    public final void H() {
        this.I.b(this);
        f fVar = new f(this);
        com.censivn.C3DEngine.a.a();
        com.censivn.C3DEngine.b.w.a(fVar);
        com.censivn.C3DEngine.a.a().d(new g(this));
        if (this.A != null) {
            this.A.H();
            this.A = null;
        }
        com.censivn.C3DEngine.a.f().a(this.D);
        this.D = null;
        this.G = null;
        this.H = null;
        Q();
    }

    @Override // com.tsf.shell.workspace3D.k.j
    public final void p() {
        ao.i();
    }

    @Override // com.tsf.shell.workspace3D.k.j
    public final void q() {
    }

    private void b(int i, int i2) {
        L().x = a(i);
        L().y = e(i2);
    }

    public final float a(int i) {
        return (i + (this.A.n_() / 2.0f)) - com.censivn.C3DEngine.a.n;
    }

    public final float e(int i) {
        PositionNumber3d L = L();
        float o_ = com.censivn.C3DEngine.a.o - (i + (this.A.o_() / 2.0f));
        L.y = o_;
        return o_;
    }

    @Override // com.tsf.shell.workspace3D.k.j
    public final void h_() {
        com.censivn.C3DEngine.a.a().b(new h(this, this));
    }

    @Override // com.tsf.shell.workspace3D.k.j
    public final void aM() {
        com.censivn.C3DEngine.a.a().b(new i(this));
    }
}
