package android.support.v4.view;

import android.view.WindowInsets;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
class bj extends bi {
    private final WindowInsets a;

    bj(WindowInsets windowInsets) {
        this.a = windowInsets;
    }

    @Override // android.support.v4.view.bi
    public int a() {
        return this.a.getSystemWindowInsetLeft();
    }

    @Override // android.support.v4.view.bi
    public int b() {
        return this.a.getSystemWindowInsetTop();
    }

    @Override // android.support.v4.view.bi
    public int c() {
        return this.a.getSystemWindowInsetRight();
    }

    @Override // android.support.v4.view.bi
    public int d() {
        return this.a.getSystemWindowInsetBottom();
    }

    @Override // android.support.v4.view.bi
    public boolean e() {
        return this.a.isConsumed();
    }

    @Override // android.support.v4.view.bi
    public bi a(int i, int i2, int i3, int i4) {
        return new bj(this.a.replaceSystemWindowInsets(i, i2, i3, i4));
    }

    WindowInsets f() {
        return this.a;
    }
}
