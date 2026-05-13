package com.tsf.shell.p096f.p131f;

import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.censivn.C3DEngine.p031b.p046h.p048b.C1025c;
import com.tsf.shell.Home;
import com.tsf.shell.p095e.C2262d;
import com.tsf.shell.p096f.p153i.C3112b;
import com.tsf.shell.p096f.p153i.p155b.p160e.C3222g;
import java.util.Iterator;
/* renamed from: com.tsf.shell.f.f.k */
/* loaded from: classes.dex */
public class C2945k extends C2932g {

    /* renamed from: l */
    private C1025c f9577l;

    public C2945k() {
        this.f9539b = new C2262d(C0853a.m10856d(), this.f9538a);
    }

    @Override // com.tsf.shell.p096f.p131f.C2932g
    /* renamed from: O */
    public void mo4150O() {
        Iterator<C0975i> it = this.f9540c.children().iterator();
        while (it.hasNext()) {
            C0975i next = it.next();
            if (next instanceof C3112b) {
                ((C3112b) next).mo3356ae();
            }
        }
        super.mo4150O();
    }

    /* renamed from: a */
    public void m4149a() {
        C0853a.m10865a().m10588a(new Runnable() { // from class: com.tsf.shell.f.f.k.1
            @Override // java.lang.Runnable
            public void run() {
                Home.m6177b().m6164l().addView(C2945k.this.f9539b);
            }
        });
    }

    /* renamed from: aj */
    public void m4144aj() {
        C0853a.m10865a().m10588a(new Runnable() { // from class: com.tsf.shell.f.f.k.2
            @Override // java.lang.Runnable
            public void run() {
                Home.m6177b().m6164l().removeView(C2945k.this.f9539b);
            }
        });
    }

    @Override // com.tsf.shell.p096f.p131f.C2932g
    /* renamed from: ab */
    public void mo4146ab() {
        if (!m4216ad() && m4238X()) {
            super.mo4146ab();
            mo4188m().m3561g();
            Iterator<C0975i> it = this.f9540c.children().iterator();
            while (it.hasNext()) {
                C0975i next = it.next();
                if (next instanceof C3112b) {
                    ((C3112b) next).mo3081q_();
                }
            }
        }
    }

    @Override // com.tsf.shell.p096f.p131f.C2932g
    /* renamed from: ac */
    public void mo4145ac() {
        if (m4216ad() && m4237Y()) {
            super.mo4145ac();
            Iterator<C0975i> it = this.f9540c.children().iterator();
            while (it.hasNext()) {
                C0975i next = it.next();
                if (next instanceof C3112b) {
                    ((C3112b) next).mo3083j();
                }
            }
        }
    }

    /* renamed from: a */
    public void m4147a(C1025c.C1033a c1033a) {
        this.f9577l = new C1025c(this, false, c1033a);
        int i = ((int) ((C0892a.f2553D > C0892a.f2554E ? C0892a.f2554E : C0892a.f2553D) * 0.9d)) / 2;
        this.f9577l.m10265a(i, i);
        this.f9577l.scale().setAll(0.5f, 0.5f, 1.0f);
        this.f9577l.alpha(0.0f);
        C1017d c1017d = new C1017d();
        c1017d.m10294l(1.0f);
        c1017d.m10293m(1.0f);
        c1017d.m10314a(255);
        C1014c.m10326a(this.f9577l);
        C1014c.m10325a(this.f9577l, 386, c1017d);
    }

    /* renamed from: a */
    public void m4148a(C0975i c0975i, C3222g c3222g) {
        C3222g m3109ba = c3222g.m3109ba();
        m3109ba.removeFromParent();
        m3109ba.position().setAllFrom(this.f9577l.globalToLocal(c0975i.localToGlobal(new Number3d())));
        m3109ba.position().f2528z = 0.0f;
        this.f9577l.m10259a(m3109ba);
    }
}
