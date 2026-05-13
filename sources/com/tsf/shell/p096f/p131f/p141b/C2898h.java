package com.tsf.shell.p096f.p131f.p141b;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.p040b.C0967a;
import com.tsf.C1306b;
import com.tsf.shell.p096f.p131f.AbstractC2941i;
import com.tsf.shell.p096f.p131f.C2932g;
import com.tsf.shell.p096f.p131f.C2942j;
/* renamed from: com.tsf.shell.f.f.b.h */
/* loaded from: classes.dex */
public class C2898h extends AbstractC2941i {
    public C2898h(int i, boolean z) {
        super(i, C1306b.C1310d.desktop_transition_fly_in, z);
    }

    @Override // com.tsf.shell.p096f.p131f.C2948l
    /* renamed from: b */
    public void mo4136b(C2932g c2932g, float f) {
        C2942j.C2943a m4191j = c2932g.m4191j();
        if (f < 0.0f) {
            Number3d scale = this.f9568a.scale();
            float f2 = ((-f) * 0.5f) + 1.0f;
            this.f9568a.scale().f2527y = f2;
            scale.f2526x = f2;
            this.f9568a.position().f2526x = (((C0892a.f2553D / 2) * 0.5f) + ((1.5f * C0892a.f2553D) / 2.0f)) * f;
        } else {
            Number3d scale2 = this.f9568a.scale();
            float f3 = ((-f) * 1.0f) + 1.0f;
            this.f9568a.scale().f2527y = f3;
            scale2.f2526x = f3;
            this.f9568a.position().f2526x = ((C0892a.f2553D / 2) + ((C0892a.f2553D * 0.0f) / 2.0f)) * f;
        }
        this.f9568a.alpha((1.0f - Math.abs(f)) * 255.0f);
        this.f9568a.textures().clear();
        this.f9568a.textures().addElement(m4191j.f9574b);
        this.f9568a.m4384a(c2932g);
    }

    @Override // com.tsf.shell.p096f.p131f.C2948l
    /* renamed from: a */
    public void mo4141a(C2932g c2932g, float f) {
        if (f > 0.0f) {
            c2932g.setRendererPriorityLevel(1);
        } else {
            c2932g.setRendererPriorityLevel(0);
        }
    }

    @Override // com.tsf.shell.p096f.p131f.C2948l
    /* renamed from: a */
    public boolean mo4140a(C2932g c2932g, C0967a c0967a) {
        c0967a.alpha((1.0f - Math.abs((Math.abs(c2932g.f9541g) - 0.5f) * 2.0f)) * 255.0f);
        return true;
    }
}
