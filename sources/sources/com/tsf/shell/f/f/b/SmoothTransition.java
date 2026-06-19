package com.tsf.shell.f.f.b;

import com.tsf.b;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class SmoothTransition extends 
    public r(int i, boolean z) {
        super(i, CrossfadeTransition.d.desktop_transition_effect_smooth, z);
    }

    @Override // com.tsf.shell.f.f.PageTransitionEffect
    public void a(com.tsf.shell.f.f.WorkspacePage gVar, float f) {
        gVar.position().x = com.censivn.C3DEngine.b.b.A.D * f;
    }
}
