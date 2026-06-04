package com.tsf.shell.workspace3D.k.b;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.tsf.shell.R;

/* loaded from: classes.dex */
public final class au extends ai {
    private com.tsf.shell.setting.e h;
    private TextureElement i;
    private com.censivn.C3DEngine.e.b j;
    private com.censivn.C3DEngine.e.b k;

    public au(com.censivn.C3DEngine.b.v vVar, com.censivn.C3DEngine.b.v vVar2) {
        super(vVar, vVar2, 200);
        Bitmap a = com.censivn.C3DEngine.h.a.a(com.censivn.C3DEngine.a.c(), R.drawable.menu_setting_button_animation_switch);
        this.i = com.censivn.C3DEngine.a.f().a(a, true);
        a.recycle();
        this.j = new av(this);
        this.k = new aw(this);
        this.j.z().c(this.i);
        this.j.L().spY(8.0f);
        this.j.L().spX(-5.0f);
        this.k.z().c(this.i);
        this.k.L().spY(15.0f);
        this.k.L().spX(15.0f);
        this.h = new com.tsf.shell.setting.e(com.censivn.C3DEngine.h.a.c(R.string.menu_setting_widget_animation), 0, (byte) 0);
        this.h.aK();
        ax axVar = new ax(this, this.h);
        this.h.d(this.j);
        this.h.d(this.k);
        this.h.a((com.censivn.C3DEngine.b.l) axVar);
        b(this.h);
        j();
    }

    public final void j() {
        if (a.a) {
            this.h.e(1);
        } else {
            this.h.e(0);
        }
    }
}
