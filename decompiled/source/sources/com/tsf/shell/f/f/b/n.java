package com.tsf.shell.f.f.b;

import com.censivn.C3DEngine.api.element.Number3d;
import com.tsf.b;
/* loaded from: classes.dex */
public class n extends com.tsf.shell.f.f.l {
    public n(int i, boolean z) {
        super(i, b.d.desktop_transition_wave_zoom_out, z);
    }

    @Override // com.tsf.shell.f.f.l
    public void a(com.tsf.shell.f.f.g gVar, float f) {
        gVar.position().x = com.censivn.C3DEngine.b.b.a.D * f * 1.5f;
        Number3d scale = gVar.scale();
        Number3d scale2 = gVar.scale();
        float abs = 1.0f + Math.abs(f);
        scale2.y = abs;
        scale.x = abs;
    }
}
