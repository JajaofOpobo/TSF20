package com.censivn.C3DEngine.api.primitives;

import com.censivn.C3DEngine.api.core.VObject3d;
import com.censivn.C3DEngine.e.c;

/* loaded from: classes.dex */
public class VVirtualObject extends VObject3d {
    public VVirtualObject() {
        this.mThis = this;
        this.vTarget = new c();
        this.vTarget.a((VObject3d) this);
    }
}
