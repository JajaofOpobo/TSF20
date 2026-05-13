package com.tsf.shell.f.f;

import android.annotation.SuppressLint;
import android.view.KeyEvent;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.b.c.b;
import com.censivn.C3DEngine.b.c.e;
import com.tsf.b;
import com.tsf.shell.Home;
import com.tsf.shell.f.f.o;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.description.ThemeShellDescription;
import com.tsf.shell.theme.inside.mix.menu.DynamicTextureElement;
import com.tsf.shell.utils.w;
import com.tsf.shell.utils.x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
/* loaded from: classes.dex */
public class n implements b.a, e.a {
    public static int a;
    public static int b;
    public static float c;
    private Runnable A;
    private com.censivn.C3DEngine.b.f.j B;
    private Runnable C;
    private com.tsf.shell.f.g.a.b D;
    private com.tsf.shell.manager.r.c.d E;
    private com.tsf.shell.f.f.d.a F;
    private com.tsf.shell.f.i.b J;
    private ArrayList<Integer> L;
    private Runnable M;
    public com.tsf.shell.f.f.c.a d;
    private n f;
    private com.tsf.shell.f.e.j g;
    private com.censivn.C3DEngine.b.f.j h;
    private com.censivn.C3DEngine.b.f.a i;
    private com.tsf.shell.f.f.a.h j;
    private ArrayList<g> k;
    private ArrayList<Integer> l;
    private g m;
    private int n;
    private com.tsf.shell.e.f p;
    private g q;
    private g r;
    private int s;
    private Runnable u;
    private com.tsf.shell.manager.f.a v;
    private b w;
    private c x;
    private com.censivn.C3DEngine.b.d.a y;
    private com.censivn.C3DEngine.b.d.a z;
    private boolean o = false;
    private int t = 2;
    private ArrayList<g> K = new ArrayList<>();
    private boolean N = false;
    boolean e = true;
    private boolean O = false;
    private Object I = this;
    private com.tsf.shell.f.e.e.a H = new com.tsf.shell.f.e.e.a() { // from class: com.tsf.shell.f.f.n.1
        @Override // com.tsf.shell.f.e.e.a
        public void a(int i, Object obj) {
            c();
            com.tsf.shell.manager.a.h.b((com.tsf.shell.f.i.b) obj);
        }

        @Override // com.tsf.shell.f.e.e.a
        public float a() {
            return com.tsf.shell.manager.a.g.a.j() ? com.censivn.C3DEngine.b.b.a.g + (com.censivn.C3DEngine.b.b.a.h * 2) : com.censivn.C3DEngine.b.b.a.h * 2;
        }
    };
    private o G = new o();

    public n() {
        this.G.a(new o.a() { // from class: com.tsf.shell.f.f.n.8
            @Override // com.tsf.shell.f.f.o.a
            public void a(g gVar) {
                n.this.g.b(gVar.r() - 1);
            }
        });
        com.tsf.shell.f.i.a.b.d = this;
        com.tsf.shell.f.i.a.c.a = this;
        com.tsf.shell.manager.a.b.a(this);
        this.f = this;
        aa();
        ab();
    }

    public com.tsf.shell.manager.f.a a() {
        return this.v;
    }

    public com.tsf.shell.f.e.e.a b() {
        return this.H;
    }

    public o c() {
        return this.G;
    }

