package com.tsf.shell.p096f.p131f.p132a;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.api.element.info.LauncherDrawerFolder3DInfo;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcutAppInfo;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.p030a.C0864d;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p035c.C0915b;
import com.censivn.C3DEngine.p031b.p036d.C0937a;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.censivn.C3DEngine.p031b.p041g.C0986a;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.censivn.C3DEngine.p031b.p041g.InterfaceC1011b;
import com.censivn.C3DEngine.p031b.p041g.p043b.C1013b;
import com.tsf.C1306b;
import com.tsf.shell.C2234d;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.action.C3398f;
import com.tsf.shell.manager.bind.C3444a;
import com.tsf.shell.manager.p166a.C3364c;
import com.tsf.shell.manager.p166a.C3366d;
import com.tsf.shell.manager.p166a.C3377f;
import com.tsf.shell.manager.p168b.C3430e;
import com.tsf.shell.manager.p182n.C3550a;
import com.tsf.shell.manager.p183o.C3566b;
import com.tsf.shell.p096f.p118e.C2627j;
import com.tsf.shell.p096f.p131f.C2932g;
import com.tsf.shell.p096f.p131f.C2948l;
import com.tsf.shell.p096f.p131f.C2951n;
import com.tsf.shell.p096f.p131f.p132a.C2676a;
import com.tsf.shell.p096f.p131f.p132a.p133a.C2695c;
import com.tsf.shell.p096f.p131f.p132a.p136b.AbstractC2745k;
import com.tsf.shell.p096f.p131f.p132a.p136b.C2746l;
import com.tsf.shell.p096f.p131f.p132a.p139d.C2817a;
import com.tsf.shell.p096f.p153i.C3105a;
import com.tsf.shell.p096f.p153i.C3112b;
import com.tsf.shell.p096f.p153i.C3231c;
import com.tsf.shell.p096f.p153i.p154a.C3111d;
import com.tsf.shell.p096f.p153i.p155b.p159d.C3145b;
import com.tsf.shell.p096f.p153i.p155b.p160e.AbstractC3208b;
import com.tsf.shell.p096f.p153i.p155b.p160e.C3222g;
import com.tsf.shell.p096f.p153i.p155b.p160e.C3224h;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.description.ThemeShellDescription;
import com.tsf.shell.utils.C4189x;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.tsf.shell.f.f.a.h */
/* loaded from: classes.dex */
public class C2862h extends C2932g implements C0915b.InterfaceC0918a, C2676a.InterfaceC2679a, C3364c.InterfaceC3365a, C3366d.InterfaceC3371a {

    /* renamed from: A */
    public static int f9288A;

    /* renamed from: B */
    public static int f9289B;

    /* renamed from: C */
    public static int f9290C;

    /* renamed from: E */
    public static ArrayList<Number3d> f9292E;

    /* renamed from: F */
    public static float f9293F;

    /* renamed from: m */
    public static int f9296m;

    /* renamed from: n */
    public static int f9297n;

    /* renamed from: o */
    public static int f9298o;

    /* renamed from: p */
    public static int f9299p;

    /* renamed from: q */
    public static int f9300q;

    /* renamed from: r */
    public static int f9301r;

    /* renamed from: s */
    public static int f9302s;

    /* renamed from: t */
    public static int f9303t;

    /* renamed from: u */
    public static int f9304u;

    /* renamed from: w */
    public static float f9306w;

    /* renamed from: x */
    public static int f9307x;

    /* renamed from: y */
    public static int f9308y;

    /* renamed from: z */
    public static int f9309z;

    /* renamed from: G */
    public C3224h f9310G;

    /* renamed from: H */
    public C0981k f9311H;

    /* renamed from: I */
    protected C3550a.C3558a f9312I;

    /* renamed from: K */
    private C0980j f9313K;

    /* renamed from: L */
    private C0980j f9314L;

    /* renamed from: M */
    private C2676a f9315M;

    /* renamed from: N */
    private C2676a f9316N;

    /* renamed from: O */
    private C2695c f9317O;

    /* renamed from: P */
    private int f9318P;

    /* renamed from: T */
    private C2627j f9322T;

    /* renamed from: U */
    private C2817a f9323U;

    /* renamed from: V */
    private C2814d f9324V;

    /* renamed from: W */
    private ArrayList<C2676a> f9325W;

    /* renamed from: X */
    private C2746l f9326X;

    /* renamed from: Y */
    private C0980j f9327Y;

    /* renamed from: Z */
    private C1017d f9328Z;

    /* renamed from: aa */
    private C1017d f9329aa;

    /* renamed from: ab */
    private C1013b f9330ab;

    /* renamed from: ad */
    private C0937a f9332ad;

    /* renamed from: ae */
    private C0937a f9333ae;

    /* renamed from: af */
    private Runnable f9334af;

    /* renamed from: ag */
    private float f9335ag;

    /* renamed from: ai */
    private C2843f f9337ai;

    /* renamed from: aj */
    private C2849g f9338aj;

    /* renamed from: ak */
    private C2835e f9339ak;

    /* renamed from: al */
    private C2728b f9340al;

    /* renamed from: ao */
    private C3550a.C3558a f9343ao;

    /* renamed from: aq */
    private C0981k f9345aq;

    /* renamed from: ar */
    private TextureElement f9346ar;

    /* renamed from: au */
    private FrameLayout f9349au;

    /* renamed from: l */
    public static int f9295l = 0;

    /* renamed from: v */
    public static float f9305v = 0.9f;

    /* renamed from: D */
    public static int f9291D = 350;

    /* renamed from: J */
    private static String f9294J = "ApplicationPageBlackground";

    /* renamed from: Q */
    private boolean f9319Q = false;

    /* renamed from: R */
    private boolean f9320R = true;

    /* renamed from: S */
    private boolean f9321S = true;

    /* renamed from: ac */
    private float f9331ac = -1.0f;

    /* renamed from: ah */
    private float f9336ah = 0.0f;

    /* renamed from: am */
    private boolean f9341am = false;

    /* renamed from: an */
    private boolean f9342an = false;

    /* renamed from: ap */
    private boolean f9344ap = false;

    /* renamed from: as */
    private ArrayList<Runnable> f9347as = new ArrayList<>();

    /* renamed from: at */
    private Object f9348at = new Object();

    /* renamed from: av */
    private boolean f9350av = false;

    /* renamed from: a */
    public C0975i m4492a(C3112b c3112b) {
        C0975i c0975i;
        if (c3112b instanceof AbstractC3208b) {
            AbstractC3208b abstractC3208b = (AbstractC3208b) c3112b;
            if (this.f9310G == null) {
                this.f9310G = new C3224h();
            }
            this.f9310G.f10495k.textures().clear();
            if (abstractC3208b.m3161aC() && !abstractC3208b.m3492t()) {
                this.f9310G.f10495k.textures().addElement(abstractC3208b.f10495k.textures().get(0).textureElement);
            }
            c0975i = this.f9310G;
        } else {
            TextureElement m3379aD = ((C3145b) c3112b).m3379aD();
            if (this.f9311H == null) {
                this.f9311H = C3145b.m3313l();
            }
            this.f9311H.mo10368a(m3379aD.width);
            this.f9311H.mo5215b(m3379aD.height);
            this.f9311H.textures().addElement(m3379aD);
            c0975i = this.f9311H;
        }
        Number3d.TEMPNUMBER3D.reset();
        c3112b.localToGlobal(Number3d.TEMPNUMBER3D);
        c0975i.position().setAllFrom(Number3d.TEMPNUMBER3D);
        Number3d.TEMPNUMBER3D.f2526x = 1.0f;
        Number3d.TEMPNUMBER3D.f2527y = 1.0f;
        Number3d.TEMPNUMBER3D.f2528z = 1.0f;
        c3112b.localScaleToGlobale(Number3d.TEMPNUMBER3D);
        c0975i.scale().setAllFrom(Number3d.TEMPNUMBER3D);
        return c0975i;
    }

