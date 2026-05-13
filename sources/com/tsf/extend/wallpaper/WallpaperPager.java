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
import com.tsf.extend.C1536f;
import com.tsf.extend.C1547h;
import com.tsf.extend.base.InterfaceC1385d;
import com.tsf.extend.base.actstru.model.activi.PageActivity;
import com.tsf.extend.base.p073c.AbstractBinderC1384e;
import com.tsf.extend.base.p080j.C1435n;
import com.tsf.extend.base.support.AbstractC1468a;
import com.tsf.extend.base.support.ViewPager;
import com.tsf.extend.base.view.DialogInterface$OnCancelListenerC1477c;
import com.tsf.extend.base.view.PagerIndicator;
import com.tsf.extend.wallpaper.PersonalizationActivity;
import com.tsf.extend.wallpaper.upload.UploadWallpaperService;
/* loaded from: classes.dex */
public class WallpaperPager extends FrameLayout implements ViewPager.InterfaceC1464e, PagerIndicator.InterfaceC1473a, DialogInterface$OnCancelListenerC1477c.InterfaceC1478a, PersonalizationActivity.InterfaceC1949i, InterfaceC2100q {

    /* renamed from: c */
    public static int f6547c;

    /* renamed from: e */
    AbstractBinderC1384e f6549e;

    /* renamed from: f */
    AbstractBinderC1384e f6550f;

    /* renamed from: g */
    private int f6551g;

    /* renamed from: h */
    private PageActivity f6552h;

    /* renamed from: i */
    private ViewPager f6553i;

    /* renamed from: j */
    private PagerIndicator f6554j;

    /* renamed from: k */
    private LinearLayout f6555k;

    /* renamed from: l */
    private PersonalizationActivity.C1946f f6556l;

    /* renamed from: m */
    private C2019a f6557m;

    /* renamed from: n */
    private View f6558n;

    /* renamed from: o */
    private boolean f6559o;

    /* renamed from: p */
    private int f6560p;

    /* renamed from: q */
    private SparseArray<View> f6561q;

    /* renamed from: r */
    private boolean f6562r;

    /* renamed from: s */
    private int f6563s;

    /* renamed from: t */
    private int f6564t;

    /* renamed from: u */
    private int f6565u;

    /* renamed from: v */
    private int f6566v;

    /* renamed from: w */
    private int f6567w;

    /* renamed from: x */
    private ServiceConnection f6568x;

    /* renamed from: a */
    public static int f6545a = 0;

    /* renamed from: b */
    public static int f6546b = 0;

    /* renamed from: d */
    public static int f6548d = 0;

