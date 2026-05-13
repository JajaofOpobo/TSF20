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
import com.tsf.extend.C1536f;
import com.tsf.extend.C1547h;
import com.tsf.extend.DialogInterfaceC1526e;
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
import com.tsf.extend.wallpaper.View$OnClickListenerC2040ad;
import com.tsf.extend.wallpaper.View$OnClickListenerC2107t;
import java.util.List;
import org.json.JSONObject;
@SuppressLint({"InflateParams"})
/* renamed from: com.tsf.extend.wallpaper.af */
/* loaded from: classes.dex */
public class DialogInterface$OnClickListenerC2048af extends FrameLayout implements DialogInterface.OnClickListener, View.OnClickListener, AbsListView.OnScrollListener, InterfaceC2099p, View$OnClickListenerC2107t.InterfaceC2109a {

    /* renamed from: j */
    private static final FrameLayout.LayoutParams f6665j = new FrameLayout.LayoutParams(-1, -1);

    /* renamed from: A */
    private DialogInterfaceC1526e f6666A;

    /* renamed from: B */
    private final String f6667B;

    /* renamed from: C */
    private final String f6668C;

    /* renamed from: D */
    private final int f6669D;

    /* renamed from: E */
    private final String f6670E;

    /* renamed from: F */
    private final String f6671F;

    /* renamed from: G */
    private EnumC2052a f6672G;

    /* renamed from: a */
    protected PullToRefreshAndLoadMoreListView f6673a;

    /* renamed from: b */
    protected View$OnClickListenerC2107t f6674b;

    /* renamed from: c */
    protected View f6675c;

    /* renamed from: d */
    protected List<C2094m> f6676d;

    /* renamed from: e */
    protected List<View$OnClickListenerC2107t.C2112d> f6677e;

    /* renamed from: f */
    protected int f6678f;

    /* renamed from: g */
    EnumC2057ai f6679g;

    /* renamed from: h */
    protected long f6680h;

    /* renamed from: i */
    private PageActivity f6681i;

    /* renamed from: k */
    private long f6682k;

    /* renamed from: l */
    private boolean f6683l;

    /* renamed from: m */
    private int f6684m;

    /* renamed from: n */
    private int f6685n;

    /* renamed from: o */
    private int f6686o;

    /* renamed from: p */
    private View$OnClickListenerC2040ad.C2044a f6687p;

    /* renamed from: q */
    private View f6688q;

    /* renamed from: r */
    private TextView f6689r;

    /* renamed from: s */
    private ProgressBar f6690s;

    /* renamed from: t */
    private boolean f6691t;

    /* renamed from: u */
    private C2053b f6692u;

    /* renamed from: v */
    private C2053b f6693v;

    /* renamed from: w */
    private int f6694w;

    /* renamed from: x */
    private InterfaceC2100q f6695x;

    /* renamed from: y */
    private boolean f6696y;

    /* renamed from: z */
    private PersonalizationActivity.InterfaceC1949i f6697z;

    /* renamed from: com.tsf.extend.wallpaper.af$a */
    /* loaded from: classes.dex */
    private enum EnumC2052a {
        INSTALL,
        UPDATE
    }

    public DialogInterface$OnClickListenerC2048af(Context context, EnumC2057ai enumC2057ai, PageActivity pageActivity, PersonalizationActivity.InterfaceC1949i interfaceC1949i) {
        this(context, enumC2057ai, pageActivity, -1L, false);
        this.f6697z = interfaceC1949i;
    }

