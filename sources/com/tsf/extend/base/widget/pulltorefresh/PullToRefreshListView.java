package com.tsf.extend.base.widget.pulltorefresh;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.tsf.extend.C1536f;
import com.tsf.extend.base.widget.pulltorefresh.PullToRefreshBase;
import com.tsf.extend.base.widget.pulltorefresh.p081a.AbstractC1511d;
import com.tsf.extend.base.widget.pulltorefresh.p081a.InterfaceC1506a;
/* loaded from: classes.dex */
public class PullToRefreshListView extends PullToRefreshAdapterViewBase<ListView> {

    /* renamed from: d */
    private AbstractC1511d f4731d;

    /* renamed from: e */
    private AbstractC1511d f4732e;

    /* renamed from: f */
    private FrameLayout f4733f;

    /* renamed from: g */
    private FrameLayout f4734g;

    /* renamed from: h */
    private boolean f4735h;

    /* renamed from: i */
    private boolean f4736i;

    /* renamed from: j */
    private boolean f4737j;

    /* renamed from: k */
    private boolean f4738k;

    public PullToRefreshListView(Context context) {
        super(context);
        this.f4737j = false;
    }

    public PullToRefreshListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4737j = false;
    }

    public PullToRefreshListView(Context context, PullToRefreshBase.EnumC1491b enumC1491b) {
        super(context, enumC1491b);
        this.f4737j = false;
    }

    public PullToRefreshListView(Context context, PullToRefreshBase.EnumC1491b enumC1491b, PullToRefreshBase.EnumC1490a enumC1490a) {
        super(context, enumC1491b, enumC1490a);
        this.f4737j = false;
    }

    @Override // com.tsf.extend.base.widget.pulltorefresh.PullToRefreshBase
    public final PullToRefreshBase.EnumC1497h getPullToRefreshScrollDirection() {
        return PullToRefreshBase.EnumC1497h.VERTICAL;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tsf.extend.base.widget.pulltorefresh.PullToRefreshAdapterViewBase, com.tsf.extend.base.widget.pulltorefresh.PullToRefreshBase
    /* renamed from: a */
    public void mo8375a() {
        if (!this.f4736i) {
            super.mo8375a();
        } else if (getMode() == PullToRefreshBase.EnumC1491b.PULL_FROM_START) {
            this.f4731d.setVisibility(0);
            this.f4731d.m8359f();
        } else {
            super.mo8375a();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tsf.extend.base.widget.pulltorefresh.PullToRefreshAdapterViewBase, com.tsf.extend.base.widget.pulltorefresh.PullToRefreshBase
    /* renamed from: b */
    public void mo8370b() {
        if (!this.f4736i) {
            super.mo8370b();
        } else if (getMode() == PullToRefreshBase.EnumC1491b.PULL_FROM_START) {
            this.f4731d.setVisibility(0);
            this.f4731d.m8357h();
        } else {
            super.mo8370b();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tsf.extend.base.widget.pulltorefresh.PullToRefreshAdapterViewBase, com.tsf.extend.base.widget.pulltorefresh.PullToRefreshBase
    /* renamed from: a */
    public void mo8371a(boolean z) {
        AbstractC1511d footerLayout;
        AbstractC1511d abstractC1511d;
        AbstractC1511d abstractC1511d2;
        int count;
        int scrollY;
        ListAdapter adapter = ((ListView) this.f4667b).getAdapter();
        if (!this.f4735h || !getShowViewWhileRefreshing() || adapter == null || adapter.isEmpty()) {
            if (this.f4736i && Build.VERSION.SDK_INT >= 19) {
                ((ListView) this.f4667b).setVisibility(0);
                this.f4731d.setVisibility(0);
                this.f4731d.m8358g();
            }
            super.mo8371a(z);
            return;
        }
        super.mo8371a(false);
        switch (getCurrentMode()) {
            case MANUAL_REFRESH_ONLY:
            case PULL_FROM_END:
                footerLayout = getFooterLayout();
                abstractC1511d = this.f4732e;
                abstractC1511d2 = this.f4731d;
                count = ((ListView) this.f4667b).getCount() - 1;
                scrollY = getScrollY() - getFooterSize();
                break;
            default:
                AbstractC1511d headerLayout = getHeaderLayout();
                AbstractC1511d abstractC1511d3 = this.f4731d;
                AbstractC1511d abstractC1511d4 = this.f4732e;
                scrollY = getScrollY() + getHeaderSize();
                footerLayout = headerLayout;
                abstractC1511d = abstractC1511d3;
                abstractC1511d2 = abstractC1511d4;
                count = 0;
                break;
        }
        footerLayout.m8356i();
        footerLayout.m8360e();
        abstractC1511d2.setVisibility(8);
        abstractC1511d.setVisibility(0);
        abstractC1511d.m8358g();
        if (z) {
            if (this.f4737j && this.f4736i) {
                ViewGroup.LayoutParams layoutParams = this.f4734g.getLayoutParams();
                int height = layoutParams.height > 0 ? layoutParams.height : this.f4734g.getHeight();
                if (height > 0) {
                    this.f4738k = true;
                    layoutParams.height = height + getHeaderSize();
                    this.f4734g.setLayoutParams(layoutParams);
                }
            }
            m8400l();
            setHeaderScroll(scrollY);
            ((ListView) this.f4667b).setSelection(count);
            m8425a(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tsf.extend.base.widget.pulltorefresh.PullToRefreshAdapterViewBase, com.tsf.extend.base.widget.pulltorefresh.PullToRefreshBase
    /* renamed from: c */
    public void mo8368c() {
        boolean z;
        int i;
        int i2;
        AbstractC1511d abstractC1511d;
        AbstractC1511d abstractC1511d2;
        if (!this.f4735h) {
            super.mo8368c();
            return;
        }
        switch (getCurrentMode()) {
            case MANUAL_REFRESH_ONLY:
            case PULL_FROM_END:
                AbstractC1511d footerLayout = getFooterLayout();
                AbstractC1511d abstractC1511d3 = this.f4732e;
                int count = ((ListView) this.f4667b).getCount() - 1;
                int footerSize = getFooterSize();
                z = Math.abs(((ListView) this.f4667b).getLastVisiblePosition() - count) <= 1;
                i = count;
                i2 = footerSize;
                abstractC1511d = abstractC1511d3;
                abstractC1511d2 = footerLayout;
                break;
            default:
                abstractC1511d2 = getHeaderLayout();
                abstractC1511d = this.f4731d;
                i2 = -getHeaderSize();
                z = Math.abs(((ListView) this.f4667b).getFirstVisiblePosition() - 0) <= 1;
                i = 0;
                break;
        }
        if (abstractC1511d.getVisibility() == 0) {
            abstractC1511d2.m8355j();
            if (abstractC1511d == this.f4731d && this.f4736i) {
                if (this.f4738k && this.f4737j) {
                    ViewGroup.LayoutParams layoutParams = this.f4734g.getLayoutParams();
                    layoutParams.height -= getHeaderSize();
                    this.f4734g.setLayoutParams(layoutParams);
                }
                this.f4738k = false;
                abstractC1511d.m8356i();
                abstractC1511d.m8355j();
                abstractC1511d.setVisibility(4);
            } else {
                abstractC1511d.setVisibility(8);
            }
            if (z && getState() != PullToRefreshBase.EnumC1499j.MANUAL_REFRESHING) {
                ((ListView) this.f4667b).setSelection(i);
                setHeaderScroll(i2);
            }
        }
        super.mo8368c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tsf.extend.base.widget.pulltorefresh.PullToRefreshBase
    /* renamed from: b */
    public C1515b mo8369b(boolean z, boolean z2) {
        C1515b b = super.mo8369b(z, z2);
        if (this.f4735h) {
            PullToRefreshBase.EnumC1491b mode = getMode();
            if (z && mode.m8388c()) {
                b.m8346a(this.f4731d);
            }
            if (z2 && mode.m8387d()) {
                b.m8346a(this.f4732e);
            }
        }
        return b;
    }

    /* renamed from: b */
    protected ListView mo7982b(Context context, AttributeSet attributeSet) {
        if (Build.VERSION.SDK_INT >= 9) {
            return new C1504b(context, attributeSet);
        }
        return new C1503a(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tsf.extend.base.widget.pulltorefresh.PullToRefreshBase
    /* renamed from: c */
    public ListView mo8374a(Context context, AttributeSet attributeSet) {
        ListView mo7982b = mo7982b(context, attributeSet);
        mo7982b.setId(16908298);
        return mo7982b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tsf.extend.base.widget.pulltorefresh.PullToRefreshAdapterViewBase, com.tsf.extend.base.widget.pulltorefresh.PullToRefreshBase
    /* renamed from: a */
    public void mo8373a(TypedArray typedArray) {
        super.mo8373a(typedArray);
        this.f4735h = typedArray.getBoolean(C1536f.C1545i.PullToRefresh_ptrListViewExtrasEnabled, true);
        this.f4736i = typedArray.getBoolean(C1536f.C1545i.PullToRefresh_ptrExtraHeaderEnabled, false);
        if (this.f4735h) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 1);
            this.f4731d = m8419a(getContext(), PullToRefreshBase.EnumC1491b.PULL_FROM_START, typedArray);
            layoutParams.gravity = 81;
            this.f4734g = new FrameLayout(getContext());
            if (this.f4736i) {
                LinearLayout linearLayout = new LinearLayout(getContext());
                linearLayout.addView(new View(getContext()), new LinearLayout.LayoutParams(-1, 0, 1.0f));
                linearLayout.setOrientation(1);
                this.f4731d.setVisibility(0);
                linearLayout.addView(this.f4731d, layoutParams);
                this.f4734g.addView(linearLayout);
            } else {
                this.f4731d.setVisibility(8);
                this.f4734g.addView(this.f4731d, layoutParams);
            }
            ((ListView) this.f4667b).addHeaderView(this.f4734g, null, false);
            this.f4733f = new FrameLayout(getContext());
            this.f4732e = m8419a(getContext(), PullToRefreshBase.EnumC1491b.PULL_FROM_END, typedArray);
            this.f4732e.setVisibility(8);
            layoutParams.gravity = 1;
            this.f4733f.addView(this.f4732e, layoutParams);
            if (!typedArray.hasValue(C1536f.C1545i.PullToRefresh_ptrScrollingWhileRefreshingEnabled)) {
                setScrollingWhileRefreshingEnabled(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @TargetApi(9)
    /* renamed from: com.tsf.extend.base.widget.pulltorefresh.PullToRefreshListView$b */
    /* loaded from: classes.dex */
    public class C1504b extends C1503a {
        public C1504b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // android.view.View
        protected boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
            boolean overScrollBy = super.overScrollBy(i, i2, i3, i4, i5, i6, i7, i8, z);
            C1516c.m8342a(PullToRefreshListView.this, i, i3, i2, i4, z);
            return overScrollBy;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.tsf.extend.base.widget.pulltorefresh.PullToRefreshListView$a */
    /* loaded from: classes.dex */
    public class C1503a extends ListView implements InterfaceC1506a {

        /* renamed from: b */
        private boolean f4741b;

        public C1503a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f4741b = false;
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
        protected void dispatchDraw(Canvas canvas) {
            try {
                super.dispatchDraw(canvas);
            } catch (IndexOutOfBoundsException e) {
                e.printStackTrace();
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            try {
                return super.dispatchTouchEvent(motionEvent);
            } catch (IndexOutOfBoundsException e) {
                e.printStackTrace();
                return false;
            }
        }

        @Override // android.widget.AdapterView
        public void setAdapter(ListAdapter listAdapter) {
            if (PullToRefreshListView.this.f4733f != null && !this.f4741b) {
                addFooterView(PullToRefreshListView.this.f4733f, null, false);
                this.f4741b = true;
            }
            super.setAdapter(listAdapter);
        }

        @Override // android.widget.AdapterView
        public void setEmptyView(View view) {
            PullToRefreshListView.this.setEmptyView(view);
        }

        @Override // com.tsf.extend.base.widget.pulltorefresh.p081a.InterfaceC1506a
        public void setEmptyViewInternal(View view) {
            super.setEmptyView(view);
        }
    }

    public ListView getListView() {
        return (ListView) this.f4667b;
    }

    public FrameLayout getHeaderFrame() {
        return this.f4734g;
    }

    public void setHeaderResizeEnabled(boolean z) {
        this.f4737j = z;
    }
}
