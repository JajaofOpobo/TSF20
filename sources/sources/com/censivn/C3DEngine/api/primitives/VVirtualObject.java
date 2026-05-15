package com.censivn.C3DEngine.api.primitives;

import com.censivn.C3DEngine.api.core.VObject3d;
import com.censivn.C3DEngine.b.f.n;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class VVirtualObject extends VObject3d {
    public VVirtualObject() {
        this.mThis = this;
        this.vTarget = new n();
        this.vTarget.setVirtualObject(this);
    }
}
