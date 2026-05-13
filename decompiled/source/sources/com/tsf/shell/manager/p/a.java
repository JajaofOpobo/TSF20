package com.tsf.shell.manager.p;

import android.content.Intent;
import android.view.MotionEvent;
import com.tsf.shell.Home;
import com.tsf.shell.f.f.g;
import com.tsf.shell.theme.inside.mix.ThemeClockManager;
import com.tsf.shell.utils.x;
/* loaded from: classes.dex */
public class a {
    private b a;
    private float b = 300.0f;
    private float c = 36.0f;
    private float d = com.censivn.C3DEngine.b.b.a.a(200.0f);

    public void a() {
        this.a = new b();
        com.censivn.C3DEngine.a.d.d().a(false);
        com.censivn.C3DEngine.b.c.b.c();
        com.tsf.shell.manager.a.b.b(Home.b());
        com.censivn.C3DEngine.a.a().b(new Runnable() { // from class: com.tsf.shell.manager.p.a.1
            @Override // java.lang.Runnable
            public void run() {
                a.this.b();
            }
        }, 500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        float d = com.tsf.shell.manager.a.o.d();
        float e = com.tsf.shell.manager.a.o.e();
        this.a.position().x = 0.0f;
        this.a.position().y = 0.0f;
        this.a.rotation().z = 80.0f;
        AnonymousClass2 anonymousClass2 = new AnonymousClass2();
        anonymousClass2.f(d);
        anonymousClass2.h(e);
        anonymousClass2.a(255);
        com.censivn.C3DEngine.b.g.c.a(this.a, 1000, anonymousClass2);
        com.tsf.shell.manager.a.j.a(this.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.shell.manager.p.a$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass2 extends com.censivn.C3DEngine.b.g.d {
        AnonymousClass2() {
        }

        @Override // com.censivn.C3DEngine.b.g.d
        public void a() {
            com.censivn.C3DEngine.a.a().b(new Runnable() { // from class: com.tsf.shell.manager.p.a.2.1
                @Override // java.lang.Runnable
                public void run() {
                    a.this.a.b();
                    com.tsf.shell.manager.a.o.l();
                    com.censivn.C3DEngine.a.a().b(new Runnable() { // from class: com.tsf.shell.manager.p.a.2.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            a.this.c();
                        }
                    }, 300L);
                }
            }, 300L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        com.tsf.shell.manager.a.h.w();
        float d = com.tsf.shell.manager.a.o.d();
        float e = com.tsf.shell.manager.a.o.e();
        float[] a = x.a(d, e);
        float f = a[0];
        float f2 = a[1];
        float f3 = com.censivn.C3DEngine.b.b.a.F;
        this.a.a(30.0f);
        com.censivn.C3DEngine.b.g.c.a(new com.censivn.C3DEngine.b.g.b.b(), 1500, new AnonymousClass3(d, com.censivn.C3DEngine.b.b.a.A - (200.0f * com.censivn.C3DEngine.b.b.a.c), e, e + (com.censivn.C3DEngine.b.b.a.A - d), f, f3, f2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.shell.manager.p.a$3  reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass3 extends com.censivn.C3DEngine.b.g.d {
        final /* synthetic */ float C;
        final /* synthetic */ float a;
        final /* synthetic */ float b;
        final /* synthetic */ float c;
        final /* synthetic */ float d;
        final /* synthetic */ float e;
        final /* synthetic */ float f;

        AnonymousClass3(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
            this.a = f;
            this.b = f2;
            this.c = f3;
            this.d = f4;
            this.e = f5;
            this.f = f6;
            this.C = f7;
        }

        @Override // com.censivn.C3DEngine.b.g.d
        public void a(float f) {
            a.this.a.position().x = this.a + ((this.b - this.a) * f);
            a.this.a.position().y = this.c + ((this.d - this.c) * f);
            com.tsf.shell.manager.a.h.a(this.e + ((this.f - this.e) * f), this.C + ((0.0f - this.C) * f), this.e, this.C);
        }

        @Override // com.censivn.C3DEngine.b.g.d
        public void a() {
            com.censivn.C3DEngine.b.g.b.b bVar = new com.censivn.C3DEngine.b.g.b.b();
            float f = a.this.a.position().x;
            float f2 = a.this.a.position().y;
            float b = com.tsf.shell.manager.a.h.r().b(1);
            float f3 = b - (com.censivn.C3DEngine.b.b.a.F / 2.0f);
            float f4 = this.d - (com.censivn.C3DEngine.b.b.a.A - f3);
            a.this.a.a(-30.0f);
            com.censivn.C3DEngine.b.g.c.a(bVar, 1500, new AnonymousClass1(f, f3, f2, f4, b));
        }

        /* renamed from: com.tsf.shell.manager.p.a$3$1  reason: invalid class name */
        /* loaded from: classes.dex */
        class AnonymousClass1 extends com.censivn.C3DEngine.b.g.d {
            final /* synthetic */ float a;
            final /* synthetic */ float b;
            final /* synthetic */ float c;
            final /* synthetic */ float d;
            final /* synthetic */ float e;

            AnonymousClass1(float f, float f2, float f3, float f4, float f5) {
                this.a = f;
                this.b = f2;
                this.c = f3;
                this.d = f4;
                this.e = f5;
            }

            @Override // com.censivn.C3DEngine.b.g.d
            public void a(float f) {
                a.this.a.position().x = this.a + ((this.b - this.a) * f);
                a.this.a.position().y = this.c + ((this.d - this.c) * f);
                com.tsf.shell.manager.a.h.a(AnonymousClass3.this.f + ((this.e - AnonymousClass3.this.f) * f), ((AnonymousClass3.this.C - 0.0f) * f) + 0.0f, AnonymousClass3.this.e, AnonymousClass3.this.C);
            }

            @Override // com.censivn.C3DEngine.b.g.d
            public void a() {
                com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.manager.p.a.3.1.1
                    @Override // com.censivn.C3DEngine.b.g.d
                    public void a() {
                        com.tsf.shell.manager.a.o.m();
                        com.tsf.shell.manager.a.h.x();
                        a.this.a.position().x = 0.0f;
                        a.this.a.position().y = 0.0f;
                        com.censivn.C3DEngine.a.a().b(new Runnable() { // from class: com.tsf.shell.manager.p.a.3.1.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                a.this.d();
                            }
                        }, 700L);
                    }
                };
                dVar.a(0);
                com.censivn.C3DEngine.b.g.c.a(a.this.a, 500, dVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.shell.manager.p.a$4  reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass4 extends com.censivn.C3DEngine.b.g.d {
        AnonymousClass4() {
        }

        /* renamed from: com.tsf.shell.manager.p.a$4$1  reason: invalid class name */
        /* loaded from: classes.dex */
        class AnonymousClass1 implements Runnable {
            AnonymousClass1() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.a.b();
                com.censivn.C3DEngine.a.a().b(new RunnableC01371(), 300L);
            }

            /* renamed from: com.tsf.shell.manager.p.a$4$1$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: classes.dex */
            class RunnableC01371 implements Runnable {
                RunnableC01371() {
                }

                /* renamed from: com.tsf.shell.manager.p.a$4$1$1$1  reason: invalid class name and collision with other inner class name */
                /* loaded from: classes.dex */
                class C01381 extends com.censivn.C3DEngine.b.g.d {
                    C01381() {
                    }

                    @Override // com.censivn.C3DEngine.b.g.d
                    public void a(float f) {
                        com.tsf.shell.manager.a.h.s().a(45.0f * (1.0f - f));
                    }

                    /* renamed from: com.tsf.shell.manager.p.a$4$1$1$1$1  reason: invalid class name and collision with other inner class name */
                    /* loaded from: classes.dex */
                    class C01391 extends com.censivn.C3DEngine.b.g.d {
                        C01391() {
                        }

                        @Override // com.censivn.C3DEngine.b.g.d
                        public void a(float f) {
                            com.tsf.shell.manager.a.h.s().b(a.this.b * f);
                            com.tsf.shell.manager.a.h.s().a(a.this.c * f);
                        }

                        @Override // com.censivn.C3DEngine.b.g.d
                        public void a() {
                            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.manager.p.a.4.1.1.1.1.1
                                @Override // com.censivn.C3DEngine.b.g.d
                                public void a(float f) {
                                    com.tsf.shell.manager.a.h.s().b(a.this.b - ((a.this.b * 2.0f) * f));
                                    com.tsf.shell.manager.a.h.s().a(a.this.c - ((a.this.c * 2.0f) * f));
                                }

                                @Override // com.censivn.C3DEngine.b.g.d
                                public void a() {
                                    com.censivn.C3DEngine.b.g.d dVar2 = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.manager.p.a.4.1.1.1.1.1.1
                                        @Override // com.censivn.C3DEngine.b.g.d
                                        public void a(float f) {
                                            com.tsf.shell.manager.a.h.s().b((-a.this.b) + ((a.this.b + com.tsf.shell.manager.a.h.s().a(1)) * f));
                                            com.tsf.shell.manager.a.h.s().a((-a.this.c) + (a.this.c * f));
                                        }

                                        @Override // com.censivn.C3DEngine.b.g.d
                                        public void a() {
                                            com.tsf.shell.manager.a.h.s().a((g) null);
                                            com.tsf.shell.manager.a.h.s().d((MotionEvent) null);
                                            com.tsf.shell.manager.a.h.g();
                                            a.this.e();
                                        }
                                    };
                                    dVar2.f(0.0f);
                                    dVar2.h(0.0f);
                                    com.censivn.C3DEngine.b.g.c.a(a.this.a, 1000, dVar2);
                                    a.this.a.a(20.0f);
                                }
                            };
                            dVar.f(com.censivn.C3DEngine.b.b.a.z + com.censivn.C3DEngine.b.b.a.a(100.0f));
                            dVar.h(a.this.d);
                            com.censivn.C3DEngine.b.g.c.a(a.this.a, 2000, dVar);
                            a.this.a.a(-30.0f);
                        }
                    }

                    @Override // com.censivn.C3DEngine.b.g.d
                    public void a() {
                        C01391 c01391 = new C01391();
                        c01391.f(com.censivn.C3DEngine.b.b.a.A - com.censivn.C3DEngine.b.b.a.a(100.0f));
                        c01391.h(-a.this.d);
                        com.censivn.C3DEngine.b.g.c.a(a.this.a, 1000, c01391);
                        a.this.a.a(30.0f);
                        com.tsf.shell.manager.a.h.s().e();
                    }
                }

                @Override // java.lang.Runnable
                public void run() {
                    C01381 c01381 = new C01381();
                    c01381.h(0.0f);
                    com.censivn.C3DEngine.b.g.c.a(a.this.a, 500, c01381);
                    com.tsf.shell.manager.a.h.s().e();
                }
            }
        }

        @Override // com.censivn.C3DEngine.b.g.d
        public void a() {
            com.censivn.C3DEngine.a.a().b(new AnonymousClass1(), 300L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        AnonymousClass4 anonymousClass4 = new AnonymousClass4();
        anonymousClass4.h(com.tsf.shell.manager.a.g.a.l().b + com.tsf.shell.manager.a.g.a.l().h);
        anonymousClass4.a(255);
        com.censivn.C3DEngine.b.g.c.a(this.a, 500, anonymousClass4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.manager.p.a.5
            @Override // com.censivn.C3DEngine.b.g.d
            public void a() {
                com.tsf.shell.manager.a.b.c(Home.b());
                com.censivn.C3DEngine.b.c.b.b();
                com.censivn.C3DEngine.a.d.d().a(true);
                com.tsf.shell.manager.a.j.b(a.this.a);
                a.this.a.a();
                com.censivn.C3DEngine.a.d().sendBroadcast(new Intent(ThemeClockManager.ALARM_ON_CLICK));
                Home.b().o();
            }
        };
        dVar.a(0);
        com.censivn.C3DEngine.b.g.c.a(this.a, 500, dVar);
    }
}
