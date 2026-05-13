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
import com.tsf.extend.C1536f;
import com.tsf.extend.C1547h;
import com.tsf.extend.base.actstru.model.activi.PageActivity;
import com.tsf.extend.base.p080j.C1435n;
import com.tsf.extend.base.p080j.C1437p;
import com.tsf.extend.base.p080j.C1439r;
import com.tsf.extend.base.p080j.C1455z;
import com.tsf.extend.wallpaper.C2077i;
import com.tsf.extend.wallpaper.View$OnClickListenerC2040ad;
import com.tsf.extend.wallpaper.WallpaperDetail;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.tsf.extend.wallpaper.h */
/* loaded from: classes.dex */
public class View$OnClickListenerC2071h extends FrameLayout implements View.OnClickListener, WallpaperDetail.InterfaceC1986b, C2077i.InterfaceC2081a {

    /* renamed from: a */
    private static C2070g f6764a = new C2070g(true);

    /* renamed from: b */
    private static C2070g f6765b = new C2070g();

    /* renamed from: c */
    private static C2070g f6766c = new C2070g();

    /* renamed from: d */
    private static List<C2070g> f6767d = new ArrayList();

    /* renamed from: e */
    private C2070g f6768e;

    /* renamed from: f */
    private ListView f6769f;

    /* renamed from: g */
    private C2075a f6770g;

    /* renamed from: h */
    private List<C2070g> f6771h;

    /* renamed from: i */
    private float f6772i;

    /* renamed from: j */
    private int f6773j;

    /* renamed from: k */
    private int f6774k;

    /* renamed from: l */
    private View$OnClickListenerC2040ad.C2044a f6775l;

    /* renamed from: m */
    private List<Pair<C2070g, C2070g>> f6776m;

    /* renamed from: n */
    private LayoutInflater f6777n;

    /* renamed from: o */
    private List<C2076b> f6778o;

    /* renamed from: p */
    private PageActivity f6779p;

    /* renamed from: q */
    private int f6780q;

    /* renamed from: r */
    private int f6781r;

    /* renamed from: s */
    private long f6782s;

    /* renamed from: t */
    private boolean f6783t;

    /* renamed from: u */
    private List<C2070g> f6784u;

