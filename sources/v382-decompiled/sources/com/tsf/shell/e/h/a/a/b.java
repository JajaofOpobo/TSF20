package com.tsf.shell.e.h.a.a;

import android.graphics.Bitmap;
import android.view.MotionEvent;
import com.censivn.C3DEngine.a.i;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.f.l;
import com.censivn.C3DEngine.b.f.m;
import com.censivn.C3DEngine.b.f.o;

/* loaded from: classes.dex */
public class b extends l {
    private o b;
    private com.tsf.shell.manager.c.a.a.b c;
    private com.tsf.shell.utils.c e = new com.tsf.shell.utils.c();
    private TextureElement d = new TextureElement(0, false);
    private m a = new m(d.a, d.a, false);

    public b() {
        this.a.textures().addElement(this.d);
        this.a.calAABB();
        this.b = new o();
        this.b.d(32);
        this.b.position().y = com.censivn.C3DEngine.b.b.a.a(-120.0f);
        this.b.g(170);
        addChild(this.a);
        addChild(this.b);
        d();
        setMouseEventListener(new com.censivn.C3DEngine.b.d.a(this) { // from class: com.tsf.shell.e.h.a.a.b.1
            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent) {
                if (b.this.c != null) {
                    com.tsf.shell.manager.a.o.a().v().a(b.this);
                }
            }
        });
    }

    public com.tsf.shell.manager.c.a.a.b a() {
        return this.c;
    }

    public m b() {
        return this.a;
    }

    public TextureElement c() {
        return this.d;
    }

    public void d() {
        setAABBPX(com.censivn.C3DEngine.b.b.a.a(200.0f), com.censivn.C3DEngine.b.b.a.a(250.0f));
        if (parent() != null) {
            ((l) parent()).onChildMeasure(this);
        }
    }

    public String e() {
        return this.c != null ? this.c.b : "";
    }

    @Override // com.censivn.C3DEngine.b.f.j
    public void onDrawStart() {
        if (this.d.id == 0) {
            this.d.id = com.tsf.shell.manager.a.o.a().v().c(false).id;
            if (this.c != null) {
                com.censivn.C3DEngine.a.a().d(new Runnable() { // from class: com.tsf.shell.e.h.a.a.b.2
                    @Override // java.lang.Runnable
                    public void run() {
                        b.this.f();
                    }
                });
            }
        }
    }

    public void f() {
        if (this.c != null) {
            Bitmap a = this.c.a(d.a, d.a, false);
            if (a != null) {
                this.e.a(a);
                Runnable runnable = new Runnable() { // from class: com.tsf.shell.e.h.a.a.b.3
                    @Override // java.lang.Runnable
                    public void run() {
                        b.this.k();
                    }
                };
                if (i.l()) {
                    runnable.run();
                    return;
                } else {
                    com.censivn.C3DEngine.a.a().c(runnable);
                    return;
                }
            }
            this.d.id = com.tsf.shell.manager.a.o.a().v().c(false).id;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        Bitmap a = this.e.a();
        i();
        if (a != null) {
            com.censivn.C3DEngine.a.g().a(this.d, a);
            a.recycle();
        }
    }

    public void g() {
        this.b.a(this.c.c);
        this.b.b();
    }

    public void a(com.tsf.shell.manager.c.a.a.b bVar) {
        int i = this.c != null ? this.c.e : -1;
        l();
        this.c = bVar;
        if (bVar.e != i && i != -1) {
            h();
            f();
        }
        g();
    }

    public void h() {
        i();
        this.b.a();
    }

    public void i() {
        if (this.d.id == com.tsf.shell.manager.a.o.a().v().c(false).id) {
            this.d.id = 0;
        } else {
            com.censivn.C3DEngine.a.g().a(this.d);
        }
    }

    public void j() {
        h();
        l();
        com.tsf.shell.manager.c.c.a(this);
    }

    private void l() {
        if (this.c != null) {
            this.c.i();
            com.tsf.shell.manager.c.c.a(this.c);
            this.c = null;
        }
    }
}
