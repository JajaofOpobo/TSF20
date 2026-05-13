package com.tsf.extend.theme;
/* loaded from: classes.dex */
public class d extends p {
    public static long a = 86400000;
    private boolean b;
    private int c = 2;

    @Override // com.tsf.extend.theme.p
    public boolean l() {
        return this.b;
    }

    @Override // com.tsf.extend.theme.p
    public void b(boolean z) {
        this.b = z;
    }

    @Override // com.tsf.extend.theme.p, com.tsf.extend.base.b.a
    public boolean h() {
        return b();
    }

    @Override // com.tsf.extend.base.b.a
    public boolean d() {
        return System.currentTimeMillis() - c() >= a;
    }
}
