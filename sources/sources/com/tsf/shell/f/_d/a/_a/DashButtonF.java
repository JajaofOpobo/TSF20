package com.tsf.shell.f._d.a._a;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.b.f.IRenderable;
import com.censivn.C3DEngine.b.f.GridRenderable;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class DashButtonF extends com.tsf.shell.f._d.a.DashElementBase {
    private com.tsf.shell.f._d.a.DashElementInfo a;

    public DashButtonF(int i, boolean z) {
        super(i, z);
    }

    @Override // com.tsf.shell.f._d.a.DashElementBase
    public void a(final i iVar, Number3d number3d, Number3d number3d2, final Runnable runnable) {
        com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams() { // from class: com.tsf.shell.f._d.a._a.DashButtonF.1
            @Override // com.censivn.C3DEngine.b.g.TweenParams
            public void a() {
                com.censivn.C3DEngine.b.g.TweenParams dVar2 = new com.censivn.C3DEngine.b.g.TweenParams() { // from class: com.tsf.shell.f._d.a._a.DashButtonF.1.1
                    @Override // com.censivn.C3DEngine.b.g.TweenParams
                    public void c() {
                        f.this.a(iVar);
                    }

                    @Override // com.censivn.C3DEngine.b.g.TweenParams
                    public void a() {
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                };
                dVar2.e(0.0f);
                dVar2.a(com.censivn.C3DEngine.b.g.a.g);
                com.censivn.C3DEngine.b.g.TweenUtils.a(iVar);
                com.censivn.C3DEngine.b.g.TweenUtils.a(iVar, 1000, dVar2);
            }

            @Override // com.censivn.C3DEngine.b.g.TweenParams
            public void c() {
                f.this.a(iVar);
            }
        };
        dVar.e(45.0f);
        com.censivn.C3DEngine.b.g.TweenUtils.a(iVar);
        com.censivn.C3DEngine.b.g.TweenUtils.a(iVar, 250, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(i iVar) {
        iVar.rotation().z = 0.0f;
    }

    @Override // com.tsf.shell.f._d.a.DashElementBase
    public i e() {
        if (this.a == null) {
            this.a = new com.tsf.shell.f._d.a.DashElementInfo(this, true);
        }
        return this.a;
    }

    @Override // com.tsf.shell.f._d.a.DashElementBase
    public void a(GridRenderable kVar, Runnable runnable) {
        a(kVar, null, null, runnable);
    }
}
