package com.tsf.shell.e.f.b;

import com.censivn.C3DEngine.api.element.Number3d;
import com.tsf.shell.R;

/* loaded from: classes.dex */
public class r extends com.tsf.shell.e.f.p {
    public r(int i, boolean z) {
        super(i, R.drawable.desktop_transition_stack, z);
    }

    @Override // com.tsf.shell.e.f.p
    public void a(com.tsf.shell.e.f.g gVar, float f) {
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
