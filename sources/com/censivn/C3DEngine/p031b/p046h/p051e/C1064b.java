package com.censivn.C3DEngine.p031b.p046h.p051e;

import android.view.MotionEvent;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p036d.C0937a;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.censivn.C3DEngine.p031b.p041g.C0986a;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.tsf.C1306b;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.p183o.C3567c;
import com.tsf.shell.p096f.p097a.p099b.C2278b;
import com.tsf.shell.p096f.p118e.C2477c;
import com.tsf.shell.utils.C4187w;
import com.tsf.shell.utils.C4189x;
import java.util.ArrayList;
/* renamed from: com.censivn.C3DEngine.b.h.e.b */
/* loaded from: classes.dex */
public class C1064b extends C0980j {

    /* renamed from: a */
    public static float f3299a = 0.15f;

    /* renamed from: A */
    private C0981k f3300A;

    /* renamed from: B */
    private C0937a f3301B;

    /* renamed from: b */
    private C0980j f3302b;

    /* renamed from: c */
    private C0980j f3303c;

    /* renamed from: d */
    private C2278b f3304d;

    /* renamed from: e */
    private float f3305e;

    /* renamed from: f */
    private float f3306f;

    /* renamed from: g */
    private float f3307g;

    /* renamed from: h */
    private float f3308h;

    /* renamed from: i */
    private float f3309i;

    /* renamed from: j */
    private float f3310j;

    /* renamed from: k */
    private int f3311k;

    /* renamed from: l */
    private float f3312l;

    /* renamed from: m */
    private float f3313m;

    /* renamed from: n */
    private float f3314n;

    /* renamed from: o */
    private boolean f3315o;

    /* renamed from: p */
    private int f3316p;

    /* renamed from: q */
    private int f3317q;

    /* renamed from: r */
    private float f3318r;

    /* renamed from: s */
    private C0981k f3319s;

    /* renamed from: t */
    private C0981k f3320t;

    /* renamed from: u */
    private TextureElement f3321u;

    /* renamed from: v */
    private ArrayList<C1069a> f3322v;

    /* renamed from: w */
    private float f3323w;

    /* renamed from: x */
    private boolean f3324x;

    /* renamed from: y */
    private boolean f3325y;

    /* renamed from: z */
    private boolean f3326z;

    public C1064b(float f, float f2, float f3, float f4, float f5, float f6) {
        this(null, f, f2, f3, f4, f5, f6);
    }

    /* renamed from: a */
    public void m10047a() {
        this.f3326z = true;
    }

    /* renamed from: b */
    public void m10036b() {
        this.f3326z = false;
    }

