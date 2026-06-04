package com.tsf.shell.workspace3D.j;

import com.censivn.C3DEngine.api.element.TextureElement;
import com.tsf.shell.R;
import com.tsf.shell.theme.inside.ThemeShellDescription;
import com.tsf.shell.workspace3D.k.b.ap;

/* loaded from: classes.dex */
public final class f extends com.tsf.shell.setting.e {
    com.censivn.C3DEngine.e.b D;
    com.censivn.C3DEngine.e.b E;
    TextureElement F;
    TextureElement G;
    com.censivn.C3DEngine.g.u H;
    com.censivn.C3DEngine.g.u I;
    com.censivn.C3DEngine.g.u J;
    com.censivn.C3DEngine.g.u K;

    public f(String str) {
        super(str, 0);
    }

    @Override // com.tsf.shell.setting.e
    public final void g_() {
        if (this.D == null) {
            this.D = new com.censivn.C3DEngine.e.b(0.0f, 0.0f, (byte) 0);
            d(this.D);
            this.H = new com.censivn.C3DEngine.g.u();
            this.H.j(1.0f);
            this.H.k(1.0f);
            this.H.a(com.censivn.C3DEngine.g.a.g);
            this.H.a(255);
            this.I = new g(this);
            this.I.j(3.0f);
            this.I.k(3.0f);
            this.I.a(0);
            this.J = new com.censivn.C3DEngine.g.u();
            this.J.f(0.0f);
            this.K = new com.censivn.C3DEngine.g.u();
            this.K.f((-10.0f) * com.censivn.C3DEngine.a.b);
        }
        if (this.E == null) {
            this.E = new com.censivn.C3DEngine.e.b(0.0f, 0.0f, (byte) 0);
            d(this.E);
        }
        aJ();
        this.F = com.censivn.C3DEngine.a.f().a(com.censivn.C3DEngine.h.a.a(com.censivn.C3DEngine.a.c(), R.drawable.setting_auto_hide_side_bar_icon), false);
        this.G = com.censivn.C3DEngine.a.f().a(com.censivn.C3DEngine.h.a.a(com.censivn.C3DEngine.a.c(), R.drawable.setting_auto_hide_side_bar_eye_icon), false);
        this.D.a_(ap.I);
        this.D.h(ap.I);
        this.E.a_(this.G.width * com.censivn.C3DEngine.a.b * 0.8f);
        this.E.h(this.G.height * com.censivn.C3DEngine.a.b * 0.8f);
        this.D.L().y = 19.0f * com.censivn.C3DEngine.a.b;
        this.E.L().y = com.censivn.C3DEngine.a.b * 0.0f;
        this.E.L().x = 20.0f * com.censivn.C3DEngine.a.b;
        this.D.z().c(this.F);
        this.E.z().c(this.G);
    }

    @Override // com.tsf.shell.setting.e
    public final void aJ() {
        if (this.F != null) {
            com.censivn.C3DEngine.a.f().a(this.F);
            this.F = null;
            this.D.z().d();
            com.censivn.C3DEngine.a.f().a(this.G);
            this.G = null;
            this.E.z().d();
        }
    }

    public final void h(boolean z) {
        if (com.tsf.shell.a.t.r()) {
            this.E.a((Boolean) true);
            if (z) {
                com.censivn.C3DEngine.g.s.a(this.D);
                com.censivn.C3DEngine.g.s.a(this.E, 1250, this.H);
                com.censivn.C3DEngine.g.s.a(this.D);
                com.censivn.C3DEngine.g.s.a(this.D, ThemeShellDescription.PAGE_PREVIEW_SELECT, this.K);
                return;
            }
            this.D.L().x = (-10.0f) * com.censivn.C3DEngine.a.b;
            this.E.b(255.0f);
            this.E.N().setAll(1.0f, 1.0f, 1.0f);
            return;
        }
        if (z) {
            com.censivn.C3DEngine.g.s.a(this.D);
            com.censivn.C3DEngine.g.s.a(this.E, ThemeShellDescription.PAGE_PREVIEW_SELECT, this.I);
            com.censivn.C3DEngine.g.s.a(this.D);
            com.censivn.C3DEngine.g.s.a(this.D, ThemeShellDescription.PAGE_PREVIEW_SELECT, this.J);
            return;
        }
        this.D.L().x = 0.0f;
        this.E.a((Boolean) false);
        this.E.b(0.0f);
        this.E.N().setAll(3.0f, 3.0f, 3.0f);
    }
}
