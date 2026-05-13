package com.censivn.C3DEngine.p031b.p046h.p051e;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p036d.C0937a;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.tsf.C1306b;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.p183o.C3567c;
import com.tsf.shell.p096f.p097a.p099b.C2278b;
import com.tsf.shell.p096f.p118e.C2477c;
import com.tsf.shell.utils.C4189x;
/* renamed from: com.censivn.C3DEngine.b.h.e.a */
/* loaded from: classes.dex */
public class C1058a extends C0980j {

    /* renamed from: a */
    public static float f3263a = 0.15f;

    /* renamed from: b */
    private C0980j f3264b;

    /* renamed from: c */
    private C0980j f3265c;

    /* renamed from: d */
    private C0980j f3266d;

    /* renamed from: e */
    private C2278b f3267e;

    /* renamed from: f */
    private float f3268f;

    /* renamed from: g */
    private float f3269g;

    /* renamed from: h */
    private float f3270h;

    /* renamed from: i */
    private float f3271i;

    /* renamed from: j */
    private float f3272j;

    /* renamed from: k */
    private float f3273k;

    /* renamed from: l */
    private int f3274l;

    /* renamed from: m */
    private float f3275m;

    /* renamed from: n */
    private float f3276n;

    /* renamed from: o */
    private float f3277o;

    /* renamed from: p */
    private boolean f3278p;

    /* renamed from: q */
    private int f3279q;

    /* renamed from: r */
    private int f3280r;

    /* renamed from: s */
    private float f3281s;

    /* renamed from: t */
    private C0981k f3282t;

    /* renamed from: u */
    private C0981k f3283u;

    /* renamed from: v */
    private TextureElement f3284v;

    /* renamed from: w */
    private boolean f3285w;

    /* renamed from: x */
    private boolean f3286x;

    /* renamed from: y */
    private boolean f3287y;

    public C1058a(float f, float f2, float f3, float f4, float f5) {
        this(null, f, f2, f3, f4, f5);
    }

    /* renamed from: a */
    public void mo5701a(int i) {
    }

    /* renamed from: b */
    public void mo5700b(int i) {
    }

    /* renamed from: a */
    public void mo5702a() {
    }