    public void a(com.tsf.shell.f.i.b bVar) {
        this.J = bVar;
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

    @Override // com.censivn.C3DEngine.b.c.e.a
    public void a(int i, int i2, int i3, int i4) {
        S();
        this.v.a(i, i2, i3, i4);
        com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.f.f.n.9
            @Override // java.lang.Runnable
            public void run() {
                n.this.K();
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

    public com.censivn.C3DEngine.b.f.j f() {
        j.a();
        this.d = new com.tsf.shell.f.f.c.a();
        this.g = new com.tsf.shell.f.e.j(true) { // from class: com.tsf.shell.f.f.n.10
            @Override // com.tsf.shell.f.e.j
            public void a() {
                com.tsf.shell.manager.a.g.a.k();
            }
        };
        this.i = new com.censivn.C3DEngine.b.f.a() { // from class: com.tsf.shell.f.f.n.11
            @Override // com.censivn.C3DEngine.b.f.i
            public void onDrawStart() {
                n.this.x.c();
                n.this.M();
            }

            @Override // com.censivn.C3DEngine.b.f.i
            public void onDrawEnd() {
                n.this.N();
            }
        };
        this.D = new com.tsf.shell.f.g.a.b();
        this.F = new com.tsf.shell.f.f.d.a(this) { // from class: com.tsf.shell.f.f.n.12
            @Override // com.tsf.shell.f.f.d.a
            public void a() {
                com.tsf.shell.manager.a.p.c();
                com.censivn.C3DEngine.b.c.b.a(n.this.f);
            }

            @Override // com.tsf.shell.f.f.d.a
            public void b() {
                n.this.t = 1;
                n.this.i.setAnimationObjectState(false);
                if (n.this.C != null) {
                    n.this.C.run();
                    n.this.C = null;
                }
            }

            @Override // com.tsf.shell.f.f.d.a
            public void c() {
                n.this.ao();
            }
        };
        S();
        this.w = new b();
        this.h = new com.censivn.C3DEngine.b.f.j() { // from class: com.tsf.shell.f.f.n.13
            @Override // com.censivn.C3DEngine.b.f.i
            @SuppressLint({"WrongCall"})
            public void onDrawStart() {
            }
        };
        this.E = new com.tsf.shell.manager.r.c.d() { // from class: com.tsf.shell.f.f.n.14
            @Override // com.tsf.shell.manager.r.c.d
            public void e() {
            }

            @Override // com.tsf.shell.manager.r.c.d
            public void d() {
            }
        };
        this.x = new c();
        this.i.setAnimationObjectState(true);
        this.p = Home.b().l();
        this.B = new com.censivn.C3DEngine.b.f.j();
        this.v = new com.tsf.shell.manager.f.a(this.B);
        this.B.setAABBPX(-2.1474836E9f, -com.censivn.C3DEngine.b.b.a.I, 0.0f, 2.1474836E9f, com.censivn.C3DEngine.b.b.a.I, 0.0f);
        this.y = new com.tsf.shell.f.i.a.b(this.B);
        this.z = new com.censivn.C3DEngine.b.d.a(this.B);
        this.B.setMouseEventListener(this.y);
        this.B.mouseEnabled(false);
        this.A = new Runnable() { // from class: com.tsf.shell.f.f.n.15
            @Override // java.lang.Runnable
            public void run() {
                if (n.this.J != null) {
                    if (n.this.J instanceof com.tsf.shell.f.i.b.b.a) {
                        com.tsf.shell.f.i.b.b.a aVar = (com.tsf.shell.f.i.b.b.a) n.this.J;
                        if (n.this.m.s() != null && n.this.m != n.this.q) {
                            if (!n.this.m.s().a(aVar.K().width * aVar.K().height, aVar.g)) {
                                n.this.y();
                                com.tsf.shell.e.a(b.i.out_of_space);
                            }
                        }
                        n.this.x();
                        return;
                    }
                    n.this.x();
                    return;
                }
                n.this.x();
            }
        };
        for (int i = 0; i < this.k.size(); i++) {
            g gVar = this.k.get(i);
            gVar.x();
            d(gVar);
        }
        this.h.addChild(this.B);
        this.h.addChild(this.i);
        this.x = new c();
        ac();
        this.v.a(this.m);
        if (this.r == null) {
            a(this.k.get(1));
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
        g remove = this.K.remove(0);
        remove.k();
        remove.a(com.censivn.C3DEngine.b.b.a.B, com.censivn.C3DEngine.b.b.a.C, com.censivn.C3DEngine.b.b.a.z, com.censivn.C3DEngine.b.b.a.A);
        return remove;
    }

    private g W() {
        return new k();
    }

    private g X() {
        if (this.j == null) {
            this.j = new com.tsf.shell.f.f.a.h();
            this.j.b(-1);
            this.k.add(this.j);
        }
        return this.j;
    }

    private void Y() {
        this.l = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            this.l.add(Integer.valueOf(i));
        }
    }

    private Integer a(Integer num) {
        if (this.l.contains(num)) {
            this.l.remove(num);
            return num;
        }
        return this.l.remove(0);
    }

    private Integer Z() {
        return this.l.remove(0);
    }

    public boolean b(int i) {
        return this.L.contains(Integer.valueOf(i));
    }

    private void aa() {
        boolean z;
        String[] split = com.tsf.shell.manager.b.e.am().split(",");
        this.L = new ArrayList<>();
        for (String str : split) {
            try {
                Integer valueOf = Integer.valueOf(Integer.parseInt(str));
                Iterator<Integer> it = this.L.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next() == valueOf) {
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
        int ak = com.tsf.shell.manager.b.e.ak();
        int al = com.tsf.shell.manager.b.e.al();
        this.k = new ArrayList<>();
        int size = this.L.size();
        if (size > 16) {
            i = 16;
        } else {
            i = size < 1 ? 1 : size;
        }
        X();
        int i2 = 0;
        while (i2 < i) {
            int intValue = i2 < size ? this.L.get(i2).intValue() : 0;
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
            g gVar = this.k.get(i3);
            gVar.a(i3);
            if (i3 > 0) {
                if (i3 == 1) {
                    if (size2 == 2) {
                        gVar.b((g) null);
                        gVar.a((g) null);
                    } else {
                        gVar.b(this.k.get(i3 + 1));
                        gVar.a(this.k.get(size2 - 1));
                    }
                } else if (i3 == size2 - 1) {
                    if (size2 == 3) {
                        gVar.b((g) null);
                        gVar.a(this.k.get(1));
                    } else {
                        gVar.b(this.k.get(1));
                        gVar.a(this.k.get(i3 - 1));
                    }
                } else {
                    gVar.b(this.k.get(i3 + 1));
                    gVar.a(this.k.get(i3 - 1));
                }
            }
            gVar.position().x = i3 * c;
            if (gVar.t() == ak && ak != -1) {
                this.m = gVar;
            }
            if (gVar.t() == al && al != -1) {
                this.r = gVar;
                a(gVar);
            }
        }
        if (this.m == null) {
            this.m = this.k.get(1);
        }
        int r = this.m.r();
        for (int i4 = 0; i4 < size2; i4++) {
            g gVar2 = this.k.get(i4);
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
        a(com.tsf.shell.manager.b.e.J());
    }

    public void a(boolean z) {
        if (z) {
            if (this.n == 2 || this.n == 3) {
                this.k.get(1).a((g) null);
                this.k.get(this.n - 1).b((g) null);
            } else {
                this.k.get(1).a(this.k.get(this.n - 1));
                this.k.get(this.n - 1).b(this.k.get(1));
            }
        } else {
            this.k.get(1).a((g) null);
            this.k.get(this.n - 1).b((g) null);
        }
        this.j.a((g) null);
        this.j.b((g) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final g gVar) {
        com.censivn.C3DEngine.b.f.i n = gVar.n();
        if (n != null) {
            n.calAABB(1.0f, 1.5f, 1.0f);
            a aVar = new a(n);
            aVar.a(gVar);
            gVar.b(aVar);
            gVar.a(new com.tsf.shell.f.i.a.b(n) { // from class: com.tsf.shell.f.f.n.2
                @Override // com.tsf.shell.f.i.a.b, com.censivn.C3DEngine.b.d.a
                public void a(MotionEvent motionEvent) {
                    if (n.this.t == 1 || n.this.t == 3) {
                        n.this.a(gVar, true, true);
                        n.this.x();
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ac() {
        int i;
        int i2 = 0;
        Iterator<g> it = this.k.iterator();
        while (true) {
            i = i2;
            if (!it.hasNext()) {
                break;
            }
            i2 = !it.next().q() ? i + 1 : i;
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

    public com.tsf.shell.f.e.j h() {
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
            com.tsf.shell.manager.b.e.o(gVar.t());
        }
    }

    public b i() {
        return this.w;
    }

    public com.tsf.shell.f.g.a.b j() {
        return this.D;
    }

    public g k() {
        return this.q;
    }

    public void b(com.tsf.shell.f.i.b bVar) {
        ((com.tsf.shell.f.i.a.c) bVar.getMouseEventListener()).a(true);
        bVar.f_();
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
        return this.k.get(1);
    }

    public g p() {
        return this.k.get(this.k.size() - 1);
    }

    public int q() {
        return this.k.get(1).t();
    }

    public com.tsf.shell.f.f.d.a r() {
        return this.F;
    }

    public c s() {
        return this.x;
    }

    public g d(int i) {
        Iterator<g> it = this.k.iterator();
        while (it.hasNext()) {
            g next = it.next();
            if (next.t() == i) {
                return next;
            }
        }
        Iterator<g> it2 = this.k.iterator();
        while (it2.hasNext()) {
            g next2 = it2.next();
            if (next2.t() != -1) {
                return next2;
            }
        }
        return null;
    }

    public com.tsf.shell.f.f.a.h t() {
        return this.j;
    }

    public com.censivn.C3DEngine.b.f.j u() {
        return this.i;
    }

    public com.censivn.C3DEngine.b.f.j v() {
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
                Iterator<g> it = this.k.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    g next = it.next();
                    if (next.t() != -1) {
                        this.q = next;
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
                if (runnable2 != null) {
                    runnable2.run();
                    return false;
                }
                return false;
            }
        } else if (runnable2 != null) {
            runnable2.run();
            return false;
        } else {
            return false;
        }
    }

    private void af() {
        this.j.b(o());
        o().a((g) this.j);
        p().b((g) null);
    }

    public void z() {
        if (com.censivn.C3DEngine.a.e.l()) {
            if (this.r != this.m) {
                if (this.m == this.j) {
                    this.q = this.r;
                    s().c(VEasing.Linear.easeNone);
                    return;
                }
                a(this.r, (Runnable) null, (Runnable) null);
                return;
            }
            return;
        }
        com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.f.f.n.3
            @Override // java.lang.Runnable
            public void run() {
                n.this.z();
            }
        });
    }

    public void A() {
        if (com.censivn.C3DEngine.a.e.l()) {
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
        com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.f.f.n.4
            @Override // java.lang.Runnable
            public void run() {
                n.this.A();
            }
        });
    }

    public boolean B() {
        return this.t == 2 && com.tsf.shell.manager.a.c.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ag() {
        com.tsf.shell.e.f.setMouseEnabled(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ah() {
        com.tsf.shell.e.f.setMouseEnabled(true);
    }

    public void a(final float f, final float f2, final float f3, final float f4) {
        this.F.a(f, f2, f3, f4, this.O);
        com.censivn.C3DEngine.a.a().b(new Runnable() { // from class: com.tsf.shell.f.f.n.5
            @Override // java.lang.Runnable
            public void run() {
                n.this.b(f, f2, f3, f4);
            }
        });
    }

    public void b(float f, float f2, float f3, float f4) {
        if (this.t != 4 && this.t != 2) {
            com.tsf.shell.manager.a.f.a(f / com.censivn.C3DEngine.b.b.a.D);
            g gVar = this.k.get(this.F.a(this.n, f, f2, f3, f4, this.O));
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
        com.tsf.shell.f.i.b.e.c.h(((-gVar.r()) / this.n) * 360.0f);
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
        } else if (this.t != 3 && this.t != 1) {
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
            com.censivn.C3DEngine.b.c.b.b(this);
            this.i.setAnimationObjectState(true);
            if (this.O && !this.N) {
                this.o = true;
                if (F() == -1) {
                    com.tsf.shell.e.a(com.censivn.C3DEngine.a.d().getString(b.i.notic_widget_forbid_add));
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
        Runnable runnable = new Runnable() { // from class: com.tsf.shell.f.f.n.6
            @Override // java.lang.Runnable
            public void run() {
                if (n.this.m.t() == -1) {
                    com.censivn.C3DEngine.a.d.d().c().a(false);
                } else {
                    com.censivn.C3DEngine.a.d.d().c().a(true);
                }
                n.this.ah();
                com.tsf.shell.manager.b.e.n(n.this.m.t());
                n.this.t = 2;
            }
        };
        if (this.J != null) {
            com.tsf.shell.f.i.a.c cVar = (com.tsf.shell.f.i.a.c) this.J.getMouseEventListener();
            cVar.a(false);
            if (!cVar.a() && (n = com.tsf.shell.manager.a.h.n()) != null) {
                this.J.removeFromParent();
                n.a(this.J);
            }
            this.J.o_();
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

    public ArrayList<com.censivn.C3DEngine.b.f.i> G() {
        return this.m.R();
    }

    public void H() {
        ag();
        com.censivn.C3DEngine.a.d.d().c().a(false);
    }

    public void I() {
        if (this.t == 2) {
            if (this.m.t() == -1) {
                com.censivn.C3DEngine.a.d.d().c().a(false);
            } else {
                com.censivn.C3DEngine.a.d.d().c().a(true);
            }
            ah();
        }
    }

    public void J() {
        ap();
    }

    public void K() {
        Iterator<g> it = this.k.iterator();
        while (it.hasNext()) {
            it.next().P();
        }
    }

    private void ap() {
        this.i.invalidate();
        Iterator<g> it = this.k.iterator();
        while (it.hasNext()) {
            g next = it.next();
            if (this.m != next) {
                next.N();
                next.K();
                next.V();
            } else {
                next.W();
            }
        }
        this.m.removeFromParent();
        this.i.addChild(this.m);
        this.m.M();
        com.tsf.shell.manager.a.f.d();
        com.tsf.shell.f.d.c().b();
        this.i.setAnimationObjectState(false);
        if (this.m.t() == -1) {
            com.censivn.C3DEngine.a.d.d().c().a(false);
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
            Iterator<g> it = this.k.iterator();
            while (it.hasNext()) {
                it.next().T();
            }
        }
    }

    public void P() {
        if (this.m != null) {
            this.m.ab();
            Iterator<g> it = this.k.iterator();
            while (it.hasNext()) {
                it.next().U();
            }
        }
    }

    @Override // com.censivn.C3DEngine.b.c.b.a
    public void a(int i, KeyEvent keyEvent) {
        if (i == 4) {
            if (!this.w.a()) {
                com.censivn.C3DEngine.b.c.b.b(this);
                x();
                return;
            }
            this.w.l();
        }
    }

    @Override // com.censivn.C3DEngine.b.c.b.a
    public void b(int i, KeyEvent keyEvent) {
    }

    public void Q() {
        n().m().f();
    }

    public void R() {
        com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.f.f.n.7
            @Override // java.lang.Runnable
            public void run() {
                if (com.tsf.shell.manager.a.A.a()) {
                    com.censivn.C3DEngine.a.d.d().i();
                    if (!n.this.E.a() && com.tsf.shell.manager.a.h.B() && com.tsf.shell.manager.a.h.F() != -1) {
                        n.this.E.b();
                        com.tsf.shell.manager.p.c.a(5);
                        com.tsf.shell.e.a(b.i.notic_page_lasso_mode_enable);
                    }
                }
            }
        });
    }

    /* loaded from: classes.dex */
    public class c implements b.a {
        private com.censivn.C3DEngine.b.f.j A;
        private com.censivn.C3DEngine.b.f.j B;
        private double C;
        private float D;
        private a E;
        private com.censivn.C3DEngine.b.d.a F;
        private com.censivn.C3DEngine.b.g.b.b G;
        private com.censivn.C3DEngine.b.g.d H;
        private g I;
        private float J;
        private float K;
        private g L;
        private Runnable M;
        l c;
        private float f;
        private float g;
        private float n;
        private float o;
        private float p;
        private float v;
        private boolean h = false;
        private boolean i = true;
        private boolean j = false;
        private boolean k = true;
        private boolean l = false;
        private boolean m = false;
        private float q = 0.0f;
        private float r = 0.0f;
        private float s = 0.0f;
        private float t = 0.0f;
        private float u = 0.0f;
        private boolean w = true;
        private float x = 0.03f;
        private boolean y = false;
        private boolean z = false;
        public float a = 0.125f;
        public float b = 0.3f;
        boolean d = false;
        private boolean N = true;

        public void a(float f) {
            this.r = f;
        }

        public void b(float f) {
            this.q = f;
        }

        public boolean a() {
            return !this.k;
        }

        public boolean b() {
            return this.j;
        }

        public void a(int i, int i2, int i3, int i4) {
            if (this.B != null) {
                this.B.setAABBPX(com.censivn.C3DEngine.b.b.a.z, com.censivn.C3DEngine.b.b.a.C, 0.0f, com.censivn.C3DEngine.b.b.a.A, com.censivn.C3DEngine.b.b.a.B, 0.0f);
            }
            this.n = m();
            if (!this.w) {
                this.o = -this.n;
                this.p = -((int) (this.n * 3.5f));
                int i5 = 0;
                while (true) {
                    int i6 = i5;
                    if (i6 < n.this.n) {
                        g gVar = (g) n.this.k.get(i6);
                        gVar.position().z = (float) (Math.cos(i6 * this.C) * this.n);
                        gVar.position().x = (float) (Math.sin(i6 * this.C) * this.n);
                        gVar.rotation().y = this.D * i6;
                        i5 = i6 + 1;
                    } else {
                        this.u = this.A.rotation().y;
                        this.v = this.A.position().z;
                        this.s = (this.o + this.p) / 3.0f;
                        this.A.position().z = this.s;
                        return;
                    }
                }
            }
        }

        public c() {
            com.censivn.C3DEngine.a.d.d().c().a(this);
            this.G = new com.censivn.C3DEngine.b.g.b.b();
            this.E = new a();
            i();
        }

        private void i() {
            this.o = -this.n;
            this.p = -((int) (this.n * 3.5f));
            this.B = new com.censivn.C3DEngine.b.f.j();
            this.A = new com.censivn.C3DEngine.b.f.j() { // from class: com.tsf.shell.f.f.n.c.1
                @Override // com.censivn.C3DEngine.b.f.j
                public void onDrawChildStart() {
                    boolean z;
                    Iterator<com.censivn.C3DEngine.b.f.i> it = c.this.A.children().iterator();
                    while (it.hasNext()) {
                        com.censivn.C3DEngine.b.f.i next = it.next();
                        g gVar = (g) next;
                        float a2 = x.a(next.rotation().y + rotation().y);
                        if (a2 <= 90.0f || a2 >= 270.0f) {
                            z = true;
                        } else {
                            z = false;
                        }
                        gVar.b(z);
                    }
                }

                @Override // com.censivn.C3DEngine.b.f.i
                public void onDrawEnd() {
                    if (!c.this.w && !c.this.z) {
                        Collections.sort(children(), c.this.E);
                        position().z += (c.this.s - position().z) * 0.2f;
                        float abs = c.this.y ? 255.0f : Math.abs((position().z - c.this.o) / (c.this.p - c.this.o)) * 255.0f;
                        int i = 0;
                        while (true) {
                            int i2 = i;
                            if (i2 >= n.this.n) {
                                break;
                            }
                            ((g) n.this.k.get(i2)).a(abs);
                            i = i2 + 1;
                        }
                        if (c.this.I == null) {
                            if (c.this.y) {
                                rotation().y += (c.this.q - rotation().y) * 0.3f;
                                rotation().x += (c.this.r - rotation().x) * 0.3f;
                                return;
                            }
                            rotation().y += (c.this.q - rotation().y) * c.this.x;
                            rotation().x += (c.this.r - rotation().x) * c.this.x;
                            if (Math.abs(c.this.q - rotation().y) > 0.1f || Math.abs(c.this.r - rotation().x) > 0.1f) {
                                float f = (c.this.A.rotation().y - c.this.u) / c.this.t;
                                float abs2 = 1.0f - (Math.abs(f - 0.5f) * 2.0f);
                                if (f < 0.5d) {
                                    c.this.s = (abs2 * (c.this.p - c.this.v)) + c.this.v;
                                } else {
                                    c.this.s = (abs2 * (c.this.p - c.this.o)) + c.this.o;
                                }
                                if (f > 0.9d) {
                                    c.this.x += 0.008f;
                                }
                                if (f > 0.9d) {
                                    float f2 = (1.0f - f) * 10.0f;
                                    int i3 = 0;
                                    while (true) {
                                        int i4 = i3;
                                        if (i4 < n.this.n) {
                                            g gVar = (g) n.this.k.get(i4);
                                            if (gVar != n.this.m) {
                                                gVar.J().alpha((int) (255.0f * f2));
                                            }
                                            i3 = i4 + 1;
                                        } else {
                                            return;
                                        }
                                    }
                                }
                            } else {
                                rotation().y = c.this.q;
                                rotation().x = c.this.r;
                                c.this.w = true;
                                position().z = c.this.o;
                                c.this.k();
                            }
                        } else {
                            rotation().y += (c.this.q - rotation().y) * 0.2f;
                            rotation().x += (c.this.r - rotation().x) * 0.2f;
                            if (Math.abs(c.this.q - rotation().y) <= 10.0f) {
                                c.this.I = null;
                                c.this.B.mouseEnabled(true);
                                c.this.F.f(null);
                            }
                        }
                    }
                }
            };
            this.A.renderChildren(false);
            this.A.position().z = this.o;
            this.B.setAABBPX(com.censivn.C3DEngine.b.b.a.z, com.censivn.C3DEngine.b.b.a.C, 0.0f, com.censivn.C3DEngine.b.b.a.A, com.censivn.C3DEngine.b.b.a.B, 0.0f);
            com.censivn.C3DEngine.b.d.a aVar = new com.censivn.C3DEngine.b.d.a(this.B) { // from class: com.tsf.shell.f.f.n.c.3
                @Override // com.censivn.C3DEngine.b.d.a
                public void a(MotionEvent motionEvent, MotionEvent motionEvent2) {
                    c.this.q = c.this.J + (((motionEvent2.getX() - motionEvent.getX()) / com.censivn.C3DEngine.b.b.a.F) * 360.0f * 1.2f);
                    float y = ((motionEvent2.getY() - motionEvent.getY()) / com.censivn.C3DEngine.b.b.a.G) * 180.0f;
                    c.this.r = c.this.K + y;
                    if (c.this.r > 45.0f) {
                        c.this.r = 45.0f;
                        c.this.K = c.this.r - y;
                    } else if (c.this.r < -45.0f) {
                        c.this.r = -45.0f;
                        c.this.K = c.this.r - y;
                    }
                }

                @Override // com.censivn.C3DEngine.b.d.a
                public void e(MotionEvent motionEvent) {
                    c.this.x = 0.03f;
                    com.censivn.C3DEngine.b.g.c.a(c.this.A);
                    c.this.h = false;
                    c.this.y = true;
                    c.this.z = false;
                    c.this.J = c.this.q = c.this.A.rotation().y;
                    c.this.K = c.this.r = c.this.A.rotation().x;
                    c.this.s = (c.this.o + c.this.p) / 3.0f;
                    c.this.j();
                }

                @Override // com.censivn.C3DEngine.b.d.a
                public void f(MotionEvent motionEvent) {
                    c.this.a((g) null);
                }

                @Override // com.censivn.C3DEngine.b.d.a
                public void b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                    c.this.h = true;
                    c.this.q = ((((int) (c.this.A.rotation().y + (f / 4.0f))) / 360) * 360) + c.this.l();
                    c.this.u = c.this.A.rotation().y;
                    c.this.v = c.this.A.position().z;
                    c.this.t = c.this.q - c.this.A.rotation().y;
                    c.this.j();
                }
            };
            this.F = aVar;
            this.B.setMouseEventListener(aVar);
            this.B.addChild(this.A);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j() {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < n.this.n) {
                    g gVar = (g) n.this.k.get(i2);
                    if (gVar != n.this.m) {
                        gVar.J().alpha(255.0f);
                    }
                    i = i2 + 1;
                } else {
                    return;
                }
            }
        }

        /* loaded from: classes.dex */
        class a implements Comparator<com.censivn.C3DEngine.b.f.i> {
            private double b = 0.017453292519943295d;

            a() {
            }

            @Override // java.util.Comparator
            /* renamed from: a */
            public int compare(com.censivn.C3DEngine.b.f.i iVar, com.censivn.C3DEngine.b.f.i iVar2) {
                float cos = (float) (Math.cos((iVar.rotation().y + c.this.A.rotation().y) * this.b) * c.this.n);
                float cos2 = (float) (Math.cos((iVar2.rotation().y + c.this.A.rotation().y) * this.b) * c.this.n);
                if (cos > cos2) {
                    return 1;
                }
                if (cos < cos2) {
                    return -1;
                }
                return 0;
            }
        }

        @Override // com.censivn.C3DEngine.b.c.b.a
        public void a(int i, KeyEvent keyEvent) {
            if (i == 4 && !this.z && this.A.numChildren() > 0) {
                this.F.f(null);
            }
        }

        @Override // com.censivn.C3DEngine.b.c.b.a
        public void b(int i, KeyEvent keyEvent) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void k() {
            this.B.removeFromParent();
            for (int i = 0; i < n.this.n; i++) {
                g gVar = (g) n.this.k.get(i);
                gVar.f(false);
                gVar.position().z = 0.0f;
                gVar.position().x = 0.0f;
                gVar.rotation().y = 0.0f;
                gVar.e(false);
                gVar.removeFromParent();
                gVar.J().alpha(255.0f);
            }
            n.this.m.H();
            n.this.m.M();
            n.this.i.addChild(n.this.m);
            com.tsf.shell.manager.a.c.a(n.this.I, true);
            com.tsf.shell.manager.a.c.b(n.this.I);
            com.censivn.C3DEngine.b.c.b.b(this);
            a(false);
            n.this.al();
        }

        public float a(int i) {
            return (-i) * this.D;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float l() {
            return a(n.this.m.r());
        }

        private float m() {
            return ((float) (((com.censivn.C3DEngine.b.b.a.F * 0.9f) / 2.0f) / Math.sin((((360 / n.this.n) / 2) * 3.141592653589793d) / 180.0d))) + (200.0f * com.censivn.C3DEngine.b.b.a.b);
        }

        public void c(float f) {
            this.x = 0.03f;
            com.censivn.C3DEngine.b.c.b.a(this);
            this.n = m();
            this.o = -this.n;
            this.p = -((int) (this.n * 3.5f));
            this.C = 6.283185307179586d / n.this.n;
            this.D = 360.0f / n.this.n;
            if (this.w) {
                n.this.ak();
                com.tsf.shell.manager.a.c.a(n.this.I);
                com.tsf.shell.manager.a.c.c(n.this.I);
                this.w = false;
                for (int i = 0; i < n.this.n; i++) {
                    g gVar = (g) n.this.k.get(i);
                    if (gVar != n.this.m) {
                        gVar.O();
                    }
                    gVar.f(false);
                    gVar.L();
                    gVar.H();
                    gVar.z();
                    gVar.e(true);
                    gVar.position().z = (float) (Math.cos(i * this.C) * this.n);
                    gVar.position().x = (float) (Math.sin(i * this.C) * this.n);
                    gVar.rotation().y = this.D * i;
                    gVar.J().scale().setAll(1.0f, 1.0f, 1.0f);
                    this.A.addChild(gVar);
                }
                Number3d rotation = this.A.rotation();
                float l = l();
                rotation.y = l;
                this.q = l;
                this.B.removeFromParent();
                n.this.h.addChild(this.B);
            }
            this.u = this.A.rotation().y;
            this.v = this.A.position().z;
            j();
        }

        public void c() {
            boolean z;
            if (this.c != null && !this.c.a()) {
                com.tsf.shell.manager.a.v.c.b.a(true);
                com.tsf.shell.manager.a.v.c.b.a(n.this.m);
            } else {
                com.tsf.shell.manager.a.v.c.b.a(false);
            }
            if (!this.k) {
                if (this.L != null) {
                    if (this.g < 0.0f) {
                        this.c.b(n.this.m.g, this.g);
                        n.this.m.a(n.this.m, this.g, true, false, this.c);
                        z = false;
                    } else {
                        this.c.b(n.this.m.g, this.g);
                        n.this.m.a(n.this.m, this.g, false, true, this.c);
                        z = false;
                    }
                } else if (this.j) {
                    float f = n.this.m.g + ((this.g - n.this.m.g) * 0.25f);
                    this.c.b(n.this.m.g, f);
                    if (f < 0.0f) {
                        n.this.m.a(n.this.m, f, true, false, this.c);
                    } else {
                        n.this.m.a(n.this.m, f, false, true, this.c);
                    }
                    z = false;
                } else if (!this.c.b() || Math.abs(n.this.m.g - this.g) >= 0.001d) {
                    float f2 = n.this.m.g + ((this.g - n.this.m.g) * this.b);
                    this.c.b(n.this.m.g, f2);
                    if (f2 < 0.0f) {
                        n.this.m.a(n.this.m, f2, true, false, this.c);
                        z = false;
                    } else {
                        n.this.m.a(n.this.m, f2, false, true, this.c);
                        z = false;
                    }
                } else {
                    this.c.b(n.this.m.g, this.g);
                    n.this.m.a(n.this.m, this.g, true, false, this.c);
                    z = true;
                }
                if (this.L == null && !z) {
                    n.this.a(false, "onDrawFrame");
                }
                n.this.i.a();
                Iterator<com.censivn.C3DEngine.b.f.i> it = n.this.i.children().iterator();
                while (it.hasNext()) {
                    g gVar = (g) it.next();
                    gVar.i();
                    gVar.af();
                }
                if (z) {
                    a(true);
                }
            }
        }

        public void d() {
            a((l) null);
        }

        public void a(l lVar) {
            if (this.i) {
                if (lVar == null) {
                    lVar = com.tsf.shell.manager.a.v.a.a.h();
                }
                this.c = lVar;
                this.c.d();
                com.tsf.shell.manager.a.v.a.a.a2(this.c);
                this.h = false;
                this.i = false;
                this.f = n.this.m.g;
                n.this.h.setAnimationObjectState(true);
                n.this.h.invalidate();
                if (this.k) {
                    this.k = false;
                    n.this.ag();
                    n.this.m.V();
                }
                n.this.i.position().x = 0.0f;
                com.tsf.shell.manager.a.n.i();
            }
        }

        public void a(g gVar) {
            this.y = false;
            this.r = 0.0f;
            if (!this.h) {
                if (gVar == null) {
                    if (this.A.numChildren() != 0) {
                        n.this.a((g) this.A.getChildAt(this.A.numChildren() - 1), false, true);
                    }
                } else {
                    n.this.a(gVar, false, true);
                }
                n.this.m.g = 0.0f;
                n.this.v.a(n.this.m);
                n.this.a(true, "RotationUp");
                float l = (((int) (this.A.rotation().y / 360.0f)) * 360) + 360 + l();
                float l2 = (((int) (this.A.rotation().y / 360.0f)) * 360) + l();
                float l3 = ((((int) (this.A.rotation().y / 360.0f)) * 360) - 360) + l();
                float abs = Math.abs(l - this.A.rotation().y);
                float abs2 = Math.abs(l2 - this.A.rotation().y);
                float abs3 = Math.abs(l3 - this.A.rotation().y);
                if (abs < abs2 && abs < abs3) {
                    this.q = l;
                } else if (abs2 < abs && abs2 < abs3) {
                    this.q = l2;
                } else {
                    this.q = l3;
                }
                this.u = this.A.rotation().y;
                this.v = this.A.position().z;
                this.t = this.q - this.A.rotation().y;
                this.z = true;
                for (int i = 0; i < n.this.n; i++) {
                    ((g) n.this.k.get(i)).A();
                }
                com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.f.n.c.4
                    @Override // com.censivn.C3DEngine.b.g.d
                    public void a(float f) {
                        int i2 = 0;
                        while (true) {
                            int i3 = i2;
                            if (i3 < n.this.n) {
                                g gVar2 = (g) n.this.k.get(i3);
                                if (gVar2 != n.this.m) {
                                    gVar2.J().alpha((int) (255.0f - (255.0f * f)));
                                }
                                gVar2.a(gVar2.B() * (1.0f - f));
                                i2 = i3 + 1;
                            } else {
                                return;
                            }
                        }
                    }

                    @Override // com.censivn.C3DEngine.b.g.d
                    public void a() {
                        c.this.w = true;
                        c.this.z = false;
                        c.this.k();
                    }
                };
                dVar.c(0.0f);
                dVar.d(this.q);
                dVar.j(this.o);
                com.censivn.C3DEngine.b.g.c.a(this.A);
                com.censivn.C3DEngine.b.g.c.a(this.A, 500, dVar);
            }
        }

        public void a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (!this.i && this.l) {
                this.h = true;
                if (Math.abs(f) > 300.0f) {
                    if (f < 0.0f) {
                        o();
                    } else {
                        p();
                    }
                }
            }
        }

        public boolean e() {
            if (this.i) {
                d();
                this.k = true;
                c(0.0f);
                this.F.e(null);
                this.r = 30.0f;
                this.K = 30.0f;
                return true;
            }
            return false;
        }

        public void a(MotionEvent motionEvent, MotionEvent motionEvent2) {
            this.F.a(motionEvent, motionEvent2);
        }

        public void a(MotionEvent motionEvent) {
            this.F.f(motionEvent);
        }

        public void b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            this.F.b(motionEvent, motionEvent2, f, f2);
        }

        public boolean f() {
            return this.m;
        }

        public boolean g() {
            return this.l;
        }

        public void b(MotionEvent motionEvent) {
        }

        public void c(MotionEvent motionEvent) {
            if (!this.m) {
                this.m = true;
                this.l = false;
            }
        }

        public void c(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (!this.m) {
                this.b = this.a;
                int abs = (int) Math.abs(motionEvent2.getX() - motionEvent.getX());
                int abs2 = (int) Math.abs(motionEvent2.getY() - motionEvent.getY());
                if ((abs * abs) + (abs2 * abs2) > com.censivn.C3DEngine.a.b.b / 2.0f) {
                    if (abs > abs2) {
                        this.l = true;
                    } else {
                        this.l = false;
                    }
                    this.m = true;
                }
            }
            if (this.m && this.l) {
                if (this.i) {
                    com.tsf.shell.f.e.g.d.onTempleteHide();
                    com.censivn.C3DEngine.a.a().b(new Runnable() { // from class: com.tsf.shell.f.f.n.c.5
                        @Override // java.lang.Runnable
                        public void run() {
                            c.this.d();
                        }
                    });
                }
                this.g = this.f + (((motionEvent.getX() - motionEvent2.getX()) / com.censivn.C3DEngine.b.b.a.F) * (n.this.n - 1) * 1.7f);
                this.j = true;
            }
        }

        public void d(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (!this.m) {
                this.b = this.a;
                int abs = (int) Math.abs(motionEvent2.getX() - motionEvent.getX());
                int abs2 = (int) Math.abs(motionEvent2.getY() - motionEvent.getY());
                if ((abs * abs) + (abs2 * abs2) > com.censivn.C3DEngine.a.b.b) {
                    if (abs > abs2) {
                        this.l = true;
                    } else {
                        this.l = false;
                    }
                    this.m = true;
                }
            }
            if (this.m && this.l) {
                if (this.i) {
                    com.tsf.shell.f.e.g.d.onTempleteHide();
                    com.censivn.C3DEngine.a.a().b(new Runnable() { // from class: com.tsf.shell.f.f.n.c.6
                        @Override // java.lang.Runnable
                        public void run() {
                            c.this.d();
                        }
                    });
                }
                this.g = this.f + ((motionEvent2.getX() - motionEvent.getX()) / com.censivn.C3DEngine.b.b.a.F);
                if (n.this.m.ah() == null && this.g < 0.0f) {
                    this.g = com.tsf.shell.f.e.c.a(this.g);
                }
                if (n.this.m.ag() == null && this.g > 0.0f) {
                    this.g = com.tsf.shell.f.e.c.a(this.g);
                }
                this.j = true;
            }
        }

        public void d(MotionEvent motionEvent) {
            if (this.m) {
                com.tsf.shell.f.e.g.d.onTempleteShow();
                this.m = false;
                this.i = true;
                this.j = false;
                this.g = 0.0f;
                if (!this.h && this.L == null && !this.k) {
                    g n = n();
                    if (n != null && n != n.this.m) {
                        n.this.a(n, false, true);
                        return;
                    }
                    return;
                }
                this.h = false;
            }
        }

        private g n() {
            float f;
            g gVar;
            g gVar2 = null;
            float f2 = Float.MAX_VALUE;
            int i = 1;
            while (i < n.this.n) {
                g gVar3 = (g) n.this.k.get(i);
                float abs = Math.abs(gVar3.g);
                if (abs < f2) {
                    gVar = gVar3;
                    f = abs;
                } else {
                    f = f2;
                    gVar = gVar2;
                }
                i++;
                gVar2 = gVar;
                f2 = f;
            }
            return gVar2;
        }

        private void a(boolean z) {
            this.i = true;
            this.k = true;
            this.d = false;
            n.this.h.setAnimationObjectState(false);
            if (z) {
                n.this.m.a(this.c);
            }
            n.this.I();
            com.tsf.shell.manager.b.e.n(n.this.m.t());
            n.this.m.W();
            g gVar = n.this.m;
            this.f = 0.0f;
            gVar.g = 0.0f;
            if (this.c != null) {
                this.c.c();
            }
            n.this.ae();
            n.this.g();
            com.tsf.shell.manager.a.v.a.a();
            h.a(false);
            com.tsf.shell.manager.a.n.j();
        }

        private void a(g gVar, Runnable runnable) {
            a(gVar, runnable, (l) null);
        }

        private void a(g gVar, Runnable runnable, l lVar) {
            h.a(true);
            com.censivn.C3DEngine.a.d.d().c().a(false);
            this.L = gVar;
            n.this.a(this.L, true, "hdieSelect");
            if (this.M != null) {
                this.M.run();
            }
            this.M = runnable;
            n.this.v.a(gVar);
            a(lVar);
            this.k = false;
            this.j = true;
            this.m = true;
        }

        private void a(final g gVar, int i, Runnable runnable, final boolean z, final l lVar) {
            if (this.d || gVar == null || this.L == gVar || gVar == n.this.m || !this.k) {
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            }
            this.d = true;
            n.this.b(n.this.m);
            n.this.e(gVar);
            n.this.G.a(gVar);
            a(gVar, runnable, lVar);
            final g gVar2 = n.this.m;
            final g ag = gVar2.ag();
            final g ah = gVar2.ah();
            final g ag2 = gVar.ag();
            final g ah2 = gVar.ah();
            lVar.b(gVar2, true);
            lVar.a(gVar, true);
            if (z) {
                gVar.b(gVar2);
                gVar.a((g) null);
                gVar2.a(gVar);
                gVar2.b((g) null);
            } else {
                gVar.b((g) null);
                gVar.a(gVar2);
                gVar2.a((g) null);
                gVar2.b(gVar);
            }
            final float f = z ? 1.0f : -1.0f;
            this.H = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.f.n.c.7
                @Override // com.censivn.C3DEngine.b.g.d
                public void a() {
                    lVar.a(gVar2, false);
                    c.this.j = false;
                    c.this.m = false;
                    c.this.g = 0.0f;
                    gVar2.a(gVar2, z ? 1.0f : -1.0f, false, false, c.this.c);
                    gVar2.a(ag);
                    gVar2.b(ah);
                    gVar.a(ag2);
                    gVar.b(ah2);
                    n.this.a(gVar, false, true);
                    com.censivn.C3DEngine.a.d.d().c().a(true);
                    c.this.L = null;
                    if (c.this.M != null) {
                        com.censivn.C3DEngine.a.a().c(c.this.M);
                        c.this.M = null;
                    }
                }

                @Override // com.censivn.C3DEngine.b.g.d
                public void a(float f2) {
                    c.this.g = f * f2;
                }
            };
            com.censivn.C3DEngine.b.g.c.a(this.G);
            com.censivn.C3DEngine.b.g.c.a(this.G, i, this.H);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(final g gVar, Runnable runnable) {
            if (!this.d && this.L != gVar && gVar != n.this.m) {
                n.this.G.a(gVar);
                n.this.e(gVar);
                n.this.b(n.this.m);
                a(gVar, runnable);
                int r = gVar.r() - n.this.m.r();
                final float f = n.this.m.g;
                final float f2 = -r;
                this.H = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.f.n.c.8
                    @Override // com.censivn.C3DEngine.b.g.d
                    public void a() {
                        c.this.j = false;
                        c.this.m = false;
                        c.this.g = 0.0f;
                        n.this.a(gVar, false, true);
                        com.censivn.C3DEngine.a.d.d().c().a(true);
                        c.this.L = null;
                        if (c.this.M != null) {
                            com.censivn.C3DEngine.a.a().c(c.this.M);
                            c.this.M = null;
                        }
                    }

                    @Override // com.censivn.C3DEngine.b.g.d
                    public void a(float f3) {
                        if (f3 > 0.5d) {
                            c.this.j = false;
                        }
                        c.this.g = f + ((f2 - f) * f3);
                    }
                };
                com.censivn.C3DEngine.b.g.c.a(this.G);
                int abs = Math.abs(r * 150);
                com.censivn.C3DEngine.b.g.c.a(this.G, abs >= 500 ? abs : 500, this.H);
                return;
            }
            runnable.run();
        }

        public void b(int i) {
            a(i, (Runnable) null);
        }

        public void a(int i, final Runnable runnable) {
            if (this.N) {
                this.N = false;
                final float f = n.this.m.g;
                com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.f.n.c.9
                    @Override // com.censivn.C3DEngine.b.g.d
                    public void a() {
                        c.this.j = false;
                        c.this.m = false;
                        c.this.g = 0.0f;
                        if (runnable != null) {
                            runnable.run();
                        }
                    }

                    @Override // com.censivn.C3DEngine.b.g.d
                    public void a(float f2) {
                        c.this.g = f + ((0.0f - f) * f2);
                    }
                };
                com.censivn.C3DEngine.b.g.c.a(this.G);
                com.censivn.C3DEngine.b.g.c.a(this.G, i, dVar);
            }
        }

        public void h() {
            c(VEasing.Linear.easeNone);
        }

        public void c(final int i) {
            if (com.censivn.C3DEngine.a.e.l()) {
                if (n.this.t().aJ() && this.k) {
                    g n = n.this.n();
                    if (n.t() == -1) {
                        ((com.tsf.shell.f.f.a.h) n).aB();
                        g k = n.this.k();
                        if (k == null || k.t() == -1) {
                            k = n.this.o();
                        }
                        a(k, i, null, false, com.tsf.shell.manager.a.v.a.b.h());
                        com.tsf.shell.manager.a.c.a(n.this.I, false);
                        return;
                    }
                    a(n.this.t(), i, null, true, com.tsf.shell.manager.a.v.a.b.h());
                    com.tsf.shell.manager.a.c.a(n.this.I);
                    return;
                }
                return;
            }
            com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.f.f.n.c.10
                @Override // java.lang.Runnable
                public void run() {
                    c.this.c(i);
                }
            });
        }

        public void d(int i) {
            c(i);
        }

        public void a(int i, final int i2) {
            this.N = true;
            final boolean z = n.this.m.ah() != null;
            d();
            final float f = n.this.m.g;
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.f.n.c.2
                @Override // com.censivn.C3DEngine.b.g.d
                public void a() {
                    c.this.b(i2);
                }

                @Override // com.censivn.C3DEngine.b.g.d
                public void a(float f2) {
                    if (z) {
                        c.this.g = f - ((f + 1.0f) * f2);
                        return;
                    }
                    c.this.g = f - ((f - 1.0f) * f2);
                }
            };
            com.censivn.C3DEngine.b.g.c.a(this.G);
            com.censivn.C3DEngine.b.g.c.a(this.G, i, dVar);
            this.k = false;
            this.j = true;
            this.m = true;
        }

        private void o() {
            if (n.this.m.ah() != null) {
                n.this.m.a(n.this.m, n.this.m.g, true, false, this.c);
                n.this.a(n.this.m.ah(), false, true);
                this.g = 0.0f;
            }
        }

        private void p() {
            if (n.this.m.ag() != null) {
                n.this.m.a(n.this.m, n.this.m.g, false, true, this.c);
                n.this.a(n.this.m.ag(), false, true);
                this.g = 0.0f;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z, String str) {
        a(this.m, z, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(g gVar, boolean z, String str) {
        com.tsf.shell.manager.a.f.a(gVar, z, true);
    }

    /* loaded from: classes.dex */
    public class b {
        private g C;
        private DynamicTextureElement D;
        private com.censivn.C3DEngine.b.f.j c;
        private boolean e;
        private float f;
        private float g;
        private float l;
        private float t;
        private g u;
        private Number3d v;
        private int y;
        private float m = 32.0f;
        private float n = -50.0f;
        private boolean r = false;
        private boolean s = false;
        private boolean x = false;
        private int z = 1;
        private int A = 2;
        private int B = 0;
        private boolean G = false;
        private com.tsf.shell.f.e.e.b F = com.tsf.shell.manager.a.p.d();
        private com.censivn.C3DEngine.b.f.k E = new com.censivn.C3DEngine.b.f.k(com.tsf.shell.manager.g.a.g, com.tsf.shell.manager.g.a.g, false);
        private float b = 0.017453292f;
        private float h = com.censivn.C3DEngine.b.b.a.D;
        private float o = (-this.h) - (200.0f * com.censivn.C3DEngine.b.b.a.b);
        private float p = (com.censivn.C3DEngine.b.b.a.B + ((int) (Math.sin(this.b * this.m) * this.h))) - (100.0f * com.censivn.C3DEngine.b.b.a.b);
        private float w = (float) (this.o + (Math.cos(this.b * this.m) * this.h));
        private float q = ((float) (this.p - (Math.sin(this.b * this.m) * this.h))) - (n.b / 2);
        private float i = 360.0f / (((float) ((2.0f * this.h) * 3.141592653589793d)) / (n.a - 40));
        private float k = this.i / (n.a - 40);
        private float j = this.i * this.b;
        private com.censivn.C3DEngine.b.f.j d = new com.censivn.C3DEngine.b.f.j();

        public b() {
            this.c = new com.censivn.C3DEngine.b.f.j() { // from class: com.tsf.shell.f.f.n.b.1
                @Override // com.censivn.C3DEngine.b.f.i
                public void onDrawStart() {
                    if (!b.this.r) {
                        if (b.this.s) {
                            rotation().y += (b.this.t - rotation().y) * 0.5f;
                            return;
                        }
                        rotation().y += (b.this.t - rotation().y) * 0.2f;
                        if (rotation().y >= b.this.f || b.this.t >= b.this.f) {
                            if (rotation().y > b.this.g && b.this.t > b.this.g) {
                                b.this.t += (b.this.g - b.this.t) * 0.3f;
                            }
                        } else {
                            b.this.t += (b.this.f - b.this.t) * 0.3f;
                        }
                        if (Math.abs(rotation().y - b.this.t) < 0.01d && getAnimationObjectState()) {
                            setAnimationObjectState(false);
                            rotation().y = b.this.t;
                        }
                        if (b.this.y != b.this.z) {
                            if (b.this.y == b.this.A) {
                                b.this.t += 2.0f;
                                if (b.this.t > b.this.g) {
                                    b.this.t = b.this.g;
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        b.this.t -= 2.0f;
                        if (b.this.t < b.this.f) {
                            b.this.t = b.this.f;
                        }
                    }
                }
            };
        }

        public void a(int i, int i2, int i3, int i4) {
            this.h = com.censivn.C3DEngine.b.b.a.D;
            this.o = (-this.h) - (200.0f * com.censivn.C3DEngine.b.b.a.b);
            this.p = (com.censivn.C3DEngine.b.b.a.B + ((int) (Math.sin(this.b * this.m) * this.h))) - (100.0f * com.censivn.C3DEngine.b.b.a.b);
            this.w = (float) (this.o + (Math.cos(this.b * this.m) * this.h));
            this.q = ((float) (this.p - (Math.sin(this.b * this.m) * this.h))) - (n.b / 2);
            this.i = 360.0f / (((float) ((2.0f * this.h) * 3.141592653589793d)) / (n.a - 40));
            this.k = this.i / (n.a - 40);
            this.j = this.i * this.b;
            if (this.e) {
                com.censivn.C3DEngine.b.g.c.a(this.c);
                this.c.position().z = this.o;
                this.c.rotation().x = this.m;
                this.c.position().y = this.p;
                this.c.rotation().y = this.t;
                Iterator it = n.this.k.iterator();
                while (it.hasNext()) {
                    g gVar = (g) it.next();
                    if (gVar != this.C) {
                        b(gVar);
                    }
                }
            }
        }

        public boolean a() {
            return this.e;
        }

        public com.censivn.C3DEngine.b.f.k b() {
            return this.E;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g() {
            if (!this.e && !this.r) {
                com.tsf.shell.manager.a.o.k();
                this.E.textures().clear();
                if (this.D != null) {
                    com.censivn.C3DEngine.a.g().a(this.D);
                }
                this.D = ThemeManager.mix.page.getTextureElement(ThemeShellDescription.PAGE_ADD_BUTTON, com.tsf.shell.manager.g.a.g, com.tsf.shell.manager.g.a.g);
                this.E.textures().addElement(this.D);
                n.this.T();
                this.e = true;
                this.r = true;
                this.g = 90.0f;
                this.t = this.g - (n.this.m.r() * this.i);
                Iterator it = n.this.k.iterator();
                while (it.hasNext()) {
                    g gVar = (g) it.next();
                    gVar.p();
                    Number3d localToGlobal = gVar.localToGlobal(new Number3d());
                    Number3d localRotationToGlobal = gVar.localRotationToGlobal(new Number3d());
                    gVar.removeFromParent();
                    this.c.globalToLocal(localToGlobal);
                    gVar.position().setAllFrom(localToGlobal);
                    gVar.rotation().setAllFrom(localRotationToGlobal);
                    gVar.removeFromParent();
                    this.c.addChild(gVar);
                    b(gVar, 750);
                }
                k();
                this.d.removeFromParent();
                this.c.removeFromParent();
                n.this.h.addChildAt(this.d, 1);
                n.this.h.addChildAt(this.c, 1);
                com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.f.n.b.2
                    @Override // com.censivn.C3DEngine.b.g.d
                    public void a() {
                        b.this.r = false;
                    }
                };
                if (n.this.n < 16) {
                    j();
                }
                com.censivn.C3DEngine.b.g.c.a(this.c);
                dVar.j(this.o);
                dVar.c(this.m);
                dVar.h(this.p);
                dVar.d(this.t);
                com.censivn.C3DEngine.b.g.c.a(this.c, 750, dVar);
            }
        }

        private void h() {
            this.F.removeFromParent();
            this.F.position().x = 0.0f;
            this.F.a(0.0f, com.censivn.C3DEngine.b.b.a.C + (100.0f * com.censivn.C3DEngine.b.b.a.b), true);
            n.this.h.addChild(this.F);
            this.F.b();
        }

        private void i() {
            this.F.c();
        }

        public void c() {
            w.a(3);
        }

        public void d() {
        }

        public void a(float f, float f2) {
            this.F.a(x.b(this.F.c, this.F.d, f, f2), f, f2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j() {
            this.C = n.this.V();
            this.C.x();
            n.this.d(this.C);
            this.C.p();
            this.C.a(-1);
            this.C.rotation().x = this.n;
            this.C.rotation().y = 0.0f;
            this.C.rotation().z = 0.0f;
            this.C.position().x = 0.0f;
            this.C.position().z = this.w - (((0.0f - this.q) + 50.0f) / 2.0f);
            this.C.position().y = com.censivn.C3DEngine.b.b.a.C;
            this.C.a(true);
            this.C.d(false);
            this.d.addChild(this.C);
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
            dVar.h(0.0f);
            dVar.f(0.0f);
            dVar.l(1.0f);
            dVar.m(1.0f);
            com.censivn.C3DEngine.b.g.c.a(this.C, 500, dVar);
        }

        private void k() {
            this.f = this.g - ((this.c.numChildren() - 1) * this.i);
        }

        private void b(final g gVar, int i) {
            gVar.mouseEnabled(false);
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.f.n.b.3
                @Override // com.censivn.C3DEngine.b.g.d
                public void a() {
                    gVar.mouseEnabled(true);
                }
            };
            com.censivn.C3DEngine.b.g.c.a(gVar);
            a c = c(gVar);
            dVar.f(c.a);
            dVar.j(c.b);
            dVar.h(0.0f);
            dVar.c(0.0f);
            dVar.d(c.c);
            dVar.l(1.0f);
            dVar.m(1.0f);
            com.censivn.C3DEngine.b.g.c.a(gVar, i, dVar);
        }

        private void b(g gVar) {
            com.censivn.C3DEngine.b.g.c.a(gVar);
            a c = c(gVar);
            gVar.position().setAll(c.a, 0.0f, c.b);
            gVar.rotation().setAll(0.0f, c.c, 0.0f);
            gVar.scale().setAll(1.0f, 1.0f, 1.0f);
        }

        private a c(g gVar) {
            a aVar = new a();
            int r = gVar.r();
            aVar.a = (float) (Math.cos((r * (-this.j)) - 3.141592653589793d) * this.h);
            aVar.b = (float) (Math.sin((r * (-this.j)) - 3.141592653589793d) * this.h);
            aVar.c = (r * this.i) - 90.0f;
            return aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void l() {
            if (this.e && !this.r && !this.G) {
                com.tsf.shell.manager.a.o.i();
                ArrayList arrayList = (ArrayList) this.d.children().clone();
                if (this.d.numChildren() > 0) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        g gVar = (g) ((com.censivn.C3DEngine.b.f.i) it.next());
                        if (gVar.r() == -1) {
                            if (gVar.q()) {
                                f(gVar);
                            } else {
                                a(gVar, 500);
                            }
                        }
                    }
                }
                n.this.F.a(n.this.m);
                this.r = true;
                int i = 0;
                while (true) {
                    int i2 = i;
                    if (i2 < n.this.n) {
                        g gVar2 = (g) n.this.k.get(i2);
                        if (i2 > 0) {
                            if (i2 == 1) {
                                if (n.this.n != 2) {
                                    gVar2.b((g) n.this.k.get(i2 + 1));
                                    gVar2.a((g) n.this.k.get(n.this.n - 1));
                                } else {
                                    gVar2.b((g) null);
                                    gVar2.a((g) null);
                                }
                            } else if (i2 == n.this.n - 1) {
                                if (n.this.n != 3) {
                                    gVar2.b((g) n.this.k.get(1));
                                    gVar2.a((g) n.this.k.get(i2 - 1));
                                } else {
                                    gVar2.b((g) null);
                                    gVar2.a((g) n.this.k.get(i2 - 1));
                                }
                            } else {
                                gVar2.b((g) n.this.k.get(i2 + 1));
                                gVar2.a((g) n.this.k.get(i2 - 1));
                            }
                        }
                        gVar2.o();
                        Number3d localToGlobal = gVar2.localToGlobal(new Number3d());
                        Number3d localRotationToGlobal = gVar2.localRotationToGlobal(new Number3d());
                        gVar2.removeFromParent();
                        gVar2.mouseEnabled(true);
                        n.this.i.globalToLocal(localToGlobal);
                        gVar2.position().setAllFrom(localToGlobal);
                        gVar2.rotation().setAllFrom(localRotationToGlobal);
                        n.this.i.addChild(gVar2);
                        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
                        com.censivn.C3DEngine.b.g.c.a(gVar2);
                        n.this.F.a(dVar, gVar2);
                        com.censivn.C3DEngine.b.g.c.a(gVar2, 500, dVar);
                        i = i2 + 1;
                    } else {
                        com.censivn.C3DEngine.b.g.c.a(this.c, 500, new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.f.n.b.4
                            @Override // com.censivn.C3DEngine.b.g.d
                            public void a() {
                                Iterator it2;
                                b.this.E.textures().clear();
                                if (b.this.D != null) {
                                    com.censivn.C3DEngine.a.g().a(b.this.D);
                                    b.this.D = null;
                                }
                                b.this.c.removeFromParent();
                                b.this.d.removeFromParent();
                                b.this.r = false;
                                b.this.e = false;
                                n.this.U();
                                String str = "";
                                while (true) {
                                    String str2 = str;
                                    if (n.this.k.iterator().hasNext()) {
                                        str = str2 + ((g) it2.next()).t() + ",";
                                    } else {
                                        com.tsf.shell.manager.b.e.i(str2.substring(0, str2.length() - 1));
                                        return;
                                    }
                                }
                            }
                        });
                        this.c.position().z = 0.0f;
                        this.c.position().y = 0.0f;
                        this.c.rotation().x = 0.0f;
                        this.c.rotation().y = 0.0f;
                        n.this.m.setFocus();
                        n.this.g();
                        return;
                    }
                }
            }
        }

        public void e() {
            this.s = true;
            float f = this.c.rotation().y;
            this.l = f;
            this.t = f;
            this.c.setAnimationObjectState(true);
            this.c.invalidate();
        }

        public void f() {
            this.s = false;
        }

        public void a(float f) {
            this.t += this.k * f;
        }

        public void b(float f) {
            this.t = this.l + (this.k * f);
        }

        public void a(g gVar, MotionEvent motionEvent) {
            if (gVar.t() != -1 && !gVar.q() && n.this.n > 2) {
                h();
            }
            w.a();
            this.u = gVar;
            gVar.setAnimationObjectState(true);
            Number3d localToGlobal = gVar.localToGlobal(new Number3d());
            Number3d localRotationToGlobal = gVar.localRotationToGlobal(new Number3d());
            gVar.removeFromParent();
            this.d.globalToLocal(localToGlobal);
            this.d.globalRotationToLocal(localRotationToGlobal);
            gVar.position().setAllFrom(localToGlobal);
            gVar.rotation().setAllFrom(localRotationToGlobal);
            this.d.addChild(gVar);
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
            com.censivn.C3DEngine.b.g.c.a(gVar);
            dVar.l(1.1f);
            dVar.m(1.1f);
            dVar.d(0.0f);
            com.censivn.C3DEngine.b.g.c.a(gVar, 250, dVar);
            if (gVar.getTag() != null && (gVar.getTag() instanceof Number3d)) {
                this.v = (Number3d) gVar.getTag();
                this.v.x = this.u.position().x;
                this.v.y = this.u.position().y;
                return;
            }
            this.v = this.u.position().m4clone();
            this.v.z = this.w;
        }

        public void b(g gVar, MotionEvent motionEvent) {
            boolean z;
            if (gVar.t() == -1 || gVar.q() || n.this.n <= 2) {
                z = false;
            } else {
                i();
                e(gVar);
                z = true;
            }
            this.y = this.B;
            gVar.setAnimationObjectState(false);
            float[] a2 = x.a(motionEvent);
            if (a2[1] - this.q > -50.0f) {
                a(a2[0], a2[1], gVar, true);
                a(gVar, 250);
                if (gVar.q()) {
                    gVar.a(false);
                    n.this.ac();
                    this.C = null;
                    if (n.this.n < 16) {
                        j();
                    }
                }
            } else {
                if (gVar.r() != -1) {
                    gVar.setTag(this.v.m4clone());
                    g(gVar);
                }
                if (gVar.Q() == 0 && z) {
                    f(gVar);
                    z = false;
                } else {
                    com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
                    com.censivn.C3DEngine.b.g.c.a(gVar);
                    dVar.l(1.0f);
                    dVar.m(1.0f);
                    dVar.d(0.0f);
                    dVar.e(0.0f);
                    com.censivn.C3DEngine.b.g.c.a(gVar, 250, dVar);
                }
            }
            if (z) {
                float[] a3 = x.a(motionEvent);
                if (this.F.calTouchCollision(a3[0], a3[1])) {
                    f(gVar);
                }
            }
            n.this.G.a(n.this.m);
        }

        public void a(final g gVar, MotionEvent motionEvent, final MotionEvent motionEvent2) {
            final float[] a2 = x.a(motionEvent2);
            this.u.position().x = this.v.x + ((motionEvent2.getX() - motionEvent.getX()) * 1.3f);
            this.u.position().y = this.v.y - (motionEvent2.getY() - motionEvent.getY());
            com.censivn.C3DEngine.a.a().b(new Runnable() { // from class: com.tsf.shell.f.f.n.b.5
                @Override // java.lang.Runnable
                public void run() {
                    b.this.a(a2[0], a2[1]);
                    float f = a2[1] - b.this.q;
                    if (f > 50.0f) {
                        b.this.u.rotation().x = b.this.m;
                        b.this.u.position().z = b.this.v.z;
                        b.this.a(a2[0], a2[1], gVar);
                    } else if (f < -50.0f) {
                        b.this.u.rotation().x = b.this.n;
                        b.this.u.position().z = b.this.v.z - ((f + 50.0f) / 2.0f);
                    } else {
                        b.this.u.rotation().x = (((f + 50.0f) / 100.0f) * (b.this.m - b.this.n)) + b.this.n;
                        b.this.u.position().z = b.this.v.z;
                        b.this.a(a2[0], a2[1], gVar);
                    }
                    if (gVar.t() != -1 && !gVar.q() && n.this.n > 2) {
                        float[] a3 = x.a(motionEvent2);
                        if (b.this.F.calTouchCollision(a3[0], a3[1])) {
                            b.this.d(gVar);
                        } else {
                            b.this.e(gVar);
                        }
                    }
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(g gVar) {
            if (!this.x) {
                this.x = true;
                gVar.setDefaultColor(com.tsf.shell.manager.o.c.c);
                c();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e(g gVar) {
            if (this.x) {
                this.x = false;
                gVar.clearDefaultColor();
                d();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(float f, float f2, g gVar) {
            int i = com.censivn.C3DEngine.b.b.a.D / 2;
            if (f > i - (com.censivn.C3DEngine.b.b.a.a * 50.0f)) {
                this.y = this.z;
            } else if (f < (-i) + (com.censivn.C3DEngine.b.b.a.a * 50.0f)) {
                this.y = this.A;
            } else {
                a(f, f2, gVar, false);
            }
        }

        private void a(float f, float f2, g gVar, boolean z) {
            g gVar2;
            this.y = this.B;
            com.censivn.C3DEngine.b.f.i hittingTarget = this.c.getHittingTarget(f, f2, true);
            if (hittingTarget != null) {
                if (hittingTarget == null) {
                    float f3 = this.c.rotation().y;
                    if (f3 > this.g) {
                        f3 = this.g;
                    } else if (f3 < this.f) {
                        f3 = this.f;
                    }
                    gVar2 = (g) n.this.k.get(((int) (((this.g - f3) / (this.g - this.f)) * (this.c.numChildren() - 1))) + 1);
                } else {
                    gVar2 = (g) hittingTarget.parent();
                }
                if (gVar2.t() == -1 && gVar == (gVar2 = n.this.o())) {
                    gVar.a(1);
                    return;
                }
                int r = gVar2.r();
                int size = r == -1 ? n.this.k.size() - 1 : r;
                int r2 = gVar.r();
                if (r2 == -1) {
                    int size2 = n.this.k.size();
                    for (int i = size; i < size2; i++) {
                        g gVar3 = (g) n.this.k.get(i);
                        if (gVar3.r() != -1) {
                            gVar3.a(i + 1);
                            b(gVar3, 250);
                        }
                    }
                    n.this.k.remove(gVar);
                    n.this.k.add(size, gVar);
                    gVar.a(size);
                } else if (size > r2) {
                    int i2 = r2 + 1;
                    while (true) {
                        int i3 = i2;
                        if (i3 < size + 1) {
                            g gVar4 = (g) n.this.k.get(i3);
                            gVar4.a(i3 - 1);
                            b(gVar4, 250);
                            i2 = i3 + 1;
                        } else {
                            n.this.k.remove(gVar);
                            n.this.k.add(size, gVar);
                            gVar.a(size);
                            return;
                        }
                    }
                } else {
                    for (int i4 = size; i4 < r2; i4++) {
                        g gVar5 = (g) n.this.k.get(i4);
                        gVar5.a(i4 + 1);
                        b(gVar5, 250);
                    }
                    n.this.k.remove(gVar);
                    n.this.k.add(size, gVar);
                    gVar.a(size);
                }
            }
        }

        private void f(final g gVar) {
            this.G = true;
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.f.n.b.6
                @Override // com.censivn.C3DEngine.b.g.d
                public void a() {
                    n.this.c(gVar);
                    gVar.removeFromParent();
                    gVar.destroy();
                    gVar.scale().setAll(1.0f, 1.0f, 1.0f);
                    if (gVar.q()) {
                        gVar.a(false);
                    }
                    if (n.this.n < 16 && b.this.C == null) {
                        b.this.j();
                    }
                    b.this.G = false;
                }
            };
            dVar.l(0.0f);
            dVar.m(0.0f);
            dVar.n(0.0f);
            dVar.f(0.0f);
            dVar.h(com.censivn.C3DEngine.b.b.a.C);
            com.censivn.C3DEngine.b.g.c.a(gVar);
            com.censivn.C3DEngine.b.g.c.a(gVar, 500, dVar);
            n.this.k.remove(gVar);
            n.this.ac();
            if (n.this.m == gVar) {
                n.this.a((g) n.this.k.get(1), false, true);
            }
            if (n.this.r == gVar) {
                n.this.a((g) n.this.k.get(1));
            }
        }

        private void g(g gVar) {
            int r = gVar.r();
            int size = n.this.k.size();
            gVar.a(-1);
            n.this.k.remove(gVar);
            n.this.k.add(gVar);
            for (int i = r; i < size; i++) {
                g gVar2 = (g) n.this.k.get(i);
                if (gVar2.r() != -1) {
                    gVar2.a(i);
                    b(gVar2, 250);
                }
            }
            k();
        }

        public void a(g gVar, int i) {
            Number3d localToGlobal = gVar.localToGlobal(new Number3d());
            Number3d localRotationToGlobal = gVar.localRotationToGlobal(new Number3d());
            gVar.removeFromParent();
            this.c.globalToLocal(localToGlobal);
            this.c.globalRotationToLocal(localRotationToGlobal);
            localRotationToGlobal.z = 0.0f;
            localRotationToGlobal.x = 0.0f;
            localRotationToGlobal.y = 0.0f;
            gVar.position().setAllFrom(localToGlobal);
            gVar.rotation().x = 0.0f;
            gVar.rotation().y = -this.c.rotation().y;
            gVar.rotation().z = 0.0f;
            gVar.setTag(null);
            if (gVar.r() == -1) {
                gVar.a(this.c.numChildren());
            }
            this.c.addChild(gVar);
            k();
            n.this.k.remove(gVar);
            n.this.k.add(gVar.r(), gVar);
            b(gVar, i);
        }

        public void a(g gVar) {
            if (!gVar.q()) {
                if (n.this.r == gVar) {
                    n.this.a(gVar, false, true);
                    return;
                } else {
                    n.this.a(gVar);
                    return;
                }
            }
            a(0.0f, this.q, gVar, true);
            a(gVar, 500);
            gVar.a(false);
            n.this.ac();
            this.C = null;
            if (n.this.n < 16) {
                j();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class a {
            float a;
            float b;
            float c;

            a() {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends com.censivn.C3DEngine.b.d.a {
        boolean a;
        boolean b;
        private g e;
        private boolean f;
        private boolean g;

        public a(com.censivn.C3DEngine.b.f.i iVar) {
            super(iVar);
            this.a = false;
            this.b = false;
        }

        public void a(g gVar) {
            this.e = gVar;
        }

        @Override // com.censivn.C3DEngine.b.d.a
        public void c(MotionEvent motionEvent) {
            if (!this.g && this.e.t() != -1) {
                n.this.w.a(this.e, motionEvent);
                this.g = true;
            }
        }

        @Override // com.censivn.C3DEngine.b.d.a
        public void a(MotionEvent motionEvent, MotionEvent motionEvent2) {
            if (this.g) {
                n.this.w.a(this.e, motionEvent, motionEvent2);
            }
        }

        @Override // com.censivn.C3DEngine.b.d.a
        public void a(MotionEvent motionEvent) {
            w.b();
            n.this.w.a(this.e);
        }

        @Override // com.censivn.C3DEngine.b.d.a
        public void f(MotionEvent motionEvent) {
            if (this.g) {
                this.g = false;
                n.this.w.b(this.e, motionEvent);
            }
            n.this.w.f();
        }

        @Override // com.censivn.C3DEngine.b.d.a
        public void e(MotionEvent motionEvent) {
            this.a = false;
            this.b = false;
            this.f = true;
        }

        @Override // com.censivn.C3DEngine.b.d.a
        public void a(MotionEvent motionEvent, final MotionEvent motionEvent2, float f, float f2) {
            if (this.f) {
                this.f = false;
                if (Math.abs(f) > Math.abs(f2)) {
                    this.b = true;
                    n.this.w.e();
                } else {
                    com.censivn.C3DEngine.a.a().b(new Runnable() { // from class: com.tsf.shell.f.f.n.a.1
                        @Override // java.lang.Runnable
                        public void run() {
                            a.this.c(motionEvent2);
                        }
                    });
                }
            }
            if (this.b) {
                n.this.w.b(motionEvent2.getX() - motionEvent.getX());
            }
        }

        @Override // com.censivn.C3DEngine.b.d.a
        public void b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (this.b && Math.abs(f) > 250.0f) {
                n.this.w.a(f / 2.0f);
            }
        }
    }
}
