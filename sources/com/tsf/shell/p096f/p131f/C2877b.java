package com.tsf.shell.p096f.p131f;

import com.censivn.C3DEngine.common.renderer.MatrixStack;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.C0974h;
/* renamed from: com.tsf.shell.f.f.b */
/* loaded from: classes.dex */
public class C2877b extends C0974h {
    public C2877b() {
        super(C0892a.f2555F, C0892a.f2556G, 1, 1, false);
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0980j, com.censivn.C3DEngine.p031b.p038f.C0975i
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

    /* renamed from: a */
    public void m4384a(C2932g c2932g) {
        if (visible()) {
            onDrawStart();
            C2939h.f9561a.position().setAllFrom(position());
            C2939h.f9561a.rotation().setAllFrom(rotation());
            C2939h.f9561a.scale().setAllFrom(scale());
            c2932g.m4180u();
            C2939h.f9561a.position().reset();
            C2939h.f9561a.rotation().reset();
            C2939h.f9561a.scale().setAll(1.0f, 1.0f, 1.0f);
            MatrixStack.glPushMatrix();
            draw();
            MatrixStack.glColor(alpha(), getDefaultColor());
            MatrixStack.glPopMatrix();
            onDrawEnd();
        }
    }
}
