package com.tsf.shell.plugin.themepicker;

import android.widget.Scroller;

/* loaded from: classes.dex */
public class u implements Runnable {
    final /* synthetic */ SildingMenuLayout a;

    protected u(SildingMenuLayout sildingMenuLayout) {
        this.a = sildingMenuLayout;
    }

    @Override // java.lang.Runnable
    public void run() {
        Scroller scroller;
        scroller = this.a.k;
        this.a.a(scroller.computeScrollOffset());
    }
}
