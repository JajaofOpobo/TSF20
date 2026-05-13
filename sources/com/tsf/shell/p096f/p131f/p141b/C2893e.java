package com.tsf.shell.p096f.p131f.p141b;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.p040b.C0967a;
import com.tsf.C1306b;
import com.tsf.shell.p096f.p131f.AbstractC2941i;
import com.tsf.shell.p096f.p131f.C2675a;
import com.tsf.shell.p096f.p131f.C2932g;
import com.tsf.shell.p096f.p131f.C2942j;
/* renamed from: com.tsf.shell.f.f.b.e */
/* loaded from: classes.dex */
public class C2893e extends AbstractC2941i {

    /* renamed from: b */
    private C2675a f9419b;

    public C2893e(int i, boolean z) {
        super(i, C1306b.C1310d.desktop_transition_curve, z);
        this.f9419b = new C2675a();
    }

    @Override // com.tsf.shell.p096f.p131f.C2948l
    /* renamed from: b */
    public void mo4136b(C2932g c2932g, float f) {
        C2942j.C2943a m4191j = c2932g.m4191j();
        float f2 = 90.0f * f;
        this.f9568a.removeFromParent();
        this.f9568a.position().f2527y = C0892a.f2558I;
        this.f9419b.position().f2527y = -C0892a.f2558I;
        this.f9419b.addChild(this.f9568a);
        if (f < 0.0f) {
            this.f9419b.rotation().f2526x = f2;
        } else {
            this.f9419b.rotation().f2526x = -f2;
        }
        this.f9419b.rotation().f2528z = (-f) * 45.0f;
        this.f9568a.alpha((1.0f - Math.abs(f)) * 255.0f);
        this.f9568a.textures().clear();
        this.f9568a.textures().addElement(m4191j.f9574b);
        Number3d.TEMPNUMBER3D4.setAll(0.0f, C0892a.f2558I, 0.0f);
        this.f9419b.m4986a(c2932g, Number3d.TEMPNUMBER3D4);
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
