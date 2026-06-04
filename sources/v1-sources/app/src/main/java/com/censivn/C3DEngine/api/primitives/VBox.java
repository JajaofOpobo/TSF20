package com.censivn.C3DEngine.api.primitives;

import com.censivn.C3DEngine.api.core.VObject3d;
import com.censivn.C3DEngine.api.core.VObject3dContainer;

/* loaded from: classes.dex */
public class VBox extends VObject3dContainer {
    public VBox(float f, float f2, float f3) {
        this.mThis = this;
        this.vTarget = new a(this, f, f2, f3);
        this.vTarget.a((VObject3d) this);
    }
}
