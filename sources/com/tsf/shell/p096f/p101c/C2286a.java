package com.tsf.shell.p096f.p101c;

import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.p168b.C3430e;
import com.tsf.shell.p096f.p101c.p102a.C2326f;
import com.tsf.shell.p096f.p101c.p105b.C2359e;
/* renamed from: com.tsf.shell.f.c.a */
/* loaded from: classes.dex */
public class C2286a {

    /* renamed from: a */
    public C2359e f7458a;

    /* renamed from: b */
    public C2326f f7459b;

    /* renamed from: c */
    public int f7460c;

    public C2286a() {
        C3359a.f11093g = this;
        this.f7460c = m5954a(C3430e.m2416v());
        this.f7458a = new C2359e(false);
        this.f7459b = new C2326f(false);
    }

    /* renamed from: a */
    public boolean m5955a() {
        return this.f7460c == 0 ? C3430e.m2518ag() : C3430e.m2517ah();
    }

    /* renamed from: b */
    public void m5952b() {
        this.f7458a.m5704o();
    }

    /* renamed from: c */
    public int m5950c() {
        return this.f7460c;
    }

    /* renamed from: a */
    public int m5954a(int i) {
        if (i >= 0 && i <= 1) {
            return i;
        }
        return 0;
    }

    /* renamed from: a */
    public void m5953a(C0980j c0980j) {
        this.f7458a.m5726b();
        c0980j.addChild(this.f7458a.m5736a());
        this.f7459b.m5849a(c0980j, (C2326f.C2343a) null);
        m5949d();
    }

    /* renamed from: b */
    public void m5951b(int i) {
        if (this.f7460c != i) {
            this.f7460c = m5954a(i);
            C3430e.m2469f(this.f7460c);
            switch (i) {
                case 0:
                    this.f7458a.m5718c(true);
                    this.f7459b.m5796u();
                    this.f7459b.m5842a(true);
                    break;
                case 1:
                    this.f7458a.m5722b(true);
                    this.f7459b.m5831d();
                    this.f7459b.m5798t();
                    break;
            }
        }
        m5949d();
    }

    /* renamed from: d */
    private void m5949d() {
        if (m5955a()) {
            this.f7458a.m5721c();
        } else {
            this.f7458a.m5717d();
        }
    }
}
