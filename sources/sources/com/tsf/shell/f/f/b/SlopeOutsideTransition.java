package com.tsf.shell.f.f.b;

import com.censivn.C3DEngine.api.element.Number3d;
import com.tsf.b;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class SlopeOutsideTransition extends 
    public SlopeOutsideTransition(int i, boolean z) {
        super(i, CrossfadeTransition.d.desktop_transition_slope_outside, z);
    }

    @Override // com.tsf.shell.f.f.PageTransitionEffect
    public void a(com.tsf.shell.f.f.WorkspacePage gVar, float f) {
        Number3d number3dScale = gVar.scale();
        Number3d number3dScale2 = gVar.scale();
        float fAbs = 1.0f - (Math.abs(CylinderTransition) * 0.7f);
        number3dScale2.y = fAbs;
        number3dScale.x = fAbs;
        gVar.rotation().y = 40.0f * f;
        gVar.position().x = com.censivn.C3DEngine.b.b.A.D * f * 0.65f;
    }
}
