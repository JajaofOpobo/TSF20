package com.tsf.shell.plugin.iconpicker;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.s;
import android.support.v4.view.ViewPager;
import android.support.v4.view.bb;
import android.support.v4.view.v;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.TabHost;
import android.widget.TabWidget;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class h extends s implements bb, TabHost.OnTabChangeListener {
    public static int a = 0;
    public static int b;
    private final Context c;
    private final TabHost d;
    private final ViewPager e;
    private final HorizontalScrollView f;
    private final ArrayList g;

    public h(FragmentActivity fragmentActivity, TabHost tabHost, ViewPager viewPager, HorizontalScrollView horizontalScrollView) {
        super(fragmentActivity.d());
        this.g = new ArrayList();
        this.c = fragmentActivity;
        this.d = tabHost;
        this.e = viewPager;
        this.f = horizontalScrollView;
        this.d.setOnTabChangedListener(this);
        this.e.a((v) this);
        this.e.a((bb) this);
    }

    public final void a(TabHost.TabSpec tabSpec, Class cls, Bundle bundle) {
        tabSpec.setContent(new i(this.c));
        this.g.add(new j(tabSpec.getTag(), cls, bundle));
        this.d.addTab(tabSpec);
        d();
    }

    @Override // android.support.v4.view.v, com.tsf.shell.action.p
    public final int c() {
        return this.g.size();
    }

    @Override // android.support.v4.app.s
    public final Fragment a(int i) {
        Class cls;
        Bundle bundle;
        j jVar = (j) this.g.get(i);
        Context context = this.c;
        cls = jVar.b;
        String name = cls.getName();
        bundle = jVar.c;
        return Fragment.a(context, name, bundle);
    }

    @Override // android.support.v4.app.s, android.support.v4.view.v
    public final void a(ViewGroup viewGroup, int i, Object obj) {
        ((d) obj).z();
        super.a(viewGroup, i, obj);
    }

    @Override // android.widget.TabHost.OnTabChangeListener
    public final void onTabChanged(String str) {
        this.e.a(this.d.getCurrentTab());
    }

    @Override // android.support.v4.view.bb
    public final void a(int i, float f, int i2) {
    }

    @Override // android.support.v4.view.bb
    public final void a_(int i) {
        TabWidget tabWidget = this.d.getTabWidget();
        int descendantFocusability = tabWidget.getDescendantFocusability();
        tabWidget.setDescendantFocusability(393216);
        this.d.setCurrentTab(i);
        tabWidget.setDescendantFocusability(descendantFocusability);
        this.f.smoothScrollTo(((ViewGroup) this.f.getChildAt(0)).getChildAt(i).getLeft() - (Math.abs(this.f.getWidth() - ((ViewGroup) this.f.getChildAt(0)).getChildAt(i).getWidth()) / 2), 0);
        b = i;
    }

    @Override // android.support.v4.view.bb
    public final void b(int i) {
        a = i;
        if (i == 0) {
            ((a) d.S.get(Integer.valueOf(b))).a();
        }
    }
}
