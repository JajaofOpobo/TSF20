package com.tsf.shell.e.f;

import com.censivn.C3DEngine.api.element.Number3d;
import com.tsf.shell.Home;
import java.util.Iterator;

/* loaded from: classes.dex */
public class o extends g {
    private com.censivn.C3DEngine.b.h.b.c l;

    public o() {
        this.b = new com.tsf.shell.d.e(com.censivn.C3DEngine.a.d(), this.a);
    }

    @Override // com.tsf.shell.e.f.g
    public void O() {
        Iterator it = this.c.children().iterator();
        while (it.hasNext()) {
            com.censivn.C3DEngine.b.f.j jVar = (com.censivn.C3DEngine.b.f.j) it.next();
            if (jVar instanceof com.tsf.shell.e.i.c) {
                ((com.tsf.shell.e.i.c) jVar).ae();
            }
        }
        super.O();
    }

    public void a() {
        com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.e.f.o.1
            @Override // java.lang.Runnable
            public void run() {
                Home.b().l().addView(o.this.b);
            }
        });
    }

    public void aj() {
        com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.e.f.o.2
            @Override // java.lang.Runnable
            public void run() {
                Home.b().l().removeView(o.this.b);
            }
        });
    }

    @Override // com.tsf.shell.e.f.g
    public void ab() {
        if (!ad() && X()) {
            super.ab();
            m().g();
            Iterator it = this.c.children().iterator();
            while (it.hasNext()) {
                com.censivn.C3DEngine.b.f.j jVar = (com.censivn.C3DEngine.b.f.j) it.next();
                if (jVar instanceof com.tsf.shell.e.i.c) {
                    ((com.tsf.shell.e.i.c) jVar).o_();
                }
            }
        }
    }

    @Override // com.tsf.shell.e.f.g
    public void ac() {
        if (ad() && Y()) {
            super.ac();
            Iterator it = this.c.children().iterator();
            while (it.hasNext()) {
                com.censivn.C3DEngine.b.f.j jVar = (com.censivn.C3DEngine.b.f.j) it.next();
                if (jVar instanceof com.tsf.shell.e.i.c) {
                    ((com.tsf.shell.e.i.c) jVar).j();
                }
            }
        }
    }

    public void a(com.censivn.C3DEngine.b.h.b.d dVar) {
        this.l = new com.censivn.C3DEngine.b.h.b.c(this, false, dVar);
        int i = ((int) ((com.censivn.C3DEngine.b.b.a.D > com.censivn.C3DEngine.b.b.a.E ? com.censivn.C3DEngine.b.b.a.E : com.censivn.C3DEngine.b.b.a.D) * 0.9d)) / 2;
        this.l.a(i, i);
        this.l.scale().setAll(0.5f, 0.5f, 1.0f);
        this.l.alpha(0.0f);
        com.censivn.C3DEngine.b.g.x xVar = new com.censivn.C3DEngine.b.g.x();
        xVar.l(1.0f);
        xVar.m(1.0f);
        xVar.a(255);
        com.censivn.C3DEngine.b.g.w.a(this.l);
        com.censivn.C3DEngine.b.g.w.a(this.l, 386, xVar);
    }

    public void a(com.censivn.C3DEngine.b.f.j jVar, com.tsf.shell.e.i.b.e.i iVar) {
        com.tsf.shell.e.i.b.e.i ba = iVar.ba();
        ba.removeFromParent();
        ba.position().setAllFrom(this.l.globalToLocal(jVar.localToGlobal(new Number3d())));
        ba.position().z = 0.0f;
        this.l.a(ba);
    }
}
