package com.tsf.shell.f.f.b;

import com.tsf.b;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class l extends com.tsf.shell.f.f.l {
    public l(int i, boolean z) {
        super(i, b.d.desktop_transition_roll, z);
    }

    @Override // com.tsf.shell.f.f.l
    public void a(com.tsf.shell.f.f.g gVar, float f) {
        gVar.rotation().z = (-f) * 180.0f;
        gVar.position().x = ((com.censivn.C3DEngine.b.b.a.D * f) * 3.0f) / 2.0f;
    }
}
