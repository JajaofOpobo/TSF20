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
import com.tsf.extend.C1536f;
import com.tsf.extend.C1547h;
import com.tsf.extend.base.InterfaceC1385d;
import com.tsf.extend.base.actstru.model.activi.PageActivity;
import com.tsf.extend.base.p071b.C1368a;
import com.tsf.extend.base.p074d.AbstractC1386a;
import com.tsf.extend.base.p080j.C1455z;
import com.tsf.extend.base.widget.pulltorefresh.C1518d;
import com.tsf.extend.base.widget.pulltorefresh.PullToRefreshAndLoadMoreListView;
import com.tsf.extend.base.widget.pulltorefresh.PullToRefreshBase;
import com.tsf.extend.theme.C1887t;
import com.tsf.extend.wallpaper.C2058aj;
import com.tsf.extend.wallpaper.C2087l;
import com.tsf.extend.wallpaper.InterfaceC2099p;
import com.tsf.extend.wallpaper.InterfaceC2100q;
import com.tsf.extend.wallpaper.PersonalizationActivity;
import com.tsf.extend.wallpaper.View$OnClickListenerC2040ad;
import com.tsf.shell.theme.inside.element.ThemeElementType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
/* renamed from: com.tsf.extend.theme.m */
/* loaded from: classes.dex */
public class View$OnClickListenerC1850m extends FrameLayout implements View.OnClickListener, AbsListView.OnScrollListener, AbstractC1386a.InterfaceC1396a<List<C1848k>>, PersonalizationActivity.InterfaceC1942b, PersonalizationActivity.InterfaceC1954n, C2087l.InterfaceC2093a, InterfaceC2099p {

    /* renamed from: a */
    protected PageActivity f5948a;

    /* renamed from: b */
    protected PullToRefreshAndLoadMoreListView f5949b;

    /* renamed from: c */
    protected View f5950c;

    /* renamed from: d */
    protected View f5951d;

    /* renamed from: e */
    protected boolean f5952e;

    /* renamed from: f */
    protected long f5953f;

    /* renamed from: g */
    protected List<C1887t.C1890b> f5954g;

    /* renamed from: h */
    protected C1887t f5955h;

    /* renamed from: i */
    protected C1862p f5956i;

    /* renamed from: k */
    protected int f5957k;

    /* renamed from: l */
    private ProgressBar f5958l;

    /* renamed from: m */
    private TextView f5959m;

    /* renamed from: o */
    private C1855a f5960o;

    /* renamed from: p */
    private C1855a f5961p;

    /* renamed from: q */
    private View$OnClickListenerC2040ad.C2044a f5962q;

    /* renamed from: r */
    private long f5963r;

    /* renamed from: s */
    private boolean f5964s;

    /* renamed from: t */
    private InterfaceC2100q f5965t;

    /* renamed from: u */
    private PersonalizationActivity.InterfaceC1949i f5966u;

    /* renamed from: v */
    private PersonalizationActivity.InterfaceC1948h f5967v;

    /* renamed from: w */
    private long f5968w;

    /* renamed from: x */
    private boolean f5969x;

    /* renamed from: y */
    private String f5970y;

    /* renamed from: z */
    private boolean f5971z;

    /* renamed from: n */
    private static final FrameLayout.LayoutParams f5947n = new FrameLayout.LayoutParams(-1, -1);

    /* renamed from: j */
    public static String[] f5946j = {"new", "hot", "diy", "category"};

