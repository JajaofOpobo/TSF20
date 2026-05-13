package com.tsf.shell.p096f.p153i.p155b.p159d;

import android.content.ComponentName;
import android.content.ContentValues;
import android.view.KeyEvent;
import android.view.MotionEvent;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.api.element.info.LauncherDrawerFolder3DInfo;
import com.censivn.C3DEngine.api.element.info.LauncherFolder3DInfo;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcut3DInfo;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcutAppInfo;
import com.censivn.C3DEngine.api.message.RenderRunnable;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.p030a.C0864d;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p036d.C0937a;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.censivn.C3DEngine.p031b.p041g.C0986a;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.censivn.C3DEngine.p031b.p041g.InterfaceC1011b;
import com.tsf.shell.C2234d;
import com.tsf.shell.Home;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.bind.ShellModel;
import com.tsf.shell.manager.p168b.C3430e;
import com.tsf.shell.manager.p180l.C3519a;
import com.tsf.shell.manager.p183o.C3566b;
import com.tsf.shell.manager.p183o.C3567c;
import com.tsf.shell.manager.p185p.C3591c;
import com.tsf.shell.p096f.C2285c;
import com.tsf.shell.p096f.p100b.C2284a;
import com.tsf.shell.p096f.p101c.p105b.C2346a;
import com.tsf.shell.p096f.p101c.p105b.C2355b;
import com.tsf.shell.p096f.p118e.C2603h;
import com.tsf.shell.p096f.p118e.C2640n;
import com.tsf.shell.p096f.p118e.InterfaceC2557f;
import com.tsf.shell.p096f.p118e.InterfaceC2639m;
import com.tsf.shell.p096f.p118e.p119a.InterfaceC2453a;
import com.tsf.shell.p096f.p153i.C3105a;
import com.tsf.shell.p096f.p153i.C3112b;
import com.tsf.shell.p096f.p153i.C3231c;
import com.tsf.shell.p096f.p153i.p154a.C3109c;
import com.tsf.shell.p096f.p153i.p155b.p159d.C3183g;
import com.tsf.shell.p096f.p153i.p155b.p160e.AbstractC3208b;
import com.tsf.shell.p096f.p153i.p155b.p160e.C3222g;
import com.tsf.shell.theme.inside.description.ThemeFolderDescription;
import com.tsf.shell.utils.C4171h;
import com.tsf.shell.utils.C4187w;
import com.tsf.shell.utils.C4189x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
/* renamed from: com.tsf.shell.f.i.b.d.b */
/* loaded from: classes.dex */
public class C3145b extends C3231c implements InterfaceC2453a, C2603h.InterfaceC2610a, InterfaceC2639m, C3105a.InterfaceC3106a {

    /* renamed from: C */
    private static ArrayList<Integer> f10233C;

    /* renamed from: D */
    private static ArrayList<Integer> f10234D;

    /* renamed from: E */
    private static ArrayList<Integer> f10235E;

    /* renamed from: F */
    private static ArrayList<Integer> f10236F;

    /* renamed from: G */
    private static C2603h f10237G;

    /* renamed from: k */
    public static C3145b f10240k;

    /* renamed from: l */
    public static C3187j f10241l;

    /* renamed from: m */
    public static C3170d f10242m;

    /* renamed from: n */
    public static C3169c f10243n;

    /* renamed from: A */
    boolean f10244A;

    /* renamed from: H */
    private AbstractC3208b f10245H;

    /* renamed from: I */
    private int f10246I;

    /* renamed from: J */
    private C3171e f10247J;

    /* renamed from: K */
    private int f10248K;

    /* renamed from: L */
    private Number3d f10249L;

    /* renamed from: M */
    private Number3d f10250M;

    /* renamed from: N */
    private AbstractC3208b f10251N;

    /* renamed from: O */
    private C0937a f10252O;

    /* renamed from: P */
    private C0937a f10253P;

    /* renamed from: Q */
    private C0937a f10254Q;

    /* renamed from: R */
    private C3196k f10255R;

    /* renamed from: S */
    private C2284a f10256S;

    /* renamed from: T */
    private C0980j f10257T;

    /* renamed from: U */
    private int f10258U;

    /* renamed from: V */
    private C1017d f10259V;

    /* renamed from: W */
    private C3105a f10260W;

    /* renamed from: X */
    private boolean f10261X;

    /* renamed from: Y */
    private boolean f10262Y;

    /* renamed from: Z */
    private boolean f10263Z;

    /* renamed from: aa */
    private AbstractC3208b f10264aa;

    /* renamed from: ab */
    private boolean f10265ab;

    /* renamed from: ac */
    private Number3d f10266ac;

    /* renamed from: ad */
    private ArrayList<AbstractC3208b> f10267ad;

    /* renamed from: ae */
    private boolean f10268ae;

    /* renamed from: af */
    private boolean f10269af;

    /* renamed from: ag */
    private boolean f10270ag;

    /* renamed from: o */
    protected C3183g f10271o;

    /* renamed from: p */
    protected C0981k f10272p;

    /* renamed from: q */
    protected C0981k f10273q;

    /* renamed from: r */
    protected C0981k f10274r;

    /* renamed from: s */
    protected C0981k f10275s;

    /* renamed from: t */
    protected C0981k f10276t;

    /* renamed from: u */
    protected TextureElement f10277u;

    /* renamed from: v */
    protected TextureElement f10278v;

    /* renamed from: w */
    protected TextureElement f10279w;

    /* renamed from: x */
    protected boolean f10280x;

    /* renamed from: y */
    protected boolean f10281y;

    /* renamed from: z */
    protected boolean f10282z;

    /* renamed from: B */
    private static ArrayList<C3145b> f10232B = new ArrayList<>();

    /* renamed from: a */
    public static int f10238a = 0;

    /* renamed from: b */
    public static int f10239b = 1;

    /* renamed from: k */
    public static void m3315k() {
        f10241l = new C3187j();
        f10242m = new C3170d();
        f10243n = new C3169c();
        f10234D = new ArrayList<>();
        f10234D.add(7);
        f10234D.add(6);
        f10235E = new ArrayList<>();
        f10235E.add(7);
        f10235E.add(6);
        f10235E.add(4);
        f10235E.add(2);
        f10235E.add(1);
        f10233C = new ArrayList<>();
        f10233C.add(4);
        f10236F = new ArrayList<>();
    }

    /* renamed from: l */
    public static C0981k m3313l() {
        C0981k c0981k = new C0981k(0.0f, 0.0f, false);
        c0981k.uvs().set(0, 1.0f, 0.0f);
        c0981k.uvs().set(1, 0.0f, 0.0f);
        c0981k.uvs().set(2, 1.0f, 1.0f);
        c0981k.uvs().set(3, 0.0f, 1.0f);
        c0981k.points().setPX(0, f10242m.f10329g, f10242m.f10328f, 0.0f);
        c0981k.points().setPX(1, f10242m.f10327e, f10242m.f10328f, 0.0f);
        c0981k.points().setPX(2, f10242m.f10329g, f10242m.f10330h, 0.0f);
        c0981k.points().setPX(3, f10242m.f10327e, f10242m.f10330h, 0.0f);
        c0981k.updateUvsVBO();
        return c0981k;
    }

    /* renamed from: q */
    public static void m3303q() {
        f10241l.m3221f();
        f10242m.m3296a();
        Iterator<C3145b> it = f10232B.iterator();
        while (it.hasNext()) {
            it.next().m3372aK();
        }
        C3359a.f11095i.m1637c();
    }

    /* renamed from: a */
    public static void m3406a(int i, int i2, int i3, int i4) {
        Iterator<C3145b> it = f10232B.iterator();
        while (it.hasNext()) {
            it.next().m3352b(i, i2, i3, i4);
        }
    }

    /* renamed from: a */
    public static C3145b m3407a(int i, int i2, int i3) {
        LauncherFolder3DInfo launcherFolder3DInfo = new LauncherFolder3DInfo();
        launcherFolder3DInfo.screen = i;
        launcherFolder3DInfo.cellX = i2;
        launcherFolder3DInfo.cellY = i3;
        launcherFolder3DInfo.rotation = 0;
        C3145b c3145b = new C3145b(launcherFolder3DInfo);
        c3145b.position().f2526x = launcherFolder3DInfo.cellX;
        c3145b.position().f2527y = launcherFolder3DInfo.cellY;
        c3145b.rotation().f2528z = launcherFolder3DInfo.rotation;
        c3145b.mo3458ac();
        c3145b.m3514ad();
        c3145b.setMouseEventListener(new C3109c(c3145b));
        C3359a.f11095i.m1633d(c3145b);
        return c3145b;
    }

    /* renamed from: a */
    public static C3145b m3404a(LauncherFolder3DInfo launcherFolder3DInfo) {
        C3145b c3145b = new C3145b(launcherFolder3DInfo);
        c3145b.setMouseEventListener(new C3109c(c3145b));
        return c3145b;
    }

    /* renamed from: az */
    public C3145b m3355az() {
        LauncherFolder3DInfo launcherFolder3DInfo = new LauncherFolder3DInfo();
        launcherFolder3DInfo.packagename = "";
        ContentValues contentValues = new ContentValues();
        launcherFolder3DInfo.updateName(contentValues, m3534K().title, false);
        ShellModel.C3435a.m2371a(contentValues, launcherFolder3DInfo, (Runnable) null);
        Iterator<C0975i> it = this.f10271o.children().iterator();
        while (it.hasNext()) {
            C0975i next = it.next();
            if (next instanceof C3222g) {
                LauncherShortcutAppInfo m3108bb = ((C3222g) next).m3108bb();
                m3108bb.container = launcherFolder3DInfo.f2532id;
                ShellModel.C3435a.m2371a(new ContentValues(), m3108bb, (Runnable) null);
                launcherFolder3DInfo.add(m3108bb);
            }
        }
        C3145b c3145b = new C3145b(launcherFolder3DInfo);
        c3145b.position().setAllFrom(position());
        c3145b.scale().setAllFrom(scale());
        c3145b.rotation().setAllFrom(rotation());
        c3145b.setMouseEventListener(new C3109c(c3145b));
        return c3145b;
    }