    /* renamed from: e */
    public void m4410e(C0975i c0975i) {
        if (c0975i instanceof AbstractC3208b) {
            ((AbstractC3208b) c0975i).f10495k.textures().clear();
        } else {
            ((C0981k) c0975i).textures().clear();
        }
        c0975i.removeFromParent();
    }

    /* renamed from: aj */
    public boolean m4457aj() {
        if (this.f9342an) {
            return false;
        }
        C3398f.m2642b();
        this.f9338aj.m4513b(true);
        this.f9339ak.m4564a(true);
        this.f9342an = true;
        C3359a.f11089c.m2242c(this);
        C0915b.m10597a(this);
        m4468aP();
        m4466aR();
        this.f9337ai.m4529j();
        m4454am().m4600d();
        return true;
    }

    /* renamed from: c */
    public boolean m4419c(int i) {
        boolean m4457aj = m4457aj();
        this.f9337ai.m4554a(i);
        return m4457aj;
    }

    /* renamed from: ak */
    public void m4456ak() {
        if (this.f9342an && this.f9337ai.m4527l()) {
            C3398f.m2637c();
            this.f9338aj.m4511c(true);
            this.f9339ak.m4561b(true);
            C0915b.m10594b(this);
            this.f9342an = false;
            C3359a.f11089c.m2246b(this);
            m4467aQ();
            m4465aS();
            this.f9337ai.m4528k();
        }
    }

    /* renamed from: a */
    public void m4488a(C3112b c3112b, boolean z, float f, float f2) {
        if (c3112b instanceof C3145b) {
            C3359a.f11102p.m5314a(c3112b, f, f2, z, 3);
        } else {
            C3359a.f11102p.m5314a(c3112b, f, f2, z, 3, 5);
        }
    }

    /* renamed from: aP */
    private void m4468aP() {
        C1017d c1017d = new C1017d();
        c1017d.m10294l(f9305v);
        c1017d.m10293m(f9305v);
        c1017d.mo10298h(f9306w);
        C1014c.m10326a(this.f9313K);
        C1014c.m10325a(this.f9313K, 300, c1017d);
    }