    public View$OnClickListenerC1850m(Context context, PageActivity pageActivity, String str, PersonalizationActivity.InterfaceC1949i interfaceC1949i) {
        super(context);
        AbstractC1386a.EnumC1397b enumC1397b;
        this.f5952e = false;
        this.f5954g = new ArrayList();
        this.f5963r = 0L;
        this.f5956i = null;
        this.f5968w = 0L;
        this.f5969x = false;
        this.f5970y = f5946j[0];
        this.f5971z = true;
        this.f5957k = 0;
        this.f5970y = str;
        this.f5948a = pageActivity;
        this.f5966u = interfaceC1949i;
        this.f5949b = (PullToRefreshAndLoadMoreListView) LayoutInflater.from(getContext()).inflate(C1536f.C1542f.wallpaper_list, (ViewGroup) null);
        this.f5949b.setHeaderResizeEnabled(true);
        addView(this.f5949b, f5947n);
        this.f5949b.setOnScrollListener(this);
        this.f5950c = LayoutInflater.from(getContext()).inflate(C1536f.C1542f.retry_item, (ViewGroup) null);
        ((TextView) this.f5950c.findViewById(C1536f.C1541e.retry_text)).setTextColor(getResources().getColorStateList(C1536f.C1540d.wallpaper_list_retry_text_color));
        this.f5950c.setOnClickListener(this);
        this.f5951d = LayoutInflater.from(getContext()).inflate(C1536f.C1542f.wallpaper_loadmore, (ViewGroup) null);
        this.f5958l = (ProgressBar) this.f5951d.findViewById(C1536f.C1541e.loadmore_progress);
        this.f5958l.setIndeterminateDrawable(new C1518d(getContext(), 3, 1));
        this.f5959m = (TextView) this.f5951d.findViewById(C1536f.C1541e.loadmore_tips);
        this.f5959m.setOnClickListener(this);
        this.f5950c.setSoundEffectsEnabled(true);
        this.f5959m.setSoundEffectsEnabled(true);
        this.f5949b.setLoadMoreView(this.f5951d);
        this.f5949b.setMode(PullToRefreshBase.EnumC1491b.PULL_FROM_START);
        this.f5949b.setCanLoadMore(true);
        this.f5955h = mo7027a(this.f5954g, this);
        if (f5946j[0].equals(this.f5970y)) {
            this.f5955h.m7133a("DATA_NEW");
        } else if (f5946j[1].equals(this.f5970y)) {
            this.f5955h.m7133a("DATA_HOT");
        } else if (f5946j[3].equals(this.f5970y)) {
            this.f5955h.m7133a("DATA_CATEGORY");
        } else if (f5946j[2].equals(this.f5970y)) {
            this.f5955h.m7133a("DATA_DIY");
        }
        this.f5949b.setAdapter(this.f5955h);
        if (((Activity) getContext()).getIntent().getBooleanExtra("force_refresh", false)) {
            enumC1397b = AbstractC1386a.EnumC1397b.Refresh;
        } else {
            enumC1397b = AbstractC1386a.EnumC1397b.LoadCache;
        }
        this.f5960o = new C1855a(enumC1397b);
        this.f5949b.setOnLoadListener(new PullToRefreshAndLoadMoreListView.InterfaceC1486a() { // from class: com.tsf.extend.theme.m.1
            @Override // com.tsf.extend.base.widget.pulltorefresh.PullToRefreshAndLoadMoreListView.InterfaceC1486a
            /* renamed from: a */
            public void mo6254a() {
                View$OnClickListenerC1850m.this.f5953f = System.currentTimeMillis();
                if (!View$OnClickListenerC1850m.this.f5971z) {
                    View$OnClickListenerC1850m.this.m7256b();
                    return;
                }
                View$OnClickListenerC1850m.this.f5960o = new C1855a(AbstractC1386a.EnumC1397b.LoadCache);
                C1894v.m7069h().mo8250a(View$OnClickListenerC1850m.this.getCurrentDataType(), View$OnClickListenerC1850m.this.f5960o, AbstractC1386a.EnumC1397b.LoadCache, (JSONObject) null);
            }

            @Override // com.tsf.extend.base.widget.pulltorefresh.PullToRefreshAndLoadMoreListView.InterfaceC1486a
            /* renamed from: b */
            public void mo6253b() {
                if (View$OnClickListenerC1850m.this.f5952e) {
                    View$OnClickListenerC1850m.this.m7253c();
                } else {
                    View$OnClickListenerC1850m.this.m7250d();
                }
            }
        });
        int m7012a = PersonalizationActivity.m7012a(getContext(), 1.0f);
        this.f5962q = new View$OnClickListenerC2040ad.C2044a(m7012a, m7012a);
        if (Build.VERSION.SDK_INT >= 11) {
            this.f5962q.setColor(ThemeElementType.PARSER_CONFIG_ALL);
        }
        this.f5949b.setDivider(null);
        C1368a c1368a = C1894v.m7069h().m8792d().get(getCurrentDataType());
        if (c1368a != null && c1368a.m8875a() != null) {
            this.f5971z = false;
            this.f5952e = c1368a.m8868b();
            mo7026a(c1368a.m8875a(), false);
        } else {
            this.f5949b.m8401k();
        }
        if (this.f5948a instanceof PersonalizationActivity) {
            ((PersonalizationActivity) this.f5948a).m7005a((PersonalizationActivity.InterfaceC1942b) this);
            ((PersonalizationActivity) this.f5948a).m7003a((PersonalizationActivity.InterfaceC1954n) this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m7256b() {
        this.f5968w = System.currentTimeMillis();
        this.f5960o = new C1855a(AbstractC1386a.EnumC1397b.Refresh);
        C1894v.m7069h().mo8250a(getCurrentDataType(), this.f5960o, AbstractC1386a.EnumC1397b.Refresh, (JSONObject) null);
    }

    private String getSecondtab() {
        if (f5946j[0].equals(this.f5970y)) {
            return "1";
        }
        if (f5946j[1].equals(this.f5970y)) {
            return "2";
        }
        if (!f5946j[2].equals(this.f5970y)) {
            return "4";
        }
        return "3";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m7253c() {
        if (this.f5954g != null && this.f5954g.size() > 0) {
            this.f5961p = new C1855a(AbstractC1386a.EnumC1397b.LoadMore);
            this.f5968w = System.currentTimeMillis();
            C1894v.m7069h().mo8250a(getCurrentDataType(), this.f5961p, AbstractC1386a.EnumC1397b.LoadMore, (JSONObject) null);
        }
    }

    public String getCurrentDataType() {
        if (f5946j[0].equals(this.f5970y)) {
            return "DATA_NEW";
        }
        if (f5946j[1].equals(this.f5970y)) {
            return "DATA_HOT";
        }
        if (f5946j[3].equals(this.f5970y)) {
            return "DATA_CATEGORY";
        }
        return "DATA_DIY";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public void m7250d() {
        this.f5958l.setVisibility(8);
        this.f5959m.setVisibility(0);
        this.f5959m.setClickable(false);
        this.f5959m.setText(C1536f.C1543g.theme_no_more);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public void m7247e() {
        this.f5958l.setVisibility(8);
        this.f5959m.setVisibility(0);
        this.f5959m.setClickable(true);
        this.f5959m.setText(C1536f.C1543g.load_more_fail);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == C1536f.C1541e.retry) {
            this.f5950c.setVisibility(8);
            this.f5960o = new C1855a(AbstractC1386a.EnumC1397b.Refresh);
            this.f5968w = System.currentTimeMillis();
            C1894v.m7069h().mo8250a(getCurrentDataType(), this.f5960o, AbstractC1386a.EnumC1397b.Refresh, (JSONObject) null);
        } else if (id == C1536f.C1541e.theme_item_download_layout_left) {
            if (C1696ao.m7774b().m7769g()) {
                m7252c(view);
            } else {
                m7255b(view.findViewById(C1536f.C1541e.theme_download_left));
            }
        } else if (id == C1536f.C1541e.theme_item_download_layout_mid) {
            if (C1696ao.m7774b().m7769g()) {
                m7252c(view);
            } else {
                m7255b(view.findViewById(C1536f.C1541e.theme_download_mid));
            }
        } else if (id == C1536f.C1541e.theme_item_download_layout_right) {
            if (C1696ao.m7774b().m7769g()) {
                m7252c(view);
            } else {
                m7255b(view.findViewById(C1536f.C1541e.theme_download_right));
            }
        } else if (id == C1536f.C1541e.loadmore_tips) {
            this.f5958l.setVisibility(0);
            this.f5959m.setVisibility(8);
            m7253c();
        } else {
            m7252c(view);
        }
        m7265a(view);
    }

    /* renamed from: a */
    public void m7265a(View view) {
    }

    @Override // com.tsf.extend.base.p074d.AbstractC1386a.InterfaceC1396a
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void mo6245a(JSONObject jSONObject, final List<C1848k> list) {
        if (list != null) {
            C1455z.m8564a(0, new Runnable() { // from class: com.tsf.extend.theme.m.2
                @Override // java.lang.Runnable
                public void run() {
                    String str;
                    if (View$OnClickListenerC1850m.this.f5954g != null) {
                        for (C1887t.C1890b c1890b : View$OnClickListenerC1850m.this.f5954g) {
                            if (c1890b.m7118e() == null) {
                                C1848k c1848k = c1890b.f6082a;
                                C1848k c1848k2 = c1890b.f6083b;
                                C1848k c1848k3 = c1890b.f6084c;
                                c1848k.m7306d(false);
                                if (c1848k2 != null) {
                                    c1848k2.m7306d(false);
                                }
                                if (c1848k3 != null) {
                                    c1848k3.m7306d(false);
                                }
                                for (C1848k c1848k4 : list) {
                                    if (c1848k4 == null || (c1848k4 instanceof AbstractC1700aq)) {
                                        if (!(c1848k4 instanceof C1703b)) {
                                            str = null;
                                        } else {
                                            str = ((C1703b) c1848k4).m7747f();
                                        }
                                    } else {
                                        str = c1848k4.m7300g();
                                    }
                                    if (str != null) {
                                        if (str.equals(c1848k.m7300g())) {
                                            c1848k.m7306d(true);
                                        }
                                        if (c1848k2 != null && str.equals(c1848k2.m7300g())) {
                                            c1848k2.m7306d(true);
                                        }
                                        if (c1848k3 != null && str.equals(c1848k3.m7300g())) {
                                            c1848k3.m7306d(true);
                                        }
                                    }
                                }
                            }
                        }
                        View$OnClickListenerC1850m.this.f5955h.notifyDataSetChanged();
                    }
                }
            });
        }
    }

    @Override // com.tsf.extend.base.p074d.AbstractC1386a.InterfaceC1396a
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void mo6247a(JSONObject jSONObject, int i, List<C1848k> list) {
    }

    /* renamed from: b */
    private void m7255b(View view) {
        C1848k c1848k = (C1848k) view.getTag();
        if (!c1848k.m7272v()) {
            this.f5948a.m8921a(false);
            C1920x.m7052a(getContext(), c1848k.m7289k(), "tsf_theme_center_theme");
            C1894v.m7069h().m7088b(c1848k.m7297h());
            if (this.f5970y.equals("new")) {
            }
            m7246e(c1848k);
            return;
        }
        m7252c(view);
    }

    /* renamed from: d */
    private void m7249d(C1848k c1848k) {
        if (c1848k != null) {
            Context context = getContext();
            String m7300g = c1848k.m7300g();
            if (context.getPackageManager() != null) {
                if (C2058aj.m6554a(getContext(), m7300g)) {
                    this.f5948a.m8921a(false);
                    return;
                }
                ThemeDetail themeDetail = (ThemeDetail) LayoutInflater.from(getContext()).inflate(C1536f.C1542f.theme_detail, (ViewGroup) null);
                if (this.f5970y.equals("diy")) {
                    themeDetail.m8068i();
                }
                themeDetail.setFromTab(this.f5970y);
                themeDetail.setTheme(c1848k);
                themeDetail.m8092a(this.f5970y.equals("new") ? "1001" : "1004", "1010");
                this.f5948a.m8922a(themeDetail);
            }
        }
    }

    /* renamed from: c */
    private void m7252c(View view) {
        C1848k c1848k;
        Object tag = view.getTag();
        if (tag instanceof C1887t.C1892d) {
            if (view.getId() == C1536f.C1541e.theme_item_left) {
                c1848k = ((C1887t.C1892d) tag).f6088a;
            } else if (view.getId() == C1536f.C1541e.theme_item_mid) {
                c1848k = ((C1887t.C1892d) tag).f6102o;
            } else {
                c1848k = ((C1887t.C1892d) tag).f6095h;
            }
        } else if (!(tag instanceof C1848k)) {
            c1848k = null;
        } else {
            c1848k = (C1848k) tag;
        }
        if (c1848k != null) {
            if (Math.abs(this.f5963r - System.currentTimeMillis()) > 1500) {
                this.f5963r = System.currentTimeMillis();
                m7249d(c1848k);
            }
            switch (getTabId()) {
            }
            if (c1848k.m7270x() != 1 && c1848k.m7300g().contains("DIY_")) {
            }
            InterfaceC1385d m8293a = C1547h.m8293a();
            if (m8293a != null) {
                m8293a.mo8812b(c1848k.m7297h() + "");
            }
        }
    }

    @Override // com.tsf.extend.wallpaper.PersonalizationActivity.InterfaceC1954n
    /* renamed from: a */
    public void mo6940a(String str, PersonalizationActivity.InterfaceC1954n.EnumC1955a enumC1955a) {
        if (enumC1955a != null) {
            C1894v.m7069h().m7106a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.extend.theme.m$a */
    /* loaded from: classes.dex */
    public class C1855a implements AbstractC1386a.InterfaceC1396a<C1368a> {

        /* renamed from: b */
        private AbstractC1386a.EnumC1397b f5979b;

        public C1855a(AbstractC1386a.EnumC1397b enumC1397b) {
            this.f5979b = enumC1397b;
        }

        @Override // com.tsf.extend.base.p074d.AbstractC1386a.InterfaceC1396a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo6245a(JSONObject jSONObject, final C1368a c1368a) {
            if (c1368a == null) {
                mo6247a(jSONObject, 0, (C1368a) null);
            } else {
                C1455z.m8564a(0, new Runnable() { // from class: com.tsf.extend.theme.m.a.1
                    @Override // java.lang.Runnable
                    public void run() {
                        boolean z;
                        if (c1368a instanceof C1862p) {
                            C1862p c1862p = (C1862p) c1368a;
                            View$OnClickListenerC1850m.this.f5952e = c1862p.m8868b();
                            if (C1855a.this.f5979b != AbstractC1386a.EnumC1397b.LoadMore) {
                                View$OnClickListenerC1850m.this.f5971z = false;
                                View$OnClickListenerC1850m.this.m7244f();
                                if (View$OnClickListenerC1850m.this.f5967v != null) {
                                    View$OnClickListenerC1850m.this.f5967v.mo6947b(c1862p.mo7219l());
                                }
                                View$OnClickListenerC1850m.this.f5949b.m8430b(false);
                                View$OnClickListenerC1850m.this.m7266a();
                                boolean mo7026a = View$OnClickListenerC1850m.this.mo7026a(c1862p.m8875a(), false);
                                View$OnClickListenerC1850m.this.f5956i = c1862p;
                                z = mo7026a;
                            } else {
                                if (!View$OnClickListenerC1850m.this.f5952e) {
                                    View$OnClickListenerC1850m.this.m7250d();
                                } else {
                                    View$OnClickListenerC1850m.this.f5949b.m8430b(false);
                                }
                                z = View$OnClickListenerC1850m.this.m7259a(c1862p.m8875a());
                            }
                            if (z && !View$OnClickListenerC1850m.this.f5969x) {
                                C1894v.m7069h().m7106a(View$OnClickListenerC1850m.this);
                            }
                            View$OnClickListenerC1850m.this.m7257a(true, 0, System.currentTimeMillis() - View$OnClickListenerC1850m.this.f5968w);
                        }
                    }
                });
            }
        }

        @Override // com.tsf.extend.base.p074d.AbstractC1386a.InterfaceC1396a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo6247a(JSONObject jSONObject, final int i, final C1368a c1368a) {
            C1455z.m8564a(0, new Runnable() { // from class: com.tsf.extend.theme.m.a.2
                @Override // java.lang.Runnable
                public void run() {
                    View$OnClickListenerC1850m.this.f5957k = 0;
                    if (C1855a.this.f5979b == AbstractC1386a.EnumC1397b.LoadMore) {
                        View$OnClickListenerC1850m.this.m7247e();
                    } else {
                        View$OnClickListenerC1850m.this.f5971z = false;
                        View$OnClickListenerC1850m.this.m7244f();
                        if (c1368a != null) {
                            View$OnClickListenerC1850m.this.f5952e = c1368a.m8868b();
                        }
                        View$OnClickListenerC1850m.this.mo7026a(c1368a == null ? null : c1368a.m8875a(), false);
                    }
                    View$OnClickListenerC1850m.this.m7257a(false, i, System.currentTimeMillis() - View$OnClickListenerC1850m.this.f5968w);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public void m7244f() {
        long j;
        long currentTimeMillis = System.currentTimeMillis() - this.f5953f;
        if (currentTimeMillis > 200) {
            j = 0;
        } else {
            j = 200 - currentTimeMillis;
        }
        C1455z.m8563a(0, new Runnable() { // from class: com.tsf.extend.theme.m.3
            @Override // java.lang.Runnable
            public void run() {
                View$OnClickListenerC1850m.this.f5949b.m8402j();
            }
        }, j);
    }

    /* renamed from: a */
    public void m7266a() {
        this.f5958l.setVisibility(0);
        this.f5959m.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public boolean m7259a(List<C1848k> list) {
        if (list == null || list.size() == 0) {
            return false;
        }
        return mo7026a(list, true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo7026a(List<C1848k> list, boolean z) {
        C1887t.C1890b c1890b;
        if (!z) {
            this.f5957k = 0;
            this.f5954g.clear();
            if (list == null || list.size() == 0) {
                this.f5955h.notifyDataSetChanged();
                this.f5950c.setVisibility(0);
                this.f5949b.setEmptyView(this.f5950c);
                return false;
            }
        }
        String m6976f = ((PersonalizationActivity) this.f5948a).m6976f();
        if (m6976f != null && m6976f.startsWith("DIY://")) {
            for (C1848k c1848k : list) {
                if (c1848k instanceof AbstractC1700aq) {
                    if (!TextUtils.isEmpty(m6976f) && m6976f.contains(((AbstractC1700aq) c1848k).m7764I())) {
                        c1848k.m7314b(true);
                    } else {
                        c1848k.m7314b(false);
                    }
                }
            }
        } else {
            for (C1848k c1848k2 : list) {
                if (!TextUtils.isEmpty(m6976f) && m6976f.equals(c1848k2.m7300g())) {
                    c1848k2.m7314b(true);
                } else {
                    c1848k2.m7314b(false);
                }
            }
        }
        C1887t.C1890b c1890b2 = this.f5954g.size() > 0 ? this.f5954g.get(this.f5954g.size() - 1) : null;
        if (c1890b2 != null && c1890b2.m7122b() == null && list.size() > 1) {
            C1848k remove = list.remove(0);
            remove.m7302f(c1890b2.m7124a().m7268z() + 1);
            c1890b2.m7123a(remove);
        }
        if (c1890b2 != null && c1890b2.m7120c() == null && list.size() > 1) {
            C1848k remove2 = list.remove(0);
            remove2.m7302f(c1890b2.m7124a().m7268z() + 2);
            c1890b2.m7121b(remove2);
        }
        int i = 0;
        while (i < list.size() / 3) {
            C1848k c1848k3 = list.get(i * 3);
            int i2 = (this.f5957k + i + 1) * 10;
            c1848k3.m7302f(i2 + 1);
            C1848k c1848k4 = list.get((i * 3) + 1);
            c1848k4.m7302f(i2 + 2);
            C1848k c1848k5 = list.get((i * 3) + 2);
            c1848k5.m7302f(i2 + 3);
            this.f5954g.add(new C1887t.C1890b(c1848k3, c1848k4, c1848k5));
            i++;
        }
        int size = list.size() % 3;
        if (size != 0) {
            if (size == 1) {
                C1848k c1848k6 = list.get(list.size() - 1);
                c1848k6.m7302f(((this.f5957k + ((list.size() + 1) / 3)) * 10) + 1);
                c1890b = new C1887t.C1890b(c1848k6, null, null);
            } else if (size == 2) {
                C1848k c1848k7 = list.get(list.size() - 2);
                int size2 = (this.f5957k + ((list.size() + 1) / 3)) * 10;
                c1848k7.m7302f(size2 + 1);
                C1848k c1848k8 = list.get(list.size() - 1);
                c1848k8.m7302f(size2 + 2);
                c1890b = new C1887t.C1890b(c1848k7, c1848k8, null);
            } else {
                c1890b = null;
            }
            this.f5954g.add(c1890b);
            this.f5957k = this.f5957k + i + 1;
        } else {
            this.f5957k += i;
        }
        this.f5955h.notifyDataSetChanged();
        return true;
    }

    @Override // com.tsf.extend.wallpaper.PersonalizationActivity.InterfaceC1942b
    /* renamed from: a */
    public void mo6959a(final String str) {
        C1455z.m8564a(0, new Runnable() { // from class: com.tsf.extend.theme.m.4
            @Override // java.lang.Runnable
            public void run() {
                if (View$OnClickListenerC1850m.this.f5954g != null && View$OnClickListenerC1850m.this.f5954g.size() > 0) {
                    Iterator<C1887t.C1890b> it = View$OnClickListenerC1850m.this.f5954g.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C1887t.C1890b next = it.next();
                        if (next.f6082a != null) {
                            if (!TextUtils.isEmpty(str) && str.equals(next.f6082a.m7300g())) {
                                next.f6082a.m7314b(true);
                                break;
                            }
                            next.f6082a.m7314b(false);
                        }
                        if (next.f6083b != null) {
                            if (!TextUtils.isEmpty(str) && str.equals(next.f6083b.m7300g())) {
                                next.f6083b.m7314b(true);
                                break;
                            }
                            next.f6083b.m7314b(false);
                        }
                    }
                    if (View$OnClickListenerC1850m.this.f5955h != null) {
                        View$OnClickListenerC1850m.this.f5955h.notifyDataSetChanged();
                    }
                }
            }
        });
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i) {
        if (this.f5966u != null) {
            this.f5966u.mo6726a(absListView, i);
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        View childAt;
        if (this.f5965t != null && (childAt = absListView.getChildAt(1)) != null) {
            int top = i == 0 ? childAt.getTop() : 0;
            if (top >= 0 && !this.f5964s) {
                this.f5965t.mo6414a(this, top);
            }
            this.f5964s = false;
        }
    }

    @Override // android.view.View
    public void setScrollY(int i) {
        this.f5964s = true;
        if (this.f5949b != null) {
            int i2 = 0;
            int firstVisiblePosition = this.f5949b.getListView().getFirstVisiblePosition();
            if (i <= ThemePager.f5209b) {
                if (firstVisiblePosition == 0) {
                    View childAt = this.f5949b.getListView().getChildAt(1);
                    if (childAt != null) {
                        i2 = childAt.getTop();
                    }
                    if (i2 > ThemePager.f5209b) {
                        this.f5949b.getListView().setSelectionFromTop(1, ThemePager.f5209b);
                        return;
                    }
                    return;
                }
                return;
            }
            View childAt2 = this.f5949b.getListView().getChildAt(1);
            if (childAt2 != null) {
                i2 = childAt2.getTop();
            }
            if (i2 != i || Build.VERSION.SDK_INT >= 19) {
                this.f5949b.getListView().setSelectionFromTop(1, i);
            }
        }
    }

    @Override // com.tsf.extend.wallpaper.InterfaceC2099p
    public void setScrollListener(InterfaceC2100q interfaceC2100q) {
        this.f5965t = interfaceC2100q;
    }

    @Override // com.tsf.extend.wallpaper.InterfaceC2099p
    public void setHeadViewHeight(int i) {
        if (this.f5949b != null) {
            FrameLayout headerFrame = this.f5949b.getHeaderFrame();
            AbsListView.LayoutParams layoutParams = (AbsListView.LayoutParams) headerFrame.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new AbsListView.LayoutParams(-1, i);
            } else {
                layoutParams.height = i;
            }
            headerFrame.setLayoutParams(layoutParams);
        }
    }

    public void setDiyButtonCallback(PersonalizationActivity.InterfaceC1948h interfaceC1948h) {
        this.f5967v = interfaceC1948h;
    }

    public int getThemeMaxRowNum() {
        return this.f5957k;
    }

    private int getTabId() {
        if (this.f5970y.equals("new")) {
            return 3;
        }
        if (this.f5970y.equals("hot")) {
            return 4;
        }
        if (this.f5970y.equals("diy")) {
            return 7;
        }
        return -100;
    }

    public String getCurrentType() {
        return this.f5970y;
    }

    /* renamed from: a */
    protected C1887t mo7027a(List<C1887t.C1890b> list, View.OnClickListener onClickListener) {
        return new C1887t(getContext(), this.f5954g, this);
    }

    /* renamed from: e */
    private void m7246e(C1848k c1848k) {
    }

    public String getReportPos() {
        if (f5946j[0].equals(this.f5970y)) {
            return "101";
        }
        if (f5946j[1].equals(this.f5970y)) {
            return "102";
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m7257a(boolean z, int i, long j) {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C2087l.m6470a().m6466a(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C2087l.m6470a().m6462b(this);
    }

    @Override // com.tsf.extend.wallpaper.C2087l.InterfaceC2093a
    /* renamed from: a */
    public void mo6456a(C1848k c1848k) {
    }

    @Override // com.tsf.extend.wallpaper.C2087l.InterfaceC2093a
    /* renamed from: a */
    public void mo6455a(C1848k c1848k, float f) {
    }

    @Override // com.tsf.extend.wallpaper.C2087l.InterfaceC2093a
    /* renamed from: a */
    public void mo6454a(C1848k c1848k, C1703b c1703b) {
        c1848k.m7306d(true);
        if (this.f5955h != null && this.f5955h.m7137a(c1848k)) {
            this.f5955h.notifyDataSetChanged();
        }
    }

    @Override // com.tsf.extend.wallpaper.C2087l.InterfaceC2093a
    /* renamed from: b */
    public void mo6453b(C1848k c1848k) {
    }

    @Override // com.tsf.extend.wallpaper.C2087l.InterfaceC2093a
    /* renamed from: c */
    public void mo6452c(C1848k c1848k) {
    }
}
