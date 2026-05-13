package com.tsf.shell.manager.r.b.c;

import android.graphics.Bitmap;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.f.i;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.f.k;
import com.censivn.C3DEngine.b.f.m;
import com.tsf.b;
import com.tsf.shell.manager.r.b.c.b;
import com.tsf.shell.utils.x;
/* loaded from: classes.dex */
public class a extends j {
    private TextureElement a = new TextureElement(0, false);
    private k b;
    private m c;

    public a() {
        b();
    }

    public void a() {
    }

    public void a(b.a aVar) {
        this.c.a(aVar.a + "  -  " + String.format(x.c(b.i.text_widget_count), Integer.valueOf(aVar.c.size())));
    }

    public void b() {
        this.b = new k(com.censivn.C3DEngine.b.b.a.a(24.0f), com.censivn.C3DEngine.b.b.a.a(45.0f), false) { // from class: com.tsf.shell.manager.r.b.c.a.1
            @Override // com.censivn.C3DEngine.b.f.i
            public void onDrawStart() {
                if (a.this.a.id == 0) {
                    Bitmap a = x.a(b.d.scrollcontainer_arrow);
                    com.censivn.C3DEngine.a.g().a(a.this.a, a);
                    a.recycle();
                }
            }
        };
        this.b.textures().addElement(this.a);
        a(this.b);
        addChild(this.b);
        this.b.position().x = com.censivn.C3DEngine.b.b.a.a(20.0f) + com.censivn.C3DEngine.b.b.a.a(12.0f);
        this.b.rotation().z = 180.0f;
        this.c = new m();
        this.c.d(42);
        this.c.e(-1);
        this.c.b(1);
        a(this.c);
        this.c.position().x = this.b.position().x + com.censivn.C3DEngine.b.b.a.a(12.0f) + com.censivn.C3DEngine.b.b.a.a(40.0f);
        addChild(this.c);
        com.tsf.shell.manager.o.c.a(this, com.tsf.shell.manager.o.c.h);
    }

    public void a(float f, float f2, float f3, float f4) {
        position().x = f;
    }

    public void c() {
        this.c.a();
        com.censivn.C3DEngine.a.g().a(this.a);
    }

    public void a(i iVar) {
        iVar.setMouseEventListener(new com.censivn.C3DEngine.b.d.a(iVar) { // from class: com.tsf.shell.manager.r.b.c.a.2
            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent) {
                a.this.a();
            }
        });
    }
}
