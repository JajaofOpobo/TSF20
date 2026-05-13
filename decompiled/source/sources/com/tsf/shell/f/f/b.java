package com.tsf.shell.f.f;

import com.censivn.C3DEngine.common.renderer.MatrixStack;
/* loaded from: classes.dex */
public class b extends com.censivn.C3DEngine.b.f.h {
    public b() {
        super(com.censivn.C3DEngine.b.b.a.F, com.censivn.C3DEngine.b.b.a.G, 1, 1, false);
    }

    @Override // com.censivn.C3DEngine.b.f.j, com.censivn.C3DEngine.b.f.i
    public void dispatchDraw() {
        if (visible()) {
            onDrawStart();
            MatrixStack.glPushMatrix();
            draw();
            MatrixStack.glColor(alpha(), getDefaultColor());
            MatrixStack.glPopMatrix();
            onDrawEnd();
        }
    }

    public void a(g gVar) {
        if (visible()) {
            onDrawStart();
            h.a.position().setAllFrom(position());
            h.a.rotation().setAllFrom(rotation());
            h.a.scale().setAllFrom(scale());
            gVar.u();
            h.a.position().reset();
            h.a.rotation().reset();
            h.a.scale().setAll(1.0f, 1.0f, 1.0f);
            MatrixStack.glPushMatrix();
            draw();
            MatrixStack.glColor(alpha(), getDefaultColor());
            MatrixStack.glPopMatrix();
            onDrawEnd();
        }
    }
}
