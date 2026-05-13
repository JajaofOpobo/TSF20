package android.support.p013v7.view.menu;

import android.content.Context;
import android.support.p013v7.view.menu.C0628f;
import android.support.p013v7.widget.C0725aa;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
/* renamed from: android.support.v7.view.menu.ExpandedMenuView */
/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements C0628f.InterfaceC0630b, InterfaceC0645m, AdapterView.OnItemClickListener {

    /* renamed from: a */
    private static final int[] f1463a = {16842964, 16843049};

    /* renamed from: b */
    private C0628f f1464b;

    /* renamed from: c */
    private int f1465c;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C0725aa m11295a = C0725aa.m11295a(context, attributeSet, f1463a, i, 0);
        if (m11295a.m11286f(0)) {
            setBackgroundDrawable(m11295a.m11300a(0));
        }
        if (m11295a.m11286f(1)) {
            setDivider(m11295a.m11300a(1));
        }
        m11295a.m11301a();
    }

    @Override // android.support.p013v7.view.menu.InterfaceC0645m
    /* renamed from: a */
    public void mo11599a(C0628f c0628f) {
        this.f1464b = c0628f;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.support.p013v7.view.menu.C0628f.InterfaceC0630b
    /* renamed from: a */
    public boolean mo11598a(C0632h c0632h) {
        return this.f1464b.m11772a(c0632h, 0);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        mo11598a((C0632h) getAdapter().getItem(i));
    }

    public int getWindowAnimations() {
        return this.f1465c;
    }
}
