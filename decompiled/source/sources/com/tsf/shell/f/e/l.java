package com.tsf.shell.f.e;

import android.view.MotionEvent;
/* loaded from: classes.dex */
public class l extends com.censivn.C3DEngine.b.f.j {
    private int a = 0;
    private com.censivn.C3DEngine.b.f.g b = new com.censivn.C3DEngine.b.f.g();
    private com.censivn.C3DEngine.b.f.m c;
    private float d;

    public l(int i, int i2) {
        this.b.a(com.censivn.C3DEngine.b.b.a.c * 70.0f, com.censivn.C3DEngine.b.b.a.c * 70.0f);
        this.b.a(i);
        this.b.calAABB();
        this.c = new com.censivn.C3DEngine.b.f.m();
        this.c.d(50);
        this.c.c(i2);
        this.c.b(1);
        this.c.b();
        c();
        addChild(this.b);
        addChild(this.c);
        this.d = this.c.position().x + this.c.maxX();
        setMouseEventListener(new com.censivn.C3DEngine.b.d.a(this) { // from class: com.tsf.shell.f.e.l.1
            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent) {
                l.this.a();
            }
        });
    }

    public void a() {
    }

    public void b() {
        this.b.a();
        this.c.a();
    }

    public void a(int i) {
        this.a = i;
        d();
    }

    private void c() {
        this.b.position().x = this.b.b() / 2.0f;
        this.c.position().x = this.b.position().x + (this.b.b() / 2.0f) + com.censivn.C3DEngine.b.b.a.a(20.0f);
    }

    private void d() {
        c();
        float a = com.censivn.C3DEngine.b.b.a.a(100.0f);
        switch (this.a) {
            case 0:
                this.b.position().x -= this.d / 2.0f;
                this.c.position().x -= this.d / 2.0f;
                setAABBPX((-this.d) / 2.0f, (-a) / 2.0f, 0.0f, this.d / 2.0f, a / 2.0f, 0.0f);
                return;
            case 1:
                setAABBPX(0.0f, (-a) / 2.0f, 0.0f, this.d, a / 2.0f, 0.0f);
                return;
            case 2:
                this.b.position().x -= this.d;
                this.c.position().x -= this.d;
                setAABBPX((-this.d) / 2.0f, (-a) / 2.0f, 0.0f, 0.0f, a / 2.0f, 0.0f);
                return;
            default:
                return;
        }
    }
}
