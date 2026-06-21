package com.tsf.shell.manager.wallpaper;

import android.content.Context;
import android.opengl.GLES20;
import com.censivn.C3DEngine.api.core.VObject3dContainer;

/* loaded from: classes.dex */
public class a extends VObject3dContainer {
    private b a;
    private c b;

    public a(Context context, float f, float f2) {
        this.a = new b(f, f2);
        this.b = new c(this, context, f, f2);
    }

    @Override // com.censivn.C3DEngine.api.core.VObject3d
    public void drawElement() {
        GLES20.glClear(1024);
        GLES20.glEnable(2960);
        GLES20.glStencilFunc(519, 0, -1);
        GLES20.glStencilOp(7682, 7682, 7682);
        this.a.dispatchDraw();
        GLES20.glStencilFunc(514, 1, -1);
        GLES20.glStencilOp(7680, 7680, 7680);
        this.b.dispatchDraw();
        GLES20.glDisable(2960);
    }

    public void a() {
        this.b.a();
    }
}
