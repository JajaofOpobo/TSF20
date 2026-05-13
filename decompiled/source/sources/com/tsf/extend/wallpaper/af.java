package com.tsf.extend.wallpaper;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
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
import com.tsf.extend.wallpaper.ad;
import com.tsf.extend.wallpaper.t;
import java.util.List;
import org.json.JSONObject;
@SuppressLint({"InflateParams"})
/* loaded from: classes.dex */
public class af extends FrameLayout implements DialogInterface.OnClickListener, View.OnClickListener, AbsListView.OnScrollListener, p, t.a {
    private static final FrameLayout.LayoutParams j = new FrameLayout.LayoutParams(-1, -1);
    private com.tsf.extend.e A;
    private final String B;
    private final String C;
    private final int D;
    private final String E;
    private final String F;
    private a G;
    protected PullToRefreshAndLoadMoreListView a;
    protected t b;
    protected View c;
    protected List<m> d;
    protected List<t.d> e;
    protected int f;
    ai g;
    protected long h;
    private PageActivity i;
    private long k;
    private boolean l;
    private int m;
    private int n;
    private int o;
    private ad.a p;
    private View q;
    private TextView r;
    private ProgressBar s;
    private boolean t;
    private b u;
    private b v;
    private int w;
    private q x;
    private boolean y;
    private PersonalizationActivity.i z;

    /* loaded from: classes.dex */
    private enum a {
        INSTALL,
        UPDATE
    }

    public af(Context context, ai aiVar, PageActivity pageActivity, PersonalizationActivity.i iVar) {
        this(context, aiVar, pageActivity, -1L, false);
        this.z = iVar;
    }

