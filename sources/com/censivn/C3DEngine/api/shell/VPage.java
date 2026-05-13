package com.censivn.C3DEngine.api.shell;

import com.censivn.C3DEngine.api.core.VObject3d;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.tsf.shell.p096f.p131f.C2932g;
/* loaded from: classes.dex */
public class VPage {
    public C2932g vTarget;

    public void addWidget(VObject3d vObject3d) {
        this.vTarget.m4229a((C0975i) vObject3d.getVirtualTarget());
    }

    public void addWidget(VObject3d vObject3d, int i) {
        this.vTarget.m4228a((C0975i) vObject3d.getVirtualTarget(), i);
    }

    public void removeWidget(VObject3d vObject3d) {
        this.vTarget.m4207b((C0975i) vObject3d.getVirtualTarget());
    }

    public boolean containsWidget(VObject3d vObject3d) {
        return this.vTarget.m4203c((C0975i) vObject3d.getVirtualTarget());
    }

    public int getWidgetIndex(VObject3d vObject3d) {
        return this.vTarget.m4200d((C0975i) vObject3d.getVirtualTarget());
    }

    public int getIndex() {
        return this.vTarget.m4181t();
    }
}
