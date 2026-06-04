package com.censivn.C3DEngine.api.primitives.button;

import com.censivn.C3DEngine.api.core.VObject3d;
import com.censivn.C3DEngine.api.core.VObject3dContainer;

/* loaded from: classes.dex */
public class VButton extends VObject3dContainer {
    public VButton(int i, int i2, int i3) {
        this.mThis = this;
        this.vTarget = new a(this, i, i2, i3);
        this.vTarget.a((VObject3d) this);
    }

    public VButton(int i, int i2, int i3, int i4) {
        this.mThis = this;
        this.vTarget = new b(this, i, i2, i3, i4);
        this.vTarget.a((VObject3d) this);
    }

    public VButton(int i, int i2, int i3, int i4, VObject3d vObject3d) {
        this.mThis = this;
        this.vTarget = new c(this, i, i2, i3, i4, vObject3d.vTarget);
        this.vTarget.a((VObject3d) this);
    }

    public void updateTexturePosition(VButtonItem vButtonItem) {
        ((com.censivn.C3DEngine.e.a.a) this.vTarget).a(vButtonItem.vTarget);
    }

    public void updateMatrix(VButtonItem vButtonItem) {
        ((com.censivn.C3DEngine.e.a.a) this.vTarget).b(vButtonItem.vTarget);
    }

    public VButtonItem getItem(int i) {
        return ((com.censivn.C3DEngine.e.a.a) this.vTarget).a(i).a();
    }
}
