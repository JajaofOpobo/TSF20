package com.tsf.shell.p096f.p131f.p132a.p133a;

import android.view.KeyEvent;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcutAppInfo;
import com.censivn.C3DEngine.p030a.C0855b;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p033b.C0908c;
import com.censivn.C3DEngine.p031b.p033b.C0911d;
import com.censivn.C3DEngine.p031b.p036d.C0937a;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p038f.C0985n;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.censivn.C3DEngine.p031b.p041g.p043b.C1013b;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.p166a.C3364c;
import com.tsf.shell.manager.p168b.C3430e;
import com.tsf.shell.manager.p185p.C3586b;
import com.tsf.shell.manager.p185p.C3591c;
import com.tsf.shell.p096f.p100b.C2284a;
import com.tsf.shell.p096f.p118e.C2502d;
import com.tsf.shell.p096f.p131f.p132a.p133a.C2685b;
import com.tsf.shell.p096f.p131f.p132a.p133a.p134a.C2683b;
import com.tsf.shell.p096f.p131f.p132a.p133a.p134a.C2684c;
import com.tsf.shell.p096f.p153i.p155b.p160e.C3222g;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.tsf.shell.f.f.a.a.c */
/* loaded from: classes.dex */
public class C2695c {

    /* renamed from: a */
    public static final float f8876a = C0892a.m10742a(200.0f);

    /* renamed from: b */
    public static int f8877b = 0;

    /* renamed from: c */
    public static int f8878c = 1;

    /* renamed from: d */
    private C0911d f8879d;

    /* renamed from: e */
    private C0980j f8880e;

    /* renamed from: f */
    private C0908c f8881f;

    /* renamed from: g */
    private C2284a f8882g;

    /* renamed from: h */
    private C2502d<C2683b> f8883h;

    /* renamed from: i */
    private ArrayList<C2684c> f8884i;

    /* renamed from: j */
    private C0985n f8885j;

    /* renamed from: k */
    private C2722f f8886k;

    /* renamed from: l */
    private C2717e f8887l;

    /* renamed from: m */
    private C2712d f8888m;

    /* renamed from: n */
    private C2711a f8889n;

    /* renamed from: p */
    private C3586b f8891p;

    /* renamed from: q */
    private int f8892q;

    /* renamed from: r */
    private int f8893r;

    /* renamed from: o */
    private boolean f8890o = false;

    /* renamed from: s */
    private boolean f8894s = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.shell.f.f.a.a.c$a */
    /* loaded from: classes.dex */
    public class C2711a implements C3364c.InterfaceC3365a {
        C2711a() {
        }

        @Override // com.tsf.shell.manager.p166a.C3364c.InterfaceC3365a
        /* renamed from: a */
        public void mo2677a(C3222g c3222g, boolean z) {
        }

        @Override // com.tsf.shell.manager.p166a.C3364c.InterfaceC3365a
        /* renamed from: a */
        public void mo2678a(C3222g c3222g) {
        }

        @Override // com.tsf.shell.manager.p166a.C3364c.InterfaceC3365a
        /* renamed from: b */
        public void mo2676b(C3222g c3222g, boolean z) {
        }

        @Override // com.tsf.shell.manager.p166a.C3364c.InterfaceC3365a
        /* renamed from: k_ */
        public void mo2675k_() {
        }

        @Override // com.tsf.shell.manager.p166a.C3364c.InterfaceC3365a
        /* renamed from: a */
        public void mo2679a() {
        }
    }

    /* renamed from: a */
    public void m4892a() {
        this.f8892q = this.f8892q == f8877b ? f8878c : f8877b;
        Iterator<C2684c> it = this.f8884i.iterator();
        while (it.hasNext()) {
            it.next().mo4845a(this.f8892q, true);
        }
        m4859i();
    }

