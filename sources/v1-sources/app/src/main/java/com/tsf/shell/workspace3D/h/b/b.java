package com.tsf.shell.workspace3D.h.b;

import com.tsf.shell.R;

/* loaded from: classes.dex */
public final class b extends g {
    @Override // com.tsf.shell.workspace3D.h.b.g
    public final void a(com.tsf.shell.workspace3D.h.a aVar, float f) {
        aVar.L().x = com.censivn.C3DEngine.a.j * f * 1.3f;
        aVar.M().y = 30.0f * f;
    }

    @Override // com.tsf.shell.workspace3D.h.b.g
    public final int a() {
        return R.drawable.setting_desktop_effect_rotation;
    }
}
