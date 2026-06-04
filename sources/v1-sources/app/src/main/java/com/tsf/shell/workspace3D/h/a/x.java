package com.tsf.shell.workspace3D.h.a;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.element.info.LauncherShortcut3DInfo;
import com.tsf.shell.R;
import com.tsf.shell.au;
import com.tsf.shell.bd;
import com.tsf.shell.bm;
import com.tsf.shell.theme.inside.ThemeDockDescription;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.ThemeShellDescription;
import com.tsf.shell.workspace3D.bf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class x extends com.tsf.shell.workspace3D.h.a implements com.tsf.shell.g, i {
    public static int J;
    public static int M;
    public static int N;
    public static int O;
    public static int P;
    public static int Q;
    public static int R;
    public static int S;
    public static int T;
    public static int U;
    public static int V;
    public static int W;
    public static int X;
    public static ArrayList Z;
    private j aA;
    private k aB;
    private l aC;
    private as aD;
    private com.censivn.C3DEngine.e.b aE;
    private TextureElement aF;
    private com.censivn.C3DEngine.b.v ab;
    private int ac;
    private e ad;
    private e ae;
    private int af;
    private boolean ai;
    private w aj;
    private ArrayList ak;
    private ArrayList al;
    private ArrayList am;
    private ArrayList an;
    private ArrayList ao;
    private com.tsf.shell.workspace3D.h.a.a.m ap;
    private com.censivn.C3DEngine.b.v aq;
    private com.censivn.C3DEngine.g.u ar;
    private com.censivn.C3DEngine.g.u as;
    private com.censivn.C3DEngine.g.b.b at;
    private com.censivn.C3DEngine.b.l av;
    private com.censivn.C3DEngine.b.l aw;
    private Runnable ax;
    private float ay;
    public static int I = 0;
    public static int K = (int) (105.0f * com.censivn.C3DEngine.a.a);
    public static int L = (int) (125.0f * com.censivn.C3DEngine.a.a);
    public static int Y = 350;
    private static String aa = "ApplicationPageBlackground";
    private boolean ag = false;
    private boolean ah = true;
    private float au = -1.0f;
    private float az = 0.0f;
    private boolean aG = false;
    private boolean aH = false;

    public x() {
        this.ai = true;
        a.a();
        this.E = new aj(this, this.B);
        this.ap = new com.tsf.shell.workspace3D.h.a.a.m();
        this.at = new com.censivn.C3DEngine.g.b.b();
        this.ar = new z(this);
        this.as = new aa(this);
        this.as.b(260);
        this.ar.a((com.censivn.C3DEngine.g.r) new com.censivn.C3DEngine.g.d());
        this.as.a((com.censivn.C3DEngine.g.r) new com.censivn.C3DEngine.g.d());
        this.aj = new w();
        this.af = com.censivn.C3DEngine.a.j;
        this.aq = new com.censivn.C3DEngine.b.v();
        this.aq.a(aa);
        this.aw = new com.censivn.C3DEngine.b.l(this.aq);
        this.av = k(this.aq);
        this.aq.a(this.av);
        this.aq.e(true);
        this.B.d(this.aq);
        this.ab = new ak(this);
        com.tsf.shell.b.a().a(this);
        this.ak = new ArrayList();
        this.am = new ArrayList();
        this.an = new ArrayList();
        this.ao = com.tsf.shell.a.t.D();
        this.B.d(this.ab);
        this.B.d(this.aj);
        this.ai = this.ap.c() != 1;
        this.aC = new al(this, this.ap.b(), this.ap.c());
        this.B.d(this.aC);
        this.aD = new ap(this);
        this.B.d(this.aD);
        this.aB = new ao(this, this);
        this.B.d(this.aB);
        Bitmap bitmap = ThemeManager.mix.page.getTheme().getBitmap(ThemeShellDescription.PAGE_PREVIEW_DRAWER_MARK);
        this.aF = com.censivn.C3DEngine.a.f().a(this.aF, bitmap);
        bitmap.recycle();
        this.aE = new com.censivn.C3DEngine.e.b(64.0f, 64.0f);
        this.aE.z().c(this.aF);
        bH();
    }

    public final com.censivn.C3DEngine.b.v bn() {
        return this.ad;
    }

    @Override // com.tsf.shell.workspace3D.h.a, com.tsf.shell.bj
    public final void b(int i) {
        super.b(i);
        bH();
        bC();
        if (this.aC != null) {
            this.aC.f(i);
            this.aD.f(i);
            this.aB.f(i);
        }
        com.censivn.C3DEngine.a.a().c(new y(this));
    }

    @Override // com.tsf.shell.workspace3D.h.a, com.tsf.shell.bj
    public final void b_(int i, int i2, int i3, int i4) {
        super.b_(i, i2, i3, i4);
        if (this.aC != null) {
            this.aC.k();
            this.aD.k();
            this.aB.k();
        }
        boolean i5 = this.ad != null ? this.ad.i() : false;
        if (i5) {
            this.ad.i(false);
        }
        bH();
        bC();
        if (i5) {
            this.ad.h(false);
        }
        com.censivn.C3DEngine.a.a().c(new ag(this));
    }

    @Override // com.tsf.shell.workspace3D.h.a, com.tsf.shell.bj
    public final void p_() {
        bH();
        bC();
        com.censivn.C3DEngine.a.a().c(new ah(this));
    }

    private void bH() {
        if (bd.c() == 0) {
            Q = (int) (100.0f * com.censivn.C3DEngine.a.a);
            R = (int) (com.censivn.C3DEngine.a.a * 60.0f);
        } else {
            Q = (int) (com.censivn.C3DEngine.a.a * 60.0f);
            R = (int) (100.0f * com.censivn.C3DEngine.a.a);
        }
        O = (int) (com.censivn.C3DEngine.a.a * 80.0f);
        P = (int) (120.0f * com.censivn.C3DEngine.a.a);
        float f = bf.s().v() ? com.censivn.C3DEngine.a.b * 0.0f : com.censivn.C3DEngine.a.b * 110.0f;
        switch (com.tsf.shell.workspace3D.e.p.p.c) {
            case 0:
                if (Q <= R) {
                    Q = (int) (f + (com.censivn.C3DEngine.a.a * 40.0f) + Q);
                    break;
                } else {
                    if (f != 0.0f) {
                        f -= com.censivn.C3DEngine.a.b * 40.0f;
                    }
                    Q = (int) (f + Q);
                    break;
                }
            case 1:
                if (Q <= R) {
                    R = (int) ((f - (com.censivn.C3DEngine.a.a * 40.0f)) + R);
                    break;
                } else {
                    R = (int) (f + R);
                    break;
                }
            case 2:
                if (f != 0.0f) {
                    f -= 10.0f * com.censivn.C3DEngine.a.b;
                }
                O = (int) (f + O);
                break;
            case 3:
                P = (int) (f + P);
                break;
        }
        K = (int) (105.0f * com.censivn.C3DEngine.a.a);
        L = (int) (125.0f * com.censivn.C3DEngine.a.a);
        int i = (((com.censivn.C3DEngine.a.j - Q) - R) / K) + 1;
        int i2 = (((com.censivn.C3DEngine.a.k - O) - P) / L) + 1;
        if (i < 2) {
            i = 2;
        }
        if (i2 < 2) {
            i2 = 2;
        }
        W = i;
        X = i2;
        S = 2;
        T = i + 2;
        U = 2;
        V = i2 + 2;
        if (com.tsf.shell.a.t.B()) {
            b(W, X);
        } else if (com.censivn.C3DEngine.a.q) {
            b(com.tsf.shell.a.t.y(), com.tsf.shell.a.t.x());
        } else {
            b(com.tsf.shell.a.t.A(), com.tsf.shell.a.t.z());
        }
        if (this.aE != null) {
            this.aE.L().x = ((-com.tsf.shell.workspace3D.h.l.a) / 2) + 45;
            this.aE.L().y = (com.tsf.shell.workspace3D.h.l.b / 2) - 45;
        }
        if (this.aj != null) {
            this.aj.L().x = 20.0f;
            this.aj.L().y = (com.censivn.C3DEngine.a.h + P) - (88.0f * com.censivn.C3DEngine.a.a);
        }
        if (this.aq != null) {
            this.aq.b(com.censivn.C3DEngine.a.e, com.censivn.C3DEngine.a.h, 0.0f, com.censivn.C3DEngine.a.f, com.censivn.C3DEngine.a.g);
        }
        if (this.aC != null) {
            float f2 = ((int) (com.censivn.C3DEngine.a.a * 80.0f)) - O;
            this.aC.L().y = (com.censivn.C3DEngine.a.g - (50.0f * com.censivn.C3DEngine.a.a)) + f2;
            this.aD.L().y = (com.censivn.C3DEngine.a.g - (120.0f * com.censivn.C3DEngine.a.a)) + f2;
            this.aB.L().y = f2 + (com.censivn.C3DEngine.a.g - (190.0f * com.censivn.C3DEngine.a.a));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bI() {
        this.ah = false;
        this.ag = true;
        com.tsf.shell.i.a().a("PageApplication");
        com.censivn.C3DEngine.a.d().g();
        a_(true);
        this.ad.aG();
    }

    static /* synthetic */ void l(x xVar) {
        com.tsf.shell.i.a().b("PageApplication");
        xVar.ah = true;
        if (xVar.ax != null) {
            xVar.ax.run();
            xVar.ax = null;
        }
        xVar.aV();
        xVar.a_(false);
    }

    public final void bo() {
        Bitmap bitmap = ThemeManager.mix.page.getTheme().getBitmap(ThemeShellDescription.PAGE_PREVIEW_DRAWER_MARK);
        this.aF = com.censivn.C3DEngine.a.f().a(this.aF, bitmap);
        bitmap.recycle();
        Bitmap bitmap2 = ThemeManager.mix.page.getTheme().getBitmap(400);
        n.a = com.censivn.C3DEngine.a.f().a(n.a, bitmap2);
        bitmap2.recycle();
        this.aB.q_();
        this.aD.q_();
        this.aC.q_();
        this.aj.i();
    }

    public final void bp() {
        this.aE.Q();
        d(this.aE);
    }

    public final void bq() {
        this.aE.Q();
    }

    public final void br() {
        if (this.aG) {
            bx();
            this.aB.b(0, false);
        }
        if (this.aH) {
            bt();
            this.aB.b(1, false);
        }
        this.aB.i();
    }

    public final void bs() {
        this.aH = true;
        this.E.b();
        Iterator it = this.an.iterator();
        while (it.hasNext()) {
            com.tsf.shell.workspace3D.k.ah ahVar = (com.tsf.shell.workspace3D.k.ah) it.next();
            a(ahVar, ahVar.ch(), false);
            ahVar.ca();
        }
        au.a(R.string.notic_hide_app_notic);
    }

    public final void bt() {
        this.aH = false;
        Iterator it = this.an.iterator();
        while (it.hasNext()) {
            com.tsf.shell.workspace3D.k.ah ahVar = (com.tsf.shell.workspace3D.k.ah) it.next();
            ((e) ahVar.P()).a(ahVar);
            ahVar.cb();
            this.ak.remove(ahVar);
        }
        com.tsf.shell.a.t.a(this.ao);
    }

    public final ArrayList bu() {
        return this.ak;
    }

    public final boolean bv() {
        return this.aH;
    }

    public final void bw() {
        this.aG = true;
        this.E.b();
        Iterator it = this.ak.iterator();
        while (it.hasNext()) {
            ((com.tsf.shell.workspace3D.k.ah) it.next()).cc();
        }
        Iterator it2 = this.am.iterator();
        while (it2.hasNext()) {
            ((com.tsf.shell.workspace3D.k.ah) it2.next()).cc();
        }
        com.tsf.shell.workspace3D.k.ah.bZ();
    }

    public final void bx() {
        this.aG = false;
        com.tsf.shell.workspace3D.k.ah.b((Runnable) new ai(this));
    }

    public final boolean by() {
        return this.aG;
    }

    private void bJ() {
        this.aj.e(this.ac);
    }

    private void h(int i) {
        this.aj.a(i);
        bJ();
    }

    private void a(com.tsf.shell.workspace3D.k.ah ahVar) {
        com.tsf.shell.h.b ch = ahVar.ch();
        ch.j = false;
        String a = com.tsf.shell.g.a.a(ch);
        Iterator it = this.ao.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str.equals(a)) {
                this.ao.remove(str);
                ahVar.cb();
                if (this.an.contains(ahVar)) {
                    this.an.remove(ahVar);
                    return;
                }
                return;
            }
        }
    }

    static /* synthetic */ void a(x xVar, com.tsf.shell.workspace3D.k.ah ahVar) {
        if (ahVar.ch().j) {
            xVar.a(ahVar);
            return;
        }
        com.tsf.shell.h.b ch = ahVar.ch();
        ch.j = true;
        String a = com.tsf.shell.g.a.a(ch);
        Iterator it = xVar.ao.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).equals(a)) {
                return;
            }
        }
        xVar.ao.add(a);
        if (!xVar.an.contains(ahVar)) {
            xVar.an.add(ahVar);
        }
        ahVar.ca();
    }

    public final void bz() {
        Iterator it = this.al.iterator();
        while (it.hasNext()) {
            ((e) it.next()).aK();
        }
    }

    public final void bA() {
        Iterator it = this.ak.iterator();
        while (it.hasNext()) {
            ((com.tsf.shell.workspace3D.k.ah) it.next()).ce();
        }
        Iterator it2 = this.am.iterator();
        while (it2.hasNext()) {
            ((com.tsf.shell.workspace3D.k.ah) it2.next()).ce();
        }
        Iterator it3 = this.an.iterator();
        while (it3.hasNext()) {
            ((com.tsf.shell.workspace3D.k.ah) it3.next()).ce();
        }
    }

    public final com.censivn.C3DEngine.b.v bB() {
        return this.ab;
    }

    private com.tsf.shell.workspace3D.k.ah d(String str) {
        Iterator it = this.ak.iterator();
        while (it.hasNext()) {
            com.tsf.shell.workspace3D.k.ah ahVar = (com.tsf.shell.workspace3D.k.ah) it.next();
            if (ahVar.ch().c.getClassName().equals(str)) {
                return ahVar;
            }
        }
        Iterator it2 = this.an.iterator();
        while (it2.hasNext()) {
            com.tsf.shell.workspace3D.k.ah ahVar2 = (com.tsf.shell.workspace3D.k.ah) it2.next();
            if (ahVar2.ch().c.getClassName().equals(str)) {
                return ahVar2;
            }
        }
        return null;
    }

    public final com.tsf.shell.workspace3D.k.ah c(String str) {
        Iterator it = this.ak.iterator();
        while (it.hasNext()) {
            com.tsf.shell.workspace3D.k.ah ahVar = (com.tsf.shell.workspace3D.k.ah) it.next();
            if (com.tsf.shell.g.b.a(ahVar.ch().c).equals(str)) {
                return ahVar.cg();
            }
        }
        Iterator it2 = this.an.iterator();
        while (it2.hasNext()) {
            com.tsf.shell.workspace3D.k.ah ahVar2 = (com.tsf.shell.workspace3D.k.ah) it2.next();
            if (com.tsf.shell.g.b.a(ahVar2.ch().c).equals(str)) {
                return ahVar2.cg();
            }
        }
        return null;
    }

    static /* synthetic */ void t(x xVar) {
        Iterator it = xVar.al.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            eVar.g(0.0f);
            eVar.a(xVar.ap.a());
        }
        xVar.bK();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bK() {
        if (this.ad.k() == null) {
            this.au = 1.0f;
        } else {
            this.au = -1.0f;
        }
        if (this.ai) {
            Y = 600;
        } else {
            Y = 350;
        }
        com.censivn.C3DEngine.g.s.a(this.at, Y, this.ar);
        this.ab.e(false);
        this.aq.a(this.aw);
        bI();
    }

    @Override // com.tsf.shell.workspace3D.h.a.i
    public final void a(e eVar) {
        this.ae = eVar;
    }

    @Override // com.tsf.shell.workspace3D.h.a.i
    public final e a() {
        return bL();
    }

    @Override // com.tsf.shell.workspace3D.h.a.i
    public final void a(e eVar, e eVar2, e eVar3) {
        if (this.al.size() != 1) {
            this.al.remove(eVar);
            if (this.ad == eVar) {
                this.ad = (e) this.al.get(this.al.size() - 1);
                this.ad.j(true);
                this.ad.g(0.0f);
                this.ac = this.ad.l();
            }
            int size = this.al.size();
            if (size >= 3) {
                eVar3.a(eVar2);
                eVar2.b(eVar3);
            } else {
                if (eVar3 != null) {
                    eVar3.a((e) null);
                }
                eVar2.b((e) null);
            }
            eVar.H();
            h(size);
        }
    }

    public final void bC() {
        if (this.al != null) {
            int l = this.ad.l();
            e eVar = (e) this.al.remove(0);
            float I2 = this.ad.I();
            Iterator it = this.al.iterator();
            while (it.hasNext()) {
                ((e) it.next()).H();
            }
            this.al.clear();
            eVar.aD().clear();
            eVar.g(0.0f);
            eVar.b((e) null);
            eVar.a((e) null);
            eVar.j(false);
            this.al.add(eVar);
            for (int size = this.ak.size() - 1; size >= 0; size--) {
                com.tsf.shell.workspace3D.k.ah ahVar = (com.tsf.shell.workspace3D.k.ah) this.ak.get(size);
                eVar.a(ahVar, 0);
                ahVar.a((com.tsf.shell.workspace3D.h.a) this);
            }
            int size2 = this.al.size() - 1;
            if (l <= size2) {
                size2 = l;
            }
            this.ad = (e) this.al.get(size2);
            this.ad.j(true);
            this.ad.g(0.0f);
            if (I2 != 255.0f) {
                this.ad.b(I2);
            }
            this.ac = this.ad.l();
            bJ();
        }
    }

    public final void bD() {
        com.censivn.C3DEngine.a.a().c(new ab(this));
    }

    public final void a(int i, int i2) {
        com.censivn.C3DEngine.a.a().c(new ac(this, i, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i, int i2) {
        if (i < S || i > T) {
            i = W;
        }
        if (i2 < U || i2 > V) {
            i2 = X;
        }
        M = i;
        N = i2;
        J = M * N;
        K = ((com.censivn.C3DEngine.a.j - Q) - R) / (M - 1);
        L = ((com.censivn.C3DEngine.a.k - O) - P) / (N - 1);
        if (Z == null) {
            Z = new ArrayList();
        } else {
            Z.clear();
        }
        float f = com.censivn.C3DEngine.a.e;
        float f2 = com.censivn.C3DEngine.a.g;
        for (int i3 = 0; i3 < J; i3++) {
            int i4 = i3 % M;
            int i5 = i3 / M;
            Number3d number3d = new Number3d();
            number3d.x = (i4 * K) + Q + f;
            number3d.y = (((-i5) * L) - O) + f2;
            Z.add(number3d);
        }
        com.tsf.shell.workspace3D.h.a.a.m mVar = this.ap;
        int i6 = com.censivn.C3DEngine.a.j;
        int i7 = com.censivn.C3DEngine.a.k;
        int i8 = M;
        int i9 = N;
        mVar.a(i6, i7, i8, Z);
    }

    private e bL() {
        int size = this.al.size();
        e eVar = new e(this.ap.a());
        eVar.a((i) this);
        eVar.a(size);
        this.al.add(eVar);
        this.ab.d(eVar);
        eVar.g(1.0f);
        eVar.j(false);
        if (this.al.size() >= 3) {
            e eVar2 = (e) this.al.get(0);
            eVar2.a(eVar);
            eVar.b(eVar2);
        }
        e eVar3 = (e) this.al.get(size - 1);
        eVar3.b(eVar);
        eVar.a(eVar3);
        h(size + 1);
        return eVar;
    }

    private void i(int i) {
        this.ac = i;
        if (this.ad != null) {
            this.ad.aI();
        }
        this.ad = (e) this.al.get(i);
        this.ad.aJ();
        this.ad.j(true);
        bJ();
    }

    static /* synthetic */ void H(x xVar) {
        if (xVar.ad.a <= -1.0f || xVar.ad.a >= 1.0f) {
            return;
        }
        if (xVar.ac != xVar.al.size() - 1) {
            xVar.ad.p();
            xVar.i(xVar.ac + 1);
        } else if (xVar.al.size() >= 3) {
            xVar.ad.p();
            xVar.i(0);
        }
    }

    static /* synthetic */ void G(x xVar) {
        if (xVar.ad.a <= -1.0f || xVar.ad.a >= 1.0f) {
            return;
        }
        if (xVar.ac != 0) {
            xVar.ad.q();
            xVar.i(xVar.ac - 1);
        } else if (xVar.al.size() >= 3) {
            xVar.ad.q();
            xVar.i(xVar.al.size() - 1);
        }
    }

    private int b(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            com.tsf.shell.h.b bVar = (com.tsf.shell.h.b) it.next();
            Iterator it2 = this.ao.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (((String) it2.next()).equals(com.tsf.shell.g.a.a(bVar))) {
                    bVar.j = true;
                    i++;
                    break;
                }
            }
        }
        return i;
    }

    @Override // com.tsf.shell.g
    public final void a(ArrayList arrayList, ArrayList arrayList2) {
        e eVar;
        int size = arrayList.size() - b(arrayList);
        this.al = new ArrayList();
        int i = size / J;
        int i2 = (size % J != 0 || size == 0) ? i + 1 : i;
        for (int i3 = 0; i3 < i2; i3++) {
            e eVar2 = new e(this.ap.a());
            eVar2.a((i) this);
            eVar2.a(i3);
            this.al.add(eVar2);
            this.ab.d(eVar2);
            if (i3 != 0) {
                eVar2.j(false);
            }
        }
        int i4 = 0;
        e eVar3 = i2 >= 3 ? (e) this.al.get(i2 - 1) : null;
        while (i4 < i2) {
            e eVar4 = (e) this.al.get(i4);
            eVar4.a(eVar3);
            if (i4 == i2 - 1) {
                eVar = i2 >= 3 ? (e) this.al.get(0) : null;
            } else {
                eVar = (e) this.al.get(i4 + 1);
            }
            eVar4.b(eVar);
            i4++;
            eVar3 = eVar4;
        }
        i(0);
        h(i2);
        a(arrayList, true, false);
        a(arrayList2, false, false);
    }

    private void a(com.tsf.shell.workspace3D.k.ah ahVar, com.tsf.shell.h.b bVar, boolean z) {
        e eVar;
        int binarySearch = Collections.binarySearch(this.ak, ahVar, a.d);
        int i = binarySearch < 0 ? -(binarySearch + 1) : binarySearch;
        int i2 = i / J;
        this.ak.add(i, ahVar);
        if (!bVar.g && z) {
            ahVar.bR();
        }
        if (i2 >= this.al.size()) {
            eVar = bL();
        } else {
            eVar = (e) this.al.get(i2);
        }
        eVar.a(ahVar, i % J);
        ahVar.a(this.E);
        ahVar.a((com.tsf.shell.workspace3D.h.a) this);
        this.E.a((com.censivn.C3DEngine.b.r) ahVar);
    }

    @Override // com.tsf.shell.g
    public final void a(ArrayList arrayList, boolean z) {
        a(arrayList, z, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0043 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x000a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(ArrayList arrayList, boolean z, boolean z2) {
        com.tsf.shell.workspace3D.k.ah ahVar;
        if (z2) {
            b(arrayList);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.tsf.shell.h.b bVar = (com.tsf.shell.h.b) it.next();
            boolean z3 = bVar.h;
            if (!z) {
                Iterator it2 = this.am.iterator();
                while (it2.hasNext()) {
                    ahVar = (com.tsf.shell.workspace3D.k.ah) it2.next();
                    if (ahVar.ch().c.toString().equals(bVar.c.toString())) {
                        this.am.remove(ahVar);
                        ahVar.a(bVar);
                        com.tsf.shell.workspace3D.k.ah adVar = ahVar != null ? new ad(this, bVar) : ahVar;
                        if (!z3) {
                            this.am.add(adVar);
                        } else if (bVar.j) {
                            this.an.add(adVar);
                        } else {
                            a(adVar, bVar, z);
                        }
                        adVar.a(k(adVar));
                        if (bVar.g) {
                            if (bVar.d != null) {
                                int size = bVar.d.size();
                                for (int i = 0; i < size; i++) {
                                    LauncherShortcut3DInfo launcherShortcut3DInfo = (LauncherShortcut3DInfo) bVar.d.get(i);
                                    switch (launcherShortcut3DInfo.container) {
                                        case -4:
                                            bf.s().a((com.tsf.shell.workspace3D.k.j) adVar.a(launcherShortcut3DInfo));
                                            break;
                                        case LauncherShortcut3DInfo.CONTAINER_FOLDER /* -3 */:
                                        default:
                                            if (launcherShortcut3DInfo.folderInfo.addItemInfo(launcherShortcut3DInfo)) {
                                                adVar.a(launcherShortcut3DInfo);
                                                break;
                                            } else {
                                                bm.b(com.censivn.C3DEngine.a.c(), launcherShortcut3DInfo);
                                                break;
                                            }
                                        case LauncherShortcut3DInfo.CONTAINER_QUICKLAUNCH /* -2 */:
                                            bf.l().l().b(adVar.a(launcherShortcut3DInfo));
                                            break;
                                        case -1:
                                            com.tsf.shell.workspace3D.k.ah a = adVar.a(launcherShortcut3DInfo);
                                            bf.j().d(launcherShortcut3DInfo.screen).g(a);
                                            a.i_();
                                            break;
                                    }
                                }
                            }
                            bVar.d = null;
                        }
                    }
                }
            }
            ahVar = null;
            if (ahVar != null) {
            }
            if (!z3) {
            }
            adVar.a(k(adVar));
            if (bVar.g) {
            }
        }
    }

    @Override // com.tsf.shell.g
    public final void a(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.tsf.shell.h.b bVar = (com.tsf.shell.h.b) it.next();
            com.tsf.shell.workspace3D.k.ah d = d(bVar.c.getClassName());
            if (d != null) {
                d.a(bVar);
            } else {
                return;
            }
        }
    }

    @Override // com.tsf.shell.g
    public final void b(ArrayList arrayList, boolean z) {
        com.tsf.shell.workspace3D.k.ah d;
        Iterator it = arrayList.iterator();
        while (it.hasNext() && (d = d(((com.tsf.shell.h.b) it.next()).c.getClassName())) != null) {
            if (d.ch().j) {
                a(d);
                com.tsf.shell.a.t.a(this.ao);
            }
            this.ak.remove(d);
            if (!z) {
                this.am.add(d);
            } else {
                d.ci();
            }
            e eVar = (e) d.P();
            if (eVar != null) {
                eVar.a(d);
            }
        }
    }

    private com.censivn.C3DEngine.b.l k(com.censivn.C3DEngine.b.r rVar) {
        return new ae(this, rVar);
    }

    public final void bE() {
        br();
    }

    public final void bF() {
        this.aC.l();
        this.aD.l();
        this.aB.l();
    }

    public final void bG() {
        this.aC.m();
        this.aD.m();
        this.aB.m();
    }

    @Override // com.tsf.shell.workspace3D.h.a
    public final void bd() {
        super.bd();
        if (this.ad != null) {
            this.ad.n();
        }
        if (!this.ah) {
            com.tsf.shell.i.a().b("PageApplication");
        }
    }

    @Override // com.tsf.shell.workspace3D.h.a
    public final void be() {
        super.be();
        if (this.ad != null) {
            this.ad.o();
        }
        if (!this.ah) {
            com.tsf.shell.i.a().a("PageApplication");
        }
    }

    @Override // com.tsf.shell.workspace3D.h.a
    public final void bl() {
        this.G.add(new com.tsf.shell.workspace3D.e.a.g(new int[]{ThemeDockDescription.DOCK_MENU_EDIT_BUTTON_OFF, ThemeDockDescription.DOCK_MENU_EDIT_BUTTON_ON}, 6));
        this.G.add(new com.tsf.shell.workspace3D.e.a.g(new int[]{ThemeDockDescription.DOCK_MENU_MULIT_CHOICE_BUTTON_OFF, ThemeDockDescription.DOCK_MENU_MULIT_CHOICE_BUTTON_ON}, 7));
        this.G.add(new com.tsf.shell.workspace3D.e.a.g(new int[]{ThemeDockDescription.DOCK_MENU_SETTING_BUTTON_OFF, ThemeDockDescription.DOCK_MENU_SETTING_BUTTON_ON}, 0));
    }

    @Override // com.tsf.shell.workspace3D.h.a
    public final void bj() {
        if (this.ad != null) {
            this.ad.h(true);
        }
        this.aB.j();
        this.aC.j();
        this.aD.j();
    }

    @Override // com.tsf.shell.workspace3D.h.a
    public final void bk() {
        if (this.ad != null) {
            this.ad.i(true);
        }
        this.aB.n();
        this.aC.n();
        this.aD.n();
    }
}
