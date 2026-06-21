package com.tsf.shell.e.f;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.common.renderer.MatrixStack;

/* loaded from: classes.dex */
public class a extends com.censivn.C3DEngine.b.f.l {
    public void a(g gVar, Number3d number3d) {
        if (visible()) {
            onDrawStart();
            MatrixStack.glPushMatrix();
            draw();
            MatrixStack.glColor(alpha(), getDefaultColor());
            onDrawChildStart();
            if (renderChildren()) {
                gVar.a(number3d);
                int numChildren = numChildren();
                for (int i = 0; i < numChildren; i++) {
                    com.censivn.C3DEngine.b.f.j childAt = getChildAt(i);
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
