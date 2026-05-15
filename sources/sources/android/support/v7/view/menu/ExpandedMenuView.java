package android.support.v7.view.menu;

import android.R;
import android.content.Context;
import android.support.v7.view.menu.f;
import android.support.v7.widget.aa;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public final class ExpandedMenuView extends ListView implements f.b, m, AdapterView.OnItemClickListener {
    private static final int[] a = {R.attr.background, R.attr.divider};
    private f b;
    private int c;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        aa aaVarA = aa.a(context, attributeSet, a, i, 0);
        if (aaVarA.f(0)) {
            setBackgroundDrawable(aaVarA.a(0));
        }
        if (aaVarA.f(1)) {
            setDivider(aaVarA.a(1));
        }
        aaVarA.a();
    }

    @Override // android.support.v7.view.menu.m
    public void a(f fVar) {
        this.b = fVar;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.support.v7.view.menu.f.b
    public boolean a(h hVar) {
        return this.b.a(hVar, 0);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        a((h) getAdapter().getItem(i));
    }

    public int getWindowAnimations() {
        return this.c;
    }
}
