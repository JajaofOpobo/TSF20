package com.tsf.shell.f.h.a.a.a;

import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.f.k;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class g extends k {
    private TextureElement a;
    private TextureElement d;
    private float e;

    public g(float f, float f2) {
        super(f, f2, false);
        this.e = 0.0f;
    }

    @Override // com.censivn.C3DEngine.b.f.j, com.censivn.C3DEngine.b.f.i
    public void dispatchDraw() {
        if (this.d != null) {
            textures().removeAll();
            textures().addElement(this.a);
            alpha((1.0f - this.e) * 255.0f);
            super.dispatchDraw();
            invalidate();
            textures().removeAll();
            textures().addElement(this.d);
            alpha(this.e * 255.0f);
            super.dispatchDraw();
            this.e += (1.0f - this.e) * 0.1f;
            if (Math.abs(this.e - 1.0f) < 0.01f) {
                this.a = this.d;
                this.d = null;
                textures().removeAll();
                textures().addElement(this.a);
                return;
            }
            return;
        }
        super.dispatchDraw();
    }
}
