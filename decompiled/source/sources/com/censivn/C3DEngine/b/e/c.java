package com.censivn.C3DEngine.b.e;

import android.view.KeyEvent;
import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.b.c.b;
import com.censivn.C3DEngine.b.c.e;
import com.censivn.C3DEngine.b.f.k;
import com.censivn.C3DEngine.b.f.m;
import com.tsf.shell.utils.x;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class c extends com.censivn.C3DEngine.b.f.j implements b.a, e.a {
    private m b;
    private k c;
    private f d;
    private com.tsf.shell.f.e.i e;
    private d f;
    private boolean h;
    private boolean g = false;
    private ArrayList<d> i = new ArrayList<>();
    private com.tsf.shell.f.e.i a = new com.tsf.shell.f.e.i();

    public c() {
        this.a.b(1);
        this.b = new m();
        this.b.d(55);
        this.b.a("");
        this.b.b(1);
        this.b.b();
        this.b.position().x = (int) (((-com.censivn.C3DEngine.b.b.a.D) / 2.0f) + (com.censivn.C3DEngine.b.b.a.a(70.0f) / 2.0f));
        this.b.position().y = (-com.censivn.C3DEngine.b.b.a.a(30.0f)) - this.b.maxY();
        this.a.addChild(this.b);
        this.c = new k((int) (com.censivn.C3DEngine.b.b.a.D - com.censivn.C3DEngine.b.b.a.a(70.0f)), (int) com.censivn.C3DEngine.b.b.a.a(7.0f), false);
        this.c.setDefaultColor(new Color4(255, 255, 255, 150));
        this.c.position().y = (this.b.position().y + this.b.minY()) - com.censivn.C3DEngine.b.b.a.a(20.0f);
        this.a.addChild(this.c);
        addChild(this.a);
        this.e = new com.tsf.shell.f.e.i();
        this.e.b(1);
        addChild(this.e);
    }

    public void a(f fVar) {
        if (this.d != null) {
            this.d.removeFromParent();
            this.d.g();
        }
        this.d = fVar;
        addChild(this.d);
    }

    private float i() {
        return this.d != null ? ((this.a.position().y + this.c.position().y) - (this.c.c() / 2.0f)) - (this.d.maxY() - this.d.minY()) : (this.a.position().y + this.c.position().y) - (this.c.c() / 2.0f);
    }

    public void a(d dVar) {
        dVar.a(this.i.size());
        this.i.add(dVar);
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
        d dVar = this.i.get(i);
        if (dVar != this.f) {
            b(dVar);
            dVar.removeFromParent();
            dVar.position().x = 0.0f;
            this.e.addChild(dVar);
            if (this.f != null) {
                dVar.a(false);
            } else {
                dVar.a(true);
            }
            this.f = dVar;
        }
    }

    public void a(int i, boolean z) {
        final d dVar = this.f;
        b(i);
        if (dVar != null) {
            com.censivn.C3DEngine.b.g.d dVar2 = new com.censivn.C3DEngine.b.g.d() { // from class: com.censivn.C3DEngine.b.e.c.1
                @Override // com.censivn.C3DEngine.b.g.d
                public void a() {
                    dVar.removeFromParent();
                }
            };
            if (z) {
                dVar2.f(-com.censivn.C3DEngine.b.b.a.D);
            } else {
                dVar2.f(com.censivn.C3DEngine.b.b.a.D);
            }
            com.censivn.C3DEngine.b.g.c.a(dVar);
            com.censivn.C3DEngine.b.g.c.a(dVar, 500, dVar2);
            if (z) {
                this.f.position().x = com.censivn.C3DEngine.b.b.a.D;
            } else {
                this.f.position().x = -com.censivn.C3DEngine.b.b.a.D;
            }
            com.censivn.C3DEngine.b.g.d dVar3 = new com.censivn.C3DEngine.b.g.d();
            dVar3.f(0.0f);
            com.censivn.C3DEngine.b.g.c.a(this.f);
            com.censivn.C3DEngine.b.g.c.a(this.f, 500, dVar3);
        }
    }

    public void c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        Iterator<d> it = this.i.iterator();
        while (it.hasNext()) {
            d next = it.next();
            next.a();
            next.removeFromParent();
        }
        c();
        this.f = null;
    }

    private void b(d dVar) {
        dVar.a(this.e.position().y - com.censivn.C3DEngine.b.b.a.C);
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
        Iterator<d> it = this.i.iterator();
        while (it.hasNext()) {
            b(it.next());
        }
    }

    public void d() {
        if (!this.g) {
            k();
            this.g = true;
            b(b());
            com.tsf.shell.manager.a.b.a(this);
            com.censivn.C3DEngine.b.c.b.a(this);
            this.h = com.tsf.shell.manager.a.e.c();
            if (!this.h) {
                com.tsf.shell.manager.a.j.a((Runnable) null, 170);
            }
            com.tsf.shell.manager.a.j.a(this);
            alpha(255.0f);
            this.c.a(0.0f);
            final int a = (int) (com.censivn.C3DEngine.b.b.a.D - com.censivn.C3DEngine.b.b.a.a(70.0f));
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.censivn.C3DEngine.b.e.c.2
                @Override // com.censivn.C3DEngine.b.g.d
                public void a(float f) {
                    c.this.c.a(a * f);
                }
            };
            com.censivn.C3DEngine.b.g.c.a(this.c);
            com.censivn.C3DEngine.b.g.c.a(this.c, 500, dVar);
            this.b.position().y = -com.censivn.C3DEngine.b.b.a.a(150.0f);
            com.censivn.C3DEngine.b.g.d dVar2 = new com.censivn.C3DEngine.b.g.d();
            dVar2.h((-com.censivn.C3DEngine.b.b.a.a(30.0f)) - this.b.maxY());
            dVar2.b(300);
            dVar2.a(com.censivn.C3DEngine.b.g.a.a);
            com.censivn.C3DEngine.b.g.c.a(this.b);
            com.censivn.C3DEngine.b.g.c.a(this.b, 500, dVar2);
            f();
        }
    }

    public void e() {
        if (this.g) {
            this.g = false;
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.censivn.C3DEngine.b.e.c.3
                @Override // com.censivn.C3DEngine.b.g.d
                public void a() {
                    c.this.g();
                    com.tsf.shell.manager.a.b.b(c.this);
                    com.censivn.C3DEngine.b.c.b.b(c.this);
                    com.tsf.shell.manager.a.j.b(c.this);
                    c.this.j();
                    c.this.b.a();
                }
            };
            dVar.a(0);
            com.censivn.C3DEngine.b.g.c.a(this);
            com.censivn.C3DEngine.b.g.c.a(this, 300, dVar);
            if (!this.h) {
                com.tsf.shell.manager.a.j.d();
            }
        }
    }

    @Override // com.censivn.C3DEngine.b.c.b.a
    public void a(int i, KeyEvent keyEvent) {
        if (i == 4) {
            e();
        }
    }

    @Override // com.censivn.C3DEngine.b.c.b.a
    public void b(int i, KeyEvent keyEvent) {
    }

    @Override // com.censivn.C3DEngine.b.c.e.a
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
