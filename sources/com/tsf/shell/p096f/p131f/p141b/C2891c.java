package com.tsf.shell.p096f.p131f.p141b;

import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.tsf.C1306b;
import com.tsf.shell.p096f.p131f.AbstractC2941i;
import com.tsf.shell.p096f.p131f.C2932g;
import com.tsf.shell.p096f.p131f.C2942j;
/* renamed from: com.tsf.shell.f.f.b.c */
/* loaded from: classes.dex */
public class C2891c extends AbstractC2941i {
    public C2891c(int i, boolean z) {
        super(i, C1306b.C1310d.desktop_transition_cube_inside, z);
    }

    @Override // com.tsf.shell.p096f.p131f.C2948l
    /* renamed from: b */
    public void mo4136b(C2932g c2932g, float f) {
        c2932g.position().f2526x = 0.0f;
        c2932g.rotation().f2527y = 0.0f;
        C2942j.C2943a m4191j = c2932g.m4191j();
        if (f < 0.0f) {
            float f2 = f * 90.0f;
            this.f9568a.position().f2526x = (float) (Math.sin(Math.toRadians(f2)) * C0892a.f2553D * 0.5f);
            this.f9568a.position().f2528z = (-((float) (Math.cos(Math.toRadians(f2)) * C0892a.f2553D * 0.5f))) + (C0892a.f2553D * 0.5f);
            this.f9568a.rotation().f2527y = -f2;
        } else {
            float f3 = f * 90.0f;
            this.f9568a.position().f2526x = (float) (Math.sin(Math.toRadians(f3)) * C0892a.f2553D * 0.5f);
            this.f9568a.position().f2528z = (-((float) (Math.cos(Math.toRadians(f3)) * C0892a.f2553D * 0.5f))) + (C0892a.f2553D * 0.5f);
            this.f9568a.rotation().f2527y = -f3;
        }
        this.f9568a.textures().clear();
        this.f9568a.textures().addElement(m4191j.f9574b);
        this.f9568a.m4384a(c2932g);
    }

    @Override // com.tsf.shell.p096f.p131f.C2948l
    /* renamed from: a */
    public void mo4141a(C2932g c2932g, float f) {
    }
}
