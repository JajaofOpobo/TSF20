package com.tsf.shell.f.f.b;

import com.censivn.C3DEngine.api.element.Number3d;
import com.tsf.shell.f.f.PageAnimationState;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class CrossfadeTransition extends ItemPageTransition {
    public CrossfadeTransition(int i, boolean z) {
        super(i, com.tsf.b.d.desktop_transition_crossfade, z);
    }

    @Override // com.tsf.shell.f.f.PageTransitionEffect
    public void b(com.tsf.shell.f.f.WorkspacePage gVar, float f) {
        HorizontalFlipTransition.a aVarJ = gVar.j();
        Number3d number3dScale = this.a.scale();
        float f2 = f + 1.0f;
        this.a.scale().y = f2;
        number3dScale.x = f2;
        this.a.alpha((1.0f - Math.abs(CylinderTransition)) * 255.0f);
        this.a.textures().clear();
        this.a.textures().addElement(aVarJ.b);
        this.a.a(gVar);
    }

    @Override // com.tsf.shell.f.f.PageTransitionEffect
    public void a(com.tsf.shell.f.f.WorkspacePage gVar, float f) {
    }

    @Override // com.tsf.shell.f.f.PageTransitionEffect
    public boolean a(com.tsf.shell.f.f.WorkspacePage gVar, com.censivn.C3DEngine.b.f.b.NinePatchRenderable aVar) {
        aVar.alpha((1.0f - Math.abs((Math.abs(gVar.g) - 0.5f) * 2.0f)) * 255.0f);
        return true;
    }
}
