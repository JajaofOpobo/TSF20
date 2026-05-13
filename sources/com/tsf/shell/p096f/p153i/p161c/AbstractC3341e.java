package com.tsf.shell.p096f.p153i.p161c;

import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0984m;
import com.tsf.shell.manager.p183o.C3567c;
import com.tsf.shell.utils.C4189x;
/* renamed from: com.tsf.shell.f.i.c.e */
/* loaded from: classes.dex */
public abstract class AbstractC3341e {

    /* renamed from: a */
    private C0984m f11043a = new C0984m();

    /* renamed from: a */
    public abstract C0975i mo1624a(int i, int i2, boolean z);

    /* renamed from: b */
    public abstract void mo1623b();

    /* renamed from: e */
    public abstract void mo2793e();

    /* renamed from: f */
    public abstract void mo2792f();

    /* renamed from: g */
    public abstract void mo2791g();

    /* renamed from: h */
    public abstract void mo2790h();

    public AbstractC3341e() {
        this.f11043a.m10345e(-1);
        this.f11043a.m10347d(36);
        C3567c.m1967a(this.f11043a, C3567c.f11849h);
    }

    /* renamed from: a */
    public void mo1625a() {
        m2806i();
        this.f11043a.destroy();
    }

    /* renamed from: i */
    public void m2806i() {
        this.f11043a.m10358a();
        mo1623b();
    }

    /* renamed from: a */
    public void m2810a(int i) {
        this.f11043a.m10347d(i);
    }

    /* renamed from: b */
    public C0975i m2808b(int i) {
        this.f11043a.m10344f(i);
        return this.f11043a;
    }

    /* renamed from: c */
    public void m2807c(int i) {
        m2809a(C4189x.m588c(i));
    }

    /* renamed from: a */
    public void m2809a(String str) {
        this.f11043a.m10355a(str);
    }
}
