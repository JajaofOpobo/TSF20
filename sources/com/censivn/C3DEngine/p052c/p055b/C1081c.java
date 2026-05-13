package com.censivn.C3DEngine.p052c.p055b;

import com.censivn.C3DEngine.api.effects.core.Vector3;
import com.censivn.C3DEngine.p052c.InterfaceC1078b;
import com.censivn.C3DEngine.p052c.p053a.C1074b;
import com.censivn.C3DEngine.p052c.p053a.C1076d;
import com.censivn.C3DEngine.p052c.p053a.C1077e;
/* renamed from: com.censivn.C3DEngine.c.b.c */
/* loaded from: classes.dex */
public class C1081c extends C1076d implements InterfaceC1078b {

    /* renamed from: c */
    public float f3425c;

    /* renamed from: b */
    public Vector3 f3424b = new Vector3(0.0f, 1.0f, 0.0f);

    /* renamed from: d */
    public Vector3 f3426d = new Vector3(0.0f, 0.0f, 0.0f);

    public C1081c(float f) {
        this.f3425c = f;
    }

    @Override // com.censivn.C3DEngine.p052c.InterfaceC1078b
    /* renamed from: a */
    public void mo9901a() {
        this.f3424b.normalize();
        Vector3 vector3 = new Vector3(this.f3395a.m9938f() / 2.0f, this.f3395a.m9937g() / 2.0f, this.f3395a.m9936h() / 2.0f);
        float f = -Vector3.dot(this.f3424b, this.f3426d);
        int size = this.f3395a.m9947a().size();
        for (int i = 0; i < size; i++) {
            C1077e c1077e = this.f3395a.m9947a().get(i);
            m9900a(c1077e, ((Vector3.dot(new Vector3(c1077e.m9932a(), c1077e.m9925b(), c1077e.m9921c()), this.f3424b) + f) / vector3.getMagnitude()) * this.f3425c);
        }
    }

    /* renamed from: a */
    private void m9900a(C1077e c1077e, float f) {
        C1074b m9948b = C1074b.m9948b(C1074b.m9951a(this.f3424b.f2519x, this.f3424b.f2520y, this.f3424b.f2521z, f), C1074b.m9952a(c1077e.m9932a(), c1077e.m9925b(), c1077e.m9921c()));
        c1077e.m9931a(m9948b.f3368d);
        c1077e.m9924b(m9948b.f3372h);
        c1077e.m9920c(m9948b.f3376l);
    }
}
