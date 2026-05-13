package com.tsf.shell.f.f.b;

import com.censivn.C3DEngine.api.element.Number3d;
import com.tsf.b;
/* loaded from: classes.dex */
public class p extends com.tsf.shell.f.f.l {
    public p(int i, boolean z) {
        super(i, b.d.desktop_transition_slope_outside, z);
    }

    @Override // com.tsf.shell.f.f.l
    public void a(com.tsf.shell.f.f.g gVar, float f) {
        Number3d scale = gVar.scale();
        Number3d scale2 = gVar.scale();
        float abs = 1.0f - (Math.abs(f) * 0.7f);
        scale2.y = abs;
        scale.x = abs;
        gVar.rotation().y = 40.0f * f;
        gVar.position().x = com.censivn.C3DEngine.b.b.a.D * f * 0.65f;
    }
}