    /* renamed from: b */
    public int m4877b() {
        return this.f8892q;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public C2683b m4878a(String str) {
        Iterator<C2684c> it = this.f8884i.iterator();
        while (it.hasNext()) {
            C2684c next = it.next();
            if (next instanceof C2683b) {
                C2683b c2683b = (C2683b) next;
                if (c2683b.m4942g().equals(str)) {
                    return c2683b;
                }
            }
        }
        return null;
    }

    public C2695c() {
        this.f8892q = C3430e.m2508aq();
        int i = this.f8892q == f8877b ? f8877b : f8878c;
        this.f8893r = i;
        this.f8892q = i;
        this.f8889n = new C2711a() { // from class: com.tsf.shell.f.f.a.a.c.1
            @Override // com.tsf.shell.p096f.p131f.p132a.p133a.C2695c.C2711a, com.tsf.shell.manager.p166a.C3364c.InterfaceC3365a
            /* renamed from: a */
            public void mo2677a(C3222g c3222g, boolean z) {
                String m4919a = C2685b.m4919a(c3222g);
                C2683b m4878a = C2695c.this.m4878a(m4919a);
                if (m4878a == null) {
                    C2695c.this.m4875b(C2685b.m4917a(m4919a, c3222g));
                    return;
                }
                m4878a.m4940a(c3222g);
            }

            @Override // com.tsf.shell.p096f.p131f.p132a.p133a.C2695c.C2711a, com.tsf.shell.manager.p166a.C3364c.InterfaceC3365a
            /* renamed from: b */
            public void mo2676b(C3222g c3222g, boolean z) {
                C2683b m4879a = C2695c.this.m4879a(c3222g);
                if (m4879a != null) {
                    m4879a.m4938b(c3222g);
                }
            }
        };
        this.f8886k = new C2722f(this);
        this.f8884i = new ArrayList<>();
        this.f8887l = new C2717e(this);
        this.f8888m = new C2712d(this);
        this.f8880e = new C0980j() { // from class: com.tsf.shell.f.f.a.a.c.3
            @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
            public C0975i getHittingTarget(float f, float f2, boolean z) {
                C0975i hittingTarget = C2695c.this.f8887l.getHittingTarget(f, f2, false);
                if (hittingTarget == null) {
                    C0975i hittingTarget2 = C2695c.this.f8888m.getHittingTarget(f, f2, false);
                    return hittingTarget2 == null ? super.getHittingTarget(f, f2, z) : hittingTarget2;
                }
                return hittingTarget;
            }
        };
        this.f8881f = new C0908c() { // from class: com.tsf.shell.f.f.a.a.c.4
            @Override // com.censivn.C3DEngine.p031b.p033b.C0908c
            /* renamed from: d */
            public void mo4847d() {
                super.mo4847d();
                if (C2695c.this.f8879d != null) {
                    C2695c.this.f8879d.m10606b();
                }
            }
        };
        this.f8881f.m10617b(false);
        this.f8881f.m10628a(1);
        this.f8881f.addChild(this.f8887l);
        this.f8879d = new C0911d(this.f8881f);
        this.f8879d.m10611a(C0892a.f2553D, C0892a.f2554E - (C0892a.f2551B - this.f8879d.position().f2527y));
        this.f8882g = new C2284a() { // from class: com.tsf.shell.f.f.a.a.c.5
            @Override // com.tsf.shell.p096f.p100b.C2284a, com.censivn.C3DEngine.p031b.p035c.C0915b.InterfaceC0918a
            /* renamed from: a */
            public void mo727a(int i2, KeyEvent keyEvent) {
                if (i2 == 4 && !C2695c.this.f8890o) {
                    C2695c.this.m4863g();
                }
            }

            @Override // com.tsf.shell.p096f.p100b.C2284a, com.censivn.C3DEngine.p031b.p035c.C0915b.InterfaceC0918a
            /* renamed from: b */
            public void mo726b(int i2, KeyEvent keyEvent) {
            }

            @Override // com.tsf.shell.p096f.p100b.C2284a
            /* renamed from: a */
            public void mo2157a(int i2, int i3, int i4, int i5) {
                C2695c.this.m4867e();
            }
        };
        this.f8885j = new C0985n();
        C0937a c0937a = new C0937a(this.f8885j) { // from class: com.tsf.shell.f.f.a.a.c.6

            /* renamed from: b */
            private boolean f8904b = false;

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: e */
            public void mo1654e(MotionEvent motionEvent) {
                this.f8904b = false;
                C2695c.this.m4855k();
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: f */
            public void mo1653f(MotionEvent motionEvent) {
                C2695c.this.m4853l();
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo2129a(MotionEvent motionEvent, MotionEvent motionEvent2) {
                if (this.f8904b) {
                    C2695c.this.m4890a(motionEvent2);
                    return;
                }
                int x = (int) (motionEvent.getX() - motionEvent2.getX());
                int y = (int) (motionEvent.getY() - motionEvent2.getY());
                if ((x * x) + (y * y) > C0855b.f2417c) {
                    this.f8904b = true;
                }
            }
        };
        this.f8885j.maxX(C0892a.m10742a(150.0f));
        this.f8885j.minX(C0892a.m10742a(-150.0f));
        this.f8885j.setMouseEventListener(c0937a);
        this.f8880e.addChild(this.f8879d);
        this.f8880e.addChild(this.f8885j);
        this.f8883h = new C2502d<C2683b>() { // from class: com.tsf.shell.f.f.a.a.c.7
            @Override // com.tsf.shell.p096f.p118e.C2502d
            /* renamed from: a */
            public C2683b mo718b() {
                return new C2683b(C2695c.this);
            }
        };
    }

    /* renamed from: a */
    public void m4889a(C2684c c2684c) {
        m4871c(c2684c);
    }

    /* renamed from: c */
    public C0980j m4872c() {
        return this.f8880e;
    }

    /* renamed from: d */
    public void m4869d() {
        this.f8879d.m10605b(this.f8879d.m10612a(), 0.2f);
    }

    /* renamed from: b */
    public void m4876b(C2684c c2684c) {
        this.f8879d.m10605b(-c2684c.position().f2527y, 0.2f);
    }

    /* renamed from: e */
    public void m4867e() {
        this.f8881f.m10627a((int) (C0892a.f2553D - C0892a.m10742a(30.0f)), 0);
        this.f8879d.m10611a(C0892a.f2553D, C0892a.f2554E);
        this.f8879d.position().f2527y = C0892a.f2551B;
        m4859i();
        this.f8886k.m4834a();
    }

    /* renamed from: i */
    private void m4859i() {
        this.f8885j.maxY(C0892a.f2551B);
        this.f8885j.minY(C0892a.f2552C);
        if (this.f8892q == f8877b) {
            this.f8885j.position().f2526x = C0892a.f2590z;
            return;
        }
        this.f8885j.position().f2526x = C0892a.f2550A;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public void m4857j() {
        this.f8891p = new C3586b();
        float m10742a = C0892a.m10742a(20.0f);
        float m4826d = this.f8886k.m4826d() + m10742a;
        this.f8891p.position().f2527y = m4826d - C0892a.m10742a(400.0f);
        this.f8891p.position().f2526x = C0892a.f2590z + C0892a.m10742a(50.0f) + C0892a.m10742a(400.0f);
        this.f8891p.alpha(0.0f);
        C3359a.f11096j.m2232a(this.f8891p);
        this.f8891p.m1948a(new RunnableC27058(m10742a, m4826d), 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.shell.f.f.a.a.c$8 */
    /* loaded from: classes.dex */
    public class RunnableC27058 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ float f8906a;

        /* renamed from: b */
        final /* synthetic */ float f8907b;

        RunnableC27058(float f, float f2) {
            this.f8906a = f;
            this.f8907b = f2;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2695c.this.f8891p.m1951a(C0892a.f2590z + C0892a.m10742a(50.0f), this.f8907b, 600, new Runnable() { // from class: com.tsf.shell.f.f.a.a.c.8.1
                @Override // java.lang.Runnable
                public void run() {
                    C2695c.this.m4855k();
                    final float m4830b = C2695c.this.f8886k.m4830b() + RunnableC27058.this.f8906a;
                    final float m4828c = C2695c.this.f8886k.m4828c() - RunnableC27058.this.f8906a;
                    final float f = m4828c - m4830b;
                    C2695c.this.f8891p.m1950a(-20.0f, new Runnable() { // from class: com.tsf.shell.f.f.a.a.c.8.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            C2695c.this.m4891a(m4830b, m4828c, f);
                        }
                    });
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m4891a(float f, float f2, float f3) {
        C1014c.m10325a(new C1013b(), 1500, new C27089(f, f3, f2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.shell.f.f.a.a.c$9 */
    /* loaded from: classes.dex */
    public class C27089 extends C1017d {

        /* renamed from: a */
        final /* synthetic */ float f8914a;

        /* renamed from: b */
        final /* synthetic */ float f8915b;

        /* renamed from: c */
        final /* synthetic */ float f8916c;

        C27089(float f, float f2, float f3) {
            this.f8914a = f;
            this.f8915b = f2;
            this.f8916c = f3;
        }

        @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
        /* renamed from: a */
        public void mo518a(float f) {
            float f2 = this.f8914a + (this.f8915b * f);
            C2695c.this.f8891p.position().f2527y = f2;
            C2695c.this.f8886k.m4833a(f2);
        }

        @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
        /* renamed from: a */
        public void mo732a() {
            C1014c.m10325a(new C1013b(), 1500, new C1017d() { // from class: com.tsf.shell.f.f.a.a.c.9.1
                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: a */
                public void mo518a(float f) {
                    float f2 = C27089.this.f8916c - (C27089.this.f8915b * f);
                    C2695c.this.f8891p.position().f2527y = f2;
                    C2695c.this.f8886k.m4833a(f2);
                    C2695c.this.f8886k.m4833a(f2);
                }

                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: a */
                public void mo732a() {
                    C2695c.this.f8891p.m1946b(new Runnable() { // from class: com.tsf.shell.f.f.a.a.c.9.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            C2695c.this.m4853l();
                            C2695c.this.f8891p.removeFromParent();
                            C2695c.this.f8880e.mouseEnabled(true);
                            C2695c.this.f8890o = false;
                            C3591c.m1941a(14, false, true);
                        }
                    }, 0);
                }
            });
        }
    }

    /* renamed from: f */
    public void m4865f() {
        if (this.f8880e.parent() == null && C3359a.f11109w.m2716a().m2740b()) {
            this.f8890o = C3591c.m1939b(14);
            if (this.f8890o) {
                this.f8880e.mouseEnabled(false);
            }
            C3359a.f11109w.m2716a().m2743a(this.f8889n);
            this.f8880e.alpha(255.0f);
            final C0980j m2229a = C3359a.f11096j.m2229a(this.f8882g);
            boolean m4471aM = C3359a.f11094h.m4019t().m4471aM();
            Runnable runnable = new Runnable() { // from class: com.tsf.shell.f.f.a.a.c.10
                @Override // java.lang.Runnable
                public void run() {
                    C3359a.f11094h.m4019t().m4470aN();
                    ArrayList<C3222g> m2736d = C3359a.f11109w.m2716a().m2736d();
                    ArrayList arrayList = new ArrayList();
                    Iterator<C3222g> it = m2736d.iterator();
                    while (it.hasNext()) {
                        C3222g next = it.next();
                        if (next.m3534K() != null && !((LauncherShortcutAppInfo) next.m3534K()).isHide) {
                            arrayList.add(next);
                        }
                    }
                    ArrayList<C2685b.C2690c> m4916a = C2685b.m4916a(arrayList);
                    C2695c.this.f8881f.addChild(C2695c.this.f8888m);
                    C2695c.this.f8884i.add(C2695c.this.f8888m);
                    C2695c.this.f8888m.mo4845a(C2695c.this.f8892q, false);
                    C2695c.this.f8888m.mo4843e();
                    Iterator<C2685b.C2690c> it2 = m4916a.iterator();
                    while (it2.hasNext()) {
                        C2684c m4888a = C2695c.this.m4888a(it2.next());
                        m4888a.mo4845a(C2695c.this.f8892q, false);
                        m4888a.mo4843e();
                    }
                    m2229a.addChild(C2695c.this.f8880e);
                    C2695c.this.m4867e();
                    C2695c.this.f8888m.m4841g();
                    C2695c.this.f8879d.m10603c();
                    C2695c.this.f8887l.m4835f();
                    C2695c.this.f8885j.mouseEnabled(false);
                    C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.f.a.a.c.10.1
                        @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                        /* renamed from: a */
                        public void mo732a() {
                            C2695c.this.f8885j.mouseEnabled(true);
                            if (C2695c.this.f8890o) {
                                C2695c.this.m4857j();
                            }
                        }
                    };
                    C1014c.m10326a(C2695c.this.f8885j);
                    C1014c.m10325a(C2695c.this.f8885j, 750, c1017d);
                }
            };
            if (m4471aM) {
                C3359a.f11096j.m2220c();
                runnable.run();
                return;
            }
            C3359a.f11096j.m2227a(runnable);
        }
    }

    /* renamed from: c */
    private void m4871c(C2684c c2684c) {
        this.f8884i.remove(c2684c);
        c2684c.mo4842f();
        c2684c.removeFromParent();
        if (!(c2684c instanceof C2712d)) {
            this.f8883h.m5384a((C2683b) c2684c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public C2684c m4888a(C2685b.C2690c c2690c) {
        C2683b m5383c = this.f8883h.m5383c();
        m5383c.m4943a(c2690c);
        this.f8881f.addChild(m5383c);
        this.f8884i.add(m5383c);
        return m5383c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public C2684c m4875b(C2685b.C2690c c2690c) {
        C2683b m5383c = this.f8883h.m5383c();
        m5383c.m4943a(c2690c);
        this.f8881f.addChildAt(m5383c, C2685b.m4915a(this.f8884i, m5383c) + 1);
        return m5383c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public C2683b m4879a(C3222g c3222g) {
        Iterator<C2684c> it = this.f8884i.iterator();
        while (it.hasNext()) {
            C2684c next = it.next();
            if (next instanceof C2683b) {
                C2683b c2683b = (C2683b) next;
                if (c2683b.m4937c(c3222g)) {
                    return c2683b;
                }
            }
        }
        return null;
    }

    /* renamed from: g */
    public void m4863g() {
        C3359a.f11109w.m2716a().m2738b(this.f8889n);
        this.f8885j.mouseEnabled(false);
        C1017d c1017d = new C1017d();
        c1017d.m10314a(0);
        C1014c.m10326a(this.f8880e);
        C1014c.m10325a(this.f8880e, 250, c1017d);
        C3359a.f11096j.m2225a(new Runnable() { // from class: com.tsf.shell.f.f.a.a.c.2
            @Override // java.lang.Runnable
            public void run() {
                C2695c.this.f8887l.m4836e();
                C3359a.f11096j.m2224b();
                C2695c.this.f8880e.removeFromParent();
                Iterator it = C2695c.this.f8884i.iterator();
                while (it.hasNext()) {
                    C2684c c2684c = (C2684c) it.next();
                    c2684c.mo4842f();
                    c2684c.removeFromParent();
                    if (!(c2684c instanceof C2712d)) {
                        C2695c.this.f8883h.m5384a((C2683b) c2684c);
                    }
                    C2695c.this.f8880e.alpha(255.0f);
                }
                C2695c.this.f8884i.clear();
                if (C2695c.this.f8893r != C2695c.this.f8892q) {
                    C2695c.this.f8893r = C2695c.this.f8892q;
                    C3430e.m2430q(C2695c.this.f8892q);
                }
            }
        }, true);
    }

    /* renamed from: h */
    public ArrayList<C2684c> m4861h() {
        return this.f8884i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public void m4855k() {
        this.f8894s = true;
        this.f8886k.m4824e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public void m4853l() {
        this.f8894s = false;
        this.f8886k.m4822f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m4890a(MotionEvent motionEvent) {
        if (this.f8894s) {
            this.f8886k.m4832a(motionEvent);
        }
    }
}
