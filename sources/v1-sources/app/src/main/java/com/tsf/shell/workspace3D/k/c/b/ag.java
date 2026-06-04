package com.tsf.shell.workspace3D.k.c.b;

/* loaded from: classes.dex */
public final class ag {
    private com.censivn.C3DEngine.g.u a;
    private com.censivn.C3DEngine.g.u b;
    private com.censivn.C3DEngine.g.u c;
    private com.censivn.C3DEngine.g.u d;
    private com.censivn.C3DEngine.g.u e;
    private com.censivn.C3DEngine.g.u f;
    private com.censivn.C3DEngine.g.u g;
    private com.censivn.C3DEngine.g.u h;
    private c i;

    public ag(c cVar) {
        this.i = cVar;
        b();
    }

    public final void a() {
        b();
    }

    private void b() {
        ao aoVar = c.d;
        this.a = new com.censivn.C3DEngine.g.u();
        this.a.j(1.2f);
        this.a.k(1.2f);
        this.a.f(aoVar.D.backPlaneX + ((aoVar.D.frontPlaneX - aoVar.D.backPlaneX) * 1.2f));
        this.a.h(aoVar.D.backPlaneY + ((aoVar.D.frontPlaneY - aoVar.D.backPlaneY) * 1.2f));
        this.b = new com.censivn.C3DEngine.g.u();
        this.b.j(1.2f);
        this.b.k(1.2f);
        this.b.f(aoVar.D.backPlaneX);
        this.b.h(aoVar.D.backPlaneY);
        this.c = new com.censivn.C3DEngine.g.u();
        this.c.j(1.2f);
        this.c.k(1.2f);
        this.c.f(aoVar.D.backPlaneX + ((aoVar.D.textPlaneX - aoVar.D.backPlaneX) * 1.2f));
        this.c.h(aoVar.D.backPlaneY + ((aoVar.D.textPlaneY - aoVar.D.backPlaneY) * 1.2f));
        if (aoVar.D.sizePlaneEnable) {
            this.d = new com.censivn.C3DEngine.g.u();
            this.d.j(1.2f);
            this.d.k(1.2f);
            this.d.f(aoVar.D.backPlaneX + ((aoVar.D.sizePlaneX - aoVar.D.backPlaneX) * 1.2f));
            this.d.h(aoVar.D.backPlaneY + ((aoVar.D.sizePlaneY - aoVar.D.backPlaneY) * 1.2f));
        }
        this.e = new com.censivn.C3DEngine.g.u();
        this.e.j(1.0f);
        this.e.k(1.0f);
        this.e.f(aoVar.D.frontPlaneX);
        this.e.h(aoVar.D.frontPlaneY);
        this.f = new com.censivn.C3DEngine.g.u();
        this.f.j(1.0f);
        this.f.k(1.0f);
        this.f.f(aoVar.D.backPlaneX);
        this.f.h(aoVar.D.backPlaneY);
        this.g = new ah(this);
        this.g.j(1.0f);
        this.g.k(1.0f);
        this.g.f(aoVar.D.textPlaneX);
        this.g.h(aoVar.D.textPlaneY);
        if (aoVar.D.sizePlaneEnable) {
            this.h = new com.censivn.C3DEngine.g.u();
            this.h.j(1.0f);
            this.h.k(1.0f);
            this.h.f(aoVar.D.sizePlaneX);
            this.h.h(aoVar.D.sizePlaneY);
        }
    }

    public final void a(com.censivn.C3DEngine.b.r rVar) {
        com.tsf.shell.g.h.b();
        com.censivn.C3DEngine.g.u uVar = new com.censivn.C3DEngine.g.u();
        uVar.j(0.8f);
        uVar.k(0.8f);
        com.censivn.C3DEngine.g.s.a(rVar);
        com.censivn.C3DEngine.g.s.a(rVar, 250, uVar);
        af afVar = c.e;
        af.d(this.i);
        com.censivn.C3DEngine.g.s.a(this.i.j);
        com.censivn.C3DEngine.g.s.a(this.i.j, 300, this.a);
        com.censivn.C3DEngine.g.s.a(this.i.i);
        com.censivn.C3DEngine.g.s.a(this.i.i, 300, this.b);
        com.censivn.C3DEngine.g.s.a(this.i.k);
        com.censivn.C3DEngine.g.s.a(this.i.k, 300, this.c);
        if (this.i.l != null) {
            com.censivn.C3DEngine.g.s.a(this.i.l);
            com.censivn.C3DEngine.g.s.a(this.i.l, 300, this.d);
        }
    }

    public final void b(com.censivn.C3DEngine.b.r rVar) {
        if (rVar != null) {
            com.censivn.C3DEngine.g.u uVar = new com.censivn.C3DEngine.g.u();
            uVar.j(1.0f);
            uVar.k(1.0f);
            com.censivn.C3DEngine.g.s.a(rVar);
            com.censivn.C3DEngine.g.s.a(rVar, 250, uVar);
        }
        com.censivn.C3DEngine.g.s.a(this.i.j);
        com.censivn.C3DEngine.g.s.a(this.i.j, 300, this.e);
        com.censivn.C3DEngine.g.s.a(this.i.i);
        com.censivn.C3DEngine.g.s.a(this.i.i, 300, this.f);
        com.censivn.C3DEngine.g.s.a(this.i.k);
        com.censivn.C3DEngine.g.s.a(this.i.k, 300, this.g);
        if (this.i.l != null) {
            com.censivn.C3DEngine.g.s.a(this.i.l);
            com.censivn.C3DEngine.g.s.a(this.i.l, 300, this.h);
        }
    }
}
