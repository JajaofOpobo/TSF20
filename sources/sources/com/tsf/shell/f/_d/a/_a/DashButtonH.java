package com.tsf.shell.f._d.a._a;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.b.f.IRenderable;
import com.censivn.C3DEngine.b.f.GridRenderable;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class DashButtonH extends com.tsf.shell.f._d.a.DashElementBase {
    private com.tsf.shell.f._d.a.DashElementInfo a;

    public DashButtonH(int i, boolean z) {
        super(i, z);
    }

    @Override // com.tsf.shell.f._d.a.DashElementBase
    public void a(final i iVar, Number3d number3d, Number3d number3d2, final Runnable runnable) {
        final com.censivn.C3DEngine.b.g._b.a aVarA = iVar instanceof com.censivn.C3DEngine.b.f._a.AltTextureSpriteRenderable ? ((com.censivn.C3DEngine.b.f._a.AltTextureSpriteRenderable) iVar).a(0) : iVar;
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f._d.a._a.DashButtonH.1
            @Override // com.censivn.C3DEngine.b.g.d
            public void a() {
                com.censivn.C3DEngine.b.g.d dVar2 = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f._d.a._a.DashButtonH.1.1
                    @Override // com.censivn.C3DEngine.b.g.d
                    public void a() {
                        if (runnable != null) {
                            runnable.run();
                        }
                    }

                    @Override // com.censivn.C3DEngine.b.g.d
                    public void c() {
                        h.this.a(iVar);
                    }
                };
                dVar2.l(1.0f);
                dVar2.m(1.0f);
                com.censivn.C3DEngine.b.g.c.a(aVarA);
                com.censivn.C3DEngine.b.g.c.a(aVarA, 250, dVar2);
            }

            @Override // com.censivn.C3DEngine.b.g.d
            public void c() {
                h.this.a(iVar);
            }
        };
        dVar.l(1.25f);
        dVar.m(1.25f);
        com.censivn.C3DEngine.b.g.c.a(aVarA);
        com.censivn.C3DEngine.b.g.c.a(aVarA, 250, dVar);
    }

    public void a(i iVar) {
        if (iVar instanceof com.censivn.C3DEngine.b.f._a.AltTextureSpriteRenderable) {
            com.censivn.C3DEngine.b.f._a.AltSpriteItemData bVarA = ((com.censivn.C3DEngine.b.f._a.AltTextureSpriteRenderable) iVar).a(0);
            Number3d number3dK = bVarA.k();
            bVarA.k().y = 1.0f;
            number3dK.x = 1.0f;
            bVarA.f();
        } else {
            Number3d number3dScale = iVar.scale();
            iVar.scale().y = 1.0f;
            number3dScale.x = 1.0f;
        }
        com.censivn.C3DEngine.b.g.c.a(iVar);
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
