package com.tsf.shell.action;

import android.support.v4.view.ViewPager;
import android.view.View;

/* loaded from: classes.dex */
final class i implements View.OnClickListener {
    final /* synthetic */ h a;
    private final /* synthetic */ int b;

    i(h hVar, int i) {
        this.a = hVar;
        this.b = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ViewPager viewPager;
        viewPager = this.a.a.p;
        viewPager.a(this.b);
    }
}
