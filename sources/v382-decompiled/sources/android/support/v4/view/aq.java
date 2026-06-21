package android.support.v4.view;

import android.view.View;

/* loaded from: classes.dex */
class aq extends ap {
    aq() {
    }

    @Override // android.support.v4.view.al, android.support.v4.view.au
    public void b(View view) {
        az.a(view);
    }

    @Override // android.support.v4.view.al, android.support.v4.view.au
    public void a(View view, Runnable runnable) {
        az.a(view, runnable);
    }

    @Override // android.support.v4.view.al, android.support.v4.view.au
    public int c(View view) {
        return az.b(view);
    }

    @Override // android.support.v4.view.al, android.support.v4.view.au
    public void b(View view, int i) {
        if (i == 4) {
            i = 2;
        }
        az.a(view, i);
    }
}
