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
import com.tsf.extend.base.actstru.model.activi.PageActivity;
import com.tsf.extend.base.d.a;
import com.tsf.extend.base.widget.pulltorefresh.PullToRefreshAndLoadMoreListView;
import com.tsf.extend.f;
import com.tsf.extend.wallpaper.PersonalizationActivity;
import com.tsf.extend.wallpaper.ad;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class v extends FrameLayout implements View.OnClickListener, AbsListView.OnScrollListener, AdapterView.OnItemClickListener, p {
    protected boolean a;
    protected b b;
    protected long c;
    public com.tsf.extend.base.b.a d;
    private PageActivity e;
    private PullToRefreshAndLoadMoreListView f;
    private View g;
    private a h;
    private List<w> i;
    private List<a.b> j;
    private String k;
    private q l;
    private boolean m;
    private PersonalizationActivity.i n;
    private boolean o;
    private long p;

    public v(Context context, PageActivity pageActivity, PersonalizationActivity.i iVar) {
        super(context);
        this.a = true;
        this.m = false;
        this.n = null;
        this.o = false;
        this.p = 0L;
        this.n = iVar;
        this.e = pageActivity;
        this.g = LayoutInflater.from(getContext()).inflate(f.C0052f.retry_item, (ViewGroup) null);
        ((TextView) this.g.findViewById(f.e.retry_text)).setTextColor(getResources().getColorStateList(f.d.wallpaper_list_retry_text_color));
        this.g.setOnClickListener(this);
        this.j = Lists.newArrayList();
        this.k = getResources().getString(f.g.wallpaper_people_praise);
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(f.c.wallpaper_category_list_item_padding);
        ad.a aVar = new ad.a(dimensionPixelSize, dimensionPixelSize);
        this.f = (PullToRefreshAndLoadMoreListView) LayoutInflater.from(getContext()).inflate(f.C0052f.wallpaper_list, (ViewGroup) null);
        this.f.setHeaderResizeEnabled(true);
        this.f.setDivider(aVar);
        addView(this.f, new FrameLayout.LayoutParams(-1, -1));
        this.f.setCanLoadMore(false);
        this.h = new a();
        this.f.setAdapter(this.h);
        this.f.setOnLoadListener(new PullToRefreshAndLoadMoreListView.a() { // from class: com.tsf.extend.wallpaper.v.1
            @Override // com.tsf.extend.base.widget.pulltorefresh.PullToRefreshAndLoadMoreListView.a
            public void a() {
                v.this.c = System.currentTimeMillis();
                a.b bVar = v.this.a ? a.b.LoadCache : a.b.Refresh;
                v.this.b = new b(bVar);
                z.h().a(v.this.b, bVar);
            }

            @Override // com.tsf.extend.base.widget.pulltorefresh.PullToRefreshAndLoadMoreListView.a
            public void b() {
            }
        });
        com.tsf.extend.base.b.a j = z.h().j();
        if (j != null && j.a() != null) {
            this.a = false;
            b(j.a(), false);
        } else {
            this.f.k();
        }
        this.f.setOnItemClickListener(this);
        this.f.setOnScrollListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final List<w> list, final boolean z) {
        long j;
        long currentTimeMillis = System.currentTimeMillis() - this.c;
        if (currentTimeMillis > 200) {
            j = 0;
        } else {
            j = 200 - currentTimeMillis;
        }
        com.tsf.extend.base.j.z.a(0, new Runnable() { // from class: com.tsf.extend.wallpaper.v.2
            @Override // java.lang.Runnable
            public void run() {
                v.this.f.j();
            }
        }, j);
        com.tsf.extend.base.j.z.a(0, new Runnable() { // from class: com.tsf.extend.wallpaper.v.3
            @Override // java.lang.Runnable
            public void run() {
                v.this.b(list, z);
            }
        }, j + 150);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(List<w> list, boolean z) {
        if (z || this.i == null) {
            this.i = list;
            if (list == null) {
                this.g.setVisibility(0);
                this.f.setEmptyView(this.g);
                return;
            }
            this.h.notifyDataSetChanged();
            return;
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < this.i.size(); i++) {
            w wVar = this.i.get(i);
            wVar.b(list.get(i).b());
            hashMap.put(Integer.valueOf(wVar.a()), wVar.b());
        }
        ListView listView = this.f.getListView();
        int childCount = listView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            a.b bVar = (a.b) listView.getChildAt(i2).getTag();
            if (bVar != null) {
                bVar.d.setText(((String) hashMap.get(Integer.valueOf(bVar.a.a()))) + " " + this.k);
            }
        }
    }

    @Override // android.view.View
    public void setScrollY(int i) {
        this.m = true;
        if (this.f != null) {
            int i2 = 0;
            int firstVisiblePosition = this.f.getListView().getFirstVisiblePosition();
            if (i <= WallpaperPager.c + WallpaperPager.d) {
                if (firstVisiblePosition == 0) {
                    View childAt = this.f.getListView().getChildAt(1);
                    if (childAt != null) {
                        i2 = childAt.getTop();
                    }
                    if (i2 > WallpaperPager.c + WallpaperPager.d) {
                        this.f.getListView().setSelectionFromTop(1, WallpaperPager.c + WallpaperPager.d);
                        return;
                    }
                    return;
                }
                return;
            }
            View childAt2 = this.f.getListView().getChildAt(1);
            if (childAt2 != null) {
                i2 = childAt2.getTop();
            }
            if (i2 != i || Build.VERSION.SDK_INT >= 19) {
                this.f.getListView().setSelectionFromTop(1, i);
            }
        }
    }

    @Override // com.tsf.extend.wallpaper.p
    public void setScrollListener(q qVar) {
        this.l = qVar;
    }

    @Override // com.tsf.extend.wallpaper.p
    public void setHeadViewHeight(int i) {
        if (this.f != null) {
            this.f.getHeaderFrame().addView(new View(getContext()), new FrameLayout.LayoutParams(-1, i));
        }
    }

    /* loaded from: classes.dex */
    private class b implements a.InterfaceC0048a<com.tsf.extend.base.b.a> {
        private a.b b;

        public b(a.b bVar) {
            this.b = bVar;
        }

        @Override // com.tsf.extend.base.d.a.InterfaceC0048a
        public void a(JSONObject jSONObject, com.tsf.extend.base.b.a aVar) {
            boolean z = false;
            v.this.a = false;
            if (v.this.d == null || aVar == null || TextUtils.isEmpty(aVar.e()) || !aVar.e().equals(v.this.d.e())) {
                z = true;
            }
            v.this.d = aVar;
            v.this.a(aVar.a(), z);
        }

        @Override // com.tsf.extend.base.d.a.InterfaceC0048a
        public void a(JSONObject jSONObject, int i, com.tsf.extend.base.b.a aVar) {
            boolean z = false;
            v.this.a = false;
            if (v.this.d == null || aVar == null || TextUtils.isEmpty(aVar.e()) || !aVar.e().equals(v.this.d.e())) {
                z = true;
            }
            v.this.d = aVar;
            v.this.a(aVar == null ? null : aVar.a(), z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends BaseAdapter {
        private C0072a b = new C0072a();

        public a() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            if (v.this.i != null) {
                return v.this.i.size();
            }
            return 0;
        }

        @Override // android.widget.Adapter
        /* renamed from: a */
        public w getItem(int i) {
            if (v.this.i != null) {
                return (w) v.this.i.get(i);
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
                b bVar = new b();
                view = View.inflate(v.this.getContext(), f.C0052f.wallpaper_categories_item, null);
                v.this.j.add(bVar);
                bVar.b = (WallpaperCategoryImageView) view.findViewById(f.e.category_img);
                bVar.c = (TextView) view.findViewById(f.e.category);
                bVar.d = (TextView) view.findViewById(f.e.category_praise);
                view.setTag(bVar);
            }
            b bVar2 = (b) view.getTag();
            w item = getItem(i);
            bVar2.a = item;
            bVar2.c.setText(z.h().a(v.this.getContext(), item.a()).toUpperCase());
            bVar2.d.setText(item.b() + " " + v.this.k);
            bVar2.b.setBackgroundResource(f.b.personal_list_item_bg);
            bVar2.b.setBitmap(null);
            if (!TextUtils.isEmpty(item.c())) {
                z.h().a(item.c(), this.b);
            }
            return view;
        }

        /* loaded from: classes.dex */
        public class b {
            w a;
            WallpaperCategoryImageView b;
            TextView c;
            TextView d;

            public b() {
            }
        }

        /* renamed from: com.tsf.extend.wallpaper.v$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0072a implements a.InterfaceC0048a<Pair<String, Bitmap>> {
            C0072a() {
            }

            @Override // com.tsf.extend.base.d.a.InterfaceC0048a
            public void a(JSONObject jSONObject, Pair<String, Bitmap> pair) {
                a(pair);
            }

            private void a(Pair<String, Bitmap> pair) {
                if (pair != null) {
                    String str = (String) pair.first;
                    if (!TextUtils.isEmpty(str)) {
                        if (pair.second != null) {
                        }
                        for (b bVar : v.this.j) {
                            if (bVar.a != null) {
                                String c = bVar.a.c();
                                if (!TextUtils.isEmpty(c) && c.equals(str)) {
                                    bVar.b.setBitmap((Bitmap) pair.second);
                                }
                            }
                        }
                    }
                }
            }

            @Override // com.tsf.extend.base.d.a.InterfaceC0048a
            public void a(JSONObject jSONObject, int i, Pair<String, Bitmap> pair) {
                a(pair);
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == f.e.retry) {
            this.g.setVisibility(8);
            this.f.k();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        long currentTimeMillis = System.currentTimeMillis();
        if (Math.abs(this.p - currentTimeMillis) >= 1000) {
            this.p = currentTimeMillis;
            a.b bVar = (a.b) view.getTag();
            if (bVar != null && bVar.a != null) {
                WallpaperCategoryList wallpaperCategoryList = (WallpaperCategoryList) LayoutInflater.from(this.e).inflate(f.C0052f.wallpaper_category_list, (ViewGroup) null);
                wallpaperCategoryList.a(this.e, bVar.a, this.o);
                this.e.a(wallpaperCategoryList);
            }
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i) {
        if (this.n != null) {
            this.n.a(absListView, i);
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        View childAt;
        int height = absListView.getHeight();
        for (a.b bVar : this.j) {
            bVar.b.a(height);
        }
        if (this.l != null && (childAt = absListView.getChildAt(1)) != null) {
            int top = i == 0 ? childAt.getTop() : 0;
            if (top >= 0 && !this.m) {
                this.l.a(this, top);
            }
            this.m = false;
        }
    }

    public void setChooseWallpaperOnLine(boolean z) {
        this.o = z;
    }

    public void a() {
        this.i = new ArrayList();
        if (this.h != null) {
            this.h.notifyDataSetChanged();
        }
        if (this.f != null) {
            this.f.setOnScrollListener(null);
            this.f.removeAllViews();
        }
        if (this.j != null) {
            for (a.b bVar : this.j) {
                if (bVar.b != null) {
                    bVar.b.setBitmap(null);
                }
            }
            this.j.clear();
        }
    }
}
