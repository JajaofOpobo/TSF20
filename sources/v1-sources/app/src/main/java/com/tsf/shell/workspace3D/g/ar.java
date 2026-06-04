package com.tsf.shell.workspace3D.g;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.element.info.LauncherItem3DInfo;
import com.tsf.shell.bm;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.ThemeShellDescription;
import com.tsf.shell.workspace3D.be;

/* loaded from: classes.dex */
final class ar extends com.censivn.C3DEngine.e.b.a {
    public static int a = 120;
    private int C;
    private int D;
    private TextureElement E;
    private ar F;
    private ao G;
    private com.censivn.C3DEngine.e.b H;
    private com.censivn.C3DEngine.e.b I;
    private com.censivn.C3DEngine.e.b J;
    private com.censivn.C3DEngine.e.b K;
    private com.censivn.C3DEngine.e.c L;
    private com.censivn.C3DEngine.g.b.b M;
    private int N;
    private float O;
    private float P;
    private float Q;
    private float R;
    private int[] S;

    public ar(com.censivn.C3DEngine.e.b.b bVar, ao aoVar) {
        super(500.0f, 500.0f, bVar);
        this.N = 3;
        this.S = new int[4];
        this.F = this;
        this.G = aoVar;
        this.M = new com.censivn.C3DEngine.g.b.b();
        ThemeShellDescription themeShellDescription = ThemeManager.getInstance().getCurrentThemeDescription().shell;
        Bitmap bitmap = themeShellDescription.getBitmap(ThemeShellDescription.WIDGET_RESIZE_MATCH_BUTTON);
        TextureElement a2 = com.censivn.C3DEngine.a.f().a(bitmap, true);
        this.E = a2;
        this.C = a2.id;
        bitmap.recycle();
        Bitmap bitmap2 = themeShellDescription.getBitmap(ThemeShellDescription.WIDGET_RESIZE_UNMATCH_BUTTON);
        this.D = com.censivn.C3DEngine.a.f().a(bitmap2, true).id;
        bitmap2.recycle();
        z().c(f.e);
        this.L = new com.censivn.C3DEngine.e.c();
        this.L.a((com.censivn.C3DEngine.b.l) new as(this, this));
        d(this.L);
        this.H = f(0);
        this.I = f(1);
        this.J = f(2);
        this.K = f(3);
        a(new com.censivn.C3DEngine.b.l(this));
        f(true);
        e(0);
    }

    public final void a(float f, float f2, float f3, float f4) {
        this.L.b(f, f2, 1.0f, f3, f4);
    }

    private void aG() {
        a(-n(), -l(), m(), k());
    }

    private void e(int i) {
        switch (i) {
            case 0:
                z().b();
                z().c(f.e);
                this.E.id = this.C;
                break;
            case 1:
                z().b();
                z().c(f.f);
                this.E.id = this.D;
                break;
        }
    }

    @Override // com.censivn.C3DEngine.b.r
    public final void l_() {
        ao aoVar;
        aoVar = ao.a;
        aoVar.k();
    }

    private com.censivn.C3DEngine.e.b f(int i) {
        com.censivn.C3DEngine.e.b bVar = new com.censivn.C3DEngine.e.b(64.0f, 64.0f);
        switch (i) {
            case 0:
                bVar.b(0.0f, -32.0f, 0.0f);
                break;
            case 1:
                bVar.M().z = 180.0f;
                bVar.b(0.0f, -32.0f, 0.0f);
                break;
            case 2:
                bVar.M().z = 90.0f;
                bVar.b(0.0f, -33.0f, 0.0f);
                break;
            case 3:
                bVar.M().z = 270.0f;
                bVar.b(0.0f, -32.0f, 0.0f);
                break;
        }
        bVar.ar();
        bVar.f(bVar.k[1] + (80.0f * com.censivn.C3DEngine.a.b));
        bVar.d(bVar.m[1] + (com.censivn.C3DEngine.a.b * 38.0f));
        bVar.c(bVar.k[0] - (com.censivn.C3DEngine.a.b * 38.0f));
        bVar.e(bVar.l[0] + (com.censivn.C3DEngine.a.b * 38.0f));
        bVar.z().c(this.E);
        bVar.a((com.censivn.C3DEngine.b.l) new ap(this.F, this, i));
        d(bVar);
        return bVar;
    }

