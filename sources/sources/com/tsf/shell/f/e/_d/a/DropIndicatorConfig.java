package com.tsf.shell.f.e._d.a;

import com.censivn.C3DEngine.b.f.j;
import com.tsf.shell.f.e._d.a.DropIndicatorState;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class DropIndicatorConfig {
    private j d;
    private boolean b = false;
    private c c = new DropIndicatorState(this);
    private a a = new DropIndicatorContainer() { // from class: com.tsf.shell.f.e._d.a.DropIndicatorConfig.1
        @Override // com.tsf.shell.f.e._d.a.DropIndicatorContainer
        public void a() {
            if (d.this.b) {
                d.this.e();
            } else {
                d.this.j();
            }
        }
    };

    public void a(j jVar) {
        this.d = jVar;
    }

    public void a(ArrayList<DropIndicatorState.C0092c> arrayList) {
        DropIndicatorState.b bVar = new DropIndicatorState.b();
        bVar.a = com.censivn.C3DEngine.b.b.A.a(-80.0f);
        bVar.b = com.censivn.C3DEngine.b.b.A.a(150.0f);
        bVar.c = com.censivn.C3DEngine.b.b.A.a(65.0f);
        bVar.d = com.censivn.C3DEngine.b.b.A.a(30.0f);
        bVar.e = 45;
        bVar.f = com.censivn.C3DEngine.b.b.A.a(80.0f);
        this.c.a(arrayList, bVar);
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
            DropIndicatorConfig();
        }
    }

    public void e() {
        if (this.b && this.c.b()) {
            this.b = false;
            this.d.mouseEnabled(true);
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.e._d.a.DropIndicatorConfig.2
                @Override // com.censivn.C3DEngine.b.g.d
                public void a() {
                    d.this.i();
                }
            };
            dVar.f(0.0f);
            dVar.a(255);
            dVar.a(com.censivn.C3DEngine.b.g.a.a);
            com.censivn.C3DEngine.b.g.c.a(this.d);
            com.censivn.C3DEngine.b.g.c.a(this.d, 500, dVar);
            this.a.e();
            DropIndicatorConfig();
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
            DropIndicatorConfig();
            this.c.removeFromParent();
            com.tsf.shell.manager.app.TaskScheduler.a(this.c);
            this.c.a();
            this.d.mouseEnabled(false);
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.e._d.a.DropIndicatorConfig.3
                @Override // com.censivn.C3DEngine.b.g.d
                public void a() {
                    d.this.g();
                }
            };
            dVar.f(this.c.c() + com.censivn.C3DEngine.b.b.A.a(100.0f));
            dVar.a(50);
            dVar.a(com.censivn.C3DEngine.b.g.a.a);
            com.censivn.C3DEngine.b.g.c.a(this.d);
            com.censivn.C3DEngine.b.g.c.a(this.d, 500, dVar);
            this.a.a(this.c.c() + com.censivn.C3DEngine.b.b.A.a(100.0f));
            DropIndicatorConfig();
        }
    }

    public void k() {
        this.a.c();
        this.c.position().x = com.censivn.C3DEngine.b.b.A.z;
        this.c.position().y = com.censivn.C3DEngine.b.b.A.B;
    }
}
