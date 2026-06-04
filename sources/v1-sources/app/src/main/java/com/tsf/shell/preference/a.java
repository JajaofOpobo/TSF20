package com.tsf.shell.preference;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v4.view.bb;
import android.widget.TabHost;
import android.widget.TabWidget;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a extends android.support.v4.app.q implements bb, TabHost.OnTabChangeListener {
    private final Context a;
    private final TabHost b;
    private final ViewPager c;
    private final ArrayList d;

    public a(FragmentActivity fragmentActivity, TabHost tabHost, ViewPager viewPager) {
        super(fragmentActivity.d());
        this.d = new ArrayList();
        this.a = fragmentActivity;
        this.b = tabHost;
        this.c = viewPager;
        this.b.setOnTabChangedListener(this);
        this.c.a((android.support.v4.view.v) this);
        this.c.a((bb) this);
    }

    public final void a(TabHost.TabSpec tabSpec, Class cls) {
        tabSpec.setContent(new b(this.a));
        this.d.add(new c(tabSpec.getTag(), cls));
        this.b.addTab(tabSpec);
        d();
    }

    @Override // android.support.v4.view.v, com.tsf.shell.action.p
    public final int c() {
        return this.d.size();
    }

    @Override // android.support.v4.app.q
    public final Fragment a(int i) {
        Class cls;
        c cVar = (c) this.d.get(i);
        Bundle bundle = new Bundle();
        bundle.putInt("index", i);
        Context context = this.a;
        cls = cVar.b;
        return Fragment.a(context, cls.getName(), bundle);
    }

    @Override // android.widget.TabHost.OnTabChangeListener
    public final void onTabChanged(String str) {
        this.c.a(this.b.getCurrentTab());
    }

    @Override // android.support.v4.view.bb
    public final void a(int i, float f, int i2) {
    }

    @Override // android.support.v4.view.bb
    public final void a_(int i) {
        TabWidget tabWidget = this.b.getTabWidget();
        int descendantFocusability = tabWidget.getDescendantFocusability();
        tabWidget.setDescendantFocusability(393216);
        this.b.setCurrentTab(i);
        tabWidget.setDescendantFocusability(descendantFocusability);
    }

    @Override // android.support.v4.view.bb
    public final void b(int i) {
    }
}
