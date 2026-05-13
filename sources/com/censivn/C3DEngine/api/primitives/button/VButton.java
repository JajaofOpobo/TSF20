package com.censivn.C3DEngine.api.primitives.button;

import com.censivn.C3DEngine.api.core.VObject3d;
import com.censivn.C3DEngine.api.core.VObject3dContainer;
import com.censivn.C3DEngine.p031b.p038f.p039a.C0962a;
/* loaded from: classes.dex */
public class VButton extends VObject3dContainer {
    public VButton(int i, int i2, int i3, int i4, VObject3d vObject3d, boolean z) {
        this.mThis = this;
        this.vTarget = new C0962a(i, i2, i3, i4, vObject3d == null ? null : vObject3d.vTarget, z) { // from class: com.censivn.C3DEngine.api.primitives.button.VButton.1
            @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
            public void onFocus() {
                super.onFocus();
                VButton.this.mThis.onFocus();
            }

            @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
            public void onKillFocus() {
                super.onKillFocus();
                VButton.this.mThis.onKillFocus();
            }

            @Override // com.censivn.C3DEngine.p031b.p038f.p039a.C0962a, com.censivn.C3DEngine.p031b.p038f.C0975i
            public void onDrawStart() {
                super.onDrawStart();
                VButton.this.mThis.onDrawStart();
            }

            @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
            public void onDrawEnd() {
                super.onDrawEnd();
                VButton.this.mThis.onDrawEnd();
            }

            @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
            public void onUpdateAnimation() {
                super.onUpdateAnimation();
                VButton.this.mThis.onUpdateAnimation();
            }
        };
        this.vTarget.setVirtualObject(this);
    }

    public VButton(int i, int i2, int i3) {
        this.mThis = this;
        this.vTarget = new C0962a(i, i2, i3) { // from class: com.censivn.C3DEngine.api.primitives.button.VButton.2
            @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
            public void onFocus() {
                super.onFocus();
                VButton.this.mThis.onFocus();
            }

            @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
            public void onKillFocus() {
                super.onKillFocus();
                VButton.this.mThis.onKillFocus();
            }

            @Override // com.censivn.C3DEngine.p031b.p038f.p039a.C0962a, com.censivn.C3DEngine.p031b.p038f.C0975i
            public void onDrawStart() {
                super.onDrawStart();
                VButton.this.mThis.onDrawStart();
            }

            @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
            public void onDrawEnd() {
                super.onDrawEnd();
                VButton.this.mThis.onDrawEnd();
            }

            @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
            public void onUpdateAnimation() {
                super.onUpdateAnimation();
                VButton.this.mThis.onUpdateAnimation();
            }
        };
        this.vTarget.setVirtualObject(this);
    }

    public VButton(int i, int i2, int i3, int i4) {
        this.mThis = this;
        this.vTarget = new C0962a(i, i2, i3, i4) { // from class: com.censivn.C3DEngine.api.primitives.button.VButton.3
            @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
            public void onFocus() {
                VButton.this.mThis.onFocus();
            }

            @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
            public void onKillFocus() {
                VButton.this.mThis.onKillFocus();
            }

            @Override // com.censivn.C3DEngine.p031b.p038f.p039a.C0962a, com.censivn.C3DEngine.p031b.p038f.C0975i
            public void onDrawStart() {
                VButton.this.mThis.onDrawStart();
            }

            @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
            public void onDrawEnd() {
                VButton.this.mThis.onDrawEnd();
            }

            @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
            public void onUpdateAnimation() {
                VButton.this.mThis.onUpdateAnimation();
            }
        };
        this.vTarget.setVirtualObject(this);
    }

    public VButton(int i, int i2, int i3, int i4, VObject3d vObject3d) {
        this.mThis = this;
        this.vTarget = new C0962a(i, i2, i3, i4, vObject3d.vTarget, false) { // from class: com.censivn.C3DEngine.api.primitives.button.VButton.4
            @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
            public void onFocus() {
                VButton.this.mThis.onFocus();
            }

            @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
            public void onKillFocus() {
                VButton.this.mThis.onKillFocus();
            }

            @Override // com.censivn.C3DEngine.p031b.p038f.p039a.C0962a, com.censivn.C3DEngine.p031b.p038f.C0975i
            public void onDrawStart() {
                VButton.this.mThis.onDrawStart();
            }

            @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
            public void onDrawEnd() {
                VButton.this.mThis.onDrawEnd();
            }

            @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
            public void onUpdateAnimation() {
                VButton.this.mThis.onUpdateAnimation();
            }
        };
        this.vTarget.setVirtualObject(this);
    }

    public void updateTexturePosition(VButtonItem vButtonItem) {
        ((C0962a) this.vTarget).m10451a(vButtonItem.vTarget);
    }

    public void updateMatrix(VButtonItem vButtonItem) {
        ((C0962a) this.vTarget).m10446b(vButtonItem.vTarget);
    }

    public VButtonItem getItem(int i) {
        return ((C0962a) this.vTarget).m10456a(i).m10432b();
    }
}
