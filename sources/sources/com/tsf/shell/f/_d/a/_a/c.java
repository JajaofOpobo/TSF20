package com.tsf.shell.f._d.a._a;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.b.f.i;
import com.censivn.C3DEngine.b.f.k;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class c extends com.tsf.shell.f._d.a.A {
    private com.censivn.C3DEngine.b.f._a.a a;
    private com.tsf.shell.f._d.a.b b;
    private k c;

    public c(int i, boolean z) {
        super(i, z);
        this.a = new com.tsf.shell.f.i._b.e.WidgetDrawerItemButton().k;
    }

    @Override // com.tsf.shell.f._d.a.A
    public void a(i iVar, Number3d number3d, Number3d number3d2, Runnable runnable) {
        if (iVar.textures().size() != 0 && iVar.textures().get(0).textureElement != null) {
            this.a.removeFromParent();
            this.a.textures().removeAll();
            this.a.textures().addElement(iVar.textures().get(0).textureElement);
            this.a.alpha(150.0f);
            this.a.clearDefaultColor();
            this.a.scale().setAll(1.0f, 1.0f, 1.0f);
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f._d.a._a.c.1
                @Override // com.censivn.C3DEngine.b.g.d
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
            com.censivn.C3DEngine.b.g.c.a(this.a);
            com.censivn.C3DEngine.b.g.c.a(this.a, 250, dVar);
        }
    }

    @Override // com.tsf.shell.f._d.a.A
    public i e() {
        if (this.b == null) {
            this.b = new com.tsf.shell.f._d.a.b(this, true);
            this.c = com.tsf.shell.f.g.a.h.a(0.85f);
        }
        return this.b;
    }

    @Override // com.tsf.shell.f._d.a.A
    public void a(k kVar, final Runnable runnable) {
        this.c.textures().clear();
        this.c.textures().addElement(kVar.textures().get(0).textureElement);
        this.c.alpha(150.0f);
        this.c.scale().setAll(1.0f, 1.0f, 1.0f);
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f._d.a._a.c.2
            @Override // com.censivn.C3DEngine.b.g.d
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
        com.censivn.C3DEngine.b.g.c.a(this.c);
        com.censivn.C3DEngine.b.g.c.a(this.c, 500, dVar);
    }
}
