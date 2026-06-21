package com.tsf.shell.e.f.b;

import com.censivn.C3DEngine.api.element.Number3d;
import com.tsf.shell.R;

/* loaded from: classes.dex */
public class c extends com.tsf.shell.e.f.k {
    public c(int i, boolean z) {
        super(i, R.drawable.desktop_transition_crossfade, z);
    }

    @Override // com.tsf.shell.e.f.p
    public void b(com.tsf.shell.e.f.g gVar, float f) {
        com.tsf.shell.e.f.m j = gVar.j();
        Number3d scale = this.a.scale();
        float f2 = f + 1.0f;
        this.a.scale().y = f2;
        scale.x = f2;
        this.a.alpha((1.0f - Math.abs(f)) * 255.0f);
        this.a.textures().clear();
        this.a.textures().addElement(j.b);
        this.a.a(gVar);
    }

    @Override // com.tsf.shell.e.f.p
    public void a(com.tsf.shell.e.f.g gVar, float f) {
    }

    @Override // com.tsf.shell.e.f.p
    public boolean a(com.tsf.shell.e.f.g gVar, com.censivn.C3DEngine.b.f.b.a aVar) {
        aVar.alpha((1.0f - Math.abs((Math.abs(gVar.g) - 0.5f) * 2.0f)) * 255.0f);
        return true;
    }
}
