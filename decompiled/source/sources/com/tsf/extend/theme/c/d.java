package com.tsf.extend.theme.c;

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
import com.tsf.extend.base.actstru.model.activi.PageActivity;
import com.tsf.extend.base.d.a;
import com.tsf.extend.base.j.z;
import com.tsf.extend.base.widget.pulltorefresh.PullToRefreshAndLoadMoreListView;
import com.tsf.extend.base.widget.pulltorefresh.PullToRefreshBase;
import com.tsf.extend.f;
import com.tsf.extend.theme.ThemeDetail;
import com.tsf.extend.theme.ao;
import com.tsf.extend.theme.aq;
import com.tsf.extend.theme.k;
import com.tsf.extend.theme.p;
import com.tsf.extend.theme.t;
import com.tsf.extend.theme.v;
import com.tsf.extend.theme.x;
import com.tsf.extend.wallpaper.PersonalizationActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class d extends FrameLayout implements View.OnClickListener, a.InterfaceC0048a<List<k>>, PersonalizationActivity.b, PersonalizationActivity.n {
    protected PageActivity a;
    private PullToRefreshAndLoadMoreListView b;
    private t c;
    private List<t.b> d;
    private boolean e;
    private ProgressBar f;
    private TextView g;
    private View h;
    private View i;
    private a j;
    private long k;
    private String l;
    private String m;

    public d(Context context, PageActivity pageActivity, String str) {
        super(context);
        this.d = new ArrayList();
        this.e = false;
        this.k = 0L;
        this.a = pageActivity;
        this.l = str;
        a();
        if (this.m == null) {
            this.m = this.a.getIntent().getStringExtra("inlet");
        }
    }

    private void a() {
        this.b = (PullToRefreshAndLoadMoreListView) LayoutInflater.from(getContext()).inflate(f.C0052f.theme_search_list, (ViewGroup) null);
        addView(this.b, new FrameLayout.LayoutParams(-1, -1));
        this.b.setMode(PullToRefreshBase.b.DISABLED);
        this.b.setHeaderResizeEnabled(false);
        this.b.setCanLoadMore(true);
        this.b.setBackgroundColor(-1118482);
        this.b.setOnLoadListener(new PullToRefreshAndLoadMoreListView.a() { // from class: com.tsf.extend.theme.c.d.1
            @Override // com.tsf.extend.base.widget.pulltorefresh.PullToRefreshAndLoadMoreListView.a
            public void a() {
            }

            @Override // com.tsf.extend.base.widget.pulltorefresh.PullToRefreshAndLoadMoreListView.a
            public void b() {
                if (!d.this.e) {
                    d.this.b();
                } else {
                    d.this.e();
                }
            }
        });
        this.i = LayoutInflater.from(getContext()).inflate(f.C0052f.theme_detail_loadmore, (ViewGroup) null);
        this.f = (ProgressBar) this.i.findViewById(f.e.loadmore_progress);
        this.f.setIndeterminateDrawable(new com.tsf.extend.base.widget.pulltorefresh.d(getContext(), 3, 1));
        this.g = (TextView) this.i.findViewById(f.e.loadmore_tips);
        this.h = this.i.findViewById(f.e.nomore_group);
        this.b.setLoadMoreView(this.i);
        this.c = new b(getContext(), this.d, this);
        this.b.setAdapter(this.c);
        if (this.a instanceof PersonalizationActivity) {
            ((PersonalizationActivity) this.a).a((PersonalizationActivity.b) this);
            ((PersonalizationActivity) this.a).a((PersonalizationActivity.n) this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        this.f.setVisibility(8);
        this.g.setVisibility(8);
        this.g.setClickable(false);
        this.i.setVisibility(0);
        this.i.getLayoutParams().height = com.tsf.extend.base.j.i.a(10.0f);
        this.i.requestLayout();
    }

    private void c() {
        this.f.setVisibility(0);
        this.g.setVisibility(8);
        this.g.setClickable(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        this.f.setVisibility(8);
        this.g.setVisibility(0);
        this.g.setClickable(true);
        this.g.setText(f.g.load_more_fail);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (this.d != null && this.d.size() > 0) {
            this.j = new a(a.b.LoadMore);
            v.h().a(this.j, a.b.LoadMore, this.l);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == f.e.theme_item_download_layout_left) {
            a(view.findViewById(f.e.theme_download_left), true);
        } else if (id == f.e.theme_item_download_layout_right) {
            a(view.findViewById(f.e.theme_download_right), true);
        } else if (id == f.e.theme_item_download_layout_mid) {
            a(view.findViewById(f.e.theme_download_mid), true);
        } else if (id == f.e.theme_item_left || id == f.e.theme_item_right || id == f.e.theme_item_mid) {
            a(view, false);
        }
    }

    private void a(View view, boolean z) {
        k kVar;
        if (Math.abs(this.k - System.currentTimeMillis()) > 1000) {
            this.k = System.currentTimeMillis();
            if (z) {
                kVar = (k) view.getTag();
            } else {
                Object tag = view.getTag();
                if (tag instanceof t.d) {
                    if (view.getId() == f.e.theme_item_left) {
                        kVar = ((t.d) tag).a;
                    } else if (view.getId() == f.e.theme_item_mid) {
                        kVar = ((t.d) tag).o;
                    } else {
                        kVar = ((t.d) tag).h;
                    }
                } else {
                    kVar = tag instanceof k ? (k) tag : null;
                }
            }
            if (kVar != null) {
                if (ao.b().g()) {
                    ThemeDetail themeDetail = (ThemeDetail) LayoutInflater.from(this.a).inflate(f.C0052f.theme_detail, (ViewGroup) null);
                    themeDetail.setFromInlet(this.m);
                    themeDetail.setFromTab("detail");
                    themeDetail.setTheme(kVar);
                    themeDetail.a("1010", "1010");
                    this.a.a(themeDetail);
                } else if (!kVar.v()) {
                    this.a.a(false);
                    x.a(getContext(), kVar.k(), "tsf_theme_center_theme");
                } else {
                    a(kVar);
                }
                com.tsf.extend.theme.c.a.a((byte) 5);
            }
        }
    }

    private void a(k kVar) {
        Context context = getContext();
        String g = kVar.g();
        if (context.getPackageManager() != null) {
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(g);
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
                this.a.a(false);
                context.startActivity(launchIntentForPackage);
            }
        }
    }

    @Override // com.tsf.extend.base.d.a.InterfaceC0048a
    public void a(JSONObject jSONObject, final List<k> list) {
        if (list != null) {
            z.a(0, new Runnable() { // from class: com.tsf.extend.theme.c.d.2
                @Override // java.lang.Runnable
                public void run() {
                    if (d.this.d != null) {
                        for (t.b bVar : d.this.d) {
                            if (bVar.e() == null) {
                                k a2 = bVar.a();
                                k b = bVar.b();
                                k c = bVar.c();
                                a2.d(false);
                                if (b != null) {
                                    b.d(false);
                                }
                                if (c != null) {
                                    c.d(false);
                                }
                                for (k kVar : list) {
                                    if (kVar != null && !(kVar instanceof aq)) {
                                        if (kVar.g().equals(a2.g())) {
                                            a2.d(true);
                                        }
                                        if (b != null && kVar.g().equals(b.g())) {
                                            b.d(true);
                                        }
                                        if (c != null && kVar.g().equals(c.g())) {
                                            c.d(true);
                                        }
                                    }
                                }
                            }
                        }
                        d.this.c.notifyDataSetChanged();
                    }
                }
            });
        }
    }

    @Override // com.tsf.extend.base.d.a.InterfaceC0048a
    public void a(JSONObject jSONObject, int i, List<k> list) {
    }

    @Override // com.tsf.extend.wallpaper.PersonalizationActivity.b
    public void a(final String str) {
        z.a(0, new Runnable() { // from class: com.tsf.extend.theme.c.d.3
            @Override // java.lang.Runnable
            public void run() {
                if (d.this.d != null && d.this.d.size() > 0) {
                    Iterator it = d.this.d.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        t.b bVar = (t.b) it.next();
                        k a2 = bVar.a();
                        if (a2 != null) {
                            if (!TextUtils.isEmpty(str) && str.equals(a2.g())) {
                                a2.b(true);
                                break;
                            }
                            a2.b(false);
                        }
                        k b = bVar.b();
                        if (b != null) {
                            if (!TextUtils.isEmpty(str) && str.equals(b.g())) {
                                b.b(true);
                                break;
                            }
                            b.b(false);
                        }
                    }
                    if (d.this.c != null) {
                        d.this.c.notifyDataSetChanged();
                    }
                }
            }
        });
    }

    @Override // com.tsf.extend.wallpaper.PersonalizationActivity.n
    public void a(String str, PersonalizationActivity.n.a aVar) {
        if (aVar != null) {
            v.h().a(this);
        }
    }

    public void a(List<k> list, boolean z) {
        String str;
        if (!z) {
            this.d.clear();
        }
        if (this.d.size() == 0 && (list == null || list.size() == 0)) {
            this.c.notifyDataSetChanged();
            return;
        }
        if (this.a == null) {
            str = null;
        } else {
            str = ((PersonalizationActivity) this.a).f();
        }
        if (str != null && str.startsWith("DIY://")) {
            for (k kVar : list) {
                if (kVar instanceof aq) {
                    if (!TextUtils.isEmpty(str) && str.contains(((aq) kVar).I())) {
                        kVar.b(true);
                    } else {
                        kVar.b(false);
                    }
                }
            }
        } else {
            for (k kVar2 : list) {
                if (!TextUtils.isEmpty(str) && str.equals(kVar2.g())) {
                    kVar2.b(true);
                } else {
                    kVar2.b(false);
                }
            }
        }
        this.c.a(this.d, list);
        this.c.notifyDataSetChanged();
    }

    public void a(com.tsf.extend.base.b.a aVar, boolean z) {
        if (aVar instanceof p) {
            this.e = ((p) aVar).b();
            if (!this.e) {
                b();
            } else {
                c();
                this.b.b(false);
            }
            a(aVar.a(), z);
            v.h().a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements a.InterfaceC0048a<com.tsf.extend.base.b.a> {
        private final a.b b;

        public a(a.b bVar) {
            this.b = bVar;
        }

        @Override // com.tsf.extend.base.d.a.InterfaceC0048a
        public void a(JSONObject jSONObject, final com.tsf.extend.base.b.a aVar) {
            if (aVar == null) {
                a(jSONObject, 0, (com.tsf.extend.base.b.a) null);
            } else {
                z.a(0, new Runnable() { // from class: com.tsf.extend.theme.c.d.a.1
                    @Override // java.lang.Runnable
                    public void run() {
                        d.this.a(aVar, a.this.b == a.b.LoadMore);
                    }
                });
            }
        }

        @Override // com.tsf.extend.base.d.a.InterfaceC0048a
        public void a(JSONObject jSONObject, int i, com.tsf.extend.base.b.a aVar) {
            z.a(0, new Runnable() { // from class: com.tsf.extend.theme.c.d.a.2
                @Override // java.lang.Runnable
                public void run() {
                    if (d.this.d.size() > 0) {
                        d.this.d();
                    } else {
                        d.this.b();
                    }
                }
            });
        }
    }
}
