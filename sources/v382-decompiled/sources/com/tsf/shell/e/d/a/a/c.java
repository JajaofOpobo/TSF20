package com.tsf.shell.e.d.a.a;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.b.f.m;
import com.censivn.C3DEngine.b.g.w;
import com.censivn.C3DEngine.b.g.x;
import com.tsf.shell.e.i.b.e.j;

/* loaded from: classes.dex */
public class c extends com.tsf.shell.e.d.a.a {
    private com.censivn.C3DEngine.b.f.a.a a;
    private com.tsf.shell.e.d.a.b b;
    private m c;

    public c(int i, boolean z) {
        super(i, z);
        this.a = new j().k;
    }

    @Override // com.tsf.shell.e.d.a.a
    public void a(com.censivn.C3DEngine.b.f.j jVar, Number3d number3d, Number3d number3d2, Runnable runnable) {
        if (jVar.textures().size() != 0 && jVar.textures().get(0).textureElement != null) {
            this.a.removeFromParent();
            this.a.textures().removeAll();
            this.a.textures().addElement(jVar.textures().get(0).textureElement);
            this.a.alpha(150.0f);
            this.a.clearDefaultColor();
            this.a.scale().setAll(1.0f, 1.0f, 1.0f);
            x xVar = new x() { // from class: com.tsf.shell.e.d.a.a.c.1
                @Override // com.censivn.C3DEngine.b.g.x
                public void a() {
                    c.this.a.textures().removeAll();
                    com.tsf.shell.manager.a.j.b(c.this.a);
                }
            };
            this.a.position().setAllFrom(number3d);
            this.a.rotation().setAllFrom(number3d2);
            com.tsf.shell.manager.a.j.a(this.a);
            xVar.l(2.0f);
            xVar.m(2.0f);
            xVar.a(0);
            w.a(this.a);
            w.a(this.a, 250, xVar);
        }
    }

    @Override // com.tsf.shell.e.d.a.a
    public com.censivn.C3DEngine.b.f.j e() {
        if (this.b == null) {
            this.b = new com.tsf.shell.e.d.a.b(this, true);
            this.c = com.tsf.shell.e.g.a.h.a(0.85f);
        }
        return this.b;
    }

    @Override // com.tsf.shell.e.d.a.a
    public void a(m mVar, final Runnable runnable) {
        this.c.textures().clear();
        this.c.textures().addElement(mVar.textures().get(0).textureElement);
        this.c.alpha(150.0f);
        this.c.scale().setAll(1.0f, 1.0f, 1.0f);
        x xVar = new x() { // from class: com.tsf.shell.e.d.a.a.c.2
            @Override // com.censivn.C3DEngine.b.g.x
            public void a() {
                c.this.c.removeFromParent();
                runnable.run();
            }
        };
        this.c.removeFromParent();
        this.b.e.addChild(this.c);
        xVar.l(2.0f);
        xVar.m(2.0f);
        xVar.a(0);
        w.a(this.c);
        w.a(this.c, 500, xVar);
    }
}
