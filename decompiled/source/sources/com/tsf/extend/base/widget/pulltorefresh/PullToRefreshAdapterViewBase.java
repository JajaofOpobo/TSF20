package com.tsf.extend.base.widget.pulltorefresh;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.tsf.extend.base.widget.pulltorefresh.PullToRefreshBase;
import com.tsf.extend.f;
/* loaded from: classes.dex */
public abstract class PullToRefreshAdapterViewBase<T extends AbsListView> extends PullToRefreshBase<T> implements AbsListView.OnScrollListener {
    protected View a;
    private int d;
    private boolean e;
    private AbsListView.OnScrollListener f;
    private PullToRefreshBase.c g;
    private com.tsf.extend.base.widget.pulltorefresh.a.c h;
    private com.tsf.extend.base.widget.pulltorefresh.a.c i;
    private boolean j;
    private boolean k;

    private static FrameLayout.LayoutParams a(ViewGroup.LayoutParams layoutParams) {
        FrameLayout.LayoutParams layoutParams2 = null;
        if (layoutParams != null) {
            layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            if (layoutParams instanceof LinearLayout.LayoutParams) {
                layoutParams2.gravity = ((LinearLayout.LayoutParams) layoutParams).gravity;
            } else {
                layoutParams2.gravity = 17;
            }
        }
        return layoutParams2;
    }

    public PullToRefreshAdapterViewBase(Context context) {
        super(context);
        this.d = -1;
        this.k = true;
        ((AbsListView) this.b).setOnScrollListener(this);
    }

    public PullToRefreshAdapterViewBase(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = -1;
        this.k = true;
        ((AbsListView) this.b).setOnScrollListener(this);
    }

    public PullToRefreshAdapterViewBase(Context context, PullToRefreshBase.b bVar) {
        super(context, bVar);
        this.d = -1;
        this.k = true;
        ((AbsListView) this.b).setOnScrollListener(this);
    }

    public PullToRefreshAdapterViewBase(Context context, PullToRefreshBase.b bVar, PullToRefreshBase.a aVar) {
        super(context, bVar, aVar);
        this.d = -1;
        this.k = true;
        ((AbsListView) this.b).setOnScrollListener(this);
    }

    public boolean getShowIndicator() {
        return this.j;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        boolean z = true;
        if (this.g != null) {
            this.e = i3 > 0 && i + i2 >= i3 + (-1);
            if (i != 0 || i2 != i3) {
                z = false;
            }
            if (this.g != null && this.e && this.d != 0 && !z) {
                this.g.a();
            }
        }
        if (getShowIndicatorInternal()) {
            s();
        }
        if (this.f != null) {
            this.f.onScroll(absListView, i, i2, i3);
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i) {
        this.d = i;
        if (this.f != null) {
            this.f.onScrollStateChanged(absListView, i);
        }
    }

    public void setAdapter(ListAdapter listAdapter) {
        ((AbsListView) this.b).setAdapter(listAdapter);
    }

    public void setDivider(Drawable drawable) {
        if (this.b instanceof ListView) {
            ((ListView) this.b).setDivider(drawable);
        }
    }

    public final void setEmptyView(View view) {
        FrameLayout refreshableViewWrapper = getRefreshableViewWrapper();
        if (view != null) {
            view.setClickable(true);
            ViewParent parent = view.getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                ((ViewGroup) parent).removeView(view);
            }
            FrameLayout.LayoutParams a = a(view.getLayoutParams());
            if (a != null) {
                refreshableViewWrapper.addView(view, a);
            } else {
                refreshableViewWrapper.addView(view);
            }
        }
        try {
            if (this.b instanceof com.tsf.extend.base.widget.pulltorefresh.a.a) {
                ((com.tsf.extend.base.widget.pulltorefresh.a.a) this.b).setEmptyViewInternal(view);
            } else {
                ((AbsListView) this.b).setEmptyView(view);
            }
            this.a = view;
        } catch (Exception e) {
        }
    }

    public void setOnItemClickListener(AdapterView.OnItemClickListener onItemClickListener) {
        ((AbsListView) this.b).setOnItemClickListener(onItemClickListener);
    }

    public final void setOnLastItemVisibleListener(PullToRefreshBase.c cVar) {
        this.g = cVar;
    }

    public final void setOnScrollListener(AbsListView.OnScrollListener onScrollListener) {
        this.f = onScrollListener;
    }

    public final void setScrollEmptyView(boolean z) {
        this.k = z;
    }

