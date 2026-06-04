package com.tsf.shell.workspace3D.h.b;

import com.censivn.C3DEngine.api.element.Number3d;
import com.tsf.shell.R;

/* loaded from: classes.dex */
public final class a extends g {
    @Override // com.tsf.shell.workspace3D.h.b.g
    public final void a(com.tsf.shell.workspace3D.h.a aVar, float f) {
        if (f > 0.0f) {
            Number3d N = aVar.N();
            Number3d N2 = aVar.N();
            float abs = 1.0f - Math.abs(f);
            N2.y = abs;
            N.x = abs;
            aVar.L().x = 0.0f;
            return;
        }
        Number3d N3 = aVar.N();
        aVar.N().y = 1.0f;
        N3.x = 1.0f;
        aVar.L().x = com.censivn.C3DEngine.a.j * f;
    }

    @Override // com.tsf.shell.workspace3D.h.b.g
    public final int a() {
        return R.drawable.setting_desktop_effect_card;
    }
}
