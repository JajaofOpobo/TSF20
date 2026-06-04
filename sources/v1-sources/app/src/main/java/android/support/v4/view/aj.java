package android.support.v4.view;

import android.view.View;

/* loaded from: classes.dex */
class aj implements ap {
    aj() {
    }

    @Override // android.support.v4.view.ap
    public boolean a(View view, int i) {
        return false;
    }

    @Override // android.support.v4.view.ap
    public int a(View view) {
        return 2;
    }

    @Override // android.support.v4.view.ap
    public void a(View view, a aVar) {
    }

    @Override // android.support.v4.view.ap
    public void b(View view) {
        view.postInvalidateDelayed(a());
    }

    @Override // android.support.v4.view.ap
    public void a(View view, Runnable runnable) {
        view.postDelayed(runnable, a());
    }

    long a() {
        return 10L;
    }

    @Override // android.support.v4.view.ap
    public int c(View view) {
        return 0;
    }

    @Override // android.support.v4.view.ap
    public void d(View view) {
    }

    @Override // android.support.v4.view.ap
    public void b(View view, int i) {
    }
}
