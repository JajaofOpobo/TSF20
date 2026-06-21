package com.censivn.C3DEngine.b.e;

import android.view.KeyEvent;
import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.b.g.w;
import com.tsf.shell.utils.x;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class f extends com.censivn.C3DEngine.b.f.l implements com.censivn.C3DEngine.b.c.d, com.censivn.C3DEngine.b.c.k {
    private com.censivn.C3DEngine.b.f.o b;
    private com.censivn.C3DEngine.b.f.m c;
    private i d;
    private com.tsf.shell.e.e.k e;
    private g f;
    private boolean h;
    private boolean g = false;
    private ArrayList i = new ArrayList();
    private com.tsf.shell.e.e.k a = new com.tsf.shell.e.e.k();

    public f() {
        this.a.b(1);
        this.b = new com.censivn.C3DEngine.b.f.o();
        this.b.d(55);
        this.b.a("");
        this.b.b(1);
        this.b.b();
        this.b.position().x = (int) (((-com.censivn.C3DEngine.b.b.a.D) / 2.0f) + (com.censivn.C3DEngine.b.b.a.a(70.0f) / 2.0f));
        this.b.position().y = (-com.censivn.C3DEngine.b.b.a.a(30.0f)) - this.b.maxY();
        this.a.addChild(this.b);
        this.c = new com.censivn.C3DEngine.b.f.m((int) (com.censivn.C3DEngine.b.b.a.D - com.censivn.C3DEngine.b.b.a.a(70.0f)), (int) com.censivn.C3DEngine.b.b.a.a(7.0f), false);
        this.c.setDefaultColor(new Color4(255, 255, 255, 150));
        this.c.position().y = (this.b.position().y + this.b.minY()) - com.censivn.C3DEngine.b.b.a.a(20.0f);
        this.a.addChild(this.c);
        addChild(this.a);
        this.e = new com.tsf.shell.e.e.k();
        this.e.b(1);
        addChild(this.e);
    }

    public void a(i iVar) {
        if (this.d != null) {
            this.d.removeFromParent();
            this.d.g();
        }
        this.d = iVar;
        addChild(this.d);
    }

    private float i() {
        return this.d != null ? ((this.a.position().y + this.c.position().y) - (this.c.c() / 2.0f)) - (this.d.maxY() - this.d.minY()) : (this.a.position().y + this.c.position().y) - (this.c.c() / 2.0f);
    }

    public void a(g gVar) {
        gVar.a(this.i.size());
        this.i.add(gVar);
    }

    public void a(String str) {
        this.b.a(str);
    }

    public void a(int i) {
        this.b.a(x.c(i));
    }

    public boolean a() {
        return this.g;
    }

    public int b() {
        return 0;
    }

    public void b(int i) {
        g gVar = (g) this.i.get(i);
        if (gVar != this.f) {
            b(gVar);
            gVar.removeFromParent();
            gVar.position().x = 0.0f;
            this.e.addChild(gVar);
            if (this.f != null) {
                gVar.a(false);
            } else {
                gVar.a(true);
            }
            this.f = gVar;
        }
    }

    public void a(int i, boolean z) {
        final g gVar = this.f;
        b(i);
        if (gVar != null) {
            com.censivn.C3DEngine.b.g.x xVar = new com.censivn.C3DEngine.b.g.x() { // from class: com.censivn.C3DEngine.b.e.f.1
                @Override // com.censivn.C3DEngine.b.g.x
                public void a() {
                    gVar.removeFromParent();
                }
            };
            if (z) {
                xVar.f(-com.censivn.C3DEngine.b.b.a.D);
            } else {
                xVar.f(com.censivn.C3DEngine.b.b.a.D);
            }
            w.a(gVar);
            w.a(gVar, 500, xVar);
            if (z) {
                this.f.position().x = com.censivn.C3DEngine.b.b.a.D;
            } else {
                this.f.position().x = -com.censivn.C3DEngine.b.b.a.D;
            }
            com.censivn.C3DEngine.b.g.x xVar2 = new com.censivn.C3DEngine.b.g.x();
            xVar2.f(0.0f);
            w.a(this.f);
            w.a(this.f, 500, xVar2);
        }
    }

    public void c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            g gVar = (g) it.next();
            gVar.a();
            gVar.removeFromParent();
        }
        c();
        this.f = null;
    }

    private void b(g gVar) {
        gVar.a(this.e.position().y - com.censivn.C3DEngine.b.b.a.C);
    }

    private void k() {
        h();
        this.b.position().x = (int) (((-com.censivn.C3DEngine.b.b.a.D) / 2.0f) + (com.censivn.C3DEngine.b.b.a.a(70.0f) / 2.0f));
        this.c.a((int) (com.censivn.C3DEngine.b.b.a.D - com.censivn.C3DEngine.b.b.a.a(70.0f)));
        this.a.position().y = com.censivn.C3DEngine.b.b.a.B;
        this.a.a(com.censivn.C3DEngine.b.b.a.D, -(this.c.position().y - (this.c.c() / 2.0f)));
        if (this.d != null) {
            this.d.position().y = (this.a.position().y + this.c.position().y) - (this.c.c() / 2.0f);
            this.d.a((int) (com.censivn.C3DEngine.b.b.a.D - com.censivn.C3DEngine.b.b.a.a(70.0f)), 0);
        }
        this.e.position().y = i();
        this.e.a(com.censivn.C3DEngine.b.b.a.D, com.censivn.C3DEngine.b.b.a.E);
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            b((g) it.next());
        }
    }

    public void d() {
        if (!this.g) {
            k();
            this.g = true;
            b(b());
            com.tsf.shell.manager.a.b.a(this);
            com.censivn.C3DEngine.b.c.c.a(this);
            this.h = com.tsf.shell.manager.a.e.c();
            if (!this.h) {
                com.tsf.shell.manager.a.j.a((Runnable) null, 170);
            }
            com.tsf.shell.manager.a.j.a(this);
            alpha(255.0f);
            this.c.a(0.0f);
            final int a = (int) (com.censivn.C3DEngine.b.b.a.D - com.censivn.C3DEngine.b.b.a.a(70.0f));
            com.censivn.C3DEngine.b.g.x xVar = new com.censivn.C3DEngine.b.g.x() { // from class: com.censivn.C3DEngine.b.e.f.2
                @Override // com.censivn.C3DEngine.b.g.x
                public void a(float f) {
                    f.this.c.a(a * f);
                }
            };
            w.a(this.c);
            w.a(this.c, 500, xVar);
            this.b.position().y = -com.censivn.C3DEngine.b.b.a.a(150.0f);
            com.censivn.C3DEngine.b.g.x xVar2 = new com.censivn.C3DEngine.b.g.x();
            xVar2.h((-com.censivn.C3DEngine.b.b.a.a(30.0f)) - this.b.maxY());
            xVar2.b(300);
            xVar2.a(com.censivn.C3DEngine.b.g.a.a);
            w.a(this.b);
            w.a(this.b, 500, xVar2);
            f();
        }
    }

    public void e() {
        if (this.g) {
            this.g = false;
            com.censivn.C3DEngine.b.g.x xVar = new com.censivn.C3DEngine.b.g.x() { // from class: com.censivn.C3DEngine.b.e.f.3
                @Override // com.censivn.C3DEngine.b.g.x
                public void a() {
                    f.this.g();
                    com.tsf.shell.manager.a.b.b(f.this);
                    com.censivn.C3DEngine.b.c.c.b(f.this);
                    com.tsf.shell.manager.a.j.b(f.this);
                    f.this.j();
                    f.this.b.a();
                }
            };
            xVar.a(0);
            w.a(this);
            w.a(this, 300, xVar);
            if (!this.h) {
                com.tsf.shell.manager.a.j.d();
            }
        }
    }

    @Override // com.censivn.C3DEngine.b.c.d
    public void a(int i, KeyEvent keyEvent) {
        if (i == 4) {
            e();
        }
    }

    @Override // com.censivn.C3DEngine.b.c.d
    public void b(int i, KeyEvent keyEvent) {
    }

    @Override // com.censivn.C3DEngine.b.c.k
    public void a(int i, int i2, int i3, int i4) {
        k();
    }

    public void f() {
    }

    public void g() {
    }

    public void h() {
    }
}
