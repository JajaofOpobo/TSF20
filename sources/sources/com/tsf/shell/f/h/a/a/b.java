package com.tsf.shell.f.h.a.a;

import android.graphics.Bitmap;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.f.k;
import com.censivn.C3DEngine.b.f.m;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class b extends j {
    private m b;
    private com.tsf.shell.manager.c.a.a.a c;
    private com.tsf.shell.utils.c e = new com.tsf.shell.utils.c();
    private TextureElement d = new TextureElement(0, false);
    private k a = new k(d.a, d.a, false);

    public b() {
        this.a.textures().addElement(this.d);
        this.a.calAABB();
        this.b = new m();
        this.b.d(32);
        this.b.position().y = com.censivn.C3DEngine.b.b.a.a(-120.0f);
        this.b.g(170);
        addChild(this.a);
        addChild(this.b);
        d();
        setMouseEventListener(new com.censivn.C3DEngine.b.d.a(this) { // from class: com.tsf.shell.f.h.a.a.b.1
            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent) {
                if (b.this.c != null) {
                    com.tsf.shell.manager.a.o.a().v().a(b.this);
                }
            }
        });
    }

    public com.tsf.shell.manager.c.a.a.a a() {
        return this.c;
    }

    public k b() {
        return this.a;
    }

    public TextureElement c() {
        return this.d;
    }

    public void d() {
        setAABBPX(com.censivn.C3DEngine.b.b.a.a(200.0f), com.censivn.C3DEngine.b.b.a.a(250.0f));
        if (parent() != null) {
            ((j) parent()).onChildMeasure(this);
        }
    }

    @Override // com.censivn.C3DEngine.b.f.i
    public void onDrawStart() {
        if (this.d.id == 0) {
            this.d.id = com.tsf.shell.manager.a.o.a().v().c(false).id;
            if (this.c != null) {
                com.censivn.C3DEngine.a.a().d(new Runnable() { // from class: com.tsf.shell.f.h.a.a.b.2
                    @Override // java.lang.Runnable
                    public void run() {
                        b.this.e();
                    }
                });
            }
        }
    }

    public void e() {
        if (this.c != null) {
            Bitmap bitmapA = this.c.a(d.a, d.a, false);
            if (bitmapA != null) {
                this.e.a(bitmapA);
                Runnable runnable = new Runnable() { // from class: com.tsf.shell.f.h.a.a.b.3
                    @Override // java.lang.Runnable
                    public void run() {
                        b.this.i();
                    }
                };
                if (com.censivn.C3DEngine.a.e.l()) {
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
    public void i() {
        Bitmap bitmapA = this.e.a();
        h();
        if (bitmapA != null) {
            com.censivn.C3DEngine.a.g().a(this.d, bitmapA);
            bitmapA.recycle();
        }
    }

    public void f() {
        this.b.a(this.c.c);
        this.b.b();
    }

    public void g() {
        h();
        this.b.a();
    }

    public void h() {
        if (this.d.id == com.tsf.shell.manager.a.o.a().v().c(false).id) {
            this.d.id = 0;
        } else {
            com.censivn.C3DEngine.a.g().a(this.d);
        }
    }
}
