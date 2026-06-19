package com.tsf.shell.f.f.b;

import com.censivn.C3DEngine.api.element.Number3d;
import com.tsf.b;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class WaveTransition extends 
    public WaveTransition(int i, boolean z) {
        super(i, CrossfadeTransition.d.desktop_transition_wave, z);
    }

    @Override // com.tsf.shell.f.f.PageTransitionEffect
    public void a(com.tsf.shell.f.f.WorkspacePage gVar, float f) {
        gVar.position().x = (com.censivn.C3DEngine.b.b.A.D * f) / 2.0f;
        Number3d number3dScale = gVar.scale();
        Number3d number3dScale2 = gVar.scale();
        float fAbs = 1.0f - Math.abs(CylinderTransition);
        number3dScale2.y = fAbs;
        number3dScale.x = fAbs;
    }
}
