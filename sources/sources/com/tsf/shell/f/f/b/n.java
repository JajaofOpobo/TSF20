package com.tsf.shell.f.f.b;

import com.censivn.C3DEngine.api.element.Number3d;
import com.tsf.b;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class n extends com.tsf.shell.f.f.l {
    public n(int i, boolean z) {
        super(i, b.d.desktop_transition_wave_zoom_out, z);
    }

    @Override // com.tsf.shell.f.f.l
    public void a(com.tsf.shell.f.f.g gVar, float f) {
        gVar.position().x = com.censivn.C3DEngine.b.b.a.D * f * 1.5f;
        Number3d number3dScale = gVar.scale();
        Number3d number3dScale2 = gVar.scale();
        float fAbs = 1.0f + Math.abs(f);
        number3dScale2.y = fAbs;
        number3dScale.x = fAbs;
    }
}
