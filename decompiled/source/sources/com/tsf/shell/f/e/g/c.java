package com.tsf.shell.f.e.g;

import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.b.f.i;
import com.censivn.C3DEngine.b.f.j;
/* loaded from: classes.dex */
public class c extends j {
    private com.tsf.shell.f.a.b.b a;
    private i b;

    public c(float f, float f2) {
        this.a = new com.tsf.shell.f.a.b.b(f, f2, this.a);
        this.a.setDefaultColor(new Color4(0, 0, 0, 255));
        this.a.alpha(60.0f);
        this.a.scale().y = 0.0f;
    }

    @Override // com.censivn.C3DEngine.b.f.j, com.censivn.C3DEngine.b.f.f
    public void addChild(i iVar) {
        if (this.b != null) {
            final i iVar2 = this.b;
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.e.g.c.1
                @Override // com.censivn.C3DEngine.b.g.d
                public void a() {
                    iVar2.removeFromParent();
                }
            };
            dVar.a(0);
            dVar.h(d.MENU_EXTRA_HEIGHT);
            com.censivn.C3DEngine.b.g.c.a(iVar2);
            com.censivn.C3DEngine.b.g.c.a(iVar2, VEasing.Linear.easeNone, dVar);
        }
        this.b = iVar;
        if (this.b.parent() == null) {
            if (this.a.scale().y == 0.0f) {
                this.b.position().y = 0.0f;
            } else {
                this.b.position().y = -d.MENU_EXTRA_HEIGHT;
            }
            this.b.alpha(255.0f);
        }
        com.censivn.C3DEngine.b.g.d dVar2 = new com.censivn.C3DEngine.b.g.d();
        dVar2.a(com.censivn.C3DEngine.b.g.a.a);
        dVar2.h(0.0f);
        com.censivn.C3DEngine.b.g.c.a(this.b);
        com.censivn.C3DEngine.b.g.c.a(this.b, VEasing.Linear.easeNone, dVar2);
        this.b.removeFromParent();
        super.addChild(this.b);
    }

    public void a() {
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
        dVar.m(1.0f);
        com.censivn.C3DEngine.b.g.c.a(this.a);
        com.censivn.C3DEngine.b.g.c.a(this.a, VEasing.Linear.easeNone, dVar);
    }

    public void b() {
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.e.g.c.2
            @Override // com.censivn.C3DEngine.b.g.d
            public void a() {
                c.this.removeFromParent();
                if (c.this.b != null) {
                    c.this.b.removeFromParent();
                    c.this.b = null;
                }
            }
        };
        dVar.m(0.0f);
        com.censivn.C3DEngine.b.g.c.a(this.a);
        com.censivn.C3DEngine.b.g.c.a(this.a, 300, dVar);
    }

    public void a(int i) {
        this.a.a(i);
    }

    @Override // com.censivn.C3DEngine.b.f.j
    public void onDrawChildStart() {
        com.tsf.shell.manager.a.u.a(this.a);
    }

    @Override // com.censivn.C3DEngine.b.f.i
    public void onDrawEnd() {
        com.tsf.shell.manager.a.u.a();
    }
}
