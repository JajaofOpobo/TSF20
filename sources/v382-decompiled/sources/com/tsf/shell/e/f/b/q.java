package com.tsf.shell.e.f.b;

import com.censivn.C3DEngine.api.element.Number3d;
import com.tsf.shell.R;

/* loaded from: classes.dex */
public class q extends com.tsf.shell.e.f.p {
    public q(int i, boolean z) {
        super(i, R.drawable.desktop_transition_slope_outside, z);
    }

    @Override // com.tsf.shell.e.f.p
    public void a(com.tsf.shell.e.f.g gVar, float f) {
        Number3d scale = gVar.scale();
        Number3d scale2 = gVar.scale();
        float abs = 1.0f - (Math.abs(f) * 0.7f);
        scale2.y = abs;
        scale.x = abs;
        gVar.rotation().y = 40.0f * f;
        gVar.position().x = com.censivn.C3DEngine.b.b.a.D * f * 0.65f;
    }
}
