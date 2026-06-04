package com.tsf.shell;

import android.view.KeyEvent;

/* loaded from: classes.dex */
final class as implements Runnable {
    private final /* synthetic */ int a;
    private final /* synthetic */ KeyEvent b;

    as(int i, KeyEvent keyEvent) {
        this.a = i;
        this.b = keyEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        at atVar;
        at atVar2;
        atVar = aq.b;
        if (atVar != null) {
            atVar2 = aq.b;
            atVar2.a(this.a, this.b);
        }
    }
}
