package com.censivn.C3DEngine.b.e;

import android.graphics.Bitmap;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.tsf.shell.utils.r;
import com.tsf.shell.utils.x;

/* loaded from: classes.dex */
public class k extends i {
    private com.censivn.C3DEngine.b.f.l b;
    private com.censivn.C3DEngine.b.f.o d;
    private com.censivn.C3DEngine.b.f.o e;
    private com.censivn.C3DEngine.b.f.o f;
    private com.censivn.C3DEngine.b.f.m g;
    private com.censivn.C3DEngine.b.f.m h;
    private float i;
    private com.censivn.C3DEngine.b.f.l j;
    private com.censivn.C3DEngine.b.f.m k;
    private TextureElement l;
    private l s;
    public float a = 0.1f;
    private int m = 0;
    private int n = 100;
    private int o = 0;
    private float p = 0.0f;
    private float q = 0.0f;
    private boolean r = false;
    private boolean t = false;
    private float u = 0.0f;

    public k() {
        m();
    }

    public void a(l lVar) {
        this.s = lVar;
    }

    @Override // com.censivn.C3DEngine.b.e.i
    public void f() {
        if (this.l.id == 0) {
            Bitmap b = r.b(30.0f, -1);
            com.censivn.C3DEngine.a.g().a(this.l, b);
            b.recycle();
        }
    }

    @Override // com.censivn.C3DEngine.b.e.i
    public void g() {
        com.censivn.C3DEngine.a.g().a(this.l);
        this.d.a();
        this.e.a();
        if (this.f != null) {
            this.f.a();
        }
    }

    @Override // com.censivn.C3DEngine.b.e.i
    public void i() {
        super.i();
        this.k.visible(false);
        if (this.f != null) {
            this.f.alpha(100.0f);
        }
        this.b.alpha(100.0f);
        this.j.alpha(100.0f);
    }

    @Override // com.censivn.C3DEngine.b.e.i
    public void j() {
        super.j();
        this.k.visible(true);
        if (this.f != null) {
            this.f.alpha(255.0f);
        }
        this.b.alpha(255.0f);
        this.j.alpha(255.0f);
    }

