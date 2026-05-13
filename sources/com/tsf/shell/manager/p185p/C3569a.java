package com.tsf.shell.manager.p185p;

import android.content.Intent;
import android.view.MotionEvent;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.p030a.C0864d;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p035c.C0915b;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.censivn.C3DEngine.p031b.p041g.p043b.C1013b;
import com.tsf.shell.Home;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.p096f.p131f.C2932g;
import com.tsf.shell.theme.inside.mix.ThemeClockManager;
import com.tsf.shell.utils.C4189x;
/* renamed from: com.tsf.shell.manager.p.a */
/* loaded from: classes.dex */
public class C3569a {

    /* renamed from: a */
    private C3586b f11858a;

    /* renamed from: b */
    private float f11859b = 300.0f;

    /* renamed from: c */
    private float f11860c = 36.0f;

    /* renamed from: d */
    private float f11861d = C0892a.m10742a(200.0f);

    /* renamed from: a */
    public void m1966a() {
        this.f11858a = new C3586b();
        C0864d.m10805d().m10818a(false);
        C0915b.m10593c();
        C3359a.f11088b.m10559b(Home.m6177b());
        C0853a.m10865a().m10584b(new Runnable() { // from class: com.tsf.shell.manager.p.a.1
            @Override // java.lang.Runnable
            public void run() {
                C3569a.this.m1964b();
            }
        }, 500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m1964b() {
        float m3621d = C3359a.f11101o.m3621d();
        float m3619e = C3359a.f11101o.m3619e();
        this.f11858a.position().f2526x = 0.0f;
        this.f11858a.position().f2527y = 0.0f;
        this.f11858a.rotation().f2528z = 80.0f;
        C35712 c35712 = new C35712();
        c35712.mo10301f(m3621d);
        c35712.mo10298h(m3619e);
        c35712.m10314a(255);
        C1014c.m10325a(this.f11858a, 1000, c35712);
        C3359a.f11096j.m2232a(this.f11858a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.shell.manager.p.a$2 */
    /* loaded from: classes.dex */
    public class C35712 extends C1017d {
        C35712() {
        }

        @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
        /* renamed from: a */
        public void mo732a() {
            C0853a.m10865a().m10584b(new Runnable() { // from class: com.tsf.shell.manager.p.a.2.1
                @Override // java.lang.Runnable
                public void run() {
                    C3569a.this.f11858a.m1947b();
                    C3359a.f11101o.m3606l();
                    C0853a.m10865a().m10584b(new Runnable() { // from class: com.tsf.shell.manager.p.a.2.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            C3569a.this.m1962c();
                        }
                    }, 300L);
                }
            }, 300L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m1962c() {
        C3359a.f11094h.m4013w();
        float m3621d = C3359a.f11101o.m3621d();
        float m3619e = C3359a.f11101o.m3619e();
        float[] m612a = C4189x.m612a(m3621d, m3619e);
        float f = m612a[0];
        float f2 = m612a[1];
        float f3 = C0892a.f2555F;
        this.f11858a.m1952a(30.0f);
        C1014c.m10325a(new C1013b(), 1500, new C35743(m3621d, C0892a.f2550A - (200.0f * C0892a.f2567c), m3619e, m3619e + (C0892a.f2550A - m3621d), f, f3, f2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.shell.manager.p.a$3 */
    /* loaded from: classes.dex */
    public class C35743 extends C1017d {

        /* renamed from: C */
        final /* synthetic */ float f11866C;

        /* renamed from: a */
        final /* synthetic */ float f11868a;

        /* renamed from: b */
        final /* synthetic */ float f11869b;

        /* renamed from: c */
        final /* synthetic */ float f11870c;

        /* renamed from: d */
        final /* synthetic */ float f11871d;

        /* renamed from: e */
        final /* synthetic */ float f11872e;

        /* renamed from: f */
        final /* synthetic */ float f11873f;

        C35743(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
            this.f11868a = f;
            this.f11869b = f2;
            this.f11870c = f3;
            this.f11871d = f4;
            this.f11872e = f5;
            this.f11873f = f6;
            this.f11866C = f7;
        }

        @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
        /* renamed from: a */
        public void mo518a(float f) {
            C3569a.this.f11858a.position().f2526x = this.f11868a + ((this.f11869b - this.f11868a) * f);
            C3569a.this.f11858a.position().f2527y = this.f11870c + ((this.f11871d - this.f11870c) * f);
            C3359a.f11094h.m4099a(this.f11872e + ((this.f11873f - this.f11872e) * f), this.f11866C + ((0.0f - this.f11866C) * f), this.f11872e, this.f11866C);
        }

        @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
        /* renamed from: a */
        public void mo732a() {
            C1013b c1013b = new C1013b();
            float f = C3569a.this.f11858a.position().f2526x;
            float f2 = C3569a.this.f11858a.position().f2527y;
            float m4300b = C3359a.f11094h.m4023r().m4300b(1);
            float f3 = m4300b - (C0892a.f2555F / 2.0f);
            float f4 = this.f11871d - (C0892a.f2550A - f3);
            C3569a.this.f11858a.m1952a(-30.0f);
            C1014c.m10325a(c1013b, 1500, new C35751(f, f3, f2, f4, m4300b));
        }

        /* renamed from: com.tsf.shell.manager.p.a$3$1 */
        /* loaded from: classes.dex */
        class C35751 extends C1017d {

            /* renamed from: a */
            final /* synthetic */ float f11874a;

            /* renamed from: b */
            final /* synthetic */ float f11875b;

            /* renamed from: c */
            final /* synthetic */ float f11876c;

            /* renamed from: d */
            final /* synthetic */ float f11877d;

            /* renamed from: e */
            final /* synthetic */ float f11878e;

            C35751(float f, float f2, float f3, float f4, float f5) {
                this.f11874a = f;
                this.f11875b = f2;
                this.f11876c = f3;
                this.f11877d = f4;
                this.f11878e = f5;
            }

            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo518a(float f) {
                C3569a.this.f11858a.position().f2526x = this.f11874a + ((this.f11875b - this.f11874a) * f);
                C3569a.this.f11858a.position().f2527y = this.f11876c + ((this.f11877d - this.f11876c) * f);
                C3359a.f11094h.m4099a(C35743.this.f11873f + ((this.f11878e - C35743.this.f11873f) * f), ((C35743.this.f11866C - 0.0f) * f) + 0.0f, C35743.this.f11872e, C35743.this.f11866C);
            }

            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo732a() {
                C1017d c1017d = new C1017d() { // from class: com.tsf.shell.manager.p.a.3.1.1
                    @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                    /* renamed from: a */
                    public void mo732a() {
                        C3359a.f11101o.m3605m();
                        C3359a.f11094h.m4011x();
                        C3569a.this.f11858a.position().f2526x = 0.0f;
                        C3569a.this.f11858a.position().f2527y = 0.0f;
                        C0853a.m10865a().m10584b(new Runnable() { // from class: com.tsf.shell.manager.p.a.3.1.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                C3569a.this.m1960d();
                            }
                        }, 700L);
                    }
                };
                c1017d.m10314a(0);
                C1014c.m10325a(C3569a.this.f11858a, 500, c1017d);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.shell.manager.p.a$4 */
    /* loaded from: classes.dex */
    public class C35784 extends C1017d {
        C35784() {
        }

        /* renamed from: com.tsf.shell.manager.p.a$4$1 */
        /* loaded from: classes.dex */
        class RunnableC35791 implements Runnable {
            RunnableC35791() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C3569a.this.f11858a.m1947b();
                C0853a.m10865a().m10584b(new RunnableC35801(), 300L);
            }

            /* renamed from: com.tsf.shell.manager.p.a$4$1$1 */
            /* loaded from: classes.dex */
            class RunnableC35801 implements Runnable {
                RunnableC35801() {
                }

                /* renamed from: com.tsf.shell.manager.p.a$4$1$1$1 */
                /* loaded from: classes.dex */
                class C35811 extends C1017d {
                    C35811() {
                    }

                    @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                    /* renamed from: a */
                    public void mo518a(float f) {
                        C3359a.f11094h.m4021s().m3937a(45.0f * (1.0f - f));
                    }

                    /* renamed from: com.tsf.shell.manager.p.a$4$1$1$1$1 */
                    /* loaded from: classes.dex */
                    class C35821 extends C1017d {
                        C35821() {
                        }

                        @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                        /* renamed from: a */
                        public void mo518a(float f) {
                            C3359a.f11094h.m4021s().m3916b(C3569a.this.f11859b * f);
                            C3359a.f11094h.m4021s().m3937a(C3569a.this.f11860c * f);
                        }

                        @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                        /* renamed from: a */
                        public void mo732a() {
                            C1017d c1017d = new C1017d() { // from class: com.tsf.shell.manager.p.a.4.1.1.1.1.1
                                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                                /* renamed from: a */
                                public void mo518a(float f) {
                                    C3359a.f11094h.m4021s().m3916b(C3569a.this.f11859b - ((C3569a.this.f11859b * 2.0f) * f));
                                    C3359a.f11094h.m4021s().m3937a(C3569a.this.f11860c - ((C3569a.this.f11860c * 2.0f) * f));
                                }

                                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                                /* renamed from: a */
                                public void mo732a() {
                                    C1017d c1017d2 = new C1017d() { // from class: com.tsf.shell.manager.p.a.4.1.1.1.1.1.1
                                        @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                                        /* renamed from: a */
                                        public void mo518a(float f) {
                                            C3359a.f11094h.m4021s().m3916b((-C3569a.this.f11859b) + ((C3569a.this.f11859b + C3359a.f11094h.m4021s().m3936a(1)) * f));
                                            C3359a.f11094h.m4021s().m3937a((-C3569a.this.f11860c) + (C3569a.this.f11860c * f));
                                        }

                                        @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                                        /* renamed from: a */
                                        public void mo732a() {
                                            C3359a.f11094h.m4021s().m3929a((C2932g) null);
                                            C3359a.f11094h.m4021s().m3897d((MotionEvent) null);
                                            C3359a.f11094h.m4045g();
                                            C3569a.this.m1958e();
                                        }
                                    };
                                    c1017d2.mo10301f(0.0f);
                                    c1017d2.mo10298h(0.0f);
                                    C1014c.m10325a(C3569a.this.f11858a, 1000, c1017d2);
                                    C3569a.this.f11858a.m1952a(20.0f);
                                }
                            };
                            c1017d.mo10301f(C0892a.f2590z + C0892a.m10742a(100.0f));
                            c1017d.mo10298h(C3569a.this.f11861d);
                            C1014c.m10325a(C3569a.this.f11858a, 2000, c1017d);
                            C3569a.this.f11858a.m1952a(-30.0f);
                        }
                    }

                    @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                    /* renamed from: a */
                    public void mo732a() {
                        C35821 c35821 = new C35821();
                        c35821.mo10301f(C0892a.f2550A - C0892a.m10742a(100.0f));
                        c35821.mo10298h(-C3569a.this.f11861d);
                        C1014c.m10325a(C3569a.this.f11858a, 1000, c35821);
                        C3569a.this.f11858a.m1952a(30.0f);
                        C3359a.f11094h.m4021s().m3892e();
                    }
                }

                @Override // java.lang.Runnable
                public void run() {
                    C35811 c35811 = new C35811();
                    c35811.mo10298h(0.0f);
                    C1014c.m10325a(C3569a.this.f11858a, 500, c35811);
                    C3359a.f11094h.m4021s().m3892e();
                }
            }
        }

        @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
        /* renamed from: a */
        public void mo732a() {
            C0853a.m10865a().m10584b(new RunnableC35791(), 300L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public void m1960d() {
        C35784 c35784 = new C35784();
        c35784.mo10298h(C3359a.f11093g.f7458a.m5707l().f7691b + C3359a.f11093g.f7458a.m5707l().f7697h);
        c35784.m10314a(255);
        C1014c.m10325a(this.f11858a, 500, c35784);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public void m1958e() {
        C1017d c1017d = new C1017d() { // from class: com.tsf.shell.manager.p.a.5
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo732a() {
                C3359a.f11088b.m10552c(Home.m6177b());
                C0915b.m10596b();
                C0864d.m10805d().m10818a(true);
                C3359a.f11096j.m2223b(C3569a.this.f11858a);
                C3569a.this.f11858a.m1953a();
                C0853a.m10856d().sendBroadcast(new Intent(ThemeClockManager.ALARM_ON_CLICK));
                Home.m6177b().m6161o();
            }
        };
        c1017d.m10314a(0);
        C1014c.m10325a(this.f11858a, 500, c1017d);
    }
}
