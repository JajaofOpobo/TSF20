package com.tsf.shell.workspace3D.h;

import android.graphics.Bitmap;
import android.view.KeyEvent;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.tsf.shell.Home;
import com.tsf.shell.R;
import com.tsf.shell.theme.inside.ThemeManager;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class l implements com.tsf.shell.at, com.tsf.shell.bj {
    public static int a;
    public static int b;
    public static float c;
    private com.censivn.C3DEngine.b.v A;
    private Runnable B;
    private com.tsf.shell.workspace3D.j.a.a C;
    private com.tsf.shell.workspace3D.k.b.e D;
    private com.tsf.shell.workspace3D.d E;
    private com.tsf.shell.workspace3D.h.c.a F;
    private TextureElement G;
    private j H;
    private Runnable J;
    private l d;
    private l e;
    private com.censivn.C3DEngine.b.v f;
    private com.censivn.C3DEngine.b.v g;
    private com.tsf.shell.workspace3D.h.a.x h;
    private ArrayList i;
    private ArrayList j;
    private a k;
    private int l;
    private com.tsf.shell.h.r n;
    private a o;
    private a p;
    private int q;
    private Runnable s;
    private com.tsf.shell.workspace3D.a t;
    private com.tsf.shell.workspace3D.al u;
    private ab v;
    private ao w;
    private com.censivn.C3DEngine.b.l x;
    private com.censivn.C3DEngine.b.l y;
    private Runnable z;
    private boolean m = false;
    private int r = 2;
    private ArrayList I = new ArrayList();
    private boolean K = false;
    private boolean L = false;

    public l() {
        com.tsf.shell.bd.a(this);
        this.d = this;
    }

    public final void a() {
        a.aH();
        this.E.a();
        this.h.bo();
        com.tsf.shell.workspace3D.bf.i().a();
    }

    @Override // com.tsf.shell.bj
    public final void b_(int i, int i2, int i3, int i4) {
        L();
        this.t.c();
        com.censivn.C3DEngine.a.a().c(new m(this));
    }

    @Override // com.tsf.shell.bj
    public final void p_() {
    }

    private void L() {
        a = (int) ((com.censivn.C3DEngine.a.l * 0.28f) + (com.censivn.C3DEngine.a.b * 90.0f));
        b = (int) ((com.censivn.C3DEngine.a.m * 0.28f) + (com.censivn.C3DEngine.a.b * 90.0f));
        c = (a - (com.censivn.C3DEngine.a.b * 90.0f)) / 2.0f;
        a.aI();
        com.tsf.shell.workspace3D.h.c.a aVar = this.F;
        int i = com.censivn.C3DEngine.a.l;
        int i2 = com.censivn.C3DEngine.a.m;
        aVar.e();
        if (this.A != null) {
            this.A.b(-2.1474836E9f, -com.censivn.C3DEngine.a.o, 0.0f, 2.1474836E9f, com.censivn.C3DEngine.a.o);
        }
        if (this.w != null) {
            ao aoVar = this.w;
            int i3 = com.censivn.C3DEngine.a.g;
            int i4 = com.censivn.C3DEngine.a.h;
            int i5 = com.censivn.C3DEngine.a.e;
            int i6 = com.censivn.C3DEngine.a.f;
            aoVar.b();
        }
        if (this.v != null) {
            ab abVar = this.v;
            int i7 = com.censivn.C3DEngine.a.g;
            int i8 = com.censivn.C3DEngine.a.h;
            int i9 = com.censivn.C3DEngine.a.e;
            int i10 = com.censivn.C3DEngine.a.f;
            abVar.a();
        }
    }

    public final com.censivn.C3DEngine.b.v c() {
        boolean z;
        this.H = new j();
        this.g = new r(this);
        this.C = new com.tsf.shell.workspace3D.j.a.a();
        this.F = new s(this, this);
        L();
        this.E = new com.tsf.shell.workspace3D.d();
        this.v = new ab(this);
        this.f = new t(this);
        Bitmap bitmap = ThemeManager.getInstance().getCurrentThemeDescription().dock.getBitmap(510);
        this.G = com.censivn.C3DEngine.a.f().a(bitmap, false);
        bitmap.recycle();
        this.D = new u(this);
        this.w = new ao(this);
        this.g.a_(true);
        this.u = com.tsf.shell.workspace3D.bf.m();
        this.n = Home.d().f();
        this.e = this;
        this.A = new com.censivn.C3DEngine.b.v();
        this.t = new com.tsf.shell.workspace3D.a(this.A);
        this.A.b(-2.1474836E9f, -com.censivn.C3DEngine.a.o, 0.0f, 2.1474836E9f, com.censivn.C3DEngine.a.o);
        this.x = new com.tsf.shell.workspace3D.a.c(this.A);
        this.y = new com.censivn.C3DEngine.b.l(this.A);
        this.A.a(this.x);
        this.A.e(false);
        this.z = new v(this);
        this.j = new ArrayList();
        for (int i = 0; i < 12; i++) {
            this.j.add(Integer.valueOf(i));
        }
        int K = com.tsf.shell.a.t.K();
        int L = com.tsf.shell.a.t.L();
        this.i = new ArrayList();
        com.tsf.shell.a.s M = com.tsf.shell.a.t.M();
        this.l = M.a;
        String[] split = M.b.split(",");
        ArrayList arrayList = new ArrayList();
        for (String str : split) {
            try {
                Integer valueOf = Integer.valueOf(Integer.parseInt(str));
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    if (((Integer) it.next()) == valueOf) {
                        z = true;
                        break;
                    }
                }
                if (!z) {
                    arrayList.add(valueOf);
                }
            } catch (Exception e) {
            }
        }
        int size = arrayList.size();
        int i2 = size > this.l + 1 ? this.l + 1 : size;
        N();
        for (int i3 = 0; i3 < i2; i3++) {
            int intValue = ((Integer) arrayList.get(i3)).intValue();
            if (intValue != -1) {
                Integer valueOf2 = Integer.valueOf(intValue);
                if (this.j.contains(valueOf2)) {
                    this.j.remove(valueOf2);
                } else {
                    valueOf2 = (Integer) this.j.remove(0);
                }
                int intValue2 = valueOf2.intValue();
                g gVar = new g();
                gVar.e(intValue2);
                this.i.add(gVar);
                e(gVar);
                String str2 = "request new page id:" + gVar.aG();
            }
        }
        if (this.h == null) {
            N();
        }
        this.l -= i2;
        for (int i4 = 0; i4 < this.l; i4++) {
            M();
        }
        O();
        for (int i5 = 0; i5 < this.l; i5++) {
            a aVar = (a) this.i.get(i5);
            aVar.a(i5);
            if (i5 > 0) {
                if (i5 == 1) {
                    if (this.l == 2) {
                        aVar.b((a) null);
                        aVar.a((a) null);
                    } else {
                        aVar.b((a) this.i.get(i5 + 1));
                        aVar.a((a) this.i.get(this.l - 1));
                    }
                } else if (i5 != this.l - 1) {
                    aVar.b((a) this.i.get(i5 + 1));
                    aVar.a((a) this.i.get(i5 - 1));
                } else if (this.l == 3) {
                    aVar.b((a) null);
                    aVar.a((a) this.i.get(1));
                } else {
                    aVar.b((a) this.i.get(1));
                    aVar.a((a) this.i.get(i5 - 1));
                }
            }
            aVar.L().x = i5 * c;
            if (aVar.aG() == K) {
                this.k = aVar;
            }
            if (aVar.aG() == L && L != -1) {
                this.p = aVar;
                a(aVar);
            }
        }
        if (this.k == null) {
            this.k = (a) this.i.get(0);
        }
        int p = this.k.p();
        for (int i6 = 0; i6 < this.l; i6++) {
            a aVar2 = (a) this.i.get(i6);
            if (i6 < p) {
                aVar2.D = -1.0f;
            } else if (i6 > p) {
                aVar2.D = 1.0f;
            } else {
                aVar2.D = 0.0f;
            }
        }
        com.tsf.shell.workspace3D.bf.s().j().a(this.k.H);
        com.tsf.shell.workspace3D.k.o.a(this.k.k(), 1);
        this.t.a(this.k);
        if (this.p == null) {
            a((a) this.i.get(1));
        }
        a aVar3 = this.p;
        a.aN();
        Q();
        d();
        String str3 = "init page complete , current page : " + K;
        this.f.d(this.A);
        this.f.d(this.g);
        this.w = new ao(this);
        return this.f;
    }

    static /* synthetic */ void h(l lVar) {
        lVar.A.a(lVar.y);
    }

    static /* synthetic */ void a(l lVar, a aVar) {
        lVar.i.remove(aVar);
        lVar.I.add(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public a M() {
        if (this.I.size() == 0) {
            g gVar = new g();
            gVar.e(((Integer) this.j.remove(0)).intValue());
            this.i.add(gVar);
            e(gVar);
            String str = "allocate new page id:" + gVar.aG();
            return gVar;
        }
        a aVar = (a) this.I.remove(0);
        aVar.i();
        aVar.b_(com.censivn.C3DEngine.a.g, com.censivn.C3DEngine.a.h, com.censivn.C3DEngine.a.e, com.censivn.C3DEngine.a.f);
        String str2 = "allocate old page id:" + aVar.aG();
        return aVar;
    }

    private a N() {
        if (this.h == null) {
            this.h = new com.tsf.shell.workspace3D.h.a.x();
            this.h.e(-1);
            this.i.add(this.h);
            e(this.h);
        }
        return this.h;
    }

    public final void d() {
        if (com.tsf.shell.a.t.t()) {
            if (this.l == 2 || this.l == 3) {
                ((a) this.i.get(1)).a((a) null);
                ((a) this.i.get(this.l - 1)).b((a) null);
                return;
            } else {
                ((a) this.i.get(1)).a((a) this.i.get(this.l - 1));
                ((a) this.i.get(this.l - 1)).b((a) this.i.get(1));
                return;
            }
        }
        ((a) this.i.get(1)).a((a) null);
        ((a) this.i.get(this.l - 1)).b((a) null);
    }

    private void e(a aVar) {
        com.censivn.C3DEngine.b.r l = aVar.l();
        l.a(1.0f, 1.5f, 1.0f);
        z zVar = new z(this, l);
        zVar.a(aVar);
        aVar.c(zVar);
        aVar.b(new w(this, l, aVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O() {
        this.l = 0;
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            if (!((a) it.next()).o()) {
                this.l++;
            }
        }
        this.F.a(this.l);
    }

    public final void a(a aVar) {
        if (!aVar.o() && aVar.aG() != -1) {
            if (this.r == 2) {
                this.p = aVar;
            } else {
                if (this.p != null) {
                    a aVar2 = this.p;
                    a.aN();
                }
                this.p = aVar;
                this.p.aM();
            }
            com.tsf.shell.a.t.k(aVar.aG());
        }
    }

    public final ab e() {
        return this.v;
    }

    public final j f() {
        return this.H;
    }

    public final com.tsf.shell.workspace3D.j.a.a g() {
        return this.C;
    }

    public final a h() {
        return this.p;
    }

    public final void a(com.tsf.shell.workspace3D.k.j jVar) {
        if (com.tsf.shell.workspace3D.bf.m().c() == null) {
            com.tsf.shell.workspace3D.bf.m().a(jVar, false);
        }
        ((com.tsf.shell.workspace3D.a.d) jVar.aw()).a(true);
        jVar.c_();
        r();
    }

    public final int i() {
        return this.l;
    }

    public final int j() {
        return this.r;
    }

    public final a k() {
        return this.k;
    }

    public final a l() {
        return (a) this.i.get(1);
    }

    public final int m() {
        return ((a) this.i.get(1)).aG();
    }

    public final com.tsf.shell.workspace3D.h.c.a n() {
        return this.F;
    }

    public final ao o() {
        return this.w;
    }

    public final boolean c(int i) {
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            if (((a) it.next()).aG() == i) {
                return true;
            }
        }
        return false;
    }

    public final a d(int i) {
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar.aG() == i) {
                return aVar;
            }
        }
        Iterator it2 = this.i.iterator();
        while (it2.hasNext()) {
            a aVar2 = (a) it2.next();
            if (aVar2.aG() != -1) {
                return aVar2;
            }
        }
        return null;
    }

    public final com.tsf.shell.workspace3D.h.a.x p() {
        return this.h;
    }

    public final com.censivn.C3DEngine.b.v q() {
        return this.g;
    }

    public final void r() {
        if (!this.m && !this.w.a()) {
            this.q = 1;
            com.censivn.C3DEngine.b.v vVar = this.g;
            com.censivn.C3DEngine.b.v.u();
        }
    }

    public final void s() {
        if (this.q == 1) {
            com.tsf.shell.workspace3D.bf.s().E();
        }
        P();
        this.q = 2;
        com.censivn.C3DEngine.b.v vVar = this.g;
        com.censivn.C3DEngine.b.v.u();
    }

    public final void b(a aVar) {
        this.o = aVar;
    }

    public final void t() {
        if (this.o != null) {
            if (this.o.aG() == -1) {
                Iterator it = this.i.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    a aVar = (a) it.next();
                    if (aVar.aG() != -1) {
                        this.o = aVar;
                        break;
                    }
                }
            }
            a(this.o, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P() {
        if (this.J != null) {
            com.censivn.C3DEngine.a.a().f(this.J);
            this.J = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q() {
        float f = -(this.k.p() * c);
        this.k.L().x = -f;
        this.g.L().x = f;
    }

    public final boolean a(a aVar, Runnable runnable, Runnable runnable2) {
        if (x()) {
            try {
                if (aVar != this.k) {
                    if (runnable != null) {
                        runnable.run();
                    }
                    com.tsf.shell.workspace3D.bf.j().R();
                    ao.a(this.w, aVar, runnable2);
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

    /* JADX INFO: Access modifiers changed from: private */
    public void R() {
        this.h.b(l());
        l().a((a) this.h);
        ((a) this.i.get(this.i.size() - 1)).b((a) null);
    }

    public final void u() {
        com.censivn.C3DEngine.a.a().c(new x(this));
    }

    public final void v() {
        com.censivn.C3DEngine.a.a().c(new y(this));
    }

    public final void w() {
        com.censivn.C3DEngine.a.a().c(new o(this));
    }

    public final boolean x() {
        return com.tsf.shell.workspace3D.bf.s().z() && this.r == 2 && com.tsf.shell.workspace3D.bf.n().p();
    }

    public final void a(float f, float f2, float f3, float f4) {
        this.F.a(f, this.L);
        com.censivn.C3DEngine.a.a().b(new p(this, f, f2, f3, f4));
    }

    public final void c(a aVar) {
        a(aVar, true);
    }

    public final void a(a aVar, boolean z) {
        if (z) {
            this.k.aA();
            this.k = aVar;
            this.k.az();
        } else {
            this.k.aP();
            this.k = aVar;
            this.k.aO();
        }
        com.tsf.shell.workspace3D.bf.s().j().a(this.k.H);
        com.tsf.shell.workspace3D.k.o.a(this.k.k(), 1);
    }

    public final void y() {
        this.K = true;
        s();
    }

    static /* synthetic */ void s(l lVar) {
        lVar.A.e(false);
        q qVar = new q(lVar);
        com.censivn.C3DEngine.b.v c2 = lVar.u.c();
        if (c2 != null && (c2 instanceof com.tsf.shell.workspace3D.k.j)) {
            com.tsf.shell.workspace3D.k.j jVar = (com.tsf.shell.workspace3D.k.j) c2;
            com.tsf.shell.workspace3D.a.d dVar = (com.tsf.shell.workspace3D.a.d) jVar.aw();
            dVar.a(false);
            if (!dVar.b()) {
                lVar.u.e();
            }
            jVar.d_();
            lVar.m = false;
        }
        lVar.n.post(qVar);
        lVar.k.aU();
        lVar.k.D = 0.0f;
        lVar.k.bc();
        com.tsf.shell.workspace3D.bf.k();
        com.tsf.shell.workspace3D.f.c.a();
        com.tsf.shell.workspace3D.bf.l().c(true);
        lVar.g.a_(false);
    }

    public final int z() {
        if (this.k == null) {
            return -1;
        }
        return this.k.aG();
    }

    public final ArrayList A() {
        return this.k.aZ();
    }

    public static void B() {
        com.tsf.shell.h.r.a(false);
        com.censivn.C3DEngine.b.m.d().c().a(false);
    }

    public final void C() {
        if (this.r == 2) {
            if (this.k.aG() == -1) {
                com.censivn.C3DEngine.b.m.d().c().a(false);
            } else {
                com.censivn.C3DEngine.b.m.d().c().a(true);
            }
            com.tsf.shell.h.r.a(true);
        }
    }

    public final void D() {
        boolean z;
        this.h.bz();
        com.censivn.C3DEngine.b.v vVar = this.g;
        com.censivn.C3DEngine.b.v.u();
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (this.k != aVar) {
                com.tsf.shell.h.j q = aVar.q();
                if ((q == null || q.getChildCount() == 0) ? false : true) {
                    aVar.aV();
                    z = false;
                } else {
                    z = true;
                }
                aVar.l(z);
                aVar.bb();
            }
        }
        this.k.Q();
        this.g.d(this.k);
        this.k.aU();
        com.tsf.shell.workspace3D.bf.q().a(this.k, false);
        com.tsf.shell.workspace3D.bf.q().f();
        com.tsf.shell.workspace3D.bf.a().c();
        this.g.a_(false);
        if (this.k.aG() == -1) {
            com.censivn.C3DEngine.b.m.d().c().a(false);
        }
    }

    public final void E() {
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            ((a) it.next()).aX();
        }
    }

    public final void F() {
        if (com.tsf.shell.workspace3D.z.a() && this.q != 1) {
            com.tsf.shell.workspace3D.bf.i().d();
            com.tsf.shell.workspace3D.bf.s().D();
            r();
            com.tsf.shell.h.r.a(false);
            H();
            ab.A(this.v);
        }
    }

    public final void G() {
        if (this.r == 2 && this.q == 1) {
            com.tsf.shell.h.r.a(false);
        }
    }

    public final void H() {
        if (this.q == 2) {
            if (this.r == 4 || this.r == 2) {
                return;
            }
            if (this.K) {
                this.h.L().x = -c;
                this.h.L().y = 0.0f;
                this.h.M().y = 0.0f;
                this.h.j(false);
                this.h.Q();
                this.g.d(this.h);
                a((a) this.h, true);
            }
            com.tsf.shell.workspace3D.bf.i().e();
            com.tsf.shell.workspace3D.bf.s().E();
            this.E.c();
            this.t.a(this.k);
            com.tsf.shell.workspace3D.bf.s().b((com.censivn.C3DEngine.b.r) null);
            com.tsf.shell.aq.b(this);
            this.g.a_(true);
            if (this.L && !this.K) {
                this.m = true;
                if (z() == -1) {
                    com.tsf.shell.au.a(com.censivn.C3DEngine.a.c().getString(R.string.notic_widget_forbid_add));
                    t();
                }
            }
            this.K = false;
            this.r = 4;
            a aVar = this.p;
            a.aN();
            this.h.bq();
            this.F.a(this.i, this.k, this.L);
            this.k.D = 0.0f;
            com.tsf.shell.workspace3D.bf.q().a(this.k, true);
            return;
        }
        if (this.q == 1) {
            if (this.r != 2 && this.r != 4) {
                this.F.d();
                return;
            }
            if (this.r == 3 || this.r == 1) {
                return;
            }
            com.censivn.C3DEngine.b.v c2 = this.u.c();
            this.L = c2 != null && (c2 instanceof com.tsf.shell.workspace3D.k.j);
            this.t.b();
            com.tsf.shell.workspace3D.bf.s().a((com.censivn.C3DEngine.b.r) null, false);
            this.g.a_(true);
            if (this.r == 2) {
                this.k.bb();
                if (this.k instanceof com.tsf.shell.workspace3D.h.a.x) {
                    ((com.tsf.shell.workspace3D.h.a.x) this.k).bE();
                }
                this.o = this.k;
                com.tsf.shell.workspace3D.bf.k();
                com.tsf.shell.workspace3D.f.c.b();
                com.tsf.shell.workspace3D.bf.l().d(true);
                this.A.e(true);
            }
            this.p.aM();
            this.h.bp();
            this.k.j(true);
            this.r = 3;
            if (this.s != null) {
                this.s.run();
                this.s = null;
            }
            this.F.a(this.l, this.i, this.k, this.L);
        }
    }

    public final void I() {
        if (this.k != null) {
            this.k.be();
            this.k.bc();
        }
    }

    public final void J() {
        if (this.k != null) {
            this.k.bd();
            this.k.bb();
        }
    }

    @Override // com.tsf.shell.at
    public final void a(int i) {
        if (i == 4) {
            if (this.v.b()) {
                ab.i(this.v);
            } else {
                com.tsf.shell.aq.b(this);
                s();
            }
        }
    }

    @Override // com.tsf.shell.at
    public final void a(int i, KeyEvent keyEvent) {
    }

    public final void K() {
        if (com.tsf.shell.workspace3D.z.a() && !this.D.f() && com.tsf.shell.workspace3D.bf.j().x() && com.tsf.shell.workspace3D.bf.j().z() != -1) {
            this.D.g();
            com.tsf.shell.tips.b.a(5);
            com.tsf.shell.au.a(R.string.notic_page_lasso_mode_enable);
        }
    }

    public static void d(a aVar) {
        if (com.tsf.shell.workspace3D.z.a() && (aVar instanceof g)) {
            ((g) aVar).bn();
        }
    }

    @Override // com.tsf.shell.bj
    public final void b(int i) {
    }
}