    public final void a(int i, int i2) {
        int i3;
        int i4;
        if (i > i2) {
            i4 = com.censivn.C3DEngine.a.l;
            i3 = (i4 * i2) / i;
        } else {
            i3 = com.censivn.C3DEngine.a.m;
            i4 = (i3 * i) / i2;
        }
        this.F.c(i + i4, i2 + i3);
        au auVar = new au(this, i, i4, i2, i3);
        auVar.a((com.censivn.C3DEngine.g.r) new com.censivn.C3DEngine.g.k());
        com.censivn.C3DEngine.g.s.a(this.M);
        com.censivn.C3DEngine.g.s.a(this.M, ThemeShellDescription.PICKER_MENU, auVar);
        this.O = i / 2;
        this.P = i / 2;
        this.Q = i2 / 2;
        this.R = i2 / 2;
    }

    public final void c(float f, float f2) {
        super.a(f, f2);
        float f3 = f / 2.0f;
        float f4 = f2 / 2.0f;
        this.H.L().x = 0.0f;
        this.H.L().y = (f4 - this.N) - 1.0f;
        this.I.L().x = 0.0f;
        this.I.L().y = (-f4) + this.N + 1.0f;
        this.J.L().x = (-f3) + this.N;
        this.J.L().y = 0.0f;
        this.K.L().x = (f3 - this.N) - 3.0f;
        this.K.L().y = 0.0f;
    }

    @Override // com.censivn.C3DEngine.e.b.a
    public final void o(float f) {
        super.o(f);
        this.J.L().x = (-f) + this.N;
        float n = (-n()) + ((n() + m()) / 2.0f);
        this.H.L().x = n;
        this.I.L().x = n;
        aG();
    }

    @Override // com.censivn.C3DEngine.e.b.a
    public final void m(float f) {
        super.m(f);
        this.K.L().x = (f - this.N) - 3.0f;
        float n = (-n()) + ((n() + m()) / 2.0f);
        this.H.L().x = n;
        this.I.L().x = n;
        aG();
    }

    @Override // com.censivn.C3DEngine.e.b.a
    public final void i(float f) {
        super.i(f);
        this.H.L().y = (f - this.N) - 1.0f;
        float k = k() - ((l() + k()) / 2.0f);
        this.J.L().y = k;
        this.K.L().y = k;
        aG();
    }

    @Override // com.censivn.C3DEngine.e.b.a
    public final void k(float f) {
        super.k(f);
        this.I.L().y = (-f) + this.N + 1.0f;
        float k = k() - ((l() + k()) / 2.0f);
        this.J.L().y = k;
        this.K.L().y = k;
        aG();
    }

    public static void o() {
    }

    public static void p() {
        com.tsf.shell.workspace3D.k.a aVar;
        com.tsf.shell.h.l lVar;
        com.tsf.shell.h.l lVar2;
        com.tsf.shell.h.l lVar3;
        com.tsf.shell.h.l lVar4;
        com.tsf.shell.h.l lVar5;
        com.tsf.shell.h.l lVar6;
        com.tsf.shell.h.l lVar7;
        com.tsf.shell.h.l lVar8;
        aVar = ao.B;
        LauncherItem3DInfo be = aVar.be();
        if (com.censivn.C3DEngine.a.q) {
            lVar5 = ao.C;
            be.cellX = lVar5.a;
            lVar6 = ao.C;
            be.cellY = lVar6.b;
            lVar7 = ao.C;
            be.width = lVar7.d;
            lVar8 = ao.C;
            be.height = lVar8.e;
        } else {
            lVar = ao.C;
            be.cellXH = lVar.a;
            lVar2 = ao.C;
            be.cellYH = lVar2.b;
            lVar3 = ao.C;
            be.widthH = lVar3.d;
            lVar4 = ao.C;
            be.heightH = lVar4.e;
        }
        bm.a(com.censivn.C3DEngine.a.c(), be);
    }

