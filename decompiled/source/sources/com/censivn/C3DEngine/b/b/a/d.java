package com.censivn.C3DEngine.b.b.a;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.PositionNumber3d;
import com.censivn.C3DEngine.b.f.i;
import com.censivn.C3DEngine.b.f.j;
import com.tsf.shell.utils.x;
/* loaded from: classes.dex */
public class d extends j {
    public static final float a = com.censivn.C3DEngine.b.b.a.b(400.0f);
    private i d;
    private float i;
    private i p;
    private i q;
    private int v;
    private boolean e = false;
    private float f = 0.0f;
    private float g = 0.0f;
    private float h = 0.0f;
    private int j = 0;
    public boolean b = false;
    private boolean k = false;
    private float l = 0.0f;
    private float m = 0.0f;
    private boolean n = true;
    private boolean o = false;
    private boolean r = false;
    private float s = 0.0f;
    private boolean t = false;
    private boolean u = true;
    private j c = new j() { // from class: com.censivn.C3DEngine.b.b.a.d.1
        @Override // com.censivn.C3DEngine.b.f.i
        public void onChildMeasure(i iVar) {
            a();
        }

        private void a() {
            float maxX = maxX() - minX();
            int numChildren = numChildren();
            float f = 0.0f;
            for (int i = 0; i < numChildren; i++) {
                i childAt = getChildAt(i);
                if (childAt.visible()) {
                    f += childAt.maxX() - childAt.minX();
                }
            }
            if (maxX != f) {
                maxX(f);
                notifLayoutRefresh();
            }
        }
    };

