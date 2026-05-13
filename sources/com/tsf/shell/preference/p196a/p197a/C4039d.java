package com.tsf.shell.preference.p196a.p197a;

import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p037e.C0938a;
import com.censivn.C3DEngine.p031b.p037e.C0941b;
import com.censivn.C3DEngine.p031b.p037e.C0945c;
import com.censivn.C3DEngine.p031b.p037e.C0949d;
import com.censivn.C3DEngine.p031b.p037e.C0950e;
import com.censivn.C3DEngine.p031b.p037e.C0953h;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.tsf.C1306b;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.p168b.C3430e;
import com.tsf.shell.preference.p196a.C4082e;
import com.tsf.shell.preference.p196a.C4083f;
import com.tsf.shell.utils.C4189x;
/* renamed from: com.tsf.shell.preference.a.a.d */
/* loaded from: classes.dex */
public class C4039d extends C0945c {

    /* renamed from: a */
    private C0950e f13214a;

    /* renamed from: b */
    private C4082e f13215b;

    /* renamed from: c */
    private C4083f f13216c;

    /* renamed from: d */
    private C0950e f13217d;

    /* renamed from: e */
    private C0938a f13218e;

    /* renamed from: f */
    private C0938a f13219f;

    /* renamed from: g */
    private int f13220g = 0;

    /* renamed from: h */
    private int f13221h = 0;

    /* renamed from: i */
    private C0949d f13222i;

    /* renamed from: j */
    private C0949d f13223j;

    /* renamed from: k */
    private C0941b f13224k;

    public C4039d() {
        m10516a(C1306b.C1315i.text_preferences);
        this.f13224k = new C0941b();
        this.f13224k.m10525g(C1306b.C1315i.text_standard_dock);
        this.f13224k.m10525g(C1306b.C1315i.text_slinding_dock);
        m10512a(this.f13224k);
        this.f13224k.m10530a(new C0941b.C0942a() { // from class: com.tsf.shell.preference.a.a.d.1
            @Override // com.censivn.C3DEngine.p031b.p037e.C0941b.C0942a
            /* renamed from: a */
            public void mo857a(int i) {
                C4039d.this.m10515a(i, i != 0);
            }
        });
        this.f13222i = new C0949d();
        this.f13223j = new C0949d();
        m10513a(this.f13222i);
        m10513a(this.f13223j);
        this.f13216c = new C4083f(C0892a.m10742a(250.0f));
        this.f13222i.m10498a(this.f13216c);
        C0950e c0950e = new C0950e();
        this.f13217d = c0950e;
        c0950e.m10470h(C1306b.C1315i.text_width_margin_summary);
        c0950e.m10495a(" %");
        c0950e.mo865k(0);
        c0950e.m10469i(0);
        c0950e.m10468j(100);
        this.f13222i.m10498a(c0950e);
        this.f13218e = new C0938a();
        this.f13218e.m10488h(C1306b.C1315i.mn_indicator_mode);
        this.f13218e.m10487i(C1306b.C1315i.mn_indicator_mode_summary);
        this.f13222i.m10498a(this.f13218e);
        this.f13218e.m10538a(new C0938a.C0940a() { // from class: com.tsf.shell.preference.a.a.d.2
            @Override // com.censivn.C3DEngine.p031b.p037e.C0938a.C0940a
            /* renamed from: a */
            public boolean mo551a(boolean z) {
                if (z) {
                    C4039d.this.f13216c.m796h();
                    return true;
                }
                C4039d.this.f13216c.m795m();
                return true;
            }
        });
        c0950e.m10484a(new C0953h.C0955a() { // from class: com.tsf.shell.preference.a.a.d.3
            @Override // com.censivn.C3DEngine.p031b.p037e.C0953h.C0955a
            /* renamed from: a */
            public boolean mo733a(int i) {
                C4039d.this.f13216c.m797f(i);
                if (C0892a.f2564O) {
                    C4039d.this.f13220g = i;
                    return true;
                }
                C4039d.this.f13221h = i;
                return true;
            }
        });
        C4082e c4082e = new C4082e(C0892a.m10742a(300.0f));
        this.f13215b = c4082e;
        this.f13223j.m10498a(c4082e);
        C0950e c0950e2 = new C0950e();
        this.f13214a = c0950e2;
        c0950e2.m10472g(C1306b.C1315i.text_button_transparency);
        c0950e2.m10495a(" %");
        c0950e2.mo865k(70);
        c0950e2.m10484a(new C0953h.C0955a() { // from class: com.tsf.shell.preference.a.a.d.4
            @Override // com.censivn.C3DEngine.p031b.p037e.C0953h.C0955a
            /* renamed from: a */
            public boolean mo733a(int i) {
                C4039d.this.f13215b.m801f(i);
                return true;
            }
        });
        this.f13223j.m10498a(c0950e2);
        this.f13219f = new C0938a();
        this.f13219f.m10488h(C1306b.C1315i.mn_indicator_mode);
        this.f13219f.m10487i(C1306b.C1315i.mn_indicator_mode_summary);
        this.f13223j.m10498a(this.f13219f);
        this.f13219f.m10538a(new C0938a.C0940a() { // from class: com.tsf.shell.preference.a.a.d.5
            @Override // com.censivn.C3DEngine.p031b.p037e.C0938a.C0940a
            /* renamed from: a */
            public boolean mo551a(boolean z) {
                if (z) {
                    C4039d.this.f13215b.m800h();
                    return true;
                }
                C4039d.this.f13215b.m799m();
                return true;
            }
        });
    }

