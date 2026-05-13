package com.tsf.shell.preference.p196a.p197a;

import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p037e.C0938a;
import com.censivn.C3DEngine.p031b.p037e.C0950e;
import com.censivn.C3DEngine.p031b.p037e.C0956i;
import com.tsf.C1306b;
import com.tsf.shell.Home;
import com.tsf.shell.manager.p168b.C3430e;
import com.tsf.shell.manager.p183o.C3566b;
import com.tsf.shell.preference.p196a.C3993a;
/* renamed from: com.tsf.shell.preference.a.a.b */
/* loaded from: classes.dex */
public class C4024b extends C0956i {

    /* renamed from: a */
    public static float f13180a = 4.0f;

    /* renamed from: b */
    public static float f13181b = 0.8f;

    /* renamed from: c */
    private boolean f13182c = false;

    /* renamed from: d */
    private C0950e f13183d;

    /* renamed from: e */
    private C0938a f13184e;

    /* renamed from: f */
    private C3993a f13185f;

    /* renamed from: g */
    private float f13186g;

    public C4024b() {
        m10516a(C1306b.C1315i.text_screen_scale);
        this.f13185f = new C3993a();
        mo838b(this.f13185f);
        this.f13184e = new C0938a();
        this.f13184e.m10488h(C1306b.C1315i.text_default_scale);
        this.f13184e.m10490b("" + C0892a.f2569e);
        this.f13184e.m10538a(new C0938a.C0940a() { // from class: com.tsf.shell.preference.a.a.b.1
            @Override // com.censivn.C3DEngine.p031b.p037e.C0938a.C0940a
            /* renamed from: a */
            public boolean mo551a(boolean z) {
                C4024b.this.f13182c = z;
                if (C4024b.this.f13182c) {
                    C4024b.this.m878b(C0892a.f2569e);
                }
                C4024b.this.m874i();
                return true;
            }
        });
        mo838b(this.f13184e);
        this.f13183d = new C0950e() { // from class: com.tsf.shell.preference.a.a.b.2
            @Override // com.censivn.C3DEngine.p031b.p037e.C0950e, com.censivn.C3DEngine.p031b.p037e.C0953h
            /* renamed from: f */
            public void mo866f(int i) {
                if (i < 10) {
                    m10475d("0." + i);
                } else {
                    String num = Integer.toString(i);
                    m10475d(num.substring(0, 1) + "." + num.substring(1));
                }
                C4024b.this.f13185f.m923a(C4024b.this.f13183d.m10474e() / 10.0f);
            }
        };
        this.f13183d.m10472g(C1306b.C1315i.text_screen_scale);
        this.f13183d.m10470h(C1306b.C1315i.notic_screen_scale_tips);
        this.f13183d.m10469i((int) (f13181b * 10.0f));
        this.f13183d.m10468j((int) (f13180a * 10.0f));
        this.f13183d.mo865k(8);
        this.f13183d.m10495a("");
        mo838b(this.f13183d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public void m874i() {
        if (this.f13182c) {
            this.f13183d.mo821i();
        } else {
            this.f13183d.mo820j();
        }
    }

    /* renamed from: a */
    public static float m882a(float f) {
        if (f != 0.0f) {
            if (f > f13180a) {
                f = f13180a;
            } else if (f < f13181b) {
                f = f13181b;
            }
        }
        return ((int) (f * 10.0f)) / 10.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m878b(float f) {
        this.f13183d.mo865k((int) (10.0f * f));
    }

    @Override // com.censivn.C3DEngine.p031b.p037e.C0945c
    /* renamed from: f */
    public void mo553f() {
        float m2515aj = C3430e.m2515aj();
        this.f13186g = m2515aj;
        this.f13182c = m2515aj == 0.0f;
        this.f13184e.m10535c(this.f13182c);
        m878b(C0892a.f2568d);
        m874i();
        m874i();
    }

    @Override // com.censivn.C3DEngine.p031b.p037e.C0945c
    /* renamed from: g */
    public void mo552g() {
        float e = this.f13184e.m10534e() ? 0.0f : this.f13183d.m10474e() / 10.0f;
        if (e != this.f13186g) {
            C3566b.m1970c();
            C3430e.m2470f(e);
            Home.m6177b().m6186a(300);
        }
    }
}
