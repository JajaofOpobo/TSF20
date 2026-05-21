package com.censivn.C3DEngine.api.shell;

import com.censivn.C3DEngine.api.core.VObject3d;
import com.censivn.C3DEngine.b.f.i;
import com.tsf.shell.f.f.g;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class VPage {
    public g vTarget;

    public void addWidget(VObject3d vObject3d) {
        this.vTarget.a((i) vObject3d.getVirtualTarget());
    }

    public void addWidget(VObject3d vObject3d, int i) {
        this.vTarget.a((i) vObject3d.getVirtualTarget(), i);
    }

    public void removeWidget(VObject3d vObject3d) {
        this.vTarget.b((i) vObject3d.getVirtualTarget());
    }

    public boolean containsWidget(VObject3d vObject3d) {
        return this.vTarget.c((i) vObject3d.getVirtualTarget());
    }

    public int getWidgetIndex(VObject3d vObject3d) {
        return this.vTarget.d((i) vObject3d.getVirtualTarget());
    }

    public int getIndex() {
        return this.vTarget.t();
    }
}
