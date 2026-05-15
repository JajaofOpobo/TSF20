package com.tsf.shell.manager.r.b.c;

import android.view.MotionEvent;
import com.censivn.C3DEngine.b.f.i;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class e extends com.tsf.shell.manager.r.b.b.a {
    private com.censivn.C3DEngine.b.h.b.h a;
    private ArrayList<com.tsf.shell.f.i.c.e> b;
    private float e;
    private float f;

    public e(com.tsf.shell.f.e.g.d dVar, final com.tsf.shell.f.e.g.a.c cVar) {
        super(dVar);
        this.b = new ArrayList<>();
        this.e = 0.0f;
        this.f = 0.0f;
        this.a = new com.censivn.C3DEngine.b.h.b.h(com.censivn.C3DEngine.b.b.a.D, dVar.getHeight(), 50.0f * com.censivn.C3DEngine.b.b.a.c, com.censivn.C3DEngine.b.b.a.c * 20.0f, this.e, this.f);
        this.c.addChild(this.a);
        this.a.a(new com.censivn.C3DEngine.b.h.b.b() { // from class: com.tsf.shell.manager.r.b.c.e.1
            @Override // com.censivn.C3DEngine.b.h.b.b
            public int a() {
                return e.this.b.size();
            }

            @Override // com.censivn.C3DEngine.b.h.b.b
            public i a(int i, i iVar) {
                i hVar = iVar == null ? new h(e.this.e, e.this.f, com.censivn.C3DEngine.b.b.a.a(30.0f), true) : iVar;
                h hVar2 = (h) hVar;
                if (hVar2.b() != e.this.e || hVar2.c() != e.this.f) {
                    hVar2.a(e.this.e, e.this.f);
                }
                hVar2.a((com.tsf.shell.f.i.c.e) e.this.b.get(i), cVar.isAnimation());
                return hVar;
            }

            @Override // com.censivn.C3DEngine.b.h.b.b
            public void a(i iVar) {
                ((h) iVar).d();
            }
        });
        this.a.b(0.0f, com.censivn.C3DEngine.b.b.a.c * 20.0f);
        this.a.a(new f(dVar) { // from class: com.tsf.shell.manager.r.b.c.e.2
            @Override // com.tsf.shell.manager.r.b.c.f, com.censivn.C3DEngine.b.h.b.f
            public void a(i iVar, int i, MotionEvent motionEvent) {
                com.tsf.shell.f.i.c.e eVar = (com.tsf.shell.f.i.c.e) e.this.b.get(i);
                if (eVar instanceof com.tsf.shell.f.i.c.g) {
                    com.tsf.shell.f.i.c.g gVar = (com.tsf.shell.f.i.c.g) eVar;
                    if (!gVar.j()) {
                        gVar.k();
                        return;
                    } else {
                        e.this.a(eVar);
                        return;
                    }
                }
                e.this.a(eVar);
            }

            @Override // com.tsf.shell.manager.r.b.c.f
            public com.tsf.shell.f.i.c.e a(int i) {
                return (com.tsf.shell.f.i.c.e) e.this.b.get(i);
            }

            @Override // com.tsf.shell.manager.r.b.c.f
            public boolean a(com.tsf.shell.f.i.c.e eVar, float f, float f2) {
                return e.this.a(eVar, f, f2);
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
        Iterator<com.tsf.shell.f.i.c.e> it = this.b.iterator();
        while (it.hasNext()) {
            com.tsf.shell.f.i.c.g gVar = (com.tsf.shell.f.i.c.g) it.next();
            gVar.i();
            gVar.g();
        }
    }

    @Override // com.tsf.shell.manager.r.b.b.a
    public void a(float f, float f2, float f3, float f4) {
        this.e = (com.censivn.C3DEngine.b.b.a.D - (120.0f * com.censivn.C3DEngine.b.b.a.c)) / 2.0f;
        this.f = 370.0f * com.censivn.C3DEngine.b.b.a.c;
        this.a.a(this.e, this.f);
        this.a.a(f, f2, f3, f4);
    }

    public void a(com.tsf.shell.f.i.c.e eVar) {
    }

    public boolean a(com.tsf.shell.f.i.c.e eVar, float f, float f2) {
        return true;
    }

    public void g() {
        this.a.d();
    }

    public void b(com.tsf.shell.f.i.c.e eVar) {
        this.b.add(eVar);
        this.a.d();
    }

    public void a(ArrayList<com.tsf.shell.f.i.c.e> arrayList) {
        this.b.addAll(arrayList);
        this.a.d();
    }

    public void c(com.tsf.shell.f.i.c.e eVar) {
        this.b.remove(eVar);
        this.a.d();
    }
}
