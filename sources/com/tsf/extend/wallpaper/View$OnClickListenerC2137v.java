package com.tsf.extend.wallpaper;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.collect.Lists;
import com.tsf.extend.C1536f;
import com.tsf.extend.base.actstru.model.activi.PageActivity;
import com.tsf.extend.base.p071b.C1368a;
import com.tsf.extend.base.p074d.AbstractC1386a;
import com.tsf.extend.base.p080j.C1455z;
import com.tsf.extend.base.widget.pulltorefresh.PullToRefreshAndLoadMoreListView;
import com.tsf.extend.wallpaper.PersonalizationActivity;
import com.tsf.extend.wallpaper.View$OnClickListenerC2040ad;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;
/* renamed from: com.tsf.extend.wallpaper.v */
/* loaded from: classes.dex */
public class View$OnClickListenerC2137v extends FrameLayout implements View.OnClickListener, AbsListView.OnScrollListener, AdapterView.OnItemClickListener, InterfaceC2099p {

    /* renamed from: a */
    protected boolean f7028a;

    /* renamed from: b */
    protected C2144b f7029b;

    /* renamed from: c */
    protected long f7030c;

    /* renamed from: d */
    public C1368a f7031d;

    /* renamed from: e */
    private PageActivity f7032e;

    /* renamed from: f */
    private PullToRefreshAndLoadMoreListView f7033f;

    /* renamed from: g */
    private View f7034g;

    /* renamed from: h */
    private C2141a f7035h;

    /* renamed from: i */
    private List<C2145w> f7036i;

    /* renamed from: j */
    private List<C2141a.C2143b> f7037j;

    /* renamed from: k */
    private String f7038k;

    /* renamed from: l */
    private InterfaceC2100q f7039l;

    /* renamed from: m */
    private boolean f7040m;

    /* renamed from: n */
    private PersonalizationActivity.InterfaceC1949i f7041n;

    /* renamed from: o */
    private boolean f7042o;

    /* renamed from: p */
    private long f7043p;

