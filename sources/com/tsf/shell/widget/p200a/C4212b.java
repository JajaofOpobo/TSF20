package com.tsf.shell.widget.p200a;

import com.censivn.C3DEngine.p031b.p038f.p039a.C0964b;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
/* renamed from: com.tsf.shell.widget.a.b */
/* loaded from: classes.dex */
public class C4212b {

    /* renamed from: a */
    private C0964b f13614a;

    /* renamed from: b */
    private float f13615b;

    /* renamed from: c */
    private float f13616c;

    public C4212b(C0964b c0964b, float f, float f2) {
        this.f13614a = c0964b;
        this.f13615b = f;
        this.f13616c = f2;
        m521a(f, f2);
    }

    /* renamed from: a */
    public void m521a(float f, float f2) {
        double radians = Math.toRadians(f2);
        this.f13614a.m10407i().f2526x = (float) (Math.cos(radians) * f);
        this.f13614a.m10407i().f2527y = (float) (Math.sin(radians) * f);
        this.f13614a.m10408h();
    }

    /* renamed from: a */
    public void m522a() {
        C1017d c1017d = new C1017d() { // from class: com.tsf.shell.widget.a.b.1
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo518a(float f) {
                C4212b.this.m521a(((float) (30.0d * Math.sin(f * 3.141592653589793d))) + C4212b.this.f13615b, C4212b.this.f13616c);
            }
        };
        C1014c.m10326a(this.f13614a);
        C1014c.m10325a(this.f13614a, 1000, c1017d);
    }
}
