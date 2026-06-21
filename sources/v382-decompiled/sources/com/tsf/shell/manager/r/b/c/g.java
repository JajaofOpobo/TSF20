package com.tsf.shell.manager.r.b.c;

import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class g extends com.tsf.shell.manager.r.b.b.a {
    private com.censivn.C3DEngine.b.h.b.i a;
    private ArrayList d;
    private float e;
    private float f;

    public g(com.tsf.shell.e.e.g.e eVar, final com.tsf.shell.e.e.g.a.e eVar2) {
        super(eVar);
        this.d = new ArrayList();
        this.e = 0.0f;
        this.f = 0.0f;
        this.a = new com.censivn.C3DEngine.b.h.b.i(com.censivn.C3DEngine.b.b.a.D, eVar.getHeight(), 50.0f * com.censivn.C3DEngine.b.b.a.c, com.censivn.C3DEngine.b.b.a.c * 20.0f, this.e, this.f);
        this.b.addChild(this.a);
        this.a.a(new com.censivn.C3DEngine.b.h.b.b() { // from class: com.tsf.shell.manager.r.b.c.g.1
            @Override // com.censivn.C3DEngine.b.h.b.b
            public int a() {
                return g.this.d.size();
            }

            @Override // com.censivn.C3DEngine.b.h.b.b
            public com.censivn.C3DEngine.b.f.j a(int i, com.censivn.C3DEngine.b.f.j jVar) {
                com.censivn.C3DEngine.b.f.j jVar2 = jVar == null ? new j(g.this.e, g.this.f, com.censivn.C3DEngine.b.b.a.a(30.0f), true) : jVar;
                j jVar3 = (j) jVar2;
                if (jVar3.b() != g.this.e || jVar3.c() != g.this.f) {
                    jVar3.a(g.this.e, g.this.f);
                }
                jVar3.a((com.tsf.shell.e.i.c.g) g.this.d.get(i), eVar2.isAnimation());
                return jVar2;
            }

            @Override // com.censivn.C3DEngine.b.h.b.b
            public void a(com.censivn.C3DEngine.b.f.j jVar) {
                ((j) jVar).d();
            }
        });
        this.a.b(0.0f, com.censivn.C3DEngine.b.b.a.c * 20.0f);
        this.a.a(new h(eVar) { // from class: com.tsf.shell.manager.r.b.c.g.2
            @Override // com.tsf.shell.manager.r.b.c.h, com.censivn.C3DEngine.b.h.b.g
            public void a(com.censivn.C3DEngine.b.f.j jVar, int i, MotionEvent motionEvent) {
                com.tsf.shell.e.i.c.g gVar = (com.tsf.shell.e.i.c.g) g.this.d.get(i);
                if (gVar instanceof com.tsf.shell.e.i.c.i) {
                    com.tsf.shell.e.i.c.i iVar = (com.tsf.shell.e.i.c.i) gVar;
                    if (!iVar.j()) {
                        iVar.k();
                        return;
                    } else {
                        g.this.a(gVar);
                        return;
                    }
                }
                g.this.a(gVar);
            }

            @Override // com.tsf.shell.manager.r.b.c.h
            public com.tsf.shell.e.i.c.g a(int i) {
                return (com.tsf.shell.e.i.c.g) g.this.d.get(i);
            }

            @Override // com.tsf.shell.manager.r.b.c.h
            public boolean a(com.tsf.shell.e.i.c.g gVar, float f, float f2) {
                return g.this.a(gVar, f, f2);
            }
        });
    }

    @Override // com.tsf.shell.manager.r.b.b.a
    public void a() {
    }

    @Override // com.tsf.shell.manager.r.b.b.a
    public void c() {
        g();
    }

    @Override // com.tsf.shell.manager.r.b.b.a
    public void e() {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            com.tsf.shell.e.i.c.i iVar = (com.tsf.shell.e.i.c.i) ((com.tsf.shell.e.i.c.g) it.next());
            iVar.i();
            iVar.g();
        }
    }

    @Override // com.tsf.shell.manager.r.b.b.a
    public void a(float f, float f2, float f3, float f4) {
        this.e = (com.censivn.C3DEngine.b.b.a.D - (120.0f * com.censivn.C3DEngine.b.b.a.c)) / 2.0f;
        this.f = 370.0f * com.censivn.C3DEngine.b.b.a.c;
        this.a.a(this.e, this.f);
        this.a.a(f, f2, f3, f4);
    }

    public void a(com.tsf.shell.e.i.c.g gVar) {
    }

    public boolean a(com.tsf.shell.e.i.c.g gVar, float f, float f2) {
        return true;
    }

    public void g() {
        this.a.d();
    }

    public void b(com.tsf.shell.e.i.c.g gVar) {
        this.d.add(gVar);
        this.a.d();
    }

    public void a(ArrayList arrayList) {
        this.d.addAll(arrayList);
        this.a.d();
    }

    public void c(com.tsf.shell.e.i.c.g gVar) {
        this.d.remove(gVar);
        this.a.d();
    }
}