    public final void q() {
        com.censivn.C3DEngine.g.s.a(this.M);
    }

    private int[] a(int i, int i2, int i3, int i4, boolean z) {
        this.S[0] = i;
        this.S[1] = i2;
        this.S[2] = i3;
        this.S[3] = i4;
        if (z) {
            be.a(this.S);
        } else {
            be.b(this.S);
        }
        e(0);
        return this.S;
    }

    private boolean b(int i, int i2, int i3, int i4, boolean z) {
        boolean b;
        this.S[0] = i;
        this.S[1] = i2;
        this.S[2] = i3;
        this.S[3] = i4;
        if (z) {
            b = be.a(this.S);
        } else {
            b = be.b(this.S);
        }
        if (b) {
            e(1);
            return false;
        }
        e(0);
        return true;
    }

    public final void a(int i) {
        com.tsf.shell.h.l lVar;
        com.tsf.shell.h.l lVar2;
        com.tsf.shell.h.l lVar3;
        com.tsf.shell.h.l lVar4;
        com.tsf.shell.h.l lVar5;
        com.tsf.shell.h.l lVar6;
        com.tsf.shell.h.l lVar7;
        com.tsf.shell.h.l lVar8;
        boolean z = true;
        a(i, true);
        switch (i) {
            case 0:
                lVar4 = ao.C;
                this.Q = lVar4.e - this.R;
                break;
            case 1:
                lVar3 = ao.C;
                this.R = lVar3.e - this.Q;
                z = false;
                break;
            case 2:
                lVar2 = ao.C;
                this.O = lVar2.d - this.P;
                break;
            case 3:
                lVar = ao.C;
                this.P = lVar.d - this.O;
                z = false;
                break;
        }
        lVar5 = ao.C;
        int i2 = lVar5.a;
        lVar6 = ao.C;
        int i3 = lVar6.b;
        lVar7 = ao.C;
        int i4 = lVar7.d;
        lVar8 = ao.C;
        b(i2, i3, i4, lVar8.e, z);
        av avVar = new av(this, n(), m(), k(), l());
        avVar.a((com.censivn.C3DEngine.g.r) new com.censivn.C3DEngine.g.k());
        com.censivn.C3DEngine.g.s.a(this.M);
        com.censivn.C3DEngine.g.s.a(this.M, ThemeShellDescription.PICKER_MENU, avVar);
    }

