package com.censivn.C3DEngine.b.b.a;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.PositionNumber3d;
import com.censivn.C3DEngine.b.f.i;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.common.renderer.MatrixStack;
import com.tsf.shell.manager.action.f;
import com.tsf.shell.utils.x;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class e extends j {
    public static final float a = com.censivn.C3DEngine.b.b.a.b(400.0f);
    private j d;
    private float i;
    private i m;
    private i n;
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
    private j c = new j() { // from class: com.censivn.C3DEngine.b.b.a.e.1
        @Override // com.censivn.C3DEngine.b.f.i
        public void onChildMeasure(i iVar) {
            a();
        }

        private void a() {
            float fMaxY = maxY() - minY();
            int iNumChildren = numChildren();
            float fMaxY2 = 0.0f;
            for (int i = 0; i < iNumChildren; i++) {
                i childAt = getChildAt(i);
                if (childAt.visible()) {
                    fMaxY2 += childAt.maxY() - childAt.minY();
                }
            }
            if (fMaxY != fMaxY2) {
                minY(-fMaxY2);
                notifLayoutRefresh();
            }
        }
    };

    public j a() {
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
                    float[] fArrA = x.a(motionEvent);
                    this.g = e.this.d.calTouchCollision(fArrA[0], fArrA[1]);
                    i hittingTarget = e.this.getHittingTarget(fArrA[0], fArrA[1], true);
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
                    f.a();
                }
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void f(MotionEvent motionEvent) {
                if (this.h) {
                    this.e = true;
                    this.f = false;
                    e.this.e = false;
                    if (e.this.l) {
                        if (e.this.c.position().y < (-e.this.f()) / 2.0f) {
                            e.this.i();
                        } else {
                            e.this.d();
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
                    if (!this.f) {
                        if (!e.this.l && this.d != null) {
                            this.d.a(motionEvent, motionEvent2, f, f2);
                            return;
                        }
                        return;
                    }
                    e.this.h = this.a - (motionEvent2.getY() - motionEvent.getY());
                    if (!e.this.l) {
                        e.this.h = com.tsf.shell.f.e.c.a(e.this.h, e.this.g, e.this.f, e.a);
                    }
                }
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if (this.h && this.f) {
                    if (f2 < 0.0f && e.this.l) {
                        e.this.d();
                    }
                    e.this.h = com.tsf.shell.f.e.c.b(e.this.h, f2);
                }
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
                com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
                dVar.a(255);
                com.censivn.C3DEngine.b.g.c.a(this.m);
                com.censivn.C3DEngine.b.g.c.a(this.m, 500, dVar);
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
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.censivn.C3DEngine.b.b.a.e.3
                @Override // com.censivn.C3DEngine.b.g.d
                public void a() {
                    e.this.m.visible(false);
                }
            };
            dVar.a(0);
            com.censivn.C3DEngine.b.g.c.a(this.m);
            com.censivn.C3DEngine.b.g.c.a(this.m, 500, dVar);
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
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.censivn.C3DEngine.b.b.a.e.4
                @Override // com.censivn.C3DEngine.b.g.d
                public void a() {
                    if (e.this.n != null) {
                        e.this.n.visible(false);
                    }
                }
            };
            dVar.l(0.0f);
            dVar.m(0.0f);
            com.censivn.C3DEngine.b.g.c.a(this.n);
            com.censivn.C3DEngine.b.g.c.a(this.n, 500, dVar);
        }
    }

    private void n() {
        if (this.n != null) {
            this.o = false;
            this.n.visible(true);
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
            dVar.l(1.0f);
            dVar.m(1.0f);
            com.censivn.C3DEngine.b.g.c.a(this.n);
            com.censivn.C3DEngine.b.g.c.a(this.n, 500, dVar);
        }
    }

    @Override // com.censivn.C3DEngine.b.f.j
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

    @Override // com.censivn.C3DEngine.b.f.i
    public void onDrawStart() {
        if (getAnimationObjectState()) {
            float f = this.l ? 100.0f : 255.0f;
            if (this.e) {
                float f2 = (this.h - this.c.position().y) * 0.7f;
                PositionNumber3d positionNumber3dPosition = this.c.position();
                positionNumber3dPosition.y = f2 + positionNumber3dPosition.y;
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
                PositionNumber3d positionNumber3dPosition2 = this.c.position();
                positionNumber3dPosition2.y = f4 + positionNumber3dPosition2.y;
                float fAlpha = this.c.alpha();
                if (fAlpha != f) {
                    this.c.alpha((f3 * (f - fAlpha)) + fAlpha);
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
                this.p = (f5 / com.tsf.shell.f.e.c.a) * 1.5f;
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

    public void a(j jVar) {
        if (jVar.parent() != null) {
            jVar.removeFromParent();
        }
        this.d = jVar;
        g();
        l();
        this.c.addChild(this.d);
    }

    @Override // com.censivn.C3DEngine.b.f.i
    public void onChildMeasure(i iVar) {
        if (getChildIndexOf(iVar) != -1) {
            g();
        }
    }

    @Override // com.censivn.C3DEngine.b.f.i
    public void setAABBPX(float f, float f2, float f3, float f4, float f5, float f6) {
        super.setAABBPX(f, f2, f3, f4, f5, f6);
        this.c.minY(f2);
        this.c.maxY(f5);
    }

    @Override // com.censivn.C3DEngine.b.f.j, com.censivn.C3DEngine.b.f.i
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
                    i iVar = children().get(i);
                    onDrawChildStart(iVar);
                    if (iVar.getRendererVisibility()) {
                        iVar.dispatchDraw();
                    }
                    onDrawChildEnd(iVar);
                }
            }
            onDrawChildEnd();
            MatrixStack.glPopMatrix();
            onDrawEnd();
        }
    }

    public void g() {
        float f = -this.d.minY();
        float fMaxY = maxY() - minY();
        if (f > fMaxY) {
            this.g = f - fMaxY;
        } else {
            this.g = 0.0f;
        }
        j();
    }

    public void h() {
        this.c.onChildMeasure(null);
    }
}
