package com.tsf.shell.p096f.p148h.p149a.p152b;

import com.censivn.C3DEngine.p031b.p037e.C0950e;
import com.censivn.C3DEngine.p031b.p037e.C0956i;
import com.tsf.C1306b;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.p096f.p148h.p149a.C3069b;
/* renamed from: com.tsf.shell.f.h.a.b.b */
/* loaded from: classes.dex */
public class C3081b extends C0956i {

    /* renamed from: a */
    private C3076a f9976a;

    /* renamed from: b */
    private C0950e f9977b;

    /* renamed from: c */
    private C3069b f9978c;

    public C3081b(C3076a c3076a) {
        this.f9976a = c3076a;
        m10516a(C1306b.C1315i.text_preferences);
        C0950e c0950e = new C0950e();
        this.f9977b = c0950e;
        c0950e.m10472g(C1306b.C1315i.text_display_count);
        c0950e.m10470h(C1306b.C1315i.text_recent_apps_display_count_summary);
        c0950e.m10495a("");
        c0950e.m10469i(3);
        c0950e.m10468j(15);
        mo838b(c0950e);
        this.f9978c = new C3069b();
        mo838b(this.f9978c);
    }

    @Override // com.censivn.C3DEngine.p031b.p037e.C0945c
    /* renamed from: h */
    public void mo832h() {
    }

    @Override // com.censivn.C3DEngine.p031b.p037e.C0945c
    /* renamed from: f */
    public void mo553f() {
        this.f9977b.mo865k(this.f9976a.m3668k());
        m10516a(C3359a.f11101o.m3633a().m3809a() == 0 ? C1306b.C1315i.text_top : C1306b.C1315i.text_bottom);
    }

    @Override // com.censivn.C3DEngine.p031b.p037e.C0945c
    /* renamed from: g */
    public void mo552g() {
        if (this.f9977b.m10474e() != this.f9976a.m3668k()) {
            this.f9976a.m3672a(this.f9977b.m10474e(), true);
        }
        C3359a.f11101o.m3633a().m3808a(this.f9978c.m3676e());
    }
}
