package com.tsf.shell.f.f.b;

import com.tsf.b;
import com.tsf.shell.f.f.j;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class j extends com.tsf.shell.f.f.i {
    public j(int i, boolean z) {
        super(i, b.d.desktop_transition_horizontal_flip, z);
    }

    @Override // com.tsf.shell.f.f.l
    public void b(com.tsf.shell.f.f.g gVar, float f) {
        j.a aVarJ = gVar.j();
        this.a.rotation().x = 90.0f * f;
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
