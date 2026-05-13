package com.censivn.C3DEngine.api.primitives;

import com.censivn.C3DEngine.api.core.VObject3dContainer;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
/* loaded from: classes.dex */
public class VRectangle extends VObject3dContainer {

    /* loaded from: classes.dex */
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
        this.vTarget = new C0981k(f, f2, i, i2, z, z2) { // from class: com.censivn.C3DEngine.api.primitives.VRectangle.1
            @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
            public void onFocus() {
                VRectangle.this.mThis.onFocus();
            }

            @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
            public void onKillFocus() {
                VRectangle.this.mThis.onKillFocus();
            }

            @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
            public void onDrawStart() {
                VRectangle.this.mThis.onDrawStart();
            }

            @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
            public void onDrawEnd() {
                VRectangle.this.mThis.onDrawEnd();
            }

            @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
            public void onUpdateAnimation() {
                VRectangle.this.mThis.onUpdateAnimation();
            }

            @Override // com.censivn.C3DEngine.p031b.p038f.C0981k, com.censivn.C3DEngine.p031b.p038f.C0975i
            public void draw() {
                VRectangle.this.mThis.draw();
            }

            @Override // com.censivn.C3DEngine.p031b.p038f.C0980j, com.censivn.C3DEngine.p031b.p038f.C0975i
            public void dispatchDraw() {
                VRectangle.this.mThis.dispatchDraw();
            }

            @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
            public void drawMVPMatrix() {
                VRectangle.this.mThis.drawMVPMatrix();
            }

            @Override // com.censivn.C3DEngine.p031b.p038f.C0980j
            public void onDrawChildStart(C0975i c0975i) {
                ((VObject3dContainer) VRectangle.this.mThis).onDrawChildStart(c0975i.getVirtualObject());
            }

            @Override // com.censivn.C3DEngine.p031b.p038f.C0980j
            public void onDrawChildEnd(C0975i c0975i) {
                ((VObject3dContainer) VRectangle.this.mThis).onDrawChildEnd(c0975i.getVirtualObject());
            }

            @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
            public void drawElement() {
                VRectangle.this.mThis.drawElement();
            }
        };
        this.vTarget.setVirtualObject(this);
    }

    public void setTexturePosition(int i, int i2, int i3, int i4, int i5, int i6) {
        ((C0981k) this.vTarget).m10367a(i, i2, i3, i4, i5, i6);
    }

    public float width() {
        return ((C0981k) this.vTarget).mo10366b();
    }

    public float height() {
        return ((C0981k) this.vTarget).mo10365c();
    }

    public void width(float f) {
        ((C0981k) this.vTarget).mo10368a(f);
    }

    public void height(float f) {
        ((C0981k) this.vTarget).mo5215b(f);
    }
}
