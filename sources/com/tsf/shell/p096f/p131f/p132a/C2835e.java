package com.tsf.shell.p096f.p131f.p132a;

import android.view.MotionEvent;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p036d.C0937a;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.censivn.C3DEngine.p031b.p041g.C0986a;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.tsf.C1306b;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.action.C3398f;
import com.tsf.shell.manager.p185p.C3595e;
import com.tsf.shell.p096f.p118e.C2636k;
/* renamed from: com.tsf.shell.f.f.a.e */
/* loaded from: classes.dex */
public class C2835e extends C0980j {

    /* renamed from: c */
    private static final float f9211c = C0892a.m10742a(200.0f);

    /* renamed from: d */
    private static final int f9212d = C0892a.m10735b(100.0f);

    /* renamed from: b */
    private C2862h f9214b;

    /* renamed from: e */
    private C2840a f9215e;

    /* renamed from: a */
    private C0980j f9213a = new C0980j();

    /* renamed from: f */
    private C2840a f9216f = new C2840a(C1306b.C1310d.drawer_more_button) { // from class: com.tsf.shell.f.f.a.e.1
        @Override // com.tsf.shell.p096f.p131f.p132a.C2835e.C2840a
        /* renamed from: a */
        public void mo4560a() {
            C2835e.this.f9214b.m4457aj();
        }
    };

    /* renamed from: g */
    private C2840a f9217g = new C2840a(C1306b.C1310d.drawer_search_button) { // from class: com.tsf.shell.f.f.a.e.2
        @Override // com.tsf.shell.p096f.p131f.p132a.C2835e.C2840a
        /* renamed from: a */
        public void mo4560a() {
            C3359a.f11090d.m2670a(500);
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.shell.f.f.a.e$a */
    /* loaded from: classes.dex */
    public static class C2840a extends C0981k {

        /* renamed from: e */
        private static C2636k f9226e;

        /* renamed from: a */
        private TextureElement f9227a;

        /* renamed from: d */
        private int f9228d;

        /* renamed from: f */
        private boolean f9229f;

        /* renamed from: g */
        private C3595e.C3597a f9230g;

        public C2840a(int i) {
            super(C2835e.f9212d, C2835e.f9212d, false);
            this.f9227a = new TextureElement(0, false);
            this.f9228d = 0;
            this.f9229f = false;
            textures().addElement(this.f9227a);
            calAABB(1.2f, 1.2f, 1.0f);
            this.f9228d = i;
            setMouseEventListener(new C0937a(this) { // from class: com.tsf.shell.f.f.a.e.a.1
                @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
                /* renamed from: a */
                public void mo502a(MotionEvent motionEvent) {
                    if (C2840a.this.f9230g != null) {
                        C2840a.this.f9230g.m1916b();
                    }
                    C2840a.this.mo4560a();
                }
            });
        }

        /* renamed from: a */
        public void m4559a(int i) {
            this.f9230g = C3359a.f11087a.m1929a(i);
            if (this.f9230g.m1919a()) {
                m4557d();
                this.f9230g.m1918a(new C3595e.C3597a.C3598a() { // from class: com.tsf.shell.f.f.a.e.a.2
                    @Override // com.tsf.shell.manager.p185p.C3595e.C3597a.C3598a
                    /* renamed from: a */
                    public void mo720a() {
                        C2840a.this.m4556e();
                    }
                });
            }
        }

        /* renamed from: a */
        public void mo4560a() {
        }

        @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
        public void onDrawStart() {
            if (this.f9227a.f2529id == 0) {
                C0853a.m10853g().m10541a(this.f9227a, this.f9228d, C2835e.f9212d, C2835e.f9212d);
            }
        }

        /* renamed from: d */
        public void m4557d() {
            if (f9226e == null) {
                f9226e = new C2636k();
                f9226e.position().f2526x = C0892a.m10742a(50.0f);
                f9226e.position().f2527y = C0892a.m10742a(50.0f);
            }
            this.f9229f = true;
        }

        /* renamed from: e */
        public void m4556e() {
            this.f9229f = false;
        }

        @Override // com.censivn.C3DEngine.p031b.p038f.C0980j
        public void onDrawChildEnd() {
            if (this.f9229f) {
                f9226e.dispatchDraw();
            }
        }
    }

    public C2835e(C2862h c2862h) {
        this.f9214b = c2862h;
        this.f9217g.m4559a(C3595e.f11929n);
        this.f9215e = new C2840a(C1306b.C1310d.drawer_home);
        this.f9215e.setMouseEventListener(new C0937a(this.f9215e) { // from class: com.tsf.shell.f.f.a.e.3

            /* renamed from: b */
            private float f9221b;

            /* renamed from: d */
            private float f9222d;

            /* renamed from: e */
            private boolean f9223e = false;

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo502a(MotionEvent motionEvent) {
                C3359a.f11090d.m2670a(100);
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: e */
            public void mo1654e(MotionEvent motionEvent) {
                this.f9223e = false;
                this.f9221b = motionEvent.getX();
                this.f9222d = motionEvent.getY();
                C3398f.m2644a(motionEvent);
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo527a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if (this.f9223e) {
                    C3359a.f11094h.m4099a(motionEvent2.getX(), motionEvent2.getY(), this.f9221b, this.f9222d);
                    return;
                }
                C3359a.f11094h.m4013w();
                C3359a.f11094h.m4099a(motionEvent2.getX(), motionEvent2.getY(), this.f9221b, this.f9222d);
                this.f9223e = true;
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: f */
            public void mo1653f(MotionEvent motionEvent) {
                if (this.f9223e) {
                    C3359a.f11094h.m4011x();
                    this.f9223e = false;
                }
            }
        });
        this.f9213a.addChild(this.f9215e);
        this.f9213a.addChild(this.f9216f);
        this.f9213a.addChild(this.f9217g);
        addChild(this.f9213a);
    }

    /* renamed from: a */
    public void m4564a(boolean z) {
        m4563a(z, null);
    }

    /* renamed from: a */
    public void m4563a(boolean z, final Runnable runnable) {
        C1014c.m10326a(this.f9213a);
        if (z) {
            C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.f.a.e.4
                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: a */
                public void mo732a() {
                    C2835e.this.f9213a.visible(false);
                    if (runnable != null) {
                        runnable.run();
                    }
                }
            };
            c1017d.m10314a(0);
            c1017d.mo10298h(-C0892a.m10742a(200.0f));
            C1014c.m10325a(this.f9213a, 350, c1017d);
            return;
        }
        this.f9213a.position().f2527y = -C0892a.m10742a(200.0f);
        this.f9213a.alpha(0.0f);
        if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: b */
    public void m4561b(boolean z) {
        C1014c.m10326a(this.f9213a);
        this.f9213a.visible(true);
        if (z) {
            C1017d c1017d = new C1017d();
            c1017d.m10314a(255);
            c1017d.mo10298h(0.0f);
            c1017d.m10313a(C0986a.f2959n);
            C1014c.m10325a(this.f9213a, 600, c1017d);
            return;
        }
        this.f9213a.position().f2527y = 0.0f;
        this.f9213a.alpha(255.0f);
    }

    /* renamed from: a */
    public void m4566a(int i, int i2, int i3, int i4) {
        position().f2527y = C0892a.f2552C + (f9211c / 2.0f);
        this.f9216f.position().f2526x = C0892a.f2550A - C0892a.m10742a(125.0f);
        this.f9217g.position().f2526x = C0892a.f2590z + C0892a.m10742a(125.0f);
    }
}
