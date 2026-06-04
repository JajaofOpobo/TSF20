package com.tsf.shell.workspace3D.g;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.PositionNumber3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.ThemeShellDescription;

/* loaded from: classes.dex */
final class al extends com.censivn.C3DEngine.e.b.a {
    private TextureElement C;
    private al D;
    private com.censivn.C3DEngine.e.b E;
    private com.censivn.C3DEngine.e.b F;
    private com.censivn.C3DEngine.e.b G;
    private com.censivn.C3DEngine.e.b H;
    private com.censivn.C3DEngine.g.b.b I;
    private int J;
    private float K;
    private float L;
    private boolean M;
    private int a;

    public al(com.censivn.C3DEngine.e.b.b bVar) {
        super(500.0f, 500.0f, bVar);
        this.J = 3;
        this.K = 1.0f;
        this.L = 1.0f;
        this.M = false;
        this.D = this;
        this.I = new com.censivn.C3DEngine.g.b.b();
        ThemeShellDescription themeShellDescription = ThemeManager.getInstance().getCurrentThemeDescription().shell;
        Bitmap bitmap = themeShellDescription.getBitmap(ThemeShellDescription.WIDGET_RESIZE_MATCH_BUTTON);
        TextureElement a = com.censivn.C3DEngine.a.f().a(bitmap, true);
        this.C = a;
        this.a = a.id;
        bitmap.recycle();
        Bitmap bitmap2 = themeShellDescription.getBitmap(ThemeShellDescription.WIDGET_RESIZE_UNMATCH_BUTTON);
        com.censivn.C3DEngine.a.f().a(bitmap2, true);
        bitmap2.recycle();
        z().c(f.g);
        this.E = a(0);
        this.F = a(1);
        this.G = a(2);
        this.H = a(3);
        a(new com.censivn.C3DEngine.b.l(this));
        f(true);
        z().b();
        z().c(f.g);
        this.C.id = this.a;
    }

    public final int g(com.censivn.C3DEngine.b.r rVar) {
        Number3d.TEMPNUMBER3D3.reset();
        Number3d c = this.E.c(Number3d.TEMPNUMBER3D3);
        Number3d.TEMPNUMBER3D3.reset();
        Number3d c2 = this.F.c(Number3d.TEMPNUMBER3D3);
        Number3d.TEMPNUMBER3D3.reset();
        Number3d c3 = this.G.c(Number3d.TEMPNUMBER3D3);
        Number3d.TEMPNUMBER3D3.reset();
        Number3d c4 = this.H.c(Number3d.TEMPNUMBER3D3);
        float[] fArr = {c.x, c2.x, c3.x, c4.x};
        float[] fArr2 = {c.y, c2.y, c3.y, c4.y};
        Number3d.TEMPNUMBER3D3.reset();
        Number3d c5 = rVar.c(Number3d.TEMPNUMBER3D3);
        float f = c5.x;
        float f2 = c5.y;
        float f3 = 2.1474836E9f;
        float f4 = -2.1474836E9f;
        float f5 = 2.1474836E9f;
        float f6 = -2.1474836E9f;
        int i = 0;
        while (i < 4) {
            float f7 = fArr[i];
            float f8 = fArr2[i];
            if (f7 > f4) {
                f4 = f7;
            }
            if (f7 >= f3) {
                f7 = f3;
            }
            if (f8 > f6) {
                f6 = f8;
            }
            if (f8 >= f5) {
                f8 = f5;
            }
            i++;
            f3 = f7;
            f5 = f8;
        }
        if (f == f4) {
            return 3;
        }
        if (f == f3) {
            return 2;
        }
        if (f2 == f5) {
            return 1;
        }
        if (f2 == f6) {
            return 0;
        }
        return 0;
    }

    @Override // com.censivn.C3DEngine.b.r
    public final void l_() {
        aj ajVar;
        ajVar = aj.a;
        ajVar.l();
    }

