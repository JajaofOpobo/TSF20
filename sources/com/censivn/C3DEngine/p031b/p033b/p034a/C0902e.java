package com.censivn.C3DEngine.p031b.p033b.p034a;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.PositionNumber3d;
import com.censivn.C3DEngine.common.renderer.MatrixStack;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p036d.C0937a;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.tsf.shell.manager.action.C3398f;
import com.tsf.shell.p096f.p118e.C2477c;
import com.tsf.shell.utils.C4189x;
/* renamed from: com.censivn.C3DEngine.b.b.a.e */
/* loaded from: classes.dex */
public class C0902e extends C0980j {

    /* renamed from: a */
    public static final float f2626a = C0892a.m10735b(400.0f);

    /* renamed from: d */
    private C0980j f2629d;

    /* renamed from: i */
    private float f2634i;

    /* renamed from: m */
    private C0975i f2638m;

    /* renamed from: n */
    private C0975i f2639n;

    /* renamed from: s */
    private int f2644s;

    /* renamed from: e */
    private boolean f2630e = false;

    /* renamed from: f */
    private float f2631f = 0.0f;

    /* renamed from: g */
    private float f2632g = 0.0f;

    /* renamed from: h */
    private float f2633h = 0.0f;

    /* renamed from: j */
    private int f2635j = 0;

    /* renamed from: b */
    public boolean f2627b = false;

    /* renamed from: k */
    private boolean f2636k = true;

    /* renamed from: l */
    private boolean f2637l = false;

    /* renamed from: o */
    private boolean f2640o = false;

    /* renamed from: p */
    private float f2641p = 0.0f;

    /* renamed from: q */
    private boolean f2642q = false;

    /* renamed from: r */
    private boolean f2643r = true;