    public DialogInterface$OnClickListenerC2048af(Context context, EnumC2057ai enumC2057ai, PageActivity pageActivity, long j, boolean z) {
        super(context);
        this.f6675c = null;
        this.f6682k = 0L;
        this.f6683l = true;
        this.f6678f = 0;
        this.f6684m = 0;
        this.f6679g = EnumC2057ai.LiveWallpaperTabType;
        this.f6691t = false;
        this.f6680h = -1L;
        this.f6696y = false;
        this.f6697z = null;
        this.f6667B = "com.roidapp.photogrid";
        this.f6668C = "com.roidapp.photogrid.MainPage";
        this.f6669D = 219;
        this.f6670E = "4.892";
        this.f6671F = "market://details?id=com.roidapp.photogrid&referrer=utm_source%3DCMLauncher%26utm_medium%3D400001";
        if (enumC2057ai == EnumC2057ai.CategoryType) {
            this.f6680h = j;
        }
        this.f6679g = enumC2057ai;
        this.f6681i = pageActivity;
        this.f6676d = Lists.newArrayList();
        this.f6677e = Lists.newArrayList();
        this.f6673a = (PullToRefreshAndLoadMoreListView) LayoutInflater.from(getContext()).inflate(C1536f.C1542f.wallpaper_list, (ViewGroup) null);
        this.f6673a.setHeaderResizeEnabled(true);
        addView(this.f6673a, f6665j);
        this.f6675c = LayoutInflater.from(getContext()).inflate(C1536f.C1542f.retry_item, (ViewGroup) null);
        ((TextView) this.f6675c.findViewById(C1536f.C1541e.retry_text)).setTextColor(getResources().getColorStateList(C1536f.C1540d.wallpaper_list_retry_text_color));
        this.f6675c.setOnClickListener(this);
        this.f6688q = LayoutInflater.from(getContext()).inflate(C1536f.C1542f.wallpaper_loadmore, (ViewGroup) null);
        this.f6690s = (ProgressBar) this.f6688q.findViewById(C1536f.C1541e.loadmore_progress);
        this.f6690s.setIndeterminateDrawable(new C1518d(getContext(), 3, 1));
        this.f6689r = (TextView) this.f6688q.findViewById(C1536f.C1541e.loadmore_tips);
        this.f6689r.setOnClickListener(this);
        this.f6673a.setLoadMoreView(this.f6688q);
        this.f6673a.setCanLoadMore(true);
        this.f6674b = new View$OnClickListenerC2107t(context, this.f6679g);
        this.f6674b.m6399a((View.OnClickListener) this);
        this.f6674b.m6396a((View$OnClickListenerC2107t.InterfaceC2109a) this);
        this.f6673a.setAdapter(this.f6674b);
        getResources().getDisplayMetrics();
        this.f6678f = this.f6674b.m6393b();
        this.f6684m = this.f6674b.m6391c();
        this.f6687p = this.f6674b.m6401a();
        this.f6673a.setDivider(this.f6687p);
        this.f6673a.setOnLoadListener(new PullToRefreshAndLoadMoreListView.InterfaceC1486a() { // from class: com.tsf.extend.wallpaper.af.1
            @Override // com.tsf.extend.base.widget.pulltorefresh.PullToRefreshAndLoadMoreListView.InterfaceC1486a
            /* renamed from: a */
            public void mo6254a() {
                DialogInterface$OnClickListenerC2048af.this.f6682k = System.currentTimeMillis();
                if (DialogInterface$OnClickListenerC2048af.this.f6683l) {
                    if (DialogInterface$OnClickListenerC2048af.this.f6692u == null) {
                        DialogInterface$OnClickListenerC2048af.this.f6692u = new C2053b(AbstractC1386a.EnumC1397b.LoadCache);
                        C2148z.m6199h().m6214a(DialogInterface$OnClickListenerC2048af.this.f6692u, AbstractC1386a.EnumC1397b.LoadCache, -1L, DialogInterface$OnClickListenerC2048af.this.f6679g.m6559a(), DialogInterface$OnClickListenerC2048af.this.f6680h, C2148z.f7091h);
                        return;
                    }
                    return;
                }
                DialogInterface$OnClickListenerC2048af.this.m6600a();
            }

            @Override // com.tsf.extend.base.widget.pulltorefresh.PullToRefreshAndLoadMoreListView.InterfaceC1486a
            /* renamed from: b */
            public void mo6253b() {
                if (!DialogInterface$OnClickListenerC2048af.this.f6691t) {
                    DialogInterface$OnClickListenerC2048af.this.m6579e();
                } else {
                    DialogInterface$OnClickListenerC2048af.this.m6588b();
                }
            }
        });
        this.f6673a.setOnScrollListener(this);
        C1368a m6219a = C2148z.m6199h().m6219a(this.f6679g.m6559a(), C2148z.f7091h);
        if (m6219a != null && m6219a.m8875a() != null) {
            this.f6683l = false;
            this.f6691t = !m6219a.m8868b();
            m6589a(m6219a.m8875a(), false);
            return;
        }
        this.f6673a.m8401k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m6600a() {
        this.f6692u = new C2053b(AbstractC1386a.EnumC1397b.Refresh);
        C2148z.m6199h().m6214a(this.f6692u, AbstractC1386a.EnumC1397b.Refresh, -1L, this.f6679g.m6559a(), this.f6680h, C2148z.f7091h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m6588b() {
        this.f6690s.setVisibility(8);
        this.f6689r.setVisibility(0);
        this.f6689r.setClickable(false);
        this.f6689r.setText(C1536f.C1543g.load_more_no);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m6583c() {
        this.f6690s.setVisibility(8);
        this.f6689r.setVisibility(0);
        this.f6689r.setClickable(true);
        this.f6689r.setText(C1536f.C1543g.load_more_fail);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public void m6581d() {
        this.f6690s.setVisibility(0);
        this.f6689r.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public void m6579e() {
        if (this.f6676d != null && this.f6676d.size() > 0) {
            this.f6693v = new C2053b(AbstractC1386a.EnumC1397b.LoadMore);
            C2094m c2094m = this.f6676d.get(this.f6676d.size() - 1);
            this.f6694w++;
            C2148z.m6199h().m6215a(this.f6693v, AbstractC1386a.EnumC1397b.LoadMore, c2094m.m6434f(), this.f6679g.m6559a(), c2094m.m6432g(), this.f6680h, C2148z.f7091h, this.f6694w);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == C1536f.C1541e.retry) {
            this.f6675c.setVisibility(8);
            this.f6673a.setMode(PullToRefreshBase.EnumC1491b.PULL_FROM_START);
            this.f6673a.m8401k();
        } else if (id == C1536f.C1541e.loadmore_tips) {
            this.f6690s.setVisibility(0);
            this.f6689r.setVisibility(8);
            m6579e();
        } else {
            m6599a(view);
        }
    }

    /* renamed from: a */
    protected boolean m6599a(View view) {
        if (view.getTag() != null && (view.getTag() instanceof C2094m)) {
            C2094m c2094m = (C2094m) view.getTag();
            if (c2094m.m6425n()) {
                InterfaceC1385d m8293a = C1547h.m8293a();
                if (m8293a != null) {
                    m8293a.mo8814a(c2094m.m6431h() + "");
                }
                C1920x.m7048b(getContext(), c2094m.m6426m(), "&referrer=utm_source%3Dtsf_theme_center_wallpaper");
                C2058aj.m6550a(this.f6676d, c2094m, this.f6679g.m6559a() + "");
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m6590a(final List<C2094m> list) {
        long j;
        long currentTimeMillis = System.currentTimeMillis() - this.f6682k;
        if (currentTimeMillis > 200) {
            j = 0;
        } else {
            j = 200 - currentTimeMillis;
        }
        C1455z.m8563a(0, new Runnable() { // from class: com.tsf.extend.wallpaper.af.2
            @Override // java.lang.Runnable
            public void run() {
                if (DialogInterface$OnClickListenerC2048af.this.f6673a != null) {
                    DialogInterface$OnClickListenerC2048af.this.f6673a.m8402j();
                }
            }
        }, j);
        C1455z.m8563a(0, new Runnable() { // from class: com.tsf.extend.wallpaper.af.3
            @Override // java.lang.Runnable
            public void run() {
                DialogInterface$OnClickListenerC2048af.this.m6589a(list, false);
            }
        }, j + 150);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m6584b(List<C2094m> list) {
        if (list != null && list.size() != 0) {
            m6589a(list, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m6591a(String str) {
        if (C1449u.m8589a(getContext())) {
        }
    }

    void setSelectIndex(int i) {
        ListView listView;
        int i2 = (i / 2) + 1;
        if (this.f6673a != null && (listView = this.f6673a.getListView()) != null) {
            int count = listView.getAdapter().getCount();
            if (i2 < 0 || i2 >= count) {
                return;
            }
            if (i2 < this.f6685n || i2 >= this.f6685n + this.f6686o) {
                listView.setSelection(i2);
            }
        }
    }

    /* renamed from: a */
    protected void m6589a(List<C2094m> list, boolean z) {
        if (!z) {
            this.f6676d.clear();
            if (list == null || list.size() == 0) {
                this.f6675c.setVisibility(0);
                if (this.f6673a != null) {
                    this.f6673a.setEmptyView(this.f6675c);
                    return;
                }
                return;
            }
        }
        this.f6676d.addAll(list);
        this.f6674b.m6394a(this.f6676d);
        this.f6674b.notifyDataSetChanged();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f6674b = new View$OnClickListenerC2107t(getContext(), this.f6679g);
        this.f6674b.m6399a((View.OnClickListener) this);
        this.f6674b.m6396a((View$OnClickListenerC2107t.InterfaceC2109a) this);
        if (this.f6679g == EnumC2057ai.NewType) {
            this.f6674b.m6392b(this.f6677e);
        } else {
            this.f6674b.m6394a(this.f6676d);
        }
        if (this.f6673a != null) {
            this.f6673a.setAdapter(this.f6674b);
        }
    }

    @Override // android.view.View
    public void setScrollY(int i) {
        this.f6696y = true;
        if (this.f6673a != null) {
            int i2 = 0;
            int firstVisiblePosition = this.f6673a.getListView().getFirstVisiblePosition();
            if (i <= WallpaperPager.f6547c + WallpaperPager.f6548d) {
                if (firstVisiblePosition == 0) {
                    View childAt = this.f6673a.getListView().getChildAt(1);
                    if (childAt != null) {
                        i2 = childAt.getTop();
                    }
                    if (i2 > WallpaperPager.f6547c + WallpaperPager.f6548d) {
                        this.f6673a.getListView().setSelectionFromTop(1, WallpaperPager.f6547c + WallpaperPager.f6548d);
                        return;
                    }
                    return;
                }
                return;
            }
            View childAt2 = this.f6673a.getListView().getChildAt(1);
            if (childAt2 != null) {
                i2 = childAt2.getTop();
            }
            if (i2 != i || Build.VERSION.SDK_INT >= 19) {
                this.f6673a.getListView().setSelectionFromTop(1, i);
            }
        }
    }

    @Override // com.tsf.extend.wallpaper.InterfaceC2099p
    public void setScrollListener(InterfaceC2100q interfaceC2100q) {
        this.f6695x = interfaceC2100q;
    }

    @Override // com.tsf.extend.wallpaper.InterfaceC2099p
    public void setHeadViewHeight(int i) {
        if (this.f6673a != null) {
            FrameLayout headerFrame = this.f6673a.getHeaderFrame();
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
    /* renamed from: com.tsf.extend.wallpaper.af$b */
    /* loaded from: classes.dex */
    public class C2053b implements AbstractC1386a.InterfaceC1396a<C1368a> {

        /* renamed from: b */
        private AbstractC1386a.EnumC1397b f6706b;

        public C2053b(AbstractC1386a.EnumC1397b enumC1397b) {
            this.f6706b = enumC1397b;
        }

        @Override // com.tsf.extend.base.p074d.AbstractC1386a.InterfaceC1396a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo6245a(JSONObject jSONObject, C1368a c1368a) {
            if (c1368a == null) {
                mo6247a(jSONObject, 0, (C1368a) null);
                return;
            }
            DialogInterface$OnClickListenerC2048af.this.f6691t = !c1368a.m8868b();
            if (this.f6706b == AbstractC1386a.EnumC1397b.LoadMore) {
                if (DialogInterface$OnClickListenerC2048af.this.f6691t) {
                    DialogInterface$OnClickListenerC2048af.this.m6588b();
                } else if (DialogInterface$OnClickListenerC2048af.this.f6673a != null) {
                    DialogInterface$OnClickListenerC2048af.this.f6673a.m8430b(false);
                }
                DialogInterface$OnClickListenerC2048af.this.f6694w = c1368a.m8859f();
                DialogInterface$OnClickListenerC2048af.this.m6584b(c1368a.m8875a());
                return;
            }
            DialogInterface$OnClickListenerC2048af.this.f6694w = c1368a.m8859f();
            if (DialogInterface$OnClickListenerC2048af.this.f6673a != null) {
                DialogInterface$OnClickListenerC2048af.this.f6673a.m8430b(false);
            }
            C1455z.m8564a(0, new Runnable() { // from class: com.tsf.extend.wallpaper.af.b.1
                @Override // java.lang.Runnable
                public void run() {
                    DialogInterface$OnClickListenerC2048af.this.m6581d();
                }
            });
            if (DialogInterface$OnClickListenerC2048af.this.f6683l) {
            }
            DialogInterface$OnClickListenerC2048af.this.f6683l = false;
            DialogInterface$OnClickListenerC2048af.this.m6590a(c1368a.m8875a());
        }

        @Override // com.tsf.extend.base.p074d.AbstractC1386a.InterfaceC1396a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo6247a(JSONObject jSONObject, int i, C1368a c1368a) {
            if (this.f6706b == AbstractC1386a.EnumC1397b.LoadMore) {
                DialogInterface$OnClickListenerC2048af.this.m6583c();
                return;
            }
            String str = DialogInterface$OnClickListenerC2048af.this.f6683l ? "2" : "1";
            DialogInterface$OnClickListenerC2048af.this.f6683l = false;
            DialogInterface$OnClickListenerC2048af.this.m6591a(str);
            if (c1368a == null && DialogInterface$OnClickListenerC2048af.this.f6673a != null) {
                DialogInterface$OnClickListenerC2048af.this.f6673a.setMode(PullToRefreshBase.EnumC1491b.DISABLED);
            }
            DialogInterface$OnClickListenerC2048af.this.m6590a(c1368a == null ? null : c1368a.m8875a());
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i) {
        if (this.f6697z != null) {
            this.f6697z.mo6726a(absListView, i);
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        View childAt;
        this.f6685n = i;
        this.f6686o = i2;
        if (this.f6695x != null && (childAt = absListView.getChildAt(1)) != null) {
            int top = i == 0 ? childAt.getTop() : 0;
            if (top >= 0 && !this.f6696y) {
                this.f6695x.mo6414a(this, top);
            }
            this.f6696y = false;
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

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.f6666A.dismiss();
        if (this.f6672G != EnumC2052a.INSTALL && this.f6672G == EnumC2052a.UPDATE) {
        }
        if (i != -2) {
            C1920x.m7052a(this.f6681i, "market://details?id=com.roidapp.photogrid&referrer=utm_source%3DCMLauncher%26utm_medium%3D400001", "tsf_theme_center_wallpaper");
        }
    }
}
