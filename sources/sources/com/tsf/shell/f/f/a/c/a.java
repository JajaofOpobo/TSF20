package com.tsf.shell.f.f.a.c;

import android.view.MotionEvent;
import com.tsf.shell.f.f.a.c.c;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class a extends c.a {
    private com.tsf.shell.f.f.a.h a;
    private com.tsf.shell.f.f.a.f b;
    private c c;
    private g d;
    private com.tsf.shell.f.i.c e;
    private com.tsf.shell.f.i.a.c f;
    private com.censivn.C3DEngine.b.d.a g;

    public a(c cVar, com.tsf.shell.f.f.a.f fVar, com.tsf.shell.f.f.a.h hVar) {
        this.c = cVar;
        this.a = hVar;
        this.b = fVar;
        e();
    }

    private void e() {
        this.g = new com.censivn.C3DEngine.b.d.a(null) { // from class: com.tsf.shell.f.f.a.c.a.1
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
        this.d = new g() { // from class: com.tsf.shell.f.f.a.c.a.2
            @Override // com.tsf.shell.f.f.a.c.g
            public void b() {
                if (a.this.c.c() != null) {
                    a.this.a(a.this.c.c());
                }
            }

            @Override // com.tsf.shell.f.f.a.c.h, com.tsf.shell.f.e.f
            public void a(com.tsf.shell.f.e.f fVar) {
                a.this.a((com.tsf.shell.f.i.c) fVar);
            }

            @Override // com.tsf.shell.f.f.a.c.h, com.tsf.shell.f.e.f
            public boolean b(com.tsf.shell.f.e.f fVar) {
                return false;
            }

            @Override // com.tsf.shell.f.f.a.c.h, com.tsf.shell.f.e.f
            public void e(com.tsf.shell.f.e.f fVar) {
            }

            @Override // com.tsf.shell.f.f.a.c.h, com.tsf.shell.f.e.f
            public void d(com.tsf.shell.f.e.f fVar) {
            }
        };
        this.d.position().y = (com.tsf.shell.f.f.a.h.F - com.tsf.shell.f.f.a.f.a) / 2.0f;
        addChild(this.d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.tsf.shell.f.i.c cVar) {
        com.tsf.shell.f.i.c cVar2;
        this.d.c();
        if (cVar instanceof com.tsf.shell.f.i.b.e.g) {
            cVar2 = (com.tsf.shell.f.i.b.e.g) cVar;
            this.e = ((com.tsf.shell.f.i.b.e.g) cVar).ba();
        } else if (cVar instanceof com.tsf.shell.f.i.b.d.b) {
            cVar2 = (com.tsf.shell.f.i.b.d.b) cVar;
            this.e = ((com.tsf.shell.f.i.b.d.b) cVar).az();
        } else {
            cVar2 = null;
        }
        this.c.b(cVar2);
        this.f = (com.tsf.shell.f.i.a.c) this.e.getMouseEventListener();
        this.e.ah();
        this.f.c(null);
        this.c.a(this.e);
        com.tsf.shell.manager.a.h.b(this.e);
        this.c.a(this.g);
    }

    @Override // com.tsf.shell.f.f.a.c.c.a
    public void a() {
        com.tsf.shell.manager.a.k.b(this.d);
        this.d.d();
    }

    public void b() {
        this.d.e();
    }

    @Override // com.tsf.shell.f.f.a.c.c.a
    public void c() {
        com.tsf.shell.manager.a.k.c(this.d);
        this.c.a((com.censivn.C3DEngine.b.d.a) null);
        b();
    }

    @Override // com.tsf.shell.f.f.a.c.c.a
    public void d() {
    }
}
