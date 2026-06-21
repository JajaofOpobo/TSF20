package com.tsf.shell.preference;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.o;
import android.support.v4.view.ViewPager;
import android.support.v4.view.bn;
import android.widget.TabHost;
import android.widget.TabWidget;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class a extends o implements bn, TabHost.OnTabChangeListener {
    private final Context a;
    private final TabHost b;
    private final ViewPager c;
    private final ArrayList d;

    public a(FragmentActivity fragmentActivity, TabHost tabHost, ViewPager viewPager) {
        super(fragmentActivity.f());
        this.d = new ArrayList();
        this.a = fragmentActivity;
        this.b = tabHost;
        this.c = viewPager;
        this.b.setOnTabChangedListener(this);
        this.c.setAdapter(this);
        this.c.setOnPageChangeListener(this);
    }

    public void a(TabHost.TabSpec tabSpec, Class cls, Bundle bundle) {
        tabSpec.setContent(new b(this.a));
        this.d.add(new c(tabSpec.getTag(), cls, bundle));
        this.b.addTab(tabSpec);
        c();
    }

    @Override // android.support.v4.view.ad, com.tsf.shell.activity.actionselector.d
    public int b() {
        return this.d.size();
    }

    @Override // android.support.v4.app.o
    public Fragment a(int i) {
        Class cls;
        c cVar = (c) this.d.get(i);
        Bundle bundle = new Bundle();
        bundle.putInt("index", i);
        Context context = this.a;
        cls = cVar.b;
        return Fragment.a(context, cls.getName(), bundle);
    }

    @Override // android.widget.TabHost.OnTabChangeListener
    public void onTabChanged(String str) {
        this.c.setCurrentItem(this.b.getCurrentTab());
    }

    @Override // android.support.v4.view.bn
    public void a(int i, float f, int i2) {
    }

    @Override // android.support.v4.view.bn
    public void a_(int i) {
        TabWidget tabWidget = this.b.getTabWidget();
        int descendantFocusability = tabWidget.getDescendantFocusability();
        tabWidget.setDescendantFocusability(393216);
        this.b.setCurrentTab(i);
        tabWidget.setDescendantFocusability(descendantFocusability);
    }

    @Override // android.support.v4.view.bn
    public void b_(int i) {
    }
}
