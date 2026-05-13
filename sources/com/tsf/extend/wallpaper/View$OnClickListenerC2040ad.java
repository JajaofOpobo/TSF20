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
import com.tsf.extend.C1536f;
import com.tsf.extend.C1547h;
import com.tsf.extend.base.InterfaceC1385d;
import com.tsf.extend.base.actstru.model.activi.PageActivity;
import com.tsf.extend.base.p071b.C1368a;
import com.tsf.extend.base.p074d.AbstractC1386a;
import com.tsf.extend.base.p080j.C1449u;
import com.tsf.extend.base.p080j.C1455z;
import com.tsf.extend.base.widget.pulltorefresh.C1518d;
import com.tsf.extend.base.widget.pulltorefresh.PullToRefreshAndLoadMoreListView;
import com.tsf.extend.base.widget.pulltorefresh.PullToRefreshBase;
import com.tsf.extend.theme.C1920x;
import com.tsf.extend.wallpaper.PersonalizationActivity;
import com.tsf.extend.wallpaper.View$OnClickListenerC2107t;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
@SuppressLint({"InflateParams"})
/* renamed from: com.tsf.extend.wallpaper.ad */
/* loaded from: classes.dex */
public class View$OnClickListenerC2040ad extends FrameLayout implements View.OnClickListener, AbsListView.OnScrollListener, InterfaceC2099p, View$OnClickListenerC2107t.InterfaceC2109a {

    /* renamed from: k */
    private static final FrameLayout.LayoutParams f6621k = new FrameLayout.LayoutParams(-1, -1);

    /* renamed from: A */
    private PersonalizationActivity.InterfaceC1949i f6622A;

    /* renamed from: B */
    private boolean f6623B;

    /* renamed from: a */
    protected PullToRefreshAndLoadMoreListView f6624a;

    /* renamed from: b */
    protected View$OnClickListenerC2107t f6625b;

    /* renamed from: c */
    protected View f6626c;

    /* renamed from: d */
    protected List<C2094m> f6627d;

    /* renamed from: e */
    protected List<View$OnClickListenerC2107t.C2112d> f6628e;

    /* renamed from: f */
    protected int f6629f;

    /* renamed from: g */
    EnumC2057ai f6630g;

    /* renamed from: h */
    protected boolean f6631h;

    /* renamed from: i */
    protected long f6632i;

    /* renamed from: j */
    private PageActivity f6633j;

    /* renamed from: l */
    private long f6634l;

    /* renamed from: m */
    private boolean f6635m;

    /* renamed from: n */
    private int f6636n;

    /* renamed from: o */
    private int f6637o;

    /* renamed from: p */
    private int f6638p;

    /* renamed from: q */
    private C2044a f6639q;

    /* renamed from: r */
    private View f6640r;

    /* renamed from: s */
    private TextView f6641s;

    /* renamed from: t */
    private ProgressBar f6642t;

    /* renamed from: u */
    private boolean f6643u;

    /* renamed from: v */
    private C2045b f6644v;

    /* renamed from: w */
    private C2045b f6645w;

    /* renamed from: x */
    private int f6646x;

    /* renamed from: y */
    private InterfaceC2100q f6647y;

    /* renamed from: z */
    private boolean f6648z;

    public View$OnClickListenerC2040ad(Context context, EnumC2057ai enumC2057ai, PageActivity pageActivity, PersonalizationActivity.InterfaceC1949i interfaceC1949i) {
        this(context, enumC2057ai, pageActivity, -1L, false);
        this.f6622A = interfaceC1949i;
    }

    public View$OnClickListenerC2040ad(PageActivity pageActivity, long j) {
        this(pageActivity.getApplicationContext(), EnumC2057ai.CategoryType, pageActivity, j, true);
    }