    @Override // com.censivn.C3DEngine.p031b.p037e.C0945c
    /* renamed from: b */
    public int mo861b() {
        return C3359a.f11093g.m5950c();
    }

    @Override // com.censivn.C3DEngine.p031b.p037e.C0945c
    /* renamed from: h */
    public void mo832h() {
        m858i();
    }

    /* renamed from: i */
    private void m858i() {
        if (C0892a.f2564O) {
            this.f13217d.m10479b(C4189x.m588c(C1306b.C1315i.text_width_margin) + " (" + C4189x.m588c(C1306b.C1315i.text_vertical) + ")");
            this.f13217d.mo865k(this.f13220g);
            this.f13216c.m797f(this.f13220g);
            return;
        }
        this.f13217d.m10479b(C4189x.m588c(C1306b.C1315i.text_width_margin) + " (" + C4189x.m588c(C1306b.C1315i.text_horizontal) + ")");
        this.f13217d.mo865k(this.f13221h);
        this.f13216c.m797f(this.f13221h);
    }

    @Override // com.censivn.C3DEngine.p031b.p037e.C0945c
    /* renamed from: f */
    public void mo553f() {
        this.f13224k.alpha(0.0f);
        C1017d c1017d = new C1017d();
        c1017d.m10314a(255);
        C1014c.m10326a(this.f13224k);
        C1014c.m10325a(this.f13224k, 500, c1017d);
        this.f13224k.m10526f(C3359a.f11093g.m5950c());
        int m5820i = C3359a.f11093g.f7459b.m5820i();
        this.f13214a.mo865k(m5820i);
        this.f13215b.m801f(m5820i);
        this.f13220g = C3430e.m2422t();
        this.f13221h = C3430e.m2419u();
        this.f13218e.m10535c(C3430e.m2518ag());
        this.f13219f.m10535c(C3430e.m2517ah());
        m858i();
        if (C3430e.m2518ag()) {
            this.f13216c.m796h();
        } else {
            this.f13216c.m795m();
        }
        if (C3430e.m2517ah()) {
            this.f13215b.m800h();
        } else {
            this.f13215b.m799m();
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p037e.C0945c
    /* renamed from: g */
    public void mo552g() {
        C3359a.f11093g.f7459b.m5851a(this.f13214a.m10474e(), true);
        C3359a.f11093g.f7458a.m5735a(this.f13217d.m10474e());
        C3430e.m2480d(this.f13220g);
        C3430e.m2474e(this.f13221h);
        C3430e.m2429q(this.f13218e.m10534e());
        C3430e.m2426r(this.f13219f.m10534e());
        C3359a.f11093g.m5951b(this.f13224k.m10527e());
    }
}
