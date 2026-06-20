package com.tsf.shell.f._d.a.a;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.b.f.IRenderable;
import com.censivn.C3DEngine.b.f.GridRenderable;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class DashButtonC extends com.tsf.shell.f._d.a.DashElementBase {
    private com.censivn.C3DEngine.b.f.a.TextureSpriteRenderable a;
    private com.tsf.shell.f._d.a.DashElementInfo b;
    private GridRenderable c;

    public DashButtonC(int i, boolean z) {
        super(i, z);
        this.a = new com.tsf.shell.f.i.b.e.DrawerItemButton().k;
    }

    @Override // com.tsf.shell.f._d.a.DashElementBase
    public void a(i iVar, Number3d number3d, Number3d number3d2, Runnable runnable) {
        if (iVar.textures().size() != 0 && iVar.textures().get(0).textureElement != null) {
            this.a.removeFromParent();
            this.a.textures().removeAll();
            this.a.textures().addElement(iVar.textures().get(0).textureElement);
            this.a.alpha(150.0f);
            this.a.clearDefaultColor();
            this.a.scale().setAll(1.0f, 1.0f, 1.0f);
            com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams() { // from class: com.tsf.shell.f._d.a.a.DashButtonC.1
                @Override // com.censivn.C3DEngine.b.g.TweenParams
                public void a() {
                    c.this.a.textures().removeAll();
                    com.tsf.shell.manager.app.TaskScheduler.b(c.this.a);
                }
            };
            this.a.position().setAllFrom(number3d);
            this.a.rotation().setAllFrom(number3d2);
            com.tsf.shell.manager.app.TaskScheduler.a(this.a);
            dVar.l(2.0f);
            dVar.m(2.0f);
            dVar.a(0);
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.a);
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.a, 250, dVar);
        }
    }

    @Override // com.tsf.shell.f._d.a.DashElementBase
    public i e() {
        if (this.b == null) {
            this.b = new com.tsf.shell.f._d.a.DashElementInfo(this, true);
            this.c = com.tsf.shell.f.g.a.GestureMenuRenderer.a(0.85f);
        }
        return this.b;
    }

    @Override // com.tsf.shell.f._d.a.DashElementBase
    public void a(GridRenderable kVar, final Runnable runnable) {
        this.c.textures().clear();
        this.c.textures().addElement(kVar.textures().get(0).textureElement);
        this.c.alpha(150.0f);
        this.c.scale().setAll(1.0f, 1.0f, 1.0f);
        com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams() { // from class: com.tsf.shell.f._d.a.a.DashButtonC.2
            @Override // com.censivn.C3DEngine.b.g.TweenParams
            public void a() {
                c.this.c.removeFromParent();
                runnable.run();
            }
        };
        this.c.removeFromParent();
        this.b.e.addChild(this.c);
        dVar.l(2.0f);
        dVar.m(2.0f);
        dVar.a(0);
        com.censivn.C3DEngine.b.g.TweenUtils.a(this.c);
        com.censivn.C3DEngine.b.g.TweenUtils.a(this.c, 500, dVar);
    }
}