    public View$OnClickListenerC2040ad(Context context, EnumC2057ai enumC2057ai, PageActivity pageActivity, long j, boolean z) {
        super(context);
        this.f6626c = null;
        this.f6634l = 0L;
        this.f6635m = true;
        this.f6629f = 0;
        this.f6636n = 0;
        this.f6643u = false;
        this.f6631h = false;
        this.f6632i = -1L;
        this.f6648z = false;
        this.f6622A = null;
        this.f6623B = false;
        if (enumC2057ai == EnumC2057ai.CategoryType) {
            this.f6631h = true;
            this.f6632i = j;
        }
        this.f6630g = enumC2057ai;
        this.f6633j = pageActivity;
        this.f6627d = Lists.newArrayList();
        this.f6628e = Lists.newArrayList();
        if (z) {
            this.f6624a = (PullToRefreshAndLoadMoreListView) LayoutInflater.from(getContext()).inflate(C1536f.C1542f.wallpaper_list_noheader, (ViewGroup) null);
        } else {
            this.f6624a = (PullToRefreshAndLoadMoreListView) LayoutInflater.from(getContext()).inflate(C1536f.C1542f.wallpaper_list, (ViewGroup) null);
        }
        this.f6624a.setHeaderResizeEnabled(true);
        addView(this.f6624a, f6621k);
        this.f6626c = LayoutInflater.from(getContext()).inflate(C1536f.C1542f.retry_item, (ViewGroup) null);
        ((TextView) this.f6626c.findViewById(C1536f.C1541e.retry_text)).setTextColor(getResources().getColorStateList(C1536f.C1540d.wallpaper_list_retry_text_color));
        this.f6626c.setOnClickListener(this);
        this.f6640r = LayoutInflater.from(getContext()).inflate(C1536f.C1542f.wallpaper_loadmore, (ViewGroup) null);
        this.f6642t = (ProgressBar) this.f6640r.findViewById(C1536f.C1541e.loadmore_progress);
        this.f6642t.setIndeterminateDrawable(new C1518d(getContext(), 3, 1));
        this.f6641s = (TextView) this.f6640r.findViewById(C1536f.C1541e.loadmore_tips);
        this.f6641s.setOnClickListener(this);
        this.f6624a.setLoadMoreView(this.f6640r);
        this.f6624a.setCanLoadMore(true);
        this.f6625b = new View$OnClickListenerC2107t(context, this.f6630g);
        this.f6625b.m6399a((View.OnClickListener) this);
        this.f6625b.m6396a((View$OnClickListenerC2107t.InterfaceC2109a) this);
        this.f6624a.setAdapter(this.f6625b);
        getResources().getDisplayMetrics();
        this.f6629f = this.f6625b.m6393b();
        this.f6636n = this.f6625b.m6391c();
        this.f6639q = this.f6625b.m6401a();
        this.f6624a.setDivider(this.f6639q);
        this.f6624a.setOnLoadListener(new PullToRefreshAndLoadMoreListView.InterfaceC1486a() { // from class: com.tsf.extend.wallpaper.ad.1
            @Override // com.tsf.extend.base.widget.pulltorefresh.PullToRefreshAndLoadMoreListView.InterfaceC1486a
            /* renamed from: a */
            public void mo6254a() {
                View$OnClickListenerC2040ad.this.f6634l = System.currentTimeMillis();
                if (View$OnClickListenerC2040ad.this.f6635m) {
                    if (View$OnClickListenerC2040ad.this.f6644v == null) {
                        View$OnClickListenerC2040ad.this.f6644v = new C2045b(AbstractC1386a.EnumC1397b.LoadCache);
                        C2148z.m6199h().m6214a(View$OnClickListenerC2040ad.this.f6644v, AbstractC1386a.EnumC1397b.LoadCache, -1L, View$OnClickListenerC2040ad.this.f6630g.m6559a(), View$OnClickListenerC2040ad.this.f6632i, View$OnClickListenerC2040ad.this.f6631h ? C2148z.f7086c : C2148z.f7085b);
                        return;
                    }
                    return;
                }
                View$OnClickListenerC2040ad.this.m6641a();
            }

            @Override // com.tsf.extend.base.widget.pulltorefresh.PullToRefreshAndLoadMoreListView.InterfaceC1486a
            /* renamed from: b */
            public void mo6253b() {
                if (!View$OnClickListenerC2040ad.this.f6643u) {
                    View$OnClickListenerC2040ad.this.m6618f();
                } else {
                    View$OnClickListenerC2040ad.this.m6624c();
                }
            }
        });
        this.f6624a.setOnScrollListener(this);
        C1368a m6219a = C2148z.m6199h().m6219a(this.f6631h ? this.f6632i : this.f6630g.m6559a(), this.f6631h ? C2148z.f7086c : C2148z.f7085b);
        if (m6219a != null && m6219a.m8875a() != null) {
            this.f6635m = false;
            this.f6643u = !m6219a.m8868b();
            mo6608a(m6219a.m8875a(), false);
            return;
        }
        this.f6624a.m8401k();
    }

