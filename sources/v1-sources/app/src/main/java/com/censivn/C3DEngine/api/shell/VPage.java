package com.censivn.C3DEngine.api.shell;

import com.censivn.C3DEngine.api.core.VObject3d;
import com.censivn.C3DEngine.b.r;

/* loaded from: classes.dex */
public class VPage {
    public com.tsf.shell.workspace3D.h.a vTarget;

    public void addWidget(VObject3d vObject3d) {
        this.vTarget.g((r) vObject3d.getVirtualTarget());
    }

    public void addWidget(VObject3d vObject3d, int i) {
        this.vTarget.b((r) vObject3d.getVirtualTarget(), i);
    }

    public void removeWidget(VObject3d vObject3d) {
        this.vTarget.h((r) vObject3d.getVirtualTarget());
    }

    public boolean containsWidget(VObject3d vObject3d) {
        return this.vTarget.i((r) vObject3d.getVirtualTarget());
    }

    public int getWidgetIndex(VObject3d vObject3d) {
        return this.vTarget.j((r) vObject3d.getVirtualTarget());
    }

    public int getIndex() {
        return this.vTarget.aG();
    }
}
