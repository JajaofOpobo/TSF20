package com.tsf.extend.theme;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.p002v4.view.AbstractC0299ac;
import android.support.p002v4.view.ViewPager;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.collect.Lists;
import com.tsf.extend.C1536f;
import com.tsf.extend.base.actstru.model.activi.PageActivity;
import com.tsf.extend.base.p074d.AbstractC1386a;
import com.tsf.extend.base.view.DecoratorViewPager;
import com.tsf.extend.theme.C1705c;
import com.tsf.extend.theme.C1887t;
import com.tsf.extend.theme.C1894v;
import com.tsf.extend.wallpaper.C2058aj;
import com.tsf.extend.wallpaper.C2094m;
import com.tsf.extend.wallpaper.C2106s;
import com.tsf.extend.wallpaper.EnumC2057ai;
import com.tsf.extend.wallpaper.PersonalizationActivity;
import com.tsf.extend.wallpaper.WallpaperDetail;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
/* renamed from: com.tsf.extend.theme.y */
/* loaded from: classes.dex */
public class C1921y extends C1887t {

    /* renamed from: n */
    boolean f6167n;

    /* renamed from: o */
    View.OnClickListener f6168o;

    public C1921y(Context context, List<C1887t.C1890b> list, View.OnClickListener onClickListener) {
        super(context, list, onClickListener);
        this.f6167n = true;
        this.f6168o = new View.OnClickListener() { // from class: com.tsf.extend.theme.y.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (C1921y.this.f6167n) {
                    C1921y.this.f6167n = false;
                    view.postDelayed(new Runnable() { // from class: com.tsf.extend.theme.y.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            C1921y.this.f6167n = true;
                        }
                    }, 1000L);
                    if (view.getTag() != null && (view.getTag() instanceof C1927c)) {
                        PageActivity pageActivity = (PageActivity) C1921y.this.f6060b;
                        C1927c c1927c = (C1927c) view.getTag();
                        if ((pageActivity instanceof PersonalizationActivity) && ((PersonalizationActivity) pageActivity).m6978e() != null) {
                            ((PersonalizationActivity) pageActivity).m6978e().getCurrentPageCode();
                        }
                        C1705c.C1706a c1706a = c1927c.f6182a;
                        if ("1".equals(c1706a.f5479b)) {
                            C1848k c1848k = (C1848k) c1706a.f5481d;
                            if (c1848k != null) {
                                Context context2 = C1921y.this.f6060b;
                                String m7300g = c1848k.m7300g();
                                if (m7300g == null || m7300g.isEmpty()) {
                                }
                                ThemeDetail themeDetail = (ThemeDetail) LayoutInflater.from(C1921y.this.f6060b).inflate(C1536f.C1542f.theme_detail, (ViewGroup) null);
                                themeDetail.setFromInlet("30");
                                themeDetail.setFromTab("banner");
                                themeDetail.setTheme(c1848k);
                                if (C1921y.this.f6060b instanceof PageActivity) {
                                    ((PageActivity) C1921y.this.f6060b).m8922a(themeDetail);
                                }
                            }
                        } else if ("2".equals(c1706a.f5479b)) {
                            WallpaperDetail wallpaperDetail = (WallpaperDetail) LayoutInflater.from(view.getContext()).inflate(C1536f.C1542f.wallpaper_detail, (ViewGroup) null);
                            wallpaperDetail.setType(EnumC2057ai.NewType);
                            C2094m c2094m = (C2094m) c1706a.f5481d;
                            if (c2094m != null) {
                                ArrayList newArrayList = Lists.newArrayList();
                                newArrayList.add(c2094m);
                                C2058aj.m6551a(newArrayList);
                                wallpaperDetail.m6854a((List<? extends C2106s>) newArrayList, (C2106s) c2094m, false);
                                if (C1921y.this.f6060b instanceof PageActivity) {
                                    ((PageActivity) C1921y.this.f6060b).m8922a(wallpaperDetail);
                                }
                            }
                        } else if ("3".equals(c1706a.f5479b)) {
                            if (c1706a.f5481d instanceof String) {
                                C1920x.m7052a(C1921y.this.f6060b, (String) c1706a.f5481d, "tsf_theme_center_theme");
                            }
                        } else if ("4".equals(c1706a.f5479b) && (C1921y.this.f6060b instanceof PageActivity)) {
                            ThemeAlbumsPager themeAlbumsPager = (ThemeAlbumsPager) LayoutInflater.from(C1921y.this.f6060b).inflate(C1536f.C1542f.theme_albums_list, (ViewGroup) null);
                            C1894v.C1915a c1915a = (C1894v.C1915a) c1706a.f5481d;
                            if (c1915a != null) {
                                if (TextUtils.isEmpty(c1915a.f6161b)) {
                                }
                                if (TextUtils.isEmpty(c1915a.f6160a)) {
                                }
                                String str = "";
                                String e = C1921y.this.m7127e();
                                if (e != null) {
                                    if (e.equals("DATA_NEW")) {
                                        str = "101";
                                    } else if (e.equals("DATA_HOT")) {
                                        str = "102";
                                    }
                                }
                                themeAlbumsPager.m8164a(c1915a.f6160a, c1915a.f6161b, str);
                                ((PageActivity) C1921y.this.f6060b).m8922a(themeAlbumsPager);
                            }
                        }
                    }
                }
            }
        };
    }

    @Override // com.tsf.extend.theme.C1887t, android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i) {
        return getItem(i).m7118e() instanceof C1858n ? 1 : 0;
    }

    @Override // com.tsf.extend.theme.C1887t, android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 2;
    }

    @Override // com.tsf.extend.theme.C1887t, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        int itemViewType = getItemViewType(i);
        if (itemViewType == 0) {
            return super.getView(i, view, viewGroup);
        }
        if (itemViewType == 1) {
            return m7043a(i, view, viewGroup);
        }
        return null;
    }

    @Override // com.tsf.extend.theme.C1887t
    /* renamed from: c */
    protected int mo7038c() {
        return C1536f.C1542f.theme_all_item_new_style;
    }

    /* renamed from: a */
    private View m7043a(int i, View view, ViewGroup viewGroup) {
        DecoratorViewPager decoratorViewPager;
        C1858n c1858n = (C1858n) this.f6059a.get(i).m7118e();
        if (view == null) {
            view = LayoutInflater.from(this.f6060b).inflate(C1536f.C1542f.theme_list_item_album_entry, viewGroup, false);
            DecoratorViewPager decoratorViewPager2 = (DecoratorViewPager) view.findViewById(C1536f.C1541e.viewpager);
            m7042a(decoratorViewPager2);
            decoratorViewPager2.setPageMargin(this.f6070l * 2);
            decoratorViewPager = decoratorViewPager2;
        } else {
            decoratorViewPager = (DecoratorViewPager) view.findViewById(C1536f.C1541e.viewpager);
        }
        C1924a c1924a = new C1924a(c1858n, i);
        try {
            Field declaredField = ViewPager.class.getDeclaredField("U");
            declaredField.setAccessible(true);
            declaredField.set(decoratorViewPager, true);
        } catch (Exception e) {
            e.printStackTrace();
        }
        decoratorViewPager.setNestedpParent((ViewGroup) decoratorViewPager.getParent());
        decoratorViewPager.setAdapter(c1924a);
        decoratorViewPager.setCurrentItem(m7039b(c1858n.m7235b().size()));
        decoratorViewPager.setOnPageChangeListener(new C1926b(i, decoratorViewPager.getCurrentItem(), c1858n.m7235b()));
        return view;
    }

    /* renamed from: b */
    private int m7039b(int i) {
        return 1000 - (1000 % i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public int m7045a(int i, int i2) {
        return i % i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.extend.theme.y$a */
    /* loaded from: classes.dex */
    public class C1924a extends AbstractC0299ac {

        /* renamed from: b */
        private ArrayList<C1927c> f6172b = new ArrayList<>();

        /* renamed from: c */
        private C1925a f6173c = new C1925a();

        /* renamed from: d */
        private C1858n f6174d;

        /* renamed from: e */
        private List<C1705c.C1706a> f6175e;

        /* renamed from: f */
        private int f6176f;

        public C1924a(C1858n c1858n, int i) {
            this.f6174d = c1858n;
            this.f6175e = this.f6174d.m7235b();
            this.f6176f = i;
        }

        @Override // android.support.p002v4.view.AbstractC0299ac
        /* renamed from: b */
        public int mo938b() {
            return Integer.MAX_VALUE;
        }

        @Override // android.support.p002v4.view.AbstractC0299ac
        /* renamed from: a */
        public boolean mo7037a(View view, Object obj) {
            return view == obj;
        }

        @Override // android.support.p002v4.view.AbstractC0299ac
        /* renamed from: d */
        public float mo7032d(int i) {
            return 0.75f;
        }

        @Override // android.support.p002v4.view.AbstractC0299ac
        /* renamed from: a */
        public Object mo7036a(ViewGroup viewGroup, int i) {
            int size = i % this.f6175e.size();
            C1705c.C1706a c1706a = this.f6175e.get(size);
            ImageView imageView = (ImageView) LayoutInflater.from(C1921y.this.f6060b).inflate(C1536f.C1542f.theme_list_item_album_entry_image, viewGroup, false);
            m7034a(imageView, c1706a.f5480c);
            imageView.setOnClickListener(C1921y.this.f6168o);
            C1927c c1927c = new C1927c();
            c1927c.f6183b = imageView;
            c1927c.f6182a = c1706a;
            c1927c.f6185d = size;
            c1927c.f6186e = this.f6176f;
            imageView.setTag(c1927c);
            this.f6172b.add(c1927c);
            if (!c1706a.f5480c.isEmpty()) {
                C1894v.m7069h().m7079c(c1706a.f5480c, this.f6173c);
            }
            viewGroup.addView(imageView);
            return imageView;
        }

        @Override // android.support.p002v4.view.AbstractC0299ac
        /* renamed from: a */
        public void mo7035a(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((ImageView) obj);
            if (((View) obj).getTag() != null) {
                ((C1927c) ((View) obj).getTag()).f6184c = null;
            }
            this.f6172b.remove(((View) obj).getTag());
        }

        /* renamed from: com.tsf.extend.theme.y$a$a */
        /* loaded from: classes.dex */
        private class C1925a implements AbstractC1386a.InterfaceC1396a<Pair<String, Bitmap>> {
            private C1925a() {
            }

            @Override // com.tsf.extend.base.p074d.AbstractC1386a.InterfaceC1396a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo6245a(JSONObject jSONObject, Pair<String, Bitmap> pair) {
                Iterator it = C1924a.this.f6172b.iterator();
                while (it.hasNext()) {
                    C1927c c1927c = (C1927c) it.next();
                    if (((String) pair.first).equals(c1927c.f6182a.f5480c)) {
                        c1927c.f6183b.setScaleType(ImageView.ScaleType.FIT_XY);
                        c1927c.f6183b.setImageBitmap((Bitmap) pair.second);
                        c1927c.f6184c = (Bitmap) pair.second;
                    }
                }
            }

            @Override // com.tsf.extend.base.p074d.AbstractC1386a.InterfaceC1396a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo6247a(JSONObject jSONObject, int i, Pair<String, Bitmap> pair) {
            }
        }

        /* renamed from: a */
        private void m7034a(ImageView imageView, String str) {
            C1927c c1927c = (C1927c) imageView.getTag();
            if (c1927c != null && !str.equals(c1927c.f6182a.f5480c)) {
                imageView.setImageBitmap(null);
            }
        }
    }

    /* renamed from: a */
    private void m7042a(View view) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
        layoutParams.setMargins(this.f6065g, this.f6067i, this.f6065g, this.f6069k);
        view.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.extend.theme.y$c */
    /* loaded from: classes.dex */
    public class C1927c {

        /* renamed from: a */
        C1705c.C1706a f6182a;

        /* renamed from: b */
        ImageView f6183b;

        /* renamed from: c */
        Bitmap f6184c;

        /* renamed from: d */
        int f6185d;

        /* renamed from: e */
        int f6186e;

        C1927c() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.extend.theme.y$b */
    /* loaded from: classes.dex */
    public class C1926b implements ViewPager.InterfaceC0245e {

        /* renamed from: b */
        private int f6179b;

        /* renamed from: c */
        private int f6180c;

        /* renamed from: d */
        private List<C1705c.C1706a> f6181d;

        public C1926b(int i, int i2, List<C1705c.C1706a> list) {
            this.f6179b = i;
            this.f6180c = i2;
            this.f6181d = list;
        }

        @Override // android.support.p002v4.view.ViewPager.InterfaceC0245e
        /* renamed from: a */
        public void mo940a(int i, float f, int i2) {
        }

        @Override // android.support.p002v4.view.ViewPager.InterfaceC0245e
        /* renamed from: b_ */
        public void mo937b_(int i) {
            int m7045a = C1921y.this.m7045a(i, this.f6181d.size());
            if (m7045a != C1921y.this.m7045a(this.f6180c, this.f6181d.size())) {
                C1921y.this.m7044a(this.f6179b, m7045a, true, this.f6181d.get(m7045a));
                this.f6180c = -1;
                return;
            }
            C1921y.this.m7044a(this.f6179b, m7045a, false, this.f6181d.get(m7045a));
        }

        @Override // android.support.p002v4.view.ViewPager.InterfaceC0245e
        /* renamed from: c_ */
        public void mo936c_(int i) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m7044a(int i, int i2, boolean z, C1705c.C1706a c1706a) {
        String str = "";
        String str2 = "";
        if ("1".equals(c1706a.f5479b)) {
            C1848k c1848k = (C1848k) c1706a.f5481d;
            str = c1848k == null ? "" : c1848k.m7294i();
            str2 = c1848k == null ? "" : c1848k.m7297h() + "";
        } else if ("2".equals(c1706a.f5479b)) {
            C2094m c2094m = (C2094m) c1706a.f5481d;
            str = c2094m == null ? "" : c2094m.m6431h() + "";
            str2 = c2094m == null ? "" : c2094m.m6431h() + "";
        } else if ("3".equals(c1706a.f5479b)) {
            if (c1706a.f5481d instanceof String) {
                C1920x.m7052a(this.f6060b, (String) c1706a.f5481d, "tsf_theme_center_theme");
                str = c1706a == null ? "" : c1706a + "";
                str2 = "1";
            }
        } else if ("4".equals(c1706a.f5479b)) {
            C1894v.C1915a c1915a = (C1894v.C1915a) c1706a.f5481d;
            str = c1915a == null ? "" : c1915a.f6161b + "";
            str2 = c1915a == null ? "" : c1915a.f6160a + "";
        }
        if (TextUtils.isEmpty(str)) {
        }
        if (TextUtils.isEmpty(str2)) {
        }
        if (z) {
        }
    }
}
