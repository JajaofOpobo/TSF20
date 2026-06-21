package com.tsf.shell.e.e.d.a;

import com.censivn.C3DEngine.b.f.l;
import com.censivn.C3DEngine.b.g.w;
import com.censivn.C3DEngine.b.g.x;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class h {
    private l d;
    private boolean b = false;
    private d c = new d(this);
    private a a = new a() { // from class: com.tsf.shell.e.e.d.a.h.1
        @Override // com.tsf.shell.e.e.d.a.a
        public void a() {
            if (h.this.b) {
                h.this.e();
            } else {
                h.this.j();
            }
        }
    };

    public void a(l lVar) {
        this.d = lVar;
    }

    public void a(ArrayList arrayList) {
        f fVar = new f();
        fVar.a = com.censivn.C3DEngine.b.b.a.a(-80.0f);
        fVar.b = com.censivn.C3DEngine.b.b.a.a(150.0f);
        fVar.c = com.censivn.C3DEngine.b.b.a.a(65.0f);
        fVar.d = com.censivn.C3DEngine.b.b.a.a(30.0f);
        fVar.e = 45;
        fVar.f = com.censivn.C3DEngine.b.b.a.a(80.0f);
        this.c.a(arrayList, fVar);
    }

    public boolean a() {
        return this.b;
    }

    public void b() {
        this.a.b();
        this.a.mouseEnabled(true);
    }

    public void c() {
        this.a.d();
        this.a.mouseEnabled(false);
    }

    public void d() {
        while (this.b) {
            e();
        }
    }

    public void e() {
        if (this.b && this.c.b()) {
            this.b = false;
            this.d.mouseEnabled(true);
            x xVar = new x() { // from class: com.tsf.shell.e.e.d.a.h.2
                @Override // com.censivn.C3DEngine.b.g.x
                public void a() {
                    h.this.i();
                }
            };
            xVar.f(0.0f);
            xVar.a(255);
            xVar.a(com.censivn.C3DEngine.b.g.a.a);
            w.a(this.d);
            w.a(this.d, 500, xVar);
            this.a.e();
            h();
        }
    }

    public void f() {
    }

    public void g() {
    }

    public void h() {
    }

    public void i() {
    }

    public void j() {
        if (!this.b) {
            this.b = true;
            k();
            this.c.removeFromParent();
            com.tsf.shell.manager.a.j.a(this.c);
            this.c.a();
            this.d.mouseEnabled(false);
            x xVar = new x() { // from class: com.tsf.shell.e.e.d.a.h.3
                @Override // com.censivn.C3DEngine.b.g.x
                public void a() {
                    h.this.g();
                }
            };
            xVar.f(this.c.c() + com.censivn.C3DEngine.b.b.a.a(100.0f));
            xVar.a(50);
            xVar.a(com.censivn.C3DEngine.b.g.a.a);
            w.a(this.d);
            w.a(this.d, 500, xVar);
            this.a.a(this.c.c() + com.censivn.C3DEngine.b.b.a.a(100.0f));
            f();
        }
    }

    public void k() {
        this.a.c();
        this.c.position().x = com.censivn.C3DEngine.b.b.a.z;
        this.c.position().y = com.censivn.C3DEngine.b.b.a.B;
    }
}
