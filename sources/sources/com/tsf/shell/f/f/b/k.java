package com.tsf.shell.f.f.b;

import com.tsf.b;
import com.tsf.shell.f.f.j;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class k extends com.tsf.shell.f.f.i {
    public k(int i, boolean z) {
        super(i, b.d.desktop_transition_page_turn, z);
    }

    @Override // com.tsf.shell.f.f.l
    public void b(com.tsf.shell.f.f.g gVar, float f) {
        j.a aVarJ = gVar.j();
        if (f < 0.0f) {
            float f2 = f * 90.0f;
            float fSin = (float) (Math.sin(Math.toRadians(f2)) * ((double) (com.censivn.C3DEngine.b.b.a.D * 0.5f)));
            this.a.position().x = ((float) (Math.cos(Math.toRadians(f2)) * ((double) (com.censivn.C3DEngine.b.b.a.D * 0.5f)))) + com.censivn.C3DEngine.b.b.a.z;
            this.a.position().z = -fSin;
            this.a.rotation().y = f2;
        } else {
            float f3 = f * 90.0f;
            float fSin2 = (float) (Math.sin(Math.toRadians(f3)) * ((double) (com.censivn.C3DEngine.b.b.a.D * 0.5f)));
            this.a.position().x = com.censivn.C3DEngine.b.b.a.A - ((float) (Math.cos(Math.toRadians(f3)) * ((double) (com.censivn.C3DEngine.b.b.a.D * 0.5f))));
            this.a.position().z = -fSin2;
            this.a.rotation().y = -f3;
        }
        this.a.alpha((1.0f - Math.abs(f)) * 255.0f);
        this.a.textures().clear();
        this.a.textures().addElement(aVarJ.b);
        this.a.a(gVar);
    }

    @Override // com.tsf.shell.f.f.l
    public void a(com.tsf.shell.f.f.g gVar, float f) {
        if (f > 0.0f) {
            gVar.setRendererPriorityLevel(0);
        } else {
            gVar.setRendererPriorityLevel(1);
        }
    }

    @Override // com.tsf.shell.f.f.l
    public boolean a(com.tsf.shell.f.f.g gVar, com.censivn.C3DEngine.b.f.b.a aVar) {
        aVar.alpha((1.0f - Math.abs((Math.abs(gVar.g) - 0.5f) * 2.0f)) * 255.0f);
        return true;
    }
}
