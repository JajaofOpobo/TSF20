package com.tsf.shell.manager.r.b.b;

import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.g.c;
import com.tsf.shell.f.e.g.d;
/* loaded from: classes.dex */
public class a {
    protected j c = new j();
    protected d d;

    public a(d dVar) {
        this.d = dVar;
        this.c.visible(false);
    }

    public void a(boolean z) {
        if (this.c.visible() && z) {
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.manager.r.b.b.a.1
                @Override // com.censivn.C3DEngine.b.g.d
                public void a() {
                    a.this.c.visible(false);
                    a.this.b();
                }
            };
            dVar.h(-this.d.getHeight());
            dVar.a(0);
            c.a(this.c);
            c.a(this.c, com.tsf.shell.f.e.g.a.c.ANIMATION_TIME, dVar);
        } else {
            this.c.position().y = -this.d.getHeight();
            this.c.visible(false);
            this.c.alpha(0.0f);
            b();
        }
        a();
    }

    public void b(boolean z) {
        if (z) {
            if (!this.c.visible()) {
                this.c.alpha(0.0f);
                this.c.position().y = -this.d.getHeight();
            }
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.manager.r.b.b.a.2
                @Override // com.censivn.C3DEngine.b.g.d
                public void a() {
                    a.this.d();
                }
            };
            dVar.h(0.0f);
            dVar.a(255);
            c.a(this.c);
            dVar.a(com.censivn.C3DEngine.b.g.a.a);
            c.a(this.c, com.tsf.shell.f.e.g.a.c.ANIMATION_TIME, dVar);
        } else {
            this.c.alpha(255.0f);
            this.c.position().y = 0.0f;
            d();
        }
        this.c.visible(true);
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

    public j f() {
        return this.c;
    }
}
