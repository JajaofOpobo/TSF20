package com.tsf.shell.workspace3D.j;

import com.censivn.C3DEngine.api.element.TextureElement;
import com.tsf.shell.R;
import com.tsf.shell.bd;
import com.tsf.shell.theme.inside.ThemeShellDescription;

/* loaded from: classes.dex */
public final class h extends com.tsf.shell.setting.e {
    com.censivn.C3DEngine.e.b D;
    TextureElement E;
    com.censivn.C3DEngine.g.u F;
    com.censivn.C3DEngine.g.u G;

    public h(String str) {
        super(str, 0);
    }

    @Override // com.tsf.shell.setting.e
    public final void g_() {
        if (this.D == null) {
            this.D = new com.censivn.C3DEngine.e.b(0.0f, 0.0f, (byte) 0);
            this.D.b(true);
            d(this.D);
            this.F = new com.censivn.C3DEngine.g.u();
            this.F.d(0.0f);
            this.G = new com.censivn.C3DEngine.g.u();
            this.G.d(180.0f);
        }
        aJ();
        this.E = com.censivn.C3DEngine.a.f().a(com.censivn.C3DEngine.h.a.a(com.censivn.C3DEngine.a.c(), R.drawable.setting_direction_icon), false);
        this.D.a_(com.censivn.C3DEngine.a.b * 96.0f);
        this.D.h(com.censivn.C3DEngine.a.b * 96.0f);
        this.D.L().y = 20.0f * com.censivn.C3DEngine.a.b;
        this.D.z().c(this.E);
    }

    @Override // com.tsf.shell.setting.e
    public final void aJ() {
        if (this.E != null) {
            com.censivn.C3DEngine.a.f().a(this.E);
            this.E = null;
            this.D.z().d();
        }
    }

    public final void h(boolean z) {
        if (bd.c() == 0) {
            if (z) {
                com.censivn.C3DEngine.g.s.a(this.D);
                com.censivn.C3DEngine.g.s.a(this.D, ThemeShellDescription.PAGE_PREVIEW_SELECT, this.F);
                return;
            } else {
                this.D.M().y = 0.0f;
                return;
            }
        }
        if (z) {
            com.censivn.C3DEngine.g.s.a(this.D);
            com.censivn.C3DEngine.g.s.a(this.D, ThemeShellDescription.PAGE_PREVIEW_SELECT, this.G);
        } else {
            this.D.M().y = 180.0f;
        }
    }
}
