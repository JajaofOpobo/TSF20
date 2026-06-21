package com.tsf.shell.e.e.g.a;

import android.graphics.Bitmap;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.f.l;
import com.censivn.C3DEngine.b.f.m;
import com.censivn.C3DEngine.b.f.o;
import com.tsf.shell.R;
import com.tsf.shell.utils.x;

/* loaded from: classes.dex */
class g extends l {
    private TextureElement a = new TextureElement(0, false);
    final /* synthetic */ f b;
    private m c;
    private j d;
    private o e;

    public g(f fVar) {
        this.b = fVar;
        c();
    }

    public void a() {
    }

    public void a(int i) {
        a(x.c(i));
    }

    public void a(String str) {
        this.e.a(str);
        this.e.b();
        e();
    }

    public void a(j jVar) {
        b();
        this.d = jVar;
        this.d.position().x = this.c.position().x + com.censivn.C3DEngine.b.b.a.a(12.0f) + com.censivn.C3DEngine.b.b.a.a(90.0f);
        this.d.removeFromParent();
        addChild(this.d);
        e();
    }

    public void b() {
        if (this.d != null) {
            this.d.removeFromParent();
            this.d = null;
        }
    }

    private void e() {
        if (this.d != null && this.d.parent() == this) {
            this.e.position().x = this.c.position().x + com.censivn.C3DEngine.b.b.a.a(12.0f) + com.censivn.C3DEngine.b.b.a.a(40.0f) + com.censivn.C3DEngine.b.b.a.a(110.0f);
        } else {
            this.e.position().x = this.c.position().x + com.censivn.C3DEngine.b.b.a.a(12.0f) + com.censivn.C3DEngine.b.b.a.a(40.0f);
        }
        float a = com.censivn.C3DEngine.b.b.a.a(160.0f);
        setAABBPX(0.0f, (-a) / 2.0f, 0.0f, this.e.maxX() + this.e.position().x, a / 2.0f, 0.0f);
    }

    public void c() {
        this.c = new m(com.censivn.C3DEngine.b.b.a.a(24.0f), com.censivn.C3DEngine.b.b.a.a(45.0f), false) { // from class: com.tsf.shell.e.e.g.a.g.1
            @Override // com.censivn.C3DEngine.b.f.j
            public void onDrawStart() {
                if (g.this.a.id == 0) {
                    Bitmap a = x.a(R.drawable.scrollcontainer_arrow);
                    com.censivn.C3DEngine.a.g().a(g.this.a, a);
                    a.recycle();
                }
            }
        };
        this.c.textures().addElement(this.a);
        addChild(this.c);
        this.c.position().x = com.censivn.C3DEngine.b.b.a.a(20.0f) + com.censivn.C3DEngine.b.b.a.a(12.0f);
        this.c.rotation().z = 180.0f;
        this.e = new o();
        this.e.d(42);
        this.e.e(-1);
        this.e.b(1);
        addChild(this.e);
        com.tsf.shell.manager.o.c.a(this, com.tsf.shell.manager.o.c.h);
        b(this);
    }

    public void d() {
        this.e.a();
        com.censivn.C3DEngine.a.g().a(this.a);
    }

    public void b(j jVar) {
        jVar.setMouseEventListener(new com.censivn.C3DEngine.b.d.a(jVar) { // from class: com.tsf.shell.e.e.g.a.g.2
            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent) {
                g.this.a();
            }
        });
    }
}
