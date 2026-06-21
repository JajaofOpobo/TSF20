package com.censivn.C3DEngine.b.f;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Color4;

/* loaded from: classes.dex */
public class n extends l {
    private o a;
    private m b;
    private Color4 c = new Color4();
    private int d;
    private int e;

    public n(float f, float f2, int i, int i2) {
        this.b = new m(f, f2, false);
        this.b.setDefaultColor(this.c);
        this.d = i;
        this.e = i2;
        this.c.set(this.d);
        this.b.setMouseEventListener(new com.censivn.C3DEngine.b.d.a(this.b) { // from class: com.censivn.C3DEngine.b.f.n.1
            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent) {
                n.this.a();
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void e(MotionEvent motionEvent) {
                n.this.b();
                n.this.c.set(n.this.e);
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void f(MotionEvent motionEvent) {
                n.this.c();
                n.this.c.set(n.this.d);
            }
        });
        this.b.calAABB();
        this.a = new o();
        addChild(this.b);
        addChild(this.a);
    }

    public void a(int i) {
        this.a.c(i);
    }

    public void b(int i) {
        this.a.d(i);
    }

    public void a() {
    }

    public void b() {
    }

    public void c() {
    }

    public void d() {
        this.a.a();
    }
}
