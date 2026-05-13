package com.tsf.shell.p096f.p101c.p102a;

import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.censivn.C3DEngine.p031b.p041g.p043b.C1013b;
import com.tsf.shell.p096f.p101c.p105b.AbstractC2356c;
import com.tsf.shell.utils.C4189x;
/* renamed from: com.tsf.shell.f.c.a.e */
/* loaded from: classes.dex */
public class C2311e extends AbstractC2356c {

    /* renamed from: a */
    private C2326f f7546a;

    public C2311e(C2326f c2326f) {
        this.f7546a = c2326f;
    }

    @Override // com.tsf.shell.p096f.p101c.p105b.AbstractC2356c
    /* renamed from: a */
    public C0980j mo5698a() {
        return this.f7546a.m5822h();
    }

    @Override // com.tsf.shell.p096f.p101c.p105b.AbstractC2356c
    /* renamed from: b */
    public void mo5696b() {
        m5748a(0.0f, 0.0f);
        m5747a(false);
        C0853a.m10865a().m10584b(new Runnable() { // from class: com.tsf.shell.f.c.a.e.1
            @Override // java.lang.Runnable
            public void run() {
                C2311e.this.f7546a.m5790x();
                C2311e.this.m5743f();
                C0853a.m10865a().m10584b(new Runnable() { // from class: com.tsf.shell.f.c.a.e.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        C2311e.this.m5868m();
                    }
                }, 2500L);
                C0853a.m10865a().m10584b(new Runnable() { // from class: com.tsf.shell.f.c.a.e.1.2
                    @Override // java.lang.Runnable
                    public void run() {
                        C2311e.this.m5748a(C2311e.this.f7546a.m5806p(), 0.0f);
                        C2311e.this.m5747a(true);
                    }
                }, 2000L);
            }
        }, 500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public void m5868m() {
        float m5806p = this.f7546a.m5806p();
        C1013b c1013b = new C1013b();
        C1014c.m10325a(c1013b, 1000, new C23152(m5806p, m5806p / 2.0f, c1013b));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.shell.f.c.a.e$2 */
    /* loaded from: classes.dex */
    public class C23152 extends C1017d {

        /* renamed from: a */
        final /* synthetic */ float f7550a;

        /* renamed from: b */
        final /* synthetic */ float f7551b;

        /* renamed from: c */
        final /* synthetic */ C1013b f7552c;

        C23152(float f, float f2, C1013b c1013b) {
            this.f7550a = f;
            this.f7551b = f2;
            this.f7552c = c1013b;
        }

        @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
        /* renamed from: a */
        public void mo518a(float f) {
            float f2 = this.f7550a + ((this.f7551b - this.f7550a) * f);
            C2311e.this.f7546a.m5852a(f2, true);
            C2311e.this.f7546a.m5824g().m5896c(f2);
            C2311e.this.m5746c().position().f2526x = f2;
        }

        @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
        /* renamed from: a */
        public void mo732a() {
            C0853a.m10865a().m10584b(new Runnable() { // from class: com.tsf.shell.f.c.a.e.2.1
                @Override // java.lang.Runnable
                public void run() {
                    C1014c.m10325a(C23152.this.f7552c, 1000, new C1017d() { // from class: com.tsf.shell.f.c.a.e.2.1.1
                        @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                        /* renamed from: a */
                        public void mo518a(float f) {
                            float f2 = C23152.this.f7551b + ((C23152.this.f7550a - C23152.this.f7551b) * f);
                            C2311e.this.f7546a.m5852a(f2, true);
                            C2311e.this.f7546a.m5824g().m5896c(f2);
                            C2311e.this.m5746c().position().f2526x = f2;
                        }

                        @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                        /* renamed from: a */
                        public void mo732a() {
                            C2311e.this.m5742g();
                            C2311e.this.m5743f();
                            C2311e.this.m5867n();
                        }
                    });
                }
            }, 500L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public void m5867n() {
        C0853a.m10865a().m10584b(new Runnable() { // from class: com.tsf.shell.f.c.a.e.3
            @Override // java.lang.Runnable
            public void run() {
                C2311e.this.m5743f();
                C2311e.this.f7546a.m5794v();
                C0853a.m10865a().m10584b(new Runnable() { // from class: com.tsf.shell.f.c.a.e.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        C2311e.this.m5866o();
                    }
                }, 2000L);
                C0853a.m10865a().m10584b(new Runnable() { // from class: com.tsf.shell.f.c.a.e.3.2
                    @Override // java.lang.Runnable
                    public void run() {
                        C2311e.this.m5741h();
                        C2311e.this.m5747a(true);
                    }
                }, 1500L);
            }
        }, 2000L);
        C0853a.m10865a().m10584b(new Runnable() { // from class: com.tsf.shell.f.c.a.e.4
            @Override // java.lang.Runnable
            public void run() {
                C2311e.this.m5748a(0.0f, 0.0f);
            }
        }, 1000L);
        C0853a.m10865a().m10584b(new Runnable() { // from class: com.tsf.shell.f.c.a.e.5
            @Override // java.lang.Runnable
            public void run() {
                C2311e.this.m5747a(false);
            }
        }, 1500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public void m5866o() {
        Number3d.TEMPNUMBER3D.reset();
        Number3d localToGlobal = this.f7546a.m5822h().localToGlobal(Number3d.TEMPNUMBER3D);
        float[] m612a = C4189x.m612a(localToGlobal.f2526x, localToGlobal.f2527y);
        this.f7546a.m5824g().m5913a(m612a[0], m612a[1]);
        C1014c.m10325a(new C1013b(), 4000, new C23236(m612a, this.f7546a.m5824g().m5879k()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.shell.f.c.a.e$6 */
    /* loaded from: classes.dex */
    public class C23236 extends C1017d {

        /* renamed from: a */
        final /* synthetic */ float[] f7561a;

        /* renamed from: b */
        final /* synthetic */ float f7562b;

        C23236(float[] fArr, float f) {
            this.f7561a = fArr;
            this.f7562b = f;
        }

        @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
        /* renamed from: a */
        public void mo518a(float f) {
            float sin = (float) Math.sin(3.141592653589793d * f);
            float f2 = this.f7561a[0] + (this.f7562b * sin);
            float f3 = this.f7561a[1];
            C2311e.this.f7546a.m5792w();
            C2311e.this.m5746c().position().f2526x = sin * this.f7562b;
            C2311e.this.f7546a.m5824g().m5901b(f2, f3);
        }

        @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
        /* renamed from: a */
        public void mo732a() {
            C2311e.this.m5743f();
            C2311e.this.m5742g();
            C0853a.m10865a().m10584b(new Runnable() { // from class: com.tsf.shell.f.c.a.e.6.1
                @Override // java.lang.Runnable
                public void run() {
                    C2311e.this.f7546a.m5824g().m5897c();
                    C0853a.m10865a().m10584b(new Runnable() { // from class: com.tsf.shell.f.c.a.e.6.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            C2311e.this.m5738k();
                            C2311e.this.m5737l();
                        }
                    }, 1500L);
                }
            }, 300L);
        }
    }
}
