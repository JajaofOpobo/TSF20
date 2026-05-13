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
import com.tsf.extend.C1536f;
import com.tsf.extend.base.widget.pulltorefresh.PullToRefreshBase;
import com.tsf.extend.base.widget.pulltorefresh.p081a.InterfaceC1506a;
import com.tsf.extend.base.widget.pulltorefresh.p081a.animationAnimation$AnimationListenerC1509c;
/* loaded from: classes.dex */
public abstract class PullToRefreshAdapterViewBase<T extends AbsListView> extends PullToRefreshBase<T> implements AbsListView.OnScrollListener {

    /* renamed from: a */
    protected View f4647a;

    /* renamed from: d */
    private int f4648d;

    /* renamed from: e */
    private boolean f4649e;

    /* renamed from: f */
    private AbsListView.OnScrollListener f4650f;

    /* renamed from: g */
    private PullToRefreshBase.InterfaceC1492c f4651g;

    /* renamed from: h */
    private animationAnimation$AnimationListenerC1509c f4652h;

    /* renamed from: i */
    private animationAnimation$AnimationListenerC1509c f4653i;

    /* renamed from: j */
    private boolean f4654j;

    /* renamed from: k */
    private boolean f4655k;

    /* renamed from: a */
    private static FrameLayout.LayoutParams m8438a(ViewGroup.LayoutParams layoutParams) {
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
        this.f4648d = -1;
        this.f4655k = true;
        ((AbsListView) this.f4667b).setOnScrollListener(this);
    }

    public PullToRefreshAdapterViewBase(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4648d = -1;
        this.f4655k = true;
        ((AbsListView) this.f4667b).setOnScrollListener(this);
    }

    public PullToRefreshAdapterViewBase(Context context, PullToRefreshBase.EnumC1491b enumC1491b) {
        super(context, enumC1491b);
        this.f4648d = -1;
        this.f4655k = true;
        ((AbsListView) this.f4667b).setOnScrollListener(this);
    }

    public PullToRefreshAdapterViewBase(Context context, PullToRefreshBase.EnumC1491b enumC1491b, PullToRefreshBase.EnumC1490a enumC1490a) {
        super(context, enumC1491b, enumC1490a);
        this.f4648d = -1;
        this.f4655k = true;
        ((AbsListView) this.f4667b).setOnScrollListener(this);
    }

