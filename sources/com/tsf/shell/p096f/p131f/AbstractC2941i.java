package com.tsf.shell.p096f.p131f;
/* renamed from: com.tsf.shell.f.f.i */
/* loaded from: classes.dex */
public abstract class AbstractC2941i extends C2948l {

    /* renamed from: a */
    protected C2877b f9568a;

    public AbstractC2941i(int i, int i2, boolean z) {
        super(i, i2, z);
        this.f9568a = new C2877b();
        this.f9568a.useVBO(false);
    }

    @Override // com.tsf.shell.p096f.p131f.C2948l
    /* renamed from: a */
    public boolean mo4143a() {
        return true;
    }

    @Override // com.tsf.shell.p096f.p131f.C2948l
    /* renamed from: a */
    public void mo4142a(float f, float f2) {
        if (this.f9568a != null) {
            this.f9568a.m10373a(f);
            this.f9568a.m10371b(f2);
        }
    }
}
