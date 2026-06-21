package com.tsf.shell.e.i.b.d;

import com.censivn.C3DEngine.b.g.w;
import com.censivn.C3DEngine.b.g.x;

/* loaded from: classes.dex */
public class e {
    private x a;
    private x b;
    private x c;
    private x d;
    private x e;
    private x f;
    private x g;
    private x h;
    private b i;

    public e(b bVar) {
        this.i = bVar;
        c();
    }

    public void a() {
        c();
    }

    private void c() {
        k kVar = b.l;
        this.a = new x();
        this.a.l(1.2f);
        this.a.m(1.2f);
        this.a.f(kVar.c().folder.backPlaneX + ((kVar.c().folder.frontPlaneX - kVar.c().folder.backPlaneX) * 1.2f));
        this.a.h(kVar.c().folder.backPlaneY + ((kVar.c().folder.frontPlaneY - kVar.c().folder.backPlaneY) * 1.2f));
        this.b = new x();
        this.b.l(1.2f);
        this.b.m(1.2f);
        this.b.f(kVar.c().folder.backPlaneX);
        this.b.h(kVar.c().folder.backPlaneY);
        this.c = new x();
        this.c.l(1.2f);
        this.c.m(1.2f);
        this.c.f(kVar.c().folder.backPlaneX + ((kVar.c().folder.textPlaneX - kVar.c().folder.backPlaneX) * 1.2f));
        this.c.h(kVar.c().folder.backPlaneY + ((kVar.c().folder.textPlaneY - kVar.c().folder.backPlaneY) * 1.2f));
        if (kVar.c().folder.sizePlaneEnable) {
            this.d = new x();
            this.d.l(1.2f);
            this.d.m(1.2f);
            this.d.f(kVar.c().folder.backPlaneX + ((kVar.c().folder.sizePlaneX - kVar.c().folder.backPlaneX) * 1.2f));
            this.d.h((1.2f * (kVar.c().folder.sizePlaneY - kVar.c().folder.backPlaneY)) + kVar.c().folder.backPlaneY);
        }
        this.e = new x();
        this.e.l(1.0f);
        this.e.m(1.0f);
        this.e.f(kVar.c().folder.frontPlaneX);
        this.e.h(kVar.c().folder.frontPlaneY);
        this.f = new x();
        this.f.l(1.0f);
        this.f.m(1.0f);
        this.f.f(kVar.c().folder.backPlaneX);
        this.f.h(kVar.c().folder.backPlaneY);
        this.g = new x() { // from class: com.tsf.shell.e.i.b.d.e.1
            @Override // com.censivn.C3DEngine.b.g.x
            public void a() {
                e.this.i.ba();
                if (e.this.i.x) {
                    b.m.e(e.this.i);
                }
            }
        };
        this.g.l(1.0f);
        this.g.m(1.0f);
        this.g.f(kVar.c().folder.textPlaneX);
        this.g.h(kVar.c().folder.textPlaneY);
        if (kVar.c().folder.sizePlaneEnable) {
            this.h = new x();
            this.h.l(1.0f);
            this.h.m(1.0f);
            this.h.f(kVar.c().folder.sizePlaneX);
            this.h.h(kVar.c().folder.sizePlaneY);
        }
    }

    public void a(float f) {
        k kVar = b.l;
        if (kVar.c().folder.frontPlaneEnable) {
            this.i.q.scale().setAll(f, f, 1.0f);
            this.i.q.position().x = kVar.c().folder.backPlaneX;
            this.i.q.position().y = kVar.c().folder.backPlaneY;
        }
        if (kVar.c().folder.backPlaneEnable) {
            this.i.p.scale().setAll(f, f, 1.0f);
            this.i.p.position().x = kVar.c().folder.backPlaneX;
            this.i.p.position().y = kVar.c().folder.backPlaneY;
        }
        this.i.r.scale().setAll(f, f, 1.0f);
        this.i.r.position().x = kVar.c().folder.backPlaneX;
        this.i.r.position().y = kVar.c().folder.backPlaneY;
        if (kVar.c().folder.sizePlaneEnable) {
            this.i.s.scale().setAll(f, f, 1.0f);
            this.i.s.position().x = kVar.c().folder.backPlaneX;
            this.i.s.position().y = kVar.c().folder.backPlaneY;
        }
    }

    public void b() {
        k kVar = b.l;
        x xVar = new x();
        if (this.i.q != null) {
            w.a(this.i.q);
            xVar.l(0.0f);
            xVar.m(0.0f);
            xVar.f(kVar.c().folder.backPlaneX);
            xVar.h(kVar.c().folder.backPlaneY);
            w.a(this.i.q, 300, xVar);
        }
        if (this.i.p != null) {
            x xVar2 = new x();
            w.a(this.i.p);
            xVar2.l(0.0f);
            xVar2.m(0.0f);
            xVar2.f(kVar.c().folder.backPlaneX);
            xVar2.h(kVar.c().folder.backPlaneY);
            w.a(this.i.p, 300, xVar2);
        }
        x xVar3 = new x() { // from class: com.tsf.shell.e.i.b.d.e.2
            @Override // com.censivn.C3DEngine.b.g.x
            public void a() {
                e.this.i.ba();
            }
        };
        w.a(this.i.r);
        xVar3.l(0.0f);
        xVar3.m(0.0f);
        xVar3.f(kVar.c().folder.backPlaneX);
        xVar3.h(kVar.c().folder.backPlaneY);
        w.a(this.i.r, 300, xVar3);
        if (this.i.s != null) {
            x xVar4 = new x();
            w.a(this.i.s);
            xVar4.l(0.0f);
            xVar4.m(0.0f);
            xVar4.f(kVar.c().folder.backPlaneX);
            xVar4.h(kVar.c().folder.backPlaneY);
            w.a(this.i.s, 300, xVar4);
        }
    }

    public void a(com.censivn.C3DEngine.b.f.j jVar) {
        com.tsf.shell.utils.w.a(3);
        x xVar = new x();
        xVar.l(0.8f);
        xVar.m(0.8f);
        w.a(jVar);
        w.a(jVar, 250, xVar);
        this.i.aZ();
        b.m.d(this.i);
        w.a(this.i.q);
        w.a(this.i.q, 300, this.a);
        w.a(this.i.p);
        w.a(this.i.p, 300, this.b);
        w.a(this.i.r);
        w.a(this.i.r, 300, this.c);
        if (this.i.s != null) {
            w.a(this.i.s);
            w.a(this.i.s, 300, this.d);
        }
    }

    public void b(com.censivn.C3DEngine.b.f.j jVar) {
        if (jVar != null) {
            x xVar = new x();
            xVar.l(1.0f);
            xVar.m(1.0f);
            w.a(jVar);
            w.a(jVar, 250, xVar);
        }
        w.a(this.i.q);
        w.a(this.i.q, 300, this.e);
        w.a(this.i.p);
        w.a(this.i.p, 300, this.f);
        w.a(this.i.r);
        w.a(this.i.r, 300, this.g);
        if (this.i.s != null) {
            w.a(this.i.s);
            w.a(this.i.s, 300, this.h);
        }
    }
}
