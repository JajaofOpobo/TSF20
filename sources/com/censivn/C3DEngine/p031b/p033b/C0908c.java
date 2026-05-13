package com.censivn.C3DEngine.p031b.p033b;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.common.renderer.MatrixStack;
import com.censivn.C3DEngine.p031b.p036d.C0937a;
import com.censivn.C3DEngine.p031b.p037e.AbstractC0951f;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.censivn.C3DEngine.p031b.p041g.C0986a;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.tsf.shell.utils.C4189x;
/* renamed from: com.censivn.C3DEngine.b.b.c */
/* loaded from: classes.dex */
public class C0908c extends C0980j {

    /* renamed from: a */
    private int f2667a;

    /* renamed from: b */
    private int f2668b;

    /* renamed from: d */
    private int f2670d;

    /* renamed from: f */
    private C0981k f2672f;

    /* renamed from: i */
    private C0937a f2675i;

    /* renamed from: j */
    private C0975i f2676j;

    /* renamed from: c */
    private float f2669c = 0.0f;

    /* renamed from: e */
    private boolean f2671e = false;

    /* renamed from: g */
    private int f2673g = 0;

    /* renamed from: k */
    private Number3d f2677k = new Number3d();

    /* renamed from: h */
    private C0907b f2674h = new C0907b();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public AbstractC0951f m10623a(C0975i c0975i) {
        if ((c0975i instanceof AbstractC0951f) && c0975i.parent() != null && c0975i.parent() == this) {
            return (AbstractC0951f) c0975i;
        }
        if (c0975i.parent() != null && (c0975i.parent() instanceof C0975i)) {
            return m10623a((C0975i) c0975i.parent());
        }
        return null;
    }

