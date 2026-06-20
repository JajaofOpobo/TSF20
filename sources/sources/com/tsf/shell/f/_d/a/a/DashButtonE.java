package com.tsf.shell.f._d.a.a;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.b.f.IRenderable;
import com.censivn.C3DEngine.b.f.GridRenderable;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class DashButtonE extends com.tsf.shell.f._d.a.DashElementBase {
    private com.tsf.shell.f._d.a.DashElementInfo a;

    public DashButtonE(int i, boolean z) {
        super(i, z);
    }

    @Override // com.tsf.shell.f._d.a.DashElementBase
    public i e() {
        if (this.a == null) {
            this.a = new com.tsf.shell.f._d.a.DashElementInfo(this, false);
        }
        return this.a;
    }

    @Override // com.tsf.shell.f._d.a.DashElementBase
    public void a(GridRenderable kVar, Runnable runnable) {
    }

    @Override // com.tsf.shell.f._d.a.DashElementBase
    public void a(i iVar, Number3d number3d, Number3d number3d2, Runnable runnable) {
    }
}
