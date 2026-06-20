package com.tsf.shell.f.f.b;

import com.censivn.C3DEngine.api.element.Number3d;
import com.tsf.b;
import com.tsf.shell.f.f.PageAnimationState;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class CurveTransition extends ItemPageTransition {
    private com.tsf.shell.f.f.PageShaderNode b;

    public CurveTransition(int i, boolean z) {
        super(i, CrossfadeTransition.d.desktop_transition_curve, z);
        this.b = new com.tsf.shell.f.f.PageShaderNode();
    }

    @Override // com.tsf.shell.f.f.PageTransitionEffect
    public void b(com.tsf.shell.f.f.WorkspacePage gVar, float f) {
        HorizontalFlipTransition.a aVarJ = gVar.j();
        float f2 = 90.0f * f;
        this.a.removeFromParent();
        this.a.position().y = com.censivn.C3DEngine.b.b.A.I;
        this.b.position().y = -com.censivn.C3DEngine.b.b.A.I;
        this.b.addChild(this.a);
        if (f < 0.0f) {
            this.b.rotation().x = f2;
        } else {
            this.b.rotation().x = -f2;
        }
        this.b.rotation().z = (-f) * 45.0f;
        this.a.alpha((1.0f - Math.abs(CylinderTransition)) * 255.0f);
        this.a.textures().clear();
        this.a.textures().addElement(aVarJ.b);
        Number3d.TEMPNUMBER3D4.setAll(0.0f, com.censivn.C3DEngine.b.b.A.I, 0.0f);
        this.b.a(gVar, Number3d.TEMPNUMBER3D4);
    }

    @Override // com.tsf.shell.f.f.PageTransitionEffect
    public void a(com.tsf.shell.f.f.WorkspacePage gVar, float f) {
        if (f > 0.0f) {
            gVar.setRendererPriorityLevel(0);
        } else {
            gVar.setRendererPriorityLevel(1);
        }
    }

    @Override // com.tsf.shell.f.f.PageTransitionEffect
    public boolean a(com.tsf.shell.f.f.WorkspacePage gVar, com.censivn.C3DEngine.b.f.b.NinePatchRenderable aVar) {
        aVar.alpha((1.0f - Math.abs((Math.abs(gVar.g) - 0.5f) * 2.0f)) * 255.0f);
        return true;
    }
}
