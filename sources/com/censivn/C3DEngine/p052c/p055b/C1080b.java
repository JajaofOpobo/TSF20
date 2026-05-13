package com.censivn.C3DEngine.p052c.p055b;

import com.censivn.C3DEngine.p052c.InterfaceC1078b;
import com.censivn.C3DEngine.p052c.p053a.C1071a;
import com.censivn.C3DEngine.p052c.p053a.C1075c;
import com.censivn.C3DEngine.p052c.p053a.C1076d;
import com.censivn.C3DEngine.p052c.p053a.C1077e;
import com.censivn.C3DEngine.p052c.p053a.p054a.C1072a;
import com.censivn.C3DEngine.p052c.p053a.p054a.C1073b;
import java.util.ArrayList;
/* renamed from: com.censivn.C3DEngine.c.b.b */
/* loaded from: classes.dex */
public class C1080b extends C1076d implements InterfaceC1078b {

    /* renamed from: b */
    private ArrayList<C1073b> f3410b;

    /* renamed from: c */
    private ArrayList<C1072a> f3411c;

    /* renamed from: d */
    private float f3412d;

    /* renamed from: e */
    private float f3413e;

    /* renamed from: f */
    private float f3414f;

    /* renamed from: g */
    private float f3415g;

    /* renamed from: h */
    private float f3416h;

    /* renamed from: i */
    private boolean f3417i;

    /* renamed from: j */
    private float f3418j;

    /* renamed from: k */
    private float f3419k;

    /* renamed from: l */
    private float f3420l;

    /* renamed from: m */
    private float f3421m;

    /* renamed from: n */
    private float f3422n;

    /* renamed from: o */
    private float f3423o;

    public C1080b(float f, float f2) {
        this.f3412d = 0.0f;
        this.f3413e = 0.0f;
        this.f3414f = 0.0f;
        this.f3415g = f;
        m9910a(f2);
    }

    public C1080b() {
        this(1.0f, 0.0f);
    }

    /* renamed from: b */
    public ArrayList<C1073b> m9907b() {
        return this.f3410b;
    }

    /* renamed from: a */
    public void m9910a(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        this.f3416h = (f / 100.0f) + 1.0f;
    }

    /* renamed from: b */
    public void m9906b(float f) {
        int size = this.f3411c.size();
        if (f > 1.0f) {
            f = 1.0f;
        } else if (f < 0.0f) {
            f = 0.0f;
        }
        this.f3415g = f;
        float f2 = f * 0.5f;
        for (int i = 0; i < size; i++) {
            this.f3411c.get(i).m9968a(f2);
        }
    }

    /* renamed from: c */
    public void m9904c(float f) {
        this.f3413e = f;
    }

    /* renamed from: d */
    public void m9902d(float f) {
        this.f3414f = f;
    }

    @Override // com.censivn.C3DEngine.p052c.p053a.C1076d, com.censivn.C3DEngine.p052c.InterfaceC1078b
    /* renamed from: a */
    public void mo9908a(C1075c c1075c) {
        super.mo9908a(c1075c);
        m9905c();
        m9903d();
        m9906b(this.f3415g);
    }

    @Override // com.censivn.C3DEngine.p052c.InterfaceC1078b
    /* renamed from: a */
    public void mo9901a() {
        int size = this.f3411c.size();
        for (int i = 0; i < size; i++) {
            this.f3411c.get(i).m9969a();
        }
        int size2 = this.f3410b.size();
        for (int i2 = 0; i2 < size2; i2++) {
            C1073b c1073b = this.f3410b.get(i2);
            if (c1073b.f3358d) {
                c1073b.m9966a(c1073b.m9963b() + this.f3412d);
            }
            if (c1073b.f3359e) {
                c1073b.m9962b(c1073b.m9961c() + this.f3413e);
            }
            if (c1073b.f3360f) {
                c1073b.m9960c(c1073b.m9959d() + this.f3414f);
            }
            c1073b.m9958d(c1073b.m9957e() / this.f3416h);
            c1073b.m9956e(c1073b.m9955f() / this.f3416h);
            c1073b.m9954f(c1073b.m9953g() / this.f3416h);
            if (this.f3417i) {
                if (c1073b.m9963b() < this.f3418j) {
                    c1073b.m9966a(this.f3418j);
                } else if (c1073b.m9963b() > this.f3419k) {
                    c1073b.m9966a(this.f3419k);
                }
                if (c1073b.m9961c() < this.f3420l) {
                    c1073b.m9962b(this.f3420l);
                } else if (c1073b.m9961c() > this.f3421m) {
                    c1073b.m9962b(this.f3421m);
                }
                if (c1073b.m9959d() < this.f3422n) {
                    c1073b.m9960c(this.f3422n);
                } else if (c1073b.m9959d() > this.f3423o) {
                    c1073b.m9960c(this.f3423o);
                }
            }
            c1073b.m9967a();
        }
    }

    /* renamed from: c */
    private void m9905c() {
        ArrayList<C1077e> m9947a = this.f3395a.m9947a();
        int size = m9947a.size();
        this.f3410b = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            C1077e c1077e = m9947a.get(i);
            C1073b c1073b = new C1073b(c1077e);
            c1077e.m9926a(c1073b);
            this.f3410b.add(c1073b);
        }
    }

    /* renamed from: d */
    private void m9903d() {
        ArrayList<C1071a> m9944b = this.f3395a.m9944b();
        int size = m9944b.size();
        this.f3411c = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            ArrayList<C1077e> m9971a = m9944b.get(i).m9971a();
            int size2 = m9971a.size();
            for (int i2 = 0; i2 < size2 - 1; i2++) {
                m9909a(m9971a.get(i2).m9917f(), m9971a.get(i2 + 1).m9917f());
                if (i2 > 1) {
                    m9909a(m9971a.get(0).m9917f(), m9971a.get(i2).m9917f());
                }
            }
            m9909a(m9971a.get(size2 - 1).m9917f(), m9971a.get(0).m9917f());
        }
    }

    /* renamed from: a */
    private void m9909a(C1073b c1073b, C1073b c1073b2) {
        this.f3411c.add(new C1072a(c1073b, c1073b2, c1073b.m9964a(c1073b2), this.f3415g));
    }
}
