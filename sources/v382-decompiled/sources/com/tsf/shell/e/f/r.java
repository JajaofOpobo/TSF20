package com.tsf.shell.e.f;

import android.annotation.SuppressLint;
import android.view.KeyEvent;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.tsf.shell.Home;
import com.tsf.shell.R;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class r implements com.censivn.C3DEngine.b.c.d, com.censivn.C3DEngine.b.c.k {
    public static int a;
    public static int b;
    public static float c;
    private Runnable A;
    private com.censivn.C3DEngine.b.f.l B;
    private Runnable C;
    private com.tsf.shell.e.g.a.b D;
    private com.tsf.shell.manager.r.c.e E;
    private com.tsf.shell.e.f.d.a F;
    private com.tsf.shell.e.i.c J;
    private ArrayList L;
    private Runnable M;
    public com.tsf.shell.e.f.c.a d;
    private r f;
    private com.tsf.shell.e.e.l g;
    private com.censivn.C3DEngine.b.f.l h;
    private com.censivn.C3DEngine.b.f.a i;
    private com.tsf.shell.e.f.a.m j;
    private ArrayList k;
    private ArrayList l;
    private g m;
    private int n;
    private com.tsf.shell.d.i p;
    private g q;
    private g r;
    private int s;
    private Runnable u;
    private com.tsf.shell.manager.f.a v;
    private t w;
    private v x;
    private com.censivn.C3DEngine.b.d.a y;
    private com.censivn.C3DEngine.b.d.a z;
    private boolean o = false;
    private int t = 2;
    private ArrayList K = new ArrayList();
    private boolean N = false;
    boolean e = true;
    private boolean O = false;
    private Object I = this;
    private com.tsf.shell.e.e.e.a H = new com.tsf.shell.e.e.e.a() { // from class: com.tsf.shell.e.f.r.1
        @Override // com.tsf.shell.e.e.e.a
        public void a(int i, Object obj) {
            c();
            com.tsf.shell.manager.a.h.b((com.tsf.shell.e.i.c) obj);
        }

        @Override // com.tsf.shell.e.e.e.a
        public float a() {
            return com.tsf.shell.manager.a.g.a.j() ? com.censivn.C3DEngine.b.b.a.g + (com.censivn.C3DEngine.b.b.a.h * 2) : com.censivn.C3DEngine.b.b.a.h * 2;
        }
    };
    private x G = new x();

    public r() {
        this.G.a(new y() { // from class: com.tsf.shell.e.f.r.8
            @Override // com.tsf.shell.e.f.y
            public void a(g gVar) {
                r.this.g.b(gVar.r() - 1);
            }
        });
        com.tsf.shell.e.i.a.b.b = this;
        com.tsf.shell.e.i.a.c.a = this;
        com.tsf.shell.manager.a.b.a(this);
        this.f = this;
        aa();
        ab();
    }

    public com.tsf.shell.manager.f.a a() {
        return this.v;
    }

    public com.tsf.shell.e.e.e.a b() {
        return this.H;
    }

    public x c() {
        return this.G;
    }

    public void a(com.tsf.shell.e.i.c cVar) {
        this.J = cVar;
    }

    public void d() {
        this.J = null;
    }

    public void a(int i) {
        this.g.a(i - 1);
    }

    public void e() {
        g.w();
        this.j.av();
    }

    @Override // com.censivn.C3DEngine.b.c.k
    public void a(int i, int i2, int i3, int i4) {
        S();
        this.v.a(i, i2, i3, i4);
        com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.e.f.r.9
            @Override // java.lang.Runnable
            public void run() {
                r.this.K();
            }
        });
    }

    private void S() {
        a = (int) ((com.censivn.C3DEngine.b.b.a.F * 0.28f) + (com.censivn.C3DEngine.b.b.a.b * 90.0f));
        b = (int) ((com.censivn.C3DEngine.b.b.a.G * 0.28f) + (com.censivn.C3DEngine.b.b.a.b * 90.0f));
        c = (a - (com.censivn.C3DEngine.b.b.a.b * 90.0f)) / 2.0f;
        g.y();
        if (this.F != null) {
            this.F.a(com.censivn.C3DEngine.b.b.a.F, com.censivn.C3DEngine.b.b.a.G);
        }
        if (this.B != null) {
            this.B.setAABBPX(-2.1474836E9f, -com.censivn.C3DEngine.b.b.a.I, 0.0f, 2.1474836E9f, com.censivn.C3DEngine.b.b.a.I, 0.0f);
        }
        if (this.x != null) {
            this.x.a(com.censivn.C3DEngine.b.b.a.B, com.censivn.C3DEngine.b.b.a.C, com.censivn.C3DEngine.b.b.a.z, com.censivn.C3DEngine.b.b.a.A);
        }
        if (this.w != null) {
            this.w.a(com.censivn.C3DEngine.b.b.a.B, com.censivn.C3DEngine.b.b.a.C, com.censivn.C3DEngine.b.b.a.z, com.censivn.C3DEngine.b.b.a.A);
        }
    }

    public com.censivn.C3DEngine.b.f.l f() {
        l.a();
        this.d = new com.tsf.shell.e.f.c.a();
        this.g = new com.tsf.shell.e.e.l(true) { // from class: com.tsf.shell.e.f.r.10
            @Override // com.tsf.shell.e.e.l
            public void a() {
                com.tsf.shell.manager.a.g.a.k();
            }
        };
        this.i = new com.censivn.C3DEngine.b.f.a() { // from class: com.tsf.shell.e.f.r.11
            @Override // com.censivn.C3DEngine.b.f.j
            public void onDrawStart() {
                r.this.x.c();
                r.this.M();
            }

            @Override // com.censivn.C3DEngine.b.f.j
            public void onDrawEnd() {
                r.this.N();
            }
        };
        this.D = new com.tsf.shell.e.g.a.b();
        this.F = new com.tsf.shell.e.f.d.a(this) { // from class: com.tsf.shell.e.f.r.12
            @Override // com.tsf.shell.e.f.d.a
            public void a() {
                com.tsf.shell.manager.a.p.c();
                com.censivn.C3DEngine.b.c.c.a(r.this.f);
            }

            @Override // com.tsf.shell.e.f.d.a
            public void b() {
                r.this.t = 1;
                r.this.i.setAnimationObjectState(false);
                if (r.this.C != null) {
                    r.this.C.run();
                    r.this.C = null;
                }
            }

            @Override // com.tsf.shell.e.f.d.a
            public void c() {
                r.this.ao();
            }
        };
        S();
        this.w = new t(this);
        this.h = new com.censivn.C3DEngine.b.f.l() { // from class: com.tsf.shell.e.f.r.13
            @Override // com.censivn.C3DEngine.b.f.j
            @SuppressLint({"WrongCall"})
            public void onDrawStart() {
            }
        };
        this.E = new com.tsf.shell.manager.r.c.e() { // from class: com.tsf.shell.e.f.r.14
            @Override // com.tsf.shell.manager.r.c.e
            public void e() {
            }

            @Override // com.tsf.shell.manager.r.c.e
            public void d() {
            }
        };
        this.x = new v(this);
        this.i.setAnimationObjectState(true);
        this.p = Home.b().l();
        this.B = new com.censivn.C3DEngine.b.f.l();
        this.v = new com.tsf.shell.manager.f.a(this.B);
        this.B.setAABBPX(-2.1474836E9f, -com.censivn.C3DEngine.b.b.a.I, 0.0f, 2.1474836E9f, com.censivn.C3DEngine.b.b.a.I, 0.0f);
        this.y = new com.tsf.shell.e.i.a.b(this.B);
        this.z = new com.censivn.C3DEngine.b.d.a(this.B);
        this.B.setMouseEventListener(this.y);
        this.B.mouseEnabled(false);
        this.A = new Runnable() { // from class: com.tsf.shell.e.f.r.15
            @Override // java.lang.Runnable
            public void run() {
                if (r.this.J != null) {
                    if (r.this.J instanceof com.tsf.shell.e.i.b.b.a) {
                        com.tsf.shell.e.i.b.b.a aVar = (com.tsf.shell.e.i.b.b.a) r.this.J;
                        if (r.this.m.s() != null && r.this.m != r.this.q) {
                            if (!r.this.m.s().a(aVar.K().width * aVar.K().height, aVar.g)) {
                                r.this.y();
                                com.tsf.shell.k.a(R.string.out_of_space);
                            }
                        }
                        r.this.x();
                        return;
                    }
                    r.this.x();
                    return;
                }
                r.this.x();
            }
        };
        for (int i = 0; i < this.k.size(); i++) {
            g gVar = (g) this.k.get(i);
            gVar.x();
            d(gVar);
        }
        this.h.addChild(this.B);
        this.h.addChild(this.i);
        this.x = new v(this);
        ac();
        this.v.a(this.m);
        if (this.r == null) {
            a((g) this.k.get(1));
        }
        this.r.D();
        ae();
        g();
        ai();
        a(this.n);
        this.G.a(this.m);
        return this.h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T() {
        this.B.setMouseEventListener(this.z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U() {
        this.B.setMouseEventListener(this.y);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(g gVar) {
        this.k.remove(gVar);
        this.K.add(gVar);
    }

    private g e(int i) {
        g W = W();
        W.b(i);
        this.k.add(W);
        return W;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public g V() {
        if (this.K.size() == 0) {
            g W = W();
            W.b(Z().intValue());
            this.k.add(W);
            return W;
        }
        g gVar = (g) this.K.remove(0);
        gVar.k();
        gVar.a(com.censivn.C3DEngine.b.b.a.B, com.censivn.C3DEngine.b.b.a.C, com.censivn.C3DEngine.b.b.a.z, com.censivn.C3DEngine.b.b.a.A);
        return gVar;
    }

    private g W() {
        return new o();
    }

    private g X() {
        if (this.j == null) {
            this.j = new com.tsf.shell.e.f.a.m();
            this.j.b(-1);
            this.k.add(this.j);
        }
        return this.j;
    }

    private void Y() {
        this.l = new ArrayList();
        for (int i = 0; i < 15; i++) {
            this.l.add(Integer.valueOf(i));
        }
    }

    private Integer a(Integer num) {
        if (!this.l.contains(num)) {
            return (Integer) this.l.remove(0);
        }
        this.l.remove(num);
        return num;
    }

    private Integer Z() {
        return (Integer) this.l.remove(0);
    }

    public boolean b(int i) {
        return this.L.contains(Integer.valueOf(i));
    }

    private void aa() {
        boolean z;
        String[] split = com.tsf.shell.manager.b.g.ak().split(",");
        this.L = new ArrayList();
        for (String str : split) {
            try {
                Integer valueOf = Integer.valueOf(Integer.parseInt(str));
                Iterator it = this.L.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((Integer) it.next()) == valueOf) {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                if (!z) {
                    this.L.add(valueOf);
                }
            } catch (Exception e) {
            }
        }
    }

    private void ab() {
        int i;
        Y();
        int ai = com.tsf.shell.manager.b.g.ai();
        int aj = com.tsf.shell.manager.b.g.aj();
        this.k = new ArrayList();
        int size = this.L.size();
        if (size > 16) {
            i = 16;
        } else {
            i = size < 1 ? 1 : size;
        }
        X();
        int i2 = 0;
        while (i2 < i) {
            int intValue = i2 < size ? ((Integer) this.L.get(i2)).intValue() : 0;
            if (intValue != -1) {
                e(a(Integer.valueOf(intValue)).intValue());
            }
            i2++;
        }
        if (this.j == null) {
            X();
        }
        int size2 = this.k.size();
        for (int i3 = 0; i3 < size2; i3++) {
            g gVar = (g) this.k.get(i3);
            gVar.a(i3);
            if (i3 > 0) {
                if (i3 == 1) {
                    if (size2 == 2) {
                        gVar.b((g) null);
                        gVar.a((g) null);
                    } else {
                        gVar.b((g) this.k.get(i3 + 1));
                        gVar.a((g) this.k.get(size2 - 1));
                    }
                } else if (i3 == size2 - 1) {
                    if (size2 == 3) {
                        gVar.b((g) null);
                        gVar.a((g) this.k.get(1));
                    } else {
                        gVar.b((g) this.k.get(1));
                        gVar.a((g) this.k.get(i3 - 1));
                    }
                } else {
                    gVar.b((g) this.k.get(i3 + 1));
                    gVar.a((g) this.k.get(i3 - 1));
                }
            }
            gVar.position().x = i3 * c;
            if (gVar.t() == ai && ai != -1) {
                this.m = gVar;
            }
            if (gVar.t() == aj && aj != -1) {
                this.r = gVar;
                a(gVar);
            }
        }
        if (this.m == null) {
            this.m = (g) this.k.get(1);
        }
        int r = this.m.r();
        for (int i4 = 0; i4 < size2; i4++) {
            g gVar2 = (g) this.k.get(i4);
            if (i4 < r) {
                gVar2.g = -1.0f;
            } else if (i4 > r) {
                gVar2.g = 1.0f;
            } else {
                gVar2.g = 0.0f;
            }
        }
    }

    public void g() {
        a(com.tsf.shell.manager.b.g.J());
    }

    public void a(boolean z) {
        if (z) {
            if (this.n == 2 || this.n == 3) {
                ((g) this.k.get(1)).a((g) null);
                ((g) this.k.get(this.n - 1)).b((g) null);
            } else {
                ((g) this.k.get(1)).a((g) this.k.get(this.n - 1));
                ((g) this.k.get(this.n - 1)).b((g) this.k.get(1));
            }
        } else {
            ((g) this.k.get(1)).a((g) null);
            ((g) this.k.get(this.n - 1)).b((g) null);
        }
        this.j.a((g) null);
        this.j.b((g) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final g gVar) {
        com.censivn.C3DEngine.b.f.j n = gVar.n();
        if (n != null) {
            n.calAABB(1.0f, 1.5f, 1.0f);
            s sVar = new s(this, n);
            sVar.a(gVar);
            gVar.b(sVar);
            gVar.a(new com.tsf.shell.e.i.a.b(n) { // from class: com.tsf.shell.e.f.r.2
                @Override // com.tsf.shell.e.i.a.b, com.censivn.C3DEngine.b.d.a
                public void a(MotionEvent motionEvent) {
                    if (r.this.t == 1 || r.this.t == 3) {
                        r.this.a(gVar, true, true);
                        r.this.x();
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ac() {
        Iterator it = this.k.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (!((g) it.next()).q()) {
                i++;
            }
        }
        if (i != this.n) {
            this.n = i;
            this.F.a(this.n);
            a(this.n);
        }
    }

    public float c(int i) {
        return -(i * c);
    }

    public com.tsf.shell.e.e.l h() {
        return this.g;
    }

    public void a(g gVar) {
        if (!gVar.q() && gVar.t() != -1) {
            if (this.t == 2) {
                this.r = gVar;
            } else {
                if (this.r != null) {
                    this.r.D();
                }
                this.r = gVar;
                this.r.C();
            }
            com.tsf.shell.manager.b.g.n(gVar.t());
        }
    }

    public t i() {
        return this.w;
    }

    public com.tsf.shell.e.g.a.b j() {
        return this.D;
    }

    public g k() {
        return this.q;
    }

    public void b(com.tsf.shell.e.i.c cVar) {
        ((com.tsf.shell.e.i.a.c) cVar.getMouseEventListener()).a(true);
        cVar.d_();
        w();
    }

    public int l() {
        return this.n;
    }

    public int m() {
        return this.t;
    }

    public g n() {
        return this.m;
    }

    public g o() {
        return (g) this.k.get(1);
    }

    public g p() {
        return (g) this.k.get(this.k.size() - 1);
    }

    public int q() {
        return ((g) this.k.get(1)).t();
    }

    public com.tsf.shell.e.f.d.a r() {
        return this.F;
    }

    public v s() {
        return this.x;
    }

    public g d(int i) {
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            g gVar = (g) it.next();
            if (gVar.t() == i) {
                return gVar;
            }
        }
        Iterator it2 = this.k.iterator();
        while (it2.hasNext()) {
            g gVar2 = (g) it2.next();
            if (gVar2.t() != -1) {
                return gVar2;
            }
        }
        return null;
    }

    public com.tsf.shell.e.f.a.m t() {
        return this.j;
    }

    public com.censivn.C3DEngine.b.f.l u() {
        return this.i;
    }

    public com.censivn.C3DEngine.b.f.l v() {
        return this.h;
    }

    public void w() {
        if (!this.o && !this.x.a()) {
            this.s = 1;
            this.i.invalidate();
        }
    }

    public void x() {
        ad();
        this.s = 2;
        this.i.invalidate();
    }

    public void b(g gVar) {
        this.q = gVar;
    }

    public void y() {
        if (this.q != null) {
            if (this.q.t() == -1) {
                Iterator it = this.k.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    g gVar = (g) it.next();
                    if (gVar.t() != -1) {
                        this.q = gVar;
                        break;
                    }
                }
            }
            a(this.q, true, true);
        }
    }

    private void ad() {
        if (this.M != null) {
            com.censivn.C3DEngine.a.a().g(this.M);
            this.M = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ae() {
        float c2 = c(this.m.r());
        this.m.position().x = -c2;
        this.i.position().x = c2;
    }

    public boolean a(g gVar, Runnable runnable, Runnable runnable2) {
        if (B()) {
            try {
                if (gVar != this.m) {
                    if (runnable != null) {
                        runnable.run();
                    }
                    com.tsf.shell.manager.a.h.af();
                    this.x.b(gVar, runnable2);
                }
                return true;
            } catch (Exception e) {
                if (runnable2 == null) {
                    return false;
                }
                runnable2.run();
                return false;
            }
        }
        if (runnable2 == null) {
            return false;
        }
        runnable2.run();
        return false;
    }

    private void af() {
        this.j.b(o());
        o().a((g) this.j);
        p().b((g) null);
    }

    public void z() {
        if (com.censivn.C3DEngine.a.i.l()) {
            if (this.r != this.m) {
                if (this.m == this.j) {
                    this.q = this.r;
                    s().c(VEasing.Linear.easeNone);
                    return;
                } else {
                    a(this.r, (Runnable) null, (Runnable) null);
                    return;
                }
            }
            return;
        }
        com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.e.f.r.3
            @Override // java.lang.Runnable
            public void run() {
                r.this.z();
            }
        });
    }

    public void A() {
        if (com.censivn.C3DEngine.a.i.l()) {
            if (B()) {
                try {
                    if (this.r != this.m) {
                        if (this.m == this.j) {
                            this.q = this.r;
                            s().c(VEasing.Linear.easeNone);
                        } else {
                            a(this.r, (Runnable) null, (Runnable) null);
                        }
                    } else if (this.m != this.j) {
                        s().c(VEasing.Linear.easeNone);
                    }
                    return;
                } catch (Exception e) {
                    return;
                }
            }
            return;
        }
        com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.e.f.r.4
            @Override // java.lang.Runnable
            public void run() {
                r.this.A();
            }
        });
    }

    public boolean B() {
        return this.t == 2 && com.tsf.shell.manager.a.c.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ag() {
        com.tsf.shell.d.i.setMouseEnabled(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ah() {
        com.tsf.shell.d.i.setMouseEnabled(true);
    }

    public void a(final float f, final float f2, final float f3, final float f4) {
        this.F.a(f, f2, f3, f4, this.O);
        com.censivn.C3DEngine.a.a().b(new Runnable() { // from class: com.tsf.shell.e.f.r.5
            @Override // java.lang.Runnable
            public void run() {
                r.this.b(f, f2, f3, f4);
            }
        });
    }

    public void b(float f, float f2, float f3, float f4) {
        if (this.t != 4 && this.t != 2) {
            com.tsf.shell.manager.a.f.a(f / com.censivn.C3DEngine.b.b.a.D);
            g gVar = (g) this.k.get(this.F.a(this.n, f, f2, f3, f4, this.O));
            if (gVar != this.m) {
                a(gVar, true, false);
                ad();
                this.M = this.A;
                com.censivn.C3DEngine.a.a().b(this.M, 1400L);
            }
        }
    }

    public void a(g gVar, boolean z, boolean z2) {
        if (z) {
            this.m.killFocus();
            this.m = gVar;
            this.m.setFocus();
        } else {
            this.m.F();
            this.m = gVar;
            this.m.E();
        }
        ai();
        if (z2) {
            this.G.a(this.m);
        }
    }

    private void ai() {
        e(this.m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(g gVar) {
        com.tsf.shell.e.i.b.e.d.h(((-gVar.r()) / this.n) * 360.0f);
    }

    public void C() {
        this.N = true;
        x();
    }

    private void aj() {
        this.j.position().x = -c;
        this.j.position().y = 0.0f;
        this.j.rotation().y = 0.0f;
        this.j.d(false);
        this.j.removeFromParent();
        this.i.addChild(this.j);
        a((g) this.j, true, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ak() {
        com.tsf.shell.manager.a.v.c.f();
        this.e = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void al() {
        this.e = true;
    }

    private void am() {
        ag();
    }

    @SuppressLint({"WrongCall"})
    public void D() {
        if (this.t != 2 && this.t != 4) {
            this.F.d();
            return;
        }
        if (this.t != 3 && this.t != 1) {
            com.tsf.shell.manager.a.n.i();
            ak();
            this.O = this.J != null;
            this.v.b();
            this.G.a();
            com.tsf.shell.manager.a.c.a(this.I);
            this.i.setAnimationObjectState(true);
            if (this.t == 2) {
                this.m.V();
                this.q = this.m;
                this.B.mouseEnabled(true);
            }
            this.r.C();
            this.j.aw();
            this.m.d(true);
            this.t = 3;
            if (this.u != null) {
                this.u.run();
                this.u = null;
            }
            this.F.a(this, this.n, this.k, this.m, this.O);
        }
    }

    private void an() {
        if (this.t != 4 && this.t != 2) {
            if (this.N) {
                aj();
            }
            com.tsf.shell.manager.a.n.j();
            com.tsf.shell.manager.a.c.a(this.I, true);
            this.v.a(this.m);
            this.G.b();
            this.G.a(this.m);
            com.censivn.C3DEngine.b.c.c.b(this);
            this.i.setAnimationObjectState(true);
            if (this.O && !this.N) {
                this.o = true;
                if (F() == -1) {
                    com.tsf.shell.k.a(com.censivn.C3DEngine.a.d().getString(R.string.notic_widget_forbid_add));
                    y();
                }
            }
            this.N = false;
            this.t = 4;
            this.r.D();
            this.j.ax();
            this.F.a(this, this.k, this.m, this.O);
            this.m.g = 0.0f;
            a(true, "hdieSelect");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ao() {
        g n;
        this.B.mouseEnabled(false);
        Runnable runnable = new Runnable() { // from class: com.tsf.shell.e.f.r.6
            @Override // java.lang.Runnable
            public void run() {
                if (r.this.m.t() == -1) {
                    com.censivn.C3DEngine.a.h.d().c().a(false);
                } else {
                    com.censivn.C3DEngine.a.h.d().c().a(true);
                }
                r.this.ah();
                com.tsf.shell.manager.b.g.m(r.this.m.t());
                r.this.t = 2;
            }
        };
        if (this.J != null) {
            com.tsf.shell.e.i.a.c cVar = (com.tsf.shell.e.i.a.c) this.J.getMouseEventListener();
            cVar.a(false);
            if (!cVar.a() && (n = com.tsf.shell.manager.a.h.n()) != null) {
                this.J.removeFromParent();
                n.a(this.J);
            }
            this.J.m_();
            d();
            this.o = false;
        }
        this.p.post(runnable);
        this.m.M();
        this.m.g = 0.0f;
        this.m.W();
        this.i.setAnimationObjectState(false);
        al();
    }

    public boolean E() {
        return com.tsf.shell.manager.a.h.F() == -1;
    }

    public int F() {
        if (this.m == null) {
            return -1;
        }
        return this.m.t();
    }

    public ArrayList G() {
        return this.m.R();
    }

    public void H() {
        ag();
        com.censivn.C3DEngine.a.h.d().c().a(false);
    }

    public void I() {
        if (this.t == 2) {
            if (this.m.t() == -1) {
                com.censivn.C3DEngine.a.h.d().c().a(false);
            } else {
                com.censivn.C3DEngine.a.h.d().c().a(true);
            }
            ah();
        }
    }

    public void J() {
        ap();
    }

    public void K() {
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            ((g) it.next()).P();
        }
    }

    private void ap() {
        this.i.invalidate();
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            g gVar = (g) it.next();
            if (this.m != gVar) {
                gVar.N();
                gVar.K();
                gVar.V();
            } else {
                gVar.W();
            }
        }
        this.m.removeFromParent();
        this.i.addChild(this.m);
        this.m.M();
        com.tsf.shell.manager.a.f.d();
        com.tsf.shell.e.e.c().b();
        this.i.setAnimationObjectState(false);
        if (this.m.t() == -1) {
            com.censivn.C3DEngine.a.h.d().c().a(false);
        }
    }

    public void L() {
        if (com.tsf.shell.manager.a.A.a() && this.s != 1) {
            w();
            am();
            N();
            this.w.g();
        }
    }

    public void M() {
        if (this.t == 2 && this.s == 1) {
            am();
        }
    }

    public void N() {
        if (this.s == 2) {
            an();
        } else if (this.s == 1) {
            D();
        }
    }

    public void O() {
        if (this.m != null) {
            this.m.ac();
            Iterator it = this.k.iterator();
            while (it.hasNext()) {
                ((g) it.next()).T();
            }
        }
    }

    public void P() {
        if (this.m != null) {
            this.m.ab();
            Iterator it = this.k.iterator();
            while (it.hasNext()) {
                ((g) it.next()).U();
            }
        }
    }

    @Override // com.censivn.C3DEngine.b.c.d
    public void a(int i, KeyEvent keyEvent) {
        if (i == 4) {
            if (!this.w.a()) {
                com.censivn.C3DEngine.b.c.c.b(this);
                x();
            } else {
                this.w.l();
            }
        }
    }

    @Override // com.censivn.C3DEngine.b.c.d
    public void b(int i, KeyEvent keyEvent) {
    }

    public void Q() {
        n().m().f();
    }

    public void R() {
        com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.e.f.r.7
            @Override // java.lang.Runnable
            public void run() {
                if (com.tsf.shell.manager.a.A.a()) {
                    com.censivn.C3DEngine.a.h.d().i();
                    if (!r.this.E.a() && com.tsf.shell.manager.a.h.B() && com.tsf.shell.manager.a.h.F() != -1) {
                        r.this.E.b();
                        com.tsf.shell.manager.p.c.a(5);
                        com.tsf.shell.k.a(R.string.notic_page_lasso_mode_enable);
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z, String str) {
        a(this.m, z, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(g gVar, boolean z, String str) {
        com.tsf.shell.manager.a.f.a(gVar, z, true);
    }
}
