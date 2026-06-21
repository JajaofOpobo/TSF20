package com.censivn.C3DEngine.api.primitives;

import com.censivn.C3DEngine.api.core.VObject3dContainer;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.f.m;

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
        this.vTarget = new m(f, f2, i, i2, z, z2) { // from class: com.censivn.C3DEngine.api.primitives.VRectangle.1
            @Override // com.censivn.C3DEngine.b.f.j
            public void onFocus() {
                VRectangle.this.mThis.onFocus();
            }

            @Override // com.censivn.C3DEngine.b.f.j
            public void onKillFocus() {
                VRectangle.this.mThis.onKillFocus();
            }

            @Override // com.censivn.C3DEngine.b.f.j
            public void onDrawStart() {
                VRectangle.this.mThis.onDrawStart();
            }

            @Override // com.censivn.C3DEngine.b.f.j
            public void onDrawEnd() {
                VRectangle.this.mThis.onDrawEnd();
            }

            @Override // com.censivn.C3DEngine.b.f.j
            public void onUpdateAnimation() {
                VRectangle.this.mThis.onUpdateAnimation();
            }

            @Override // com.censivn.C3DEngine.b.f.m, com.censivn.C3DEngine.b.f.j
            public void draw() {
                VRectangle.this.mThis.draw();
            }

            @Override // com.censivn.C3DEngine.b.f.l, com.censivn.C3DEngine.b.f.j
            public void dispatchDraw() {
                VRectangle.this.mThis.dispatchDraw();
            }

            @Override // com.censivn.C3DEngine.b.f.j
            public void drawMVPMatrix() {
                VRectangle.this.mThis.drawMVPMatrix();
            }

            @Override // com.censivn.C3DEngine.b.f.l
            public void onDrawChildStart(j jVar) {
                ((VObject3dContainer) VRectangle.this.mThis).onDrawChildStart(jVar.getVirtualObject());
            }

            @Override // com.censivn.C3DEngine.b.f.l
            public void onDrawChildEnd(j jVar) {
                ((VObject3dContainer) VRectangle.this.mThis).onDrawChildEnd(jVar.getVirtualObject());
            }

            @Override // com.censivn.C3DEngine.b.f.j
            public void drawElement() {
                VRectangle.this.mThis.drawElement();
            }
        };
        this.vTarget.setVirtualObject(this);
    }

    public void setTexturePosition(int i, int i2, int i3, int i4, int i5, int i6) {
        ((m) this.vTarget).a(i, i2, i3, i4, i5, i6);
    }

    public float width() {
        return ((m) this.vTarget).b();
    }

    public float height() {
        return ((m) this.vTarget).c();
    }

    public void width(float f) {
        ((m) this.vTarget).a(f);
    }

    public void height(float f) {
        ((m) this.vTarget).b(f);
    }
}
