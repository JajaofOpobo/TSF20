package com.tsf.shell.workspace3D.k.c.b;

import android.content.Context;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.element.info.LauncherFolder3DInfo;
import com.censivn.C3DEngine.api.element.info.LauncherItem3DInfo;
import com.censivn.C3DEngine.api.element.info.LauncherShortcut3DInfo;
import com.censivn.C3DEngine.api.message.RenderRunnable;
import com.tsf.shell.bo;
import com.tsf.shell.theme.inside.ThemeShellDescription;
import com.tsf.shell.theme.inside.widget.SystemFolderTheme;
import com.tsf.shell.workspace3D.bf;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class c implements com.tsf.shell.workspace3D.g.a.a, com.tsf.shell.workspace3D.g.o {
    protected static c c;
    public static ao d;
    public static af e;
    public static ad f;
    private static ArrayList u;
    private static ArrayList v;
    private static com.tsf.shell.workspace3D.g.i w;
    private int A;
    private Number3d B;
    private Number3d C;
    private com.tsf.shell.workspace3D.k.ab D;
    private com.censivn.C3DEngine.b.l E;
    private com.censivn.C3DEngine.b.l F;
    private com.censivn.C3DEngine.b.l G;
    private com.tsf.shell.workspace3D.g.p H;
    private com.tsf.shell.workspace3D.d.a I;
    private com.censivn.C3DEngine.b.v J;
    private com.censivn.C3DEngine.g.u L;
    private com.tsf.shell.workspace3D.k.o M;
    private RenderRunnable O;
    private com.censivn.C3DEngine.e.b P;
    private ArrayList R;
    protected com.tsf.shell.workspace3D.k.j g;
    protected ai h;
    protected com.censivn.C3DEngine.e.b i;
    protected com.censivn.C3DEngine.e.b j;
    protected com.censivn.C3DEngine.e.b k;
    protected com.censivn.C3DEngine.e.b l;
    protected com.censivn.C3DEngine.e.b m;
    protected TextureElement n;
    protected TextureElement o;
    protected TextureElement p;
    private int x;
    private ag y;
    private c z;
    private static ArrayList t = new ArrayList();
    public static int a = 0;
    public static int b = 1;
    protected boolean q = true;
    protected boolean r = false;
    protected boolean s = false;
    private int K = 1;
    private boolean N = false;
    private Number3d Q = new Number3d();

    public static void e() {
        d = new ao();
        e = new af();
        f = new ad();
        ArrayList arrayList = new ArrayList();
        v = arrayList;
        arrayList.add(7);
        v.add(6);
        ArrayList arrayList2 = new ArrayList();
        u = arrayList2;
        arrayList2.add(4);
    }

    public static void f() {
        d.a();
        e.a();
        Iterator it = t.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            cVar.y.a();
            cVar.E();
            cVar.D();
            cVar.C();
            cVar.h.L().x = d.D.childContainerX;
            cVar.h.L().y = d.D.childContainerY;
            cVar.h.Q();
            Iterator it2 = d.D.order.iterator();
            while (it2.hasNext()) {
                switch (((Integer) it2.next()).intValue()) {
                    case 0:
                        cVar.g.d(cVar.k);
                        break;
                    case 1:
                        cVar.g.d(cVar.j);
                        break;
                    case 2:
                        cVar.g.d(cVar.i);
                        break;
                    case 3:
                        cVar.g.d(cVar.h);
                        break;
                    case 4:
                        cVar.g.d(cVar.l);
                        break;
                }
            }
            cVar.g.b(e.c, e.f, 0.0f, e.d, e.e);
            d.a(cVar, cVar.o());
            cVar.A();
            cVar.a(true, (Runnable) null, false);
            if (cVar.g.L) {
                if (d.D.nameTextFormat.auto) {
                    cVar.d(true);
                } else {
                    cVar.e(true);
                }
            }
            cVar.B();
        }
        if (bf.s().u()) {
            bf.s().h().aH();
        } else {
            bf.s().h().aI();
        }
        bf.l().r();
    }

    public static void g() {
        Iterator it = t.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            cVar.N = true;
            cVar.B();
        }
    }

    public static void h() {
        Iterator it = t.iterator();
        while (it.hasNext()) {
            ((c) it.next()).A();
        }
    }

    private void A() {
        if (c == this) {
            this.g.L().y = 0 - d.m;
            d.K.L().y = d.h;
        }
        this.h.i();
    }

    public static c a(int i, int i2, int i3) {
        LauncherFolder3DInfo launcherFolder3DInfo = new LauncherFolder3DInfo(bf.l().t());
        launcherFolder3DInfo.internal = true;
        launcherFolder3DInfo.screen = i;
        launcherFolder3DInfo.cellX = i2;
        launcherFolder3DInfo.cellY = i3;
        launcherFolder3DInfo.rotation = 0;
        launcherFolder3DInfo.classname = c.class.getName();
        launcherFolder3DInfo.packagename = "";
        c cVar = new c();
        com.tsf.shell.workspace3D.k.j widget = cVar.getWidget(com.censivn.C3DEngine.a.c());
        widget.L().x = launcherFolder3DInfo.cellX;
        widget.L().y = launcherFolder3DInfo.cellY;
        widget.M().z = launcherFolder3DInfo.rotation;
        launcherFolder3DInfo.setTarget(widget);
        widget.a((LauncherItem3DInfo) launcherFolder3DInfo);
        widget.br();
        com.censivn.C3DEngine.a.a().d(new d(launcherFolder3DInfo));
        bf.l().onLoadWidgetComplete(widget, null);
        return cVar;
    }

    public final com.tsf.shell.workspace3D.k.j i() {
        return this.g;
    }

    public final ai j() {
        return this.h;
    }

    public final ArrayList k() {
        return this.h.aD();
    }

    public final com.censivn.C3DEngine.e.b l() {
        return this.m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B() {
        if (this.O == null) {
            this.O = new r(this);
            com.censivn.C3DEngine.a.a().a(this.O);
        }
    }

    public com.tsf.shell.workspace3D.k.j getWidget(Context context) {
        this.z = this;
        this.A = b;
        this.y = new ag(this);
        this.g = new t(this, this);
        this.g.bt();
        E();
        D();
        C();
        if (w == null) {
            w = new com.tsf.shell.workspace3D.g.i();
        }
        this.H = new com.tsf.shell.workspace3D.g.p(this);
        this.E = new w(this, this.i);
        this.F = new x(this, this.i);
        this.G = new y(this, this.i);
        this.h = new ai(this);
        this.h.a(v, u);
        this.h.L().x = d.D.childContainerX;
        this.h.L().y = d.D.childContainerY;
        Iterator it = d.D.order.iterator();
        while (it.hasNext()) {
            switch (((Integer) it.next()).intValue()) {
                case 0:
                    this.g.d(this.k);
                    break;
                case 1:
                    this.g.d(this.j);
                    break;
                case 2:
                    this.g.d(this.i);
                    break;
                case 3:
                    this.g.d(this.h);
                    break;
                case 4:
                    this.g.d(this.l);
                    break;
            }
        }
        this.g.d(this.m);
        this.M = new z(this, this.h);
        this.g.b(e.c, e.f, 0.0f, e.d, e.e);
        this.I = new aa(this);
        if (!t.contains(this)) {
            t.add(this);
        }
        return this.g;
    }

    private void C() {
        if (this.k == null) {
            this.k = new com.censivn.C3DEngine.e.b(d.D.textPlaneWidth, d.D.textPlaneHeight, 1, 1, false);
        } else {
            this.k.a_(d.D.textPlaneWidth);
            this.k.h(d.D.textPlaneHeight);
        }
        this.k.L().x = d.D.textPlaneX;
        this.k.L().y = d.D.textPlaneY;
        this.k.Q();
    }

    private void D() {
        if (this.m == null) {
            this.m = new com.censivn.C3DEngine.e.b(e.q, e.r, 1, 1, false);
        }
        if (this.n == null) {
            this.n = com.censivn.C3DEngine.a.f().a(e.q, e.r);
        } else if (this.n.width != e.q || this.n.height != e.r) {
            com.censivn.C3DEngine.a.f().a(this.n);
            this.n = com.censivn.C3DEngine.a.f().a(e.q, e.r);
        }
        this.m.z().d();
        this.m.z().c(this.n);
        this.m.E().setPX(0, e.d, e.f, 0.0f);
        this.m.E().setPX(1, e.c, e.f, 0.0f);
        this.m.E().setPX(2, e.d, e.e, 0.0f);
        this.m.E().setPX(3, e.c, e.e, 0.0f);
        this.m.ag();
        this.m.F().set(0, 1.0f, 0.0f);
        this.m.F().set(1, 0.0f, 0.0f);
        this.m.F().set(2, 1.0f, 1.0f);
        this.m.F().set(3, 0.0f, 1.0f);
        this.m.ah();
        this.m.b(e.c, e.f, 0.0f, e.d, e.e);
    }

    private void E() {
        float f2;
        float f3;
        float f4;
        float f5;
        if (d.D.backPlaneEnable) {
            if (d.D.supportHD) {
                f4 = com.censivn.C3DEngine.a.b * d.H.width;
                f5 = com.censivn.C3DEngine.a.b * d.H.height;
            } else {
                f4 = com.censivn.C3DEngine.a.a * d.H.width;
                f5 = com.censivn.C3DEngine.a.a * d.H.height;
            }
            if (this.i == null) {
                this.i = new com.censivn.C3DEngine.e.b(f4, f5, 1, 1, false);
                this.i.z().c(d.H);
            } else {
                this.i.a_(f4);
                this.i.h(f5);
                this.i.Q();
            }
            this.i.L().x = d.D.backPlaneX;
            this.i.L().y = d.D.backPlaneY;
            this.i.b(e.c - this.i.L().x, e.f - this.i.L().y, 0.0f, e.d - this.i.L().x, e.e - this.i.L().y);
        } else if (this.i != null) {
            this.i.z().d();
            this.i.Q();
        }
        if (d.D.frontPlaneEnable) {
            if (d.D.supportHD) {
                f2 = com.censivn.C3DEngine.a.b * d.I.width;
                f3 = com.censivn.C3DEngine.a.b * d.I.height;
            } else {
                f2 = com.censivn.C3DEngine.a.a * d.I.width;
                f3 = com.censivn.C3DEngine.a.a * d.I.height;
            }
            if (this.j == null) {
                this.j = new com.censivn.C3DEngine.e.b(f2, f3, 1, 1, false);
            } else {
                this.j.a_(f2);
                this.j.h(f3);
                this.j.Q();
            }
            this.j.z().d();
            this.j.z().c(d.I);
            this.j.L().x = d.D.frontPlaneX;
            this.j.L().y = d.D.frontPlaneY;
        } else if (this.j != null) {
            this.j.z().d();
            this.j.Q();
        }
        if (d.D.sizePlaneEnable) {
            if (this.l == null) {
                this.l = new com.censivn.C3DEngine.e.b(d.D.sizePlaneWidth, d.D.sizePlaneHeight, 1, 1, false);
            } else {
                this.l.a_(d.D.sizePlaneWidth);
                this.l.h(d.D.sizePlaneHeight);
                this.l.Q();
            }
            this.l.L().x = d.D.sizePlaneX;
            this.l.L().y = d.D.sizePlaneY;
            return;
        }
        if (this.l != null) {
            this.l.z().d();
            this.l.Q();
        }
    }

    @Override // com.tsf.shell.workspace3D.g.a.a
    public final void d() {
    }

    @Override // com.tsf.shell.workspace3D.g.a.a
    public final void b() {
        F();
        this.s = false;
    }

    public final void a(com.tsf.shell.workspace3D.k.ab abVar) {
        if (this.h.aD().contains(abVar)) {
            this.h.e(abVar);
            b(true);
            u();
            F();
        }
    }

    @Override // com.tsf.shell.workspace3D.g.a.a
    public final void a(com.censivn.C3DEngine.b.r rVar, com.tsf.shell.workspace3D.k.ah ahVar) {
        com.tsf.shell.workspace3D.k.ah cg = ahVar.cg();
        Number3d a2 = a(this.h.aB());
        cg.L().x = a2.x;
        cg.L().y = a2.y;
        cg.h(false);
        this.h.a(cg, 0);
        a(cg, (LauncherFolder3DInfo) this.g.be());
        b(true);
        f.a(this, rVar, cg);
        u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.tsf.shell.workspace3D.k.ab abVar, LauncherFolder3DInfo launcherFolder3DInfo) {
        ((LauncherShortcut3DInfo) abVar.be()).folderInfo = launcherFolder3DInfo;
        abVar.bs();
        abVar.a((com.censivn.C3DEngine.b.l) new a(abVar, this.z));
        abVar.a(this.M);
        this.M.a((com.censivn.C3DEngine.b.r) abVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(com.tsf.shell.workspace3D.k.ab abVar) {
        ArrayList bH = abVar.bH();
        if (bH != null && bH.size() > 0) {
            Iterator it = bH.iterator();
            while (it.hasNext()) {
                com.tsf.shell.workspace3D.k.j jVar = (com.tsf.shell.workspace3D.k.j) it.next();
                LauncherShortcut3DInfo launcherShortcut3DInfo = (LauncherShortcut3DInfo) jVar.be();
                launcherShortcut3DInfo.folderInfo = null;
                launcherShortcut3DInfo.container = -1;
                jVar.aW();
            }
        }
        LauncherShortcut3DInfo launcherShortcut3DInfo2 = (LauncherShortcut3DInfo) abVar.be();
        launcherShortcut3DInfo2.folderInfo = null;
        launcherShortcut3DInfo2.container = -1;
        abVar.aW();
        u();
        G();
    }

    static /* synthetic */ LauncherShortcut3DInfo a(ArrayList arrayList, String str) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            LauncherShortcut3DInfo launcherShortcut3DInfo = (LauncherShortcut3DInfo) it.next();
            if (Integer.toString(launcherShortcut3DInfo.appWidgetId).equals(str)) {
                return launcherShortcut3DInfo;
            }
        }
        return null;
    }

    public final void m() {
        d(false);
    }

    private void d(boolean z) {
        if (d.D.nameTextFormat.auto) {
            if (!this.r || z) {
                this.r = true;
                float o_ = d.D.backPlaneY - (this.i.o_() / 2.0f);
                this.i.b(e.c - this.i.L().x, o_ - this.i.L().y, 0.0f, e.d - this.i.L().x, e.e - this.i.L().y);
                this.m.b(e.c, o_, 0.0f, e.d, e.e);
                this.g.b(e.c, o_, 0.0f, e.d, e.e);
                e.a(this);
            }
        }
    }

    public final void n() {
        e(false);
    }

    private void e(boolean z) {
        if (d.D.nameTextFormat.auto || z) {
            if (this.r || z) {
                this.r = false;
                this.i.b(e.c - this.i.L().x, e.f - this.i.L().y, 0.0f, e.d - this.i.L().x, e.e - this.i.L().y);
                this.m.b(e.c, e.f, 0.0f, e.d, e.e);
                this.g.b(e.c, e.f, 0.0f, e.d, e.e);
                e.a(this);
            }
        }
    }

    public final String o() {
        return ((LauncherFolder3DInfo) this.g.be()).title;
    }

    public final void a(String str) {
        if (str != "") {
            this.g.be().title = str;
            com.censivn.C3DEngine.a.a().c(new ab(this, str));
            com.tsf.shell.workspace3D.k.j jVar = this.g;
            com.tsf.shell.workspace3D.k.j.u();
        }
    }

    public final void p() {
        com.censivn.C3DEngine.g.u uVar;
        int i = 250;
        c = this;
        d.a(this.h.aB());
        ao aoVar = d;
        aoVar.P.L().y = aoVar.s;
        aoVar.P.a((Boolean) false);
        this.h.m();
        boolean z = this.r;
        this.r = false;
        af afVar = e;
        af.b(this);
        this.r = z;
        x();
        d.a(o());
        d.M.e(false);
        this.g.e(false);
        this.i.a(this.G);
        this.m.a(this.G);
        this.g.f(true);
        if (this.g.be().container == -4) {
            Number3d.TEMPNUMBER3D.reset();
            this.g.c(Number3d.TEMPNUMBER3D);
            this.P = bf.s().a((com.censivn.C3DEngine.b.r) this.g);
            this.g.L().setAllFrom(Number3d.TEMPNUMBER3D);
        }
        this.J = bf.m().a(this.I);
        bf.m();
        bf.n().a((Runnable) null);
        switch (com.tsf.shell.a.t.R()) {
            case 0:
                uVar = new com.censivn.C3DEngine.g.u();
                H();
                uVar.a((com.censivn.C3DEngine.g.r) new com.censivn.C3DEngine.g.i());
                break;
            case 1:
                uVar = new e(this);
                i = ThemeShellDescription.PAGE_PREVIEW_SELECT;
                uVar.a((com.censivn.C3DEngine.g.r) new com.censivn.C3DEngine.g.i());
                break;
            default:
                uVar = new com.censivn.C3DEngine.g.u();
                H();
                uVar.a((com.censivn.C3DEngine.g.r) new com.censivn.C3DEngine.g.i());
                break;
        }
        uVar.j(1.0f);
        uVar.k(1.0f);
        uVar.f(0.0f);
        uVar.h(0 - d.m);
        uVar.e(0.0f);
        com.censivn.C3DEngine.g.s.a(this.g);
        com.censivn.C3DEngine.g.s.a(this.g, 350, uVar);
        d.K.L().y = d.h - com.censivn.C3DEngine.a.m;
        d.K.a((Boolean) true);
        com.censivn.C3DEngine.g.u uVar2 = new com.censivn.C3DEngine.g.u();
        uVar2.h(d.h);
        com.censivn.C3DEngine.g.s.a(d.K);
        com.censivn.C3DEngine.g.s.a(d.K, i, uVar2);
        this.g.Q();
        d.K.Q();
        this.J.d(d.K);
        this.J.d(this.g);
        this.B = this.g.L().m2clone();
        this.C = this.g.M().m2clone();
        F();
    }

    private static void F() {
        ao aoVar = d;
        aoVar.O.e(false);
        com.censivn.C3DEngine.g.s.a(aoVar.O);
        ay ayVar = new ay(aoVar);
        ayVar.a(255);
        com.censivn.C3DEngine.g.s.a(aoVar.O, 300, ayVar);
    }

    public final void a(boolean z) {
        if (!this.s) {
            c = null;
            this.h.l();
            x();
            this.M.b();
            ao aoVar = d;
            aoVar.M.e(false);
            if (z) {
                ax axVar = new ax(aoVar);
                axVar.h((com.censivn.C3DEngine.a.b * 57.6f) - com.censivn.C3DEngine.a.k);
                com.censivn.C3DEngine.g.s.a(aoVar.K);
                com.censivn.C3DEngine.g.s.a(aoVar.K, ThemeShellDescription.PAGE_PREVIEW_SELECT, axVar);
            } else {
                aoVar.K.L().y = (com.censivn.C3DEngine.a.b * 57.6f) - com.censivn.C3DEngine.a.k;
                aoVar.K.Q();
            }
            f fVar = new f(this, z);
            if (this.h.aB() == 0) {
                a(true, (Runnable) null, z);
                fVar.run();
            } else {
                a(true, (Runnable) fVar, z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G() {
        if (this.h.aB() >= this.K) {
            this.i.a(this.F);
            this.m.a(this.F);
            this.x = 2;
        } else {
            this.i.a(this.E);
            this.m.a(this.E);
            this.x = 1;
        }
    }

    public final boolean q() {
        return this.h.aB() == 0;
    }

    public final int r() {
        return this.A;
    }

    protected final int s() {
        return this.h.aB();
    }

    final void b(boolean z) {
        if (z) {
            d.a(this, o());
        }
    }

    public final void c(boolean z) {
        this.i.e(z);
        this.m.e(z);
    }

    public final int a(float f2, float f3) {
        float[] b2 = com.censivn.C3DEngine.h.a.b(f2, f3);
        float f4 = b2[0];
        float f5 = b2[1];
        ai aiVar = this.h;
        int a2 = ai.a(f4, f5);
        if (a2 != -1) {
            return a2;
        }
        if (f4 > d.f || f4 < (-d.f) || f5 < (-d.g)) {
            return -2;
        }
        this.Q.x = f4;
        this.Q.y = f5;
        this.h.d(this.Q);
        float f6 = this.Q.x + (d.i / 2);
        int i = (int) ((f6 - d.l) / d.i);
        int i2 = -((int) ((((this.Q.y - (d.j / 2)) - this.h.q()) - d.k) / d.j));
        if (i < 0) {
            i = 0;
        } else if (i > d.a - 1) {
            i = d.a - 1;
        }
        int i3 = ((i2 >= 0 ? i2 : 0) * d.a) + i;
        int aB = this.h.aB() - 1;
        return i3 <= aB ? i3 : aB;
    }

    protected final Number3d a(int i) {
        int i2 = d.l + ((i % d.a) * d.i);
        int i3 = d.k - ((i / d.a) * d.j);
        this.Q.x = i2;
        this.Q.y = i3;
        return this.Q;
    }

    protected final void b(com.tsf.shell.workspace3D.k.ab abVar) {
        this.h.aG();
        this.D = abVar;
        this.D.e(false);
        b(true);
        c(abVar);
        a(true);
    }

    public final void t() {
        bo.a(com.censivn.C3DEngine.a.c(), (LauncherFolder3DInfo) this.g.be());
    }

    public final void u() {
        LauncherFolder3DInfo launcherFolder3DInfo = (LauncherFolder3DInfo) this.g.be();
        int size = this.h.aD().size();
        String str = "";
        for (int i = 0; i < size; i++) {
            str = String.valueOf(str) + ((com.tsf.shell.workspace3D.k.ab) this.h.aD().get(i)).be().appWidgetId + ",";
        }
        launcherFolder3DInfo.child = str;
        com.censivn.C3DEngine.a.a().d(new i(this, launcherFolder3DInfo));
    }

    static /* synthetic */ void f(c cVar) {
        int size = cVar.h.aD().size();
        int i = d.D.sampleCount;
        for (int i2 = 0; i2 < size; i2++) {
            com.tsf.shell.workspace3D.k.ab abVar = (com.tsf.shell.workspace3D.k.ab) cVar.h.aD().get((size - i2) - 1);
            if (i2 < i) {
                b(abVar, (SystemFolderTheme.SystemFolderChild) d.D.sampleList.get(i2));
            } else {
                abVar.a((Boolean) false);
                b(abVar, (SystemFolderTheme.SystemFolderChild) d.D.sampleList.get(i2 % d.D.sampleList.size()));
            }
        }
    }

    public final void a(Runnable runnable, boolean z) {
        a(true, runnable, z);
    }

    static /* synthetic */ void i(c cVar) {
        if (cVar.L != null) {
            cVar.L.a((Runnable) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z, Runnable runnable, boolean z2) {
        int i;
        int i2;
        int i3;
        Runnable nVar;
        int i4;
        int aB = this.h.aB();
        int i5 = 400;
        int i6 = 0;
        if (aB > 0) {
            af afVar = e;
            af.b(this);
            int i7 = d.D.sampleCount;
            com.tsf.shell.workspace3D.k.ab abVar = null;
            int i8 = aB - 1;
            while (i8 >= 0) {
                com.tsf.shell.workspace3D.k.ab abVar2 = (com.tsf.shell.workspace3D.k.ab) this.h.aD().get((aB - i8) - 1);
                abVar2.e(false);
                com.censivn.C3DEngine.g.u uVar = null;
                if (i8 < i7) {
                    SystemFolderTheme.SystemFolderChild systemFolderChild = (SystemFolderTheme.SystemFolderChild) d.D.sampleList.get(i8);
                    if (abVar2.N().x == 0.0f) {
                        abVar2.L().setAllFrom(systemFolderChild.position);
                        abVar2.M().setAllFrom(systemFolderChild.rotation);
                    }
                    abVar2.b(255.0f);
                    uVar = new j(this, abVar2);
                    if (abVar2.L().x != systemFolderChild.position.x) {
                        uVar.f(systemFolderChild.position.x);
                    }
                    if (abVar2.L().y != systemFolderChild.position.y) {
                        uVar.h(systemFolderChild.position.y);
                    }
                    if (abVar2.L().z != systemFolderChild.position.z) {
                        uVar.i(systemFolderChild.position.z);
                    }
                    if (abVar2.M().x != systemFolderChild.rotation.x) {
                        uVar.c(systemFolderChild.rotation.x);
                    }
                    if (abVar2.M().y != systemFolderChild.rotation.y) {
                        uVar.d(systemFolderChild.rotation.y);
                    }
                    if (abVar2.M().z != systemFolderChild.rotation.z) {
                        uVar.e(systemFolderChild.rotation.z);
                    }
                    if (abVar2.N().x != systemFolderChild.scale.x) {
                        uVar.j(systemFolderChild.scale.x);
                    }
                    if (abVar2.N().y != systemFolderChild.scale.y) {
                        uVar.k(systemFolderChild.scale.y);
                    }
                    if (abVar2.N().z != systemFolderChild.scale.z) {
                        uVar.l(systemFolderChild.scale.z);
                    }
                } else {
                    SystemFolderTheme.SystemFolderChild systemFolderChild2 = (SystemFolderTheme.SystemFolderChild) d.D.sampleList.get(i8 % i7);
                    if (abVar2.A()) {
                        uVar = new k(this, abVar2);
                        if (abVar2.L().x != systemFolderChild2.position.x) {
                            uVar.f(systemFolderChild2.position.x);
                        }
                        if (abVar2.L().y != systemFolderChild2.position.y) {
                            uVar.h(systemFolderChild2.position.y);
                        }
                        if (abVar2.L().z != systemFolderChild2.position.z) {
                            uVar.i(systemFolderChild2.position.z);
                        }
                        if (abVar2.M().x != systemFolderChild2.rotation.x) {
                            uVar.c(systemFolderChild2.rotation.x);
                        }
                        if (abVar2.M().y != systemFolderChild2.rotation.y) {
                            uVar.d(systemFolderChild2.rotation.y);
                        }
                        if (abVar2.M().z != systemFolderChild2.rotation.z) {
                            uVar.e(systemFolderChild2.rotation.z);
                        }
                        if (abVar2.N().x != systemFolderChild2.scale.x) {
                            uVar.j(systemFolderChild2.scale.x);
                        }
                        if (abVar2.N().y != systemFolderChild2.scale.y) {
                            uVar.k(systemFolderChild2.scale.y);
                        }
                        if (abVar2.N().z != systemFolderChild2.scale.z) {
                            uVar.l(systemFolderChild2.scale.z);
                        }
                        uVar.a(0);
                    } else {
                        abVar2.L().setAllFrom(systemFolderChild2.position);
                        abVar2.M().setAllFrom(systemFolderChild2.rotation);
                        abVar2.N().setAllFrom(systemFolderChild2.scale);
                        abVar2.b(0.0f);
                    }
                }
                if (uVar != null) {
                    if (!z) {
                        i = i6;
                        i3 = i5;
                    } else if (!z2) {
                        int i9 = i6;
                        i3 = 0;
                        i = i9;
                    } else {
                        switch (com.tsf.shell.a.t.R()) {
                            case 0:
                                i4 = 400;
                                break;
                            case 1:
                                i4 = 400;
                                uVar.b(i6);
                                break;
                            default:
                                i4 = 400;
                                uVar.b(i6);
                                break;
                        }
                        int i10 = i6 + 40;
                        i3 = i4;
                        i = i10;
                    }
                    if (i8 == 0) {
                        if (i3 == 0) {
                            nVar = new l(this, runnable);
                        } else {
                            nVar = new n(this, runnable);
                        }
                        uVar.a(nVar);
                        this.L = uVar;
                        i2 = i3;
                    } else {
                        com.censivn.C3DEngine.g.s.a(abVar2);
                        com.censivn.C3DEngine.g.s.a(abVar2, i3, uVar);
                        abVar2.a((Boolean) true);
                        abVar2 = abVar;
                        i2 = i3;
                    }
                } else {
                    abVar2 = abVar;
                    i = i6;
                    i2 = i5;
                }
                i8--;
                i5 = i2;
                i6 = i;
                abVar = abVar2;
            }
            com.censivn.C3DEngine.g.s.a(abVar);
            com.censivn.C3DEngine.g.s.a(abVar, i5, this.L);
            abVar.a((Boolean) true);
            return;
        }
        a(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Runnable runnable) {
        com.censivn.C3DEngine.a.a().b(new s(this), 300L);
        if (runnable != null) {
            runnable.run();
        }
        e.a(this);
        af afVar = e;
        af.c(this);
        this.L = null;
        this.g.e(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(com.censivn.C3DEngine.b.r rVar, SystemFolderTheme.SystemFolderChild systemFolderChild) {
        rVar.L().setAllFrom(systemFolderChild.position);
        rVar.M().setAllFrom(systemFolderChild.rotation);
        rVar.N().setAllFrom(systemFolderChild.scale);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H() {
        int aB = this.h.aB();
        if (aB == 0) {
            I();
            return;
        }
        int i = aB > d.c ? aB - d.c : 0;
        ArrayList arrayList = d.D.sampleList;
        for (int i2 = 0; i2 < i; i2++) {
            com.tsf.shell.workspace3D.k.ab abVar = (com.tsf.shell.workspace3D.k.ab) this.h.aD().get((i - 1) - i2);
            if (i2 < arrayList.size()) {
                abVar.b(255.0f);
                abVar.a((Boolean) true);
            } else {
                abVar.b(0.0f);
            }
        }
        int i3 = aB - 1;
        while (true) {
            int i4 = i3;
            if (i4 > i - 1) {
                com.tsf.shell.workspace3D.k.ab abVar2 = (com.tsf.shell.workspace3D.k.ab) this.h.aD().get(i4);
                abVar2.b(255.0f);
                Number3d a2 = a((aB - i4) - 1);
                o oVar = new o(this, abVar2, i4, i);
                oVar.f(a2.x);
                oVar.h(a2.y);
                if (abVar2.L().z != 0.0f) {
                    oVar.i(0.0f);
                }
                if (abVar2.M().x != 0.0f) {
                    oVar.c(0.0f);
                }
                if (abVar2.M().y != 0.0f) {
                    oVar.d(0.0f);
                }
                if (abVar2.M().z != 0.0f) {
                    oVar.e(0.0f);
                }
                if (abVar2.N().x != 1.0f) {
                    oVar.j(1.0f);
                }
                if (abVar2.N().y != 1.0f) {
                    oVar.k(1.0f);
                }
                if (abVar2.N().z != 1.0f) {
                    oVar.l(1.0f);
                }
                switch (com.tsf.shell.a.t.R()) {
                    case 0:
                        break;
                    case 1:
                        oVar.b(((aB - i4) - 1) * 40);
                        break;
                    default:
                        oVar.b(((aB - i4) - 1) * 40);
                        break;
                }
                com.censivn.C3DEngine.g.s.a(abVar2);
                com.censivn.C3DEngine.g.s.a(abVar2, 400, oVar);
                i3 = i4 - 1;
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I() {
        this.g.e(true);
        d.M.e(true);
        this.A = a;
        y();
        com.tsf.shell.tips.b.a(3);
        com.tsf.shell.tips.b.a(2);
        this.h.k();
    }

    @Override // com.tsf.shell.workspace3D.g.o
    public final void a(com.tsf.shell.workspace3D.g.x xVar) {
        if (xVar instanceof com.tsf.shell.workspace3D.k.ab) {
            com.tsf.shell.workspace3D.k.ab abVar = (com.tsf.shell.workspace3D.k.ab) xVar;
            if (this.R == null) {
                this.R = new ArrayList();
            }
            if (abVar.bA()) {
                abVar.bC();
            }
            this.R.add(abVar);
            abVar.a((short) 180, (short) 255, (short) 50, (short) 0);
        }
    }

    public final void a(ArrayList arrayList) {
        this.R = arrayList;
        a();
    }

    @Override // com.tsf.shell.workspace3D.g.o
    public final void a() {
        com.censivn.C3DEngine.g.u qVar;
        if (this.R != null) {
            int size = this.R.size();
            if (size > 0) {
                af afVar = e;
                af.b(this);
                this.g.e(false);
            }
            for (int i = 0; i < size; i++) {
                com.tsf.shell.workspace3D.k.ab abVar = (com.tsf.shell.workspace3D.k.ab) this.R.get(i);
                abVar.K();
                abVar.L().setAllFrom(this.g.d(abVar.L()));
                abVar.Q();
                this.h.d(abVar);
                if (i == size - 1) {
                    qVar = new p(this, abVar);
                } else {
                    qVar = new q(this, abVar);
                }
                qVar.f(0.0f);
                qVar.h(60.0f);
                qVar.e(0.0f);
                com.censivn.C3DEngine.g.s.a(abVar, ThemeShellDescription.PAGE_PREVIEW_SELECT, qVar);
            }
        }
    }

    @Override // com.tsf.shell.workspace3D.g.o
    public final com.tsf.shell.workspace3D.g.y c() {
        return null;
    }

    public final void v() {
        if (this.x == 2) {
            com.tsf.shell.workspace3D.g.p pVar = this.H;
            com.tsf.shell.workspace3D.g.p.e();
            if (this.H.c() && com.tsf.shell.a.t.S()) {
                this.H.a(false);
                return;
            }
        }
        if (com.tsf.shell.a.t.S()) {
            this.z.a(false);
        }
    }

    public final boolean w() {
        return this.H.c();
    }

    static /* synthetic */ void k(c cVar) {
        Iterator it = ((ArrayList) cVar.h.aD().clone()).iterator();
        while (it.hasNext()) {
            com.censivn.C3DEngine.b.r rVar = (com.censivn.C3DEngine.b.r) it.next();
            if (rVar instanceof com.tsf.shell.workspace3D.k.j) {
                com.tsf.shell.workspace3D.k.ab abVar = (com.tsf.shell.workspace3D.k.ab) rVar;
                abVar.aW();
                bf.l().a((com.tsf.shell.workspace3D.k.j) abVar);
            }
        }
        cVar.D = null;
        cVar.E = null;
        cVar.F = null;
        cVar.G = null;
        cVar.H.a();
        com.censivn.C3DEngine.a.f().a(cVar.o);
        com.censivn.C3DEngine.a.f().a(cVar.n);
        if (cVar.p != null) {
            com.censivn.C3DEngine.a.f().a(cVar.p);
        }
        cVar.n = null;
        t.remove(cVar);
    }

    public static void x() {
        com.tsf.shell.i.a().a("WidgetFolderBox");
    }

    public static void y() {
        com.tsf.shell.i.a().b("WidgetFolderBox");
    }
}
