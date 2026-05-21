package com.tsf.extend.base.widget.pulltorefresh;

import android.R;
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
import com.tsf.extend.base.widget.pulltorefresh.PullToRefreshBase;
import com.tsf.extend.f;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class PullToRefreshListView extends PullToRefreshAdapterViewBase<ListView> {
    private com.tsf.extend.base.widget.pulltorefresh.a.d d;
    private com.tsf.extend.base.widget.pulltorefresh.a.d e;
    private FrameLayout f;
    private FrameLayout g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;

    public PullToRefreshListView(Context context) {
        super(context);
        this.j = false;
    }

    public PullToRefreshListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.j = false;
    }

    public PullToRefreshListView(Context context, PullToRefreshBase.b bVar) {
        super(context, bVar);
        this.j = false;
    }

    public PullToRefreshListView(Context context, PullToRefreshBase.b bVar, PullToRefreshBase.a aVar) {
        super(context, bVar, aVar);
        this.j = false;
    }

    @Override // com.tsf.extend.base.widget.pulltorefresh.PullToRefreshBase
    public final PullToRefreshBase.h getPullToRefreshScrollDirection() {
        return PullToRefreshBase.h.VERTICAL;
    }

    @Override // com.tsf.extend.base.widget.pulltorefresh.PullToRefreshAdapterViewBase, com.tsf.extend.base.widget.pulltorefresh.PullToRefreshBase
    protected void a() {
        if (!this.i) {
            super.a();
        } else if (getMode() == PullToRefreshBase.b.PULL_FROM_START) {
            this.d.setVisibility(0);
            this.d.f();
        } else {
            super.a();
        }
    }

    @Override // com.tsf.extend.base.widget.pulltorefresh.PullToRefreshAdapterViewBase, com.tsf.extend.base.widget.pulltorefresh.PullToRefreshBase
    protected void b() {
        if (!this.i) {
            super.b();
        } else if (getMode() == PullToRefreshBase.b.PULL_FROM_START) {
            this.d.setVisibility(0);
            this.d.h();
        } else {
            super.b();
        }
    }

    @Override // com.tsf.extend.base.widget.pulltorefresh.PullToRefreshAdapterViewBase, com.tsf.extend.base.widget.pulltorefresh.PullToRefreshBase
    protected void a(boolean z) {
        com.tsf.extend.base.widget.pulltorefresh.a.d footerLayout;
        com.tsf.extend.base.widget.pulltorefresh.a.d dVar;
        com.tsf.extend.base.widget.pulltorefresh.a.d dVar2;
        int count;
        int scrollY;
        ListAdapter adapter = ((ListView) this.b).getAdapter();
        if (!this.h || !getShowViewWhileRefreshing() || adapter == null || adapter.isEmpty()) {
            if (this.i && Build.VERSION.SDK_INT >= 19) {
                ((ListView) this.b).setVisibility(0);
                this.d.setVisibility(0);
                this.d.g();
            }
            super.a(z);
            return;
        }
        super.a(false);
        switch (getCurrentMode()) {
            case MANUAL_REFRESH_ONLY:
            case PULL_FROM_END:
                footerLayout = getFooterLayout();
                dVar = this.e;
                dVar2 = this.d;
                count = ((ListView) this.b).getCount() - 1;
                scrollY = getScrollY() - getFooterSize();
                break;
            default:
                com.tsf.extend.base.widget.pulltorefresh.a.d headerLayout = getHeaderLayout();
                com.tsf.extend.base.widget.pulltorefresh.a.d dVar3 = this.d;
                com.tsf.extend.base.widget.pulltorefresh.a.d dVar4 = this.e;
                scrollY = getScrollY() + getHeaderSize();
                footerLayout = headerLayout;
                dVar = dVar3;
                dVar2 = dVar4;
                count = 0;
                break;
        }
        footerLayout.i();
        footerLayout.e();
        dVar2.setVisibility(8);
        dVar.setVisibility(0);
        dVar.g();
        if (z) {
            if (this.j && this.i) {
                ViewGroup.LayoutParams layoutParams = this.g.getLayoutParams();
                int height = layoutParams.height > 0 ? layoutParams.height : this.g.getHeight();
                if (height > 0) {
                    this.k = true;
                    layoutParams.height = height + getHeaderSize();
                    this.g.setLayoutParams(layoutParams);
                }
            }
            l();
            setHeaderScroll(scrollY);
            ((ListView) this.b).setSelection(count);
            a(0);
        }
    }

    @Override // com.tsf.extend.base.widget.pulltorefresh.PullToRefreshAdapterViewBase, com.tsf.extend.base.widget.pulltorefresh.PullToRefreshBase
    protected void c() {
        boolean z;
        int i;
        int i2;
        com.tsf.extend.base.widget.pulltorefresh.a.d dVar;
        com.tsf.extend.base.widget.pulltorefresh.a.d headerLayout;
        if (!this.h) {
            super.c();
            return;
        }
        switch (getCurrentMode()) {
            case MANUAL_REFRESH_ONLY:
            case PULL_FROM_END:
                com.tsf.extend.base.widget.pulltorefresh.a.d footerLayout = getFooterLayout();
                com.tsf.extend.base.widget.pulltorefresh.a.d dVar2 = this.e;
                int count = ((ListView) this.b).getCount() - 1;
                int footerSize = getFooterSize();
                z = Math.abs(((ListView) this.b).getLastVisiblePosition() - count) <= 1;
                i = count;
                i2 = footerSize;
                dVar = dVar2;
                headerLayout = footerLayout;
                break;
            default:
                headerLayout = getHeaderLayout();
                dVar = this.d;
                i2 = -getHeaderSize();
                z = Math.abs(((ListView) this.b).getFirstVisiblePosition() - 0) <= 1;
                i = 0;
                break;
        }
        if (dVar.getVisibility() == 0) {
            headerLayout.j();
            if (dVar == this.d && this.i) {
                if (this.k && this.j) {
                    ViewGroup.LayoutParams layoutParams = this.g.getLayoutParams();
                    layoutParams.height -= getHeaderSize();
                    this.g.setLayoutParams(layoutParams);
                }
                this.k = false;
                dVar.i();
                dVar.j();
                dVar.setVisibility(4);
            } else {
                dVar.setVisibility(8);
            }
            if (z && getState() != PullToRefreshBase.j.MANUAL_REFRESHING) {
                ((ListView) this.b).setSelection(i);
                setHeaderScroll(i2);
            }
        }
        super.c();
    }

    @Override // com.tsf.extend.base.widget.pulltorefresh.PullToRefreshBase
    protected com.tsf.extend.base.widget.pulltorefresh.b b(boolean z, boolean z2) {
        com.tsf.extend.base.widget.pulltorefresh.b bVarB = super.b(z, z2);
        if (this.h) {
            PullToRefreshBase.b mode = getMode();
            if (z && mode.c()) {
                bVarB.a(this.d);
            }
            if (z2 && mode.d()) {
                bVarB.a(this.e);
            }
        }
        return bVarB;
    }

    protected ListView b(Context context, AttributeSet attributeSet) {
        if (Build.VERSION.SDK_INT >= 9) {
            return new b(context, attributeSet);
        }
        return new a(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tsf.extend.base.widget.pulltorefresh.PullToRefreshBase
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public ListView a(Context context, AttributeSet attributeSet) {
        ListView listViewB = b(context, attributeSet);
        listViewB.setId(R.id.list);
        return listViewB;
    }

    @Override // com.tsf.extend.base.widget.pulltorefresh.PullToRefreshAdapterViewBase, com.tsf.extend.base.widget.pulltorefresh.PullToRefreshBase
    protected void a(TypedArray typedArray) {
        super.a(typedArray);
        this.h = typedArray.getBoolean(f.i.PullToRefresh_ptrListViewExtrasEnabled, true);
        this.i = typedArray.getBoolean(f.i.PullToRefresh_ptrExtraHeaderEnabled, false);
        if (this.h) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 1);
            this.d = a(getContext(), PullToRefreshBase.b.PULL_FROM_START, typedArray);
            layoutParams.gravity = 81;
            this.g = new FrameLayout(getContext());
            if (this.i) {
                LinearLayout linearLayout = new LinearLayout(getContext());
                linearLayout.addView(new View(getContext()), new LinearLayout.LayoutParams(-1, 0, 1.0f));
                linearLayout.setOrientation(1);
                this.d.setVisibility(0);
                linearLayout.addView(this.d, layoutParams);
                this.g.addView(linearLayout);
            } else {
                this.d.setVisibility(8);
                this.g.addView(this.d, layoutParams);
            }
            ((ListView) this.b).addHeaderView(this.g, null, false);
            this.f = new FrameLayout(getContext());
            this.e = a(getContext(), PullToRefreshBase.b.PULL_FROM_END, typedArray);
            this.e.setVisibility(8);
            layoutParams.gravity = 1;
            this.f.addView(this.e, layoutParams);
            if (!typedArray.hasValue(f.i.PullToRefresh_ptrScrollingWhileRefreshingEnabled)) {
                setScrollingWhileRefreshingEnabled(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @TargetApi(9)
    public class b extends a {
        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // android.view.View
        protected boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
            boolean zOverScrollBy = super.overScrollBy(i, i2, i3, i4, i5, i6, i7, i8, z);
            c.a(PullToRefreshListView.this, i, i3, i2, i4, z);
            return zOverScrollBy;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public class a extends ListView implements com.tsf.extend.base.widget.pulltorefresh.a.a {
        private boolean b;

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.b = false;
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
            if (PullToRefreshListView.this.f != null && !this.b) {
                addFooterView(PullToRefreshListView.this.f, null, false);
                this.b = true;
            }
            super.setAdapter(listAdapter);
        }

        @Override // android.widget.AdapterView
        public void setEmptyView(View view) {
            PullToRefreshListView.this.setEmptyView(view);
        }

        @Override // com.tsf.extend.base.widget.pulltorefresh.a.a
        public void setEmptyViewInternal(View view) {
            super.setEmptyView(view);
        }
    }

    public ListView getListView() {
        return (ListView) this.b;
    }

    public FrameLayout getHeaderFrame() {
        return this.g;
    }

    public void setHeaderResizeEnabled(boolean z) {
        this.j = z;
    }
}
