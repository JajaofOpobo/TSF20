package com.tsf.shell.f.f.b;

import com.tsf.b;
import com.tsf.shell.f.f.j;
/* loaded from: classes.dex */
public class d extends com.tsf.shell.f.f.i {
    public d(int i, boolean z) {
        super(i, b.d.desktop_transition_cube_outside, z);
    }

    @Override // com.tsf.shell.f.f.l
    public void b(com.tsf.shell.f.f.g gVar, float f) {
        gVar.position().x = 0.0f;
        gVar.rotation().y = 0.0f;
        j.a j = gVar.j();
        if (f < 0.0f) {
            float f2 = -f;
            float f3 = 90.0f * f2;
            float f4 = com.censivn.C3DEngine.b.b.a.A - (f2 * com.censivn.C3DEngine.b.b.a.D);
            float sin = (float) (Math.sin(Math.toRadians(f3)) * com.censivn.C3DEngine.b.b.a.D * 0.5f);
            this.a.position().x = f4 - ((float) (Math.cos(Math.toRadians(f3)) * (com.censivn.C3DEngine.b.b.a.D * 0.5f)));
            this.a.position().z = -sin;
            this.a.rotation().y = -f3;
        } else {
            float f5 = f * 90.0f;
            float f6 = com.censivn.C3DEngine.b.b.a.z + (com.censivn.C3DEngine.b.b.a.D * f);
            float sin2 = (float) (Math.sin(Math.toRadians(f5)) * com.censivn.C3DEngine.b.b.a.D * 0.5f);
            this.a.position().x = f6 + ((float) (Math.cos(Math.toRadians(f5)) * com.censivn.C3DEngine.b.b.a.D * 0.5f));
            this.a.position().z = -sin2;
            this.a.rotation().y = f5;
        }
        this.a.textures().clear();
        this.a.textures().addElement(j.b);
        this.a.a(gVar);
    }

    @Override // com.tsf.shell.f.f.l
    public void a(com.tsf.shell.f.f.g gVar, float f) {
    }
}