    public boolean getShowIndicator() {
        return this.f4654j;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        boolean z = true;
        if (this.f4651g != null) {
            this.f4649e = i3 > 0 && i + i2 >= i3 + (-1);
            if (i != 0 || i2 != i3) {
                z = false;
            }
            if (this.f4651g != null && this.f4649e && this.f4648d != 0 && !z) {
                this.f4651g.mo8385a();
            }
        }
        if (getShowIndicatorInternal()) {
            m8433s();
        }
        if (this.f4650f != null) {
            this.f4650f.onScroll(absListView, i, i2, i3);
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i) {
        this.f4648d = i;
        if (this.f4650f != null) {
            this.f4650f.onScrollStateChanged(absListView, i);
        }
    }

    public void setAdapter(ListAdapter listAdapter) {
        ((AbsListView) this.f4667b).setAdapter(listAdapter);
    }

    public void setDivider(Drawable drawable) {
        if (this.f4667b instanceof ListView) {
            ((ListView) this.f4667b).setDivider(drawable);
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
            FrameLayout.LayoutParams m8438a = m8438a(view.getLayoutParams());
            if (m8438a != null) {
                refreshableViewWrapper.addView(view, m8438a);
            } else {
                refreshableViewWrapper.addView(view);
            }
        }
        try {
            if (this.f4667b instanceof InterfaceC1506a) {
                ((InterfaceC1506a) this.f4667b).setEmptyViewInternal(view);
            } else {
                ((AbsListView) this.f4667b).setEmptyView(view);
            }
            this.f4647a = view;
        } catch (Exception e) {
        }
    }

    public void setOnItemClickListener(AdapterView.OnItemClickListener onItemClickListener) {
        ((AbsListView) this.f4667b).setOnItemClickListener(onItemClickListener);
    }

    public final void setOnLastItemVisibleListener(PullToRefreshBase.InterfaceC1492c interfaceC1492c) {
        this.f4651g = interfaceC1492c;
    }

    public final void setOnScrollListener(AbsListView.OnScrollListener onScrollListener) {
        this.f4650f = onScrollListener;
    }

    public final void setScrollEmptyView(boolean z) {
        this.f4655k = z;
    }

    public void setShowIndicator(boolean z) {
        this.f4654j = z;
        if (getShowIndicatorInternal()) {
            m8437o();
        } else {
            m8434r();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tsf.extend.base.widget.pulltorefresh.PullToRefreshBase
    /* renamed from: a */
    public void mo8375a() {
        super.mo8375a();
        if (getShowIndicatorInternal()) {
            switch (getCurrentMode()) {
                case PULL_FROM_END:
                    this.f4653i.m8362e();
                    return;
                case PULL_FROM_START:
                    this.f4652h.m8362e();
                    return;
                default:
                    return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tsf.extend.base.widget.pulltorefresh.PullToRefreshBase
    /* renamed from: a */
    public void mo8371a(boolean z) {
        super.mo8371a(z);
        if (getShowIndicatorInternal()) {
            m8433s();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tsf.extend.base.widget.pulltorefresh.PullToRefreshBase
    /* renamed from: b */
    public void mo8370b() {
        super.mo8370b();
        if (getShowIndicatorInternal()) {
            switch (getCurrentMode()) {
                case PULL_FROM_END:
                    this.f4653i.m8363d();
                    return;
                case PULL_FROM_START:
                    this.f4652h.m8363d();
                    return;
                default:
                    return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tsf.extend.base.widget.pulltorefresh.PullToRefreshBase
    /* renamed from: c */
    public void mo8368c() {
        super.mo8368c();
        if (getShowIndicatorInternal()) {
            m8433s();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tsf.extend.base.widget.pulltorefresh.PullToRefreshBase
    /* renamed from: a */
    public void mo8373a(TypedArray typedArray) {
        this.f4654j = typedArray.getBoolean(C1536f.C1545i.PullToRefresh_ptrShowIndicator, false);
    }

    @Override // com.tsf.extend.base.widget.pulltorefresh.PullToRefreshBase
    /* renamed from: d */
    protected boolean mo8408d() {
        return m8436p();
    }

    @Override // com.tsf.extend.base.widget.pulltorefresh.PullToRefreshBase
    /* renamed from: e */
    protected boolean mo8407e() {
        return m8435q();
    }

    @Override // android.view.View
    protected void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (this.f4647a != null && !this.f4655k) {
            this.f4647a.scrollTo(-i, -i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tsf.extend.base.widget.pulltorefresh.PullToRefreshBase
    /* renamed from: f */
    public void mo8406f() {
        super.mo8406f();
        if (getShowIndicatorInternal()) {
            m8437o();
        } else {
            m8434r();
        }
    }

    /* renamed from: o */
    private void m8437o() {
        PullToRefreshBase.EnumC1491b mode = getMode();
        FrameLayout refreshableViewWrapper = getRefreshableViewWrapper();
        if (mode.m8388c() && this.f4652h == null) {
            this.f4652h = new animationAnimation$AnimationListenerC1509c(getContext(), PullToRefreshBase.EnumC1491b.PULL_FROM_START);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.rightMargin = getResources().getDimensionPixelSize(C1536f.C1539c.ptr_indicator_right_padding);
            layoutParams.gravity = 53;
            refreshableViewWrapper.addView(this.f4652h, layoutParams);
        } else if (!mode.m8388c() && this.f4652h != null) {
            refreshableViewWrapper.removeView(this.f4652h);
            this.f4652h = null;
        }
        if (mode.m8387d() && this.f4653i == null) {
            this.f4653i = new animationAnimation$AnimationListenerC1509c(getContext(), PullToRefreshBase.EnumC1491b.PULL_FROM_END);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams2.rightMargin = getResources().getDimensionPixelSize(C1536f.C1539c.ptr_indicator_right_padding);
            layoutParams2.gravity = 85;
            refreshableViewWrapper.addView(this.f4653i, layoutParams2);
        } else if (!mode.m8387d() && this.f4653i != null) {
            refreshableViewWrapper.removeView(this.f4653i);
            this.f4653i = null;
        }
    }

    private boolean getShowIndicatorInternal() {
        return this.f4654j && m8405g();
    }

    /* renamed from: p */
    private boolean m8436p() {
        View childAt;
        Adapter adapter = ((AbsListView) this.f4667b).getAdapter();
        if (adapter == null || adapter.isEmpty()) {
            return true;
        }
        if (((AbsListView) this.f4667b).getFirstVisiblePosition() > 1 || (childAt = ((AbsListView) this.f4667b).getChildAt(0)) == null) {
            return false;
        }
        return childAt.getTop() >= ((AbsListView) this.f4667b).getTop();
    }

    /* renamed from: q */
    private boolean m8435q() {
        Adapter adapter = ((AbsListView) this.f4667b).getAdapter();
        if (adapter == null || adapter.isEmpty()) {
            return true;
        }
        int count = ((AbsListView) this.f4667b).getCount() - 1;
        int lastVisiblePosition = ((AbsListView) this.f4667b).getLastVisiblePosition();
        if (lastVisiblePosition >= count - 1) {
            View childAt = ((AbsListView) this.f4667b).getChildAt(lastVisiblePosition - ((AbsListView) this.f4667b).getFirstVisiblePosition());
            if (childAt != null) {
                return childAt.getBottom() <= ((AbsListView) this.f4667b).getBottom();
            }
        }
        return false;
    }

    /* renamed from: r */
    private void m8434r() {
        if (this.f4652h != null) {
            getRefreshableViewWrapper().removeView(this.f4652h);
            this.f4652h = null;
        }
        if (this.f4653i != null) {
            getRefreshableViewWrapper().removeView(this.f4653i);
            this.f4653i = null;
        }
    }

    /* renamed from: s */
    private void m8433s() {
        if (this.f4652h != null) {
            if (!m8403i() && mo8408d()) {
                if (!this.f4652h.m8366a()) {
                    this.f4652h.m8364c();
                }
            } else if (this.f4652h.m8366a()) {
                this.f4652h.m8365b();
            }
        }
        if (this.f4653i != null) {
            if (!m8403i() && mo8407e()) {
                if (!this.f4653i.m8366a()) {
                    this.f4653i.m8364c();
                }
            } else if (this.f4653i.m8366a()) {
                this.f4653i.m8365b();
            }
        }
    }
}
