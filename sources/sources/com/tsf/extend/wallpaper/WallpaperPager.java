package com.tsf.extend.wallpaper;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.IBinder;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.tsf.extend.base.actstru.model.activi.PageActivity;
import com.tsf.extend.base.support.ViewPager;
import com.tsf.extend.base.view.PagerIndicator;
import com.tsf.extend.base.view.c;
import com.tsf.extend.f;
import com.tsf.extend.wallpaper.PersonalizationActivity;
import com.tsf.extend.wallpaper.upload.UploadWallpaperService;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class WallpaperPager extends FrameLayout implements ViewPager.e, PagerIndicator.a, c.a, PersonalizationActivity.i, q {
    public static int c;
    com.tsf.extend.base.c.e e;
    com.tsf.extend.base.c.e f;
    private int g;
    private PageActivity h;
    private ViewPager i;
    private PagerIndicator j;
    private LinearLayout k;
    private PersonalizationActivity.f l;
    private a m;
    private View n;
    private boolean o;
    private int p;
    private SparseArray<View> q;
    private boolean r;
    private int s;
    private int t;
    private int u;
    private int v;
    private int w;
    private ServiceConnection x;
    public static int a = 0;
    public static int b = 0;
    public static int d = 0;

    public WallpaperPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = 2;
        this.l = null;
        this.o = false;
        this.p = 1;
        this.q = new SparseArray<>();
        this.r = false;
        this.s = -1;
        this.t = 0;
        this.u = 0;
        this.v = 0;
        this.w = 0;
        this.x = new ServiceConnection() { // from class: com.tsf.extend.wallpaper.WallpaperPager.2
            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                WallpaperPager.this.f = (com.tsf.extend.base.c.e) iBinder;
                int iA = 0;
                try {
                    iA = WallpaperPager.this.e.a();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (UploadWallpaperService.c.values()[iA] == UploadWallpaperService.c.idle) {
                    com.tsf.extend.base.j.n.a(WallpaperPager.this.h, 2);
                } else {
                    Toast.makeText(WallpaperPager.this.getContext(), f.g.wallpaper_upload_alread_uploading, 1).show();
                }
                WallpaperPager.this.getContext().unbindService(WallpaperPager.this.x);
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
            }
        };
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
    }

    private void c() {
        String[] strArr;
        this.i = (ViewPager) findViewById(f.e.viewpager);
        this.m = new a();
        this.m.a((PersonalizationActivity.i) this);
        this.i.setAdapter(this.m);
        this.i.setOnPageChangeListener(this);
        this.i.setOffscreenPageLimit(5);
        this.i.setCurrentItem(this.g);
        this.o = true;
        this.n = findViewById(f.e.wallpaper_banner_group);
        c = getResources().getDimensionPixelSize(f.c.personal_indicator_height);
        b = getResources().getDimensionPixelSize(f.c.personal_indicator_height) + a;
        d = getResources().getDimensionPixelSize(f.c.wallpaper_list_item_padding);
        if (this.r) {
            strArr = new String[]{getResources().getString(f.g.wallpaper_categories), getResources().getString(f.g.tab_new), getResources().getString(f.g.tab_hot)};
        } else {
            strArr = new String[]{getResources().getString(f.g.wallpaper_categories), getResources().getString(f.g.tab_pg_live_wallpaper), getResources().getString(f.g.tab_new), getResources().getString(f.g.tab_hot)};
        }
        this.j = (PagerIndicator) findViewById(f.e.wallpaper_indicator);
        this.j.a(this.g, strArr);
        this.j.setOnPageClickedListener(this);
        this.k = (LinearLayout) findViewById(f.e.upload_wallpaper_view);
        if (this.r) {
            this.k.setVisibility(8);
            return;
        }
        this.k.setOnClickListener(new View.OnClickListener() { // from class: com.tsf.extend.wallpaper.WallpaperPager.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (ag.a().d()) {
                    com.tsf.extend.base.j.n.a(WallpaperPager.this.h, 2);
                    return;
                }
                final com.tsf.extend.base.view.c cVar = new com.tsf.extend.base.view.c(WallpaperPager.this.getContext(), -2);
                cVar.a(WallpaperPager.this);
                cVar.a(f.g.wallpaper_upload_title, f.g.wallpaper_upload_content, f.g.wallpaper_upload_pictures, 0, BitmapFactory.decodeResource(WallpaperPager.this.getResources(), f.d.wallpaper_dialog_banner), new View.OnClickListener() { // from class: com.tsf.extend.wallpaper.WallpaperPager.1.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        cVar.dismiss();
                        ag.a().c();
                        com.tsf.extend.base.j.n.a(WallpaperPager.this.h, 2);
                    }
                }, null, f.d.wallpaper_upload_dialog_title_bg);
                cVar.show();
            }
        });
        this.l = new PersonalizationActivity.f(null);
        this.l.a(400L);
        this.l.b(64L);
    }

    public void setPagerActivity(PageActivity pageActivity) {
        if (pageActivity instanceof WallpaperOnLineActivity) {
            this.r = true;
        }
        this.h = pageActivity;
        c();
    }

    public int getCurrentTabIndex() {
        return this.i.getCurrentItem();
    }

    public void setDefTabIndex(int i) {
        if (this.i != null) {
            this.i.setOnPageChangeListener(null);
            this.i.setCurrentItem(i);
            if (this.j != null) {
                this.j.a(i);
            }
            this.i.setOnPageChangeListener(this);
        }
    }

    private class a extends com.tsf.extend.base.support.a {
        private int c;
        private int d;
        private int e;
        private PersonalizationActivity.i g;
        private int b = 0;
        private FrameLayout.LayoutParams f = new FrameLayout.LayoutParams(-1, -1);

        public a() {
            this.c = 1;
            this.d = 2;
            this.e = 3;
            if (WallpaperPager.this.r) {
                this.c = -1;
                this.d = 1;
                this.e = 2;
            }
        }

        @Override // com.tsf.extend.base.support.a
        public int a() {
            return WallpaperPager.this.r ? 3 : 4;
        }

        @Override // com.tsf.extend.base.support.a
        public Object a(ViewGroup viewGroup, int i) {
            View adVar;
            View view = (View) WallpaperPager.this.q.get(i);
            if (view == null) {
                if (i == this.b) {
                    adVar = new v(viewGroup.getContext(), WallpaperPager.this.h, this.g);
                    ((v) adVar).setChooseWallpaperOnLine(WallpaperPager.this.r);
                } else if (i == this.c) {
                    adVar = new af(viewGroup.getContext(), ai.LiveWallpaperTabType, WallpaperPager.this.h, this.g);
                } else if (i == this.d) {
                    Intent intent = WallpaperPager.this.h.getIntent();
                    adVar = new ae(viewGroup.getContext(), WallpaperPager.this.h, "6".equals(intent.getStringExtra("inlet")) && intent.getIntExtra("target", -1) == 1, this.g);
                    ((ae) adVar).setChooseWallpaperOnLine(WallpaperPager.this.r);
                } else if (i == this.e) {
                    adVar = new ad(viewGroup.getContext(), ai.HotType, WallpaperPager.this.h, this.g);
                    ((ad) adVar).setChooseWallpaperOnLine(WallpaperPager.this.r);
                } else {
                    adVar = view;
                }
                ((p) adVar).setScrollListener(WallpaperPager.this);
                ((p) adVar).setHeadViewHeight(WallpaperPager.this.r ? 0 : WallpaperPager.b);
                WallpaperPager.this.q.put(i, adVar);
            } else {
                adVar = view;
            }
            viewGroup.addView(adVar, this.f);
            return adVar;
        }

        @Override // com.tsf.extend.base.support.a
        public void a(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // com.tsf.extend.base.support.a
        public boolean a(View view, Object obj) {
            return view == obj;
        }

        public void a(PersonalizationActivity.i iVar) {
            this.g = iVar;
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
        if (this.j != null) {
            this.j.a(i, f, i2);
        }
    }

    @Override // com.tsf.extend.base.support.ViewPager.e
    public void a(int i) {
        if (this.j != null) {
            this.j.a(i);
            if (i != this.s) {
            }
            this.s = -1;
        }
        if (!(this.h instanceof WallpaperOnLineActivity) || this.o) {
        }
        this.p = i;
    }

    @Override // com.tsf.extend.base.view.PagerIndicator.a
    public void c(int i) {
        if (this.i != null) {
            this.s = i;
            com.tsf.extend.base.d dVarA = com.tsf.extend.h.a();
            if (dVarA != null) {
                dVarA.a(i + 1);
            }
            this.i.a(i, true);
        }
    }

    @Override // com.tsf.extend.base.view.c.a
    public void g() {
    }

    @Override // com.tsf.extend.base.view.c.a
    public void h() {
    }

    @Override // com.tsf.extend.base.view.c.a
    public void i() {
    }

    @Override // com.tsf.extend.wallpaper.q
    public void a(View view, int i) {
        if (!this.r && this.q.indexOfValue(view) == this.i.getCurrentItem()) {
            if (Build.VERSION.SDK_INT < 11 || i != 0 || this.n.getTranslationY() != (-a)) {
                int i2 = (i - b) - d;
                if (i2 <= 0) {
                    if (i2 < (-a)) {
                        i2 = -a;
                    }
                    if (Build.VERSION.SDK_INT >= 11) {
                        this.n.setTranslationY(i2);
                    }
                } else if (Build.VERSION.SDK_INT >= 11) {
                    this.n.setTranslationY(0.0f);
                }
                if (this.q != null && this.q.size() > 0) {
                    int i3 = i - d;
                    if (i3 > b || i3 < c) {
                        if (i3 > b) {
                            i = b + d;
                        } else {
                            i = i3 < c ? c + d : 0;
                        }
                    }
                    for (int i4 = 0; i4 < this.q.size(); i4++) {
                        View viewValueAt = this.q.valueAt(i4);
                        if (viewValueAt != view && Build.VERSION.SDK_INT >= 14) {
                            viewValueAt.setScrollY(i);
                        }
                    }
                }
            }
        }
    }

    @Override // com.tsf.extend.wallpaper.PersonalizationActivity.i
    public void a(AbsListView absListView, int i) {
        View childAt = absListView.getChildAt(0);
        if (childAt != null) {
            if (i == 0) {
                this.u = absListView.getFirstVisiblePosition();
                this.w = childAt.getTop();
                d();
            } else if (i == 1) {
                this.t = absListView.getFirstVisiblePosition();
                this.v = childAt.getTop();
            }
        }
    }

    private void d() {
        if (this.l != null) {
            if (this.u != this.t) {
                if (this.u > this.t) {
                    this.l.a();
                    return;
                } else {
                    this.l.b();
                    return;
                }
            }
            if (this.w > this.v) {
                this.l.b();
            } else {
                this.l.a();
            }
        }
    }

    public void a() {
        if (this.l != null) {
            this.l.c();
        }
    }

    public void b() {
        if (this.q != null) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < this.q.size()) {
                    View view = this.q.get(i2);
                    if (view instanceof ae) {
                        ((ae) view).b();
                    } else if (view instanceof ad) {
                        ((ad) view).b();
                    } else if (view instanceof v) {
                        ((v) view).a();
                    }
                    i = i2 + 1;
                } else {
                    return;
                }
            }
        }
    }

    public String getCurrentPageCode() {
        return this.i != null ? d(this.i.getCurrentItem()) : "0";
    }

    public String d(int i) {
        if ((this.h == null || !(this.h instanceof WallpaperOnLineActivity)) && this.i != null) {
            switch (i) {
            }
            return "0";
        }
        return "0";
    }
}
