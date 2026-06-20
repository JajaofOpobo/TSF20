package com.tsf.extend.keyboard;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.android.volley.l;
import com.tsf.extend.base.j.z;
import com.tsf.extend.base.widget.pulltorefresh.PullToRefreshAndLoadMoreListView;
import com.tsf.extend.base.widget.pulltorefresh.PullToRefreshBase;
import com.tsf.extend.ResourceIds;
import com.tsf.extend.AppContextHolder;
import com.tsf.extend.theme.k;
import com.tsf.extend.theme.v;
import com.tsf.extend.theme.x;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class KeyboardPager extends FrameLayout implements View.OnClickListener, com.tsf.extend.base.d.BaseDataProvider.InterfaceC0048a<List<k>> {
    private int a;
    private int b;
    private PullToRefreshAndLoadMoreListView c;
    private View d;
    private View e;
    private ProgressBar f;
    private TextView g;
    private long h;
    private int i;
    private int j;
    private boolean k;
    private List<b> l;
    private d m;
    private d n;
    private a o;
    private List<k> p;

    public KeyboardPager(Context context) {
        super(context);
        this.k = false;
        this.l = new ArrayList();
        this.p = new ArrayList();
    }

    public KeyboardPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.k = false;
        this.l = new ArrayList();
        this.p = new ArrayList();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        FrameLayout frameLayout = (FrameLayout) findViewById(ResourceIds.e.list_content);
        this.c = (PullToRefreshAndLoadMoreListView) LayoutInflater.from(getContext()).inflate(ResourceIds.C0052f.locker_list, (ViewGroup) null, false);
        frameLayout.addView(this.c, new FrameLayout.LayoutParams(-1, -1));
        getContext().getResources().getDisplayMetrics();
        this.i = getContext().getResources().getDimensionPixelSize(ResourceIds.c.keyboard_item_PaddingLeftRight);
        this.j = getContext().getResources().getDimensionPixelSize(ResourceIds.c.keyboard_item_PadingTop);
        this.b = ((getContext().getResources().getDisplayMetrics().widthPixels - (this.i * 2)) - this.j) / 2;
        this.a = (int) (this.b / 1.3651686f);
        this.d = LayoutInflater.from(getContext()).inflate(ResourceIds.C0052f.retry_item, (ViewGroup) null);
        ((TextView) this.d.findViewById(ResourceIds.e.retry_text)).setTextColor(getResources().getColorStateList(ResourceIds.d.wallpaper_list_retry_text_color));
        this.d.setOnClickListener(this);
        this.e = LayoutInflater.from(getContext()).inflate(ResourceIds.C0052f.wallpaper_loadmore, (ViewGroup) null);
        this.f = (ProgressBar) this.e.findViewById(ResourceIds.e.loadmore_progress);
        this.ResourceIds.setIndeterminateDrawable(new com.tsf.extend.base.widget.pulltorefresh.d(getContext(), 3, 1));
        this.g = (TextView) this.e.findViewById(ResourceIds.e.loadmore_tips);
        this.g.setOnClickListener(this);
        this.c.setMode(PullToRefreshBase.b.PULL_FROM_START);
        this.c.setHeaderResizeEnabled(false);
        this.c.k();
        this.c.setLoadMoreView(this.e);
        this.c.setCanLoadMore(true);
        this.o = new a();
        this.c.setAdapter(this.o);
        v.h().b(this);
        this.c.setOnLoadListener(new PullToRefreshAndLoadMoreListView.a() { // from class: com.tsf.extend.keyboard.KeyboardPager.1
            @Override // com.tsf.extend.base.widget.pulltorefresh.PullToRefreshAndLoadMoreListView.a
            public void a() {
                KeyboardPager.this.h = System.currentTimeMillis();
                com.tsf.extend.base.d.BaseDataProvider.b bVar = com.tsf.extend.base.d.BaseDataProvider.b.Refresh;
                KeyboardPager.this.m.a(bVar);
                com.tsf.extend.keyboard.KeyboardDataProvider.h().a(KeyboardPager.this.m, bVar, (JSONObject) null);
            }

            @Override // com.tsf.extend.base.widget.pulltorefresh.PullToRefreshAndLoadMoreListView.a
            public void b() {
                if (!KeyboardPager.this.k) {
                    KeyboardPager.this.a();
                } else {
                    KeyboardPager.this.b();
                }
            }
        });
        this.m = new d(com.tsf.extend.base.d.BaseDataProvider.b.LoadCache);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        boolean z = false;
        int id = view.getId();
        if (id == ResourceIds.e.retry) {
            this.d.setVisibility(8);
            this.m = new d(com.tsf.extend.base.d.BaseDataProvider.b.Refresh);
            com.tsf.extend.keyboard.KeyboardDataProvider.h().a(this.m, com.tsf.extend.base.d.BaseDataProvider.b.Refresh, (JSONObject) null);
            return;
        }
        if (id == ResourceIds.e.loadmore_tips) {
            this.ResourceIds.setVisibility(0);
            this.g.setVisibility(8);
            a();
            return;
        }
        if (view.getTag() instanceof com.tsf.extend.keyboard.KeyboardThemeModel) {
            com.tsf.extend.keyboard.KeyboardThemeModel bVar = (com.tsf.extend.keyboard.KeyboardThemeModel) view.getTag();
            com.tsf.extend.base.ResultCallback dVarA = h.a();
            if (dVarA != null) {
                dVarA.c(bVar.a() + "");
            }
            String strB = bVar.b();
            if (this.p.size() > 0) {
                int i = 0;
                while (true) {
                    if (i >= this.p.size()) {
                        break;
                    }
                    if (!a(this.p.get(i), strB)) {
                        i++;
                    } else {
                        z = true;
                        a(strB);
                        break;
                    }
                }
            }
            if (!z) {
                x.a(getContext(), bVar.d(), "tsf_theme_center_keyboard");
                v.h().b(this);
            }
        }
    }

    private boolean a(k kVar, String str) {
        return (kVar == null || TextUtils.isEmpty(kVar.g()) || !kVar.g().equals(str)) ? false : true;
    }

    private void a(String str) {
        Intent launchIntentForPackage = getContext().getPackageManager().getLaunchIntentForPackage(str);
        if (launchIntentForPackage != null) {
            ComponentName component = launchIntentForPackage.getComponent();
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.LAUNCHER");
            intent.setComponent(component);
            intent.setFlags(270532608);
            getContext().startActivity(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (this.l != null && this.l.size() > 0) {
            this.n = new d(com.tsf.extend.base.d.BaseDataProvider.b.LoadMore);
            com.tsf.extend.keyboard.KeyboardDataProvider.h().a(this.n, com.tsf.extend.base.d.BaseDataProvider.b.LoadMore, (JSONObject) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        this.ResourceIds.setVisibility(8);
        this.g.setVisibility(0);
        this.g.setClickable(false);
        this.g.setText(ResourceIds.g.theme_no_more);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.ResourceIds.setVisibility(8);
        this.g.setVisibility(0);
        this.g.setClickable(true);
        this.g.setText(ResourceIds.g.load_more_fail);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        this.ResourceIds.setVisibility(0);
        this.g.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final List<com.tsf.extend.keyboard.KeyboardThemeModel> list) {
        long j;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.h;
        if (jCurrentTimeMillis > 200) {
            j = 0;
        } else {
            j = 200 - jCurrentTimeMillis;
        }
        z.a(0, new Runnable() { // from class: com.tsf.extend.keyboard.KeyboardPager.2
            @Override // java.lang.Runnable
            public void run() {
                KeyboardPager.this.c.j();
            }
        }, j);
        z.a(0, new Runnable() { // from class: com.tsf.extend.keyboard.KeyboardPager.3
            @Override // java.lang.Runnable
            public void run() {
                KeyboardPager.this.a((List<com.tsf.extend.keyboard.KeyboardThemeModel>) list, false);
            }
        }, j + 150);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(List<com.tsf.extend.keyboard.KeyboardThemeModel> list) {
        if (list == null || list.size() == 0) {
            return false;
        }
        return a(list, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(List<com.tsf.extend.keyboard.KeyboardThemeModel> list, boolean z) {
        int i = 0;
        if (!z) {
            this.l.clear();
            if (list == null || list.size() == 0) {
                this.d.setVisibility(0);
                this.c.setEmptyView(this.d);
                return false;
            }
        }
        while (true) {
            int i2 = i;
            if (i2 >= list.size() / 2) {
                break;
            }
            this.l.add(new b(list.get(i2 * 2), list.get((i2 * 2) + 1)));
            i = i2 + 1;
        }
        if (list.size() % 2 != 0) {
            this.l.add(new b(list.get(list.size() - 1), null));
        }
        this.o.notifyDataSetChanged();
        return true;
    }

    @Override // com.tsf.extend.base.d.com.tsf.extend.base.d.BaseDataProvider.InterfaceC0048a
    public void a(JSONObject jSONObject, List<k> list) {
        if (list != null) {
            this.p.clear();
            this.p.addAll(list);
        }
        if (this.p.size() > 0) {
            this.o.notifyDataSetChanged();
        }
    }

    @Override // com.tsf.extend.base.d.com.tsf.extend.base.d.BaseDataProvider.InterfaceC0048a
    public void a(JSONObject jSONObject, int i, List<k> list) {
    }

    private class a extends BaseAdapter {
        private a() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            if (KeyboardPager.this.l != null) {
                return KeyboardPager.this.l.size();
            }
            return 0;
        }

        @Override // android.widget.Adapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b getItem(int i) {
            if (KeyboardPager.this.l != null) {
                return (b) KeyboardPager.this.l.get(i);
            }
            return null;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getItemViewType(int i) {
            return 0;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            e eVar;
            if (view == null) {
                view = LayoutInflater.from(KeyboardPager.this.getContext()).inflate(ResourceIds.C0052f.keyboard_list_item, (ViewGroup) null);
                e eVar2 = new e();
                eVar2.c = (FrameLayout) view.findViewById(ResourceIds.e.left_group);
                eVar2.e = (ImageView) view.findViewById(ResourceIds.e.left_img);
                eVar2.i = (ImageView) view.findViewById(ResourceIds.e.keyboard_ad_bg_left);
                eVar2.d = (FrameLayout) view.findViewById(ResourceIds.e.right_group);
                eVar2.f = (ImageView) view.findViewById(ResourceIds.e.right_img);
                eVar2.j = (ImageView) view.findViewById(ResourceIds.e.keyboard_ad_bg_right);
                a(eVar2.e);
                a(eVar2.f);
                view.setTag(eVar2);
                eVar = eVar2;
            } else {
                eVar = (e) view.getTag();
            }
            b item = getItem(i);
            eVar.a = item.a;
            eVar.c.setVisibility(0);
            eVar.e.setImageBitmap(null);
            eVar.e.setBackgroundColor(Color.argb(255, 221, 221, 221));
            eVar.e.setTag(item.a);
            eVar.e.setOnClickListener(KeyboardPager.this);
            eVar.i.setVisibility(0);
            eVar.g = KeyboardPager.this.new c(item.a.c(), eVar.e);
            com.tsf.extend.keyboard.KeyboardDataProvider.h().a(item.a.c(), eVar.g, l.a.LOW, KeyboardPager.this.b, KeyboardPager.this.a);
            if (item.b != null) {
                eVar.d.setVisibility(0);
                eVar.ResourceIds.setImageBitmap(null);
                eVar.j.setVisibility(0);
                eVar.ResourceIds.setBackgroundColor(Color.argb(255, 221, 221, 221));
                eVar.b = item.b;
                eVar.ResourceIds.setTag(item.b);
                eVar.ResourceIds.setOnClickListener(KeyboardPager.this);
                eVar.h = KeyboardPager.this.new c(item.b.c(), eVar.f);
                com.tsf.extend.keyboard.KeyboardDataProvider.h().a(item.b.c(), eVar.h, l.a.LOW, KeyboardPager.this.b, KeyboardPager.this.a);
            } else {
                eVar.d.setVisibility(4);
            }
            return view;
        }

        void a(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = KeyboardPager.this.a;
                layoutParams.width = KeyboardPager.this.b;
            }
            view.setLayoutParams(layoutParams);
        }
    }

    public class b {
        com.tsf.extend.keyboard.KeyboardThemeModel a;
        com.tsf.extend.keyboard.KeyboardThemeModel b;

        public b(com.tsf.extend.keyboard.KeyboardThemeModel bVar, com.tsf.extend.keyboard.KeyboardThemeModel bVar2) {
            this.a = bVar;
            this.b = bVar2;
        }
    }

    private class e {
        public com.tsf.extend.keyboard.KeyboardThemeModel a;
        public com.tsf.extend.keyboard.KeyboardThemeModel b;
        public FrameLayout c;
        public FrameLayout d;
        public ImageView e;
        public ImageView f;
        public c g;
        public c h;
        public ImageView i;
        public ImageView j;

        private e() {
        }
    }

    private class c implements com.tsf.extend.base.d.BaseDataProvider.InterfaceC0048a<Pair<String, Bitmap>> {
        private String b;
        private ImageView c;

        c(String str, ImageView imageView) {
            this.b = str;
            this.c = imageView;
        }

        @Override // com.tsf.extend.base.d.com.tsf.extend.base.d.BaseDataProvider.InterfaceC0048a
        public void a(JSONObject jSONObject, Pair<String, Bitmap> pair) {
            if (pair != null && ((com.tsf.extend.keyboard.KeyboardThemeModel) this.c.getTag()).c().equals(this.b)) {
                this.c.setVisibility(0);
                this.c.setBackgroundColor(Color.argb(0, 221, 221, 221));
                this.c.setScaleType(ImageView.ScaleType.FIT_XY);
                this.c.setImageBitmap((Bitmap) pair.second);
            }
        }

        @Override // com.tsf.extend.base.d.com.tsf.extend.base.d.BaseDataProvider.InterfaceC0048a
        public void a(JSONObject jSONObject, int i, Pair<String, Bitmap> pair) {
            if (pair != null && ((com.tsf.extend.keyboard.KeyboardThemeModel) this.c.getTag()).c().equals(this.b)) {
                this.c.setVisibility(0);
                this.c.setBackgroundColor(Color.argb(0, 221, 221, 221));
                this.c.setScaleType(ImageView.ScaleType.FIT_XY);
                this.c.setImageBitmap((Bitmap) pair.second);
            }
        }
    }

    private class d implements com.tsf.extend.base.d.BaseDataProvider.InterfaceC0048a<com.tsf.extend.base.b.PagedListModel> {
        private com.tsf.extend.base.d.BaseDataProvider.b b;

        public d(com.tsf.extend.base.d.BaseDataProvider.b bVar) {
            this.b = bVar;
        }

        public void a(com.tsf.extend.base.d.BaseDataProvider.b bVar) {
            this.b = bVar;
        }

        @Override // com.tsf.extend.base.d.com.tsf.extend.base.d.BaseDataProvider.InterfaceC0048a
        public void a(JSONObject jSONObject, final com.tsf.extend.base.b.PagedListModel aVar) {
            z.a(0, new Runnable() { // from class: com.tsf.extend.keyboard.KeyboardPager.d.1
                @Override // java.lang.Runnable
                public void run() {
                    KeyboardPager.this.k = !aVar.b();
                    if (d.this.b == com.tsf.extend.base.d.BaseDataProvider.b.LoadMore) {
                        if (KeyboardPager.this.k) {
                            KeyboardPager.this.b();
                        } else {
                            KeyboardPager.this.c.b(false);
                        }
                        KeyboardPager.this.b((List<com.tsf.extend.keyboard.KeyboardThemeModel>) aVar.a());
                        return;
                    }
                    KeyboardPager.this.c.b(false);
                    KeyboardPager.this.d();
                    KeyboardPager.this.a((List<com.tsf.extend.keyboard.KeyboardThemeModel>) aVar.a());
                }
            });
        }

        @Override // com.tsf.extend.base.d.com.tsf.extend.base.d.BaseDataProvider.InterfaceC0048a
        public void a(JSONObject jSONObject, int i, final com.tsf.extend.base.b.PagedListModel aVar) {
            z.a(0, new Runnable() { // from class: com.tsf.extend.keyboard.KeyboardPager.d.2
                @Override // java.lang.Runnable
                public void run() {
                    if (d.this.b == com.tsf.extend.base.d.BaseDataProvider.b.LoadMore) {
                        KeyboardPager.this.c();
                        return;
                    }
                    if (aVar == null) {
                        KeyboardPager.this.c.setMode(PullToRefreshBase.b.DISABLED);
                    }
                    KeyboardPager.this.a((List<com.tsf.extend.keyboard.KeyboardThemeModel>) (aVar == null ? null : aVar.a()));
                }
            });
        }
    }
}