    private com.censivn.C3DEngine.e.b a(int i) {
        com.censivn.C3DEngine.e.b bVar = new com.censivn.C3DEngine.e.b(64.0f, 64.0f);
        switch (i) {
            case 0:
                bVar.b(0.0f, -32.0f, 0.0f);
                bVar.ar();
                break;
            case 1:
                bVar.M().z = 180.0f;
                bVar.b(0.0f, -32.0f, 0.0f);
                bVar.ar();
                break;
            case 2:
                bVar.M().z = 90.0f;
                bVar.b(0.0f, -33.0f, 0.0f);
                bVar.ar();
                break;
            case 3:
                bVar.M().z = 270.0f;
                bVar.b(0.0f, -32.0f, 0.0f);
                bVar.ar();
                break;
        }
        bVar.f(bVar.k[1] + (70.0f * com.censivn.C3DEngine.a.b));
        bVar.d(bVar.m[1] + (38.0f * com.censivn.C3DEngine.a.b));
        bVar.c(bVar.k[0] - (com.censivn.C3DEngine.a.b * 25.0f));
        bVar.e(bVar.l[0] + (com.censivn.C3DEngine.a.b * 25.0f));
        bVar.z().c(this.C);
        bVar.a((com.censivn.C3DEngine.b.l) new an(this.D, this, bVar));
        d(bVar);
        return bVar;
    }

    public final void a(float f, float f2, float f3, float f4) {
        o(f * 2.0f);
        m(f2 * 2.0f);
        i(f4 * 2.0f);
        k(f3 * 2.0f);
        am amVar = new am(this, f, f2, f4, f3);
        amVar.a(com.censivn.C3DEngine.g.a.g);
        com.censivn.C3DEngine.g.s.a(this.I);
        com.censivn.C3DEngine.g.s.a(this.I, ThemeShellDescription.PICKER_MENU, amVar);
    }

    public final void o() {
        PositionNumber3d L = this.G.L();
        PositionNumber3d L2 = this.H.L();
        float k = (k() - l()) / 2.0f;
        L2.y = k;
        L.y = k;
    }

    @Override // com.censivn.C3DEngine.e.b.a
    public final void o(float f) {
        super.p(f);
        this.G.L().x = (-f) + this.J;
    }

    @Override // com.censivn.C3DEngine.e.b.a
    public final void m(float f) {
        super.n(f);
        this.H.L().x = (f - this.J) - 3.0f;
    }

    @Override // com.censivn.C3DEngine.e.b.a
    public final void i(float f) {
        super.j(f);
        this.E.L().y = (f - this.J) - 1.0f;
    }

    @Override // com.censivn.C3DEngine.e.b.a
    public final void k(float f) {
        super.l(f);
        this.F.L().y = (-f) + this.J + 1.0f;
    }

    public final void p() {
        this.M = false;
        a_(false);
    }

    public final void q() {
        com.tsf.shell.workspace3D.k.j jVar;
        jVar = aj.C;
        float aN = jVar.aN();
        this.L = aN;
        this.K = aN;
        this.M = true;
        a_(true);
        com.censivn.C3DEngine.g.s.a(this.I);
    }

    public final void aG() {
        this.M = false;
    }

    public final void q(float f) {
        this.K = f;
    }

    @Override // com.censivn.C3DEngine.b.r
    public final void c() {
        com.tsf.shell.workspace3D.k.j jVar;
        com.tsf.shell.workspace3D.k.j jVar2;
        com.tsf.shell.workspace3D.k.j jVar3;
        com.tsf.shell.workspace3D.k.j jVar4;
        com.tsf.shell.workspace3D.k.j jVar5;
        com.tsf.shell.workspace3D.k.j jVar6;
        com.tsf.shell.workspace3D.k.j jVar7;
        com.tsf.shell.workspace3D.k.j jVar8;
        com.tsf.shell.workspace3D.k.j jVar9;
        if (this.M || w()) {
            float f = this.K;
            jVar = aj.C;
            if (f > jVar.bl()) {
                jVar9 = aj.C;
                this.K = jVar9.bl();
            } else {
                float f2 = this.K;
                jVar2 = aj.C;
                if (f2 < jVar2.bk()) {
                    jVar3 = aj.C;
                    this.K = jVar3.bk();
                }
            }
            this.L += (this.K - this.L) * 0.2f;
            if (!this.M && Math.abs(this.L - this.K) < 0.005d) {
                a_(false);
                this.L = this.K;
            }
            jVar4 = aj.C;
            jVar4.g(this.L);
            jVar5 = aj.C;
            o((-jVar5.k[0]) * this.L);
            jVar6 = aj.C;
            m(jVar6.l[0] * this.L);
            jVar7 = aj.C;
            i(jVar7.k[1] * this.L);
            jVar8 = aj.C;
            k((-jVar8.m[1]) * this.L);
            o();
            this.D.ag();
        }
    }
}
