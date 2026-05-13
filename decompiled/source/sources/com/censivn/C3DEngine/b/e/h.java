package com.censivn.C3DEngine.b.e;

import android.graphics.Bitmap;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.b.f.k;
import com.censivn.C3DEngine.b.f.m;
import com.tsf.shell.utils.q;
import com.tsf.shell.utils.x;
/* loaded from: classes.dex */
public class h extends f {
    private com.censivn.C3DEngine.b.f.j b;
    private m d;
    private m e;
    private m f;
    private k g;
    private k h;
    private float i;
    private com.censivn.C3DEngine.b.f.j j;
    private k k;
    private TextureElement l;
    private a s;
    public float a = 0.1f;
    private int m = 0;
    private int n = 100;
    private int o = 0;
    private float p = 0.0f;
    private float q = 0.0f;
    private boolean r = false;
    private boolean t = true;
    private boolean u = false;
    private float v = 0.0f;

    /* loaded from: classes.dex */
    public static class a {
        public boolean a(int i) {
            return true;
        }

        public void a() {
        }
    }

    public h() {
        m();
    }

    public void a(a aVar) {
        this.s = aVar;
    }

    @Override // com.censivn.C3DEngine.b.e.f
    public void f() {
        if (this.t) {
            f(this.o);
            this.t = false;
        }
        if (this.l.id == 0) {
            Bitmap b = q.b(30.0f, -1);
            com.censivn.C3DEngine.a.g().a(this.l, b);
            b.recycle();
        }
    }

    @Override // com.censivn.C3DEngine.b.e.f
    public void g() {
        com.censivn.C3DEngine.a.g().a(this.l);
        this.d.a();
        this.e.a();
        if (this.f != null) {
            this.f.a();
        }
    }

    @Override // com.censivn.C3DEngine.b.e.f
    public void i() {
        super.i();
        this.k.visible(false);
        if (this.f != null) {
            this.f.alpha(100.0f);
        }
        this.b.alpha(100.0f);
        this.j.alpha(100.0f);
    }

    @Override // com.censivn.C3DEngine.b.e.f
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
        this.b = new com.censivn.C3DEngine.b.f.j();
        this.d = new m();
        this.d.a(1);
        this.d.b(1);
        this.d.d(50);
        this.b.addChild(this.d);
        this.e = new m();
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
        this.j = new com.censivn.C3DEngine.b.f.j();
        this.g = new k(0.0f, com.censivn.C3DEngine.b.b.a.a(10.0f), false);
        this.g.setDefaultColor(new Color4(255, 255, 255, (int) VEasing.Back.easeIn));
        this.h = new k(0.0f, com.censivn.C3DEngine.b.b.a.a(10.0f), false);
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
        this.k.setMouseEventListener(new com.censivn.C3DEngine.b.d.a(this.k) { // from class: com.censivn.C3DEngine.b.e.h.1
            private float b;

            @Override // com.censivn.C3DEngine.b.d.a
            public void e(MotionEvent motionEvent) {
                this.b = h.this.q;
                h.this.k.setAnimationObjectState(true);
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void f(MotionEvent motionEvent) {
                h.this.a = 0.1f;
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                h.this.u = true;
                h.this.a = 0.3f;
                float x = (motionEvent2.getX() - motionEvent.getX()) / h.this.i;
                h.this.q = x + this.b;
                h.this.q = (((int) (h.this.m + ((h.this.n - h.this.m) * h.this.q))) - h.this.m) / (h.this.n - h.this.m);
                if (h.this.q < 0.0f) {
                    h.this.q = 0.0f;
                } else if (h.this.q > 1.0f) {
                    h.this.q = 1.0f;
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
            this.f = new m();
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
        this.v = f / 2.0f;
    }

    @Override // com.censivn.C3DEngine.b.b.c
    public void c(int i) {
        int i2 = (int) (i - (this.v * 2.0f));
        if (this.d != null) {
            this.d.position().x = ((-i2) / 2.0f) + this.v;
        }
        if (this.f != null) {
            this.f.f(i2);
            this.f.position().x = ((-i2) / 2.0f) + this.v;
            n();
        }
        if (this.e != null) {
            this.e.position().x = (i2 / 2.0f) + this.v;
        }
        this.i = i2 * 0.8f;
        if (this.g != null) {
            this.g.position().x = ((-this.i) / 2.0f) + this.v;
        }
        if (this.h != null) {
            this.h.position().x = (this.i / 2.0f) + this.v;
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

    @Override // com.censivn.C3DEngine.b.f.i
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
                if (this.u) {
                    this.u = false;
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
        this.k.position().x = ((-this.i) / 2.0f) + (this.p * this.i) + this.v;
    }
}