    private void a(int i, boolean z) {
        com.tsf.shell.h.l lVar;
        com.tsf.shell.h.l lVar2;
        com.tsf.shell.h.l lVar3;
        com.tsf.shell.h.l lVar4;
        com.tsf.shell.h.l lVar5;
        com.tsf.shell.h.l lVar6;
        com.tsf.shell.h.l lVar7;
        com.tsf.shell.workspace3D.k.a aVar;
        ao aoVar;
        ao aoVar2;
        com.tsf.shell.h.l lVar8;
        com.tsf.shell.h.l lVar9;
        com.tsf.shell.h.l lVar10;
        com.tsf.shell.h.l lVar11;
        com.tsf.shell.h.l lVar12;
        com.tsf.shell.h.l lVar13;
        com.tsf.shell.workspace3D.k.a aVar2;
        com.tsf.shell.h.l lVar14;
        com.tsf.shell.h.l lVar15;
        com.tsf.shell.h.l lVar16;
        com.tsf.shell.h.l lVar17;
        com.tsf.shell.h.l lVar18;
        com.tsf.shell.h.l lVar19;
        com.tsf.shell.h.l lVar20;
        com.tsf.shell.workspace3D.k.a aVar3;
        ao aoVar3;
        ao aoVar4;
        com.tsf.shell.h.l lVar21;
        com.tsf.shell.h.l lVar22;
        com.tsf.shell.h.l lVar23;
        com.tsf.shell.h.l lVar24;
        com.tsf.shell.h.l lVar25;
        com.tsf.shell.h.l lVar26;
        com.tsf.shell.workspace3D.k.a aVar4;
        switch (i) {
            case 0:
                float f = com.censivn.C3DEngine.a.o;
                aoVar3 = ao.a;
                int k = (int) ((f - aoVar3.L().y) - k());
                float f2 = com.censivn.C3DEngine.a.o;
                aoVar4 = ao.a;
                int l = ((int) ((f2 - aoVar4.L().y) + l())) - k;
                if (z) {
                    lVar23 = ao.C;
                    int i2 = lVar23.a;
                    lVar24 = ao.C;
                    int[] a2 = a(i2, k, lVar24.d, l, true);
                    lVar25 = ao.C;
                    lVar25.b = a2[1];
                    lVar26 = ao.C;
                    lVar26.e = a2[3];
                    aVar4 = ao.B;
                    aVar4.aK();
                    break;
                } else {
                    lVar21 = ao.C;
                    int i3 = lVar21.a;
                    lVar22 = ao.C;
                    b(i3, k, lVar22.d, l, true);
                    break;
                }
            case 1:
                int k2 = (int) (k() + l());
                if (z) {
                    lVar17 = ao.C;
                    int i4 = lVar17.a;
                    lVar18 = ao.C;
                    int i5 = lVar18.b;
                    lVar19 = ao.C;
                    int[] a3 = a(i4, i5, lVar19.d, k2, false);
                    lVar20 = ao.C;
                    lVar20.e = a3[3];
                    aVar3 = ao.B;
                    aVar3.aK();
                    break;
                } else {
                    lVar14 = ao.C;
                    int i6 = lVar14.a;
                    lVar15 = ao.C;
                    int i7 = lVar15.b;
                    lVar16 = ao.C;
                    b(i6, i7, lVar16.d, k2, false);
                    break;
                }
            case 2:
                aoVar = ao.a;
                int n = (int) ((aoVar.L().x - n()) + com.censivn.C3DEngine.a.n);
                aoVar2 = ao.a;
                int m = ((int) ((aoVar2.L().x + m()) + com.censivn.C3DEngine.a.n)) - n;
                if (z) {
                    lVar10 = ao.C;
                    int i8 = lVar10.b;
                    lVar11 = ao.C;
                    int[] a4 = a(n, i8, m, lVar11.e, true);
                    lVar12 = ao.C;
                    lVar12.a = a4[0];
                    lVar13 = ao.C;
                    lVar13.d = a4[2];
                    aVar2 = ao.B;
                    aVar2.aK();
                    break;
                } else {
                    lVar8 = ao.C;
                    int i9 = lVar8.b;
                    lVar9 = ao.C;
                    b(n, i9, m, lVar9.e, true);
                    break;
                }
            case 3:
                int n2 = (int) (n() + m());
                if (z) {
                    lVar4 = ao.C;
                    int i10 = lVar4.a;
                    lVar5 = ao.C;
                    int i11 = lVar5.b;
                    lVar6 = ao.C;
                    int[] a5 = a(i10, i11, n2, lVar6.e, false);
                    lVar7 = ao.C;
                    lVar7.d = a5[2];
                    aVar = ao.B;
                    aVar.aK();
                    break;
                } else {
                    lVar = ao.C;
                    int i12 = lVar.a;
                    lVar2 = ao.C;
                    int i13 = lVar2.b;
                    lVar3 = ao.C;
                    b(i12, i13, n2, lVar3.e, false);
                    break;
                }
        }
    }

    public final void a(int i, float f) {
        switch (i) {
            case 0:
                if ((this.Q - f) + l() < a) {
                    f = (this.Q + l()) - a;
                }
                i(this.Q - f);
                a(i, false);
                break;
            case 1:
                if (this.R + f + k() < a) {
                    f = (a - this.R) - k();
                }
                k(this.R + f);
                a(i, false);
                break;
            case 2:
                if ((this.O - f) + m() < a) {
                    f = (this.O + m()) - a;
                }
                o(this.O - f);
                a(i, false);
                break;
            case 3:
                if (this.P + f + n() < a) {
                    f = (a - this.P) - n();
                }
                m(this.P + f);
                a(i, false);
                break;
        }
    }
}
