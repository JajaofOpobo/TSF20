package android.support.p002v4.view;

import android.view.WindowInsets;
/* renamed from: android.support.v4.view.bj */
/* loaded from: classes.dex */
class C0384bj extends C0383bi {

    /* renamed from: a */
    private final WindowInsets f784a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0384bj(WindowInsets windowInsets) {
        this.f784a = windowInsets;
    }

    @Override // android.support.p002v4.view.C0383bi
    /* renamed from: a */
    public int mo12670a() {
        return this.f784a.getSystemWindowInsetLeft();
    }

    @Override // android.support.p002v4.view.C0383bi
    /* renamed from: b */
    public int mo12668b() {
        return this.f784a.getSystemWindowInsetTop();
    }

    @Override // android.support.p002v4.view.C0383bi
    /* renamed from: c */
    public int mo12667c() {
        return this.f784a.getSystemWindowInsetRight();
    }

    @Override // android.support.p002v4.view.C0383bi
    /* renamed from: d */
    public int mo12666d() {
        return this.f784a.getSystemWindowInsetBottom();
    }

    @Override // android.support.p002v4.view.C0383bi
    /* renamed from: e */
    public boolean mo12665e() {
        return this.f784a.isConsumed();
    }

    @Override // android.support.p002v4.view.C0383bi
    /* renamed from: a */
    public C0383bi mo12669a(int i, int i2, int i3, int i4) {
        return new C0384bj(this.f784a.replaceSystemWindowInsets(i, i2, i3, i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public WindowInsets m12664f() {
        return this.f784a;
    }
}
