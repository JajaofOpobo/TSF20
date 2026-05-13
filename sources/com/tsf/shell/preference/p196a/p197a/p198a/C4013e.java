package com.tsf.shell.preference.p196a.p197a.p198a;

import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.p096f.p107d.p112c.p113a.C2421c;
/* renamed from: com.tsf.shell.preference.a.a.a.e */
/* loaded from: classes.dex */
public class C4013e extends C4017h {

    /* renamed from: a */
    private C0980j f13153a;

    /* renamed from: b */
    private float f13154b;

    /* renamed from: d */
    private float f13155d;

    /* renamed from: e */
    private float f13156e;

    public C4013e(String str) {
        super(str, C0892a.m10742a(238.0f));
        this.f13153a = new C0980j();
        m890e().addChild(this.f13153a);
        this.f13154b = C0892a.m10742a(150.0f);
        this.f13156e = C0892a.m10742a(20.0f);
        this.f13155d = (this.f13154b * 5.0f) + (this.f13156e * 4.0f);
        this.f13153a.position().f2526x = ((-this.f13155d) / 2.0f) + C0892a.m10742a(20.0f);
    }

    @Override // com.tsf.shell.preference.p196a.p197a.p198a.C4017h, com.censivn.C3DEngine.p031b.p037e.AbstractC0951f
    /* renamed from: f */
    public void mo539f() {
        super.mo539f();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < 5) {
                C2421c m5589b = C3359a.f11108v.f7772e.m4351a(i2).m5589b();
                if (i2 == 2) {
                    m5589b.m3820g();
                } else {
                    m5589b.m3819h();
                }
                m5589b.removeFromParent();
                m5589b.position().f2526x = this.f13156e + ((this.f13154b + this.f13156e) * i2);
                this.f13153a.addChild(m5589b);
                i = i2 + 1;
            } else {
                m895h();
                return;
            }
        }
    }

    /* renamed from: h */
    private void m895h() {
    }

    @Override // com.tsf.shell.preference.p196a.p197a.p198a.C4017h, com.censivn.C3DEngine.p031b.p033b.C0908c
    /* renamed from: c */
    public void mo544c(int i) {
        super.mo544c(i);
        m895h();
    }

    @Override // com.tsf.shell.preference.p196a.p197a.p198a.C4017h, com.censivn.C3DEngine.p031b.p037e.AbstractC0951f
    /* renamed from: g */
    public void mo538g() {
        super.mo538g();
        int i = C3359a.f11108v.f7772e.m4342i();
        for (int i2 = 0; i2 < i; i2++) {
            C3359a.f11108v.f7772e.m4351a(i2).m5589b().removeFromParent();
        }
        C2421c.m5596a();
        C2421c.m3817j();
    }
}
