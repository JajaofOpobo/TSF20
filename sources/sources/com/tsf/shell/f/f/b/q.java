package com.tsf.shell.f.f.b;

import com.censivn.C3DEngine.api.element.Number3d;
import com.tsf.b;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class q extends com.tsf.shell.f.f.l {
    public q(int i, boolean z) {
        super(i, b.d.desktop_transition_stack, z);
    }

    @Override // com.tsf.shell.f.f.l
    public void a(com.tsf.shell.f.f.g gVar, float f) {
        if (f > 0.0f) {
            Number3d number3dScale = gVar.scale();
            Number3d number3dScale2 = gVar.scale();
            float fAbs = 1.0f - Math.abs(f);
            number3dScale2.y = fAbs;
            number3dScale.x = fAbs;
            gVar.position().x = 0.0f;
            gVar.setRendererPriorityLevel(0);
            return;
        }
        Number3d number3dScale3 = gVar.scale();
        gVar.scale().y = 1.0f;
        number3dScale3.x = 1.0f;
        gVar.position().x = com.censivn.C3DEngine.b.b.a.D * f;
        gVar.setRendererPriorityLevel(1);
    }
}
