package com.tsf.extend.wallpaper;

import android.app.WallpaperManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Pair;
import android.util.StateSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.google.android.collect.Lists;
import com.tsf.extend.C1536f;
import com.tsf.extend.DialogInterfaceC1526e;
import com.tsf.extend.base.actstru.model.activi.PageActivity;
import com.tsf.extend.base.p071b.C1368a;
import com.tsf.extend.base.p074d.AbstractC1386a;
import com.tsf.extend.base.p078h.C1413a;
import com.tsf.extend.base.p080j.C1430i;
import com.tsf.extend.base.p080j.C1437p;
import com.tsf.extend.base.p080j.C1449u;
import com.tsf.extend.base.p080j.C1455z;
import com.tsf.extend.base.support.AbstractC1468a;
import com.tsf.extend.base.support.ViewPager;
import com.tsf.extend.base.widget.pulltorefresh.C1518d;
import com.tsf.extend.base.widget.pulltorefresh.C1519e;
import com.tsf.extend.base.widget.pulltorefresh.PullToRefreshAndLoadMoreListView;
import com.tsf.extend.base.widget.pulltorefresh.PullToRefreshBase;
import com.tsf.extend.theme.AbstractC1700aq;
import com.tsf.extend.theme.C1671af;
import com.tsf.extend.theme.C1696ao;
import com.tsf.extend.theme.C1845i;
import com.tsf.extend.theme.C1848k;
import com.tsf.extend.theme.C1862p;
import com.tsf.extend.theme.C1887t;
import com.tsf.extend.theme.C1894v;
import com.tsf.extend.theme.C1920x;
import com.tsf.extend.theme.ThemeDetail;
import com.tsf.extend.theme.ThemePullToRefreshListView;
import com.tsf.extend.wallpaper.C2026aa;
import com.tsf.extend.wallpaper.C2077i;
import com.tsf.extend.wallpaper.C2094m;
import com.tsf.extend.wallpaper.HorzontalSliderView;
import com.tsf.extend.wallpaper.TabViewPager;
import com.tsf.extend.wallpaper.WallpaperImageView;
import com.tsf.extend.wallpaper.p085a.C2021a;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class WallpaperDetail extends FrameLayout implements DialogInterface.OnClickListener, DialogInterface.OnDismissListener, View.OnClickListener, PageActivity.InterfaceC1352a, HorzontalSliderView.InterfaceC1931a, TabViewPager.InterfaceC1959a, WallpaperImageView.InterfaceC2010a, C2021a.InterfaceC2024b, C2026aa.InterfaceC2034a, C2077i.InterfaceC2081a {

    /* renamed from: A */
    private boolean f6352A;

    /* renamed from: B */
    private HorzontalSliderView f6353B;

    /* renamed from: C */
    private ImageView f6354C;

    /* renamed from: D */
    private int f6355D;

    /* renamed from: E */
    private long f6356E;

    /* renamed from: F */
    private float f6357F;

    /* renamed from: G */
    private C2005g f6358G;

    /* renamed from: H */
    private boolean f6359H;

    /* renamed from: I */
    private String f6360I;

    /* renamed from: J */
    private boolean f6361J;

    /* renamed from: a */
    private long f6362a;

    /* renamed from: b */
    private TabViewPager f6363b;

    /* renamed from: c */
    private List<? extends C2106s> f6364c;

    /* renamed from: d */
    private LayoutInflater f6365d;

    /* renamed from: e */
    private List<View$OnClickListenerC1990e> f6366e;

    /* renamed from: f */
    private PersonalizationActivity f6367f;

    /* renamed from: g */
    private ImageView f6368g;

    /* renamed from: h */
    private ImageView f6369h;

    /* renamed from: i */
    private C2000f f6370i;

    /* renamed from: j */
    private C1985a f6371j;

    /* renamed from: k */
    private Bundle f6372k;

    /* renamed from: l */
    private View f6373l;

    /* renamed from: m */
    private ProgressBar f6374m;

    /* renamed from: n */
    private C1989d f6375n;

    /* renamed from: o */
    private boolean f6376o;

    /* renamed from: p */
    private int f6377p;

    /* renamed from: q */
    private WallpaperManager f6378q;

    /* renamed from: r */
    private DialogInterfaceC1526e f6379r;

    /* renamed from: s */
    private boolean f6380s;

    /* renamed from: t */
    private boolean f6381t;

    /* renamed from: u */
    private Handler f6382u;

    /* renamed from: v */
    private InterfaceC1986b f6383v;

    /* renamed from: w */
    private EnumC2057ai f6384w;

    /* renamed from: x */
    private C2026aa f6385x;

    /* renamed from: y */
    private View f6386y;

    /* renamed from: z */
    private boolean f6387z;

    /* renamed from: com.tsf.extend.wallpaper.WallpaperDetail$b */
    /* loaded from: classes.dex */
    public interface InterfaceC1986b {
        /* renamed from: a */
        void mo6518a();
    }

    /* renamed from: b */
    static /* synthetic */ void m6847b(WallpaperDetail wallpaperDetail, View$OnClickListenerC1990e view$OnClickListenerC1990e, boolean z) {
        wallpaperDetail.m6872a(view$OnClickListenerC1990e, z);
    }

    /* renamed from: e */
    static /* synthetic */ boolean m6834e(WallpaperDetail wallpaperDetail) {
        return wallpaperDetail.f6380s;
    }

    /* renamed from: n */
    static /* synthetic */ PersonalizationActivity m6819n(WallpaperDetail wallpaperDetail) {
        return wallpaperDetail.f6367f;
    }

    public void setType(EnumC2057ai enumC2057ai) {
        this.f6384w = enumC2057ai;
    }

    public void setOnDeleteListener(InterfaceC1986b interfaceC1986b) {
        this.f6383v = interfaceC1986b;
    }

    public WallpaperDetail(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6372k = new Bundle();
        this.f6377p = 0;
        this.f6379r = null;
        this.f6380s = false;
        this.f6381t = false;
        this.f6387z = false;
        this.f6352A = false;
        this.f6356E = 0L;
        this.f6359H = false;
        this.f6361J = false;
        HandlerThread handlerThread = new HandlerThread("preview img loader");
        handlerThread.start();
        this.f6382u = new Handler(handlerThread.getLooper());
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        setPadding(0, 0, 0, C1437p.m8615c(getContext()));
        this.f6378q = WallpaperManager.getInstance(getContext());
        this.f6385x = C2026aa.m6695a();
        this.f6371j = new C1985a();
        this.f6366e = Lists.newArrayList();
        this.f6365d = LayoutInflater.from(getContext());
        this.f6368g = (ImageView) findViewById(C1536f.C1541e.go_to_list);
        this.f6354C = (ImageView) findViewById(C1536f.C1541e.switch_scale);
        this.f6353B = (HorzontalSliderView) findViewById(C1536f.C1541e.slider);
        this.f6353B.setSliderChangeListener(this);
        this.f6375n = new C1989d();
        this.f6373l = findViewById(C1536f.C1541e.setting_wallpaper);
        this.f6374m = (ProgressBar) findViewById(C1536f.C1541e.setting_wallpaper_progress);
        this.f6374m = (ProgressBar) findViewById(C1536f.C1541e.setting_wallpaper_progress);
        this.f6374m.setIndeterminateDrawable(new C1518d(getContext(), 3));
        this.f6368g.setImageDrawable(new C1519e(new BitmapDrawable(getResources(), BitmapFactory.decodeResource(getResources(), C1536f.C1540d.actionbar_back)), new int[]{-1, -7829368}, new PorterDuff.Mode[]{PorterDuff.Mode.SRC_IN, PorterDuff.Mode.SRC_IN}));
        this.f6369h = (ImageView) findViewById(C1536f.C1541e.launcher_preview);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f6369h.getLayoutParams();
        layoutParams.bottomMargin = -C1437p.m8615c(getContext());
        this.f6369h.setLayoutParams(layoutParams);
        this.f6369h.setVisibility(8);
        this.f6368g.setOnClickListener(this);
        this.f6354C.setOnClickListener(this);
        this.f6364c = Lists.newArrayList();
        this.f6363b = (TabViewPager) findViewById(C1536f.C1541e.view_pager);
        this.f6363b.setOnPageChangeListener(new ViewPager.InterfaceC1464e() { // from class: com.tsf.extend.wallpaper.WallpaperDetail.1

            /* renamed from: b */
            private int f6389b = 0;

            @Override // com.tsf.extend.base.support.ViewPager.InterfaceC1464e
            /* renamed from: a */
            public void mo6728a(int i) {
                C2094m c2094m;
                this.f6389b = i;
                if (WallpaperDetail.this.f6355D != WallpaperDetail.this.f6363b.getCurrentItem()) {
                    View$OnClickListenerC1990e m6877a = WallpaperDetail.this.m6877a(WallpaperDetail.this.f6363b.getCurrentItem());
                    if (m6877a != null) {
                        C2106s c2106s = m6877a.f6471o;
                        if (!(c2106s instanceof C2094m)) {
                            c2094m = null;
                        } else {
                            c2094m = (C2094m) c2106s;
                        }
                        WallpaperDetail.this.m6857a(c2094m);
                    }
                    WallpaperDetail.this.f6355D = WallpaperDetail.this.f6363b.getCurrentItem();
                }
                WallpaperDetail.this.m6877a(WallpaperDetail.this.f6363b.getCurrentItem());
            }

            @Override // com.tsf.extend.base.support.ViewPager.InterfaceC1464e
            /* renamed from: a */
            public void mo6727a(int i, float f, int i2) {
            }

            @Override // com.tsf.extend.base.support.ViewPager.InterfaceC1464e
            /* renamed from: b */
            public void mo6723b(int i) {
                WallpaperDetail.this.f6377p = i;
                if (i == 0) {
                }
            }
        });
        this.f6370i = new C2000f();
        this.f6363b.setAdapter(this.f6370i);
        this.f6363b.setOnClickListener(this);
        this.f6363b.setOnTabListener(this);
        this.f6387z = this.f6385x.m6678c();
        this.f6385x.m6693a((C2026aa.InterfaceC2034a) this);
        this.f6386y = findViewById(C1536f.C1541e.favorite_anim);
        this.f6386y.setOnTouchListener(new View.OnTouchListener() { // from class: com.tsf.extend.wallpaper.WallpaperDetail.6
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });
        this.f6353B.setVisibility(this.f6352A ? 0 : 8);
        this.f6354C.setSelected(this.f6352A);
        this.f6357F = C1430i.m8655d();
    }

    private String getReportTab() {
        if (this.f6380s) {
            return "3";
        }
        if (this.f6384w != null) {
            return String.valueOf(this.f6384w.m6559a());
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m6857a(C2094m c2094m) {
        if (m6826k()) {
        }
        if (c2094m != null) {
            c2094m.m6431h();
            c2094m.m6428k();
            if (c2094m.m6425n()) {
                String[] split = c2094m.m6426m().split("id=");
                if (split.length >= 2) {
                    String str = split[1];
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public View$OnClickListenerC1990e m6877a(int i) {
        for (View$OnClickListenerC1990e view$OnClickListenerC1990e : this.f6366e) {
            if (view$OnClickListenerC1990e.f6477u == i) {
                return view$OnClickListenerC1990e;
            }
        }
        return null;
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.InterfaceC1352a
    public View getContent() {
        return this;
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.InterfaceC1352a
    /* renamed from: a */
    public void mo6535a(PageActivity pageActivity) {
        if (pageActivity instanceof PersonalizationActivity) {
            this.f6367f = (PersonalizationActivity) pageActivity;
            this.f6367f.m6983b(true);
            if (this.f6360I == null) {
                this.f6360I = this.f6367f.getIntent().getStringExtra("inlet");
            }
        }
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.InterfaceC1352a
    public Bundle getResult() {
        return this.f6372k;
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.InterfaceC1352a
    /* renamed from: c */
    public void mo6531c() {
        m6828j();
        m6816p();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C2021a.m6704a(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C2021a.m6701b(this);
        C2026aa.m6695a().m6675d();
        C2148z.m6199h().m6208a((List<WeakReference<View$OnClickListenerC1990e>>) null);
        if (this.f6366e != null) {
            for (View$OnClickListenerC1990e view$OnClickListenerC1990e : this.f6366e) {
                view$OnClickListenerC1990e.m6779d();
            }
        }
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.InterfaceC1352a
    /* renamed from: e */
    public boolean mo6529e() {
        if (this.f6373l.getVisibility() == 0) {
            return true;
        }
        View$OnClickListenerC1990e m6877a = m6877a(this.f6363b.getCurrentItem());
        if (m6877a == null) {
            return false;
        }
        C2094m c2094m = (C2094m) m6877a.f6471o;
        if (this.f6376o) {
            this.f6376o = false;
            setBtnVisibilityForPreview(false);
            m6843c(this.f6369h);
            int size = this.f6366e.size();
            for (int i = 0; i < size; i++) {
                View$OnClickListenerC1990e view$OnClickListenerC1990e = this.f6366e.get(i);
                if (view$OnClickListenerC1990e != null) {
                    view$OnClickListenerC1990e.m6772g();
                    view$OnClickListenerC1990e.m6788a(false);
                }
            }
            m6855a(c2094m, (C1848k) null, "4");
            return true;
        } else if (this.f6352A) {
            m6844b(false);
            return true;
        } else {
            this.f6372k.putInt("index", this.f6363b.getCurrentItem());
            this.f6367f.m6983b(false);
            m6855a(c2094m, (C1848k) null, "3");
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m6876a(final int i, final List<C2094m.C2095a> list) {
        C1455z.m8564a(2, new Runnable() { // from class: com.tsf.extend.wallpaper.WallpaperDetail.7
            @Override // java.lang.Runnable
            public void run() {
                if (WallpaperDetail.this.m6822m()) {
                    int i2 = 0;
                    while (true) {
                        int i3 = i2;
                        if (i3 < 3) {
                            int i4 = i + i3 + 1;
                            if (i4 < list.size()) {
                                WallpaperDetail.this.m6858a((C2094m.C2095a) list.get(i4), (AbstractC1386a.InterfaceC1396a<Pair<C2094m.C2095a, Bitmap>>) null, true);
                            }
                            i2 = i3 + 1;
                        } else {
                            return;
                        }
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m6858a(final C2094m.C2095a c2095a, final AbstractC1386a.InterfaceC1396a<Pair<C2094m.C2095a, Bitmap>> interfaceC1396a, final boolean z) {
        C1455z.m8564a(0, new Runnable() { // from class: com.tsf.extend.wallpaper.WallpaperDetail.8
            @Override // java.lang.Runnable
            public void run() {
                C2148z.m6199h().m6212a(new C2094m.C2095a(c2095a.f6861a, c2095a.f6862b), interfaceC1396a, z, C1437p.m8619b(), C1437p.m8616c());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.tsf.extend.wallpaper.WallpaperDetail$f */
    /* loaded from: classes.dex */
    public class C2000f extends AbstractC1468a {
        private C2000f() {
        }

        @Override // com.tsf.extend.base.support.AbstractC1468a
        /* renamed from: a */
        public int mo6712a() {
            if (WallpaperDetail.this.f6364c == null) {
                return 0;
            }
            return WallpaperDetail.this.f6364c.size();
        }

        /* renamed from: a */
        private void m6759a(View$OnClickListenerC1990e view$OnClickListenerC1990e, View view, C2106s c2106s) {
            boolean z;
            boolean z2 = false;
            view$OnClickListenerC1990e.f6462f = view.findViewById(C1536f.C1541e.controll_view);
            view$OnClickListenerC1990e.f6463g = (ImageView) view.findViewById(C1536f.C1541e.preview);
            view$OnClickListenerC1990e.f6464h = (TextView) view.findViewById(C1536f.C1541e.set_wallpaper);
            view$OnClickListenerC1990e.f6465i = view.findViewById(C1536f.C1541e.favorite);
            view$OnClickListenerC1990e.f6466j = view.findViewById(C1536f.C1541e.delete);
            C1519e c1519e = new C1519e(WallpaperDetail.this.getResources().getDrawable(C1536f.C1540d.wallpaper_preview_btn));
            view$OnClickListenerC1990e.f6463g.setImageDrawable(c1519e);
            view$OnClickListenerC1990e.f6429B.setImageDrawable(c1519e);
            view$OnClickListenerC1990e.f6463g.setOnClickListener(WallpaperDetail.this);
            view$OnClickListenerC1990e.f6429B.setOnClickListener(WallpaperDetail.this);
            view$OnClickListenerC1990e.f6464h.setText(WallpaperDetail.this.getResources().getString(C1536f.C1543g.set_as_wallpaper).toUpperCase());
            view$OnClickListenerC1990e.f6464h.setOnClickListener(WallpaperDetail.this);
            view$OnClickListenerC1990e.f6430C.setText(WallpaperDetail.this.getResources().getString(C1536f.C1543g.set_as_wallpaper).toUpperCase());
            view$OnClickListenerC1990e.f6430C.setOnClickListener(WallpaperDetail.this);
            view$OnClickListenerC1990e.f6465i.setOnClickListener(WallpaperDetail.this);
            view$OnClickListenerC1990e.f6431D.setOnClickListener(WallpaperDetail.this);
            view$OnClickListenerC1990e.f6466j.setOnClickListener(WallpaperDetail.this);
            view$OnClickListenerC1990e.f6432E.setOnClickListener(WallpaperDetail.this);
            view$OnClickListenerC1990e.f6467k = view.findViewById(C1536f.C1541e.expand_panel);
            view$OnClickListenerC1990e.f6468l = (TextView) view.findViewById(C1536f.C1541e.author);
            if (c2106s instanceof C2070g) {
                z = ((C2070g) c2106s).m6521c();
            } else {
                m6758a(view$OnClickListenerC1990e, c2106s);
                z = false;
            }
            if (WallpaperDetail.this.f6380s) {
                m6757a(view$OnClickListenerC1990e, false);
                if (!z && !WallpaperDetail.this.f6381t) {
                    z2 = true;
                }
                m6754b(view$OnClickListenerC1990e, z2);
                m6753c(view$OnClickListenerC1990e, true);
            } else {
                m6753c(view$OnClickListenerC1990e, false);
            }
            view$OnClickListenerC1990e.f6470n = view.findViewById(C1536f.C1541e.wallpaper_layout);
        }

        /* renamed from: a */
        private void m6757a(View$OnClickListenerC1990e view$OnClickListenerC1990e, boolean z) {
            int i = z ? 0 : 8;
            view$OnClickListenerC1990e.f6465i.setVisibility(i);
            view$OnClickListenerC1990e.f6431D.setVisibility(i);
        }

        /* renamed from: b */
        private void m6754b(View$OnClickListenerC1990e view$OnClickListenerC1990e, boolean z) {
            view$OnClickListenerC1990e.f6466j.setEnabled(z);
            if (Build.VERSION.SDK_INT >= 11) {
                view$OnClickListenerC1990e.f6466j.setAlpha(z ? 1.0f : 0.2f);
            }
            view$OnClickListenerC1990e.f6432E.setEnabled(z);
            if (Build.VERSION.SDK_INT >= 11) {
                view$OnClickListenerC1990e.f6432E.setAlpha(z ? 1.0f : 0.2f);
            }
        }

        /* renamed from: c */
        private void m6753c(View$OnClickListenerC1990e view$OnClickListenerC1990e, boolean z) {
            int i = z ? 0 : 8;
            view$OnClickListenerC1990e.f6466j.setVisibility(i);
            view$OnClickListenerC1990e.f6432E.setVisibility(i);
        }

        /* renamed from: a */
        private void m6758a(View$OnClickListenerC1990e view$OnClickListenerC1990e, C2106s c2106s) {
            if (c2106s != null && (c2106s instanceof C2094m) && WallpaperDetail.this.f6384w != EnumC2057ai.FavoriteType) {
                C2094m c2094m = (C2094m) c2106s;
                view$OnClickListenerC1990e.f6469m = c2094m.m6422q();
                if (!TextUtils.isEmpty(view$OnClickListenerC1990e.f6469m) && c2094m.m6423p() > 0) {
                    view$OnClickListenerC1990e.f6467k.setVisibility(0);
                    view$OnClickListenerC1990e.f6468l.setVisibility(8);
                    view$OnClickListenerC1990e.f6434G.setVisibility(0);
                    view$OnClickListenerC1990e.f6435H.setVisibility(8);
                } else if (c2094m.m6427l() && !TextUtils.isEmpty(c2094m.m6424o())) {
                    view$OnClickListenerC1990e.f6467k.setVisibility(0);
                    view$OnClickListenerC1990e.f6468l.setVisibility(0);
                    view$OnClickListenerC1990e.f6468l.setText(WallpaperDetail.this.getResources().getString(C1536f.C1543g.wallpaper_author_by) + c2094m.m6424o());
                    view$OnClickListenerC1990e.f6434G.setVisibility(0);
                    view$OnClickListenerC1990e.f6435H.setVisibility(0);
                    view$OnClickListenerC1990e.f6435H.setText(WallpaperDetail.this.getResources().getString(C1536f.C1543g.wallpaper_author_by) + c2094m.m6424o());
                    view$OnClickListenerC1990e.f6468l.setVisibility(0);
                } else {
                    view$OnClickListenerC1990e.f6467k.setVisibility(8);
                    view$OnClickListenerC1990e.f6468l.setVisibility(8);
                    view$OnClickListenerC1990e.f6434G.setVisibility(8);
                    view$OnClickListenerC1990e.f6435H.setVisibility(8);
                }
            }
        }

        /* renamed from: b */
        private void m6755b(View$OnClickListenerC1990e view$OnClickListenerC1990e, View view, C2106s c2106s) {
            view$OnClickListenerC1990e.f6482z = view.findViewById(C1536f.C1541e.wallpaper_bigtype_layout);
            view$OnClickListenerC1990e.f6428A = view.findViewById(C1536f.C1541e.wallpaper_bigtype_action_layout);
            view$OnClickListenerC1990e.f6429B = (ImageView) view.findViewById(C1536f.C1541e.wallpaper_bigtype_preview);
            view$OnClickListenerC1990e.f6430C = (TextView) view.findViewById(C1536f.C1541e.wallpaper_bigtype_set_wallpaper);
            view$OnClickListenerC1990e.f6431D = (ImageView) view.findViewById(C1536f.C1541e.wallpaper_bigtype_favorite);
            view$OnClickListenerC1990e.f6432E = (ImageView) view.findViewById(C1536f.C1541e.wallpaper_bigtype_delete);
            view$OnClickListenerC1990e.f6433F = view.findViewById(C1536f.C1541e.wallpaper_bigtype_author_layout);
            view$OnClickListenerC1990e.f6434G = view.findViewById(C1536f.C1541e.wallpaper_bigtype_expand_panel);
            view$OnClickListenerC1990e.f6435H = (TextView) view.findViewById(C1536f.C1541e.wallpaper_bigtype_author);
            view$OnClickListenerC1990e.f6436I = (ProgressBar) view.findViewById(C1536f.C1541e.wallpaper_bigtype_progresbar);
            view$OnClickListenerC1990e.f6436I.setIndeterminateDrawable(new C1518d(view.getContext(), 3));
            view$OnClickListenerC1990e.f6437J = view.findViewById(C1536f.C1541e.wallpaper_bigtype_retry);
            view$OnClickListenerC1990e.f6437J.setOnClickListener(WallpaperDetail.this);
            ((ImageView) view$OnClickListenerC1990e.f6437J.findViewById(C1536f.C1541e.wallpaper_bigtype_refresh_icon)).setImageDrawable(new C1519e(WallpaperDetail.this.getResources().getDrawable(C1536f.C1540d.icon_btn_refresh), new int[]{-1, 1728053247}, new PorterDuff.Mode[]{PorterDuff.Mode.SRC_IN, PorterDuff.Mode.SRC_IN}));
            view$OnClickListenerC1990e.f6438K = (TextView) view.findViewById(C1536f.C1541e.wallpaper_bigtype_wallpaper_progress);
            view$OnClickListenerC1990e.f6439L = (WallpaperImageView) view.findViewById(C1536f.C1541e.wallpaper_bigtype_img);
            view$OnClickListenerC1990e.f6439L.setScaleType(WallpaperImageView.EnumC2011b.HeightFirst);
        }

        @Override // com.tsf.extend.base.support.AbstractC1468a
        /* renamed from: b */
        public View mo6710a(ViewGroup viewGroup, int i) {
            View inflate = WallpaperDetail.this.f6365d.inflate(C1536f.C1542f.wallpaper_detail_list, (ViewGroup) null);
            ThemePullToRefreshListView themePullToRefreshListView = (ThemePullToRefreshListView) inflate.findViewById(C1536f.C1541e.detail_list);
            View inflate2 = WallpaperDetail.this.f6365d.inflate(C1536f.C1542f.gallery_img_item, (ViewGroup) null);
            themePullToRefreshListView.getListView().addHeaderView(inflate2);
            C2106s c2106s = (C2106s) WallpaperDetail.this.f6364c.get(i);
            final View$OnClickListenerC1990e view$OnClickListenerC1990e = new View$OnClickListenerC1990e();
            view$OnClickListenerC1990e.f6471o = c2106s;
            view$OnClickListenerC1990e.f6454a = WallpaperDetail.this.getContext().getApplicationContext();
            view$OnClickListenerC1990e.f6458b = (ViewGroup) inflate;
            view$OnClickListenerC1990e.f6459c = themePullToRefreshListView;
            view$OnClickListenerC1990e.m6800a(WallpaperDetail.this.getContext());
            m6755b(view$OnClickListenerC1990e, inflate, c2106s);
            view$OnClickListenerC1990e.f6472p = (ViewGroup) inflate2;
            m6759a(view$OnClickListenerC1990e, inflate2, c2106s);
            view$OnClickListenerC1990e.f6474r = (WallpaperImageView) inflate2.findViewById(C1536f.C1541e.img);
            view$OnClickListenerC1990e.f6476t = inflate2.findViewById(C1536f.C1541e.wallpaper_layout);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view$OnClickListenerC1990e.f6476t.getLayoutParams();
            layoutParams.height = (int) (0.8f * WallpaperDetail.this.f6357F);
            view$OnClickListenerC1990e.f6476t.setLayoutParams(layoutParams);
            view$OnClickListenerC1990e.f6477u = i;
            view$OnClickListenerC1990e.f6475s = (ProgressBar) inflate2.findViewById(C1536f.C1541e.progresbar);
            view$OnClickListenerC1990e.f6478v = inflate2.findViewById(C1536f.C1541e.retry);
            view$OnClickListenerC1990e.f6475s.setIndeterminateDrawable(new C1518d(inflate2.getContext(), 3));
            view$OnClickListenerC1990e.m6780c(WallpaperDetail.this.f6352A);
            if (WallpaperDetail.this.m6826k()) {
                view$OnClickListenerC1990e.m6774f();
            }
            view$OnClickListenerC1990e.f6474r.setOnTapListener(WallpaperDetail.this);
            view$OnClickListenerC1990e.f6439L.setOnTapListener(WallpaperDetail.this);
            view$OnClickListenerC1990e.f6482z.setOnClickListener(WallpaperDetail.this);
            view$OnClickListenerC1990e.f6439L.setTag(c2106s);
            view$OnClickListenerC1990e.f6478v.setOnClickListener(WallpaperDetail.this);
            view$OnClickListenerC1990e.f6473q = (TextView) inflate2.findViewById(C1536f.C1541e.wallpaper_progress);
            view$OnClickListenerC1990e.m6788a(WallpaperDetail.this.m6826k());
            ((ImageView) view$OnClickListenerC1990e.f6478v.findViewById(C1536f.C1541e.refresh_icon)).setImageDrawable(new C1519e(WallpaperDetail.this.getResources().getDrawable(C1536f.C1540d.icon_btn_refresh), new int[]{-1, 1728053247}, new PorterDuff.Mode[]{PorterDuff.Mode.SRC_IN, PorterDuff.Mode.SRC_IN}));
            WallpaperDetail.this.f6366e.add(view$OnClickListenerC1990e);
            inflate.setTag(view$OnClickListenerC1990e);
            viewGroup.addView(inflate);
            if (!WallpaperDetail.this.f6380s) {
                if (!WallpaperDetail.this.m6873a(view$OnClickListenerC1990e)) {
                    if (c2106s.m6403r() == null) {
                        if (c2106s instanceof C2094m) {
                            C2148z.m6199h().m8801a(((C2094m) c2106s).m6430i(), WallpaperDetail.this.f6375n);
                        }
                    } else {
                        view$OnClickListenerC1990e.f6474r.setTempBitmap(c2106s.m6403r());
                        view$OnClickListenerC1990e.f6439L.setTempBitmap(c2106s.m6403r());
                    }
                    C1455z.m8563a(0, new Runnable() { // from class: com.tsf.extend.wallpaper.WallpaperDetail.f.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (WallpaperDetail.this.f6366e != null && WallpaperDetail.this.f6366e.contains(view$OnClickListenerC1990e) && view$OnClickListenerC1990e.f6475s.getVisibility() == 0) {
                                view$OnClickListenerC1990e.f6473q.setVisibility(0);
                                view$OnClickListenerC1990e.f6473q.setText(view$OnClickListenerC1990e.f6479w + "%");
                            }
                        }
                    }, 500L);
                    C1455z.m8563a(0, new Runnable() { // from class: com.tsf.extend.wallpaper.WallpaperDetail.f.2
                        @Override // java.lang.Runnable
                        public void run() {
                            if (WallpaperDetail.this.f6366e != null && WallpaperDetail.this.f6366e.contains(view$OnClickListenerC1990e) && view$OnClickListenerC1990e.f6436I.getVisibility() == 0) {
                                view$OnClickListenerC1990e.f6438K.setVisibility(0);
                                view$OnClickListenerC1990e.f6438K.setText(view$OnClickListenerC1990e.f6479w + "%");
                            }
                        }
                    }, 500L);
                }
                ArrayList arrayList = new ArrayList();
                for (C2106s c2106s2 : WallpaperDetail.this.f6364c) {
                    if (c2106s2 instanceof C2094m) {
                        arrayList.add(new C2094m.C2095a(((C2094m) c2106s2).m6429j(), ((C2094m) c2106s2).m6431h()));
                    }
                }
                WallpaperDetail.this.m6876a(i, arrayList);
            } else {
                Bitmap m6402s = c2106s.m6402s();
                if (m6402s != null) {
                    view$OnClickListenerC1990e.f6474r.setSrcBitmap(m6402s);
                    view$OnClickListenerC1990e.f6439L.setSrcBitmap(m6402s);
                    if (view$OnClickListenerC1990e.f6477u == WallpaperDetail.this.f6363b.getCurrentItem()) {
                    }
                    view$OnClickListenerC1990e.f6475s.setVisibility(8);
                    view$OnClickListenerC1990e.f6436I.setVisibility(8);
                    view$OnClickListenerC1990e.f6473q.setVisibility(8);
                    view$OnClickListenerC1990e.f6438K.setVisibility(8);
                    WallpaperDetail.this.setButtonEnableStatus(view$OnClickListenerC1990e);
                } else {
                    Bitmap m6403r = c2106s.m6403r();
                    if (m6403r != null) {
                        view$OnClickListenerC1990e.f6474r.setTempBitmap(m6403r);
                        view$OnClickListenerC1990e.f6439L.setTempBitmap(m6403r);
                    }
                    if (c2106s instanceof C2070g) {
                        C2077i.m6486a().m6481a(new C2077i.InterfaceC2081a() { // from class: com.tsf.extend.wallpaper.WallpaperDetail.f.3
                            @Override // com.tsf.extend.wallpaper.C2077i.InterfaceC2081a
                            /* renamed from: a */
                            public void mo6477a(C2077i.InterfaceC2081a.EnumC2082a enumC2082a, Object obj, C2077i.InterfaceC2081a.EnumC2083b enumC2083b) {
                                if (enumC2083b == C2077i.InterfaceC2081a.EnumC2083b.suc && (obj instanceof Pair)) {
                                    final Pair pair = (Pair) obj;
                                    if (pair.second != null) {
                                        C1455z.m8564a(0, new Runnable() { // from class: com.tsf.extend.wallpaper.WallpaperDetail.f.3.1
                                            @Override // java.lang.Runnable
                                            public void run() {
                                                view$OnClickListenerC1990e.f6471o.m6404b((Bitmap) pair.second);
                                                view$OnClickListenerC1990e.f6474r.setSrcBitmap((Bitmap) pair.second);
                                                view$OnClickListenerC1990e.f6439L.setSrcBitmap((Bitmap) pair.second);
                                                if (view$OnClickListenerC1990e.f6477u == WallpaperDetail.this.f6363b.getCurrentItem()) {
                                                }
                                                view$OnClickListenerC1990e.f6475s.setVisibility(8);
                                                view$OnClickListenerC1990e.f6436I.setVisibility(8);
                                                view$OnClickListenerC1990e.f6473q.setVisibility(8);
                                                view$OnClickListenerC1990e.f6438K.setVisibility(8);
                                                WallpaperDetail.this.setButtonEnableStatus(view$OnClickListenerC1990e);
                                            }
                                        });
                                    }
                                }
                            }
                        }, (C2070g) c2106s, 0, true);
                    }
                }
            }
            WallpaperDetail.this.setFavoriteBtnStatus(view$OnClickListenerC1990e);
            WallpaperDetail.this.setButtonEnableStatus(view$OnClickListenerC1990e);
            WallpaperDetail.this.setScaleStatus(view$OnClickListenerC1990e);
            return inflate;
        }

        @Override // com.tsf.extend.base.support.AbstractC1468a
        /* renamed from: a */
        public void mo6709a(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
            View$OnClickListenerC1990e view$OnClickListenerC1990e = (View$OnClickListenerC1990e) ((View) obj).getTag();
            if (view$OnClickListenerC1990e != null) {
                WallpaperDetail.this.f6366e.remove(view$OnClickListenerC1990e);
                view$OnClickListenerC1990e.m6779d();
            }
            if (!WallpaperDetail.this.f6380s && view$OnClickListenerC1990e != null) {
                ArrayList newArrayList = Lists.newArrayList();
                C2106s c2106s = view$OnClickListenerC1990e.f6471o;
                if (c2106s instanceof C2094m) {
                    newArrayList.add(((C2094m) c2106s).m6430i());
                    newArrayList.add(((C2094m) c2106s).m6429j());
                    C2148z.m6199h().m6204b(newArrayList);
                }
            }
        }

        @Override // com.tsf.extend.base.support.AbstractC1468a
        /* renamed from: a */
        public boolean mo6711a(View view, Object obj) {
            return view == obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public boolean m6873a(View$OnClickListenerC1990e view$OnClickListenerC1990e) {
        Bitmap m6402s = view$OnClickListenerC1990e.f6471o.m6402s();
        if (m6402s != null) {
            view$OnClickListenerC1990e.f6474r.setSrcBitmap(m6402s);
            view$OnClickListenerC1990e.f6439L.setSrcBitmap(m6402s);
            view$OnClickListenerC1990e.f6475s.setVisibility(8);
            view$OnClickListenerC1990e.f6436I.setVisibility(8);
            view$OnClickListenerC1990e.f6473q.setVisibility(8);
            view$OnClickListenerC1990e.f6438K.setVisibility(8);
            setButtonEnableStatus(view$OnClickListenerC1990e);
            setFavoriteBtnStatus(view$OnClickListenerC1990e);
            setScaleStatus(view$OnClickListenerC1990e);
            return true;
        }
        ArrayList newArrayList = Lists.newArrayList();
        for (int i = 0; i < this.f6366e.size(); i++) {
            newArrayList.add(new WeakReference(this.f6366e.get(i)));
        }
        C2148z.m6199h().m6208a(newArrayList);
        m6858a(new C2094m.C2095a(view$OnClickListenerC1990e.m6802a(), view$OnClickListenerC1990e.m6783c()), (AbstractC1386a.InterfaceC1396a<Pair<C2094m.C2095a, Bitmap>>) this.f6371j, false);
        return false;
    }

    /* renamed from: com.tsf.extend.wallpaper.WallpaperDetail$e */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC1990e implements View.OnClickListener {

        /* renamed from: A */
        View f6428A;

        /* renamed from: B */
        ImageView f6429B;

        /* renamed from: C */
        TextView f6430C;

        /* renamed from: D */
        ImageView f6431D;

        /* renamed from: E */
        ImageView f6432E;

        /* renamed from: F */
        View f6433F;

        /* renamed from: G */
        View f6434G;

        /* renamed from: H */
        TextView f6435H;

        /* renamed from: I */
        ProgressBar f6436I;

        /* renamed from: J */
        View f6437J;

        /* renamed from: K */
        TextView f6438K;

        /* renamed from: L */
        WallpaperImageView f6439L;

        /* renamed from: R */
        private View f6445R;

        /* renamed from: S */
        private View f6446S;

        /* renamed from: T */
        private ProgressBar f6447T;

        /* renamed from: U */
        private TextView f6448U;

        /* renamed from: V */
        private TextView f6449V;

        /* renamed from: W */
        private View f6450W;

        /* renamed from: X */
        private View f6451X;

        /* renamed from: Y */
        private TextView f6452Y;

        /* renamed from: Z */
        private TextView f6453Z;

        /* renamed from: a */
        Context f6454a;

        /* renamed from: aa */
        private C1997b f6455aa;

        /* renamed from: ab */
        private C1997b f6456ab;

        /* renamed from: b */
        ViewGroup f6458b;

        /* renamed from: c */
        ThemePullToRefreshListView f6459c;

        /* renamed from: e */
        C1671af f6461e;

        /* renamed from: f */
        View f6462f;

        /* renamed from: g */
        ImageView f6463g;

        /* renamed from: h */
        TextView f6464h;

        /* renamed from: i */
        View f6465i;

        /* renamed from: j */
        View f6466j;

        /* renamed from: k */
        View f6467k;

        /* renamed from: l */
        TextView f6468l;

        /* renamed from: m */
        String f6469m;

        /* renamed from: n */
        View f6470n;

        /* renamed from: o */
        C2106s f6471o;

        /* renamed from: p */
        ViewGroup f6472p;

        /* renamed from: q */
        TextView f6473q;

        /* renamed from: r */
        WallpaperImageView f6474r;

        /* renamed from: s */
        ProgressBar f6475s;

        /* renamed from: t */
        View f6476t;

        /* renamed from: u */
        int f6477u;

        /* renamed from: v */
        View f6478v;

        /* renamed from: z */
        View f6482z;

        /* renamed from: d */
        List<C1887t.C1890b> f6460d = new ArrayList();

        /* renamed from: w */
        int f6479w = 1;

        /* renamed from: x */
        boolean f6480x = false;

        /* renamed from: y */
        boolean f6481y = false;

        /* renamed from: N */
        private long f6441N = 0;

        /* renamed from: O */
        private Runnable f6442O = new Runnable() { // from class: com.tsf.extend.wallpaper.WallpaperDetail.e.1
            @Override // java.lang.Runnable
            public void run() {
                if (WallpaperDetail.this.f6363b == null || View$OnClickListenerC1990e.this.f6479w >= 40) {
                    WallpaperDetail.this.f6363b.removeCallbacks(this);
                    return;
                }
                View$OnClickListenerC1990e.this.f6479w++;
                View$OnClickListenerC1990e.this.f6443P.run();
                C1455z.m8563a(0, this, 200L);
            }
        };

        /* renamed from: P */
        private Runnable f6443P = new Runnable() { // from class: com.tsf.extend.wallpaper.WallpaperDetail.e.2
            @Override // java.lang.Runnable
            public void run() {
                if (View$OnClickListenerC1990e.this.f6479w == 100) {
                    View$OnClickListenerC1990e.this.f6473q.setVisibility(8);
                    View$OnClickListenerC1990e.this.f6438K.setVisibility(8);
                    return;
                }
                if (View$OnClickListenerC1990e.this.f6473q.getVisibility() != 0) {
                    View$OnClickListenerC1990e.this.f6473q.setVisibility(0);
                }
                if (View$OnClickListenerC1990e.this.f6438K.getVisibility() != 0) {
                    View$OnClickListenerC1990e.this.f6438K.setVisibility(0);
                }
                View$OnClickListenerC1990e.this.f6473q.setText(View$OnClickListenerC1990e.this.f6479w + "%");
                View$OnClickListenerC1990e.this.f6438K.setText(View$OnClickListenerC1990e.this.f6479w + "%");
            }
        };

        /* renamed from: Q */
        private boolean f6444Q = false;

        /* renamed from: ac */
        private boolean f6457ac = false;

        public View$OnClickListenerC1990e() {
        }

        /* renamed from: a */
        public void m6788a(boolean z) {
            this.f6480x = z;
            m6776e();
        }

        /* renamed from: b */
        public void m6784b(boolean z) {
            this.f6481y = z;
            m6776e();
        }

        /* renamed from: e */
        private void m6776e() {
            if (this.f6478v != null && !this.f6480x && this.f6481y) {
                this.f6478v.setVisibility(0);
                this.f6437J.setVisibility(0);
                if (WallpaperDetail.this.f6363b != null) {
                    WallpaperDetail.this.f6363b.removeCallbacks(this.f6442O);
                }
                this.f6473q.setVisibility(8);
                this.f6438K.setVisibility(8);
                return;
            }
            this.f6478v.setVisibility(8);
            this.f6437J.setVisibility(8);
        }

        /* renamed from: a */
        public String m6802a() {
            return !(this.f6471o instanceof C2094m) ? "" : ((C2094m) this.f6471o).m6429j();
        }

        /* renamed from: b */
        public String m6787b() {
            return !(this.f6471o instanceof C2094m) ? "" : ((C2094m) this.f6471o).m6430i();
        }

        /* renamed from: c */
        public long m6783c() {
            if (this.f6471o instanceof C2094m) {
                return ((C2094m) this.f6471o).m6431h();
            }
            return -1L;
        }

        /* renamed from: a */
        public void m6801a(int i) {
            if (WallpaperDetail.this.f6363b != null) {
                if (i > 1) {
                    WallpaperDetail.this.f6363b.removeCallbacks(this.f6442O);
                    if (i > this.f6479w) {
                        this.f6479w = i;
                        WallpaperDetail.this.f6363b.post(this.f6443P);
                    }
                } else if (i == 0 && this.f6479w == 1) {
                    this.f6479w++;
                    WallpaperDetail.this.f6363b.removeCallbacks(this.f6442O);
                    WallpaperDetail.this.f6363b.post(this.f6442O);
                }
            }
        }

        /* renamed from: d */
        public void m6779d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public void m6780c(boolean z) {
            if (z) {
                this.f6482z.setVisibility(0);
            } else {
                this.f6482z.setVisibility(8);
            }
            this.f6439L.setScaleType(WallpaperImageView.EnumC2011b.HeightFirst);
            this.f6428A.setVisibility(0);
            this.f6433F.setVisibility(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public void m6774f() {
            this.f6482z.setVisibility(0);
            this.f6428A.setVisibility(8);
            this.f6433F.setVisibility(8);
            this.f6439L.m6752a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public void m6772g() {
            if (WallpaperDetail.this.f6352A) {
                this.f6482z.setVisibility(0);
                this.f6428A.setVisibility(0);
                this.f6433F.setVisibility(0);
            } else {
                this.f6482z.setVisibility(8);
            }
            this.f6439L.m6746b();
        }

        /* renamed from: a */
        public void m6800a(Context context) {
            this.f6450W = this.f6458b.findViewById(C1536f.C1541e.no_data_layout);
            this.f6451X = this.f6458b.findViewById(C1536f.C1541e.load_relevance_layout);
            this.f6452Y = (TextView) this.f6458b.findViewById(C1536f.C1541e.main_more_theme);
            this.f6453Z = (TextView) this.f6458b.findViewById(C1536f.C1541e.main_more_theme_fail);
            m6799a(this.f6452Y);
            this.f6452Y.setOnClickListener(this);
            this.f6459c.setMode(PullToRefreshBase.EnumC1491b.DISABLED);
            this.f6459c.setHeaderResizeEnabled(false);
            this.f6459c.setCanLoadMore(true);
            this.f6459c.setOnScrollListener(new AbsListView.OnScrollListener() { // from class: com.tsf.extend.wallpaper.WallpaperDetail.e.3
                @Override // android.widget.AbsListView.OnScrollListener
                public void onScrollStateChanged(AbsListView absListView, int i) {
                    if (!View$OnClickListenerC1990e.this.f6457ac && i == 2) {
                        View$OnClickListenerC1990e.this.f6457ac = true;
                    }
                }

                @Override // android.widget.AbsListView.OnScrollListener
                public void onScroll(AbsListView absListView, int i, int i2, int i3) {
                }
            });
            this.f6459c.setOnLoadListener(new PullToRefreshAndLoadMoreListView.InterfaceC1486a() { // from class: com.tsf.extend.wallpaper.WallpaperDetail.e.4
                @Override // com.tsf.extend.base.widget.pulltorefresh.PullToRefreshAndLoadMoreListView.InterfaceC1486a
                /* renamed from: a */
                public void mo6254a() {
                }

                @Override // com.tsf.extend.base.widget.pulltorefresh.PullToRefreshAndLoadMoreListView.InterfaceC1486a
                /* renamed from: b */
                public void mo6253b() {
                    if (View$OnClickListenerC1990e.this.f6444Q) {
                        View$OnClickListenerC1990e.this.m6765l();
                    } else if (View$OnClickListenerC1990e.this.f6460d.size() > 0) {
                        View$OnClickListenerC1990e.this.m6767j();
                    }
                }
            });
            this.f6461e = new C1671af(WallpaperDetail.this.f6367f, this.f6460d, this);
            this.f6459c.setAdapter(this.f6461e);
            this.f6445R = LayoutInflater.from(WallpaperDetail.this.getContext()).inflate(C1536f.C1542f.wallpaper_detail_list_loadmore, (ViewGroup) null);
            this.f6447T = (ProgressBar) this.f6445R.findViewById(C1536f.C1541e.loadmore_progress);
            this.f6447T.setIndeterminateDrawable(new C1518d(WallpaperDetail.this.getContext(), 3, 1));
            this.f6448U = (TextView) this.f6445R.findViewById(C1536f.C1541e.loadmore_tips);
            this.f6446S = this.f6445R.findViewById(C1536f.C1541e.nomore_group);
            this.f6449V = (TextView) this.f6445R.findViewById(C1536f.C1541e.more_theme);
            this.f6448U.setOnClickListener(this);
            this.f6449V.setOnClickListener(this);
            m6799a(this.f6449V);
            this.f6459c.setLoadMoreView(this.f6445R);
            m6770h();
        }

        /* renamed from: a */
        private void m6799a(View view) {
            int m7012a = PersonalizationActivity.m7012a(WallpaperDetail.this.getContext(), 2.0f);
            C1845i c1845i = new C1845i(-16334705);
            c1845i.m7339a(m7012a);
            C1845i c1845i2 = new C1845i(-16405376);
            c1845i2.m7339a(m7012a);
            C1845i c1845i3 = new C1845i(-2565928);
            c1845i3.m7339a(m7012a);
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{16842919}, c1845i2);
            stateListDrawable.addState(new int[]{-16842910}, c1845i3);
            stateListDrawable.addState(StateSet.WILD_CARD, c1845i);
            m6798a(view, stateListDrawable);
        }

        /* renamed from: a */
        private void m6798a(View view, Drawable drawable) {
            if (Build.VERSION.SDK_INT >= 16) {
                view.setBackground(drawable);
            } else {
                view.setBackgroundDrawable(drawable);
            }
        }

        /* renamed from: h */
        private void m6770h() {
            long m6431h;
            int i;
            int k;
            long h;
            if (WallpaperDetail.this.f6380s) {
                C2070g c2070g = (C2070g) this.f6471o;
                if (c2070g.m6521c()) {
                    k = 1;
                    h = c2070g.m6431h();
                } else {
                    k = c2070g.m6428k();
                    h = c2070g.m6431h();
                }
                m6431h = h;
                i = k;
            } else {
                C2094m c2094m = (C2094m) this.f6471o;
                int m6428k = c2094m.m6428k();
                m6431h = c2094m.m6431h();
                i = m6428k;
            }
            this.f6455aa = new C1997b(AbstractC1386a.EnumC1397b.LoadCache);
            C1894v.m7069h().m7102a(this.f6455aa, AbstractC1386a.EnumC1397b.LoadCache, i, m6431h);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int id = view.getId();
            if (id == C1536f.C1541e.loadmore_tips) {
                this.f6447T.setVisibility(0);
                this.f6448U.setVisibility(8);
                m6765l();
            } else if (id == C1536f.C1541e.theme_item_download_layout_left) {
                m6797a(view.findViewById(C1536f.C1541e.theme_download_left), true);
            } else if (id == C1536f.C1541e.theme_item_download_layout_right) {
                m6797a(view.findViewById(C1536f.C1541e.theme_download_right), true);
            } else if (id == C1536f.C1541e.theme_item_download_layout_mid) {
                m6797a(view.findViewById(C1536f.C1541e.theme_download_mid), true);
            } else if (id == C1536f.C1541e.theme_item_left || id == C1536f.C1541e.theme_item_right || id == C1536f.C1541e.theme_item_mid) {
                m6797a(view, false);
            } else if (id == C1536f.C1541e.main_more_theme || id == C1536f.C1541e.more_theme) {
                WallpaperDetail.this.f6367f.m6972h();
                WallpaperDetail.this.m6855a(this.f6471o, (C1848k) null, "13");
            }
        }

        /* renamed from: a */
        private void m6797a(View view, boolean z) {
            C1848k c1848k;
            if (Math.abs(this.f6441N - System.currentTimeMillis()) > 1000) {
                if (z) {
                    c1848k = (C1848k) view.getTag();
                } else {
                    Object tag = view.getTag();
                    if (tag instanceof C1887t.C1892d) {
                        if (view.getId() == C1536f.C1541e.theme_item_left) {
                            c1848k = ((C1887t.C1892d) tag).f6088a;
                        } else if (view.getId() == C1536f.C1541e.theme_item_mid) {
                            c1848k = ((C1887t.C1892d) tag).f6102o;
                        } else {
                            c1848k = ((C1887t.C1892d) tag).f6095h;
                        }
                    } else {
                        c1848k = tag instanceof C1848k ? (C1848k) tag : null;
                    }
                }
                if (c1848k != null) {
                    WallpaperDetail.this.m6855a(this.f6471o, c1848k, "12");
                    if (C1696ao.m7774b().m7769g()) {
                        ThemeDetail themeDetail = (ThemeDetail) LayoutInflater.from(WallpaperDetail.this.f6367f).inflate(C1536f.C1542f.theme_detail, (ViewGroup) null);
                        themeDetail.setFromInlet(WallpaperDetail.this.f6360I);
                        themeDetail.setFromTab("detail");
                        themeDetail.setTheme(c1848k);
                        themeDetail.m8092a("1010", "1010");
                        WallpaperDetail.this.f6367f.m8922a((PageActivity.InterfaceC1352a) themeDetail);
                    } else if (!c1848k.m7272v()) {
                        WallpaperDetail.this.f6367f.m8921a(false);
                        C1920x.m7052a(WallpaperDetail.this.getContext(), c1848k.m7289k(), "tsf_theme_center_theme");
                    } else {
                        m6795a(c1848k);
                    }
                    this.f6441N = System.currentTimeMillis();
                }
            }
        }

        /* renamed from: a */
        private void m6795a(C1848k c1848k) {
            Context context = WallpaperDetail.this.getContext();
            String m7300g = c1848k.m7300g();
            if (context.getPackageManager() != null) {
                Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(m7300g);
                if (launchIntentForPackage != null) {
                    ComponentName component = launchIntentForPackage.getComponent();
                    launchIntentForPackage = new Intent("android.intent.action.MAIN");
                    launchIntentForPackage.addCategory("android.intent.category.LAUNCHER");
                    launchIntentForPackage.setComponent(component);
                    launchIntentForPackage.setFlags(270532608);
                }
                if (launchIntentForPackage != null) {
                    launchIntentForPackage.putExtra("from_cml_theme", true);
                    launchIntentForPackage.putExtra("from_cml", true);
                    WallpaperDetail.this.f6367f.m8921a(false);
                    context.startActivity(launchIntentForPackage);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.tsf.extend.wallpaper.WallpaperDetail$e$b */
        /* loaded from: classes.dex */
        public class C1997b implements AbstractC1386a.InterfaceC1396a<C1368a> {

            /* renamed from: b */
            private final AbstractC1386a.EnumC1397b f6491b;

            public C1997b(AbstractC1386a.EnumC1397b enumC1397b) {
                this.f6491b = enumC1397b;
            }

            @Override // com.tsf.extend.base.p074d.AbstractC1386a.InterfaceC1396a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo6245a(JSONObject jSONObject, final C1368a c1368a) {
                C1455z.m8564a(0, new Runnable() { // from class: com.tsf.extend.wallpaper.WallpaperDetail.e.b.1
                    @Override // java.lang.Runnable
                    public void run() {
                        View$OnClickListenerC1990e.this.m6796a(c1368a, C1997b.this.f6491b == AbstractC1386a.EnumC1397b.LoadMore);
                    }
                });
            }

            @Override // com.tsf.extend.base.p074d.AbstractC1386a.InterfaceC1396a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo6247a(JSONObject jSONObject, int i, C1368a c1368a) {
                Log.d("WallpaperDetail", "onFail=" + this.f6491b.name());
                C1455z.m8564a(0, new Runnable() { // from class: com.tsf.extend.wallpaper.WallpaperDetail.e.b.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (View$OnClickListenerC1990e.this.f6460d.size() > 0) {
                            View$OnClickListenerC1990e.this.m6766k();
                        } else {
                            View$OnClickListenerC1990e.this.m6777d(false);
                        }
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.tsf.extend.wallpaper.WallpaperDetail$e$a */
        /* loaded from: classes.dex */
        public class C1995a implements AbstractC1386a.InterfaceC1396a<List<C1848k>> {
            C1995a() {
            }

            @Override // com.tsf.extend.base.p074d.AbstractC1386a.InterfaceC1396a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo6245a(JSONObject jSONObject, final List<C1848k> list) {
                if (list != null) {
                    C1455z.m8564a(0, new Runnable() { // from class: com.tsf.extend.wallpaper.WallpaperDetail.e.a.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (View$OnClickListenerC1990e.this.f6460d != null) {
                                View$OnClickListenerC1990e.this.m6790a(list);
                            }
                        }
                    });
                }
            }

            @Override // com.tsf.extend.base.p074d.AbstractC1386a.InterfaceC1396a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo6247a(JSONObject jSONObject, int i, List<C1848k> list) {
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public void m6796a(C1368a c1368a, boolean z) {
            C1862p c1862p = null;
            if (c1368a instanceof C1862p) {
                c1862p = (C1862p) c1368a;
            }
            this.f6444Q = c1862p.m8868b();
            if ((this.f6460d.size() == 0) && c1368a.m8875a() != null && c1368a.m8875a().size() > 0) {
                this.f6451X.setVisibility(0);
            }
            m6789a(c1368a.m8875a(), z);
            if (!this.f6444Q) {
                if (this.f6460d.size() > 0) {
                    this.f6451X.setVisibility(0);
                    m6767j();
                }
            } else {
                m6768i();
                this.f6459c.m8430b(false);
            }
            C1894v.m7069h().m7106a(new C1995a());
        }

        /* renamed from: a */
        public void m6789a(List<C1848k> list, boolean z) {
            String str;
            if (!z) {
                this.f6460d.clear();
            }
            if (this.f6460d.size() != 0 || (list != null && list.size() != 0)) {
                if (WallpaperDetail.this.f6367f != null) {
                    str = WallpaperDetail.this.f6367f.m6976f();
                } else {
                    str = null;
                }
                if (str != null && str.startsWith("DIY://")) {
                    for (C1848k c1848k : list) {
                        if (c1848k instanceof AbstractC1700aq) {
                            if (!TextUtils.isEmpty(str) && str.contains(((AbstractC1700aq) c1848k).m7764I())) {
                                c1848k.m7314b(true);
                            } else {
                                c1848k.m7314b(false);
                            }
                        }
                    }
                } else {
                    for (C1848k c1848k2 : list) {
                        if (!TextUtils.isEmpty(str) && str.equals(c1848k2.m7300g())) {
                            c1848k2.m7314b(true);
                        } else {
                            c1848k2.m7314b(false);
                        }
                    }
                }
                this.f6461e.m7132a(this.f6460d, list);
                this.f6461e.notifyDataSetChanged();
                return;
            }
            this.f6461e.notifyDataSetChanged();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public void m6790a(List<C1848k> list) {
            for (C1887t.C1890b c1890b : this.f6460d) {
                C1848k m7124a = c1890b.m7124a();
                C1848k m7122b = c1890b.m7122b();
                m7124a.m7306d(false);
                if (m7122b != null) {
                    m7122b.m7306d(false);
                }
                for (C1848k c1848k : list) {
                    if (c1848k != null && !(c1848k instanceof AbstractC1700aq)) {
                        if (c1848k.m7300g().equals(m7124a.m7300g())) {
                            m7124a.m7306d(true);
                        }
                        if (m7122b != null && c1848k.m7300g().equals(m7122b.m7300g())) {
                            m7122b.m7306d(true);
                        }
                    }
                }
            }
            this.f6461e.notifyDataSetChanged();
        }

        /* renamed from: i */
        private void m6768i() {
            this.f6450W.setVisibility(8);
            this.f6445R.setVisibility(0);
            this.f6446S.setVisibility(8);
            this.f6447T.setVisibility(0);
            this.f6448U.setVisibility(8);
            this.f6448U.setClickable(false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: j */
        public void m6767j() {
            this.f6450W.setVisibility(8);
            this.f6445R.setVisibility(0);
            this.f6446S.setVisibility(0);
            this.f6449V.setVisibility(0);
            this.f6447T.setVisibility(8);
            this.f6448U.setVisibility(8);
            this.f6448U.setClickable(false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k */
        public void m6766k() {
            this.f6450W.setVisibility(8);
            this.f6445R.setVisibility(0);
            this.f6446S.setVisibility(8);
            this.f6447T.setVisibility(8);
            this.f6448U.setVisibility(0);
            this.f6448U.setClickable(true);
            this.f6448U.setText(C1536f.C1543g.load_more_fail);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public void m6777d(boolean z) {
            this.f6450W.setVisibility(0);
            this.f6445R.setVisibility(8);
            if (z) {
                this.f6453Z.setVisibility(8);
            } else {
                this.f6453Z.setVisibility(0);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l */
        public void m6765l() {
            long m6431h;
            int i;
            int k;
            long h;
            if (this.f6460d != null && this.f6460d.size() > 0) {
                if (WallpaperDetail.this.f6380s) {
                    C2070g c2070g = (C2070g) this.f6471o;
                    if (c2070g.m6521c()) {
                        k = 1;
                        h = c2070g.m6431h();
                    } else {
                        k = c2070g.m6428k();
                        h = c2070g.m6431h();
                    }
                    m6431h = h;
                    i = k;
                } else {
                    C2094m c2094m = (C2094m) this.f6471o;
                    int m6428k = c2094m.m6428k();
                    m6431h = c2094m.m6431h();
                    i = m6428k;
                }
                this.f6456ab = new C1997b(AbstractC1386a.EnumC1397b.LoadMore);
                C1894v.m7069h().m7102a(this.f6456ab, AbstractC1386a.EnumC1397b.LoadMore, i, m6431h);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m6852b(View view) {
        view.setVisibility(0);
        if (Build.VERSION.SDK_INT >= 14) {
            view.setAlpha(0.0f);
            view.setScaleX(0.0f);
            view.setScaleY(0.0f);
            ViewPropertyAnimator animate = view.animate();
            animate.alpha(1.0f);
            animate.scaleX(1.0f);
            animate.scaleY(1.0f);
            animate.setDuration(200L);
            animate.start();
        }
    }

    /* renamed from: c */
    private void m6843c(View view) {
        view.setVisibility(0);
        if (Build.VERSION.SDK_INT >= 14) {
            view.setAlpha(1.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            ViewPropertyAnimator animate = view.animate();
            animate.alpha(0.0f);
            animate.scaleX(0.0f);
            animate.scaleY(0.0f);
            animate.setDuration(200L);
            animate.start();
        }
    }

    /* renamed from: a */
    private void m6853a(boolean z) {
        View$OnClickListenerC1990e m6877a;
        C2106s c2106s;
        if (!this.f6361J && (m6877a = m6877a(this.f6363b.getCurrentItem())) != null && (c2106s = m6877a.f6471o) != null && c2106s.m6402s() != null) {
            this.f6361J = true;
            m6855a(c2106s, (C1848k) null, "8");
            this.f6382u.post(new Runnable() { // from class: com.tsf.extend.wallpaper.WallpaperDetail.9
                @Override // java.lang.Runnable
                public void run() {
                    File file = new File(WallpaperDetail.this.getContext().getFilesDir(), "preview3d.wpp");
                    if (!file.exists()) {
                        WallpaperDetail.this.f6361J = false;
                        return;
                    }
                    final Bitmap bitmap = null;
                    try {
                        bitmap = BitmapFactory.decodeFile(file.getAbsolutePath());
                    } catch (Throwable th) {
                    }
                    if (bitmap == null) {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inSampleSize = 2;
                        try {
                            bitmap = BitmapFactory.decodeFile(file.getAbsolutePath(), options);
                        } catch (Throwable th2) {
                        }
                    }
                    if (bitmap == null) {
                        WallpaperDetail.this.f6361J = false;
                    } else {
                        C1455z.m8564a(0, new Runnable() { // from class: com.tsf.extend.wallpaper.WallpaperDetail.9.1
                            @Override // java.lang.Runnable
                            public void run() {
                                int m8619b = (C1437p.m8619b() - ((bitmap.getWidth() <= C1437p.m8619b() / 2 ? 2 : 1) * bitmap.getWidth())) / 2;
                                if (m8619b < 0) {
                                    m8619b = 0;
                                }
                                WallpaperDetail.this.f6369h.setPadding(m8619b, 0, m8619b, 0);
                                WallpaperDetail.this.f6369h.setImageBitmap(bitmap);
                                WallpaperDetail.this.m6852b(WallpaperDetail.this.f6369h);
                                WallpaperDetail.this.setBtnVisibilityForPreview(true);
                                WallpaperDetail.this.f6363b.getCurrentItem();
                                int size = WallpaperDetail.this.f6366e.size();
                                for (int i = 0; i < size; i++) {
                                    View$OnClickListenerC1990e view$OnClickListenerC1990e = (View$OnClickListenerC1990e) WallpaperDetail.this.f6366e.get(i);
                                    if (view$OnClickListenerC1990e != null) {
                                        view$OnClickListenerC1990e.m6788a(true);
                                        view$OnClickListenerC1990e.m6774f();
                                    }
                                }
                                WallpaperDetail.this.f6376o = true;
                                WallpaperDetail.this.f6361J = false;
                            }
                        });
                    }
                }
            });
        }
    }

    public void setBtnVisibilityForPreview(boolean z) {
        int i = z ? 8 : 0;
        this.f6368g.setVisibility(i);
        this.f6354C.setVisibility(i);
        if (z && this.f6353B.getVisibility() == 0) {
            this.f6353B.setVisibility(4);
        } else if (!z && this.f6353B.getVisibility() == 4) {
            this.f6353B.setVisibility(0);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        View$OnClickListenerC1990e m6877a;
        RunnableC1987c runnableC1987c;
        View$OnClickListenerC1990e m6877a2 = m6877a(this.f6363b.getCurrentItem());
        int id = view.getId();
        if (id == C1536f.C1541e.wallpaper_bigtype_preview || id == C1536f.C1541e.preview) {
            m6853a(true);
        } else if (id == C1536f.C1541e.go_to_list || id == C1536f.C1541e.view_pager) {
            this.f6367f.onBackPressed();
        } else if (id == C1536f.C1541e.wallpaper_bigtype_set_wallpaper || id == C1536f.C1541e.set_wallpaper) {
            if (this.f6367f.m6974g()) {
                Toast.makeText(getContext(), C1536f.C1543g.theme_current_no_set_wallpaper, 0).show();
                this.f6367f.finish();
            } else if (this.f6377p == 0 && (m6877a = m6877a(this.f6363b.getCurrentItem())) != null) {
                m6855a(m6877a.f6471o, (C1848k) null, "2");
                this.f6363b.setCanDrage(false);
                this.f6373l.setVisibility(0);
                m6877a2.f6463g.setClickable(false);
                m6877a2.f6429B.setClickable(false);
                m6877a2.f6464h.setClickable(false);
                m6877a2.f6430C.setClickable(false);
                if ((m6877a.f6471o instanceof C2070g) && ((C2070g) m6877a.f6471o).m6520d()) {
                    runnableC1987c = new RunnableC1987c(m6877a, ((C2070g) m6877a.f6471o).m6519e());
                } else {
                    Bitmap m6402s = m6877a.f6471o.m6402s();
                    if (m6402s == null) {
                        m6872a(m6877a, false);
                        return;
                    }
                    runnableC1987c = new RunnableC1987c(m6877a, m6402s);
                }
                m6818o();
                C1455z.m8564a(2, runnableC1987c);
            }
        } else if (id == C1536f.C1541e.wallpaper_bigtype_retry || id == C1536f.C1541e.retry) {
            m6877a2.f6475s.setVisibility(0);
            m6877a2.f6436I.setVisibility(0);
            m6877a2.m6784b(false);
            m6873a(m6877a2);
        } else if (id == C1536f.C1541e.wallpaper_bigtype_delete || id == C1536f.C1541e.delete) {
            m6855a(m6877a(this.f6363b.getCurrentItem()).f6471o, (C1848k) null, "5");
            m6830i();
        } else if (id == C1536f.C1541e.wallpaper_bigtype_favorite || id == C1536f.C1541e.favorite) {
            View$OnClickListenerC1990e m6877a3 = m6877a(this.f6363b.getCurrentItem());
            C2106s c2106s = m6877a3.f6471o;
            if (!(c2106s instanceof C2070g)) {
                C2094m c2094m = (C2094m) c2106s;
                if (this.f6385x.m6686a((C2094m) m6877a3.f6471o)) {
                    m6837c(c2094m);
                } else {
                    m6845b(c2094m);
                }
            }
        } else if (id == C1536f.C1541e.switch_scale) {
            m6844b(true);
        } else if (id == C1536f.C1541e.wallpaper_bigtype_layout && this.f6376o) {
            this.f6376o = false;
            setBtnVisibilityForPreview(false);
            m6843c(this.f6369h);
            int size = this.f6366e.size();
            for (int i = 0; i < size; i++) {
                View$OnClickListenerC1990e view$OnClickListenerC1990e = this.f6366e.get(i);
                view$OnClickListenerC1990e.m6772g();
                view$OnClickListenerC1990e.m6788a(false);
                if (view$OnClickListenerC1990e.f6477u == this.f6363b.getCurrentItem()) {
                    m6855a(view$OnClickListenerC1990e.f6471o, (C1848k) null, "4");
                }
            }
        }
    }

    /* renamed from: b */
    private void m6844b(boolean z) {
        WallpaperImageView wallpaperImageView;
        View$OnClickListenerC1990e m6877a = m6877a(this.f6363b.getCurrentItem());
        if (m6877a != null && (wallpaperImageView = m6877a.f6474r) != null && !wallpaperImageView.m6745c()) {
            this.f6352A = !this.f6352A;
            for (View$OnClickListenerC1990e view$OnClickListenerC1990e : this.f6366e) {
                view$OnClickListenerC1990e.m6780c(this.f6352A);
            }
            this.f6353B.setVisibility(this.f6352A ? 0 : 8);
            this.f6354C.setSelected(this.f6352A);
            C1413a.m8754a().m8751a(this.f6352A);
            m6855a(m6877a.f6471o, (C1848k) null, z ? "9" : "10");
        }
    }

    /* renamed from: b */
    private void m6845b(C2094m c2094m) {
        this.f6385x.m6680b(c2094m, this);
        m6855a(c2094m, (C1848k) null, "6");
    }

    /* renamed from: c */
    private void m6837c(C2094m c2094m) {
        this.f6385x.m6685a(c2094m, this);
        m6855a(c2094m, (C1848k) null, "7");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m6855a(C2106s c2106s, C1848k c1848k, String str) {
        C2094m c2094m = null;
        if (c2106s instanceof C2094m) {
            c2094m = (C2094m) c2106s;
        }
        if (c2094m != null) {
            c2094m.m6431h();
            c2094m.m6428k();
            c2106s.m6402s();
        }
        if ("12".equals(str) && c1848k != null) {
            c1848k.m7300g();
        }
    }

    /* renamed from: i */
    private void m6830i() {
        m6828j();
        this.f6379r = new DialogInterfaceC1526e.C1532a(getContext()).m8301a(C1536f.C1543g.delete_wallaper).m8298b(C1536f.C1543g.setting_unset_default_dialog_cancel, this).m8300a(C1536f.C1543g.setting_unset_default_dialog_ok, this).m8302a();
        this.f6379r.setOnDismissListener(this);
        this.f6379r.m8314a(true);
    }

    /* renamed from: j */
    private void m6828j() {
        if (this.f6379r != null) {
            this.f6379r.dismiss();
            this.f6379r = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m6872a(final View$OnClickListenerC1990e view$OnClickListenerC1990e, final boolean z) {
        if (z && (view$OnClickListenerC1990e.f6471o instanceof C2070g) && ((C2070g) view$OnClickListenerC1990e.f6471o).m6520d()) {
            C1696ao.m7774b().m7779a(((C2070g) view$OnClickListenerC1990e.f6471o).m6519e());
        }
        m6851b(view$OnClickListenerC1990e, z);
        C2148z.m6199h().m6220a(view$OnClickListenerC1990e.m6783c());
        if (z) {
        }
        C1455z.m8563a(0, new Runnable() { // from class: com.tsf.extend.wallpaper.WallpaperDetail.10
            @Override // java.lang.Runnable
            public void run() {
                WallpaperDetail.this.f6373l.setVisibility(8);
                WallpaperDetail.this.f6363b.setCanDrage(true);
                view$OnClickListenerC1990e.f6464h.setClickable(!z);
                view$OnClickListenerC1990e.f6430C.setClickable(!z);
                view$OnClickListenerC1990e.f6463g.setClickable(!z);
                view$OnClickListenerC1990e.f6429B.setClickable(!z);
                Toast.makeText(WallpaperDetail.this.f6367f, z ? C1536f.C1543g.wallpaper_set_suc : C1536f.C1543g.wallpaper_set_fail, 1).show();
                if (z) {
                    C1455z.m8563a(0, new Runnable() { // from class: com.tsf.extend.wallpaper.WallpaperDetail.10.1
                        @Override // java.lang.Runnable
                        public void run() {
                            WallpaperDetail.this.f6367f.sendBroadcast(new Intent("com.ksmobile.launcher.FINISH_WALLPAPER_SETTING_ACTIVITY"));
                        }
                    }, 500L);
                }
            }
        }, 0L);
    }

    /* renamed from: b */
    private void m6851b(View$OnClickListenerC1990e view$OnClickListenerC1990e, boolean z) {
        if (view$OnClickListenerC1990e != null) {
            if (z) {
            }
            if (view$OnClickListenerC1990e.f6471o instanceof C2094m) {
                ((C2094m) view$OnClickListenerC1990e.f6471o).m6428k();
            }
        }
    }

    private void setFavoriteBtnVisible(boolean z) {
        int i = z ? 0 : 8;
        View$OnClickListenerC1990e m6877a = m6877a(this.f6363b.getCurrentItem());
        if (m6877a != null) {
            m6877a.f6465i.setVisibility(i);
            m6877a.f6431D.setVisibility(i);
        }
    }

    @Override // com.tsf.extend.wallpaper.TabViewPager.InterfaceC1959a
    /* renamed from: a */
    public void mo6874a(View view) {
    }

    /* renamed from: a */
    public void m6854a(List<? extends C2106s> list, C2106s c2106s, boolean z) {
        this.f6364c = list;
        this.f6380s = z;
        this.f6363b.setCurrentItem(list.indexOf(c2106s));
        this.f6370i.m8498c();
        this.f6355D = list.indexOf(c2106s);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m6875a(Pair<C2094m.C2095a, Bitmap> pair) {
        if (pair != null && !TextUtils.isEmpty(((C2094m.C2095a) pair.first).f6861a)) {
            for (View$OnClickListenerC1990e view$OnClickListenerC1990e : this.f6366e) {
                if (((C2094m.C2095a) pair.first).f6861a.equals(view$OnClickListenerC1990e.m6802a())) {
                    view$OnClickListenerC1990e.f6474r.setSrcBitmap((Bitmap) pair.second);
                    view$OnClickListenerC1990e.f6439L.setSrcBitmap((Bitmap) pair.second);
                    view$OnClickListenerC1990e.f6471o.m6404b((Bitmap) pair.second);
                    view$OnClickListenerC1990e.f6475s.setVisibility(8);
                    view$OnClickListenerC1990e.f6436I.setVisibility(8);
                    view$OnClickListenerC1990e.f6473q.setVisibility(8);
                    view$OnClickListenerC1990e.f6438K.setVisibility(8);
                    if (pair.second != null) {
                        setButtonEnableStatus(view$OnClickListenerC1990e);
                        setFavoriteBtnStatus(view$OnClickListenerC1990e);
                        setScaleStatus(view$OnClickListenerC1990e);
                    }
                    if (pair.second == null) {
                        view$OnClickListenerC1990e.m6784b(true);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public boolean m6826k() {
        return this.f6376o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.tsf.extend.wallpaper.WallpaperDetail$a */
    /* loaded from: classes.dex */
    public class C1985a implements AbstractC1386a.InterfaceC1396a<Pair<C2094m.C2095a, Bitmap>> {
        private C1985a() {
        }

        @Override // com.tsf.extend.base.p074d.AbstractC1386a.InterfaceC1396a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo6245a(JSONObject jSONObject, Pair<C2094m.C2095a, Bitmap> pair) {
            WallpaperDetail.this.m6875a(pair);
        }

        @Override // com.tsf.extend.base.p074d.AbstractC1386a.InterfaceC1396a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo6247a(JSONObject jSONObject, int i, Pair<C2094m.C2095a, Bitmap> pair) {
            WallpaperDetail.this.m6875a(pair);
            if (C1449u.m8589a(WallpaperDetail.this.getContext())) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setButtonEnableStatus(View$OnClickListenerC1990e view$OnClickListenerC1990e) {
        C2106s c2106s;
        boolean z = true;
        if (view$OnClickListenerC1990e != null && (c2106s = view$OnClickListenerC1990e.f6471o) != null) {
            boolean z2 = c2106s.m6402s() != null;
            view$OnClickListenerC1990e.f6463g.setEnabled(z2);
            if (Build.VERSION.SDK_INT >= 11) {
                view$OnClickListenerC1990e.f6463g.setAlpha(z2 ? 1.0f : 0.2f);
            }
            view$OnClickListenerC1990e.f6429B.setEnabled(z2);
            if (Build.VERSION.SDK_INT >= 11) {
                view$OnClickListenerC1990e.f6429B.setAlpha(z2 ? 1.0f : 0.2f);
            }
            view$OnClickListenerC1990e.f6464h.setEnabled(z2);
            view$OnClickListenerC1990e.f6430C.setEnabled(z2);
            if (c2106s instanceof C2070g) {
                boolean m6521c = ((C2070g) c2106s).m6521c();
                if (!z2 || m6521c) {
                    z = false;
                }
                m6842c(view$OnClickListenerC1990e, z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m6842c(View$OnClickListenerC1990e view$OnClickListenerC1990e, boolean z) {
        if (view$OnClickListenerC1990e != null) {
            view$OnClickListenerC1990e.f6466j.setEnabled(z);
            if (Build.VERSION.SDK_INT >= 11) {
                view$OnClickListenerC1990e.f6466j.setAlpha(z ? 1.0f : 0.2f);
            }
            view$OnClickListenerC1990e.f6432E.setEnabled(z);
            if (Build.VERSION.SDK_INT >= 11) {
                view$OnClickListenerC1990e.f6432E.setAlpha(z ? 1.0f : 0.2f);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScaleStatus(View$OnClickListenerC1990e view$OnClickListenerC1990e) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFavoriteBtnStatus(View$OnClickListenerC1990e view$OnClickListenerC1990e) {
        boolean z;
        if (view$OnClickListenerC1990e != null) {
            C2106s c2106s = view$OnClickListenerC1990e.f6471o;
            if (c2106s instanceof C2094m) {
                C2094m c2094m = (C2094m) c2106s;
                if (!this.f6387z) {
                    z = false;
                } else {
                    boolean m6686a = this.f6385x.m6686a(c2094m);
                    if (c2094m.m6403r() == null && c2094m.m6402s() == null && !m6686a) {
                        z = false;
                    } else {
                        z = true;
                    }
                    view$OnClickListenerC1990e.f6465i.setSelected(m6686a);
                    view$OnClickListenerC1990e.f6431D.setSelected(m6686a);
                }
                view$OnClickListenerC1990e.f6465i.setEnabled(z);
                if (Build.VERSION.SDK_INT >= 11) {
                    view$OnClickListenerC1990e.f6465i.setAlpha(z ? 1.0f : 0.2f);
                }
                view$OnClickListenerC1990e.f6431D.setEnabled(z);
                if (Build.VERSION.SDK_INT >= 11) {
                    view$OnClickListenerC1990e.f6431D.setAlpha(z ? 1.0f : 0.2f);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public void m6824l() {
        for (View$OnClickListenerC1990e view$OnClickListenerC1990e : this.f6366e) {
            setFavoriteBtnStatus(view$OnClickListenerC1990e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public boolean m6822m() {
        System.currentTimeMillis();
        return C1449u.m8588b(getContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.tsf.extend.wallpaper.WallpaperDetail$d */
    /* loaded from: classes.dex */
    public class C1989d implements AbstractC1386a.InterfaceC1396a<Pair<String, Bitmap>> {
        private C1989d() {
        }

        @Override // com.tsf.extend.base.p074d.AbstractC1386a.InterfaceC1396a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo6245a(JSONObject jSONObject, Pair<String, Bitmap> pair) {
            m6805a(pair);
        }

        /* renamed from: a */
        private void m6805a(Pair<String, Bitmap> pair) {
            if (pair != null) {
                String str = (String) pair.first;
                if (!TextUtils.isEmpty(str)) {
                    Iterator it = WallpaperDetail.this.f6364c.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C2106s c2106s = (C2106s) it.next();
                        if ((c2106s instanceof C2094m) && str.equals(((C2094m) c2106s).m6430i())) {
                            c2106s.m6405a((Bitmap) pair.second);
                            break;
                        }
                    }
                    for (View$OnClickListenerC1990e view$OnClickListenerC1990e : WallpaperDetail.this.f6366e) {
                        if (str.equals(view$OnClickListenerC1990e.m6787b())) {
                            view$OnClickListenerC1990e.f6474r.setTempBitmap((Bitmap) pair.second);
                            view$OnClickListenerC1990e.f6439L.setTempBitmap((Bitmap) pair.second);
                            WallpaperDetail.this.setFavoriteBtnStatus(view$OnClickListenerC1990e);
                            WallpaperDetail.this.setScaleStatus(view$OnClickListenerC1990e);
                        }
                    }
                }
            }
        }

        @Override // com.tsf.extend.base.p074d.AbstractC1386a.InterfaceC1396a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo6247a(JSONObject jSONObject, int i, Pair<String, Bitmap> pair) {
            m6805a(pair);
        }
    }

    @Override // com.tsf.extend.wallpaper.p085a.C2021a.InterfaceC2024b
    /* renamed from: g */
    public void mo6700g() {
        View$OnClickListenerC1990e m6877a;
        if (!this.f6359H) {
            long currentTimeMillis = System.currentTimeMillis();
            if ((this.f6362a <= 0 || currentTimeMillis - this.f6362a > 2000) && (m6877a = m6877a(this.f6363b.getCurrentItem())) != null) {
                m6872a(m6877a, true);
            }
            this.f6362a = currentTimeMillis;
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        if (dialogInterface == this.f6379r) {
            switch (i) {
                case ItemInfo.NO_ID /* -1 */:
                    final int currentItem = this.f6363b.getCurrentItem();
                    final View$OnClickListenerC1990e m6877a = m6877a(currentItem);
                    if (m6877a != null && (m6877a.f6471o instanceof C2070g)) {
                        C2077i.m6486a().m6482a(new C2077i.InterfaceC2081a() { // from class: com.tsf.extend.wallpaper.WallpaperDetail.11
                            @Override // com.tsf.extend.wallpaper.C2077i.InterfaceC2081a
                            /* renamed from: a */
                            public void mo6477a(C2077i.InterfaceC2081a.EnumC2082a enumC2082a, Object obj, final C2077i.InterfaceC2081a.EnumC2083b enumC2083b) {
                                C1455z.m8564a(0, new Runnable() { // from class: com.tsf.extend.wallpaper.WallpaperDetail.11.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        Toast.makeText(WallpaperDetail.this.f6367f, enumC2083b == C2077i.InterfaceC2081a.EnumC2083b.suc ? C1536f.C1543g.delete_wallpaper_suc : C1536f.C1543g.delete_wallpaper_fail, 1).show();
                                        if (enumC2083b == C2077i.InterfaceC2081a.EnumC2083b.suc && WallpaperDetail.this.f6383v != null) {
                                            WallpaperDetail.this.f6364c.remove(m6877a.f6471o);
                                            WallpaperDetail.this.f6370i = new C2000f();
                                            WallpaperDetail.this.f6366e.clear();
                                            WallpaperDetail.this.f6363b.setAdapter(WallpaperDetail.this.f6370i);
                                            int i2 = currentItem;
                                            if (currentItem >= WallpaperDetail.this.f6364c.size()) {
                                                i2 = WallpaperDetail.this.f6364c.size() - 1;
                                            }
                                            if (i2 == 0) {
                                                WallpaperDetail.this.m6842c(m6877a, false);
                                            }
                                            WallpaperDetail.this.f6363b.setCurrentItem(i2);
                                            WallpaperDetail.this.f6383v.mo6518a();
                                        }
                                    }
                                });
                            }
                        }, (C2070g) m6877a.f6471o);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (dialogInterface == this.f6379r) {
            this.f6379r = null;
        }
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.InterfaceC1352a
    public boolean getPendingTransition() {
        return false;
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.InterfaceC1352a
    /* renamed from: a */
    public void mo6536a() {
        this.f6359H = false;
        this.f6363b.setCanDrage(true);
        this.f6367f.m6983b(true);
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.InterfaceC1352a
    /* renamed from: b */
    public void mo6532b() {
        this.f6359H = true;
        this.f6367f.m6983b(false);
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.InterfaceC1352a
    /* renamed from: f */
    public void mo6528f() {
    }

    @Override // com.tsf.extend.wallpaper.C2077i.InterfaceC2081a
    /* renamed from: a */
    public void mo6477a(final C2077i.InterfaceC2081a.EnumC2082a enumC2082a, final Object obj, final C2077i.InterfaceC2081a.EnumC2083b enumC2083b) {
        Runnable runnable = new Runnable() { // from class: com.tsf.extend.wallpaper.WallpaperDetail.12
            @Override // java.lang.Runnable
            public void run() {
                View$OnClickListenerC1990e m6856a;
                boolean z = enumC2083b == C2077i.InterfaceC2081a.EnumC2083b.suc;
                switch (C19795.f6409a[enumC2082a.ordinal()]) {
                    case 1:
                        C2094m c2094m = (C2094m) obj;
                        if (z && (m6856a = WallpaperDetail.this.m6856a((C2106s) c2094m)) != null) {
                            m6856a.f6465i.setSelected(true);
                            m6856a.f6431D.setSelected(true);
                            WallpaperDetail.this.m6820n();
                            return;
                        }
                        return;
                    case 2:
                        C2094m c2094m2 = (C2094m) obj;
                        if (z) {
                            if (WallpaperDetail.this.f6384w == EnumC2057ai.FavoriteType) {
                                int currentItem = WallpaperDetail.this.f6363b.getCurrentItem();
                                WallpaperDetail.this.f6364c.remove(c2094m2);
                                if (WallpaperDetail.this.f6364c.size() == 0) {
                                    WallpaperDetail.this.f6367f.onBackPressed();
                                    return;
                                }
                                WallpaperDetail.this.f6370i = new C2000f();
                                WallpaperDetail.this.f6366e.clear();
                                WallpaperDetail.this.f6363b.setAdapter(WallpaperDetail.this.f6370i);
                                WallpaperDetail.this.f6363b.setCurrentItem(currentItem >= WallpaperDetail.this.f6364c.size() ? WallpaperDetail.this.f6364c.size() - 1 : currentItem);
                                return;
                            }
                            View$OnClickListenerC1990e m6856a2 = WallpaperDetail.this.m6856a((C2106s) c2094m2);
                            if (m6856a2 != null) {
                                m6856a2.f6465i.setSelected(false);
                                m6856a2.f6431D.setSelected(false);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
        };
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            C1455z.m8564a(0, runnable);
        }
    }

    /* renamed from: com.tsf.extend.wallpaper.WallpaperDetail$5 */
    /* loaded from: classes.dex */
    static /* synthetic */ class C19795 {

        /* renamed from: a */
        static final /* synthetic */ int[] f6409a = new int[C2077i.InterfaceC2081a.EnumC2082a.values().length];

        static {
            try {
                f6409a[C2077i.InterfaceC2081a.EnumC2082a.save.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f6409a[C2077i.InterfaceC2081a.EnumC2082a.delete.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public void m6820n() {
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), C1536f.C1537a.wallpaper_favorite_anim_in);
        final Animation loadAnimation2 = AnimationUtils.loadAnimation(getContext(), C1536f.C1537a.wallpaper_favorite_anim_out);
        loadAnimation2.setAnimationListener(new Animation.AnimationListener() { // from class: com.tsf.extend.wallpaper.WallpaperDetail.13
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                WallpaperDetail.this.f6386y.setVisibility(8);
            }
        });
        final Runnable runnable = new Runnable() { // from class: com.tsf.extend.wallpaper.WallpaperDetail.2
            @Override // java.lang.Runnable
            public void run() {
                WallpaperDetail.this.f6386y.startAnimation(loadAnimation2);
            }
        };
        loadAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.tsf.extend.wallpaper.WallpaperDetail.3
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                C1455z.m8563a(0, runnable, 1000L);
            }
        });
        this.f6386y.setVisibility(0);
        this.f6386y.startAnimation(loadAnimation);
    }

    @Override // com.tsf.extend.wallpaper.C2026aa.InterfaceC2034a
    /* renamed from: h */
    public void mo6669h() {
        C1455z.m8564a(0, new Runnable() { // from class: com.tsf.extend.wallpaper.WallpaperDetail.4
            @Override // java.lang.Runnable
            public void run() {
                WallpaperDetail.this.f6387z = true;
                WallpaperDetail.this.m6824l();
            }
        });
    }

    @Override // com.tsf.extend.wallpaper.WallpaperImageView.InterfaceC2010a
    /* renamed from: a */
    public void mo6744a(WallpaperImageView wallpaperImageView) {
        m6844b(false);
    }

    @Override // com.tsf.extend.wallpaper.WallpaperImageView.InterfaceC2010a
    /* renamed from: b */
    public void mo6743b(WallpaperImageView wallpaperImageView) {
        m6853a(false);
    }

    @Override // com.tsf.extend.wallpaper.HorzontalSliderView.InterfaceC1931a
    /* renamed from: a */
    public void mo6878a(float f, boolean z) {
        View$OnClickListenerC1990e m6877a = m6877a(this.f6363b.getCurrentItem());
        if (m6877a != null) {
            m6877a.f6474r.m6751a(f, z);
            m6877a.f6439L.m6751a(f, z);
        }
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.InterfaceC1352a
    /* renamed from: d */
    public void mo6530d() {
    }

    /* renamed from: o */
    private void m6818o() {
        if (getContext() != null && this.f6358G == null) {
            this.f6358G = new C2005g();
            getContext().getApplicationContext().registerReceiver(this.f6358G, new IntentFilter("com.ksmobile.launcher.FINISH_WALLPAPER_SETTING_ACTIVITY"));
        }
    }

    /* renamed from: p */
    private void m6816p() {
        if (getContext() != null && this.f6358G != null) {
            try {
                getContext().getApplicationContext().unregisterReceiver(this.f6358G);
            } catch (Exception e) {
            } finally {
                this.f6358G = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.tsf.extend.wallpaper.WallpaperDetail$g */
    /* loaded from: classes.dex */
    public class C2005g extends BroadcastReceiver {
        private C2005g() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            C1455z.m8563a(0, new Runnable() { // from class: com.tsf.extend.wallpaper.WallpaperDetail.g.1
                @Override // java.lang.Runnable
                public void run() {
                    WallpaperDetail.this.f6367f.finish();
                }
            }, 100L);
        }
    }

    /* renamed from: com.tsf.extend.wallpaper.WallpaperDetail$c */
    /* loaded from: classes.dex */
    private class RunnableC1987c implements Runnable {

        /* renamed from: b */
        private View$OnClickListenerC1990e f6423b;

        /* renamed from: c */
        private Bitmap f6424c;

        /* renamed from: d */
        private int f6425d;

        RunnableC1987c(View$OnClickListenerC1990e view$OnClickListenerC1990e, Bitmap bitmap) {
            this.f6425d = -1;
            this.f6423b = view$OnClickListenerC1990e;
            this.f6424c = bitmap;
        }

        RunnableC1987c(View$OnClickListenerC1990e view$OnClickListenerC1990e, int i) {
            this.f6425d = -1;
            this.f6423b = view$OnClickListenerC1990e;
            this.f6425d = i;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
            	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
            	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
            */
        @Override // java.lang.Runnable
        public void run() {
            /*
                Method dump skipped, instructions count: 311
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tsf.extend.wallpaper.WallpaperDetail.RunnableC1987c.run():void");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public View$OnClickListenerC1990e m6856a(C2106s c2106s) {
        for (View$OnClickListenerC1990e view$OnClickListenerC1990e : this.f6366e) {
            if (c2106s instanceof C2094m) {
                if (view$OnClickListenerC1990e.m6783c() == ((C2094m) c2106s).m6431h()) {
                    return view$OnClickListenerC1990e;
                }
            }
        }
        return null;
    }
}
