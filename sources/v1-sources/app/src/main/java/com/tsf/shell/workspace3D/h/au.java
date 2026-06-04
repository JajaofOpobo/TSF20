package com.tsf.shell.workspace3D.h;

import android.graphics.Color;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.ThemeShellDescription;

/* loaded from: classes.dex */
public final class au extends com.censivn.C3DEngine.b.v {
    private com.censivn.C3DEngine.e.b B;
    private Runnable D;
    final /* synthetic */ ao a;
    private boolean C = false;
    private au A = this;

    public au(ao aoVar) {
        this.a = aoVar;
        ThemeShellDescription themeShellDescription = ThemeManager.getInstance().getCurrentThemeDescription().shell;
        this.B = new com.censivn.C3DEngine.e.b(com.censivn.C3DEngine.a.l / com.tsf.shell.a.t.M().a, 6.0f * com.censivn.C3DEngine.a.a, (byte) 0);
        this.B.a(Color.alpha(themeShellDescription.pageNavigationBgColor), Color.red(themeShellDescription.pageNavigationBgColor), Color.green(themeShellDescription.pageNavigationBgColor), Color.blue(themeShellDescription.pageNavigationBgColor));
        int i = com.censivn.C3DEngine.a.g;
        int i2 = com.censivn.C3DEngine.a.h;
        int i3 = com.censivn.C3DEngine.a.e;
        int i4 = com.censivn.C3DEngine.a.f;
        i();
        d(this.B);
        this.D = new av(this);
    }

    public final void i() {
        if ((com.censivn.C3DEngine.a.a * 6.0f) % 2.0f == 0.0f) {
            L().y = com.censivn.C3DEngine.a.g - ((com.censivn.C3DEngine.a.a * 6.0f) / 2.0f);
        } else {
            L().y = (com.censivn.C3DEngine.a.g - ((com.censivn.C3DEngine.a.a * 6.0f) / 2.0f)) + 1.0f;
        }
    }

    public final void j() {
        if (this.C) {
            this.C = false;
            aw awVar = new aw(this);
            awVar.a(0);
            com.censivn.C3DEngine.g.s.a(this.A);
            com.censivn.C3DEngine.g.s.a(this.A, ThemeShellDescription.PAGE_PREVIEW_SELECT, awVar);
        }
    }

    public final void k() {
        if (com.tsf.shell.a.t.F()) {
            a(this.a.c.k);
        }
    }

    public final void a(a aVar) {
        if (com.tsf.shell.a.t.F()) {
            int i = com.censivn.C3DEngine.a.j / (this.a.c.l - 1);
            if (this.B.n_() != i) {
                this.B.a_(i);
            }
            if (!this.C) {
                this.C = true;
                ax axVar = new ax(this);
                axVar.a(255);
                com.censivn.C3DEngine.g.s.a(this.A);
                com.censivn.C3DEngine.g.s.a(this.A, ThemeShellDescription.PAGE_PREVIEW_SELECT, axVar);
                if (this.A.P() == null) {
                    this.a.c.f.d(this.A);
                    this.B.L().x = (((this.a.c.k.p() - 1) * this.B.n_()) + (this.B.n_() / 2.0f)) - (com.censivn.C3DEngine.a.j / 2);
                }
            }
            ay ayVar = new ay(this);
            ayVar.f((((aVar.p() - 1) * this.B.n_()) + (this.B.n_() / 2.0f)) - (com.censivn.C3DEngine.a.j / 2));
            com.censivn.C3DEngine.g.s.a(this.B);
            com.censivn.C3DEngine.g.s.a(this.B, ThemeShellDescription.PAGE_PREVIEW_SELECT, ayVar);
            com.censivn.C3DEngine.a.a().f(this.D);
            com.censivn.C3DEngine.a.a().b(this.D, 1000L);
        }
    }
}
