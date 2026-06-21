package com.censivn.C3DEngine.api.shell;

import com.censivn.C3DEngine.api.core.VObject3d;
import com.censivn.C3DEngine.b.f.j;
import com.tsf.shell.e.f.g;

/* loaded from: classes.dex */
public class VPage {
    public g vTarget;

    public void addWidget(VObject3d vObject3d) {
        this.vTarget.a((j) vObject3d.getVirtualTarget());
    }

    public void addWidget(VObject3d vObject3d, int i) {
        this.vTarget.a((j) vObject3d.getVirtualTarget(), i);
    }

    public void removeWidget(VObject3d vObject3d) {
        this.vTarget.b((j) vObject3d.getVirtualTarget());
    }

    public boolean containsWidget(VObject3d vObject3d) {
        return this.vTarget.c((j) vObject3d.getVirtualTarget());
    }

    public int getWidgetIndex(VObject3d vObject3d) {
        return this.vTarget.d((j) vObject3d.getVirtualTarget());
    }

    public int getIndex() {
        return this.vTarget.t();
    }
}
