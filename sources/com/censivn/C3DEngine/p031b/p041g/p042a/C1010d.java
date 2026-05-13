package com.censivn.C3DEngine.p031b.p041g.p042a;

import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.censivn.C3DEngine.p031b.p041g.InterfaceC1011b;
import com.censivn.C3DEngine.p031b.p041g.p043b.InterfaceC1012a;
/* renamed from: com.censivn.C3DEngine.b.g.a.d */
/* loaded from: classes.dex */
public class C1010d extends AbstractC1009c {

    /* renamed from: c */
    private C1017d f3001c;

    /* renamed from: d */
    private InterfaceC1012a f3002d;

    /* renamed from: e */
    private int f3003e;

    /* renamed from: f */
    private long f3004f;

    /* renamed from: g */
    private long f3005g;

    /* renamed from: h */
    private Runnable f3006h;

    /* renamed from: i */
    private InterfaceC1011b f3007i;

    public C1010d(InterfaceC1012a interfaceC1012a, int i, C1017d c1017d) {
        this.f3002d = interfaceC1012a;
        c1017d.m10312a(interfaceC1012a);
        interfaceC1012a.setTweenChild(this);
        this.f3003e = i;
        this.f3001c = c1017d;
        this.f3007i = c1017d.m10304e();
    }

    @Override // com.censivn.C3DEngine.p031b.p041g.p042a.AbstractC1009c
    /* renamed from: a */
    public C1017d mo10337a() {
        return this.f3001c;
    }

    @Override // com.censivn.C3DEngine.p031b.p041g.p042a.AbstractC1009c
    /* renamed from: c */
    public void mo10335c() {
        if (this.f2999a == 0 || this.f2999a == 2) {
            if (this.f2999a == 2) {
                this.f3004f = System.currentTimeMillis() - this.f3005g;
                this.f2999a = 0;
            }
            if (this.f3004f == 0) {
                this.f3004f = System.currentTimeMillis();
                this.f3001c.mo10310b();
            }
            this.f3005g = (int) (System.currentTimeMillis() - this.f3004f);
            if (this.f3005g >= this.f3003e) {
                this.f3005g = this.f3003e;
                C1014c.m10323b(this);
                this.f3001c.mo558b(1.0f);
                this.f3001c.mo518a(1.0f);
                this.f3002d.setTweenChild(null);
                this.f3001c.mo732a();
                if (this.f3001c.m10300g() != null) {
                    this.f3001c.m10300g().run();
                    return;
                }
                return;
            }
            float f = ((float) this.f3005g) / this.f3003e;
            float mo10331a = this.f3007i.mo10331a(f);
            this.f3001c.mo558b(f);
            this.f3001c.mo518a(mo10331a);
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p041g.p042a.AbstractC1009c
    /* renamed from: a */
    public void mo10336a(Runnable runnable) {
        this.f3006h = runnable;
    }

    @Override // com.censivn.C3DEngine.p031b.p041g.p042a.AbstractC1009c
    /* renamed from: d */
    public Runnable mo10334d() {
        return this.f3006h;
    }

    @Override // com.censivn.C3DEngine.p031b.p041g.p042a.AbstractC1009c
    /* renamed from: e */
    public void mo10333e() {
        this.f2999a = 1;
    }

    @Override // com.censivn.C3DEngine.p031b.p041g.p042a.AbstractC1009c
    /* renamed from: f */
    public void mo10332f() {
        this.f2999a = 2;
    }
}
