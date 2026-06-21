package com.censivn.C3DEngine.b.b.a;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.PositionNumber3d;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.f.l;
import com.censivn.C3DEngine.b.g.w;
import com.censivn.C3DEngine.common.renderer.MatrixStack;
import com.tsf.shell.manager.action.h;
import com.tsf.shell.utils.x;

/* loaded from: classes.dex */
public class e extends l {
    public static final float a = com.censivn.C3DEngine.b.b.a.b(400.0f);
    private l d;
    private float i;
    private j m;
    private j n;
    private int s;
    private boolean e = false;
    private float f = 0.0f;
    private float g = 0.0f;
    private float h = 0.0f;
    private int j = 0;
    public boolean b = false;
    private boolean k = true;
    private boolean l = false;
    private boolean o = false;
    private float p = 0.0f;
    private boolean q = false;
    private boolean r = true;
    private l c = new l() { // from class: com.censivn.C3DEngine.b.b.a.e.1
        @Override // com.censivn.C3DEngine.b.f.j
        public void onChildMeasure(j jVar) {
            a();
        }

        private void a() {
            float maxY = maxY() - minY();
            int numChildren = numChildren();
            float f = 0.0f;
            for (int i = 0; i < numChildren; i++) {
                j childAt = getChildAt(i);
                if (childAt.visible()) {
                    f += childAt.maxY() - childAt.minY();
                }
            }
            if (maxY != f) {
                minY(-f);
                notifLayoutRefresh();
            }
        }
    };

    public l a() {
        return this.d;
    }

