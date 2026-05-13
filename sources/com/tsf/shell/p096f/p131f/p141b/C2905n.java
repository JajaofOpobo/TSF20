package com.tsf.shell.p096f.p131f.p141b;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.tsf.C1306b;
import com.tsf.shell.p096f.p131f.C2932g;
import com.tsf.shell.p096f.p131f.C2948l;
/* renamed from: com.tsf.shell.f.f.b.n */
/* loaded from: classes.dex */
public class C2905n extends C2948l {
    public C2905n(int i, boolean z) {
        super(i, C1306b.C1310d.desktop_transition_wave_zoom_out, z);
    }

    @Override // com.tsf.shell.p096f.p131f.C2948l
    /* renamed from: a */
    public void mo4141a(C2932g c2932g, float f) {
        c2932g.position().f2526x = C0892a.f2553D * f * 1.5f;
        Number3d scale = c2932g.scale();
        Number3d scale2 = c2932g.scale();
        float abs = 1.0f + Math.abs(f);
        scale2.f2527y = abs;
        scale.f2526x = abs;
    }
}
