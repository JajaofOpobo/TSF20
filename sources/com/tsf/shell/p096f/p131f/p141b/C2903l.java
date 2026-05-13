package com.tsf.shell.p096f.p131f.p141b;

import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.tsf.C1306b;
import com.tsf.shell.p096f.p131f.C2932g;
import com.tsf.shell.p096f.p131f.C2948l;
/* renamed from: com.tsf.shell.f.f.b.l */
/* loaded from: classes.dex */
public class C2903l extends C2948l {
    public C2903l(int i, boolean z) {
        super(i, C1306b.C1310d.desktop_transition_roll, z);
    }

    @Override // com.tsf.shell.p096f.p131f.C2948l
    /* renamed from: a */
    public void mo4141a(C2932g c2932g, float f) {
        c2932g.rotation().f2528z = (-f) * 180.0f;
        c2932g.position().f2526x = ((C0892a.f2553D * f) * 3.0f) / 2.0f;
    }
}
