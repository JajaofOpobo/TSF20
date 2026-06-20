package com.tsf.shell.f._d.a._a;

import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.b.f.IRenderable;
import com.censivn.C3DEngine.b.f.GridRenderable;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class DashButtonB extends com.tsf.shell.f._d.a.DashElementBase {
    Color4 a;
    private com.tsf.shell.f._d.a.DashElementInfo b;

    public DashButtonB(int i, boolean z) {
        super(i, z);
        this.a = new Color4();
    }

    @Override // com.tsf.shell.f._d.a.DashElementBase
    public void a(final i iVar, Number3d number3d, Number3d number3d2, final Runnable runnable) {
        com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams() { // from class: com.tsf.shell.f._d.a._a.DashButtonB.1
            @Override // com.censivn.C3DEngine.b.g.TweenParams
            public void a() {
                com.censivn.C3DEngine.b.g.TweenParams dVar2 = new com.censivn.C3DEngine.b.g.TweenParams() { // from class: com.tsf.shell.f._d.a._a.DashButtonB.1.1
                    @Override // com.censivn.C3DEngine.b.g.TweenParams
                    public void a(float f) {
                        b.this.a(iVar, (int) (155.0f + (100.0f * f)));
                    }

                    @Override // com.censivn.C3DEngine.b.g.TweenParams
                    public void c() {
                        b.this.a(iVar);
                    }

                    @Override // com.censivn.C3DEngine.b.g.TweenParams
                    public void a() {
                        b.this.a(iVar);
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                };
                com.censivn.C3DEngine.b.g.TweenUtils.a(iVar);
                com.censivn.C3DEngine.b.g.TweenUtils.a(iVar, 250, dVar2);
            }

            @Override // com.censivn.C3DEngine.b.g.TweenParams
            public void a(float f) {
                b.this.a(iVar, (int) (255.0f - (100.0f * f)));
            }

            @Override // com.censivn.C3DEngine.b.g.TweenParams
            public void c() {
                b.this.a(iVar);
            }
        };
        com.censivn.C3DEngine.b.g.TweenUtils.a(iVar);
        com.censivn.C3DEngine.b.g.TweenUtils.a(iVar, 250, dVar);
        iVar.setDefaultColor(this.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(i iVar, int i) {
        this.a.set(255, i, i, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(i iVar) {
        iVar.clearDefaultColor();
    }

    @Override // com.tsf.shell.f._d.a.DashElementBase
    public i e() {
        if (this.b == null) {
            this.b = new com.tsf.shell.f._d.a.DashElementInfo(this, true);
        }
        return this.b;
    }

    @Override // com.tsf.shell.f._d.a.DashElementBase
    public void a(GridRenderable kVar, Runnable runnable) {
        a(kVar, null, null, runnable);
    }
}
