package com.tsf.extend.wallpaper;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.collect.Lists;
import com.tsf.extend.base.actstru.model.activi.PageActivity;
import com.tsf.extend.base.d.a;
import com.tsf.extend.base.widget.pulltorefresh.PullToRefreshAndLoadMoreListView;
import com.tsf.extend.base.widget.pulltorefresh.PullToRefreshBase;
import com.tsf.extend.f;
import com.tsf.extend.wallpaper.PersonalizationActivity;
import com.tsf.extend.wallpaper.t;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
@SuppressLint({"InflateParams"})
/* loaded from: classes.dex */
public class ad extends FrameLayout implements View.OnClickListener, AbsListView.OnScrollListener, p, t.a {
    private static final FrameLayout.LayoutParams k = new FrameLayout.LayoutParams(-1, -1);
    private PersonalizationActivity.i A;
    private boolean B;
    protected PullToRefreshAndLoadMoreListView a;
    protected t b;
    protected View c;
    protected List<m> d;
    protected List<t.d> e;
    protected int f;
    ai g;
    protected boolean h;
    protected long i;
    private PageActivity j;
    private long l;
    private boolean m;
    private int n;
    private int o;
    private int p;
    private a q;
    private View r;
    private TextView s;
    private ProgressBar t;
    private boolean u;
    private b v;
    private b w;
    private int x;
    private q y;
    private boolean z;

    public ad(Context context, ai aiVar, PageActivity pageActivity, PersonalizationActivity.i iVar) {
        this(context, aiVar, pageActivity, -1L, false);
        this.A = iVar;
    }

    public ad(PageActivity pageActivity, long j) {
        this(pageActivity.getApplicationContext(), ai.CategoryType, pageActivity, j, true);
    }

    public ad(Context context, ai aiVar, PageActivity pageActivity, long j, boolean z) {
        super(context);
        this.c = null;
        this.l = 0L;
        this.m = true;
        this.f = 0;
        this.n = 0;
        this.u = false;
        this.h = false;
        this.i = -1L;
        this.z = false;
        this.A = null;
        this.B = false;
        if (aiVar == ai.CategoryType) {
            this.h = true;
            this.i = j;
        }
        this.g = aiVar;
        this.j = pageActivity;
        this.d = Lists.newArrayList();
        this.e = Lists.newArrayList();
        if (z) {
            this.a = (PullToRefreshAndLoadMoreListView) LayoutInflater.from(getContext()).inflate(f.C0052f.wallpaper_list_noheader, (ViewGroup) null);
        } else {
            this.a = (PullToRefreshAndLoadMoreListView) LayoutInflater.from(getContext()).inflate(f.C0052f.wallpaper_list, (ViewGroup) null);
        }
        this.a.setHeaderResizeEnabled(true);
        addView(this.a, k);
        this.c = LayoutInflater.from(getContext()).inflate(f.C0052f.retry_item, (ViewGroup) null);
        ((TextView) this.c.findViewById(f.e.retry_text)).setTextColor(getResources().getColorStateList(f.d.wallpaper_list_retry_text_color));
        this.c.setOnClickListener(this);
        this.r = LayoutInflater.from(getContext()).inflate(f.C0052f.wallpaper_loadmore, (ViewGroup) null);
        this.t = (ProgressBar) this.r.findViewById(f.e.loadmore_progress);
        this.t.setIndeterminateDrawable(new com.tsf.extend.base.widget.pulltorefresh.d(getContext(), 3, 1));
        this.s = (TextView) this.r.findViewById(f.e.loadmore_tips);
        this.s.setOnClickListener(this);
        this.a.setLoadMoreView(this.r);
        this.a.setCanLoadMore(true);
        this.b = new t(context, this.g);
        this.b.a((View.OnClickListener) this);
        this.b.a((t.a) this);
        this.a.setAdapter(this.b);
        getResources().getDisplayMetrics();
        this.f = this.b.b();
        this.n = this.b.c();
        this.q = this.b.a();
        this.a.setDivider(this.q);
        this.a.setOnLoadListener(new PullToRefreshAndLoadMoreListView.a() { // from class: com.tsf.extend.wallpaper.ad.1
            @Override // com.tsf.extend.base.widget.pulltorefresh.PullToRefreshAndLoadMoreListView.a
            public void a() {
                ad.this.l = System.currentTimeMillis();
                if (ad.this.m) {
                    if (ad.this.v == null) {
                        ad.this.v = new b(a.b.LoadCache);
                        z.h().a(ad.this.v, a.b.LoadCache, -1L, ad.this.g.a(), ad.this.i, ad.this.h ? z.c : z.b);
                        return;
                    }
                    return;
                }
                ad.this.a();
            }

            @Override // com.tsf.extend.base.widget.pulltorefresh.PullToRefreshAndLoadMoreListView.a
            public void b() {
                if (!ad.this.u) {
                    ad.this.f();
                } else {
                    ad.this.c();
                }
            }
        });
        this.a.setOnScrollListener(this);
        com.tsf.extend.base.b.a a2 = z.h().a(this.h ? this.i : this.g.a(), this.h ? z.c : z.b);
        if (a2 != null && a2.a() != null) {
            this.m = false;
            this.u = !a2.b();
            a(a2.a(), false);
            return;
        }
        this.a.k();
    }

