package com.tsf.shell.f.f;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.b.h.b.c;
import com.tsf.shell.Home;
import java.util.Iterator;
/* loaded from: classes.dex */
public class k extends g {
    private com.censivn.C3DEngine.b.h.b.c l;

    public k() {
        this.b = new com.tsf.shell.e.d(com.censivn.C3DEngine.a.d(), this.a);
    }

    @Override // com.tsf.shell.f.f.g
    public void O() {
        Iterator<com.censivn.C3DEngine.b.f.i> it = this.c.children().iterator();
        while (it.hasNext()) {
            com.censivn.C3DEngine.b.f.i next = it.next();
            if (next instanceof com.tsf.shell.f.i.b) {
                ((com.tsf.shell.f.i.b) next).ae();
            }
        }
        super.O();
    }

    public void a() {
        com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.f.f.k.1
            @Override // java.lang.Runnable
            public void run() {
                Home.b().l().addView(k.this.b);
            }
        });
    }

    public void aj() {
        com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.f.f.k.2
            @Override // java.lang.Runnable
            public void run() {
                Home.b().l().removeView(k.this.b);
            }
        });
    }

    @Override // com.tsf.shell.f.f.g
    public void ab() {
        if (!ad() && X()) {
            super.ab();
            m().g();
            Iterator<com.censivn.C3DEngine.b.f.i> it = this.c.children().iterator();
            while (it.hasNext()) {
                com.censivn.C3DEngine.b.f.i next = it.next();
                if (next instanceof com.tsf.shell.f.i.b) {
                    ((com.tsf.shell.f.i.b) next).q_();
                }
            }
        }
    }

    @Override // com.tsf.shell.f.f.g
    public void ac() {
        if (ad() && Y()) {
            super.ac();
            Iterator<com.censivn.C3DEngine.b.f.i> it = this.c.children().iterator();
            while (it.hasNext()) {
                com.censivn.C3DEngine.b.f.i next = it.next();
                if (next instanceof com.tsf.shell.f.i.b) {
                    ((com.tsf.shell.f.i.b) next).j();
                }
            }
        }
    }

    public void a(c.a aVar) {
        this.l = new com.censivn.C3DEngine.b.h.b.c(this, false, aVar);
        int i = ((int) ((com.censivn.C3DEngine.b.b.a.D > com.censivn.C3DEngine.b.b.a.E ? com.censivn.C3DEngine.b.b.a.E : com.censivn.C3DEngine.b.b.a.D) * 0.9d)) / 2;
        this.l.a(i, i);
        this.l.scale().setAll(0.5f, 0.5f, 1.0f);
        this.l.alpha(0.0f);
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
        dVar.l(1.0f);
        dVar.m(1.0f);
        dVar.a(255);
        com.censivn.C3DEngine.b.g.c.a(this.l);
        com.censivn.C3DEngine.b.g.c.a(this.l, 386, dVar);
    }

    public void a(com.censivn.C3DEngine.b.f.i iVar, com.tsf.shell.f.i.b.e.g gVar) {
        com.tsf.shell.f.i.b.e.g ba = gVar.ba();
        ba.removeFromParent();
        ba.position().setAllFrom(this.l.globalToLocal(iVar.localToGlobal(new Number3d())));
        ba.position().z = 0.0f;
        this.l.a(ba);
    }
}
