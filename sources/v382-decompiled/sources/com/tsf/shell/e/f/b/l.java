package com.tsf.shell.e.f.b;

import com.tsf.shell.R;

/* loaded from: classes.dex */
public class l extends com.tsf.shell.e.f.k {
    public l(int i, boolean z) {
        super(i, R.drawable.desktop_transition_page_turn, z);
    }

    @Override // com.tsf.shell.e.f.p
    public void b(com.tsf.shell.e.f.g gVar, float f) {
        com.tsf.shell.e.f.m j = gVar.j();
        if (f < 0.0f) {
            float f2 = f * 90.0f;
            float sin = (float) (Math.sin(Math.toRadians(f2)) * com.censivn.C3DEngine.b.b.a.D * 0.5f);
            this.a.position().x = ((float) (Math.cos(Math.toRadians(f2)) * com.censivn.C3DEngine.b.b.a.D * 0.5f)) + com.censivn.C3DEngine.b.b.a.z;
            this.a.position().z = -sin;
            this.a.rotation().y = f2;
        } else {
            float f3 = f * 90.0f;
            float sin2 = (float) (Math.sin(Math.toRadians(f3)) * com.censivn.C3DEngine.b.b.a.D * 0.5f);
            this.a.position().x = com.censivn.C3DEngine.b.b.a.A - ((float) (Math.cos(Math.toRadians(f3)) * (com.censivn.C3DEngine.b.b.a.D * 0.5f)));
            this.a.position().z = -sin2;
            this.a.rotation().y = -f3;
        }
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
