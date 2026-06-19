package com.tsf.shell.f.f.b;

import com.tsf.b;
import com.tsf.shell.f.f.PageAnimationState;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class FlipTransition extends 
    public FlipTransition(int i, boolean z) {
        super(i, CrossfadeTransition.d.desktop_transition_flip, z);
    }

    @Override // com.tsf.shell.f.f.PageTransitionEffect
    public void b(com.tsf.shell.f.f.WorkspacePage gVar, float f) {
        HorizontalFlipTransition.a aVarJ = gVar.j();
        this.a.rotation().y = 180.0f * f;
        this.a.textures().clear();
        this.a.textures().addElement(aVarJ.b);
        this.a.a(gVar);
    }

    @Override // com.tsf.shell.f.f.PageTransitionEffect
    public void a(com.tsf.shell.f.f.WorkspacePage gVar, float f) {
    }
}
