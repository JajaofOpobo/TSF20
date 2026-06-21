package com.tsf.shell.e.f.b;

import com.tsf.shell.R;

/* loaded from: classes.dex */
public class h extends com.tsf.shell.e.f.k {
    public h(int i, boolean z) {
        super(i, R.drawable.desktop_transition_flip, z);
    }

    @Override // com.tsf.shell.e.f.p
    public void b(com.tsf.shell.e.f.g gVar, float f) {
        com.tsf.shell.e.f.m j = gVar.j();
        this.a.rotation().y = 180.0f * f;
        this.a.textures().clear();
        this.a.textures().addElement(j.b);
        this.a.a(gVar);
    }

    @Override // com.tsf.shell.e.f.p
    public void a(com.tsf.shell.e.f.g gVar, float f) {
    }
}
