package com.tsf.shell.e.f.b;

import com.censivn.C3DEngine.api.element.Number3d;
import com.tsf.shell.R;

/* loaded from: classes.dex */
public class f extends com.tsf.shell.e.f.k {
    private com.tsf.shell.e.f.a b;

    public f(int i, boolean z) {
        super(i, R.drawable.desktop_transition_curve, z);
        this.b = new com.tsf.shell.e.f.a();
    }

    @Override // com.tsf.shell.e.f.p
    public void b(com.tsf.shell.e.f.g gVar, float f) {
        com.tsf.shell.e.f.m j = gVar.j();
        float f2 = 90.0f * f;
        this.a.removeFromParent();
        this.a.position().y = com.censivn.C3DEngine.b.b.a.I;
        this.b.position().y = -com.censivn.C3DEngine.b.b.a.I;
        this.b.addChild(this.a);
        if (f < 0.0f) {
            this.b.rotation().x = f2;
        } else {
            this.b.rotation().x = -f2;
        }
        this.b.rotation().z = (-f) * 45.0f;
        this.a.alpha((1.0f - Math.abs(f)) * 255.0f);
        this.a.textures().clear();
        this.a.textures().addElement(j.b);
        Number3d.TEMPNUMBER3D4.setAll(0.0f, com.censivn.C3DEngine.b.b.a.I, 0.0f);
        this.b.a(gVar, Number3d.TEMPNUMBER3D4);
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
