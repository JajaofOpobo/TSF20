package com.tsf.shell.f.f.b;

import com.tsf.b;
import com.tsf.shell.f.f.j;
/* loaded from: classes.dex */
public class g extends com.tsf.shell.f.f.i {
    public g(int i, boolean z) {
        super(i, b.d.desktop_transition_flip, z);
    }

    @Override // com.tsf.shell.f.f.l
    public void b(com.tsf.shell.f.f.g gVar, float f) {
        j.a j = gVar.j();
        this.a.rotation().y = 180.0f * f;
        this.a.textures().clear();
        this.a.textures().addElement(j.b);
        this.a.a(gVar);
    }

    @Override // com.tsf.shell.f.f.l
    public void a(com.tsf.shell.f.f.g gVar, float f) {
    }
}
