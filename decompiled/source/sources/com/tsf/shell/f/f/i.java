package com.tsf.shell.f.f;
/* loaded from: classes.dex */
public abstract class i extends l {
    protected b a;

    public i(int i, int i2, boolean z) {
        super(i, i2, z);
        this.a = new b();
        this.a.useVBO(false);
    }

    @Override // com.tsf.shell.f.f.l
    public boolean a() {
        return true;
    }

    @Override // com.tsf.shell.f.f.l
    public void a(float f, float f2) {
        if (this.a != null) {
            this.a.a(f);
            this.a.b(f2);
        }
    }
}
