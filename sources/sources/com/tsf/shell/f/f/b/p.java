package com.tsf.shell.f.f.b;

import com.censivn.C3DEngine.api.element.Number3d;
import com.tsf.b;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class p extends com.tsf.shell.f.f.l {
    public p(int i, boolean z) {
        super(i, b.d.desktop_transition_slope_outside, z);
    }

    @Override // com.tsf.shell.f.f.l
    public void a(com.tsf.shell.f.f.g gVar, float f) {
        Number3d number3dScale = gVar.scale();
        Number3d number3dScale2 = gVar.scale();
        float fAbs = 1.0f - (Math.abs(f) * 0.7f);
        number3dScale2.y = fAbs;
        number3dScale.x = fAbs;
        gVar.rotation().y = 40.0f * f;
        gVar.position().x = com.censivn.C3DEngine.b.b.a.D * f * 0.65f;
    }
}
