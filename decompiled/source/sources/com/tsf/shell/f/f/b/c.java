package com.tsf.shell.f.f.b;

import com.tsf.b;
import com.tsf.shell.f.f.j;
/* loaded from: classes.dex */
public class c extends com.tsf.shell.f.f.i {
    public c(int i, boolean z) {
        super(i, b.d.desktop_transition_cube_inside, z);
    }

    @Override // com.tsf.shell.f.f.l
    public void b(com.tsf.shell.f.f.g gVar, float f) {
        gVar.position().x = 0.0f;
        gVar.rotation().y = 0.0f;
        j.a j = gVar.j();
        if (f < 0.0f) {
            float f2 = f * 90.0f;
            this.a.position().x = (float) (Math.sin(Math.toRadians(f2)) * com.censivn.C3DEngine.b.b.a.D * 0.5f);
            this.a.position().z = (-((float) (Math.cos(Math.toRadians(f2)) * com.censivn.C3DEngine.b.b.a.D * 0.5f))) + (com.censivn.C3DEngine.b.b.a.D * 0.5f);
            this.a.rotation().y = -f2;
        } else {
            float f3 = f * 90.0f;
            this.a.position().x = (float) (Math.sin(Math.toRadians(f3)) * com.censivn.C3DEngine.b.b.a.D * 0.5f);
            this.a.position().z = (-((float) (Math.cos(Math.toRadians(f3)) * com.censivn.C3DEngine.b.b.a.D * 0.5f))) + (com.censivn.C3DEngine.b.b.a.D * 0.5f);
            this.a.rotation().y = -f3;
        }
        this.a.textures().clear();
        this.a.textures().addElement(j.b);
        this.a.a(gVar);
    }

    @Override // com.tsf.shell.f.f.l
    public void a(com.tsf.shell.f.f.g gVar, float f) {
    }
}
