package com.tsf.shell.p096f.p131f;

import android.annotation.SuppressLint;
import android.view.KeyEvent;
import android.view.MotionEvent;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.p030a.C0855b;
import com.censivn.C3DEngine.p030a.C0864d;
import com.censivn.C3DEngine.p030a.C0869e;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p035c.C0915b;
import com.censivn.C3DEngine.p031b.p035c.C0925e;
import com.censivn.C3DEngine.p031b.p036d.C0937a;
import com.censivn.C3DEngine.p031b.p038f.C0960a;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.censivn.C3DEngine.p031b.p041g.p043b.C1013b;
import com.tsf.C1306b;
import com.tsf.shell.C2244e;
import com.tsf.shell.Home;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.p168b.C3430e;
import com.tsf.shell.manager.p174f.C3470a;
import com.tsf.shell.manager.p175g.C3489a;
import com.tsf.shell.manager.p183o.C3567c;
import com.tsf.shell.manager.p185p.C3591c;
import com.tsf.shell.manager.p187r.p193c.C3712d;
import com.tsf.shell.p095e.C2269f;
import com.tsf.shell.p096f.C2370d;
import com.tsf.shell.p096f.p118e.C2477c;
import com.tsf.shell.p096f.p118e.C2627j;
import com.tsf.shell.p096f.p118e.p125e.C2530a;
import com.tsf.shell.p096f.p118e.p125e.C2535b;
import com.tsf.shell.p096f.p118e.p127g.AbstractC2593d;
import com.tsf.shell.p096f.p131f.C2989o;
import com.tsf.shell.p096f.p131f.p132a.C2862h;
import com.tsf.shell.p096f.p131f.p143c.C2913a;
import com.tsf.shell.p096f.p131f.p144d.C2920a;
import com.tsf.shell.p096f.p146g.p147a.C2992b;
import com.tsf.shell.p096f.p153i.C3112b;
import com.tsf.shell.p096f.p153i.p154a.C3108b;
import com.tsf.shell.p096f.p153i.p154a.C3109c;
import com.tsf.shell.p096f.p153i.p155b.p157b.C3124a;
import com.tsf.shell.p096f.p153i.p155b.p160e.C3211c;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.description.ThemeShellDescription;
import com.tsf.shell.theme.inside.mix.menu.DynamicTextureElement;
import com.tsf.shell.utils.C4187w;
import com.tsf.shell.utils.C4189x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
/* renamed from: com.tsf.shell.f.f.n */
/* loaded from: classes.dex */
public class C2951n implements C0915b.InterfaceC0918a, C0925e.InterfaceC0934a {

    /* renamed from: a */
    public static int f9588a;

    /* renamed from: b */
    public static int f9589b;

    /* renamed from: c */
    public static float f9590c;

    /* renamed from: A */
    private Runnable f9591A;

    /* renamed from: B */
    private C0980j f9592B;

    /* renamed from: C */
    private Runnable f9593C;

    /* renamed from: D */
    private C2992b f9594D;

    /* renamed from: E */
    private C3712d f9595E;

    /* renamed from: F */
    private C2920a f9596F;

    /* renamed from: J */
    private C3112b f9600J;

    /* renamed from: L */
    private ArrayList<Integer> f9602L;

    /* renamed from: M */
    private Runnable f9603M;

    /* renamed from: d */
    public C2913a f9606d;

    /* renamed from: f */
    private C2951n f9608f;

    /* renamed from: g */
    private C2627j f9609g;

    /* renamed from: h */
    private C0980j f9610h;

    /* renamed from: i */
    private C0960a f9611i;

    /* renamed from: j */
    private C2862h f9612j;

    /* renamed from: k */
    private ArrayList<C2932g> f9613k;

    /* renamed from: l */
    private ArrayList<Integer> f9614l;

    /* renamed from: m */
    private C2932g f9615m;

    /* renamed from: n */
    private int f9616n;

    /* renamed from: p */
    private C2269f f9618p;

    /* renamed from: q */
    private C2932g f9619q;

    /* renamed from: r */
    private C2932g f9620r;

    /* renamed from: s */
    private int f9621s;

    /* renamed from: u */
    private Runnable f9623u;

    /* renamed from: v */
    private C3470a f9624v;

    /* renamed from: w */
    private C2969b f9625w;

    /* renamed from: x */
    private C2977c f9626x;

    /* renamed from: y */
    private C0937a f9627y;

    /* renamed from: z */
    private C0937a f9628z;

    /* renamed from: o */
    private boolean f9617o = false;

    /* renamed from: t */
    private int f9622t = 2;

    /* renamed from: K */
    private ArrayList<C2932g> f9601K = new ArrayList<>();

    /* renamed from: N */
    private boolean f9604N = false;

    /* renamed from: e */
    boolean f9607e = true;

    /* renamed from: O */
    private boolean f9605O = false;

    /* renamed from: I */
    private Object f9599I = this;

    /* renamed from: H */
    private C2530a f9598H = new C2530a() { // from class: com.tsf.shell.f.f.n.1
        @Override // com.tsf.shell.p096f.p118e.p125e.C2530a
        /* renamed from: a */
        public void mo4004a(int i, Object obj) {
            m5329c();
            C3359a.f11094h.m4061b((C3112b) obj);
        }

        @Override // com.tsf.shell.p096f.p118e.p125e.C2530a
        /* renamed from: a */
        public float mo4005a() {
            return C3359a.f11093g.f7458a.m5709j() ? C0892a.f2571g + (C0892a.f2572h * 2) : C0892a.f2572h * 2;
        }
    };

    /* renamed from: G */
    private C2989o f9597G = new C2989o();

    public C2951n() {
        this.f9597G.m3849a(new C2989o.C2990a() { // from class: com.tsf.shell.f.f.n.8
            @Override // com.tsf.shell.p096f.p131f.C2989o.C2990a
            /* renamed from: a */
            public void mo3846a(C2932g c2932g) {
                C2951n.this.f9609g.m5119b(c2932g.m4183r() - 1);
            }
        });
        C3108b.f10077d = this;
        C3109c.f10085a = this;
        C3359a.f11088b.m10565a(this);
        this.f9608f = this;
        m4083aa();
        m4082ab();
    }

    /* renamed from: a */
    public C3470a m4100a() {
        return this.f9624v;
    }

    /* renamed from: b */
    public C2530a m4067b() {
        return this.f9598H;
    }

    /* renamed from: c */
    public C2989o m4060c() {
        return this.f9597G;
    }

    /* renamed from: a */
    public void m4087a(C3112b c3112b) {
        this.f9600J = c3112b;
    }

    /* renamed from: d */
    public void m4055d() {
        this.f9600J = null;
    }

    /* renamed from: a */
    public void m4098a(int i) {
        this.f9609g.m5124a(i - 1);
    }

    /* renamed from: e */
    public void m4051e() {
        C2932g.m4178w();
        this.f9612j.m4445av();
    }

    @Override // com.censivn.C3DEngine.p031b.p035c.C0925e.InterfaceC0934a
    /* renamed from: a */
    public void mo1664a(int i, int i2, int i3, int i4) {
        m4108S();
        this.f9624v.m2287a(i, i2, i3, i4);
        C0853a.m10865a().m10583c(new Runnable() { // from class: com.tsf.shell.f.f.n.9
            @Override // java.lang.Runnable
            public void run() {
                C2951n.this.m4116K();
            }
        });
    }

    /* renamed from: S */
    private void m4108S() {
        f9588a = (int) ((C0892a.f2555F * 0.28f) + (C0892a.f2566b * 90.0f));
        f9589b = (int) ((C0892a.f2556G * 0.28f) + (C0892a.f2566b * 90.0f));
        f9590c = (f9588a - (C0892a.f2566b * 90.0f)) / 2.0f;
        C2932g.m4176y();
        if (this.f9596F != null) {
            this.f9596F.m4307a(C0892a.f2555F, C0892a.f2556G);
        }
        if (this.f9592B != null) {
            this.f9592B.setAABBPX(-2.1474836E9f, -C0892a.f2558I, 0.0f, 2.1474836E9f, C0892a.f2558I, 0.0f);
        }
        if (this.f9626x != null) {
            this.f9626x.m3934a(C0892a.f2551B, C0892a.f2552C, C0892a.f2590z, C0892a.f2550A);
        }
        if (this.f9625w != null) {
            this.f9625w.m3993a(C0892a.f2551B, C0892a.f2552C, C0892a.f2590z, C0892a.f2550A);
        }
    }

