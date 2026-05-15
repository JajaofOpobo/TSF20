package com.tsf.shell.f.f.a.a;

import android.view.KeyEvent;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcutAppInfo;
import com.censivn.C3DEngine.b.f.i;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.f.n;
import com.tsf.shell.f.f.a.a.b;
import com.tsf.shell.f.i.b.e.g;
import com.tsf.shell.manager.a.c;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class c {
    public static final float a = com.censivn.C3DEngine.b.b.a.a(200.0f);
    public static int b = 0;
    public static int c = 1;
    private com.censivn.C3DEngine.b.b.d d;
    private j e;
    private com.censivn.C3DEngine.b.b.c f;
    private com.tsf.shell.f.b.a g;
    private com.tsf.shell.f.e.d<com.tsf.shell.f.f.a.a.a.b> h;
    private ArrayList<com.tsf.shell.f.f.a.a.a.c> i;
    private n j;
    private f k;
    private e l;
    private d m;
    private a n;
    private com.tsf.shell.manager.p.b p;
    private int q;
    private int r;
    private boolean o = false;
    private boolean s = false;

    class a implements c.a {
        a() {
        }

        @Override // com.tsf.shell.manager.a.c.a
        public void a(g gVar, boolean z) {
        }

        @Override // com.tsf.shell.manager.a.c.a
        public void a(g gVar) {
        }

        @Override // com.tsf.shell.manager.a.c.a
        public void b(g gVar, boolean z) {
        }

        @Override // com.tsf.shell.manager.a.c.a
        public void k_() {
        }

        @Override // com.tsf.shell.manager.a.c.a
        public void a() {
        }
    }

    public void a() {
        this.q = this.q == b ? c : b;
        Iterator<com.tsf.shell.f.f.a.a.a.c> it = this.i.iterator();
        while (it.hasNext()) {
            it.next().a(this.q, true);
        }
        i();
    }

    public int b() {
        return this.q;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.tsf.shell.f.f.a.a.a.b a(String str) {
        for (com.tsf.shell.f.f.a.a.a.c cVar : this.i) {
            if (cVar instanceof com.tsf.shell.f.f.a.a.a.b) {
                com.tsf.shell.f.f.a.a.a.b bVar = (com.tsf.shell.f.f.a.a.a.b) cVar;
                if (bVar.g().equals(str)) {
                    return bVar;
                }
            }
        }
        return null;
    }

    public c() {
        this.q = com.tsf.shell.manager.b.e.aq();
        int i = this.q == b ? b : c;
        this.r = i;
        this.q = i;
        this.n = new a() { // from class: com.tsf.shell.f.f.a.a.c.1
            @Override // com.tsf.shell.f.f.a.a.c.a, com.tsf.shell.manager.a.c.a
            public void a(g gVar, boolean z) {
                String strA = b.a(gVar);
                com.tsf.shell.f.f.a.a.a.b bVarA = c.this.a(strA);
                if (bVarA == null) {
                    c.this.b(b.a(strA, gVar));
                } else {
                    bVarA.a(gVar);
                }
            }

            @Override // com.tsf.shell.f.f.a.a.c.a, com.tsf.shell.manager.a.c.a
            public void b(g gVar, boolean z) {
                com.tsf.shell.f.f.a.a.a.b bVarA = c.this.a(gVar);
                if (bVarA != null) {
                    bVarA.b(gVar);
                }
            }
        };
        this.k = new f(this);
        this.i = new ArrayList<>();
        this.l = new e(this);
        this.m = new d(this);
        this.e = new j() { // from class: com.tsf.shell.f.f.a.a.c.3
            @Override // com.censivn.C3DEngine.b.f.i
            public i getHittingTarget(float f, float f2, boolean z) {
                i hittingTarget = c.this.l.getHittingTarget(f, f2, false);
                if (hittingTarget == null) {
                    i hittingTarget2 = c.this.m.getHittingTarget(f, f2, false);
                    return hittingTarget2 == null ? super.getHittingTarget(f, f2, z) : hittingTarget2;
                }
                return hittingTarget;
            }
        };
        this.f = new com.censivn.C3DEngine.b.b.c() { // from class: com.tsf.shell.f.f.a.a.c.4
            @Override // com.censivn.C3DEngine.b.b.c
            public void d() {
                super.d();
                if (c.this.d != null) {
                    c.this.d.b();
                }
            }
        };
        this.f.b(false);
        this.f.a(1);
        this.f.addChild(this.l);
        this.d = new com.censivn.C3DEngine.b.b.d(this.f);
        this.d.a(com.censivn.C3DEngine.b.b.a.D, com.censivn.C3DEngine.b.b.a.E - (com.censivn.C3DEngine.b.b.a.B - this.d.position().y));
        this.g = new com.tsf.shell.f.b.a() { // from class: com.tsf.shell.f.f.a.a.c.5
            @Override // com.tsf.shell.f.b.a, com.censivn.C3DEngine.b.c.b.a
            public void a(int i2, KeyEvent keyEvent) {
                if (i2 == 4 && !c.this.o) {
                    c.this.g();
                }
            }

            @Override // com.tsf.shell.f.b.a, com.censivn.C3DEngine.b.c.b.a
            public void b(int i2, KeyEvent keyEvent) {
            }

            @Override // com.tsf.shell.f.b.a
            public void a(int i2, int i3, int i4, int i5) {
                c.this.e();
            }
        };
        this.j = new n();
        com.censivn.C3DEngine.b.d.a aVar = new com.censivn.C3DEngine.b.d.a(this.j) { // from class: com.tsf.shell.f.f.a.a.c.6
            private boolean b = false;

            @Override // com.censivn.C3DEngine.b.d.a
            public void e(MotionEvent motionEvent) {
                this.b = false;
                c.this.k();
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void f(MotionEvent motionEvent) {
                c.this.l();
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent, MotionEvent motionEvent2) {
                if (this.b) {
                    c.this.a(motionEvent2);
                    return;
                }
                int x = (int) (motionEvent.getX() - motionEvent2.getX());
                int y = (int) (motionEvent.getY() - motionEvent2.getY());
                if ((x * x) + (y * y) > com.censivn.C3DEngine.a.b.c) {
                    this.b = true;
                }
            }
        };
        this.j.maxX(com.censivn.C3DEngine.b.b.a.a(150.0f));
        this.j.minX(com.censivn.C3DEngine.b.b.a.a(-150.0f));
        this.j.setMouseEventListener(aVar);
        this.e.addChild(this.d);
        this.e.addChild(this.j);
        this.h = new com.tsf.shell.f.e.d<com.tsf.shell.f.f.a.a.a.b>() { // from class: com.tsf.shell.f.f.a.a.c.7
            @Override // com.tsf.shell.f.e.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public com.tsf.shell.f.f.a.a.a.b b() {
                return new com.tsf.shell.f.f.a.a.a.b(c.this);
            }
        };
    }

    public void a(com.tsf.shell.f.f.a.a.a.c cVar) {
        c(cVar);
    }

    public j c() {
        return this.e;
    }

    public void d() {
        this.d.b(this.d.a(), 0.2f);
    }

    public void b(com.tsf.shell.f.f.a.a.a.c cVar) {
        this.d.b(-cVar.position().y, 0.2f);
    }

    public void e() {
        this.f.a((int) (com.censivn.C3DEngine.b.b.a.D - com.censivn.C3DEngine.b.b.a.a(30.0f)), 0);
        this.d.a(com.censivn.C3DEngine.b.b.a.D, com.censivn.C3DEngine.b.b.a.E);
        this.d.position().y = com.censivn.C3DEngine.b.b.a.B;
        i();
        this.k.a();
    }

    private void i() {
        this.j.maxY(com.censivn.C3DEngine.b.b.a.B);
        this.j.minY(com.censivn.C3DEngine.b.b.a.C);
        if (this.q == b) {
            this.j.position().x = com.censivn.C3DEngine.b.b.a.z;
        } else {
            this.j.position().x = com.censivn.C3DEngine.b.b.a.A;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        this.p = new com.tsf.shell.manager.p.b();
        float fA = com.censivn.C3DEngine.b.b.a.a(20.0f);
        float fD = this.k.d() + fA;
        this.p.position().y = fD - com.censivn.C3DEngine.b.b.a.a(400.0f);
        this.p.position().x = com.censivn.C3DEngine.b.b.a.z + com.censivn.C3DEngine.b.b.a.a(50.0f) + com.censivn.C3DEngine.b.b.a.a(400.0f);
        this.p.alpha(0.0f);
        com.tsf.shell.manager.a.j.a(this.p);
        this.p.a(new AnonymousClass8(fA, fD), 0);
    }

    /* JADX INFO: renamed from: com.tsf.shell.f.f.a.a.c$8, reason: invalid class name */
    class AnonymousClass8 implements Runnable {
        final /* synthetic */ float a;
        final /* synthetic */ float b;

        AnonymousClass8(float f, float f2) {
            this.a = f;
            this.b = f2;
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.p.a(com.censivn.C3DEngine.b.b.a.z + com.censivn.C3DEngine.b.b.a.a(50.0f), this.b, 600, new Runnable() { // from class: com.tsf.shell.f.f.a.a.c.8.1
                @Override // java.lang.Runnable
                public void run() {
                    c.this.k();
                    final float fB = c.this.k.b() + AnonymousClass8.this.a;
                    final float fC = c.this.k.c() - AnonymousClass8.this.a;
                    final float f = fC - fB;
                    c.this.p.a(-20.0f, new Runnable() { // from class: com.tsf.shell.f.f.a.a.c.8.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            c.this.a(fB, fC, f);
                        }
                    });
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(float f, float f2, float f3) {
        com.censivn.C3DEngine.b.g.c.a(new com.censivn.C3DEngine.b.g.b.b(), 1500, new AnonymousClass9(f, f3, f2));
    }

    /* JADX INFO: renamed from: com.tsf.shell.f.f.a.a.c$9, reason: invalid class name */
    class AnonymousClass9 extends com.censivn.C3DEngine.b.g.d {
        final /* synthetic */ float a;
        final /* synthetic */ float b;
        final /* synthetic */ float c;

        AnonymousClass9(float f, float f2, float f3) {
            this.a = f;
            this.b = f2;
            this.c = f3;
        }

        @Override // com.censivn.C3DEngine.b.g.d
        public void a(float f) {
            float f2 = this.a + (this.b * f);
            c.this.p.position().y = f2;
            c.this.k.a(f2);
        }

        @Override // com.censivn.C3DEngine.b.g.d
        public void a() {
            com.censivn.C3DEngine.b.g.c.a(new com.censivn.C3DEngine.b.g.b.b(), 1500, new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.f.a.a.c.9.1
                @Override // com.censivn.C3DEngine.b.g.d
                public void a(float f) {
                    float f2 = AnonymousClass9.this.c - (AnonymousClass9.this.b * f);
                    c.this.p.position().y = f2;
                    c.this.k.a(f2);
                    c.this.k.a(f2);
                }

                @Override // com.censivn.C3DEngine.b.g.d
                public void a() {
                    c.this.p.b(new Runnable() { // from class: com.tsf.shell.f.f.a.a.c.9.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            c.this.l();
                            c.this.p.removeFromParent();
                            c.this.e.mouseEnabled(true);
                            c.this.o = false;
                            com.tsf.shell.manager.p.c.a(14, false, true);
                        }
                    }, 0);
                }
            });
        }
    }

    public void f() {
        if (this.e.parent() == null && com.tsf.shell.manager.a.w.a().b()) {
            this.o = com.tsf.shell.manager.p.c.b(14);
            if (this.o) {
                this.e.mouseEnabled(false);
            }
            com.tsf.shell.manager.a.w.a().a(this.n);
            this.e.alpha(255.0f);
            final j jVarA = com.tsf.shell.manager.a.j.a(this.g);
            boolean zAM = com.tsf.shell.manager.a.h.t().aM();
            Runnable runnable = new Runnable() { // from class: com.tsf.shell.f.f.a.a.c.10
                @Override // java.lang.Runnable
                public void run() {
                    com.tsf.shell.manager.a.h.t().aN();
                    ArrayList<g> arrayListD = com.tsf.shell.manager.a.w.a().d();
                    ArrayList arrayList = new ArrayList();
                    for (g gVar : arrayListD) {
                        if (gVar.K() != null && !((LauncherShortcutAppInfo) gVar.K()).isHide) {
                            arrayList.add(gVar);
                        }
                    }
                    ArrayList<b.c> arrayListA = b.a((ArrayList<b.a>) arrayList);
                    c.this.f.addChild(c.this.m);
                    c.this.i.add(c.this.m);
                    c.this.m.a(c.this.q, false);
                    c.this.m.e();
                    Iterator<b.c> it = arrayListA.iterator();
                    while (it.hasNext()) {
                        com.tsf.shell.f.f.a.a.a.c cVarA = c.this.a(it.next());
                        cVarA.a(c.this.q, false);
                        cVarA.e();
                    }
                    jVarA.addChild(c.this.e);
                    c.this.e();
                    c.this.m.g();
                    c.this.d.c();
                    c.this.l.f();
                    c.this.j.mouseEnabled(false);
                    com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.f.a.a.c.10.1
                        @Override // com.censivn.C3DEngine.b.g.d
                        public void a() {
                            c.this.j.mouseEnabled(true);
                            if (c.this.o) {
                                c.this.j();
                            }
                        }
                    };
                    com.censivn.C3DEngine.b.g.c.a(c.this.j);
                    com.censivn.C3DEngine.b.g.c.a(c.this.j, 750, dVar);
                }
            };
            if (zAM) {
                com.tsf.shell.manager.a.j.c();
                runnable.run();
            } else {
                com.tsf.shell.manager.a.j.a(runnable);
            }
        }
    }

    private void c(com.tsf.shell.f.f.a.a.a.c cVar) {
        this.i.remove(cVar);
        cVar.f();
        cVar.removeFromParent();
        if (!(cVar instanceof d)) {
            this.h.a((com.tsf.shell.f.f.a.a.a.b) cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.tsf.shell.f.f.a.a.a.c a(b.c cVar) {
        com.tsf.shell.f.f.a.a.a.b bVarC = this.h.c();
        bVarC.a(cVar);
        this.f.addChild(bVarC);
        this.i.add(bVarC);
        return bVarC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.tsf.shell.f.f.a.a.a.c b(b.c cVar) {
        com.tsf.shell.f.f.a.a.a.b bVarC = this.h.c();
        bVarC.a(cVar);
        this.f.addChildAt(bVarC, b.a(this.i, bVarC) + 1);
        return bVarC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.tsf.shell.f.f.a.a.a.b a(g gVar) {
        for (com.tsf.shell.f.f.a.a.a.c cVar : this.i) {
            if (cVar instanceof com.tsf.shell.f.f.a.a.a.b) {
                com.tsf.shell.f.f.a.a.a.b bVar = (com.tsf.shell.f.f.a.a.a.b) cVar;
                if (bVar.c(gVar)) {
                    return bVar;
                }
            }
        }
        return null;
    }

    public void g() {
        com.tsf.shell.manager.a.w.a().b(this.n);
        this.j.mouseEnabled(false);
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
        dVar.a(0);
        com.censivn.C3DEngine.b.g.c.a(this.e);
        com.censivn.C3DEngine.b.g.c.a(this.e, 250, dVar);
        com.tsf.shell.manager.a.j.a(new Runnable() { // from class: com.tsf.shell.f.f.a.a.c.2
            @Override // java.lang.Runnable
            public void run() {
                c.this.l.e();
                com.tsf.shell.manager.a.j.b();
                c.this.e.removeFromParent();
                for (com.tsf.shell.f.f.a.a.a.c cVar : c.this.i) {
                    cVar.f();
                    cVar.removeFromParent();
                    if (!(cVar instanceof d)) {
                        c.this.h.a((com.tsf.shell.f.f.a.a.a.b) cVar);
                    }
                    c.this.e.alpha(255.0f);
                }
                c.this.i.clear();
                if (c.this.r != c.this.q) {
                    c.this.r = c.this.q;
                    com.tsf.shell.manager.b.e.q(c.this.q);
                }
            }
        }, true);
    }

    public ArrayList<com.tsf.shell.f.f.a.a.a.c> h() {
        return this.i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        this.s = true;
        this.k.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        this.s = false;
        this.k.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MotionEvent motionEvent) {
        if (this.s) {
            this.k.a(motionEvent);
        }
    }
}