    public e() {
        addChild(this.c);
        this.i = com.censivn.C3DEngine.b.b.a.a(100.0f);
        setMouseEventListener(new com.censivn.C3DEngine.b.d.a(this) { // from class: com.censivn.C3DEngine.b.b.a.e.2
            float a;
            private com.censivn.C3DEngine.b.d.a d;
            private boolean e = false;
            private boolean f = false;
            private boolean g = false;
            private boolean h = false;

            @Override // com.censivn.C3DEngine.b.d.a
            public void e(MotionEvent motionEvent) {
                this.h = e.this.k;
                if (this.h) {
                    float[] a2 = x.a(motionEvent);
                    this.g = e.this.d.calTouchCollision(a2[0], a2[1]);
                    j hittingTarget = e.this.getHittingTarget(a2[0], a2[1], true);
                    if (hittingTarget != null && hittingTarget.getMouseEventListener() != null) {
                        this.d = hittingTarget.getMouseEventListener();
                        this.d.e(motionEvent);
                    }
                    e eVar = e.this;
                    float f = e.this.c.position().y;
                    this.a = f;
                    eVar.h = f;
                    e.this.setAnimationObjectState(true);
                    this.f = false;
                    this.e = true;
                    e.this.e = true;
                    e.this.p = 0.0f;
                    h.a();
                }
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void f(MotionEvent motionEvent) {
                if (this.h) {
                    this.e = true;
                    this.f = false;
                    e.this.e = false;
                    if (e.this.l) {
                        if (e.this.c.position().y >= (-e.this.f()) / 2.0f) {
                            e.this.d();
                        } else {
                            e.this.i();
                        }
                    }
                    if (e.this.b && !e.this.r && e.this.p > 1.0f) {
                        e.this.q();
                    }
                    if (this.d != null) {
                        this.d.f(motionEvent);
                        this.d = null;
                    }
                    e.this.p = 0.0f;
                }
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent, MotionEvent motionEvent2) {
                if (this.h && !e.this.l && this.d != null) {
                    this.d.a(motionEvent, motionEvent2);
                }
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent) {
                if (this.h) {
                    if (this.g && e.this.l) {
                        e.this.d();
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
                        if (Math.abs(f2) > Math.abs(f)) {
                            this.f = true;
                            e.this.b();
                        }
                    }
                    if (this.f) {
                        e.this.h = this.a - (motionEvent2.getY() - motionEvent.getY());
                        if (!e.this.l) {
                            e.this.h = com.tsf.shell.e.e.d.a(e.this.h, e.this.g, e.this.f, e.a);
                            return;
                        }
                        return;
                    }
                    if (!e.this.l && this.d != null) {
                        this.d.a(motionEvent, motionEvent2, f, f2);
                    }
                }
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if (!this.h || !this.f) {
                    return;
                }
                if (f2 < 0.0f && e.this.l) {
                    e.this.d();
                }
                e.this.h = com.tsf.shell.e.e.d.b(e.this.h, f2);
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void c(MotionEvent motionEvent) {
                if (this.h && !e.this.l && this.d != null) {
                    this.d.c(motionEvent);
                }
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void d(MotionEvent motionEvent) {
                if (this.h && !e.this.l && this.d != null) {
                    this.d.d(motionEvent);
                }
            }
        });
    }

    public void b() {
    }

    public void a(float f) {
        this.h -= f;
        if (this.h < this.f) {
            this.h = this.f;
        }
        setAnimationObjectState(true);
    }

    public void b(float f) {
        this.h += f;
        if (this.h > this.g) {
            this.h = this.g;
        }
        setAnimationObjectState(true);
    }

    public void c() {
        this.l = true;
        if (this.m != null) {
            this.m.visible(true);
            if (this.m.alpha() != 255.0f) {
                com.censivn.C3DEngine.b.g.x xVar = new com.censivn.C3DEngine.b.g.x();
                xVar.a(255);
                w.a(this.m);
                w.a(this.m, 500, xVar);
            }
        }
        i();
        m();
        d(this.j);
        this.c.mouseEnabled(false);
    }

    public void d() {
        this.l = false;
        renderChildren(true);
        if (this.m != null && this.m.alpha() != 0.0f) {
            com.censivn.C3DEngine.b.g.x xVar = new com.censivn.C3DEngine.b.g.x() { // from class: com.censivn.C3DEngine.b.b.a.e.3
                @Override // com.censivn.C3DEngine.b.g.x
                public void a() {
                    e.this.m.visible(false);
                }
            };
            xVar.a(0);
            w.a(this.m);
            w.a(this.m, 500, xVar);
        }
        setAnimationObjectState(true);
        invalidate();
        n();
        e(this.j);
        this.c.mouseEnabled(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        setAnimationObjectState(true);
        invalidate();
        this.h = e();
    }

    public float e() {
        return this.j == 0 ? (-this.d.minY()) + this.i : (-f()) - this.i;
    }

    public float f() {
        return maxY() - minY();
    }

    private void j() {
        if (this.h > this.g) {
            this.h = this.g;
            setAnimationObjectState(true);
        } else if (this.h < this.f) {
            this.h = this.f;
            setAnimationObjectState(true);
        }
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

    private void k() {
        float f = 0.0f;
        if (this.m != null) {
            if (this.j == 0) {
                this.m.position().y = (this.c.position().y - this.m.minY()) + this.i;
                return;
            }
            float f2 = -this.d.minY();
            float f3 = f();
            if (f2 > f3) {
                this.g = f2 - f3;
            } else {
                this.g = 0.0f;
                f = f3 - f2;
            }
            this.m.position().y = (((this.c.position().y - f2) - this.m.maxY()) - this.i) - f;
        }
    }

    private void l() {
        float f = 0.0f;
        if (this.n != null && this.d != null) {
            if (this.j == 0) {
                if (this.c.position().y < this.f) {
                    this.n.visible(true);
                } else {
                    this.n.visible(false);
                }
                this.n.position().y = this.c.position().y - this.n.minY();
                return;
            }
            if (this.c.position().y > this.g) {
                this.n.visible(true);
            } else {
                this.n.visible(false);
            }
            float f2 = -this.d.minY();
            float f3 = f();
            if (f2 > f3) {
                this.g = f2 - f3;
            } else {
                this.g = 0.0f;
                f = f3 - f2;
            }
            this.n.position().y = ((this.c.position().y - f2) - this.n.maxY()) - f;
        }
    }

    private void m() {
        if (this.n != null) {
            this.o = true;
            com.censivn.C3DEngine.b.g.x xVar = new com.censivn.C3DEngine.b.g.x() { // from class: com.censivn.C3DEngine.b.b.a.e.4
                @Override // com.censivn.C3DEngine.b.g.x
                public void a() {
                    if (e.this.n != null) {
                        e.this.n.visible(false);
                    }
                }
            };
            xVar.l(0.0f);
            xVar.m(0.0f);
            w.a(this.n);
            w.a(this.n, 500, xVar);
        }
    }

    private void n() {
        if (this.n != null) {
            this.o = false;
            this.n.visible(true);
            com.censivn.C3DEngine.b.g.x xVar = new com.censivn.C3DEngine.b.g.x();
            xVar.l(1.0f);
            xVar.m(1.0f);
            w.a(this.n);
            w.a(this.n, 500, xVar);
        }
    }

    @Override // com.censivn.C3DEngine.b.f.l
    public void onDrawChildStart() {
        transferCanvasV(minX(), -com.censivn.C3DEngine.b.b.a.I, maxX(), com.censivn.C3DEngine.b.b.a.I);
    }

    private void o() {
        this.s = this.j;
        this.q = true;
        this.r = false;
        a(this.j);
    }

    private void p() {
        this.q = false;
        this.r = true;
        c(this.j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        this.r = true;
        if (b(this.j)) {
            c();
        }
    }

    @Override // com.censivn.C3DEngine.b.f.j
    public void onDrawStart() {
        if (getAnimationObjectState()) {
            float f = this.l ? 100 : 255;
            if (this.e) {
                float f2 = (this.h - this.c.position().y) * 0.7f;
                PositionNumber3d position = this.c.position();
                position.y = f2 + position.y;
            } else {
                float f3 = 0.1f;
                boolean z = true;
                if (this.l) {
                    f3 = 0.15f;
                } else if (this.c.position().y > this.g && this.h > this.g) {
                    this.h += (this.g - this.h) * 0.2f;
                    if (Math.abs(this.h - this.g) < 1.0f) {
                        this.h = this.g;
                    } else {
                        z = false;
                    }
                    f3 = 0.15f;
                } else if (this.c.position().y < this.f && this.h < this.f) {
                    this.h += (this.f - this.h) * 0.2f;
                    if (Math.abs(this.h - this.f) < 1.0f) {
                        this.h = this.f;
                    } else {
                        z = false;
                    }
                    f3 = 0.15f;
                }
                float f4 = (this.h - this.c.position().y) * f3;
                PositionNumber3d position2 = this.c.position();
                position2.y = f4 + position2.y;
                float alpha = this.c.alpha();
                if (alpha != f) {
                    this.c.alpha((f3 * (f - alpha)) + alpha);
                }
                if (Math.abs(this.c.alpha() - f) < 1.0f && Math.abs(this.c.position().y - this.h) < 0.15f && z) {
                    this.c.alpha(f);
                    this.c.position().y = this.h;
                    setAnimationObjectState(false);
                    if (this.i <= 0.0f && this.l) {
                        renderChildren(false);
                    }
                }
            }
            if (this.b && !this.l && !this.o) {
                float f5 = this.f - this.c.position().y;
                float f6 = this.c.position().y - this.g;
                if (f5 > 0.0f) {
                    this.j = 0;
                } else {
                    this.j = 1;
                    f5 = f6;
                }
                this.p = (f5 / com.tsf.shell.e.e.d.a) * 1.5f;
                if (this.p > 0.0f) {
                    if (this.s != this.j && this.q) {
                        p();
                    }
                    if (this.r) {
                        o();
                    }
                    a(this.j, this.p);
                } else if (this.q) {
                    p();
                }
            }
            if (this.b) {
                l();
                k();
            }
        }
    }

    public void a(l lVar) {
        if (lVar.parent() != null) {
            lVar.removeFromParent();
        }
        this.d = lVar;
        g();
        l();
        this.c.addChild(this.d);
    }

    @Override // com.censivn.C3DEngine.b.f.j
    public void onChildMeasure(j jVar) {
        if (getChildIndexOf(jVar) != -1) {
            g();
        }
    }

    @Override // com.censivn.C3DEngine.b.f.j
    public void setAABBPX(float f, float f2, float f3, float f4, float f5, float f6) {
        super.setAABBPX(f, f2, f3, f4, f5, f6);
        this.c.minY(f2);
        this.c.maxY(f5);
    }

    @Override // com.censivn.C3DEngine.b.f.l, com.censivn.C3DEngine.b.f.j
    public void dispatchDraw() {
        if (visible()) {
            onDrawStart();
            MatrixStack.glPushMatrix();
            draw();
            MatrixStack.glColor(alpha(), getDefaultColor());
            onDrawChildStart();
            if (renderChildren()) {
                int size = children().size();
                for (int i = 0; i < size; i++) {
                    j jVar = (j) children().get(i);
                    onDrawChildStart(jVar);
                    if (jVar.getRendererVisibility()) {
                        jVar.dispatchDraw();
                    }
                    onDrawChildEnd(jVar);
                }
            }
            onDrawChildEnd();
            MatrixStack.glPopMatrix();
            onDrawEnd();
        }
    }

    public void g() {
        float f = -this.d.minY();
        float maxY = maxY() - minY();
        if (f > maxY) {
            this.g = f - maxY;
        } else {
            this.g = 0.0f;
        }
        j();
    }

    public void h() {
        this.c.onChildMeasure(null);
    }
}
