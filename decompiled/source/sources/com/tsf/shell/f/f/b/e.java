package com.tsf.shell.f.f.b;

import com.censivn.C3DEngine.api.element.Number3d;
import com.tsf.b;
import com.tsf.shell.f.f.j;
/* loaded from: classes.dex */
public class e extends com.tsf.shell.f.f.i {
    private com.tsf.shell.f.f.a b;

    public e(int i, boolean z) {
        super(i, b.d.desktop_transition_curve, z);
        this.b = new com.tsf.shell.f.f.a();
    }

    @Override // com.tsf.shell.f.f.l
    public void b(com.tsf.shell.f.f.g gVar, float f) {
        j.a j = gVar.j();
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

    @Override // com.tsf.shell.f.f.l
    public void a(com.tsf.shell.f.f.g gVar, float f) {
        if (f > 0.0f) {
            gVar.setRendererPriorityLevel(0);
        } else {
            gVar.setRendererPriorityLevel(1);
        }
    }

    @Override // com.tsf.shell.f.f.l
    public boolean a(com.tsf.shell.f.f.g gVar, com.censivn.C3DEngine.b.f.b.a aVar) {
        aVar.alpha((1.0f - Math.abs((Math.abs(gVar.g) - 0.5f) * 2.0f)) * 255.0f);
        return true;
    }
}
