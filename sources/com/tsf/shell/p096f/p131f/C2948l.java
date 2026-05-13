package com.tsf.shell.p096f.p131f;

import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.p040b.C0967a;
/* renamed from: com.tsf.shell.f.f.l */
/* loaded from: classes.dex */
public class C2948l extends C2931f {

    /* renamed from: a */
    private float f9580a;

    /* renamed from: b */
    private float f9581b;

    public C2948l(int i, int i2, boolean z) {
        super(i, i2, z);
        this.f9580a = C0892a.f2555F;
        this.f9581b = C0892a.f2556G;
    }

    /* renamed from: b */
    public void mo4137b(float f, float f2) {
    }

    /* renamed from: b */
    public boolean mo4138b() {
        return true;
    }

    /* renamed from: a */
    public void mo4141a(C2932g c2932g, float f) {
    }

    /* renamed from: b */
    public void mo4136b(C2932g c2932g, float f) {
        c2932g.dispatchDraw();
    }

    /* renamed from: c */
    public void mo4134c() {
    }

    /* renamed from: d */
    public void m4133d() {
        if (C0892a.f2555F != this.f9580a || C0892a.f2556G != this.f9581b) {
            this.f9580a = C0892a.f2555F;
            this.f9581b = C0892a.f2556G;
            mo4142a(this.f9580a, this.f9581b);
        }
        mo4132e();
    }

    /* renamed from: e */
    public void mo4132e() {
    }

    /* renamed from: a */
    public void mo4142a(float f, float f2) {
    }

    /* renamed from: a */
    public boolean mo4143a() {
        return false;
    }

    /* renamed from: a */
    public boolean mo4140a(C2932g c2932g, C0967a c0967a) {
        float abs = Math.abs(c2932g.f9541g * 700.0f);
        c0967a.alpha(abs <= 255.0f ? abs : 255.0f);
        return true;
    }

    /* renamed from: a */
    public void mo4139a(C2932g c2932g, boolean z) {
    }

    /* renamed from: b */
    public void mo4135b(C2932g c2932g, boolean z) {
    }
}