    public C1058a(C0975i c0975i, float f, float f2, float f3, float f4, float f5) {
        this.f3274l = 1;
        this.f3275m = 0.0f;
        this.f3276n = 0.0f;
        this.f3277o = 0.0f;
        this.f3278p = false;
        this.f3285w = false;
        this.f3286x = false;
        this.f3287y = true;
        this.f3279q = 1;
        this.f3280r = 0;
        this.f3268f = f;
        this.f3269g = f2;
        this.f3270h = f4;
        this.f3271i = f5;
        this.f3272j = f3;
        this.f3266d = new C0980j();
        this.f3264b = new C0980j();
        this.f3265c = new C0980j() { // from class: com.censivn.C3DEngine.b.h.e.a.1

            /* renamed from: b */
            private boolean f3289b = false;

            @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
            public void onDrawStart() {
                this.f3289b = false;
                if (getAnimationObjectState()) {
                    if (C1058a.this.f3286x) {
                        this.f3289b = true;
                        C3359a.f11107u.m5966a(C1058a.this.f3267e);
                    }
                    position().f2526x += (C1058a.this.f3277o - position().f2526x) * C1058a.f3263a;
                    if (!C1058a.this.f3278p && Math.abs(position().f2526x - C1058a.this.f3277o) < 0.1f) {
                        position().f2526x = C1058a.this.f3277o;
                        setAnimationObjectState(false);
                        C1058a.this.mo5700b(C1058a.this.f3280r);
                    }
                    for (int i = 0; i < numChildren(); i++) {
                        C1058a.this.m10083a(C1058a.this.f3265c.getChildAt(i));
                    }
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
            public void onDrawEnd() {
                if (this.f3289b) {
                    C3359a.f11107u.m5968a();
                }
            }
        };
        this.f3267e = new C2278b(this.f3268f - (2.0f * f4), this.f3269g, this.f3265c);
        this.f3264b.addChild(this.f3265c);
        super.addChild(this.f3264b);
        super.addChild(this.f3266d);
        c0975i = c0975i == null ? this.f3264b : c0975i;
        this.f3264b.setMouseEventListener(new C0937a(c0975i) { // from class: com.censivn.C3DEngine.b.h.e.a.2

            /* renamed from: a */
            float f3290a;

            /* renamed from: d */
            private C0937a f3292d;

            /* renamed from: e */
            private boolean f3293e = false;

            /* renamed from: f */
            private boolean f3294f = false;

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: e */
            public void mo1654e(MotionEvent motionEvent) {
                float[] m601a = C4189x.m601a(motionEvent);
                C0975i hittingTarget = C1058a.this.f3265c.getHittingTarget(m601a[0], m601a[1], true);
                if (hittingTarget != null && hittingTarget.getMouseEventListener() != null) {
                    this.f3292d = hittingTarget.getMouseEventListener();
                    this.f3292d.mo1654e(motionEvent);
                }
                C1058a c1058a = C1058a.this;
                float f6 = C1058a.this.f3265c.position().f2526x;
                this.f3290a = f6;
                c1058a.f3277o = f6;
                C1058a.this.f3265c.setAnimationObjectState(true);
                this.f3294f = false;
                this.f3293e = true;
                C1058a.this.f3278p = true;
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: f */
            public void mo1653f(MotionEvent motionEvent) {
                this.f3293e = true;
                this.f3294f = false;
                C1058a.this.f3278p = false;
                if (this.f3292d != null) {
                    this.f3292d.mo1653f(motionEvent);
                    this.f3292d = null;
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: c */
            public void mo2122c(MotionEvent motionEvent) {
                if (this.f3292d != null) {
                    this.f3292d.mo2122c(motionEvent);
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: d */
            public void mo2119d(MotionEvent motionEvent) {
                C1058a.f3263a = 0.15f;
                C1058a.this.m10051m();
                if (this.f3292d != null) {
                    this.f3292d.mo2119d(motionEvent);
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo2129a(MotionEvent motionEvent, MotionEvent motionEvent2) {
                if (this.f3292d != null) {
                    this.f3292d.mo2129a(motionEvent, motionEvent2);
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo502a(MotionEvent motionEvent) {
                if (this.f3292d != null) {
                    this.f3292d.mo502a(motionEvent);
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo527a(MotionEvent motionEvent, MotionEvent motionEvent2, float f6, float f7) {
                C1058a.f3263a = 0.3f;
                if (this.f3293e) {
                    this.f3293e = false;
                    if (Math.abs(f6) > Math.abs(f7)) {
                        this.f3294f = true;
                        C1058a.this.mo5702a();
                    }
                }
                if (this.f3294f) {
                    C1058a.this.f3277o = this.f3290a + (motionEvent2.getX() - motionEvent.getX());
                    C1058a.this.f3277o = C2477c.m5473a(C1058a.this.f3277o, C1058a.this.f3276n, C1058a.this.f3275m);
                } else if (this.f3292d != null) {
                    this.f3292d.mo527a(motionEvent, motionEvent2, f6, f7);
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: g */
            public void mo3208g(MotionEvent motionEvent) {
                C1058a.f3263a = 0.15f;
                C1058a.this.m10051m();
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: b */
            public void mo3209b(MotionEvent motionEvent, MotionEvent motionEvent2, float f6, float f7) {
                C1058a.f3263a = 0.15f;
                if (this.f3294f) {
                    if (Math.abs(f6) < 100.0f) {
                        C1058a.this.m10051m();
                        return;
                    } else if (f6 > 0.0f && C1058a.this.f3280r > 0) {
                        if (C1058a.this.f3265c.position().f2526x > C1058a.this.f3281s) {
                            C1058a.this.m10084a(C1058a.this.f3280r - 1, true);
                            return;
                        } else {
                            C1058a.this.m10051m();
                            return;
                        }
                    } else if (f6 >= 0.0f || C1058a.this.f3280r >= C1058a.this.f3279q - 1) {
                        C1058a.this.m10051m();
                        return;
                    } else if (C1058a.this.f3265c.position().f2526x < C1058a.this.f3281s) {
                        C1058a.this.m10084a(C1058a.this.f3280r + 1, true);
                        return;
                    } else {
                        C1058a.this.m10051m();
                        return;
                    }
                }
                C1058a.f3263a = 0.15f;
                C1058a.this.m10051m();
            }
        });
        this.f3284v = C4189x.m593b(C1306b.C1310d.scrollcontainer_arrow);
        this.f3282t = new C0981k(24.0f * C0892a.f2567c, 45.0f * C0892a.f2567c, false);
        this.f3282t.rotation().f2528z = 180.0f;
        C3567c.m1967a(this.f3282t, C3567c.f11849h);
        this.f3283u = new C0981k(24.0f * C0892a.f2567c, 45.0f * C0892a.f2567c, false);
        C3567c.m1967a(this.f3283u, C3567c.f11849h);
        this.f3282t.textures().addElement(this.f3284v);
        this.f3283u.textures().addElement(this.f3284v);
        this.f3282t.calAABB(3.0f, 3.0f, 1.0f);
        this.f3283u.calAABB(3.0f, 3.0f, 1.0f);
        this.f3282t.setMouseEventListener(new C0937a(c0975i) { // from class: com.censivn.C3DEngine.b.h.e.a.3
            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo502a(MotionEvent motionEvent) {
                C1058a.f3263a = 0.1f;
                C1058a.this.m10055k();
            }
        });
        this.f3283u.setMouseEventListener(new C0937a(c0975i) { // from class: com.censivn.C3DEngine.b.h.e.a.4
            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo502a(MotionEvent motionEvent) {
                C1058a.f3263a = 0.1f;
                C1058a.this.m10057j();
            }
        });
        m10059i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public void m10057j() {
        if (this.f3280r < this.f3279q - 1) {
            m10084a(this.f3280r + 1, true);
        } else {
            m10051m();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public void m10055k() {
        if (this.f3280r > 0) {
            m10084a(this.f3280r - 1, true);
        } else {
            m10051m();
        }
    }

    /* renamed from: a */
    public void m10086a(float f) {
        this.f3272j = f;
    }

    /* renamed from: b */
    public C0980j m10077b() {
        return this.f3265c;
    }

    /* renamed from: c */
    public C0980j m10074c() {
        return this.f3264b;
    }

    /* renamed from: d */
    public void m10071d() {
        this.f3285w = true;
    }

    /* renamed from: e */
    public void m10068e() {
        this.f3286x = true;
    }

    /* renamed from: f */
    public void m10065f() {
        this.f3286x = false;
    }

    /* renamed from: g */
    public void m10063g() {
        this.f3287y = false;
        m10076b(this.f3282t);
        m10076b(this.f3283u);
    }

    /* renamed from: h */
    public void m10061h() {
        this.f3287y = true;
        m10053l();
    }

    /* renamed from: l */
    private void m10053l() {
        if (this.f3279q > 1) {
            if (this.f3280r > 0) {
                m10082a(this.f3282t);
            } else {
                m10076b(this.f3282t);
            }
            if (this.f3280r < this.f3279q - 1) {
                m10082a(this.f3283u);
                return;
            } else {
                m10076b(this.f3283u);
                return;
            }
        }
        m10076b(this.f3282t);
        m10076b(this.f3283u);
    }

    /* renamed from: a */
    private void m10082a(C0981k c0981k) {
        if (this.f3287y) {
            if (c0981k.parent() == null) {
                this.f3266d.addChild(c0981k);
            }
            C1017d c1017d = new C1017d();
            c1017d.m10314a(255);
            C1014c.m10326a(c0981k);
            C1014c.m10325a(c0981k, 250, c1017d);
        }
        c0981k.mouseEnabled(true);
    }

    /* renamed from: b */
    private void m10076b(final C0981k c0981k) {
        if (c0981k.parent() != null) {
            C1017d c1017d = new C1017d() { // from class: com.censivn.C3DEngine.b.h.e.a.5
                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: a */
                public void mo732a() {
                    C1058a.this.f3266d.removeChild(c0981k);
                }
            };
            c1017d.m10314a(0);
            C1014c.m10326a(c0981k);
            C1014c.m10325a(c0981k, 250, c1017d);
        }
        c0981k.mouseEnabled(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m10083a(C0975i c0975i) {
        if ((c0975i.position().f2526x - (this.f3272j / 2.0f)) + this.f3265c.position().f2526x >= this.f3268f / 2.0f || c0975i.position().f2526x + (this.f3272j / 2.0f) + this.f3265c.position().f2526x <= (-this.f3268f) / 2.0f) {
            c0975i.visible(false);
        } else {
            c0975i.visible(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public void m10051m() {
        int i = -((int) ((this.f3265c.position().f2526x - (this.f3268f / 2.0f)) / this.f3268f));
        if (i < 0) {
            i = 0;
        } else if (i > this.f3279q - 1) {
            i = this.f3279q - 1;
        }
        m10084a(i, true);
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0980j, com.censivn.C3DEngine.p031b.p038f.InterfaceC0972f
    public C0975i getChildAt(int i) {
        return this.f3265c.getChildAt(i);
    }

    /* renamed from: a */
    public void m10084a(int i, boolean z) {
        if (this.f3280r < this.f3265c.numChildren()) {
            this.f3280r = i;
            float f = (-this.f3280r) * this.f3268f;
            this.f3281s = f;
            this.f3277o = f;
            this.f3265c.setAnimationObjectState(true);
            m10053l();
            if (!z) {
                this.f3265c.position().f2526x = this.f3277o;
            }
            mo5701a(this.f3280r);
        }
    }

    /* renamed from: a */
    public void m10085a(float f, float f2, float f3, float f4) {
        this.f3268f = f3 - f;
        this.f3269g = f4 - f2;
        m10059i();
    }

    /* renamed from: i */
    public void m10059i() {
        this.f3264b.setAABBPX((-this.f3268f) / 2.0f, (-this.f3269g) / 2.0f, 0.0f, this.f3268f / 2.0f, this.f3269g / 2.0f, 1.0f);
        this.f3282t.position().f2526x = ((-this.f3268f) / 2.0f) + this.f3282t.mo10366b();
        this.f3283u.position().f2526x = (this.f3268f / 2.0f) - this.f3282t.mo10366b();
        this.f3267e.mo10368a(this.f3268f - (this.f3270h * 2.0f));
        this.f3267e.mo5215b(this.f3269g);
        m10049n();
        m10073c(0);
        m10070d(0);
        m10084a(this.f3280r, false);
    }

    /* renamed from: n */
    private void m10049n() {
        float f = this.f3268f - (this.f3270h * 2.0f);
        this.f3274l = (int) ((this.f3271i + f) / (this.f3272j + this.f3271i));
        this.f3274l = this.f3274l == 0 ? 1 : this.f3274l;
        if (this.f3274l == 1) {
            this.f3273k = 0.0f;
        } else {
            this.f3273k = (f - (this.f3274l * this.f3272j)) / (this.f3274l - 1);
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0980j
    public void addChildAt(C0975i c0975i, int i) {
        this.f3265c.addChildAt(c0975i, i);
        m10073c(i);
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0980j, com.censivn.C3DEngine.p031b.p038f.InterfaceC0972f
    public void addChild(C0975i c0975i) {
        int numChildren = this.f3265c.numChildren();
        this.f3265c.addChild(c0975i);
        m10073c(numChildren);
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0980j, com.censivn.C3DEngine.p031b.p038f.InterfaceC0972f
    public boolean removeChild(C0975i c0975i) {
        int childIndexOf = this.f3265c.getChildIndexOf(c0975i);
        if (childIndexOf == -1) {
            return false;
        }
        this.f3265c.removeChildAt(childIndexOf);
        m10073c(childIndexOf);
        return true;
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0980j, com.censivn.C3DEngine.p031b.p038f.InterfaceC0972f
    public int numChildren() {
        return this.f3265c.numChildren();
    }

    /* renamed from: c */
    private void m10073c(int i) {
        this.f3279q = this.f3265c.numChildren() % this.f3274l == 0 ? this.f3265c.numChildren() / this.f3274l : (this.f3265c.numChildren() / this.f3274l) + 1;
        int i2 = i / this.f3274l;
        this.f3276n = 0.0f;
        this.f3275m = ((-this.f3279q) * this.f3268f) + this.f3268f;
        this.f3275m = this.f3275m > 0.0f ? 0.0f : this.f3275m;
        m10070d(i2);
        m10053l();
    }

    /* renamed from: d */
    private void m10070d(int i) {
        while (i < this.f3279q) {
            m10067e(i);
            i++;
        }
    }

    /* renamed from: e */
    private void m10067e(int i) {
        int numChildren = this.f3265c.numChildren();
        int i2 = i * this.f3274l;
        int i3 = this.f3274l + i2 > numChildren + (-1) ? numChildren - 1 : this.f3274l + i2;
        int i4 = (i3 - i2) + 1;
        float f = this.f3285w ? ((this.f3268f - (((i4 - 1) * this.f3273k) + (i4 * this.f3272j))) / 2.0f) + ((-this.f3268f) / 2.0f) + (i * this.f3268f) + (this.f3272j / 2.0f) : ((-this.f3268f) / 2.0f) + (i * this.f3268f) + this.f3270h + (this.f3272j / 2.0f);
        for (int i5 = i2; i5 < i3 + 1; i5++) {
            C0975i childAt = this.f3265c.getChildAt(i5);
            childAt.position().f2526x = f;
            f += this.f3273k + this.f3272j;
            m10083a(childAt);
        }
    }
}
