package com.tsf.shell.f.i.b.d;

import com.tsf.shell.utils.w;
/* loaded from: classes.dex */
public class e {
    private com.censivn.C3DEngine.b.g.d a;
    private com.censivn.C3DEngine.b.g.d b;
    private com.censivn.C3DEngine.b.g.d c;
    private com.censivn.C3DEngine.b.g.d d;
    private com.censivn.C3DEngine.b.g.d e;
    private com.censivn.C3DEngine.b.g.d f;
    private com.censivn.C3DEngine.b.g.d g;
    private com.censivn.C3DEngine.b.g.d h;
    private b i;

    public e(b bVar) {
        this.i = bVar;
        c();
    }

    public void a() {
        c();
    }

    private void c() {
        j jVar = b.l;
        this.a = new com.censivn.C3DEngine.b.g.d();
        this.a.l(1.2f);
        this.a.m(1.2f);
        this.a.f(jVar.c().folder.backPlaneX + ((jVar.c().folder.frontPlaneX - jVar.c().folder.backPlaneX) * 1.2f));
        this.a.h(jVar.c().folder.backPlaneY + ((jVar.c().folder.frontPlaneY - jVar.c().folder.backPlaneY) * 1.2f));
        this.b = new com.censivn.C3DEngine.b.g.d();
        this.b.l(1.2f);
        this.b.m(1.2f);
        this.b.f(jVar.c().folder.backPlaneX);
        this.b.h(jVar.c().folder.backPlaneY);
        this.c = new com.censivn.C3DEngine.b.g.d();
        this.c.l(1.2f);
        this.c.m(1.2f);
        this.c.f(jVar.c().folder.backPlaneX + ((jVar.c().folder.textPlaneX - jVar.c().folder.backPlaneX) * 1.2f));
        this.c.h(jVar.c().folder.backPlaneY + ((jVar.c().folder.textPlaneY - jVar.c().folder.backPlaneY) * 1.2f));
        if (jVar.c().folder.sizePlaneEnable) {
            this.d = new com.censivn.C3DEngine.b.g.d();
            this.d.l(1.2f);
            this.d.m(1.2f);
            this.d.f(jVar.c().folder.backPlaneX + ((jVar.c().folder.sizePlaneX - jVar.c().folder.backPlaneX) * 1.2f));
            this.d.h((1.2f * (jVar.c().folder.sizePlaneY - jVar.c().folder.backPlaneY)) + jVar.c().folder.backPlaneY);
        }
        this.e = new com.censivn.C3DEngine.b.g.d();
        this.e.l(1.0f);
        this.e.m(1.0f);
        this.e.f(jVar.c().folder.frontPlaneX);
        this.e.h(jVar.c().folder.frontPlaneY);
        this.f = new com.censivn.C3DEngine.b.g.d();
        this.f.l(1.0f);
        this.f.m(1.0f);
        this.f.f(jVar.c().folder.backPlaneX);
        this.f.h(jVar.c().folder.backPlaneY);
        this.g = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.i.b.d.e.1
            @Override // com.censivn.C3DEngine.b.g.d
            public void a() {
                e.this.i.ba();
                if (e.this.i.x) {
                    b.m.e(e.this.i);
                }
            }
        };
        this.g.l(1.0f);
        this.g.m(1.0f);
        this.g.f(jVar.c().folder.textPlaneX);
        this.g.h(jVar.c().folder.textPlaneY);
        if (jVar.c().folder.sizePlaneEnable) {
            this.h = new com.censivn.C3DEngine.b.g.d();
            this.h.l(1.0f);
            this.h.m(1.0f);
            this.h.f(jVar.c().folder.sizePlaneX);
            this.h.h(jVar.c().folder.sizePlaneY);
        }
    }

    public void a(float f) {
        j jVar = b.l;
        if (jVar.c().folder.frontPlaneEnable) {
            this.i.q.scale().setAll(f, f, 1.0f);
            this.i.q.position().x = jVar.c().folder.backPlaneX;
            this.i.q.position().y = jVar.c().folder.backPlaneY;
        }
        if (jVar.c().folder.backPlaneEnable) {
            this.i.p.scale().setAll(f, f, 1.0f);
            this.i.p.position().x = jVar.c().folder.backPlaneX;
            this.i.p.position().y = jVar.c().folder.backPlaneY;
        }
        this.i.r.scale().setAll(f, f, 1.0f);
        this.i.r.position().x = jVar.c().folder.backPlaneX;
        this.i.r.position().y = jVar.c().folder.backPlaneY;
        if (jVar.c().folder.sizePlaneEnable) {
            this.i.s.scale().setAll(f, f, 1.0f);
            this.i.s.position().x = jVar.c().folder.backPlaneX;
            this.i.s.position().y = jVar.c().folder.backPlaneY;
        }
    }

    public void b() {
        j jVar = b.l;
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
        if (this.i.q != null) {
            com.censivn.C3DEngine.b.g.c.a(this.i.q);
            dVar.l(0.0f);
            dVar.m(0.0f);
            dVar.f(jVar.c().folder.backPlaneX);
            dVar.h(jVar.c().folder.backPlaneY);
            com.censivn.C3DEngine.b.g.c.a(this.i.q, 300, dVar);
        }
        if (this.i.p != null) {
            com.censivn.C3DEngine.b.g.d dVar2 = new com.censivn.C3DEngine.b.g.d();
            com.censivn.C3DEngine.b.g.c.a(this.i.p);
            dVar2.l(0.0f);
            dVar2.m(0.0f);
            dVar2.f(jVar.c().folder.backPlaneX);
            dVar2.h(jVar.c().folder.backPlaneY);
            com.censivn.C3DEngine.b.g.c.a(this.i.p, 300, dVar2);
        }
        com.censivn.C3DEngine.b.g.d dVar3 = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.i.b.d.e.2
            @Override // com.censivn.C3DEngine.b.g.d
            public void a() {
                e.this.i.ba();
            }
        };
        com.censivn.C3DEngine.b.g.c.a(this.i.r);
        dVar3.l(0.0f);
        dVar3.m(0.0f);
        dVar3.f(jVar.c().folder.backPlaneX);
        dVar3.h(jVar.c().folder.backPlaneY);
        com.censivn.C3DEngine.b.g.c.a(this.i.r, 300, dVar3);
        if (this.i.s != null) {
            com.censivn.C3DEngine.b.g.d dVar4 = new com.censivn.C3DEngine.b.g.d();
            com.censivn.C3DEngine.b.g.c.a(this.i.s);
            dVar4.l(0.0f);
            dVar4.m(0.0f);
            dVar4.f(jVar.c().folder.backPlaneX);
            dVar4.h(jVar.c().folder.backPlaneY);
            com.censivn.C3DEngine.b.g.c.a(this.i.s, 300, dVar4);
        }
    }

    public void a(com.censivn.C3DEngine.b.f.i iVar) {
        w.a(3);
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
        dVar.l(0.8f);
        dVar.m(0.8f);
        com.censivn.C3DEngine.b.g.c.a(iVar);
        com.censivn.C3DEngine.b.g.c.a(iVar, 250, dVar);
        this.i.aZ();
        b.m.d(this.i);
        com.censivn.C3DEngine.b.g.c.a(this.i.q);
        com.censivn.C3DEngine.b.g.c.a(this.i.q, 300, this.a);
        com.censivn.C3DEngine.b.g.c.a(this.i.p);
        com.censivn.C3DEngine.b.g.c.a(this.i.p, 300, this.b);
        com.censivn.C3DEngine.b.g.c.a(this.i.r);
        com.censivn.C3DEngine.b.g.c.a(this.i.r, 300, this.c);
        if (this.i.s != null) {
            com.censivn.C3DEngine.b.g.c.a(this.i.s);
            com.censivn.C3DEngine.b.g.c.a(this.i.s, 300, this.d);
        }
    }

    public void b(com.censivn.C3DEngine.b.f.i iVar) {
        if (iVar != null) {
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
            dVar.l(1.0f);
            dVar.m(1.0f);
            com.censivn.C3DEngine.b.g.c.a(iVar);
            com.censivn.C3DEngine.b.g.c.a(iVar, 250, dVar);
        }
        com.censivn.C3DEngine.b.g.c.a(this.i.q);
        com.censivn.C3DEngine.b.g.c.a(this.i.q, 300, this.e);
        com.censivn.C3DEngine.b.g.c.a(this.i.p);
        com.censivn.C3DEngine.b.g.c.a(this.i.p, 300, this.f);
        com.censivn.C3DEngine.b.g.c.a(this.i.r);
        com.censivn.C3DEngine.b.g.c.a(this.i.r, 300, this.g);
        if (this.i.s != null) {
            com.censivn.C3DEngine.b.g.c.a(this.i.s);
            com.censivn.C3DEngine.b.g.c.a(this.i.s, 300, this.h);
        }
    }
}
