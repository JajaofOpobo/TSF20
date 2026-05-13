package com.tsf.shell.p096f.p148h.p149a.p150a.p151a;

import android.graphics.Bitmap;
import android.view.MotionEvent;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p036d.C0937a;
import com.censivn.C3DEngine.p031b.p038f.C0970d;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p041g.C0986a;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.tsf.C1306b;
import com.tsf.shell.utils.C4187w;
import com.tsf.shell.utils.C4189x;
import java.util.ArrayList;
/* renamed from: com.tsf.shell.f.h.a.a.a.a */
/* loaded from: classes.dex */
public class C3032a extends C0980j {

    /* renamed from: b */
    private C3056f f9860b;

    /* renamed from: c */
    private C3056f f9861c;

    /* renamed from: d */
    private C3056f f9862d;

    /* renamed from: e */
    private C3045c f9863e;

    /* renamed from: f */
    private float f9864f;

    /* renamed from: g */
    private Number3d f9865g;

    /* renamed from: h */
    private Number3d f9866h;

    /* renamed from: i */
    private Number3d f9867i;

    /* renamed from: j */
    private ArrayList<Number3d> f9868j;

    /* renamed from: k */
    private C3044b f9869k;

    /* renamed from: m */
    private boolean f9871m = false;

    /* renamed from: n */
    private float[] f9872n = new float[2];

    /* renamed from: o */
    private boolean f9873o = false;

    /* renamed from: a */
    private C0980j f9859a = new C0980j();

    /* renamed from: l */
    private C0970d f9870l = new C0970d(C0892a.f2553D, C0892a.m10742a(200.0f));

