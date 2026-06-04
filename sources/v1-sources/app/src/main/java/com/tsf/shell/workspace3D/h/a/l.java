package com.tsf.shell.workspace3D.h.a;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.ThemeShellDescription;

/* loaded from: classes.dex */
public class l extends n {
    private l E;
    private com.censivn.C3DEngine.e.b F;
    private com.censivn.C3DEngine.e.a.a G;
    private int[][] H;
    private int I;
    private int J;
    private TextureElement K;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public l(int i, int i2) {
        super(r0);
        v vVar = new v();
        int[] iArr = new int[5];
        iArr[3] = 1;
        vVar.a = new int[][]{iArr, new int[]{2, 2, 2, 3, 1}, new int[]{0, 2, 0, 3, 2}, new int[]{1, 0, 1, 1, 3}, new int[]{1, 2, 1, 3, 4}, new int[]{2, 0, 2, 1, 5}};
        vVar.c = ThemeShellDescription.APP_PAGE_TRANSITION_ICON;
        vVar.b = new int[]{3, 0, 1, 1};
        int[] iArr2 = new int[5];
        iArr2[3] = 1;
        this.H = new int[][]{iArr2, new int[]{1, 0, 1, 1, 1}};
        this.E = this;
        a(i, false);
        b(i, true);
        this.I = i;
        this.J = i2;
        this.F = new com.censivn.C3DEngine.e.b(64.0f, 64.0f, 2, 1);
        this.F.z().c(a);
        this.F.L().y = (-70.0f) * com.censivn.C3DEngine.a.a;
        this.G = new com.censivn.C3DEngine.e.a.a(2, 32, 64);
        int length = this.H.length;
        for (int i3 = 0; i3 < length; i3++) {
            com.censivn.C3DEngine.e.a.c a = this.G.a(i3);
            a.c(1, 1);
            a.c();
            a.C.setAll(2.0f, 3.0f, 1.0f);
            if (this.J == i3) {
                c(i3, true);
            } else {
                c(i3, false);
            }
            a.l = new m(this, this, i3);
        }
        Bitmap bitmap = ThemeManager.mix.page.getTheme().getBitmap(ThemeShellDescription.APP_PAGE_TRANSITION3D_ICON);
        this.K = com.censivn.C3DEngine.a.f().a(bitmap, true);
        this.G.z().c(this.K);
        bitmap.recycle();
        this.F.a((Boolean) false);
        this.F.d(this.G);
        d(this.F);
        p();
    }

    @Override // com.tsf.shell.workspace3D.h.a.n
    public final void a(float f, boolean z) {
        if (z) {
            this.F.a((Boolean) true);
            if (this.D == 0) {
                this.F.L().x = 90.0f * com.censivn.C3DEngine.a.a * f;
                return;
            } else {
                this.F.L().x = (-90.0f) * com.censivn.C3DEngine.a.a * f;
                return;
            }
        }
        if (this.D == 0) {
            this.F.L().x = (-70.0f) * com.censivn.C3DEngine.a.a * f;
        } else {
            this.F.L().x = 70.0f * com.censivn.C3DEngine.a.a * f;
        }
    }

    @Override // com.tsf.shell.workspace3D.h.a.n
    public final void h(boolean z) {
        if (!z) {
            this.F.a((Boolean) false);
        }
    }

    @Override // com.tsf.shell.workspace3D.h.a.n
    public final void f(int i) {
        if (this.D == i || this.F == null) {
            super.f(i);
        } else {
            super.f(i);
            p();
        }
    }

    private void p() {
        if (this.D == 0) {
            this.F.E().spX(0, 31.0f);
            this.F.E().spX(3, 31.0f);
            this.F.F().setU(0, 0.984375f);
            this.F.F().setU(3, 0.984375f);
            this.F.E().spX(2, -90.0f);
            this.F.E().spX(5, -90.0f);
            this.F.F().setU(2, 0.1f);
            this.F.F().setU(5, 0.1f);
            if (!this.C) {
                this.F.L().x = (-32.0f) * com.censivn.C3DEngine.a.a;
            } else {
                this.F.L().x = 90.0f * com.censivn.C3DEngine.a.a;
            }
        } else {
            this.F.E().spX(2, -31.0f);
            this.F.E().spX(5, -31.0f);
            this.F.F().setU(2, 0.984375f);
            this.F.F().setU(5, 0.984375f);
            this.F.E().spX(0, 90.0f);
            this.F.E().spX(3, 90.0f);
            this.F.F().setU(0, 0.1f);
            this.F.F().setU(3, 0.1f);
            if (!this.C) {
                this.F.L().x = 32.0f * com.censivn.C3DEngine.a.a;
            } else {
                this.F.L().x = (-90.0f) * com.censivn.C3DEngine.a.a;
            }
        }
        int length = this.H.length;
        for (int i = 0; i < length; i++) {
            com.censivn.C3DEngine.e.a.c a = this.G.a(i);
            if (this.D == 0) {
                a.m.spX((i * 55) - 61);
            } else {
                a.m.spX(((-i) * 55) + 61);
            }
            a.c();
        }
        this.G.a(1.0f, 3.0f, 1.0f);
        this.F.ag();
        this.F.ah();
    }

    @Override // com.tsf.shell.workspace3D.h.a.n
    public final void q_() {
        super.q_();
        Bitmap bitmap = ThemeManager.mix.page.getTheme().getBitmap(ThemeShellDescription.APP_PAGE_TRANSITION3D_ICON);
        this.K = com.censivn.C3DEngine.a.f().a(this.K, bitmap);
        bitmap.recycle();
    }

    public void g(int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i, boolean z) {
        com.censivn.C3DEngine.e.a.c a = this.G.a(i);
        int[] iArr = this.H[i];
        if (z) {
            a.a(iArr[2], iArr[3]);
        } else {
            a.a(iArr[0], iArr[1]);
        }
    }

    @Override // com.tsf.shell.workspace3D.h.a.n
    public boolean e(int i) {
        if (i == this.I) {
            return false;
        }
        b(this.I, false);
        this.I = i;
        b(this.I, true);
        a(i, false);
        return true;
    }
}
