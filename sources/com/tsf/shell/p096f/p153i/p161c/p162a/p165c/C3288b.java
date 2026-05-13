package com.tsf.shell.p096f.p153i.p161c.p162a.p165c;

import com.censivn.C3DEngine.p031b.p038f.p039a.C0964b;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
/* renamed from: com.tsf.shell.f.i.c.a.c.b */
/* loaded from: classes.dex */
public class C3288b {

    /* renamed from: a */
    private C0964b f10856a;

    /* renamed from: b */
    private float f10857b;

    /* renamed from: c */
    private float f10858c;

    public C3288b(C0964b c0964b, float f, float f2) {
        this.f10856a = c0964b;
        this.f10857b = f;
        this.f10858c = f2;
        m2920a(f, f2);
    }

    /* renamed from: a */
    public void m2920a(float f, float f2) {
        double radians = Math.toRadians(f2);
        this.f10856a.m10407i().f2526x = (float) (Math.cos(radians) * f);
        this.f10856a.m10407i().f2527y = (float) (Math.sin(radians) * f);
        this.f10856a.m10408h();
    }

    /* renamed from: a */
    public void m2921a() {
        C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.i.c.a.c.b.1
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo518a(float f) {
                C3288b.this.m2920a(((float) (30.0d * Math.sin(f * 3.141592653589793d))) + C3288b.this.f10857b, C3288b.this.f10858c);
            }
        };
        C1014c.m10326a(this.f10856a);
        C1014c.m10325a(this.f10856a, 1000, c1017d);
    }
}