    public C3032a(C3045c c3045c) {
        this.f9863e = c3045c;
        this.f9870l.m10378a(855638016, -1442840576);
        this.f9870l.alpha(0.0f);
        this.f9870l.visible(false);
        addChild(this.f9870l);
        addChild(this.f9859a);
        this.f9864f = C0892a.m10742a(330.0f);
        this.f9869k = new C3044b(C0853a.m10856d(), this.f9864f, C0892a.m10742a(90.0f), C0892a.m10742a(21.0f), -16731076);
        this.f9869k.m5435b(45.0f);
        this.f9860b = new C3056f(C0892a.m10742a(120.0f), C0892a.m10742a(120.0f)) { // from class: com.tsf.shell.f.h.a.a.a.a.1
            @Override // com.tsf.shell.p096f.p148h.p149a.p150a.p151a.C3056f
            /* renamed from: a */
            public Bitmap mo3707a() {
                return C4189x.m609a(C1306b.C1310d.contact_menu_call_icon);
            }
        };
        this.f9860b.setMouseEventListener(new C0937a(this.f9860b) { // from class: com.tsf.shell.f.h.a.a.a.a.2

            /* renamed from: b */
            private boolean f9876b = false;

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo502a(MotionEvent motionEvent) {
                if (C3032a.this.f9863e.m3743a() != null) {
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: e */
            public void mo1654e(MotionEvent motionEvent) {
                C3032a.this.m3757d();
                C3032a.this.m3764b();
                C3032a.this.f9871m = true;
                this.f9876b = false;
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: c */
            public void mo2122c(MotionEvent motionEvent) {
                this.f9876b = true;
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: f */
            public void mo1653f(MotionEvent motionEvent) {
                C3032a.this.f9871m = false;
                C3032a.this.m3759c();
                C3032a.this.f9869k.m3744a(C3032a.this.f9865g);
                C3032a.this.m3755e();
                C4189x.m600a(motionEvent, C3032a.this.f9872n);
                C0975i hittingTarget = C3032a.this.f9859a.getHittingTarget(C3032a.this.f9872n[0], C3032a.this.f9872n[1], true);
                if (hittingTarget != C3032a.this.f9860b) {
                    if (hittingTarget != C3032a.this.f9861c) {
                        if (hittingTarget == C3032a.this.f9862d) {
                            C4187w.m614b();
                            C4187w.m616a();
                            C0853a.m10865a().m10584b(new Runnable() { // from class: com.tsf.shell.f.h.a.a.a.a.2.3
                                @Override // java.lang.Runnable
                                public void run() {
                                    C3032a.this.f9863e.m3743a().m3705a().m2312h();
                                }
                            }, 500L);
                            return;
                        }
                        return;
                    }
                    C4187w.m614b();
                    C4187w.m616a();
                    C0853a.m10865a().m10584b(new Runnable() { // from class: com.tsf.shell.f.h.a.a.a.a.2.2
                        @Override // java.lang.Runnable
                        public void run() {
                            C3032a.this.f9863e.m3743a().m3705a().m2313g();
                        }
                    }, 500L);
                } else if (!this.f9876b) {
                    C4187w.m614b();
                    C4187w.m616a();
                    C0853a.m10865a().m10584b(new Runnable() { // from class: com.tsf.shell.f.h.a.a.a.a.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            C3032a.this.f9863e.m3743a().m3705a().m2314f();
                        }
                    }, 250L);
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo2129a(MotionEvent motionEvent, MotionEvent motionEvent2) {
                C3032a.this.m3768a(motionEvent2);
            }
        });
        this.f9860b.calAABB(1.2f, 1.2f, 1.0f);
        this.f9861c = new C3056f(C0892a.m10742a(100.0f), C0892a.m10742a(100.0f)) { // from class: com.tsf.shell.f.h.a.a.a.a.3
            @Override // com.tsf.shell.p096f.p148h.p149a.p150a.p151a.C3056f
            /* renamed from: a */
            public Bitmap mo3707a() {
                return C4189x.m609a(C1306b.C1310d.contact_menu_message_icon);
            }
        };
        this.f9861c.alpha(0.0f);
        this.f9861c.calAABB(4.0f, 4.0f, 1.0f);
        this.f9861c.setMouseEventListener(new C0937a(this.f9861c));
        this.f9862d = new C3056f(C0892a.m10742a(100.0f), C0892a.m10742a(100.0f)) { // from class: com.tsf.shell.f.h.a.a.a.a.4
            @Override // com.tsf.shell.p096f.p148h.p149a.p150a.p151a.C3056f
            /* renamed from: a */
            public Bitmap mo3707a() {
                return C4189x.m609a(C1306b.C1310d.contact_menu_mail_icon);
            }
        };
        this.f9862d.alpha(0.0f);
        this.f9862d.calAABB(4.0f, 4.0f, 1.0f);
        this.f9862d.setMouseEventListener(new C0937a(this.f9862d));
        this.f9859a.addChild((C0975i) this.f9869k.getVirtualTarget());
        this.f9859a.addChild(this.f9861c);
        this.f9859a.addChild(this.f9862d);
        this.f9859a.addChild(this.f9860b);
        float cos = (float) (Math.cos(0.7853981633974483d) * this.f9864f);
        float sin = (float) (Math.sin(0.7853981633974483d) * this.f9864f);
        this.f9865g = new Number3d(0.0f, 0.0f, 0.0f);
        this.f9866h = new Number3d(-cos, sin, 0.0f);
        this.f9867i = new Number3d(cos, sin, 0.0f);
        this.f9868j = new ArrayList<>();
        this.f9868j.add(this.f9865g);
        this.f9868j.add(this.f9866h);
        this.f9868j.add(this.f9867i);
    }

    /* renamed from: a */
    public void m3769a() {
        this.f9860b.m3706d();
        this.f9862d.m3706d();
        this.f9861c.m3706d();
        this.f9869k.m5434c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m3768a(final MotionEvent motionEvent) {
        if (!this.f9873o) {
            C0853a.m10865a().m10583c(new Runnable() { // from class: com.tsf.shell.f.h.a.a.a.a.5
                @Override // java.lang.Runnable
                public void run() {
                    if (C3032a.this.f9871m) {
                        C3032a.this.m3763b(motionEvent);
                    }
                    C3032a.this.f9873o = false;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m3763b(MotionEvent motionEvent) {
        float m594b;
        int i;
        float f;
        int size = this.f9868j.size();
        int i2 = -1;
        C4189x.m600a(motionEvent, this.f9872n);
        this.f9872n[1] = this.f9872n[1] - position().f2527y;
        if (Math.abs(this.f9872n[1] - this.f9868j.get(1).f2527y) < C0892a.m10742a(150.0f)) {
            this.f9872n[1] = this.f9868j.get(1).f2527y + C0892a.m10742a(150.0f);
        }
        int i3 = 0;
        float f2 = Float.MAX_VALUE;
        while (i3 < size) {
            Number3d number3d = this.f9868j.get(i3);
            float m594b2 = C4189x.m594b(number3d.f2526x, number3d.f2527y, this.f9872n[0], this.f9872n[1]);
            if (m594b2 < f2) {
                f = m594b2;
                i = i3;
            } else {
                i = i2;
                f = f2;
            }
            i3++;
            f2 = f;
            i2 = i;
        }
        int i4 = 0;
        float f3 = Float.MAX_VALUE;
        while (i4 < size) {
            if (i4 == i2) {
                m594b = f3;
            } else {
                Number3d number3d2 = this.f9868j.get(i4);
                m594b = C4189x.m594b(number3d2.f2526x, number3d2.f2527y, this.f9872n[0], this.f9872n[1]);
                if (m594b >= f3) {
                    m594b = f3;
                }
            }
            i4++;
            f3 = m594b;
        }
        this.f9869k.m3744a(this.f9868j.get(i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m3764b() {
        this.f9870l.m10373a(C0892a.f2553D);
        this.f9870l.m10371b(C0892a.f2554E + C0892a.m10742a(500.0f));
        this.f9870l.position().f2527y = (((this.f9870l.m10372b() / 2.0f) - position().f2527y) + C0892a.f2552C) - C0892a.f2560K;
        this.f9870l.visible(true);
        C1017d c1017d = new C1017d();
        c1017d.m10314a(255);
        C1014c.m10326a(this.f9870l);
        C1014c.m10325a(this.f9870l, 350, c1017d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m3759c() {
        C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.h.a.a.a.a.6
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo732a() {
                C3032a.this.f9870l.visible(false);
            }
        };
        c1017d.m10314a(0);
        C1014c.m10326a(this.f9870l);
        C1014c.m10325a(this.f9870l, 350, c1017d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public void m3757d() {
        C1017d c1017d = new C1017d();
        c1017d.m10314a(255);
        float cos = (float) (Math.cos(0.7853981633974483d) * this.f9864f);
        float sin = (float) (Math.sin(0.7853981633974483d) * this.f9864f);
        c1017d.mo10301f(-cos);
        c1017d.mo10298h(sin);
        c1017d.m10313a(C0986a.f2950e);
        C1014c.m10326a(this.f9861c);
        C1014c.m10325a(this.f9861c, 500, c1017d);
        C1017d c1017d2 = new C1017d();
        c1017d2.m10314a(255);
        c1017d2.mo10301f(cos);
        c1017d2.mo10298h(sin);
        c1017d2.m10313a(C0986a.f2950e);
        C1014c.m10326a(this.f9862d);
        C1014c.m10325a(this.f9862d, 350, c1017d2);
        this.f9862d.visible(true);
        this.f9861c.visible(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public void m3755e() {
        C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.h.a.a.a.a.7
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo732a() {
                C3032a.this.f9861c.visible(false);
            }
        };
        c1017d.m10314a(0);
        c1017d.mo10301f(0.0f);
        c1017d.mo10298h(0.0f);
        C1014c.m10326a(this.f9861c);
        C1014c.m10325a(this.f9861c, 300, c1017d);
        C1017d c1017d2 = new C1017d() { // from class: com.tsf.shell.f.h.a.a.a.a.8
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo732a() {
                C3032a.this.f9862d.visible(false);
            }
        };
        c1017d2.m10314a(0);
        c1017d2.mo10301f(0.0f);
        c1017d2.mo10298h(0.0f);
        C1014c.m10326a(this.f9862d);
        C1014c.m10325a(this.f9862d, 300, c1017d2);
    }
}
