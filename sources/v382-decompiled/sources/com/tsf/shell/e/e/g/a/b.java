package com.tsf.shell.e.e.g.a;

import android.graphics.Bitmap;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.f.m;
import com.tsf.shell.utils.w;
import com.tsf.shell.utils.x;

/* loaded from: classes.dex */
public class b extends m {
    private TextureElement a;
    private boolean d;
    private int e;
    private String f;
    private c g;
    private boolean h;

    public b(int i, String str, c cVar) {
        super(0.0f, 0.0f, false);
        this.d = false;
        this.h = true;
        this.f = str;
        this.e = i;
        this.g = cVar;
        this.a = new TextureElement(0, false);
        textures().addElement(this.a);
        setMouseEventListener(new com.censivn.C3DEngine.b.d.a(this) { // from class: com.tsf.shell.e.e.g.a.b.1
            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent) {
                if (b.this.d) {
                    b.this.g.c();
                } else {
                    b.this.g.b();
                }
                b.this.a();
                w.b();
            }
        });
    }

    public void a() {
        this.d = this.g.a();
        k();
        if (this.d) {
            h();
        } else {
            i();
        }
    }

    public void d() {
        a();
    }

    public void e() {
        j();
    }

    public boolean f() {
        return this.h;
    }

    public void g() {
        if (this.a.id != 0) {
            j();
            k();
            if (this.d) {
                h();
            } else {
                i();
            }
        }
    }

    public void h() {
        this.d = true;
        com.tsf.shell.manager.o.c.a(this, com.tsf.shell.manager.o.c.m);
    }

    public void i() {
        this.d = false;
        com.tsf.shell.manager.o.c.a(this, com.tsf.shell.manager.o.c.n);
    }

    private void k() {
        Bitmap createCustomIco;
        if (this.a.id != 0) {
            return;
        }
        createCustomIco = a.createCustomIco(this.f, x.a(this.e, com.censivn.C3DEngine.b.b.a.c * 60.0f, com.censivn.C3DEngine.b.b.a.c * 60.0f));
        com.censivn.C3DEngine.a.g().a(this.a, createCustomIco);
        createCustomIco.recycle();
        if (b() != this.a.width) {
            a(this.a.width);
            b(this.a.height);
            calAABB(1.0f, 0.7f, 1.0f);
        }
    }

    public void j() {
        if (this.a.id != 0) {
            com.censivn.C3DEngine.a.g().a(this.a);
        }
    }
}
