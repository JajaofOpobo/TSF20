package com.censivn.C3DEngine.api.effects;

import com.censivn.C3DEngine.api.core.VObject3d;
import com.censivn.C3DEngine.b.f.i;
import com.censivn.C3DEngine.c.a;
import com.censivn.C3DEngine.c.b;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class VEffectsStack {
    private a vTarget;

    public VEffectsStack(VObject3d vObject3d) {
        this.vTarget = new a((i) vObject3d.getVirtualTarget());
    }

    public void addModifier(VIEffects vIEffects) {
        this.vTarget.a((b) vIEffects.getVirtualTarget());
    }

    public void apply() {
        this.vTarget.a();
    }

    public void collapse() {
        this.vTarget.b();
    }

    public void clear() {
        this.vTarget.c();
    }
}
