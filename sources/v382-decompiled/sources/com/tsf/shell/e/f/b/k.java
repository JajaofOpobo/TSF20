package com.tsf.shell.e.f.b;

import com.tsf.shell.R;

/* loaded from: classes.dex */
public class k extends com.tsf.shell.e.f.k {
    public k(int i, boolean z) {
        super(i, R.drawable.desktop_transition_horizontal_flip, z);
    }

    @Override // com.tsf.shell.e.f.p
    public void b(com.tsf.shell.e.f.g gVar, float f) {
        com.tsf.shell.e.f.m j = gVar.j();
        this.a.rotation().x = 90.0f * f;
        this.a.alpha((1.0f - Math.abs(f)) * 255.0f);
        this.a.textures().clear();
        this.a.textures().addElement(j.b);
        this.a.a(gVar);
    }

    @Override // com.tsf.shell.e.f.p
    public void a(com.tsf.shell.e.f.g gVar, float f) {
        if (f > 0.0f) {
            gVar.setRendererPriorityLevel(0);
        } else {
            gVar.setRendererPriorityLevel(1);
        }
    }

    @Override // com.tsf.shell.e.f.p
    public boolean a(com.tsf.shell.e.f.g gVar, com.censivn.C3DEngine.b.f.b.a aVar) {
        aVar.alpha((1.0f - Math.abs((Math.abs(gVar.g) - 0.5f) * 2.0f)) * 255.0f);
        return true;
    }
}
