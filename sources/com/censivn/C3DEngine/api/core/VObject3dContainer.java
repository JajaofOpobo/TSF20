package com.censivn.C3DEngine.api.core;

import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class VObject3dContainer extends VObject3d {
    public VObject3dContainer() {
        this.mThis = this;
        this.vTarget = new C0980j() { // from class: com.censivn.C3DEngine.api.core.VObject3dContainer.1
            @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
            public void onFocus() {
                VObject3dContainer.this.mThis.onFocus();
            }

            @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
            public void onKillFocus() {
                VObject3dContainer.this.mThis.onKillFocus();
            }

            @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
            public void onDrawStart() {
                VObject3dContainer.this.mThis.onDrawStart();
            }

            @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
            public void onDrawEnd() {
                VObject3dContainer.this.mThis.onDrawEnd();
            }

            @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
            public void onUpdateAnimation() {
                VObject3dContainer.this.mThis.onUpdateAnimation();
            }

            @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
            public void draw() {
                VObject3dContainer.this.mThis.draw();
            }

            @Override // com.censivn.C3DEngine.p031b.p038f.C0980j, com.censivn.C3DEngine.p031b.p038f.C0975i
            public void dispatchDraw() {
                VObject3dContainer.this.mThis.dispatchDraw();
            }

            @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
            public void drawMVPMatrix() {
                VObject3dContainer.this.mThis.drawMVPMatrix();
            }

            @Override // com.censivn.C3DEngine.p031b.p038f.C0980j
            public void onDrawChildStart(C0975i c0975i) {
                ((VObject3dContainer) VObject3dContainer.this.mThis).onDrawChildStart(c0975i.getVirtualObject());
            }

            @Override // com.censivn.C3DEngine.p031b.p038f.C0980j
            public void onDrawChildEnd(C0975i c0975i) {
                ((VObject3dContainer) VObject3dContainer.this.mThis).onDrawChildEnd(c0975i.getVirtualObject());
            }

            @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
            public void drawElement() {
                VObject3dContainer.this.mThis.drawElement();
            }
        };
        this.vTarget.setVirtualObject(this);
        this.vTarget.setHighPriorityAnimationObjectState(false);
    }

    public void onDrawChildStart(VObject3d vObject3d) {
    }

    public void onDrawChildEnd(VObject3d vObject3d) {
    }

    public void addChild(VObject3d vObject3d) {
        ((C0980j) this.vTarget).addChild(vObject3d.vTarget);
    }

    public void addChildAt(VObject3d vObject3d, int i) {
        ((C0980j) this.vTarget).addChildAt(vObject3d.vTarget, i);
    }

    public boolean removeChild(VObject3d vObject3d) {
        return ((C0980j) this.vTarget).removeChild(vObject3d.vTarget);
    }

    public VObject3d removeChildAt(int i) {
        return ((C0980j) this.vTarget).removeChildAt(i).getVirtualObject();
    }

    public VObject3d getChildAt(int i) {
        return ((C0980j) this.vTarget).getChildAt(i).getVirtualObject();
    }

    public VObject3d getChildByName(String str) {
        C0975i childByName = ((C0980j) this.vTarget).getChildByName(str);
        if (childByName == null) {
            return null;
        }
        return childByName.getVirtualObject();
    }

    public int getChildIndexOf(VObject3d vObject3d) {
        return ((C0980j) this.vTarget).getChildIndexOf(vObject3d.vTarget);
    }

    public int numChildren() {
        return ((C0980j) this.vTarget).numChildren();
    }

    public void renderChildren(boolean z) {
        ((C0980j) this.vTarget).renderChildren(z);
    }

    public boolean renderChildren() {
        return ((C0980j) this.vTarget).renderChildren();
    }

    public ArrayList<VObject3d> children() {
        ArrayList<C0975i> children = ((C0980j) this.vTarget).children();
        int size = children.size();
        ArrayList<VObject3d> arrayList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arrayList.add(children.get(i).getVirtualObject());
        }
        return arrayList;
    }

    @Override // com.censivn.C3DEngine.api.core.VObject3d
    public void destroy() {
        ((C0980j) this.vTarget).destroy();
    }
}
