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
import com.tsf.extend.C1536f;
import com.tsf.extend.C1547h;
import com.tsf.extend.base.InterfaceC1385d;
import com.tsf.extend.base.actstru.model.activi.PageActivity;
import com.tsf.extend.base.p071b.C1368a;
import com.tsf.extend.base.p074d.AbstractC1386a;
import com.tsf.extend.base.p078h.C1413a;
import com.tsf.extend.base.p080j.C1423d;
import com.tsf.extend.base.p080j.C1455z;
import com.tsf.extend.base.support.AbstractC1468a;
import com.tsf.extend.base.support.ViewPager;
import com.tsf.extend.base.view.PagerIndicator;
import com.tsf.extend.theme.p084c.C1726e;
import com.tsf.extend.theme.p084c.View$OnClickListenerC1709c;
import com.tsf.extend.wallpaper.C2055ag;
import com.tsf.extend.wallpaper.InterfaceC2100q;
import com.tsf.extend.wallpaper.PersonalizationActivity;
import java.util.List;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class ThemePager extends FrameLayout implements View.OnClickListener, ViewPager.InterfaceC1464e, PagerIndicator.InterfaceC1473a, PersonalizationActivity.InterfaceC1948h, PersonalizationActivity.InterfaceC1949i, InterfaceC2100q {

    /* renamed from: a */
    public static int f5208a;

    /* renamed from: b */
    public static int f5209b;

    /* renamed from: c */
    public static int f5210c;

    /* renamed from: d */
    private PersonalizationActivity f5211d;

    /* renamed from: e */
    private ViewPager f5212e;

    /* renamed from: f */
    private PagerIndicator f5213f;

    /* renamed from: g */
    private C1630b f5214g;

    /* renamed from: h */
    private View f5215h;

    /* renamed from: i */
    private int f5216i;

    /* renamed from: j */
    private long f5217j;

    /* renamed from: k */
    private SparseArray<View> f5218k;

    /* renamed from: l */
    private boolean f5219l;

    /* renamed from: m */
    private PersonalizationActivity.C1946f f5220m;

    /* renamed from: n */
    private String[] f5221n;

    /* renamed from: o */
    private boolean f5222o;

    /* renamed from: p */
    private boolean f5223p;

    /* renamed from: q */
    private boolean f5224q;

    /* renamed from: r */
    private TextView f5225r;

    /* renamed from: s */
    private List<C1726e> f5226s;

    /* renamed from: t */
    private C1627a f5227t;

    /* renamed from: u */
    private int f5228u;

    /* renamed from: v */
    private boolean f5229v;

    /* renamed from: w */
    private int f5230w;

    /* renamed from: x */
    private int f5231x;

    /* renamed from: y */
    private int f5232y;

    /* renamed from: z */
    private int f5233z;

    public ThemePager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5217j = 0L;
        this.f5218k = new SparseArray<>();
        this.f5219l = false;
        this.f5220m = null;
        this.f5221n = new String[]{getResources().getString(C1536f.C1543g.tab_hot), getResources().getString(C1536f.C1543g.tab_new), getResources().getString(C1536f.C1543g.wallpaper_categories)};
        this.f5222o = false;
        this.f5223p = false;
        this.f5224q = true;
        this.f5228u = -1;
        this.f5229v = false;
        this.f5230w = 0;
        this.f5231x = 0;
        this.f5232y = 0;
        this.f5233z = 0;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        C1894v.m7069h();
        this.f5212e = (ViewPager) findViewById(C1536f.C1541e.viewpager);
        this.f5214g = new C1630b();
        this.f5212e.setOffscreenPageLimit(2);
        this.f5212e.setAdapter(this.f5214g);
        this.f5212e.setOnPageChangeListener(this);
        this.f5213f = (PagerIndicator) findViewById(C1536f.C1541e.wallpaper_indicator);
        this.f5213f.setOnPageClickedListener(this);
        int defaultPageIndex = getDefaultPageIndex();
        this.f5213f.m8480a(defaultPageIndex, this.f5221n);
        if (this.f5212e.getCurrentItem() != defaultPageIndex) {
            this.f5212e.setCurrentItem(defaultPageIndex);
        }
        this.f5216i = defaultPageIndex;
        this.f5215h = findViewById(C1536f.C1541e.theme_banner_group);
        this.f5229v = m7992g();
        int i = 0;
        if (this.f5229v) {
            i = PersonalizationActivity.m7012a(getContext(), 52.0f);
            this.f5228u = C2055ag.m6572a().m6562g();
        }
        f5208a = i;
        f5209b = getResources().getDimensionPixelSize(C1536f.C1539c.personal_indicator_height);
        f5210c = f5209b + f5208a;
        this.f5217j = System.currentTimeMillis();
        m7991h();
    }

    /* renamed from: g */
    private boolean m7992g() {
        String m8692a = C1423d.m8692a();
        return m8692a != null && m8692a.toLowerCase().startsWith("en");
    }

    /* renamed from: h */
    private void m7991h() {
        if (this.f5229v) {
            View inflate = ((ViewStub) findViewById(C1536f.C1541e.theme_search_entry_stub)).inflate();
            inflate.findViewById(C1536f.C1541e.theme_search_go).setOnClickListener(this);
            inflate.findViewById(C1536f.C1541e.theme_search_bar).setOnClickListener(this);
            this.f5225r = (TextView) inflate.findViewById(C1536f.C1541e.theme_search);
            m7987l();
        }
    }

    private int getDefaultPageIndex() {
        if (!m7990i() || !m7989j()) {
            return 1;
        }
        setFirstOpenThemeCenter(false);
        return 0;
    }

    /* renamed from: i */
    private boolean m7990i() {
        return C1413a.m8754a().m8745c(0) >= 30000;
    }

    /* renamed from: j */
    private boolean m7989j() {
        return C2055ag.m6572a().m6563f();
    }

    private void setFirstOpenThemeCenter(boolean z) {
        C2055ag.m6572a().m6569a(z);
    }

    public void setPagerActivity(PageActivity pageActivity) {
        if (pageActivity instanceof PersonalizationActivity) {
            this.f5211d = (PersonalizationActivity) pageActivity;
        }
    }

    private View getCurrentView() {
        return ((C1630b) this.f5212e.getAdapter()).m7984b(this.f5212e.getCurrentItem());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == C1536f.C1541e.theme_search_bar) {
            m8000a(true);
        } else if (id == C1536f.C1541e.theme_search_go) {
            m8000a(false);
        }
    }

    /* renamed from: a */
    void m8000a(boolean z) {
        this.f5211d.m8922a(new View$OnClickListenerC1709c(getContext(), this.f5228u, z, this.f5226s));
    }

    /* renamed from: k */
    private void m7988k() {
        if (this.f5231x != this.f5230w) {
            if (this.f5231x > this.f5230w) {
                this.f5220m.m6954a();
            } else {
                this.f5220m.m6952b();
            }
        } else if (this.f5233z > this.f5232y) {
            this.f5220m.m6952b();
        } else {
            this.f5220m.m6954a();
        }
    }

    @Override // com.tsf.extend.wallpaper.PersonalizationActivity.InterfaceC1949i
    /* renamed from: a */
    public void mo6726a(AbsListView absListView, int i) {
        View childAt;
        if (this.f5219l && (childAt = absListView.getChildAt(0)) != null) {
            if (i == 0) {
                this.f5231x = absListView.getFirstVisiblePosition();
                this.f5233z = childAt.getTop();
                m7988k();
            } else if (i == 1) {
                this.f5230w = absListView.getFirstVisiblePosition();
                this.f5232y = childAt.getTop();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.tsf.extend.theme.ThemePager$b */
    /* loaded from: classes.dex */
    public class C1630b extends AbstractC1468a {

        /* renamed from: b */
        private FrameLayout.LayoutParams f5239b;

        private C1630b() {
            this.f5239b = new FrameLayout.LayoutParams(-1, -1);
        }

        @Override // com.tsf.extend.base.support.AbstractC1468a
        /* renamed from: a */
        public int mo6712a() {
            return 3;
        }

        @Override // com.tsf.extend.base.support.AbstractC1468a
        /* renamed from: a */
        public Object mo6710a(ViewGroup viewGroup, int i) {
            View$OnClickListenerC1850m view$OnClickListenerC1850m;
            View view = (View) ThemePager.this.f5218k.get(i);
            if (view == null) {
                switch (i) {
                    case 0:
                        view$OnClickListenerC1850m = new C1928z(ThemePager.this.getContext(), (PageActivity) ThemePager.this.getContext(), View$OnClickListenerC1850m.f5946j[1], ThemePager.this);
                        break;
                    case 1:
                        view$OnClickListenerC1850m = new C1928z(ThemePager.this.getContext(), (PageActivity) ThemePager.this.getContext(), View$OnClickListenerC1850m.f5946j[0], ThemePager.this);
                        break;
                    case 2:
                        view$OnClickListenerC1850m = new C1884r(ThemePager.this.getContext(), (PageActivity) ThemePager.this.getContext(), View$OnClickListenerC1850m.f5946j[3], ThemePager.this);
                        break;
                    default:
                        view$OnClickListenerC1850m = view;
                        break;
                }
                view$OnClickListenerC1850m.setDiyButtonCallback(ThemePager.this);
                view$OnClickListenerC1850m.setScrollListener(ThemePager.this);
                view$OnClickListenerC1850m.setHeadViewHeight(ThemePager.f5210c);
                ThemePager.this.f5218k.put(i, view$OnClickListenerC1850m);
            } else {
                view$OnClickListenerC1850m = view;
            }
            viewGroup.addView(view$OnClickListenerC1850m, this.f5239b);
            return view$OnClickListenerC1850m;
        }

        @Override // com.tsf.extend.base.support.AbstractC1468a
        /* renamed from: a */
        public void mo6709a(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // com.tsf.extend.base.support.AbstractC1468a
        /* renamed from: a */
        public boolean mo6711a(View view, Object obj) {
            return view == obj;
        }

        /* renamed from: b */
        public View m7984b(int i) {
            return (View) ThemePager.this.f5218k.get(i);
        }
    }

    @Override // com.tsf.extend.base.support.ViewPager.InterfaceC1464e
    /* renamed from: b */
    public void mo6723b(int i) {
        if (i == 0) {
            m8004a();
        }
    }

    @Override // com.tsf.extend.base.support.ViewPager.InterfaceC1464e
    /* renamed from: a */
    public void mo6727a(int i, float f, int i2) {
        if (this.f5213f != null) {
            this.f5213f.m8482a(i, f, i2);
        }
    }

    @Override // com.tsf.extend.base.support.ViewPager.InterfaceC1464e
    /* renamed from: a */
    public void mo6728a(int i) {
        if (this.f5213f != null) {
            this.f5213f.m8484a(i);
            String str = this.f5221n[i];
            ((Activity) getContext()).getIntent().getStringExtra("inlet");
            if (((Activity) getContext()).getIntent().getStringExtra("pushid") == null) {
            }
            if (this.f5224q) {
                this.f5224q = false;
            } else if (this.f5222o) {
            }
            this.f5222o = false;
        }
        if (this.f5216i != i) {
            m7994e(this.f5216i);
        }
        this.f5216i = i;
        m7997d();
        this.f5217j = System.currentTimeMillis();
    }

    public String getSecondTab() {
        if (this.f5216i < 0 || this.f5216i >= this.f5221n.length) {
            return null;
        }
        return m8001a(this.f5221n[this.f5216i]);
    }

    /* renamed from: a */
    private String m8001a(String str) {
        if (str.equals(getResources().getString(C1536f.C1543g.tab_new))) {
            return "1";
        }
        if (str.equals(getResources().getString(C1536f.C1543g.tab_hot))) {
            return "2";
        }
        if (!str.equals(getResources().getString(C1536f.C1543g.wallpaper_categories))) {
            return "1";
        }
        return "3";
    }

    @Override // com.tsf.extend.base.view.PagerIndicator.InterfaceC1473a
    /* renamed from: c */
    public void mo6720c(int i) {
        InterfaceC1385d m8293a = C1547h.m8293a();
        if (m8293a != null) {
            m8293a.mo8813b(i + 1);
        }
        this.f5222o = true;
        if (this.f5212e != null) {
            this.f5212e.m8552a(i, true);
        }
    }

    @Override // com.tsf.extend.wallpaper.InterfaceC2100q
    /* renamed from: a */
    public void mo6414a(View view, int i) {
        if (this.f5218k.indexOfValue(view) == this.f5212e.getCurrentItem()) {
            int i2 = i - f5210c;
            if (i2 <= 0) {
                if (i2 < (-f5208a)) {
                    i2 = -f5208a;
                }
                if (Build.VERSION.SDK_INT >= 11) {
                    this.f5215h.setTranslationY(i2);
                }
            } else if (Build.VERSION.SDK_INT >= 11) {
                this.f5215h.setTranslationY(0.0f);
            }
            if (this.f5218k != null && this.f5218k.size() > 0) {
                if (i > f5210c || i < f5209b) {
                    if (i > f5210c) {
                        i = f5210c;
                    } else {
                        i = i < f5209b ? f5209b : 0;
                    }
                }
                for (int i3 = 0; i3 < this.f5218k.size(); i3++) {
                    View valueAt = this.f5218k.valueAt(i3);
                    if (valueAt != view && Build.VERSION.SDK_INT >= 14) {
                        valueAt.setScrollY(i);
                    }
                }
            }
        }
    }

    @Override // com.tsf.extend.wallpaper.PersonalizationActivity.InterfaceC1948h
    /* renamed from: b */
    public void mo6947b(boolean z) {
    }

    /* renamed from: a */
    public void m8004a() {
        if (this.f5219l && this.f5220m != null) {
            this.f5220m.m6950c();
        }
    }

    public String getCurrentPageCode() {
        return this.f5212e != null ? m7996d(this.f5212e.getCurrentItem()) : "0";
    }

    /* renamed from: d */
    public String m7996d(int i) {
        switch (i) {
            case 0:
                return "1001";
            case 1:
                return "1004";
            default:
                return "0";
        }
    }

    /* renamed from: b */
    public void m7999b() {
        if (!this.f5223p && this.f5214g != null) {
            View m7984b = this.f5214g.m7984b(this.f5216i);
            if (m7984b instanceof View$OnClickListenerC1850m) {
                View$OnClickListenerC1850m view$OnClickListenerC1850m = (View$OnClickListenerC1850m) m7984b;
                this.f5223p = true;
            }
        }
    }

    public int getCurrentIndex() {
        return this.f5216i;
    }

    /* renamed from: c */
    public void m7998c() {
        m7994e(this.f5216i);
    }

    /* renamed from: e */
    public void m7994e(int i) {
        this.f5217j = 0L;
    }

    /* renamed from: d */
    public void m7997d() {
    }

    /* renamed from: e */
    public void m7995e() {
        this.f5212e.setCurrentItem(1);
    }

    /* renamed from: f */
    public void m7993f() {
        int size;
        if (this.f5225r != null && this.f5226s != null && (size = this.f5226s.size()) > 0) {
            int i = this.f5228u + 1;
            int i2 = (i < 0 || i >= size) ? 0 : i;
            this.f5225r.setText(this.f5226s.get(i2).m7657a());
            this.f5228u = i2;
            C2055ag.m6572a().m6571a(this.f5228u);
        }
    }

    /* renamed from: l */
    private void m7987l() {
        if (this.f5226s == null) {
            this.f5227t = new C1627a();
            C1894v.m7069h().m7104a(this.f5227t, AbstractC1386a.EnumC1397b.Refresh);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.extend.theme.ThemePager$a */
    /* loaded from: classes.dex */
    public class C1627a implements AbstractC1386a.InterfaceC1396a<C1368a> {
        C1627a() {
        }

        @Override // com.tsf.extend.base.p074d.AbstractC1386a.InterfaceC1396a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo6245a(JSONObject jSONObject, final C1368a c1368a) {
            C1455z.m8564a(0, new Runnable() { // from class: com.tsf.extend.theme.ThemePager.a.1
                @Override // java.lang.Runnable
                public void run() {
                    if (c1368a != null) {
                        ThemePager.this.f5226s = c1368a.m8875a();
                        ThemePager.this.m7993f();
                    }
                }
            });
        }

        @Override // com.tsf.extend.base.p074d.AbstractC1386a.InterfaceC1396a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo6247a(JSONObject jSONObject, int i, C1368a c1368a) {
            C1455z.m8564a(0, new Runnable() { // from class: com.tsf.extend.theme.ThemePager.a.2
                @Override // java.lang.Runnable
                public void run() {
                }
            });
        }
    }
}
