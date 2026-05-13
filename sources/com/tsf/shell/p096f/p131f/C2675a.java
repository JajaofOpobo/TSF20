package com.tsf.shell.p096f.p131f;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.common.renderer.MatrixStack;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
/* renamed from: com.tsf.shell.f.f.a */
/* loaded from: classes.dex */
public class C2675a extends C0980j {
    /* renamed from: a */
    public void m4986a(C2932g c2932g, Number3d number3d) {
        if (visible()) {
            onDrawStart();
            MatrixStack.glPushMatrix();
            draw();
            MatrixStack.glColor(alpha(), getDefaultColor());
            onDrawChildStart();
            if (renderChildren()) {
                c2932g.m4231a(number3d);
                int numChildren = numChildren();
                for (int i = 0; i < numChildren; i++) {
                    C0975i childAt = getChildAt(i);
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
