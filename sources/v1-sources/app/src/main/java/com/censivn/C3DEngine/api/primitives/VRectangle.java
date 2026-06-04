package com.censivn.C3DEngine.api.primitives;

import com.censivn.C3DEngine.api.core.VObject3d;
import com.censivn.C3DEngine.api.core.VObject3dContainer;

/* loaded from: classes.dex */
public class VRectangle extends VObject3dContainer {

    public class VRectangleParams {
        public boolean autoSize;
        public boolean reverse;

        public VRectangleParams(boolean z, boolean z2) {
            this.reverse = false;
            this.autoSize = true;
            this.reverse = z;
            this.autoSize = z2;
        }
    }

    public VRectangle(float f, float f2) {
        this(f, f2, 1, 1, false, true);
    }

    public VRectangle(float f, float f2, int i, int i2) {
        this(f, f2, i, i2, false, true);
    }

    public VRectangle(float f, float f2, int i, int i2, boolean z) {
        this(f, f2, i, i2, z, true);
    }

    public VRectangle(float f, float f2, VRectangleParams vRectangleParams) {
        this(f, f2, 1, 1, vRectangleParams.reverse, vRectangleParams.autoSize);
    }

    public VRectangle(float f, float f2, int i, int i2, VRectangleParams vRectangleParams) {
        this(f, f2, i, i2, vRectangleParams.reverse, vRectangleParams.autoSize);
    }

    private VRectangle(float f, float f2, int i, int i2, boolean z, boolean z2) {
        this.mThis = this;
        this.vTarget = new b(this, f, f2, i, i2, z, z2);
        this.vTarget.a((VObject3d) this);
    }

    public void setTexturePosition(int i, int i2, int i3, int i4, int i5, int i6) {
        ((com.censivn.C3DEngine.e.b) this.vTarget).a(i, i2, i3, i4, i5, i6);
    }
}
