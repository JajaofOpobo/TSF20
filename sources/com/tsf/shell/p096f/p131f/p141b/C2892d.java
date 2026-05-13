package com.tsf.shell.p096f.p131f.p141b;

import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.tsf.C1306b;
import com.tsf.shell.p096f.p131f.AbstractC2941i;
import com.tsf.shell.p096f.p131f.C2932g;
import com.tsf.shell.p096f.p131f.C2942j;
/* renamed from: com.tsf.shell.f.f.b.d */
/* loaded from: classes.dex */
public class C2892d extends AbstractC2941i {
    public C2892d(int i, boolean z) {
        super(i, C1306b.C1310d.desktop_transition_cube_outside, z);
    }

    @Override // com.tsf.shell.p096f.p131f.C2948l
    /* renamed from: b */
    public void mo4136b(C2932g c2932g, float f) {
        c2932g.position().f2526x = 0.0f;
        c2932g.rotation().f2527y = 0.0f;
        C2942j.C2943a m4191j = c2932g.m4191j();
        if (f < 0.0f) {
            float f2 = -f;
            float f3 = 90.0f * f2;
            float f4 = C0892a.f2550A - (f2 * C0892a.f2553D);
            float sin = (float) (Math.sin(Math.toRadians(f3)) * C0892a.f2553D * 0.5f);
            this.f9568a.position().f2526x = f4 - ((float) (Math.cos(Math.toRadians(f3)) * (C0892a.f2553D * 0.5f)));
            this.f9568a.position().f2528z = -sin;
            this.f9568a.rotation().f2527y = -f3;
        } else {
            float f5 = f * 90.0f;
            float f6 = C0892a.f2590z + (C0892a.f2553D * f);
            float sin2 = (float) (Math.sin(Math.toRadians(f5)) * C0892a.f2553D * 0.5f);
            this.f9568a.position().f2526x = f6 + ((float) (Math.cos(Math.toRadians(f5)) * C0892a.f2553D * 0.5f));
            this.f9568a.position().f2528z = -sin2;
            this.f9568a.rotation().f2527y = f5;
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
