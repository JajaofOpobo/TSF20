package com.censivn.C3DEngine.b.b.a;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.PositionNumber3d;
import com.censivn.C3DEngine.b.f.IRenderable;
import com.censivn.C3DEngine.b.f.BaseRenderable;
import com.tsf.shell.utils.GraphicsEngineBridge;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class VerticalPageRenderer extends BaseRenderable {
    public static final float a = com.censivn.C3DEngine.b.b.ScreenConstants.b(400.0f);
    private IRenderable d;
    private float i;
    private IRenderable p;
    private IRenderable q;
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
    private BaseRenderable c = new BaseRenderable() { // from class: com.censivn.C3DEngine.b.b.ScreenConstants.d.1
        @Override // com.censivn.C3DEngine.b.f.IRenderable
        public void onChildMeasure(i iVar) {
            a();
        }

        private void a() {
            float fMaxX = maxX() - minX();
            int iNumChildren = numChildren();
            float fMaxX2 = 0.0f;
            for (int i = 0; i < iNumChildren; i++) {
                i childAt = getChildAt(i);
                if (childAt.visible()) {
                    fMaxX2 += childAt.maxX() - childAt.minX();
                }
            }
            if (fMaxX != fMaxX2) {
                maxX(fMaxX2);
                notifLayoutRefresh();
            }
        }
    };

    public VerticalPageRenderer() {
        addChild(this.c);
        this.i = com.censivn.C3DEngine.b.b.ScreenConstants.a(100.0f);
        setMouseEventListener(new com.censivn.C3DEngine.b.d.MouseEventListener(this) { // from class: com.censivn.C3DEngine.b.b.ScreenConstants.d.2
            float a;
            private com.censivn.C3DEngine.b.d.MouseEventListener d;
            private boolean e = false;
            private boolean f = false;
            private boolean g = false;
            private boolean h = false;

            @Override // com.censivn.C3DEngine.b.d.MouseEventListener
            public void e(MotionEvent motionEvent) {
                this.h = VerticalPageRenderer.this.n;
                if (this.h) {
                    float[] fArrA = x.a(motionEvent);
                    this.g = VerticalPageRenderer.this.d.calTouchCollision(fArrA[0], fArrA[1]);
                    i hittingTarget = VerticalPageRenderer.this.getHittingTarget(fArrA[0], fArrA[1], true);
                    if (hittingTarget != null && hittingTarget.getMouseEventListener() != null) {
                        this.d = hittingTarget.getMouseEventListener();
                        this.d.e(motionEvent);
                    }
                    VerticalPageRenderer dVar = VerticalPageRenderer.this;
                    float f = VerticalPageRenderer.this.c.position().x;
                    this.a = f;
                    dVar.h = f;
                    VerticalPageRenderer.this.setAnimationObjectState(true);
                    this.f = false;
                    this.e = true;
                    VerticalPageRenderer.this.e = true;
                    VerticalPageRenderer.this.s = 0.0f;
                }
            }

            @Override // com.censivn.C3DEngine.b.d.MouseEventListener
            public void f(MotionEvent motionEvent) {
                if (this.h) {
                    this.e = true;
                    this.f = false;
                    VerticalPageRenderer.this.e = false;
                    if (VerticalPageRenderer.this.o) {
                        if (VerticalPageRenderer.this.c.position().x > VerticalPageRenderer.this.i() / 2.0f) {
                            VerticalPageRenderer.this.l();
                        } else {
                            VerticalPageRenderer.this.g();
                        }
                    }
                    if (VerticalPageRenderer.this.b && !VerticalPageRenderer.this.u && VerticalPageRenderer.this.s > 1.0f) {
                        VerticalPageRenderer.this.u();
                    }
                    if (this.d != null) {
                        this.d.f(motionEvent);
                        this.d = null;
                    }
                    VerticalPageRenderer.this.s = 0.0f;
                    VerticalPageRenderer.this.h = VerticalPageRenderer.this.a(VerticalPageRenderer.this.h);
                }
            }

            @Override // com.censivn.C3DEngine.b.d.MouseEventListener
            public void a(MotionEvent motionEvent, MotionEvent motionEvent2) {
                if (this.h && !VerticalPageRenderer.this.o && this.d != null) {
                    this.d.a(motionEvent, motionEvent2);
                }
            }

            @Override // com.censivn.C3DEngine.b.d.MouseEventListener
            public void a(MotionEvent motionEvent) {
                if (this.h) {
                    if (this.g && VerticalPageRenderer.this.o) {
                        VerticalPageRenderer.this.g();
                    } else if (this.d != null) {
                        this.d.a(motionEvent);
                    }
                }
            }

            @Override // com.censivn.C3DEngine.b.d.MouseEventListener
            public void a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if (this.h) {
                    if (this.e) {
                        this.e = false;
                        if (Math.abs(f) > Math.abs(f2)) {
                            this.f = true;
                            VerticalPageRenderer.this.a();
                        }
                    }
                    if (!this.f) {
                        if (!VerticalPageRenderer.this.o && this.d != null) {
                            this.d.a(motionEvent, motionEvent2, f, f2);
                            return;
                        }
                        return;
                    }
                    VerticalPageRenderer.this.h = this.a + (motionEvent2.getX() - motionEvent.getX());
                    if (!VerticalPageRenderer.this.o) {
                        VerticalPageRenderer.this.h = com.tsf.shell.f.e.SpringEasing.a(VerticalPageRenderer.this.h, VerticalPageRenderer.this.g, VerticalPageRenderer.this.f, d.a);
                    }
                }
            }

            @Override // com.censivn.C3DEngine.b.d.MouseEventListener
            public void b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if (this.h && this.f) {
                    if (f < 0.0f && VerticalPageRenderer.this.o) {
                        VerticalPageRenderer.this.g();
                    }
                    VerticalPageRenderer.this.h = com.tsf.shell.f.e.SpringEasing.a(VerticalPageRenderer.this.h, f);
                }
            }
        });
    }

    public float a(float f) {
        float fI = i() / 2.0f;
        if (f > this.g) {
            b((this.g - fI) - b());
            return f;
        }
        if (f < this.f) {
            b((this.f - fI) + c());
            return f;
        }
        float fB = fI + b();
        return fB + b(f - fB);
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
                com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams();
                dVar.a(255);
                com.censivn.C3DEngine.b.g.TweenUtils.a(this.p);
                com.censivn.C3DEngine.b.g.TweenUtils.a(this.p, 500, dVar);
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
            com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams() { // from class: com.censivn.C3DEngine.b.b.ScreenConstants.d.3
                @Override // com.censivn.C3DEngine.b.g.TweenParams
                public void a() {
                    VerticalPageRenderer.this.p.visible(false);
                }
            };
            dVar.a(0);
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.p);
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.p, 500, dVar);
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
        PositionNumber3d positionNumber3dPosition = this.c.position();
        this.h = f;
        positionNumber3dPosition.x = f;
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
            float fMaxX = this.d.maxX();
            float fI = i();
            if (fMaxX > fI) {
                this.f = -(fMaxX - fI);
            } else {
                this.f = 0.0f;
                f = fI - fMaxX;
            }
            this.p.position().x = f + (((fMaxX + this.c.position().x) - this.p.minX()) - this.i);
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
            float fMaxX = this.d.maxX();
            float fI = i();
            if (fMaxX > fI) {
                this.f = -(fMaxX - fI);
            } else {
                this.f = 0.0f;
                f = fI - fMaxX;
            }
            this.q.position().x = f + fMaxX + this.c.position().x + this.q.maxX();
        }
    }

    private void q() {
        if (this.q != null) {
            this.r = true;
            com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams() { // from class: com.censivn.C3DEngine.b.b.ScreenConstants.d.4
                @Override // com.censivn.C3DEngine.b.g.TweenParams
                public void a() {
                    if (VerticalPageRenderer.this.q != null) {
                        VerticalPageRenderer.this.q.visible(false);
                    }
                }
            };
            dVar.l(0.0f);
            dVar.m(0.0f);
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.q);
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.q, 500, dVar);
        }
    }

    private void r() {
        if (this.q != null) {
            this.r = false;
            this.q.visible(true);
            com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams();
            dVar.l(1.0f);
            dVar.m(1.0f);
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.q);
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.q, 500, dVar);
        }
    }

    @Override // com.censivn.C3DEngine.b.f.BaseRenderable
    public void onDrawChildStart() {
        transferCanvas(com.censivn.C3DEngine.b.b.ScreenConstants.z, com.censivn.C3DEngine.b.b.ScreenConstants.C, com.censivn.C3DEngine.b.b.ScreenConstants.A, com.censivn.C3DEngine.b.b.ScreenConstants.B);
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

    @Override // com.censivn.C3DEngine.b.f.IRenderable
    public void onDrawStart() {
        if (getAnimationObjectState()) {
            float f = this.o ? 100.0f : 255.0f;
            if (this.e) {
                float f2 = (this.h - this.c.position().x) * 0.7f;
                PositionNumber3d positionNumber3dPosition = this.c.position();
                positionNumber3dPosition.x = f2 + positionNumber3dPosition.x;
            } else {
                float f3 = 0.1f;
                boolean z = true;
                if (this.o) {
                    f3 = 0.15f;
                } else if (this.c.position().x > this.g && this.h > this.g) {
                    this.h += (this.g - this.h) * 0.2f;
                    if (Math.abs(this.h - this.g) < 1.0f) {
                        this.h = this.g;
                    } else {
                        z = false;
                    }
                    f3 = 0.15f;
                } else if (this.c.position().x < this.f && this.h < this.f) {
                    this.h += (this.f - this.h) * 0.2f;
                    if (Math.abs(this.h - this.f) < 1.0f) {
                        this.h = this.f;
                    } else {
                        z = false;
                    }
                    f3 = 0.15f;
                }
                float f4 = (this.h - this.c.position().x) * f3;
                PositionNumber3d positionNumber3dPosition2 = this.c.position();
                positionNumber3dPosition2.x = f4 + positionNumber3dPosition2.x;
                float fAlpha = this.c.alpha();
                if (fAlpha != f) {
                    this.c.alpha((f3 * (f - fAlpha)) + fAlpha);
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
                float f5 = this.c.position().x - this.g;
                float f6 = this.f - this.c.position().x;
                if (f5 > 0.0f) {
                    this.j = 0;
                } else {
                    this.j = 1;
                    f5 = f6;
                }
                this.s = (f5 / com.tsf.shell.f.e.SpringEasing.a) * 1.5f;
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
        PositionNumber3d positionNumber3dPosition = this.c.position();
        float f = this.g;
        positionNumber3dPosition.x = f;
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

    @Override // com.censivn.C3DEngine.b.f.IRenderable
    public void onChildMeasure(i iVar) {
        if (getChildIndexOf(iVar) != -1) {
            k();
        }
    }

    @Override // com.censivn.C3DEngine.b.f.IRenderable
    public void setAABBPX(float f, float f2, float f3, float f4, float f5, float f6) {
        super.setAABBPX(f, f2, f3, f4, f5, f6);
        this.c.minY(f2);
        this.c.maxY(f5);
    }

    public void k() {
        float fMaxX = this.d.maxX();
        float fMaxX2 = maxX() - minX();
        if (this.k) {
            this.f = (-fMaxX) + (fMaxX2 / 2.0f);
            this.g = fMaxX2 / 2.0f;
        } else if (fMaxX > fMaxX2) {
            this.g = 0.0f;
            this.f = -(fMaxX - fMaxX2);
        } else if (this.b) {
            this.g = 0.0f;
            this.f = 0.0f;
        } else {
            float f = (fMaxX2 - fMaxX) / 2.0f;
            this.f = f;
            this.g = f;
        }
        this.f += this.m;
        this.g += this.l;
        n();
    }
}
