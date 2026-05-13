package com.tsf.shell.p096f.p131f.p141b;

import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.tsf.C1306b;
import com.tsf.shell.p096f.p131f.C2932g;
import com.tsf.shell.p096f.p131f.C2948l;
/* renamed from: com.tsf.shell.f.f.b.t */
/* loaded from: classes.dex */
public class C2911t extends C2948l {

    /* renamed from: a */
    final float f9436a;

    public C2911t(int i, boolean z) {
        super(i, C1306b.C1310d.desktop_transition_windmill, z);
        this.f9436a = 32.0f;
    }

    @Override // com.tsf.shell.p096f.p131f.C2948l
    /* renamed from: a */
    public void mo4141a(C2932g c2932g, float f) {
        float f2 = 32.0f * f;
        float tan = (float) (((C0892a.f2553D / 2) / Math.tan(Math.toRadians(16.0d))) + (C0892a.f2554E / 2));
        c2932g.position().f2526x = (float) (Math.sin(Math.toRadians(f2)) * tan);
        c2932g.position().f2527y = tan - ((float) (Math.cos(Math.toRadians(f2)) * tan));
        c2932g.rotation().f2528z = f2;
    }
}
