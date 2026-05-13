package com.censivn.C3DEngine.p052c.p055b;

import com.censivn.C3DEngine.p052c.InterfaceC1078b;
import com.censivn.C3DEngine.p052c.p053a.C1076d;
import com.censivn.C3DEngine.p052c.p053a.C1077e;
import java.util.ArrayList;
/* renamed from: com.censivn.C3DEngine.c.b.a */
/* loaded from: classes.dex */
public class C1079a extends C1076d implements InterfaceC1078b {

    /* renamed from: b */
    private float f3405b;

    /* renamed from: c */
    private float f3406c;

    /* renamed from: d */
    private int f3407d = 0;

    /* renamed from: e */
    private int f3408e = 0;

    /* renamed from: f */
    private int f3409f = 0;

    public C1079a(float f, float f2) {
        m9916a(f);
        m9913b(f2);
    }

    /* renamed from: a */
    public void m9916a(float f) {
        this.f3405b = f;
    }

    /* renamed from: b */
    public float m9914b() {
        return this.f3405b;
    }

    /* renamed from: b */
    public void m9913b(float f) {
        this.f3406c = f;
        this.f3406c = Math.max(0.0f, f);
        this.f3406c = Math.min(1.0f, f);
    }

    /* renamed from: c */
    public float m9912c() {
        return this.f3406c;
    }

    /* renamed from: d */
    public int m9911d() {
        return this.f3407d;
    }

    /* renamed from: a */
    public void m9915a(int i) {
        this.f3408e = i;
    }

    @Override // com.censivn.C3DEngine.p052c.InterfaceC1078b
    /* renamed from: a */
    public void mo9901a() {
        if (m9914b() != 0.0f) {
            if (this.f3408e == 0) {
                this.f3408e = this.f3395a.m9935i();
            }
            if (this.f3409f == 0) {
                this.f3409f = this.f3395a.m9934j();
            }
            float m9946a = this.f3395a.m9946a(this.f3408e);
            float m9943b = this.f3395a.m9943b(this.f3408e) - m9946a;
            ArrayList<C1077e> m9947a = this.f3395a.m9947a();
            int size = m9947a.size();
            float m9912c = (m9912c() * m9943b) + m9946a;
            float m9914b = (float) ((m9943b / 3.141592653589793d) / m9914b());
            float f = (float) ((m9943b / ((m9914b * 3.141592653589793d) * 2.0d)) * 6.283185307179586d);
            for (int i = 0; i < size; i++) {
                C1077e c1077e = m9947a.get(i);
                float m9922b = c1077e.m9922b(this.f3408e);
                if ((m9911d() != -1 || m9922b > m9912c()) && (m9911d() != 1 || m9922b < m9912c())) {
                    float m9912c2 = (float) ((1.5707963267948966d - (m9912c() * f)) + (m9922b * f));
                    c1077e.m9928a(this.f3409f, (float) ((Math.sin(m9912c2) * (c1077e.m9929a(this.f3409f) + m9914b)) - m9914b));
                    c1077e.m9928a(this.f3408e, (float) (m9912c - (Math.cos(m9912c2) * (c1077e.m9929a(this.f3409f) + m9914b))));
                }
            }
        }
    }
}