    public d() {
        addChild(this.c);
        this.i = com.censivn.C3DEngine.b.b.a.a(100.0f);
        setMouseEventListener(new com.censivn.C3DEngine.b.d.a(this) { // from class: com.censivn.C3DEngine.b.b.a.d.2
            float a;
            private com.censivn.C3DEngine.b.d.a d;
            private boolean e = false;
            private boolean f = false;
            private boolean g = false;
            private boolean h = false;

            @Override // com.censivn.C3DEngine.b.d.a
            public void e(MotionEvent motionEvent) {
                this.h = d.this.n;
                if (this.h) {
                    float[] a2 = x.a(motionEvent);
                    this.g = d.this.d.calTouchCollision(a2[0], a2[1]);
                    i hittingTarget = d.this.getHittingTarget(a2[0], a2[1], true);
                    if (hittingTarget != null && hittingTarget.getMouseEventListener() != null) {
                        this.d = hittingTarget.getMouseEventListener();
                        this.d.e(motionEvent);
                    }
                    d dVar = d.this;
                    float f = d.this.c.position().x;
                    this.a = f;
                    dVar.h = f;
                    d.this.setAnimationObjectState(true);
                    this.f = false;
                    this.e = true;
                    d.this.e = true;
                    d.this.s = 0.0f;
                }
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void f(MotionEvent motionEvent) {
                if (this.h) {
                    this.e = true;
                    this.f = false;
                    d.this.e = false;
                    if (d.this.o) {
                        if (d.this.c.position().x > d.this.i() / 2.0f) {
                            d.this.l();
                        } else {
                            d.this.g();
                        }
                    }
                    if (d.this.b && !d.this.u && d.this.s > 1.0f) {
                        d.this.u();
                    }
                    if (this.d != null) {
                        this.d.f(motionEvent);
                        this.d = null;
                    }
                    d.this.s = 0.0f;
                    d.this.h = d.this.a(d.this.h);
                }
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent, MotionEvent motionEvent2) {
                if (this.h && !d.this.o && this.d != null) {
                    this.d.a(motionEvent, motionEvent2);
                }
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent) {
                if (this.h) {
                    if (this.g && d.this.o) {
                        d.this.g();
                    } else if (this.d != null) {
                        this.d.a(motionEvent);
                    }
                }
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if (this.h) {
                    if (this.e) {
                        this.e = false;
                        if (Math.abs(f) > Math.abs(f2)) {
                            this.f = true;
                            d.this.a();
                        }
                    }
                    if (!this.f) {
                        if (!d.this.o && this.d != null) {
                            this.d.a(motionEvent, motionEvent2, f, f2);
                            return;
                        }
                        return;
                    }
                    d.this.h = this.a + (motionEvent2.getX() - motionEvent.getX());
                    if (!d.this.o) {
                        d.this.h = com.tsf.shell.f.e.c.a(d.this.h, d.this.g, d.this.f, d.a);
                    }
                }
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if (this.h && this.f) {
                    if (f < 0.0f && d.this.o) {
                        d.this.g();
                    }
                    d.this.h = com.tsf.shell.f.e.c.a(d.this.h, f);
                }
            }
        });
    }

    public float a(float f) {
        float i = i() / 2.0f;
        if (f > this.g) {
            b((this.g - i) - b());
            return f;
        } else if (f < this.f) {
            b((this.f - i) + c());
            return f;
        } else {
            float b = i + b();
            return b + b(f - b);
        }
    }

    public void a() {
    }

    public float b(float f) {
        return f;
    }

    public void a(boolean z) {
        this.b = z;
    }

    public void b(boolean z) {
        this.k = z;
    }

    public void c(float f) {
        this.l = f;
    }

    public float b() {
        return this.l;
    }

    public float c() {
        return this.m;
    }

    public void d(float f) {
        this.m = f;
    }

    public void d() {
        this.n = false;
    }

    public void e() {
        this.n = true;
    }

    public void e(float f) {
        this.i = f;
    }

    public void f() {
        this.o = true;
        if (this.p != null) {
            this.p.visible(true);
            if (this.p.alpha() != 255.0f) {
                com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
                dVar.a(255);
                com.censivn.C3DEngine.b.g.c.a(this.p);
                com.censivn.C3DEngine.b.g.c.a(this.p, 500, dVar);
            }
        }
        l();
        q();
        d(this.j);
        this.c.mouseEnabled(false);
    }

    public void g() {
        this.o = false;
        renderChildren(true);
        if (this.p != null && this.p.alpha() != 0.0f) {
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.censivn.C3DEngine.b.b.a.d.3
                @Override // com.censivn.C3DEngine.b.g.d
                public void a() {
                    d.this.p.visible(false);
                }
            };
            dVar.a(0);
            com.censivn.C3DEngine.b.g.c.a(this.p);
            com.censivn.C3DEngine.b.g.c.a(this.p, 500, dVar);
        }
        setAnimationObjectState(true);
        invalidate();
        r();
        e(this.j);
        this.c.mouseEnabled(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        setAnimationObjectState(true);
        invalidate();
        this.h = h();
    }

    private void m() {
        setAnimationObjectState(true);
        invalidate();
        this.h = 0.0f;
    }

    public float h() {
        return this.j == 0 ? i() - this.i : (-this.d.maxX()) + this.i;
    }

    public float i() {
        return maxX() - minX();
    }

    private void n() {
        if (this.h > this.g) {
            this.h = this.g;
            setAnimationObjectState(true);
        } else if (this.h < this.f) {
            this.h = this.f;
            setAnimationObjectState(true);
        }
    }

    public void a(float f, boolean z) {
        if (z) {
            this.h = f;
            return;
        }
        PositionNumber3d position = this.c.position();
        this.h = f;
        position.x = f;
    }

    public void a(int i) {
    }

    public void a(int i, float f) {
    }

    public boolean b(int i) {
        return true;
    }

    public void c(int i) {
    }

    public void d(int i) {
    }

    public void e(int i) {
    }

    public void a(i iVar) {
        a(true);
        if (this.p != null) {
            this.p.removeFromParent();
        }
        this.p = iVar;
        this.p.visible(false);
        addChild(this.p);
        o();
    }

    private void o() {
        float f = 0.0f;
        if (this.p != null) {
            if (this.j == 0) {
                this.p.position().x = (this.c.position().x - this.p.maxX()) + this.i;
                return;
            }
            float maxX = this.d.maxX();
            float i = i();
            if (maxX > i) {
                this.f = -(maxX - i);
            } else {
                this.f = 0.0f;
                f = i - maxX;
            }
            this.p.position().x = f + (((maxX + this.c.position().x) - this.p.minX()) - this.i);
        }
    }

    public void b(i iVar) {
        a(true);
        if (this.q != null) {
            this.q.removeFromParent();
        }
        this.q = iVar;
        addChild(this.q);
        p();
    }

    private void p() {
        float f = 0.0f;
        if (this.q != null && this.d != null) {
            if (this.j == 0) {
                if (this.c.position().x > 0.0f) {
                    this.q.visible(true);
                } else {
                    this.q.visible(false);
                }
                this.q.position().x = this.c.position().x - this.q.maxX();
                return;
            }
            if (this.c.position().x < this.f) {
                this.q.visible(true);
            } else {
                this.q.visible(false);
            }
            float maxX = this.d.maxX();
            float i = i();
            if (maxX > i) {
                this.f = -(maxX - i);
            } else {
                this.f = 0.0f;
                f = i - maxX;
            }
            this.q.position().x = f + maxX + this.c.position().x + this.q.maxX();
        }
    }

    private void q() {
        if (this.q != null) {
            this.r = true;
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.censivn.C3DEngine.b.b.a.d.4
                @Override // com.censivn.C3DEngine.b.g.d
                public void a() {
                    if (d.this.q != null) {
                        d.this.q.visible(false);
                    }
                }
            };
            dVar.l(0.0f);
            dVar.m(0.0f);
            com.censivn.C3DEngine.b.g.c.a(this.q);
            com.censivn.C3DEngine.b.g.c.a(this.q, 500, dVar);
        }
    }

