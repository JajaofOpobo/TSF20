package com.tsf.extend.theme;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.FrameLayout;
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
import com.tsf.extend.wallpaper.l;
import com.tsf.shell.theme.inside.element.ThemeElementType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class m extends FrameLayout implements View.OnClickListener, AbsListView.OnScrollListener, a.InterfaceC0048a<List<k>>, PersonalizationActivity.b, PersonalizationActivity.n, l.a, com.tsf.extend.wallpaper.p {
    protected PageActivity a;
    protected PullToRefreshAndLoadMoreListView b;
    protected View c;
    protected View d;
    protected boolean e;
    protected long f;
    protected List<t.b> g;
    protected t h;
    protected p i;
    protected int k;
    private ProgressBar l;
    private TextView m;
    private a o;
    private a p;
    private ad.a q;
    private long r;
    private boolean s;
    private com.tsf.extend.wallpaper.q t;
    private PersonalizationActivity.i u;
    private PersonalizationActivity.h v;
    private long w;
    private boolean x;
    private String y;
    private boolean z;
    private static final FrameLayout.LayoutParams n = new FrameLayout.LayoutParams(-1, -1);
    public static String[] j = {"new", "hot", "diy", "category"};

    public m(Context context, PageActivity pageActivity, String str, PersonalizationActivity.i iVar) {
        super(context);
        a.b bVar;
        this.e = false;
        this.g = new ArrayList();
        this.r = 0L;
        this.i = null;
        this.w = 0L;
        this.x = false;
        this.y = j[0];
        this.z = true;
        this.k = 0;
        this.y = str;
        this.a = pageActivity;
        this.u = iVar;
        this.b = (PullToRefreshAndLoadMoreListView) LayoutInflater.from(getContext()).inflate(f.C0052f.wallpaper_list, (ViewGroup) null);
        this.b.setHeaderResizeEnabled(true);
        addView(this.b, n);
        this.b.setOnScrollListener(this);
        this.c = LayoutInflater.from(getContext()).inflate(f.C0052f.retry_item, (ViewGroup) null);
        ((TextView) this.c.findViewById(f.e.retry_text)).setTextColor(getResources().getColorStateList(f.d.wallpaper_list_retry_text_color));
        this.c.setOnClickListener(this);
        this.d = LayoutInflater.from(getContext()).inflate(f.C0052f.wallpaper_loadmore, (ViewGroup) null);
        this.l = (ProgressBar) this.d.findViewById(f.e.loadmore_progress);
        this.l.setIndeterminateDrawable(new com.tsf.extend.base.widget.pulltorefresh.d(getContext(), 3, 1));
        this.m = (TextView) this.d.findViewById(f.e.loadmore_tips);
        this.m.setOnClickListener(this);
        this.c.setSoundEffectsEnabled(true);
        this.m.setSoundEffectsEnabled(true);
        this.b.setLoadMoreView(this.d);
        this.b.setMode(PullToRefreshBase.b.PULL_FROM_START);
        this.b.setCanLoadMore(true);
        this.h = a(this.g, this);
        if (j[0].equals(this.y)) {
            this.h.a("DATA_NEW");
        } else if (j[1].equals(this.y)) {
            this.h.a("DATA_HOT");
        } else if (j[3].equals(this.y)) {
            this.h.a("DATA_CATEGORY");
        } else if (j[2].equals(this.y)) {
            this.h.a("DATA_DIY");
        }
        this.b.setAdapter(this.h);
        if (((Activity) getContext()).getIntent().getBooleanExtra("force_refresh", false)) {
            bVar = a.b.Refresh;
        } else {
            bVar = a.b.LoadCache;
        }
        this.o = new a(bVar);
        this.b.setOnLoadListener(new PullToRefreshAndLoadMoreListView.a() { // from class: com.tsf.extend.theme.m.1
            @Override // com.tsf.extend.base.widget.pulltorefresh.PullToRefreshAndLoadMoreListView.a
            public void a() {
                m.this.f = System.currentTimeMillis();
                if (!m.this.z) {
                    m.this.b();
                    return;
                }
                m.this.o = new a(a.b.LoadCache);
                v.h().a(m.this.getCurrentDataType(), m.this.o, a.b.LoadCache, (JSONObject) null);
            }

            @Override // com.tsf.extend.base.widget.pulltorefresh.PullToRefreshAndLoadMoreListView.a
            public void b() {
                if (m.this.e) {
                    m.this.c();
                } else {
                    m.this.d();
                }
            }
        });
        int a2 = PersonalizationActivity.a(getContext(), 1.0f);
        this.q = new ad.a(a2, a2);
        if (Build.VERSION.SDK_INT >= 11) {
            this.q.setColor(ThemeElementType.PARSER_CONFIG_ALL);
        }
        this.b.setDivider(null);
        com.tsf.extend.base.b.a aVar = v.h().d().get(getCurrentDataType());
        if (aVar != null && aVar.a() != null) {
            this.z = false;
            this.e = aVar.b();
            a(aVar.a(), false);
        } else {
            this.b.k();
        }
        if (this.a instanceof PersonalizationActivity) {
            ((PersonalizationActivity) this.a).a((PersonalizationActivity.b) this);
            ((PersonalizationActivity) this.a).a((PersonalizationActivity.n) this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        this.w = System.currentTimeMillis();
        this.o = new a(a.b.Refresh);
        v.h().a(getCurrentDataType(), this.o, a.b.Refresh, (JSONObject) null);
    }

    private String getSecondtab() {
        if (j[0].equals(this.y)) {
            return "1";
        }
        if (j[1].equals(this.y)) {
            return "2";
        }
        if (!j[2].equals(this.y)) {
            return "4";
        }
        return "3";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        if (this.g != null && this.g.size() > 0) {
            this.p = new a(a.b.LoadMore);
            this.w = System.currentTimeMillis();
            v.h().a(getCurrentDataType(), this.p, a.b.LoadMore, (JSONObject) null);
        }
    }

    public String getCurrentDataType() {
        if (j[0].equals(this.y)) {
            return "DATA_NEW";
        }
        if (j[1].equals(this.y)) {
            return "DATA_HOT";
        }
        if (j[3].equals(this.y)) {
            return "DATA_CATEGORY";
        }
        return "DATA_DIY";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        this.l.setVisibility(8);
        this.m.setVisibility(0);
        this.m.setClickable(false);
        this.m.setText(f.g.theme_no_more);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        this.l.setVisibility(8);
        this.m.setVisibility(0);
        this.m.setClickable(true);
        this.m.setText(f.g.load_more_fail);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == f.e.retry) {
            this.c.setVisibility(8);
            this.o = new a(a.b.Refresh);
            this.w = System.currentTimeMillis();
            v.h().a(getCurrentDataType(), this.o, a.b.Refresh, (JSONObject) null);
        } else if (id == f.e.theme_item_download_layout_left) {
            if (ao.b().g()) {
                c(view);
            } else {
                b(view.findViewById(f.e.theme_download_left));
            }
        } else if (id == f.e.theme_item_download_layout_mid) {
            if (ao.b().g()) {
                c(view);
            } else {
                b(view.findViewById(f.e.theme_download_mid));
            }
        } else if (id == f.e.theme_item_download_layout_right) {
            if (ao.b().g()) {
                c(view);
            } else {
                b(view.findViewById(f.e.theme_download_right));
            }
        } else if (id == f.e.loadmore_tips) {
            this.l.setVisibility(0);
            this.m.setVisibility(8);
            c();
        } else {
            c(view);
        }
        a(view);
    }

    public void a(View view) {
    }

    @Override // com.tsf.extend.base.d.a.InterfaceC0048a
    public void a(JSONObject jSONObject, final List<k> list) {
        if (list != null) {
            com.tsf.extend.base.j.z.a(0, new Runnable() { // from class: com.tsf.extend.theme.m.2
                @Override // java.lang.Runnable
                public void run() {
                    String str;
                    if (m.this.g != null) {
                        for (t.b bVar : m.this.g) {
                            if (bVar.e() == null) {
                                k kVar = bVar.a;
                                k kVar2 = bVar.b;
                                k kVar3 = bVar.c;
                                kVar.d(false);
                                if (kVar2 != null) {
                                    kVar2.d(false);
                                }
                                if (kVar3 != null) {
                                    kVar3.d(false);
                                }
                                for (k kVar4 : list) {
                                    if (kVar4 == null || (kVar4 instanceof aq)) {
                                        if (!(kVar4 instanceof b)) {
                                            str = null;
                                        } else {
                                            str = ((b) kVar4).f();
                                        }
                                    } else {
                                        str = kVar4.g();
                                    }
                                    if (str != null) {
                                        if (str.equals(kVar.g())) {
                                            kVar.d(true);
                                        }
                                        if (kVar2 != null && str.equals(kVar2.g())) {
                                            kVar2.d(true);
                                        }
                                        if (kVar3 != null && str.equals(kVar3.g())) {
                                            kVar3.d(true);
                                        }
                                    }
                                }
                            }
                        }
                        m.this.h.notifyDataSetChanged();
                    }
                }
            });
        }
    }

    @Override // com.tsf.extend.base.d.a.InterfaceC0048a
    public void a(JSONObject jSONObject, int i, List<k> list) {
    }

    private void b(View view) {
        k kVar = (k) view.getTag();
        if (!kVar.v()) {
            this.a.a(false);
            x.a(getContext(), kVar.k(), "tsf_theme_center_theme");
            v.h().b(kVar.h());
            if (this.y.equals("new")) {
            }
            e(kVar);
            return;
        }
        c(view);
    }

    private void d(k kVar) {
        if (kVar != null) {
            Context context = getContext();
            String g = kVar.g();
            if (context.getPackageManager() != null) {
                if (com.tsf.extend.wallpaper.aj.a(getContext(), g)) {
                    this.a.a(false);
                    return;
                }
                ThemeDetail themeDetail = (ThemeDetail) LayoutInflater.from(getContext()).inflate(f.C0052f.theme_detail, (ViewGroup) null);
                if (this.y.equals("diy")) {
                    themeDetail.i();
                }
                themeDetail.setFromTab(this.y);
                themeDetail.setTheme(kVar);
                themeDetail.a(this.y.equals("new") ? "1001" : "1004", "1010");
                this.a.a(themeDetail);
            }
        }
    }

    private void c(View view) {
        k kVar;
        Object tag = view.getTag();
        if (tag instanceof t.d) {
            if (view.getId() == f.e.theme_item_left) {
                kVar = ((t.d) tag).a;
            } else if (view.getId() == f.e.theme_item_mid) {
                kVar = ((t.d) tag).o;
            } else {
                kVar = ((t.d) tag).h;
            }
        } else if (!(tag instanceof k)) {
            kVar = null;
        } else {
            kVar = (k) tag;
        }
        if (kVar != null) {
            if (Math.abs(this.r - System.currentTimeMillis()) > 1500) {
                this.r = System.currentTimeMillis();
                d(kVar);
            }
            switch (getTabId()) {
            }
            if (kVar.x() != 1 && kVar.g().contains("DIY_")) {
            }
            com.tsf.extend.base.d a2 = com.tsf.extend.h.a();
            if (a2 != null) {
                a2.b(kVar.h() + "");
            }
        }
    }

    @Override // com.tsf.extend.wallpaper.PersonalizationActivity.n
    public void a(String str, PersonalizationActivity.n.a aVar) {
        if (aVar != null) {
            v.h().a(this);
        }
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
                com.tsf.extend.base.j.z.a(0, new Runnable() { // from class: com.tsf.extend.theme.m.a.1
                    @Override // java.lang.Runnable
                    public void run() {
                        boolean z;
                        if (aVar instanceof p) {
                            p pVar = (p) aVar;
                            m.this.e = pVar.b();
                            if (a.this.b != a.b.LoadMore) {
                                m.this.z = false;
                                m.this.f();
                                if (m.this.v != null) {
                                    m.this.v.b(pVar.l());
                                }
                                m.this.b.b(false);
                                m.this.a();
                                boolean a = m.this.a(pVar.a(), false);
                                m.this.i = pVar;
                                z = a;
                            } else {
                                if (!m.this.e) {
                                    m.this.d();
                                } else {
                                    m.this.b.b(false);
                                }
                                z = m.this.a(pVar.a());
                            }
                            if (z && !m.this.x) {
                                v.h().a(m.this);
                            }
                            m.this.a(true, 0, System.currentTimeMillis() - m.this.w);
                        }
                    }
                });
            }
        }

        @Override // com.tsf.extend.base.d.a.InterfaceC0048a
        public void a(JSONObject jSONObject, final int i, final com.tsf.extend.base.b.a aVar) {
            com.tsf.extend.base.j.z.a(0, new Runnable() { // from class: com.tsf.extend.theme.m.a.2
                @Override // java.lang.Runnable
                public void run() {
                    m.this.k = 0;
                    if (a.this.b == a.b.LoadMore) {
                        m.this.e();
                    } else {
                        m.this.z = false;
                        m.this.f();
                        if (aVar != null) {
                            m.this.e = aVar.b();
                        }
                        m.this.a(aVar == null ? null : aVar.a(), false);
                    }
                    m.this.a(false, i, System.currentTimeMillis() - m.this.w);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        long j2;
        long currentTimeMillis = System.currentTimeMillis() - this.f;
        if (currentTimeMillis > 200) {
            j2 = 0;
        } else {
            j2 = 200 - currentTimeMillis;
        }
        com.tsf.extend.base.j.z.a(0, new Runnable() { // from class: com.tsf.extend.theme.m.3
            @Override // java.lang.Runnable
            public void run() {
                m.this.b.j();
            }
        }, j2);
    }

    public void a() {
        this.l.setVisibility(0);
        this.m.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(List<k> list) {
        if (list == null || list.size() == 0) {
            return false;
        }
        return a(list, true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean a(List<k> list, boolean z) {
        t.b bVar;
        if (!z) {
            this.k = 0;
            this.g.clear();
            if (list == null || list.size() == 0) {
                this.h.notifyDataSetChanged();
                this.c.setVisibility(0);
                this.b.setEmptyView(this.c);
                return false;
            }
        }
        String f = ((PersonalizationActivity) this.a).f();
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
        t.b bVar2 = this.g.size() > 0 ? this.g.get(this.g.size() - 1) : null;
        if (bVar2 != null && bVar2.b() == null && list.size() > 1) {
            k remove = list.remove(0);
            remove.f(bVar2.a().z() + 1);
            bVar2.a(remove);
        }
        if (bVar2 != null && bVar2.c() == null && list.size() > 1) {
            k remove2 = list.remove(0);
            remove2.f(bVar2.a().z() + 2);
            bVar2.b(remove2);
        }
        int i = 0;
        while (i < list.size() / 3) {
            k kVar3 = list.get(i * 3);
            int i2 = (this.k + i + 1) * 10;
            kVar3.f(i2 + 1);
            k kVar4 = list.get((i * 3) + 1);
            kVar4.f(i2 + 2);
            k kVar5 = list.get((i * 3) + 2);
            kVar5.f(i2 + 3);
            this.g.add(new t.b(kVar3, kVar4, kVar5));
            i++;
        }
        int size = list.size() % 3;
        if (size != 0) {
            if (size == 1) {
                k kVar6 = list.get(list.size() - 1);
                kVar6.f(((this.k + ((list.size() + 1) / 3)) * 10) + 1);
                bVar = new t.b(kVar6, null, null);
            } else if (size == 2) {
                k kVar7 = list.get(list.size() - 2);
                int size2 = (this.k + ((list.size() + 1) / 3)) * 10;
                kVar7.f(size2 + 1);
                k kVar8 = list.get(list.size() - 1);
                kVar8.f(size2 + 2);
                bVar = new t.b(kVar7, kVar8, null);
            } else {
                bVar = null;
            }
            this.g.add(bVar);
            this.k = this.k + i + 1;
        } else {
            this.k += i;
        }
        this.h.notifyDataSetChanged();
        return true;
    }

    @Override // com.tsf.extend.wallpaper.PersonalizationActivity.b
    public void a(final String str) {
        com.tsf.extend.base.j.z.a(0, new Runnable() { // from class: com.tsf.extend.theme.m.4
            @Override // java.lang.Runnable
            public void run() {
                if (m.this.g != null && m.this.g.size() > 0) {
                    Iterator<t.b> it = m.this.g.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        t.b next = it.next();
                        if (next.a != null) {
                            if (!TextUtils.isEmpty(str) && str.equals(next.a.g())) {
                                next.a.b(true);
                                break;
                            }
                            next.a.b(false);
                        }
                        if (next.b != null) {
                            if (!TextUtils.isEmpty(str) && str.equals(next.b.g())) {
                                next.b.b(true);
                                break;
                            }
                            next.b.b(false);
                        }
                    }
                    if (m.this.h != null) {
                        m.this.h.notifyDataSetChanged();
                    }
                }
            }
        });
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i) {
        if (this.u != null) {
            this.u.a(absListView, i);
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        View childAt;
        if (this.t != null && (childAt = absListView.getChildAt(1)) != null) {
            int top = i == 0 ? childAt.getTop() : 0;
            if (top >= 0 && !this.s) {
                this.t.a(this, top);
            }
            this.s = false;
        }
    }

    @Override // android.view.View
    public void setScrollY(int i) {
        this.s = true;
        if (this.b != null) {
            int i2 = 0;
            int firstVisiblePosition = this.b.getListView().getFirstVisiblePosition();
            if (i <= ThemePager.b) {
                if (firstVisiblePosition == 0) {
                    View childAt = this.b.getListView().getChildAt(1);
                    if (childAt != null) {
                        i2 = childAt.getTop();
                    }
                    if (i2 > ThemePager.b) {
                        this.b.getListView().setSelectionFromTop(1, ThemePager.b);
                        return;
                    }
                    return;
                }
                return;
            }
            View childAt2 = this.b.getListView().getChildAt(1);
            if (childAt2 != null) {
                i2 = childAt2.getTop();
            }
            if (i2 != i || Build.VERSION.SDK_INT >= 19) {
                this.b.getListView().setSelectionFromTop(1, i);
            }
        }
    }

    @Override // com.tsf.extend.wallpaper.p
    public void setScrollListener(com.tsf.extend.wallpaper.q qVar) {
        this.t = qVar;
    }

    @Override // com.tsf.extend.wallpaper.p
    public void setHeadViewHeight(int i) {
        if (this.b != null) {
            FrameLayout headerFrame = this.b.getHeaderFrame();
            AbsListView.LayoutParams layoutParams = (AbsListView.LayoutParams) headerFrame.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new AbsListView.LayoutParams(-1, i);
            } else {
                layoutParams.height = i;
            }
            headerFrame.setLayoutParams(layoutParams);
        }
    }

    public void setDiyButtonCallback(PersonalizationActivity.h hVar) {
        this.v = hVar;
    }

    public int getThemeMaxRowNum() {
        return this.k;
    }

    private int getTabId() {
        if (this.y.equals("new")) {
            return 3;
        }
        if (this.y.equals("hot")) {
            return 4;
        }
        if (this.y.equals("diy")) {
            return 7;
        }
        return -100;
    }

    public String getCurrentType() {
        return this.y;
    }

    protected t a(List<t.b> list, View.OnClickListener onClickListener) {
        return new t(getContext(), this.g, this);
    }

    private void e(k kVar) {
    }

    public String getReportPos() {
        if (j[0].equals(this.y)) {
            return "101";
        }
        if (j[1].equals(this.y)) {
            return "102";
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z, int i, long j2) {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.tsf.extend.wallpaper.l.a().a(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.tsf.extend.wallpaper.l.a().b(this);
    }

    @Override // com.tsf.extend.wallpaper.l.a
    public void a(k kVar) {
    }

    @Override // com.tsf.extend.wallpaper.l.a
    public void a(k kVar, float f) {
    }

    @Override // com.tsf.extend.wallpaper.l.a
    public void a(k kVar, b bVar) {
        kVar.d(true);
        if (this.h != null && this.h.a(kVar)) {
            this.h.notifyDataSetChanged();
        }
    }

    @Override // com.tsf.extend.wallpaper.l.a
    public void b(k kVar) {
    }

    @Override // com.tsf.extend.wallpaper.l.a
    public void c(k kVar) {
    }
}
