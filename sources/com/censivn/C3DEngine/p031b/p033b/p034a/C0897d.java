package com.censivn.C3DEngine.p031b.p033b.p034a;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.PositionNumber3d;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p036d.C0937a;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.tsf.shell.p096f.p118e.C2477c;
import com.tsf.shell.utils.C4189x;
/* renamed from: com.censivn.C3DEngine.b.b.a.d */
/* loaded from: classes.dex */
public class C0897d extends C0980j {

    /* renamed from: a */
    public static final float f2594a = C0892a.m10735b(400.0f);

    /* renamed from: d */
    private C0975i f2597d;

    /* renamed from: i */
    private float f2602i;

    /* renamed from: p */
    private C0975i f2609p;

    /* renamed from: q */
    private C0975i f2610q;

    /* renamed from: v */
    private int f2615v;

    /* renamed from: e */
    private boolean f2598e = false;

    /* renamed from: f */
    private float f2599f = 0.0f;

    /* renamed from: g */
    private float f2600g = 0.0f;

    /* renamed from: h */
    private float f2601h = 0.0f;

    /* renamed from: j */
    private int f2603j = 0;

    /* renamed from: b */
    public boolean f2595b = false;

    /* renamed from: k */
    private boolean f2604k = false;

    /* renamed from: l */
    private float f2605l = 0.0f;

    /* renamed from: m */
    private float f2606m = 0.0f;

    /* renamed from: n */
    private boolean f2607n = true;

    /* renamed from: o */
    private boolean f2608o = false;

    /* renamed from: r */
    private boolean f2611r = false;

    /* renamed from: s */
    private float f2612s = 0.0f;

    /* renamed from: t */
    private boolean f2613t = false;

    /* renamed from: u */
    private boolean f2614u = true;

