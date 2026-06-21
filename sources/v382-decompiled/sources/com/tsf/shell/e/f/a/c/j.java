package com.tsf.shell.e.f.a.c;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.b.g.w;
import com.censivn.C3DEngine.b.g.x;

/* loaded from: classes.dex */
public class j extends com.censivn.C3DEngine.b.f.l {
    protected com.tsf.shell.e.f.a.m a;
    protected com.tsf.shell.e.f.a.j b;
    protected int c;
    protected String d;
    protected com.censivn.C3DEngine.b.f.a.a e;
    protected com.tsf.shell.manager.n.b f;
    private TextureElement g = new TextureElement(0, false);
    private boolean h = false;
    private boolean i = false;
    private Runnable j;

    public j(com.tsf.shell.e.f.a.m mVar, com.tsf.shell.e.f.a.j jVar, int i, String str) {
        this.c = 0;
        this.b = jVar;
        this.a = mVar;
        this.c = i;
        this.d = str;
        position().y = (-com.tsf.shell.e.f.a.j.a) / 2.0f;
        alpha(0.0f);
        e();
    }

    public com.censivn.C3DEngine.b.f.a.a e() {
        if (this.e == null) {
            this.e = k.a();
            this.e.textures().addElement(this.g);
            com.censivn.C3DEngine.b.d.a aVar = new com.censivn.C3DEngine.b.d.a(this.e) { // from class: com.tsf.shell.e.f.a.c.j.1
                @Override // com.censivn.C3DEngine.b.d.a
                public void a(MotionEvent motionEvent) {
                    if (j.this.h) {
                        if (j.this.j != null) {
                            j.this.j.run();
                        }
                    } else if (!j.this.b.a(j.this)) {
                        j.this.b.m();
                    }
                }
            };
            this.e.calAABB();
            this.e.a(true);
            this.e.setMouseEventListener(aVar);
        }
        return this.e;
    }

    public void f() {
        this.e.a(1).a((Boolean) true);
        x xVar = new x() { // from class: com.tsf.shell.e.f.a.c.j.2
            @Override // com.censivn.C3DEngine.b.g.x
            public void a() {
            }
        };
        xVar.l(1.0f);
        xVar.m(1.0f);
        w.a(this.e.a(1));
        w.a(this.e.a(1), 500, xVar);
    }

    public void g() {
        x xVar = new x() { // from class: com.tsf.shell.e.f.a.c.j.3
            @Override // com.censivn.C3DEngine.b.g.x
            public void a() {
                j.this.e.a(1).a((Boolean) false);
            }
        };
        xVar.l(0.0f);
        xVar.m(0.0f);
        w.a(this.e.a(1));
        w.a(this.e.a(1), 500, xVar);
    }

    public void c(boolean z) {
        this.i = false;
        if (a(z)) {
            this.f = com.tsf.shell.manager.a.q.a(this.f, this.d);
        }
        b(z);
        x xVar = new x() { // from class: com.tsf.shell.e.f.a.c.j.4
            @Override // com.censivn.C3DEngine.b.g.x
            public void a() {
                j.this.i = true;
                j.this.m();
            }
        };
        xVar.h(com.tsf.shell.e.f.a.j.a / 2.0f);
        xVar.a(255);
        w.a(this);
        w.a(this, 500, xVar);
        removeFromParent();
        this.b.h().addChild(this);
    }

    private void c() {
        if (this.g.id == 0) {
            k.a(this.g, this.c, this.d);
        }
    }

    public boolean a(boolean z) {
        return true;
    }

    public void h() {
    }

    public void i() {
        this.i = false;
        com.tsf.shell.manager.a.q.b(this.f);
        a();
        x xVar = new x() { // from class: com.tsf.shell.e.f.a.c.j.5
            @Override // com.censivn.C3DEngine.b.g.x
            public void a() {
                j.this.removeFromParent();
                j.this.b();
            }
        };
        xVar.a(0);
        xVar.h((-com.tsf.shell.e.f.a.j.a) / 2.0f);
        w.a(this);
        w.a(this, 500, xVar);
    }

    public void j() {
        if (this.e != null) {
            x xVar = new x();
            xVar.a(VEasing.Back.easeIn);
            w.a(this.e);
            w.a(this.e, 150, xVar);
        }
    }

    public void k() {
        if (this.e != null) {
            x xVar = new x();
            xVar.a(50);
            w.a(this.e);
            w.a(this.e, 150, xVar);
        }
    }

    public boolean l() {
        return true;
    }

    public void a(int i, int i2, int i3, int i4) {
    }

    public void b(boolean z) {
    }

    public void a() {
    }

    public void m() {
    }

    public void b() {
    }

    public void n() {
        c();
    }

    public void o() {
    }

    public void p() {
    }

    public void a(com.tsf.shell.e.i.e eVar, MotionEvent motionEvent) {
    }

    public void b(com.tsf.shell.e.i.e eVar, MotionEvent motionEvent) {
    }

    public void c(com.tsf.shell.e.i.e eVar, MotionEvent motionEvent) {
    }

    public void d(com.tsf.shell.e.i.e eVar, MotionEvent motionEvent) {
    }

    public void a(com.tsf.shell.e.i.e eVar, MotionEvent motionEvent, MotionEvent motionEvent2) {
    }

    public void a(com.tsf.shell.e.i.e eVar, MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
    }

    public void b(com.tsf.shell.e.i.e eVar, MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
    }

    public void e(com.tsf.shell.e.i.e eVar, MotionEvent motionEvent) {
    }
}