    public C1064b(C0975i c0975i, float f, float f2, float f3, float f4, float f5, float f6) {
        this.f3312l = 0.0f;
        this.f3313m = 0.0f;
        this.f3314n = 0.0f;
        this.f3315o = false;
        this.f3323w = 1.0f;
        this.f3324x = false;
        this.f3325y = false;
        this.f3326z = false;
        this.f3323w = f6;
        this.f3322v = new ArrayList<>();
        this.f3316p = 1;
        this.f3317q = 0;
        this.f3305e = f;
        this.f3306f = f2;
        this.f3300A = new C0981k(100.0f, 100.0f, false);
        this.f3307g = f4;
        this.f3308h = f5;
        this.f3309i = f3;
        this.f3303c = new C0980j();
        this.f3302b = new C0980j() { // from class: com.censivn.C3DEngine.b.h.e.b.1

            /* renamed from: b */
            private boolean f3328b = false;

            @Override // com.censivn.C3DEngine.p031b.p038f.C0980j
            public void onDrawChildStart() {
                C1064b.this.mo4707h();
            }

            @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
            public void onDrawStart() {
                C1064b.this.mo4706k();
                if (C1064b.this.f3325y && C1064b.this.f3302b.getAnimationObjectState()) {
                    this.f3328b = true;
                    C3359a.f11107u.m5966a(C1064b.this.f3304d);
                    return;
                }
                this.f3328b = false;
            }

            @Override // com.censivn.C3DEngine.p031b.p038f.C0980j
            public void onDrawChildEnd(C0975i c0975i2) {
                C1064b.this.mo3576c(c0975i2);
            }

            @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
            public void onDrawEnd() {
                if (this.f3328b) {
                    C3359a.f11107u.m5968a();
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p038f.C0980j
            public void addChildAt(C0975i c0975i2, int i) {
                c0975i2.setAnimationObjectState(true);
                C1064b.this.m10002o();
                C1064b.this.m10015h(c0975i2);
                super.addChildAt(c0975i2, i);
                C1064b.this.mo4667a(numChildren());
                C1064b.this.m9992t();
                C1064b.this.m10030c(i);
                C1064b.this.mo4708a(c0975i2);
            }

            @Override // com.censivn.C3DEngine.p031b.p038f.C0980j, com.censivn.C3DEngine.p031b.p038f.InterfaceC0972f
            public void addChild(C0975i c0975i2) {
                c0975i2.setAnimationObjectState(true);
                C1064b.this.m10002o();
                C1064b.this.m10015h(c0975i2);
                super.addChild(c0975i2);
                C1064b.this.mo4667a(numChildren());
                C1064b.this.m9992t();
                C1064b.this.mo4708a(c0975i2);
            }

            @Override // com.censivn.C3DEngine.p031b.p038f.C0980j, com.censivn.C3DEngine.p031b.p038f.InterfaceC0972f
            public boolean removeChild(C0975i c0975i2) {
                int childIndexOf = C1064b.this.f3302b.getChildIndexOf(c0975i2);
                if (childIndexOf != -1) {
                    C1064b.this.m10000p();
                    super.removeChildAt(childIndexOf);
                    C1064b.this.mo4667a(numChildren());
                    C1064b.this.m9992t();
                    C1064b.this.m10030c(childIndexOf);
                    C1064b.this.m9996r();
                    C1064b.this.mo4666b(c0975i2);
                    return true;
                }
                return false;
            }
        };
        super.addChild(this.f3302b);
        super.addChild(this.f3303c);
        setMouseEventListener(new C0937a(c0975i == null ? this : c0975i) { // from class: com.censivn.C3DEngine.b.h.e.b.2

            /* renamed from: b */
            private float f3330b;

            /* renamed from: g */
            private C0937a f3334g;

            /* renamed from: h */
            private C0975i f3335h;

            /* renamed from: d */
            private boolean f3331d = false;

            /* renamed from: e */
            private boolean f3332e = false;

            /* renamed from: f */
            private boolean f3333f = false;

            /* renamed from: i */
            private Number3d f3336i = new Number3d();

            /* renamed from: j */
            private float[] f3337j = {0.0f, 0.0f};

            /* renamed from: k */
            private Number3d f3338k = new Number3d();

            /* renamed from: l */
            private int f3339l = 0;

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: e */
            public void mo1654e(MotionEvent motionEvent) {
                this.f3332e = false;
                C1064b.this.f3315o = true;
                this.f3331d = false;
                this.f3330b = C1064b.this.f3302b.position().f2526x;
                C1064b.this.f3302b.setAnimationObjectState(true);
                C1064b.this.f3314n = this.f3330b;
                this.f3335h = C1064b.this.f3302b.getHittingObjectTarget(motionEvent, true);
                if (C1064b.this.f3301B != null) {
                    this.f3334g = C1064b.this.f3301B;
                    this.f3334g.mo1654e(motionEvent);
                    return;
                }
                if (C1064b.this.f3324x && this.f3335h != null && this.f3335h.getMouseEventListener() != null) {
                    this.f3335h = C1064b.this.f3302b.getChildAt(0);
                }
                if (this.f3335h != null && this.f3335h.getMouseEventListener() != null) {
                    this.f3334g = this.f3335h.getMouseEventListener();
                    this.f3334g.mo1654e(motionEvent);
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: f */
            public void mo1653f(MotionEvent motionEvent) {
                if (this.f3334g != null) {
                    this.f3334g.mo1653f(motionEvent);
                    this.f3334g = null;
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo527a(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f8) {
                C1064b.f3299a = 0.3f;
                C1064b.this.f3314n = this.f3330b + (motionEvent2.getX() - motionEvent.getX());
                C1064b.this.f3314n = C2477c.m5473a(C1064b.this.f3314n, C1064b.this.f3313m, C1064b.this.f3312l);
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo2129a(final MotionEvent motionEvent, final MotionEvent motionEvent2) {
                if (C1064b.this.f3326z) {
                    if (this.f3335h != null && this.f3331d && !this.f3333f) {
                        this.f3333f = true;
                        C0853a.m10865a().m10583c(new Runnable() { // from class: com.censivn.C3DEngine.b.h.e.b.2.1
                            @Override // java.lang.Runnable
                            public void run() {
                                C10662.this.f3333f = false;
                                if (C10662.this.f3331d) {
                                    if (C10662.this.f3332e) {
                                        C4189x.m600a(motionEvent2, C10662.this.f3337j);
                                        C10662.this.f3338k.f2526x = C10662.this.f3337j[0];
                                        C10662.this.f3338k.f2527y = C10662.this.f3337j[1];
                                        C1064b.this.f3302b.globalToLocal(C10662.this.f3338k);
                                        float f7 = C10662.this.f3338k.f2526x + (C1064b.this.f3305e / 2.0f);
                                        int i = (int) (f7 / C1064b.this.f3305e);
                                        float f8 = f7 - (i * C1064b.this.f3305e);
                                        int i2 = ((int) ((f8 - C1064b.this.f3307g) / (C1064b.this.f3309i + (C1064b.this.f3310j / 2.0f)))) + (C1064b.this.f3311k * i);
                                        if (C10662.this.f3338k.f2527y <= C1064b.this.f3306f / 2.0f && C10662.this.f3338k.f2527y >= (-C1064b.this.f3306f) / 2.0f) {
                                            if (f8 >= C1064b.this.f3307g) {
                                                if (f8 <= C1064b.this.f3305e - C1064b.this.f3307g) {
                                                    if (!C1064b.this.f3302b.getAnimationObjectState()) {
                                                        int i3 = i2 >= 0 ? i2 : 0;
                                                        if (i3 > C1064b.this.f3302b.numChildren() - 1) {
                                                            i3 = C1064b.this.f3302b.numChildren() - 1;
                                                        }
                                                        if (C1064b.this.f3317q == i && C10662.this.f3339l != i3) {
                                                            C10662.this.f3339l = i3;
                                                            C1064b.this.f3300A.removeFromParent();
                                                            C1064b.this.f3302b.addChildAt(C1064b.this.f3300A, C10662.this.f3339l);
                                                        }
                                                    }
                                                } else {
                                                    C1064b.this.m10013i();
                                                }
                                            } else {
                                                C1064b.this.m10011j();
                                            }
                                        }
                                        C10662.this.f3335h.position().f2526x = (motionEvent2.getX() - motionEvent.getX()) + C10662.this.f3336i.f2526x;
                                        C10662.this.f3335h.position().f2527y = (motionEvent.getY() - motionEvent2.getY()) + C10662.this.f3336i.f2527y;
                                    } else if (C4189x.m594b(motionEvent.getX(), motionEvent.getY(), motionEvent2.getX(), motionEvent2.getY()) > 15.0f) {
                                        C10662.this.f3332e = true;
                                    }
                                }
                            }
                        });
                    }
                } else if (this.f3334g != null) {
                    this.f3334g.mo2129a(motionEvent, motionEvent2);
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: c */
            public void mo2122c(MotionEvent motionEvent) {
                C1064b.this.f3315o = false;
                C1064b.f3299a = 0.15f;
                if (C1064b.this.f3326z) {
                    if (this.f3335h != null) {
                        C4187w.m616a();
                        this.f3339l = C1064b.this.f3302b.getChildIndexOf(this.f3335h);
                        this.f3336i.reset();
                        this.f3336i = this.f3335h.localToGlobal(this.f3336i);
                        C1064b.this.f3302b.replaceChild(this.f3335h, C1064b.this.f3300A);
                        this.f3335h.position().setAllFrom(this.f3336i);
                        this.f3335h.setAnimationObjectState(true);
                        C3359a.f11096j.m2232a(this.f3335h);
                        this.f3331d = true;
                    }
                } else if (this.f3334g != null) {
                    this.f3334g.mo2122c(motionEvent);
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: d */
            public void mo2119d(MotionEvent motionEvent) {
                C1064b.this.f3315o = false;
                C1064b.f3299a = 0.15f;
                if (C1064b.this.f3326z) {
                    if (this.f3335h != null) {
                        this.f3331d = false;
                        this.f3336i.setAllFrom(this.f3335h.position());
                        C3359a.f11096j.m2223b(this.f3335h);
                        C1064b.this.f3302b.globalToLocal(this.f3336i);
                        C1064b.this.f3302b.replaceChild(C1064b.this.f3300A, this.f3335h);
                        this.f3335h.position().setAllFrom(this.f3336i);
                    }
                } else if (this.f3334g != null) {
                    this.f3334g.mo2119d(motionEvent);
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo502a(MotionEvent motionEvent) {
                C1064b.this.f3315o = false;
                if (this.f3334g != null) {
                    this.f3334g.mo502a(motionEvent);
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: g */
            public void mo3208g(MotionEvent motionEvent) {
                C1064b.this.f3315o = false;
                C1064b.f3299a = 0.15f;
                C1064b.this.m9996r();
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: b */
            public void mo3209b(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f8) {
                C1064b.this.f3315o = false;
                C1064b.f3299a = 0.15f;
                if (Math.abs(f7) < 100.0f) {
                    C1064b.this.m9996r();
                } else if (f7 > 0.0f && C1064b.this.f3317q > 0) {
                    if (C1064b.this.f3302b.position().f2526x > C1064b.this.f3318r) {
                        C1064b.this.m10035b(C1064b.this.f3317q - 1);
                    } else {
                        C1064b.this.m9996r();
                    }
                } else if (f7 >= 0.0f || C1064b.this.f3317q >= C1064b.this.f3316p - 1) {
                    C1064b.this.m9996r();
                } else if (C1064b.this.f3302b.position().f2526x < C1064b.this.f3318r) {
                    C1064b.this.m10035b(C1064b.this.f3317q + 1);
                } else {
                    C1064b.this.m9996r();
                }
            }
        });
        this.f3304d = new C2278b(this.f3305e - (2.0f * f4), this.f3306f, this.f3302b);
        this.f3321u = C4189x.m593b(C1306b.C1310d.scrollcontainer_arrow);
        this.f3319s = new C0981k(C0892a.f2567c * 24.0f, C0892a.f2567c * 45.0f, false);
        this.f3319s.rotation().f2528z = 180.0f;
        C3567c.m1967a(this.f3319s, C3567c.f11849h);
        this.f3320t = new C0981k(C0892a.f2567c * 24.0f, C0892a.f2567c * 45.0f, false);
        C3567c.m1967a(this.f3320t, C3567c.f11849h);
        this.f3319s.textures().addElement(this.f3321u);
        this.f3320t.textures().addElement(this.f3321u);
        m10004n();
    }

    /* renamed from: a */
    public void m10043a(C0937a c0937a) {
        this.f3301B = c0937a;
    }

    /* renamed from: a */
    public C0975i m10044a(MotionEvent motionEvent) {
        return this.f3302b.getHittingObjectTarget(motionEvent, true);
    }

    /* renamed from: c */
    public C0980j m10031c() {
        return this.f3302b;
    }

    /* renamed from: d */
    public void m10028d() {
        this.f3325y = true;
    }

    /* renamed from: e */
    public void m10024e() {
        this.f3324x = true;
    }

    /* renamed from: f */
    public void m10021f() {
        this.f3324x = false;
    }

    /* renamed from: a */
    public void mo4667a(int i) {
    }

    /* renamed from: g */
    public int m10018g() {
        return this.f3317q;
    }

    /* renamed from: a */
    public void mo4708a(C0975i c0975i) {
    }

    /* renamed from: b */
    public void mo4666b(C0975i c0975i) {
    }

    /* renamed from: h */
    public void mo4707h() {
    }

    /* renamed from: c */
    public void mo3576c(C0975i c0975i) {
    }

    /* renamed from: i */
    public void m10013i() {
        if (!this.f3302b.getAnimationObjectState() && this.f3317q < this.f3316p - 1) {
            C4187w.m616a();
            m10035b(this.f3317q + 1);
        }
    }

    /* renamed from: j */
    public void m10011j() {
        if (!this.f3302b.getAnimationObjectState() && this.f3317q > 0) {
            C4187w.m616a();
            m10035b(this.f3317q - 1);
        }
    }

    /* renamed from: k */
    public void mo4706k() {
        if (this.f3302b.getAnimationObjectState()) {
            this.f3302b.position().f2526x += (this.f3314n - this.f3302b.position().f2526x) * f3299a;
            if (!this.f3315o && Math.abs(this.f3302b.position().f2526x - this.f3314n) < 0.1f) {
                this.f3302b.position().f2526x = this.f3314n;
                this.f3302b.setAnimationObjectState(false);
            }
        }
        for (int i = 0; i < this.f3302b.numChildren(); i++) {
            C0975i childAt = this.f3302b.getChildAt(i);
            if (m10017g(childAt)) {
                childAt.visible(true);
            } else {
                childAt.visible(false);
            }
            if (childAt.getAnimationObjectState()) {
                C1069a c1069a = this.f3322v.get(i);
                if (childAt.visible() || m10046a(c1069a.f3345a)) {
                    boolean z = childAt.getTweenChild() != null;
                    childAt.position().f2526x += (c1069a.f3345a - childAt.position().f2526x) * f3299a;
                    childAt.position().f2527y += (c1069a.f3346b - childAt.position().f2527y) * f3299a;
                    if (!z) {
                        childAt.scale().f2526x += (this.f3323w - childAt.scale().f2526x) * f3299a;
                        childAt.scale().f2527y = childAt.scale().f2526x;
                    }
                    if (!z && Math.abs(childAt.position().f2526x - c1069a.f3345a) < 0.1f && Math.abs(childAt.position().f2527y - c1069a.f3346b) < 0.1f && Math.abs(childAt.scale().f2526x - this.f3323w) < 0.1f) {
                        childAt.position().f2526x = c1069a.f3345a;
                        childAt.position().f2527y = c1069a.f3346b;
                        Number3d scale = childAt.scale();
                        Number3d scale2 = childAt.scale();
                        float f = this.f3323w;
                        scale2.f2527y = f;
                        scale.f2526x = f;
                        childAt.setAnimationObjectState(false);
                    }
                } else {
                    childAt.position().f2526x = c1069a.f3345a;
                    childAt.position().f2527y = c1069a.f3346b;
                    Number3d scale3 = childAt.scale();
                    Number3d scale4 = childAt.scale();
                    float f2 = this.f3323w;
                    scale4.f2527y = f2;
                    scale3.f2526x = f2;
                    childAt.setAnimationObjectState(false);
                }
            }
        }
    }

    /* renamed from: l */
    public C0980j m10008l() {
        return this.f3302b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public void m10002o() {
        int size = this.f3322v.size();
        C1069a c1069a = new C1069a();
        c1069a.f3345a = m10027d(size);
        c1069a.f3346b = 0.0f;
        this.f3322v.add(c1069a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public void m10000p() {
        this.f3322v.remove(this.f3322v.size() - 1);
    }

    /* renamed from: m */
    public void m10006m() {
        for (int i = 0; i < this.f3302b.numChildren(); i++) {
            this.f3302b.getChildAt(i).setAnimationObjectState(true);
        }
    }

    /* renamed from: q */
    private void m9998q() {
        if (this.f3316p > 1) {
            if (this.f3317q > 0) {
                m10042a(this.f3319s);
            } else {
                m10034b(this.f3319s);
            }
            if (this.f3317q < this.f3316p - 1) {
                m10042a(this.f3320t);
                return;
            } else {
                m10034b(this.f3320t);
                return;
            }
        }
        m10034b(this.f3319s);
        m10034b(this.f3320t);
    }

    /* renamed from: a */
    private void m10042a(C0981k c0981k) {
        if (c0981k.parent() == null) {
            this.f3303c.addChild(c0981k);
        }
        C1017d c1017d = new C1017d();
        c1017d.m10314a(255);
        C1014c.m10326a(c0981k);
        C1014c.m10325a(c0981k, 250, c1017d);
    }

    /* renamed from: b */
    private void m10034b(final C0981k c0981k) {
        if (c0981k.parent() != null) {
            C1017d c1017d = new C1017d() { // from class: com.censivn.C3DEngine.b.h.e.b.3
                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: a */
                public void mo732a() {
                    C1064b.this.f3303c.removeChild(c0981k);
                }
            };
            c1017d.m10314a(0);
            C1014c.m10326a(c0981k);
            C1014c.m10325a(c0981k, 250, c1017d);
        }
    }

    /* renamed from: g */
    private boolean m10017g(C0975i c0975i) {
        return m10046a(c0975i.position().f2526x);
    }

    /* renamed from: a */
    private boolean m10046a(float f) {
        return (f - (this.f3309i / 2.0f)) + this.f3302b.position().f2526x <= this.f3305e / 2.0f && ((this.f3309i / 2.0f) + f) + this.f3302b.position().f2526x >= (-this.f3305e) / 2.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public void m9996r() {
        int i = -((int) ((this.f3302b.position().f2526x - (this.f3305e / 2.0f)) / this.f3305e));
        if (i > this.f3316p - 1) {
            i = this.f3316p - 1;
        }
        if (i < 0) {
            i = 0;
        }
        m10035b(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m10035b(int i) {
        this.f3317q = i;
        float f = (-this.f3317q) * this.f3305e;
        this.f3318r = f;
        this.f3314n = f;
        m9992t();
        this.f3302b.setAnimationObjectState(true);
        this.f3302b.invalidate();
    }

    /* renamed from: a */
    public void m10045a(float f, float f2, float f3, float f4) {
        this.f3305e = f3 - f;
        this.f3306f = f4 - f2;
        m10004n();
    }

    /* renamed from: n */
    public void m10004n() {
        setAABBPX((-this.f3305e) / 2.0f, (-this.f3306f) / 2.0f, 0.0f, this.f3305e / 2.0f, this.f3306f / 2.0f, 1.0f);
        this.f3319s.position().f2526x = ((-this.f3305e) / 2.0f) + this.f3319s.mo10366b();
        this.f3320t.position().f2526x = (this.f3305e / 2.0f) - this.f3319s.mo10366b();
        this.f3304d.mo10368a(this.f3305e - (this.f3307g * 2.0f));
        this.f3304d.mo5215b(this.f3306f);
        m9994s();
        m9992t();
        int size = this.f3322v.size();
        for (int i = 0; i < size; i++) {
            this.f3322v.get(i).f3345a = m10027d(i);
        }
        int size2 = this.f3302b.children().size();
        for (int i2 = 0; i2 < size2; i2++) {
            this.f3302b.children().get(i2).position().f2526x = this.f3322v.get(i2).f3345a;
        }
    }

    /* renamed from: s */
    private void m9994s() {
        float f = this.f3305e - (this.f3307g * 2.0f);
        this.f3311k = (int) ((this.f3308h + f) / (this.f3309i + this.f3308h));
        this.f3311k = this.f3311k == 0 ? 1 : this.f3311k;
        this.f3310j = (f - (this.f3311k * this.f3309i)) / (this.f3311k - 1);
    }

    /* renamed from: d */
    public void m10026d(C0975i c0975i) {
        this.f3302b.addChildAt(c0975i, this.f3311k * this.f3317q);
    }

    /* renamed from: e */
    public void m10023e(C0975i c0975i) {
        int i = this.f3311k * this.f3317q;
        this.f3302b.addChildAt(c0975i, i);
        C1069a c1069a = this.f3322v.get(i);
        c0975i.position().f2526x = c1069a.f3345a;
        c0975i.position().f2527y = c1069a.f3346b;
        c0975i.scale().setAll(0.0f, 0.0f, 1.0f);
        C1017d c1017d = new C1017d();
        c1017d.m10294l(this.f3323w);
        c1017d.m10293m(this.f3323w);
        c1017d.m10313a(C0986a.f2950e);
        C1014c.m10326a(c0975i);
        C1014c.m10325a(c0975i, 500, c1017d);
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0980j, com.censivn.C3DEngine.p031b.p038f.InterfaceC0972f
    public void addChild(C0975i c0975i) {
        this.f3302b.addChild(c0975i);
    }

    /* renamed from: f */
    public void m10020f(C0975i c0975i) {
        this.f3302b.addChild(c0975i);
        C1069a c1069a = this.f3322v.get(this.f3302b.numChildren() - 1);
        c0975i.position().f2526x = c1069a.f3345a;
        c0975i.position().f2527y = c1069a.f3346b;
        c0975i.scale().setAll(0.0f, 0.0f, 1.0f);
        C1017d c1017d = new C1017d();
        c1017d.m10294l(this.f3323w);
        c1017d.m10293m(this.f3323w);
        c1017d.m10313a(C0986a.f2950e);
        C1014c.m10326a(c0975i);
        C1014c.m10325a(c0975i, 500, c1017d);
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0980j, com.censivn.C3DEngine.p031b.p038f.InterfaceC0972f
    public boolean removeChild(C0975i c0975i) {
        return this.f3302b.removeChild(c0975i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public void m10015h(C0975i c0975i) {
        if (c0975i.parent() != null) {
            Number3d.TEMPNUMBER3D.reset();
            c0975i.localToGlobal(Number3d.TEMPNUMBER3D);
            this.f3302b.globalToLocal(Number3d.TEMPNUMBER3D);
            c0975i.position().setAllFrom(Number3d.TEMPNUMBER3D);
            c0975i.removeFromParent();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public void m9992t() {
        this.f3316p = this.f3302b.numChildren() % this.f3311k == 0 ? this.f3302b.numChildren() / this.f3311k : (this.f3302b.numChildren() / this.f3311k) + 1;
        this.f3313m = 0.0f;
        this.f3312l = ((-this.f3316p) * this.f3305e) + this.f3305e;
        this.f3312l = this.f3312l > 0.0f ? 0.0f : this.f3312l;
        m9998q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m10030c(int i) {
        int size = this.f3302b.children().size();
        while (i < size) {
            this.f3302b.children().get(i).setAnimationObjectState(true);
            i++;
        }
    }

    /* renamed from: d */
    private float m10027d(int i) {
        return ((i / this.f3311k) * this.f3305e) + ((-this.f3305e) / 2.0f) + this.f3307g + (this.f3309i / 2.0f) + ((i % this.f3311k) * (this.f3310j + this.f3309i));
    }

    /* renamed from: com.censivn.C3DEngine.b.h.e.b$a */
    /* loaded from: classes.dex */
    public class C1069a {

        /* renamed from: a */
        public float f3345a;

        /* renamed from: b */
        public float f3346b;

        public C1069a() {
        }
    }
}
