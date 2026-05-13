package com.censivn.C3DEngine.api.core;

import com.censivn.C3DEngine.b.f.i;
import com.censivn.C3DEngine.b.f.j;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class VObject3dContainer extends VObject3d {
    public VObject3dContainer() {
        this.mThis = this;
        this.vTarget = new j() { // from class: com.censivn.C3DEngine.api.core.VObject3dContainer.1
            @Override // com.censivn.C3DEngine.b.f.i
            public void onFocus() {
                VObject3dContainer.this.mThis.onFocus();
            }

            @Override // com.censivn.C3DEngine.b.f.i
            public void onKillFocus() {
                VObject3dContainer.this.mThis.onKillFocus();
            }

            @Override // com.censivn.C3DEngine.b.f.i
            public void onDrawStart() {
                VObject3dContainer.this.mThis.onDrawStart();
            }

            @Override // com.censivn.C3DEngine.b.f.i
            public void onDrawEnd() {
                VObject3dContainer.this.mThis.onDrawEnd();
            }

            @Override // com.censivn.C3DEngine.b.f.i
            public void onUpdateAnimation() {
                VObject3dContainer.this.mThis.onUpdateAnimation();
            }

            @Override // com.censivn.C3DEngine.b.f.i
            public void draw() {
                VObject3dContainer.this.mThis.draw();
            }

            @Override // com.censivn.C3DEngine.b.f.j, com.censivn.C3DEngine.b.f.i
            public void dispatchDraw() {
                VObject3dContainer.this.mThis.dispatchDraw();
            }

            @Override // com.censivn.C3DEngine.b.f.i
            public void drawMVPMatrix() {
                VObject3dContainer.this.mThis.drawMVPMatrix();
            }

            @Override // com.censivn.C3DEngine.b.f.j
            public void onDrawChildStart(i iVar) {
                ((VObject3dContainer) VObject3dContainer.this.mThis).onDrawChildStart(iVar.getVirtualObject());
            }

            @Override // com.censivn.C3DEngine.b.f.j
            public void onDrawChildEnd(i iVar) {
                ((VObject3dContainer) VObject3dContainer.this.mThis).onDrawChildEnd(iVar.getVirtualObject());
            }

            @Override // com.censivn.C3DEngine.b.f.i
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
        ((j) this.vTarget).addChild(vObject3d.vTarget);
    }

    public void addChildAt(VObject3d vObject3d, int i) {
        ((j) this.vTarget).addChildAt(vObject3d.vTarget, i);
    }

    public boolean removeChild(VObject3d vObject3d) {
        return ((j) this.vTarget).removeChild(vObject3d.vTarget);
    }

    public VObject3d removeChildAt(int i) {
        return ((j) this.vTarget).removeChildAt(i).getVirtualObject();
    }

    public VObject3d getChildAt(int i) {
        return ((j) this.vTarget).getChildAt(i).getVirtualObject();
    }

    public VObject3d getChildByName(String str) {
        i childByName = ((j) this.vTarget).getChildByName(str);
        if (childByName == null) {
            return null;
        }
        return childByName.getVirtualObject();
    }

    public int getChildIndexOf(VObject3d vObject3d) {
        return ((j) this.vTarget).getChildIndexOf(vObject3d.vTarget);
    }

    public int numChildren() {
        return ((j) this.vTarget).numChildren();
    }

    public void renderChildren(boolean z) {
        ((j) this.vTarget).renderChildren(z);
    }

    public boolean renderChildren() {
        return ((j) this.vTarget).renderChildren();
    }

    public ArrayList<VObject3d> children() {
        ArrayList<i> children = ((j) this.vTarget).children();
        int size = children.size();
        ArrayList<VObject3d> arrayList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arrayList.add(children.get(i).getVirtualObject());
        }
        return arrayList;
    }

    @Override // com.censivn.C3DEngine.api.core.VObject3d
    public void destroy() {
        ((j) this.vTarget).destroy();
    }
}
