package com.tsf.shell.workspace3D.e;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.PositionNumber3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.tsf.shell.R;
import com.tsf.shell.theme.inside.ThemeDockDescription;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.ThemeShellDescription;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class p implements com.tsf.shell.bj {
    public static int a;
    public static int b;
    public static float c;
    public static float d;
    public static float e;
    public static float f;
    public static float g;
    public static com.tsf.shell.workspace3D.e.b.a h;
    public static com.tsf.shell.workspace3D.e.b.a i;
    public static com.tsf.shell.workspace3D.e.b.a j;
    public static com.tsf.shell.workspace3D.e.b.a k;
    public static com.tsf.shell.workspace3D.e.b.a l;
    public static com.tsf.shell.workspace3D.e.b.a m;
    public static com.tsf.shell.workspace3D.e.b.a n;
    public static com.tsf.shell.workspace3D.e.b.a o;
    public static com.tsf.shell.workspace3D.e.b.a p;
    public static float q = 0.0f;
    public static float r = 0.0f;
    public static float s = 0.0f;
    public static float t = 0.0f;
    private com.censivn.C3DEngine.b.v E;
    private com.censivn.C3DEngine.b.v F;
    private com.censivn.C3DEngine.b.v G;
    private by H;
    private by I;
    private TextureElement J;
    private TextureElement K;
    private TextureElement L;
    private TextureElement M;
    private TextureElement N;
    private TextureElement O;
    private TextureElement P;
    private TextureElement Q;
    private TextureElement R;
    private com.censivn.C3DEngine.g.u S;
    private com.censivn.C3DEngine.g.u T;
    private TextureElement U;
    private com.censivn.C3DEngine.e.b V;
    private cg W;
    private float X;
    private com.censivn.C3DEngine.e.b Y;
    private ce Z;
    private com.censivn.C3DEngine.b.v aA;
    private com.censivn.C3DEngine.g.b.b aC;
    private boolean aD;
    private com.censivn.C3DEngine.g.u aE;
    private com.censivn.C3DEngine.g.u aF;
    private com.censivn.C3DEngine.b.r aK;
    private com.censivn.C3DEngine.b.r aN;
    private com.censivn.C3DEngine.g.u aR;
    private com.censivn.C3DEngine.g.u aS;
    private com.censivn.C3DEngine.e.b aa;
    private ce ab;
    private cf ac;
    private cf ad;
    private a ae;
    private e af;
    private com.tsf.shell.workspace3D.e.a.a ag;
    private b ah;
    private b ai;
    private float aj;
    private float ak;
    private float al;
    private float am;
    private boolean ao;
    private float ap;
    private float aq;
    private TextureElement ar;
    private TextureElement as;
    private com.censivn.C3DEngine.e.b at;
    private com.censivn.C3DEngine.b.v au;
    private com.censivn.C3DEngine.e.b av;
    private ArrayList aw;
    private bw ax;
    public Runnable u;
    private com.censivn.C3DEngine.b.v v;
    private com.censivn.C3DEngine.b.v w;
    private float z;
    private float x = 0.0f;
    private float y = 0.0f;
    private float A = 0.4f;
    private boolean B = true;
    private boolean C = true;
    private boolean D = false;
    private boolean an = false;
    private boolean ay = false;
    private float az = 0.0f;
    private boolean aB = false;
    private boolean aG = false;
    private boolean aH = false;
    private float aI = 0.0f;
    private float aJ = 0.0f;
    private boolean aL = false;
    private boolean aM = false;
    private boolean aO = false;
    private Number3d aP = new Number3d();
    private boolean aQ = false;
    private Number3d aT = new Number3d(0.0f, 0.0f, 0.0f);

    public final TextureElement a() {
        return this.O;
    }

    public final TextureElement c() {
        return this.P;
    }

    public final TextureElement d() {
        return this.R;
    }

    public p() {
        this.aD = false;
        com.tsf.shell.bd.a(this);
        this.aD = com.tsf.shell.a.t.g();
        h = new com.tsf.shell.workspace3D.e.b.g();
        i = new com.tsf.shell.workspace3D.e.b.i();
        j = new com.tsf.shell.workspace3D.e.b.f();
        k = new com.tsf.shell.workspace3D.e.b.h();
        l = new com.tsf.shell.workspace3D.e.b.j();
        m = new com.tsf.shell.workspace3D.e.b.c();
        n = new com.tsf.shell.workspace3D.e.b.k();
        o = new com.tsf.shell.workspace3D.e.b.d();
        e = 200.0f * com.censivn.C3DEngine.a.b;
        f = 360.0f * com.censivn.C3DEngine.a.b;
        g = 150.0f * com.censivn.C3DEngine.a.b;
        c = 138.0f * com.censivn.C3DEngine.a.b;
        J();
        this.aw = new ArrayList();
    }

    private void J() {
        ThemeDockDescription theme = ThemeManager.mix.dock.getTheme();
        this.aj = theme.dockItemStartMargin;
        this.ak = theme.dockItemEndMargin;
        this.al = theme.dockOnFocusItemStartMargin;
        this.am = theme.dockOnFocusItemEndMargin;
        q = theme.dockBottomMargin;
        r = theme.dockTopMargin;
        s = theme.dockLeftMargin;
        t = theme.dockRightMargin;
    }

    private void K() {
        ThemeDockDescription theme = ThemeManager.mix.dock.getTheme();
        Bitmap bitmap = theme.getBitmap(ThemeDockDescription.DOCK_BAR);
        this.J = com.censivn.C3DEngine.a.f().a(this.J, bitmap);
        bitmap.recycle();
        Bitmap bitmap2 = theme.getBitmap(600);
        this.U = com.censivn.C3DEngine.a.f().a(this.U, bitmap2);
        bitmap2.recycle();
        Bitmap bitmap3 = theme.getBitmap(ThemeDockDescription.DOCK_DESKTOP_SELECTOR_BUTTON_OFF);
        this.K = com.censivn.C3DEngine.a.f().a(this.K, bitmap3);
        bitmap3.recycle();
        Bitmap bitmap4 = theme.getBitmap(ThemeDockDescription.DOCK_MENU_BUTTON_OFF);
        this.L = com.censivn.C3DEngine.a.f().a(this.L, bitmap4);
        bitmap4.recycle();
        Bitmap bitmap5 = theme.getBitmap(ThemeDockDescription.DOCK_MENU_BUTTON_ON);
        this.M = com.censivn.C3DEngine.a.f().a(this.M, bitmap5);
        bitmap5.recycle();
        Bitmap bitmap6 = theme.getBitmap(ThemeDockDescription.DOCK_DESKTOP_SELECTOR_BUTTON_ON);
        this.N = com.censivn.C3DEngine.a.f().a(this.N, bitmap6);
        bitmap6.recycle();
        Bitmap bitmap7 = theme.getBitmap(ThemeDockDescription.DOCK_TRASHCAN_CLOSE_BUTTON);
        this.O = com.censivn.C3DEngine.a.f().a(this.O, bitmap7);
        bitmap7.recycle();
        Bitmap bitmap8 = theme.getBitmap(ThemeDockDescription.DOCK_TRASHCAN_OPEN_BUTTON);
        this.P = com.censivn.C3DEngine.a.f().a(this.P, bitmap8);
        bitmap8.recycle();
        Bitmap bitmap9 = theme.getBitmap(ThemeDockDescription.DOCK_DESKTOP_SELECTOR_BUTTON_POINT);
        this.Q = com.censivn.C3DEngine.a.f().a(this.Q, bitmap9);
        bitmap9.recycle();
        Bitmap bitmap10 = theme.getBitmap(ThemeDockDescription.DOCK_TRASHCAN_BUTTON_POINT);
        this.R = com.censivn.C3DEngine.a.f().a(this.R, bitmap10);
        bitmap10.recycle();
    }

    public final void e() {
        J();
        K();
        ThemeDockDescription theme = ThemeManager.mix.dock.getTheme();
        this.Z.a_(this.N.width * com.censivn.C3DEngine.a.b);
        this.Z.h(this.N.height * com.censivn.C3DEngine.a.b);
        this.Z.a(3.0f, 2.0f, 2.0f);
        this.Y.a_(this.K.width * com.censivn.C3DEngine.a.b);
        this.Y.h(this.K.height * com.censivn.C3DEngine.a.b);
        this.ac.a(theme.dockDesktopSelectorButtonPointOffsetX * com.censivn.C3DEngine.a.b, theme.dockDesktopSelectorButtonPointOffsetY * com.censivn.C3DEngine.a.b);
        this.Y.a(3.0f, 2.0f, 2.0f);
        this.ab.a_(this.O.width * com.censivn.C3DEngine.a.b);
        this.ab.h(this.O.height * com.censivn.C3DEngine.a.b);
        this.ad.a(theme.dockTrashcanButtonPointOffsetX * com.censivn.C3DEngine.a.b, theme.dockTrashcanButtonPointOffsetY * com.censivn.C3DEngine.a.b);
        this.ab.a(3.0f, 2.0f, 1.0f);
        this.aa.a_(this.L.width * com.censivn.C3DEngine.a.b);
        this.aa.h(this.L.height * com.censivn.C3DEngine.a.b);
        this.aa.a(3.0f, 2.0f, 1.0f);
        this.ag.a();
        this.V.h(this.U.height * com.censivn.C3DEngine.a.b);
        d = this.J.height * com.censivn.C3DEngine.a.b;
        this.W.a(this.J.width, this.J.height, new ch(this.J.width / 2, this.J.height / 2, this.J.height));
    }

    public final void f() {
        q qVar = null;
        if (this.ao) {
            this.aD = false;
            com.tsf.shell.workspace3D.bf.a(false);
            com.tsf.shell.aq.b();
            com.tsf.shell.a.t.U();
            qVar = new q(this);
        }
        float a2 = p.a(this.x, this.y);
        if (this.X > a2) {
            this.af.h(a2);
        } else {
            this.af.h(this.X);
        }
        if (!this.aD) {
            a(qVar);
        } else {
            this.af.aI();
        }
    }

    public final void g() {
        com.censivn.C3DEngine.b.v bn = com.tsf.shell.workspace3D.bf.j().p().bn();
        com.censivn.C3DEngine.g.u uVar = new com.censivn.C3DEngine.g.u();
        uVar.a(70);
        com.censivn.C3DEngine.g.s.a(bn, ThemeShellDescription.PAGE_PREVIEW_SELECT, uVar);
        Bitmap a2 = com.censivn.C3DEngine.h.a.a(com.censivn.C3DEngine.a.c(), R.drawable.tips_finger);
        this.ar = com.censivn.C3DEngine.a.f().a(a2, false);
        a2.recycle();
        Bitmap a3 = com.censivn.C3DEngine.h.a.a(com.censivn.C3DEngine.a.c(), R.drawable.tips_finger_point);
        this.as = com.censivn.C3DEngine.a.f().a(a3, false);
        a3.recycle();
        this.at = new com.censivn.C3DEngine.e.b(this.ar.width * com.censivn.C3DEngine.a.b, this.ar.height * com.censivn.C3DEngine.a.b, (byte) 0);
        this.at.z().c(this.ar);
        this.av = new com.censivn.C3DEngine.e.b(this.as.width * com.censivn.C3DEngine.a.b, this.as.height * com.censivn.C3DEngine.a.b, (byte) 0);
        this.av.z().c(this.as);
        this.av.N().setAll(0.0f, 0.0f, 1.0f);
        this.av.a((Boolean) false);
        this.au = new com.censivn.C3DEngine.b.v();
        this.au.d(this.at);
        this.at.L().y = (-40.0f) * com.censivn.C3DEngine.a.b;
        this.at.L().x = 9.0f * com.censivn.C3DEngine.a.b;
        com.censivn.C3DEngine.a.a().b(new ae(this), 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L() {
        com.tsf.shell.workspace3D.bf.m();
        this.av.Q();
        com.tsf.shell.workspace3D.bf.m().a(this.av);
        this.au.ax();
        this.av.N().setAll(0.0f, 0.0f, 1.0f);
        this.av.a((Boolean) true);
        this.av.b(255.0f);
        this.av.L().setAllFrom(this.au.L());
        ap apVar = new ap(this);
        com.censivn.C3DEngine.g.s.a(this.av);
        apVar.j(3.0f);
        apVar.k(3.0f);
        apVar.a(0);
        com.censivn.C3DEngine.g.s.a(this.av);
        com.censivn.C3DEngine.g.s.a(this.av, 600, apVar);
    }

    static /* synthetic */ void b(p pVar) {
        float f2 = com.censivn.C3DEngine.a.f - a;
        float f3 = com.censivn.C3DEngine.a.h + (100.0f * com.censivn.C3DEngine.a.b);
        pVar.au.L().x = pVar.x;
        pVar.au.L().y = pVar.y;
        pVar.au.M().z = 160.0f;
        pVar.at.b(0.0f);
        pVar.L();
        pVar.k();
        com.tsf.shell.workspace3D.bf.m().a(pVar.au);
        ba baVar = new ba(pVar, f2, f3);
        baVar.a(255);
        com.censivn.C3DEngine.g.s.a(pVar.at, ThemeShellDescription.PAGE_PREVIEW_SELECT, baVar);
    }

    static /* synthetic */ void i(p pVar) {
        float a2 = p.a(pVar.x, pVar.y) * 0.9f;
        com.censivn.C3DEngine.g.s.a(new com.censivn.C3DEngine.g.b.b(), ThemeShellDescription.PAGE_PREVIEW_SELECT, new bf(pVar, pVar.W.k(), a2));
    }

    static /* synthetic */ void n(p pVar) {
        pVar.s();
        com.censivn.C3DEngine.g.s.a(new com.censivn.C3DEngine.g.b.b(), ThemeShellDescription.PICKER_MENU, new bl(pVar, pVar.x, pVar.y));
    }

    static /* synthetic */ void o(p pVar) {
        pVar.au.L().x = 0.0f;
        pVar.au.L().y = 0.0f;
        pVar.au.M().z = 80.0f;
        bo boVar = new bo(pVar);
        boVar.f(pVar.x);
        boVar.h(pVar.y);
        boVar.a(255);
        com.censivn.C3DEngine.g.s.a(pVar.au, ThemeShellDescription.PICKER_MENU, boVar);
    }

    static /* synthetic */ void p(p pVar) {
        com.tsf.shell.workspace3D.bf.j().r();
        float[] a2 = com.censivn.C3DEngine.h.a.a(pVar.x, pVar.y);
        float f2 = a2[0];
        float f3 = a2[1];
        com.censivn.C3DEngine.g.s.a(new com.censivn.C3DEngine.g.b.b(), ThemeShellDescription.UNREAD_COUNT_BG, new br(pVar, com.censivn.C3DEngine.a.f - (com.censivn.C3DEngine.a.b * 50.0f), com.censivn.C3DEngine.a.g - (com.censivn.C3DEngine.a.b * 50.0f), f2, com.censivn.C3DEngine.a.l, f3));
    }

    static /* synthetic */ void q(p pVar) {
        bu buVar = new bu(pVar);
        buVar.e(145.0f);
        com.censivn.C3DEngine.g.s.a(pVar.au, ThemeShellDescription.PAGE_PREVIEW_SELECT, buVar);
    }

    static /* synthetic */ void r(p pVar) {
        float[] a2 = com.censivn.C3DEngine.h.a.a(pVar.x, pVar.y);
        pVar.af.a(a2[0], a2[1]);
        com.censivn.C3DEngine.g.s.a(new com.censivn.C3DEngine.g.b.b(), 3000, new r(pVar, a2, pVar.af.aK()));
    }

    static /* synthetic */ void s(p pVar) {
        u uVar = new u(pVar);
        uVar.a(0);
        com.censivn.C3DEngine.g.s.a(pVar.au, ThemeShellDescription.PAGE_PREVIEW_SELECT, uVar);
    }

    public final e h() {
        return this.af;
    }

    public final com.censivn.C3DEngine.b.v i() {
        return this.w;
    }

    public final void a(com.tsf.shell.workspace3D.k.j jVar) {
        if (!this.aw.contains(jVar)) {
            this.aw.add(jVar);
        }
    }

    public final void a(String str) {
        com.censivn.C3DEngine.a.a().c(new v(this, str));
    }

    static /* synthetic */ com.tsf.shell.workspace3D.k.j a(p pVar, String str) {
        Iterator it = pVar.aw.iterator();
        while (it.hasNext()) {
            com.tsf.shell.workspace3D.k.j jVar = (com.tsf.shell.workspace3D.k.j) it.next();
            if (Integer.toString(jVar.be().appWidgetId).equals(str)) {
                return jVar;
            }
        }
        return null;
    }

    public final com.tsf.shell.workspace3D.e.a.a j() {
        return this.ag;
    }

    public final void a(com.censivn.C3DEngine.b.v vVar) {
        float f2;
        float f3;
        float f4;
        float f5;
        this.aE = new com.censivn.C3DEngine.g.u();
        this.aE.j(1.0f);
        this.aE.k(1.0f);
        this.aF = new w(this);
        this.aF.j(0.0f);
        this.aF.k(0.0f);
        this.v = vVar;
        a = (int) (38.0f * com.censivn.C3DEngine.a.b);
        b = (int) (100.0f * com.censivn.C3DEngine.a.b);
        this.af = new e(this);
        p = o;
        this.af.o();
        M();
        this.F = new com.censivn.C3DEngine.b.v();
        this.E = new com.censivn.C3DEngine.b.v();
        this.aC = new com.censivn.C3DEngine.g.b.b();
        this.w = new x(this);
        this.v.d(this.w);
        PositionNumber3d L = this.w.L();
        float f6 = com.censivn.C3DEngine.a.e + a;
        this.x = f6;
        L.x = f6;
        PositionNumber3d L2 = this.w.L();
        float f7 = com.censivn.C3DEngine.a.h + a;
        this.y = f7;
        L2.y = f7;
        K();
        this.G = new com.censivn.C3DEngine.b.v();
        this.H = new by();
        this.H.h(0.0f);
        this.G.d(this.H);
        this.I = new by();
        this.I.h(0.0f);
        this.G.d(this.I);
        this.ax = new bw(this);
        this.Z = new y(this, this.N.width * com.censivn.C3DEngine.a.b, this.N.height * com.censivn.C3DEngine.a.b);
        this.ah = new b(this.Z);
        this.Z.z().c(this.N);
        this.Z.a(3.0f, 2.0f, 2.0f);
        com.tsf.shell.workspace3D.bf.o().a(this.Z);
        this.Y = new com.censivn.C3DEngine.e.b(this.K.width * com.censivn.C3DEngine.a.b, this.K.height * com.censivn.C3DEngine.a.b, (byte) 0);
        this.Y.z().c(this.K);
        this.Y.b(com.tsf.shell.a.t.o());
        com.censivn.C3DEngine.e.b bVar = new com.censivn.C3DEngine.e.b(this.Q.width * com.censivn.C3DEngine.a.b, this.Q.height * com.censivn.C3DEngine.a.b, (byte) 0);
        bVar.z().c(this.Q);
        ThemeDockDescription theme = ThemeManager.mix.dock.getTheme();
        this.ac = new cf(bVar, theme.dockDesktopSelectorButtonPointOffsetX * com.censivn.C3DEngine.a.b, theme.dockDesktopSelectorButtonPointOffsetY * com.censivn.C3DEngine.a.b);
        this.ae = new a(this.Y, this);
        this.Y.a(3.0f, 2.0f, 2.0f);
        this.Y.a((com.censivn.C3DEngine.b.l) this.ae);
        this.ab = new z(this, this.O.width * com.censivn.C3DEngine.a.b, this.O.height * com.censivn.C3DEngine.a.b);
        this.ai = new b(this.ab);
        this.ab.a(3.0f, 2.0f, 1.0f);
        com.tsf.shell.workspace3D.bf.o().a(this.ab);
        this.ab.z().c(this.O);
        com.censivn.C3DEngine.e.b bVar2 = new com.censivn.C3DEngine.e.b(this.R.width * com.censivn.C3DEngine.a.b, this.R.height * com.censivn.C3DEngine.a.b, (byte) 0);
        bVar2.z().c(this.R);
        this.ad = new cf(bVar2, theme.dockTrashcanButtonPointOffsetX * com.censivn.C3DEngine.a.b, theme.dockTrashcanButtonPointOffsetY * com.censivn.C3DEngine.a.b);
        this.aa = new com.censivn.C3DEngine.e.b(this.L.width * com.censivn.C3DEngine.a.b, this.L.height * com.censivn.C3DEngine.a.b, (byte) 0);
        this.aa.a(3.0f, 2.0f, 1.0f);
        this.aa.N().setAll(0.0f, 0.0f, 1.0f);
        this.aa.b(com.tsf.shell.a.t.o());
        this.ag = new com.tsf.shell.workspace3D.e.a.a(this.F, this.aa, this.L, this.M);
        this.aa.a((com.censivn.C3DEngine.b.l) new ab(this, this.aa));
        this.V = new com.censivn.C3DEngine.e.b(0.0f, this.U.height * com.censivn.C3DEngine.a.b);
        this.V.z().c(this.U);
        this.V.b(0.0f);
        this.S = new com.censivn.C3DEngine.g.u();
        this.S.a(255);
        this.T = new ac(this);
        this.T.a(0);
        d = this.J.height * com.censivn.C3DEngine.a.b;
        this.W = new ad(this, this.J.width, this.J.height, new ch(this.J.width / 2, this.J.height / 2, this.J.height));
        this.W.z().c(this.J);
        this.W.b(com.tsf.shell.a.t.n());
        this.W.as();
        this.W.a((com.censivn.C3DEngine.b.l) new af(this, this.W));
        this.E.d(this.Y);
        this.F.d(this.aa);
        this.w.d(this.W);
        this.w.d(this.E);
        this.W.d(this.F);
        this.w.d(this.af);
        a(0.0f, true);
        float j2 = com.censivn.C3DEngine.a.q ? com.tsf.shell.a.t.j() : com.tsf.shell.a.t.k();
        this.ao = false;
        if (com.tsf.shell.a.t.j() == 0.0f && com.tsf.shell.a.t.k() == 0.0f) {
            this.ao = true;
            com.tsf.shell.a.t.j(-1);
        }
        if (j2 == 0.0f) {
            if (com.censivn.C3DEngine.a.j < 720.0f * com.censivn.C3DEngine.a.b) {
                f5 = com.censivn.C3DEngine.a.j;
            } else {
                f5 = 720.0f * com.censivn.C3DEngine.a.b;
            }
            f3 = f5 * 0.83f;
            f2 = 0.0f - (f3 / 2.0f);
            f4 = com.censivn.C3DEngine.a.h;
        } else {
            Number3d l2 = com.censivn.C3DEngine.a.q ? com.tsf.shell.a.t.l() : com.tsf.shell.a.t.m();
            float f8 = l2.x;
            float f9 = l2.y;
            f2 = f8;
            f3 = j2;
            f4 = f9;
        }
        if (f3 < c) {
            f3 = c;
        }
        this.z = f3;
        this.X = f3;
        c(f2, f4);
        if (this.ao) {
            if (com.censivn.C3DEngine.a.q) {
                com.tsf.shell.a.t.a(this.X);
                com.tsf.shell.a.t.a(this.x, this.y);
            } else {
                com.tsf.shell.a.t.b(this.X);
                com.tsf.shell.a.t.b(this.x, this.y);
            }
        }
    }

    public final int a(float f2) {
        return p.c(f2, this.I.M().z);
    }

    public final void k() {
        com.tsf.shell.workspace3D.e.b.b a2 = p.a(this.w, this.I.a);
        if (a2 != null) {
            this.I.a(Boolean.valueOf(!this.aB));
            this.I.M().z = a2.d;
            this.H.M().z = a2.e;
            this.I.g(a2.a);
            this.H.g(a2.b);
            this.G.Q();
            this.G.L().setAllFrom(this.w.L());
            com.tsf.shell.workspace3D.bf.m().a(this.G);
        }
    }

    public final void l() {
        com.censivn.C3DEngine.a.a().c(new ag(this));
    }

    public final void m() {
        if (this.u == null) {
            this.u = new ah(this);
        }
        this.I.a(0.0f, this.u);
        this.H.g(0.0f);
    }

    public final void n() {
        if (!this.ay) {
            this.ay = true;
            com.censivn.C3DEngine.a.a().c(new ai(this));
        }
    }

    public final void o() {
        if (this.ay) {
            this.ay = false;
            com.censivn.C3DEngine.a.a().c(new aj(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(float f2, boolean z) {
        this.W.i(f2);
        if (z) {
            this.F.L().x = f2;
        }
    }

    private void a(com.tsf.shell.workspace3D.e.b.a aVar) {
        if (aVar != p) {
            p = aVar;
            com.censivn.C3DEngine.a.a().c(new ak(this));
            this.af.o();
        }
    }

    public final void p() {
        com.tsf.shell.a.t.c((int) this.W.I());
    }

    public final void q() {
        com.tsf.shell.a.t.d((int) this.Y.I());
    }

    public final void a(int i2) {
        if (this.Y.I() != i2) {
            this.Y.b(i2);
            this.aa.b(i2);
            com.censivn.C3DEngine.e.b bVar = this.Y;
            com.censivn.C3DEngine.e.b.u();
        }
    }

    public final void c(int i2) {
        if (this.W.I() != i2) {
            this.W.b(i2);
            cg cgVar = this.W;
            cg.u();
        }
    }

    private void M() {
        this.af.d(this.aj, this.ak);
    }

    public final com.censivn.C3DEngine.e.b a(com.censivn.C3DEngine.b.r rVar) {
        return this.af.h(rVar);
    }

    public final void a(com.censivn.C3DEngine.e.b bVar, com.censivn.C3DEngine.b.r rVar) {
        this.af.a(bVar, rVar);
    }

    public final void a(TextureElement textureElement) {
        if (this.aD) {
            this.aA = this.Y;
        } else {
            this.aA = this.aa;
        }
        al alVar = new al(this, textureElement);
        alVar.j(0.0f);
        alVar.k(0.0f);
        com.censivn.C3DEngine.g.s.a(this.aA);
        com.censivn.C3DEngine.g.s.a(this.aA, 150, alVar);
    }

    public final void r() {
        am amVar = new am(this);
        amVar.j(0.0f);
        amVar.k(0.0f);
        com.censivn.C3DEngine.g.s.a(this.aA);
        com.censivn.C3DEngine.g.s.a(this.aA, 150, amVar);
    }

    public final void s() {
        com.tsf.shell.g.h.a();
        this.D = true;
        this.B = false;
        this.w.a_(true);
        com.censivn.C3DEngine.b.v vVar = this.w;
        com.censivn.C3DEngine.b.v.u();
        R();
    }

    public final void a(float f2, float f3) {
        this.x = f2;
        this.y = f3;
        if (this.x > com.censivn.C3DEngine.a.f - a) {
            this.x = com.censivn.C3DEngine.a.f - a;
        } else if (this.x < com.censivn.C3DEngine.a.e + a) {
            this.x = com.censivn.C3DEngine.a.e + a;
        }
        if (this.y > com.censivn.C3DEngine.a.g - a) {
            this.y = com.censivn.C3DEngine.a.g - a;
        } else if (this.y < com.censivn.C3DEngine.a.h + a) {
            this.y = com.censivn.C3DEngine.a.h + a;
        }
        float abs = Math.abs(this.x - com.censivn.C3DEngine.a.e);
        float abs2 = Math.abs(com.censivn.C3DEngine.a.f - this.x);
        float abs3 = Math.abs(com.censivn.C3DEngine.a.g - this.y);
        float abs4 = Math.abs(this.y - com.censivn.C3DEngine.a.h);
        if (abs <= g || abs2 <= g || abs3 <= g || abs4 <= g) {
            if (abs <= abs2 && abs <= abs3 && abs <= abs4) {
                this.x = com.censivn.C3DEngine.a.e + a;
                return;
            }
            if (abs2 <= abs && abs2 <= abs3 && abs2 <= abs4) {
                this.x = com.censivn.C3DEngine.a.f - a;
            } else if (abs3 <= abs && abs3 <= abs2 && abs3 <= abs4) {
                this.y = com.censivn.C3DEngine.a.g - a;
            } else {
                this.y = com.censivn.C3DEngine.a.h + a;
            }
        }
    }

    public final void t() {
        this.D = false;
        N();
        if (com.censivn.C3DEngine.a.q) {
            com.tsf.shell.a.t.a(this.x, this.y);
        } else {
            com.tsf.shell.a.t.b(this.x, this.y);
        }
        if (!this.aD) {
            a((Runnable) null);
            return;
        }
        float f2 = this.X;
        float a2 = p.a(this.x, this.y);
        if (f2 <= a2) {
            a2 = f2;
        }
        this.af.k(a2);
    }

    private void c(float f2, float f3) {
        this.x = f2;
        this.y = f3;
        N();
        this.w.L().setAll(this.x, this.y, 0.0f);
    }

    private void N() {
        float abs = Math.abs(this.x - com.censivn.C3DEngine.a.e);
        float abs2 = Math.abs(com.censivn.C3DEngine.a.f - this.x);
        float abs3 = Math.abs(com.censivn.C3DEngine.a.g - this.y);
        float abs4 = Math.abs(this.y - com.censivn.C3DEngine.a.h);
        if (abs < abs2 && abs < abs3 && abs < abs4) {
            this.x = com.censivn.C3DEngine.a.e + a;
            O();
            return;
        }
        if (abs2 < abs && abs2 < abs3 && abs2 < abs4) {
            this.x = com.censivn.C3DEngine.a.f - a;
            O();
        } else if (abs3 < abs && abs3 < abs2 && abs3 < abs4) {
            this.y = com.censivn.C3DEngine.a.g - a;
            P();
        } else {
            this.y = com.censivn.C3DEngine.a.h + a;
            P();
        }
    }

    private void O() {
        if (this.y > com.censivn.C3DEngine.a.g - a) {
            this.y = com.censivn.C3DEngine.a.g - a;
        } else if (this.y < com.censivn.C3DEngine.a.h + a) {
            this.y = com.censivn.C3DEngine.a.h + a;
        }
        boolean z = this.W.k() != 0.0f;
        if (this.y > 0.0f) {
            if (z) {
                com.censivn.C3DEngine.g.u uVar = new com.censivn.C3DEngine.g.u();
                uVar.e(-90.0f);
                com.censivn.C3DEngine.g.s.a(this.W);
                com.censivn.C3DEngine.g.s.a(this.W, 300, uVar);
            } else {
                this.W.M().z = -90.0f;
            }
            this.F.M().z = 90.0f;
            if (this.x < 0.0f) {
                this.an = false;
                a(j);
                return;
            } else {
                this.an = false;
                a(k);
                return;
            }
        }
        if (z) {
            com.censivn.C3DEngine.g.u uVar2 = new com.censivn.C3DEngine.g.u();
            uVar2.e(90.0f);
            com.censivn.C3DEngine.g.s.a(this.W);
            com.censivn.C3DEngine.g.s.a(this.W, 300, uVar2);
        } else {
            this.W.M().z = 90.0f;
        }
        this.F.M().z = -90.0f;
        if (this.x < 0.0f) {
            this.an = false;
            a(h);
        } else {
            this.an = false;
            a(i);
        }
    }

    private void P() {
        if (this.x > com.censivn.C3DEngine.a.f - a) {
            this.x = com.censivn.C3DEngine.a.f - a;
        } else if (this.x < com.censivn.C3DEngine.a.e + a) {
            this.x = com.censivn.C3DEngine.a.e + a;
        }
        boolean z = this.W.k() != 0.0f;
        if (this.x > 0.0f) {
            if (z) {
                com.censivn.C3DEngine.g.u uVar = new com.censivn.C3DEngine.g.u();
                uVar.e(180.0f);
                com.censivn.C3DEngine.g.s.a(this.W);
                com.censivn.C3DEngine.g.s.a(this.W, 300, uVar);
            } else {
                this.W.M().z = 180.0f;
            }
            this.F.M().z = -180.0f;
            if (this.y < 0.0f) {
                this.an = true;
                a(m);
                return;
            } else {
                this.an = true;
                a(l);
                return;
            }
        }
        if (z) {
            com.censivn.C3DEngine.g.u uVar2 = new com.censivn.C3DEngine.g.u();
            uVar2.e(0.0f);
            com.censivn.C3DEngine.g.s.a(this.W);
            com.censivn.C3DEngine.g.s.a(this.W, 300, uVar2);
        } else {
            this.W.M().z = 0.0f;
        }
        this.F.M().z = 0.0f;
        if (this.y < 0.0f) {
            this.an = true;
            a(o);
        } else {
            this.an = true;
            a(n);
        }
    }

    public final boolean u() {
        return this.aB;
    }

    public final boolean v() {
        return this.aD;
    }

    public final void w() {
        com.tsf.shell.g.h.a();
        this.aD = true;
        R();
        Q();
        com.censivn.C3DEngine.a.a().c(new an(this));
    }

    private void Q() {
        com.censivn.C3DEngine.a.a().d(new ao(this));
    }

    public final void x() {
        com.tsf.shell.g.h.a();
        this.aD = false;
        a((Runnable) null);
        Q();
        com.censivn.C3DEngine.a.a().c(new aq(this));
    }

    private void R() {
        if (this.aB) {
            this.af.h(false);
            this.af.p();
            this.aB = false;
            ar arVar = new ar(this, this.W.k(), this.aH ? false : true);
            com.censivn.C3DEngine.g.s.a(this.aC);
            com.censivn.C3DEngine.g.s.a(this.aC, 250, arVar);
            com.censivn.C3DEngine.g.s.a(this.aa);
            com.censivn.C3DEngine.g.s.a(this.aa, 300, this.aF);
        }
    }

    private void a(Runnable runnable) {
        if (!this.aB) {
            this.af.h(true);
            this.aB = true;
            float f2 = this.X;
            float a2 = p.a(this.x, this.y);
            if (f2 <= a2) {
                a2 = f2;
            }
            this.af.k(a2);
            this.af.q();
            float k2 = this.W.k();
            boolean z = !this.aD;
            this.F.L().x = a2;
            as asVar = new as(this, k2, a2, z, runnable);
            com.censivn.C3DEngine.g.s.a(this.aC);
            com.censivn.C3DEngine.g.s.a(this.aC, ThemeShellDescription.PAGE_PREVIEW_SELECT, asVar);
            com.censivn.C3DEngine.g.u uVar = new com.censivn.C3DEngine.g.u();
            uVar.j(1.0f);
            uVar.k(1.0f);
            com.censivn.C3DEngine.g.s.a(this.F);
            com.censivn.C3DEngine.g.s.a(this.F, 320, uVar);
            this.aa.a((Boolean) true);
            com.censivn.C3DEngine.g.s.a(this.aa);
            com.censivn.C3DEngine.g.s.a(this.aa, 300, this.aE);
        }
    }

    private static Number3d a(float f2, float f3, float f4, float f5) {
        float f6 = 50.0f * com.censivn.C3DEngine.a.b;
        while (true) {
            float sin = ((float) (Math.sin(f5 * 0.017453292519943295d) * f4)) + f2;
            float cos = ((float) (Math.cos(f5 * 0.017453292519943295d) * f4)) + f3;
            if (sin + f6 >= com.censivn.C3DEngine.a.f || sin - f6 <= com.censivn.C3DEngine.a.e || cos + f6 >= com.censivn.C3DEngine.a.g || cos - f6 <= com.censivn.C3DEngine.a.h) {
                f5 += 20.0f;
            } else {
                Number3d.TEMPNUMBER3D2.x = sin;
                Number3d.TEMPNUMBER3D2.y = cos;
                Number3d.TEMPNUMBER3D2.z = f5;
                return Number3d.TEMPNUMBER3D2;
            }
        }
    }

    public final void a(com.tsf.shell.workspace3D.k.j jVar, float f2, float f3) {
        float f4;
        float f5;
        float f6;
        float f7;
        float f8 = 130.0f * com.censivn.C3DEngine.a.b;
        Number3d.TEMPNUMBER3D.reset();
        this.E.c(Number3d.TEMPNUMBER3D);
        int i2 = -30;
        if (com.censivn.C3DEngine.h.a.b(f2, f3, Number3d.TEMPNUMBER3D.x, Number3d.TEMPNUMBER3D.y) > f8) {
            this.aG = true;
            this.E.L().x = Number3d.TEMPNUMBER3D.x;
            this.E.L().y = Number3d.TEMPNUMBER3D.y;
            this.E.Q();
            com.tsf.shell.workspace3D.bf.m().a(this.E);
            float f9 = Number3d.TEMPNUMBER3D.x;
            float f10 = Number3d.TEMPNUMBER3D.y;
            Number3d a2 = a(f2, f3, f8, -30.0f);
            f4 = a2.x;
            f5 = a2.y;
            i2 = (int) a2.z;
        } else {
            f4 = Number3d.TEMPNUMBER3D.x;
            f5 = Number3d.TEMPNUMBER3D.y;
        }
        int i3 = i2 + 60;
        Number3d.TEMPNUMBER3D.reset();
        this.F.c(Number3d.TEMPNUMBER3D);
        if (com.censivn.C3DEngine.h.a.b(f2, f3, Number3d.TEMPNUMBER3D.x, Number3d.TEMPNUMBER3D.y) > f8) {
            this.aH = true;
            this.F.L().x = Number3d.TEMPNUMBER3D.x;
            this.F.L().y = Number3d.TEMPNUMBER3D.y;
            this.F.M().z = 0.0f;
            this.F.Q();
            com.tsf.shell.workspace3D.bf.m().a(this.F);
            float f11 = Number3d.TEMPNUMBER3D.x;
            float f12 = Number3d.TEMPNUMBER3D.y;
            Number3d a3 = a(f2, f3, f8, i3);
            f6 = a3.x;
            f7 = a3.y;
        } else {
            f6 = Number3d.TEMPNUMBER3D.x;
            f7 = Number3d.TEMPNUMBER3D.y;
        }
        if (this.aG) {
            at atVar = new at(this, jVar);
            atVar.f(f4);
            atVar.h(f5);
            com.censivn.C3DEngine.g.s.a(this.E);
            com.censivn.C3DEngine.g.s.a(this.E, 320, atVar);
        }
        if (this.aH) {
            au auVar = new au(this, jVar);
            auVar.f(f6);
            auVar.h(f7);
            auVar.j(1.0f);
            auVar.k(1.0f);
            com.censivn.C3DEngine.g.s.a(this.F);
            com.censivn.C3DEngine.g.s.a(this.F, 320, auVar);
        }
        this.aJ = f8;
        this.aI = f8;
    }

    public final void b(float f2, float f3) {
        if (this.aG) {
            float b2 = com.censivn.C3DEngine.h.a.b(f2, f3, this.E.L().x, this.E.L().y);
            if (b2 < this.aI) {
                this.aI = b2;
            }
            if (b2 > this.aI + (com.censivn.C3DEngine.a.b * 20.0f)) {
                S();
            }
        }
        if (this.aH) {
            float b3 = com.censivn.C3DEngine.h.a.b(f2, f3, this.F.L().x, this.F.L().y);
            if (b3 < this.aJ) {
                this.aJ = b3;
            }
            if (b3 > this.aJ + (com.censivn.C3DEngine.a.b * 20.0f)) {
                T();
            }
        }
    }

    private void S() {
        if (this.aG) {
            this.aG = false;
            Number3d.TEMPNUMBER3D.reset();
            this.w.c(Number3d.TEMPNUMBER3D);
            av avVar = new av(this);
            avVar.f(Number3d.TEMPNUMBER3D.x);
            avVar.h(Number3d.TEMPNUMBER3D.y);
            com.censivn.C3DEngine.g.s.a(this.E);
            com.censivn.C3DEngine.g.s.a(this.E, 320, avVar);
        }
    }

    private void T() {
        if (this.aH) {
            this.aH = false;
            float aK = this.af.aK();
            Number3d.TEMPNUMBER3D.reset();
            Number3d.TEMPNUMBER3D.x = aK;
            this.W.c(Number3d.TEMPNUMBER3D);
            aw awVar = new aw(this, aK);
            if (!this.aB) {
                awVar.j(0.0f);
                awVar.k(0.0f);
            } else {
                awVar.f(Number3d.TEMPNUMBER3D.x);
                awVar.h(Number3d.TEMPNUMBER3D.y);
            }
            com.censivn.C3DEngine.g.s.a(this.F);
            com.censivn.C3DEngine.g.s.a(this.F, 320, awVar);
        }
    }

    public final void y() {
        S();
        T();
    }

    public final boolean z() {
        return this.E.au();
    }

    public final void a(com.censivn.C3DEngine.b.r rVar, boolean z) {
        if (!this.aL) {
            this.aK = rVar;
            this.aL = true;
            if (z) {
                this.aM = true;
                this.ac.Q();
                cf cfVar = this.ac;
                cf.j();
                this.E.d(this.ac);
                if (!this.aD && !this.aD) {
                    this.af.d(this.al, this.am);
                }
            }
            a(this.Y, this.Z, this.E);
        }
    }

    public final void b(com.censivn.C3DEngine.b.r rVar) {
        if (rVar == this.aK && this.aL) {
            this.aL = false;
            if (this.aM) {
                this.aM = false;
                this.ac.i();
                this.ac.Q();
                if (!this.aD) {
                    M();
                }
            }
            a((com.censivn.C3DEngine.b.r) this.Z, (com.censivn.C3DEngine.b.r) this.Y);
        }
    }

    public final Number3d A() {
        this.aP.x = 0.0f;
        this.aP.y = 0.0f;
        this.aP.z = 0.0f;
        return this.ab.c(this.aP);
    }

    public final void c(com.censivn.C3DEngine.b.r rVar) {
        this.aN = rVar;
        if (!this.aO) {
            if (this.aD) {
                a((Runnable) null);
            }
            this.aO = true;
            this.ad.Q();
            cf cfVar = this.ad;
            cf.j();
            this.F.d(this.ad);
            a(this.aa, this.ab, this.F);
        }
    }

    public final void d(com.censivn.C3DEngine.b.r rVar) {
        if (this.aN == rVar) {
            this.aN = null;
            this.aO = false;
            this.ad.i();
            this.ad.Q();
            a((com.censivn.C3DEngine.b.r) this.ab, (com.censivn.C3DEngine.b.r) this.aa);
            if (this.aD) {
                R();
            }
        }
    }

    public final float B() {
        return this.x - this.w.L().x;
    }

    public final float C() {
        return this.y - this.w.L().y;
    }

    public final void D() {
        if (!this.aQ) {
            this.aQ = true;
            this.w.e(false);
            Number3d a2 = p.a(this.w);
            if (this.aS == null) {
                this.aS = new ax(this);
            }
            this.aS.f(a2.x);
            this.aS.h(a2.y);
            com.censivn.C3DEngine.g.s.a(this.w);
            com.censivn.C3DEngine.g.s.a(this.w, 300, this.aS);
        }
    }

    public final void E() {
        if (this.aQ) {
            this.aQ = false;
            this.w.a((Boolean) true);
            Number3d b2 = p.b(this.w);
            if (this.aR == null) {
                this.aR = new ay(this);
            }
            this.aR.f(b2.x);
            this.aR.h(b2.y);
            com.censivn.C3DEngine.g.s.a(this.w);
            com.censivn.C3DEngine.g.s.a(this.w, 300, this.aR);
        }
    }

    public final void F() {
        this.Z.h(false);
    }

    public final void G() {
        this.Z.h(true);
    }

    public final void H() {
        this.ab.z().d();
        this.ab.z().c(this.P);
    }

    public final void I() {
        this.ab.z().d();
        this.ab.z().c(this.O);
    }

    public final void e(com.censivn.C3DEngine.b.r rVar) {
        this.aT.reset();
        this.aT = this.E.c(this.aT);
        this.ac.M().z = com.censivn.C3DEngine.h.a.d(this.aT.x, this.aT.y, rVar.L().x, rVar.L().y) - 90.0f;
    }

    public final void f(com.censivn.C3DEngine.b.r rVar) {
        this.aT.x = 0.0f;
        this.aT.y = 0.0f;
        this.aT.z = 0.0f;
        this.aT = this.F.c(this.aT);
        this.ad.M().z = com.censivn.C3DEngine.h.a.d(this.aT.x, this.aT.y, rVar.L().x, rVar.L().y) - 90.0f;
    }

    private void a(com.censivn.C3DEngine.b.r rVar, com.censivn.C3DEngine.b.r rVar2, com.censivn.C3DEngine.b.v vVar) {
        az azVar = new az(this, rVar);
        azVar.j(0.0f);
        azVar.k(0.0f);
        com.censivn.C3DEngine.g.s.a(rVar);
        com.censivn.C3DEngine.g.s.a(rVar, 250, azVar);
        com.censivn.C3DEngine.g.u uVar = new com.censivn.C3DEngine.g.u();
        uVar.j(1.0f);
        uVar.k(1.0f);
        uVar.a((com.censivn.C3DEngine.g.r) new com.censivn.C3DEngine.g.k());
        com.censivn.C3DEngine.g.s.a(rVar2);
        com.censivn.C3DEngine.g.s.a(rVar2, ThemeShellDescription.PAGE_PREVIEW_SELECT, uVar);
        rVar2.Q();
        vVar.a(rVar2, 0);
    }

    private void a(com.censivn.C3DEngine.b.r rVar, com.censivn.C3DEngine.b.r rVar2) {
        com.censivn.C3DEngine.g.u uVar = new com.censivn.C3DEngine.g.u();
        uVar.j(1.0f);
        uVar.k(1.0f);
        uVar.a((com.censivn.C3DEngine.g.r) new com.censivn.C3DEngine.g.k());
        com.censivn.C3DEngine.g.s.a(rVar2);
        com.censivn.C3DEngine.g.s.a(rVar2, ThemeShellDescription.PAGE_PREVIEW_SELECT, uVar);
        rVar2.a((Boolean) true);
        be beVar = new be(this, rVar);
        beVar.j(0.0f);
        beVar.k(0.0f);
        com.censivn.C3DEngine.g.s.a(rVar);
        com.censivn.C3DEngine.g.s.a(rVar, 250, beVar);
    }

    @Override // com.tsf.shell.bj
    public final void b_(int i2, int i3, int i4, int i5) {
        float f2;
        float f3;
        this.ag.c();
        Number3d l2 = com.censivn.C3DEngine.a.q ? com.tsf.shell.a.t.l() : com.tsf.shell.a.t.m();
        if (l2.x == 0.0f && l2.y == 0.0f) {
            if (p.c == 3) {
                this.y = com.censivn.C3DEngine.a.h + a;
            } else if (p.c == 2) {
                this.y = com.censivn.C3DEngine.a.g - a;
            } else if (p.c == 0) {
                this.x = com.censivn.C3DEngine.a.e + a;
            } else if (p.c == 1) {
                this.y = com.censivn.C3DEngine.a.f - a;
            }
            f2 = this.x;
            f3 = this.y;
        } else {
            f2 = l2.x;
            f3 = l2.y;
        }
        c(f2, f3);
        float j2 = com.censivn.C3DEngine.a.q ? com.tsf.shell.a.t.j() : com.tsf.shell.a.t.k();
        if (j2 == 0.0f) {
            j2 = this.X;
        }
        if (j2 != 0.0f) {
            if (j2 < c * com.censivn.C3DEngine.a.b) {
                j2 = c * com.censivn.C3DEngine.a.b;
            }
            float a2 = p.a(this.x, this.y);
            if (j2 > a2) {
                j2 = a2;
            }
            this.z = j2;
            this.X = j2;
            if (this.aB) {
                a(this.X, true);
                this.af.j(this.X);
                e eVar = this.af;
                e.u();
            }
        }
    }

    @Override // com.tsf.shell.bj
    public final void b(int i2) {
    }

    @Override // com.tsf.shell.bj
    public final void p_() {
    }
}
