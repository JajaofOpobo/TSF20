package com.tsf.shell.e.f.a.a;

import android.view.KeyEvent;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcutAppInfo;
import com.censivn.C3DEngine.b.f.l;
import com.censivn.C3DEngine.b.f.p;
import com.censivn.C3DEngine.b.g.w;
import com.censivn.C3DEngine.b.g.x;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class f {
    public static final float a = com.censivn.C3DEngine.b.b.a.a(200.0f);
    public static int b = 0;
    public static int c = 1;
    private com.censivn.C3DEngine.b.b.d d;
    private l e;
    private com.censivn.C3DEngine.b.b.c f;
    private com.tsf.shell.e.b.a g;
    private com.tsf.shell.e.e.e h;
    private ArrayList i;
    private p j;
    private j k;
    private i l;
    private h m;
    private g n;
    private com.tsf.shell.manager.p.b p;
    private int q;
    private int r;
    private boolean o = false;
    private boolean s = false;

    public void a() {
        this.q = this.q == b ? c : b;
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            ((com.tsf.shell.e.f.a.a.a.c) it.next()).a(this.q, true);
        }
        i();
    }

    public int b() {
        return this.q;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.tsf.shell.e.f.a.a.a.b a(String str) {
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            com.tsf.shell.e.f.a.a.a.c cVar = (com.tsf.shell.e.f.a.a.a.c) it.next();
            if (cVar instanceof com.tsf.shell.e.f.a.a.a.b) {
                com.tsf.shell.e.f.a.a.a.b bVar = (com.tsf.shell.e.f.a.a.a.b) cVar;
                if (bVar.g().equals(str)) {
                    return bVar;
                }
            }
        }
        return null;
    }

    public f() {
        this.q = com.tsf.shell.manager.b.g.ao();
        int i = this.q == b ? b : c;
        this.r = i;
        this.q = i;
        this.n = new g() { // from class: com.tsf.shell.e.f.a.a.f.1
            @Override // com.tsf.shell.e.f.a.a.g, com.tsf.shell.manager.a.e
            public void a(com.tsf.shell.e.i.b.e.i iVar, boolean z) {
                String a2 = b.a(iVar);
                com.tsf.shell.e.f.a.a.a.b a3 = f.this.a(a2);
                if (a3 == null) {
                    f.this.b(b.a(a2, iVar));
                } else {
                    a3.a(iVar);
                }
            }

            @Override // com.tsf.shell.e.f.a.a.g, com.tsf.shell.manager.a.e
            public void b(com.tsf.shell.e.i.b.e.i iVar, boolean z) {
                com.tsf.shell.e.f.a.a.a.b a2 = f.this.a(iVar);
                if (a2 != null) {
                    a2.b(iVar);
                }
            }
        };
        this.k = new j(this);
        this.i = new ArrayList();
        this.l = new i(this);
        this.m = new h(this);
        this.e = new l() { // from class: com.tsf.shell.e.f.a.a.f.3
            @Override // com.censivn.C3DEngine.b.f.j
            public com.censivn.C3DEngine.b.f.j getHittingTarget(float f, float f2, boolean z) {
                com.censivn.C3DEngine.b.f.j hittingTarget = f.this.l.getHittingTarget(f, f2, false);
                if (hittingTarget == null) {
                    com.censivn.C3DEngine.b.f.j hittingTarget2 = f.this.m.getHittingTarget(f, f2, false);
                    return hittingTarget2 == null ? super.getHittingTarget(f, f2, z) : hittingTarget2;
                }
                return hittingTarget;
            }
        };
        this.f = new com.censivn.C3DEngine.b.b.c() { // from class: com.tsf.shell.e.f.a.a.f.4
            @Override // com.censivn.C3DEngine.b.b.c
            public void d() {
                super.d();
                if (f.this.d != null) {
                    f.this.d.b();
                }
            }
        };
        this.f.b(false);
        this.f.a(1);
        this.f.addChild(this.l);
        this.d = new com.censivn.C3DEngine.b.b.d(this.f);
        this.d.a(com.censivn.C3DEngine.b.b.a.D, com.censivn.C3DEngine.b.b.a.E - (com.censivn.C3DEngine.b.b.a.B - this.d.position().y));
        this.g = new com.tsf.shell.e.b.a() { // from class: com.tsf.shell.e.f.a.a.f.5
            @Override // com.tsf.shell.e.b.a, com.censivn.C3DEngine.b.c.d
            public void a(int i2, KeyEvent keyEvent) {
                if (i2 == 4 && !f.this.o) {
                    f.this.g();
                }
            }

            @Override // com.tsf.shell.e.b.a, com.censivn.C3DEngine.b.c.d
            public void b(int i2, KeyEvent keyEvent) {
            }

            @Override // com.tsf.shell.e.b.a
            public void a(int i2, int i3, int i4, int i5) {
                f.this.e();
            }
        };
        this.j = new p();
        com.censivn.C3DEngine.b.d.a aVar = new com.censivn.C3DEngine.b.d.a(this.j) { // from class: com.tsf.shell.e.f.a.a.f.6
            private boolean b = false;

            @Override // com.censivn.C3DEngine.b.d.a
            public void e(MotionEvent motionEvent) {
                this.b = false;
                f.this.k();
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void f(MotionEvent motionEvent) {
                f.this.l();
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent, MotionEvent motionEvent2) {
                if (!this.b) {
                    int x = (int) (motionEvent.getX() - motionEvent2.getX());
                    int y = (int) (motionEvent.getY() - motionEvent2.getY());
                    if ((x * x) + (y * y) > com.censivn.C3DEngine.a.b.c) {
                        this.b = true;
                        return;
                    }
                    return;
                }
                f.this.a(motionEvent2);
            }
        };
        this.j.maxX(com.censivn.C3DEngine.b.b.a.a(150.0f));
        this.j.minX(com.censivn.C3DEngine.b.b.a.a(-150.0f));
        this.j.setMouseEventListener(aVar);
        this.e.addChild(this.d);
        this.e.addChild(this.j);
        this.h = new com.tsf.shell.e.e.e() { // from class: com.tsf.shell.e.f.a.a.f.7
            @Override // com.tsf.shell.e.e.e
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public com.tsf.shell.e.f.a.a.a.b b() {
                return new com.tsf.shell.e.f.a.a.a.b(f.this);
            }
        };
    }

    public void a(com.tsf.shell.e.f.a.a.a.c cVar) {
        c(cVar);
    }

    public l c() {
        return this.e;
    }

    public void d() {
        this.d.b(this.d.a(), 0.2f);
    }

    public void b(com.tsf.shell.e.f.a.a.a.c cVar) {
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
        float a2 = com.censivn.C3DEngine.b.b.a.a(20.0f);
        float d = this.k.d() + a2;
        this.p.position().y = d - com.censivn.C3DEngine.b.b.a.a(400.0f);
        this.p.position().x = com.censivn.C3DEngine.b.b.a.z + com.censivn.C3DEngine.b.b.a.a(50.0f) + com.censivn.C3DEngine.b.b.a.a(400.0f);
        this.p.alpha(0.0f);
        com.tsf.shell.manager.a.j.a(this.p);
        this.p.a(new AnonymousClass8(d, a2), 0);
    }

    /* renamed from: com.tsf.shell.e.f.a.a.f$8, reason: invalid class name */
    class AnonymousClass8 implements Runnable {
        private final /* synthetic */ float b;
        private final /* synthetic */ float c;

        AnonymousClass8(float f, float f2) {
            this.b = f;
            this.c = f2;
        }

        @Override // java.lang.Runnable
        public void run() {
            final float f = this.c;
            f.this.p.a(com.censivn.C3DEngine.b.b.a.z + com.censivn.C3DEngine.b.b.a.a(50.0f), this.b, 600, new Runnable() { // from class: com.tsf.shell.e.f.a.a.f.8.1
                @Override // java.lang.Runnable
                public void run() {
                    f.this.k();
                    final float b = f.this.k.b() + f;
                    final float c = f.this.k.c() - f;
                    final float f2 = c - b;
                    f.this.p.a(-20.0f, new Runnable() { // from class: com.tsf.shell.e.f.a.a.f.8.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            f.this.a(b, c, f2);
                        }
                    });
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(float f, float f2, float f3) {
        w.a(new com.censivn.C3DEngine.b.g.b.b(), 1500, new AnonymousClass9(f, f3, f2));
    }

    /* renamed from: com.tsf.shell.e.f.a.a.f$9, reason: invalid class name */
    class AnonymousClass9 extends x {
        private final /* synthetic */ float x;
        private final /* synthetic */ float y;
        private final /* synthetic */ float z;

        AnonymousClass9(float f, float f2, float f3) {
            this.x = f;
            this.y = f2;
            this.z = f3;
        }

        @Override // com.censivn.C3DEngine.b.g.x
        public void a(float f) {
            float f2 = this.x + (this.y * f);
            f.this.p.position().y = f2;
            f.this.k.a(f2);
        }

        @Override // com.censivn.C3DEngine.b.g.x
        public void a() {
            com.censivn.C3DEngine.b.g.b.b bVar = new com.censivn.C3DEngine.b.g.b.b();
            final float f = this.z;
            final float f2 = this.y;
            w.a(bVar, 1500, new x() { // from class: com.tsf.shell.e.f.a.a.f.9.1
                @Override // com.censivn.C3DEngine.b.g.x
                public void a(float f3) {
                    float f4 = f - (f2 * f3);
                    f.this.p.position().y = f4;
                    f.this.k.a(f4);
                    f.this.k.a(f4);
                }

                @Override // com.censivn.C3DEngine.b.g.x
                public void a() {
                    f.this.p.b(new Runnable() { // from class: com.tsf.shell.e.f.a.a.f.9.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            f.this.l();
                            f.this.p.removeFromParent();
                            f.this.e.mouseEnabled(true);
                            f.this.o = false;
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
            final l a2 = com.tsf.shell.manager.a.j.a(this.g);
            boolean aM = com.tsf.shell.manager.a.h.t().aM();
            Runnable runnable = new Runnable() { // from class: com.tsf.shell.e.f.a.a.f.10
                @Override // java.lang.Runnable
                public void run() {
                    com.tsf.shell.manager.a.h.t().aN();
                    ArrayList d = com.tsf.shell.manager.a.w.a().d();
                    ArrayList arrayList = new ArrayList();
                    Iterator it = d.iterator();
                    while (it.hasNext()) {
                        com.tsf.shell.e.i.b.e.i iVar = (com.tsf.shell.e.i.b.e.i) it.next();
                        if (iVar.K() != null && !((LauncherShortcutAppInfo) iVar.K()).isHide) {
                            arrayList.add(iVar);
                        }
                    }
                    ArrayList a3 = b.a(arrayList);
                    f.this.f.addChild(f.this.m);
                    f.this.i.add(f.this.m);
                    f.this.m.a(f.this.q, false);
                    f.this.m.e();
                    Iterator it2 = a3.iterator();
                    while (it2.hasNext()) {
                        com.tsf.shell.e.f.a.a.a.c a4 = f.this.a((e) it2.next());
                        a4.a(f.this.q, false);
                        a4.e();
                    }
                    a2.addChild(f.this.e);
                    f.this.e();
                    f.this.m.g();
                    f.this.d.c();
                    f.this.l.f();
                    f.this.j.mouseEnabled(false);
                    x xVar = new x() { // from class: com.tsf.shell.e.f.a.a.f.10.1
                        @Override // com.censivn.C3DEngine.b.g.x
                        public void a() {
                            f.this.j.mouseEnabled(true);
                            if (f.this.o) {
                                f.this.j();
                            }
                        }
                    };
                    w.a(f.this.j);
                    w.a(f.this.j, 750, xVar);
                }
            };
            if (aM) {
                com.tsf.shell.manager.a.j.c();
                runnable.run();
            } else {
                com.tsf.shell.manager.a.j.a(runnable);
            }
        }
    }

    private void c(com.tsf.shell.e.f.a.a.a.c cVar) {
        this.i.remove(cVar);
        cVar.f();
        cVar.removeFromParent();
        if (!(cVar instanceof h)) {
            this.h.a((com.tsf.shell.e.f.a.a.a.b) cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.tsf.shell.e.f.a.a.a.c a(e eVar) {
        com.tsf.shell.e.f.a.a.a.b bVar = (com.tsf.shell.e.f.a.a.a.b) this.h.c();
        bVar.a(eVar);
        this.f.addChild(bVar);
        this.i.add(bVar);
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.tsf.shell.e.f.a.a.a.c b(e eVar) {
        com.tsf.shell.e.f.a.a.a.b bVar = (com.tsf.shell.e.f.a.a.a.b) this.h.c();
        bVar.a(eVar);
        this.f.addChildAt(bVar, b.a(this.i, bVar) + 1);
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.tsf.shell.e.f.a.a.a.b a(com.tsf.shell.e.i.b.e.i iVar) {
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            com.tsf.shell.e.f.a.a.a.c cVar = (com.tsf.shell.e.f.a.a.a.c) it.next();
            if (cVar instanceof com.tsf.shell.e.f.a.a.a.b) {
                com.tsf.shell.e.f.a.a.a.b bVar = (com.tsf.shell.e.f.a.a.a.b) cVar;
                if (bVar.c(iVar)) {
                    return bVar;
                }
            }
        }
        return null;
    }

    public void g() {
        com.tsf.shell.manager.a.w.a().b(this.n);
        this.j.mouseEnabled(false);
        x xVar = new x();
        xVar.a(0);
        w.a(this.e);
        w.a(this.e, 250, xVar);
        com.tsf.shell.manager.a.j.a(new Runnable() { // from class: com.tsf.shell.e.f.a.a.f.2
            @Override // java.lang.Runnable
            public void run() {
                f.this.l.e();
                com.tsf.shell.manager.a.j.b();
                f.this.e.removeFromParent();
                Iterator it = f.this.i.iterator();
                while (it.hasNext()) {
                    com.tsf.shell.e.f.a.a.a.c cVar = (com.tsf.shell.e.f.a.a.a.c) it.next();
                    cVar.f();
                    cVar.removeFromParent();
                    if (!(cVar instanceof h)) {
                        f.this.h.a((com.tsf.shell.e.f.a.a.a.b) cVar);
                    }
                    f.this.e.alpha(255.0f);
                }
                f.this.i.clear();
                if (f.this.r != f.this.q) {
                    f.this.r = f.this.q;
                    com.tsf.shell.manager.b.g.p(f.this.q);
                }
            }
        }, true);
    }

    public ArrayList h() {
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
