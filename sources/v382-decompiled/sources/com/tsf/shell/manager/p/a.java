package com.tsf.shell.manager.p;

import android.content.Intent;
import android.view.MotionEvent;
import com.censivn.C3DEngine.b.g.w;
import com.censivn.C3DEngine.b.g.x;
import com.tsf.shell.Home;
import com.tsf.shell.theme.inside.mix.ThemeClockManager;

/* loaded from: classes.dex */
public class a {
    private b a;
    private float b = 300.0f;
    private float c = 36.0f;
    private float d = com.censivn.C3DEngine.b.b.a.a(200.0f);

    public void a() {
        this.a = new b();
        com.censivn.C3DEngine.a.h.d().a(false);
        com.censivn.C3DEngine.b.c.c.c();
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
        w.a(this.a, 1000, anonymousClass2);
        com.tsf.shell.manager.a.j.a(this.a);
    }

    /* renamed from: com.tsf.shell.manager.p.a$2, reason: invalid class name */
    class AnonymousClass2 extends x {
        AnonymousClass2() {
        }

        @Override // com.censivn.C3DEngine.b.g.x
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
        float[] a = com.tsf.shell.utils.x.a(d, e);
        float f = a[0];
        float f2 = a[1];
        float f3 = com.censivn.C3DEngine.b.b.a.F;
        this.a.a(30.0f);
        w.a(new com.censivn.C3DEngine.b.g.b.b(), 1500, new AnonymousClass3(d, com.censivn.C3DEngine.b.b.a.A - (200.0f * com.censivn.C3DEngine.b.b.a.c), e, e + (com.censivn.C3DEngine.b.b.a.A - d), f, f3, f2));
    }

    /* renamed from: com.tsf.shell.manager.p.a$3, reason: invalid class name */
    class AnonymousClass3 extends x {
        private final /* synthetic */ float A;
        private final /* synthetic */ float B;
        private final /* synthetic */ float C;
        private final /* synthetic */ float D;
        private final /* synthetic */ float x;
        private final /* synthetic */ float y;
        private final /* synthetic */ float z;

        AnonymousClass3(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
            this.x = f;
            this.y = f2;
            this.z = f3;
            this.A = f4;
            this.B = f5;
            this.C = f6;
            this.D = f7;
        }

        @Override // com.censivn.C3DEngine.b.g.x
        public void a(float f) {
            a.this.a.position().x = this.x + ((this.y - this.x) * f);
            a.this.a.position().y = this.z + ((this.A - this.z) * f);
            com.tsf.shell.manager.a.h.a(this.B + ((this.C - this.B) * f), this.D + ((0.0f - this.D) * f), this.B, this.D);
        }

        @Override // com.censivn.C3DEngine.b.g.x
        public void a() {
            com.censivn.C3DEngine.b.g.b.b bVar = new com.censivn.C3DEngine.b.g.b.b();
            float f = a.this.a.position().x;
            float f2 = a.this.a.position().y;
            float b = com.tsf.shell.manager.a.h.r().b(1);
            float f3 = b - (com.censivn.C3DEngine.b.b.a.F / 2.0f);
            float f4 = this.A - (com.censivn.C3DEngine.b.b.a.A - f3);
            a.this.a.a(-30.0f);
            w.a(bVar, 1500, new AnonymousClass1(f, f3, f2, f4, this.C, b, this.D, this.B));
        }

        /* renamed from: com.tsf.shell.manager.p.a$3$1, reason: invalid class name */
        class AnonymousClass1 extends x {
            private final /* synthetic */ float A;
            private final /* synthetic */ float B;
            private final /* synthetic */ float C;
            private final /* synthetic */ float D;
            private final /* synthetic */ float E;
            private final /* synthetic */ float x;
            private final /* synthetic */ float y;
            private final /* synthetic */ float z;

            AnonymousClass1(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
                this.x = f;
                this.y = f2;
                this.z = f3;
                this.A = f4;
                this.B = f5;
                this.C = f6;
                this.D = f7;
                this.E = f8;
            }

            @Override // com.censivn.C3DEngine.b.g.x
            public void a(float f) {
                a.this.a.position().x = this.x + ((this.y - this.x) * f);
                a.this.a.position().y = this.z + ((this.A - this.z) * f);
                com.tsf.shell.manager.a.h.a(this.B + ((this.C - this.B) * f), ((this.D - 0.0f) * f) + 0.0f, this.E, this.D);
            }

            @Override // com.censivn.C3DEngine.b.g.x
            public void a() {
                x xVar = new x() { // from class: com.tsf.shell.manager.p.a.3.1.1
                    @Override // com.censivn.C3DEngine.b.g.x
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
                xVar.a(0);
                w.a(a.this.a, 500, xVar);
            }
        }
    }

    /* renamed from: com.tsf.shell.manager.p.a$4, reason: invalid class name */
    class AnonymousClass4 extends x {
        AnonymousClass4() {
        }

