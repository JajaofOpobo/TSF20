package android.support.v4.view;

import android.graphics.Paint;
import android.view.View;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
class al implements au {
    WeakHashMap a = null;

    al() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.support.v4.view.au
    public boolean a(View view, int i) {
        return (view instanceof ae) && a((ae) view, i);
    }

    @Override // android.support.v4.view.au
    public int a(View view) {
        return 2;
    }

    @Override // android.support.v4.view.au
    public void a(View view, a aVar) {
    }

    @Override // android.support.v4.view.au
    public void b(View view) {
        view.invalidate();
    }

    @Override // android.support.v4.view.au
    public void a(View view, Runnable runnable) {
        view.postDelayed(runnable, a());
    }

    long a() {
        return 10L;
    }

    @Override // android.support.v4.view.au
    public int c(View view) {
        return 0;
    }

    @Override // android.support.v4.view.au
    public void b(View view, int i) {
    }

    @Override // android.support.v4.view.au
    public void a(View view, int i, Paint paint) {
    }

    @Override // android.support.v4.view.au
    public int d(View view) {
        return 0;
    }

    @Override // android.support.v4.view.au
    public int e(View view) {
        return view.getMeasuredWidth();
    }

    @Override // android.support.v4.view.au
    public void a(View view, boolean z) {
    }

    private boolean a(ae aeVar, int i) {
        int b = aeVar.b();
        int a = aeVar.a() - aeVar.c();
        if (a == 0) {
            return false;
        }
        return i < 0 ? b > 0 : b < a + (-1);
    }

    @Override // android.support.v4.view.au
    public boolean f(View view) {
        return av.a(view);
    }
}
