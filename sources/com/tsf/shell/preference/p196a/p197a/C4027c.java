package com.tsf.shell.preference.p196a.p197a;

import android.app.Activity;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p035c.C0925e;
import com.censivn.C3DEngine.p031b.p037e.C0938a;
import com.censivn.C3DEngine.p031b.p037e.C0950e;
import com.censivn.C3DEngine.p031b.p037e.C0956i;
import com.censivn.C3DEngine.p031b.p037e.C0957j;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.tsf.C1306b;
import com.tsf.shell.Home;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.p168b.C3430e;
import com.tsf.shell.manager.p185p.C3595e;
import com.tsf.shell.p094d.C2240b;
import com.tsf.shell.utils.C4170g;
/* renamed from: com.tsf.shell.preference.a.a.c */
/* loaded from: classes.dex */
public class C4027c extends C0956i {

    /* renamed from: a */
    private C0957j f13189a;

    /* renamed from: b */
    private C0938a f13190b;

    /* renamed from: c */
    private C0938a f13191c;

    /* renamed from: d */
    private C0938a f13192d;

    /* renamed from: e */
    private C0938a f13193e;

    /* renamed from: f */
    private C0938a f13194f;

    /* renamed from: g */
    private C0938a f13195g;

    /* renamed from: h */
    private C0938a f13196h;

    /* renamed from: i */
    private C4038a f13197i;

    /* renamed from: j */
    private boolean f13198j;

    /* renamed from: k */
    private boolean f13199k;

    /* renamed from: l */
    private boolean f13200l;

    /* renamed from: m */
    private boolean f13201m;

    /* renamed from: n */
    private int f13202n;

