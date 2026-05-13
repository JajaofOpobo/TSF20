package com.censivn.C3DEngine.api.primitives;

import com.censivn.C3DEngine.api.core.VObject3dContainer;
import com.censivn.C3DEngine.p031b.p038f.C0969c;
/* loaded from: classes.dex */
public class VBox extends VObject3dContainer {
    public VBox(float f, float f2, float f3) {
        this.mThis = this;
        this.vTarget = new C0969c(f, f2, f3) { // from class: com.censivn.C3DEngine.api.primitives.VBox.1
            @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
            public void onFocus() {
                VBox.this.mThis.onFocus();
            }

            @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
            public void onKillFocus() {
                VBox.this.mThis.onKillFocus();
            }

            @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
            public void onDrawStart() {
                VBox.this.mThis.onDrawStart();
            }

            @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
            public void onDrawEnd() {
                VBox.this.mThis.onDrawEnd();
            }

            @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
            public void onUpdateAnimation() {
                VBox.this.mThis.onUpdateAnimation();
            }
        };
        this.vTarget.setVirtualObject(this);
    }
}