    /* renamed from: c */
    private C0980j f2628c = new C0980j() { // from class: com.censivn.C3DEngine.b.b.a.e.1
        @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
        public void onChildMeasure(C0975i c0975i) {
            m10630a();
        }

        /* renamed from: a */
        private void m10630a() {
            float maxY = maxY() - minY();
            int numChildren = numChildren();
            float f = 0.0f;
            for (int i = 0; i < numChildren; i++) {
                C0975i childAt = getChildAt(i);
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

    /* renamed from: a */
    public C0980j m10672a() {
        return this.f2629d;
    }

    public C0902e() {
        addChild(this.f2628c);
        this.f2634i = C0892a.m10742a(100.0f);
        setMouseEventListener(new C0937a(this) { // from class: com.censivn.C3DEngine.b.b.a.e.2

            /* renamed from: a */
            float f2646a;

            /* renamed from: d */
            private C0937a f2648d;

            /* renamed from: e */
            private boolean f2649e = false;

            /* renamed from: f */
            private boolean f2650f = false;

            /* renamed from: g */
            private boolean f2651g = false;

            /* renamed from: h */
            private boolean f2652h = false;

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: e */
            public void mo1654e(MotionEvent motionEvent) {
                this.f2652h = C0902e.this.f2636k;
                if (this.f2652h) {
                    float[] m601a = C4189x.m601a(motionEvent);
                    this.f2651g = C0902e.this.f2629d.calTouchCollision(m601a[0], m601a[1]);
                    C0975i hittingTarget = C0902e.this.getHittingTarget(m601a[0], m601a[1], true);
                    if (hittingTarget != null && hittingTarget.getMouseEventListener() != null) {
                        this.f2648d = hittingTarget.getMouseEventListener();
                        this.f2648d.mo1654e(motionEvent);
                    }
                    C0902e c0902e = C0902e.this;
                    float f = C0902e.this.f2628c.position().f2527y;
                    this.f2646a = f;
                    c0902e.f2633h = f;
                    C0902e.this.setAnimationObjectState(true);
                    this.f2650f = false;
                    this.f2649e = true;
                    C0902e.this.f2630e = true;
                    C0902e.this.f2641p = 0.0f;
                    C3398f.m2651a();
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: f */
            public void mo1653f(MotionEvent motionEvent) {
                if (this.f2652h) {
                    this.f2649e = true;
                    this.f2650f = false;
                    C0902e.this.f2630e = false;
                    if (C0902e.this.f2637l) {
                        if (C0902e.this.f2628c.position().f2527y < (-C0902e.this.m10650f()) / 2.0f) {
                            C0902e.this.m10644i();
                        } else {
                            C0902e.this.m10656d();
                        }
                    }
                    if (C0902e.this.f2627b && !C0902e.this.f2643r && C0902e.this.f2641p > 1.0f) {
                        C0902e.this.m10631q();
                    }
                    if (this.f2648d != null) {
                        this.f2648d.mo1653f(motionEvent);
                        this.f2648d = null;
                    }
                    C0902e.this.f2641p = 0.0f;
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo2129a(MotionEvent motionEvent, MotionEvent motionEvent2) {
                if (this.f2652h && !C0902e.this.f2637l && this.f2648d != null) {
                    this.f2648d.mo2129a(motionEvent, motionEvent2);
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo502a(MotionEvent motionEvent) {
                if (this.f2652h) {
                    if (this.f2651g && C0902e.this.f2637l) {
                        C0902e.this.m10656d();
                    } else if (this.f2648d != null) {
                        this.f2648d.mo502a(motionEvent);
                    }
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo527a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if (this.f2652h) {
                    if (this.f2649e) {
                        this.f2649e = false;
                        if (Math.abs(f2) > Math.abs(f)) {
                            this.f2650f = true;
                            C0902e.this.m10664b();
                        }
                    }
                    if (!this.f2650f) {
                        if (!C0902e.this.f2637l && this.f2648d != null) {
                            this.f2648d.mo527a(motionEvent, motionEvent2, f, f2);
                            return;
                        }
                        return;
                    }
                    C0902e.this.f2633h = this.f2646a - (motionEvent2.getY() - motionEvent.getY());
                    if (!C0902e.this.f2637l) {
                        C0902e.this.f2633h = C2477c.m5472a(C0902e.this.f2633h, C0902e.this.f2632g, C0902e.this.f2631f, C0902e.f2626a);
                    }
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: b */
            public void mo3209b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if (this.f2652h && this.f2650f) {
                    if (f2 < 0.0f && C0902e.this.f2637l) {
                        C0902e.this.m10656d();
                    }
                    C0902e.this.f2633h = C2477c.m5471b(C0902e.this.f2633h, f2);
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: c */
            public void mo2122c(MotionEvent motionEvent) {
                if (this.f2652h && !C0902e.this.f2637l && this.f2648d != null) {
                    this.f2648d.mo2122c(motionEvent);
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: d */
            public void mo2119d(MotionEvent motionEvent) {
                if (this.f2652h && !C0902e.this.f2637l && this.f2648d != null) {
                    this.f2648d.mo2119d(motionEvent);
                }
            }
        });
    }

    /* renamed from: b */
    public void m10664b() {
    }

    /* renamed from: a */
    public void m10671a(float f) {
        this.f2633h -= f;
        if (this.f2633h < this.f2631f) {
            this.f2633h = this.f2631f;
        }
        setAnimationObjectState(true);
    }

    /* renamed from: b */
    public void m10663b(float f) {
        this.f2633h += f;
        if (this.f2633h > this.f2632g) {
            this.f2633h = this.f2632g;
        }
        setAnimationObjectState(true);
    }

    /* renamed from: c */
    public void m10659c() {
        this.f2637l = true;
        if (this.f2638m != null) {
            this.f2638m.visible(true);
            if (this.f2638m.alpha() != 255.0f) {
                C1017d c1017d = new C1017d();
                c1017d.m10314a(255);
                C1014c.m10326a(this.f2638m);
                C1014c.m10325a(this.f2638m, 500, c1017d);
            }
        }
        m10644i();
        m10636m();
        m10655d(this.f2635j);
        this.f2628c.mouseEnabled(false);
    }

    /* renamed from: d */
    public void m10656d() {
        this.f2637l = false;
        renderChildren(true);
        if (this.f2638m != null && this.f2638m.alpha() != 0.0f) {
            C1017d c1017d = new C1017d() { // from class: com.censivn.C3DEngine.b.b.a.e.3
                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: a */
                public void mo732a() {
                    C0902e.this.f2638m.visible(false);
                }
            };
            c1017d.m10314a(0);
            C1014c.m10326a(this.f2638m);
            C1014c.m10325a(this.f2638m, 500, c1017d);
        }
        setAnimationObjectState(true);
        invalidate();
        m10634n();
        m10652e(this.f2635j);
        this.f2628c.mouseEnabled(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public void m10644i() {
        setAnimationObjectState(true);
        invalidate();
        this.f2633h = m10653e();
    }

    /* renamed from: e */
    public float m10653e() {
        return this.f2635j == 0 ? (-this.f2629d.minY()) + this.f2634i : (-m10650f()) - this.f2634i;
    }

    /* renamed from: f */
    public float m10650f() {
        return maxY() - minY();
    }

    /* renamed from: j */
    private void m10642j() {
        if (this.f2633h > this.f2632g) {
            this.f2633h = this.f2632g;
            setAnimationObjectState(true);
        } else if (this.f2633h < this.f2631f) {
            this.f2633h = this.f2631f;
            setAnimationObjectState(true);
        }
    }

    /* renamed from: a */
    public void m10670a(int i) {
    }

    /* renamed from: a */
    public void m10669a(int i, float f) {
    }

    /* renamed from: b */
    public boolean m10662b(int i) {
        return true;
    }

    /* renamed from: c */
    public void m10658c(int i) {
    }

    /* renamed from: d */
    public void m10655d(int i) {
    }

    /* renamed from: e */
    public void m10652e(int i) {
    }

    /* renamed from: k */
    private void m10640k() {
        float f = 0.0f;
        if (this.f2638m != null) {
            if (this.f2635j == 0) {
                this.f2638m.position().f2527y = (this.f2628c.position().f2527y - this.f2638m.minY()) + this.f2634i;
                return;
            }
            float f2 = -this.f2629d.minY();
            float m10650f = m10650f();
            if (f2 > m10650f) {
                this.f2632g = f2 - m10650f;
            } else {
                this.f2632g = 0.0f;
                f = m10650f - f2;
            }
            this.f2638m.position().f2527y = (((this.f2628c.position().f2527y - f2) - this.f2638m.maxY()) - this.f2634i) - f;
        }
    }

    /* renamed from: l */
    private void m10638l() {
        float f = 0.0f;
        if (this.f2639n != null && this.f2629d != null) {
            if (this.f2635j == 0) {
                if (this.f2628c.position().f2527y < this.f2631f) {
                    this.f2639n.visible(true);
                } else {
                    this.f2639n.visible(false);
                }
                this.f2639n.position().f2527y = this.f2628c.position().f2527y - this.f2639n.minY();
                return;
            }
            if (this.f2628c.position().f2527y > this.f2632g) {
                this.f2639n.visible(true);
            } else {
                this.f2639n.visible(false);
            }
            float f2 = -this.f2629d.minY();
            float m10650f = m10650f();
            if (f2 > m10650f) {
                this.f2632g = f2 - m10650f;
            } else {
                this.f2632g = 0.0f;
                f = m10650f - f2;
            }
            this.f2639n.position().f2527y = ((this.f2628c.position().f2527y - f2) - this.f2639n.maxY()) - f;
        }
    }

    /* renamed from: m */
    private void m10636m() {
        if (this.f2639n != null) {
            this.f2640o = true;
            C1017d c1017d = new C1017d() { // from class: com.censivn.C3DEngine.b.b.a.e.4
                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: a */
                public void mo732a() {
                    if (C0902e.this.f2639n != null) {
                        C0902e.this.f2639n.visible(false);
                    }
                }
            };
            c1017d.m10294l(0.0f);
            c1017d.m10293m(0.0f);
            C1014c.m10326a(this.f2639n);
            C1014c.m10325a(this.f2639n, 500, c1017d);
        }
    }

    /* renamed from: n */
    private void m10634n() {
        if (this.f2639n != null) {
            this.f2640o = false;
            this.f2639n.visible(true);
            C1017d c1017d = new C1017d();
            c1017d.m10294l(1.0f);
            c1017d.m10293m(1.0f);
            C1014c.m10326a(this.f2639n);
            C1014c.m10325a(this.f2639n, 500, c1017d);
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0980j
    public void onDrawChildStart() {
        transferCanvasV(minX(), -C0892a.f2558I, maxX(), C0892a.f2558I);
    }

    /* renamed from: o */
    private void m10633o() {
        this.f2644s = this.f2635j;
        this.f2642q = true;
        this.f2643r = false;
        m10670a(this.f2635j);
    }

    /* renamed from: p */
    private void m10632p() {
        this.f2642q = false;
        this.f2643r = true;
        m10658c(this.f2635j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public void m10631q() {
        this.f2643r = true;
        if (m10662b(this.f2635j)) {
            m10659c();
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
    public void onDrawStart() {
        if (getAnimationObjectState()) {
            float f = this.f2637l ? 100.0f : 255.0f;
            if (this.f2630e) {
                PositionNumber3d position = this.f2628c.position();
                position.f2527y = ((this.f2633h - this.f2628c.position().f2527y) * 0.7f) + position.f2527y;
            } else {
                float f2 = 0.1f;
                boolean z = true;
                if (this.f2637l) {
                    f2 = 0.15f;
                } else if (this.f2628c.position().f2527y > this.f2632g && this.f2633h > this.f2632g) {
                    this.f2633h += (this.f2632g - this.f2633h) * 0.2f;
                    if (Math.abs(this.f2633h - this.f2632g) < 1.0f) {
                        this.f2633h = this.f2632g;
                    } else {
                        z = false;
                    }
                    f2 = 0.15f;
                } else if (this.f2628c.position().f2527y < this.f2631f && this.f2633h < this.f2631f) {
                    this.f2633h += (this.f2631f - this.f2633h) * 0.2f;
                    if (Math.abs(this.f2633h - this.f2631f) < 1.0f) {
                        this.f2633h = this.f2631f;
                    } else {
                        z = false;
                    }
                    f2 = 0.15f;
                }
                PositionNumber3d position2 = this.f2628c.position();
                position2.f2527y = ((this.f2633h - this.f2628c.position().f2527y) * f2) + position2.f2527y;
                float alpha = this.f2628c.alpha();
                if (alpha != f) {
                    this.f2628c.alpha((f2 * (f - alpha)) + alpha);
                }
                if (Math.abs(this.f2628c.alpha() - f) < 1.0f && Math.abs(this.f2628c.position().f2527y - this.f2633h) < 0.15f && z) {
                    this.f2628c.alpha(f);
                    this.f2628c.position().f2527y = this.f2633h;
                    setAnimationObjectState(false);
                    if (this.f2634i <= 0.0f && this.f2637l) {
                        renderChildren(false);
                    }
                }
            }
            if (this.f2627b && !this.f2637l && !this.f2640o) {
                float f3 = this.f2631f - this.f2628c.position().f2527y;
                float f4 = this.f2628c.position().f2527y - this.f2632g;
                if (f3 > 0.0f) {
                    this.f2635j = 0;
                } else {
                    this.f2635j = 1;
                    f3 = f4;
                }
                this.f2641p = (f3 / C2477c.f8158a) * 1.5f;
                if (this.f2641p > 0.0f) {
                    if (this.f2644s != this.f2635j && this.f2642q) {
                        m10632p();
                    }
                    if (this.f2643r) {
                        m10633o();
                    }
                    m10669a(this.f2635j, this.f2641p);
                } else if (this.f2642q) {
                    m10632p();
                }
            }
            if (this.f2627b) {
                m10638l();
                m10640k();
            }
        }
    }

    /* renamed from: a */
    public void m10665a(C0980j c0980j) {
        if (c0980j.parent() != null) {
            c0980j.removeFromParent();
        }
        this.f2629d = c0980j;
        m10648g();
        m10638l();
        this.f2628c.addChild(this.f2629d);
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
    public void onChildMeasure(C0975i c0975i) {
        if (getChildIndexOf(c0975i) != -1) {
            m10648g();
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
    public void setAABBPX(float f, float f2, float f3, float f4, float f5, float f6) {
        super.setAABBPX(f, f2, f3, f4, f5, f6);
        this.f2628c.minY(f2);
        this.f2628c.maxY(f5);
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0980j, com.censivn.C3DEngine.p031b.p038f.C0975i
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
                    C0975i c0975i = children().get(i);
                    onDrawChildStart(c0975i);
                    if (c0975i.getRendererVisibility()) {
                        c0975i.dispatchDraw();
                    }
                    onDrawChildEnd(c0975i);
                }
            }
            onDrawChildEnd();
            MatrixStack.glPopMatrix();
            onDrawEnd();
        }
    }

    /* renamed from: g */
    public void m10648g() {
        float f = -this.f2629d.minY();
        float maxY = maxY() - minY();
        if (f > maxY) {
            this.f2632g = f - maxY;
        } else {
            this.f2632g = 0.0f;
        }
        m10642j();
    }

    /* renamed from: h */
    public void m10646h() {
        this.f2628c.onChildMeasure(null);
    }
}
