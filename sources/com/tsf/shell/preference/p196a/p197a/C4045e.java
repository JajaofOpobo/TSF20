package com.tsf.shell.preference.p196a.p197a;

import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p037e.C0938a;
import com.censivn.C3DEngine.p031b.p037e.C0950e;
import com.censivn.C3DEngine.p031b.p037e.C0956i;
import com.tsf.C1306b;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.p168b.C3430e;
import com.tsf.shell.manager.p174f.C3470a;
import com.tsf.shell.p096f.p131f.p132a.C2862h;
import com.tsf.shell.utils.C4189x;
/* renamed from: com.tsf.shell.preference.a.a.e */
/* loaded from: classes.dex */
public class C4045e extends C0956i {

    /* renamed from: a */
    private boolean f13230a = false;

    /* renamed from: b */
    private C0950e f13231b;

    /* renamed from: c */
    private C0950e f13232c;

    /* renamed from: d */
    private C0950e f13233d;

    /* renamed from: e */
    private C0938a f13234e;

    /* renamed from: f */
    private C0938a f13235f;

    /* renamed from: g */
    private C0938a f13236g;

    public C4045e() {
        m10516a(C1306b.C1315i.text_preferences);
        this.f13235f = new C0938a();
        this.f13235f.m10488h(C1306b.C1315i.mn_drawer_top_menu);
        mo838b(this.f13235f);
        this.f13236g = new C0938a();
        this.f13236g.m10488h(C1306b.C1315i.mn_drawer_bottom_menu);
        mo838b(this.f13236g);
        this.f13234e = new C0938a();
        this.f13234e.m10488h(C1306b.C1315i.mn_grid_size_auto);
        this.f13234e.m10487i(C1306b.C1315i.mn_grid_size_auto_summary);
        this.f13234e.m10538a(new C0938a.C0940a() { // from class: com.tsf.shell.preference.a.a.e.1
            @Override // com.censivn.C3DEngine.p031b.p037e.C0938a.C0940a
            /* renamed from: a */
            public boolean mo551a(boolean z) {
                C4045e.this.f13230a = z;
                if (C4045e.this.f13230a) {
                    C4045e.this.f13232c.mo865k(C2862h.f9289B);
                    C4045e.this.f13231b.mo865k(C2862h.f9290C);
                }
                C4045e.this.m851i();
                return true;
            }
        });
        mo838b(this.f13234e);
        C0950e c0950e = new C0950e();
        this.f13232c = c0950e;
        c0950e.m10472g(C1306b.C1315i.mn_grid_columns);
        c0950e.m10470h(C1306b.C1315i.mn_grid_columns_summary);
        c0950e.m10469i(0);
        c0950e.m10468j(100);
        c0950e.mo865k(0);
        c0950e.m10495a(" ");
        mo838b(c0950e);
        C0950e c0950e2 = new C0950e();
        this.f13231b = c0950e2;
        c0950e2.m10472g(C1306b.C1315i.mn_grid_rows);
        c0950e2.m10470h(C1306b.C1315i.mn_grid_rows_summary);
        c0950e2.m10469i(0);
        c0950e2.m10468j(100);
        c0950e2.mo865k(0);
        c0950e2.m10495a(" ");
        mo838b(c0950e2);
        C0950e c0950e3 = new C0950e();
        this.f13233d = c0950e3;
        c0950e3.m10472g(C1306b.C1315i.mn_background_transparency);
        c0950e3.m10469i(0);
        c0950e3.m10468j(100);
        c0950e3.mo865k(0);
        c0950e3.m10495a(" %");
        mo838b(c0950e3);
    }

    @Override // com.censivn.C3DEngine.p031b.p037e.C0945c
    /* renamed from: f */
    public void mo553f() {
        this.f13230a = C3430e.m2549W();
        String str = " ( " + (C0892a.f2564O ? C4189x.m588c(C1306b.C1315i.mn_orientation_portrait) : C4189x.m588c(C1306b.C1315i.mn_orientation_landscape)) + " )";
        this.f13231b.m10479b(C4189x.m588c(C1306b.C1315i.mn_grid_rows) + str);
        this.f13232c.m10479b(C4189x.m588c(C1306b.C1315i.mn_grid_columns) + str);
        this.f13232c.m10469i(C2862h.f9307x);
        this.f13232c.m10468j(C2862h.f9308y);
        this.f13231b.m10469i(C2862h.f9309z);
        this.f13231b.m10468j(C2862h.f9288A);
        this.f13232c.mo865k(C2862h.f9299p);
        this.f13231b.mo865k(C2862h.f9300q);
        this.f13233d.mo865k(C3470a.f11457a);
        this.f13234e.m10535c(this.f13230a);
        this.f13235f.m10535c(C3430e.m2555Q());
        this.f13236g.m10535c(C3430e.m2554R());
        m851i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public void m851i() {
        if (this.f13230a) {
            this.f13231b.mo821i();
            this.f13232c.mo821i();
            return;
        }
        this.f13231b.mo820j();
        this.f13232c.mo820j();
    }

    @Override // com.censivn.C3DEngine.p031b.p037e.C0945c
    /* renamed from: g */
    public void mo552g() {
        int e = this.f13233d.m10474e();
        if (e != C3470a.f11457a) {
            C3430e.m2453j(e);
            C3470a.m2288a(e);
        }
        if (this.f13235f.m10534e() != C3430e.m2555Q()) {
            if (this.f13235f.m10534e()) {
                C3359a.f11094h.m4019t().m4403g(true);
            } else {
                C3359a.f11094h.m4019t().m4401h(true);
            }
        }
        if (this.f13236g.m10534e() != C3430e.m2554R()) {
            if (this.f13236g.m10534e()) {
                C3359a.f11094h.m4019t().m4431b(true, true);
            } else {
                C3359a.f11094h.m4019t().m4415c(true, true);
            }
        }
        if (this.f13230a) {
            if (C3430e.m2549W() != this.f13230a) {
                C3430e.m2444l(this.f13230a);
                if (C2862h.f9299p != this.f13232c.m10474e() || C2862h.f9300q != this.f13231b.m10474e()) {
                    C3359a.f11094h.m4019t().m4479aE();
                    return;
                }
                return;
            }
            return;
        }
        if (C3430e.m2549W() != this.f13230a) {
            C3430e.m2444l(this.f13230a);
        }
        if (C2862h.f9299p != this.f13232c.m10474e()) {
            m850j();
        } else if (C2862h.f9300q != this.f13231b.m10474e()) {
            m850j();
        }
    }

    /* renamed from: j */
    private void m850j() {
        int e = this.f13231b.m10474e();
        int e2 = this.f13232c.m10474e();
        C3430e.m2541a(e, e2);
        C3359a.f11094h.m4019t().m4501a(e2, e);
    }
}
