package com.tsf.shell.p096f.p148h.p149a.p150a.p151a;

import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
/* renamed from: com.tsf.shell.f.h.a.a.a.g */
/* loaded from: classes.dex */
public class C3057g extends C0981k {

    /* renamed from: a */
    private TextureElement f9921a;

    /* renamed from: d */
    private TextureElement f9922d;

    /* renamed from: e */
    private float f9923e;

    public C3057g(float f, float f2) {
        super(f, f2, false);
        this.f9923e = 0.0f;
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0980j, com.censivn.C3DEngine.p031b.p038f.C0975i
    public void dispatchDraw() {
        if (this.f9922d != null) {
            textures().removeAll();
            textures().addElement(this.f9921a);
            alpha((1.0f - this.f9923e) * 255.0f);
            super.dispatchDraw();
            invalidate();
            textures().removeAll();
            textures().addElement(this.f9922d);
            alpha(this.f9923e * 255.0f);
            super.dispatchDraw();
            this.f9923e += (1.0f - this.f9923e) * 0.1f;
            if (Math.abs(this.f9923e - 1.0f) < 0.01f) {
                this.f9921a = this.f9922d;
                this.f9922d = null;
                textures().removeAll();
                textures().addElement(this.f9921a);
                return;
            }
            return;
        }
        super.dispatchDraw();
    }
}