    public View$OnClickListenerC2137v(Context context, PageActivity pageActivity, PersonalizationActivity.InterfaceC1949i interfaceC1949i) {
        super(context);
        this.f7028a = true;
        this.f7040m = false;
        this.f7041n = null;
        this.f7042o = false;
        this.f7043p = 0L;
        this.f7041n = interfaceC1949i;
        this.f7032e = pageActivity;
        this.f7034g = LayoutInflater.from(getContext()).inflate(C1536f.C1542f.retry_item, (ViewGroup) null);
        ((TextView) this.f7034g.findViewById(C1536f.C1541e.retry_text)).setTextColor(getResources().getColorStateList(C1536f.C1540d.wallpaper_list_retry_text_color));
        this.f7034g.setOnClickListener(this);
        this.f7037j = Lists.newArrayList();
        this.f7038k = getResources().getString(C1536f.C1543g.wallpaper_people_praise);
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(C1536f.C1539c.wallpaper_category_list_item_padding);
        View$OnClickListenerC2040ad.C2044a c2044a = new View$OnClickListenerC2040ad.C2044a(dimensionPixelSize, dimensionPixelSize);
        this.f7033f = (PullToRefreshAndLoadMoreListView) LayoutInflater.from(getContext()).inflate(C1536f.C1542f.wallpaper_list, (ViewGroup) null);
        this.f7033f.setHeaderResizeEnabled(true);
        this.f7033f.setDivider(c2044a);
        addView(this.f7033f, new FrameLayout.LayoutParams(-1, -1));
        this.f7033f.setCanLoadMore(false);
        this.f7035h = new C2141a();
        this.f7033f.setAdapter(this.f7035h);
        this.f7033f.setOnLoadListener(new PullToRefreshAndLoadMoreListView.InterfaceC1486a() { // from class: com.tsf.extend.wallpaper.v.1
            @Override // com.tsf.extend.base.widget.pulltorefresh.PullToRefreshAndLoadMoreListView.InterfaceC1486a
            /* renamed from: a */
            public void mo6254a() {
                View$OnClickListenerC2137v.this.f7030c = System.currentTimeMillis();
                AbstractC1386a.EnumC1397b enumC1397b = View$OnClickListenerC2137v.this.f7028a ? AbstractC1386a.EnumC1397b.LoadCache : AbstractC1386a.EnumC1397b.Refresh;
                View$OnClickListenerC2137v.this.f7029b = new C2144b(enumC1397b);
                C2148z.m6199h().m6216a(View$OnClickListenerC2137v.this.f7029b, enumC1397b);
            }

            @Override // com.tsf.extend.base.widget.pulltorefresh.PullToRefreshAndLoadMoreListView.InterfaceC1486a
            /* renamed from: b */
            public void mo6253b() {
            }
        });
        C1368a m6197j = C2148z.m6199h().m6197j();
        if (m6197j != null && m6197j.m8875a() != null) {
            this.f7028a = false;
            m6257b(m6197j.m8875a(), false);
        } else {
            this.f7033f.m8401k();
        }
        this.f7033f.setOnItemClickListener(this);
        this.f7033f.setOnScrollListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m6260a(final List<C2145w> list, final boolean z) {
        long j;
        long currentTimeMillis = System.currentTimeMillis() - this.f7030c;
        if (currentTimeMillis > 200) {
            j = 0;
        } else {
            j = 200 - currentTimeMillis;
        }
        C1455z.m8563a(0, new Runnable() { // from class: com.tsf.extend.wallpaper.v.2
            @Override // java.lang.Runnable
            public void run() {
                View$OnClickListenerC2137v.this.f7033f.m8402j();
            }
        }, j);
        C1455z.m8563a(0, new Runnable() { // from class: com.tsf.extend.wallpaper.v.3
            @Override // java.lang.Runnable
            public void run() {
                View$OnClickListenerC2137v.this.m6257b(list, z);
            }
        }, j + 150);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m6257b(List<C2145w> list, boolean z) {
        if (z || this.f7036i == null) {
            this.f7036i = list;
            if (list == null) {
                this.f7034g.setVisibility(0);
                this.f7033f.setEmptyView(this.f7034g);
                return;
            }
            this.f7035h.notifyDataSetChanged();
            return;
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < this.f7036i.size(); i++) {
            C2145w c2145w = this.f7036i.get(i);
            c2145w.m6240b(list.get(i).m6241b());
            hashMap.put(Integer.valueOf(c2145w.m6244a()), c2145w.m6241b());
        }
        ListView listView = this.f7033f.getListView();
        int childCount = listView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            C2141a.C2143b c2143b = (C2141a.C2143b) listView.getChildAt(i2).getTag();
            if (c2143b != null) {
                c2143b.f7055d.setText(((String) hashMap.get(Integer.valueOf(c2143b.f7052a.m6244a()))) + " " + this.f7038k);
            }
        }
    }

    @Override // android.view.View
    public void setScrollY(int i) {
        this.f7040m = true;
        if (this.f7033f != null) {
            int i2 = 0;
            int firstVisiblePosition = this.f7033f.getListView().getFirstVisiblePosition();
            if (i <= WallpaperPager.f6547c + WallpaperPager.f6548d) {
                if (firstVisiblePosition == 0) {
                    View childAt = this.f7033f.getListView().getChildAt(1);
                    if (childAt != null) {
                        i2 = childAt.getTop();
                    }
                    if (i2 > WallpaperPager.f6547c + WallpaperPager.f6548d) {
                        this.f7033f.getListView().setSelectionFromTop(1, WallpaperPager.f6547c + WallpaperPager.f6548d);
                        return;
                    }
                    return;
                }
                return;
            }
            View childAt2 = this.f7033f.getListView().getChildAt(1);
            if (childAt2 != null) {
                i2 = childAt2.getTop();
            }
            if (i2 != i || Build.VERSION.SDK_INT >= 19) {
                this.f7033f.getListView().setSelectionFromTop(1, i);
            }
        }
    }

    @Override // com.tsf.extend.wallpaper.InterfaceC2099p
    public void setScrollListener(InterfaceC2100q interfaceC2100q) {
        this.f7039l = interfaceC2100q;
    }

    @Override // com.tsf.extend.wallpaper.InterfaceC2099p
    public void setHeadViewHeight(int i) {
        if (this.f7033f != null) {
            this.f7033f.getHeaderFrame().addView(new View(getContext()), new FrameLayout.LayoutParams(-1, i));
        }
    }

    /* renamed from: com.tsf.extend.wallpaper.v$b */
    /* loaded from: classes.dex */
    private class C2144b implements AbstractC1386a.InterfaceC1396a<C1368a> {

        /* renamed from: b */
        private AbstractC1386a.EnumC1397b f7058b;

        public C2144b(AbstractC1386a.EnumC1397b enumC1397b) {
            this.f7058b = enumC1397b;
        }

        @Override // com.tsf.extend.base.p074d.AbstractC1386a.InterfaceC1396a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo6245a(JSONObject jSONObject, C1368a c1368a) {
            boolean z = false;
            View$OnClickListenerC2137v.this.f7028a = false;
            if (View$OnClickListenerC2137v.this.f7031d == null || c1368a == null || TextUtils.isEmpty(c1368a.m8861e()) || !c1368a.m8861e().equals(View$OnClickListenerC2137v.this.f7031d.m8861e())) {
                z = true;
            }
            View$OnClickListenerC2137v.this.f7031d = c1368a;
            View$OnClickListenerC2137v.this.m6260a(c1368a.m8875a(), z);
        }

        @Override // com.tsf.extend.base.p074d.AbstractC1386a.InterfaceC1396a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo6247a(JSONObject jSONObject, int i, C1368a c1368a) {
            boolean z = false;
            View$OnClickListenerC2137v.this.f7028a = false;
            if (View$OnClickListenerC2137v.this.f7031d == null || c1368a == null || TextUtils.isEmpty(c1368a.m8861e()) || !c1368a.m8861e().equals(View$OnClickListenerC2137v.this.f7031d.m8861e())) {
                z = true;
            }
            View$OnClickListenerC2137v.this.f7031d = c1368a;
            View$OnClickListenerC2137v.this.m6260a(c1368a == null ? null : c1368a.m8875a(), z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.extend.wallpaper.v$a */
    /* loaded from: classes.dex */
    public class C2141a extends BaseAdapter {

        /* renamed from: b */
        private C2142a f7050b = new C2142a();

        public C2141a() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            if (View$OnClickListenerC2137v.this.f7036i != null) {
                return View$OnClickListenerC2137v.this.f7036i.size();
            }
            return 0;
        }

        @Override // android.widget.Adapter
        /* renamed from: a */
        public C2145w getItem(int i) {
            if (View$OnClickListenerC2137v.this.f7036i != null) {
                return (C2145w) View$OnClickListenerC2137v.this.f7036i.get(i);
            }
            return null;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                C2143b c2143b = new C2143b();
                view = View.inflate(View$OnClickListenerC2137v.this.getContext(), C1536f.C1542f.wallpaper_categories_item, null);
                View$OnClickListenerC2137v.this.f7037j.add(c2143b);
                c2143b.f7053b = (WallpaperCategoryImageView) view.findViewById(C1536f.C1541e.category_img);
                c2143b.f7054c = (TextView) view.findViewById(C1536f.C1541e.category);
                c2143b.f7055d = (TextView) view.findViewById(C1536f.C1541e.category_praise);
                view.setTag(c2143b);
            }
            C2143b c2143b2 = (C2143b) view.getTag();
            C2145w item = getItem(i);
            c2143b2.f7052a = item;
            c2143b2.f7054c.setText(C2148z.m6199h().m6218a(View$OnClickListenerC2137v.this.getContext(), item.m6244a()).toUpperCase());
            c2143b2.f7055d.setText(item.m6241b() + " " + View$OnClickListenerC2137v.this.f7038k);
            c2143b2.f7053b.setBackgroundResource(C1536f.C1538b.personal_list_item_bg);
            c2143b2.f7053b.setBitmap(null);
            if (!TextUtils.isEmpty(item.m6239c())) {
                C2148z.m6199h().m8801a(item.m6239c(), this.f7050b);
            }
            return view;
        }

        /* renamed from: com.tsf.extend.wallpaper.v$a$b */
        /* loaded from: classes.dex */
        public class C2143b {

            /* renamed from: a */
            C2145w f7052a;

            /* renamed from: b */
            WallpaperCategoryImageView f7053b;

            /* renamed from: c */
            TextView f7054c;

            /* renamed from: d */
            TextView f7055d;

            public C2143b() {
            }
        }

        /* renamed from: com.tsf.extend.wallpaper.v$a$a */
        /* loaded from: classes.dex */
        class C2142a implements AbstractC1386a.InterfaceC1396a<Pair<String, Bitmap>> {
            C2142a() {
            }

            @Override // com.tsf.extend.base.p074d.AbstractC1386a.InterfaceC1396a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo6245a(JSONObject jSONObject, Pair<String, Bitmap> pair) {
                m6251a(pair);
            }

            /* renamed from: a */
            private void m6251a(Pair<String, Bitmap> pair) {
                if (pair != null) {
                    String str = (String) pair.first;
                    if (!TextUtils.isEmpty(str)) {
                        if (pair.second != null) {
                        }
                        for (C2143b c2143b : View$OnClickListenerC2137v.this.f7037j) {
                            if (c2143b.f7052a != null) {
                                String m6239c = c2143b.f7052a.m6239c();
                                if (!TextUtils.isEmpty(m6239c) && m6239c.equals(str)) {
                                    c2143b.f7053b.setBitmap((Bitmap) pair.second);
                                }
                            }
                        }
                    }
                }
            }

            @Override // com.tsf.extend.base.p074d.AbstractC1386a.InterfaceC1396a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo6247a(JSONObject jSONObject, int i, Pair<String, Bitmap> pair) {
                m6251a(pair);
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == C1536f.C1541e.retry) {
            this.f7034g.setVisibility(8);
            this.f7033f.m8401k();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        long currentTimeMillis = System.currentTimeMillis();
        if (Math.abs(this.f7043p - currentTimeMillis) >= 1000) {
            this.f7043p = currentTimeMillis;
            C2141a.C2143b c2143b = (C2141a.C2143b) view.getTag();
            if (c2143b != null && c2143b.f7052a != null) {
                WallpaperCategoryList wallpaperCategoryList = (WallpaperCategoryList) LayoutInflater.from(this.f7032e).inflate(C1536f.C1542f.wallpaper_category_list, (ViewGroup) null);
                wallpaperCategoryList.m6922a(this.f7032e, c2143b.f7052a, this.f7042o);
                this.f7032e.m8922a(wallpaperCategoryList);
            }
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i) {
        if (this.f7041n != null) {
            this.f7041n.mo6726a(absListView, i);
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        View childAt;
        int height = absListView.getHeight();
        for (C2141a.C2143b c2143b : this.f7037j) {
            c2143b.f7053b.m6924a(height);
        }
        if (this.f7039l != null && (childAt = absListView.getChildAt(1)) != null) {
            int top = i == 0 ? childAt.getTop() : 0;
            if (top >= 0 && !this.f7040m) {
                this.f7039l.mo6414a(this, top);
            }
            this.f7040m = false;
        }
    }

    public void setChooseWallpaperOnLine(boolean z) {
        this.f7042o = z;
    }

    /* renamed from: a */
    public void m6263a() {
        this.f7036i = new ArrayList();
        if (this.f7035h != null) {
            this.f7035h.notifyDataSetChanged();
        }
        if (this.f7033f != null) {
            this.f7033f.setOnScrollListener(null);
            this.f7033f.removeAllViews();
        }
        if (this.f7037j != null) {
            for (C2141a.C2143b c2143b : this.f7037j) {
                if (c2143b.f7053b != null) {
                    c2143b.f7053b.setBitmap(null);
                }
            }
            this.f7037j.clear();
        }
    }
}
