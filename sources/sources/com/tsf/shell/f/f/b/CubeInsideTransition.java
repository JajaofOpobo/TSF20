package com.tsf.shell.f.f.b;

import com.tsf.b;
import com.tsf.shell.f.f.PageAnimationState;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class CubeInsideTransition extends 
    public CubeInsideTransition(int i, boolean z) {
        super(i, CrossfadeTransition.d.desktop_transition_cube_inside, z);
    }

    @Override // com.tsf.shell.f.f.PageTransitionEffect
    public void b(com.tsf.shell.f.f.WorkspacePage gVar, float f) {
        gVar.position().x = 0.0f;
        gVar.rotation().y = 0.0f;
        HorizontalFlipTransition.a aVarJ = gVar.j();
        if (f < 0.0f) {
            float f2 = f * 90.0f;
            float fCos = (float) (Math.cos(Math.toRadians(f2)) * ((double) (com.censivn.C3DEngine.b.b.A.D * 0.5f)));
            this.a.position().x = (float) (Math.sin(Math.toRadians(f2)) * ((double) (com.censivn.C3DEngine.b.b.A.D * 0.5f)));
            this.a.position().z = (-fCos) + (com.censivn.C3DEngine.b.b.A.D * 0.5f);
            this.a.rotation().y = -f2;
        } else {
            float f3 = f * 90.0f;
            float fCos2 = (float) (Math.cos(Math.toRadians(f3)) * ((double) (com.censivn.C3DEngine.b.b.A.D * 0.5f)));
            this.a.position().x = (float) (Math.sin(Math.toRadians(f3)) * ((double) (com.censivn.C3DEngine.b.b.A.D * 0.5f)));
            this.a.position().z = (-fCos2) + (com.censivn.C3DEngine.b.b.A.D * 0.5f);
            this.a.rotation().y = -f3;
        }
        this.a.textures().clear();
        this.a.textures().addElement(aVarJ.b);
        this.a.a(gVar);
    }

    @Override // com.tsf.shell.f.f.PageTransitionEffect
    public void a(com.tsf.shell.f.f.WorkspacePage gVar, float f) {
    }
}
