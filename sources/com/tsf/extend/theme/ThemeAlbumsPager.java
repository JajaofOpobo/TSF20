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
import com.tsf.extend.C1536f;
import com.tsf.extend.C1547h;
import com.tsf.extend.base.InterfaceC1385d;
import com.tsf.extend.base.actstru.model.activi.PageActivity;
import com.tsf.extend.base.p071b.C1368a;
import com.tsf.extend.base.p074d.AbstractC1386a;
import com.tsf.extend.base.p080j.C1437p;
import com.tsf.extend.base.p080j.C1455z;
import com.tsf.extend.base.widget.pulltorefresh.C1518d;
import com.tsf.extend.base.widget.pulltorefresh.C1519e;
import com.tsf.extend.base.widget.pulltorefresh.PullToRefreshAndLoadMoreListView;
import com.tsf.extend.base.widget.pulltorefresh.PullToRefreshBase;
import com.tsf.extend.theme.C1887t;
import com.tsf.extend.wallpaper.InterfaceC2099p;
import com.tsf.extend.wallpaper.InterfaceC2100q;
import com.tsf.extend.wallpaper.PersonalizationActivity;
import com.tsf.extend.wallpaper.View$OnClickListenerC2040ad;
import com.tsf.shell.theme.inside.element.ThemeElementType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class ThemeAlbumsPager extends LinearLayout implements View.OnClickListener, AbsListView.OnScrollListener, PageActivity.InterfaceC1352a, AbstractC1386a.InterfaceC1396a<List<C1848k>>, PersonalizationActivity.InterfaceC1942b, PersonalizationActivity.InterfaceC1954n, InterfaceC2099p {

    /* renamed from: j */
    private static final LinearLayout.LayoutParams f5025j = new LinearLayout.LayoutParams(-1, -1);

    /* renamed from: a */
    protected boolean f5026a;

    /* renamed from: b */
    protected long f5027b;

    /* renamed from: c */
    protected C1645a f5028c;

    /* renamed from: d */
    private PageActivity f5029d;

    /* renamed from: e */
    private PullToRefreshAndLoadMoreListView f5030e;

    /* renamed from: f */
    private View f5031f;

    /* renamed from: g */
    private View f5032g;

    /* renamed from: h */
    private ProgressBar f5033h;

    /* renamed from: i */
    private TextView f5034i;

    /* renamed from: k */
    private List<C1887t.C1890b> f5035k;

    /* renamed from: l */
    private C1594a f5036l;

    /* renamed from: m */
    private C1594a f5037m;

    /* renamed from: n */
    private C1887t f5038n;

    /* renamed from: o */
    private View$OnClickListenerC2040ad.C2044a f5039o;

    /* renamed from: p */
    private long f5040p;

    /* renamed from: q */
    private boolean f5041q;

    /* renamed from: r */
    private InterfaceC2100q f5042r;

    /* renamed from: s */
    private boolean f5043s;

    /* renamed from: t */
    private boolean f5044t;

    /* renamed from: u */
    private String f5045u;

    /* renamed from: v */
    private String f5046v;

    /* renamed from: w */
    private String f5047w;

    /* renamed from: x */
    private boolean f5048x;

    /* renamed from: y */
    private boolean f5049y;

    /* renamed from: z */
    private String f5050z;

    public ThemeAlbumsPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5026a = false;
        this.f5035k = new ArrayList();
        this.f5040p = 0L;
        this.f5028c = null;
        this.f5043s = false;
        this.f5044t = true;
        this.f5045u = null;
        this.f5046v = null;
        this.f5047w = null;
        this.f5048x = true;
        this.f5049y = false;
    }

    /* renamed from: g */
    public void m8152g() {
        AbstractC1386a.EnumC1397b enumC1397b;
        this.f5030e = (PullToRefreshAndLoadMoreListView) LayoutInflater.from(getContext()).inflate(C1536f.C1542f.wallpaper_list_noheader, (ViewGroup) null);
        this.f5030e.setBackgroundColor(Color.parseColor("#ffeeeeee"));
        this.f5030e.setHeaderResizeEnabled(true);
        ((LinearLayout) findViewById(C1536f.C1541e.container)).addView(this.f5030e, f5025j);
        this.f5030e.setOnScrollListener(this);
        this.f5031f = LayoutInflater.from(getContext()).inflate(C1536f.C1542f.retry_item, (ViewGroup) null);
        ((TextView) this.f5031f.findViewById(C1536f.C1541e.retry_text)).setTextColor(getResources().getColorStateList(C1536f.C1540d.wallpaper_list_retry_text_color));
        this.f5031f.setOnClickListener(this);
        this.f5034i = (TextView) findViewById(C1536f.C1541e.title);
        if (!TextUtils.isEmpty(this.f5046v)) {
            this.f5034i.setText(this.f5046v);
        } else {
            m8138n();
        }
        C1519e c1519e = new C1519e(new BitmapDrawable(getResources(), BitmapFactory.decodeResource(getResources(), C1536f.C1540d.actionbar_back)), new int[]{-16777216, -7829368}, new PorterDuff.Mode[]{PorterDuff.Mode.SRC_IN, PorterDuff.Mode.SRC_IN});
        c1519e.setBounds(0, 0, c1519e.getMinimumWidth(), c1519e.getMinimumHeight());
        this.f5034i.setCompoundDrawables(c1519e, null, null, null);
        this.f5034i.setCompoundDrawablePadding((int) (6.0f * C1437p.m8623a()));
        this.f5034i.setOnClickListener(this);
        if (!this.f5048x) {
            findViewById(C1536f.C1541e.title_share_googleplus).setVisibility(4);
            findViewById(C1536f.C1541e.title_share_facebook).setVisibility(4);
        } else {
            findViewById(C1536f.C1541e.title_share_facebook).setOnClickListener(this);
            findViewById(C1536f.C1541e.title_share_googleplus).setOnClickListener(this);
        }
        this.f5032g = LayoutInflater.from(getContext()).inflate(C1536f.C1542f.theme_album_loadmore, (ViewGroup) null);
        this.f5033h = (ProgressBar) this.f5032g.findViewById(C1536f.C1541e.loadmore_progress);
        this.f5033h.setIndeterminateDrawable(new C1518d(getContext(), 3, 1));
        this.f5030e.setLoadMoreView(this.f5032g);
        this.f5032g.setVisibility(0);
        this.f5030e.setMode(PullToRefreshBase.EnumC1491b.PULL_FROM_START);
        this.f5030e.setCanLoadMore(true);
        this.f5038n = new C1887t(getContext(), this.f5035k, this);
        this.f5038n.m7133a("DATA_ALBUM");
        this.f5038n.m7131a(m8150h());
        this.f5030e.setAdapter(this.f5038n);
        if (((Activity) getContext()).getIntent().getBooleanExtra("force_refresh", false)) {
            enumC1397b = AbstractC1386a.EnumC1397b.Refresh;
        } else {
            enumC1397b = AbstractC1386a.EnumC1397b.LoadCache;
        }
        this.f5036l = new C1594a(enumC1397b);
        this.f5030e.setOnLoadListener(new PullToRefreshAndLoadMoreListView.InterfaceC1486a() { // from class: com.tsf.extend.theme.ThemeAlbumsPager.1
            @Override // com.tsf.extend.base.widget.pulltorefresh.PullToRefreshAndLoadMoreListView.InterfaceC1486a
            /* renamed from: a */
            public void mo6254a() {
                ThemeAlbumsPager.this.f5027b = System.currentTimeMillis();
                if (!ThemeAlbumsPager.this.f5044t) {
                    ThemeAlbumsPager.this.m8148i();
                    return;
                }
                ThemeAlbumsPager.this.f5036l = new C1594a(AbstractC1386a.EnumC1397b.LoadCache);
                C1894v.m7069h().m7081c(ThemeAlbumsPager.this.f5036l, AbstractC1386a.EnumC1397b.LoadCache, ThemeAlbumsPager.this.f5045u);
            }

            @Override // com.tsf.extend.base.widget.pulltorefresh.PullToRefreshAndLoadMoreListView.InterfaceC1486a
            /* renamed from: b */
            public void mo6253b() {
                if (ThemeAlbumsPager.this.f5026a) {
                    ThemeAlbumsPager.this.m8146j();
                } else {
                    ThemeAlbumsPager.this.m8144k();
                }
            }
        });
        int m7012a = PersonalizationActivity.m7012a(getContext(), 1.0f);
        this.f5039o = new View$OnClickListenerC2040ad.C2044a(m7012a, m7012a);
        if (Build.VERSION.SDK_INT >= 11) {
            this.f5039o.setColor(ThemeElementType.PARSER_CONFIG_ALL);
        }
        this.f5030e.setDivider(null);
        C1368a c1368a = C1894v.m7069h().m8792d().get(this.f5047w);
        if (c1368a != null && c1368a.m8875a() != null) {
            this.f5044t = false;
            this.f5026a = c1368a.m8868b();
            m8162a(c1368a.m8875a(), false, this.f5026a);
        } else {
            this.f5030e.m8401k();
        }
        setPadding(0, getPaddingTop(), 0, C1437p.m8615c(getContext()));
        if (this.f5050z == null) {
            this.f5050z = ((Activity) getContext()).getIntent().getStringExtra("inlet");
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public void m8148i() {
        this.f5036l = new C1594a(AbstractC1386a.EnumC1397b.Refresh);
        C1894v.m7069h().m7081c(this.f5036l, AbstractC1386a.EnumC1397b.Refresh, this.f5045u);
        if (m8150h()) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public void m8146j() {
        if (this.f5035k != null && this.f5035k.size() > 0) {
            this.f5037m = new C1594a(AbstractC1386a.EnumC1397b.LoadMore);
            C1894v.m7069h().m7081c(this.f5037m, AbstractC1386a.EnumC1397b.LoadMore, this.f5045u);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public void m8144k() {
        this.f5033h.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public void m8142l() {
        this.f5033h.setVisibility(8);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == C1536f.C1541e.title) {
            this.f5029d.onBackPressed();
        } else if (id == C1536f.C1541e.retry) {
            this.f5031f.setVisibility(8);
            this.f5036l = new C1594a(AbstractC1386a.EnumC1397b.Refresh);
            C1894v.m7069h().m7081c(this.f5036l, AbstractC1386a.EnumC1397b.Refresh, this.f5045u);
        } else if (id == C1536f.C1541e.loadmore_tips) {
            this.f5033h.setVisibility(0);
            m8146j();
        } else {
            m8173a(view);
        }
    }

    @Override // com.tsf.extend.base.p074d.AbstractC1386a.InterfaceC1396a
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void mo6245a(JSONObject jSONObject, final List<C1848k> list) {
        if (list != null) {
            C1455z.m8564a(0, new Runnable() { // from class: com.tsf.extend.theme.ThemeAlbumsPager.2
                @Override // java.lang.Runnable
                public void run() {
                    if (ThemeAlbumsPager.this.f5035k != null) {
                        for (C1887t.C1890b c1890b : ThemeAlbumsPager.this.f5035k) {
                            C1848k c1848k = c1890b.f6082a;
                            C1848k c1848k2 = c1890b.f6083b;
                            c1848k.m7306d(false);
                            if (c1848k2 != null) {
                                c1848k2.m7306d(false);
                            }
                            for (C1848k c1848k3 : list) {
                                if (c1848k3 != null && !(c1848k3 instanceof AbstractC1700aq)) {
                                    if (c1848k3.m7300g().equals(c1848k.m7300g())) {
                                        c1848k.m7306d(true);
                                    }
                                    if (c1848k2 != null && c1848k3.m7300g().equals(c1848k2.m7300g())) {
                                        c1848k2.m7306d(true);
                                    }
                                }
                            }
                        }
                        ThemeAlbumsPager.this.f5038n.notifyDataSetChanged();
                    }
                }
            });
        }
    }

    @Override // com.tsf.extend.base.p074d.AbstractC1386a.InterfaceC1396a
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void mo6247a(JSONObject jSONObject, int i, List<C1848k> list) {
    }

    /* renamed from: a */
    private void m8173a(View view) {
        String str;
        C1848k c1848k;
        C1848k c1848k2;
        Object tag = view.getTag();
        if (tag instanceof C1887t.C1892d) {
            int id = view.getId();
            if (id == C1536f.C1541e.theme_item_left || id == C1536f.C1541e.theme_item_download_layout_left) {
                c1848k2 = ((C1887t.C1892d) tag).f6088a;
            } else if (id == C1536f.C1541e.theme_item_mid || id == C1536f.C1541e.theme_item_download_layout_mid) {
                c1848k2 = ((C1887t.C1892d) tag).f6102o;
            } else {
                c1848k2 = ((C1887t.C1892d) tag).f6095h;
            }
            str = "1";
            c1848k = c1848k2;
        } else if (tag == null) {
            View findViewById = view.findViewById(C1536f.C1541e.theme_download_left);
            if (findViewById == null) {
                findViewById = view.findViewById(C1536f.C1541e.theme_download_mid);
            }
            if (findViewById == null) {
                findViewById = view.findViewById(C1536f.C1541e.theme_download_right);
            }
            str = "2";
            c1848k = (findViewById == null || !(findViewById.getTag() instanceof C1848k)) ? null : (C1848k) findViewById.getTag();
        } else {
            str = null;
            c1848k = null;
        }
        if (c1848k != null) {
            this.f5029d.m8921a(false);
            if (C1696ao.m7774b().m7769g()) {
                ThemeDetail themeDetail = (ThemeDetail) LayoutInflater.from(getContext()).inflate(C1536f.C1542f.theme_detail, (ViewGroup) null);
                themeDetail.setFromInlet(this.f5050z);
                themeDetail.setFromTab("detail");
                themeDetail.setTheme(c1848k);
                themeDetail.m8092a("1010", "1010");
                if (getContext() instanceof PageActivity) {
                    ((PageActivity) getContext()).m8922a(themeDetail);
                }
            } else {
                C1920x.m7052a(getContext(), c1848k.m7289k(), "tsf_theme_center_theme");
            }
            InterfaceC1385d m8293a = C1547h.m8293a();
            if (m8293a != null) {
                m8293a.mo8812b(c1848k.m7297h() + "");
            }
            C1894v.m7069h().m7088b(c1848k.m7297h());
            if (m8150h()) {
                if ("1".equals(str)) {
                    m8157b(c1848k);
                } else if ("2".equals(str)) {
                    m8166a(c1848k);
                }
            }
        }
    }

    /* renamed from: a */
    private void m8166a(C1848k c1848k) {
        m8165a("3", c1848k.m7297h(), c1848k.m7330B());
    }

    /* renamed from: b */
    private void m8157b(C1848k c1848k) {
        m8165a("2", c1848k.m7297h(), c1848k.m7330B());
    }

    /* renamed from: a */
    private void m8165a(String str, long j, String str2) {
    }

    @Override // com.tsf.extend.wallpaper.PersonalizationActivity.InterfaceC1954n
    /* renamed from: a */
    public void mo6940a(String str, PersonalizationActivity.InterfaceC1954n.EnumC1955a enumC1955a) {
        if (enumC1955a != null) {
            C1894v.m7069h().m7106a(this);
        }
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.InterfaceC1352a
    public boolean getPendingTransition() {
        return true;
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.InterfaceC1352a
    public View getContent() {
        return this;
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.InterfaceC1352a
    /* renamed from: a */
    public void mo6535a(PageActivity pageActivity) {
        this.f5029d = pageActivity;
        if (this.f5029d instanceof PersonalizationActivity) {
            ((PersonalizationActivity) this.f5029d).m7005a((PersonalizationActivity.InterfaceC1942b) this);
            ((PersonalizationActivity) this.f5029d).m7003a((PersonalizationActivity.InterfaceC1954n) this);
        }
        m8152g();
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.InterfaceC1352a
    /* renamed from: a */
    public void mo6536a() {
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.InterfaceC1352a
    /* renamed from: b */
    public void mo6532b() {
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.InterfaceC1352a
    public Bundle getResult() {
        return null;
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.InterfaceC1352a
    /* renamed from: c */
    public void mo6531c() {
        if (m8150h()) {
        }
        if (this.f5029d != null && (this.f5029d instanceof PersonalizationActivity)) {
            ((PersonalizationActivity) this.f5029d).m6987b((PersonalizationActivity.InterfaceC1954n) this);
            ((PersonalizationActivity) this.f5029d).m6988b((PersonalizationActivity.InterfaceC1942b) this);
        }
        this.f5038n.mo7141a();
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.InterfaceC1352a
    /* renamed from: d */
    public void mo6530d() {
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.InterfaceC1352a
    /* renamed from: e */
    public boolean mo6529e() {
        return false;
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.InterfaceC1352a
    /* renamed from: f */
    public void mo6528f() {
    }

    /* renamed from: a */
    public void m8164a(String str, String str2, String str3) {
        this.f5045u = str;
        this.f5046v = str2;
        this.f5047w = "DATA_ALBUM_" + this.f5045u;
        C1894v.m7069h().m7085b(str3);
    }

    public void setShowShareTitle(boolean z) {
        this.f5048x = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.extend.theme.ThemeAlbumsPager$a */
    /* loaded from: classes.dex */
    public class C1594a implements AbstractC1386a.InterfaceC1396a<C1368a> {

        /* renamed from: b */
        private AbstractC1386a.EnumC1397b f5061b;

        public C1594a(AbstractC1386a.EnumC1397b enumC1397b) {
            this.f5061b = enumC1397b;
        }

        @Override // com.tsf.extend.base.p074d.AbstractC1386a.InterfaceC1396a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo6245a(JSONObject jSONObject, final C1368a c1368a) {
            if (c1368a == null) {
                mo6247a(jSONObject, 0, (C1368a) null);
            } else {
                C1455z.m8564a(0, new Runnable() { // from class: com.tsf.extend.theme.ThemeAlbumsPager.a.1
                    @Override // java.lang.Runnable
                    public void run() {
                        boolean z;
                        if (c1368a instanceof C1645a) {
                            C1645a c1645a = (C1645a) c1368a;
                            ThemeAlbumsPager.this.f5026a = c1645a.m8868b();
                            if (C1594a.this.f5061b == AbstractC1386a.EnumC1397b.LoadMore) {
                                z = ThemeAlbumsPager.this.m8163a(c1645a.m8875a(), ThemeAlbumsPager.this.f5026a);
                            } else {
                                ThemeAlbumsPager.this.f5044t = false;
                                ThemeAlbumsPager.this.m8140m();
                                boolean m8162a = ThemeAlbumsPager.this.m8162a(c1645a.m8875a(), false, ThemeAlbumsPager.this.f5026a);
                                ThemeAlbumsPager.this.f5028c = c1645a;
                                z = m8162a;
                            }
                            if (z && !ThemeAlbumsPager.this.f5043s) {
                                C1894v.m7069h().m7106a(ThemeAlbumsPager.this);
                            }
                            if (ThemeAlbumsPager.this.m8150h()) {
                            }
                        }
                    }
                });
            }
        }

        @Override // com.tsf.extend.base.p074d.AbstractC1386a.InterfaceC1396a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo6247a(JSONObject jSONObject, int i, final C1368a c1368a) {
            C1455z.m8564a(0, new Runnable() { // from class: com.tsf.extend.theme.ThemeAlbumsPager.a.2
                @Override // java.lang.Runnable
                public void run() {
                    if (C1594a.this.f5061b == AbstractC1386a.EnumC1397b.LoadMore) {
                        ThemeAlbumsPager.this.m8142l();
                        return;
                    }
                    ThemeAlbumsPager.this.f5044t = false;
                    ThemeAlbumsPager.this.m8140m();
                    if (c1368a != null) {
                        ThemeAlbumsPager.this.f5026a = c1368a.m8868b();
                    }
                    ThemeAlbumsPager.this.m8162a((List<C1848k>) (c1368a == null ? null : c1368a.m8875a()), false, ThemeAlbumsPager.this.f5026a);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public void m8140m() {
        long j;
        long currentTimeMillis = System.currentTimeMillis() - this.f5027b;
        if (currentTimeMillis > 200) {
            j = 0;
        } else {
            j = 200 - currentTimeMillis;
        }
        C1455z.m8563a(0, new Runnable() { // from class: com.tsf.extend.theme.ThemeAlbumsPager.3
            @Override // java.lang.Runnable
            public void run() {
                ThemeAlbumsPager.this.f5030e.m8402j();
            }
        }, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public boolean m8163a(List<C1848k> list, boolean z) {
        if (list == null || list.size() == 0) {
            return false;
        }
        return m8162a(list, true, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public boolean m8162a(List<C1848k> list, boolean z, boolean z2) {
        m8159a(z2);
        if (!z) {
            this.f5035k.clear();
            if (list == null || list.size() == 0) {
                this.f5038n.notifyDataSetChanged();
                this.f5031f.setVisibility(0);
                this.f5030e.setEmptyView(this.f5031f);
                return false;
            }
        }
        String m6976f = ((PersonalizationActivity) this.f5029d).m6976f();
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
        this.f5038n.m7132a(this.f5035k, list);
        this.f5038n.notifyDataSetChanged();
        return true;
    }

    @Override // com.tsf.extend.wallpaper.PersonalizationActivity.InterfaceC1942b
    /* renamed from: a */
    public void mo6959a(final String str) {
        C1455z.m8564a(0, new Runnable() { // from class: com.tsf.extend.theme.ThemeAlbumsPager.4
            @Override // java.lang.Runnable
            public void run() {
                if (ThemeAlbumsPager.this.f5035k != null && ThemeAlbumsPager.this.f5035k.size() > 0) {
                    Iterator it = ThemeAlbumsPager.this.f5035k.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C1887t.C1890b c1890b = (C1887t.C1890b) it.next();
                        if (!TextUtils.isEmpty(str) && str.equals(c1890b.f6082a.m7300g())) {
                            c1890b.f6082a.m7314b(true);
                            break;
                        }
                        c1890b.f6082a.m7314b(false);
                        if (c1890b.f6083b != null) {
                            if (!TextUtils.isEmpty(str) && str.equals(c1890b.f6083b.m7300g())) {
                                c1890b.f6083b.m7314b(true);
                                break;
                            }
                            c1890b.f6083b.m7314b(false);
                        }
                    }
                    if (ThemeAlbumsPager.this.f5038n != null) {
                        ThemeAlbumsPager.this.f5038n.notifyDataSetChanged();
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
        if (this.f5042r != null && (childAt = absListView.getChildAt(1)) != null) {
            int top = i == 0 ? childAt.getTop() : 0;
            if (top >= 0 && !this.f5041q) {
                this.f5042r.mo6414a(this, top);
            }
            this.f5041q = false;
        }
    }

    @Override // android.view.View
    public void setScrollY(int i) {
        this.f5041q = true;
        if (this.f5030e != null) {
            int i2 = 0;
            int firstVisiblePosition = this.f5030e.getListView().getFirstVisiblePosition();
            if (i <= ThemePager.f5209b) {
                if (firstVisiblePosition == 0) {
                    View childAt = this.f5030e.getListView().getChildAt(1);
                    if (childAt != null) {
                        i2 = childAt.getTop();
                    }
                    if (i2 > ThemePager.f5209b) {
                        this.f5030e.getListView().setSelectionFromTop(1, ThemePager.f5209b);
                        return;
                    }
                    return;
                }
                return;
            }
            View childAt2 = this.f5030e.getListView().getChildAt(1);
            if (childAt2 != null) {
                i2 = childAt2.getTop();
            }
            if (i2 != i || Build.VERSION.SDK_INT >= 19) {
                this.f5030e.getListView().setSelectionFromTop(1, i);
            }
        }
    }

    @Override // com.tsf.extend.wallpaper.InterfaceC2099p
    public void setScrollListener(InterfaceC2100q interfaceC2100q) {
        this.f5042r = interfaceC2100q;
    }

    @Override // com.tsf.extend.wallpaper.InterfaceC2099p
    public void setHeadViewHeight(int i) {
        if (this.f5030e != null) {
            FrameLayout headerFrame = this.f5030e.getHeaderFrame();
            AbsListView.LayoutParams layoutParams = (AbsListView.LayoutParams) headerFrame.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new AbsListView.LayoutParams(-1, i);
            } else {
                layoutParams.height = i;
            }
            headerFrame.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: a */
    private void m8159a(boolean z) {
        if (!z) {
            m8144k();
        } else {
            this.f5030e.m8430b(false);
        }
    }

    /* renamed from: n */
    private void m8138n() {
        if (this.f5045u != null) {
            C1894v.m7069h().m8796b("https://cml.ksmobile.com/Album/albumInfo?album_id=" + this.f5045u, new AbstractC1386a.InterfaceC1396a<JSONObject>() { // from class: com.tsf.extend.theme.ThemeAlbumsPager.5
                @Override // com.tsf.extend.base.p074d.AbstractC1386a.InterfaceC1396a
                /* renamed from: a  reason: avoid collision after fix types in other method */
                public void mo6245a(JSONObject jSONObject, JSONObject jSONObject2) {
                    JSONObject optJSONObject;
                    final String optString;
                    if (jSONObject2 != null && (optJSONObject = jSONObject2.optJSONObject("data")) != null && (optString = optJSONObject.optString("album_name")) != null) {
                        C1455z.m8564a(0, new Runnable() { // from class: com.tsf.extend.theme.ThemeAlbumsPager.5.1
                            @Override // java.lang.Runnable
                            public void run() {
                                ThemeAlbumsPager.this.f5046v = optString;
                                ThemeAlbumsPager.this.f5034i.setText(ThemeAlbumsPager.this.f5046v);
                            }
                        });
                    }
                }

                @Override // com.tsf.extend.base.p074d.AbstractC1386a.InterfaceC1396a
                /* renamed from: a  reason: avoid collision after fix types in other method */
                public void mo6247a(JSONObject jSONObject, int i, JSONObject jSONObject2) {
                }
            });
        }
    }

    /* renamed from: h */
    public boolean m8150h() {
        return this.f5049y;
    }

    public void setOpenCategoryList(boolean z) {
        this.f5049y = z;
    }
}
