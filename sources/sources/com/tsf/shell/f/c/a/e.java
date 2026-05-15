package com.tsf.shell.f.c.a;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.b.f.j;
import com.tsf.shell.utils.x;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class e extends com.tsf.shell.f.c.b.c {
    private f a;

    public e(f fVar) {
        this.a = fVar;
    }

    @Override // com.tsf.shell.f.c.b.c
    public j a() {
        return this.a.h();
    }

    @Override // com.tsf.shell.f.c.b.c
    public void b() {
        a(0.0f, 0.0f);
        a(false);
        com.censivn.C3DEngine.a.a().b(new Runnable() { // from class: com.tsf.shell.f.c.a.e.1
            @Override // java.lang.Runnable
            public void run() {
                e.this.a.x();
                e.this.f();
                com.censivn.C3DEngine.a.a().b(new Runnable() { // from class: com.tsf.shell.f.c.a.e.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        e.this.m();
                    }
                }, 2500L);
                com.censivn.C3DEngine.a.a().b(new Runnable() { // from class: com.tsf.shell.f.c.a.e.1.2
                    @Override // java.lang.Runnable
                    public void run() {
                        e.this.a(e.this.a.p(), 0.0f);
                        e.this.a(true);
                    }
                }, 2000L);
            }
        }, 500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        float fP = this.a.p();
        com.censivn.C3DEngine.b.g.b.b bVar = new com.censivn.C3DEngine.b.g.b.b();
        com.censivn.C3DEngine.b.g.c.a(bVar, 1000, new AnonymousClass2(fP, fP / 2.0f, bVar));
    }

    /* JADX INFO: renamed from: com.tsf.shell.f.c.a.e$2, reason: invalid class name */
    class AnonymousClass2 extends com.censivn.C3DEngine.b.g.d {
        final /* synthetic */ float a;
        final /* synthetic */ float b;
        final /* synthetic */ com.censivn.C3DEngine.b.g.b.b c;

        AnonymousClass2(float f, float f2, com.censivn.C3DEngine.b.g.b.b bVar) {
            this.a = f;
            this.b = f2;
            this.c = bVar;
        }

        @Override // com.censivn.C3DEngine.b.g.d
        public void a(float f) {
            float f2 = this.a + ((this.b - this.a) * f);
            e.this.a.a(f2, true);
            e.this.a.g().c(f2);
            e.this.c().position().x = f2;
        }

        @Override // com.censivn.C3DEngine.b.g.d
        public void a() {
            com.censivn.C3DEngine.a.a().b(new Runnable() { // from class: com.tsf.shell.f.c.a.e.2.1
                @Override // java.lang.Runnable
                public void run() {
                    com.censivn.C3DEngine.b.g.c.a(AnonymousClass2.this.c, 1000, new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.c.a.e.2.1.1
                        @Override // com.censivn.C3DEngine.b.g.d
                        public void a(float f) {
                            float f2 = AnonymousClass2.this.b + ((AnonymousClass2.this.a - AnonymousClass2.this.b) * f);
                            e.this.a.a(f2, true);
                            e.this.a.g().c(f2);
                            e.this.c().position().x = f2;
                        }

                        @Override // com.censivn.C3DEngine.b.g.d
                        public void a() {
                            e.this.g();
                            e.this.f();
                            e.this.n();
                        }
                    });
                }
            }, 500L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        com.censivn.C3DEngine.a.a().b(new Runnable() { // from class: com.tsf.shell.f.c.a.e.3
            @Override // java.lang.Runnable
            public void run() {
                e.this.f();
                e.this.a.v();
                com.censivn.C3DEngine.a.a().b(new Runnable() { // from class: com.tsf.shell.f.c.a.e.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        e.this.o();
                    }
                }, 2000L);
                com.censivn.C3DEngine.a.a().b(new Runnable() { // from class: com.tsf.shell.f.c.a.e.3.2
                    @Override // java.lang.Runnable
                    public void run() {
                        e.this.h();
                        e.this.a(true);
                    }
                }, 1500L);
            }
        }, 2000L);
        com.censivn.C3DEngine.a.a().b(new Runnable() { // from class: com.tsf.shell.f.c.a.e.4
            @Override // java.lang.Runnable
            public void run() {
                e.this.a(0.0f, 0.0f);
            }
        }, 1000L);
        com.censivn.C3DEngine.a.a().b(new Runnable() { // from class: com.tsf.shell.f.c.a.e.5
            @Override // java.lang.Runnable
            public void run() {
                e.this.a(false);
            }
        }, 1500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        Number3d.TEMPNUMBER3D.reset();
        Number3d number3dLocalToGlobal = this.a.h().localToGlobal(Number3d.TEMPNUMBER3D);
        float[] fArrA = x.a(number3dLocalToGlobal.x, number3dLocalToGlobal.y);
        this.a.g().a(fArrA[0], fArrA[1]);
        com.censivn.C3DEngine.b.g.c.a(new com.censivn.C3DEngine.b.g.b.b(), 4000, new AnonymousClass6(fArrA, this.a.g().k()));
    }

    /* JADX INFO: renamed from: com.tsf.shell.f.c.a.e$6, reason: invalid class name */
    class AnonymousClass6 extends com.censivn.C3DEngine.b.g.d {
        final /* synthetic */ float[] a;
        final /* synthetic */ float b;

        AnonymousClass6(float[] fArr, float f) {
            this.a = fArr;
            this.b = f;
        }

        @Override // com.censivn.C3DEngine.b.g.d
        public void a(float f) {
            float fSin = (float) Math.sin(3.141592653589793d * ((double) f));
            float f2 = this.a[0] + (this.b * fSin);
            float f3 = this.a[1];
            e.this.a.w();
            e.this.c().position().x = fSin * this.b;
            e.this.a.g().b(f2, f3);
        }

        @Override // com.censivn.C3DEngine.b.g.d
        public void a() {
            e.this.f();
            e.this.g();
            com.censivn.C3DEngine.a.a().b(new Runnable() { // from class: com.tsf.shell.f.c.a.e.6.1
                @Override // java.lang.Runnable
                public void run() {
                    e.this.a.g().c();
                    com.censivn.C3DEngine.a.a().b(new Runnable() { // from class: com.tsf.shell.f.c.a.e.6.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            e.this.k();
                            e.this.l();
                        }
                    }, 1500L);
                }
            }, 300L);
        }
    }
}
