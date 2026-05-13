package com.tsf.extend.wallpaper;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;
import com.google.android.collect.Lists;
import com.tsf.extend.base.actstru.model.activi.PageActivity;
import com.tsf.extend.f;
import com.tsf.extend.wallpaper.WallpaperDetail;
import com.tsf.extend.wallpaper.ad;
import com.tsf.extend.wallpaper.i;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class h extends FrameLayout implements View.OnClickListener, WallpaperDetail.b, i.a {
    private static g a = new g(true);
    private static g b = new g();
    private static g c = new g();
    private static List<g> d = new ArrayList();
    private g e;
    private ListView f;
    private a g;
    private List<g> h;
    private float i;
    private int j;
    private int k;
    private ad.a l;
    private List<Pair<g, g>> m;
    private LayoutInflater n;
    private List<b> o;
    private PageActivity p;
    private int q;
    private int r;
    private long s;
    private boolean t;
    private List<g> u;

    public h(Context context) {
        super(context);
        this.t = false;
        this.u = Lists.newArrayList();
        this.p = (PageActivity) context;
        this.o = Lists.newArrayList();
        this.n = LayoutInflater.from(getContext());
        this.m = Lists.newArrayList();
        this.h = Lists.newArrayList();
        this.f = new ListView(context);
        addView(this.f, new FrameLayout.LayoutParams(-1, -1));
        this.g = new a();
        this.f.setAdapter((ListAdapter) this.g);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.i = getResources().getDimensionPixelSize(f.c.local_wallpaper_category_list_item_padding);
        this.j = (int) (((displayMetrics.widthPixels - this.i) - (getContext().getResources().getDimensionPixelSize(f.c.local_wallpaper_list_padding_horizontal) * 2)) / 2.0f);
        this.k = (int) (this.j / 1.1225806f);
        this.l = new ad.a((int) this.i, (int) this.i);
        this.f.setDivider(this.l);
        this.f.setSelector(f.d.transparent_drawable);
        this.f.setOnScrollListener(new AbsListView.OnScrollListener() { // from class: com.tsf.extend.wallpaper.h.1
            @Override // android.widget.AbsListView.OnScrollListener
            public void onScrollStateChanged(AbsListView absListView, int i) {
            }

            @Override // android.widget.AbsListView.OnScrollListener
            public void onScroll(AbsListView absListView, int i, int i2, int i3) {
                h.this.q = i;
                h.this.r = i2;
            }
        });
        i.a().a(this);
        this.u.add(c);
        this.u.add(a);
        File filesDir = getContext().getFilesDir();
        List<Integer> c2 = ab.c();
        d.clear();
        for (Integer num : c2) {
            String b2 = ab.b(num.intValue());
            g gVar = new g();
            gVar.a(true);
            gVar.a(filesDir + "/" + b2);
            gVar.a(num.intValue());
            File file = new File(filesDir + "/" + b2);
            if (!file.exists() || !file.isFile()) {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                options.inJustDecodeBounds = false;
            }
            d.add(gVar);
        }
        this.t = getContext().getPackageManager().resolveActivity(new Intent("android.service.wallpaper.LIVE_WALLPAPER_CHOOSER"), 0) != null;
        if (this.t) {
            this.u.add(b);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.o != null) {
            this.o.clear();
        }
        this.g = new a();
        this.f.setAdapter((ListAdapter) this.g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class a extends BaseAdapter {
        private a() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            if (h.this.m == null) {
                return 0;
            }
            return h.this.m.size();
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getViewTypeCount() {
            return 4;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getItemViewType(int i) {
            if (i == 0) {
                return 0;
            }
            if (i == 1) {
                return 3;
            }
            return i == getCount() + (-1) ? 2 : 1;
        }

        @Override // android.widget.Adapter
        /* renamed from: a */
        public Pair<g, g> getItem(int i) {
            if (h.this.m == null) {
                return null;
            }
            return (Pair) h.this.m.get(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            View inflate;
            int itemViewType = getItemViewType(i);
            boolean z = itemViewType == 0;
            if (view == null) {
                b bVar = new b();
                if (z) {
                    inflate = h.this.n.inflate(f.C0052f.wallpaper_local_item, (ViewGroup) null);
                    bVar.c = inflate.findViewById(f.e.favorite);
                    bVar.c.setOnClickListener(h.this);
                    a(bVar.c, getItemViewType(i));
                    bVar.d = inflate.findViewById(f.e.local);
                    bVar.d.setOnClickListener(h.this);
                    a(bVar.d, getItemViewType(i));
                } else {
                    inflate = h.this.n.inflate(f.C0052f.wallpaper_list_item, (ViewGroup) null);
                    int dimensionPixelOffset = h.this.getResources().getDimensionPixelOffset(f.c.local_wallpaper_list_padding_horizontal);
                    inflate.setPadding(dimensionPixelOffset, 0, dimensionPixelOffset, 0);
                    if (3 == itemViewType) {
                        bVar.b = inflate.findViewById(f.e.live);
                        bVar.b.setOnClickListener(h.this);
                        a(bVar.b, getItemViewType(i));
                    }
                    bVar.a = inflate.findViewById(f.e.left_group);
                    bVar.e = (ImageView) inflate.findViewById(f.e.img_left);
                    bVar.e.setOnClickListener(h.this);
                    a(bVar.e, getItemViewType(i));
                    bVar.f = (ImageView) inflate.findViewById(f.e.img_right);
                    bVar.f.setOnClickListener(h.this);
                    a(bVar.f, getItemViewType(i));
                }
                LinearLayout linearLayout = (LinearLayout) inflate;
                linearLayout.setShowDividers(2);
                linearLayout.setDividerDrawable(h.this.l);
                inflate.setTag(bVar);
                h.this.o.add(bVar);
                view = inflate;
            }
            b bVar2 = (b) view.getTag();
            Pair<g, g> item = getItem(i);
            bVar2.g = (g) item.first;
            bVar2.h = (g) item.second;
            if (!z) {
                if (3 == itemViewType && h.this.t) {
                    bVar2.a.setVisibility(8);
                    bVar2.b.setVisibility(0);
                    a((g) item.first, bVar2.b);
                    a((g) item.second, bVar2.f);
                } else {
                    if (bVar2.b != null) {
                        bVar2.b.setVisibility(8);
                    }
                    bVar2.a.setVisibility(0);
                    a((g) item.first, bVar2.e);
                    a((g) item.second, bVar2.f);
                }
            } else {
                a((g) item.first, bVar2.c);
                a((g) item.second, bVar2.d);
            }
            return view;
        }

        private void a(g gVar, View view) {
            if (gVar != h.a && gVar != h.b && gVar != h.c) {
                view.setBackgroundResource(f.b.personal_list_item_bg);
            }
            view.setTag(gVar);
            if (gVar != null) {
                if ((gVar != h.a && gVar != h.b && gVar != h.c) || (view instanceof ImageView)) {
                    Bitmap r = gVar.r();
                    if (r != null) {
                        ((ImageView) view).setImageBitmap(r);
                        return;
                    }
                    ((ImageView) view).setImageBitmap(null);
                    i.a().a((i.a) h.this, gVar, h.this.j, false);
                    return;
                }
                return;
            }
            ((ImageView) view).setImageBitmap(null);
            view.setBackgroundColor(0);
        }

        private void a(View view, int i) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            marginLayoutParams.width = h.this.j;
            marginLayoutParams.height = h.this.k;
            if (i == 0) {
                marginLayoutParams.topMargin = (int) h.this.i;
            } else if (i == 2) {
                marginLayoutParams.bottomMargin = (int) h.this.i;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b {
        public View a;
        public View b;
        private View c;
        private View d;
        private ImageView e;
        private ImageView f;
        private g g;
        private g h;

        private b() {
        }
    }

    private void e() {
        this.e = null;
        Context b2 = com.tsf.extend.h.b();
        String a2 = com.tsf.extend.base.j.p.a(b2);
        if (TextUtils.isEmpty(a2)) {
            a2 = com.tsf.extend.base.j.p.b(b2);
        }
        if (!TextUtils.isEmpty(a2)) {
            String str = (((a2 + File.separator) + "TsfTheme") + File.separator) + "CM Wallpaper";
            try {
                String a3 = com.tsf.extend.base.j.r.a("last_walllpaper_img".getBytes("utf-8"));
                File file = new File(str + "/" + a3);
                if (file.exists() && file.isFile()) {
                    this.e = new g();
                    this.e.a(true);
                    this.e.a(str + "/" + a3);
                }
            } catch (UnsupportedEncodingException e) {
            }
        }
    }

    @Override // com.tsf.extend.wallpaper.i.a
    public void a(final i.a.EnumC0069a enumC0069a, final Object obj, final i.a.b bVar) {
        if (enumC0069a == i.a.EnumC0069a.getList) {
            e();
        }
        com.tsf.extend.base.j.z.a(0, new Runnable() { // from class: com.tsf.extend.wallpaper.h.2
            @Override // java.lang.Runnable
            public void run() {
                h.this.b(enumC0069a, obj, bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(i.a.EnumC0069a enumC0069a, Object obj, i.a.b bVar) {
        switch (enumC0069a) {
            case getList:
                setListUi((List) obj);
                return;
            case getSmall:
                setImage((Pair) obj);
                return;
            default:
                return;
        }
    }

    private void setImage(Pair<g, Bitmap> pair) {
        g gVar = (g) pair.first;
        Bitmap bitmap = (Bitmap) pair.second;
        if (bitmap != null) {
            gVar.a(bitmap);
            for (b bVar : this.o) {
                if (bVar.g == gVar) {
                    bVar.e.setImageBitmap(bitmap);
                } else if (bVar.h == gVar) {
                    bVar.f.setImageBitmap(bitmap);
                }
            }
        }
    }

    private void setListUi(List<g> list) {
        this.m.clear();
        this.h.clear();
        this.h.addAll(this.u);
        this.h.addAll(d);
        if (this.e != null && !TextUtils.isEmpty(this.e.b())) {
            this.h.add(this.e);
        }
        if (list != null) {
            this.h.addAll(list);
        }
        int size = (this.h.size() / 2) + (this.h.size() % 2);
        for (int i = 0; i < size; i++) {
            g gVar = this.h.get(i * 2);
            g gVar2 = null;
            if ((i * 2) + 1 < this.h.size()) {
                gVar2 = this.h.get((i * 2) + 1);
            }
            this.m.add(new Pair<>(gVar, gVar2));
        }
        this.g.notifyDataSetChanged();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getTag() == a) {
            try {
                com.tsf.extend.base.j.n.a((Activity) getContext(), 1001);
            } catch (Exception e) {
                Toast.makeText(this.p, this.p.getString(f.g.net_shortcut_error), 1).show();
            }
        } else if (view.getTag() == b) {
            if (((PersonalizationActivity) this.p).g()) {
                Toast.makeText(getContext(), f.g.theme_current_no_set_wallpaper, 0).show();
                this.p.finish();
                return;
            }
            try {
                this.p.startActivity(new Intent("android.service.wallpaper.LIVE_WALLPAPER_CHOOSER"));
            } catch (Exception e2) {
                Toast.makeText(this.p, this.p.getString(f.g.net_shortcut_error), 1).show();
            }
        } else if (view.getTag() == c) {
            long currentTimeMillis = System.currentTimeMillis();
            if (Math.abs(this.s - currentTimeMillis) >= 1000) {
                this.s = currentTimeMillis;
                this.p.a(new e(this.p));
            }
        } else if (view.getTag() instanceof s) {
            WallpaperDetail wallpaperDetail = (WallpaperDetail) LayoutInflater.from(view.getContext()).inflate(f.C0052f.wallpaper_detail, (ViewGroup) null);
            ArrayList newArrayList = Lists.newArrayList();
            newArrayList.addAll(this.h);
            newArrayList.removeAll(this.u);
            aj.a(newArrayList);
            wallpaperDetail.setOnDeleteListener(this);
            wallpaperDetail.a((List<? extends s>) newArrayList, (s) view.getTag(), true);
            this.p.a(wallpaperDetail);
        }
    }

    void setSelectIndex(int i) {
        int i2 = ((i + 1) / 2) + 1;
        if (this.f != null) {
            int count = this.f.getAdapter().getCount();
            if (i2 < 0 || i2 >= count) {
                return;
            }
            if (i2 < this.q || i2 >= this.q + this.r) {
                this.f.setSelection(i2);
            }
        }
    }

    @Override // com.tsf.extend.wallpaper.WallpaperDetail.b
    public void a() {
        i.a().a(this);
    }
}
