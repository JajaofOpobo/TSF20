package com.tsf.shell.f.f.b;

import com.tsf.b;
import com.tsf.shell.f.f.PageAnimationState;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class CubeOutsideTransition extends 
    public d(int i, boolean z) {
        super(i, CrossfadeTransition.d.desktop_transition_cube_outside, z);
    }

    @Override // com.tsf.shell.f.f.PageTransitionEffect
    public void b(com.tsf.shell.f.f.WorkspacePage gVar, float f) {
        gVar.position().x = 0.0f;
        gVar.rotation().y = 0.0f;
        HorizontalFlipTransition.a aVarJ = gVar.j();
        if (f < 0.0f) {
            float f2 = -f;
            float f3 = 90.0f * f2;
            float fSin = (float) (Math.sin(Math.toRadians(f3)) * ((double) (com.censivn.C3DEngine.b.b.A.D * 0.5f)));
            this.a.position().x = (com.censivn.C3DEngine.b.b.A.A - (f2 * com.censivn.C3DEngine.b.b.A.D)) - ((float) (Math.cos(Math.toRadians(f3)) * ((double) (com.censivn.C3DEngine.b.b.A.D * 0.5f))));
            this.a.position().z = -fSin;
            this.a.rotation().y = -f3;
        } else {
            float f4 = f * 90.0f;
            float fSin2 = (float) (Math.sin(Math.toRadians(f4)) * ((double) (com.censivn.C3DEngine.b.b.A.D * 0.5f)));
            this.a.position().x = com.censivn.C3DEngine.b.b.A.z + (com.censivn.C3DEngine.b.b.A.D * f) + ((float) (Math.cos(Math.toRadians(f4)) * ((double) (com.censivn.C3DEngine.b.b.A.D * 0.5f))));
            this.a.position().z = -fSin2;
            this.a.rotation().y = f4;
        }
        this.a.textures().clear();
        this.a.textures().addElement(aVarJ.b);
        this.a.a(gVar);
    }

    @Override // com.tsf.shell.f.f.PageTransitionEffect
    public void a(com.tsf.shell.f.f.WorkspacePage gVar, float f) {
    }
}
