package com.tsf.shell.preference.p196a.p197a.p198a;

import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p033b.C0907b;
import com.censivn.C3DEngine.p031b.p037e.AbstractC0951f;
import com.censivn.C3DEngine.p031b.p038f.C0984m;
/* renamed from: com.tsf.shell.preference.a.a.a.j */
/* loaded from: classes.dex */
public class C4019j extends AbstractC0951f {

    /* renamed from: a */
    private C0984m f13172a;

    public C4019j() {
        this(C0892a.m10742a(120.0f));
        m10617b(false);
    }

    @Override // com.censivn.C3DEngine.p031b.p037e.AbstractC0951f
    /* renamed from: f */
    public void mo539f() {
    }

    @Override // com.censivn.C3DEngine.p031b.p037e.AbstractC0951f
    /* renamed from: g */
    public void mo538g() {
        if (this.f13172a != null) {
            this.f13172a.m10358a();
        }
    }

    public C4019j(float f) {
        m10615d((int) f);
        m10628a(0);
        this.f13172a = new C0984m();
        this.f13172a.m10352b(1);
        C0907b c0907b = new C0907b();
        c0907b.f2655a = C0892a.m10742a(30.0f);
        this.f13172a.setLayoutParams(c0907b);
        this.f13172a.m10347d(50);
        addChild(this.f13172a);
    }

    @Override // com.censivn.C3DEngine.p031b.p033b.C0908c
    /* renamed from: c */
    public void mo544c(int i) {
        this.f13172a.position().f2526x = (-i) / 2.0f;
    }

    /* renamed from: a */
    public void m887a(String str) {
        this.f13172a.m10355a(str);
        this.f13172a.m10353b();
        C0907b layoutParams = this.f13172a.getLayoutParams();
        layoutParams.f2662h = this.f13172a.minX();
        layoutParams.f2664j = this.f13172a.maxX();
        layoutParams.f2663i = this.f13172a.minY();
        layoutParams.f2665k = this.f13172a.maxY();
        mo4847d();
    }
}
