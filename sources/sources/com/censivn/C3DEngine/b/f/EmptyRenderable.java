package com.censivn.C3DEngine.b.f;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class EmptyRenderable extends BaseRenderable {
    public n() {
        super(0, 0);
        super.useVBO(false);
    }

    @Override // com.censivn.C3DEngine.b.f.i
    public void draw() {
        com.censivn.C3DEngine.C3DEngine.e().a(this);
        drawMVPMatrix();
    }

}
