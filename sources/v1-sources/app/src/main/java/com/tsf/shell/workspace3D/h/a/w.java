package com.tsf.shell.workspace3D.h.a;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.tsf.shell.theme.inside.ThemeManager;

/* loaded from: classes.dex */
public final class w extends com.censivn.C3DEngine.b.v {
    private TextureElement B;
    private com.censivn.C3DEngine.e.a.a C;
    private int a = 0;
    private int A = 20;
    private int D = 0;

    public w() {
        if (this.B != null) {
            com.censivn.C3DEngine.a.f().a(this.B);
        }
        i();
    }

    public final void i() {
        Bitmap bitmap = ThemeManager.mix.page.getTheme().getBitmap(401);
        this.B = com.censivn.C3DEngine.a.f().a(this.B, bitmap);
        bitmap.recycle();
    }

    public final void a(int i) {
        if (this.C != null) {
            this.C.H();
        }
        this.a = i;
        this.D = 0;
        int i2 = 0 - ((this.A * i) / 2);
        this.C = new com.censivn.C3DEngine.e.a.a(i, 32, 64, 32);
        this.C.c((Boolean) false);
        int i3 = i2;
        for (int i4 = 0; i4 < i; i4++) {
            com.censivn.C3DEngine.e.a.c a = this.C.a(i4);
            a.m.spX(i3);
            a.b(12.0f);
            a.d(12.0f);
            a.a(0, 0, 1, 1);
            a.e();
            i3 += this.A;
        }
        this.C.z().c(this.B);
        d(this.C);
    }

    public final void e(int i) {
        if (i < this.a) {
            this.C.a(this.D).a(0, 0);
            this.D = i;
            this.C.a(i).a(1, 0);
        }
    }
}
