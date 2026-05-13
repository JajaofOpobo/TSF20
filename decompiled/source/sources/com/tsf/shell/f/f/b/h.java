package com.tsf.shell.f.f.b;

import com.censivn.C3DEngine.api.element.Number3d;
import com.tsf.b;
import com.tsf.shell.f.f.j;
/* loaded from: classes.dex */
public class h extends com.tsf.shell.f.f.i {
    public h(int i, boolean z) {
        super(i, b.d.desktop_transition_fly_in, z);
    }

    @Override // com.tsf.shell.f.f.l
    public void b(com.tsf.shell.f.f.g gVar, float f) {
        j.a j = gVar.j();
        if (f < 0.0f) {
            Number3d scale = this.a.scale();
            float f2 = ((-f) * 0.5f) + 1.0f;
            this.a.scale().y = f2;
            scale.x = f2;
            this.a.position().x = (((com.censivn.C3DEngine.b.b.a.D / 2) * 0.5f) + ((1.5f * com.censivn.C3DEngine.b.b.a.D) / 2.0f)) * f;
        } else {
            Number3d scale2 = this.a.scale();
            float f3 = ((-f) * 1.0f) + 1.0f;
            this.a.scale().y = f3;
            scale2.x = f3;
            this.a.position().x = ((com.censivn.C3DEngine.b.b.a.D / 2) + ((com.censivn.C3DEngine.b.b.a.D * 0.0f) / 2.0f)) * f;
        }
        this.a.alpha((1.0f - Math.abs(f)) * 255.0f);
        this.a.textures().clear();
        this.a.textures().addElement(j.b);
        this.a.a(gVar);
    }

    @Override // com.tsf.shell.f.f.l
    public void a(com.tsf.shell.f.f.g gVar, float f) {
        if (f > 0.0f) {
            gVar.setRendererPriorityLevel(1);
        } else {
            gVar.setRendererPriorityLevel(0);
        }
    }

    @Override // com.tsf.shell.f.f.l
    public boolean a(com.tsf.shell.f.f.g gVar, com.censivn.C3DEngine.b.f.b.a aVar) {
        aVar.alpha((1.0f - Math.abs((Math.abs(gVar.g) - 0.5f) * 2.0f)) * 255.0f);
        return true;
    }
}