    /* renamed from: a */
    public void m3391a(AbstractC3208b abstractC3208b, final AbstractC3208b abstractC3208b2, C0975i c0975i) {
        if (this.f10245H == null) {
            abstractC3208b.f10495k.visible(false);
            abstractC3208b2.f10495k.textures().addElement(abstractC3208b.f10495k.textures().get(0).textureElement);
            abstractC3208b.addChild(abstractC3208b2);
            int childIndexOf = abstractC3208b.getChildIndexOf(abstractC3208b2);
            f10242m.m3293b(this);
            mouseEnabled(false);
            this.f10245H = abstractC3208b2;
            Number3d.TEMPNUMBER3D.reset();
            abstractC3208b2.localToGlobal(Number3d.TEMPNUMBER3D);
            abstractC3208b2.parent(null);
            this.f10271o.addChild(abstractC3208b2);
            abstractC3208b.children().set(childIndexOf, this);
            parent(abstractC3208b);
            position().setAllFrom(abstractC3208b2.position());
            abstractC3208b2.position().setAllFrom(this.f10271o.globalToLocal(Number3d.TEMPNUMBER3D));
        }
        C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.i.b.d.b.1
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo732a() {
                C3145b.this.m3306n(true);
                C3145b.this.m3383a(false, (Runnable) null, true);
                C3145b.this.m3340bh();
            }

            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo518a(float f) {
                abstractC3208b2.m3136g(1.0f - f);
            }
        };
        c1017d.mo10301f(0.0f);
        c1017d.mo10298h(60.0f);
        c1017d.m10303e(0.0f);
        C1014c.m10326a(abstractC3208b2);
        C1014c.m10325a(abstractC3208b2, 500, c1017d);
        this.f10247J.m3288a(0.0f);
        m3403a(c0975i);
    }

    /* renamed from: a */
    public void m3400a(C0975i c0975i, final Runnable runnable) {
        f10242m.m3293b(this);
        mouseEnabled(false);
        this.f10247J.m3285b();
        Number3d.TEMPNUMBER3D.reset();
        localToGlobal(Number3d.TEMPNUMBER3D);
        this.f10271o.globalToLocal(Number3d.TEMPNUMBER3D);
        float f = Number3d.TEMPNUMBER3D.f2526x;
        float f2 = Number3d.TEMPNUMBER3D.f2527y;
        C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.i.b.d.b.12
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo518a(float f3) {
                C3145b.this.f10245H.m3136g(f3);
            }

            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo732a() {
                C0980j c0980j = (C0980j) C3145b.this.parent();
                int childIndexOf = c0980j.getChildIndexOf(C3145b.this);
                C3145b.this.f10245H.removeFromParent();
                c0980j.children().set(childIndexOf, C3145b.this.f10245H);
                C3145b.this.f10245H.parent(c0980j);
                C3145b.this.f10245H.position().setAllFrom(C3145b.this.position());
                C3145b.this.f10245H.mouseEnabled(true);
                C3145b.this.f10271o.children().clear();
                C3145b.this.parent(null);
                C3145b.this.f10245H = null;
                if (runnable != null) {
                    runnable.run();
                }
            }
        };
        c1017d.m10294l(1.0f);
        c1017d.m10293m(1.0f);
        c1017d.mo10301f(f);
        c1017d.mo10298h(f2);
        c1017d.m10303e(0.0f);
        C1014c.m10326a(this.f10245H);
        C1014c.m10325a(this.f10245H, 300, c1017d);
        if (c0975i != null) {
            C1017d c1017d2 = new C1017d();
            c1017d2.m10294l(1.0f);
            c1017d2.m10293m(1.0f);
            C1014c.m10326a(c0975i);
            C1014c.m10325a(c0975i, 300, c1017d2);
        }
    }

    /* renamed from: a */
    public void m3390a(AbstractC3208b abstractC3208b, AbstractC3208b abstractC3208b2, boolean z) {
        ItemInfo K = m3534K();
        if (!z && (K instanceof LauncherDrawerFolder3DInfo)) {
            mo3117a(new LauncherFolder3DInfo());
            this.f10268ae = false;
            this.f10269af = false;
            this.f10271o.m5257a(f10234D, f10233C);
        }
        if (K instanceof LauncherDrawerFolder3DInfo) {
            ((LauncherDrawerFolder3DInfo) K).isPreviewFolder = false;
            this.f10269af = false;
        }
        C0980j c0980j = (C0980j) abstractC3208b.parent();
        c0980j.children().set(c0980j.getChildIndexOf(abstractC3208b), this);
        parent(c0980j);
        position().setAllFrom(abstractC3208b.position());
        rotation().setAllFrom(abstractC3208b.rotation());
        scale().setAllFrom(abstractC3208b.scale());
        AbstractC3208b abstractC3208b3 = (AbstractC3208b) this.f10271o.getChildAt(0);
        C1014c.m10326a(abstractC3208b3);
        abstractC3208b.position().setAllFrom(abstractC3208b3.position());
        abstractC3208b.rotation().setAllFrom(abstractC3208b3.rotation());
        abstractC3208b.scale().setAllFrom(abstractC3208b3.scale());
        this.f10271o.children().set(0, abstractC3208b);
        abstractC3208b.parent(this.f10271o);
        m3373aJ();
        m3329c(abstractC3208b);
        mo3139e(abstractC3208b2);
        m3343be();
    }

    /* renamed from: aA */
    public C0975i m3382aA() {
        return this.f10264aa;
    }

    public C3145b(ItemInfo itemInfo) {
        super(itemInfo);
        this.f10280x = true;
        this.f10281y = false;
        this.f10282z = false;
        this.f10258U = 1;
        this.f10261X = false;
        this.f10262Y = false;
        this.f10263Z = false;
        this.f10265ab = false;
        this.f10266ac = new Number3d();
        this.f10268ae = false;
        this.f10269af = false;
        this.f10244A = false;
        if (itemInfo instanceof LauncherDrawerFolder3DInfo) {
            this.f10268ae = true;
            this.f10269af = ((LauncherDrawerFolder3DInfo) itemInfo).isPreviewFolder;
        }
        m3498i(false);
        m3501g(true);
        m3510c(1.2f);
        this.f10248K = f10239b;
        this.f10247J = new C3171e(this);
        m3497j(true);
        m3342bf();
        m3343be();
        m3344bd();
        if (f10237G == null) {
            f10237G = new C2603h();
        }
        this.f10255R = new C3196k(this);
        this.f10271o = new C3183g(this);
        if (this.f10268ae) {
            this.f10271o.m5257a(f10235E, f10236F);
        } else {
            this.f10271o.m5257a(f10234D, f10233C);
        }
        this.f10271o.position().f2526x = f10241l.m3224c().folder.childContainerX;
        this.f10271o.position().f2527y = f10241l.m3224c().folder.childContainerY;
        Iterator<Integer> it = f10241l.m3224c().folder.order.iterator();
        while (it.hasNext()) {
            switch (it.next().intValue()) {
                case 0:
                    addChild(this.f10274r);
                    break;
                case 1:
                    addChild(this.f10273q);
                    break;
                case 2:
                    addChild(this.f10272p);
                    break;
                case 3:
                    addChild(this.f10271o);
                    break;
                case 4:
                    addChild(this.f10275s);
                    break;
            }
        }
        addChild(this.f10276t);
        C3566b.f11839a.m2012a((C0975i) this, true);
        this.f10252O = new C0937a(this.f10272p) { // from class: com.tsf.shell.f.i.b.d.b.15
            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: e */
            public void mo1654e(MotionEvent motionEvent) {
                C3145b.f10237G.m5197a((C2603h.InterfaceC2610a) C3145b.this);
                C3145b.f10237G.m5199a((C0975i) C3145b.this);
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo527a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                C3145b.f10237G.m5200a(motionEvent, motionEvent2);
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: f */
            public void mo1653f(MotionEvent motionEvent) {
                C3145b.f10237G.m5201a(motionEvent);
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo502a(MotionEvent motionEvent) {
                C4187w.m614b();
                if (C3145b.this.f10248K == C3145b.f10239b) {
                    C3145b.this.m3365aR();
                } else {
                    C3145b.this.m3308m(true);
                }
            }
        };
        this.f10253P = new C0937a(this.f10272p) { // from class: com.tsf.shell.f.i.b.d.b.16
            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo527a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                C3145b.this.f10255R.m3206a(motionEvent, motionEvent2);
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: f */
            public void mo1653f(MotionEvent motionEvent) {
                C3145b.this.f10255R.m3191d();
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo502a(MotionEvent motionEvent) {
                C4187w.m614b();
                if (C3145b.this.f10248K == C3145b.f10239b) {
                    C3145b.this.m3365aR();
                } else {
                    C3145b.this.m3308m(true);
                }
            }
        };
        this.f10254Q = new C0937a(this.f10272p) { // from class: com.tsf.shell.f.i.b.d.b.17
            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo502a(MotionEvent motionEvent) {
                C4187w.m614b();
                if (C3145b.this.f10248K == C3145b.f10239b) {
                    C3145b.this.m3365aR();
                } else {
                    C3145b.this.m3308m(true);
                }
            }
        };
        this.f10260W = new C3105a(this, this) { // from class: com.tsf.shell.f.i.b.d.b.18
            @Override // com.tsf.shell.p096f.p153i.C3105a
            /* renamed from: h */
            public void mo3298h() {
            }

            @Override // com.tsf.shell.p096f.p153i.C3105a
            /* renamed from: a */
            public void mo3302a() {
            }

            @Override // com.tsf.shell.p096f.p153i.C3105a
            /* renamed from: a */
            public boolean mo3301a(AbstractC3208b abstractC3208b) {
                if (C3145b.this.m3362aU() == 2) {
                    C3145b.this.f10255R.m3188e();
                    if (C3145b.this.f10255R.m3194c() && C3430e.m2506as()) {
                        C3145b.this.f10255R.m3199a(false);
                        return true;
                    }
                }
                if (C3430e.m2506as()) {
                    C3145b.this.m3308m(false);
                }
                return true;
            }

            @Override // com.tsf.shell.p096f.p153i.C3105a
            /* renamed from: b */
            public void mo3300b(C3112b c3112b) {
                if (c3112b.visible() && c3112b.alpha() != 0.0f) {
                    C3145b.this.m3366aQ();
                }
            }

            @Override // com.tsf.shell.p096f.p153i.C3105a
            /* renamed from: c */
            public void mo3299c(C3112b c3112b) {
                super.mo3299c(c3112b);
                if (C3145b.this.f10248K == C3145b.f10238a) {
                    C3145b.this.m3348b((AbstractC3208b) c3112b);
                    return;
                }
                int m3273a = C3145b.this.f10271o.m3273a(c3112b);
                C3145b.this.f10271o.removeChild(c3112b);
                C3145b.this.m3389a((AbstractC3208b) c3112b, false);
                if (m3273a < C3145b.f10241l.f10412K) {
                    C3145b.this.m3381aB();
                    C3145b.f10242m.m3295a(C3145b.this);
                    C3145b.f10242m.m3292c(C3145b.this);
                }
            }
        };
        this.f10256S = new C2284a() { // from class: com.tsf.shell.f.i.b.d.b.19
            @Override // com.tsf.shell.p096f.p100b.C2284a, com.censivn.C3DEngine.p031b.p035c.C0915b.InterfaceC0918a
            /* renamed from: a */
            public void mo727a(int i, KeyEvent keyEvent) {
                if (i == 4 && C3145b.this.f10248K == C3145b.f10238a && C3145b.this.mouseEnabled() && !C3145b.this.f10271o.m5251v()) {
                    C3145b.this.m3308m(true);
                }
            }

            @Override // com.tsf.shell.p096f.p100b.C2284a, com.censivn.C3DEngine.p031b.p035c.C0915b.InterfaceC0918a
            /* renamed from: b */
            public void mo726b(int i, KeyEvent keyEvent) {
            }
        };
        ArrayList<ItemInfo> m678a = C4171h.m678a(((LauncherFolder3DInfo) itemInfo).getItemInfo(), itemInfo.config, ",", true);
        int size = m678a.size();
        for (int i = 0; i < size; i++) {
            ItemInfo itemInfo2 = m678a.get(i);
            if (i < f10241l.f10412K) {
                m3405a(itemInfo2, false);
            } else {
                m3405a(itemInfo2, true);
            }
        }
        m678a.clear();
        m3306n(true);
        m3358aY();
        m3340bh();
        f10242m.m3295a(this);
        f10242m.m3292c(this);
        if (!f10232B.contains(this)) {
            f10232B.add(this);
        }
    }

    /* renamed from: b */
    public void m3353b(int i) {
        Collections.sort(this.f10271o.children(), C3359a.f11109w.m2712b().m4597a(i).m4574b());
        this.f10271o.m3252k();
        this.f10271o.m3248o();
        m3373aJ();
    }

    /* renamed from: aB */
    public void m3381aB() {
        int m3360aW = m3360aW() > f10241l.f10412K ? f10241l.f10412K : m3360aW();
        for (int i = 0; i < m3360aW; i++) {
            AbstractC3208b abstractC3208b = (AbstractC3208b) this.f10271o.children().get((m3360aW() - i) - 1);
            m3401a(abstractC3208b, f10241l.f10413L.get(i));
            abstractC3208b.visible(true);
            abstractC3208b.alpha(255.0f);
        }
    }

    /* renamed from: aC */
    public boolean m3380aC() {
        return m3534K() instanceof LauncherDrawerFolder3DInfo;
    }

    /* renamed from: aD */
    public TextureElement m3379aD() {
        return this.f10277u;
    }

    @Override // com.tsf.shell.p096f.p153i.C3105a.InterfaceC3106a
    /* renamed from: b */
    public ArrayList<C0975i> mo2100b() {
        return this.f10271o.children();
    }

    /* renamed from: a */
    private void m3405a(ItemInfo itemInfo, boolean z) {
        AbstractC3208b abstractC3208b = (AbstractC3208b) itemInfo.getWidget();
        if (abstractC3208b == null) {
            abstractC3208b = C3519a.m2146a(itemInfo, z);
        }
        abstractC3208b.m3136g(0.0f);
        abstractC3208b.mouseEnabled(false);
        this.f10271o.addChild(abstractC3208b);
        abstractC3208b.setMouseEventListener(new C3142a(abstractC3208b, this));
        abstractC3208b.mo3462a(this.f10260W);
    }

    /* renamed from: aE */
    public C3105a m3378aE() {
        return this.f10260W;
    }

    /* renamed from: aF */
    public C3183g m3377aF() {
        return this.f10271o;
    }

    /* renamed from: aG */
    public ArrayList<C0975i> m3376aG() {
        return this.f10271o.children();
    }

    /* renamed from: aH */
    public C0981k m3375aH() {
        return this.f10276t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bc */
    public void m3345bc() {
        if (this.f10261X) {
            f10241l.m3229a(this, m3369aN());
        }
        f10242m.m3295a(this);
        this.f10261X = false;
    }

    /* renamed from: aI */
    public ComponentName[] m3374aI() {
        int size = this.f10271o.children().size();
        ComponentName[] componentNameArr = new ComponentName[size];
        for (int i = 0; i < size; i++) {
            componentNameArr[i] = ((C3222g) this.f10271o.children().get(i)).m3106bd().f11169b;
        }
        return componentNameArr;
    }

    /* renamed from: aJ */
    public void m3373aJ() {
        if (!this.f10269af) {
            LauncherFolder3DInfo launcherFolder3DInfo = (LauncherFolder3DInfo) m3534K();
            String str = "";
            for (int i = 0; i < this.f10271o.children().size(); i++) {
                str = str + ((AbstractC3208b) this.f10271o.children().get(i)).m3534K().f2532id + ",";
            }
            if (this.f10268ae) {
                launcherFolder3DInfo.config = str;
                C3359a.f11109w.m2708c().m2733a(launcherFolder3DInfo, 16);
                return;
            }
            launcherFolder3DInfo.onUpdateConfig(str);
        }
    }

    /* renamed from: aK */
    public void m3372aK() {
        this.f10247J.m3289a();
        m3342bf();
        m3343be();
        m3344bd();
        this.f10271o.position().f2526x = f10241l.m3224c().folder.childContainerX;
        this.f10271o.position().f2527y = f10241l.m3224c().folder.childContainerY;
        this.f10271o.removeFromParent();
        Iterator<Integer> it = f10241l.m3224c().folder.order.iterator();
        while (it.hasNext()) {
            switch (it.next().intValue()) {
                case 0:
                    addChild(this.f10274r);
                    break;
                case 1:
                    addChild(this.f10273q);
                    break;
                case 2:
                    addChild(this.f10272p);
                    break;
                case 3:
                    addChild(this.f10271o);
                    break;
                case 4:
                    addChild(this.f10275s);
                    break;
            }
        }
        C3566b.f11839a.m2012a((C0975i) this, true);
        f10241l.m3229a(this, m3369aN());
        m3352b(0, 0, 0, 0);
        m3387a((Runnable) null, false);
        if (this.f10106c) {
            if (f10241l.m3224c().folder.nameTextFormat.auto) {
                m3384a(true);
            } else {
                m3311l(true);
            }
        }
        m3366aQ();
    }

    /* renamed from: bd */
    private void m3344bd() {
        if (this.f10274r == null) {
            this.f10274r = new C0981k(f10241l.m3224c().folder.textPlaneWidth, f10241l.m3224c().folder.textPlaneHeight, 1, 1, false);
        } else {
            this.f10274r.mo10368a(f10241l.m3224c().folder.textPlaneWidth);
            this.f10274r.mo5215b(f10241l.m3224c().folder.textPlaneHeight);
        }
        this.f10274r.position().f2526x = f10241l.m3224c().folder.textPlaneX;
        this.f10274r.position().f2527y = f10241l.m3224c().folder.textPlaneY;
        this.f10274r.removeFromParent();
    }

    /* renamed from: be */
    private void m3343be() {
        if (this.f10276t == null) {
            this.f10276t = new C0981k(f10242m.f10325c, f10242m.f10326d, 1, 1, false);
        }
        if (!this.f10269af) {
            if (this.f10277u == null) {
                this.f10277u = C0853a.m10853g().m10545a(f10242m.f10325c, f10242m.f10326d, false);
            } else if (this.f10277u.width != f10242m.f10325c || this.f10277u.height != f10242m.f10326d) {
                C0853a.m10853g().m10543a(this.f10277u);
                this.f10277u = C0853a.m10853g().m10545a(f10242m.f10325c, f10242m.f10326d, false);
            }
            this.f10276t.textures().clear();
            this.f10276t.textures().addElement(this.f10277u);
        }
        this.f10276t.points().setPX(0, f10242m.f10329g, f10242m.f10328f, 0.0f);
        this.f10276t.points().setPX(1, f10242m.f10327e, f10242m.f10328f, 0.0f);
        this.f10276t.points().setPX(2, f10242m.f10329g, f10242m.f10330h, 0.0f);
        this.f10276t.points().setPX(3, f10242m.f10327e, f10242m.f10330h, 0.0f);
        this.f10276t.updatePointsVBO();
        this.f10276t.uvs().set(0, 1.0f, 0.0f);
        this.f10276t.uvs().set(1, 0.0f, 0.0f);
        this.f10276t.uvs().set(2, 1.0f, 1.0f);
        this.f10276t.uvs().set(3, 0.0f, 1.0f);
        this.f10276t.updateUvsVBO();
        this.f10276t.calAABB();
    }

    /* renamed from: bf */
    private void m3342bf() {
        if (f10241l.m3224c().folder.backPlaneEnable) {
            if (this.f10272p == null) {
                this.f10272p = new C0981k(f10241l.m3224c().folder.backPlaneWidth, f10241l.m3224c().folder.backPlaneHeight, 1, 1, false);
            } else {
                this.f10272p.mo10368a(f10241l.m3224c().folder.backPlaneWidth);
                this.f10272p.mo5215b(f10241l.m3224c().folder.backPlaneHeight);
                this.f10272p.removeFromParent();
            }
            this.f10272p.textures().clear();
            this.f10272p.textures().addElement(f10241l.f10446z);
            this.f10272p.position().f2526x = f10241l.m3224c().folder.backPlaneX;
            this.f10272p.position().f2527y = f10241l.m3224c().folder.backPlaneY;
            C3566b.f11839a.m2013a((C0975i) this.f10272p, -this.f10272p.position().f2526x, -this.f10272p.position().f2527y, true);
        } else if (this.f10272p != null) {
            this.f10272p.textures().clear();
            this.f10272p.removeFromParent();
        }
        if (f10241l.m3224c().folder.frontPlaneEnable) {
            if (this.f10273q == null) {
                this.f10273q = new C0981k(f10241l.m3224c().folder.frontPlaneWidth, f10241l.m3224c().folder.frontPlaneHeight, 1, 1, false);
            } else {
                this.f10273q.mo10368a(f10241l.m3224c().folder.frontPlaneWidth);
                this.f10273q.mo5215b(f10241l.m3224c().folder.frontPlaneHeight);
                this.f10273q.removeFromParent();
            }
            this.f10273q.textures().clear();
            this.f10273q.textures().addElement(f10241l.f10402A);
            this.f10273q.position().f2526x = f10241l.m3224c().folder.frontPlaneX;
            this.f10273q.position().f2527y = f10241l.m3224c().folder.frontPlaneY;
        } else if (this.f10273q != null) {
            this.f10273q.textures().clear();
            this.f10273q.removeFromParent();
        }
        if (f10241l.m3224c().folder.sizePlaneEnable) {
            if (this.f10275s == null) {
                this.f10275s = new C0981k(f10241l.m3224c().folder.sizePlaneWidth, f10241l.m3224c().folder.sizePlaneHeight, 1, 1, false);
            } else {
                this.f10275s.mo10368a(f10241l.m3224c().folder.sizePlaneWidth);
                this.f10275s.mo5215b(f10241l.m3224c().folder.sizePlaneHeight);
                this.f10275s.removeFromParent();
            }
            this.f10275s.position().f2526x = f10241l.m3224c().folder.sizePlaneX;
            this.f10275s.position().f2527y = f10241l.m3224c().folder.sizePlaneY;
        } else if (this.f10275s != null) {
            this.f10275s.textures().clear();
            this.f10275s.removeFromParent();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m3329c(AbstractC3208b abstractC3208b) {
        if (this.f10268ae) {
            if (!this.f10269af) {
                if (m3534K().f2532id == -1) {
                    C3359a.f11109w.m2708c().m2733a(m3534K(), 0);
                }
                abstractC3208b.m3534K().container = m3534K().f2532id;
                C3359a.f11109w.m2708c().m2733a(abstractC3208b.m3534K(), 132);
            }
        } else {
            abstractC3208b.m3534K().onUpdateContainer(m3534K().f2532id);
        }
        abstractC3208b.setMouseEventListener(new C3142a(abstractC3208b, this));
        abstractC3208b.mo3462a(this.f10260W);
        this.f10260W.m3569a((C0975i) abstractC3208b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m3389a(AbstractC3208b abstractC3208b, boolean z) {
        ArrayList<C3231c> av = abstractC3208b.m3061av();
        if (av != null && av.size() > 0) {
            Iterator<C3231c> it = av.iterator();
            while (it.hasNext()) {
                C3231c next = it.next();
                LauncherShortcut3DInfo launcherShortcut3DInfo = (LauncherShortcut3DInfo) next.m3534K();
                if (z && launcherShortcut3DInfo != null) {
                    launcherShortcut3DInfo.updateContainer(null, -1);
                }
                next.m3540B();
            }
        }
        LauncherShortcut3DInfo launcherShortcut3DInfo2 = (LauncherShortcut3DInfo) abstractC3208b.m3534K();
        if (z && launcherShortcut3DInfo2 != null) {
            launcherShortcut3DInfo2.updateContainer(null, -1);
        }
        abstractC3208b.m3540B();
        m3373aJ();
        m3340bh();
    }

    /* renamed from: aL */
    public void m3371aL() {
        m3384a(false);
    }

    /* renamed from: a */
    public void m3384a(boolean z) {
        if (f10241l.m3224c().folder.nameTextFormat.auto) {
            if (!this.f10281y || z) {
                this.f10281y = true;
                C3566b.f11839a.m2013a((C0975i) this.f10272p, -this.f10272p.position().f2526x, -this.f10272p.position().f2527y, false);
                C3566b.f11839a.m2012a((C0975i) this.f10276t, false);
                C3566b.f11839a.m2012a((C0975i) this, false);
                f10242m.m3295a(this);
            }
        }
    }

    /* renamed from: aM */
    public void m3370aM() {
        m3311l(false);
    }

    /* renamed from: l */
    public void m3311l(boolean z) {
        if (f10241l.m3224c().folder.nameTextFormat.auto || z) {
            if (this.f10281y || z) {
                this.f10281y = false;
                C3566b.f11839a.m2013a((C0975i) this.f10272p, -this.f10272p.position().f2526x, -this.f10272p.position().f2527y, true);
                C3566b.f11839a.m2012a((C0975i) this.f10276t, true);
                C3566b.f11839a.m2012a((C0975i) this, true);
                f10242m.m3295a(this);
            }
        }
    }

    /* renamed from: aN */
    public CharSequence m3369aN() {
        return m3534K().title;
    }

    /* renamed from: a */
    public void m3386a(final String str) {
        if (str != "") {
            if (this.f10268ae) {
                LauncherFolder3DInfo launcherFolder3DInfo = (LauncherFolder3DInfo) m3534K();
                launcherFolder3DInfo.title = str;
                C3359a.f11109w.m2708c().m2733a(launcherFolder3DInfo, 1);
            } else {
                m3534K().onUpdateName(str, false);
            }
            C0853a.m10865a().m10583c(new RenderRunnable(1, 1) { // from class: com.tsf.shell.f.i.b.d.b.20
                @Override // com.censivn.C3DEngine.api.message.RenderRunnable, java.lang.Runnable
                public void run() {
                    C3145b.f10241l.m3229a(C3145b.this, str);
                    C3145b.f10241l.m3228a(str);
                    if (C3145b.this.f10280x) {
                        C3145b.f10242m.m3295a(C3145b.this);
                    }
                }
            });
            invalidate();
        }
    }

    /* renamed from: bg */
    private void m3341bg() {
    }

    /* renamed from: aO */
    public void m3368aO() {
        C2234d.m6033a().m6030a("WidgetFolderBox");
    }

    /* renamed from: aP */
    public void m3367aP() {
        C2234d.m6033a().m6027b("WidgetFolderBox");
    }

    /* renamed from: c */
    public void m3333c(int i) {
        C0853a.m10865a().m10584b(new Runnable() { // from class: com.tsf.shell.f.i.b.d.b.21
            @Override // java.lang.Runnable
            public void run() {
                C2234d.m6033a().m6027b("WidgetFolderBox");
            }
        }, i);
    }

    /* renamed from: aQ */
    public void m3366aQ() {
        if (!this.f10263Z) {
            this.f10263Z = true;
            C0853a.m10865a().m10583c(new Runnable() { // from class: com.tsf.shell.f.i.b.d.b.2
                @Override // java.lang.Runnable
                public void run() {
                    C3145b.this.m3345bc();
                    C3145b.this.mo3118C();
                    C3145b.this.f10263Z = false;
                }
            });
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
    public boolean doubleSidedEnabled() {
        return m3375aH().doubleSidedEnabled();
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
    public void doubleSidedEnabled(boolean z) {
        m3375aH().doubleSidedEnabled(z);
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
    public void alpha(float f) {
        m3375aH().alpha(f);
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
    public float alpha() {
        return m3375aH().alpha();
    }

    @Override // com.tsf.shell.p096f.p153i.C3112b, com.tsf.shell.p096f.p118e.InterfaceC2557f
    /* renamed from: m */
    public int mo3310m() {
        return 1;
    }

    @Override // com.tsf.shell.p096f.p118e.InterfaceC2639m
    /* renamed from: e_ */
    public boolean mo3138e_() {
        return this.f10262Y;
    }

    @Override // com.tsf.shell.p096f.p118e.InterfaceC2639m
    /* renamed from: b */
    public void mo3142b(boolean z) {
        this.f10262Y = z;
    }

    @Override // com.tsf.shell.p096f.p118e.InterfaceC2639m
    /* renamed from: d */
    public boolean mo3141d() {
        return mouseEnabled();
    }

    /* renamed from: aR */
    public void m3365aR() {
        C1017d c1017d;
        this.f10265ab = false;
        f10240k = this;
        f10241l.m3232a(this.f10271o.numChildren());
        f10241l.m3220g();
        this.f10271o.m3254i();
        boolean z = this.f10281y;
        this.f10281y = false;
        f10242m.m3293b(this);
        this.f10281y = z;
        m3368aO();
        f10241l.m3228a(m3369aN());
        mouseEnabled(false);
        this.f10272p.setMouseEventListener(this.f10254Q);
        this.f10276t.setMouseEventListener(this.f10254Q);
        mouseSkip(true);
        if (m3534K().container != -1 || (m3534K() instanceof LauncherDrawerFolder3DInfo)) {
            Number3d.TEMPNUMBER3D.reset();
            Number3d.TEMPNUMBER3D2.setAll(1.0f, 1.0f, 1.0f);
            localToGlobal(Number3d.TEMPNUMBER3D);
            localScaleToGlobale(Number3d.TEMPNUMBER3D2);
            this.f10264aa = C2285c.m5957a(this);
            ((C0980j) parent()).replaceChild(this, this.f10264aa);
            position().setAllFrom(Number3d.TEMPNUMBER3D);
            scale().setAllFrom(Number3d.TEMPNUMBER3D2);
            if (m3380aC()) {
                this.f10270ag = C3359a.f11088b.m10571a();
                C3359a.f11088b.m10559b(Home.m6177b());
            }
        }
        this.f10257T = C3359a.f11096j.m2229a(this.f10256S);
        switch (C3430e.m2507ar()) {
            case 0:
                c1017d = new C1017d();
                m3338bj();
                c1017d.m10313a((InterfaceC1011b) new C0986a.C0991b.C0994c());
                break;
            case 1:
                c1017d = new C1017d() { // from class: com.tsf.shell.f.i.b.d.b.3
                    @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                    /* renamed from: a */
                    public void mo732a() {
                        C3145b.this.m3338bj();
                    }
                };
                c1017d.m10313a((InterfaceC1011b) new C0986a.C0991b.C0994c());
                break;
            default:
                c1017d = new C1017d();
                m3338bj();
                c1017d.m10313a((InterfaceC1011b) new C0986a.C0991b.C0994c());
                break;
        }
        c1017d.m10294l(1.0f);
        c1017d.m10293m(1.0f);
        c1017d.mo10301f(0.0f);
        c1017d.mo10298h(0 - f10241l.f10433m);
        c1017d.m10303e(0.0f);
        C1014c.m10326a(this);
        C1014c.m10325a(this, 350, c1017d);
        f10241l.m3231a(500, this);
        removeFromParent();
        C3359a.f11096j.m2220c();
        f10241l.f10407F.removeFromParent();
        f10241l.f10407F.addChild(this);
        this.f10257T.addChild(f10241l.f10407F);
        this.f10249L = position().m13946clone();
        this.f10250M = rotation().m13946clone();
        m3341bg();
    }

    /* renamed from: aS */
    public boolean m3364aS() {
        return f10240k == this;
    }

    /* renamed from: m */
    public void m3308m(final boolean z) {
        if (!this.f10282z && !this.f10265ab && !f10241l.m3223d()) {
            this.f10265ab = true;
            f10240k = null;
            m3335bm();
            m3368aO();
            this.f10260W.m3561g();
            f10241l.m3227a(z);
            Runnable runnable = new Runnable() { // from class: com.tsf.shell.f.i.b.d.b.4
                @Override // java.lang.Runnable
                public void run() {
                    C1017d c1017d;
                    C3187j c3187j = C3145b.f10241l;
                    C3187j.f10395N.alpha(0.0f);
                    C3187j c3187j2 = C3145b.f10241l;
                    C3187j.f10396O.alpha(0.0f);
                    if (C3145b.this.f10264aa != null) {
                        if (C3145b.this.f10264aa.parent() instanceof C2346a) {
                            C2355b m5733a = C3359a.f11093g.f7458a.m5733a(C3145b.this.f10264aa);
                            C3145b.this.f10249L.f2526x = m5733a.f7716a;
                            C3145b.this.f10249L.f2527y = m5733a.f7717b;
                            C3145b.this.f10250M.f2528z = m5733a.f7720e;
                        } else {
                            Number3d.TEMPNUMBER3D.reset();
                            Number3d number3d = Number3d.TEMPNUMBER3D;
                            C3145b.this.f10264aa.localToGlobal(number3d);
                            C3145b.this.f10249L.f2526x = number3d.f2526x;
                            C3145b.this.f10249L.f2527y = number3d.f2527y;
                            C3145b.this.f10250M.f2528z = C3145b.this.f10264aa.rotation().f2528z;
                        }
                    }
                    if (z) {
                        if (C3145b.this.f10264aa != null) {
                            Number3d.TEMPNUMBER3D2.setAll(1.0f, 1.0f, 1.0f);
                            C3145b.this.f10264aa.localScaleToGlobale(Number3d.TEMPNUMBER3D2);
                            c1017d = new C1017d();
                            c1017d.mo10301f(C3145b.this.f10249L.f2526x);
                            c1017d.mo10298h(C3145b.this.f10249L.f2527y);
                            c1017d.m10294l(Number3d.TEMPNUMBER3D2.f2526x);
                            c1017d.m10293m(Number3d.TEMPNUMBER3D2.f2527y);
                            c1017d.m10314a(255);
                            c1017d.m10303e(C3145b.this.f10250M.f2528z);
                        } else {
                            if (C0892a.f2564O) {
                                C3145b.this.f10249L.f2526x = C3145b.this.m3534K().cellX;
                                C3145b.this.f10249L.f2527y = C3145b.this.m3534K().cellY;
                                C3145b.this.f10250M.f2528z = C3145b.this.m3534K().rotation;
                            } else {
                                C3145b.this.f10249L.f2526x = C3145b.this.m3534K().cellXH;
                                C3145b.this.f10249L.f2527y = C3145b.this.m3534K().cellYH;
                                C3145b.this.f10250M.f2528z = C3145b.this.m3534K().rotationH;
                            }
                            c1017d = new C1017d();
                            c1017d.mo10301f(C3145b.this.f10249L.f2526x);
                            c1017d.mo10298h(C3145b.this.f10249L.f2527y);
                            c1017d.m10303e(C3145b.this.f10250M.f2528z);
                        }
                        C1014c.m10325a(C3145b.this, 380, c1017d);
                    } else {
                        if (C3145b.this.f10264aa == null) {
                            if (C0892a.f2564O) {
                                C3145b.this.f10249L.f2526x = C3145b.this.m3534K().cellX;
                                C3145b.this.f10249L.f2527y = C3145b.this.m3534K().cellY;
                                C3145b.this.f10250M.f2528z = C3145b.this.m3534K().rotation;
                            } else {
                                C3145b.this.f10249L.f2526x = C3145b.this.m3534K().cellXH;
                                C3145b.this.f10249L.f2527y = C3145b.this.m3534K().cellYH;
                                C3145b.this.f10250M.f2528z = C3145b.this.m3534K().rotationH;
                            }
                        }
                        C3145b.this.position().f2526x = C3145b.this.f10249L.f2526x;
                        C3145b.this.position().f2527y = C3145b.this.f10249L.f2527y;
                        C3145b.this.rotation().f2528z = C3145b.this.f10250M.f2528z;
                    }
                    C3359a.f11096j.m2225a(new Runnable() { // from class: com.tsf.shell.f.i.b.d.b.4.1
                        @Override // java.lang.Runnable
                        public void run() {
                            C3145b.this.removeFromParent();
                            C3145b.f10241l.f10407F.removeFromParent();
                            if (C3145b.this.f10264aa != null) {
                                ((C0980j) C3145b.this.f10264aa.parent()).replaceChild(C3145b.this.f10264aa, C3145b.this);
                                C2285c.m5956a(C3145b.this.f10264aa);
                                C3145b.this.f10264aa = null;
                            } else {
                                C3359a.f11094h.m4031n().m4229a(C3145b.this);
                            }
                            if (C3145b.this.f10251N != null) {
                                ArrayList<C3231c> av = C3145b.this.f10251N.m3061av();
                                if (av != null && av.size() > 0) {
                                    Iterator<C3231c> it = av.iterator();
                                    while (it.hasNext()) {
                                        ((C3142a) it.next().getMouseEventListener()).m3418a();
                                    }
                                }
                                if (!((C3142a) C3145b.this.f10251N.getMouseEventListener()).m3418a()) {
                                    C3145b.this.f10251N.getMouseEventListener().mo2119d(C0864d.m10805d().m10798f());
                                }
                                C3145b.this.f10251N.mouseEnabled(true);
                                C3145b.this.f10251N = null;
                            }
                            C3145b.this.mouseSkip(false);
                            C3145b.f10241l.m3215l();
                            C3359a.f11096j.m2224b();
                            C3145b.this.m3340bh();
                            C3145b.this.f10248K = C3145b.f10239b;
                            C3145b.this.f10265ab = false;
                            if (C3145b.this.m3380aC() && !C3145b.this.f10270ag) {
                                C3359a.f11088b.m10552c(Home.m6177b());
                            }
                        }
                    }, z);
                }
            };
            if (C3430e.m2507ar() == 1) {
                if (m3360aW() == 0) {
                    m3387a(runnable, z);
                    return;
                } else {
                    m3387a(runnable, z);
                    return;
                }
            }
            if (m3360aW() == 0) {
                m3387a((Runnable) null, z);
            } else {
                m3387a((Runnable) null, z);
            }
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bh */
    public void m3340bh() {
        if (m3360aW() >= this.f10258U) {
            this.f10272p.setMouseEventListener(this.f10253P);
            this.f10276t.setMouseEventListener(this.f10253P);
            this.f10246I = 2;
            return;
        }
        this.f10272p.setMouseEventListener(this.f10252O);
        this.f10276t.setMouseEventListener(this.f10252O);
        this.f10246I = 1;
    }

    /* renamed from: aT */
    public boolean m3363aT() {
        return m3360aW() == 0;
    }

    /* renamed from: aU */
    public int m3362aU() {
        return this.f10246I;
    }

    /* renamed from: aV */
    public int m3361aV() {
        return this.f10248K;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: aW */
    public int m3360aW() {
        return this.f10271o.numChildren();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public void m3306n(boolean z) {
        if (z) {
            f10241l.m3229a(this, m3369aN());
        }
    }

    /* renamed from: o */
    public void m3305o(boolean z) {
        this.f10272p.mouseEnabled(z);
        this.f10276t.mouseEnabled(z);
    }

    /* renamed from: b */
    public int m3354b(float f, float f2) {
        float[] m595b = C4189x.m595b(f, f2);
        float f3 = m595b[0];
        float f4 = m595b[1];
        int m3277a = this.f10271o.m3277a(f3, f4);
        if (m3277a != -1) {
            return m3277a;
        }
        if (f3 > f10241l.f10426f || f3 < (-f10241l.f10426f) || f4 < (-f10241l.f10427g)) {
            return -2;
        }
        this.f10266ac.f2526x = f3;
        this.f10266ac.f2527y = f4;
        this.f10271o.globalToLocal(this.f10266ac);
        float f5 = this.f10266ac.f2526x + (f10241l.f10429i / 2);
        int i = (int) ((f5 - f10241l.f10432l) / f10241l.f10429i);
        int i2 = -((int) ((((this.f10266ac.f2527y - (f10241l.f10430j / 2)) - this.f10271o.m3250m()) - f10241l.f10431k) / f10241l.f10430j));
        if (i < 0) {
            i = 0;
        } else if (i > f10241l.f10421a - 1) {
            i = f10241l.f10421a - 1;
        }
        int i3 = ((i2 >= 0 ? i2 : 0) * f10241l.f10421a) + i;
        int m3360aW = m3360aW() - 1;
        return i3 <= m3360aW ? i3 : m3360aW;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public Number3d m3327d(int i) {
        int i2 = f10241l.f10432l + ((i % f10241l.f10421a) * f10241l.f10429i);
        int i3 = f10241l.f10431k - ((i / f10241l.f10421a) * f10241l.f10430j);
        this.f10266ac.f2526x = i2;
        this.f10266ac.f2527y = i3;
        return this.f10266ac;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m3392a(AbstractC3208b abstractC3208b) {
        if (this.f10268ae) {
            C3359a.f11109w.m2707d().m4807c();
        }
        this.f10271o.m3249n();
        this.f10251N = abstractC3208b;
        this.f10251N.mouseEnabled(false);
        m3306n(true);
        m3389a(abstractC3208b, true);
        m3308m(true);
    }

    /* renamed from: aX */
    public C0980j m3359aX() {
        return this.f10271o;
    }

    /* renamed from: aY */
    public void m3358aY() {
        int size = this.f10271o.children().size();
        int i = f10241l.m3224c().folder.sampleCount;
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC3208b abstractC3208b = (AbstractC3208b) this.f10271o.children().get((size - i2) - 1);
            if (i2 < i) {
                m3401a(abstractC3208b, f10241l.m3224c().folder.sampleList.get(i2));
            } else {
                abstractC3208b.visible(false);
                m3401a(abstractC3208b, f10241l.m3224c().folder.sampleList.get(i2 % f10241l.m3224c().folder.sampleList.size()));
            }
        }
    }

    /* renamed from: a */
    public void m3387a(Runnable runnable, boolean z) {
        m3383a(true, runnable, z);
    }

    /* renamed from: bi */
    private void m3339bi() {
        if (this.f10259V != null) {
            this.f10259V.m10311a((Runnable) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m3383a(boolean z, final Runnable runnable, boolean z2) {
        int i;
        int i2;
        int i3;
        Runnable runnable2;
        int i4;
        int m3360aW = m3360aW();
        int i5 = VEasing.Linear.easeNone;
        int i6 = 0;
        if (m3360aW > 0) {
            f10242m.m3293b(this);
            int i7 = f10241l.m3224c().folder.sampleCount;
            AbstractC3208b abstractC3208b = null;
            int i8 = m3360aW - 1;
            while (i8 > -1) {
                final AbstractC3208b abstractC3208b2 = (AbstractC3208b) this.f10271o.children().get((m3360aW - i8) - 1);
                abstractC3208b2.mouseEnabled(false);
                C1017d c1017d = null;
                if (i8 < i7) {
                    ThemeFolderDescription.SystemFolderChild systemFolderChild = f10241l.m3224c().folder.sampleList.get(i8);
                    if (abstractC3208b2.scale().f2526x == 0.0f) {
                        abstractC3208b2.position().setAllFrom(systemFolderChild.position);
                        abstractC3208b2.rotation().setAllFrom(systemFolderChild.rotation);
                    }
                    abstractC3208b2.alpha(255.0f);
                    c1017d = new C1017d() { // from class: com.tsf.shell.f.i.b.d.b.5
                        @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                        /* renamed from: a */
                        public void mo518a(float f) {
                            if (abstractC3208b2.m3156aJ() != 0.0f) {
                                abstractC3208b2.m3136g(1.0f - f);
                            }
                        }
                    };
                    if (abstractC3208b2.position().f2526x != systemFolderChild.position.f2526x) {
                        c1017d.mo10301f(systemFolderChild.position.f2526x);
                    }
                    if (abstractC3208b2.position().f2527y != systemFolderChild.position.f2527y) {
                        c1017d.mo10298h(systemFolderChild.position.f2527y);
                    }
                    if (abstractC3208b2.position().f2528z != systemFolderChild.position.f2528z) {
                        c1017d.m10296j(systemFolderChild.position.f2528z);
                    }
                    if (abstractC3208b2.rotation().f2526x != systemFolderChild.rotation.f2526x) {
                        c1017d.m10307c(systemFolderChild.rotation.f2526x);
                    }
                    if (abstractC3208b2.rotation().f2527y != systemFolderChild.rotation.f2527y) {
                        c1017d.m10305d(systemFolderChild.rotation.f2527y);
                    }
                    if (abstractC3208b2.rotation().f2528z != systemFolderChild.rotation.f2528z) {
                        c1017d.m10303e(systemFolderChild.rotation.f2528z);
                    }
                    if (abstractC3208b2.scale().f2526x != systemFolderChild.scale.f2526x) {
                        c1017d.m10294l(systemFolderChild.scale.f2526x);
                    }
                    if (abstractC3208b2.scale().f2527y != systemFolderChild.scale.f2527y) {
                        c1017d.m10293m(systemFolderChild.scale.f2527y);
                    }
                    if (abstractC3208b2.scale().f2528z != systemFolderChild.scale.f2528z) {
                        c1017d.m10292n(systemFolderChild.scale.f2528z);
                    }
                } else {
                    ThemeFolderDescription.SystemFolderChild systemFolderChild2 = f10241l.m3224c().folder.sampleList.get(i8 % i7);
                    if (abstractC3208b2.visible()) {
                        c1017d = new C1017d() { // from class: com.tsf.shell.f.i.b.d.b.6
                            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                            /* renamed from: a */
                            public void mo732a() {
                                abstractC3208b2.visible(false);
                            }

                            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                            /* renamed from: a */
                            public void mo518a(float f) {
                                if (abstractC3208b2.m3156aJ() != 0.0f) {
                                    abstractC3208b2.m3136g(1.0f - f);
                                }
                            }
                        };
                        if (abstractC3208b2.position().f2526x != systemFolderChild2.position.f2526x) {
                            c1017d.mo10301f(systemFolderChild2.position.f2526x);
                        }
                        if (abstractC3208b2.position().f2527y != systemFolderChild2.position.f2527y) {
                            c1017d.mo10298h(systemFolderChild2.position.f2527y);
                        }
                        if (abstractC3208b2.position().f2528z != systemFolderChild2.position.f2528z) {
                            c1017d.m10296j(systemFolderChild2.position.f2528z);
                        }
                        if (abstractC3208b2.rotation().f2526x != systemFolderChild2.rotation.f2526x) {
                            c1017d.m10307c(systemFolderChild2.rotation.f2526x);
                        }
                        if (abstractC3208b2.rotation().f2527y != systemFolderChild2.rotation.f2527y) {
                            c1017d.m10305d(systemFolderChild2.rotation.f2527y);
                        }
                        if (abstractC3208b2.rotation().f2528z != systemFolderChild2.rotation.f2528z) {
                            c1017d.m10303e(systemFolderChild2.rotation.f2528z);
                        }
                        if (abstractC3208b2.scale().f2526x != systemFolderChild2.scale.f2526x) {
                            c1017d.m10294l(systemFolderChild2.scale.f2526x);
                        }
                        if (abstractC3208b2.scale().f2527y != systemFolderChild2.scale.f2527y) {
                            c1017d.m10293m(systemFolderChild2.scale.f2527y);
                        }
                        if (abstractC3208b2.scale().f2528z != systemFolderChild2.scale.f2528z) {
                            c1017d.m10292n(systemFolderChild2.scale.f2528z);
                        }
                        c1017d.m10314a(0);
                    } else {
                        abstractC3208b2.position().setAllFrom(systemFolderChild2.position);
                        abstractC3208b2.rotation().setAllFrom(systemFolderChild2.rotation);
                        abstractC3208b2.scale().setAllFrom(systemFolderChild2.scale);
                        abstractC3208b2.alpha(0.0f);
                    }
                }
                if (c1017d != null) {
                    if (!z) {
                        i = i6;
                        i3 = i5;
                    } else if (!z2) {
                        int i9 = i6;
                        i3 = 0;
                        i = i9;
                    } else {
                        switch (C3430e.m2507ar()) {
                            case 0:
                                i4 = VEasing.Linear.easeNone;
                                break;
                            case 1:
                                i4 = VEasing.Linear.easeNone;
                                c1017d.m10309b(i6);
                                break;
                            default:
                                i4 = VEasing.Linear.easeNone;
                                c1017d.m10309b(i6);
                                break;
                        }
                        int i10 = i6 + 40;
                        i3 = i4;
                        i = i10;
                    }
                    if (i8 == 0) {
                        if (i3 == 0) {
                            runnable2 = new Runnable() { // from class: com.tsf.shell.f.i.b.d.b.7
                                @Override // java.lang.Runnable
                                public void run() {
                                    C0853a.m10865a().m10583c(new Runnable() { // from class: com.tsf.shell.f.i.b.d.b.7.1
                                        @Override // java.lang.Runnable
                                        public void run() {
                                            C3145b.this.m3388a(runnable);
                                        }
                                    });
                                }
                            };
                        } else {
                            runnable2 = new Runnable() { // from class: com.tsf.shell.f.i.b.d.b.8
                                @Override // java.lang.Runnable
                                public void run() {
                                    C3145b.this.m3388a(runnable);
                                }
                            };
                        }
                        c1017d.m10311a(runnable2);
                        this.f10259V = c1017d;
                        i2 = i3;
                    } else {
                        C1014c.m10326a(abstractC3208b2);
                        C1014c.m10325a(abstractC3208b2, i3, c1017d);
                        abstractC3208b2.visible(true);
                        abstractC3208b2 = abstractC3208b;
                        i2 = i3;
                    }
                } else {
                    abstractC3208b2 = abstractC3208b;
                    i = i6;
                    i2 = i5;
                }
                i8--;
                i5 = i2;
                i6 = i;
                abstractC3208b = abstractC3208b2;
            }
            C1014c.m10326a(abstractC3208b);
            C1014c.m10325a(abstractC3208b, i5, this.f10259V);
            abstractC3208b.visible(true);
            return;
        }
        m3388a(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m3388a(Runnable runnable) {
        m3333c(300);
        if (runnable != null) {
            runnable.run();
        }
        if (!this.f10244A && !this.f10269af) {
            f10242m.m3295a(this);
            f10242m.m3292c(this);
        }
        this.f10259V = null;
        mouseEnabled(true);
    }

    /* renamed from: a */
    private void m3401a(C0975i c0975i, ThemeFolderDescription.SystemFolderChild systemFolderChild) {
        c0975i.position().setAllFrom(systemFolderChild.position);
        c0975i.rotation().setAllFrom(systemFolderChild.rotation);
        c0975i.scale().setAllFrom(systemFolderChild.scale);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bj */
    public void m3338bj() {
        int m3360aW = m3360aW();
        if (m3360aW == 0) {
            m3337bk();
            return;
        }
        final int i = m3360aW > f10241l.f10423c ? m3360aW - f10241l.f10423c : 0;
        ArrayList<ThemeFolderDescription.SystemFolderChild> arrayList = f10241l.m3224c().folder.sampleList;
        for (int i2 = 0; i2 < i; i2++) {
            AbstractC3208b abstractC3208b = (AbstractC3208b) this.f10271o.children().get((i - 1) - i2);
            if (i2 < arrayList.size()) {
                abstractC3208b.alpha(255.0f);
                abstractC3208b.visible(true);
            } else {
                abstractC3208b.alpha(0.0f);
            }
        }
        int i3 = m3360aW - 1;
        while (true) {
            final int i4 = i3;
            if (i4 > i - 1) {
                final AbstractC3208b abstractC3208b2 = (AbstractC3208b) this.f10271o.children().get(i4);
                abstractC3208b2.alpha(255.0f);
                Number3d m3327d = m3327d((m3360aW - i4) - 1);
                C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.i.b.d.b.9
                    @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                    /* renamed from: a */
                    public void mo518a(float f) {
                        abstractC3208b2.visible(true);
                        abstractC3208b2.m3136g(f);
                    }

                    @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                    /* renamed from: a */
                    public void mo732a() {
                        if (i4 == i) {
                            C3145b.this.m3337bk();
                        }
                        abstractC3208b2.mouseEnabled(true);
                    }
                };
                c1017d.mo10301f(m3327d.f2526x);
                c1017d.mo10298h(m3327d.f2527y);
                if (abstractC3208b2.position().f2528z != 0.0f) {
                    c1017d.m10296j(0.0f);
                }
                if (abstractC3208b2.rotation().f2526x != 0.0f) {
                    c1017d.m10307c(0.0f);
                }
                if (abstractC3208b2.rotation().f2527y != 0.0f) {
                    c1017d.m10305d(0.0f);
                }
                if (abstractC3208b2.rotation().f2528z != 0.0f) {
                    c1017d.m10303e(0.0f);
                }
                if (abstractC3208b2.scale().f2526x != 1.0f) {
                    c1017d.m10294l(1.0f);
                }
                if (abstractC3208b2.scale().f2527y != 1.0f) {
                    c1017d.m10293m(1.0f);
                }
                if (abstractC3208b2.scale().f2528z != 1.0f) {
                    c1017d.m10292n(1.0f);
                }
                switch (C3430e.m2507ar()) {
                    case 0:
                        break;
                    case 1:
                        c1017d.m10309b(((m3360aW - i4) - 1) * 40);
                        break;
                    default:
                        c1017d.m10309b(((m3360aW - i4) - 1) * 40);
                        break;
                }
                C1014c.m10326a(abstractC3208b2);
                C1014c.m10325a(abstractC3208b2, VEasing.Linear.easeNone, c1017d);
                i3 = i4 - 1;
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bk */
    public void m3337bk() {
        mouseEnabled(true);
        this.f10248K = f10238a;
        m3367aP();
        if (m3360aW() > 6) {
            C3591c.m1944a(2);
        } else if (m3360aW() == 0) {
            C3591c.m1944a(1);
        }
        m3336bl();
    }

    /* renamed from: bl */
    private void m3336bl() {
        this.f10271o.m3256g();
    }

    /* renamed from: bm */
    private void m3335bm() {
        this.f10271o.m3255h();
    }

    /* renamed from: c */
    public void m3328c(ArrayList<AbstractC3208b> arrayList) {
        m3385a(arrayList, false);
    }

    /* renamed from: a */
    public void m3385a(ArrayList<AbstractC3208b> arrayList, boolean z) {
        this.f10267ad = arrayList;
        m3304p(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bn */
    public void m3334bn() {
        this.f10267ad.clear();
    }

    @Override // com.tsf.shell.p096f.p118e.C2603h.InterfaceC2610a
    /* renamed from: l_ */
    public C2640n mo1655l_() {
        return null;
    }

    /* renamed from: b */
    public void m3352b(int i, int i2, int i3, int i4) {
        if (f10240k == this) {
            position().f2527y = 0 - f10241l.f10433m;
            f10241l.f10406E.position().f2527y = f10241l.f10428h;
        }
        this.f10271o.m3275a(i, i2, i3, i4);
    }

    @Override // com.tsf.shell.p096f.p153i.C3112b
    /* renamed from: ae */
    public void mo3356ae() {
        if (this.f10263Z) {
            m3345bc();
            mo3118C();
            this.f10263Z = false;
        }
    }

    @Override // com.tsf.shell.p096f.p118e.C2603h.InterfaceC2610a
    /* renamed from: a */
    public void mo1663a(InterfaceC2639m interfaceC2639m) {
        if (interfaceC2639m instanceof AbstractC3208b) {
            AbstractC3208b abstractC3208b = (AbstractC3208b) interfaceC2639m;
            if (this.f10267ad == null) {
                this.f10267ad = new ArrayList<>();
            }
            if (abstractC3208b.m3068ao()) {
                abstractC3208b.m3065ar();
            }
            this.f10267ad.add(abstractC3208b);
            abstractC3208b.setDefaultColor(C3567c.f11844c);
        }
    }

    @Override // com.tsf.shell.p096f.p118e.C2603h.InterfaceC2610a
    /* renamed from: f */
    public void mo1656f() {
        m3304p(false);
    }

    /* renamed from: p */
    public void m3304p(boolean z) {
        C1017d c1017d;
        if (this.f10267ad != null) {
            int size = this.f10267ad.size();
            if (size > 0) {
                f10242m.m3293b(this);
                mouseEnabled(false);
            }
            for (int i = 0; i < size; i++) {
                final AbstractC3208b abstractC3208b = this.f10267ad.get(i);
                abstractC3208b.clearDefaultColor();
                abstractC3208b.position().setAllFrom(globalToLocal(abstractC3208b.position()));
                abstractC3208b.removeFromParent();
                this.f10271o.addChild(abstractC3208b);
                if (i == size - 1) {
                    c1017d = new C1017d() { // from class: com.tsf.shell.f.i.b.d.b.10
                        @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                        /* renamed from: a */
                        public void mo732a() {
                            Iterator it = C3145b.this.f10267ad.iterator();
                            while (it.hasNext()) {
                                C3145b.this.m3329c((AbstractC3208b) it.next());
                            }
                            C3145b.this.m3306n(true);
                            C3145b.this.m3383a(false, (Runnable) null, true);
                            C3145b.this.m3373aJ();
                            C3145b.this.m3334bn();
                            C3145b.this.m3340bh();
                        }

                        @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                        /* renamed from: a */
                        public void mo518a(float f) {
                            abstractC3208b.m3136g(1.0f - f);
                        }
                    };
                } else {
                    c1017d = new C1017d() { // from class: com.tsf.shell.f.i.b.d.b.11
                        @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                        /* renamed from: a */
                        public void mo518a(float f) {
                            abstractC3208b.m3136g(1.0f - f);
                        }
                    };
                }
                if (z) {
                    int i2 = f10241l.m3224c().folder.sampleCount;
                    C1014c.m10326a(abstractC3208b);
                    if (i < size - i2) {
                        abstractC3208b.alpha(255.0f);
                        abstractC3208b.visible(false);
                    } else {
                        c1017d.mo10301f(0.0f);
                        c1017d.mo10298h(C0892a.f2567c * 100.0f);
                        c1017d.m10303e(0.0f);
                        c1017d.m10314a(255);
                        C1014c.m10325a(abstractC3208b, 500, c1017d);
                    }
                } else {
                    c1017d.mo10301f(0.0f);
                    c1017d.mo10298h(C0892a.f2567c * 100.0f);
                    c1017d.m10303e(0.0f);
                    c1017d.m10314a(255);
                    C1014c.m10326a(abstractC3208b);
                    C1014c.m10325a(abstractC3208b, 500, c1017d);
                }
            }
        }
    }

    @Override // com.tsf.shell.p096f.p118e.p119a.InterfaceC2453a
    /* renamed from: e */
    public void mo3324e() {
        this.f10282z = true;
        C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.i.b.d.b.13
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo518a(float f) {
                float alpha = C3145b.this.f10272p.alpha();
                if (C3145b.this.f10273q != null) {
                    C3145b.this.f10273q.alpha(alpha);
                }
                C3145b.this.f10274r.alpha(alpha);
            }
        };
        c1017d.m10314a(0);
        C1014c.m10326a(this.f10272p);
        C1014c.m10325a(this.f10272p, 300, c1017d);
        m3377aF().m3263b(0.1f);
    }

    @Override // com.tsf.shell.p096f.p118e.p119a.InterfaceC2453a
    /* renamed from: i */
    public void mo3318i() {
        C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.i.b.d.b.14
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo518a(float f) {
                float alpha = C3145b.this.f10272p.alpha();
                if (C3145b.this.f10273q != null) {
                    C3145b.this.f10273q.alpha(alpha);
                }
                C3145b.this.f10274r.alpha(alpha);
            }
        };
        c1017d.m10314a(255);
        C1014c.m10326a(this.f10272p);
        C1014c.m10325a(this.f10272p, 300, c1017d);
        m3341bg();
        this.f10282z = false;
    }

    @Override // com.tsf.shell.p096f.p118e.p119a.InterfaceC2453a
    /* renamed from: h */
    public void mo3320h() {
    }

    /* renamed from: b */
    public void m3348b(AbstractC3208b abstractC3208b) {
        if (this.f10271o.children().contains(abstractC3208b)) {
            this.f10271o.removeChild(abstractC3208b);
            m3306n(true);
            m3373aJ();
            m3341bg();
        }
    }

    @Override // com.tsf.shell.p096f.p118e.p119a.InterfaceC2453a
    /* renamed from: a */
    public void mo3402a(C0975i c0975i, C3222g c3222g) {
        C3222g m3109ba = c3222g.m3109ba();
        Number3d.TEMPNUMBER3D3.reset();
        Number3d globalToLocal = this.f10271o.globalToLocal(c0975i.localToGlobal(Number3d.TEMPNUMBER3D3));
        globalToLocal.f2527y -= this.f10271o.m3251l();
        m3109ba.position().f2526x = globalToLocal.f2526x;
        m3109ba.position().f2527y = globalToLocal.f2527y;
        Number3d m3327d = m3327d(this.f10271o.numChildren());
        this.f10271o.addChildAt(m3109ba, 0);
        C3183g.C3184a m3276a = this.f10271o.m3276a(0);
        m3276a.f10384r = true;
        float f = m3327d.f2526x;
        m3276a.f10367a = f;
        m3276a.f10375i = f;
        float f2 = m3327d.f2527y;
        m3276a.f10368b = f2;
        m3276a.f10376j = f2;
        m3276a.f10385s = 255.0f;
        m3276a.f10369c = 0.0f;
        m3276a.f10371e = 1.0f;
        m3329c((AbstractC3208b) m3109ba);
        m3109ba.mouseEnabled(true);
        m3306n(true);
        this.f10271o.m3263b(0.2f);
        m3373aJ();
    }

    @Override // com.tsf.shell.p096f.p153i.C3231c, com.tsf.shell.p096f.p153i.C3112b
    /* renamed from: c */
    public void mo3056c() {
        super.mo3056c();
    }

    @Override // com.tsf.shell.p096f.p153i.C3231c
    /* renamed from: a */
    public ArrayList<Integer> mo3079a(ArrayList<Integer> arrayList) {
        arrayList.add(3);
        arrayList.add(2);
        arrayList.add(7);
        arrayList.add(4);
        if (rotation().f2528z != 0.0f) {
            arrayList.add(6);
        }
        return arrayList;
    }

    @Override // com.tsf.shell.p096f.p153i.C3112b, com.tsf.shell.p096f.p118e.InterfaceC2557f
    /* renamed from: a */
    public void mo2062a(InterfaceC2557f interfaceC2557f) {
        super.mo2062a(interfaceC2557f);
        if (interfaceC2557f instanceof AbstractC3208b) {
            this.f10247J.m3287a((C0975i) interfaceC2557f);
        }
    }

    /* renamed from: a */
    public void m3403a(C0975i c0975i) {
        this.f10247J.m3287a(c0975i);
    }

    /* renamed from: aZ */
    public void m3357aZ() {
        this.f10244A = true;
    }

    /* renamed from: ba */
    public void m3347ba() {
        this.f10244A = false;
    }

    @Override // com.tsf.shell.p096f.p153i.C3112b, com.tsf.shell.p096f.p118e.InterfaceC2557f
    /* renamed from: d */
    public void mo3140d(InterfaceC2557f interfaceC2557f) {
        super.mo3140d(interfaceC2557f);
        if (interfaceC2557f instanceof AbstractC3208b) {
            this.f10247J.m3284b((C0975i) interfaceC2557f);
        }
    }

    @Override // com.tsf.shell.p096f.p153i.C3112b, com.tsf.shell.p096f.p118e.InterfaceC2557f
    /* renamed from: c */
    public void mo3332c(InterfaceC2557f interfaceC2557f) {
        super.mo3332c(interfaceC2557f);
    }

    @Override // com.tsf.shell.p096f.p153i.C3112b, com.tsf.shell.p096f.p118e.InterfaceC2557f
    /* renamed from: a */
    public boolean mo2061a(InterfaceC2557f interfaceC2557f, float f, float f2) {
        return (interfaceC2557f instanceof C3231c) && ((C3231c) interfaceC2557f).m3062au();
    }

    @Override // com.tsf.shell.p096f.p153i.C3112b, com.tsf.shell.p096f.p118e.InterfaceC2557f
    /* renamed from: b */
    public boolean mo2057b(InterfaceC2557f interfaceC2557f) {
        return interfaceC2557f instanceof AbstractC3208b;
    }

    @Override // com.tsf.shell.p096f.p153i.C3112b, com.tsf.shell.p096f.p118e.InterfaceC2557f
    /* renamed from: e */
    public void mo3139e(InterfaceC2557f interfaceC2557f) {
        super.mo3332c(interfaceC2557f);
        this.f10247J.m3284b((C0975i) interfaceC2557f);
        AbstractC3208b abstractC3208b = (AbstractC3208b) interfaceC2557f;
        ArrayList<AbstractC3208b> arrayList = new ArrayList<>();
        if (abstractC3208b.m3064as()) {
            ArrayList<C3231c> aw = abstractC3208b.m3060aw();
            int size = aw.size();
            for (int i = 0; i < size; i++) {
                arrayList.add((AbstractC3208b) aw.get((size - i) - 1));
            }
        }
        arrayList.add(abstractC3208b);
        m3339bi();
        m3328c(arrayList);
    }

    @Override // com.tsf.shell.p096f.p153i.C3112b, com.censivn.C3DEngine.p031b.p038f.C0980j, com.censivn.C3DEngine.p031b.p038f.C0975i
    public void destroy() {
        Iterator it = ((ArrayList) this.f10271o.children().clone()).iterator();
        while (it.hasNext()) {
            C0975i c0975i = (C0975i) it.next();
            if (c0975i instanceof C3112b) {
                AbstractC3208b abstractC3208b = (AbstractC3208b) c0975i;
                abstractC3208b.m3540B();
                if (!this.f10268ae) {
                    C3359a.f11095i.m1647a(abstractC3208b);
                } else {
                    c0975i.removeFromParent();
                }
            }
        }
        super.destroy();
        this.f10251N = null;
        this.f10252O = null;
        this.f10253P = null;
        this.f10254Q = null;
        this.f10255R.m3207a();
        C0853a.m10853g().m10543a(this.f10278v);
        C0853a.m10853g().m10543a(this.f10277u);
        if (this.f10279w != null) {
            C0853a.m10853g().m10543a(this.f10279w);
        }
        this.f10277u = null;
        f10232B.remove(this);
    }
}
