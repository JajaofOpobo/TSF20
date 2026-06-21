package com.tsf.shell.e.f;

import com.censivn.C3DEngine.common.renderer.MatrixStack;

/* loaded from: classes.dex */
public class b extends com.censivn.C3DEngine.b.f.i {
    public b() {
        super(com.censivn.C3DEngine.b.b.a.F, com.censivn.C3DEngine.b.b.a.G, 1, 1, false);
    }

    @Override // com.censivn.C3DEngine.b.f.l, com.censivn.C3DEngine.b.f.j
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
            i.a.position().setAllFrom(position());
            i.a.rotation().setAllFrom(rotation());
            i.a.scale().setAllFrom(scale());
            gVar.u();
            i.a.position().reset();
            i.a.rotation().reset();
            i.a.scale().setAll(1.0f, 1.0f, 1.0f);
            MatrixStack.glPushMatrix();
            draw();
            MatrixStack.glColor(alpha(), getDefaultColor());
            MatrixStack.glPopMatrix();
            onDrawEnd();
        }
    }
}