    public void a() {
        this.v = new b(a.b.Refresh);
        z.h().a(this.v, a.b.Refresh, -1L, this.g.a(), this.i, this.h ? z.c : z.b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.t.setVisibility(8);
        this.s.setVisibility(0);
        this.s.setClickable(false);
        this.s.setText(f.g.load_more_no);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        this.t.setVisibility(8);
        this.s.setVisibility(0);
        this.s.setClickable(true);
        this.s.setText(f.g.load_more_fail);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        this.t.setVisibility(0);
        this.s.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        if (this.d != null && this.d.size() > 0) {
            this.w = new b(a.b.LoadMore);
            m mVar = this.d.get(this.d.size() - 1);
            this.x++;
            z.h().a(this.w, a.b.LoadMore, mVar.f(), this.g.a(), mVar.g(), this.i, this.h ? z.c : z.b, this.x);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        m mVar;
        int id = view.getId();
        if (id == f.e.retry) {
            this.c.setVisibility(8);
            this.a.setMode(PullToRefreshBase.b.PULL_FROM_START);
            this.a.k();
        } else if (id == f.e.loadmore_tips) {
            this.t.setVisibility(0);
            this.s.setVisibility(8);
            f();
        } else if (!a(view)) {
            if (this.B && (this.j instanceof WallpaperOnLineActivity)) {
                if ((view.getTag() instanceof s) && (mVar = (m) view.getTag()) != null) {
                    ((WallpaperOnLineActivity) this.j).a(mVar.j(), mVar);
                    return;
                }
                return;
            }
            b(view);
        }
    }

    private void b(View view) {
        WallpaperDetail wallpaperDetail = (WallpaperDetail) LayoutInflater.from(view.getContext()).inflate(f.C0052f.wallpaper_detail, (ViewGroup) null);
        wallpaperDetail.setType(this.g);
        if (view.getTag() instanceof s) {
            m mVar = (m) view.getTag();
            ArrayList newArrayList = Lists.newArrayList();
            newArrayList.addAll(this.d);
            if (this.g != ai.HotType) {
                aj.a(newArrayList);
            }
            com.tsf.extend.base.d a2 = com.tsf.extend.h.a();
            if (a2 != null) {
                a2.a(mVar.h() + "");
            }
            wallpaperDetail.a((List<? extends s>) newArrayList, (s) mVar, false);
            this.j.a(wallpaperDetail);
            aj.a(this.d, mVar, this.g.a() + "");
        }
    }

    protected boolean a(View view) {
        if (view.getTag() != null && (view.getTag() instanceof m)) {
            m mVar = (m) view.getTag();
            if (mVar.n()) {
                com.tsf.extend.base.d a2 = com.tsf.extend.h.a();
                if (a2 != null) {
                    a2.a(mVar.h() + "");
                }
                com.tsf.extend.theme.x.b(getContext(), mVar.m(), "&referrer=utm_source%3Dtsf_theme_center_wallpaper");
                aj.a(this.d, mVar, this.g.a() + "");
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final List<m> list) {
        long j;
        long currentTimeMillis = System.currentTimeMillis() - this.l;
        if (currentTimeMillis > 200) {
            j = 0;
        } else {
            j = 200 - currentTimeMillis;
        }
        com.tsf.extend.base.j.z.a(0, new Runnable() { // from class: com.tsf.extend.wallpaper.ad.2
            @Override // java.lang.Runnable
            public void run() {
                if (ad.this.a != null) {
                    ad.this.a.j();
                }
            }
        }, j);
        com.tsf.extend.base.j.z.a(0, new Runnable() { // from class: com.tsf.extend.wallpaper.ad.3
            @Override // java.lang.Runnable
            public void run() {
                ad.this.a(list, false);
            }
        }, j + 150);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(List<m> list) {
        if (list != null && list.size() != 0) {
            a(list, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        if (com.tsf.extend.base.j.u.a(getContext())) {
        }
    }

    void setSelectIndex(int i) {
        ListView listView;
        int i2 = (i / 2) + 1;
        if (this.a != null && (listView = this.a.getListView()) != null) {
            int count = listView.getAdapter().getCount();
            if (i2 < 0 || i2 >= count) {
                return;
            }
            if (i2 < this.o || i2 >= this.o + this.p) {
                listView.setSelection(i2);
            }
        }
    }

    protected void a(List<m> list, boolean z) {
        if (!z) {
            this.d.clear();
            if (list == null || list.size() == 0) {
                this.c.setVisibility(0);
                if (this.a != null) {
                    this.a.setEmptyView(this.c);
                    return;
                }
                return;
            }
        }
        if (this.g == ai.HotType && list != null) {
            aj.a(list);
        }
        this.d.addAll(list);
        this.b.a(this.d);
        this.b.notifyDataSetChanged();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.b = new t(getContext(), this.g);
        this.b.a((View.OnClickListener) this);
        this.b.a((t.a) this);
        if (this.g == ai.NewType) {
            this.b.b(this.e);
        } else {
            this.b.a(this.d);
        }
        if (this.a != null) {
            this.a.setAdapter(this.b);
        }
    }

    @Override // android.view.View
    public void setScrollY(int i) {
        this.z = true;
        if (this.a != null) {
            int i2 = 0;
            int firstVisiblePosition = this.a.getListView().getFirstVisiblePosition();
            if (i <= WallpaperPager.c + WallpaperPager.d) {
                if (firstVisiblePosition == 0) {
                    View childAt = this.a.getListView().getChildAt(1);
                    if (childAt != null) {
                        i2 = childAt.getTop();
                    }
                    if (i2 > WallpaperPager.c + WallpaperPager.d) {
                        this.a.getListView().setSelectionFromTop(1, WallpaperPager.c + WallpaperPager.d);
                        return;
                    }
                    return;
                }
                return;
            }
            View childAt2 = this.a.getListView().getChildAt(1);
            if (childAt2 != null) {
                i2 = childAt2.getTop();
            }
            if (i2 != i || Build.VERSION.SDK_INT >= 19) {
                this.a.getListView().setSelectionFromTop(1, i);
            }
        }
    }

    @Override // com.tsf.extend.wallpaper.p
    public void setScrollListener(q qVar) {
        this.y = qVar;
    }

    @Override // com.tsf.extend.wallpaper.p
    public void setHeadViewHeight(int i) {
        if (this.a != null) {
            FrameLayout headerFrame = this.a.getHeaderFrame();
            AbsListView.LayoutParams layoutParams = (AbsListView.LayoutParams) headerFrame.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new AbsListView.LayoutParams(-1, i);
            } else {
                layoutParams.height = i;
            }
            headerFrame.setLayoutParams(layoutParams);
        }
    }

    /* loaded from: classes.dex */
    public static class a extends ColorDrawable {
        int a;
        int b;

        public a(int i, int i2) {
            this.b = i;
            this.a = i;
        }

        @Override // android.graphics.drawable.Drawable
        public int getIntrinsicWidth() {
            return this.a;
        }

        @Override // android.graphics.drawable.Drawable
        public int getIntrinsicHeight() {
            return this.b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b implements a.InterfaceC0048a<com.tsf.extend.base.b.a> {
        private a.b b;

        public b(a.b bVar) {
            this.b = bVar;
        }

        @Override // com.tsf.extend.base.d.a.InterfaceC0048a
        public void a(JSONObject jSONObject, com.tsf.extend.base.b.a aVar) {
            if (aVar == null) {
                a(jSONObject, 0, (com.tsf.extend.base.b.a) null);
                return;
            }
            ad.this.u = !aVar.b();
            if (this.b == a.b.LoadMore) {
                if (ad.this.u) {
                    ad.this.c();
                } else if (ad.this.a != null) {
                    ad.this.a.b(false);
                }
                ad.this.x = aVar.f();
                ad.this.b(aVar.a());
                return;
            }
            ad.this.x = aVar.f();
            if (ad.this.a != null) {
                ad.this.a.b(false);
            }
            com.tsf.extend.base.j.z.a(0, new Runnable() { // from class: com.tsf.extend.wallpaper.ad.b.1
                @Override // java.lang.Runnable
                public void run() {
                    ad.this.e();
                }
            });
            if (ad.this.m) {
            }
            ad.this.m = false;
            ad.this.a(aVar.a());
        }

        @Override // com.tsf.extend.base.d.a.InterfaceC0048a
        public void a(JSONObject jSONObject, int i, com.tsf.extend.base.b.a aVar) {
            if (this.b == a.b.LoadMore) {
                ad.this.d();
                return;
            }
            String str = ad.this.m ? "2" : "1";
            ad.this.m = false;
            ad.this.a(str);
            if (aVar == null && ad.this.a != null) {
                ad.this.a.setMode(PullToRefreshBase.b.DISABLED);
            }
            ad.this.a(aVar == null ? null : aVar.a());
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i) {
        if (this.A != null) {
            this.A.a(absListView, i);
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        View childAt;
        this.o = i;
        this.p = i2;
        if (this.y != null && (childAt = absListView.getChildAt(1)) != null) {
            int top = i == 0 ? childAt.getTop() : 0;
            if (top >= 0 && !this.z) {
                this.y.a(this, top);
            }
            this.z = false;
        }
    }

    @Override // com.tsf.extend.wallpaper.t.a
    public void a(t.c cVar, View view) {
    }

    @Override // com.tsf.extend.wallpaper.t.a
    public void a(t.c cVar, t.d dVar, int i) {
    }

    public void setChooseWallpaperOnLine(boolean z) {
        this.B = z;
    }

    public void b() {
        if (this.b != null) {
            this.b.b(null);
            this.b.notifyDataSetChanged();
        }
        if (this.d != null) {
            this.d.clear();
        }
        if (this.a != null) {
            this.a.removeAllViews();
            this.a = null;
        }
        if (this.b != null) {
            this.b.d();
        }
    }
}