        /* renamed from: com.tsf.shell.manager.p.a$4$1, reason: invalid class name */
        class AnonymousClass1 implements Runnable {
            AnonymousClass1() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.a.b();
                com.censivn.C3DEngine.a.a().b(new RunnableC00371(), 300L);
            }

            /* renamed from: com.tsf.shell.manager.p.a$4$1$1, reason: invalid class name and collision with other inner class name */
            class RunnableC00371 implements Runnable {
                RunnableC00371() {
                }

                /* renamed from: com.tsf.shell.manager.p.a$4$1$1$1, reason: invalid class name and collision with other inner class name */
                class C00381 extends x {
                    C00381() {
                    }

                    @Override // com.censivn.C3DEngine.b.g.x
                    public void a(float f) {
                        com.tsf.shell.manager.a.h.s().a(45.0f * (1.0f - f));
                    }

                    /* renamed from: com.tsf.shell.manager.p.a$4$1$1$1$1, reason: invalid class name and collision with other inner class name */
                    class C00391 extends x {
                        C00391() {
                        }

                        @Override // com.censivn.C3DEngine.b.g.x
                        public void a(float f) {
                            com.tsf.shell.manager.a.h.s().b(a.this.b * f);
                            com.tsf.shell.manager.a.h.s().a(a.this.c * f);
                        }

                        @Override // com.censivn.C3DEngine.b.g.x
                        public void a() {
                            x xVar = new x() { // from class: com.tsf.shell.manager.p.a.4.1.1.1.1.1
                                @Override // com.censivn.C3DEngine.b.g.x
                                public void a(float f) {
                                    com.tsf.shell.manager.a.h.s().b(a.this.b - ((a.this.b * 2.0f) * f));
                                    com.tsf.shell.manager.a.h.s().a(a.this.c - ((a.this.c * 2.0f) * f));
                                }

                                @Override // com.censivn.C3DEngine.b.g.x
                                public void a() {
                                    x xVar2 = new x() { // from class: com.tsf.shell.manager.p.a.4.1.1.1.1.1.1
                                        @Override // com.censivn.C3DEngine.b.g.x
                                        public void a(float f) {
                                            com.tsf.shell.manager.a.h.s().b((-a.this.b) + ((a.this.b + com.tsf.shell.manager.a.h.s().a(1)) * f));
                                            com.tsf.shell.manager.a.h.s().a((-a.this.c) + (a.this.c * f));
                                        }

                                        @Override // com.censivn.C3DEngine.b.g.x
                                        public void a() {
                                            com.tsf.shell.manager.a.h.s().a((com.tsf.shell.e.f.g) null);
                                            com.tsf.shell.manager.a.h.s().d((MotionEvent) null);
                                            com.tsf.shell.manager.a.h.g();
                                            a.this.e();
                                        }
                                    };
                                    xVar2.f(0.0f);
                                    xVar2.h(0.0f);
                                    w.a(a.this.a, 1000, xVar2);
                                    a.this.a.a(20.0f);
                                }
                            };
                            xVar.f(com.censivn.C3DEngine.b.b.a.z + com.censivn.C3DEngine.b.b.a.a(100.0f));
                            xVar.h(a.this.d);
                            w.a(a.this.a, 2000, xVar);
                            a.this.a.a(-30.0f);
                        }
                    }

                    @Override // com.censivn.C3DEngine.b.g.x
                    public void a() {
                        C00391 c00391 = new C00391();
                        c00391.f(com.censivn.C3DEngine.b.b.a.A - com.censivn.C3DEngine.b.b.a.a(100.0f));
                        c00391.h(-a.this.d);
                        w.a(a.this.a, 1000, c00391);
                        a.this.a.a(30.0f);
                        com.tsf.shell.manager.a.h.s().e();
                    }
                }

                @Override // java.lang.Runnable
                public void run() {
                    C00381 c00381 = new C00381();
                    c00381.h(0.0f);
                    w.a(a.this.a, 500, c00381);
                    com.tsf.shell.manager.a.h.s().e();
                }
            }
        }

        @Override // com.censivn.C3DEngine.b.g.x
        public void a() {
            com.censivn.C3DEngine.a.a().b(new AnonymousClass1(), 300L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        AnonymousClass4 anonymousClass4 = new AnonymousClass4();
        anonymousClass4.h(com.tsf.shell.manager.a.g.a.l().b + com.tsf.shell.manager.a.g.a.l().h);
        anonymousClass4.a(255);
        w.a(this.a, 500, anonymousClass4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        x xVar = new x() { // from class: com.tsf.shell.manager.p.a.5
            @Override // com.censivn.C3DEngine.b.g.x
            public void a() {
                com.tsf.shell.manager.a.b.c(Home.b());
                com.censivn.C3DEngine.b.c.c.b();
                com.censivn.C3DEngine.a.h.d().a(true);
                com.tsf.shell.manager.a.j.b(a.this.a);
                a.this.a.a();
                com.censivn.C3DEngine.a.d().sendBroadcast(new Intent(ThemeClockManager.ALARM_ON_CLICK));
            }
        };
        xVar.a(0);
        w.a(this.a, 500, xVar);
    }
}
