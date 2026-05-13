package com.tsf.extend.theme;

import android.app.Activity;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tsf.extend.base.actstru.model.activi.PageActivity;
import com.tsf.extend.base.d.a;
import com.tsf.extend.base.widget.pulltorefresh.PullToRefreshAndLoadMoreListView;
import com.tsf.extend.base.widget.pulltorefresh.PullToRefreshBase;
import com.tsf.extend.f;
import com.tsf.extend.theme.t;
import com.tsf.extend.wallpaper.PersonalizationActivity;
import com.tsf.extend.wallpaper.ad;
import com.tsf.shell.theme.inside.element.ThemeElementType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class ThemeAlbumsPager extends LinearLayout implements View.OnClickListener, AbsListView.OnScrollListener, PageActivity.a, a.InterfaceC0048a<List<k>>, PersonalizationActivity.b, PersonalizationActivity.n, com.tsf.extend.wallpaper.p {
    private static final LinearLayout.LayoutParams j = new LinearLayout.LayoutParams(-1, -1);
    protected boolean a;
    protected long b;
    protected com.tsf.extend.theme.a c;
    private PageActivity d;
    private PullToRefreshAndLoadMoreListView e;
    private View f;
    private View g;
    private ProgressBar h;
    private TextView i;
    private List<t.b> k;
    private a l;
    private a m;
    private t n;
    private ad.a o;
    private long p;
    private boolean q;
    private com.tsf.extend.wallpaper.q r;
    private boolean s;
    private boolean t;
    private String u;
    private String v;
    private String w;
    private boolean x;
    private boolean y;
    private String z;

    public ThemeAlbumsPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = false;
        this.k = new ArrayList();
        this.p = 0L;
        this.c = null;
        this.s = false;
        this.t = true;
        this.u = null;
        this.v = null;
        this.w = null;
        this.x = true;
        this.y = false;
    }

    public void g() {
        a.b bVar;
        this.e = (PullToRefreshAndLoadMoreListView) LayoutInflater.from(getContext()).inflate(f.C0052f.wallpaper_list_noheader, (ViewGroup) null);
        this.e.setBackgroundColor(Color.parseColor("#ffeeeeee"));
        this.e.setHeaderResizeEnabled(true);
        ((LinearLayout) findViewById(f.e.container)).addView(this.e, j);
        this.e.setOnScrollListener(this);
        this.f = LayoutInflater.from(getContext()).inflate(f.C0052f.retry_item, (ViewGroup) null);
        ((TextView) this.f.findViewById(f.e.retry_text)).setTextColor(getResources().getColorStateList(f.d.wallpaper_list_retry_text_color));
        this.f.setOnClickListener(this);
        this.i = (TextView) findViewById(f.e.title);
        if (!TextUtils.isEmpty(this.v)) {
            this.i.setText(this.v);
        } else {
            n();
        }
        com.tsf.extend.base.widget.pulltorefresh.e eVar = new com.tsf.extend.base.widget.pulltorefresh.e(new BitmapDrawable(getResources(), BitmapFactory.decodeResource(getResources(), f.d.actionbar_back)), new int[]{-16777216, -7829368}, new PorterDuff.Mode[]{PorterDuff.Mode.SRC_IN, PorterDuff.Mode.SRC_IN});
        eVar.setBounds(0, 0, eVar.getMinimumWidth(), eVar.getMinimumHeight());
        this.i.setCompoundDrawables(eVar, null, null, null);
        this.i.setCompoundDrawablePadding((int) (6.0f * com.tsf.extend.base.j.p.a()));
        this.i.setOnClickListener(this);
        if (!this.x) {
            findViewById(f.e.title_share_googleplus).setVisibility(4);
            findViewById(f.e.title_share_facebook).setVisibility(4);
        } else {
            findViewById(f.e.title_share_facebook).setOnClickListener(this);
            findViewById(f.e.title_share_googleplus).setOnClickListener(this);
        }
        this.g = LayoutInflater.from(getContext()).inflate(f.C0052f.theme_album_loadmore, (ViewGroup) null);
        this.h = (ProgressBar) this.g.findViewById(f.e.loadmore_progress);
        this.h.setIndeterminateDrawable(new com.tsf.extend.base.widget.pulltorefresh.d(getContext(), 3, 1));
        this.e.setLoadMoreView(this.g);
        this.g.setVisibility(0);
        this.e.setMode(PullToRefreshBase.b.PULL_FROM_START);
        this.e.setCanLoadMore(true);
        this.n = new t(getContext(), this.k, this);
        this.n.a("DATA_ALBUM");
        this.n.a(h());
        this.e.setAdapter(this.n);
        if (((Activity) getContext()).getIntent().getBooleanExtra("force_refresh", false)) {
            bVar = a.b.Refresh;
        } else {
            bVar = a.b.LoadCache;
        }
        this.l = new a(bVar);
        this.e.setOnLoadListener(new PullToRefreshAndLoadMoreListView.a() { // from class: com.tsf.extend.theme.ThemeAlbumsPager.1
            @Override // com.tsf.extend.base.widget.pulltorefresh.PullToRefreshAndLoadMoreListView.a
            public void a() {
                ThemeAlbumsPager.this.b = System.currentTimeMillis();
                if (!ThemeAlbumsPager.this.t) {
                    ThemeAlbumsPager.this.i();
                    return;
                }
                ThemeAlbumsPager.this.l = new a(a.b.LoadCache);
                v.h().c(ThemeAlbumsPager.this.l, a.b.LoadCache, ThemeAlbumsPager.this.u);
            }

            @Override // com.tsf.extend.base.widget.pulltorefresh.PullToRefreshAndLoadMoreListView.a
            public void b() {
                if (ThemeAlbumsPager.this.a) {
                    ThemeAlbumsPager.this.j();
                } else {
                    ThemeAlbumsPager.this.k();
                }
            }
        });
        int a2 = PersonalizationActivity.a(getContext(), 1.0f);
        this.o = new ad.a(a2, a2);
        if (Build.VERSION.SDK_INT >= 11) {
            this.o.setColor(ThemeElementType.PARSER_CONFIG_ALL);
        }
        this.e.setDivider(null);
        com.tsf.extend.base.b.a aVar = v.h().d().get(this.w);
        if (aVar != null && aVar.a() != null) {
            this.t = false;
            this.a = aVar.b();
            a(aVar.a(), false, this.a);
        } else {
            this.e.k();
        }
        setPadding(0, getPaddingTop(), 0, com.tsf.extend.base.j.p.c(getContext()));
        if (this.z == null) {
            this.z = ((Activity) getContext()).getIntent().getStringExtra("inlet");
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        this.l = new a(a.b.Refresh);
        v.h().c(this.l, a.b.Refresh, this.u);
        if (h()) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        if (this.k != null && this.k.size() > 0) {
            this.m = new a(a.b.LoadMore);
            v.h().c(this.m, a.b.LoadMore, this.u);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        this.h.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        this.h.setVisibility(8);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == f.e.title) {
            this.d.onBackPressed();
        } else if (id == f.e.retry) {
            this.f.setVisibility(8);
            this.l = new a(a.b.Refresh);
            v.h().c(this.l, a.b.Refresh, this.u);
        } else if (id == f.e.loadmore_tips) {
            this.h.setVisibility(0);
            j();
        } else {
            a(view);
        }
    }

    @Override // com.tsf.extend.base.d.a.InterfaceC0048a
    public void a(JSONObject jSONObject, final List<k> list) {
        if (list != null) {
            com.tsf.extend.base.j.z.a(0, new Runnable() { // from class: com.tsf.extend.theme.ThemeAlbumsPager.2
                @Override // java.lang.Runnable
                public void run() {
                    if (ThemeAlbumsPager.this.k != null) {
                        for (t.b bVar : ThemeAlbumsPager.this.k) {
                            k kVar = bVar.a;
                            k kVar2 = bVar.b;
                            kVar.d(false);
                            if (kVar2 != null) {
                                kVar2.d(false);
                            }
                            for (k kVar3 : list) {
                                if (kVar3 != null && !(kVar3 instanceof aq)) {
                                    if (kVar3.g().equals(kVar.g())) {
                                        kVar.d(true);
                                    }
                                    if (kVar2 != null && kVar3.g().equals(kVar2.g())) {
                                        kVar2.d(true);
                                    }
                                }
                            }
                        }
                        ThemeAlbumsPager.this.n.notifyDataSetChanged();
                    }
                }
            });
        }
    }

    @Override // com.tsf.extend.base.d.a.InterfaceC0048a
    public void a(JSONObject jSONObject, int i, List<k> list) {
    }

    private void a(View view) {
        String str;
        k kVar;
        k kVar2;
        Object tag = view.getTag();
        if (tag instanceof t.d) {
            int id = view.getId();
            if (id == f.e.theme_item_left || id == f.e.theme_item_download_layout_left) {
                kVar2 = ((t.d) tag).a;
            } else if (id == f.e.theme_item_mid || id == f.e.theme_item_download_layout_mid) {
                kVar2 = ((t.d) tag).o;
            } else {
                kVar2 = ((t.d) tag).h;
            }
            str = "1";
            kVar = kVar2;
        } else if (tag == null) {
            View findViewById = view.findViewById(f.e.theme_download_left);
            if (findViewById == null) {
                findViewById = view.findViewById(f.e.theme_download_mid);
            }
            if (findViewById == null) {
                findViewById = view.findViewById(f.e.theme_download_right);
            }
            str = "2";
            kVar = (findViewById == null || !(findViewById.getTag() instanceof k)) ? null : (k) findViewById.getTag();
        } else {
            str = null;
            kVar = null;
        }
        if (kVar != null) {
            this.d.a(false);
            if (ao.b().g()) {
                ThemeDetail themeDetail = (ThemeDetail) LayoutInflater.from(getContext()).inflate(f.C0052f.theme_detail, (ViewGroup) null);
                themeDetail.setFromInlet(this.z);
                themeDetail.setFromTab("detail");
                themeDetail.setTheme(kVar);
                themeDetail.a("1010", "1010");
                if (getContext() instanceof PageActivity) {
                    ((PageActivity) getContext()).a(themeDetail);
                }
            } else {
                x.a(getContext(), kVar.k(), "tsf_theme_center_theme");
            }
            com.tsf.extend.base.d a2 = com.tsf.extend.h.a();
            if (a2 != null) {
                a2.b(kVar.h() + "");
            }
            v.h().b(kVar.h());
            if (h()) {
                if ("1".equals(str)) {
                    b(kVar);
                } else if ("2".equals(str)) {
                    a(kVar);
                }
            }
        }
    }

    private void a(k kVar) {
        a("3", kVar.h(), kVar.B());
    }

    private void b(k kVar) {
        a("2", kVar.h(), kVar.B());
    }

    private void a(String str, long j2, String str2) {
    }

    @Override // com.tsf.extend.wallpaper.PersonalizationActivity.n
    public void a(String str, PersonalizationActivity.n.a aVar) {
        if (aVar != null) {
            v.h().a(this);
        }
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.a
    public boolean getPendingTransition() {
        return true;
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.a
    public View getContent() {
        return this;
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.a
    public void a(PageActivity pageActivity) {
        this.d = pageActivity;
        if (this.d instanceof PersonalizationActivity) {
            ((PersonalizationActivity) this.d).a((PersonalizationActivity.b) this);
            ((PersonalizationActivity) this.d).a((PersonalizationActivity.n) this);
        }
        g();
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.a
    public void a() {
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.a
    public void b() {
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.a
    public Bundle getResult() {
        return null;
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.a
    public void c() {
        if (h()) {
        }
        if (this.d != null && (this.d instanceof PersonalizationActivity)) {
            ((PersonalizationActivity) this.d).b((PersonalizationActivity.n) this);
            ((PersonalizationActivity) this.d).b((PersonalizationActivity.b) this);
        }
        this.n.a();
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.a
    public void d() {
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.a
    public boolean e() {
        return false;
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.a
    public void f() {
    }

    public void a(String str, String str2, String str3) {
        this.u = str;
        this.v = str2;
        this.w = "DATA_ALBUM_" + this.u;
        v.h().b(str3);
    }

    public void setShowShareTitle(boolean z) {
        this.x = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements a.InterfaceC0048a<com.tsf.extend.base.b.a> {
        private a.b b;

        public a(a.b bVar) {
            this.b = bVar;
        }

        @Override // com.tsf.extend.base.d.a.InterfaceC0048a
        public void a(JSONObject jSONObject, final com.tsf.extend.base.b.a aVar) {
            if (aVar == null) {
                a(jSONObject, 0, (com.tsf.extend.base.b.a) null);
            } else {
                com.tsf.extend.base.j.z.a(0, new Runnable() { // from class: com.tsf.extend.theme.ThemeAlbumsPager.a.1
                    @Override // java.lang.Runnable
                    public void run() {
                        boolean z;
                        if (aVar instanceof com.tsf.extend.theme.a) {
                            com.tsf.extend.theme.a aVar2 = (com.tsf.extend.theme.a) aVar;
                            ThemeAlbumsPager.this.a = aVar2.b();
                            if (a.this.b == a.b.LoadMore) {
                                z = ThemeAlbumsPager.this.a(aVar2.a(), ThemeAlbumsPager.this.a);
                            } else {
                                ThemeAlbumsPager.this.t = false;
                                ThemeAlbumsPager.this.m();
                                boolean a = ThemeAlbumsPager.this.a(aVar2.a(), false, ThemeAlbumsPager.this.a);
                                ThemeAlbumsPager.this.c = aVar2;
                                z = a;
                            }
                            if (z && !ThemeAlbumsPager.this.s) {
                                v.h().a(ThemeAlbumsPager.this);
                            }
                            if (ThemeAlbumsPager.this.h()) {
                            }
                        }
                    }
                });
            }
        }

        @Override // com.tsf.extend.base.d.a.InterfaceC0048a
        public void a(JSONObject jSONObject, int i, final com.tsf.extend.base.b.a aVar) {
            com.tsf.extend.base.j.z.a(0, new Runnable() { // from class: com.tsf.extend.theme.ThemeAlbumsPager.a.2
                @Override // java.lang.Runnable
                public void run() {
                    if (a.this.b == a.b.LoadMore) {
                        ThemeAlbumsPager.this.l();
                        return;
                    }
                    ThemeAlbumsPager.this.t = false;
                    ThemeAlbumsPager.this.m();
                    if (aVar != null) {
                        ThemeAlbumsPager.this.a = aVar.b();
                    }
                    ThemeAlbumsPager.this.a((List<k>) (aVar == null ? null : aVar.a()), false, ThemeAlbumsPager.this.a);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        long j2;
        long currentTimeMillis = System.currentTimeMillis() - this.b;
        if (currentTimeMillis > 200) {
            j2 = 0;
        } else {
            j2 = 200 - currentTimeMillis;
        }
        com.tsf.extend.base.j.z.a(0, new Runnable() { // from class: com.tsf.extend.theme.ThemeAlbumsPager.3
            @Override // java.lang.Runnable
            public void run() {
                ThemeAlbumsPager.this.e.j();
            }
        }, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(List<k> list, boolean z) {
        if (list == null || list.size() == 0) {
            return false;
        }
        return a(list, true, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(List<k> list, boolean z, boolean z2) {
        a(z2);
        if (!z) {
            this.k.clear();
            if (list == null || list.size() == 0) {
                this.n.notifyDataSetChanged();
                this.f.setVisibility(0);
                this.e.setEmptyView(this.f);
                return false;
            }
        }
        String f = ((PersonalizationActivity) this.d).f();
        if (f != null && f.startsWith("DIY://")) {
            for (k kVar : list) {
                if (kVar instanceof aq) {
                    if (!TextUtils.isEmpty(f) && f.contains(((aq) kVar).I())) {
                        kVar.b(true);
                    } else {
                        kVar.b(false);
                    }
                }
            }
        } else {
            for (k kVar2 : list) {
                if (!TextUtils.isEmpty(f) && f.equals(kVar2.g())) {
                    kVar2.b(true);
                } else {
                    kVar2.b(false);
                }
            }
        }
        this.n.a(this.k, list);
        this.n.notifyDataSetChanged();
        return true;
    }

    @Override // com.tsf.extend.wallpaper.PersonalizationActivity.b
    public void a(final String str) {
        com.tsf.extend.base.j.z.a(0, new Runnable() { // from class: com.tsf.extend.theme.ThemeAlbumsPager.4
            @Override // java.lang.Runnable
            public void run() {
                if (ThemeAlbumsPager.this.k != null && ThemeAlbumsPager.this.k.size() > 0) {
                    Iterator it = ThemeAlbumsPager.this.k.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        t.b bVar = (t.b) it.next();
                        if (!TextUtils.isEmpty(str) && str.equals(bVar.a.g())) {
                            bVar.a.b(true);
                            break;
                        }
                        bVar.a.b(false);
                        if (bVar.b != null) {
                            if (!TextUtils.isEmpty(str) && str.equals(bVar.b.g())) {
                                bVar.b.b(true);
                                break;
                            }
                            bVar.b.b(false);
                        }
                    }
                    if (ThemeAlbumsPager.this.n != null) {
                        ThemeAlbumsPager.this.n.notifyDataSetChanged();
                    }
                }
            }
        });
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        View childAt;
        if (this.r != null && (childAt = absListView.getChildAt(1)) != null) {
            int top = i == 0 ? childAt.getTop() : 0;
            if (top >= 0 && !this.q) {
                this.r.a(this, top);
            }
            this.q = false;
        }
    }

    @Override // android.view.View
    public void setScrollY(int i) {
        this.q = true;
        if (this.e != null) {
            int i2 = 0;
            int firstVisiblePosition = this.e.getListView().getFirstVisiblePosition();
            if (i <= ThemePager.b) {
                if (firstVisiblePosition == 0) {
                    View childAt = this.e.getListView().getChildAt(1);
                    if (childAt != null) {
                        i2 = childAt.getTop();
                    }
                    if (i2 > ThemePager.b) {
                        this.e.getListView().setSelectionFromTop(1, ThemePager.b);
                        return;
                    }
                    return;
                }
                return;
            }
            View childAt2 = this.e.getListView().getChildAt(1);
            if (childAt2 != null) {
                i2 = childAt2.getTop();
            }
            if (i2 != i || Build.VERSION.SDK_INT >= 19) {
                this.e.getListView().setSelectionFromTop(1, i);
            }
        }
    }

    @Override // com.tsf.extend.wallpaper.p
    public void setScrollListener(com.tsf.extend.wallpaper.q qVar) {
        this.r = qVar;
    }

    @Override // com.tsf.extend.wallpaper.p
    public void setHeadViewHeight(int i) {
        if (this.e != null) {
            FrameLayout headerFrame = this.e.getHeaderFrame();
            AbsListView.LayoutParams layoutParams = (AbsListView.LayoutParams) headerFrame.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new AbsListView.LayoutParams(-1, i);
            } else {
                layoutParams.height = i;
            }
            headerFrame.setLayoutParams(layoutParams);
        }
    }

    private void a(boolean z) {
        if (!z) {
            k();
        } else {
            this.e.b(false);
        }
    }

    private void n() {
        if (this.u != null) {
            v.h().b("https://cml.ksmobile.com/Album/albumInfo?album_id=" + this.u, new a.InterfaceC0048a<JSONObject>() { // from class: com.tsf.extend.theme.ThemeAlbumsPager.5
                @Override // com.tsf.extend.base.d.a.InterfaceC0048a
                public void a(JSONObject jSONObject, JSONObject jSONObject2) {
                    JSONObject optJSONObject;
                    final String optString;
                    if (jSONObject2 != null && (optJSONObject = jSONObject2.optJSONObject("data")) != null && (optString = optJSONObject.optString("album_name")) != null) {
                        com.tsf.extend.base.j.z.a(0, new Runnable() { // from class: com.tsf.extend.theme.ThemeAlbumsPager.5.1
                            @Override // java.lang.Runnable
                            public void run() {
                                ThemeAlbumsPager.this.v = optString;
                                ThemeAlbumsPager.this.i.setText(ThemeAlbumsPager.this.v);
                            }
                        });
                    }
                }

                @Override // com.tsf.extend.base.d.a.InterfaceC0048a
                public void a(JSONObject jSONObject, int i, JSONObject jSONObject2) {
                }
            });
        }
    }

    public boolean h() {
        return this.y;
    }

    public void setOpenCategoryList(boolean z) {
        this.y = z;
    }
}
