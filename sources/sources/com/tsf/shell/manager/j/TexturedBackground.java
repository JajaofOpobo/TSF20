package com.tsf.shell.manager.j;

import com.censivn.C3DEngine.api.element.TextureElement;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class TexturedBackground extends com.censivn.C3DEngine.b.f.b.a {
    private TextureElement a;
    private int d;

    public TexturedBackground(float f, float f2, float f3, com.censivn.C3DEngine.b.f.b.b bVar, int i) {
        super(f, f2, f3, bVar);
        this.d = i;
        this.a = new TextureElement(0, false);
        textures().addElement(this.a);
    }

    @Override // com.censivn.C3DEngine.b.f.i
    public void onDrawStart() {
        if (this.a.id == 0) {
            com.censivn.C3DEngine.A.g().a(this.a, this.d);
        }
    }
}