    public C4027c() {
        m10516a(C1306b.C1315i.text_preferences);
        this.f13189a = new C0957j();
        this.f13189a.m10488h(C1306b.C1315i.mn_screen_orientation);
        this.f13189a.m10462a(new C0957j.C0959a() { // from class: com.tsf.shell.preference.a.a.c.1
            @Override // com.censivn.C3DEngine.p031b.p037e.C0957j.C0959a
            /* renamed from: a */
            public void mo842a() {
                C0853a.m10865a().m10588a(new Runnable() { // from class: com.tsf.shell.preference.a.a.c.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        C2240b.m6023a(C0853a.m10856d(), C4027c.this.f13189a);
                    }
                });
            }
        });
        mo838b(this.f13189a);
        this.f13190b = new C0938a();
        this.f13190b.m10488h(C1306b.C1315i.mn_infinite_scroll);
        this.f13190b.m10487i(C1306b.C1315i.mn_infinite_scroll_summary);
        this.f13190b.m10538a(new C0938a.C0940a() { // from class: com.tsf.shell.preference.a.a.c.2
            @Override // com.censivn.C3DEngine.p031b.p037e.C0938a.C0940a
            /* renamed from: a */
            public boolean mo551a(boolean z) {
                if (C3430e.m2562J() != z) {
                    C3430e.m2493b(Boolean.valueOf(z));
                    C3359a.f11094h.m4045g();
                    return true;
                }
                return true;
            }
        });
        mo838b(this.f13190b);
        this.f13191c = new C0938a();
        this.f13191c.m10488h(C1306b.C1315i.mn_transparent_navigation_bar);
        this.f13191c.m10538a(new C0938a.C0940a() { // from class: com.tsf.shell.preference.a.a.c.3
            @Override // com.censivn.C3DEngine.p031b.p037e.C0938a.C0940a
            /* renamed from: a */
            public boolean mo551a(boolean z) {
                C4027c.this.f13201m = z;
                return true;
            }
        });
        mo838b(this.f13191c);
        this.f13192d = new C0938a();
        this.f13192d.m10488h(C1306b.C1315i.mn_transparent_notification_bar);
        this.f13192d.m10487i(C1306b.C1315i.mn_transparent_notification_bar_summary);
        this.f13192d.m10538a(new C0938a.C0940a() { // from class: com.tsf.shell.preference.a.a.c.4
            @Override // com.censivn.C3DEngine.p031b.p037e.C0938a.C0940a
            /* renamed from: a */
            public boolean mo551a(boolean z) {
                C4027c.this.f13200l = z;
                return true;
            }
        });
        mo838b(this.f13192d);
        this.f13193e = new C0938a();
        this.f13193e.m10488h(C1306b.C1315i.mn_show_notification_bar);
        this.f13193e.m10538a(new C0938a.C0940a() { // from class: com.tsf.shell.preference.a.a.c.5
            @Override // com.censivn.C3DEngine.p031b.p037e.C0938a.C0940a
            /* renamed from: a */
            public boolean mo551a(boolean z) {
                C4027c.this.f13199k = z;
                return true;
            }
        });
        mo838b(this.f13193e);
        this.f13195g = new C0938a();
        this.f13195g.m10488h(C1306b.C1315i.text_floating_button);
        this.f13195g.m10538a(new C0938a.C0940a() { // from class: com.tsf.shell.preference.a.a.c.6
            @Override // com.censivn.C3DEngine.p031b.p037e.C0938a.C0940a
            /* renamed from: a */
            public boolean mo551a(boolean z) {
                return true;
            }
        });
        mo838b(this.f13195g);
        this.f13197i = new C4038a();
        mo838b(this.f13197i);
        this.f13194f = new C0938a();
        this.f13194f.m10488h(C1306b.C1315i.text_lock_desktop);
        this.f13194f.m10487i(C1306b.C1315i.text_lock_desktop_summary);
        this.f13194f.m10538a(new C0938a.C0940a() { // from class: com.tsf.shell.preference.a.a.c.7
            @Override // com.censivn.C3DEngine.p031b.p037e.C0938a.C0940a
            /* renamed from: a */
            public boolean mo551a(boolean z) {
                C3359a.f11083A.m2208b();
                return true;
            }
        });
        mo838b(this.f13194f);
        this.f13196h = new C0938a();
        this.f13196h.m10488h(C1306b.C1315i.mn_vibration_feedback);
        this.f13196h.m10487i(C1306b.C1315i.mn_vibration_feedback_summary);
        this.f13196h.m10538a(new C0938a.C0940a() { // from class: com.tsf.shell.preference.a.a.c.8
            @Override // com.censivn.C3DEngine.p031b.p037e.C0938a.C0940a
            /* renamed from: a */
            public boolean mo551a(boolean z) {
                if (C3430e.m2520ae() != z) {
                    C3430e.m2432p(z);
                    return true;
                }
                return true;
            }
        });
        mo838b(this.f13196h);
    }

    @Override // com.censivn.C3DEngine.p031b.p037e.C0945c
    /* renamed from: f */
    public void mo553f() {
        C3359a.f11087a.m1929a(C3595e.f11926k).m1916b();
        this.f13199k = C3430e.m2556P();
        this.f13200l = C3430e.m2557O();
        this.f13201m = C3430e.m2558N();
        this.f13198j = C3430e.m2522ac();
        this.f13195g.m10535c(this.f13198j);
        C2240b.m6022a(this.f13189a);
        this.f13190b.m10535c(C3430e.m2562J());
        this.f13193e.m10535c(this.f13199k);
        if (C4170g.m684b()) {
            this.f13191c.m10535c(this.f13201m);
        } else {
            m10463c(this.f13191c);
        }
        if (C4170g.m683c()) {
            this.f13192d.m10535c(this.f13200l);
        } else {
            m10463c(this.f13192d);
        }
        this.f13194f.m10535c(C3359a.f11083A.m2204d());
        this.f13196h.m10535c(C3430e.m2520ae());
        this.f13202n = C3430e.m2523ab();
        this.f13197i.mo865k(this.f13202n);
    }

    @Override // com.censivn.C3DEngine.p031b.p037e.C0945c
    /* renamed from: g */
    public void mo552g() {
        C0853a.m10865a().m10588a(new Runnable() { // from class: com.tsf.shell.preference.a.a.c.9
            @Override // java.lang.Runnable
            public void run() {
                if (C3430e.m2556P() != C4027c.this.f13199k) {
                    C3359a.f11088b.m10562a(!C4027c.this.f13199k);
                }
                if (C4170g.m683c() && C3430e.m2557O() != C4027c.this.f13200l) {
                    C0925e c0925e = C3359a.f11088b;
                    C0925e.m10558b(Home.m6177b(), C4027c.this.f13200l, true);
                }
                if (C4170g.m684b() && C3430e.m2558N() != C4027c.this.f13201m) {
                    C3359a.f11088b.m10567a((Activity) Home.m6177b(), C4027c.this.f13201m, true);
                }
            }
        });
        int e = this.f13197i.m10474e();
        boolean m10534e = this.f13195g.m10534e();
        if (m10534e != this.f13198j) {
            C3430e.m2435o(m10534e);
        }
        if (e != this.f13202n) {
            C3430e.m2442m(e);
        }
        C3359a.f11101o.m3626a(m10534e, e);
    }

    /* renamed from: com.tsf.shell.preference.a.a.c$a */
    /* loaded from: classes.dex */
    public static class C4038a extends C0950e {

        /* renamed from: b */
        final C0980j f13213b = new C0980j();

        public C4038a() {
            m10486a(C0892a.m10742a(200.0f));
            m10472g(C1306b.C1315i.text_transparency);
            m10470h(C1306b.C1315i.text_floating_button_transparency_summary);
            m10469i(0);
            m10468j(100);
            m10495a(" %");
            C0981k m10741a = C0892a.m10741a(128.0f, 128.0f);
            m10741a.textures().addElement(C3359a.f11101o.m3625b().m5470a());
            C0981k m10741a2 = C0892a.m10741a(46.0f, 46.0f);
            m10741a2.textures().addElement(C3359a.f11101o.m3625b().m5464b());
            this.f13213b.addChild(m10741a);
            this.f13213b.addChild(m10741a2);
            this.f13213b.position().f2527y = -C0892a.m10742a(120.0f);
        }

        @Override // com.censivn.C3DEngine.p031b.p037e.C0950e, com.censivn.C3DEngine.p031b.p037e.C0953h
        /* renamed from: f */
        public void mo866f(int i) {
            super.mo866f(i);
            m864l(i);
        }

        @Override // com.censivn.C3DEngine.p031b.p033b.C0908c, com.censivn.C3DEngine.p031b.p038f.C0980j
        public void onDrawChildStart() {
            super.onDrawChildStart();
            this.f13213b.dispatchDraw();
        }

        @Override // com.censivn.C3DEngine.p031b.p037e.C0953h, com.censivn.C3DEngine.p031b.p033b.C0908c
        /* renamed from: c */
        public void mo544c(int i) {
            super.mo544c(i);
            this.f13213b.position().f2526x = ((-i) / 2.0f) + C0892a.m10742a(100.0f);
        }

        @Override // com.censivn.C3DEngine.p031b.p037e.C0953h
        /* renamed from: k */
        public void mo865k(int i) {
            super.mo865k(i);
            m864l(i);
        }

        /* renamed from: l */
        private void m864l(int i) {
            this.f13213b.alpha((i / 100.0f) * 255.0f);
        }
    }
}
