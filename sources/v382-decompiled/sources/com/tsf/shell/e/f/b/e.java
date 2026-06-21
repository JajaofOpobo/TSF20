package com.tsf.shell.e.f.b;

import com.tsf.shell.R;

/* loaded from: classes.dex */
public class e extends com.tsf.shell.e.f.k {
    public e(int i, boolean z) {
        super(i, R.drawable.desktop_transition_cube_outside, z);
    }

    @Override // com.tsf.shell.e.f.p
    public void b(com.tsf.shell.e.f.g gVar, float f) {
        gVar.position().x = 0.0f;
        gVar.rotation().y = 0.0f;
        com.tsf.shell.e.f.m j = gVar.j();
        if (f < 0.0f) {
            float f2 = -f;
            float f3 = 90.0f * f2;
            float sin = (float) (Math.sin(Math.toRadians(f3)) * com.censivn.C3DEngine.b.b.a.D * 0.5f);
            this.a.position().x = (com.censivn.C3DEngine.b.b.a.A - (f2 * com.censivn.C3DEngine.b.b.a.D)) - ((float) (Math.cos(Math.toRadians(f3)) * (com.censivn.C3DEngine.b.b.a.D * 0.5f)));
            this.a.position().z = -sin;
            this.a.rotation().y = -f3;
        } else {
            float f4 = f * 90.0f;
            float sin2 = (float) (Math.sin(Math.toRadians(f4)) * com.censivn.C3DEngine.b.b.a.D * 0.5f);
            this.a.position().x = com.censivn.C3DEngine.b.b.a.z + (com.censivn.C3DEngine.b.b.a.D * f) + ((float) (Math.cos(Math.toRadians(f4)) * com.censivn.C3DEngine.b.b.a.D * 0.5f));
            this.a.position().z = -sin2;
            this.a.rotation().y = f4;
        }
        this.a.textures().clear();
        this.a.textures().addElement(j.b);
        this.a.a(gVar);
    }

    @Override // com.tsf.shell.e.f.p
    public void a(com.tsf.shell.e.f.g gVar, float f) {
    }
}
