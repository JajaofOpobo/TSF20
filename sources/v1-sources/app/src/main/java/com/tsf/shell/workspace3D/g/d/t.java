package com.tsf.shell.workspace3D.g.d;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.ThemeOptionMenuDescription;
import com.tsf.shell.workspace3D.bf;

/* loaded from: classes.dex */
public final class t extends com.censivn.C3DEngine.b.v {
    private aq A;
    private TextureElement B;
    private w C;
    private float E;
    private float F;
    private com.censivn.C3DEngine.g.u H;
    private com.censivn.C3DEngine.g.u I;
    private com.censivn.C3DEngine.g.u J;
    private int D = 0;
    private boolean K = true;
    private com.censivn.C3DEngine.e.b a = new com.censivn.C3DEngine.e.b(10.0f, 10.0f, (byte) 0);
    private float G = 120.0f * com.censivn.C3DEngine.a.b;

    public t(w wVar) {
        this.C = wVar;
        Bitmap bitmap = ThemeManager.getInstance().getCurrentThemeDescription().optionMenu.getBitmap(ThemeOptionMenuDescription.OPTION_MENU_LABEL_BG);
        this.B = com.censivn.C3DEngine.a.f().a(bitmap, false);
        bitmap.recycle();
        this.A = new aq(this.B.width, this.B.height, new ar(this.B.width / 2, this.B.height / 2, this.B.width));
        this.A.z().c(this.B);
        this.H = new com.censivn.C3DEngine.g.u();
        this.H.a(com.censivn.C3DEngine.g.a.a);
        this.I = new u(this);
        this.I.a(255);
        this.J = new v(this);
        this.J.a(0);
        d(this.A);
        d(this.a);
    }

    public final void a(TextureElement textureElement, int i) {
        if (textureElement == null) {
            this.D = i;
            i();
        } else {
            if (P() == null) {
                Q();
                Number3d c = this.C.c();
                this.E = c.x;
                this.F = c.y;
                bf.m().a(this);
                this.A.a_(textureElement.width * com.censivn.C3DEngine.a.b);
                L().x = this.E;
                L().y = this.F + (i * 100 * com.censivn.C3DEngine.a.b) + this.G;
                this.D = i;
            } else {
                this.A.i(textureElement.width * com.censivn.C3DEngine.a.b);
            }
            this.a.a_(textureElement.width * com.censivn.C3DEngine.a.b);
            this.a.h(textureElement.height * com.censivn.C3DEngine.a.b);
            this.a.z().d();
            this.a.z().c(textureElement);
            if (this.K) {
                this.K = false;
                com.censivn.C3DEngine.g.s.a(this.A);
                com.censivn.C3DEngine.g.s.a(this.A, 300, this.I);
            }
            if (this.D != i) {
                this.D = i;
                this.H.h(this.F + (i * 100 * com.censivn.C3DEngine.a.b) + this.G);
                com.censivn.C3DEngine.g.s.a(this);
                com.censivn.C3DEngine.g.s.a(this, 250, this.H);
            }
        }
        L().x = this.E;
    }

    public final void i() {
        if (!this.K) {
            this.K = true;
            com.censivn.C3DEngine.g.s.a(this.A);
            com.censivn.C3DEngine.g.s.a(this.A, 300, this.J);
        }
    }
}
