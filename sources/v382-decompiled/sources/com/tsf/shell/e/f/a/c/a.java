package com.tsf.shell.e.f.a.c;

import android.view.MotionEvent;

/* loaded from: classes.dex */
public class a extends d {
    private com.tsf.shell.e.f.a.m a;
    private com.tsf.shell.e.f.a.j b;
    private c c;
    private h d;
    private com.tsf.shell.e.i.e e;
    private com.tsf.shell.e.i.a.c f;
    private com.censivn.C3DEngine.b.d.a g;

    public a(c cVar, com.tsf.shell.e.f.a.j jVar, com.tsf.shell.e.f.a.m mVar) {
        this.c = cVar;
        this.a = mVar;
        this.b = jVar;
        e();
    }

    private void e() {
        this.g = new com.censivn.C3DEngine.b.d.a(null) { // from class: com.tsf.shell.e.f.a.c.a.1
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
        this.d = new h() { // from class: com.tsf.shell.e.f.a.c.a.2
            @Override // com.tsf.shell.e.f.a.c.h
            public void b() {
                if (a.this.c.c() == null) {
                    return;
                }
                a.this.a(a.this.c.c());
            }

            @Override // com.tsf.shell.e.f.a.c.i, com.tsf.shell.e.e.g
            public void a(com.tsf.shell.e.e.g gVar) {
                a.this.a((com.tsf.shell.e.i.e) gVar);
            }

            @Override // com.tsf.shell.e.f.a.c.i, com.tsf.shell.e.e.g
            public boolean b(com.tsf.shell.e.e.g gVar) {
                return false;
            }

            @Override // com.tsf.shell.e.f.a.c.i, com.tsf.shell.e.e.g
            public void e(com.tsf.shell.e.e.g gVar) {
            }

            @Override // com.tsf.shell.e.f.a.c.i, com.tsf.shell.e.e.g
            public void d(com.tsf.shell.e.e.g gVar) {
            }
        };
        this.d.position().y = (com.tsf.shell.e.f.a.m.F - com.tsf.shell.e.f.a.j.a) / 2.0f;
        addChild(this.d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.tsf.shell.e.i.e eVar) {
        com.tsf.shell.e.i.e eVar2;
        this.d.c();
        if (eVar instanceof com.tsf.shell.e.i.b.e.i) {
            eVar2 = (com.tsf.shell.e.i.b.e.i) eVar;
            this.e = ((com.tsf.shell.e.i.b.e.i) eVar).ba();
        } else if (eVar instanceof com.tsf.shell.e.i.b.d.b) {
            eVar2 = (com.tsf.shell.e.i.b.d.b) eVar;
            this.e = ((com.tsf.shell.e.i.b.d.b) eVar).az();
        } else {
            eVar2 = null;
        }
        this.c.b(eVar2);
        this.f = (com.tsf.shell.e.i.a.c) this.e.getMouseEventListener();
        this.e.ah();
        this.f.c(null);
        this.c.a(this.e);
        com.tsf.shell.manager.a.h.b(this.e);
        this.c.a(this.g);
    }

    @Override // com.tsf.shell.e.f.a.c.d
    public void a() {
        com.tsf.shell.manager.a.k.b(this.d);
        this.d.d();
    }

    public void b() {
        this.d.e();
    }

    @Override // com.tsf.shell.e.f.a.c.d
    public void c() {
        com.tsf.shell.manager.a.k.c(this.d);
        this.c.a((com.censivn.C3DEngine.b.d.a) null);
        b();
    }

    @Override // com.tsf.shell.e.f.a.c.d
    public void d() {
    }
}
