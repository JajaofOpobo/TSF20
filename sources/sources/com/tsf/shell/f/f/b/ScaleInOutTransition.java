package com.tsf.shell.f.f.b;

import com.censivn.C3DEngine.api.element.Number3d;
import com.tsf.b;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ScaleInOutTransition extends 
    public ScaleInOutTransition(int i, boolean z) {
        super(i, CrossfadeTransition.d.desktop_transition_scale_in_out, z);
    }

    @Override // com.tsf.shell.f.f.PageTransitionEffect
    public void a(com.tsf.shell.f.f.WorkspacePage gVar, float f) {
        gVar.position().x = 0.0f;
        Number3d number3dScale = gVar.scale();
        Number3d number3dScale2 = gVar.scale();
        float fAbs = 1.0f - Math.abs(CylinderTransition);
        number3dScale2.y = fAbs;
        number3dScale.x = fAbs;
    }
}
