package com.tsf.shell.workspace3D.j;

import com.censivn.C3DEngine.api.element.TextureElement;
import com.tsf.shell.R;

/* loaded from: classes.dex */
public final class i extends com.tsf.shell.setting.e {
    com.censivn.C3DEngine.e.b D;
    TextureElement E;
    com.censivn.C3DEngine.g.u F;
    com.censivn.C3DEngine.g.u G;
    com.censivn.C3DEngine.g.u H;
    com.censivn.C3DEngine.g.u I;

    public i(String str) {
        super(str, R.drawable.setting_lock_icon);
    }

    @Override // com.tsf.shell.setting.e
    public final void g_() {
        if (this.D == null) {
            this.D = new com.censivn.C3DEngine.e.b(0.0f, 0.0f, (byte) 0);
            d(this.D);
            this.F = new j(this);
            this.F.f(com.censivn.C3DEngine.a.b * 30.0f);
            this.F.h(55.0f * com.censivn.C3DEngine.a.b);
            this.F.e(0.0f);
            this.G = new k(this);
            this.G.f(com.censivn.C3DEngine.a.b * 20.0f);
            this.G.h(com.censivn.C3DEngine.a.b * 45.0f);
            this.H = new l(this);
            this.H.e(45.0f);
            this.H.f(com.censivn.C3DEngine.a.b * 30.0f);
            this.H.h(55.0f * com.censivn.C3DEngine.a.b);
            this.I = new m(this);
            this.I.h(com.censivn.C3DEngine.a.b * 0.0f);
        }
        aJ();
        this.E = com.censivn.C3DEngine.a.f().a(com.censivn.C3DEngine.h.a.a(com.censivn.C3DEngine.a.c(), R.drawable.setting_lock_clip), false);
        this.D.a_(this.E.width * com.censivn.C3DEngine.a.b);
        this.D.h(this.E.height * com.censivn.C3DEngine.a.b);
        this.D.L().x = com.censivn.C3DEngine.a.b * 20.0f;
        this.D.L().y = com.censivn.C3DEngine.a.b * 45.0f;
        this.D.z().c(this.E);
        if (com.tsf.shell.a.t.e()) {
            h(false);
        } else {
            i(false);
        }
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
        if (z) {
            com.censivn.C3DEngine.g.s.a(this.D);
            com.censivn.C3DEngine.g.s.a(this.D, 250, this.F);
            return;
        }
        this.D.L().x = 20.0f * com.censivn.C3DEngine.a.b;
        this.D.L().y = 45.0f * com.censivn.C3DEngine.a.b;
        this.D.M().z = 0.0f;
    }

    public final void i(boolean z) {
        if (z) {
            com.censivn.C3DEngine.g.s.a(this.D);
            com.censivn.C3DEngine.g.s.a(this.D, 250, this.H);
            return;
        }
        this.D.L().x = 30.0f * com.censivn.C3DEngine.a.b;
        this.D.L().y = 0.0f * com.censivn.C3DEngine.a.b;
        this.D.M().z = 45.0f;
    }
}