    /* renamed from: f */
    public C0980j m4047f() {
        C2942j.m4165a();
        this.f9606d = new C2913a();
        this.f9609g = new C2627j(true) { // from class: com.tsf.shell.f.f.n.10
            @Override // com.tsf.shell.p096f.p118e.C2627j
            /* renamed from: a */
            public void mo4003a() {
                C3359a.f11093g.f7458a.m5708k();
            }
        };
        this.f9611i = new C0960a() { // from class: com.tsf.shell.f.f.n.11
            @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
            public void onDrawStart() {
                C2951n.this.f9626x.m3907c();
                C2951n.this.m4114M();
            }

            @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
            public void onDrawEnd() {
                C2951n.this.m4113N();
            }
        };
        this.f9594D = new C2992b();
        this.f9596F = new C2920a(this) { // from class: com.tsf.shell.f.f.n.12
            @Override // com.tsf.shell.p096f.p131f.p144d.C2920a
            /* renamed from: a */
            public void mo4002a() {
                C3359a.f11102p.m5312c();
                C0915b.m10597a(C2951n.this.f9608f);
            }

            @Override // com.tsf.shell.p096f.p131f.p144d.C2920a
            /* renamed from: b */
            public void mo4001b() {
                C2951n.this.f9622t = 1;
                C2951n.this.f9611i.setAnimationObjectState(false);
                if (C2951n.this.f9593C != null) {
                    C2951n.this.f9593C.run();
                    C2951n.this.f9593C = null;
                }
            }

            @Override // com.tsf.shell.p096f.p131f.p144d.C2920a
            /* renamed from: c */
            public void mo4000c() {
                C2951n.this.m4069ao();
            }
        };
        m4108S();
        this.f9625w = new C2969b();
        this.f9610h = new C0980j() { // from class: com.tsf.shell.f.f.n.13
            @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
            @SuppressLint({"WrongCall"})
            public void onDrawStart() {
            }
        };
        this.f9595E = new C3712d() { // from class: com.tsf.shell.f.f.n.14
            @Override // com.tsf.shell.manager.p187r.p193c.C3712d
            /* renamed from: e */
            public void mo1657e() {
            }

            @Override // com.tsf.shell.manager.p187r.p193c.C3712d
            /* renamed from: d */
            public void mo1658d() {
            }
        };
        this.f9626x = new C2977c();
        this.f9611i.setAnimationObjectState(true);
        this.f9618p = Home.m6177b().m6164l();
        this.f9592B = new C0980j();
        this.f9624v = new C3470a(this.f9592B);
        this.f9592B.setAABBPX(-2.1474836E9f, -C0892a.f2558I, 0.0f, 2.1474836E9f, C0892a.f2558I, 0.0f);
        this.f9627y = new C3108b(this.f9592B);
        this.f9628z = new C0937a(this.f9592B);
        this.f9592B.setMouseEventListener(this.f9627y);
        this.f9592B.mouseEnabled(false);
        this.f9591A = new Runnable() { // from class: com.tsf.shell.f.f.n.15
            @Override // java.lang.Runnable
            public void run() {
                if (C2951n.this.f9600J != null) {
                    if (C2951n.this.f9600J instanceof C3124a) {
                        C3124a c3124a = (C3124a) C2951n.this.f9600J;
                        if (C2951n.this.f9615m.m4182s() != null && C2951n.this.f9615m != C2951n.this.f9619q) {
                            if (!C2951n.this.f9615m.m4182s().m5994a(c3124a.m3534K().width * c3124a.m3534K().height, c3124a.f10163g)) {
                                C2951n.this.m4009y();
                                C2244e.m6020a(C1306b.C1315i.out_of_space);
                            }
                        }
                        C2951n.this.m4011x();
                        return;
                    }
                    C2951n.this.m4011x();
                    return;
                }
                C2951n.this.m4011x();
            }
        };
        for (int i = 0; i < this.f9613k.size(); i++) {
            C2932g c2932g = this.f9613k.get(i);
            c2932g.mo4177x();
            m4053d(c2932g);
        }
        this.f9610h.addChild(this.f9592B);
        this.f9610h.addChild(this.f9611i);
        this.f9626x = new C2977c();
        m4081ac();
        this.f9624v.m2286a(this.f9615m);
        if (this.f9620r == null) {
            m4097a(this.f9613k.get(1));
        }
        this.f9620r.m4257D();
        m4079ae();
        m4045g();
        m4075ai();
        m4098a(this.f9616n);
        this.f9597G.m3850a(this.f9615m);
        return this.f9610h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T */
    public void m4107T() {
        this.f9592B.setMouseEventListener(this.f9628z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U */
    public void m4106U() {
        this.f9592B.setMouseEventListener(this.f9627y);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m4058c(C2932g c2932g) {
        this.f9613k.remove(c2932g);
        this.f9601K.add(c2932g);
    }

    /* renamed from: e */
    private C2932g m4050e(int i) {
        C2932g m4104W = m4104W();
        m4104W.m4209b(i);
        this.f9613k.add(m4104W);
        return m4104W;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V */
    public C2932g m4105V() {
        if (this.f9601K.size() == 0) {
            C2932g m4104W = m4104W();
            m4104W.m4209b(m4101Z().intValue());
            this.f9613k.add(m4104W);
            return m4104W;
        }
        C2932g remove = this.f9601K.remove(0);
        remove.m4190k();
        remove.mo1664a(C0892a.f2551B, C0892a.f2552C, C0892a.f2590z, C0892a.f2550A);
        return remove;
    }

    /* renamed from: W */
    private C2932g m4104W() {
        return new C2945k();
    }

    /* renamed from: X */
    private C2932g m4103X() {
        if (this.f9612j == null) {
            this.f9612j = new C2862h();
            this.f9612j.m4209b(-1);
            this.f9613k.add(this.f9612j);
        }
        return this.f9612j;
    }

    /* renamed from: Y */
    private void m4102Y() {
        this.f9614l = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            this.f9614l.add(Integer.valueOf(i));
        }
    }

    /* renamed from: a */
    private Integer m4086a(Integer num) {
        if (this.f9614l.contains(num)) {
            this.f9614l.remove(num);
            return num;
        }
        return this.f9614l.remove(0);
    }

    /* renamed from: Z */
    private Integer m4101Z() {
        return this.f9614l.remove(0);
    }

    /* renamed from: b */
    public boolean m4065b(int i) {
        return this.f9602L.contains(Integer.valueOf(i));
    }

    /* renamed from: aa */
    private void m4083aa() {
        boolean z;
        String[] split = C3430e.m2512am().split(",");
        this.f9602L = new ArrayList<>();
        for (String str : split) {
            try {
                Integer valueOf = Integer.valueOf(Integer.parseInt(str));
                Iterator<Integer> it = this.f9602L.iterator();
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
                    this.f9602L.add(valueOf);
                }
            } catch (Exception e) {
            }
        }
    }

    /* renamed from: ab */
    private void m4082ab() {
        int i;
        m4102Y();
        int m2514ak = C3430e.m2514ak();
        int m2513al = C3430e.m2513al();
        this.f9613k = new ArrayList<>();
        int size = this.f9602L.size();
        if (size > 16) {
            i = 16;
        } else {
            i = size < 1 ? 1 : size;
        }
        m4103X();
        int i2 = 0;
        while (i2 < i) {
            int intValue = i2 < size ? this.f9602L.get(i2).intValue() : 0;
            if (intValue != -1) {
                m4050e(m4086a(Integer.valueOf(intValue)).intValue());
            }
            i2++;
        }
        if (this.f9612j == null) {
            m4103X();
        }
        int size2 = this.f9613k.size();
        for (int i3 = 0; i3 < size2; i3++) {
            C2932g c2932g = this.f9613k.get(i3);
            c2932g.m4232a(i3);
            if (i3 > 0) {
                if (i3 == 1) {
                    if (size2 == 2) {
                        c2932g.m4206b((C2932g) null);
                        c2932g.m4224a((C2932g) null);
                    } else {
                        c2932g.m4206b(this.f9613k.get(i3 + 1));
                        c2932g.m4224a(this.f9613k.get(size2 - 1));
                    }
                } else if (i3 == size2 - 1) {
                    if (size2 == 3) {
                        c2932g.m4206b((C2932g) null);
                        c2932g.m4224a(this.f9613k.get(1));
                    } else {
                        c2932g.m4206b(this.f9613k.get(1));
                        c2932g.m4224a(this.f9613k.get(i3 - 1));
                    }
                } else {
                    c2932g.m4206b(this.f9613k.get(i3 + 1));
                    c2932g.m4224a(this.f9613k.get(i3 - 1));
                }
            }
            c2932g.position().f2526x = i3 * f9590c;
            if (c2932g.m4181t() == m2514ak && m2514ak != -1) {
                this.f9615m = c2932g;
            }
            if (c2932g.m4181t() == m2513al && m2513al != -1) {
                this.f9620r = c2932g;
                m4097a(c2932g);
            }
        }
        if (this.f9615m == null) {
            this.f9615m = this.f9613k.get(1);
        }
        int m4183r = this.f9615m.m4183r();
        for (int i4 = 0; i4 < size2; i4++) {
            C2932g c2932g2 = this.f9613k.get(i4);
            if (i4 < m4183r) {
                c2932g2.f9541g = -1.0f;
            } else if (i4 > m4183r) {
                c2932g2.f9541g = 1.0f;
            } else {
                c2932g2.f9541g = 0.0f;
            }
        }
    }

    /* renamed from: g */
    public void m4045g() {
        m4085a(C3430e.m2562J());
    }

    /* renamed from: a */
    public void m4085a(boolean z) {
        if (z) {
            if (this.f9616n == 2 || this.f9616n == 3) {
                this.f9613k.get(1).m4224a((C2932g) null);
                this.f9613k.get(this.f9616n - 1).m4206b((C2932g) null);
            } else {
                this.f9613k.get(1).m4224a(this.f9613k.get(this.f9616n - 1));
                this.f9613k.get(this.f9616n - 1).m4206b(this.f9613k.get(1));
            }
        } else {
            this.f9613k.get(1).m4224a((C2932g) null);
            this.f9613k.get(this.f9616n - 1).m4206b((C2932g) null);
        }
        this.f9612j.m4224a((C2932g) null);
        this.f9612j.m4206b((C2932g) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public void m4053d(final C2932g c2932g) {
        C0975i m4187n = c2932g.m4187n();
        if (m4187n != null) {
            m4187n.calAABB(1.0f, 1.5f, 1.0f);
            C2967a c2967a = new C2967a(m4187n);
            c2967a.m3999a(c2932g);
            c2932g.m4208b(c2967a);
            c2932g.m4230a(new C3108b(m4187n) { // from class: com.tsf.shell.f.f.n.2
                @Override // com.tsf.shell.p096f.p153i.p154a.C3108b, com.censivn.C3DEngine.p031b.p036d.C0937a
                /* renamed from: a */
                public void mo502a(MotionEvent motionEvent) {
                    if (C2951n.this.f9622t == 1 || C2951n.this.f9622t == 3) {
                        C2951n.this.m4094a(c2932g, true, true);
                        C2951n.this.m4011x();
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ac */
    public void m4081ac() {
        int i;
        int i2 = 0;
        Iterator<C2932g> it = this.f9613k.iterator();
        while (true) {
            i = i2;
            if (!it.hasNext()) {
                break;
            }
            i2 = !it.next().m4184q() ? i + 1 : i;
        }
        if (i != this.f9616n) {
            this.f9616n = i;
            this.f9596F.m4309a(this.f9616n);
            m4098a(this.f9616n);
        }
    }

    /* renamed from: c */
    public float m4059c(int i) {
        return -(i * f9590c);
    }

    /* renamed from: h */
    public C2627j m4043h() {
        return this.f9609g;
    }

    /* renamed from: a */
    public void m4097a(C2932g c2932g) {
        if (!c2932g.m4184q() && c2932g.m4181t() != -1) {
            if (this.f9622t == 2) {
                this.f9620r = c2932g;
            } else {
                if (this.f9620r != null) {
                    this.f9620r.m4257D();
                }
                this.f9620r = c2932g;
                this.f9620r.m4258C();
            }
            C3430e.m2436o(c2932g.m4181t());
        }
    }

    /* renamed from: i */
    public C2969b m4041i() {
        return this.f9625w;
    }

    /* renamed from: j */
    public C2992b m4039j() {
        return this.f9594D;
    }

    /* renamed from: k */
    public C2932g m4037k() {
        return this.f9619q;
    }

    /* renamed from: b */
    public void m4061b(C3112b c3112b) {
        ((C3109c) c3112b.getMouseEventListener()).m3551a(true);
        c3112b.mo3502f_();
        m4013w();
    }

    /* renamed from: l */
    public int m4035l() {
        return this.f9616n;
    }

    /* renamed from: m */
    public int m4033m() {
        return this.f9622t;
    }

    /* renamed from: n */
    public C2932g m4031n() {
        return this.f9615m;
    }

    /* renamed from: o */
    public C2932g m4029o() {
        return this.f9613k.get(1);
    }

    /* renamed from: p */
    public C2932g m4027p() {
        return this.f9613k.get(this.f9613k.size() - 1);
    }

    /* renamed from: q */
    public int m4025q() {
        return this.f9613k.get(1).m4181t();
    }

    /* renamed from: r */
    public C2920a m4023r() {
        return this.f9596F;
    }

    /* renamed from: s */
    public C2977c m4021s() {
        return this.f9626x;
    }

    /* renamed from: d */
    public C2932g m4054d(int i) {
        Iterator<C2932g> it = this.f9613k.iterator();
        while (it.hasNext()) {
            C2932g next = it.next();
            if (next.m4181t() == i) {
                return next;
            }
        }
        Iterator<C2932g> it2 = this.f9613k.iterator();
        while (it2.hasNext()) {
            C2932g next2 = it2.next();
            if (next2.m4181t() != -1) {
                return next2;
            }
        }
        return null;
    }

    /* renamed from: t */
    public C2862h m4019t() {
        return this.f9612j;
    }

    /* renamed from: u */
    public C0980j m4017u() {
        return this.f9611i;
    }

    /* renamed from: v */
    public C0980j m4015v() {
        return this.f9610h;
    }

    /* renamed from: w */
    public void m4013w() {
        if (!this.f9617o && !this.f9626x.m3938a()) {
            this.f9621s = 1;
            this.f9611i.invalidate();
        }
    }

    /* renamed from: x */
    public void m4011x() {
        m4080ad();
        this.f9621s = 2;
        this.f9611i.invalidate();
    }

    /* renamed from: b */
    public void m4064b(C2932g c2932g) {
        this.f9619q = c2932g;
    }

    /* renamed from: y */
    public void m4009y() {
        if (this.f9619q != null) {
            if (this.f9619q.m4181t() == -1) {
                Iterator<C2932g> it = this.f9613k.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C2932g next = it.next();
                    if (next.m4181t() != -1) {
                        this.f9619q = next;
                        break;
                    }
                }
            }
            m4094a(this.f9619q, true, true);
        }
    }

    /* renamed from: ad */
    private void m4080ad() {
        if (this.f9603M != null) {
            C0853a.m10865a().m10578g(this.f9603M);
            this.f9603M = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ae */
    public void m4079ae() {
        float m4059c = m4059c(this.f9615m.m4183r());
        this.f9615m.position().f2526x = -m4059c;
        this.f9611i.position().f2526x = m4059c;
    }

    /* renamed from: a */
    public boolean m4096a(C2932g c2932g, Runnable runnable, Runnable runnable2) {
        if (m4127B()) {
            try {
                if (c2932g != this.f9615m) {
                    if (runnable != null) {
                        runnable.run();
                    }
                    C3359a.f11094h.m4078af();
                    this.f9626x.m3912b(c2932g, runnable2);
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

    /* renamed from: af */
    private void m4078af() {
        this.f9612j.m4206b(m4029o());
        m4029o().m4224a((C2932g) this.f9612j);
        m4027p().m4206b((C2932g) null);
    }

    /* renamed from: z */
    public void m4007z() {
        if (C0869e.m10758l()) {
            if (this.f9620r != this.f9615m) {
                if (this.f9615m == this.f9612j) {
                    this.f9619q = this.f9620r;
                    m4021s().m3905c(VEasing.Linear.easeNone);
                    return;
                }
                m4096a(this.f9620r, (Runnable) null, (Runnable) null);
                return;
            }
            return;
        }
        C0853a.m10865a().m10583c(new Runnable() { // from class: com.tsf.shell.f.f.n.3
            @Override // java.lang.Runnable
            public void run() {
                C2951n.this.m4007z();
            }
        });
    }

    /* renamed from: A */
    public void m4129A() {
        if (C0869e.m10758l()) {
            if (m4127B()) {
                try {
                    if (this.f9620r != this.f9615m) {
                        if (this.f9615m == this.f9612j) {
                            this.f9619q = this.f9620r;
                            m4021s().m3905c(VEasing.Linear.easeNone);
                        } else {
                            m4096a(this.f9620r, (Runnable) null, (Runnable) null);
                        }
                    } else if (this.f9615m != this.f9612j) {
                        m4021s().m3905c(VEasing.Linear.easeNone);
                    }
                    return;
                } catch (Exception e) {
                    return;
                }
            }
            return;
        }
        C0853a.m10865a().m10583c(new Runnable() { // from class: com.tsf.shell.f.f.n.4
            @Override // java.lang.Runnable
            public void run() {
                C2951n.this.m4129A();
            }
        });
    }

    /* renamed from: B */
    public boolean m4127B() {
        return this.f9622t == 2 && C3359a.f11089c.m2243c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ag */
    public void m4077ag() {
        C2269f.setMouseEnabled(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ah */
    public void m4076ah() {
        C2269f.setMouseEnabled(true);
    }

    /* renamed from: a */
    public void m4099a(final float f, final float f2, final float f3, final float f4) {
        this.f9596F.m4310a(f, f2, f3, f4, this.f9605O);
        C0853a.m10865a().m10585b(new Runnable() { // from class: com.tsf.shell.f.f.n.5
            @Override // java.lang.Runnable
            public void run() {
                C2951n.this.m4066b(f, f2, f3, f4);
            }
        });
    }

    /* renamed from: b */
    public void m4066b(float f, float f2, float f3, float f4) {
        if (this.f9622t != 4 && this.f9622t != 2) {
            C3359a.f11092f.m1615a(f / C0892a.f2553D);
            C2932g c2932g = this.f9613k.get(this.f9596F.m4308a(this.f9616n, f, f2, f3, f4, this.f9605O));
            if (c2932g != this.f9615m) {
                m4094a(c2932g, true, false);
                m4080ad();
                this.f9603M = this.f9591A;
                C0853a.m10865a().m10584b(this.f9603M, 1400L);
            }
        }
    }

    /* renamed from: a */
    public void m4094a(C2932g c2932g, boolean z, boolean z2) {
        if (z) {
            this.f9615m.killFocus();
            this.f9615m = c2932g;
            this.f9615m.setFocus();
        } else {
            this.f9615m.m4255F();
            this.f9615m = c2932g;
            this.f9615m.m4256E();
        }
        m4075ai();
        if (z2) {
            this.f9597G.m3850a(this.f9615m);
        }
    }

    /* renamed from: ai */
    private void m4075ai() {
        m4049e(this.f9615m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public void m4049e(C2932g c2932g) {
        C3211c.m3123h(((-c2932g.m4183r()) / this.f9616n) * 360.0f);
    }

    /* renamed from: C */
    public void m4125C() {
        this.f9604N = true;
        m4011x();
    }

    /* renamed from: aj */
    private void m4074aj() {
        this.f9612j.position().f2526x = -f9590c;
        this.f9612j.position().f2527y = 0.0f;
        this.f9612j.rotation().f2527y = 0.0f;
        this.f9612j.m4199d(false);
        this.f9612j.removeFromParent();
        this.f9611i.addChild(this.f9612j);
        m4094a((C2932g) this.f9612j, true, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ak */
    public void m4073ak() {
        C3359a.f11108v.f7770c.m5572f();
        this.f9607e = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: al */
    public void m4072al() {
        this.f9607e = true;
    }

    /* renamed from: am */
    private void m4071am() {
        m4077ag();
    }

    @SuppressLint({"WrongCall"})
    /* renamed from: D */
    public void m4123D() {
        if (this.f9622t != 2 && this.f9622t != 4) {
            this.f9596F.m4298d();
        } else if (this.f9622t != 3 && this.f9622t != 1) {
            C3359a.f11100n.m2084i();
            m4073ak();
            this.f9605O = this.f9600J != null;
            this.f9624v.m2284b();
            this.f9597G.m3851a();
            C3359a.f11089c.m2252a(this.f9599I);
            this.f9611i.setAnimationObjectState(true);
            if (this.f9622t == 2) {
                this.f9615m.m4240V();
                this.f9619q = this.f9615m;
                this.f9592B.mouseEnabled(true);
            }
            this.f9620r.m4258C();
            this.f9612j.m4444aw();
            this.f9615m.m4199d(true);
            this.f9622t = 3;
            if (this.f9623u != null) {
                this.f9623u.run();
                this.f9623u = null;
            }
            this.f9596F.m4302a(this, this.f9616n, this.f9613k, this.f9615m, this.f9605O);
        }
    }

    /* renamed from: an */
    private void m4070an() {
        if (this.f9622t != 4 && this.f9622t != 2) {
            if (this.f9604N) {
                m4074aj();
            }
            C3359a.f11100n.m2083j();
            C3359a.f11089c.m2251a(this.f9599I, true);
            this.f9624v.m2286a(this.f9615m);
            this.f9597G.m3848b();
            this.f9597G.m3850a(this.f9615m);
            C0915b.m10594b(this);
            this.f9611i.setAnimationObjectState(true);
            if (this.f9605O && !this.f9604N) {
                this.f9617o = true;
                if (m4121F() == -1) {
                    C2244e.m6012a(C0853a.m10856d().getString(C1306b.C1315i.notic_widget_forbid_add));
                    m4009y();
                }
            }
            this.f9604N = false;
            this.f9622t = 4;
            this.f9620r.m4257D();
            this.f9612j.m4443ax();
            this.f9596F.m4301a(this, this.f9613k, this.f9615m, this.f9605O);
            this.f9615m.f9541g = 0.0f;
            m4084a(true, "hdieSelect");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ao */
    public void m4069ao() {
        C2932g m4031n;
        this.f9592B.mouseEnabled(false);
        Runnable runnable = new Runnable() { // from class: com.tsf.shell.f.f.n.6
            @Override // java.lang.Runnable
            public void run() {
                if (C2951n.this.f9615m.m4181t() == -1) {
                    C0864d.m10805d().m10810c().m3556a(false);
                } else {
                    C0864d.m10805d().m10810c().m3556a(true);
                }
                C2951n.this.m4076ah();
                C3430e.m2439n(C2951n.this.f9615m.m4181t());
                C2951n.this.f9622t = 2;
            }
        };
        if (this.f9600J != null) {
            C3109c c3109c = (C3109c) this.f9600J.getMouseEventListener();
            c3109c.m3551a(false);
            if (!c3109c.m3554a() && (m4031n = C3359a.f11094h.m4031n()) != null) {
                this.f9600J.removeFromParent();
                m4031n.m4229a(this.f9600J);
            }
            this.f9600J.mo3051o_();
            m4055d();
            this.f9617o = false;
        }
        this.f9618p.post(runnable);
        this.f9615m.m4248M();
        this.f9615m.f9541g = 0.0f;
        this.f9615m.mo4239W();
        this.f9611i.setAnimationObjectState(false);
        m4072al();
    }

    /* renamed from: E */
    public boolean m4122E() {
        return C3359a.f11094h.m4121F() == -1;
    }

    /* renamed from: F */
    public int m4121F() {
        if (this.f9615m == null) {
            return -1;
        }
        return this.f9615m.m4181t();
    }

    /* renamed from: G */
    public ArrayList<C0975i> m4120G() {
        return this.f9615m.m4244R();
    }

    /* renamed from: H */
    public void m4119H() {
        m4077ag();
        C0864d.m10805d().m10810c().m3556a(false);
    }

    /* renamed from: I */
    public void m4118I() {
        if (this.f9622t == 2) {
            if (this.f9615m.m4181t() == -1) {
                C0864d.m10805d().m10810c().m3556a(false);
            } else {
                C0864d.m10805d().m10810c().m3556a(true);
            }
            m4076ah();
        }
    }

    /* renamed from: J */
    public void m4117J() {
        m4068ap();
    }

    /* renamed from: K */
    public void m4116K() {
        Iterator<C2932g> it = this.f9613k.iterator();
        while (it.hasNext()) {
            it.next().m4246P();
        }
    }

    /* renamed from: ap */
    private void m4068ap() {
        this.f9611i.invalidate();
        Iterator<C2932g> it = this.f9613k.iterator();
        while (it.hasNext()) {
            C2932g next = it.next();
            if (this.f9615m != next) {
                next.m4247N();
                next.m4250K();
                next.m4240V();
            } else {
                next.mo4239W();
            }
        }
        this.f9615m.removeFromParent();
        this.f9611i.addChild(this.f9615m);
        this.f9615m.m4248M();
        C3359a.f11092f.m1586d();
        C2370d.m5690c().mo5691b();
        this.f9611i.setAnimationObjectState(false);
        if (this.f9615m.m4181t() == -1) {
            C0864d.m10805d().m10810c().m3556a(false);
        }
    }

    /* renamed from: L */
    public void m4115L() {
        if (C3359a.f11083A.m2213a() && this.f9621s != 1) {
            m4013w();
            m4071am();
            m4113N();
            this.f9625w.m3961g();
        }
    }

    /* renamed from: M */
    public void m4114M() {
        if (this.f9622t == 2 && this.f9621s == 1) {
            m4071am();
        }
    }

    /* renamed from: N */
    public void m4113N() {
        if (this.f9621s == 2) {
            m4070an();
        } else if (this.f9621s == 1) {
            m4123D();
        }
    }

    /* renamed from: O */
    public void m4112O() {
        if (this.f9615m != null) {
            this.f9615m.mo4145ac();
            Iterator<C2932g> it = this.f9613k.iterator();
            while (it.hasNext()) {
                it.next().m4242T();
            }
        }
    }

    /* renamed from: P */
    public void m4111P() {
        if (this.f9615m != null) {
            this.f9615m.mo4146ab();
            Iterator<C2932g> it = this.f9613k.iterator();
            while (it.hasNext()) {
                it.next().m4241U();
            }
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p035c.C0915b.InterfaceC0918a
    /* renamed from: a */
    public void mo727a(int i, KeyEvent keyEvent) {
        if (i == 4) {
            if (!this.f9625w.m3998a()) {
                C0915b.m10594b(this);
                m4011x();
                return;
            }
            this.f9625w.m3950l();
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p035c.C0915b.InterfaceC0918a
    /* renamed from: b */
    public void mo726b(int i, KeyEvent keyEvent) {
    }

    /* renamed from: Q */
    public void m4110Q() {
        m4031n().mo4188m().m3562f();
    }

    /* renamed from: R */
    public void m4109R() {
        C0853a.m10865a().m10583c(new Runnable() { // from class: com.tsf.shell.f.f.n.7
            @Override // java.lang.Runnable
            public void run() {
                if (C3359a.f11083A.m2213a()) {
                    C0864d.m10805d().m10792i();
                    if (!C2951n.this.f9595E.m1666a() && C3359a.f11094h.m4127B() && C3359a.f11094h.m4121F() != -1) {
                        C2951n.this.f9595E.m1661b();
                        C3591c.m1944a(5);
                        C2244e.m6020a(C1306b.C1315i.notic_page_lasso_mode_enable);
                    }
                }
            }
        });
    }

    /* renamed from: com.tsf.shell.f.f.n$c */
    /* loaded from: classes.dex */
    public class C2977c implements C0915b.InterfaceC0918a {

        /* renamed from: A */
        private C0980j f9706A;

        /* renamed from: B */
        private C0980j f9707B;

        /* renamed from: C */
        private double f9708C;

        /* renamed from: D */
        private float f9709D;

        /* renamed from: E */
        private C2988a f9710E;

        /* renamed from: F */
        private C0937a f9711F;

        /* renamed from: G */
        private C1013b f9712G;

        /* renamed from: H */
        private C1017d f9713H;

        /* renamed from: I */
        private C2932g f9714I;

        /* renamed from: J */
        private float f9715J;

        /* renamed from: K */
        private float f9716K;

        /* renamed from: L */
        private C2932g f9717L;

        /* renamed from: M */
        private Runnable f9718M;

        /* renamed from: c */
        C2948l f9722c;

        /* renamed from: f */
        private float f9725f;

        /* renamed from: g */
        private float f9726g;

        /* renamed from: n */
        private float f9733n;

        /* renamed from: o */
        private float f9734o;

        /* renamed from: p */
        private float f9735p;

        /* renamed from: v */
        private float f9741v;

        /* renamed from: h */
        private boolean f9727h = false;

        /* renamed from: i */
        private boolean f9728i = true;

        /* renamed from: j */
        private boolean f9729j = false;

        /* renamed from: k */
        private boolean f9730k = true;

        /* renamed from: l */
        private boolean f9731l = false;

        /* renamed from: m */
        private boolean f9732m = false;

        /* renamed from: q */
        private float f9736q = 0.0f;

        /* renamed from: r */
        private float f9737r = 0.0f;

        /* renamed from: s */
        private float f9738s = 0.0f;

        /* renamed from: t */
        private float f9739t = 0.0f;

        /* renamed from: u */
        private float f9740u = 0.0f;

        /* renamed from: w */
        private boolean f9742w = true;

        /* renamed from: x */
        private float f9743x = 0.03f;

        /* renamed from: y */
        private boolean f9744y = false;

        /* renamed from: z */
        private boolean f9745z = false;

        /* renamed from: a */
        public float f9720a = 0.125f;

        /* renamed from: b */
        public float f9721b = 0.3f;

        /* renamed from: d */
        boolean f9723d = false;

        /* renamed from: N */
        private boolean f9719N = true;

        /* renamed from: a */
        public void m3937a(float f) {
            this.f9737r = f;
        }

        /* renamed from: b */
        public void m3916b(float f) {
            this.f9736q = f;
        }

        /* renamed from: a */
        public boolean m3938a() {
            return !this.f9730k;
        }

        /* renamed from: b */
        public boolean m3917b() {
            return this.f9729j;
        }

        /* renamed from: a */
        public void m3934a(int i, int i2, int i3, int i4) {
            if (this.f9707B != null) {
                this.f9707B.setAABBPX(C0892a.f2590z, C0892a.f2552C, 0.0f, C0892a.f2550A, C0892a.f2551B, 0.0f);
            }
            this.f9733n = m3868m();
            if (!this.f9742w) {
                this.f9734o = -this.f9733n;
                this.f9735p = -((int) (this.f9733n * 3.5f));
                int i5 = 0;
                while (true) {
                    int i6 = i5;
                    if (i6 < C2951n.this.f9616n) {
                        C2932g c2932g = (C2932g) C2951n.this.f9613k.get(i6);
                        c2932g.position().f2528z = (float) (Math.cos(i6 * this.f9708C) * this.f9733n);
                        c2932g.position().f2526x = (float) (Math.sin(i6 * this.f9708C) * this.f9733n);
                        c2932g.rotation().f2527y = this.f9709D * i6;
                        i5 = i6 + 1;
                    } else {
                        this.f9740u = this.f9706A.rotation().f2527y;
                        this.f9741v = this.f9706A.position().f2528z;
                        this.f9738s = (this.f9734o + this.f9735p) / 3.0f;
                        this.f9706A.position().f2528z = this.f9738s;
                        return;
                    }
                }
            }
        }

        public C2977c() {
            C0864d.m10805d().m10810c().m3557a(this);
            this.f9712G = new C1013b();
            this.f9710E = new C2988a();
            m3878i();
        }

        /* renamed from: i */
        private void m3878i() {
            this.f9734o = -this.f9733n;
            this.f9735p = -((int) (this.f9733n * 3.5f));
            this.f9707B = new C0980j();
            this.f9706A = new C0980j() { // from class: com.tsf.shell.f.f.n.c.1
                @Override // com.censivn.C3DEngine.p031b.p038f.C0980j
                public void onDrawChildStart() {
                    boolean z;
                    Iterator<C0975i> it = C2977c.this.f9706A.children().iterator();
                    while (it.hasNext()) {
                        C0975i next = it.next();
                        C2932g c2932g = (C2932g) next;
                        float m613a = C4189x.m613a(next.rotation().f2527y + rotation().f2527y);
                        if (m613a <= 90.0f || m613a >= 270.0f) {
                            z = true;
                        } else {
                            z = false;
                        }
                        c2932g.m4205b(z);
                    }
                }

                @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
                public void onDrawEnd() {
                    if (!C2977c.this.f9742w && !C2977c.this.f9745z) {
                        Collections.sort(children(), C2977c.this.f9710E);
                        position().f2528z += (C2977c.this.f9738s - position().f2528z) * 0.2f;
                        float abs = C2977c.this.f9744y ? 255.0f : Math.abs((position().f2528z - C2977c.this.f9734o) / (C2977c.this.f9735p - C2977c.this.f9734o)) * 255.0f;
                        int i = 0;
                        while (true) {
                            int i2 = i;
                            if (i2 >= C2951n.this.f9616n) {
                                break;
                            }
                            ((C2932g) C2951n.this.f9613k.get(i2)).m4234a(abs);
                            i = i2 + 1;
                        }
                        if (C2977c.this.f9714I == null) {
                            if (C2977c.this.f9744y) {
                                rotation().f2527y += (C2977c.this.f9736q - rotation().f2527y) * 0.3f;
                                rotation().f2526x += (C2977c.this.f9737r - rotation().f2526x) * 0.3f;
                                return;
                            }
                            rotation().f2527y += (C2977c.this.f9736q - rotation().f2527y) * C2977c.this.f9743x;
                            rotation().f2526x += (C2977c.this.f9737r - rotation().f2526x) * C2977c.this.f9743x;
                            if (Math.abs(C2977c.this.f9736q - rotation().f2527y) > 0.1f || Math.abs(C2977c.this.f9737r - rotation().f2526x) > 0.1f) {
                                float f = (C2977c.this.f9706A.rotation().f2527y - C2977c.this.f9740u) / C2977c.this.f9739t;
                                float abs2 = 1.0f - (Math.abs(f - 0.5f) * 2.0f);
                                if (f < 0.5d) {
                                    C2977c.this.f9738s = (abs2 * (C2977c.this.f9735p - C2977c.this.f9741v)) + C2977c.this.f9741v;
                                } else {
                                    C2977c.this.f9738s = (abs2 * (C2977c.this.f9735p - C2977c.this.f9734o)) + C2977c.this.f9734o;
                                }
                                if (f > 0.9d) {
                                    C2977c.this.f9743x += 0.008f;
                                }
                                if (f > 0.9d) {
                                    float f2 = (1.0f - f) * 10.0f;
                                    int i3 = 0;
                                    while (true) {
                                        int i4 = i3;
                                        if (i4 < C2951n.this.f9616n) {
                                            C2932g c2932g = (C2932g) C2951n.this.f9613k.get(i4);
                                            if (c2932g != C2951n.this.f9615m) {
                                                c2932g.m4251J().alpha((int) (255.0f * f2));
                                            }
                                            i3 = i4 + 1;
                                        } else {
                                            return;
                                        }
                                    }
                                }
                            } else {
                                rotation().f2527y = C2977c.this.f9736q;
                                rotation().f2526x = C2977c.this.f9737r;
                                C2977c.this.f9742w = true;
                                position().f2528z = C2977c.this.f9734o;
                                C2977c.this.m3872k();
                            }
                        } else {
                            rotation().f2527y += (C2977c.this.f9736q - rotation().f2527y) * 0.2f;
                            rotation().f2526x += (C2977c.this.f9737r - rotation().f2526x) * 0.2f;
                            if (Math.abs(C2977c.this.f9736q - rotation().f2527y) <= 10.0f) {
                                C2977c.this.f9714I = null;
                                C2977c.this.f9707B.mouseEnabled(true);
                                C2977c.this.f9711F.mo1653f(null);
                            }
                        }
                    }
                }
            };
            this.f9706A.renderChildren(false);
            this.f9706A.position().f2528z = this.f9734o;
            this.f9707B.setAABBPX(C0892a.f2590z, C0892a.f2552C, 0.0f, C0892a.f2550A, C0892a.f2551B, 0.0f);
            C0937a c0937a = new C0937a(this.f9707B) { // from class: com.tsf.shell.f.f.n.c.3
                @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
                /* renamed from: a */
                public void mo2129a(MotionEvent motionEvent, MotionEvent motionEvent2) {
                    C2977c.this.f9736q = C2977c.this.f9715J + (((motionEvent2.getX() - motionEvent.getX()) / C0892a.f2555F) * 360.0f * 1.2f);
                    float y = ((motionEvent2.getY() - motionEvent.getY()) / C0892a.f2556G) * 180.0f;
                    C2977c.this.f9737r = C2977c.this.f9716K + y;
                    if (C2977c.this.f9737r > 45.0f) {
                        C2977c.this.f9737r = 45.0f;
                        C2977c.this.f9716K = C2977c.this.f9737r - y;
                    } else if (C2977c.this.f9737r < -45.0f) {
                        C2977c.this.f9737r = -45.0f;
                        C2977c.this.f9716K = C2977c.this.f9737r - y;
                    }
                }

                @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
                /* renamed from: e */
                public void mo1654e(MotionEvent motionEvent) {
                    C2977c.this.f9743x = 0.03f;
                    C1014c.m10326a(C2977c.this.f9706A);
                    C2977c.this.f9727h = false;
                    C2977c.this.f9744y = true;
                    C2977c.this.f9745z = false;
                    C2977c.this.f9715J = C2977c.this.f9736q = C2977c.this.f9706A.rotation().f2527y;
                    C2977c.this.f9716K = C2977c.this.f9737r = C2977c.this.f9706A.rotation().f2526x;
                    C2977c.this.f9738s = (C2977c.this.f9734o + C2977c.this.f9735p) / 3.0f;
                    C2977c.this.m3875j();
                }

                @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
                /* renamed from: f */
                public void mo1653f(MotionEvent motionEvent) {
                    C2977c.this.m3929a((C2932g) null);
                }

                @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
                /* renamed from: b */
                public void mo3209b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                    C2977c.this.f9727h = true;
                    C2977c.this.f9736q = ((((int) (C2977c.this.f9706A.rotation().f2527y + (f / 4.0f))) / 360) * 360) + C2977c.this.m3870l();
                    C2977c.this.f9740u = C2977c.this.f9706A.rotation().f2527y;
                    C2977c.this.f9741v = C2977c.this.f9706A.position().f2528z;
                    C2977c.this.f9739t = C2977c.this.f9736q - C2977c.this.f9706A.rotation().f2527y;
                    C2977c.this.m3875j();
                }
            };
            this.f9711F = c0937a;
            this.f9707B.setMouseEventListener(c0937a);
            this.f9707B.addChild(this.f9706A);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: j */
        public void m3875j() {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < C2951n.this.f9616n) {
                    C2932g c2932g = (C2932g) C2951n.this.f9613k.get(i2);
                    if (c2932g != C2951n.this.f9615m) {
                        c2932g.m4251J().alpha(255.0f);
                    }
                    i = i2 + 1;
                } else {
                    return;
                }
            }
        }

        /* renamed from: com.tsf.shell.f.f.n$c$a */
        /* loaded from: classes.dex */
        class C2988a implements Comparator<C0975i> {

            /* renamed from: b */
            private double f9776b = 0.017453292519943295d;

            C2988a() {
            }

            @Override // java.util.Comparator
            /* renamed from: a */
            public int compare(C0975i c0975i, C0975i c0975i2) {
                float cos = (float) (Math.cos((c0975i.rotation().f2527y + C2977c.this.f9706A.rotation().f2527y) * this.f9776b) * C2977c.this.f9733n);
                float cos2 = (float) (Math.cos((c0975i2.rotation().f2527y + C2977c.this.f9706A.rotation().f2527y) * this.f9776b) * C2977c.this.f9733n);
                if (cos > cos2) {
                    return 1;
                }
                if (cos < cos2) {
                    return -1;
                }
                return 0;
            }
        }

        @Override // com.censivn.C3DEngine.p031b.p035c.C0915b.InterfaceC0918a
        /* renamed from: a */
        public void mo727a(int i, KeyEvent keyEvent) {
            if (i == 4 && !this.f9745z && this.f9706A.numChildren() > 0) {
                this.f9711F.mo1653f(null);
            }
        }

        @Override // com.censivn.C3DEngine.p031b.p035c.C0915b.InterfaceC0918a
        /* renamed from: b */
        public void mo726b(int i, KeyEvent keyEvent) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k */
        public void m3872k() {
            this.f9707B.removeFromParent();
            for (int i = 0; i < C2951n.this.f9616n; i++) {
                C2932g c2932g = (C2932g) C2951n.this.f9613k.get(i);
                c2932g.m4195f(false);
                c2932g.position().f2528z = 0.0f;
                c2932g.position().f2526x = 0.0f;
                c2932g.rotation().f2527y = 0.0f;
                c2932g.m4197e(false);
                c2932g.removeFromParent();
                c2932g.m4251J().alpha(255.0f);
            }
            C2951n.this.f9615m.m4253H();
            C2951n.this.f9615m.m4248M();
            C2951n.this.f9611i.addChild(C2951n.this.f9615m);
            C3359a.f11089c.m2251a(C2951n.this.f9599I, true);
            C3359a.f11089c.m2246b(C2951n.this.f9599I);
            C0915b.m10594b(this);
            m3918a(false);
            C2951n.this.m4072al();
        }

        /* renamed from: a */
        public float m3936a(int i) {
            return (-i) * this.f9709D;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l */
        public float m3870l() {
            return m3936a(C2951n.this.f9615m.m4183r());
        }

        /* renamed from: m */
        private float m3868m() {
            return ((float) (((C0892a.f2555F * 0.9f) / 2.0f) / Math.sin((((360 / C2951n.this.f9616n) / 2) * 3.141592653589793d) / 180.0d))) + (200.0f * C0892a.f2566b);
        }

        /* renamed from: c */
        public void m3906c(float f) {
            this.f9743x = 0.03f;
            C0915b.m10597a(this);
            this.f9733n = m3868m();
            this.f9734o = -this.f9733n;
            this.f9735p = -((int) (this.f9733n * 3.5f));
            this.f9708C = 6.283185307179586d / C2951n.this.f9616n;
            this.f9709D = 360.0f / C2951n.this.f9616n;
            if (this.f9742w) {
                C2951n.this.m4073ak();
                C3359a.f11089c.m2252a(C2951n.this.f9599I);
                C3359a.f11089c.m2242c(C2951n.this.f9599I);
                this.f9742w = false;
                for (int i = 0; i < C2951n.this.f9616n; i++) {
                    C2932g c2932g = (C2932g) C2951n.this.f9613k.get(i);
                    if (c2932g != C2951n.this.f9615m) {
                        c2932g.mo4150O();
                    }
                    c2932g.m4195f(false);
                    c2932g.m4249L();
                    c2932g.m4253H();
                    c2932g.m4175z();
                    c2932g.m4197e(true);
                    c2932g.position().f2528z = (float) (Math.cos(i * this.f9708C) * this.f9733n);
                    c2932g.position().f2526x = (float) (Math.sin(i * this.f9708C) * this.f9733n);
                    c2932g.rotation().f2527y = this.f9709D * i;
                    c2932g.m4251J().scale().setAll(1.0f, 1.0f, 1.0f);
                    this.f9706A.addChild(c2932g);
                }
                Number3d rotation = this.f9706A.rotation();
                float m3870l = m3870l();
                rotation.f2527y = m3870l;
                this.f9736q = m3870l;
                this.f9707B.removeFromParent();
                C2951n.this.f9610h.addChild(this.f9707B);
            }
            this.f9740u = this.f9706A.rotation().f2527y;
            this.f9741v = this.f9706A.position().f2528z;
            m3875j();
        }

        /* renamed from: c */
        public void m3907c() {
            boolean z;
            if (this.f9722c != null && !this.f9722c.mo4143a()) {
                C3359a.f11108v.f7770c.f8012b.m5558a(true);
                C3359a.f11108v.f7770c.f8012b.m5560a(C2951n.this.f9615m);
            } else {
                C3359a.f11108v.f7770c.f8012b.m5558a(false);
            }
            if (!this.f9730k) {
                if (this.f9717L != null) {
                    if (this.f9726g < 0.0f) {
                        this.f9722c.mo4137b(C2951n.this.f9615m.f9541g, this.f9726g);
                        C2951n.this.f9615m.m4223a(C2951n.this.f9615m, this.f9726g, true, false, this.f9722c);
                        z = false;
                    } else {
                        this.f9722c.mo4137b(C2951n.this.f9615m.f9541g, this.f9726g);
                        C2951n.this.f9615m.m4223a(C2951n.this.f9615m, this.f9726g, false, true, this.f9722c);
                        z = false;
                    }
                } else if (this.f9729j) {
                    float f = C2951n.this.f9615m.f9541g + ((this.f9726g - C2951n.this.f9615m.f9541g) * 0.25f);
                    this.f9722c.mo4137b(C2951n.this.f9615m.f9541g, f);
                    if (f < 0.0f) {
                        C2951n.this.f9615m.m4223a(C2951n.this.f9615m, f, true, false, this.f9722c);
                    } else {
                        C2951n.this.f9615m.m4223a(C2951n.this.f9615m, f, false, true, this.f9722c);
                    }
                    z = false;
                } else if (!this.f9722c.mo4138b() || Math.abs(C2951n.this.f9615m.f9541g - this.f9726g) >= 0.001d) {
                    float f2 = C2951n.this.f9615m.f9541g + ((this.f9726g - C2951n.this.f9615m.f9541g) * this.f9721b);
                    this.f9722c.mo4137b(C2951n.this.f9615m.f9541g, f2);
                    if (f2 < 0.0f) {
                        C2951n.this.f9615m.m4223a(C2951n.this.f9615m, f2, true, false, this.f9722c);
                        z = false;
                    } else {
                        C2951n.this.f9615m.m4223a(C2951n.this.f9615m, f2, false, true, this.f9722c);
                        z = false;
                    }
                } else {
                    this.f9722c.mo4137b(C2951n.this.f9615m.f9541g, this.f9726g);
                    C2951n.this.f9615m.m4223a(C2951n.this.f9615m, this.f9726g, true, false, this.f9722c);
                    z = true;
                }
                if (this.f9717L == null && !z) {
                    C2951n.this.m4084a(false, "onDrawFrame");
                }
                C2951n.this.f9611i.m10460a();
                Iterator<C0975i> it = C2951n.this.f9611i.children().iterator();
                while (it.hasNext()) {
                    C2932g c2932g = (C2932g) it.next();
                    c2932g.m4192i();
                    c2932g.m4214af();
                }
                if (z) {
                    m3918a(true);
                }
            }
        }

        /* renamed from: d */
        public void m3899d() {
            m3925a((C2948l) null);
        }

        /* renamed from: a */
        public void m3925a(C2948l c2948l) {
            if (this.f9728i) {
                if (c2948l == null) {
                    c2948l = C3359a.f11108v.f7768a.f9582a.m4343h();
                }
                this.f9722c = c2948l;
                this.f9722c.m4133d();
                C3359a.f11108v.f7768a.f9582a.m4314a(this.f9722c);
                this.f9727h = false;
                this.f9728i = false;
                this.f9725f = C2951n.this.f9615m.f9541g;
                C2951n.this.f9610h.setAnimationObjectState(true);
                C2951n.this.f9610h.invalidate();
                if (this.f9730k) {
                    this.f9730k = false;
                    C2951n.this.m4077ag();
                    C2951n.this.f9615m.m4240V();
                }
                C2951n.this.f9611i.position().f2526x = 0.0f;
                C3359a.f11100n.m2084i();
            }
        }

        /* renamed from: a */
        public void m3929a(C2932g c2932g) {
            this.f9744y = false;
            this.f9737r = 0.0f;
            if (!this.f9727h) {
                if (c2932g == null) {
                    if (this.f9706A.numChildren() != 0) {
                        C2951n.this.m4094a((C2932g) this.f9706A.getChildAt(this.f9706A.numChildren() - 1), false, true);
                    }
                } else {
                    C2951n.this.m4094a(c2932g, false, true);
                }
                C2951n.this.f9615m.f9541g = 0.0f;
                C2951n.this.f9624v.m2286a(C2951n.this.f9615m);
                C2951n.this.m4084a(true, "RotationUp");
                float m3870l = (((int) (this.f9706A.rotation().f2527y / 360.0f)) * 360) + 360 + m3870l();
                float m3870l2 = (((int) (this.f9706A.rotation().f2527y / 360.0f)) * 360) + m3870l();
                float m3870l3 = ((((int) (this.f9706A.rotation().f2527y / 360.0f)) * 360) - 360) + m3870l();
                float abs = Math.abs(m3870l - this.f9706A.rotation().f2527y);
                float abs2 = Math.abs(m3870l2 - this.f9706A.rotation().f2527y);
                float abs3 = Math.abs(m3870l3 - this.f9706A.rotation().f2527y);
                if (abs < abs2 && abs < abs3) {
                    this.f9736q = m3870l;
                } else if (abs2 < abs && abs2 < abs3) {
                    this.f9736q = m3870l2;
                } else {
                    this.f9736q = m3870l3;
                }
                this.f9740u = this.f9706A.rotation().f2527y;
                this.f9741v = this.f9706A.position().f2528z;
                this.f9739t = this.f9736q - this.f9706A.rotation().f2527y;
                this.f9745z = true;
                for (int i = 0; i < C2951n.this.f9616n; i++) {
                    ((C2932g) C2951n.this.f9613k.get(i)).m4260A();
                }
                C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.f.n.c.4
                    @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                    /* renamed from: a */
                    public void mo518a(float f) {
                        int i2 = 0;
                        while (true) {
                            int i3 = i2;
                            if (i3 < C2951n.this.f9616n) {
                                C2932g c2932g2 = (C2932g) C2951n.this.f9613k.get(i3);
                                if (c2932g2 != C2951n.this.f9615m) {
                                    c2932g2.m4251J().alpha((int) (255.0f - (255.0f * f)));
                                }
                                c2932g2.m4234a(c2932g2.m4259B() * (1.0f - f));
                                i2 = i3 + 1;
                            } else {
                                return;
                            }
                        }
                    }

                    @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                    /* renamed from: a */
                    public void mo732a() {
                        C2977c.this.f9742w = true;
                        C2977c.this.f9745z = false;
                        C2977c.this.m3872k();
                    }
                };
                c1017d.m10307c(0.0f);
                c1017d.m10305d(this.f9736q);
                c1017d.m10296j(this.f9734o);
                C1014c.m10326a(this.f9706A);
                C1014c.m10325a(this.f9706A, 500, c1017d);
            }
        }

        /* renamed from: a */
        public void m3930a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (!this.f9728i && this.f9731l) {
                this.f9727h = true;
                if (Math.abs(f) > 300.0f) {
                    if (f < 0.0f) {
                        m3864o();
                    } else {
                        m3862p();
                    }
                }
            }
        }

        /* renamed from: e */
        public boolean m3892e() {
            if (this.f9728i) {
                m3899d();
                this.f9730k = true;
                m3906c(0.0f);
                this.f9711F.mo1654e(null);
                this.f9737r = 30.0f;
                this.f9716K = 30.0f;
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public void m3931a(MotionEvent motionEvent, MotionEvent motionEvent2) {
            this.f9711F.mo2129a(motionEvent, motionEvent2);
        }

        /* renamed from: a */
        public void m3932a(MotionEvent motionEvent) {
            this.f9711F.mo1653f(motionEvent);
        }

        /* renamed from: b */
        public void m3913b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            this.f9711F.mo3209b(motionEvent, motionEvent2, f, f2);
        }

        /* renamed from: f */
        public boolean m3888f() {
            return this.f9732m;
        }

        /* renamed from: g */
        public boolean m3884g() {
            return this.f9731l;
        }

        /* renamed from: b */
        public void m3914b(MotionEvent motionEvent) {
        }

        /* renamed from: c */
        public void m3904c(MotionEvent motionEvent) {
            if (!this.f9732m) {
                this.f9732m = true;
                this.f9731l = false;
            }
        }

        /* renamed from: c */
        public void m3903c(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (!this.f9732m) {
                this.f9721b = this.f9720a;
                int abs = (int) Math.abs(motionEvent2.getX() - motionEvent.getX());
                int abs2 = (int) Math.abs(motionEvent2.getY() - motionEvent.getY());
                if ((abs * abs) + (abs2 * abs2) > C0855b.f2416b / 2.0f) {
                    if (abs > abs2) {
                        this.f9731l = true;
                    } else {
                        this.f9731l = false;
                    }
                    this.f9732m = true;
                }
            }
            if (this.f9732m && this.f9731l) {
                if (this.f9728i) {
                    AbstractC2593d.onTempleteHide();
                    C0853a.m10865a().m10585b(new Runnable() { // from class: com.tsf.shell.f.f.n.c.5
                        @Override // java.lang.Runnable
                        public void run() {
                            C2977c.this.m3899d();
                        }
                    });
                }
                this.f9726g = this.f9725f + (((motionEvent.getX() - motionEvent2.getX()) / C0892a.f2555F) * (C2951n.this.f9616n - 1) * 1.7f);
                this.f9729j = true;
            }
        }

        /* renamed from: d */
        public void m3896d(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (!this.f9732m) {
                this.f9721b = this.f9720a;
                int abs = (int) Math.abs(motionEvent2.getX() - motionEvent.getX());
                int abs2 = (int) Math.abs(motionEvent2.getY() - motionEvent.getY());
                if ((abs * abs) + (abs2 * abs2) > C0855b.f2416b) {
                    if (abs > abs2) {
                        this.f9731l = true;
                    } else {
                        this.f9731l = false;
                    }
                    this.f9732m = true;
                }
            }
            if (this.f9732m && this.f9731l) {
                if (this.f9728i) {
                    AbstractC2593d.onTempleteHide();
                    C0853a.m10865a().m10585b(new Runnable() { // from class: com.tsf.shell.f.f.n.c.6
                        @Override // java.lang.Runnable
                        public void run() {
                            C2977c.this.m3899d();
                        }
                    });
                }
                this.f9726g = this.f9725f + ((motionEvent2.getX() - motionEvent.getX()) / C0892a.f2555F);
                if (C2951n.this.f9615m.m4212ah() == null && this.f9726g < 0.0f) {
                    this.f9726g = C2477c.m5475a(this.f9726g);
                }
                if (C2951n.this.f9615m.m4213ag() == null && this.f9726g > 0.0f) {
                    this.f9726g = C2477c.m5475a(this.f9726g);
                }
                this.f9729j = true;
            }
        }

        /* renamed from: d */
        public void m3897d(MotionEvent motionEvent) {
            if (this.f9732m) {
                AbstractC2593d.onTempleteShow();
                this.f9732m = false;
                this.f9728i = true;
                this.f9729j = false;
                this.f9726g = 0.0f;
                if (!this.f9727h && this.f9717L == null && !this.f9730k) {
                    C2932g m3866n = m3866n();
                    if (m3866n != null && m3866n != C2951n.this.f9615m) {
                        C2951n.this.m4094a(m3866n, false, true);
                        return;
                    }
                    return;
                }
                this.f9727h = false;
            }
        }

        /* renamed from: n */
        private C2932g m3866n() {
            float f;
            C2932g c2932g;
            C2932g c2932g2 = null;
            float f2 = Float.MAX_VALUE;
            int i = 1;
            while (i < C2951n.this.f9616n) {
                C2932g c2932g3 = (C2932g) C2951n.this.f9613k.get(i);
                float abs = Math.abs(c2932g3.f9541g);
                if (abs < f2) {
                    c2932g = c2932g3;
                    f = abs;
                } else {
                    f = f2;
                    c2932g = c2932g2;
                }
                i++;
                c2932g2 = c2932g;
                f2 = f;
            }
            return c2932g2;
        }

        /* renamed from: a */
        private void m3918a(boolean z) {
            this.f9728i = true;
            this.f9730k = true;
            this.f9723d = false;
            C2951n.this.f9610h.setAnimationObjectState(false);
            if (z) {
                C2951n.this.f9615m.m4222a(this.f9722c);
            }
            C2951n.this.m4118I();
            C3430e.m2439n(C2951n.this.f9615m.m4181t());
            C2951n.this.f9615m.mo4239W();
            C2932g c2932g = C2951n.this.f9615m;
            this.f9725f = 0.0f;
            c2932g.f9541g = 0.0f;
            if (this.f9722c != null) {
                this.f9722c.mo4134c();
            }
            C2951n.this.m4079ae();
            C2951n.this.m4045g();
            C3359a.f11108v.f7768a.m4131a();
            C2939h.m4170a(false);
            C3359a.f11100n.m2083j();
        }

        /* renamed from: a */
        private void m3927a(C2932g c2932g, Runnable runnable) {
            m3926a(c2932g, runnable, (C2948l) null);
        }

        /* renamed from: a */
        private void m3926a(C2932g c2932g, Runnable runnable, C2948l c2948l) {
            C2939h.m4170a(true);
            C0864d.m10805d().m10810c().m3556a(false);
            this.f9717L = c2932g;
            C2951n.this.m4095a(this.f9717L, true, "hdieSelect");
            if (this.f9718M != null) {
                this.f9718M.run();
            }
            this.f9718M = runnable;
            C2951n.this.f9624v.m2286a(c2932g);
            m3925a(c2948l);
            this.f9730k = false;
            this.f9729j = true;
            this.f9732m = true;
        }

        /* renamed from: a */
        private void m3928a(final C2932g c2932g, int i, Runnable runnable, final boolean z, final C2948l c2948l) {
            if (this.f9723d || c2932g == null || this.f9717L == c2932g || c2932g == C2951n.this.f9615m || !this.f9730k) {
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            }
            this.f9723d = true;
            C2951n.this.m4064b(C2951n.this.f9615m);
            C2951n.this.m4049e(c2932g);
            C2951n.this.f9597G.m3850a(c2932g);
            m3926a(c2932g, runnable, c2948l);
            final C2932g c2932g2 = C2951n.this.f9615m;
            final C2932g m4213ag = c2932g2.m4213ag();
            final C2932g m4212ah = c2932g2.m4212ah();
            final C2932g m4213ag2 = c2932g.m4213ag();
            final C2932g m4212ah2 = c2932g.m4212ah();
            c2948l.mo4135b(c2932g2, true);
            c2948l.mo4139a(c2932g, true);
            if (z) {
                c2932g.m4206b(c2932g2);
                c2932g.m4224a((C2932g) null);
                c2932g2.m4224a(c2932g);
                c2932g2.m4206b((C2932g) null);
            } else {
                c2932g.m4206b((C2932g) null);
                c2932g.m4224a(c2932g2);
                c2932g2.m4224a((C2932g) null);
                c2932g2.m4206b(c2932g);
            }
            final float f = z ? 1.0f : -1.0f;
            this.f9713H = new C1017d() { // from class: com.tsf.shell.f.f.n.c.7
                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: a */
                public void mo732a() {
                    c2948l.mo4139a(c2932g2, false);
                    C2977c.this.f9729j = false;
                    C2977c.this.f9732m = false;
                    C2977c.this.f9726g = 0.0f;
                    c2932g2.m4223a(c2932g2, z ? 1.0f : -1.0f, false, false, C2977c.this.f9722c);
                    c2932g2.m4224a(m4213ag);
                    c2932g2.m4206b(m4212ah);
                    c2932g.m4224a(m4213ag2);
                    c2932g.m4206b(m4212ah2);
                    C2951n.this.m4094a(c2932g, false, true);
                    C0864d.m10805d().m10810c().m3556a(true);
                    C2977c.this.f9717L = null;
                    if (C2977c.this.f9718M != null) {
                        C0853a.m10865a().m10583c(C2977c.this.f9718M);
                        C2977c.this.f9718M = null;
                    }
                }

                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: a */
                public void mo518a(float f2) {
                    C2977c.this.f9726g = f * f2;
                }
            };
            C1014c.m10326a(this.f9712G);
            C1014c.m10325a(this.f9712G, i, this.f9713H);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public void m3912b(final C2932g c2932g, Runnable runnable) {
            if (!this.f9723d && this.f9717L != c2932g && c2932g != C2951n.this.f9615m) {
                C2951n.this.f9597G.m3850a(c2932g);
                C2951n.this.m4049e(c2932g);
                C2951n.this.m4064b(C2951n.this.f9615m);
                m3927a(c2932g, runnable);
                int m4183r = c2932g.m4183r() - C2951n.this.f9615m.m4183r();
                final float f = C2951n.this.f9615m.f9541g;
                final float f2 = -m4183r;
                this.f9713H = new C1017d() { // from class: com.tsf.shell.f.f.n.c.8
                    @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                    /* renamed from: a */
                    public void mo732a() {
                        C2977c.this.f9729j = false;
                        C2977c.this.f9732m = false;
                        C2977c.this.f9726g = 0.0f;
                        C2951n.this.m4094a(c2932g, false, true);
                        C0864d.m10805d().m10810c().m3556a(true);
                        C2977c.this.f9717L = null;
                        if (C2977c.this.f9718M != null) {
                            C0853a.m10865a().m10583c(C2977c.this.f9718M);
                            C2977c.this.f9718M = null;
                        }
                    }

                    @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                    /* renamed from: a */
                    public void mo518a(float f3) {
                        if (f3 > 0.5d) {
                            C2977c.this.f9729j = false;
                        }
                        C2977c.this.f9726g = f + ((f2 - f) * f3);
                    }
                };
                C1014c.m10326a(this.f9712G);
                int abs = Math.abs(m4183r * 150);
                C1014c.m10325a(this.f9712G, abs >= 500 ? abs : 500, this.f9713H);
                return;
            }
            runnable.run();
        }

        /* renamed from: b */
        public void m3915b(int i) {
            m3933a(i, (Runnable) null);
        }

        /* renamed from: a */
        public void m3933a(int i, final Runnable runnable) {
            if (this.f9719N) {
                this.f9719N = false;
                final float f = C2951n.this.f9615m.f9541g;
                C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.f.n.c.9
                    @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                    /* renamed from: a */
                    public void mo732a() {
                        C2977c.this.f9729j = false;
                        C2977c.this.f9732m = false;
                        C2977c.this.f9726g = 0.0f;
                        if (runnable != null) {
                            runnable.run();
                        }
                    }

                    @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                    /* renamed from: a */
                    public void mo518a(float f2) {
                        C2977c.this.f9726g = f + ((0.0f - f) * f2);
                    }
                };
                C1014c.m10326a(this.f9712G);
                C1014c.m10325a(this.f9712G, i, c1017d);
            }
        }

        /* renamed from: h */
        public void m3881h() {
            m3905c(VEasing.Linear.easeNone);
        }

        /* renamed from: c */
        public void m3905c(final int i) {
            if (C0869e.m10758l()) {
                if (C2951n.this.m4019t().m4474aJ() && this.f9730k) {
                    C2932g m4031n = C2951n.this.m4031n();
                    if (m4031n.m4181t() == -1) {
                        ((C2862h) m4031n).m4482aB();
                        C2932g m4037k = C2951n.this.m4037k();
                        if (m4037k == null || m4037k.m4181t() == -1) {
                            m4037k = C2951n.this.m4029o();
                        }
                        m3928a(m4037k, i, null, false, C3359a.f11108v.f7768a.f9583b.m4343h());
                        C3359a.f11089c.m2251a(C2951n.this.f9599I, false);
                        return;
                    }
                    m3928a(C2951n.this.m4019t(), i, null, true, C3359a.f11108v.f7768a.f9583b.m4343h());
                    C3359a.f11089c.m2252a(C2951n.this.f9599I);
                    return;
                }
                return;
            }
            C0853a.m10865a().m10583c(new Runnable() { // from class: com.tsf.shell.f.f.n.c.10
                @Override // java.lang.Runnable
                public void run() {
                    C2977c.this.m3905c(i);
                }
            });
        }

        /* renamed from: d */
        public void m3898d(int i) {
            m3905c(i);
        }

        /* renamed from: a */
        public void m3935a(int i, final int i2) {
            this.f9719N = true;
            final boolean z = C2951n.this.f9615m.m4212ah() != null;
            m3899d();
            final float f = C2951n.this.f9615m.f9541g;
            C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.f.n.c.2
                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: a */
                public void mo732a() {
                    C2977c.this.m3915b(i2);
                }

                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: a */
                public void mo518a(float f2) {
                    if (z) {
                        C2977c.this.f9726g = f - ((f + 1.0f) * f2);
                        return;
                    }
                    C2977c.this.f9726g = f - ((f - 1.0f) * f2);
                }
            };
            C1014c.m10326a(this.f9712G);
            C1014c.m10325a(this.f9712G, i, c1017d);
            this.f9730k = false;
            this.f9729j = true;
            this.f9732m = true;
        }

        /* renamed from: o */
        private void m3864o() {
            if (C2951n.this.f9615m.m4212ah() != null) {
                C2951n.this.f9615m.m4223a(C2951n.this.f9615m, C2951n.this.f9615m.f9541g, true, false, this.f9722c);
                C2951n.this.m4094a(C2951n.this.f9615m.m4212ah(), false, true);
                this.f9726g = 0.0f;
            }
        }

        /* renamed from: p */
        private void m3862p() {
            if (C2951n.this.f9615m.m4213ag() != null) {
                C2951n.this.f9615m.m4223a(C2951n.this.f9615m, C2951n.this.f9615m.f9541g, false, true, this.f9722c);
                C2951n.this.m4094a(C2951n.this.f9615m.m4213ag(), false, true);
                this.f9726g = 0.0f;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m4084a(boolean z, String str) {
        m4095a(this.f9615m, z, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m4095a(C2932g c2932g, boolean z, String str) {
        C3359a.f11092f.m1607a(c2932g, z, true);
    }

    /* renamed from: com.tsf.shell.f.f.n$b */
    /* loaded from: classes.dex */
    public class C2969b {

        /* renamed from: C */
        private C2932g f9659C;

        /* renamed from: D */
        private DynamicTextureElement f9660D;

        /* renamed from: c */
        private C0980j f9666c;

        /* renamed from: e */
        private boolean f9668e;

        /* renamed from: f */
        private float f9669f;

        /* renamed from: g */
        private float f9670g;

        /* renamed from: l */
        private float f9675l;

        /* renamed from: t */
        private float f9683t;

        /* renamed from: u */
        private C2932g f9684u;

        /* renamed from: v */
        private Number3d f9685v;

        /* renamed from: y */
        private int f9688y;

        /* renamed from: m */
        private float f9676m = 32.0f;

        /* renamed from: n */
        private float f9677n = -50.0f;

        /* renamed from: r */
        private boolean f9681r = false;

        /* renamed from: s */
        private boolean f9682s = false;

        /* renamed from: x */
        private boolean f9687x = false;

        /* renamed from: z */
        private int f9689z = 1;

        /* renamed from: A */
        private int f9657A = 2;

        /* renamed from: B */
        private int f9658B = 0;

        /* renamed from: G */
        private boolean f9663G = false;

        /* renamed from: F */
        private C2535b f9662F = C3359a.f11102p.m5311d();

        /* renamed from: E */
        private C0981k f9661E = new C0981k(C3489a.f11520g, C3489a.f11520g, false);

        /* renamed from: b */
        private float f9665b = 0.017453292f;

        /* renamed from: h */
        private float f9671h = C0892a.f2553D;

        /* renamed from: o */
        private float f9678o = (-this.f9671h) - (200.0f * C0892a.f2566b);

        /* renamed from: p */
        private float f9679p = (C0892a.f2551B + ((int) (Math.sin(this.f9665b * this.f9676m) * this.f9671h))) - (100.0f * C0892a.f2566b);

        /* renamed from: w */
        private float f9686w = (float) (this.f9678o + (Math.cos(this.f9665b * this.f9676m) * this.f9671h));

        /* renamed from: q */
        private float f9680q = ((float) (this.f9679p - (Math.sin(this.f9665b * this.f9676m) * this.f9671h))) - (C2951n.f9589b / 2);

        /* renamed from: i */
        private float f9672i = 360.0f / (((float) ((2.0f * this.f9671h) * 3.141592653589793d)) / (C2951n.f9588a - 40));

        /* renamed from: k */
        private float f9674k = this.f9672i / (C2951n.f9588a - 40);

        /* renamed from: j */
        private float f9673j = this.f9672i * this.f9665b;

        /* renamed from: d */
        private C0980j f9667d = new C0980j();

        public C2969b() {
            this.f9666c = new C0980j() { // from class: com.tsf.shell.f.f.n.b.1
                @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
                public void onDrawStart() {
                    if (!C2969b.this.f9681r) {
                        if (C2969b.this.f9682s) {
                            rotation().f2527y += (C2969b.this.f9683t - rotation().f2527y) * 0.5f;
                            return;
                        }
                        rotation().f2527y += (C2969b.this.f9683t - rotation().f2527y) * 0.2f;
                        if (rotation().f2527y >= C2969b.this.f9669f || C2969b.this.f9683t >= C2969b.this.f9669f) {
                            if (rotation().f2527y > C2969b.this.f9670g && C2969b.this.f9683t > C2969b.this.f9670g) {
                                C2969b.this.f9683t += (C2969b.this.f9670g - C2969b.this.f9683t) * 0.3f;
                            }
                        } else {
                            C2969b.this.f9683t += (C2969b.this.f9669f - C2969b.this.f9683t) * 0.3f;
                        }
                        if (Math.abs(rotation().f2527y - C2969b.this.f9683t) < 0.01d && getAnimationObjectState()) {
                            setAnimationObjectState(false);
                            rotation().f2527y = C2969b.this.f9683t;
                        }
                        if (C2969b.this.f9688y != C2969b.this.f9689z) {
                            if (C2969b.this.f9688y == C2969b.this.f9657A) {
                                C2969b.this.f9683t += 2.0f;
                                if (C2969b.this.f9683t > C2969b.this.f9670g) {
                                    C2969b.this.f9683t = C2969b.this.f9670g;
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        C2969b.this.f9683t -= 2.0f;
                        if (C2969b.this.f9683t < C2969b.this.f9669f) {
                            C2969b.this.f9683t = C2969b.this.f9669f;
                        }
                    }
                }
            };
        }

        /* renamed from: a */
        public void m3993a(int i, int i2, int i3, int i4) {
            this.f9671h = C0892a.f2553D;
            this.f9678o = (-this.f9671h) - (200.0f * C0892a.f2566b);
            this.f9679p = (C0892a.f2551B + ((int) (Math.sin(this.f9665b * this.f9676m) * this.f9671h))) - (100.0f * C0892a.f2566b);
            this.f9686w = (float) (this.f9678o + (Math.cos(this.f9665b * this.f9676m) * this.f9671h));
            this.f9680q = ((float) (this.f9679p - (Math.sin(this.f9665b * this.f9676m) * this.f9671h))) - (C2951n.f9589b / 2);
            this.f9672i = 360.0f / (((float) ((2.0f * this.f9671h) * 3.141592653589793d)) / (C2951n.f9588a - 40));
            this.f9674k = this.f9672i / (C2951n.f9588a - 40);
            this.f9673j = this.f9672i * this.f9665b;
            if (this.f9668e) {
                C1014c.m10326a(this.f9666c);
                this.f9666c.position().f2528z = this.f9678o;
                this.f9666c.rotation().f2526x = this.f9676m;
                this.f9666c.position().f2527y = this.f9679p;
                this.f9666c.rotation().f2527y = this.f9683t;
                Iterator it = C2951n.this.f9613k.iterator();
                while (it.hasNext()) {
                    C2932g c2932g = (C2932g) it.next();
                    if (c2932g != this.f9659C) {
                        m3980b(c2932g);
                    }
                }
            }
        }

        /* renamed from: a */
        public boolean m3998a() {
            return this.f9668e;
        }

        /* renamed from: b */
        public C0981k m3982b() {
            return this.f9661E;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public void m3961g() {
            if (!this.f9668e && !this.f9681r) {
                C3359a.f11101o.m3607k();
                this.f9661E.textures().clear();
                if (this.f9660D != null) {
                    C0853a.m10853g().m10543a(this.f9660D);
                }
                this.f9660D = ThemeManager.mix.page.getTextureElement(ThemeShellDescription.PAGE_ADD_BUTTON, C3489a.f11520g, C3489a.f11520g);
                this.f9661E.textures().addElement(this.f9660D);
                C2951n.this.m4107T();
                this.f9668e = true;
                this.f9681r = true;
                this.f9670g = 90.0f;
                this.f9683t = this.f9670g - (C2951n.this.f9615m.m4183r() * this.f9672i);
                Iterator it = C2951n.this.f9613k.iterator();
                while (it.hasNext()) {
                    C2932g c2932g = (C2932g) it.next();
                    c2932g.m4185p();
                    Number3d localToGlobal = c2932g.localToGlobal(new Number3d());
                    Number3d localRotationToGlobal = c2932g.localRotationToGlobal(new Number3d());
                    c2932g.removeFromParent();
                    this.f9666c.globalToLocal(localToGlobal);
                    c2932g.position().setAllFrom(localToGlobal);
                    c2932g.rotation().setAllFrom(localRotationToGlobal);
                    c2932g.removeFromParent();
                    this.f9666c.addChild(c2932g);
                    m3979b(c2932g, 750);
                }
                m3952k();
                this.f9667d.removeFromParent();
                this.f9666c.removeFromParent();
                C2951n.this.f9610h.addChildAt(this.f9667d, 1);
                C2951n.this.f9610h.addChildAt(this.f9666c, 1);
                C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.f.n.b.2
                    @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                    /* renamed from: a */
                    public void mo732a() {
                        C2969b.this.f9681r = false;
                    }
                };
                if (C2951n.this.f9616n < 16) {
                    m3954j();
                }
                C1014c.m10326a(this.f9666c);
                c1017d.m10296j(this.f9678o);
                c1017d.m10307c(this.f9676m);
                c1017d.mo10298h(this.f9679p);
                c1017d.m10305d(this.f9683t);
                C1014c.m10325a(this.f9666c, 750, c1017d);
            }
        }

        /* renamed from: h */
        private void m3958h() {
            this.f9662F.removeFromParent();
            this.f9662F.position().f2526x = 0.0f;
            this.f9662F.m5321a(0.0f, C0892a.f2552C + (100.0f * C0892a.f2566b), true);
            C2951n.this.f9610h.addChild(this.f9662F);
            this.f9662F.m5319b();
        }

        /* renamed from: i */
        private void m3956i() {
            this.f9662F.m5318c();
        }

        /* renamed from: c */
        public void m3974c() {
            C4187w.m615a(3);
        }

        /* renamed from: d */
        public void m3970d() {
        }

        /* renamed from: a */
        public void m3996a(float f, float f2) {
            this.f9662F.m5322a(C4189x.m594b(this.f9662F.f8410c, this.f9662F.f8411d, f, f2), f, f2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: j */
        public void m3954j() {
            this.f9659C = C2951n.this.m4105V();
            this.f9659C.mo4177x();
            C2951n.this.m4053d(this.f9659C);
            this.f9659C.m4185p();
            this.f9659C.m4232a(-1);
            this.f9659C.rotation().f2526x = this.f9677n;
            this.f9659C.rotation().f2527y = 0.0f;
            this.f9659C.rotation().f2528z = 0.0f;
            this.f9659C.position().f2526x = 0.0f;
            this.f9659C.position().f2528z = this.f9686w - (((0.0f - this.f9680q) + 50.0f) / 2.0f);
            this.f9659C.position().f2527y = C0892a.f2552C;
            this.f9659C.m4219a(true);
            this.f9659C.m4199d(false);
            this.f9667d.addChild(this.f9659C);
            C1017d c1017d = new C1017d();
            c1017d.mo10298h(0.0f);
            c1017d.mo10301f(0.0f);
            c1017d.m10294l(1.0f);
            c1017d.m10293m(1.0f);
            C1014c.m10325a(this.f9659C, 500, c1017d);
        }

        /* renamed from: k */
        private void m3952k() {
            this.f9669f = this.f9670g - ((this.f9666c.numChildren() - 1) * this.f9672i);
        }

        /* renamed from: b */
        private void m3979b(final C2932g c2932g, int i) {
            c2932g.mouseEnabled(false);
            C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.f.n.b.3
                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: a */
                public void mo732a() {
                    c2932g.mouseEnabled(true);
                }
            };
            C1014c.m10326a(c2932g);
            C2976a m3973c = m3973c(c2932g);
            c1017d.mo10301f(m3973c.f9702a);
            c1017d.m10296j(m3973c.f9703b);
            c1017d.mo10298h(0.0f);
            c1017d.m10307c(0.0f);
            c1017d.m10305d(m3973c.f9704c);
            c1017d.m10294l(1.0f);
            c1017d.m10293m(1.0f);
            C1014c.m10325a(c2932g, i, c1017d);
        }

        /* renamed from: b */
        private void m3980b(C2932g c2932g) {
            C1014c.m10326a(c2932g);
            C2976a m3973c = m3973c(c2932g);
            c2932g.position().setAll(m3973c.f9702a, 0.0f, m3973c.f9703b);
            c2932g.rotation().setAll(0.0f, m3973c.f9704c, 0.0f);
            c2932g.scale().setAll(1.0f, 1.0f, 1.0f);
        }

        /* renamed from: c */
        private C2976a m3973c(C2932g c2932g) {
            C2976a c2976a = new C2976a();
            int m4183r = c2932g.m4183r();
            c2976a.f9702a = (float) (Math.cos((m4183r * (-this.f9673j)) - 3.141592653589793d) * this.f9671h);
            c2976a.f9703b = (float) (Math.sin((m4183r * (-this.f9673j)) - 3.141592653589793d) * this.f9671h);
            c2976a.f9704c = (m4183r * this.f9672i) - 90.0f;
            return c2976a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l */
        public void m3950l() {
            if (this.f9668e && !this.f9681r && !this.f9663G) {
                C3359a.f11101o.m3611i();
                ArrayList arrayList = (ArrayList) this.f9667d.children().clone();
                if (this.f9667d.numChildren() > 0) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C2932g c2932g = (C2932g) ((C0975i) it.next());
                        if (c2932g.m4183r() == -1) {
                            if (c2932g.m4184q()) {
                                m3963f(c2932g);
                            } else {
                                m3991a(c2932g, 500);
                            }
                        }
                    }
                }
                C2951n.this.f9596F.m4304a(C2951n.this.f9615m);
                this.f9681r = true;
                int i = 0;
                while (true) {
                    int i2 = i;
                    if (i2 < C2951n.this.f9616n) {
                        C2932g c2932g2 = (C2932g) C2951n.this.f9613k.get(i2);
                        if (i2 > 0) {
                            if (i2 == 1) {
                                if (C2951n.this.f9616n != 2) {
                                    c2932g2.m4206b((C2932g) C2951n.this.f9613k.get(i2 + 1));
                                    c2932g2.m4224a((C2932g) C2951n.this.f9613k.get(C2951n.this.f9616n - 1));
                                } else {
                                    c2932g2.m4206b((C2932g) null);
                                    c2932g2.m4224a((C2932g) null);
                                }
                            } else if (i2 == C2951n.this.f9616n - 1) {
                                if (C2951n.this.f9616n != 3) {
                                    c2932g2.m4206b((C2932g) C2951n.this.f9613k.get(1));
                                    c2932g2.m4224a((C2932g) C2951n.this.f9613k.get(i2 - 1));
                                } else {
                                    c2932g2.m4206b((C2932g) null);
                                    c2932g2.m4224a((C2932g) C2951n.this.f9613k.get(i2 - 1));
                                }
                            } else {
                                c2932g2.m4206b((C2932g) C2951n.this.f9613k.get(i2 + 1));
                                c2932g2.m4224a((C2932g) C2951n.this.f9613k.get(i2 - 1));
                            }
                        }
                        c2932g2.m4186o();
                        Number3d localToGlobal = c2932g2.localToGlobal(new Number3d());
                        Number3d localRotationToGlobal = c2932g2.localRotationToGlobal(new Number3d());
                        c2932g2.removeFromParent();
                        c2932g2.mouseEnabled(true);
                        C2951n.this.f9611i.globalToLocal(localToGlobal);
                        c2932g2.position().setAllFrom(localToGlobal);
                        c2932g2.rotation().setAllFrom(localRotationToGlobal);
                        C2951n.this.f9611i.addChild(c2932g2);
                        C1017d c1017d = new C1017d();
                        C1014c.m10326a(c2932g2);
                        C2951n.this.f9596F.m4306a(c1017d, c2932g2);
                        C1014c.m10325a(c2932g2, 500, c1017d);
                        i = i2 + 1;
                    } else {
                        C1014c.m10325a(this.f9666c, 500, new C1017d() { // from class: com.tsf.shell.f.f.n.b.4
                            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                            /* renamed from: a */
                            public void mo732a() {
                                Iterator it2;
                                C2969b.this.f9661E.textures().clear();
                                if (C2969b.this.f9660D != null) {
                                    C0853a.m10853g().m10543a(C2969b.this.f9660D);
                                    C2969b.this.f9660D = null;
                                }
                                C2969b.this.f9666c.removeFromParent();
                                C2969b.this.f9667d.removeFromParent();
                                C2969b.this.f9681r = false;
                                C2969b.this.f9668e = false;
                                C2951n.this.m4106U();
                                String str = "";
                                while (true) {
                                    String str2 = str;
                                    if (C2951n.this.f9613k.iterator().hasNext()) {
                                        str = str2 + ((C2932g) it2.next()).m4181t() + ",";
                                    } else {
                                        C3430e.m2456i(str2.substring(0, str2.length() - 1));
                                        return;
                                    }
                                }
                            }
                        });
                        this.f9666c.position().f2528z = 0.0f;
                        this.f9666c.position().f2527y = 0.0f;
                        this.f9666c.rotation().f2526x = 0.0f;
                        this.f9666c.rotation().f2527y = 0.0f;
                        C2951n.this.f9615m.setFocus();
                        C2951n.this.m4045g();
                        return;
                    }
                }
            }
        }

        /* renamed from: e */
        public void m3967e() {
            this.f9682s = true;
            float f = this.f9666c.rotation().f2527y;
            this.f9675l = f;
            this.f9683t = f;
            this.f9666c.setAnimationObjectState(true);
            this.f9666c.invalidate();
        }

        /* renamed from: f */
        public void m3964f() {
            this.f9682s = false;
        }

        /* renamed from: a */
        public void m3997a(float f) {
            this.f9683t += this.f9674k * f;
        }

        /* renamed from: b */
        public void m3981b(float f) {
            this.f9683t = this.f9675l + (this.f9674k * f);
        }

        /* renamed from: a */
        public void m3990a(C2932g c2932g, MotionEvent motionEvent) {
            if (c2932g.m4181t() != -1 && !c2932g.m4184q() && C2951n.this.f9616n > 2) {
                m3958h();
            }
            C4187w.m616a();
            this.f9684u = c2932g;
            c2932g.setAnimationObjectState(true);
            Number3d localToGlobal = c2932g.localToGlobal(new Number3d());
            Number3d localRotationToGlobal = c2932g.localRotationToGlobal(new Number3d());
            c2932g.removeFromParent();
            this.f9667d.globalToLocal(localToGlobal);
            this.f9667d.globalRotationToLocal(localRotationToGlobal);
            c2932g.position().setAllFrom(localToGlobal);
            c2932g.rotation().setAllFrom(localRotationToGlobal);
            this.f9667d.addChild(c2932g);
            C1017d c1017d = new C1017d();
            C1014c.m10326a(c2932g);
            c1017d.m10294l(1.1f);
            c1017d.m10293m(1.1f);
            c1017d.m10305d(0.0f);
            C1014c.m10325a(c2932g, 250, c1017d);
            if (c2932g.getTag() != null && (c2932g.getTag() instanceof Number3d)) {
                this.f9685v = (Number3d) c2932g.getTag();
                this.f9685v.f2526x = this.f9684u.position().f2526x;
                this.f9685v.f2527y = this.f9684u.position().f2527y;
                return;
            }
            this.f9685v = this.f9684u.position().m13946clone();
            this.f9685v.f2528z = this.f9686w;
        }

        /* renamed from: b */
        public void m3978b(C2932g c2932g, MotionEvent motionEvent) {
            boolean z;
            if (c2932g.m4181t() == -1 || c2932g.m4184q() || C2951n.this.f9616n <= 2) {
                z = false;
            } else {
                m3956i();
                m3966e(c2932g);
                z = true;
            }
            this.f9688y = this.f9658B;
            c2932g.setAnimationObjectState(false);
            float[] m601a = C4189x.m601a(motionEvent);
            if (m601a[1] - this.f9680q > -50.0f) {
                m3994a(m601a[0], m601a[1], c2932g, true);
                m3991a(c2932g, 250);
                if (c2932g.m4184q()) {
                    c2932g.m4219a(false);
                    C2951n.this.m4081ac();
                    this.f9659C = null;
                    if (C2951n.this.f9616n < 16) {
                        m3954j();
                    }
                }
            } else {
                if (c2932g.m4183r() != -1) {
                    c2932g.setTag(this.f9685v.m13946clone());
                    m3960g(c2932g);
                }
                if (c2932g.m4245Q() == 0 && z) {
                    m3963f(c2932g);
                    z = false;
                } else {
                    C1017d c1017d = new C1017d();
                    C1014c.m10326a(c2932g);
                    c1017d.m10294l(1.0f);
                    c1017d.m10293m(1.0f);
                    c1017d.m10305d(0.0f);
                    c1017d.m10303e(0.0f);
                    C1014c.m10325a(c2932g, 250, c1017d);
                }
            }
            if (z) {
                float[] m601a2 = C4189x.m601a(motionEvent);
                if (this.f9662F.calTouchCollision(m601a2[0], m601a2[1])) {
                    m3963f(c2932g);
                }
            }
            C2951n.this.f9597G.m3850a(C2951n.this.f9615m);
        }

        /* renamed from: a */
        public void m3989a(final C2932g c2932g, MotionEvent motionEvent, final MotionEvent motionEvent2) {
            final float[] m601a = C4189x.m601a(motionEvent2);
            this.f9684u.position().f2526x = this.f9685v.f2526x + ((motionEvent2.getX() - motionEvent.getX()) * 1.3f);
            this.f9684u.position().f2527y = this.f9685v.f2527y - (motionEvent2.getY() - motionEvent.getY());
            C0853a.m10865a().m10585b(new Runnable() { // from class: com.tsf.shell.f.f.n.b.5
                @Override // java.lang.Runnable
                public void run() {
                    C2969b.this.m3996a(m601a[0], m601a[1]);
                    float f = m601a[1] - C2969b.this.f9680q;
                    if (f > 50.0f) {
                        C2969b.this.f9684u.rotation().f2526x = C2969b.this.f9676m;
                        C2969b.this.f9684u.position().f2528z = C2969b.this.f9685v.f2528z;
                        C2969b.this.m3995a(m601a[0], m601a[1], c2932g);
                    } else if (f < -50.0f) {
                        C2969b.this.f9684u.rotation().f2526x = C2969b.this.f9677n;
                        C2969b.this.f9684u.position().f2528z = C2969b.this.f9685v.f2528z - ((f + 50.0f) / 2.0f);
                    } else {
                        C2969b.this.f9684u.rotation().f2526x = (((f + 50.0f) / 100.0f) * (C2969b.this.f9676m - C2969b.this.f9677n)) + C2969b.this.f9677n;
                        C2969b.this.f9684u.position().f2528z = C2969b.this.f9685v.f2528z;
                        C2969b.this.m3995a(m601a[0], m601a[1], c2932g);
                    }
                    if (c2932g.m4181t() != -1 && !c2932g.m4184q() && C2951n.this.f9616n > 2) {
                        float[] m601a2 = C4189x.m601a(motionEvent2);
                        if (C2969b.this.f9662F.calTouchCollision(m601a2[0], m601a2[1])) {
                            C2969b.this.m3969d(c2932g);
                        } else {
                            C2969b.this.m3966e(c2932g);
                        }
                    }
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public void m3969d(C2932g c2932g) {
            if (!this.f9687x) {
                this.f9687x = true;
                c2932g.setDefaultColor(C3567c.f11844c);
                m3974c();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public void m3966e(C2932g c2932g) {
            if (this.f9687x) {
                this.f9687x = false;
                c2932g.clearDefaultColor();
                m3970d();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public void m3995a(float f, float f2, C2932g c2932g) {
            int i = C0892a.f2553D / 2;
            if (f > i - (C0892a.f2565a * 50.0f)) {
                this.f9688y = this.f9689z;
            } else if (f < (-i) + (C0892a.f2565a * 50.0f)) {
                this.f9688y = this.f9657A;
            } else {
                m3994a(f, f2, c2932g, false);
            }
        }

        /* renamed from: a */
        private void m3994a(float f, float f2, C2932g c2932g, boolean z) {
            C2932g c2932g2;
            this.f9688y = this.f9658B;
            C0975i hittingTarget = this.f9666c.getHittingTarget(f, f2, true);
            if (hittingTarget != null) {
                if (hittingTarget == null) {
                    float f3 = this.f9666c.rotation().f2527y;
                    if (f3 > this.f9670g) {
                        f3 = this.f9670g;
                    } else if (f3 < this.f9669f) {
                        f3 = this.f9669f;
                    }
                    c2932g2 = (C2932g) C2951n.this.f9613k.get(((int) (((this.f9670g - f3) / (this.f9670g - this.f9669f)) * (this.f9666c.numChildren() - 1))) + 1);
                } else {
                    c2932g2 = (C2932g) hittingTarget.parent();
                }
                if (c2932g2.m4181t() == -1 && c2932g == (c2932g2 = C2951n.this.m4029o())) {
                    c2932g.m4232a(1);
                    return;
                }
                int m4183r = c2932g2.m4183r();
                int size = m4183r == -1 ? C2951n.this.f9613k.size() - 1 : m4183r;
                int m4183r2 = c2932g.m4183r();
                if (m4183r2 == -1) {
                    int size2 = C2951n.this.f9613k.size();
                    for (int i = size; i < size2; i++) {
                        C2932g c2932g3 = (C2932g) C2951n.this.f9613k.get(i);
                        if (c2932g3.m4183r() != -1) {
                            c2932g3.m4232a(i + 1);
                            m3979b(c2932g3, 250);
                        }
                    }
                    C2951n.this.f9613k.remove(c2932g);
                    C2951n.this.f9613k.add(size, c2932g);
                    c2932g.m4232a(size);
                } else if (size > m4183r2) {
                    int i2 = m4183r2 + 1;
                    while (true) {
                        int i3 = i2;
                        if (i3 < size + 1) {
                            C2932g c2932g4 = (C2932g) C2951n.this.f9613k.get(i3);
                            c2932g4.m4232a(i3 - 1);
                            m3979b(c2932g4, 250);
                            i2 = i3 + 1;
                        } else {
                            C2951n.this.f9613k.remove(c2932g);
                            C2951n.this.f9613k.add(size, c2932g);
                            c2932g.m4232a(size);
                            return;
                        }
                    }
                } else {
                    for (int i4 = size; i4 < m4183r2; i4++) {
                        C2932g c2932g5 = (C2932g) C2951n.this.f9613k.get(i4);
                        c2932g5.m4232a(i4 + 1);
                        m3979b(c2932g5, 250);
                    }
                    C2951n.this.f9613k.remove(c2932g);
                    C2951n.this.f9613k.add(size, c2932g);
                    c2932g.m4232a(size);
                }
            }
        }

        /* renamed from: f */
        private void m3963f(final C2932g c2932g) {
            this.f9663G = true;
            C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.f.n.b.6
                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: a */
                public void mo732a() {
                    C2951n.this.m4058c(c2932g);
                    c2932g.removeFromParent();
                    c2932g.destroy();
                    c2932g.scale().setAll(1.0f, 1.0f, 1.0f);
                    if (c2932g.m4184q()) {
                        c2932g.m4219a(false);
                    }
                    if (C2951n.this.f9616n < 16 && C2969b.this.f9659C == null) {
                        C2969b.this.m3954j();
                    }
                    C2969b.this.f9663G = false;
                }
            };
            c1017d.m10294l(0.0f);
            c1017d.m10293m(0.0f);
            c1017d.m10292n(0.0f);
            c1017d.mo10301f(0.0f);
            c1017d.mo10298h(C0892a.f2552C);
            C1014c.m10326a(c2932g);
            C1014c.m10325a(c2932g, 500, c1017d);
            C2951n.this.f9613k.remove(c2932g);
            C2951n.this.m4081ac();
            if (C2951n.this.f9615m == c2932g) {
                C2951n.this.m4094a((C2932g) C2951n.this.f9613k.get(1), false, true);
            }
            if (C2951n.this.f9620r == c2932g) {
                C2951n.this.m4097a((C2932g) C2951n.this.f9613k.get(1));
            }
        }

        /* renamed from: g */
        private void m3960g(C2932g c2932g) {
            int m4183r = c2932g.m4183r();
            int size = C2951n.this.f9613k.size();
            c2932g.m4232a(-1);
            C2951n.this.f9613k.remove(c2932g);
            C2951n.this.f9613k.add(c2932g);
            for (int i = m4183r; i < size; i++) {
                C2932g c2932g2 = (C2932g) C2951n.this.f9613k.get(i);
                if (c2932g2.m4183r() != -1) {
                    c2932g2.m4232a(i);
                    m3979b(c2932g2, 250);
                }
            }
            m3952k();
        }

        /* renamed from: a */
        public void m3991a(C2932g c2932g, int i) {
            Number3d localToGlobal = c2932g.localToGlobal(new Number3d());
            Number3d localRotationToGlobal = c2932g.localRotationToGlobal(new Number3d());
            c2932g.removeFromParent();
            this.f9666c.globalToLocal(localToGlobal);
            this.f9666c.globalRotationToLocal(localRotationToGlobal);
            localRotationToGlobal.f2528z = 0.0f;
            localRotationToGlobal.f2526x = 0.0f;
            localRotationToGlobal.f2527y = 0.0f;
            c2932g.position().setAllFrom(localToGlobal);
            c2932g.rotation().f2526x = 0.0f;
            c2932g.rotation().f2527y = -this.f9666c.rotation().f2527y;
            c2932g.rotation().f2528z = 0.0f;
            c2932g.setTag(null);
            if (c2932g.m4183r() == -1) {
                c2932g.m4232a(this.f9666c.numChildren());
            }
            this.f9666c.addChild(c2932g);
            m3952k();
            C2951n.this.f9613k.remove(c2932g);
            C2951n.this.f9613k.add(c2932g.m4183r(), c2932g);
            m3979b(c2932g, i);
        }

        /* renamed from: a */
        public void m3992a(C2932g c2932g) {
            if (!c2932g.m4184q()) {
                if (C2951n.this.f9620r == c2932g) {
                    C2951n.this.m4094a(c2932g, false, true);
                    return;
                } else {
                    C2951n.this.m4097a(c2932g);
                    return;
                }
            }
            m3994a(0.0f, this.f9680q, c2932g, true);
            m3991a(c2932g, 500);
            c2932g.m4219a(false);
            C2951n.this.m4081ac();
            this.f9659C = null;
            if (C2951n.this.f9616n < 16) {
                m3954j();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.tsf.shell.f.f.n$b$a */
        /* loaded from: classes.dex */
        public class C2976a {

            /* renamed from: a */
            float f9702a;

            /* renamed from: b */
            float f9703b;

            /* renamed from: c */
            float f9704c;

            C2976a() {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.shell.f.f.n$a */
    /* loaded from: classes.dex */
    public class C2967a extends C0937a {

        /* renamed from: a */
        boolean f9649a;

        /* renamed from: b */
        boolean f9650b;

        /* renamed from: e */
        private C2932g f9652e;

        /* renamed from: f */
        private boolean f9653f;

        /* renamed from: g */
        private boolean f9654g;

        public C2967a(C0975i c0975i) {
            super(c0975i);
            this.f9649a = false;
            this.f9650b = false;
        }

        /* renamed from: a */
        public void m3999a(C2932g c2932g) {
            this.f9652e = c2932g;
        }

        @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
        /* renamed from: c */
        public void mo2122c(MotionEvent motionEvent) {
            if (!this.f9654g && this.f9652e.m4181t() != -1) {
                C2951n.this.f9625w.m3990a(this.f9652e, motionEvent);
                this.f9654g = true;
            }
        }

        @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
        /* renamed from: a */
        public void mo2129a(MotionEvent motionEvent, MotionEvent motionEvent2) {
            if (this.f9654g) {
                C2951n.this.f9625w.m3989a(this.f9652e, motionEvent, motionEvent2);
            }
        }

        @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
        /* renamed from: a */
        public void mo502a(MotionEvent motionEvent) {
            C4187w.m614b();
            C2951n.this.f9625w.m3992a(this.f9652e);
        }

        @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
        /* renamed from: f */
        public void mo1653f(MotionEvent motionEvent) {
            if (this.f9654g) {
                this.f9654g = false;
                C2951n.this.f9625w.m3978b(this.f9652e, motionEvent);
            }
            C2951n.this.f9625w.m3964f();
        }

        @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
        /* renamed from: e */
        public void mo1654e(MotionEvent motionEvent) {
            this.f9649a = false;
            this.f9650b = false;
            this.f9653f = true;
        }

        @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
        /* renamed from: a */
        public void mo527a(MotionEvent motionEvent, final MotionEvent motionEvent2, float f, float f2) {
            if (this.f9653f) {
                this.f9653f = false;
                if (Math.abs(f) > Math.abs(f2)) {
                    this.f9650b = true;
                    C2951n.this.f9625w.m3967e();
                } else {
                    C0853a.m10865a().m10585b(new Runnable() { // from class: com.tsf.shell.f.f.n.a.1
                        @Override // java.lang.Runnable
                        public void run() {
                            C2967a.this.mo2122c(motionEvent2);
                        }
                    });
                }
            }
            if (this.f9650b) {
                C2951n.this.f9625w.m3981b(motionEvent2.getX() - motionEvent.getX());
            }
        }

        @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
        /* renamed from: b */
        public void mo3209b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (this.f9650b && Math.abs(f) > 250.0f) {
                C2951n.this.f9625w.m3997a(f / 2.0f);
            }
        }
    }
}