    private void m() {
        a(1);
        this.b = new com.censivn.C3DEngine.b.f.l();
        this.d = new com.censivn.C3DEngine.b.f.o();
        this.d.a(1);
        this.d.b(1);
        this.d.d(50);
        this.b.addChild(this.d);
        this.e = new com.censivn.C3DEngine.b.f.o();
        this.e.a(1);
        this.e.b(2);
        this.e.d(50);
        this.e.b();
        this.b.addChild(this.e);
        com.censivn.C3DEngine.b.b.b bVar = new com.censivn.C3DEngine.b.b.b();
        bVar.a = com.censivn.C3DEngine.b.b.a.a(15.0f);
        bVar.i = this.e.minY();
        bVar.k = this.e.maxY();
        this.b.setLayoutParams(bVar);
        addChild(this.b);
        this.j = new com.censivn.C3DEngine.b.f.l();
        this.g = new com.censivn.C3DEngine.b.f.m(0.0f, com.censivn.C3DEngine.b.b.a.a(10.0f), false);
        this.g.setDefaultColor(new Color4(255, 255, 255, VEasing.Back.easeIn));
        this.h = new com.censivn.C3DEngine.b.f.m(0.0f, com.censivn.C3DEngine.b.b.a.a(10.0f), false);
        this.h.setDefaultColor(new Color4(255, 255, 255, 100));
        this.j.addChild(this.g);
        this.j.addChild(this.h);
        com.censivn.C3DEngine.b.b.b bVar2 = new com.censivn.C3DEngine.b.b.b();
        bVar2.a = com.censivn.C3DEngine.b.b.a.a(70.0f);
        bVar2.b = com.censivn.C3DEngine.b.b.a.a(60.0f);
        bVar2.i = (-com.censivn.C3DEngine.b.b.a.a(10.0f)) / 2.0f;
        bVar2.k = com.censivn.C3DEngine.b.b.a.a(10.0f) / 2.0f;
        this.j.setLayoutParams(bVar2);
        this.k = com.censivn.C3DEngine.b.b.a.a(60.0f, 60.0f);
        this.k.calAABB(2.0f, 2.0f, 2.0f);
        this.l = new TextureElement(0, false);
        this.k.textures().addElement(this.l);
        this.k.setMouseEventListener(new com.censivn.C3DEngine.b.d.a(this.k) { // from class: com.censivn.C3DEngine.b.e.k.1
            private float b;

            @Override // com.censivn.C3DEngine.b.d.a
            public void e(MotionEvent motionEvent) {
                this.b = k.this.q;
                k.this.k.setAnimationObjectState(true);
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void f(MotionEvent motionEvent) {
                k.this.a = 0.1f;
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                k.this.t = true;
                k.this.a = 0.3f;
                k.this.q = ((motionEvent2.getX() - motionEvent.getX()) / k.this.i) + this.b;
                int i = (int) (k.this.m + ((k.this.n - k.this.m) * k.this.q));
                k.this.q = (i - k.this.m) / (k.this.n - k.this.m);
                if (k.this.q < 0.0f) {
                    k.this.q = 0.0f;
                } else if (k.this.q > 1.0f) {
                    k.this.q = 1.0f;
                }
            }
        });
        this.j.addChild(this.k);
        addChild(this.j);
    }

    public void g(int i) {
        b(x.c(i));
    }

    public void b(String str) {
        this.d.a(str);
    }

    public void h(int i) {
        c(x.c(i));
    }

    public void c(String str) {
        if (this.f == null) {
            this.f = new com.censivn.C3DEngine.b.f.o();
            this.f.a(true);
            this.f.a(1);
            this.f.b(1);
            this.f.setLayoutParams(new com.censivn.C3DEngine.b.b.b());
            this.f.d(38);
            this.f.position().x = (-a()) / 2.0f;
            this.f.e(-5592406);
            addChildAt(this.f, 1);
        }
        this.f.a(str);
        n();
        d();
    }

    private void n() {
        if (this.f != null) {
            this.f.b();
            com.censivn.C3DEngine.b.b.b layoutParams = this.f.getLayoutParams();
            layoutParams.h = this.f.minX();
            layoutParams.j = this.f.maxX();
            layoutParams.i = this.f.minY();
            layoutParams.k = this.f.maxY();
        }
    }

    public void d(String str) {
        this.e.a(str);
    }

    public void a(float f) {
        this.u = f / 2.0f;
    }

    @Override // com.censivn.C3DEngine.b.b.c
    public void c(int i) {
        int i2 = (int) (i - (this.u * 2.0f));
        if (this.d != null) {
            this.d.position().x = ((-i2) / 2.0f) + this.u;
        }
        if (this.f != null) {
            this.f.f(i2);
            this.f.position().x = ((-i2) / 2.0f) + this.u;
            n();
        }
        if (this.e != null) {
            this.e.position().x = (i2 / 2.0f) + this.u;
        }
        this.i = i2 * 0.8f;
        if (this.g != null) {
            this.g.position().x = ((-this.i) / 2.0f) + this.u;
        }
        if (this.h != null) {
            this.h.position().x = (this.i / 2.0f) + this.u;
        }
        h();
    }

    public void i(int i) {
        this.m = i;
    }

    public void j(int i) {
        this.n = i;
    }

    public int e() {
        return this.o;
    }

    public void k(int i) {
        a(i, false);
    }

    public void a(int i, boolean z) {
        if (this.o != i) {
            this.o = i;
            if (z) {
                this.q = (i - this.m) / (this.n - this.m);
                return;
            }
            float f = (i - this.m) / (this.n - this.m);
            this.p = f;
            this.q = f;
            h();
            f(this.o);
        }
    }

    @Override // com.censivn.C3DEngine.b.f.j
    public void onDrawStart() {
        if (this.q != this.p || this.r || this.k.getAnimationObjectState()) {
            if (this.r) {
                this.r = false;
            }
            this.p += (this.q - this.p) * this.a;
            if (Math.abs(this.q - this.p) < 0.005f) {
                this.p = this.q;
            }
            invalidate();
            h();
            int i = (int) (this.m + ((this.n - this.m) * this.p));
            if (i != this.o) {
                this.o = i;
                if (this.t) {
                    this.t = false;
                    if (this.s != null) {
                        this.s.a();
                    }
                }
                l(this.o);
            }
        }
    }

    private void l(int i) {
        if (this.s != null) {
            this.s.a(i);
        }
        f(this.o);
    }

    public void f(int i) {
    }

    public void h() {
        float f = this.p * this.i;
        this.g.points().pxX(0, f);
        this.g.points().pxX(2, f);
        this.g.updatePointsVBO();
        float f2 = (1.0f - this.p) * this.i;
        this.h.points().pxX(1, -f2);
        this.h.points().pxX(3, -f2);
        this.h.updatePointsVBO();
        this.k.position().x = ((-this.i) / 2.0f) + (this.p * this.i) + this.u;
    }
}
