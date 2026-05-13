package com.tsf.shell.p096f.p131f.p141b;

import com.censivn.C3DEngine.p031b.p038f.p040b.C0967a;
import com.tsf.C1306b;
import com.tsf.shell.p096f.p131f.AbstractC2941i;
import com.tsf.shell.p096f.p131f.C2932g;
import com.tsf.shell.p096f.p131f.C2942j;
/* renamed from: com.tsf.shell.f.f.b.j */
/* loaded from: classes.dex */
public class C2901j extends AbstractC2941i {
    public C2901j(int i, boolean z) {
        super(i, C1306b.C1310d.desktop_transition_horizontal_flip, z);
    }

    @Override // com.tsf.shell.p096f.p131f.C2948l
    /* renamed from: b */
    public void mo4136b(C2932g c2932g, float f) {
        C2942j.C2943a m4191j = c2932g.m4191j();
        this.f9568a.rotation().f2526x = 90.0f * f;
        this.f9568a.alpha((1.0f - Math.abs(f)) * 255.0f);
        this.f9568a.textures().clear();
        this.f9568a.textures().addElement(m4191j.f9574b);
        this.f9568a.m4384a(c2932g);
    }

    @Override // com.tsf.shell.p096f.p131f.C2948l
    /* renamed from: a */
    public void mo4141a(C2932g c2932g, float f) {
        if (f > 0.0f) {
            c2932g.setRendererPriorityLevel(0);
        } else {
            c2932g.setRendererPriorityLevel(1);
        }
    }

    @Override // com.tsf.shell.p096f.p131f.C2948l
    /* renamed from: a */
    public boolean mo4140a(C2932g c2932g, C0967a c0967a) {
        c0967a.alpha((1.0f - Math.abs((Math.abs(c2932g.f9541g) - 0.5f) * 2.0f)) * 255.0f);
        return true;
    }
}
