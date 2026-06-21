package com.tsf.shell.e.f;

/* loaded from: classes.dex */
public abstract class k extends p {
    protected b a;

    public k(int i, int i2, boolean z) {
        super(i, i2, z);
        this.a = new b();
        this.a.useVBO(false);
    }

    @Override // com.tsf.shell.e.f.p
    public boolean a() {
        return true;
    }

    @Override // com.tsf.shell.e.f.p
    public void a(float f, float f2) {
        if (this.a != null) {
            this.a.a(f);
            this.a.b(f2);
        }
    }
}