    public C0908c() {
        setLayoutParams(this.f2674h);
        this.f2670d = (int) C0892a.m10742a(4.0f);
        this.f2672f = new C0981k(this.f2667a, this.f2670d, false);
        this.f2672f.setDefaultColor(new Color4(255, 255, 255, 70));
        this.f2672f.useVBO(false);
        this.f2675i = new C0937a(this) { // from class: com.censivn.C3DEngine.b.b.c.1

            /* renamed from: b */
            private C0937a f2679b;

            /* renamed from: d */
            private C0975i f2680d;

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: e */
            public void mo1654e(MotionEvent motionEvent) {
                float[] m601a = C4189x.m601a(motionEvent);
                this.f2680d = C0908c.this.getHittingTarget(m601a[0], m601a[1], true);
                if (this.f2680d != null && this.f2680d.getMouseEventListener() != null) {
                    this.f2679b = this.f2680d.getMouseEventListener();
                    this.f2679b.mo1654e(motionEvent);
                    AbstractC0951f m10623a = C0908c.this.m10623a(this.f2680d);
                    if (m10623a != null && m10623a.m10493k()) {
                        C0908c.this.m10618b(this.f2680d);
                    }
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: f */
            public void mo1653f(MotionEvent motionEvent) {
                if (this.f2679b != null) {
                    this.f2679b.mo1653f(motionEvent);
                    this.f2679b = null;
                    C0908c.this.m10614e();
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo2129a(MotionEvent motionEvent, MotionEvent motionEvent2) {
                if (this.f2679b != null) {
                    this.f2679b.mo2129a(motionEvent, motionEvent2);
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo502a(MotionEvent motionEvent) {
                if (this.f2679b != null) {
                    this.f2679b.mo502a(motionEvent);
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo527a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if (this.f2679b != null) {
                    this.f2679b.mo527a(motionEvent, motionEvent2, f, f2);
                }
                C0908c.this.m10614e();
            }
        };
        setMouseEventListener(this.f2675i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m10618b(C0975i c0975i) {
        if (this.f2676j != null) {
            m10614e();
        }
        this.f2676j = c0975i;
        C1017d c1017d = new C1017d();
        c1017d.m10294l(0.95f);
        c1017d.m10293m(0.95f);
        c1017d.m10313a(C0986a.f2950e);
        C1014c.m10326a(c0975i);
        C1014c.m10325a(c0975i, 500, c1017d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public void m10614e() {
        if (this.f2676j != null) {
            C1017d c1017d = new C1017d();
            c1017d.m10294l(1.0f);
            c1017d.m10293m(1.0f);
            c1017d.m10313a(C0986a.f2950e);
            C1014c.m10326a(this.f2676j);
            C1014c.m10325a(this.f2676j, 500, c1017d);
            this.f2676j = null;
        }
    }

    /* renamed from: a */
    public void m10622a(boolean z) {
        getLayoutParams().f2666l = z;
    }

    /* renamed from: a */
    public int m10629a() {
        return this.f2667a;
    }

    /* renamed from: b */
    public int m10621b() {
        return this.f2668b;
    }

    /* renamed from: a */
    public void m10628a(int i) {
        this.f2673g = i;
    }

    /* renamed from: b */
    public void m10617b(boolean z) {
        this.f2671e = z;
        mo4847d();
    }

    /* renamed from: c */
    public void m10616c() {
        int i;
        C1017d c1017d;
        mouseEnabled(false);
        int numChildren = numChildren();
        int i2 = 0;
        int i3 = 0;
        while (i2 < numChildren) {
            C0975i childAt = getChildAt(i2);
            C0907b layoutParams = childAt.getLayoutParams();
            if (!childAt.visible()) {
                i = i3;
            } else if (layoutParams == null) {
                i = i3;
            } else {
                childAt.alpha(0.0f);
                childAt.position().f2527y = layoutParams.f2661g - C0892a.m10742a(500.0f);
                if (i2 == numChildren - 1) {
                    c1017d = new C1017d() { // from class: com.censivn.C3DEngine.b.b.c.2
                        @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                        /* renamed from: a */
                        public void mo732a() {
                            C0908c.this.mouseEnabled(true);
                        }
                    };
                } else {
                    c1017d = new C1017d();
                }
                c1017d.mo10298h(layoutParams.f2661g);
                c1017d.m10313a(C0986a.f2959n);
                c1017d.m10309b(i3 * 60);
                c1017d.m10314a(255);
                C1014c.m10326a(childAt);
                C1014c.m10325a(childAt, 1000, c1017d);
                i = i3 + 1;
            }
            i2++;
            i3 = i;
        }
    }

    /* renamed from: b */
    public void m10620b(int i) {
        this.f2667a = (int) ((i - this.f2674h.f2657c) - this.f2674h.f2658d);
        this.f2674h.f2659e = this.f2667a;
        mo544c(this.f2667a);
        minX((-this.f2667a) / 2.0f);
        maxX(this.f2667a / 2.0f);
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
    public void onChildMeasure(C0975i c0975i) {
    }

    /* renamed from: c */
    public void mo544c(int i) {
    }

    /* renamed from: d */
    public void m10615d(int i) {
        if (i != 0) {
            this.f2668b = i;
            this.f2674h.f2660f = this.f2668b;
            mo824e(this.f2668b);
            minY(-this.f2668b);
            maxY(0.0f);
            notifLayoutRefresh();
        }
    }

    /* renamed from: e */
    public void mo824e(int i) {
    }

    /* renamed from: a */
    public void m10627a(int i, int i2) {
        m10620b(i);
        int size = children().size();
        for (int i3 = 0; i3 < size; i3++) {
            C0975i childAt = getChildAt(i3);
            if (childAt instanceof C0908c) {
                ((C0908c) childAt).m10627a(this.f2667a, 0);
            }
        }
        mo4847d();
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
    public boolean calTouchCollision(float f, float f2) {
        return super.calTouchCollision(f, f2);
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0980j, com.censivn.C3DEngine.p031b.p038f.C0975i
    public void dispatchDraw() {
        if (visible()) {
            onDrawStart();
            MatrixStack.glPushMatrix();
            draw();
            MatrixStack.glColor(alpha(), getDefaultColor());
            onDrawChildStart();
            this.f2677k.reset();
            localToGlobal(this.f2677k);
            if (renderChildren()) {
                int size = children().size();
                for (int i = 0; i < size; i++) {
                    C0975i childAt = getChildAt(i);
                    C0907b layoutParams = childAt.getLayoutParams();
                    if (!childAt.visible() || layoutParams == null) {
                        onDrawChildStart(childAt);
                        childAt.dispatchDraw();
                        onDrawChildEnd(childAt);
                    } else if (m10626a(this.f2677k, childAt)) {
                        childAt.setRendererVisibility(true);
                        onDrawChildStart(childAt);
                        childAt.dispatchDraw();
                        onDrawChildEnd(childAt);
                        if (this.f2671e && i != size - 1 && !layoutParams.f2666l) {
                            this.f2672f.position().f2527y = ((childAt.position().f2527y + layoutParams.f2663i) - layoutParams.f2656b) - (this.f2670d / 2.0f);
                            this.f2672f.mo10368a(layoutParams.f2659e);
                            this.f2672f.alpha(childAt.alpha());
                            this.f2672f.dispatchDraw();
                        }
                    } else {
                        childAt.setRendererVisibility(false);
                    }
                }
            }
            onDrawChildEnd();
            MatrixStack.glPopMatrix();
            onDrawEnd();
        }
    }

    /* renamed from: a */
    private boolean m10626a(Number3d number3d, C0975i c0975i) {
        C0907b layoutParams = c0975i.getLayoutParams();
        float f = c0975i.position().f2527y + number3d.f2527y;
        return layoutParams.f2663i + f <= ((float) C0892a.f2558I) && layoutParams.f2665k + f >= ((float) (-C0892a.f2558I));
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0980j
    public void onDrawChildStart() {
    }

    /* renamed from: d */
    public void mo4847d() {
        float f;
        float m10613f = m10613f();
        if (m10613f > this.f2668b || this.f2673g == 1) {
            this.f2674h.f2665k = 0.0f;
            m10615d((int) m10613f);
            this.f2674h.f2663i = -this.f2668b;
            f = 0.0f;
        } else {
            f = (-(this.f2668b - m10613f)) / 2.0f;
            this.f2674h.f2665k = 0.0f;
            this.f2674h.f2663i = -this.f2668b;
        }
        minY(this.f2674h.f2663i);
        int numChildren = numChildren();
        for (int i = 0; i < numChildren; i++) {
            C0975i childAt = getChildAt(i);
            C0907b layoutParams = childAt.getLayoutParams();
            if (childAt.visible() && layoutParams != null) {
                layoutParams.f2661g = (f - layoutParams.f2655a) - layoutParams.f2665k;
                childAt.position().f2527y = layoutParams.f2661g;
                f = (childAt.position().f2527y + layoutParams.f2663i) - layoutParams.f2656b;
                if (this.f2671e && !layoutParams.f2666l) {
                    f -= this.f2670d;
                }
            }
        }
    }

    /* renamed from: f */
    private float m10613f() {
        int numChildren = numChildren();
        float f = 0.0f;
        for (int i = 0; i < numChildren; i++) {
            C0975i childAt = getChildAt(i);
            C0907b layoutParams = childAt.getLayoutParams();
            if (childAt.visible() && layoutParams != null) {
                f += ((layoutParams.f2655a + layoutParams.f2665k) - layoutParams.f2663i) + layoutParams.f2656b;
                if (this.f2671e) {
                    f += this.f2670d;
                }
            }
        }
        return f;
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0980j, com.censivn.C3DEngine.p031b.p038f.InterfaceC0972f
    public void addChild(C0975i c0975i) {
        if (c0975i instanceof C0908c) {
            ((C0908c) c0975i).m10620b(this.f2667a);
        }
        super.addChild(c0975i);
        mo4847d();
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0980j, com.censivn.C3DEngine.p031b.p038f.InterfaceC0972f
    public boolean removeChild(C0975i c0975i) {
        boolean removeChild = super.removeChild(c0975i);
        mo4847d();
        return removeChild;
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0980j
    public void addChildAt(C0975i c0975i, int i) {
        if (c0975i instanceof C0908c) {
            ((C0908c) c0975i).m10620b(this.f2667a);
        }
        super.addChildAt(c0975i, i);
        mo4847d();
    }
}
