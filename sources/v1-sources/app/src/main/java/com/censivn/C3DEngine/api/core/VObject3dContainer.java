package com.censivn.C3DEngine.api.core;

import com.censivn.C3DEngine.b.r;
import com.censivn.C3DEngine.b.v;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class VObject3dContainer extends VObject3d {
    public VObject3dContainer() {
        this.mThis = this;
        this.vTarget = new a(this);
        this.vTarget.a((VObject3d) this);
        this.vTarget.v();
    }

    public void onDrawChildStart(VObject3d vObject3d) {
    }

    public void onDrawChildEnd(VObject3d vObject3d) {
    }

    public void addChild(VObject3d vObject3d) {
        ((v) this.vTarget).d(vObject3d.vTarget);
    }

    public void addChildAt(VObject3d vObject3d, int i) {
        ((v) this.vTarget).a(vObject3d.vTarget, i);
    }

    public boolean removeChild(VObject3d vObject3d) {
        return ((v) this.vTarget).e(vObject3d.vTarget);
    }

    public VObject3d removeChildAt(int i) {
        return ((v) this.vTarget).c(i).r();
    }

    public VObject3d getChildAt(int i) {
        return ((v) this.vTarget).d(i).r();
    }

    public VObject3d getChildByName(String str) {
        r b = ((v) this.vTarget).b(str);
        if (b == null) {
            return null;
        }
        return b.r();
    }

    public int getChildIndexOf(VObject3d vObject3d) {
        return ((v) this.vTarget).f(vObject3d.vTarget);
    }

    public int numChildren() {
        return ((v) this.vTarget).aB();
    }

    public void renderChildren(boolean z) {
        ((v) this.vTarget).g(z);
    }

    public boolean renderChildren() {
        return ((v) this.vTarget).aC();
    }

    public ArrayList children() {
        ArrayList aD = ((v) this.vTarget).aD();
        int size = aD.size();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < size; i++) {
            arrayList.add(((r) aD.get(i)).r());
        }
        return arrayList;
    }

    @Override // com.censivn.C3DEngine.api.core.VObject3d
    public void destroy() {
        ((v) this.vTarget).H();
    }
}
