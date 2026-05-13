package com.tsf.extend.base.widget.pulltorefresh;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.tsf.extend.base.p080j.C1455z;
import com.tsf.extend.base.widget.pulltorefresh.PullToRefreshBase;
/* loaded from: classes.dex */
public class PullToRefreshAndLoadMoreListView extends PullToRefreshListView {

    /* renamed from: d */
    private FrameLayout f4657d;

    /* renamed from: e */
    private View f4658e;

    /* renamed from: f */
    private InterfaceC1486a f4659f;

    /* renamed from: g */
    private boolean f4660g;

    /* renamed from: h */
    private PullToRefreshBase.InterfaceC1495f<ListView> f4661h;

    /* renamed from: i */
    private PullToRefreshBase.InterfaceC1492c f4662i;

    /* renamed from: com.tsf.extend.base.widget.pulltorefresh.PullToRefreshAndLoadMoreListView$a */
    /* loaded from: classes.dex */
    public interface InterfaceC1486a {
        /* renamed from: a */
        void mo6254a();

        /* renamed from: b */
        void mo6253b();
    }

    public PullToRefreshAndLoadMoreListView(Context context) {
        super(context);
        this.f4657d = null;
        this.f4658e = null;
        this.f4659f = null;
        this.f4660g = true;
        this.f4661h = new PullToRefreshBase.InterfaceC1495f<ListView>() { // from class: com.tsf.extend.base.widget.pulltorefresh.PullToRefreshAndLoadMoreListView.2
            @Override // com.tsf.extend.base.widget.pulltorefresh.PullToRefreshBase.InterfaceC1495f
            /* renamed from: a */
            public void mo8382a(PullToRefreshBase<ListView> pullToRefreshBase) {
                if (PullToRefreshAndLoadMoreListView.this.f4659f != null) {
                    PullToRefreshAndLoadMoreListView.this.f4659f.mo6254a();
                }
            }

            @Override // com.tsf.extend.base.widget.pulltorefresh.PullToRefreshBase.InterfaceC1495f
            /* renamed from: b */
            public void mo8381b(PullToRefreshBase<ListView> pullToRefreshBase) {
            }
        };
        this.f4662i = new PullToRefreshBase.InterfaceC1492c() { // from class: com.tsf.extend.base.widget.pulltorefresh.PullToRefreshAndLoadMoreListView.3
            @Override // com.tsf.extend.base.widget.pulltorefresh.PullToRefreshBase.InterfaceC1492c
            /* renamed from: a */
            public void mo8385a() {
                if (PullToRefreshAndLoadMoreListView.this.f4659f != null && PullToRefreshAndLoadMoreListView.this.f4660g && PullToRefreshAndLoadMoreListView.this.f4658e != null && PullToRefreshAndLoadMoreListView.this.f4658e.getVisibility() == 8) {
                    PullToRefreshAndLoadMoreListView.this.f4658e.setVisibility(0);
                    PullToRefreshAndLoadMoreListView.this.f4659f.mo6253b();
                }
            }
        };
        m8427o();
    }

    public void setCanLoadMore(boolean z) {
        this.f4660g = z;
        if (!z && this.f4658e != null) {
            this.f4658e.setVisibility(8);
        }
    }

    public PullToRefreshAndLoadMoreListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4657d = null;
        this.f4658e = null;
        this.f4659f = null;
        this.f4660g = true;
        this.f4661h = new PullToRefreshBase.InterfaceC1495f<ListView>() { // from class: com.tsf.extend.base.widget.pulltorefresh.PullToRefreshAndLoadMoreListView.2
            @Override // com.tsf.extend.base.widget.pulltorefresh.PullToRefreshBase.InterfaceC1495f
            /* renamed from: a */
            public void mo8382a(PullToRefreshBase<ListView> pullToRefreshBase) {
                if (PullToRefreshAndLoadMoreListView.this.f4659f != null) {
                    PullToRefreshAndLoadMoreListView.this.f4659f.mo6254a();
                }
            }

            @Override // com.tsf.extend.base.widget.pulltorefresh.PullToRefreshBase.InterfaceC1495f
            /* renamed from: b */
            public void mo8381b(PullToRefreshBase<ListView> pullToRefreshBase) {
            }
        };
        this.f4662i = new PullToRefreshBase.InterfaceC1492c() { // from class: com.tsf.extend.base.widget.pulltorefresh.PullToRefreshAndLoadMoreListView.3
            @Override // com.tsf.extend.base.widget.pulltorefresh.PullToRefreshBase.InterfaceC1492c
            /* renamed from: a */
            public void mo8385a() {
                if (PullToRefreshAndLoadMoreListView.this.f4659f != null && PullToRefreshAndLoadMoreListView.this.f4660g && PullToRefreshAndLoadMoreListView.this.f4658e != null && PullToRefreshAndLoadMoreListView.this.f4658e.getVisibility() == 8) {
                    PullToRefreshAndLoadMoreListView.this.f4658e.setVisibility(0);
                    PullToRefreshAndLoadMoreListView.this.f4659f.mo6253b();
                }
            }
        };
        m8427o();
    }

    @Override // com.tsf.extend.base.widget.pulltorefresh.PullToRefreshAdapterViewBase
    public void setAdapter(ListAdapter listAdapter) {
        m8426p();
        super.setAdapter(listAdapter);
    }

    /* renamed from: o */
    private void m8427o() {
        setOnRefreshListener(this.f4661h);
        setOnLastItemVisibleListener(this.f4662i);
    }

    public void setLoadMoreView(View view) {
        m8426p();
        this.f4658e = view;
        this.f4657d.addView(this.f4658e);
        this.f4658e.setVisibility(8);
    }

    public void setOnLoadListener(InterfaceC1486a interfaceC1486a) {
        this.f4659f = interfaceC1486a;
    }

    /* renamed from: b */
    public void m8430b(boolean z) {
        m8428c(z);
    }

    /* renamed from: p */
    private void m8426p() {
        if (this.f4657d == null) {
            this.f4657d = new FrameLayout(getContext());
            ((ListView) this.f4667b).addFooterView(this.f4657d);
        }
    }

    /* renamed from: c */
    private void m8428c(boolean z) {
        if (this.f4658e != null && this.f4658e.getVisibility() != 8) {
            if (z) {
                Rect rect = new Rect();
                ((ListView) this.f4667b).getGlobalVisibleRect(rect);
                Rect rect2 = new Rect();
                this.f4658e.getGlobalVisibleRect(rect2);
                if (rect2.top > 0 && rect2.top < rect.bottom) {
                    ((ListView) this.f4667b).smoothScrollBy(rect2.top - rect.bottom, 300);
                }
            }
            C1455z.m8563a(0, new Runnable() { // from class: com.tsf.extend.base.widget.pulltorefresh.PullToRefreshAndLoadMoreListView.1
                @Override // java.lang.Runnable
                public void run() {
                    PullToRefreshAndLoadMoreListView.this.f4658e.setVisibility(8);
                }
            }, 350L);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m8398n();
    }
}
