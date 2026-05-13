package com.tsf.extend.theme;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.collect.Lists;
import com.tsf.extend.base.actstru.model.activi.PageActivity;
import com.tsf.extend.base.d.a;
import com.tsf.extend.base.view.DecoratorViewPager;
import com.tsf.extend.f;
import com.tsf.extend.theme.c;
import com.tsf.extend.theme.t;
import com.tsf.extend.theme.v;
import com.tsf.extend.wallpaper.PersonalizationActivity;
import com.tsf.extend.wallpaper.WallpaperDetail;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class y extends t {
    boolean n;
    View.OnClickListener o;

    public y(Context context, List<t.b> list, View.OnClickListener onClickListener) {
        super(context, list, onClickListener);
        this.n = true;
        this.o = new View.OnClickListener() { // from class: com.tsf.extend.theme.y.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (y.this.n) {
                    y.this.n = false;
                    view.postDelayed(new Runnable() { // from class: com.tsf.extend.theme.y.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            y.this.n = true;
                        }
                    }, 1000L);
                    if (view.getTag() != null && (view.getTag() instanceof c)) {
                        PageActivity pageActivity = (PageActivity) y.this.b;
                        c cVar = (c) view.getTag();
                        if ((pageActivity instanceof PersonalizationActivity) && ((PersonalizationActivity) pageActivity).e() != null) {
                            ((PersonalizationActivity) pageActivity).e().getCurrentPageCode();
                        }
                        c.a aVar = cVar.a;
                        if ("1".equals(aVar.b)) {
                            k kVar = (k) aVar.d;
                            if (kVar != null) {
                                Context context2 = y.this.b;
                                String g = kVar.g();
                                if (g == null || g.isEmpty()) {
                                }
                                ThemeDetail themeDetail = (ThemeDetail) LayoutInflater.from(y.this.b).inflate(f.C0052f.theme_detail, (ViewGroup) null);
                                themeDetail.setFromInlet("30");
                                themeDetail.setFromTab("banner");
                                themeDetail.setTheme(kVar);
                                if (y.this.b instanceof PageActivity) {
                                    ((PageActivity) y.this.b).a(themeDetail);
                                }
                            }
                        } else if ("2".equals(aVar.b)) {
                            WallpaperDetail wallpaperDetail = (WallpaperDetail) LayoutInflater.from(view.getContext()).inflate(f.C0052f.wallpaper_detail, (ViewGroup) null);
                            wallpaperDetail.setType(com.tsf.extend.wallpaper.ai.NewType);
                            com.tsf.extend.wallpaper.m mVar = (com.tsf.extend.wallpaper.m) aVar.d;
                            if (mVar != null) {
                                ArrayList newArrayList = Lists.newArrayList();
                                newArrayList.add(mVar);
                                com.tsf.extend.wallpaper.aj.a(newArrayList);
                                wallpaperDetail.a((List<? extends com.tsf.extend.wallpaper.s>) newArrayList, (com.tsf.extend.wallpaper.s) mVar, false);
                                if (y.this.b instanceof PageActivity) {
                                    ((PageActivity) y.this.b).a(wallpaperDetail);
                                }
                            }
                        } else if ("3".equals(aVar.b)) {
                            if (aVar.d instanceof String) {
                                x.a(y.this.b, (String) aVar.d, "tsf_theme_center_theme");
                            }
                        } else if ("4".equals(aVar.b) && (y.this.b instanceof PageActivity)) {
                            ThemeAlbumsPager themeAlbumsPager = (ThemeAlbumsPager) LayoutInflater.from(y.this.b).inflate(f.C0052f.theme_albums_list, (ViewGroup) null);
                            v.a aVar2 = (v.a) aVar.d;
                            if (aVar2 != null) {
                                if (TextUtils.isEmpty(aVar2.b)) {
                                }
                                if (TextUtils.isEmpty(aVar2.a)) {
                                }
                                String str = "";
                                String e = y.this.e();
                                if (e != null) {
                                    if (e.equals("DATA_NEW")) {
                                        str = "101";
                                    } else if (e.equals("DATA_HOT")) {
                                        str = "102";
                                    }
                                }
                                themeAlbumsPager.a(aVar2.a, aVar2.b, str);
                                ((PageActivity) y.this.b).a(themeAlbumsPager);
                            }
                        }
                    }
                }
            }
        };
    }

    @Override // com.tsf.extend.theme.t, android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i) {
        return getItem(i).e() instanceof n ? 1 : 0;
    }

    @Override // com.tsf.extend.theme.t, android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 2;
    }

    @Override // com.tsf.extend.theme.t, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        int itemViewType = getItemViewType(i);
        if (itemViewType == 0) {
            return super.getView(i, view, viewGroup);
        }
        if (itemViewType == 1) {
            return a(i, view, viewGroup);
        }
        return null;
    }

    @Override // com.tsf.extend.theme.t
    protected int c() {
        return f.C0052f.theme_all_item_new_style;
    }

    private View a(int i, View view, ViewGroup viewGroup) {
        DecoratorViewPager decoratorViewPager;
        n nVar = (n) this.a.get(i).e();
        if (view == null) {
            view = LayoutInflater.from(this.b).inflate(f.C0052f.theme_list_item_album_entry, viewGroup, false);
            DecoratorViewPager decoratorViewPager2 = (DecoratorViewPager) view.findViewById(f.e.viewpager);
            a(decoratorViewPager2);
            decoratorViewPager2.setPageMargin(this.l * 2);
            decoratorViewPager = decoratorViewPager2;
        } else {
            decoratorViewPager = (DecoratorViewPager) view.findViewById(f.e.viewpager);
        }
        a aVar = new a(nVar, i);
        try {
            Field declaredField = ViewPager.class.getDeclaredField("U");
            declaredField.setAccessible(true);
            declaredField.set(decoratorViewPager, true);
        } catch (Exception e) {
            e.printStackTrace();
        }
        decoratorViewPager.setNestedpParent((ViewGroup) decoratorViewPager.getParent());
        decoratorViewPager.setAdapter(aVar);
        decoratorViewPager.setCurrentItem(b(nVar.b().size()));
        decoratorViewPager.setOnPageChangeListener(new b(i, decoratorViewPager.getCurrentItem(), nVar.b()));
        return view;
    }

    private int b(int i) {
        return 1000 - (1000 % i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(int i, int i2) {
        return i % i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends android.support.v4.view.ac {
        private ArrayList<c> b = new ArrayList<>();
        private C0064a c = new C0064a();
        private n d;
        private List<c.a> e;
        private int f;

        public a(n nVar, int i) {
            this.d = nVar;
            this.e = this.d.b();
            this.f = i;
        }

        @Override // android.support.v4.view.ac
        public int b() {
            return Integer.MAX_VALUE;
        }

        @Override // android.support.v4.view.ac
        public boolean a(View view, Object obj) {
            return view == obj;
        }

        @Override // android.support.v4.view.ac
        public float d(int i) {
            return 0.75f;
        }

        @Override // android.support.v4.view.ac
        public Object a(ViewGroup viewGroup, int i) {
            int size = i % this.e.size();
            c.a aVar = this.e.get(size);
            ImageView imageView = (ImageView) LayoutInflater.from(y.this.b).inflate(f.C0052f.theme_list_item_album_entry_image, viewGroup, false);
            a(imageView, aVar.c);
            imageView.setOnClickListener(y.this.o);
            c cVar = new c();
            cVar.b = imageView;
            cVar.a = aVar;
            cVar.d = size;
            cVar.e = this.f;
            imageView.setTag(cVar);
            this.b.add(cVar);
            if (!aVar.c.isEmpty()) {
                v.h().c(aVar.c, this.c);
            }
            viewGroup.addView(imageView);
            return imageView;
        }

        @Override // android.support.v4.view.ac
        public void a(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((ImageView) obj);
            if (((View) obj).getTag() != null) {
                ((c) ((View) obj).getTag()).c = null;
            }
            this.b.remove(((View) obj).getTag());
        }

        /* renamed from: com.tsf.extend.theme.y$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private class C0064a implements a.InterfaceC0048a<Pair<String, Bitmap>> {
            private C0064a() {
            }

            @Override // com.tsf.extend.base.d.a.InterfaceC0048a
            public void a(JSONObject jSONObject, Pair<String, Bitmap> pair) {
                Iterator it = a.this.b.iterator();
                while (it.hasNext()) {
                    c cVar = (c) it.next();
                    if (((String) pair.first).equals(cVar.a.c)) {
                        cVar.b.setScaleType(ImageView.ScaleType.FIT_XY);
                        cVar.b.setImageBitmap((Bitmap) pair.second);
                        cVar.c = (Bitmap) pair.second;
                    }
                }
            }

            @Override // com.tsf.extend.base.d.a.InterfaceC0048a
            public void a(JSONObject jSONObject, int i, Pair<String, Bitmap> pair) {
            }
        }

        private void a(ImageView imageView, String str) {
            c cVar = (c) imageView.getTag();
            if (cVar != null && !str.equals(cVar.a.c)) {
                imageView.setImageBitmap(null);
            }
        }
    }

    private void a(View view) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
        layoutParams.setMargins(this.g, this.i, this.g, this.k);
        view.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c {
        c.a a;
        ImageView b;
        Bitmap c;
        int d;
        int e;

        c() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements ViewPager.e {
        private int b;
        private int c;
        private List<c.a> d;

        public b(int i, int i2, List<c.a> list) {
            this.b = i;
            this.c = i2;
            this.d = list;
        }

        @Override // android.support.v4.view.ViewPager.e
        public void a(int i, float f, int i2) {
        }

        @Override // android.support.v4.view.ViewPager.e
        public void b_(int i) {
            int a = y.this.a(i, this.d.size());
            if (a != y.this.a(this.c, this.d.size())) {
                y.this.a(this.b, a, true, this.d.get(a));
                this.c = -1;
                return;
            }
            y.this.a(this.b, a, false, this.d.get(a));
        }

        @Override // android.support.v4.view.ViewPager.e
        public void c_(int i) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, int i2, boolean z, c.a aVar) {
        String str = "";
        String str2 = "";
        if ("1".equals(aVar.b)) {
            k kVar = (k) aVar.d;
            str = kVar == null ? "" : kVar.i();
            str2 = kVar == null ? "" : kVar.h() + "";
        } else if ("2".equals(aVar.b)) {
            com.tsf.extend.wallpaper.m mVar = (com.tsf.extend.wallpaper.m) aVar.d;
            str = mVar == null ? "" : mVar.h() + "";
            str2 = mVar == null ? "" : mVar.h() + "";
        } else if ("3".equals(aVar.b)) {
            if (aVar.d instanceof String) {
                x.a(this.b, (String) aVar.d, "tsf_theme_center_theme");
                str = aVar == null ? "" : aVar + "";
                str2 = "1";
            }
        } else if ("4".equals(aVar.b)) {
            v.a aVar2 = (v.a) aVar.d;
            str = aVar2 == null ? "" : aVar2.b + "";
            str2 = aVar2 == null ? "" : aVar2.a + "";
        }
        if (TextUtils.isEmpty(str)) {
        }
        if (TextUtils.isEmpty(str2)) {
        }
        if (z) {
        }
    }
}
