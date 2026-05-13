package com.censivn.C3DEngine.api.effects;

import com.censivn.C3DEngine.api.core.VObject3d;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p052c.C1070a;
import com.censivn.C3DEngine.p052c.InterfaceC1078b;
/* loaded from: classes.dex */
public class VEffectsStack {
    private C1070a vTarget;

    public VEffectsStack(VObject3d vObject3d) {
        this.vTarget = new C1070a((C0975i) vObject3d.getVirtualTarget());
    }

    public void addModifier(VIEffects vIEffects) {
        this.vTarget.m9974a((InterfaceC1078b) vIEffects.getVirtualTarget());
    }

    public void apply() {
        this.vTarget.m9976a();
    }

    public void collapse() {
        this.vTarget.m9973b();
    }

    public void clear() {
        this.vTarget.m9972c();
    }
}
