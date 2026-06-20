package com.censivn.C3DEngine.api.shell;

import com.censivn.C3DEngine.api.core.VObject3d;
import com.censivn.C3DEngine.b.f.IRenderable;
import com.tsf.shell.f.f.g;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class VPage {
    public g vTarget;

    public void addWidget(VObject3d vObject3d) {
        this.vTarget.a((IRenderable) vObject3d.getVirtualTarget());
    }

    public void addWidget(VObject3d vObject3d, int i) {
        this.vTarget.a((IRenderable) vObject3d.getVirtualTarget(), i);
    }

    public void removeWidget(VObject3d vObject3d) {
        this.vTarget.b((IRenderable) vObject3d.getVirtualTarget());
    }

    public boolean containsWidget(VObject3d vObject3d) {
        return this.vTarget.c((IRenderable) vObject3d.getVirtualTarget());
    }

    public int getWidgetIndex(VObject3d vObject3d) {
        return this.vTarget.d((IRenderable) vObject3d.getVirtualTarget());
    }

    public int getIndex() {
        return this.vTarget.t();
    }
}
