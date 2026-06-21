package com.tsf.shell.e.f.b;

import com.censivn.C3DEngine.api.element.Number3d;
import com.tsf.shell.R;

/* loaded from: classes.dex */
public class n extends com.tsf.shell.e.f.p {
    public n(int i, boolean z) {
        super(i, R.drawable.desktop_transition_scale_in_out, z);
    }

    @Override // com.tsf.shell.e.f.p
    public void a(com.tsf.shell.e.f.g gVar, float f) {
        gVar.position().x = 0.0f;
        Number3d scale = gVar.scale();
        Number3d scale2 = gVar.scale();
        float abs = 1.0f - Math.abs(f);
        scale2.y = abs;
        scale.x = abs;
    }
}