    /* renamed from: aQ */
    private void m4467aQ() {
        C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.f.a.h.1
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo732a() {
                C2862h.this.m4247N();
            }
        };
        c1017d.m10294l(1.0f);
        c1017d.m10293m(1.0f);
        c1017d.mo10298h(0.0f);
        C1014c.m10326a(this.f9313K);
        C1014c.m10325a(this.f9313K, 300, c1017d);
    }

    /* renamed from: aR */
    private void m4466aR() {
        this.f9343ao = C3359a.f11103q.m2043a(this.f9343ao, C4189x.m588c(C1306b.C1315i.text_app_drawer_setting));
    }

    /* renamed from: aS */
    private void m4465aS() {
        C3359a.f11103q.m2037b(this.f9343ao);
    }

    @Override // com.censivn.C3DEngine.p031b.p035c.C0915b.InterfaceC0918a
    /* renamed from: a */
    public void mo727a(int i, KeyEvent keyEvent) {
        if (i == 4) {
            m4456ak();
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p035c.C0915b.InterfaceC0918a
    /* renamed from: b */
    public void mo726b(int i, KeyEvent keyEvent) {
    }

    public C2862h() {
        C3359a.f11109w.m2708c().m2730a(this);
        this.f9340al = C3359a.f11109w.m2707d();
        this.f9323U = C3359a.f11109w.m2712b();
        this.f9324V = new C2814d();
        C3359a.f11109w.m2716a().m2743a(this);
        this.f9317O = new C2695c();
    }

    /* renamed from: al */
    public void m4455al() {
        this.f9317O.m4865f();
    }

    /* renamed from: am */
    public C2814d m4454am() {
        return this.f9324V;
    }

    /* renamed from: an */
    public C2817a m4453an() {
        return this.f9323U;
    }

    /* renamed from: ao */
    public C2728b m4452ao() {
        return this.f9340al;
    }

    /* renamed from: ap */
    public C2676a m4451ap() {
        return this.f9315M;
    }

    /* renamed from: aq */
    public boolean m4450aq() {
        return this.f9344ap;
    }

    /* renamed from: ar */
    public void m4449ar() {
        this.f9344ap = true;
        mo4397j_();
        m4464aT();
        m4480aD();
        m4460aX();
        if (this.f9315M != null) {
            this.f9315M.m4985a();
        }
        m4247N();
        this.f9344ap = false;
    }

    @Override // com.tsf.shell.p096f.p131f.C2932g, com.censivn.C3DEngine.p031b.p035c.C0925e.InterfaceC0934a
    /* renamed from: a */
    public void mo1664a(int i, int i2, int i3, int i4) {
        super.mo1664a(i, i2, i3, i4);
        m4449ar();
    }

    /* renamed from: as */
    public void m4448as() {
        if (this.f9337ai != null) {
            this.f9337ai.m4555a();
        }
    }

    /* renamed from: aT */
    private void m4464aT() {
        f9303t = (int) (C0892a.f2567c * 35.0f);
        f9304u = (int) (C0892a.f2567c * 35.0f);
        f9301r = C3430e.m2555Q() ? (int) (150.0f * C0892a.f2567c) : (int) (C0892a.f2567c * 35.0f);
        f9302s = C3430e.m2554R() ? C0892a.f2571g + (C0892a.f2572h * 1) : C0892a.f2572h * 2;
        f9297n = (int) (C3566b.f11839a.f11762T + (10.0f * C0892a.f2567c));
        f9298o = (int) (C3566b.f11839a.f11763U + (20.0f * C0892a.f2567c));
        float f = (C0892a.f2554E - f9293F) - (C0892a.f2572h * 2.0f);
        if (C3359a.f11088b.m10553c()) {
            f -= C0892a.f2559J;
        }
        f9305v = f / ((C0892a.f2554E - f9301r) - f9302s);
        float f2 = (C0892a.f2554E / 2.0f) - (((C0892a.f2554E / 2.0f) - f9302s) * f9305v);
        if (f2 < f9293F) {
            f9306w = (f9293F - f2) + C0892a.f2572h;
        } else {
            f9306w = C0892a.f2572h;
        }
        int i = ((((C0892a.f2553D - f9303t) - f9304u) - C3566b.f11839a.f11762T) / f9297n) + 1;
        int i2 = ((((C0892a.f2554E - f9301r) - f9302s) - C3566b.f11839a.f11763U) / f9298o) + 1;
        if (i < 2) {
            i = 2;
        }
        if (i2 < 2) {
            i2 = 2;
        }
        f9289B = i;
        f9290C = i2;
        f9307x = 2;
        f9308y = i + 2;
        f9309z = 2;
        f9288A = i2 + 2;
        if (C3430e.m2549W()) {
            m4440b(f9289B, f9290C);
        } else if (C0892a.f2564O) {
            m4440b(C3430e.m2552T(), C3430e.m2553S());
        } else {
            m4440b(C3430e.m2550V(), C3430e.m2551U());
        }
        if (this.f9345aq != null) {
            this.f9345aq.position().f2527y = ((-C2951n.f9589b) / 2) + (80.0f * C0892a.f2567c);
        }
        if (this.f9322T != null) {
            this.f9322T.position().f2526x = 0.0f;
            this.f9322T.position().f2527y = (C0892a.f2552C + f9302s) - C0892a.f2572h;
        }
        if (this.f9327Y != null) {
            this.f9327Y.setAABBPX(C0892a.f2590z, C0892a.f2552C, 0.0f, C0892a.f2550A, C0892a.f2551B, 0.0f);
        }
        if (this.f9338aj != null) {
            this.f9338aj.m4520a(C0892a.f2590z, C0892a.f2552C, C0892a.f2550A, C0892a.f2551B);
        }
        if (this.f9339ak != null) {
            this.f9339ak.m4566a(C0892a.f2590z, C0892a.f2552C, C0892a.f2550A, C0892a.f2551B);
        }
        if (this.f9337ai != null) {
            this.f9337ai.m4553a(C0892a.f2590z, C0892a.f2552C, C0892a.f2550A, C0892a.f2551B);
        }
        if (this.f9342an) {
            C1014c.m10326a(this.f9313K);
            this.f9313K.scale().setAll(f9305v, f9305v, 1.0f);
            this.f9313K.position().f2527y = f9306w;
        }
    }

    /* renamed from: at */
    public void m4447at() {
        if (C3430e.m2554R()) {
            m4415c(true, true);
        } else {
            m4431b(true, true);
        }
    }

    /* renamed from: b */
    public void m4431b(boolean z, boolean z2) {
        this.f9339ak.visible(true);
        if (!this.f9342an) {
            this.f9339ak.m4561b(z);
        }
        if (z2) {
            C3430e.m2438n(true);
            m4449ar();
        }
        this.f9338aj.m4516a(true);
    }

    /* renamed from: c */
    public void m4415c(boolean z, final boolean z2) {
        this.f9339ak.m4563a(z, new Runnable() { // from class: com.tsf.shell.f.f.a.h.7
            @Override // java.lang.Runnable
            public void run() {
                C2862h.this.f9339ak.visible(false);
                if (z2) {
                    C2862h.this.m4449ar();
                }
            }
        });
        if (z2) {
            C3430e.m2438n(false);
        }
        this.f9338aj.m4516a(true);
    }

    /* renamed from: g */
    public void m4403g(boolean z) {
        this.f9338aj.visible(true);
        if (z) {
            C3430e.m2441m(true);
            m4449ar();
        }
    }

    /* renamed from: h */
    public void m4401h(boolean z) {
        this.f9338aj.visible(false);
        if (z) {
            C3430e.m2441m(false);
            m4449ar();
        }
    }

    /* renamed from: au */
    public void m4446au() {
        this.f9320R = false;
        this.f9319Q = true;
        C2234d.m6033a().m6030a("PageApplication");
        invalidate();
        setAnimationObjectState(true);
        if (this.f9315M != null) {
            this.f9315M.m4959m();
        }
        C3359a.f11108v.f7773f.m5627d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: aU */
    public void m4463aU() {
        C2234d.m6033a().m6027b("PageApplication");
        this.f9320R = true;
        m4247N();
        this.f9326X.mo4273f();
        m4427bd();
        setAnimationObjectState(false);
        if (this.f9334af != null) {
            this.f9334af.run();
            this.f9334af = null;
        }
        C3359a.f11108v.f7773f.m5626e();
    }

    /* renamed from: aV */
    private void m4462aV() {
        if (!this.f9320R) {
            this.f9335ag = 0.0f;
            this.f9336ah = 0.0f;
            this.f9315M.m4972b(0.0f);
            this.f9314L.rotation().f2526x = 0.0f;
            m4463aU();
        }
    }

    /* renamed from: av */
    public void m4445av() {
        Bitmap bitmap = ThemeManager.mix.page.getTheme().getBitmap(ThemeShellDescription.PAGE_PREVIEW_DRAWER_MARK, (int) C0892a.m10742a(64.0f), (int) C0892a.m10742a(64.0f));
        this.f9346ar = C0853a.m10853g().m10539a(this.f9346ar, bitmap, true);
        bitmap.recycle();
    }

    /* renamed from: aW */
    private void m4461aW() {
        Bitmap bitmap = ThemeManager.mix.page.getTheme().getBitmap(ThemeShellDescription.PAGE_PREVIEW_DRAWER_MARK, (int) C0892a.m10742a(64.0f), (int) C0892a.m10742a(64.0f));
        this.f9346ar = C0853a.m10853g().m10539a(this.f9346ar, bitmap, true);
        bitmap.recycle();
        this.f9345aq = C0892a.m10741a(64.0f, 64.0f);
        this.f9345aq.textures().addElement(this.f9346ar);
    }

    /* renamed from: aw */
    public void m4444aw() {
        this.f9345aq.removeFromParent();
        addChild(this.f9345aq);
    }

    /* renamed from: ax */
    public void m4443ax() {
        this.f9345aq.removeFromParent();
    }

    @Override // com.tsf.shell.p096f.p131f.C2932g
    /* renamed from: m */
    public C3105a mo4188m() {
        return this.f9542h;
    }

    /* renamed from: aX */
    private void m4460aX() {
        if (this.f9315M != null) {
            this.f9322T.m5119b(this.f9315M.m4967e());
        }
    }

    /* renamed from: aY */
    private void m4459aY() {
        this.f9322T.m5124a(this.f9325W.size());
        m4460aX();
    }

    @Override // com.tsf.shell.p096f.p131f.C2932g
    /* renamed from: x */
    public void mo4177x() {
        super.mo4177x();
        m4425bf();
        m4428bc();
        this.f9338aj = new C2849g(this);
        this.f9339ak = new C2835e(this);
        if (!C3430e.m2555Q()) {
            m4401h(false);
        }
        if (!C3430e.m2554R()) {
            m4415c(false, false);
        }
        this.f9322T = new C2627j(false) { // from class: com.tsf.shell.f.f.a.h.8
            @Override // com.tsf.shell.p096f.p118e.C2627j
            /* renamed from: a */
            public void mo4003a() {
                C2862h.this.m4447at();
            }
        };
        this.f9322T.mouseEnabled(false);
        this.f9318P = C0892a.f2553D;
        f9293F = 350.0f * C0892a.f2567c;
        this.f9327Y = new C0980j();
        this.f9327Y.name(f9294J);
        this.f9333ae = new C0937a(this.f9327Y);
        this.f9332ad = m4406f(this.f9327Y);
        this.f9327Y.setMouseEventListener(this.f9332ad);
        this.f9327Y.mouseEnabled(true);
        this.f9540c.addChild(this.f9327Y);
        this.f9313K = new C0980j();
        this.f9314L = new C0980j() { // from class: com.tsf.shell.f.f.a.h.9
            @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
            @SuppressLint({"WrongCall"})
            public void onDrawStart() {
                C2862h.this.f9316N = null;
                if (C2862h.this.f9315M != null) {
                    float f = C2862h.this.f9335ag / C2862h.this.f9318P;
                    if (!C2862h.this.f9320R) {
                        if (C2862h.this.f9319Q) {
                            C2862h.this.f9315M.m4972b(((f - C2862h.this.f9315M.f8810a) * 0.5f) + C2862h.this.f9315M.f8810a);
                            if (C2862h.this.f9321S) {
                                C2862h.this.f9314L.rotation().f2526x += (C2862h.this.f9336ah - C2862h.this.f9314L.rotation().f2526x) * 0.15f;
                            }
                        } else if (f != 0.0f || Math.abs(C2862h.this.f9315M.f8810a - f) >= 0.002d || Math.abs(rotation().f2526x - C2862h.this.f9336ah) >= 0.002d) {
                            C2862h.this.f9315M.m4972b(((f - C2862h.this.f9315M.f8810a) * 0.15f) + C2862h.this.f9315M.f8810a);
                            if (C2862h.this.f9321S) {
                                C2862h.this.f9314L.rotation().f2526x += (C2862h.this.f9336ah - C2862h.this.f9314L.rotation().f2526x) * 0.2f;
                            }
                        } else if (!C2862h.this.f9320R) {
                            C2862h.this.f9315M.m4972b(0.0f);
                            C2862h.this.m4463aU();
                            rotation().f2526x = C2862h.this.f9336ah = 0.0f;
                        }
                    }
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
            public void onDrawEnd() {
                if (C2862h.this.f9316N != null) {
                    C2862h.this.f9316N.m4973b().mo4795a(C2862h.this.f9314L);
                }
            }
        };
        this.f9313K.addChild(this.f9314L);
        this.f9313K.addChild(this.f9322T);
        this.f9313K.addChild(this.f9338aj);
        this.f9313K.addChild(this.f9339ak);
        this.f9540c.addChild(this.f9313K);
        m4461aW();
        m4464aT();
        this.f9337ai = new C2843f(this);
        this.f9337ai.m4530i();
        this.f9540c.addChild(this.f9337ai);
        m4458aZ();
    }

    /* renamed from: d */
    public void m4414d(int i) {
        if (this.f9326X.m4347b(i)) {
            if (this.f9320R) {
                m4427bd();
                m4426be();
                return;
            }
            m4486a(new Runnable() { // from class: com.tsf.shell.f.f.a.h.10
                @Override // java.lang.Runnable
                public void run() {
                    C2862h.this.m4427bd();
                    C2862h.this.m4426be();
                }
            });
        }
    }

    /* renamed from: a */
    public void m4486a(Runnable runnable) {
        this.f9334af = runnable;
    }

    /* renamed from: b */
    public void m4434b(Runnable runnable) {
        m4458aZ();
        this.f9315M.m4975a(this.f9340al.m4815a(), runnable);
    }

    /* renamed from: ay */
    public void m4442ay() {
        Iterator<C2676a> it = this.f9325W.iterator();
        while (it.hasNext()) {
            it.next().m4976a(this.f9340al.m4815a());
        }
        m4441az();
    }

    /* renamed from: aZ */
    private void m4458aZ() {
        this.f9314L.mouseEnabled(false);
        this.f9338aj.mouseEnabled(false);
        this.f9339ak.mouseEnabled(false);
        m4430ba();
    }

    /* renamed from: az */
    public void m4441az() {
        this.f9314L.mouseEnabled(true);
        this.f9338aj.mouseEnabled(true);
        this.f9339ak.mouseEnabled(true);
        m4429bb();
    }

    /* renamed from: ba */
    private void m4430ba() {
        this.f9327Y.setMouseEventListener(this.f9333ae);
    }

    /* renamed from: bb */
    private void m4429bb() {
        this.f9327Y.setMouseEventListener(this.f9332ad);
    }

    /* renamed from: aA */
    public C0980j m4483aA() {
        return this.f9314L;
    }

    /* renamed from: bc */
    private void m4428bc() {
        this.f9330ab = new C1013b();
        this.f9328Z = new C1017d() { // from class: com.tsf.shell.f.f.a.h.11
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: b */
            public void mo558b(float f) {
                C2862h.this.f9335ag = C2862h.this.f9331ac * C2862h.this.f9318P * f;
                if (C2862h.this.f9321S) {
                    C2862h.this.f9336ah = 45.0f * (1.0f - (Math.abs(f - 0.5f) * 2.0f));
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo732a() {
                C1014c.m10325a(C2862h.this.f9330ab, C2862h.f9291D, C2862h.this.f9329aa);
            }
        };
        this.f9329aa = new C1017d() { // from class: com.tsf.shell.f.f.a.h.12
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: b */
            public void mo558b(float f) {
                C2862h.this.f9335ag = C2862h.this.f9331ac * C2862h.this.f9318P * (1.0f - f);
                if (C2862h.this.f9321S) {
                    C2862h.this.f9336ah = (-45.0f) * (1.0f - (Math.abs(f - 0.5f) * 2.0f));
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo732a() {
                C2862h.this.f9319Q = false;
                C2862h.this.f9315M.m4958n();
                C2862h.this.m4441az();
            }
        };
        this.f9329aa.m10309b(260);
        this.f9328Z.m10313a((InterfaceC1011b) new C0986a.C0987a.C0989b());
        this.f9329aa.m10313a((InterfaceC1011b) new C0986a.C0987a.C0989b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bd */
    public void m4427bd() {
        AbstractC2745k h = this.f9326X.m4343h();
        Iterator<C2676a> it = this.f9325W.iterator();
        while (it.hasNext()) {
            C2676a next = it.next();
            next.m4984a(0.0f);
            next.m4977a(h);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: be */
    public void m4426be() {
        if (this.f9315M.m4968d() == null) {
            this.f9331ac = 1.0f;
        } else {
            this.f9331ac = -1.0f;
        }
        if (this.f9321S) {
            f9291D = 600;
        } else {
            f9291D = 350;
        }
        C1014c.m10325a(this.f9330ab, f9291D, this.f9328Z);
        m4458aZ();
        m4446au();
    }

    /* renamed from: aB */
    public void m4482aB() {
        if (!this.f9320R) {
            if (this.f9315M != null) {
                this.f9315M.m4960l();
            }
            this.f9315M.m4972b(0.0f);
            m4463aU();
            this.f9314L.rotation().f2526x = 0.0f;
        }
    }

    @Override // com.tsf.shell.p096f.p131f.p132a.C2676a.InterfaceC2679a
    /* renamed from: a */
    public void mo4500a(C2676a c2676a) {
        this.f9316N = c2676a;
    }

    @Override // com.tsf.shell.p096f.p131f.p132a.C2676a.InterfaceC2679a
    /* renamed from: i_ */
    public C2676a mo4399i_() {
        return m4424bg();
    }

    @Override // com.tsf.shell.p096f.p131f.p132a.C2676a.InterfaceC2679a
    /* renamed from: j_ */
    public void mo4397j_() {
        if (!m4472aL()) {
            m4462aV();
        }
    }

    @Override // com.tsf.shell.p096f.p131f.p132a.C2676a.InterfaceC2679a
    /* renamed from: a */
    public void mo4499a(C2676a c2676a, C2676a c2676a2, C2676a c2676a3) {
        if (this.f9325W.size() != 1) {
            this.f9325W.remove(c2676a);
            if (this.f9315M == c2676a) {
                if (c2676a3 == null) {
                    this.f9315M = this.f9325W.get(this.f9325W.size() - 1);
                } else {
                    this.f9315M = c2676a3;
                }
                this.f9315M.m4974a(true);
                this.f9315M.m4984a(0.0f);
                this.f9315M.m4956p();
            }
            if (this.f9325W.size() >= 3) {
                c2676a3.m4978a(c2676a2);
                c2676a2.m4970b(c2676a3);
            } else {
                if (c2676a3 != null) {
                    c2676a3.m4978a((C2676a) null);
                }
                c2676a2.m4970b((C2676a) null);
            }
            c2676a.destroy();
            int size = this.f9325W.size();
            for (int i = 0; i < size; i++) {
                this.f9325W.get(i).m4982a(i);
            }
            m4459aY();
        }
    }

    /* renamed from: bf */
    private void m4425bf() {
        this.f9326X = new C2746l();
    }

    /* renamed from: aC */
    public C2746l m4481aC() {
        return this.f9326X;
    }

    /* renamed from: b */
    public C3145b m4432b(ArrayList<AbstractC3208b> arrayList) {
        return m4485a(C4189x.m588c(C1306b.C1315i.widget_folder), m4451ap(), arrayList);
    }

    /* renamed from: a */
    private C3145b m4485a(String str, C2676a c2676a, ArrayList<AbstractC3208b> arrayList) {
        LauncherDrawerFolder3DInfo launcherDrawerFolder3DInfo = new LauncherDrawerFolder3DInfo(false);
        launcherDrawerFolder3DInfo.title = str;
        C3145b c3145b = new C3145b(launcherDrawerFolder3DInfo);
        c3145b.setMouseEventListener(m4406f(c3145b));
        c2676a.addChildAt(c3145b, 0);
        m4491a(c3145b, c2676a, 0);
        c3145b.m3328c(arrayList);
        m4452ao().m4807c();
        c3145b.m3373aJ();
        return c3145b;
    }

    /* renamed from: a */
    public C3145b m4484a(String str, ArrayList<AbstractC3208b> arrayList, boolean z) {
        LauncherDrawerFolder3DInfo launcherDrawerFolder3DInfo = new LauncherDrawerFolder3DInfo(false);
        launcherDrawerFolder3DInfo.title = str;
        C3145b c3145b = new C3145b(launcherDrawerFolder3DInfo);
        c3145b.setMouseEventListener(m4406f(c3145b));
        if (z) {
            this.f9340al.m4812a(c3145b, 0);
        } else {
            this.f9340al.m4813a(c3145b);
        }
        c3145b.m3385a(arrayList, true);
        m4452ao().m4807c();
        c3145b.m3373aJ();
        return c3145b;
    }

    /* renamed from: aD */
    public void m4480aD() {
        if (this.f9325W != null) {
            int m4967e = this.f9315M.m4967e();
            C2676a remove = this.f9325W.remove(0);
            float alpha = this.f9315M.alpha();
            Iterator<C2676a> it = this.f9325W.iterator();
            while (it.hasNext()) {
                it.next().destroy();
            }
            this.f9325W.clear();
            remove.children().clear();
            remove.m4984a(0.0f);
            remove.m4982a(0);
            remove.m4970b((C2676a) null);
            remove.m4978a((C2676a) null);
            remove.m4974a(false);
            this.f9325W.add(remove);
            int size = this.f9340al.m4815a().size() - 1;
            while (true) {
                int i = size;
                if (i <= -1) {
                    break;
                }
                C3112b c3112b = this.f9340al.m4815a().get(i);
                if (c3112b instanceof C3145b) {
                    C3145b c3145b = (C3145b) c3112b;
                    if (c3145b.m3364aS()) {
                        remove.addChildAt(c3145b.m3382aA(), 0);
                    } else {
                        remove.addChildAt(c3112b, 0);
                    }
                } else {
                    remove.addChildAt(c3112b, 0);
                }
                size = i - 1;
            }
            int size2 = this.f9325W.size() - 1;
            if (m4967e <= size2) {
                size2 = m4967e;
            }
            this.f9315M = this.f9325W.get(size2);
            this.f9315M.m4974a(true);
            this.f9315M.m4984a(0.0f);
            if (alpha != 255.0f) {
                this.f9315M.alpha(alpha);
            }
            m4459aY();
        }
    }

    /* renamed from: aE */
    public void m4479aE() {
        C0853a.m10865a().m10583c(new Runnable() { // from class: com.tsf.shell.f.f.a.h.13
            @Override // java.lang.Runnable
            public void run() {
                C2862h.this.m4440b(C2862h.f9289B, C2862h.f9290C);
                C2862h.this.m4480aD();
            }
        });
    }

    /* renamed from: a */
    public void m4501a(final int i, final int i2) {
        C0853a.m10865a().m10583c(new Runnable() { // from class: com.tsf.shell.f.f.a.h.2
            @Override // java.lang.Runnable
            public void run() {
                C2862h.this.m4440b(i, i2);
                C2862h.this.m4480aD();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m4440b(int i, int i2) {
        if (i < f9307x || i > f9308y) {
            i = f9289B;
        }
        if (i2 < f9309z || i2 > f9288A) {
            i2 = f9290C;
        }
        f9299p = i;
        f9300q = i2;
        f9296m = f9299p * f9300q;
        f9297n = (((C0892a.f2553D - f9303t) - f9304u) - C3566b.f11839a.f11762T) / (f9299p - 1);
        f9298o = (((C0892a.f2554E - f9301r) - f9302s) - C3566b.f11839a.f11763U) / (f9300q - 1);
        if (f9292E == null) {
            f9292E = new ArrayList<>();
        } else {
            f9292E.clear();
        }
        float f = (C3566b.f11839a.f11762T / 2.0f) + C0892a.f2590z + f9303t;
        float f2 = (C0892a.f2551B - f9301r) - (C3566b.f11839a.f11763U / 2.0f);
        for (int i3 = 0; i3 < f9296m; i3++) {
            Number3d number3d = new Number3d();
            number3d.f2526x = ((i3 % f9299p) * f9297n) + f;
            number3d.f2527y = ((-(i3 / f9299p)) * f9298o) + f2;
            f9292E.add(number3d);
        }
        this.f9326X.m4801a(C0892a.f2553D, C0892a.f2554E, f9299p, f9300q, f9292E);
    }

    /* renamed from: bg */
    private C2676a m4424bg() {
        int size = this.f9325W.size();
        C2676a c2676a = new C2676a(this.f9326X.m4343h(), this);
        c2676a.m4982a(size);
        this.f9325W.add(c2676a);
        this.f9314L.addChild(c2676a);
        c2676a.m4984a(1.0f);
        c2676a.m4974a(false);
        if (this.f9325W.size() >= 3) {
            C2676a c2676a2 = this.f9325W.get(0);
            c2676a2.m4978a(c2676a);
            c2676a.m4970b(c2676a2);
        }
        C2676a c2676a3 = this.f9325W.get(size - 1);
        c2676a3.m4970b(c2676a);
        c2676a.m4978a(c2676a3);
        m4459aY();
        return c2676a;
    }

    /* renamed from: f */
    private void m4407f(int i) {
        if (this.f9315M != null) {
            this.f9315M.m4957o();
        }
        this.f9315M = this.f9325W.get(i);
        this.f9315M.m4956p();
        this.f9315M.m4974a(true);
        m4460aX();
    }

    /* renamed from: aF */
    public void m4478aF() {
        this.f9320R = false;
        this.f9319Q = false;
        C2234d.m6033a().m6030a("PageApplication");
        invalidate();
        setAnimationObjectState(true);
        if (this.f9315M != null) {
            this.f9315M.m4959m();
        }
        m4476aH();
        this.f9315M.m4958n();
    }

    /* renamed from: aG */
    public void m4477aG() {
        this.f9320R = false;
        this.f9319Q = false;
        C2234d.m6033a().m6030a("PageApplication");
        invalidate();
        setAnimationObjectState(true);
        if (this.f9315M != null) {
            this.f9315M.m4959m();
        }
        m4475aI();
        this.f9315M.m4958n();
    }

    /* renamed from: aH */
    public void m4476aH() {
        if (this.f9315M.f8810a > -1.0f && this.f9315M.f8810a < 1.0f) {
            if (this.f9315M.m4967e() == this.f9325W.size() - 1) {
                if (this.f9325W.size() >= 3) {
                    this.f9315M.m4963i();
                    m4407f(0);
                    return;
                }
                return;
            }
            this.f9315M.m4963i();
            m4407f(this.f9315M.m4967e() + 1);
        }
    }

    /* renamed from: aI */
    public void m4475aI() {
        if (this.f9315M.f8810a > -1.0f && this.f9315M.f8810a < 1.0f) {
            if (this.f9315M.m4967e() == 0) {
                if (this.f9325W.size() >= 3) {
                    this.f9315M.m4962j();
                    m4407f(this.f9325W.size() - 1);
                    return;
                }
                return;
            }
            this.f9315M.m4962j();
            m4407f(this.f9315M.m4967e() - 1);
        }
    }

    @Override // com.tsf.shell.manager.p166a.C3364c.InterfaceC3365a
    /* renamed from: a */
    public void mo2679a() {
    }

    @Override // com.tsf.shell.manager.p166a.C3364c.InterfaceC3365a
    /* renamed from: k_ */
    public void mo2675k_() {
        m4423bh();
    }

    /* renamed from: bh */
    private void m4423bh() {
        if (!this.f9341am && C3359a.f11109w.m2716a().m2740b()) {
            C3359a.f11109w.m2708c().m2722c();
        }
    }

    /* renamed from: aJ */
    public boolean m4474aJ() {
        return this.f9341am;
    }

    @Override // com.tsf.shell.manager.p166a.C3366d.InterfaceC3371a
    /* renamed from: a */
    public void mo2717a(ArrayList<C3112b> arrayList) {
        C2676a c2676a;
        if (!this.f9341am) {
            this.f9341am = true;
            ArrayList arrayList2 = new ArrayList();
            ArrayList<C3112b> arrayList3 = new ArrayList<>();
            Iterator<C3112b> it = arrayList.iterator();
            while (it.hasNext()) {
                C3112b next = it.next();
                if ((next.m3534K() == null || !(next.m3534K() instanceof LauncherShortcutAppInfo)) ? false : ((LauncherShortcutAppInfo) next.m3534K()).isHide) {
                    arrayList3.add(next);
                } else {
                    arrayList2.add(next);
                }
            }
            this.f9337ai.m4538d().m4668a(arrayList3);
            int size = arrayList2.size();
            this.f9325W = new ArrayList<>();
            int i = size / f9296m;
            int i2 = (size % f9296m != 0 || size == 0) ? i + 1 : i;
            for (int i3 = 0; i3 < i2; i3++) {
                C2676a c2676a2 = new C2676a(this.f9326X.m4343h(), this);
                c2676a2.m4982a(i3);
                this.f9325W.add(c2676a2);
                this.f9314L.addChild(c2676a2);
                if (i3 != 0) {
                    c2676a2.m4974a(false);
                }
            }
            int i4 = 0;
            C2676a c2676a3 = i2 >= 3 ? this.f9325W.get(i2 - 1) : null;
            while (i4 < i2) {
                C2676a c2676a4 = this.f9325W.get(i4);
                c2676a4.m4978a(c2676a3);
                if (i4 == i2 - 1) {
                    c2676a = i2 >= 3 ? this.f9325W.get(0) : null;
                } else {
                    c2676a = this.f9325W.get(i4 + 1);
                }
                c2676a4.m4970b(c2676a);
                i4++;
                c2676a3 = c2676a4;
            }
            m4407f(0);
            m4459aY();
            int size2 = arrayList2.size();
            for (int i5 = 0; i5 < size2; i5++) {
                m4487a((C3112b) arrayList2.get(i5), false, i5);
            }
            m4473aK();
            m4441az();
        }
    }

    /* renamed from: aK */
    public void m4473aK() {
        synchronized (this.f9348at) {
            Iterator<Runnable> it = this.f9347as.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
            this.f9347as.clear();
        }
    }

    /* renamed from: b */
    public int m4437b(C3112b c3112b) {
        return this.f9323U.m4592a(this.f9340al.m4815a(), c3112b);
    }

    /* renamed from: e */
    public C2676a m4411e(int i) {
        int i2 = i / f9296m;
        if (i2 >= this.f9325W.size()) {
            return m4424bg();
        }
        return this.f9325W.get(i2);
    }

    @Override // com.tsf.shell.manager.p166a.C3364c.InterfaceC3365a
    /* renamed from: a */
    public void mo2677a(C3222g c3222g, boolean z) {
        if (this.f9341am) {
            m4489a((C3112b) c3222g, z);
        }
    }

    /* renamed from: a */
    private void m4489a(C3112b c3112b, boolean z) {
        m4436b(c3112b, z);
    }

    /* renamed from: a */
    private void m4487a(C3112b c3112b, boolean z, int i) {
        m4435b(c3112b, z, i);
    }

    /* renamed from: b */
    private void m4436b(C3112b c3112b, boolean z) {
        m4435b(c3112b, z, m4437b(c3112b));
    }

    /* renamed from: b */
    private void m4435b(C3112b c3112b, boolean z, int i) {
        this.f9340al.m4812a(c3112b, i);
        if (z && (c3112b instanceof C3222g)) {
            ((C3222g) c3112b).m3113aX();
        }
        m4411e(i).m4979a(c3112b, i % f9296m, false);
        c3112b.m3534K().index = i;
        c3112b.mo3462a(this.f9542h);
        this.f9542h.m3569a((C0975i) c3112b);
    }

    /* renamed from: a */
    public void m4490a(C3112b c3112b, C3112b c3112b2) {
        this.f9340al.m4811a(c3112b2, c3112b);
    }

    /* renamed from: a */
    public void m4491a(C3112b c3112b, C2676a c2676a, int i) {
        this.f9340al.m4808b(c3112b);
        this.f9340al.m4812a(c3112b, (c2676a.m4967e() * f9296m) + i);
    }

    /* renamed from: c */
    public void m4417c(C3112b c3112b) {
        this.f9340al.m4808b(c3112b);
    }

    @Override // com.tsf.shell.manager.p166a.C3364c.InterfaceC3365a
    /* renamed from: a */
    public void mo2678a(C3222g c3222g) {
    }

    @Override // com.tsf.shell.manager.p166a.C3364c.InterfaceC3365a
    /* renamed from: b */
    public void mo2676b(C3222g c3222g, boolean z) {
        if (this.f9341am) {
            C2676a c2676a = (C2676a) c3222g.parent();
            if (c2676a != null) {
                c2676a.removeChild(c3222g);
            }
            ItemInfo K = c3222g.m3534K();
            if (K != null) {
                C3359a.f11109w.m2708c().m2734a(K);
            }
            this.f9340al.m4808b(c3222g);
        }
    }

    /* renamed from: d */
    public boolean m4412d(C3112b c3112b) {
        if (c3112b instanceof C3222g) {
            C3222g c3222g = (C3222g) c3112b;
            if (c3222g.m3104bf()) {
                C3377f m3106bd = c3222g.m3106bd();
                C3444a.m2356c().m2767b(m3106bd);
                ArrayList<C3377f> arrayList = new ArrayList<>();
                arrayList.add(m3106bd);
                C3359a.f11109w.m2709b(arrayList, false);
                m4408e((C3112b) c3222g);
                return true;
            } else if (c3222g.m3105be()) {
                this.f9312I = C3359a.f11103q.m2042a(this.f9312I, C4189x.m588c(C1306b.C1315i.notic_uninstall_error), -52736, 2000);
                return false;
            } else {
                c3222g.m3103bg();
                return false;
            }
        } else if (c3112b instanceof C3145b) {
            m4408e(c3112b);
            return false;
        } else {
            return false;
        }
    }

    /* renamed from: e */
    private void m4408e(final C3112b c3112b) {
        c3112b.mouseEnabled(false);
        c3112b.mo3050p_();
        C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.f.a.h.3
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo732a() {
                C3359a.f11109w.m2708c().m2734a(c3112b.m3534K());
                c3112b.mo3055g();
                c3112b.destroy();
            }
        };
        c1017d.m10294l(0.0f);
        c1017d.m10293m(0.0f);
        c1017d.m10292n(0.0f);
        C1014c.m10326a(c3112b);
        C1014c.m10325a(c3112b, VEasing.Back.easeIn, c1017d);
    }

    /* renamed from: f */
    public C0937a m4406f(C0975i c0975i) {
        return new C0937a(c0975i) { // from class: com.tsf.shell.f.f.a.h.4

            /* renamed from: b */
            private float f9362b;

            /* renamed from: d */
            private C3112b f9363d;

            /* renamed from: g */
            private C3111d f9366g;

            /* renamed from: e */
            private boolean f9364e = false;

            /* renamed from: f */
            private boolean f9365f = false;

            /* renamed from: h */
            private boolean f9367h = false;

            /* renamed from: i */
            private float[] f9368i = {0.0f, 0.0f};

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo502a(MotionEvent motionEvent) {
                C2862h.this.m4448as();
                if (C2862h.this.f9342an) {
                    if (this.f2740c instanceof C3231c) {
                        C2862h.this.f9337ai.m4534e((C3231c) this.f2740c, motionEvent);
                    }
                } else if (this.f9367h) {
                    if (this.f2740c instanceof C3222g) {
                        C3222g c3222g = (C3222g) this.f2740c;
                        if (c3222g.m3161aC()) {
                            if (C2862h.this.f9542h.m3563e()) {
                                c3222g.m3067ap();
                            } else {
                                c3222g.mo3094l();
                            }
                        }
                    } else if (this.f2740c instanceof C3145b) {
                        ((C3145b) this.f2740c).m3365aR();
                    }
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: c */
            public void mo2122c(MotionEvent motionEvent) {
                C2862h.this.m4448as();
                if (C2862h.this.f9342an) {
                    if (this.f2740c instanceof C3231c) {
                        C2862h.this.f9337ai.m4539c((C3231c) this.f2740c, motionEvent);
                        return;
                    }
                    return;
                }
                if (!C2862h.this.m4457aj()) {
                }
                mo2122c(motionEvent);
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: d */
            public void mo2119d(MotionEvent motionEvent) {
                if (this.f2740c instanceof C3231c) {
                    C2862h.this.f9337ai.m4536d((C3231c) this.f2740c, motionEvent);
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo2129a(MotionEvent motionEvent, MotionEvent motionEvent2) {
                if (C2862h.this.f9342an) {
                    if (this.f2740c instanceof C3231c) {
                        C2862h.this.f9337ai.m4548a((C3231c) this.f2740c, motionEvent, motionEvent2);
                    }
                } else if (this.f9364e) {
                    C4189x.m600a(motionEvent2, this.f9368i);
                    if (this.f9363d.mo3517a((int) this.f9368i[0], (int) this.f9368i[1]) == null) {
                        if (this.f9366g != null) {
                            this.f9366g.mo2129a(motionEvent, motionEvent2);
                            return;
                        }
                        return;
                    }
                    this.f9365f = true;
                    this.f9364e = false;
                    if (this.f9366g != null) {
                        this.f9366g.m3551a(false);
                    }
                    C3359a.f11094h.m4125C();
                } else if (this.f9365f && this.f9366g != null) {
                    this.f9366g.mo2129a(motionEvent, motionEvent2);
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: e */
            public void mo1654e(MotionEvent motionEvent) {
                if (C2862h.this.f9342an && (this.f2740c instanceof C3231c)) {
                    C2862h.this.f9337ai.m4549a((C3231c) this.f2740c, motionEvent);
                }
                C3398f.m2644a(motionEvent);
                this.f9367h = C2862h.this.f9320R;
                C2862h.this.f9319Q = false;
                this.f9365f = false;
                if (this.f2740c instanceof C3222g) {
                    C3222g c3222g = (C3222g) this.f2740c;
                    if (c3222g.m3161aC()) {
                        c3222g.m3151aQ();
                        c3222g.m3112aY();
                        return;
                    }
                    return;
                }
                if (this.f2740c instanceof C3145b) {
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo527a(final MotionEvent motionEvent, final MotionEvent motionEvent2, float f, float f2) {
                if (C2862h.this.f9342an && (this.f2740c instanceof C3231c)) {
                    C2862h.this.f9337ai.m4547a((C3231c) this.f2740c, motionEvent, motionEvent2, f, f2);
                }
                C0853a.m10865a().m10583c(new Runnable() { // from class: com.tsf.shell.f.f.a.h.4.1
                    @Override // java.lang.Runnable
                    public void run() {
                        float f3 = 1.0f;
                        if (C0864d.m10805d().m10794h() == this) {
                            if (!C2862h.this.f9319Q) {
                                C2862h.this.m4446au();
                                C28704.this.f9362b = C2862h.this.f9335ag = C2862h.this.f9315M.position().f2526x;
                            }
                            C2862h.this.f9335ag = C28704.this.f9362b + (motionEvent2.getX() - motionEvent.getX());
                            if (C2862h.this.f9321S) {
                                float y = (float) (((motionEvent2.getY() - motionEvent.getY()) / (C0892a.f2556G / 2)) * 1.3d);
                                if (y <= 1.0f) {
                                    f3 = y < -1.0f ? -1.0f : y;
                                }
                                C2862h.this.f9336ah = f3 * 45.0f;
                            }
                        }
                    }
                });
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: g */
            public void mo3208g(MotionEvent motionEvent) {
                if (C2862h.this.f9342an) {
                }
                if (!C2862h.this.f9319Q) {
                    C2862h.this.m4463aU();
                    return;
                }
                C2862h.this.f9319Q = false;
                C2862h.this.f9335ag = 0.0f;
                if (C2862h.this.f9315M.f8810a <= 0.5d) {
                    if (C2862h.this.f9315M.f8810a < -0.5d) {
                        C2862h.this.m4476aH();
                    }
                } else {
                    C2862h.this.m4475aI();
                }
                C2862h.this.f9315M.m4958n();
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: f */
            public void mo1653f(MotionEvent motionEvent) {
                if (C2862h.this.f9342an && (this.f2740c instanceof C3231c)) {
                    C2862h.this.f9337ai.m4543b((C3231c) this.f2740c, motionEvent);
                }
                C2862h.this.f9336ah = 0.0f;
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: b */
            public void mo3209b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if (C2862h.this.f9342an && (this.f2740c instanceof C3231c)) {
                    C2862h.this.f9337ai.m4542b((C3231c) this.f2740c, motionEvent, motionEvent2, f, f2);
                }
                C2862h.this.f9319Q = false;
                C2862h.this.f9335ag = 0.0f;
                if (!C2862h.this.f9320R && Math.abs(f) > 100.0f) {
                    if (f < 0.0f) {
                        C2862h.this.m4476aH();
                    } else {
                        C2862h.this.m4475aI();
                    }
                }
                C2862h.this.f9315M.m4958n();
            }
        };
    }

    @Override // com.tsf.shell.p096f.p131f.C2932g
    /* renamed from: ab */
    public void mo4146ab() {
        super.mo4146ab();
        if (this.f9315M != null) {
            this.f9315M.m4965g();
        }
        if (!this.f9320R) {
            C2234d.m6033a().m6027b("PageApplication");
        }
    }

    @Override // com.tsf.shell.p096f.p131f.C2932g
    /* renamed from: ac */
    public void mo4145ac() {
        super.mo4145ac();
        if (this.f9315M != null) {
            this.f9315M.m4964h();
        }
        if (!this.f9320R) {
            C2234d.m6033a().m6030a("PageApplication");
        }
    }

    /* renamed from: aL */
    public boolean m4472aL() {
        return this.f9320R;
    }

    /* renamed from: bi */
    private void m4422bi() {
        C0853a.m10865a().m10588a(new Runnable() { // from class: com.tsf.shell.f.f.a.h.5
            @Override // java.lang.Runnable
            public void run() {
                C2862h.this.f9349au = new FrameLayout(C0853a.m10856d());
                ImageView imageView = new ImageView(C0853a.m10856d());
                imageView.setImageResource(C1306b.C1310d.drawer_loading);
                RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
                rotateAnimation.setInterpolator(new LinearInterpolator());
                rotateAnimation.setDuration(500L);
                rotateAnimation.setRepeatCount(-1);
                imageView.setAnimation(rotateAnimation);
                rotateAnimation.startNow();
                C2862h.this.f9349au.addView(imageView, new FrameLayout.LayoutParams(C0892a.m10735b(80.0f), C0892a.m10735b(80.0f), 17));
                C3359a.f11096j.m2234a(C2862h.this.f9349au, new ViewGroup.LayoutParams(-1, -1));
            }
        });
    }

    /* renamed from: bj */
    private void m4421bj() {
        C0853a.m10865a().m10588a(new Runnable() { // from class: com.tsf.shell.f.f.a.h.6
            @Override // java.lang.Runnable
            public void run() {
                if (C2862h.this.f9349au != null) {
                    C3359a.f11096j.m2235a(C2862h.this.f9349au);
                }
            }
        });
    }

    /* renamed from: b */
    public void m4433b(Runnable runnable, boolean z) {
        if (!this.f9350av) {
            m4451ap().m4974a(false);
            return;
        }
        this.f9322T.m5110d(z);
        this.f9338aj.m4511c(z);
        this.f9339ak.m4561b(z);
    }

    /* renamed from: c */
    public void m4416c(Runnable runnable, boolean z) {
        this.f9322T.m5113c(z);
        this.f9338aj.m4513b(z);
        this.f9339ak.m4564a(z);
        m4458aZ();
    }

    /* renamed from: aM */
    public boolean m4471aM() {
        return this.f9350av || m4451ap() == null;
    }

    /* renamed from: aN */
    public void m4470aN() {
        if (!m4471aM()) {
            m4422bi();
            int size = this.f9340al.m4815a().size();
            for (int i = 0; i < size; i++) {
                C3112b c3112b = this.f9340al.m4815a().get(i);
                if (c3112b instanceof AbstractC3208b) {
                    ((AbstractC3208b) c3112b).m3163aA();
                }
            }
            m4421bj();
            this.f9350av = true;
        }
    }

    /* renamed from: bk */
    private void m4420bk() {
        if (!m4471aM()) {
            m4422bi();
            C2676a m4451ap = m4451ap();
            int size = this.f9340al.m4815a().size();
            for (int i = 0; i < size; i++) {
                C3112b c3112b = this.f9340al.m4815a().get(i);
                if (c3112b instanceof AbstractC3208b) {
                    ((AbstractC3208b) c3112b).m3163aA();
                }
            }
            if (!m4451ap.visible()) {
                C2948l h = C3359a.f11108v.f7768a.f9583b.m4343h();
                h.mo4135b((C2932g) this, false);
                h.mo4139a((C2932g) this, true);
                m4451ap.m4974a(true);
            }
            m4421bj();
            this.f9350av = true;
            this.f9322T.m5110d(true);
            this.f9338aj.m4511c(true);
            this.f9339ak.m4561b(true);
        }
    }

    @Override // com.tsf.shell.p096f.p131f.C2932g
    /* renamed from: W */
    public void mo4239W() {
        super.mo4239W();
        m4420bk();
        m4441az();
    }

    /* renamed from: aO */
    public void m4469aO() {
    }
}
