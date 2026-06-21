package com.tsf.shell.e.f.b;

import com.tsf.shell.R;

/* loaded from: classes.dex */
public class d extends com.tsf.shell.e.f.k {
    public d(int i, boolean z) {
        super(i, R.drawable.desktop_transition_cube_inside, z);
    }

    @Override // com.tsf.shell.e.f.p
    public void b(com.tsf.shell.e.f.g gVar, float f) {
        gVar.position().x = 0.0f;
        gVar.rotation().y = 0.0f;
        com.tsf.shell.e.f.m j = gVar.j();
        if (f < 0.0f) {
            float f2 = f * 90.0f;
            float cos = (float) (Math.cos(Math.toRadians(f2)) * com.censivn.C3DEngine.b.b.a.D * 0.5f);
            this.a.position().x = (float) (Math.sin(Math.toRadians(f2)) * com.censivn.C3DEngine.b.b.a.D * 0.5f);
            this.a.position().z = (-cos) + (com.censivn.C3DEngine.b.b.a.D * 0.5f);
            this.a.rotation().y = -f2;
        } else {
            float f3 = f * 90.0f;
            float cos2 = (float) (Math.cos(Math.toRadians(f3)) * com.censivn.C3DEngine.b.b.a.D * 0.5f);
            this.a.position().x = (float) (Math.sin(Math.toRadians(f3)) * com.censivn.C3DEngine.b.b.a.D * 0.5f);
            this.a.position().z = (-cos2) + (com.censivn.C3DEngine.b.b.a.D * 0.5f);
            this.a.rotation().y = -f3;
        }
        this.a.textures().clear();
        this.a.textures().addElement(j.b);
        this.a.a(gVar);
    }

    @Override // com.tsf.shell.e.f.p
    public void a(com.tsf.shell.e.f.g gVar, float f) {
    }
}
