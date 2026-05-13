package com.censivn.C3DEngine.p031b.p037e;

import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p033b.C0907b;
import com.censivn.C3DEngine.p031b.p038f.C0984m;
import com.tsf.shell.utils.C4189x;
/* renamed from: com.censivn.C3DEngine.b.e.g */
/* loaded from: classes.dex */
public class C0952g extends AbstractC0951f {

    /* renamed from: a */
    private C0984m f2779a;

    /* renamed from: b */
    private C0984m f2780b;

    public C0952g() {
        this(C0892a.m10742a(180.0f));
    }

    @Override // com.censivn.C3DEngine.p031b.p037e.AbstractC0951f
    /* renamed from: f */
    public void mo539f() {
    }

    @Override // com.censivn.C3DEngine.p031b.p037e.AbstractC0951f
    /* renamed from: g */
    public void mo538g() {
        if (this.f2779a != null) {
            this.f2779a.m10358a();
        }
        if (this.f2780b != null) {
            this.f2780b.m10358a();
        }
    }

    public C0952g(float f) {
        m10615d((int) f);
        m10628a(0);
        this.f2779a = new C0984m();
        this.f2779a.m10352b(1);
        C0907b c0907b = new C0907b();
        c0907b.f2655a = C0892a.m10742a(15.0f);
        this.f2779a.setLayoutParams(c0907b);
        this.f2779a.m10347d(50);
        addChild(this.f2779a);
    }

    @Override // com.censivn.C3DEngine.p031b.p033b.C0908c
    /* renamed from: c */
    public void mo544c(int i) {
        this.f2779a.position().f2526x = (-i) / 2.0f;
        if (this.f2780b != null) {
            this.f2780b.m10344f(i);
            this.f2780b.position().f2526x = (-i) / 2.0f;
            m10489e();
        }
    }

    /* renamed from: e */
    private void m10489e() {
        this.f2780b.m10353b();
        C0907b layoutParams = this.f2780b.getLayoutParams();
        layoutParams.f2662h = this.f2780b.minX();
        layoutParams.f2664j = this.f2780b.maxX();
        layoutParams.f2663i = this.f2780b.minY();
        layoutParams.f2665k = this.f2780b.maxY();
    }

    /* renamed from: h */
    public void m10488h(int i) {
        m10491a(C4189x.m588c(i));
    }

    /* renamed from: a */
    public void m10491a(String str) {
        this.f2779a.m10355a(str);
        this.f2779a.m10353b();
        C0907b layoutParams = this.f2779a.getLayoutParams();
        layoutParams.f2662h = this.f2779a.minX();
        layoutParams.f2664j = this.f2779a.maxX();
        layoutParams.f2663i = this.f2779a.minY();
        layoutParams.f2665k = this.f2779a.maxY();
        mo4847d();
    }

    /* renamed from: i */
    public void m10487i(int i) {
        m10490b(C4189x.m588c(i));
    }

    /* renamed from: b */
    public void m10490b(String str) {
        if (this.f2780b == null) {
            this.f2780b = new C0984m();
            this.f2780b.m10352b(1);
            this.f2780b.m10354a(true);
            C0907b c0907b = new C0907b();
            c0907b.f2656b = C0892a.m10742a(15.0f);
            this.f2780b.setLayoutParams(c0907b);
            this.f2780b.m10347d(38);
            this.f2780b.position().f2526x = (-m10629a()) / 2.0f;
            this.f2780b.m10345e(-5592406);
            addChild(this.f2780b);
            mo4847d();
        }
        this.f2780b.m10355a(str);
        this.f2780b.m10353b();
        C0907b layoutParams = this.f2780b.getLayoutParams();
        layoutParams.f2662h = this.f2780b.minX();
        layoutParams.f2664j = this.f2780b.maxX();
        layoutParams.f2663i = this.f2780b.minY();
        layoutParams.f2665k = this.f2780b.maxY();
        mo4847d();
    }

    @Override // com.censivn.C3DEngine.p031b.p037e.AbstractC0951f
    /* renamed from: i */
    public void mo821i() {
        super.mo821i();
        this.f2779a.alpha(100.0f);
        if (this.f2780b != null) {
            this.f2780b.alpha(100.0f);
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p037e.AbstractC0951f
    /* renamed from: j */
    public void mo820j() {
        super.mo820j();
        this.f2779a.alpha(255.0f);
        if (this.f2780b != null) {
            this.f2780b.alpha(255.0f);
        }
    }
}
