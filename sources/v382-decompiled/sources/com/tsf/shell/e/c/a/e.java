package com.tsf.shell.e.c.a;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.b.f.l;
import com.censivn.C3DEngine.b.g.w;
import com.censivn.C3DEngine.b.g.x;

/* loaded from: classes.dex */
public class e extends com.tsf.shell.e.c.b.c {
    private f a;

    public e(f fVar) {
        this.a = fVar;
    }

    @Override // com.tsf.shell.e.c.b.c
    public l a() {
        return this.a.h();
    }

    @Override // com.tsf.shell.e.c.b.c
    public void b() {
        a(0.0f, 0.0f);
        a(false);
        com.censivn.C3DEngine.a.a().b(new Runnable() { // from class: com.tsf.shell.e.c.a.e.1
            @Override // java.lang.Runnable
            public void run() {
                e.this.a.x();
                e.this.f();
                com.censivn.C3DEngine.a.a().b(new Runnable() { // from class: com.tsf.shell.e.c.a.e.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        e.this.m();
                    }
                }, 2500L);
                com.censivn.C3DEngine.a.a().b(new Runnable() { // from class: com.tsf.shell.e.c.a.e.1.2
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
        float p = this.a.p();
        com.censivn.C3DEngine.b.g.b.b bVar = new com.censivn.C3DEngine.b.g.b.b();
        w.a(bVar, 1000, new AnonymousClass2(p, p / 2.0f, bVar));
    }

    /* renamed from: com.tsf.shell.e.c.a.e$2, reason: invalid class name */
    class AnonymousClass2 extends x {
        private final /* synthetic */ float x;
        private final /* synthetic */ float y;
        private final /* synthetic */ com.censivn.C3DEngine.b.g.b.b z;

        AnonymousClass2(float f, float f2, com.censivn.C3DEngine.b.g.b.b bVar) {
            this.x = f;
            this.y = f2;
            this.z = bVar;
        }

        @Override // com.censivn.C3DEngine.b.g.x
        public void a(float f) {
            float f2 = this.x + ((this.y - this.x) * f);
            e.this.a.a(f2, true);
            e.this.a.g().c(f2);
            e.this.c().position().x = f2;
        }

        @Override // com.censivn.C3DEngine.b.g.x
        public void a() {
            final com.censivn.C3DEngine.b.g.b.b bVar = this.z;
            final float f = this.y;
            final float f2 = this.x;
            com.censivn.C3DEngine.a.a().b(new Runnable() { // from class: com.tsf.shell.e.c.a.e.2.1
                @Override // java.lang.Runnable
                public void run() {
                    final float f3 = f;
                    final float f4 = f2;
                    w.a(bVar, 1000, new x() { // from class: com.tsf.shell.e.c.a.e.2.1.1
                        @Override // com.censivn.C3DEngine.b.g.x
                        public void a(float f5) {
                            float f6 = f3 + ((f4 - f3) * f5);
                            e.this.a.a(f6, true);
                            e.this.a.g().c(f6);
                            e.this.c().position().x = f6;
                        }

                        @Override // com.censivn.C3DEngine.b.g.x
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
        com.censivn.C3DEngine.a.a().b(new Runnable() { // from class: com.tsf.shell.e.c.a.e.3
            @Override // java.lang.Runnable
            public void run() {
                e.this.f();
                e.this.a.v();
                com.censivn.C3DEngine.a.a().b(new Runnable() { // from class: com.tsf.shell.e.c.a.e.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        e.this.o();
                    }
                }, 2000L);
                com.censivn.C3DEngine.a.a().b(new Runnable() { // from class: com.tsf.shell.e.c.a.e.3.2
                    @Override // java.lang.Runnable
                    public void run() {
                        e.this.h();
                        e.this.a(true);
                    }
                }, 1500L);
            }
        }, 2000L);
        com.censivn.C3DEngine.a.a().b(new Runnable() { // from class: com.tsf.shell.e.c.a.e.4
            @Override // java.lang.Runnable
            public void run() {
                e.this.a(0.0f, 0.0f);
            }
        }, 1000L);
        com.censivn.C3DEngine.a.a().b(new Runnable() { // from class: com.tsf.shell.e.c.a.e.5
            @Override // java.lang.Runnable
            public void run() {
                e.this.a(false);
            }
        }, 1500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        Number3d.TEMPNUMBER3D.reset();
        Number3d localToGlobal = this.a.h().localToGlobal(Number3d.TEMPNUMBER3D);
        float[] a = com.tsf.shell.utils.x.a(localToGlobal.x, localToGlobal.y);
        this.a.g().a(a[0], a[1]);
        w.a(new com.censivn.C3DEngine.b.g.b.b(), 4000, new AnonymousClass6(a, this.a.g().k()));
    }

    /* renamed from: com.tsf.shell.e.c.a.e$6, reason: invalid class name */
    class AnonymousClass6 extends x {
        private final /* synthetic */ float[] x;
        private final /* synthetic */ float y;

        AnonymousClass6(float[] fArr, float f) {
            this.x = fArr;
            this.y = f;
        }

        @Override // com.censivn.C3DEngine.b.g.x
        public void a(float f) {
            float sin = (float) Math.sin(3.141592653589793d * f);
            float f2 = this.x[0] + (this.y * sin);
            float f3 = this.x[1];
            e.this.a.w();
            e.this.c().position().x = sin * this.y;
            e.this.a.g().b(f2, f3);
        }

        @Override // com.censivn.C3DEngine.b.g.x
        public void a() {
            e.this.f();
            e.this.g();
            com.censivn.C3DEngine.a.a().b(new Runnable() { // from class: com.tsf.shell.e.c.a.e.6.1
                @Override // java.lang.Runnable
                public void run() {
                    e.this.a.g().c();
                    com.censivn.C3DEngine.a.a().b(new Runnable() { // from class: com.tsf.shell.e.c.a.e.6.1.1
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