    private void r() {
        if (this.q != null) {
            this.r = false;
            this.q.visible(true);
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
            dVar.l(1.0f);
            dVar.m(1.0f);
            com.censivn.C3DEngine.b.g.c.a(this.q);
            com.censivn.C3DEngine.b.g.c.a(this.q, 500, dVar);
        }
    }

    @Override // com.censivn.C3DEngine.b.f.j
    public void onDrawChildStart() {
        transferCanvas(com.censivn.C3DEngine.b.b.a.z, com.censivn.C3DEngine.b.b.a.C, com.censivn.C3DEngine.b.b.a.A, com.censivn.C3DEngine.b.b.a.B);
    }

    private void s() {
        this.v = this.j;
        this.t = true;
        this.u = false;
        a(this.j);
    }

    private void t() {
        this.t = false;
        this.u = true;
        c(this.j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        this.u = true;
        if (b(this.j)) {
            f();
        }
    }

    public void a(float f, float f2, float f3, float f4) {
        if (this.o) {
            l();
        } else {
            m();
        }
    }

    @Override // com.censivn.C3DEngine.b.f.i
    public void onDrawStart() {
        if (getAnimationObjectState()) {
            float f = this.o ? 100.0f : 255.0f;
            if (this.e) {
                PositionNumber3d position = this.c.position();
                position.x = ((this.h - this.c.position().x) * 0.7f) + position.x;
            } else {
                float f2 = 0.1f;
                boolean z = true;
                if (this.o) {
                    f2 = 0.15f;
                } else if (this.c.position().x > this.g && this.h > this.g) {
                    this.h += (this.g - this.h) * 0.2f;
                    if (Math.abs(this.h - this.g) < 1.0f) {
                        this.h = this.g;
                    } else {
                        z = false;
                    }
                    f2 = 0.15f;
                } else if (this.c.position().x < this.f && this.h < this.f) {
                    this.h += (this.f - this.h) * 0.2f;
                    if (Math.abs(this.h - this.f) < 1.0f) {
                        this.h = this.f;
                    } else {
                        z = false;
                    }
                    f2 = 0.15f;
                }
                PositionNumber3d position2 = this.c.position();
                position2.x = ((this.h - this.c.position().x) * f2) + position2.x;
                float alpha = this.c.alpha();
                if (alpha != f) {
                    this.c.alpha((f2 * (f - alpha)) + alpha);
                }
                if (Math.abs(this.c.alpha() - f) < 1.0f && Math.abs(this.c.position().x - this.h) < 0.15f && z) {
                    this.c.alpha(f);
                    this.c.position().x = this.h;
                    setAnimationObjectState(false);
                    if (this.i <= 0.0f && this.o) {
                        renderChildren(false);
                    }
                }
            }
            if (this.b && !this.o && !this.r) {
                float f3 = this.c.position().x - this.g;
                float f4 = this.f - this.c.position().x;
                if (f3 > 0.0f) {
                    this.j = 0;
                } else {
                    this.j = 1;
                    f3 = f4;
                }
                this.s = (f3 / com.tsf.shell.f.e.c.a) * 1.5f;
                if (this.s > 0.0f) {
                    if (this.v != this.j && this.t) {
                        t();
                    }
                    if (this.u) {
                        s();
                    }
                    a(this.j, this.s);
                } else if (this.t) {
                    t();
                }
            }
            if (this.b) {
                p();
                o();
            }
        }
    }

    public void j() {
        PositionNumber3d position = this.c.position();
        float f = this.g;
        position.x = f;
        this.h = f;
    }

    public void c(i iVar) {
        if (this.d != null) {
        }
        if (iVar.parent() != null) {
            iVar.removeFromParent();
        }
        this.d = iVar;
        k();
        p();
        this.c.addChild(this.d);
    }

    @Override // com.censivn.C3DEngine.b.f.i
    public void onChildMeasure(i iVar) {
        if (getChildIndexOf(iVar) != -1) {
            k();
        }
    }

    @Override // com.censivn.C3DEngine.b.f.i
    public void setAABBPX(float f, float f2, float f3, float f4, float f5, float f6) {
        super.setAABBPX(f, f2, f3, f4, f5, f6);
        this.c.minY(f2);
        this.c.maxY(f5);
    }

    public void k() {
        float maxX = this.d.maxX();
        float maxX2 = maxX() - minX();
        if (!this.k) {
            if (maxX > maxX2) {
                this.g = 0.0f;
                this.f = -(maxX - maxX2);
            } else if (this.b) {
                this.g = 0.0f;
                this.f = 0.0f;
            } else {
                float f = (maxX2 - maxX) / 2.0f;
                this.f = f;
                this.g = f;
            }
        } else {
            this.f = (-maxX) + (maxX2 / 2.0f);
            this.g = maxX2 / 2.0f;
        }
        this.f += this.m;
        this.g += this.l;
        n();
    }
}
