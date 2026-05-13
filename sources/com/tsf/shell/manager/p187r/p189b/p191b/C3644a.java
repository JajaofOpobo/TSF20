package com.tsf.shell.manager.p187r.p189b.p191b;

import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p041g.C0986a;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.tsf.shell.p096f.p118e.p127g.AbstractC2593d;
import com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c;
/* renamed from: com.tsf.shell.manager.r.b.b.a */
/* loaded from: classes.dex */
public class C3644a {

    /* renamed from: c */
    protected C0980j f12053c = new C0980j();

    /* renamed from: d */
    protected AbstractC2593d f12054d;

    public C3644a(AbstractC2593d abstractC2593d) {
        this.f12054d = abstractC2593d;
        this.f12053c.visible(false);
    }

    /* renamed from: a */
    public void m1820a(boolean z) {
        if (this.f12053c.visible() && z) {
            C1017d c1017d = new C1017d() { // from class: com.tsf.shell.manager.r.b.b.a.1
                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: a */
                public void mo732a() {
                    C3644a.this.f12053c.visible(false);
                    C3644a.this.mo1786b();
                }
            };
            c1017d.mo10298h(-this.f12054d.getHeight());
            c1017d.m10314a(0);
            C1014c.m10326a(this.f12053c);
            C1014c.m10325a(this.f12053c, AbstractC2580c.ANIMATION_TIME, c1017d);
        } else {
            this.f12053c.position().f2527y = -this.f12054d.getHeight();
            this.f12053c.visible(false);
            this.f12053c.alpha(0.0f);
            mo1786b();
        }
        mo1772a();
    }

    /* renamed from: b */
    public void m1819b(boolean z) {
        if (z) {
            if (!this.f12053c.visible()) {
                this.f12053c.alpha(0.0f);
                this.f12053c.position().f2527y = -this.f12054d.getHeight();
            }
            C1017d c1017d = new C1017d() { // from class: com.tsf.shell.manager.r.b.b.a.2
                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: a */
                public void mo732a() {
                    C3644a.this.mo1774d();
                }
            };
            c1017d.mo10298h(0.0f);
            c1017d.m10314a(255);
            C1014c.m10326a(this.f12053c);
            c1017d.m10313a(C0986a.f2946a);
            C1014c.m10325a(this.f12053c, AbstractC2580c.ANIMATION_TIME, c1017d);
        } else {
            this.f12053c.alpha(255.0f);
            this.f12053c.position().f2527y = 0.0f;
            mo1774d();
        }
        this.f12053c.visible(true);
        mo1766c();
    }

    /* renamed from: a */
    public void mo1772a() {
    }

    /* renamed from: b */
    public void mo1786b() {
    }

    /* renamed from: c */
    public void mo1766c() {
    }

    /* renamed from: d */
    public void mo1774d() {
    }

    /* renamed from: e */
    public void mo1763e() {
    }

    /* renamed from: a */
    public void mo1771a(float f, float f2, float f3, float f4) {
    }

    /* renamed from: f */
    public C0980j m1818f() {
        return this.f12053c;
    }
}
