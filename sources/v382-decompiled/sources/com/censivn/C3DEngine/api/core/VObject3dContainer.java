package com.censivn.C3DEngine.api.core;

import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.f.l;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class VObject3dContainer extends VObject3d {
    public VObject3dContainer() {
        this.mThis = this;
        this.vTarget = new l() { // from class: com.censivn.C3DEngine.api.core.VObject3dContainer.1
            @Override // com.censivn.C3DEngine.b.f.j
            public void onFocus() {
                VObject3dContainer.this.mThis.onFocus();
            }

            @Override // com.censivn.C3DEngine.b.f.j
            public void onKillFocus() {
                VObject3dContainer.this.mThis.onKillFocus();
            }

            @Override // com.censivn.C3DEngine.b.f.j
            public void onDrawStart() {
                VObject3dContainer.this.mThis.onDrawStart();
            }

            @Override // com.censivn.C3DEngine.b.f.j
            public void onDrawEnd() {
                VObject3dContainer.this.mThis.onDrawEnd();
            }

            @Override // com.censivn.C3DEngine.b.f.j
            public void onUpdateAnimation() {
                VObject3dContainer.this.mThis.onUpdateAnimation();
            }

            @Override // com.censivn.C3DEngine.b.f.j
            public void draw() {
                VObject3dContainer.this.mThis.draw();
            }

            @Override // com.censivn.C3DEngine.b.f.l, com.censivn.C3DEngine.b.f.j
            public void dispatchDraw() {
                VObject3dContainer.this.mThis.dispatchDraw();
            }

            @Override // com.censivn.C3DEngine.b.f.j
            public void drawMVPMatrix() {
                VObject3dContainer.this.mThis.drawMVPMatrix();
            }

            @Override // com.censivn.C3DEngine.b.f.l
            public void onDrawChildStart(j jVar) {
                ((VObject3dContainer) VObject3dContainer.this.mThis).onDrawChildStart(jVar.getVirtualObject());
            }

            @Override // com.censivn.C3DEngine.b.f.l
            public void onDrawChildEnd(j jVar) {
                ((VObject3dContainer) VObject3dContainer.this.mThis).onDrawChildEnd(jVar.getVirtualObject());
            }

            @Override // com.censivn.C3DEngine.b.f.j
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
        ((l) this.vTarget).addChild(vObject3d.vTarget);
    }

    public void addChildAt(VObject3d vObject3d, int i) {
        ((l) this.vTarget).addChildAt(vObject3d.vTarget, i);
    }

    public boolean removeChild(VObject3d vObject3d) {
        return ((l) this.vTarget).removeChild(vObject3d.vTarget);
    }

    public VObject3d removeChildAt(int i) {
        return ((l) this.vTarget).removeChildAt(i).getVirtualObject();
    }

    public VObject3d getChildAt(int i) {
        return ((l) this.vTarget).getChildAt(i).getVirtualObject();
    }

    public VObject3d getChildByName(String str) {
        j childByName = ((l) this.vTarget).getChildByName(str);
        if (childByName == null) {
            return null;
        }
        return childByName.getVirtualObject();
    }

    public int getChildIndexOf(VObject3d vObject3d) {
        return ((l) this.vTarget).getChildIndexOf(vObject3d.vTarget);
    }

    public int numChildren() {
        return ((l) this.vTarget).numChildren();
    }

    public void renderChildren(boolean z) {
        ((l) this.vTarget).renderChildren(z);
    }

    public boolean renderChildren() {
        return ((l) this.vTarget).renderChildren();
    }

    public ArrayList children() {
        ArrayList children = ((l) this.vTarget).children();
        int size = children.size();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < size; i++) {
            arrayList.add(((j) children.get(i)).getVirtualObject());
        }
        return arrayList;
    }

    @Override // com.censivn.C3DEngine.api.core.VObject3d
    public void destroy() {
        ((l) this.vTarget).destroy();
    }
}
