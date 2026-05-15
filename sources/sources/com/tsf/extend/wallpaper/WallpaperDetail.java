package com.tsf.extend.wallpaper;

import android.R;
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
import com.tsf.extend.base.actstru.model.activi.PageActivity;
import com.tsf.extend.base.d.a;
import com.tsf.extend.base.support.ViewPager;
import com.tsf.extend.base.widget.pulltorefresh.PullToRefreshAndLoadMoreListView;
import com.tsf.extend.base.widget.pulltorefresh.PullToRefreshBase;
import com.tsf.extend.e;
import com.tsf.extend.f;
import com.tsf.extend.theme.ThemeDetail;
import com.tsf.extend.theme.ThemePullToRefreshListView;
import com.tsf.extend.theme.ao;
import com.tsf.extend.theme.aq;
import com.tsf.extend.theme.t;
import com.tsf.extend.wallpaper.HorzontalSliderView;
import com.tsf.extend.wallpaper.TabViewPager;
import com.tsf.extend.wallpaper.WallpaperImageView;
import com.tsf.extend.wallpaper.a.a;
import com.tsf.extend.wallpaper.aa;
import com.tsf.extend.wallpaper.i;
import com.tsf.extend.wallpaper.m;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class WallpaperDetail extends FrameLayout implements DialogInterface.OnClickListener, DialogInterface.OnDismissListener, View.OnClickListener, PageActivity.a, HorzontalSliderView.a, TabViewPager.a, WallpaperImageView.a, a.b, aa.a, i.a {
    private boolean A;
    private HorzontalSliderView B;
    private ImageView C;
    private int D;
    private long E;
    private float F;
    private g G;
    private boolean H;
    private String I;
    private boolean J;
    private long a;
    private TabViewPager b;
    private List<? extends s> c;
    private LayoutInflater d;
    private List<e> e;
    private PersonalizationActivity f;
    private ImageView g;
    private ImageView h;
    private f i;
    private a j;
    private Bundle k;
    private View l;
    private ProgressBar m;
    private d n;
    private boolean o;
    private int p;
    private WallpaperManager q;
    private com.tsf.extend.e r;
    private boolean s;
    private boolean t;
    private Handler u;
    private b v;
    private ai w;
    private aa x;
    private View y;
    private boolean z;

    public interface b {
        void a();
    }

    public void setType(ai aiVar) {
        this.w = aiVar;
    }

    public void setOnDeleteListener(b bVar) {
        this.v = bVar;
    }

    public WallpaperDetail(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.k = new Bundle();
        this.p = 0;
        this.r = null;
        this.s = false;
        this.t = false;
        this.z = false;
        this.A = false;
        this.E = 0L;
        this.H = false;
        this.J = false;
        HandlerThread handlerThread = new HandlerThread("preview img loader");
        handlerThread.start();
        this.u = new Handler(handlerThread.getLooper());
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        setPadding(0, 0, 0, com.tsf.extend.base.j.p.c(getContext()));
        this.q = WallpaperManager.getInstance(getContext());
        this.x = aa.a();
        this.j = new a();
        this.e = Lists.newArrayList();
        this.d = LayoutInflater.from(getContext());
        this.g = (ImageView) findViewById(f.e.go_to_list);
        this.C = (ImageView) findViewById(f.e.switch_scale);
        this.B = (HorzontalSliderView) findViewById(f.e.slider);
        this.B.setSliderChangeListener(this);
        this.n = new d();
        this.l = findViewById(f.e.setting_wallpaper);
        this.m = (ProgressBar) findViewById(f.e.setting_wallpaper_progress);
        this.m = (ProgressBar) findViewById(f.e.setting_wallpaper_progress);
        this.m.setIndeterminateDrawable(new com.tsf.extend.base.widget.pulltorefresh.d(getContext(), 3));
        this.g.setImageDrawable(new com.tsf.extend.base.widget.pulltorefresh.e(new BitmapDrawable(getResources(), BitmapFactory.decodeResource(getResources(), f.d.actionbar_back)), new int[]{-1, -7829368}, new PorterDuff.Mode[]{PorterDuff.Mode.SRC_IN, PorterDuff.Mode.SRC_IN}));
        this.h = (ImageView) findViewById(f.e.launcher_preview);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.h.getLayoutParams();
        layoutParams.bottomMargin = -com.tsf.extend.base.j.p.c(getContext());
        this.h.setLayoutParams(layoutParams);
        this.h.setVisibility(8);
        this.g.setOnClickListener(this);
        this.C.setOnClickListener(this);
        this.c = Lists.newArrayList();
        this.b = (TabViewPager) findViewById(f.e.view_pager);
        this.b.setOnPageChangeListener(new ViewPager.e() { // from class: com.tsf.extend.wallpaper.WallpaperDetail.1
            private int b = 0;

            @Override // com.tsf.extend.base.support.ViewPager.e
            public void a(int i) {
                m mVar;
                this.b = i;
                if (WallpaperDetail.this.D != WallpaperDetail.this.b.getCurrentItem()) {
                    e eVarA = WallpaperDetail.this.a(WallpaperDetail.this.b.getCurrentItem());
                    if (eVarA != null) {
                        s sVar = eVarA.o;
                        if (!(sVar instanceof m)) {
                            mVar = null;
                        } else {
                            mVar = (m) sVar;
                        }
                        WallpaperDetail.this.a(mVar);
                    }
                    WallpaperDetail.this.D = WallpaperDetail.this.b.getCurrentItem();
                }
                WallpaperDetail.this.a(WallpaperDetail.this.b.getCurrentItem());
            }

            @Override // com.tsf.extend.base.support.ViewPager.e
            public void a(int i, float f2, int i2) {
            }

            @Override // com.tsf.extend.base.support.ViewPager.e
            public void b(int i) {
                WallpaperDetail.this.p = i;
                if (i == 0) {
                }
            }
        });
        this.i = new f();
        this.b.setAdapter(this.i);
        this.b.setOnClickListener(this);
        this.b.setOnTabListener(this);
        this.z = this.x.c();
        this.x.a((aa.a) this);
        this.y = findViewById(f.e.favorite_anim);
        this.y.setOnTouchListener(new View.OnTouchListener() { // from class: com.tsf.extend.wallpaper.WallpaperDetail.6
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });
        this.B.setVisibility(this.A ? 0 : 8);
        this.C.setSelected(this.A);
        this.F = com.tsf.extend.base.j.i.d();
    }

    private String getReportTab() {
        if (this.s) {
            return "3";
        }
        if (this.w != null) {
            return String.valueOf(this.w.a());
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(m mVar) {
        if (k()) {
        }
        if (mVar != null) {
            mVar.h();
            mVar.k();
            if (mVar.n()) {
                String[] strArrSplit = mVar.m().split("id=");
                if (strArrSplit.length >= 2) {
                    String str = strArrSplit[1];
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public e a(int i) {
        for (e eVar : this.e) {
            if (eVar.u == i) {
                return eVar;
            }
        }
        return null;
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.a
    public View getContent() {
        return this;
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.a
    public void a(PageActivity pageActivity) {
        if (pageActivity instanceof PersonalizationActivity) {
            this.f = (PersonalizationActivity) pageActivity;
            this.f.b(true);
            if (this.I == null) {
                this.I = this.f.getIntent().getStringExtra("inlet");
            }
        }
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.a
    public Bundle getResult() {
        return this.k;
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.a
    public void c() {
        j();
        p();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.tsf.extend.wallpaper.a.a.a(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.tsf.extend.wallpaper.a.a.b(this);
        aa.a().d();
        z.h().a((List<WeakReference<e>>) null);
        if (this.e != null) {
            Iterator<e> it = this.e.iterator();
            while (it.hasNext()) {
                it.next().d();
            }
        }
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.a
    public boolean e() {
        if (this.l.getVisibility() == 0) {
            return true;
        }
        e eVarA = a(this.b.getCurrentItem());
        if (eVarA == null) {
            return false;
        }
        m mVar = (m) eVarA.o;
        if (this.o) {
            this.o = false;
            setBtnVisibilityForPreview(false);
            c(this.h);
            int size = this.e.size();
            for (int i = 0; i < size; i++) {
                e eVar = this.e.get(i);
                if (eVar != null) {
                    eVar.g();
                    eVar.a(false);
                }
            }
            a(mVar, (com.tsf.extend.theme.k) null, "4");
            return true;
        }
        if (this.A) {
            b(false);
            return true;
        }
        this.k.putInt("index", this.b.getCurrentItem());
        this.f.b(false);
        a(mVar, (com.tsf.extend.theme.k) null, "3");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final int i, final List<m.a> list) {
        com.tsf.extend.base.j.z.a(2, new Runnable() { // from class: com.tsf.extend.wallpaper.WallpaperDetail.7
            @Override // java.lang.Runnable
            public void run() {
                if (WallpaperDetail.this.m()) {
                    int i2 = 0;
                    while (true) {
                        int i3 = i2;
                        if (i3 < 3) {
                            int i4 = i + i3 + 1;
                            if (i4 < list.size()) {
                                WallpaperDetail.this.a((m.a) list.get(i4), (a.InterfaceC0048a<Pair<m.a, Bitmap>>) null, true);
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
    public void a(final m.a aVar, final a.InterfaceC0048a<Pair<m.a, Bitmap>> interfaceC0048a, final boolean z) {
        com.tsf.extend.base.j.z.a(0, new Runnable() { // from class: com.tsf.extend.wallpaper.WallpaperDetail.8
            @Override // java.lang.Runnable
            public void run() {
                z.h().a(new m.a(aVar.a, aVar.b), interfaceC0048a, z, com.tsf.extend.base.j.p.b(), com.tsf.extend.base.j.p.c());
            }
        });
    }

    private class f extends com.tsf.extend.base.support.a {
        private f() {
        }

        @Override // com.tsf.extend.base.support.a
        public int a() {
            if (WallpaperDetail.this.c == null) {
                return 0;
            }
            return WallpaperDetail.this.c.size();
        }

        private void a(e eVar, View view, s sVar) {
            boolean zC;
            boolean z = false;
            eVar.f = view.findViewById(f.e.controll_view);
            eVar.g = (ImageView) view.findViewById(f.e.preview);
            eVar.h = (TextView) view.findViewById(f.e.set_wallpaper);
            eVar.i = view.findViewById(f.e.favorite);
            eVar.j = view.findViewById(f.e.delete);
            com.tsf.extend.base.widget.pulltorefresh.e eVar2 = new com.tsf.extend.base.widget.pulltorefresh.e(WallpaperDetail.this.getResources().getDrawable(f.d.wallpaper_preview_btn));
            eVar.g.setImageDrawable(eVar2);
            eVar.B.setImageDrawable(eVar2);
            eVar.g.setOnClickListener(WallpaperDetail.this);
            eVar.B.setOnClickListener(WallpaperDetail.this);
            eVar.h.setText(WallpaperDetail.this.getResources().getString(f.g.set_as_wallpaper).toUpperCase());
            eVar.h.setOnClickListener(WallpaperDetail.this);
            eVar.C.setText(WallpaperDetail.this.getResources().getString(f.g.set_as_wallpaper).toUpperCase());
            eVar.C.setOnClickListener(WallpaperDetail.this);
            eVar.i.setOnClickListener(WallpaperDetail.this);
            eVar.D.setOnClickListener(WallpaperDetail.this);
            eVar.j.setOnClickListener(WallpaperDetail.this);
            eVar.E.setOnClickListener(WallpaperDetail.this);
            eVar.k = view.findViewById(f.e.expand_panel);
            eVar.l = (TextView) view.findViewById(f.e.author);
            if (sVar instanceof com.tsf.extend.wallpaper.g) {
                zC = ((com.tsf.extend.wallpaper.g) sVar).c();
            } else {
                a(eVar, sVar);
                zC = false;
            }
            if (WallpaperDetail.this.s) {
                a(eVar, false);
                if (!zC && !WallpaperDetail.this.t) {
                    z = true;
                }
                b(eVar, z);
                c(eVar, true);
            } else {
                c(eVar, false);
            }
            eVar.n = view.findViewById(f.e.wallpaper_layout);
        }

        private void a(e eVar, boolean z) {
            int i = z ? 0 : 8;
            eVar.i.setVisibility(i);
            eVar.D.setVisibility(i);
        }

        private void b(e eVar, boolean z) {
            eVar.j.setEnabled(z);
            if (Build.VERSION.SDK_INT >= 11) {
                eVar.j.setAlpha(z ? 1.0f : 0.2f);
            }
            eVar.E.setEnabled(z);
            if (Build.VERSION.SDK_INT >= 11) {
                eVar.E.setAlpha(z ? 1.0f : 0.2f);
            }
        }

        private void c(e eVar, boolean z) {
            int i = z ? 0 : 8;
            eVar.j.setVisibility(i);
            eVar.E.setVisibility(i);
        }

        private void a(e eVar, s sVar) {
            if (sVar != null && (sVar instanceof m) && WallpaperDetail.this.w != ai.FavoriteType) {
                m mVar = (m) sVar;
                eVar.m = mVar.q();
                if (!TextUtils.isEmpty(eVar.m) && mVar.p() > 0) {
                    eVar.k.setVisibility(0);
                    eVar.l.setVisibility(8);
                    eVar.G.setVisibility(0);
                    eVar.H.setVisibility(8);
                    return;
                }
                if (mVar.l() && !TextUtils.isEmpty(mVar.o())) {
                    eVar.k.setVisibility(0);
                    eVar.l.setVisibility(0);
                    eVar.l.setText(WallpaperDetail.this.getResources().getString(f.g.wallpaper_author_by) + mVar.o());
                    eVar.G.setVisibility(0);
                    eVar.H.setVisibility(0);
                    eVar.H.setText(WallpaperDetail.this.getResources().getString(f.g.wallpaper_author_by) + mVar.o());
                    eVar.l.setVisibility(0);
                    return;
                }
                eVar.k.setVisibility(8);
                eVar.l.setVisibility(8);
                eVar.G.setVisibility(8);
                eVar.H.setVisibility(8);
            }
        }

        private void b(e eVar, View view, s sVar) {
            eVar.z = view.findViewById(f.e.wallpaper_bigtype_layout);
            eVar.A = view.findViewById(f.e.wallpaper_bigtype_action_layout);
            eVar.B = (ImageView) view.findViewById(f.e.wallpaper_bigtype_preview);
            eVar.C = (TextView) view.findViewById(f.e.wallpaper_bigtype_set_wallpaper);
            eVar.D = (ImageView) view.findViewById(f.e.wallpaper_bigtype_favorite);
            eVar.E = (ImageView) view.findViewById(f.e.wallpaper_bigtype_delete);
            eVar.F = view.findViewById(f.e.wallpaper_bigtype_author_layout);
            eVar.G = view.findViewById(f.e.wallpaper_bigtype_expand_panel);
            eVar.H = (TextView) view.findViewById(f.e.wallpaper_bigtype_author);
            eVar.I = (ProgressBar) view.findViewById(f.e.wallpaper_bigtype_progresbar);
            eVar.I.setIndeterminateDrawable(new com.tsf.extend.base.widget.pulltorefresh.d(view.getContext(), 3));
            eVar.J = view.findViewById(f.e.wallpaper_bigtype_retry);
            eVar.J.setOnClickListener(WallpaperDetail.this);
            ((ImageView) eVar.J.findViewById(f.e.wallpaper_bigtype_refresh_icon)).setImageDrawable(new com.tsf.extend.base.widget.pulltorefresh.e(WallpaperDetail.this.getResources().getDrawable(f.d.icon_btn_refresh), new int[]{-1, 1728053247}, new PorterDuff.Mode[]{PorterDuff.Mode.SRC_IN, PorterDuff.Mode.SRC_IN}));
            eVar.K = (TextView) view.findViewById(f.e.wallpaper_bigtype_wallpaper_progress);
            eVar.L = (WallpaperImageView) view.findViewById(f.e.wallpaper_bigtype_img);
            eVar.L.setScaleType(WallpaperImageView.b.HeightFirst);
        }

        @Override // com.tsf.extend.base.support.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public View a(ViewGroup viewGroup, int i) {
            View viewInflate = WallpaperDetail.this.d.inflate(f.C0052f.wallpaper_detail_list, (ViewGroup) null);
            ThemePullToRefreshListView themePullToRefreshListView = (ThemePullToRefreshListView) viewInflate.findViewById(f.e.detail_list);
            View viewInflate2 = WallpaperDetail.this.d.inflate(f.C0052f.gallery_img_item, (ViewGroup) null);
            themePullToRefreshListView.getListView().addHeaderView(viewInflate2);
            s sVar = (s) WallpaperDetail.this.c.get(i);
            final e eVar = WallpaperDetail.this.new e();
            eVar.o = sVar;
            eVar.a = WallpaperDetail.this.getContext().getApplicationContext();
            eVar.b = (ViewGroup) viewInflate;
            eVar.c = themePullToRefreshListView;
            eVar.a(WallpaperDetail.this.getContext());
            b(eVar, viewInflate, sVar);
            eVar.p = (ViewGroup) viewInflate2;
            a(eVar, viewInflate2, sVar);
            eVar.r = (WallpaperImageView) viewInflate2.findViewById(f.e.img);
            eVar.t = viewInflate2.findViewById(f.e.wallpaper_layout);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) eVar.t.getLayoutParams();
            layoutParams.height = (int) (0.8f * WallpaperDetail.this.F);
            eVar.t.setLayoutParams(layoutParams);
            eVar.u = i;
            eVar.s = (ProgressBar) viewInflate2.findViewById(f.e.progresbar);
            eVar.v = viewInflate2.findViewById(f.e.retry);
            eVar.s.setIndeterminateDrawable(new com.tsf.extend.base.widget.pulltorefresh.d(viewInflate2.getContext(), 3));
            eVar.c(WallpaperDetail.this.A);
            if (WallpaperDetail.this.k()) {
                eVar.f();
            }
            eVar.r.setOnTapListener(WallpaperDetail.this);
            eVar.L.setOnTapListener(WallpaperDetail.this);
            eVar.z.setOnClickListener(WallpaperDetail.this);
            eVar.L.setTag(sVar);
            eVar.v.setOnClickListener(WallpaperDetail.this);
            eVar.q = (TextView) viewInflate2.findViewById(f.e.wallpaper_progress);
            eVar.a(WallpaperDetail.this.k());
            ((ImageView) eVar.v.findViewById(f.e.refresh_icon)).setImageDrawable(new com.tsf.extend.base.widget.pulltorefresh.e(WallpaperDetail.this.getResources().getDrawable(f.d.icon_btn_refresh), new int[]{-1, 1728053247}, new PorterDuff.Mode[]{PorterDuff.Mode.SRC_IN, PorterDuff.Mode.SRC_IN}));
            WallpaperDetail.this.e.add(eVar);
            viewInflate.setTag(eVar);
            viewGroup.addView(viewInflate);
            if (!WallpaperDetail.this.s) {
                if (!WallpaperDetail.this.a(eVar)) {
                    if (sVar.r() == null) {
                        if (sVar instanceof m) {
                            z.h().a(((m) sVar).i(), WallpaperDetail.this.n);
                        }
                    } else {
                        eVar.r.setTempBitmap(sVar.r());
                        eVar.L.setTempBitmap(sVar.r());
                    }
                    com.tsf.extend.base.j.z.a(0, new Runnable() { // from class: com.tsf.extend.wallpaper.WallpaperDetail.f.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (WallpaperDetail.this.e != null && WallpaperDetail.this.e.contains(eVar) && eVar.s.getVisibility() == 0) {
                                eVar.q.setVisibility(0);
                                eVar.q.setText(eVar.w + "%");
                            }
                        }
                    }, 500L);
                    com.tsf.extend.base.j.z.a(0, new Runnable() { // from class: com.tsf.extend.wallpaper.WallpaperDetail.f.2
                        @Override // java.lang.Runnable
                        public void run() {
                            if (WallpaperDetail.this.e != null && WallpaperDetail.this.e.contains(eVar) && eVar.I.getVisibility() == 0) {
                                eVar.K.setVisibility(0);
                                eVar.K.setText(eVar.w + "%");
                            }
                        }
                    }, 500L);
                }
                ArrayList arrayList = new ArrayList();
                for (s sVar2 : WallpaperDetail.this.c) {
                    if (sVar2 instanceof m) {
                        arrayList.add(new m.a(((m) sVar2).j(), ((m) sVar2).h()));
                    }
                }
                WallpaperDetail.this.a(i, arrayList);
            } else {
                Bitmap bitmapS = sVar.s();
                if (bitmapS != null) {
                    eVar.r.setSrcBitmap(bitmapS);
                    eVar.L.setSrcBitmap(bitmapS);
                    if (eVar.u == WallpaperDetail.this.b.getCurrentItem()) {
                    }
                    eVar.s.setVisibility(8);
                    eVar.I.setVisibility(8);
                    eVar.q.setVisibility(8);
                    eVar.K.setVisibility(8);
                    WallpaperDetail.this.setButtonEnableStatus(eVar);
                } else {
                    Bitmap bitmapR = sVar.r();
                    if (bitmapR != null) {
                        eVar.r.setTempBitmap(bitmapR);
                        eVar.L.setTempBitmap(bitmapR);
                    }
                    if (sVar instanceof com.tsf.extend.wallpaper.g) {
                        i.a().a(new i.a() { // from class: com.tsf.extend.wallpaper.WallpaperDetail.f.3
                            @Override // com.tsf.extend.wallpaper.i.a
                            public void a(i.a.EnumC0069a enumC0069a, Object obj, i.a.b bVar) {
                                if (bVar == i.a.b.suc && (obj instanceof Pair)) {
                                    final Pair pair = (Pair) obj;
                                    if (pair.second != null) {
                                        com.tsf.extend.base.j.z.a(0, new Runnable() { // from class: com.tsf.extend.wallpaper.WallpaperDetail.f.3.1
                                            @Override // java.lang.Runnable
                                            public void run() {
                                                eVar.o.b((Bitmap) pair.second);
                                                eVar.r.setSrcBitmap((Bitmap) pair.second);
                                                eVar.L.setSrcBitmap((Bitmap) pair.second);
                                                if (eVar.u == WallpaperDetail.this.b.getCurrentItem()) {
                                                }
                                                eVar.s.setVisibility(8);
                                                eVar.I.setVisibility(8);
                                                eVar.q.setVisibility(8);
                                                eVar.K.setVisibility(8);
                                                WallpaperDetail.this.setButtonEnableStatus(eVar);
                                            }
                                        });
                                    }
                                }
                            }
                        }, (com.tsf.extend.wallpaper.g) sVar, 0, true);
                    }
                }
            }
            WallpaperDetail.this.setFavoriteBtnStatus(eVar);
            WallpaperDetail.this.setButtonEnableStatus(eVar);
            WallpaperDetail.this.setScaleStatus(eVar);
            return viewInflate;
        }

        @Override // com.tsf.extend.base.support.a
        public void a(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
            e eVar = (e) ((View) obj).getTag();
            if (eVar != null) {
                WallpaperDetail.this.e.remove(eVar);
                eVar.d();
            }
            if (!WallpaperDetail.this.s && eVar != null) {
                ArrayList arrayListNewArrayList = Lists.newArrayList();
                s sVar = eVar.o;
                if (sVar instanceof m) {
                    arrayListNewArrayList.add(((m) sVar).i());
                    arrayListNewArrayList.add(((m) sVar).j());
                    z.h().b(arrayListNewArrayList);
                }
            }
        }

        @Override // com.tsf.extend.base.support.a
        public boolean a(View view, Object obj) {
            return view == obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(e eVar) {
        Bitmap bitmapS = eVar.o.s();
        if (bitmapS != null) {
            eVar.r.setSrcBitmap(bitmapS);
            eVar.L.setSrcBitmap(bitmapS);
            eVar.s.setVisibility(8);
            eVar.I.setVisibility(8);
            eVar.q.setVisibility(8);
            eVar.K.setVisibility(8);
            setButtonEnableStatus(eVar);
            setFavoriteBtnStatus(eVar);
            setScaleStatus(eVar);
            return true;
        }
        ArrayList arrayListNewArrayList = Lists.newArrayList();
        for (int i = 0; i < this.e.size(); i++) {
            arrayListNewArrayList.add(new WeakReference(this.e.get(i)));
        }
        z.h().a(arrayListNewArrayList);
        a(new m.a(eVar.a(), eVar.c()), (a.InterfaceC0048a<Pair<m.a, Bitmap>>) this.j, false);
        return false;
    }

    public class e implements View.OnClickListener {
        View A;
        ImageView B;
        TextView C;
        ImageView D;
        ImageView E;
        View F;
        View G;
        TextView H;
        ProgressBar I;
        View J;
        TextView K;
        WallpaperImageView L;
        private View R;
        private View S;
        private ProgressBar T;
        private TextView U;
        private TextView V;
        private View W;
        private View X;
        private TextView Y;
        private TextView Z;
        Context a;
        private b aa;
        private b ab;
        ViewGroup b;
        ThemePullToRefreshListView c;
        com.tsf.extend.theme.af e;
        View f;
        ImageView g;
        TextView h;
        View i;
        View j;
        View k;
        TextView l;
        String m;
        View n;
        s o;
        ViewGroup p;
        TextView q;
        WallpaperImageView r;
        ProgressBar s;
        View t;
        int u;
        View v;
        View z;
        List<t.b> d = new ArrayList();
        int w = 1;
        boolean x = false;
        boolean y = false;
        private long N = 0;
        private Runnable O = new Runnable() { // from class: com.tsf.extend.wallpaper.WallpaperDetail.e.1
            @Override // java.lang.Runnable
            public void run() {
                if (WallpaperDetail.this.b == null || e.this.w >= 40) {
                    WallpaperDetail.this.b.removeCallbacks(this);
                    return;
                }
                e.this.w++;
                e.this.P.run();
                com.tsf.extend.base.j.z.a(0, this, 200L);
            }
        };
        private Runnable P = new Runnable() { // from class: com.tsf.extend.wallpaper.WallpaperDetail.e.2
            @Override // java.lang.Runnable
            public void run() {
                if (e.this.w == 100) {
                    e.this.q.setVisibility(8);
                    e.this.K.setVisibility(8);
                    return;
                }
                if (e.this.q.getVisibility() != 0) {
                    e.this.q.setVisibility(0);
                }
                if (e.this.K.getVisibility() != 0) {
                    e.this.K.setVisibility(0);
                }
                e.this.q.setText(e.this.w + "%");
                e.this.K.setText(e.this.w + "%");
            }
        };
        private boolean Q = false;
        private boolean ac = false;

        public e() {
        }

        public void a(boolean z) {
            this.x = z;
            e();
        }

        public void b(boolean z) {
            this.y = z;
            e();
        }

        private void e() {
            if (this.v != null && !this.x && this.y) {
                this.v.setVisibility(0);
                this.J.setVisibility(0);
                if (WallpaperDetail.this.b != null) {
                    WallpaperDetail.this.b.removeCallbacks(this.O);
                }
                this.q.setVisibility(8);
                this.K.setVisibility(8);
                return;
            }
            this.v.setVisibility(8);
            this.J.setVisibility(8);
        }

        public String a() {
            return !(this.o instanceof m) ? "" : ((m) this.o).j();
        }

        public String b() {
            return !(this.o instanceof m) ? "" : ((m) this.o).i();
        }

        public long c() {
            if (this.o instanceof m) {
                return ((m) this.o).h();
            }
            return -1L;
        }

        public void a(int i) {
            if (WallpaperDetail.this.b != null) {
                if (i > 1) {
                    WallpaperDetail.this.b.removeCallbacks(this.O);
                    if (i > this.w) {
                        this.w = i;
                        WallpaperDetail.this.b.post(this.P);
                        return;
                    }
                    return;
                }
                if (i == 0 && this.w == 1) {
                    this.w++;
                    WallpaperDetail.this.b.removeCallbacks(this.O);
                    WallpaperDetail.this.b.post(this.O);
                }
            }
        }

        public void d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(boolean z) {
            if (z) {
                this.z.setVisibility(0);
            } else {
                this.z.setVisibility(8);
            }
            this.L.setScaleType(WallpaperImageView.b.HeightFirst);
            this.A.setVisibility(0);
            this.F.setVisibility(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f() {
            this.z.setVisibility(0);
            this.A.setVisibility(8);
            this.F.setVisibility(8);
            this.L.a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g() {
            if (WallpaperDetail.this.A) {
                this.z.setVisibility(0);
                this.A.setVisibility(0);
                this.F.setVisibility(0);
            } else {
                this.z.setVisibility(8);
            }
            this.L.b();
        }

        public void a(Context context) {
            this.W = this.b.findViewById(f.e.no_data_layout);
            this.X = this.b.findViewById(f.e.load_relevance_layout);
            this.Y = (TextView) this.b.findViewById(f.e.main_more_theme);
            this.Z = (TextView) this.b.findViewById(f.e.main_more_theme_fail);
            a(this.Y);
            this.Y.setOnClickListener(this);
            this.c.setMode(PullToRefreshBase.b.DISABLED);
            this.c.setHeaderResizeEnabled(false);
            this.c.setCanLoadMore(true);
            this.c.setOnScrollListener(new AbsListView.OnScrollListener() { // from class: com.tsf.extend.wallpaper.WallpaperDetail.e.3
                @Override // android.widget.AbsListView.OnScrollListener
                public void onScrollStateChanged(AbsListView absListView, int i) {
                    if (!e.this.ac && i == 2) {
                        e.this.ac = true;
                    }
                }

                @Override // android.widget.AbsListView.OnScrollListener
                public void onScroll(AbsListView absListView, int i, int i2, int i3) {
                }
            });
            this.c.setOnLoadListener(new PullToRefreshAndLoadMoreListView.a() { // from class: com.tsf.extend.wallpaper.WallpaperDetail.e.4
                @Override // com.tsf.extend.base.widget.pulltorefresh.PullToRefreshAndLoadMoreListView.a
                public void a() {
                }

                @Override // com.tsf.extend.base.widget.pulltorefresh.PullToRefreshAndLoadMoreListView.a
                public void b() {
                    if (e.this.Q) {
                        e.this.l();
                    } else if (e.this.d.size() > 0) {
                        e.this.j();
                    }
                }
            });
            this.e = new com.tsf.extend.theme.af(WallpaperDetail.this.f, this.d, this);
            this.c.setAdapter(this.e);
            this.R = LayoutInflater.from(WallpaperDetail.this.getContext()).inflate(f.C0052f.wallpaper_detail_list_loadmore, (ViewGroup) null);
            this.T = (ProgressBar) this.R.findViewById(f.e.loadmore_progress);
            this.T.setIndeterminateDrawable(new com.tsf.extend.base.widget.pulltorefresh.d(WallpaperDetail.this.getContext(), 3, 1));
            this.U = (TextView) this.R.findViewById(f.e.loadmore_tips);
            this.S = this.R.findViewById(f.e.nomore_group);
            this.V = (TextView) this.R.findViewById(f.e.more_theme);
            this.U.setOnClickListener(this);
            this.V.setOnClickListener(this);
            a(this.V);
            this.c.setLoadMoreView(this.R);
            h();
        }

        private void a(View view) {
            int iA = PersonalizationActivity.a(WallpaperDetail.this.getContext(), 2.0f);
            com.tsf.extend.theme.i iVar = new com.tsf.extend.theme.i(-16334705);
            iVar.a(iA);
            com.tsf.extend.theme.i iVar2 = new com.tsf.extend.theme.i(-16405376);
            iVar2.a(iA);
            com.tsf.extend.theme.i iVar3 = new com.tsf.extend.theme.i(-2565928);
            iVar3.a(iA);
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{R.attr.state_pressed}, iVar2);
            stateListDrawable.addState(new int[]{-16842910}, iVar3);
            stateListDrawable.addState(StateSet.WILD_CARD, iVar);
            a(view, stateListDrawable);
        }

        private void a(View view, Drawable drawable) {
            if (Build.VERSION.SDK_INT >= 16) {
                view.setBackground(drawable);
            } else {
                view.setBackgroundDrawable(drawable);
            }
        }

        private void h() {
            long jH;
            int i;
            int iK;
            long jH2;
            if (WallpaperDetail.this.s) {
                com.tsf.extend.wallpaper.g gVar = (com.tsf.extend.wallpaper.g) this.o;
                if (gVar.c()) {
                    iK = 1;
                    jH2 = gVar.h();
                } else {
                    iK = gVar.k();
                    jH2 = gVar.h();
                }
                jH = jH2;
                i = iK;
            } else {
                m mVar = (m) this.o;
                int iK2 = mVar.k();
                jH = mVar.h();
                i = iK2;
            }
            this.aa = new b(a.b.LoadCache);
            com.tsf.extend.theme.v.h().a(this.aa, a.b.LoadCache, i, jH);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int id = view.getId();
            if (id == f.e.loadmore_tips) {
                this.T.setVisibility(0);
                this.U.setVisibility(8);
                l();
                return;
            }
            if (id == f.e.theme_item_download_layout_left) {
                a(view.findViewById(f.e.theme_download_left), true);
                return;
            }
            if (id == f.e.theme_item_download_layout_right) {
                a(view.findViewById(f.e.theme_download_right), true);
                return;
            }
            if (id == f.e.theme_item_download_layout_mid) {
                a(view.findViewById(f.e.theme_download_mid), true);
                return;
            }
            if (id == f.e.theme_item_left || id == f.e.theme_item_right || id == f.e.theme_item_mid) {
                a(view, false);
            } else if (id == f.e.main_more_theme || id == f.e.more_theme) {
                WallpaperDetail.this.f.h();
                WallpaperDetail.this.a(this.o, (com.tsf.extend.theme.k) null, "13");
            }
        }

        private void a(View view, boolean z) {
            com.tsf.extend.theme.k kVar;
            if (Math.abs(this.N - System.currentTimeMillis()) > 1000) {
                if (z) {
                    kVar = (com.tsf.extend.theme.k) view.getTag();
                } else {
                    Object tag = view.getTag();
                    if (tag instanceof t.d) {
                        if (view.getId() == f.e.theme_item_left) {
                            kVar = ((t.d) tag).a;
                        } else if (view.getId() == f.e.theme_item_mid) {
                            kVar = ((t.d) tag).o;
                        } else {
                            kVar = ((t.d) tag).h;
                        }
                    } else {
                        kVar = tag instanceof com.tsf.extend.theme.k ? (com.tsf.extend.theme.k) tag : null;
                    }
                }
                if (kVar != null) {
                    WallpaperDetail.this.a(this.o, kVar, "12");
                    if (ao.b().g()) {
                        ThemeDetail themeDetail = (ThemeDetail) LayoutInflater.from(WallpaperDetail.this.f).inflate(f.C0052f.theme_detail, (ViewGroup) null);
                        themeDetail.setFromInlet(WallpaperDetail.this.I);
                        themeDetail.setFromTab("detail");
                        themeDetail.setTheme(kVar);
                        themeDetail.a("1010", "1010");
                        WallpaperDetail.this.f.a((PageActivity.a) themeDetail);
                    } else if (!kVar.v()) {
                        WallpaperDetail.this.f.a(false);
                        com.tsf.extend.theme.x.a(WallpaperDetail.this.getContext(), kVar.k(), "tsf_theme_center_theme");
                    } else {
                        a(kVar);
                    }
                    this.N = System.currentTimeMillis();
                }
            }
        }

        private void a(com.tsf.extend.theme.k kVar) {
            Context context = WallpaperDetail.this.getContext();
            String strG = kVar.g();
            if (context.getPackageManager() != null) {
                Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(strG);
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
                    WallpaperDetail.this.f.a(false);
                    context.startActivity(launchIntentForPackage);
                }
            }
        }

        class b implements a.InterfaceC0048a<com.tsf.extend.base.b.a> {
            private final a.b b;

            public b(a.b bVar) {
                this.b = bVar;
            }

            @Override // com.tsf.extend.base.d.a.InterfaceC0048a
            public void a(JSONObject jSONObject, final com.tsf.extend.base.b.a aVar) {
                com.tsf.extend.base.j.z.a(0, new Runnable() { // from class: com.tsf.extend.wallpaper.WallpaperDetail.e.b.1
                    @Override // java.lang.Runnable
                    public void run() {
                        e.this.a(aVar, b.this.b == a.b.LoadMore);
                    }
                });
            }

            @Override // com.tsf.extend.base.d.a.InterfaceC0048a
            public void a(JSONObject jSONObject, int i, com.tsf.extend.base.b.a aVar) {
                Log.d("WallpaperDetail", "onFail=" + this.b.name());
                com.tsf.extend.base.j.z.a(0, new Runnable() { // from class: com.tsf.extend.wallpaper.WallpaperDetail.e.b.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (e.this.d.size() > 0) {
                            e.this.k();
                        } else {
                            e.this.d(false);
                        }
                    }
                });
            }
        }

        class a implements a.InterfaceC0048a<List<com.tsf.extend.theme.k>> {
            a() {
            }

            @Override // com.tsf.extend.base.d.a.InterfaceC0048a
            public void a(JSONObject jSONObject, final List<com.tsf.extend.theme.k> list) {
                if (list != null) {
                    com.tsf.extend.base.j.z.a(0, new Runnable() { // from class: com.tsf.extend.wallpaper.WallpaperDetail.e.a.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (e.this.d != null) {
                                e.this.a((List<com.tsf.extend.theme.k>) list);
                            }
                        }
                    });
                }
            }

            @Override // com.tsf.extend.base.d.a.InterfaceC0048a
            public void a(JSONObject jSONObject, int i, List<com.tsf.extend.theme.k> list) {
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(com.tsf.extend.base.b.a aVar, boolean z) {
            com.tsf.extend.theme.p pVar = null;
            if (aVar instanceof com.tsf.extend.theme.p) {
                pVar = (com.tsf.extend.theme.p) aVar;
            }
            this.Q = pVar.b();
            if ((this.d.size() == 0) && aVar.a() != null && aVar.a().size() > 0) {
                this.X.setVisibility(0);
            }
            a(aVar.a(), z);
            if (!this.Q) {
                if (this.d.size() > 0) {
                    this.X.setVisibility(0);
                    j();
                }
            } else {
                i();
                this.c.b(false);
            }
            com.tsf.extend.theme.v.h().a(new a());
        }

        public void a(List<com.tsf.extend.theme.k> list, boolean z) {
            String strF;
            if (!z) {
                this.d.clear();
            }
            if (this.d.size() != 0 || (list != null && list.size() != 0)) {
                if (WallpaperDetail.this.f != null) {
                    strF = WallpaperDetail.this.f.f();
                } else {
                    strF = null;
                }
                if (strF != null && strF.startsWith("DIY://")) {
                    for (com.tsf.extend.theme.k kVar : list) {
                        if (kVar instanceof aq) {
                            if (!TextUtils.isEmpty(strF) && strF.contains(((aq) kVar).I())) {
                                kVar.b(true);
                            } else {
                                kVar.b(false);
                            }
                        }
                    }
                } else {
                    for (com.tsf.extend.theme.k kVar2 : list) {
                        if (!TextUtils.isEmpty(strF) && strF.equals(kVar2.g())) {
                            kVar2.b(true);
                        } else {
                            kVar2.b(false);
                        }
                    }
                }
                this.e.a(this.d, list);
                this.e.notifyDataSetChanged();
                return;
            }
            this.e.notifyDataSetChanged();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(List<com.tsf.extend.theme.k> list) {
            for (t.b bVar : this.d) {
                com.tsf.extend.theme.k kVarA = bVar.a();
                com.tsf.extend.theme.k kVarB = bVar.b();
                kVarA.d(false);
                if (kVarB != null) {
                    kVarB.d(false);
                }
                for (com.tsf.extend.theme.k kVar : list) {
                    if (kVar != null && !(kVar instanceof aq)) {
                        if (kVar.g().equals(kVarA.g())) {
                            kVarA.d(true);
                        }
                        if (kVarB != null && kVar.g().equals(kVarB.g())) {
                            kVarB.d(true);
                        }
                    }
                }
            }
            this.e.notifyDataSetChanged();
        }

        private void i() {
            this.W.setVisibility(8);
            this.R.setVisibility(0);
            this.S.setVisibility(8);
            this.T.setVisibility(0);
            this.U.setVisibility(8);
            this.U.setClickable(false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j() {
            this.W.setVisibility(8);
            this.R.setVisibility(0);
            this.S.setVisibility(0);
            this.V.setVisibility(0);
            this.T.setVisibility(8);
            this.U.setVisibility(8);
            this.U.setClickable(false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void k() {
            this.W.setVisibility(8);
            this.R.setVisibility(0);
            this.S.setVisibility(8);
            this.T.setVisibility(8);
            this.U.setVisibility(0);
            this.U.setClickable(true);
            this.U.setText(f.g.load_more_fail);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(boolean z) {
            this.W.setVisibility(0);
            this.R.setVisibility(8);
            if (z) {
                this.Z.setVisibility(8);
            } else {
                this.Z.setVisibility(0);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void l() {
            long jH;
            int i;
            int iK;
            long jH2;
            if (this.d != null && this.d.size() > 0) {
                if (WallpaperDetail.this.s) {
                    com.tsf.extend.wallpaper.g gVar = (com.tsf.extend.wallpaper.g) this.o;
                    if (gVar.c()) {
                        iK = 1;
                        jH2 = gVar.h();
                    } else {
                        iK = gVar.k();
                        jH2 = gVar.h();
                    }
                    jH = jH2;
                    i = iK;
                } else {
                    m mVar = (m) this.o;
                    int iK2 = mVar.k();
                    jH = mVar.h();
                    i = iK2;
                }
                this.ab = new b(a.b.LoadMore);
                com.tsf.extend.theme.v.h().a(this.ab, a.b.LoadMore, i, jH);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(View view) {
        view.setVisibility(0);
        if (Build.VERSION.SDK_INT >= 14) {
            view.setAlpha(0.0f);
            view.setScaleX(0.0f);
            view.setScaleY(0.0f);
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
            viewPropertyAnimatorAnimate.alpha(1.0f);
            viewPropertyAnimatorAnimate.scaleX(1.0f);
            viewPropertyAnimatorAnimate.scaleY(1.0f);
            viewPropertyAnimatorAnimate.setDuration(200L);
            viewPropertyAnimatorAnimate.start();
        }
    }

    private void c(View view) {
        view.setVisibility(0);
        if (Build.VERSION.SDK_INT >= 14) {
            view.setAlpha(1.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
            viewPropertyAnimatorAnimate.alpha(0.0f);
            viewPropertyAnimatorAnimate.scaleX(0.0f);
            viewPropertyAnimatorAnimate.scaleY(0.0f);
            viewPropertyAnimatorAnimate.setDuration(200L);
            viewPropertyAnimatorAnimate.start();
        }
    }

    private void a(boolean z) {
        e eVarA;
        s sVar;
        if (!this.J && (eVarA = a(this.b.getCurrentItem())) != null && (sVar = eVarA.o) != null && sVar.s() != null) {
            this.J = true;
            a(sVar, (com.tsf.extend.theme.k) null, "8");
            this.u.post(new Runnable() { // from class: com.tsf.extend.wallpaper.WallpaperDetail.9
                @Override // java.lang.Runnable
                public void run() {
                    File file = new File(WallpaperDetail.this.getContext().getFilesDir(), "preview3d.wpp");
                    if (!file.exists()) {
                        WallpaperDetail.this.J = false;
                        return;
                    }
                    final Bitmap bitmapDecodeFile = null;
                    try {
                        bitmapDecodeFile = BitmapFactory.decodeFile(file.getAbsolutePath());
                    } catch (Throwable th) {
                    }
                    if (bitmapDecodeFile == null) {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inSampleSize = 2;
                        try {
                            bitmapDecodeFile = BitmapFactory.decodeFile(file.getAbsolutePath(), options);
                        } catch (Throwable th2) {
                        }
                    }
                    if (bitmapDecodeFile == null) {
                        WallpaperDetail.this.J = false;
                    } else {
                        com.tsf.extend.base.j.z.a(0, new Runnable() { // from class: com.tsf.extend.wallpaper.WallpaperDetail.9.1
                            @Override // java.lang.Runnable
                            public void run() {
                                int iB = (com.tsf.extend.base.j.p.b() - ((bitmapDecodeFile.getWidth() <= com.tsf.extend.base.j.p.b() / 2 ? 2 : 1) * bitmapDecodeFile.getWidth())) / 2;
                                if (iB < 0) {
                                    iB = 0;
                                }
                                WallpaperDetail.this.h.setPadding(iB, 0, iB, 0);
                                WallpaperDetail.this.h.setImageBitmap(bitmapDecodeFile);
                                WallpaperDetail.this.b(WallpaperDetail.this.h);
                                WallpaperDetail.this.setBtnVisibilityForPreview(true);
                                WallpaperDetail.this.b.getCurrentItem();
                                int size = WallpaperDetail.this.e.size();
                                for (int i = 0; i < size; i++) {
                                    e eVar = (e) WallpaperDetail.this.e.get(i);
                                    if (eVar != null) {
                                        eVar.a(true);
                                        eVar.f();
                                    }
                                }
                                WallpaperDetail.this.o = true;
                                WallpaperDetail.this.J = false;
                            }
                        });
                    }
                }
            });
        }
    }

    public void setBtnVisibilityForPreview(boolean z) {
        int i = z ? 8 : 0;
        this.g.setVisibility(i);
        this.C.setVisibility(i);
        if (z && this.B.getVisibility() == 0) {
            this.B.setVisibility(4);
        } else if (!z && this.B.getVisibility() == 4) {
            this.B.setVisibility(0);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        e eVarA;
        c cVar;
        e eVarA2 = a(this.b.getCurrentItem());
        int id = view.getId();
        if (id == f.e.wallpaper_bigtype_preview || id == f.e.preview) {
            a(true);
            return;
        }
        if (id == f.e.go_to_list || id == f.e.view_pager) {
            this.f.onBackPressed();
            return;
        }
        if (id == f.e.wallpaper_bigtype_set_wallpaper || id == f.e.set_wallpaper) {
            if (this.f.g()) {
                Toast.makeText(getContext(), f.g.theme_current_no_set_wallpaper, 0).show();
                this.f.finish();
                return;
            }
            if (this.p == 0 && (eVarA = a(this.b.getCurrentItem())) != null) {
                a(eVarA.o, (com.tsf.extend.theme.k) null, "2");
                this.b.setCanDrage(false);
                this.l.setVisibility(0);
                eVarA2.g.setClickable(false);
                eVarA2.B.setClickable(false);
                eVarA2.h.setClickable(false);
                eVarA2.C.setClickable(false);
                if ((eVarA.o instanceof com.tsf.extend.wallpaper.g) && ((com.tsf.extend.wallpaper.g) eVarA.o).d()) {
                    cVar = new c(eVarA, ((com.tsf.extend.wallpaper.g) eVarA.o).e());
                } else {
                    Bitmap bitmapS = eVarA.o.s();
                    if (bitmapS == null) {
                        a(eVarA, false);
                        return;
                    }
                    cVar = new c(eVarA, bitmapS);
                }
                o();
                com.tsf.extend.base.j.z.a(2, cVar);
                return;
            }
            return;
        }
        if (id == f.e.wallpaper_bigtype_retry || id == f.e.retry) {
            eVarA2.s.setVisibility(0);
            eVarA2.I.setVisibility(0);
            eVarA2.b(false);
            a(eVarA2);
            return;
        }
        if (id == f.e.wallpaper_bigtype_delete || id == f.e.delete) {
            a(a(this.b.getCurrentItem()).o, (com.tsf.extend.theme.k) null, "5");
            i();
            return;
        }
        if (id == f.e.wallpaper_bigtype_favorite || id == f.e.favorite) {
            e eVarA3 = a(this.b.getCurrentItem());
            s sVar = eVarA3.o;
            if (!(sVar instanceof com.tsf.extend.wallpaper.g)) {
                m mVar = (m) sVar;
                if (this.x.a((m) eVarA3.o)) {
                    c(mVar);
                    return;
                } else {
                    b(mVar);
                    return;
                }
            }
            return;
        }
        if (id == f.e.switch_scale) {
            b(true);
            return;
        }
        if (id == f.e.wallpaper_bigtype_layout && this.o) {
            this.o = false;
            setBtnVisibilityForPreview(false);
            c(this.h);
            int size = this.e.size();
            for (int i = 0; i < size; i++) {
                e eVar = this.e.get(i);
                eVar.g();
                eVar.a(false);
                if (eVar.u == this.b.getCurrentItem()) {
                    a(eVar.o, (com.tsf.extend.theme.k) null, "4");
                }
            }
        }
    }

    private void b(boolean z) {
        WallpaperImageView wallpaperImageView;
        e eVarA = a(this.b.getCurrentItem());
        if (eVarA != null && (wallpaperImageView = eVarA.r) != null && !wallpaperImageView.c()) {
            this.A = !this.A;
            Iterator<e> it = this.e.iterator();
            while (it.hasNext()) {
                it.next().c(this.A);
            }
            this.B.setVisibility(this.A ? 0 : 8);
            this.C.setSelected(this.A);
            com.tsf.extend.base.h.a.a().a(this.A);
            a(eVarA.o, (com.tsf.extend.theme.k) null, z ? "9" : "10");
        }
    }

    private void b(m mVar) {
        this.x.b(mVar, this);
        a(mVar, (com.tsf.extend.theme.k) null, "6");
    }

    private void c(m mVar) {
        this.x.a(mVar, this);
        a(mVar, (com.tsf.extend.theme.k) null, "7");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(s sVar, com.tsf.extend.theme.k kVar, String str) {
        m mVar = null;
        if (sVar instanceof m) {
            mVar = (m) sVar;
        }
        if (mVar != null) {
            mVar.h();
            mVar.k();
            sVar.s();
        }
        if ("12".equals(str) && kVar != null) {
            kVar.g();
        }
    }

    private void i() {
        j();
        this.r = new e.a(getContext()).a(f.g.delete_wallaper).b(f.g.setting_unset_default_dialog_cancel, this).a(f.g.setting_unset_default_dialog_ok, this).a();
        this.r.setOnDismissListener(this);
        this.r.a(true);
    }

    private void j() {
        if (this.r != null) {
            this.r.dismiss();
            this.r = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final e eVar, final boolean z) {
        if (z && (eVar.o instanceof com.tsf.extend.wallpaper.g) && ((com.tsf.extend.wallpaper.g) eVar.o).d()) {
            ao.b().a(((com.tsf.extend.wallpaper.g) eVar.o).e());
        }
        b(eVar, z);
        z.h().a(eVar.c());
        if (z) {
        }
        com.tsf.extend.base.j.z.a(0, new Runnable() { // from class: com.tsf.extend.wallpaper.WallpaperDetail.10
            @Override // java.lang.Runnable
            public void run() {
                WallpaperDetail.this.l.setVisibility(8);
                WallpaperDetail.this.b.setCanDrage(true);
                eVar.h.setClickable(!z);
                eVar.C.setClickable(!z);
                eVar.g.setClickable(!z);
                eVar.B.setClickable(!z);
                Toast.makeText(WallpaperDetail.this.f, z ? f.g.wallpaper_set_suc : f.g.wallpaper_set_fail, 1).show();
                if (z) {
                    com.tsf.extend.base.j.z.a(0, new Runnable() { // from class: com.tsf.extend.wallpaper.WallpaperDetail.10.1
                        @Override // java.lang.Runnable
                        public void run() {
                            WallpaperDetail.this.f.sendBroadcast(new Intent("com.ksmobile.launcher.FINISH_WALLPAPER_SETTING_ACTIVITY"));
                        }
                    }, 500L);
                }
            }
        }, 0L);
    }

    private void b(e eVar, boolean z) {
        if (eVar != null) {
            if (z) {
            }
            if (eVar.o instanceof m) {
                ((m) eVar.o).k();
            }
        }
    }

    private void setFavoriteBtnVisible(boolean z) {
        int i = z ? 0 : 8;
        e eVarA = a(this.b.getCurrentItem());
        if (eVarA != null) {
            eVarA.i.setVisibility(i);
            eVarA.D.setVisibility(i);
        }
    }

    @Override // com.tsf.extend.wallpaper.TabViewPager.a
    public void a(View view) {
    }

    public void a(List<? extends s> list, s sVar, boolean z) {
        this.c = list;
        this.s = z;
        this.b.setCurrentItem(list.indexOf(sVar));
        this.i.c();
        this.D = list.indexOf(sVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Pair<m.a, Bitmap> pair) {
        if (pair != null && !TextUtils.isEmpty(((m.a) pair.first).a)) {
            for (e eVar : this.e) {
                if (((m.a) pair.first).a.equals(eVar.a())) {
                    eVar.r.setSrcBitmap((Bitmap) pair.second);
                    eVar.L.setSrcBitmap((Bitmap) pair.second);
                    eVar.o.b((Bitmap) pair.second);
                    eVar.s.setVisibility(8);
                    eVar.I.setVisibility(8);
                    eVar.q.setVisibility(8);
                    eVar.K.setVisibility(8);
                    if (pair.second != null) {
                        setButtonEnableStatus(eVar);
                        setFavoriteBtnStatus(eVar);
                        setScaleStatus(eVar);
                    }
                    if (pair.second == null) {
                        eVar.b(true);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean k() {
        return this.o;
    }

    private class a implements a.InterfaceC0048a<Pair<m.a, Bitmap>> {
        private a() {
        }

        @Override // com.tsf.extend.base.d.a.InterfaceC0048a
        public void a(JSONObject jSONObject, Pair<m.a, Bitmap> pair) {
            WallpaperDetail.this.a(pair);
        }

        @Override // com.tsf.extend.base.d.a.InterfaceC0048a
        public void a(JSONObject jSONObject, int i, Pair<m.a, Bitmap> pair) {
            WallpaperDetail.this.a(pair);
            if (com.tsf.extend.base.j.u.a(WallpaperDetail.this.getContext())) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setButtonEnableStatus(e eVar) {
        s sVar;
        if (eVar != null && (sVar = eVar.o) != null) {
            boolean z = sVar.s() != null;
            eVar.g.setEnabled(z);
            if (Build.VERSION.SDK_INT >= 11) {
                eVar.g.setAlpha(z ? 1.0f : 0.2f);
            }
            eVar.B.setEnabled(z);
            if (Build.VERSION.SDK_INT >= 11) {
                eVar.B.setAlpha(z ? 1.0f : 0.2f);
            }
            eVar.h.setEnabled(z);
            eVar.C.setEnabled(z);
            if (sVar instanceof com.tsf.extend.wallpaper.g) {
                c(eVar, z && !((com.tsf.extend.wallpaper.g) sVar).c());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(e eVar, boolean z) {
        if (eVar != null) {
            eVar.j.setEnabled(z);
            if (Build.VERSION.SDK_INT >= 11) {
                eVar.j.setAlpha(z ? 1.0f : 0.2f);
            }
            eVar.E.setEnabled(z);
            if (Build.VERSION.SDK_INT >= 11) {
                eVar.E.setAlpha(z ? 1.0f : 0.2f);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScaleStatus(e eVar) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFavoriteBtnStatus(e eVar) {
        boolean z;
        if (eVar != null) {
            s sVar = eVar.o;
            if (sVar instanceof m) {
                m mVar = (m) sVar;
                if (!this.z) {
                    z = false;
                } else {
                    boolean zA = this.x.a(mVar);
                    if (mVar.r() == null && mVar.s() == null && !zA) {
                        z = false;
                    } else {
                        z = true;
                    }
                    eVar.i.setSelected(zA);
                    eVar.D.setSelected(zA);
                }
                eVar.i.setEnabled(z);
                if (Build.VERSION.SDK_INT >= 11) {
                    eVar.i.setAlpha(z ? 1.0f : 0.2f);
                }
                eVar.D.setEnabled(z);
                if (Build.VERSION.SDK_INT >= 11) {
                    eVar.D.setAlpha(z ? 1.0f : 0.2f);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        Iterator<e> it = this.e.iterator();
        while (it.hasNext()) {
            setFavoriteBtnStatus(it.next());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean m() {
        System.currentTimeMillis();
        return com.tsf.extend.base.j.u.b(getContext());
    }

    private class d implements a.InterfaceC0048a<Pair<String, Bitmap>> {
        private d() {
        }

        @Override // com.tsf.extend.base.d.a.InterfaceC0048a
        public void a(JSONObject jSONObject, Pair<String, Bitmap> pair) {
            a(pair);
        }

        private void a(Pair<String, Bitmap> pair) {
            if (pair != null) {
                String str = (String) pair.first;
                if (!TextUtils.isEmpty(str)) {
                    Iterator it = WallpaperDetail.this.c.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        s sVar = (s) it.next();
                        if ((sVar instanceof m) && str.equals(((m) sVar).i())) {
                            sVar.a((Bitmap) pair.second);
                            break;
                        }
                    }
                    for (e eVar : WallpaperDetail.this.e) {
                        if (str.equals(eVar.b())) {
                            eVar.r.setTempBitmap((Bitmap) pair.second);
                            eVar.L.setTempBitmap((Bitmap) pair.second);
                            WallpaperDetail.this.setFavoriteBtnStatus(eVar);
                            WallpaperDetail.this.setScaleStatus(eVar);
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

    @Override // com.tsf.extend.wallpaper.a.a.b
    public void g() {
        e eVarA;
        if (!this.H) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if ((this.a <= 0 || jCurrentTimeMillis - this.a > 2000) && (eVarA = a(this.b.getCurrentItem())) != null) {
                a(eVarA, true);
            }
            this.a = jCurrentTimeMillis;
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        if (dialogInterface == this.r) {
            switch (i) {
                case ItemInfo.NO_ID /* -1 */:
                    final int currentItem = this.b.getCurrentItem();
                    final e eVarA = a(currentItem);
                    if (eVarA != null && (eVarA.o instanceof com.tsf.extend.wallpaper.g)) {
                        i.a().a(new i.a() { // from class: com.tsf.extend.wallpaper.WallpaperDetail.11
                            @Override // com.tsf.extend.wallpaper.i.a
                            public void a(i.a.EnumC0069a enumC0069a, Object obj, final i.a.b bVar) {
                                com.tsf.extend.base.j.z.a(0, new Runnable() { // from class: com.tsf.extend.wallpaper.WallpaperDetail.11.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        Toast.makeText(WallpaperDetail.this.f, bVar == i.a.b.suc ? f.g.delete_wallpaper_suc : f.g.delete_wallpaper_fail, 1).show();
                                        if (bVar == i.a.b.suc && WallpaperDetail.this.v != null) {
                                            WallpaperDetail.this.c.remove(eVarA.o);
                                            WallpaperDetail.this.i = new f();
                                            WallpaperDetail.this.e.clear();
                                            WallpaperDetail.this.b.setAdapter(WallpaperDetail.this.i);
                                            int size = currentItem;
                                            if (currentItem >= WallpaperDetail.this.c.size()) {
                                                size = WallpaperDetail.this.c.size() - 1;
                                            }
                                            if (size == 0) {
                                                WallpaperDetail.this.c(eVarA, false);
                                            }
                                            WallpaperDetail.this.b.setCurrentItem(size);
                                            WallpaperDetail.this.v.a();
                                        }
                                    }
                                });
                            }
                        }, (com.tsf.extend.wallpaper.g) eVarA.o);
                        break;
                    }
                    break;
            }
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (dialogInterface == this.r) {
            this.r = null;
        }
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.a
    public boolean getPendingTransition() {
        return false;
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.a
    public void a() {
        this.H = false;
        this.b.setCanDrage(true);
        this.f.b(true);
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.a
    public void b() {
        this.H = true;
        this.f.b(false);
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.a
    public void f() {
    }

    @Override // com.tsf.extend.wallpaper.i.a
    public void a(final i.a.EnumC0069a enumC0069a, final Object obj, final i.a.b bVar) {
        Runnable runnable = new Runnable() { // from class: com.tsf.extend.wallpaper.WallpaperDetail.12
            @Override // java.lang.Runnable
            public void run() {
                e eVarA;
                boolean z = bVar == i.a.b.suc;
                switch (AnonymousClass5.a[enumC0069a.ordinal()]) {
                    case 1:
                        m mVar = (m) obj;
                        if (z && (eVarA = WallpaperDetail.this.a((s) mVar)) != null) {
                            eVarA.i.setSelected(true);
                            eVarA.D.setSelected(true);
                            WallpaperDetail.this.n();
                            break;
                        }
                        break;
                    case 2:
                        m mVar2 = (m) obj;
                        if (z) {
                            if (WallpaperDetail.this.w == ai.FavoriteType) {
                                int currentItem = WallpaperDetail.this.b.getCurrentItem();
                                WallpaperDetail.this.c.remove(mVar2);
                                if (WallpaperDetail.this.c.size() == 0) {
                                    WallpaperDetail.this.f.onBackPressed();
                                } else {
                                    WallpaperDetail.this.i = new f();
                                    WallpaperDetail.this.e.clear();
                                    WallpaperDetail.this.b.setAdapter(WallpaperDetail.this.i);
                                    WallpaperDetail.this.b.setCurrentItem(currentItem >= WallpaperDetail.this.c.size() ? WallpaperDetail.this.c.size() - 1 : currentItem);
                                }
                            } else {
                                e eVarA2 = WallpaperDetail.this.a((s) mVar2);
                                if (eVarA2 != null) {
                                    eVarA2.i.setSelected(false);
                                    eVarA2.D.setSelected(false);
                                }
                            }
                        }
                        break;
                }
            }
        };
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            com.tsf.extend.base.j.z.a(0, runnable);
        }
    }

    /* JADX INFO: renamed from: com.tsf.extend.wallpaper.WallpaperDetail$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] a = new int[i.a.EnumC0069a.values().length];

        static {
            try {
                a[i.a.EnumC0069a.save.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                a[i.a.EnumC0069a.delete.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(getContext(), f.a.wallpaper_favorite_anim_in);
        final Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(getContext(), f.a.wallpaper_favorite_anim_out);
        animationLoadAnimation2.setAnimationListener(new Animation.AnimationListener() { // from class: com.tsf.extend.wallpaper.WallpaperDetail.13
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                WallpaperDetail.this.y.setVisibility(8);
            }
        });
        final Runnable runnable = new Runnable() { // from class: com.tsf.extend.wallpaper.WallpaperDetail.2
            @Override // java.lang.Runnable
            public void run() {
                WallpaperDetail.this.y.startAnimation(animationLoadAnimation2);
            }
        };
        animationLoadAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.tsf.extend.wallpaper.WallpaperDetail.3
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                com.tsf.extend.base.j.z.a(0, runnable, 1000L);
            }
        });
        this.y.setVisibility(0);
        this.y.startAnimation(animationLoadAnimation);
    }

    @Override // com.tsf.extend.wallpaper.aa.a
    public void h() {
        com.tsf.extend.base.j.z.a(0, new Runnable() { // from class: com.tsf.extend.wallpaper.WallpaperDetail.4
            @Override // java.lang.Runnable
            public void run() {
                WallpaperDetail.this.z = true;
                WallpaperDetail.this.l();
            }
        });
    }

    @Override // com.tsf.extend.wallpaper.WallpaperImageView.a
    public void a(WallpaperImageView wallpaperImageView) {
        b(false);
    }

    @Override // com.tsf.extend.wallpaper.WallpaperImageView.a
    public void b(WallpaperImageView wallpaperImageView) {
        a(false);
    }

    @Override // com.tsf.extend.wallpaper.HorzontalSliderView.a
    public void a(float f2, boolean z) {
        e eVarA = a(this.b.getCurrentItem());
        if (eVarA != null) {
            eVarA.r.a(f2, z);
            eVarA.L.a(f2, z);
        }
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.a
    public void d() {
    }

    private void o() {
        if (getContext() != null && this.G == null) {
            this.G = new g();
            getContext().getApplicationContext().registerReceiver(this.G, new IntentFilter("com.ksmobile.launcher.FINISH_WALLPAPER_SETTING_ACTIVITY"));
        }
    }

    private void p() {
        if (getContext() != null && this.G != null) {
            try {
                getContext().getApplicationContext().unregisterReceiver(this.G);
            } catch (Exception e2) {
            } finally {
                this.G = null;
            }
        }
    }

    private class g extends BroadcastReceiver {
        private g() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            com.tsf.extend.base.j.z.a(0, new Runnable() { // from class: com.tsf.extend.wallpaper.WallpaperDetail.g.1
                @Override // java.lang.Runnable
                public void run() {
                    WallpaperDetail.this.f.finish();
                }
            }, 100L);
        }
    }

    private class c implements Runnable {
        private e b;
        private Bitmap c;
        private int d;

        c(e eVar, Bitmap bitmap) {
            this.d = -1;
            this.b = eVar;
            this.c = bitmap;
        }

        c(e eVar, int i) {
            this.d = -1;
            this.b = eVar;
            this.d = i;
        }

        /* JADX WARN: Removed duplicated region for block: B:101:0x00ee A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:120:? A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0061 A[Catch: all -> 0x00fb, Throwable -> 0x011c, TRY_ENTER, TryCatch #16 {Throwable -> 0x011c, all -> 0x00fb, blocks: (B:8:0x0025, B:10:0x002d, B:12:0x0045, B:40:0x00b1, B:17:0x004d, B:18:0x004f, B:23:0x0058, B:26:0x0061, B:29:0x0073, B:44:0x00b9), top: B:107:0x0025 }] */
        /* JADX WARN: Removed duplicated region for block: B:86:0x0126  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x0129  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x00f3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:93:0x0104 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:97:0x00ff A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 311
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tsf.extend.wallpaper.WallpaperDetail.c.run():void");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public e a(s sVar) {
        for (e eVar : this.e) {
            if (sVar instanceof m) {
                if (eVar.c() == ((m) sVar).h()) {
                    return eVar;
                }
            }
        }
        return null;
    }
}
