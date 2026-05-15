package com.tsf.extend.base.widget.pulltorefresh;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.tsf.extend.base.j.z;
import com.tsf.extend.base.widget.pulltorefresh.PullToRefreshBase;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class PullToRefreshAndLoadMoreListView extends PullToRefreshListView {
    private FrameLayout d;
    private View e;
    private a f;
    private boolean g;
    private PullToRefreshBase.f<ListView> h;
    private PullToRefreshBase.c i;

    public interface a {
        void a();

        void b();
    }

    public PullToRefreshAndLoadMoreListView(Context context) {
        super(context);
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = true;
        this.h = new PullToRefreshBase.f<ListView>() { // from class: com.tsf.extend.base.widget.pulltorefresh.PullToRefreshAndLoadMoreListView.2
            @Override // com.tsf.extend.base.widget.pulltorefresh.PullToRefreshBase.f
            public void a(PullToRefreshBase<ListView> pullToRefreshBase) {
                if (PullToRefreshAndLoadMoreListView.this.f != null) {
                    PullToRefreshAndLoadMoreListView.this.f.a();
                }
            }

            @Override // com.tsf.extend.base.widget.pulltorefresh.PullToRefreshBase.f
            public void b(PullToRefreshBase<ListView> pullToRefreshBase) {
            }
        };
        this.i = new PullToRefreshBase.c() { // from class: com.tsf.extend.base.widget.pulltorefresh.PullToRefreshAndLoadMoreListView.3
            @Override // com.tsf.extend.base.widget.pulltorefresh.PullToRefreshBase.c
            public void a() {
                if (PullToRefreshAndLoadMoreListView.this.f != null && PullToRefreshAndLoadMoreListView.this.g && PullToRefreshAndLoadMoreListView.this.e != null && PullToRefreshAndLoadMoreListView.this.e.getVisibility() == 8) {
                    PullToRefreshAndLoadMoreListView.this.e.setVisibility(0);
                    PullToRefreshAndLoadMoreListView.this.f.b();
                }
            }
        };
        o();
    }

    public void setCanLoadMore(boolean z) {
        this.g = z;
        if (!z && this.e != null) {
            this.e.setVisibility(8);
        }
    }

    public PullToRefreshAndLoadMoreListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = true;
        this.h = new PullToRefreshBase.f<ListView>() { // from class: com.tsf.extend.base.widget.pulltorefresh.PullToRefreshAndLoadMoreListView.2
            @Override // com.tsf.extend.base.widget.pulltorefresh.PullToRefreshBase.f
            public void a(PullToRefreshBase<ListView> pullToRefreshBase) {
                if (PullToRefreshAndLoadMoreListView.this.f != null) {
                    PullToRefreshAndLoadMoreListView.this.f.a();
                }
            }

            @Override // com.tsf.extend.base.widget.pulltorefresh.PullToRefreshBase.f
            public void b(PullToRefreshBase<ListView> pullToRefreshBase) {
            }
        };
        this.i = new PullToRefreshBase.c() { // from class: com.tsf.extend.base.widget.pulltorefresh.PullToRefreshAndLoadMoreListView.3
            @Override // com.tsf.extend.base.widget.pulltorefresh.PullToRefreshBase.c
            public void a() {
                if (PullToRefreshAndLoadMoreListView.this.f != null && PullToRefreshAndLoadMoreListView.this.g && PullToRefreshAndLoadMoreListView.this.e != null && PullToRefreshAndLoadMoreListView.this.e.getVisibility() == 8) {
                    PullToRefreshAndLoadMoreListView.this.e.setVisibility(0);
                    PullToRefreshAndLoadMoreListView.this.f.b();
                }
            }
        };
        o();
    }

    @Override // com.tsf.extend.base.widget.pulltorefresh.PullToRefreshAdapterViewBase
    public void setAdapter(ListAdapter listAdapter) {
        p();
        super.setAdapter(listAdapter);
    }

    private void o() {
        setOnRefreshListener(this.h);
        setOnLastItemVisibleListener(this.i);
    }

    public void setLoadMoreView(View view) {
        p();
        this.e = view;
        this.d.addView(this.e);
        this.e.setVisibility(8);
    }

    public void setOnLoadListener(a aVar) {
        this.f = aVar;
    }

    public void b(boolean z) {
        c(z);
    }

    private void p() {
        if (this.d == null) {
            this.d = new FrameLayout(getContext());
            ((ListView) this.b).addFooterView(this.d);
        }
    }

    private void c(boolean z) {
        if (this.e != null && this.e.getVisibility() != 8) {
            if (z) {
                Rect rect = new Rect();
                ((ListView) this.b).getGlobalVisibleRect(rect);
                Rect rect2 = new Rect();
                this.e.getGlobalVisibleRect(rect2);
                if (rect2.top > 0 && rect2.top < rect.bottom) {
                    ((ListView) this.b).smoothScrollBy(rect2.top - rect.bottom, 300);
                }
            }
            z.a(0, new Runnable() { // from class: com.tsf.extend.base.widget.pulltorefresh.PullToRefreshAndLoadMoreListView.1
                @Override // java.lang.Runnable
                public void run() {
                    PullToRefreshAndLoadMoreListView.this.e.setVisibility(8);
                }
            }, 350L);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        n();
    }
}
