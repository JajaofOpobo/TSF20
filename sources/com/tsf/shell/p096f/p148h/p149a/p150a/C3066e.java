package com.tsf.shell.p096f.p148h.p149a.p150a;

import com.censivn.C3DEngine.p031b.p037e.C0938a;
import com.censivn.C3DEngine.p031b.p037e.C0950e;
import com.censivn.C3DEngine.p031b.p037e.C0956i;
import com.tsf.C1306b;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.p096f.p148h.p149a.C3069b;
/* renamed from: com.tsf.shell.f.h.a.a.e */
/* loaded from: classes.dex */
public class C3066e extends C0956i {

    /* renamed from: a */
    private C3063d f9950a;

    /* renamed from: b */
    private C0938a f9951b;

    /* renamed from: c */
    private C0950e f9952c;

    /* renamed from: d */
    private C3069b f9953d;

    public C3066e(C3063d c3063d) {
        this.f9950a = c3063d;
        m10516a(C1306b.C1315i.text_preferences);
        C0938a c0938a = new C0938a();
        this.f9951b = c0938a;
        c0938a.m10488h(C1306b.C1315i.text_show_recents);
        c0938a.m10538a(new C0938a.C0940a() { // from class: com.tsf.shell.f.h.a.a.e.1
            @Override // com.censivn.C3DEngine.p031b.p037e.C0938a.C0940a
            /* renamed from: a */
            public boolean mo551a(boolean z) {
                return true;
            }
        });
        mo838b(c0938a);
        C0950e c0950e = new C0950e();
        this.f9952c = c0950e;
        c0950e.m10472g(C1306b.C1315i.text_show_recents);
        c0950e.m10470h(C1306b.C1315i.mn_contacts_maximum);
        c0950e.m10495a("");
        c0950e.m10469i(3);
        c0950e.m10468j(10);
        this.f9953d = new C3069b();
        mo838b(this.f9953d);
    }

    @Override // com.censivn.C3DEngine.p031b.p037e.C0945c
    /* renamed from: h */
    public void mo832h() {
    }

    @Override // com.censivn.C3DEngine.p031b.p037e.C0945c
    /* renamed from: f */
    public void mo553f() {
        this.f9951b.m10535c(this.f9950a.m3686k().m3682c());
        this.f9952c.mo865k(this.f9950a.m3686k().m3694a());
    }

    @Override // com.censivn.C3DEngine.p031b.p037e.C0945c
    /* renamed from: g */
    public void mo552g() {
        if (this.f9951b.m10534e() != this.f9950a.m3686k().visible()) {
            this.f9950a.m3686k().m3684a(this.f9951b.m10534e());
        }
        C3359a.f11101o.m3633a().m3808a(this.f9953d.m3676e());
    }
}