    public void setShowIndicator(boolean z) {
        this.j = z;
        if (getShowIndicatorInternal()) {
            o();
        } else {
            r();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tsf.extend.base.widget.pulltorefresh.PullToRefreshBase
    public void a() {
        super.a();
        if (getShowIndicatorInternal()) {
            switch (getCurrentMode()) {
                case PULL_FROM_END:
                    this.i.e();
                    return;
                case PULL_FROM_START:
                    this.h.e();
                    return;
                default:
                    return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tsf.extend.base.widget.pulltorefresh.PullToRefreshBase
    public void a(boolean z) {
        super.a(z);
        if (getShowIndicatorInternal()) {
            s();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tsf.extend.base.widget.pulltorefresh.PullToRefreshBase
    public void b() {
        super.b();
        if (getShowIndicatorInternal()) {
            switch (getCurrentMode()) {
                case PULL_FROM_END:
                    this.i.d();
                    return;
                case PULL_FROM_START:
                    this.h.d();
                    return;
                default:
                    return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tsf.extend.base.widget.pulltorefresh.PullToRefreshBase
    public void c() {
        super.c();
        if (getShowIndicatorInternal()) {
            s();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tsf.extend.base.widget.pulltorefresh.PullToRefreshBase
    public void a(TypedArray typedArray) {
        this.j = typedArray.getBoolean(f.i.PullToRefresh_ptrShowIndicator, false);
    }

    @Override // com.tsf.extend.base.widget.pulltorefresh.PullToRefreshBase
    protected boolean d() {
        return p();
    }

    @Override // com.tsf.extend.base.widget.pulltorefresh.PullToRefreshBase
    protected boolean e() {
        return q();
    }

    @Override // android.view.View
    protected void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (this.a != null && !this.k) {
            this.a.scrollTo(-i, -i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tsf.extend.base.widget.pulltorefresh.PullToRefreshBase
    public void f() {
        super.f();
        if (getShowIndicatorInternal()) {
            o();
        } else {
            r();
        }
    }

    private void o() {
        PullToRefreshBase.b mode = getMode();
        FrameLayout refreshableViewWrapper = getRefreshableViewWrapper();
        if (mode.c() && this.h == null) {
            this.h = new com.tsf.extend.base.widget.pulltorefresh.a.c(getContext(), PullToRefreshBase.b.PULL_FROM_START);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.rightMargin = getResources().getDimensionPixelSize(f.c.ptr_indicator_right_padding);
            layoutParams.gravity = 53;
            refreshableViewWrapper.addView(this.h, layoutParams);
        } else if (!mode.c() && this.h != null) {
            refreshableViewWrapper.removeView(this.h);
            this.h = null;
        }
        if (mode.d() && this.i == null) {
            this.i = new com.tsf.extend.base.widget.pulltorefresh.a.c(getContext(), PullToRefreshBase.b.PULL_FROM_END);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams2.rightMargin = getResources().getDimensionPixelSize(f.c.ptr_indicator_right_padding);
            layoutParams2.gravity = 85;
            refreshableViewWrapper.addView(this.i, layoutParams2);
        } else if (!mode.d() && this.i != null) {
            refreshableViewWrapper.removeView(this.i);
            this.i = null;
        }
    }

    private boolean getShowIndicatorInternal() {
        return this.j && g();
    }

    private boolean p() {
        View childAt;
        Adapter adapter = ((AbsListView) this.b).getAdapter();
        if (adapter == null || adapter.isEmpty()) {
            return true;
        }
        if (((AbsListView) this.b).getFirstVisiblePosition() > 1 || (childAt = ((AbsListView) this.b).getChildAt(0)) == null) {
            return false;
        }
        return childAt.getTop() >= ((AbsListView) this.b).getTop();
    }

    private boolean q() {
        Adapter adapter = ((AbsListView) this.b).getAdapter();
        if (adapter == null || adapter.isEmpty()) {
            return true;
        }
        int count = ((AbsListView) this.b).getCount() - 1;
        int lastVisiblePosition = ((AbsListView) this.b).getLastVisiblePosition();
        if (lastVisiblePosition >= count - 1) {
            View childAt = ((AbsListView) this.b).getChildAt(lastVisiblePosition - ((AbsListView) this.b).getFirstVisiblePosition());
            if (childAt != null) {
                return childAt.getBottom() <= ((AbsListView) this.b).getBottom();
            }
        }
        return false;
    }

    private void r() {
        if (this.h != null) {
            getRefreshableViewWrapper().removeView(this.h);
            this.h = null;
        }
        if (this.i != null) {
            getRefreshableViewWrapper().removeView(this.i);
            this.i = null;
        }
    }

    private void s() {
        if (this.h != null) {
            if (!i() && d()) {
                if (!this.h.a()) {
                    this.h.c();
                }
            } else if (this.h.a()) {
                this.h.b();
            }
        }
        if (this.i != null) {
            if (!i() && e()) {
                if (!this.i.a()) {
                    this.i.c();
                }
            } else if (this.i.a()) {
                this.i.b();
            }
        }
    }
}
