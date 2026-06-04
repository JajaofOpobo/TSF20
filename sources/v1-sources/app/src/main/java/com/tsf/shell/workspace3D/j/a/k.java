package com.tsf.shell.workspace3D.j.a;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.v;
import com.tsf.shell.R;
import com.tsf.shell.workspace3D.k.b.ap;

/* loaded from: classes.dex */
public final class k extends v {
    private static TextureElement D;
    private static TextureElement E;
    private com.censivn.C3DEngine.e.b F;
    private com.censivn.C3DEngine.e.b G;
    private TextureElement H;
    public com.tsf.shell.workspace3D.h.d.a a;
    public boolean C = false;
    public int A = 1;
    public Runnable B = new l(this);

    public k(int i, boolean z) {
        if (E == null) {
            Bitmap a = com.censivn.C3DEngine.h.a.a(com.censivn.C3DEngine.a.c(), R.drawable.menu_setting_button_bg_off);
            E = com.censivn.C3DEngine.a.f().a(a, false);
            a.recycle();
        }
        if (D == null) {
            Bitmap a2 = com.censivn.C3DEngine.h.a.a(com.censivn.C3DEngine.a.c(), R.drawable.menu_setting_button_bg_on);
            D = com.censivn.C3DEngine.a.f().a(a2, false);
            a2.recycle();
        }
        this.F = new com.censivn.C3DEngine.e.b(ap.I, ap.I, (byte) 0);
        this.H = com.censivn.C3DEngine.a.f().a(com.censivn.C3DEngine.h.a.a(com.censivn.C3DEngine.a.c(), i), false);
        this.G = new com.censivn.C3DEngine.e.b(this.H.width * com.censivn.C3DEngine.a.b, this.H.height * com.censivn.C3DEngine.a.b, (byte) 0);
        this.G.a((Object) new com.censivn.C3DEngine.e.b(this.H.width * com.censivn.C3DEngine.a.b, this.H.height * com.censivn.C3DEngine.a.b, (byte) 0));
        this.G.L().y = (-10.0f) * com.censivn.C3DEngine.a.b;
        this.G.z().c(this.H);
        h(z);
        d(this.F);
        d(this.G);
        ar();
    }

    public final void i() {
        this.C = true;
        this.B.run();
    }

    public final void j() {
        this.C = false;
    }

    public final void h(boolean z) {
        if (z) {
            this.F.z().d();
            this.F.z().c(D);
        } else {
            this.F.z().d();
            this.F.z().c(E);
        }
    }
}
