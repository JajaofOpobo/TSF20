package com.tsf.extend.theme.p084c;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tsf.extend.C1536f;
import com.tsf.extend.base.actstru.model.activi.PageActivity;
import com.tsf.extend.base.p071b.C1368a;
import com.tsf.extend.base.p074d.AbstractC1386a;
import com.tsf.extend.base.p080j.C1430i;
import com.tsf.extend.base.p080j.C1455z;
import com.tsf.extend.base.widget.pulltorefresh.C1518d;
import com.tsf.extend.base.widget.pulltorefresh.PullToRefreshAndLoadMoreListView;
import com.tsf.extend.base.widget.pulltorefresh.PullToRefreshBase;
import com.tsf.extend.theme.AbstractC1700aq;
import com.tsf.extend.theme.C1696ao;
import com.tsf.extend.theme.C1848k;
import com.tsf.extend.theme.C1862p;
import com.tsf.extend.theme.C1887t;
import com.tsf.extend.theme.C1894v;
import com.tsf.extend.theme.C1920x;
import com.tsf.extend.theme.ThemeDetail;
import com.tsf.extend.wallpaper.PersonalizationActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
/* renamed from: com.tsf.extend.theme.c.d */
/* loaded from: classes.dex */
public class View$OnClickListenerC1719d extends FrameLayout implements View.OnClickListener, AbstractC1386a.InterfaceC1396a<List<C1848k>>, PersonalizationActivity.InterfaceC1942b, PersonalizationActivity.InterfaceC1954n {

    /* renamed from: a */
    protected PageActivity f5519a;

    /* renamed from: b */
    private PullToRefreshAndLoadMoreListView f5520b;

    /* renamed from: c */
    private C1887t f5521c;

    /* renamed from: d */
    private List<C1887t.C1890b> f5522d;

    /* renamed from: e */
    private boolean f5523e;

    /* renamed from: f */
    private ProgressBar f5524f;

    /* renamed from: g */
    private TextView f5525g;

    /* renamed from: h */
    private View f5526h;

    /* renamed from: i */
    private View f5527i;

    /* renamed from: j */
    private C1723a f5528j;

    /* renamed from: k */
    private long f5529k;

    /* renamed from: l */
    private String f5530l;

    /* renamed from: m */
    private String f5531m;

    public View$OnClickListenerC1719d(Context context, PageActivity pageActivity, String str) {
        super(context);
        this.f5522d = new ArrayList();
        this.f5523e = false;
        this.f5529k = 0L;
        this.f5519a = pageActivity;
        this.f5530l = str;
        m7677a();
        if (this.f5531m == null) {
            this.f5531m = this.f5519a.getIntent().getStringExtra("inlet");
        }
    }