    public WallpaperPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6551g = 2;
        this.f6556l = null;
        this.f6559o = false;
        this.f6560p = 1;
        this.f6561q = new SparseArray<>();
        this.f6562r = false;
        this.f6563s = -1;
        this.f6564t = 0;
        this.f6565u = 0;
        this.f6566v = 0;
        this.f6567w = 0;
        this.f6568x = new ServiceConnection() { // from class: com.tsf.extend.wallpaper.WallpaperPager.2
            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                WallpaperPager.this.f6550f = (AbstractBinderC1384e) iBinder;
                int i = 0;
                try {
                    i = WallpaperPager.this.f6549e.mo6318a();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (UploadWallpaperService.EnumC2123c.values()[i] == UploadWallpaperService.EnumC2123c.idle) {
                    C1435n.m8634a(WallpaperPager.this.f6552h, 2);
                } else {
                    Toast.makeText(WallpaperPager.this.getContext(), C1536f.C1543g.wallpaper_upload_alread_uploading, 1).show();
                }
                WallpaperPager.this.getContext().unbindService(WallpaperPager.this.f6568x);
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

    /* renamed from: c */
    private void m6721c() {
        this.f6553i = (ViewPager) findViewById(C1536f.C1541e.viewpager);
        this.f6557m = new C2019a();
        this.f6557m.m6708a((PersonalizationActivity.InterfaceC1949i) this);
        this.f6553i.setAdapter(this.f6557m);
        this.f6553i.setOnPageChangeListener(this);
        this.f6553i.setOffscreenPageLimit(5);
        this.f6553i.setCurrentItem(this.f6551g);
        this.f6559o = true;
        this.f6558n = findViewById(C1536f.C1541e.wallpaper_banner_group);
        f6547c = getResources().getDimensionPixelSize(C1536f.C1539c.personal_indicator_height);
        f6546b = getResources().getDimensionPixelSize(C1536f.C1539c.personal_indicator_height) + f6545a;
        f6548d = getResources().getDimensionPixelSize(C1536f.C1539c.wallpaper_list_item_padding);
        String[] strArr = this.f6562r ? new String[]{getResources().getString(C1536f.C1543g.wallpaper_categories), getResources().getString(C1536f.C1543g.tab_new), getResources().getString(C1536f.C1543g.tab_hot)} : new String[]{getResources().getString(C1536f.C1543g.wallpaper_categories), getResources().getString(C1536f.C1543g.tab_pg_live_wallpaper), getResources().getString(C1536f.C1543g.tab_new), getResources().getString(C1536f.C1543g.tab_hot)};
        this.f6554j = (PagerIndicator) findViewById(C1536f.C1541e.wallpaper_indicator);
        this.f6554j.m8480a(this.f6551g, strArr);
        this.f6554j.setOnPageClickedListener(this);
        this.f6555k = (LinearLayout) findViewById(C1536f.C1541e.upload_wallpaper_view);
        if (this.f6562r) {
            this.f6555k.setVisibility(8);
            return;
        }
        this.f6555k.setOnClickListener(new View.OnClickListener() { // from class: com.tsf.extend.wallpaper.WallpaperPager.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (C2055ag.m6572a().m6565d()) {
                    C1435n.m8634a(WallpaperPager.this.f6552h, 2);
                    return;
                }
                final DialogInterface$OnCancelListenerC1477c dialogInterface$OnCancelListenerC1477c = new DialogInterface$OnCancelListenerC1477c(WallpaperPager.this.getContext(), -2);
                dialogInterface$OnCancelListenerC1477c.m8459a(WallpaperPager.this);
                dialogInterface$OnCancelListenerC1477c.m8460a(C1536f.C1543g.wallpaper_upload_title, C1536f.C1543g.wallpaper_upload_content, C1536f.C1543g.wallpaper_upload_pictures, 0, BitmapFactory.decodeResource(WallpaperPager.this.getResources(), C1536f.C1540d.wallpaper_dialog_banner), new View.OnClickListener() { // from class: com.tsf.extend.wallpaper.WallpaperPager.1.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        dialogInterface$OnCancelListenerC1477c.dismiss();
                        C2055ag.m6572a().m6566c();
                        C1435n.m8634a(WallpaperPager.this.f6552h, 2);
                    }
                }, null, C1536f.C1540d.wallpaper_upload_dialog_title_bg);
                dialogInterface$OnCancelListenerC1477c.show();
            }
        });
        this.f6556l = new PersonalizationActivity.C1946f(null);
        this.f6556l.m6953a(400L);
        this.f6556l.m6951b(64L);
    }

    public void setPagerActivity(PageActivity pageActivity) {
        if (pageActivity instanceof WallpaperOnLineActivity) {
            this.f6562r = true;
        }
        this.f6552h = pageActivity;
        m6721c();
    }

    public int getCurrentTabIndex() {
        return this.f6553i.getCurrentItem();
    }

    public void setDefTabIndex(int i) {
        if (this.f6553i != null) {
            this.f6553i.setOnPageChangeListener(null);
            this.f6553i.setCurrentItem(i);
            if (this.f6554j != null) {
                this.f6554j.m8484a(i);
            }
            this.f6553i.setOnPageChangeListener(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.tsf.extend.wallpaper.WallpaperPager$a */
    /* loaded from: classes.dex */
    public class C2019a extends AbstractC1468a {

        /* renamed from: c */
        private int f6575c;

        /* renamed from: d */
        private int f6576d;

        /* renamed from: e */
        private int f6577e;

        /* renamed from: g */
        private PersonalizationActivity.InterfaceC1949i f6579g;

        /* renamed from: b */
        private int f6574b = 0;

        /* renamed from: f */
        private FrameLayout.LayoutParams f6578f = new FrameLayout.LayoutParams(-1, -1);

        public C2019a() {
            this.f6575c = 1;
            this.f6576d = 2;
            this.f6577e = 3;
            if (WallpaperPager.this.f6562r) {
                this.f6575c = -1;
                this.f6576d = 1;
                this.f6577e = 2;
            }
        }

        @Override // com.tsf.extend.base.support.AbstractC1468a
        /* renamed from: a */
        public int mo6712a() {
            return WallpaperPager.this.f6562r ? 3 : 4;
        }

        @Override // com.tsf.extend.base.support.AbstractC1468a
        /* renamed from: a */
        public Object mo6710a(ViewGroup viewGroup, int i) {
            View view;
            View view2 = (View) WallpaperPager.this.f6561q.get(i);
            if (view2 == null) {
                if (i == this.f6574b) {
                    view = new View$OnClickListenerC2137v(viewGroup.getContext(), WallpaperPager.this.f6552h, this.f6579g);
                    ((View$OnClickListenerC2137v) view).setChooseWallpaperOnLine(WallpaperPager.this.f6562r);
                } else if (i == this.f6575c) {
                    view = new DialogInterface$OnClickListenerC2048af(viewGroup.getContext(), EnumC2057ai.LiveWallpaperTabType, WallpaperPager.this.f6552h, this.f6579g);
                } else if (i == this.f6576d) {
                    Intent intent = WallpaperPager.this.f6552h.getIntent();
                    view = new C2047ae(viewGroup.getContext(), WallpaperPager.this.f6552h, "6".equals(intent.getStringExtra("inlet")) && intent.getIntExtra("target", -1) == 1, this.f6579g);
                    ((C2047ae) view).setChooseWallpaperOnLine(WallpaperPager.this.f6562r);
                } else if (i == this.f6577e) {
                    view = new View$OnClickListenerC2040ad(viewGroup.getContext(), EnumC2057ai.HotType, WallpaperPager.this.f6552h, this.f6579g);
                    ((View$OnClickListenerC2040ad) view).setChooseWallpaperOnLine(WallpaperPager.this.f6562r);
                } else {
                    view = view2;
                }
                ((InterfaceC2099p) view).setScrollListener(WallpaperPager.this);
                ((InterfaceC2099p) view).setHeadViewHeight(WallpaperPager.this.f6562r ? 0 : WallpaperPager.f6546b);
                WallpaperPager.this.f6561q.put(i, view);
            } else {
                view = view2;
            }
            viewGroup.addView(view, this.f6578f);
            return view;
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

        /* renamed from: a */
        public void m6708a(PersonalizationActivity.InterfaceC1949i interfaceC1949i) {
            this.f6579g = interfaceC1949i;
        }
    }

    @Override // com.tsf.extend.base.support.ViewPager.InterfaceC1464e
    /* renamed from: b */
    public void mo6723b(int i) {
        if (i == 0) {
            m6729a();
        }
    }

    @Override // com.tsf.extend.base.support.ViewPager.InterfaceC1464e
    /* renamed from: a */
    public void mo6727a(int i, float f, int i2) {
        if (this.f6554j != null) {
            this.f6554j.m8482a(i, f, i2);
        }
    }

    @Override // com.tsf.extend.base.support.ViewPager.InterfaceC1464e
    /* renamed from: a */
    public void mo6728a(int i) {
        if (this.f6554j != null) {
            this.f6554j.m8484a(i);
            if (i != this.f6563s) {
            }
            this.f6563s = -1;
        }
        if (!(this.f6552h instanceof WallpaperOnLineActivity) || this.f6559o) {
        }
        this.f6560p = i;
    }

    @Override // com.tsf.extend.base.view.PagerIndicator.InterfaceC1473a
    /* renamed from: c */
    public void mo6720c(int i) {
        if (this.f6553i != null) {
            this.f6563s = i;
            InterfaceC1385d m8293a = C1547h.m8293a();
            if (m8293a != null) {
                m8293a.mo8815a(i + 1);
            }
            this.f6553i.m8552a(i, true);
        }
    }

    @Override // com.tsf.extend.base.view.DialogInterface$OnCancelListenerC1477c.InterfaceC1478a
    /* renamed from: g */
    public void mo6715g() {
    }

    @Override // com.tsf.extend.base.view.DialogInterface$OnCancelListenerC1477c.InterfaceC1478a
    /* renamed from: h */
    public void mo6714h() {
    }

    @Override // com.tsf.extend.base.view.DialogInterface$OnCancelListenerC1477c.InterfaceC1478a
    /* renamed from: i */
    public void mo6713i() {
    }

    @Override // com.tsf.extend.wallpaper.InterfaceC2100q
    /* renamed from: a */
    public void mo6414a(View view, int i) {
        if (!this.f6562r && this.f6561q.indexOfValue(view) == this.f6553i.getCurrentItem()) {
            if (Build.VERSION.SDK_INT < 11 || i != 0 || this.f6558n.getTranslationY() != (-f6545a)) {
                int i2 = (i - f6546b) - f6548d;
                if (i2 <= 0) {
                    if (i2 < (-f6545a)) {
                        i2 = -f6545a;
                    }
                    if (Build.VERSION.SDK_INT >= 11) {
                        this.f6558n.setTranslationY(i2);
                    }
                } else if (Build.VERSION.SDK_INT >= 11) {
                    this.f6558n.setTranslationY(0.0f);
                }
                if (this.f6561q != null && this.f6561q.size() > 0) {
                    int i3 = i - f6548d;
                    if (i3 > f6546b || i3 < f6547c) {
                        if (i3 > f6546b) {
                            i = f6546b + f6548d;
                        } else {
                            i = i3 < f6547c ? f6547c + f6548d : 0;
                        }
                    }
                    for (int i4 = 0; i4 < this.f6561q.size(); i4++) {
                        View valueAt = this.f6561q.valueAt(i4);
                        if (valueAt != view && Build.VERSION.SDK_INT >= 14) {
                            valueAt.setScrollY(i);
                        }
                    }
                }
            }
        }
    }

    @Override // com.tsf.extend.wallpaper.PersonalizationActivity.InterfaceC1949i
    /* renamed from: a */
    public void mo6726a(AbsListView absListView, int i) {
        View childAt = absListView.getChildAt(0);
        if (childAt != null) {
            if (i == 0) {
                this.f6565u = absListView.getFirstVisiblePosition();
                this.f6567w = childAt.getTop();
                m6718d();
            } else if (i == 1) {
                this.f6564t = absListView.getFirstVisiblePosition();
                this.f6566v = childAt.getTop();
            }
        }
    }

    /* renamed from: d */
    private void m6718d() {
        if (this.f6556l != null) {
            if (this.f6565u != this.f6564t) {
                if (this.f6565u > this.f6564t) {
                    this.f6556l.m6954a();
                } else {
                    this.f6556l.m6952b();
                }
            } else if (this.f6567w > this.f6566v) {
                this.f6556l.m6952b();
            } else {
                this.f6556l.m6954a();
            }
        }
    }

    /* renamed from: a */
    public void m6729a() {
        if (this.f6556l != null) {
            this.f6556l.m6950c();
        }
    }

    /* renamed from: b */
    public void m6724b() {
        if (this.f6561q != null) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < this.f6561q.size()) {
                    View view = this.f6561q.get(i2);
                    if (view instanceof C2047ae) {
                        ((C2047ae) view).m6630b();
                    } else if (view instanceof View$OnClickListenerC2040ad) {
                        ((View$OnClickListenerC2040ad) view).m6630b();
                    } else if (view instanceof View$OnClickListenerC2137v) {
                        ((View$OnClickListenerC2137v) view).m6263a();
                    }
                    i = i2 + 1;
                } else {
                    return;
                }
            }
        }
    }

    public String getCurrentPageCode() {
        return this.f6553i != null ? m6717d(this.f6553i.getCurrentItem()) : "0";
    }

    /* renamed from: d */
    public String m6717d(int i) {
        if ((this.f6552h == null || !(this.f6552h instanceof WallpaperOnLineActivity)) && this.f6553i != null) {
            switch (i) {
                case 0:
                    return "1015";
                case 1:
                    return "1017";
                case 2:
                    return "1013";
                case 3:
                    return "1014";
            }
        }
        return "0";
    }
}
