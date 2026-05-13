package com.tsf.shell.f.f.b;

import com.censivn.C3DEngine.api.element.Number3d;
import com.tsf.b;
/* loaded from: classes.dex */
public class q extends com.tsf.shell.f.f.l {
    public q(int i, boolean z) {
        super(i, b.d.desktop_transition_stack, z);
    }

    @Override // com.tsf.shell.f.f.l
    public void a(com.tsf.shell.f.f.g gVar, float f) {
        if (f > 0.0f) {
            Number3d scale = gVar.scale();
            Number3d scale2 = gVar.scale();
            float abs = 1.0f - Math.abs(f);
            scale2.y = abs;
            scale.x = abs;
            gVar.position().x = 0.0f;
            gVar.setRendererPriorityLevel(0);
            return;
        }
        Number3d scale3 = gVar.scale();
        gVar.scale().y = 1.0f;
        scale3.x = 1.0f;
        gVar.position().x = com.censivn.C3DEngine.b.b.a.D * f;
        gVar.setRendererPriorityLevel(1);
    }
}
