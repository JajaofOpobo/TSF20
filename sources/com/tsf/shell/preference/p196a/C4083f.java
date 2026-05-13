package com.tsf.shell.preference.p196a;

import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.p096f.p101c.p105b.C2359e;
import com.tsf.shell.p096f.p101c.p105b.C2366f;
import com.tsf.shell.p096f.p118e.C2617i;
import com.tsf.shell.preference.p196a.C4078c;
/* renamed from: com.tsf.shell.preference.a.f */
/* loaded from: classes.dex */
public class C4083f extends C4077b {

    /* renamed from: a */
    private C4078c.C4079a f13305a;

    /* renamed from: b */
    private C2359e f13306b;

    /* renamed from: d */
    private C0980j f13307d;

    /* renamed from: e */
    private C2617i f13308e;

    /* renamed from: f */
    private C2366f f13309f;

    public C4083f(float f) {
        super(f);
        this.f13307d = new C0980j();
        m818e().addChild(this.f13307d);
        this.f13308e = new C2617i();
        this.f13307d.addChild(this.f13308e);
        this.f13308e.m5152a(0.0f, f);
        this.f13308e.m5149b(0);
        m794n();
    }

    @Override // com.tsf.shell.preference.p196a.C4077b, com.censivn.C3DEngine.p031b.p037e.AbstractC0951f
    /* renamed from: f */
    public void mo539f() {
        super.mo539f();
        this.f13305a.m813b();
        this.f13308e.removeChild(this.f13306b.m5736a());
        this.f13308e.addChild(this.f13306b.m5736a());
        this.f13309f.m5745d();
        this.f13309f.m5739j();
    }

    @Override // com.tsf.shell.preference.p196a.C4077b, com.censivn.C3DEngine.p031b.p033b.C0908c
    /* renamed from: c */
    public void mo544c(int i) {
        super.mo544c(i);
        if (this.f13306b != null) {
            this.f13306b.m5712g();
        }
        if (this.f13308e != null) {
            this.f13308e.m5153a(i);
        }
    }

    @Override // com.tsf.shell.preference.p196a.C4077b, com.censivn.C3DEngine.p031b.p037e.AbstractC0951f
    /* renamed from: g */
    public void mo538g() {
        super.mo538g();
        this.f13305a.m812c();
        this.f13308e.removeChild(this.f13306b.m5736a());
        this.f13309f.m5744e();
        this.f13309f.m5740i();
    }

    /* renamed from: n */
    private void m794n() {
        this.f13305a = C3359a.f11084B.f13292a.m817a();
        this.f13306b = this.f13305a.m814a();
        this.f13309f = new C2366f(this.f13306b, this.f13306b.m5736a());
    }

    /* renamed from: h */
    public void m796h() {
        this.f13306b.m5721c();
    }

    /* renamed from: m */
    public void m795m() {
        this.f13306b.m5717d();
    }

    /* renamed from: f */
    public void m797f(int i) {
        if (this.f13306b != null) {
            this.f13306b.m5735a(i);
        }
    }
}
