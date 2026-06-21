package com.tsf.shell.e.f.b;

import com.tsf.shell.R;

/* loaded from: classes.dex */
public class m extends com.tsf.shell.e.f.p {
    public m(int i, boolean z) {
        super(i, R.drawable.desktop_transition_roll, z);
    }

    @Override // com.tsf.shell.e.f.p
    public void a(com.tsf.shell.e.f.g gVar, float f) {
        gVar.rotation().z = (-f) * 180.0f;
        gVar.position().x = ((com.censivn.C3DEngine.b.b.a.D * f) * 3.0f) / 2.0f;
    }
}