    public af(Context context, ai aiVar, PageActivity pageActivity, long j2, boolean z) {
        super(context);
        this.c = null;
        this.k = 0L;
        this.l = true;
        this.f = 0;
        this.m = 0;
        this.g = ai.LiveWallpaperTabType;
        this.t = false;
        this.h = -1L;
        this.y = false;
        this.z = null;
        this.B = "com.roidapp.photogrid";
        this.C = "com.roidapp.photogrid.MainPage";
        this.D = 219;
        this.E = "4.892";
        this.F = "market://details?id=com.roidapp.photogrid&referrer=utm_source%3DCMLauncher%26utm_medium%3D400001";
        if (aiVar == ai.CategoryType) {
            this.h = j2;
        }
        this.g = aiVar;
        this.i = pageActivity;
        this.d = Lists.newArrayList();
        this.e = Lists.newArrayList();
        this.a = (PullToRefreshAndLoadMoreListView) LayoutInflater.from(getContext()).inflate(f.C0052f.wallpaper_list, (ViewGroup) null);
        this.a.setHeaderResizeEnabled(true);
        addView(this.a, j);
        this.c = LayoutInflater.from(getContext()).inflate(f.C0052f.retry_item, (ViewGroup) null);
        ((TextView) this.c.findViewById(f.e.retry_text)).setTextColor(getResources().getColorStateList(f.d.wallpaper_list_retry_text_color));
        this.c.setOnClickListener(this);
        this.q = LayoutInflater.from(getContext()).inflate(f.C0052f.wallpaper_loadmore, (ViewGroup) null);
        this.s = (ProgressBar) this.q.findViewById(f.e.loadmore_progress);
        this.s.setIndeterminateDrawable(new com.tsf.extend.base.widget.pulltorefresh.d(getContext(), 3, 1));
        this.r = (TextView) this.q.findViewById(f.e.loadmore_tips);
        this.r.setOnClickListener(this);
        this.a.setLoadMoreView(this.q);
        this.a.setCanLoadMore(true);
        this.b = new t(context, this.g);
        this.b.a((View.OnClickListener) this);
        this.b.a((t.a) this);
        this.a.setAdapter(this.b);
        getResources().getDisplayMetrics();
        this.f = this.b.b();
        this.m = this.b.c();
        this.p = this.b.a();
        this.a.setDivider(this.p);
        this.a.setOnLoadListener(new PullToRefreshAndLoadMoreListView.a() { // from class: com.tsf.extend.wallpaper.af.1
            @Override // com.tsf.extend.base.widget.pulltorefresh.PullToRefreshAndLoadMoreListView.a
            public void a() {
                af.this.k = System.currentTimeMillis();
                if (af.this.l) {
                    if (af.this.u == null) {
                        af.this.u = new b(a.b.LoadCache);
                        z.h().a(af.this.u, a.b.LoadCache, -1L, af.this.g.a(), af.this.h, z.h);
                        return;
                    }
                    return;
                }
                af.this.a();
            }

            @Override // com.tsf.extend.base.widget.pulltorefresh.PullToRefreshAndLoadMoreListView.a
            public void b() {
                if (!af.this.t) {
                    af.this.e();
                } else {
                    af.this.b();
                }
            }
        });
        this.a.setOnScrollListener(this);
        com.tsf.extend.base.b.a a2 = z.h().a(this.g.a(), z.h);
        if (a2 != null && a2.a() != null) {
            this.l = false;
            this.t = !a2.b();
            a(a2.a(), false);
            return;
        }
        this.a.k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        this.u = new b(a.b.Refresh);
        z.h().a(this.u, a.b.Refresh, -1L, this.g.a(), this.h, z.h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        this.s.setVisibility(8);
        this.r.setVisibility(0);
        this.r.setClickable(false);
        this.r.setText(f.g.load_more_no);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.s.setVisibility(8);
        this.r.setVisibility(0);
        this.r.setClickable(true);
        this.r.setText(f.g.load_more_fail);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        this.s.setVisibility(0);
        this.r.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (this.d != null && this.d.size() > 0) {
            this.v = new b(a.b.LoadMore);
            m mVar = this.d.get(this.d.size() - 1);
            this.w++;
            z.h().a(this.v, a.b.LoadMore, mVar.f(), this.g.a(), mVar.g(), this.h, z.h, this.w);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == f.e.retry) {
            this.c.setVisibility(8);
            this.a.setMode(PullToRefreshBase.b.PULL_FROM_START);
            this.a.k();
        } else if (id == f.e.loadmore_tips) {
            this.s.setVisibility(0);
            this.r.setVisibility(8);
            e();
        } else {
            a(view);
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
        long j2;
        long currentTimeMillis = System.currentTimeMillis() - this.k;
        if (currentTimeMillis > 200) {
            j2 = 0;
        } else {
            j2 = 200 - currentTimeMillis;
        }
        com.tsf.extend.base.j.z.a(0, new Runnable() { // from class: com.tsf.extend.wallpaper.af.2
            @Override // java.lang.Runnable
            public void run() {
                if (af.this.a != null) {
                    af.this.a.j();
                }
            }
        }, j2);
        com.tsf.extend.base.j.z.a(0, new Runnable() { // from class: com.tsf.extend.wallpaper.af.3
            @Override // java.lang.Runnable
            public void run() {
                af.this.a(list, false);
            }
        }, j2 + 150);
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
            if (i2 < this.n || i2 >= this.n + this.o) {
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
        this.y = true;
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
        this.x = qVar;
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
            af.this.t = !aVar.b();
            if (this.b == a.b.LoadMore) {
                if (af.this.t) {
                    af.this.b();
                } else if (af.this.a != null) {
                    af.this.a.b(false);
                }
                af.this.w = aVar.f();
                af.this.b(aVar.a());
                return;
            }
            af.this.w = aVar.f();
            if (af.this.a != null) {
                af.this.a.b(false);
            }
            com.tsf.extend.base.j.z.a(0, new Runnable() { // from class: com.tsf.extend.wallpaper.af.b.1
                @Override // java.lang.Runnable
                public void run() {
                    af.this.d();
                }
            });
            if (af.this.l) {
            }
            af.this.l = false;
            af.this.a(aVar.a());
        }

        @Override // com.tsf.extend.base.d.a.InterfaceC0048a
        public void a(JSONObject jSONObject, int i, com.tsf.extend.base.b.a aVar) {
            if (this.b == a.b.LoadMore) {
                af.this.c();
                return;
            }
            String str = af.this.l ? "2" : "1";
            af.this.l = false;
            af.this.a(str);
            if (aVar == null && af.this.a != null) {
                af.this.a.setMode(PullToRefreshBase.b.DISABLED);
            }
            af.this.a(aVar == null ? null : aVar.a());
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i) {
        if (this.z != null) {
            this.z.a(absListView, i);
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        View childAt;
        this.n = i;
        this.o = i2;
        if (this.x != null && (childAt = absListView.getChildAt(1)) != null) {
            int top = i == 0 ? childAt.getTop() : 0;
            if (top >= 0 && !this.y) {
                this.x.a(this, top);
            }
            this.y = false;
        }
    }

    @Override // com.tsf.extend.wallpaper.t.a
    public void a(t.c cVar, View view) {
    }

    @Override // com.tsf.extend.wallpaper.t.a
    public void a(t.c cVar, t.d dVar, int i) {
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.A.dismiss();
        if (this.G != a.INSTALL && this.G == a.UPDATE) {
        }
        if (i != -2) {
            com.tsf.extend.theme.x.a(this.i, "market://details?id=com.roidapp.photogrid&referrer=utm_source%3DCMLauncher%26utm_medium%3D400001", "tsf_theme_center_wallpaper");
        }
    }
}
