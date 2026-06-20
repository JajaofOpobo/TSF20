package com.tsf.shell.f.f;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.common.renderer.MatrixStack;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class PageShaderNode extends com.censivn.C3DEngine.b.f.BaseRenderable {
    public void a(g gVar, Number3d number3d) {
        if (visible()) {
            onDrawStart();
            MatrixStack.glPushMatrix();
            draw();
            MatrixStack.glColor(alpha(), getDefaultColor());
            onDrawChildStart();
            if (renderChildren()) {
                gVar.a(number3d);
                int iNumChildren = numChildren();
                for (int i = 0; i < iNumChildren; i++) {
                    com.censivn.C3DEngine.b.f.IRenderable childAt = getChildAt(ItemPageTransition);
                    onDrawChildStart(childAt);
                    childAt.dispatchDraw();
                    onDrawChildEnd(childAt);
                }
            }
            MatrixStack.glPopMatrix();
            onDrawEnd();
        }
    }
}