    /* renamed from: c */
    private C0980j f2596c = new C0980j() { // from class: com.censivn.C3DEngine.b.b.a.d.1
        @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
        public void onChildMeasure(C0975i c0975i) {
            m10673a();
        }

        /* renamed from: a */
        private void m10673a() {
            float maxX = maxX() - minX();
            int numChildren = numChildren();
            float f = 0.0f;
            for (int i = 0; i < numChildren; i++) {
                C0975i childAt = getChildAt(i);
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

    public C0897d() {
        addChild(this.f2596c);
        this.f2602i = C0892a.m10742a(100.0f);
        setMouseEventListener(new C0937a(this) { // from class: com.censivn.C3DEngine.b.b.a.d.2

            /* renamed from: a */
            float f2617a;

            /* renamed from: d */
            private C0937a f2619d;

            /* renamed from: e */
            private boolean f2620e = false;

            /* renamed from: f */
            private boolean f2621f = false;

            /* renamed from: g */
            private boolean f2622g = false;

            /* renamed from: h */
            private boolean f2623h = false;

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: e */
            public void mo1654e(MotionEvent motionEvent) {
                this.f2623h = C0897d.this.f2607n;
                if (this.f2623h) {
                    float[] m601a = C4189x.m601a(motionEvent);
                    this.f2622g = C0897d.this.f2597d.calTouchCollision(m601a[0], m601a[1]);
                    C0975i hittingTarget = C0897d.this.getHittingTarget(m601a[0], m601a[1], true);
                    if (hittingTarget != null && hittingTarget.getMouseEventListener() != null) {
                        this.f2619d = hittingTarget.getMouseEventListener();
                        this.f2619d.mo1654e(motionEvent);
                    }
                    C0897d c0897d = C0897d.this;
                    float f = C0897d.this.f2596c.position().f2526x;
                    this.f2617a = f;
                    c0897d.f2601h = f;
                    C0897d.this.setAnimationObjectState(true);
                    this.f2621f = false;
                    this.f2620e = true;
                    C0897d.this.f2598e = true;
                    C0897d.this.f2612s = 0.0f;
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: f */
            public void mo1653f(MotionEvent motionEvent) {
                if (this.f2623h) {
                    this.f2620e = true;
                    this.f2621f = false;
                    C0897d.this.f2598e = false;
                    if (C0897d.this.f2608o) {
                        if (C0897d.this.f2596c.position().f2526x > C0897d.this.m10691i() / 2.0f) {
                            C0897d.this.m10685l();
                        } else {
                            C0897d.this.m10695g();
                        }
                    }
                    if (C0897d.this.f2595b && !C0897d.this.f2614u && C0897d.this.f2612s > 1.0f) {
                        C0897d.this.m10674u();
                    }
                    if (this.f2619d != null) {
                        this.f2619d.mo1653f(motionEvent);
                        this.f2619d = null;
                    }
                    C0897d.this.f2612s = 0.0f;
                    C0897d.this.f2601h = C0897d.this.m10721a(C0897d.this.f2601h);
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo2129a(MotionEvent motionEvent, MotionEvent motionEvent2) {
                if (this.f2623h && !C0897d.this.f2608o && this.f2619d != null) {
                    this.f2619d.mo2129a(motionEvent, motionEvent2);
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo502a(MotionEvent motionEvent) {
                if (this.f2623h) {
                    if (this.f2622g && C0897d.this.f2608o) {
                        C0897d.this.m10695g();
                    } else if (this.f2619d != null) {
                        this.f2619d.mo502a(motionEvent);
                    }
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo527a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if (this.f2623h) {
                    if (this.f2620e) {
                        this.f2620e = false;
                        if (Math.abs(f) > Math.abs(f2)) {
                            this.f2621f = true;
                            C0897d.this.mo736a();
                        }
                    }
                    if (!this.f2621f) {
                        if (!C0897d.this.f2608o && this.f2619d != null) {
                            this.f2619d.mo527a(motionEvent, motionEvent2, f, f2);
                            return;
                        }
                        return;
                    }
                    C0897d.this.f2601h = this.f2617a + (motionEvent2.getX() - motionEvent.getX());
                    if (!C0897d.this.f2608o) {
                        C0897d.this.f2601h = C2477c.m5472a(C0897d.this.f2601h, C0897d.this.f2600g, C0897d.this.f2599f, C0897d.f2594a);
                    }
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: b */
            public void mo3209b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if (this.f2623h && this.f2621f) {
                    if (f < 0.0f && C0897d.this.f2608o) {
                        C0897d.this.m10695g();
                    }
                    C0897d.this.f2601h = C2477c.m5474a(C0897d.this.f2601h, f);
                }
            }
        });
    }

    /* renamed from: a */
    public float m10721a(float f) {
        float m10691i = m10691i() / 2.0f;
        if (f > this.f2600g) {
            mo735b((this.f2600g - m10691i) - m10713b());
            return f;
        } else if (f < this.f2599f) {
            mo735b((this.f2599f - m10691i) + m10708c());
            return f;
        } else {
            float m10713b = m10691i + m10713b();
            return m10713b + mo735b(f - m10713b);
        }
    }

    /* renamed from: a */
    public void mo736a() {
    }

    /* renamed from: b */
    public float mo735b(float f) {
        return f;
    }

    /* renamed from: a */
    public void m10714a(boolean z) {
        this.f2595b = z;
    }

    /* renamed from: b */
    public void m10709b(boolean z) {
        this.f2604k = z;
    }

    /* renamed from: c */
    public void m10707c(float f) {
        this.f2605l = f;
    }

    /* renamed from: b */
    public float m10713b() {
        return this.f2605l;
    }

    /* renamed from: c */
    public float m10708c() {
        return this.f2606m;
    }

    /* renamed from: d */
    public void m10702d(float f) {
        this.f2606m = f;
    }

    /* renamed from: d */
    public void m10703d() {
        this.f2607n = false;
    }

    /* renamed from: e */
    public void m10700e() {
        this.f2607n = true;
    }

    /* renamed from: e */
    public void m10699e(float f) {
        this.f2602i = f;
    }

    /* renamed from: f */
    public void m10697f() {
        this.f2608o = true;
        if (this.f2609p != null) {
            this.f2609p.visible(true);
            if (this.f2609p.alpha() != 255.0f) {
                C1017d c1017d = new C1017d();
                c1017d.m10314a(255);
                C1014c.m10326a(this.f2609p);
                C1014c.m10325a(this.f2609p, 500, c1017d);
            }
        }
        m10685l();
        m10678q();
        mo729d(this.f2603j);
        this.f2596c.mouseEnabled(false);
    }

    /* renamed from: g */
    public void m10695g() {
        this.f2608o = false;
        renderChildren(true);
        if (this.f2609p != null && this.f2609p.alpha() != 0.0f) {
            C1017d c1017d = new C1017d() { // from class: com.censivn.C3DEngine.b.b.a.d.3
                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: a */
                public void mo732a() {
                    C0897d.this.f2609p.visible(false);
                }
            };
            c1017d.m10314a(0);
            C1014c.m10326a(this.f2609p);
            C1014c.m10325a(this.f2609p, 500, c1017d);
        }
        setAnimationObjectState(true);
        invalidate();
        m10677r();
        mo728e(this.f2603j);
        this.f2596c.mouseEnabled(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public void m10685l() {
        setAnimationObjectState(true);
        invalidate();
        this.f2601h = m10693h();
    }

    /* renamed from: m */
    private void m10683m() {
        setAnimationObjectState(true);
        invalidate();
        this.f2601h = 0.0f;
    }

    /* renamed from: h */
    public float m10693h() {
        return this.f2603j == 0 ? m10691i() - this.f2602i : (-this.f2597d.maxX()) + this.f2602i;
    }

    /* renamed from: i */
    public float m10691i() {
        return maxX() - minX();
    }

    /* renamed from: n */
    private void m10681n() {
        if (this.f2601h > this.f2600g) {
            this.f2601h = this.f2600g;
            setAnimationObjectState(true);
        } else if (this.f2601h < this.f2599f) {
            this.f2601h = this.f2599f;
            setAnimationObjectState(true);
        }
    }

    /* renamed from: a */
    public void m10719a(float f, boolean z) {
        if (z) {
            this.f2601h = f;
            return;
        }
        PositionNumber3d position = this.f2596c.position();
        this.f2601h = f;
        position.f2526x = f;
    }

    /* renamed from: a */
    public void mo3771a(int i) {
    }

    /* renamed from: a */
    public void mo730a(int i, float f) {
    }

    /* renamed from: b */
    public boolean mo3770b(int i) {
        return true;
    }

    /* renamed from: c */
    public void m10706c(int i) {
    }

    /* renamed from: d */
    public void mo729d(int i) {
    }

    /* renamed from: e */
    public void mo728e(int i) {
    }

    /* renamed from: a */
    public void m10715a(C0975i c0975i) {
        m10714a(true);
        if (this.f2609p != null) {
            this.f2609p.removeFromParent();
        }
        this.f2609p = c0975i;
        this.f2609p.visible(false);
        addChild(this.f2609p);
        m10680o();
    }

    /* renamed from: o */
    private void m10680o() {
        float f = 0.0f;
        if (this.f2609p != null) {
            if (this.f2603j == 0) {
                this.f2609p.position().f2526x = (this.f2596c.position().f2526x - this.f2609p.maxX()) + this.f2602i;
                return;
            }
            float maxX = this.f2597d.maxX();
            float m10691i = m10691i();
            if (maxX > m10691i) {
                this.f2599f = -(maxX - m10691i);
            } else {
                this.f2599f = 0.0f;
                f = m10691i - maxX;
            }
            this.f2609p.position().f2526x = f + (((maxX + this.f2596c.position().f2526x) - this.f2609p.minX()) - this.f2602i);
        }
    }

    /* renamed from: b */
    public void m10710b(C0975i c0975i) {
        m10714a(true);
        if (this.f2610q != null) {
            this.f2610q.removeFromParent();
        }
        this.f2610q = c0975i;
        addChild(this.f2610q);
        m10679p();
    }

    /* renamed from: p */
    private void m10679p() {
        float f = 0.0f;
        if (this.f2610q != null && this.f2597d != null) {
            if (this.f2603j == 0) {
                if (this.f2596c.position().f2526x > 0.0f) {
                    this.f2610q.visible(true);
                } else {
                    this.f2610q.visible(false);
                }
                this.f2610q.position().f2526x = this.f2596c.position().f2526x - this.f2610q.maxX();
                return;
            }
            if (this.f2596c.position().f2526x < this.f2599f) {
                this.f2610q.visible(true);
            } else {
                this.f2610q.visible(false);
            }
            float maxX = this.f2597d.maxX();
            float m10691i = m10691i();
            if (maxX > m10691i) {
                this.f2599f = -(maxX - m10691i);
            } else {
                this.f2599f = 0.0f;
                f = m10691i - maxX;
            }
            this.f2610q.position().f2526x = f + maxX + this.f2596c.position().f2526x + this.f2610q.maxX();
        }
    }

    /* renamed from: q */
    private void m10678q() {
        if (this.f2610q != null) {
            this.f2611r = true;
            C1017d c1017d = new C1017d() { // from class: com.censivn.C3DEngine.b.b.a.d.4
                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: a */
                public void mo732a() {
                    if (C0897d.this.f2610q != null) {
                        C0897d.this.f2610q.visible(false);
                    }
                }
            };
            c1017d.m10294l(0.0f);
            c1017d.m10293m(0.0f);
            C1014c.m10326a(this.f2610q);
            C1014c.m10325a(this.f2610q, 500, c1017d);
        }
    }

    /* renamed from: r */
    private void m10677r() {
        if (this.f2610q != null) {
            this.f2611r = false;
            this.f2610q.visible(true);
            C1017d c1017d = new C1017d();
            c1017d.m10294l(1.0f);
            c1017d.m10293m(1.0f);
            C1014c.m10326a(this.f2610q);
            C1014c.m10325a(this.f2610q, 500, c1017d);
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0980j
    public void onDrawChildStart() {
        transferCanvas(C0892a.f2590z, C0892a.f2552C, C0892a.f2550A, C0892a.f2551B);
    }

    /* renamed from: s */
    private void m10676s() {
        this.f2615v = this.f2603j;
        this.f2613t = true;
        this.f2614u = false;
        mo3771a(this.f2603j);
    }

    /* renamed from: t */
    private void m10675t() {
        this.f2613t = false;
        this.f2614u = true;
        m10706c(this.f2603j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public void m10674u() {
        this.f2614u = true;
        if (mo3770b(this.f2603j)) {
            m10697f();
        }
    }

    /* renamed from: a */
    public void m10720a(float f, float f2, float f3, float f4) {
        if (this.f2608o) {
            m10685l();
        } else {
            m10683m();
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
    public void onDrawStart() {
        if (getAnimationObjectState()) {
            float f = this.f2608o ? 100.0f : 255.0f;
            if (this.f2598e) {
                PositionNumber3d position = this.f2596c.position();
                position.f2526x = ((this.f2601h - this.f2596c.position().f2526x) * 0.7f) + position.f2526x;
            } else {
                float f2 = 0.1f;
                boolean z = true;
                if (this.f2608o) {
                    f2 = 0.15f;
                } else if (this.f2596c.position().f2526x > this.f2600g && this.f2601h > this.f2600g) {
                    this.f2601h += (this.f2600g - this.f2601h) * 0.2f;
                    if (Math.abs(this.f2601h - this.f2600g) < 1.0f) {
                        this.f2601h = this.f2600g;
                    } else {
                        z = false;
                    }
                    f2 = 0.15f;
                } else if (this.f2596c.position().f2526x < this.f2599f && this.f2601h < this.f2599f) {
                    this.f2601h += (this.f2599f - this.f2601h) * 0.2f;
                    if (Math.abs(this.f2601h - this.f2599f) < 1.0f) {
                        this.f2601h = this.f2599f;
                    } else {
                        z = false;
                    }
                    f2 = 0.15f;
                }
                PositionNumber3d position2 = this.f2596c.position();
                position2.f2526x = ((this.f2601h - this.f2596c.position().f2526x) * f2) + position2.f2526x;
                float alpha = this.f2596c.alpha();
                if (alpha != f) {
                    this.f2596c.alpha((f2 * (f - alpha)) + alpha);
                }
                if (Math.abs(this.f2596c.alpha() - f) < 1.0f && Math.abs(this.f2596c.position().f2526x - this.f2601h) < 0.15f && z) {
                    this.f2596c.alpha(f);
                    this.f2596c.position().f2526x = this.f2601h;
                    setAnimationObjectState(false);
                    if (this.f2602i <= 0.0f && this.f2608o) {
                        renderChildren(false);
                    }
                }
            }
            if (this.f2595b && !this.f2608o && !this.f2611r) {
                float f3 = this.f2596c.position().f2526x - this.f2600g;
                float f4 = this.f2599f - this.f2596c.position().f2526x;
                if (f3 > 0.0f) {
                    this.f2603j = 0;
                } else {
                    this.f2603j = 1;
                    f3 = f4;
                }
                this.f2612s = (f3 / C2477c.f8158a) * 1.5f;
                if (this.f2612s > 0.0f) {
                    if (this.f2615v != this.f2603j && this.f2613t) {
                        m10675t();
                    }
                    if (this.f2614u) {
                        m10676s();
                    }
                    mo730a(this.f2603j, this.f2612s);
                } else if (this.f2613t) {
                    m10675t();
                }
            }
            if (this.f2595b) {
                m10679p();
                m10680o();
            }
        }
    }

    /* renamed from: j */
    public void m10689j() {
        PositionNumber3d position = this.f2596c.position();
        float f = this.f2600g;
        position.f2526x = f;
        this.f2601h = f;
    }

    /* renamed from: c */
    public void m10704c(C0975i c0975i) {
        if (this.f2597d != null) {
        }
        if (c0975i.parent() != null) {
            c0975i.removeFromParent();
        }
        this.f2597d = c0975i;
        m10687k();
        m10679p();
        this.f2596c.addChild(this.f2597d);
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
    public void onChildMeasure(C0975i c0975i) {
        if (getChildIndexOf(c0975i) != -1) {
            m10687k();
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
    public void setAABBPX(float f, float f2, float f3, float f4, float f5, float f6) {
        super.setAABBPX(f, f2, f3, f4, f5, f6);
        this.f2596c.minY(f2);
        this.f2596c.maxY(f5);
    }

    /* renamed from: k */
    public void m10687k() {
        float maxX = this.f2597d.maxX();
        float maxX2 = maxX() - minX();
        if (!this.f2604k) {
            if (maxX > maxX2) {
                this.f2600g = 0.0f;
                this.f2599f = -(maxX - maxX2);
            } else if (this.f2595b) {
                this.f2600g = 0.0f;
                this.f2599f = 0.0f;
            } else {
                float f = (maxX2 - maxX) / 2.0f;
                this.f2599f = f;
                this.f2600g = f;
            }
        } else {
            this.f2599f = (-maxX) + (maxX2 / 2.0f);
            this.f2600g = maxX2 / 2.0f;
        }
        this.f2599f += this.f2606m;
        this.f2600g += this.f2605l;
        m10681n();
    }
}
