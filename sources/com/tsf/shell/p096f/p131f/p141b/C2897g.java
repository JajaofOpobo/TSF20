package com.tsf.shell.p096f.p131f.p141b;

import com.tsf.C1306b;
import com.tsf.shell.p096f.p131f.AbstractC2941i;
import com.tsf.shell.p096f.p131f.C2932g;
import com.tsf.shell.p096f.p131f.C2942j;
/* renamed from: com.tsf.shell.f.f.b.g */
/* loaded from: classes.dex */
public class C2897g extends AbstractC2941i {
    public C2897g(int i, boolean z) {
        super(i, C1306b.C1310d.desktop_transition_flip, z);
    }

    @Override // com.tsf.shell.p096f.p131f.C2948l
    /* renamed from: b */
    public void mo4136b(C2932g c2932g, float f) {
        C2942j.C2943a m4191j = c2932g.m4191j();
        this.f9568a.rotation().f2527y = 180.0f * f;
        this.f9568a.textures().clear();
        this.f9568a.textures().addElement(m4191j.f9574b);
        this.f9568a.m4384a(c2932g);
    }

    @Override // com.tsf.shell.p096f.p131f.C2948l
    /* renamed from: a */
    public void mo4141a(C2932g c2932g, float f) {
    }
}
