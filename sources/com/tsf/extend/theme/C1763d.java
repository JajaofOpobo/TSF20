package com.tsf.extend.theme;
/* renamed from: com.tsf.extend.theme.d */
/* loaded from: classes.dex */
public class C1763d extends C1862p {

    /* renamed from: a */
    public static long f5663a = 86400000;

    /* renamed from: b */
    private boolean f5664b;

    /* renamed from: c */
    private int f5665c = 2;

    @Override // com.tsf.extend.theme.C1862p
    /* renamed from: l */
    public boolean mo7219l() {
        return this.f5664b;
    }

    @Override // com.tsf.extend.theme.C1862p
    /* renamed from: b */
    public void mo7220b(boolean z) {
        this.f5664b = z;
    }

    @Override // com.tsf.extend.theme.C1862p, com.tsf.extend.base.p071b.C1368a
    /* renamed from: h */
    public boolean mo6375h() {
        return m8868b();
    }

    @Override // com.tsf.extend.base.p071b.C1368a
    /* renamed from: d */
    public boolean mo6376d() {
        return System.currentTimeMillis() - m8865c() >= f5663a;
    }
}
