package com.tsf.shell.p096f.p131f.p141b;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.tsf.C1306b;
import com.tsf.shell.p096f.p131f.C2932g;
import com.tsf.shell.p096f.p131f.C2948l;
/* renamed from: com.tsf.shell.f.f.b.q */
/* loaded from: classes.dex */
public class C2908q extends C2948l {
    public C2908q(int i, boolean z) {
        super(i, C1306b.C1310d.desktop_transition_stack, z);
    }

    @Override // com.tsf.shell.p096f.p131f.C2948l
    /* renamed from: a */
    public void mo4141a(C2932g c2932g, float f) {
        if (f > 0.0f) {
            Number3d scale = c2932g.scale();
            Number3d scale2 = c2932g.scale();
            float abs = 1.0f - Math.abs(f);
            scale2.f2527y = abs;
            scale.f2526x = abs;
            c2932g.position().f2526x = 0.0f;
            c2932g.setRendererPriorityLevel(0);
            return;
        }
        Number3d scale3 = c2932g.scale();
        c2932g.scale().f2527y = 1.0f;
        scale3.f2526x = 1.0f;
        c2932g.position().f2526x = C0892a.f2553D * f;
        c2932g.setRendererPriorityLevel(1);
    }
}