    public View$OnClickListenerC2071h(Context context) {
        super(context);
        this.f6783t = false;
        this.f6784u = Lists.newArrayList();
        this.f6779p = (PageActivity) context;
        this.f6778o = Lists.newArrayList();
        this.f6777n = LayoutInflater.from(getContext());
        this.f6776m = Lists.newArrayList();
        this.f6771h = Lists.newArrayList();
        this.f6769f = new ListView(context);
        addView(this.f6769f, new FrameLayout.LayoutParams(-1, -1));
        this.f6770g = new C2075a();
        this.f6769f.setAdapter((ListAdapter) this.f6770g);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f6772i = getResources().getDimensionPixelSize(C1536f.C1539c.local_wallpaper_category_list_item_padding);
        this.f6773j = (int) (((displayMetrics.widthPixels - this.f6772i) - (getContext().getResources().getDimensionPixelSize(C1536f.C1539c.local_wallpaper_list_padding_horizontal) * 2)) / 2.0f);
        this.f6774k = (int) (this.f6773j / 1.1225806f);
        this.f6775l = new View$OnClickListenerC2040ad.C2044a((int) this.f6772i, (int) this.f6772i);
        this.f6769f.setDivider(this.f6775l);
        this.f6769f.setSelector(C1536f.C1540d.transparent_drawable);
        this.f6769f.setOnScrollListener(new AbsListView.OnScrollListener() { // from class: com.tsf.extend.wallpaper.h.1
            @Override // android.widget.AbsListView.OnScrollListener
            public void onScrollStateChanged(AbsListView absListView, int i) {
            }

            @Override // android.widget.AbsListView.OnScrollListener
            public void onScroll(AbsListView absListView, int i, int i2, int i3) {
                View$OnClickListenerC2071h.this.f6780q = i;
                View$OnClickListenerC2071h.this.f6781r = i2;
            }
        });
        C2077i.m6486a().m6483a(this);
        this.f6784u.add(f6766c);
        this.f6784u.add(f6764a);
        File filesDir = getContext().getFilesDir();
        List<Integer> m6656c = C2035ab.m6656c();
        f6767d.clear();
        for (Integer num : m6656c) {
            String m6658b = C2035ab.m6658b(num.intValue());
            C2070g c2070g = new C2070g();
            c2070g.m6523a(true);
            c2070g.m6524a(filesDir + "/" + m6658b);
            c2070g.m6527a(num.intValue());
            File file = new File(filesDir + "/" + m6658b);
            if (!file.exists() || !file.isFile()) {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                options.inJustDecodeBounds = false;
            }
            f6767d.add(c2070g);
        }
        this.f6783t = getContext().getPackageManager().resolveActivity(new Intent("android.service.wallpaper.LIVE_WALLPAPER_CHOOSER"), 0) != null;
        if (this.f6783t) {
            this.f6784u.add(f6765b);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f6778o != null) {
            this.f6778o.clear();
        }
        this.f6770g = new C2075a();
        this.f6769f.setAdapter((ListAdapter) this.f6770g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.tsf.extend.wallpaper.h$a */
    /* loaded from: classes.dex */
    public class C2075a extends BaseAdapter {
        private C2075a() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            if (View$OnClickListenerC2071h.this.f6776m == null) {
                return 0;
            }
            return View$OnClickListenerC2071h.this.f6776m.size();
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
        public Pair<C2070g, C2070g> getItem(int i) {
            if (View$OnClickListenerC2071h.this.f6776m == null) {
                return null;
            }
            return (Pair) View$OnClickListenerC2071h.this.f6776m.get(i);
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
                C2076b c2076b = new C2076b();
                if (z) {
                    inflate = View$OnClickListenerC2071h.this.f6777n.inflate(C1536f.C1542f.wallpaper_local_item, (ViewGroup) null);
                    c2076b.f6794c = inflate.findViewById(C1536f.C1541e.favorite);
                    c2076b.f6794c.setOnClickListener(View$OnClickListenerC2071h.this);
                    m6500a(c2076b.f6794c, getItemViewType(i));
                    c2076b.f6795d = inflate.findViewById(C1536f.C1541e.local);
                    c2076b.f6795d.setOnClickListener(View$OnClickListenerC2071h.this);
                    m6500a(c2076b.f6795d, getItemViewType(i));
                } else {
                    inflate = View$OnClickListenerC2071h.this.f6777n.inflate(C1536f.C1542f.wallpaper_list_item, (ViewGroup) null);
                    int dimensionPixelOffset = View$OnClickListenerC2071h.this.getResources().getDimensionPixelOffset(C1536f.C1539c.local_wallpaper_list_padding_horizontal);
                    inflate.setPadding(dimensionPixelOffset, 0, dimensionPixelOffset, 0);
                    if (3 == itemViewType) {
                        c2076b.f6793b = inflate.findViewById(C1536f.C1541e.live);
                        c2076b.f6793b.setOnClickListener(View$OnClickListenerC2071h.this);
                        m6500a(c2076b.f6793b, getItemViewType(i));
                    }
                    c2076b.f6792a = inflate.findViewById(C1536f.C1541e.left_group);
                    c2076b.f6796e = (ImageView) inflate.findViewById(C1536f.C1541e.img_left);
                    c2076b.f6796e.setOnClickListener(View$OnClickListenerC2071h.this);
                    m6500a(c2076b.f6796e, getItemViewType(i));
                    c2076b.f6797f = (ImageView) inflate.findViewById(C1536f.C1541e.img_right);
                    c2076b.f6797f.setOnClickListener(View$OnClickListenerC2071h.this);
                    m6500a(c2076b.f6797f, getItemViewType(i));
                }
                LinearLayout linearLayout = (LinearLayout) inflate;
                linearLayout.setShowDividers(2);
                linearLayout.setDividerDrawable(View$OnClickListenerC2071h.this.f6775l);
                inflate.setTag(c2076b);
                View$OnClickListenerC2071h.this.f6778o.add(c2076b);
                view = inflate;
            }
            C2076b c2076b2 = (C2076b) view.getTag();
            Pair<C2070g, C2070g> item = getItem(i);
            c2076b2.f6798g = (C2070g) item.first;
            c2076b2.f6799h = (C2070g) item.second;
            if (!z) {
                if (3 == itemViewType && View$OnClickListenerC2071h.this.f6783t) {
                    c2076b2.f6792a.setVisibility(8);
                    c2076b2.f6793b.setVisibility(0);
                    m6499a((C2070g) item.first, c2076b2.f6793b);
                    m6499a((C2070g) item.second, c2076b2.f6797f);
                } else {
                    if (c2076b2.f6793b != null) {
                        c2076b2.f6793b.setVisibility(8);
                    }
                    c2076b2.f6792a.setVisibility(0);
                    m6499a((C2070g) item.first, c2076b2.f6796e);
                    m6499a((C2070g) item.second, c2076b2.f6797f);
                }
            } else {
                m6499a((C2070g) item.first, c2076b2.f6794c);
                m6499a((C2070g) item.second, c2076b2.f6795d);
            }
            return view;
        }

        /* renamed from: a */
        private void m6499a(C2070g c2070g, View view) {
            if (c2070g != View$OnClickListenerC2071h.f6764a && c2070g != View$OnClickListenerC2071h.f6765b && c2070g != View$OnClickListenerC2071h.f6766c) {
                view.setBackgroundResource(C1536f.C1538b.personal_list_item_bg);
            }
            view.setTag(c2070g);
            if (c2070g != null) {
                if ((c2070g != View$OnClickListenerC2071h.f6764a && c2070g != View$OnClickListenerC2071h.f6765b && c2070g != View$OnClickListenerC2071h.f6766c) || (view instanceof ImageView)) {
                    Bitmap r = c2070g.m6403r();
                    if (r != null) {
                        ((ImageView) view).setImageBitmap(r);
                        return;
                    }
                    ((ImageView) view).setImageBitmap(null);
                    C2077i.m6486a().m6481a((C2077i.InterfaceC2081a) View$OnClickListenerC2071h.this, c2070g, View$OnClickListenerC2071h.this.f6773j, false);
                    return;
                }
                return;
            }
            ((ImageView) view).setImageBitmap(null);
            view.setBackgroundColor(0);
        }

        /* renamed from: a */
        private void m6500a(View view, int i) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            marginLayoutParams.width = View$OnClickListenerC2071h.this.f6773j;
            marginLayoutParams.height = View$OnClickListenerC2071h.this.f6774k;
            if (i == 0) {
                marginLayoutParams.topMargin = (int) View$OnClickListenerC2071h.this.f6772i;
            } else if (i == 2) {
                marginLayoutParams.bottomMargin = (int) View$OnClickListenerC2071h.this.f6772i;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.tsf.extend.wallpaper.h$b */
    /* loaded from: classes.dex */
    public static class C2076b {

        /* renamed from: a */
        public View f6792a;

        /* renamed from: b */
        public View f6793b;

        /* renamed from: c */
        private View f6794c;

        /* renamed from: d */
        private View f6795d;

        /* renamed from: e */
        private ImageView f6796e;

        /* renamed from: f */
        private ImageView f6797f;

        /* renamed from: g */
        private C2070g f6798g;

        /* renamed from: h */
        private C2070g f6799h;

        private C2076b() {
        }
    }

    /* renamed from: e */
    private void m6506e() {
        this.f6768e = null;
        Context m8290b = C1547h.m8290b();
        String m8621a = C1437p.m8621a(m8290b);
        if (TextUtils.isEmpty(m8621a)) {
            m8621a = C1437p.m8617b(m8290b);
        }
        if (!TextUtils.isEmpty(m8621a)) {
            String str = (((m8621a + File.separator) + "TsfTheme") + File.separator) + "CM Wallpaper";
            try {
                String m8605a = C1439r.m8605a("last_walllpaper_img".getBytes("utf-8"));
                File file = new File(str + "/" + m8605a);
                if (file.exists() && file.isFile()) {
                    this.f6768e = new C2070g();
                    this.f6768e.m6523a(true);
                    this.f6768e.m6524a(str + "/" + m8605a);
                }
            } catch (UnsupportedEncodingException e) {
            }
        }
    }

    @Override // com.tsf.extend.wallpaper.C2077i.InterfaceC2081a
    /* renamed from: a */
    public void mo6477a(final C2077i.InterfaceC2081a.EnumC2082a enumC2082a, final Object obj, final C2077i.InterfaceC2081a.EnumC2083b enumC2083b) {
        if (enumC2082a == C2077i.InterfaceC2081a.EnumC2082a.getList) {
            m6506e();
        }
        C1455z.m8564a(0, new Runnable() { // from class: com.tsf.extend.wallpaper.h.2
            @Override // java.lang.Runnable
            public void run() {
                View$OnClickListenerC2071h.this.m6511b(enumC2082a, obj, enumC2083b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m6511b(C2077i.InterfaceC2081a.EnumC2082a enumC2082a, Object obj, C2077i.InterfaceC2081a.EnumC2083b enumC2083b) {
        switch (enumC2082a) {
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

    private void setImage(Pair<C2070g, Bitmap> pair) {
        C2070g c2070g = (C2070g) pair.first;
        Bitmap bitmap = (Bitmap) pair.second;
        if (bitmap != null) {
            c2070g.m6405a(bitmap);
            for (C2076b c2076b : this.f6778o) {
                if (c2076b.f6798g == c2070g) {
                    c2076b.f6796e.setImageBitmap(bitmap);
                } else if (c2076b.f6799h == c2070g) {
                    c2076b.f6797f.setImageBitmap(bitmap);
                }
            }
        }
    }

    private void setListUi(List<C2070g> list) {
        this.f6776m.clear();
        this.f6771h.clear();
        this.f6771h.addAll(this.f6784u);
        this.f6771h.addAll(f6767d);
        if (this.f6768e != null && !TextUtils.isEmpty(this.f6768e.m6522b())) {
            this.f6771h.add(this.f6768e);
        }
        if (list != null) {
            this.f6771h.addAll(list);
        }
        int size = (this.f6771h.size() / 2) + (this.f6771h.size() % 2);
        for (int i = 0; i < size; i++) {
            C2070g c2070g = this.f6771h.get(i * 2);
            C2070g c2070g2 = null;
            if ((i * 2) + 1 < this.f6771h.size()) {
                c2070g2 = this.f6771h.get((i * 2) + 1);
            }
            this.f6776m.add(new Pair<>(c2070g, c2070g2));
        }
        this.f6770g.notifyDataSetChanged();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getTag() == f6764a) {
            try {
                C1435n.m8634a((Activity) getContext(), 1001);
            } catch (Exception e) {
                Toast.makeText(this.f6779p, this.f6779p.getString(C1536f.C1543g.net_shortcut_error), 1).show();
            }
        } else if (view.getTag() == f6765b) {
            if (((PersonalizationActivity) this.f6779p).m6974g()) {
                Toast.makeText(getContext(), C1536f.C1543g.theme_current_no_set_wallpaper, 0).show();
                this.f6779p.finish();
                return;
            }
            try {
                this.f6779p.startActivity(new Intent("android.service.wallpaper.LIVE_WALLPAPER_CHOOSER"));
            } catch (Exception e2) {
                Toast.makeText(this.f6779p, this.f6779p.getString(C1536f.C1543g.net_shortcut_error), 1).show();
            }
        } else if (view.getTag() == f6766c) {
            long currentTimeMillis = System.currentTimeMillis();
            if (Math.abs(this.f6782s - currentTimeMillis) >= 1000) {
                this.f6782s = currentTimeMillis;
                this.f6779p.m8922a(new View$OnClickListenerC2066e(this.f6779p));
            }
        } else if (view.getTag() instanceof C2106s) {
            WallpaperDetail wallpaperDetail = (WallpaperDetail) LayoutInflater.from(view.getContext()).inflate(C1536f.C1542f.wallpaper_detail, (ViewGroup) null);
            ArrayList newArrayList = Lists.newArrayList();
            newArrayList.addAll(this.f6771h);
            newArrayList.removeAll(this.f6784u);
            C2058aj.m6551a(newArrayList);
            wallpaperDetail.setOnDeleteListener(this);
            wallpaperDetail.m6854a((List<? extends C2106s>) newArrayList, (C2106s) view.getTag(), true);
            this.f6779p.m8922a(wallpaperDetail);
        }
    }

    void setSelectIndex(int i) {
        int i2 = ((i + 1) / 2) + 1;
        if (this.f6769f != null) {
            int count = this.f6769f.getAdapter().getCount();
            if (i2 < 0 || i2 >= count) {
                return;
            }
            if (i2 < this.f6780q || i2 >= this.f6780q + this.f6781r) {
                this.f6769f.setSelection(i2);
            }
        }
    }

    @Override // com.tsf.extend.wallpaper.WallpaperDetail.InterfaceC1986b
    /* renamed from: a */
    public void mo6518a() {
        C2077i.m6486a().m6483a(this);
    }
}
