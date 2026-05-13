package com.tsf.extend.theme;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.tsf.extend.base.actstru.model.activi.PageActivity;
import com.tsf.extend.base.d.a;
import com.tsf.extend.base.support.ViewPager;
import com.tsf.extend.base.view.PagerIndicator;
import com.tsf.extend.f;
import com.tsf.extend.wallpaper.PersonalizationActivity;
import java.util.List;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class ThemePager extends FrameLayout implements View.OnClickListener, ViewPager.e, PagerIndicator.a, PersonalizationActivity.h, PersonalizationActivity.i, com.tsf.extend.wallpaper.q {
    public static int a;
    public static int b;
    public static int c;
    private PersonalizationActivity d;
    private ViewPager e;
    private PagerIndicator f;
    private b g;
    private View h;
    private int i;
    private long j;
    private SparseArray<View> k;
    private boolean l;
    private PersonalizationActivity.f m;
    private String[] n;
    private boolean o;
    private boolean p;
    private boolean q;
    private TextView r;
    private List<com.tsf.extend.theme.c.e> s;
    private a t;
    private int u;
    private boolean v;
    private int w;
    private int x;
    private int y;
    private int z;

    public ThemePager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.j = 0L;
        this.k = new SparseArray<>();
        this.l = false;
        this.m = null;
        this.n = new String[]{getResources().getString(f.g.tab_hot), getResources().getString(f.g.tab_new), getResources().getString(f.g.wallpaper_categories)};
        this.o = false;
        this.p = false;
        this.q = true;
        this.u = -1;
        this.v = false;
        this.w = 0;
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        v.h();
        this.e = (ViewPager) findViewById(f.e.viewpager);
        this.g = new b();
        this.e.setOffscreenPageLimit(2);
        this.e.setAdapter(this.g);
        this.e.setOnPageChangeListener(this);
        this.f = (PagerIndicator) findViewById(f.e.wallpaper_indicator);
        this.f.setOnPageClickedListener(this);
        int defaultPageIndex = getDefaultPageIndex();
        this.f.a(defaultPageIndex, this.n);
        if (this.e.getCurrentItem() != defaultPageIndex) {
            this.e.setCurrentItem(defaultPageIndex);
        }
        this.i = defaultPageIndex;
        this.h = findViewById(f.e.theme_banner_group);
        this.v = g();
        int i = 0;
        if (this.v) {
            i = PersonalizationActivity.a(getContext(), 52.0f);
            this.u = com.tsf.extend.wallpaper.ag.a().g();
        }
        a = i;
        b = getResources().getDimensionPixelSize(f.c.personal_indicator_height);
        c = b + a;
        this.j = System.currentTimeMillis();
        h();
    }

    private boolean g() {
        String a2 = com.tsf.extend.base.j.d.a();
        return a2 != null && a2.toLowerCase().startsWith("en");
    }

    private void h() {
        if (this.v) {
            View inflate = ((ViewStub) findViewById(f.e.theme_search_entry_stub)).inflate();
            inflate.findViewById(f.e.theme_search_go).setOnClickListener(this);
            inflate.findViewById(f.e.theme_search_bar).setOnClickListener(this);
            this.r = (TextView) inflate.findViewById(f.e.theme_search);
            l();
        }
    }

    private int getDefaultPageIndex() {
        if (!i() || !j()) {
            return 1;
        }
        setFirstOpenThemeCenter(false);
        return 0;
    }

    private boolean i() {
        return com.tsf.extend.base.h.a.a().c(0) >= 30000;
    }

    private boolean j() {
        return com.tsf.extend.wallpaper.ag.a().f();
    }

    private void setFirstOpenThemeCenter(boolean z) {
        com.tsf.extend.wallpaper.ag.a().a(z);
    }

    public void setPagerActivity(PageActivity pageActivity) {
        if (pageActivity instanceof PersonalizationActivity) {
            this.d = (PersonalizationActivity) pageActivity;
        }
    }

    private View getCurrentView() {
        return ((b) this.e.getAdapter()).b(this.e.getCurrentItem());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == f.e.theme_search_bar) {
            a(true);
        } else if (id == f.e.theme_search_go) {
            a(false);
        }
    }

    void a(boolean z) {
        this.d.a(new com.tsf.extend.theme.c.c(getContext(), this.u, z, this.s));
    }

    private void k() {
        if (this.x != this.w) {
            if (this.x > this.w) {
                this.m.a();
            } else {
                this.m.b();
            }
        } else if (this.z > this.y) {
            this.m.b();
        } else {
            this.m.a();
        }
    }

    @Override // com.tsf.extend.wallpaper.PersonalizationActivity.i
    public void a(AbsListView absListView, int i) {
        View childAt;
        if (this.l && (childAt = absListView.getChildAt(0)) != null) {
            if (i == 0) {
                this.x = absListView.getFirstVisiblePosition();
                this.z = childAt.getTop();
                k();
            } else if (i == 1) {
                this.w = absListView.getFirstVisiblePosition();
                this.y = childAt.getTop();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b extends com.tsf.extend.base.support.a {
        private FrameLayout.LayoutParams b;

        private b() {
            this.b = new FrameLayout.LayoutParams(-1, -1);
        }

        @Override // com.tsf.extend.base.support.a
        public int a() {
            return 3;
        }

        @Override // com.tsf.extend.base.support.a
        public Object a(ViewGroup viewGroup, int i) {
            m mVar;
            View view = (View) ThemePager.this.k.get(i);
            if (view == null) {
                switch (i) {
                    case 0:
                        mVar = new z(ThemePager.this.getContext(), (PageActivity) ThemePager.this.getContext(), m.j[1], ThemePager.this);
                        break;
                    case 1:
                        mVar = new z(ThemePager.this.getContext(), (PageActivity) ThemePager.this.getContext(), m.j[0], ThemePager.this);
                        break;
                    case 2:
                        mVar = new r(ThemePager.this.getContext(), (PageActivity) ThemePager.this.getContext(), m.j[3], ThemePager.this);
                        break;
                    default:
                        mVar = view;
                        break;
                }
                mVar.setDiyButtonCallback(ThemePager.this);
                mVar.setScrollListener(ThemePager.this);
                mVar.setHeadViewHeight(ThemePager.c);
                ThemePager.this.k.put(i, mVar);
            } else {
                mVar = view;
            }
            viewGroup.addView(mVar, this.b);
            return mVar;
        }

        @Override // com.tsf.extend.base.support.a
        public void a(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // com.tsf.extend.base.support.a
        public boolean a(View view, Object obj) {
            return view == obj;
        }

        public View b(int i) {
            return (View) ThemePager.this.k.get(i);
        }
    }

    @Override // com.tsf.extend.base.support.ViewPager.e
    public void b(int i) {
        if (i == 0) {
            a();
        }
    }

    @Override // com.tsf.extend.base.support.ViewPager.e
    public void a(int i, float f, int i2) {
        if (this.f != null) {
            this.f.a(i, f, i2);
        }
    }

    @Override // com.tsf.extend.base.support.ViewPager.e
    public void a(int i) {
        if (this.f != null) {
            this.f.a(i);
            String str = this.n[i];
            ((Activity) getContext()).getIntent().getStringExtra("inlet");
            if (((Activity) getContext()).getIntent().getStringExtra("pushid") == null) {
            }
            if (this.q) {
                this.q = false;
            } else if (this.o) {
            }
            this.o = false;
        }
        if (this.i != i) {
            e(this.i);
        }
        this.i = i;
        d();
        this.j = System.currentTimeMillis();
    }

    public String getSecondTab() {
        if (this.i < 0 || this.i >= this.n.length) {
            return null;
        }
        return a(this.n[this.i]);
    }

    private String a(String str) {
        if (str.equals(getResources().getString(f.g.tab_new))) {
            return "1";
        }
        if (str.equals(getResources().getString(f.g.tab_hot))) {
            return "2";
        }
        if (!str.equals(getResources().getString(f.g.wallpaper_categories))) {
            return "1";
        }
        return "3";
    }

    @Override // com.tsf.extend.base.view.PagerIndicator.a
    public void c(int i) {
        com.tsf.extend.base.d a2 = com.tsf.extend.h.a();
        if (a2 != null) {
            a2.b(i + 1);
        }
        this.o = true;
        if (this.e != null) {
            this.e.a(i, true);
        }
    }

    @Override // com.tsf.extend.wallpaper.q
    public void a(View view, int i) {
        if (this.k.indexOfValue(view) == this.e.getCurrentItem()) {
            int i2 = i - c;
            if (i2 <= 0) {
                if (i2 < (-a)) {
                    i2 = -a;
                }
                if (Build.VERSION.SDK_INT >= 11) {
                    this.h.setTranslationY(i2);
                }
            } else if (Build.VERSION.SDK_INT >= 11) {
                this.h.setTranslationY(0.0f);
            }
            if (this.k != null && this.k.size() > 0) {
                if (i > c || i < b) {
                    if (i > c) {
                        i = c;
                    } else {
                        i = i < b ? b : 0;
                    }
                }
                for (int i3 = 0; i3 < this.k.size(); i3++) {
                    View valueAt = this.k.valueAt(i3);
                    if (valueAt != view && Build.VERSION.SDK_INT >= 14) {
                        valueAt.setScrollY(i);
                    }
                }
            }
        }
    }

    @Override // com.tsf.extend.wallpaper.PersonalizationActivity.h
    public void b(boolean z) {
    }

    public void a() {
        if (this.l && this.m != null) {
            this.m.c();
        }
    }

    public String getCurrentPageCode() {
        return this.e != null ? d(this.e.getCurrentItem()) : "0";
    }

    public String d(int i) {
        switch (i) {
            case 0:
                return "1001";
            case 1:
                return "1004";
            default:
                return "0";
        }
    }

    public void b() {
        if (!this.p && this.g != null) {
            View b2 = this.g.b(this.i);
            if (b2 instanceof m) {
                m mVar = (m) b2;
                this.p = true;
            }
        }
    }

    public int getCurrentIndex() {
        return this.i;
    }

    public void c() {
        e(this.i);
    }

    public void e(int i) {
        this.j = 0L;
    }

    public void d() {
    }

    public void e() {
        this.e.setCurrentItem(1);
    }

    public void f() {
        int size;
        if (this.r != null && this.s != null && (size = this.s.size()) > 0) {
            int i = this.u + 1;
            int i2 = (i < 0 || i >= size) ? 0 : i;
            this.r.setText(this.s.get(i2).a());
            this.u = i2;
            com.tsf.extend.wallpaper.ag.a().a(this.u);
        }
    }

    private void l() {
        if (this.s == null) {
            this.t = new a();
            v.h().a(this.t, a.b.Refresh);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements a.InterfaceC0048a<com.tsf.extend.base.b.a> {
        a() {
        }

        @Override // com.tsf.extend.base.d.a.InterfaceC0048a
        public void a(JSONObject jSONObject, final com.tsf.extend.base.b.a aVar) {
            com.tsf.extend.base.j.z.a(0, new Runnable() { // from class: com.tsf.extend.theme.ThemePager.a.1
                @Override // java.lang.Runnable
                public void run() {
                    if (aVar != null) {
                        ThemePager.this.s = aVar.a();
                        ThemePager.this.f();
                    }
                }
            });
        }

        @Override // com.tsf.extend.base.d.a.InterfaceC0048a
        public void a(JSONObject jSONObject, int i, com.tsf.extend.base.b.a aVar) {
            com.tsf.extend.base.j.z.a(0, new Runnable() { // from class: com.tsf.extend.theme.ThemePager.a.2
                @Override // java.lang.Runnable
                public void run() {
                }
            });
        }
    }
}