    /* renamed from: a */
    public void m6641a() {
        this.f6644v = new C2045b(AbstractC1386a.EnumC1397b.Refresh);
        C2148z.m6199h().m6214a(this.f6644v, AbstractC1386a.EnumC1397b.Refresh, -1L, this.f6630g.m6559a(), this.f6632i, this.f6631h ? C2148z.f7086c : C2148z.f7085b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m6624c() {
        this.f6642t.setVisibility(8);
        this.f6641s.setVisibility(0);
        this.f6641s.setClickable(false);
        this.f6641s.setText(C1536f.C1543g.load_more_no);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public void m6622d() {
        this.f6642t.setVisibility(8);
        this.f6641s.setVisibility(0);
        this.f6641s.setClickable(true);
        this.f6641s.setText(C1536f.C1543g.load_more_fail);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public void m6620e() {
        this.f6642t.setVisibility(0);
        this.f6641s.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public void m6618f() {
        if (this.f6627d != null && this.f6627d.size() > 0) {
            this.f6645w = new C2045b(AbstractC1386a.EnumC1397b.LoadMore);
            C2094m c2094m = this.f6627d.get(this.f6627d.size() - 1);
            this.f6646x++;
            C2148z.m6199h().m6215a(this.f6645w, AbstractC1386a.EnumC1397b.LoadMore, c2094m.m6434f(), this.f6630g.m6559a(), c2094m.m6432g(), this.f6632i, this.f6631h ? C2148z.f7086c : C2148z.f7085b, this.f6646x);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        C2094m c2094m;
        int id = view.getId();
        if (id == C1536f.C1541e.retry) {
            this.f6626c.setVisibility(8);
            this.f6624a.setMode(PullToRefreshBase.EnumC1491b.PULL_FROM_START);
            this.f6624a.m8401k();
        } else if (id == C1536f.C1541e.loadmore_tips) {
            this.f6642t.setVisibility(0);
            this.f6641s.setVisibility(8);
            m6618f();
        } else if (!m6640a(view)) {
            if (this.f6623B && (this.f6633j instanceof WallpaperOnLineActivity)) {
                if ((view.getTag() instanceof C2106s) && (c2094m = (C2094m) view.getTag()) != null) {
                    ((WallpaperOnLineActivity) this.f6633j).m6736a(c2094m.m6429j(), c2094m);
                    return;
                }
                return;
            }
            m6629b(view);
        }
    }

    /* renamed from: b */
    private void m6629b(View view) {
        WallpaperDetail wallpaperDetail = (WallpaperDetail) LayoutInflater.from(view.getContext()).inflate(C1536f.C1542f.wallpaper_detail, (ViewGroup) null);
        wallpaperDetail.setType(this.f6630g);
        if (view.getTag() instanceof C2106s) {
            C2094m c2094m = (C2094m) view.getTag();
            ArrayList newArrayList = Lists.newArrayList();
            newArrayList.addAll(this.f6627d);
            if (this.f6630g != EnumC2057ai.HotType) {
                C2058aj.m6551a(newArrayList);
            }
            InterfaceC1385d m8293a = C1547h.m8293a();
            if (m8293a != null) {
                m8293a.mo8814a(c2094m.m6431h() + "");
            }
            wallpaperDetail.m6854a((List<? extends C2106s>) newArrayList, (C2106s) c2094m, false);
            this.f6633j.m8922a(wallpaperDetail);
            C2058aj.m6550a(this.f6627d, c2094m, this.f6630g.m6559a() + "");
        }
    }

    /* renamed from: a */
    protected boolean m6640a(View view) {
        if (view.getTag() != null && (view.getTag() instanceof C2094m)) {
            C2094m c2094m = (C2094m) view.getTag();
            if (c2094m.m6425n()) {
                InterfaceC1385d m8293a = C1547h.m8293a();
                if (m8293a != null) {
                    m8293a.mo8814a(c2094m.m6431h() + "");
                }
                C1920x.m7048b(getContext(), c2094m.m6426m(), "&referrer=utm_source%3Dtsf_theme_center_wallpaper");
                C2058aj.m6550a(this.f6627d, c2094m, this.f6630g.m6559a() + "");
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m6631a(final List<C2094m> list) {
        long j;
        long currentTimeMillis = System.currentTimeMillis() - this.f6634l;
        if (currentTimeMillis > 200) {
            j = 0;
        } else {
            j = 200 - currentTimeMillis;
        }
        C1455z.m8563a(0, new Runnable() { // from class: com.tsf.extend.wallpaper.ad.2
            @Override // java.lang.Runnable
            public void run() {
                if (View$OnClickListenerC2040ad.this.f6624a != null) {
                    View$OnClickListenerC2040ad.this.f6624a.m8402j();
                }
            }
        }, j);
        C1455z.m8563a(0, new Runnable() { // from class: com.tsf.extend.wallpaper.ad.3
            @Override // java.lang.Runnable
            public void run() {
                View$OnClickListenerC2040ad.this.mo6608a(list, false);
            }
        }, j + 150);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m6625b(List<C2094m> list) {
        if (list != null && list.size() != 0) {
            mo6608a(list, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m6632a(String str) {
        if (C1449u.m8589a(getContext())) {
        }
    }

    void setSelectIndex(int i) {
        ListView listView;
        int i2 = (i / 2) + 1;
        if (this.f6624a != null && (listView = this.f6624a.getListView()) != null) {
            int count = listView.getAdapter().getCount();
            if (i2 < 0 || i2 >= count) {
                return;
            }
            if (i2 < this.f6637o || i2 >= this.f6637o + this.f6638p) {
                listView.setSelection(i2);
            }
        }
    }

    /* renamed from: a */
    protected void mo6608a(List<C2094m> list, boolean z) {
        if (!z) {
            this.f6627d.clear();
            if (list == null || list.size() == 0) {
                this.f6626c.setVisibility(0);
                if (this.f6624a != null) {
                    this.f6624a.setEmptyView(this.f6626c);
                    return;
                }
                return;
            }
        }
        if (this.f6630g == EnumC2057ai.HotType && list != null) {
            C2058aj.m6551a(list);
        }
        this.f6627d.addAll(list);
        this.f6625b.m6394a(this.f6627d);
        this.f6625b.notifyDataSetChanged();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f6625b = new View$OnClickListenerC2107t(getContext(), this.f6630g);
        this.f6625b.m6399a((View.OnClickListener) this);
        this.f6625b.m6396a((View$OnClickListenerC2107t.InterfaceC2109a) this);
        if (this.f6630g == EnumC2057ai.NewType) {
            this.f6625b.m6392b(this.f6628e);
        } else {
            this.f6625b.m6394a(this.f6627d);
        }
        if (this.f6624a != null) {
            this.f6624a.setAdapter(this.f6625b);
        }
    }

    @Override // android.view.View
    public void setScrollY(int i) {
        this.f6648z = true;
        if (this.f6624a != null) {
            int i2 = 0;
            int firstVisiblePosition = this.f6624a.getListView().getFirstVisiblePosition();
            if (i <= WallpaperPager.f6547c + WallpaperPager.f6548d) {
                if (firstVisiblePosition == 0) {
                    View childAt = this.f6624a.getListView().getChildAt(1);
                    if (childAt != null) {
                        i2 = childAt.getTop();
                    }
                    if (i2 > WallpaperPager.f6547c + WallpaperPager.f6548d) {
                        this.f6624a.getListView().setSelectionFromTop(1, WallpaperPager.f6547c + WallpaperPager.f6548d);
                        return;
                    }
                    return;
                }
                return;
            }
            View childAt2 = this.f6624a.getListView().getChildAt(1);
            if (childAt2 != null) {
                i2 = childAt2.getTop();
            }
            if (i2 != i || Build.VERSION.SDK_INT >= 19) {
                this.f6624a.getListView().setSelectionFromTop(1, i);
            }
        }
    }

    @Override // com.tsf.extend.wallpaper.InterfaceC2099p
    public void setScrollListener(InterfaceC2100q interfaceC2100q) {
        this.f6647y = interfaceC2100q;
    }

    @Override // com.tsf.extend.wallpaper.InterfaceC2099p
    public void setHeadViewHeight(int i) {
        if (this.f6624a != null) {
            FrameLayout headerFrame = this.f6624a.getHeaderFrame();
            AbsListView.LayoutParams layoutParams = (AbsListView.LayoutParams) headerFrame.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new AbsListView.LayoutParams(-1, i);
            } else {
                layoutParams.height = i;
            }
            headerFrame.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: com.tsf.extend.wallpaper.ad$a */
    /* loaded from: classes.dex */
    public static class C2044a extends ColorDrawable {

        /* renamed from: a */
        int f6653a;

        /* renamed from: b */
        int f6654b;

        public C2044a(int i, int i2) {
            this.f6654b = i;
            this.f6653a = i;
        }

        @Override // android.graphics.drawable.Drawable
        public int getIntrinsicWidth() {
            return this.f6653a;
        }

        @Override // android.graphics.drawable.Drawable
        public int getIntrinsicHeight() {
            return this.f6654b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.tsf.extend.wallpaper.ad$b */
    /* loaded from: classes.dex */
    public class C2045b implements AbstractC1386a.InterfaceC1396a<C1368a> {

        /* renamed from: b */
        private AbstractC1386a.EnumC1397b f6656b;

        public C2045b(AbstractC1386a.EnumC1397b enumC1397b) {
            this.f6656b = enumC1397b;
        }

        @Override // com.tsf.extend.base.p074d.AbstractC1386a.InterfaceC1396a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo6245a(JSONObject jSONObject, C1368a c1368a) {
            if (c1368a == null) {
                mo6247a(jSONObject, 0, (C1368a) null);
                return;
            }
            View$OnClickListenerC2040ad.this.f6643u = !c1368a.m8868b();
            if (this.f6656b == AbstractC1386a.EnumC1397b.LoadMore) {
                if (View$OnClickListenerC2040ad.this.f6643u) {
                    View$OnClickListenerC2040ad.this.m6624c();
                } else if (View$OnClickListenerC2040ad.this.f6624a != null) {
                    View$OnClickListenerC2040ad.this.f6624a.m8430b(false);
                }
                View$OnClickListenerC2040ad.this.f6646x = c1368a.m8859f();
                View$OnClickListenerC2040ad.this.m6625b(c1368a.m8875a());
                return;
            }
            View$OnClickListenerC2040ad.this.f6646x = c1368a.m8859f();
            if (View$OnClickListenerC2040ad.this.f6624a != null) {
                View$OnClickListenerC2040ad.this.f6624a.m8430b(false);
            }
            C1455z.m8564a(0, new Runnable() { // from class: com.tsf.extend.wallpaper.ad.b.1
                @Override // java.lang.Runnable
                public void run() {
                    View$OnClickListenerC2040ad.this.m6620e();
                }
            });
            if (View$OnClickListenerC2040ad.this.f6635m) {
            }
            View$OnClickListenerC2040ad.this.f6635m = false;
            View$OnClickListenerC2040ad.this.m6631a(c1368a.m8875a());
        }

        @Override // com.tsf.extend.base.p074d.AbstractC1386a.InterfaceC1396a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo6247a(JSONObject jSONObject, int i, C1368a c1368a) {
            if (this.f6656b == AbstractC1386a.EnumC1397b.LoadMore) {
                View$OnClickListenerC2040ad.this.m6622d();
                return;
            }
            String str = View$OnClickListenerC2040ad.this.f6635m ? "2" : "1";
            View$OnClickListenerC2040ad.this.f6635m = false;
            View$OnClickListenerC2040ad.this.m6632a(str);
            if (c1368a == null && View$OnClickListenerC2040ad.this.f6624a != null) {
                View$OnClickListenerC2040ad.this.f6624a.setMode(PullToRefreshBase.EnumC1491b.DISABLED);
            }
            View$OnClickListenerC2040ad.this.m6631a(c1368a == null ? null : c1368a.m8875a());
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i) {
        if (this.f6622A != null) {
            this.f6622A.mo6726a(absListView, i);
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        View childAt;
        this.f6637o = i;
        this.f6638p = i2;
        if (this.f6647y != null && (childAt = absListView.getChildAt(1)) != null) {
            int top = i == 0 ? childAt.getTop() : 0;
            if (top >= 0 && !this.f6648z) {
                this.f6647y.mo6414a(this, top);
            }
            this.f6648z = false;
        }
    }

    @Override // com.tsf.extend.wallpaper.View$OnClickListenerC2107t.InterfaceC2109a
    /* renamed from: a */
    public void mo6388a(View$OnClickListenerC2107t.C2111c c2111c, View view) {
    }

    @Override // com.tsf.extend.wallpaper.View$OnClickListenerC2107t.InterfaceC2109a
    /* renamed from: a */
    public void mo6387a(View$OnClickListenerC2107t.C2111c c2111c, View$OnClickListenerC2107t.C2112d c2112d, int i) {
    }

    public void setChooseWallpaperOnLine(boolean z) {
        this.f6623B = z;
    }

    /* renamed from: b */
    public void m6630b() {
        if (this.f6625b != null) {
            this.f6625b.m6392b(null);
            this.f6625b.notifyDataSetChanged();
        }
        if (this.f6627d != null) {
            this.f6627d.clear();
        }
        if (this.f6624a != null) {
            this.f6624a.removeAllViews();
            this.f6624a = null;
        }
        if (this.f6625b != null) {
            this.f6625b.m6389d();
        }
    }
}