    /* renamed from: a */
    private void m7677a() {
        this.f5520b = (PullToRefreshAndLoadMoreListView) LayoutInflater.from(getContext()).inflate(C1536f.C1542f.theme_search_list, (ViewGroup) null);
        addView(this.f5520b, new FrameLayout.LayoutParams(-1, -1));
        this.f5520b.setMode(PullToRefreshBase.EnumC1491b.DISABLED);
        this.f5520b.setHeaderResizeEnabled(false);
        this.f5520b.setCanLoadMore(true);
        this.f5520b.setBackgroundColor(-1118482);
        this.f5520b.setOnLoadListener(new PullToRefreshAndLoadMoreListView.InterfaceC1486a() { // from class: com.tsf.extend.theme.c.d.1
            @Override // com.tsf.extend.base.widget.pulltorefresh.PullToRefreshAndLoadMoreListView.InterfaceC1486a
            /* renamed from: a */
            public void mo6254a() {
            }

            @Override // com.tsf.extend.base.widget.pulltorefresh.PullToRefreshAndLoadMoreListView.InterfaceC1486a
            /* renamed from: b */
            public void mo6253b() {
                if (!View$OnClickListenerC1719d.this.f5523e) {
                    View$OnClickListenerC1719d.this.m7669b();
                } else {
                    View$OnClickListenerC1719d.this.m7663e();
                }
            }
        });
        this.f5527i = LayoutInflater.from(getContext()).inflate(C1536f.C1542f.theme_detail_loadmore, (ViewGroup) null);
        this.f5524f = (ProgressBar) this.f5527i.findViewById(C1536f.C1541e.loadmore_progress);
        this.f5524f.setIndeterminateDrawable(new C1518d(getContext(), 3, 1));
        this.f5525g = (TextView) this.f5527i.findViewById(C1536f.C1541e.loadmore_tips);
        this.f5526h = this.f5527i.findViewById(C1536f.C1541e.nomore_group);
        this.f5520b.setLoadMoreView(this.f5527i);
        this.f5521c = new C1708b(getContext(), this.f5522d, this);
        this.f5520b.setAdapter(this.f5521c);
        if (this.f5519a instanceof PersonalizationActivity) {
            ((PersonalizationActivity) this.f5519a).m7005a((PersonalizationActivity.InterfaceC1942b) this);
            ((PersonalizationActivity) this.f5519a).m7003a((PersonalizationActivity.InterfaceC1954n) this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m7669b() {
        this.f5524f.setVisibility(8);
        this.f5525g.setVisibility(8);
        this.f5525g.setClickable(false);
        this.f5527i.setVisibility(0);
        this.f5527i.getLayoutParams().height = C1430i.m8659a(10.0f);
        this.f5527i.requestLayout();
    }

    /* renamed from: c */
    private void m7667c() {
        this.f5524f.setVisibility(0);
        this.f5525g.setVisibility(8);
        this.f5525g.setClickable(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public void m7665d() {
        this.f5524f.setVisibility(8);
        this.f5525g.setVisibility(0);
        this.f5525g.setClickable(true);
        this.f5525g.setText(C1536f.C1543g.load_more_fail);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public void m7663e() {
        if (this.f5522d != null && this.f5522d.size() > 0) {
            this.f5528j = new C1723a(AbstractC1386a.EnumC1397b.LoadMore);
            C1894v.m7069h().m7101a(this.f5528j, AbstractC1386a.EnumC1397b.LoadMore, this.f5530l);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == C1536f.C1541e.theme_item_download_layout_left) {
            m7676a(view.findViewById(C1536f.C1541e.theme_download_left), true);
        } else if (id == C1536f.C1541e.theme_item_download_layout_right) {
            m7676a(view.findViewById(C1536f.C1541e.theme_download_right), true);
        } else if (id == C1536f.C1541e.theme_item_download_layout_mid) {
            m7676a(view.findViewById(C1536f.C1541e.theme_download_mid), true);
        } else if (id == C1536f.C1541e.theme_item_left || id == C1536f.C1541e.theme_item_right || id == C1536f.C1541e.theme_item_mid) {
            m7676a(view, false);
        }
    }

    /* renamed from: a */
    private void m7676a(View view, boolean z) {
        C1848k c1848k;
        if (Math.abs(this.f5529k - System.currentTimeMillis()) > 1000) {
            this.f5529k = System.currentTimeMillis();
            if (z) {
                c1848k = (C1848k) view.getTag();
            } else {
                Object tag = view.getTag();
                if (tag instanceof C1887t.C1892d) {
                    if (view.getId() == C1536f.C1541e.theme_item_left) {
                        c1848k = ((C1887t.C1892d) tag).f6088a;
                    } else if (view.getId() == C1536f.C1541e.theme_item_mid) {
                        c1848k = ((C1887t.C1892d) tag).f6102o;
                    } else {
                        c1848k = ((C1887t.C1892d) tag).f6095h;
                    }
                } else {
                    c1848k = tag instanceof C1848k ? (C1848k) tag : null;
                }
            }
            if (c1848k != null) {
                if (C1696ao.m7774b().m7769g()) {
                    ThemeDetail themeDetail = (ThemeDetail) LayoutInflater.from(this.f5519a).inflate(C1536f.C1542f.theme_detail, (ViewGroup) null);
                    themeDetail.setFromInlet(this.f5531m);
                    themeDetail.setFromTab("detail");
                    themeDetail.setTheme(c1848k);
                    themeDetail.m8092a("1010", "1010");
                    this.f5519a.m8922a(themeDetail);
                } else if (!c1848k.m7272v()) {
                    this.f5519a.m8921a(false);
                    C1920x.m7052a(getContext(), c1848k.m7289k(), "tsf_theme_center_theme");
                } else {
                    m7673a(c1848k);
                }
                C1707a.m7733a((byte) 5);
            }
        }
    }

    /* renamed from: a */
    private void m7673a(C1848k c1848k) {
        Context context = getContext();
        String m7300g = c1848k.m7300g();
        if (context.getPackageManager() != null) {
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(m7300g);
            if (launchIntentForPackage != null) {
                ComponentName component = launchIntentForPackage.getComponent();
                launchIntentForPackage = new Intent("android.intent.action.MAIN");
                launchIntentForPackage.addCategory("android.intent.category.LAUNCHER");
                launchIntentForPackage.setComponent(component);
                launchIntentForPackage.setFlags(270532608);
            }
            if (launchIntentForPackage != null) {
                launchIntentForPackage.putExtra("from_cml_theme", true);
                launchIntentForPackage.putExtra("from_cml", true);
                this.f5519a.m8921a(false);
                context.startActivity(launchIntentForPackage);
            }
        }
    }

    @Override // com.tsf.extend.base.p074d.AbstractC1386a.InterfaceC1396a
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void mo6245a(JSONObject jSONObject, final List<C1848k> list) {
        if (list != null) {
            C1455z.m8564a(0, new Runnable() { // from class: com.tsf.extend.theme.c.d.2
                @Override // java.lang.Runnable
                public void run() {
                    if (View$OnClickListenerC1719d.this.f5522d != null) {
                        for (C1887t.C1890b c1890b : View$OnClickListenerC1719d.this.f5522d) {
                            if (c1890b.m7118e() == null) {
                                C1848k m7124a = c1890b.m7124a();
                                C1848k m7122b = c1890b.m7122b();
                                C1848k m7120c = c1890b.m7120c();
                                m7124a.m7306d(false);
                                if (m7122b != null) {
                                    m7122b.m7306d(false);
                                }
                                if (m7120c != null) {
                                    m7120c.m7306d(false);
                                }
                                for (C1848k c1848k : list) {
                                    if (c1848k != null && !(c1848k instanceof AbstractC1700aq)) {
                                        if (c1848k.m7300g().equals(m7124a.m7300g())) {
                                            m7124a.m7306d(true);
                                        }
                                        if (m7122b != null && c1848k.m7300g().equals(m7122b.m7300g())) {
                                            m7122b.m7306d(true);
                                        }
                                        if (m7120c != null && c1848k.m7300g().equals(m7120c.m7300g())) {
                                            m7120c.m7306d(true);
                                        }
                                    }
                                }
                            }
                        }
                        View$OnClickListenerC1719d.this.f5521c.notifyDataSetChanged();
                    }
                }
            });
        }
    }

    @Override // com.tsf.extend.base.p074d.AbstractC1386a.InterfaceC1396a
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void mo6247a(JSONObject jSONObject, int i, List<C1848k> list) {
    }

    @Override // com.tsf.extend.wallpaper.PersonalizationActivity.InterfaceC1942b
    /* renamed from: a */
    public void mo6959a(final String str) {
        C1455z.m8564a(0, new Runnable() { // from class: com.tsf.extend.theme.c.d.3
            @Override // java.lang.Runnable
            public void run() {
                if (View$OnClickListenerC1719d.this.f5522d != null && View$OnClickListenerC1719d.this.f5522d.size() > 0) {
                    Iterator it = View$OnClickListenerC1719d.this.f5522d.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C1887t.C1890b c1890b = (C1887t.C1890b) it.next();
                        C1848k m7124a = c1890b.m7124a();
                        if (m7124a != null) {
                            if (!TextUtils.isEmpty(str) && str.equals(m7124a.m7300g())) {
                                m7124a.m7314b(true);
                                break;
                            }
                            m7124a.m7314b(false);
                        }
                        C1848k m7122b = c1890b.m7122b();
                        if (m7122b != null) {
                            if (!TextUtils.isEmpty(str) && str.equals(m7122b.m7300g())) {
                                m7122b.m7314b(true);
                                break;
                            }
                            m7122b.m7314b(false);
                        }
                    }
                    if (View$OnClickListenerC1719d.this.f5521c != null) {
                        View$OnClickListenerC1719d.this.f5521c.notifyDataSetChanged();
                    }
                }
            }
        });
    }

    @Override // com.tsf.extend.wallpaper.PersonalizationActivity.InterfaceC1954n
    /* renamed from: a */
    public void mo6940a(String str, PersonalizationActivity.InterfaceC1954n.EnumC1955a enumC1955a) {
        if (enumC1955a != null) {
            C1894v.m7069h().m7106a(this);
        }
    }

    /* renamed from: a */
    public void m7672a(List<C1848k> list, boolean z) {
        String str;
        if (!z) {
            this.f5522d.clear();
        }
        if (this.f5522d.size() == 0 && (list == null || list.size() == 0)) {
            this.f5521c.notifyDataSetChanged();
            return;
        }
        if (this.f5519a == null) {
            str = null;
        } else {
            str = ((PersonalizationActivity) this.f5519a).m6976f();
        }
        if (str != null && str.startsWith("DIY://")) {
            for (C1848k c1848k : list) {
                if (c1848k instanceof AbstractC1700aq) {
                    if (!TextUtils.isEmpty(str) && str.contains(((AbstractC1700aq) c1848k).m7764I())) {
                        c1848k.m7314b(true);
                    } else {
                        c1848k.m7314b(false);
                    }
                }
            }
        } else {
            for (C1848k c1848k2 : list) {
                if (!TextUtils.isEmpty(str) && str.equals(c1848k2.m7300g())) {
                    c1848k2.m7314b(true);
                } else {
                    c1848k2.m7314b(false);
                }
            }
        }
        this.f5521c.m7132a(this.f5522d, list);
        this.f5521c.notifyDataSetChanged();
    }

    /* renamed from: a */
    public void m7675a(C1368a c1368a, boolean z) {
        if (c1368a instanceof C1862p) {
            this.f5523e = ((C1862p) c1368a).m8868b();
            if (!this.f5523e) {
                m7669b();
            } else {
                m7667c();
                this.f5520b.m8430b(false);
            }
            m7672a(c1368a.m8875a(), z);
            C1894v.m7069h().m7106a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.extend.theme.c.d$a */
    /* loaded from: classes.dex */
    public class C1723a implements AbstractC1386a.InterfaceC1396a<C1368a> {

        /* renamed from: b */
        private final AbstractC1386a.EnumC1397b f5538b;

        public C1723a(AbstractC1386a.EnumC1397b enumC1397b) {
            this.f5538b = enumC1397b;
        }

        @Override // com.tsf.extend.base.p074d.AbstractC1386a.InterfaceC1396a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo6245a(JSONObject jSONObject, final C1368a c1368a) {
            if (c1368a == null) {
                mo6247a(jSONObject, 0, (C1368a) null);
            } else {
                C1455z.m8564a(0, new Runnable() { // from class: com.tsf.extend.theme.c.d.a.1
                    @Override // java.lang.Runnable
                    public void run() {
                        View$OnClickListenerC1719d.this.m7675a(c1368a, C1723a.this.f5538b == AbstractC1386a.EnumC1397b.LoadMore);
                    }
                });
            }
        }

        @Override // com.tsf.extend.base.p074d.AbstractC1386a.InterfaceC1396a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo6247a(JSONObject jSONObject, int i, C1368a c1368a) {
            C1455z.m8564a(0, new Runnable() { // from class: com.tsf.extend.theme.c.d.a.2
                @Override // java.lang.Runnable
                public void run() {
                    if (View$OnClickListenerC1719d.this.f5522d.size() > 0) {
                        View$OnClickListenerC1719d.this.m7665d();
                    } else {
                        View$OnClickListenerC1719d.this.m7669b();
                    }
                }
            });
        }
    }
}
