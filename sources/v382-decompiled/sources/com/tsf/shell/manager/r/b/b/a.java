package com.tsf.shell.manager.r.b.b;

import com.censivn.C3DEngine.b.f.l;
import com.censivn.C3DEngine.b.g.w;
import com.censivn.C3DEngine.b.g.x;
import com.tsf.shell.e.e.g.e;

/* loaded from: classes.dex */
public class a {
    protected l b = new l();
    protected e c;

    public a(e eVar) {
        this.c = eVar;
        this.b.visible(false);
    }

    public void a(boolean z) {
        if (this.b.visible() && z) {
            x xVar = new x() { // from class: com.tsf.shell.manager.r.b.b.a.1
                @Override // com.censivn.C3DEngine.b.g.x
                public void a() {
                    a.this.b.visible(false);
                    a.this.b();
                }
            };
            xVar.h(-this.c.getHeight());
            xVar.a(0);
            w.a(this.b);
            w.a(this.b, com.tsf.shell.e.e.g.a.e.ANIMATION_TIME, xVar);
        } else {
            this.b.position().y = -this.c.getHeight();
            this.b.visible(false);
            this.b.alpha(0.0f);
            b();
        }
        a();
    }

    public void b(boolean z) {
        if (z) {
            if (!this.b.visible()) {
                this.b.alpha(0.0f);
                this.b.position().y = -this.c.getHeight();
            }
            x xVar = new x() { // from class: com.tsf.shell.manager.r.b.b.a.2
                @Override // com.censivn.C3DEngine.b.g.x
                public void a() {
                    a.this.d();
                }
            };
            xVar.h(0.0f);
            xVar.a(255);
            w.a(this.b);
            xVar.a(com.censivn.C3DEngine.b.g.a.a);
            w.a(this.b, com.tsf.shell.e.e.g.a.e.ANIMATION_TIME, xVar);
        } else {
            this.b.alpha(255.0f);
            this.b.position().y = 0.0f;
            d();
        }
        this.b.visible(true);
        c();
    }

    public void a() {
    }

    public void b() {
    }

    public void c() {
    }

    public void d() {
    }

    public void e() {
    }

    public void a(float f, float f2, float f3, float f4) {
    }

    public l f() {
        return this.b;
    }
}
