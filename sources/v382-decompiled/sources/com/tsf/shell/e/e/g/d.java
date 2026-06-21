package com.tsf.shell.e.e.g;

import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.f.l;
import com.censivn.C3DEngine.b.g.w;
import com.censivn.C3DEngine.b.g.x;

/* loaded from: classes.dex */
public class d extends l {
    private com.tsf.shell.e.a.b.c a;
    private j b;

    public d(float f, float f2) {
        this.a = new com.tsf.shell.e.a.b.c(f, f2, this.a);
        this.a.setDefaultColor(new Color4(0, 0, 0, 255));
        this.a.alpha(60.0f);
        this.a.scale().y = 0.0f;
    }

    @Override // com.censivn.C3DEngine.b.f.l, com.censivn.C3DEngine.b.f.g
    public void addChild(j jVar) {
        if (this.b != null) {
            final j jVar2 = this.b;
            x xVar = new x() { // from class: com.tsf.shell.e.e.g.d.1
                @Override // com.censivn.C3DEngine.b.g.x
                public void a() {
                    jVar2.removeFromParent();
                }
            };
            xVar.a(0);
            xVar.h(e.MENU_EXTRA_HEIGHT);
            w.a(jVar2);
            w.a(jVar2, VEasing.Linear.easeNone, xVar);
        }
        this.b = jVar;
        if (this.b.parent() == null) {
            if (this.a.scale().y == 0.0f) {
                this.b.position().y = 0.0f;
            } else {
                this.b.position().y = -e.MENU_EXTRA_HEIGHT;
            }
            this.b.alpha(255.0f);
        }
        x xVar2 = new x();
        xVar2.a(com.censivn.C3DEngine.b.g.a.a);
        xVar2.h(0.0f);
        w.a(this.b);
        w.a(this.b, VEasing.Linear.easeNone, xVar2);
        this.b.removeFromParent();
        super.addChild(this.b);
    }

    public void a() {
        x xVar = new x();
        xVar.m(1.0f);
        w.a(this.a);
        w.a(this.a, VEasing.Linear.easeNone, xVar);
    }

    public void b() {
        x xVar = new x() { // from class: com.tsf.shell.e.e.g.d.2
            @Override // com.censivn.C3DEngine.b.g.x
            public void a() {
                d.this.removeFromParent();
                if (d.this.b != null) {
                    d.this.b.removeFromParent();
                    d.this.b = null;
                }
            }
        };
        xVar.m(0.0f);
        w.a(this.a);
        w.a(this.a, 300, xVar);
    }

    public void a(int i) {
        this.a.a(i);
    }

    @Override // com.censivn.C3DEngine.b.f.l
    public void onDrawChildStart() {
        com.tsf.shell.manager.a.u.a(this.a);
    }

    @Override // com.censivn.C3DEngine.b.f.j
    public void onDrawEnd() {
        com.tsf.shell.manager.a.u.a();
    }
}
