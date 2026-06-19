package com.tsf.shell.f.f.a._c;

import android.view.MotionEvent;
import com.tsf.shell.f.f.a._c.c;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class A extends c.a {
    private com.tsf.shell.f.f.a.h a;
    private com.tsf.shell.f.f.a.f b;
    private c c;
    private g d;
    private com.tsf.shell.f.i.C e;
    private com.tsf.shell.f.i._a.c f;
    private com.censivn.C3DEngine.b.d.a g;

    public A(c cVar, com.tsf.shell.f.f.a.f fVar, com.tsf.shell.f.f.a.h hVar) {
        this.c = cVar;
        this.a = hVar;
        this.b = fVar;
        e();
    }

    private void e() {
        this.g = new com.censivn.C3DEngine.b.d.a(null) { // from class: com.tsf.shell.f.f.a._c._a.1
            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent, MotionEvent motionEvent2) {
                a.this.f.a(motionEvent, motionEvent2);
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void d(MotionEvent motionEvent) {
                a.this.f.d(motionEvent);
                a.this.a.ak();
                a.this.a.ap().q();
            }
        };
        this.d = new g() { // from class: com.tsf.shell.f.f.a._c._a.2
            @Override // com.tsf.shell.f.f.a._c.g
            public void b() {
                if (a.this.c.c() != null) {
                    a.this.a(a.this.c.c());
                }
            }

            @Override // com.tsf.shell.f.f.a._c.h, com.tsf.shell.f.e.F
            public void a(com.tsf.shell.f.e.F fVar) {
                a.this.a((com.tsf.shell.f.i.C) fVar);
            }

            @Override // com.tsf.shell.f.f.a._c.h, com.tsf.shell.f.e.F
            public boolean b(com.tsf.shell.f.e.F fVar) {
                return false;
            }

            @Override // com.tsf.shell.f.f.a._c.h, com.tsf.shell.f.e.F
            public void e(com.tsf.shell.f.e.F fVar) {
            }

            @Override // com.tsf.shell.f.f.a._c.h, com.tsf.shell.f.e.F
            public void d(com.tsf.shell.f.e.F fVar) {
            }
        };
        this.d.position().y = (com.tsf.shell.f.f.a.h.F - com.tsf.shell.f.f.a.f.a) / 2.0f;
        addChild(this.d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.tsf.shell.f.i.C cVar) {
        com.tsf.shell.f.i.C cVar2;
        this.d.c();
        if (cVar instanceof com.tsf.shell.f.i._b.e.g) {
            cVar2 = (com.tsf.shell.f.i._b.e.g) cVar;
            this.e = ((com.tsf.shell.f.i._b.e.g) cVar).ba();
        } else if (cVar instanceof com.tsf.shell.f.i._b.d.b) {
            cVar2 = (com.tsf.shell.f.i._b.d.b) cVar;
            this.e = ((com.tsf.shell.f.i._b.d.b) cVar).az();
        } else {
            cVar2 = null;
        }
        this.c.b(cVar2);
        this.f = (com.tsf.shell.f.i._a.c) this.e.getMouseEventListener();
        this.e.ah();
        this.f.c(null);
        this.c.a(this.e);
        com.tsf.shell.manager.app.StateHub.b(this.e);
        this.c.a(this.g);
    }

    @Override // com.tsf.shell.f.f.a._c.c.a
    public void a() {
        com.tsf.shell.manager.app.StateManager.b(this.d);
        this.d.d();
    }

    public void b() {
        this.d.e();
    }

    @Override // com.tsf.shell.f.f.a._c.c.a
    public void c() {
        com.tsf.shell.manager.app.StateManager.c(this.d);
        this.c.a((com.censivn.C3DEngine.b.d.a) null);
        b();
    }

    @Override // com.tsf.shell.f.f.a._c.c.a
    public void d() {
    }
}
