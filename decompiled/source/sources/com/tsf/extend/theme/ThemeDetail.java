package com.tsf.extend.theme;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.StateSet;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.google.android.collect.Lists;
import com.tsf.extend.base.actstru.model.activi.PageActivity;
import com.tsf.extend.base.d.a;
import com.tsf.extend.base.support.ViewPager;
import com.tsf.extend.base.widget.pulltorefresh.PullToRefreshAndLoadMoreListView;
import com.tsf.extend.f;
import com.tsf.extend.theme.diy.ThemeDIYActivity;
import com.tsf.extend.theme.t;
import com.tsf.extend.theme.v;
import com.tsf.extend.wallpaper.PersonalizationActivity;
import com.tsf.extend.wallpaper.l;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class ThemeDetail extends FrameLayout implements DialogInterface.OnClickListener, View.OnClickListener, ViewTreeObserver.OnGlobalLayoutListener, PageActivity.a, a.InterfaceC0048a<List<k>>, PersonalizationActivity.n, l.a {
    public static final int[] b = {f.e.title, f.e.favorite_theme, f.e.diy_btn, f.e.loadmore_tips, f.e.theme_controll};
    private List<String> A;
    private List<Integer> B;
    private int C;
    private f D;
    private o E;
    private String F;
    private String G;
    private String H;
    private String I;
    private long J;
    private FrameLayout K;
    private ProgressBar L;
    private boolean M;
    private boolean N;
    private t O;
    private d P;
    private d Q;
    private List<t.b> R;
    private long S;
    private boolean T;
    private boolean U;
    private View V;
    private View W;
    public List<ImageView> a;
    private View aa;
    private int ab;
    private int ac;
    private View ad;
    private int ae;
    private int af;
    private String ag;
    private boolean ah;
    @SuppressLint({"HandlerLeak"})
    private Handler ai;
    private com.tsf.extend.theme.b aj;
    private ImageView c;
    private TextView d;
    private View e;
    private View f;
    private View g;
    private ViewPager h;
    private TextView i;
    private TextView j;
    private View k;
    private TextView l;
    private PageActivity m;
    private TextView n;
    private LinearLayout o;
    private ImageView p;
    private View q;
    private PullToRefreshAndLoadMoreListView r;
    private View s;
    private ProgressBar t;
    private TextView u;
    private View v;
    private View w;
    private TextView x;
    private c y;
    private k z;

    /* loaded from: classes.dex */
    public enum f {
        LOCAL_THEME,
        THEME_HASLOCAL,
        THEME_NETLOCAL
    }

    public ThemeDetail(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.C = 0;
        this.a = Lists.newArrayList();
        this.G = "0";
        this.H = "0";
        this.I = "";
        this.J = 0L;
        this.K = null;
        this.L = null;
        this.R = new ArrayList();
        this.S = 0L;
        this.T = false;
        this.U = false;
        this.ab = -16334962;
        this.ac = -1;
        this.ai = new Handler() { // from class: com.tsf.extend.theme.ThemeDetail.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                switch (message.what) {
                    case 0:
                        if (ThemeDetail.this.m != null) {
                            ThemeDetail.this.m.setResult(-1);
                            ThemeDetail.this.m.finish();
                        }
                        if ((ThemeDetail.this.z instanceof com.tsf.extend.theme.b) && ((com.tsf.extend.theme.b) ThemeDetail.this.z).e()) {
                            ao.b().i();
                        }
                        if (ThemeDetail.this.aj != null) {
                            ao.b().i();
                        }
                        ThemeDetail.this.b("0");
                        return;
                    default:
                        ThemeDetail.this.z();
                        if (ThemeDetail.this.m != null) {
                            Toast.makeText(ThemeDetail.this.m, f.g.theme_changing_fail, 1).show();
                        }
                        ThemeDetail.this.b("1");
                        return;
                }
            }
        };
    }

    public void g() {
        this.M = true;
    }

    private void setThemeControllText(f fVar) {
        if (ao.b().f() && d(this.z.h())) {
            this.j.setText(f.g.theme_detail_btn_apply);
        } else if (fVar != null && (fVar == f.THEME_HASLOCAL || fVar == f.LOCAL_THEME)) {
            this.j.setText(f.g.theme_detail_btn_apply);
        } else {
            this.j.setText(f.g.detail_theme_download);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x01a5  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onFinishInflate() {
        /*
            Method dump skipped, instructions count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.extend.theme.ThemeDetail.onFinishInflate():void");
    }

    private void j() {
        if (!l()) {
            this.r.setVisibility(4);
            this.ad.setVisibility(8);
        }
    }

    private void k() {
        this.r.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean l() {
        return com.tsf.extend.base.j.o.c(getContext());
    }

    private void m() {
        int a2 = PersonalizationActivity.a(getContext(), 2.0f);
        i iVar = new i(442511);
        iVar.a(a2);
        i iVar2 = new i(-16405376);
        iVar2.a(a2);
        i iVar3 = new i(-2565928);
        iVar3.a(a2);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842919}, iVar2);
        stateListDrawable.addState(new int[]{-16842910}, iVar3);
        stateListDrawable.addState(StateSet.WILD_CARD, iVar);
        b(this.j, stateListDrawable);
    }

    private void n() {
        this.f.setBackgroundResource(f.d.lp_theme_download_cover);
    }

    private void o() {
        int a2 = PersonalizationActivity.a(getContext(), 2.0f);
        i iVar = new i(-16334705);
        iVar.a(a2);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(StateSet.WILD_CARD, iVar);
        b(this.k, stateListDrawable);
    }

    private void p() {
        this.k.setBackgroundResource(f.d.lp_theme_download_bg);
    }

    private void q() {
        this.ad = findViewById(f.e.retry);
        this.ad.setBackgroundColor(-1118482);
        ((TextView) this.ad.findViewById(f.e.retry_text)).setTextColor(getResources().getColorStateList(f.d.wallpaper_list_retry_text_color));
        this.ad.setOnClickListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        int top = this.V.getTop();
        if (top >= (-this.ae) && top <= this.ae) {
            float abs = Math.abs(top - this.af) / this.ae;
            int a2 = a(this.ab, abs);
            int a3 = a(this.ac, abs);
            this.d.setBackgroundColor(a2);
            this.d.setTextColor(a3);
        }
    }

    public int a(int i, float f2) {
        return Color.argb(Math.round(Color.alpha(i) * f2), Color.red(i), Color.green(i), Color.blue(i));
    }

    private void a(View view, int i, int i2, int i3, int i4) {
        Rect rect = new Rect();
        view.setEnabled(true);
        view.getHitRect(rect);
        rect.top -= i;
        rect.bottom += i2;
        rect.left -= i3;
        rect.right += i4;
        TouchDelegate touchDelegate = new TouchDelegate(rect, view);
        if (View.class.isInstance(view.getParent())) {
            ((View) view.getParent()).setTouchDelegate(touchDelegate);
        }
    }

    private void s() {
        View inflate = LayoutInflater.from(getContext()).inflate(com.tsf.extend.theme.a.f.a(), (ViewGroup) null);
        this.V = inflate;
        this.e = inflate.findViewById(f.e.theme_detail);
        this.g = inflate.findViewById(f.e.pager_container);
        this.h = (ViewPager) inflate.findViewById(f.e.theme_preview_pager);
        ((ThemeDetailViewPager) this.h).setNestedParent((ViewGroup) this.g);
        this.n = (TextView) inflate.findViewById(f.e.theme_name);
        this.x = (TextView) inflate.findViewById(f.e.theme_size);
        this.o = (LinearLayout) inflate.findViewById(f.e.diy_theme_promotion);
        this.o.setVisibility(8);
        this.i = (TextView) inflate.findViewById(f.e.theme_author);
        this.l = (TextView) inflate.findViewById(f.e.load_relevance_tips);
        this.W = inflate.findViewById(f.e.theme_head_divider);
        t();
        this.r.getListView().addHeaderView(inflate);
    }

    private void t() {
        this.h.setClipToPadding(false);
        this.h.setPageMargin(PersonalizationActivity.a(getContext(), 29.0f));
        int dimensionPixelSize = (getResources().getDisplayMetrics().widthPixels - getResources().getDimensionPixelSize(f.c.theme_detail_pager_image_width)) / 2;
        this.h.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        this.h.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.tsf.extend.theme.ThemeDetail$7] */
    public void setViewPagerBackgroundColor(final Bitmap bitmap) {
        final View view = this.g;
        if (bitmap != null && view != null) {
            new Thread() { // from class: com.tsf.extend.theme.ThemeDetail.7
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    int width = bitmap.getWidth();
                    int i = width / 10;
                    try {
                        final BitmapDrawable bitmapDrawable = new BitmapDrawable(ThemeDetail.this.getResources(), com.tsf.extend.base.j.e.a(Bitmap.createScaledBitmap(bitmap, i, (bitmap.getHeight() * i) / width, true), 15, true));
                        bitmapDrawable.setAlpha(VEasing.Back.easeIn);
                        com.tsf.extend.base.j.z.a(0, new Runnable() { // from class: com.tsf.extend.theme.ThemeDetail.7.1
                            @Override // java.lang.Runnable
                            public void run() {
                                ThemeDetail.b(view, bitmapDrawable);
                            }
                        });
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            }.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(View view, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setBackground(drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    private void u() {
        this.P = new d(a.b.LoadCache);
        v.h().a(this.P, a.b.LoadCache, this.z.h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        if (this.R != null && this.R.size() > 0) {
            this.Q = new d(a.b.LoadMore);
            v.h().a(this.Q, a.b.LoadMore, this.z.h());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        this.t.setVisibility(8);
        this.u.setVisibility(8);
        this.u.setClickable(false);
        this.s.setVisibility(0);
    }

    private void x() {
        this.t.setVisibility(0);
        this.u.setVisibility(8);
        this.u.setClickable(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        this.t.setVisibility(8);
        this.u.setVisibility(0);
        this.u.setClickable(true);
        this.u.setText(f.g.load_more_fail);
    }

    public void a(long j, String str, boolean z, String str2) {
        k kVar = new k();
        kVar.i("");
        kVar.h("");
        kVar.a(0);
        kVar.j("");
        kVar.c("");
        this.N = z;
        if (z) {
            setFromInlet("8");
        }
        this.I = str;
        a(kVar, true);
        this.K = (FrameLayout) findViewById(f.e.theme_detail_progress_view);
        this.L = (ProgressBar) findViewById(f.e.theme_detail_progress);
        this.L.setIndeterminateDrawable(new com.tsf.extend.base.widget.pulltorefresh.d(getContext(), 3));
        this.K.setVisibility(0);
        v.h().a(new e(), j, str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class e implements a.InterfaceC0048a<k> {
        private e() {
        }

        @Override // com.tsf.extend.base.d.a.InterfaceC0048a
        public void a(JSONObject jSONObject, k kVar) {
            a();
            if (kVar != null) {
                ThemeDetail.this.setTheme(kVar);
                if (ThemeDetail.this.h != null && ThemeDetail.this.y != null) {
                    ThemeDetail.this.h();
                }
            }
        }

        @Override // com.tsf.extend.base.d.a.InterfaceC0048a
        public void a(JSONObject jSONObject, int i, k kVar) {
            a();
            ThemeDetail.this.m.onBackPressed();
            int i2 = f.g.theme_detail_data_fail;
            if (ThemeDetail.this.N) {
                i2 = f.g.theme_detail_data_fail_from_wallpaper;
            }
            Toast.makeText(ThemeDetail.this.getContext(), i2, 1).show();
        }

        private void a() {
            if (ThemeDetail.this.K != null && ThemeDetail.this.K.getVisibility() == 0) {
                ThemeDetail.this.K.setVisibility(8);
                ThemeDetail.this.K = null;
                ThemeDetail.this.L = null;
            }
        }
    }

    public void setTheme(k kVar) {
        a(kVar, false);
    }

    public void a(String str, String str2) {
        this.G = str;
        this.H = str2;
    }

    public void setFromTab(String str) {
        this.I = str;
    }

    public void setNewEntry(String str) {
        this.ag = com.tsf.extend.base.j.m.a();
        this.ah = true;
        com.tsf.extend.base.j.m.a(str);
    }

    private void a(k kVar, boolean z) {
        aq a2;
        if (kVar != null) {
            if (ao.b().g() && com.tsf.extend.wallpaper.l.a().e(kVar) == null && (a2 = com.tsf.extend.theme.diy.e.a(getContext(), kVar)) != null) {
                kVar = a2;
            }
            if ((kVar instanceof com.tsf.extend.theme.f) || (kVar instanceof aq)) {
                this.D = f.LOCAL_THEME;
                k();
            } else {
                v.h();
                if (v.c(kVar.g()) != null) {
                    this.D = f.THEME_HASLOCAL;
                } else {
                    this.D = f.THEME_NETLOCAL;
                }
            }
            this.z = kVar;
            A();
            if (!z) {
                a("0");
            }
            if (!TextUtils.isEmpty(this.z.i())) {
                if (this.x != null) {
                    this.n.setText(this.z.i());
                    this.x.setText(" (" + this.z.p() + ")");
                    this.d.setText(this.z.i());
                } else {
                    this.n.setText(this.z.i() + " (" + this.z.p() + ")");
                    this.d.setText(this.z.i());
                }
            }
            if (this.D == f.LOCAL_THEME) {
                this.l.setVisibility(8);
                if (this.z instanceof com.tsf.extend.theme.f) {
                    this.B = ((com.tsf.extend.theme.f) this.z).b();
                } else if (this.z instanceof aq) {
                    this.A = this.z.t();
                    if ((this.z instanceof com.tsf.extend.theme.b) && ((com.tsf.extend.theme.b) this.z).e()) {
                        com.tsf.extend.base.b.a a3 = v.h().a(this.z.h());
                        if (a3 != null && a3.a() != null) {
                            a(a3, false);
                        } else {
                            u();
                        }
                    }
                }
            } else {
                this.A = this.z.t();
                com.tsf.extend.base.b.a a4 = v.h().a(this.z.h());
                if (a4 != null && a4.a() != null) {
                    a(a4, false);
                } else {
                    u();
                }
            }
            this.i.setText("by " + this.z.q());
            this.i.setVisibility(0);
            setThemeControllText(this.D);
            if (this.A != null && this.A.size() > 1) {
                this.C = this.A.size();
            } else if (this.B != null && this.B.size() > 1) {
                this.C = this.B.size();
            } else if (this.A != null && this.A.size() >= 0 && (this.z instanceof aq)) {
                this.C = this.A.size();
            }
            if (!z) {
                F();
                this.J = System.currentTimeMillis();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.h != null) {
            com.tsf.extend.base.j.b.a(this.h, this);
        }
        z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z() {
        if (this.E != null && this.E.isShowing()) {
            try {
                this.E.dismiss();
            } catch (Exception e2) {
            }
            this.E = null;
        }
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.a
    public boolean getPendingTransition() {
        return true;
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.a
    public View getContent() {
        return this;
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.a
    public void a(PageActivity pageActivity) {
        this.m = pageActivity;
        if (pageActivity instanceof PersonalizationActivity) {
            ((PersonalizationActivity) this.m).a((PersonalizationActivity.n) this);
        }
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.a
    public void a() {
        if (ao.b().g()) {
            com.tsf.extend.wallpaper.l.a().a(this);
            k e2 = com.tsf.extend.wallpaper.l.a().e(this.z);
            if (e2 != null) {
                this.j.setText(getResources().getString(f.g.lp_theme_downloading));
                a(e2.G() / 100.0f);
            }
        }
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.a
    public void b() {
        if (ao.b().g()) {
            com.tsf.extend.wallpaper.l.a().b(this);
        }
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.a
    public void f() {
        if (this.H.equals("0")) {
        }
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.a
    public void d() {
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.a
    public Bundle getResult() {
        return null;
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.a
    public void c() {
        if (this.m != null && (this.m instanceof PersonalizationActivity)) {
            ((PersonalizationActivity) this.m).b((PersonalizationActivity.n) this);
        }
        this.a.clear();
        if (this.ai != null) {
            this.ai.removeMessages(0);
            this.ai.removeMessages(1);
        }
        if (this.R.size() > 0) {
            E();
        }
        H();
        if (this.ah) {
            com.tsf.extend.base.j.m.a(this.ag);
        }
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.a
    public boolean e() {
        a("51", this.H, this.G);
        return false;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        a(view);
        int id = view.getId();
        if (id == f.e.title) {
            this.m.onBackPressed();
        } else if (id == f.e.theme_controll) {
            if (this.z != null) {
                this.m.a(false);
                if (this.K == null || this.K.getVisibility() != 0) {
                    long h = this.z.h();
                    if (this.D == f.THEME_HASLOCAL || this.D == f.LOCAL_THEME || ((ao.b().f() && d(h)) || this.aj != null)) {
                        if (com.tsf.extend.base.j.f.a(getContext(), "com.ksmobile.launcher")) {
                            Intent intent = new Intent();
                            intent.setComponent(new ComponentName("com.ksmobile.launcher", "com.ksmobile.launcher.Launcher"));
                            getContext().startActivity(intent);
                        } else {
                            x.b(getContext(), "https://play.google.com/store/apps/details?id=com.ksmobile.launcher", "&referrer=utm_source%3Dtsf_theme_center_theme_cmlauncher" + h);
                        }
                    } else if (!TextUtils.isEmpty(this.z.E()) && ao.b().g()) {
                        k e2 = com.tsf.extend.wallpaper.l.a().e(this.z);
                        if (e2 != null && !e2.H()) {
                            e2.e(true);
                            this.j.setClickable(false);
                            return;
                        } else if (TextUtils.isEmpty(this.z.E())) {
                            Toast.makeText(getContext(), getResources().getString(f.g.lp_theme_not_available), 0).show();
                        } else if (com.tsf.extend.wallpaper.l.a().a(this.z)) {
                            this.j.setText(getResources().getString(f.g.lp_theme_downloading));
                            p();
                        } else {
                            Toast.makeText(getContext(), getResources().getString(f.g.lp_theme_downloading_full), 0).show();
                        }
                    } else {
                        a("1");
                        x.b(getContext(), this.z.k(), "_bt", "tsf_theme_center_theme");
                        v.h().b(this.z.h());
                        a("1", "1010", "1012");
                    }
                    c("12");
                }
            }
        } else if (id == f.e.favorite_theme) {
            boolean z = this.p.isSelected() ? false : true;
            this.p.setSelected(z);
            if (z) {
                a("10");
                D();
                B();
            } else {
                a("11");
                C();
            }
            c("16");
        } else if (id == f.e.loadmore_tips) {
            this.t.setVisibility(0);
            this.u.setVisibility(8);
            v();
        } else if (id == f.e.diy_btn) {
            ThemeDIYActivity.a(getContext(), "1001", 1);
        } else if (id == f.e.theme_item_download_layout_left) {
            a(view.findViewById(f.e.theme_download_left), true);
        } else if (id == f.e.theme_item_download_layout_right) {
            a(view.findViewById(f.e.theme_download_right), true);
        } else if (id == f.e.theme_item_download_layout_mid) {
            a(view.findViewById(f.e.theme_download_mid), true);
        } else if (id == f.e.theme_item_left || id == f.e.theme_item_right || id == f.e.theme_item_mid) {
            a(view, false);
        } else if (id == f.e.retry) {
            if (l()) {
                this.r.setVisibility(0);
                this.ad.setVisibility(8);
                u();
                h();
            }
        } else if (view instanceof ImageView) {
            a(this.a.indexOf(view));
        }
    }

    public void a(View view) {
        boolean z = true;
        int id = view.getId();
        if (id != f.e.title && id != f.e.theme_controll && id != f.e.favorite_theme && id != f.e.loadmore_tips && id != f.e.diy_btn && id != f.e.theme_item_left && id != f.e.theme_item_right && id != f.e.theme_item_download_layout_left && id != f.e.theme_item_download_layout_right && !(view instanceof ImageView)) {
            z = false;
        }
        if (z) {
        }
    }

    private void a(View view, boolean z) {
        k kVar;
        if (Math.abs(this.S - System.currentTimeMillis()) > 1000) {
            if (z) {
                kVar = (k) view.getTag();
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
                    kVar = tag instanceof k ? (k) tag : null;
                }
            }
            if (kVar != null) {
                this.m.a(false);
                if (ao.b().g()) {
                    ThemeDetail themeDetail = (ThemeDetail) LayoutInflater.from(getContext()).inflate(f.C0052f.theme_detail, (ViewGroup) null);
                    themeDetail.setFromInlet(this.F);
                    themeDetail.setFromTab("detail");
                    themeDetail.setTheme(kVar);
                    themeDetail.a("1010", "1010");
                    if (getContext() instanceof PageActivity) {
                        ((PageActivity) getContext()).b(themeDetail);
                    }
                } else {
                    x.a(getContext(), kVar.k(), "tsf_theme_center_theme");
                }
                a("14", "0", "0", kVar.g());
                this.S = System.currentTimeMillis();
                if (z) {
                    d(kVar);
                } else {
                    e(kVar);
                }
            }
        }
    }

    private void d(k kVar) {
        a("3", kVar.h(), kVar.B());
    }

    private void e(k kVar) {
        a("2", kVar.h(), kVar.B());
    }

    private void a(String str, long j, String str2) {
    }

    private void A() {
        final k kVar = this.z;
        final Context context = getContext();
        final ImageView imageView = this.p;
        com.tsf.extend.base.j.z.a(1, new Runnable() { // from class: com.tsf.extend.theme.ThemeDetail.8
            @Override // java.lang.Runnable
            public void run() {
                final boolean c2 = com.tsf.extend.theme.e.a().c(context, kVar);
                com.tsf.extend.base.j.z.a(0, new Runnable() { // from class: com.tsf.extend.theme.ThemeDetail.8.1
                    @Override // java.lang.Runnable
                    public void run() {
                        imageView.setSelected(c2);
                    }
                });
            }
        });
    }

    private void B() {
        com.tsf.extend.theme.e.a().a(getContext(), this.z);
        if (!(this.z instanceof aq)) {
            w.a(this.z, getContext());
        }
    }

    private void C() {
        com.tsf.extend.theme.e.a().b(getContext(), this.z);
    }

    private void D() {
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), f.a.wallpaper_favorite_anim_in);
        final Animation loadAnimation2 = AnimationUtils.loadAnimation(getContext(), f.a.wallpaper_favorite_anim_out);
        loadAnimation2.setAnimationListener(new Animation.AnimationListener() { // from class: com.tsf.extend.theme.ThemeDetail.9
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                ThemeDetail.this.q.setVisibility(8);
            }
        });
        final Runnable runnable = new Runnable() { // from class: com.tsf.extend.theme.ThemeDetail.10
            @Override // java.lang.Runnable
            public void run() {
                ThemeDetail.this.q.startAnimation(loadAnimation2);
            }
        };
        loadAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.tsf.extend.theme.ThemeDetail.11
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
        this.q.setVisibility(0);
        this.q.startAnimation(loadAnimation);
    }

    private void a(int i) {
        if (this.K == null || this.K.getVisibility() != 0) {
            ab abVar = new ab(getContext());
            if (this.z instanceof aq) {
                abVar.a(this.z.t(), i);
            } else if (this.D == f.LOCAL_THEME) {
                abVar.a(this.z.g(), this.B, i);
            } else {
                abVar.b(this.A, i);
            }
            this.m.a(abVar);
            String str = this.H;
            if (str.equals("0")) {
                str = "1010";
            }
            a("4", str, "1011");
        }
    }

    private void a(String str) {
        a(str, "0", "0");
    }

    private void a(String str, String str2, String str3) {
        a(str, str2, str3, "0");
    }

    private void a(String str, String str2, String str3, String str4) {
        if (this.z == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        if (this.z == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c extends com.tsf.extend.base.support.a {
        private a b;
        private FrameLayout.LayoutParams c = new FrameLayout.LayoutParams(-1, -1);

        public c() {
            this.b = new a();
        }

        @Override // com.tsf.extend.base.support.a
        public int a() {
            return ThemeDetail.this.C;
        }

        @Override // com.tsf.extend.base.support.a
        public Object a(ViewGroup viewGroup, final int i) {
            final ImageView imageView = new ImageView(viewGroup.getContext());
            if (ThemeDetail.this.C == 1) {
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setImageResource(f.b.personal_list_item_bg);
            } else {
                imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                imageView.setBackgroundResource(f.b.personal_list_item_bg);
            }
            ThemeDetail.this.a.add(imageView);
            if (ThemeDetail.this.D != f.LOCAL_THEME) {
                if (ThemeDetail.this.A != null) {
                    String str = (String) ThemeDetail.this.A.get(i);
                    b bVar = new b();
                    bVar.a = str;
                    bVar.b = i;
                    imageView.setTag(bVar);
                    v.h().c(str, this.b);
                }
            } else {
                a.InterfaceC0048a<v.b> interfaceC0048a = new a.InterfaceC0048a<v.b>() { // from class: com.tsf.extend.theme.ThemeDetail.c.1
                    @Override // com.tsf.extend.base.d.a.InterfaceC0048a
                    public void a(JSONObject jSONObject, v.b bVar2) {
                        if (imageView != null && bVar2 != null) {
                            imageView.setImageBitmap(bVar2.b);
                            if (i == 1) {
                                ThemeDetail.this.setViewPagerBackgroundColor(bVar2.b);
                            }
                        }
                    }

                    @Override // com.tsf.extend.base.d.a.InterfaceC0048a
                    public void a(JSONObject jSONObject, int i2, v.b bVar2) {
                    }
                };
                if (!(ThemeDetail.this.z instanceof aq)) {
                    if (ThemeDetail.this.B != null && ThemeDetail.this.z != null) {
                        v.h().a(((Integer) ThemeDetail.this.B.get(i)).intValue(), ThemeDetail.this.z.g(), interfaceC0048a, 2);
                    }
                } else {
                    v.h().a(ThemeDetail.this.z.g(), (aq) ThemeDetail.this.z, interfaceC0048a, 1, i);
                }
            }
            imageView.setOnClickListener(ThemeDetail.this);
            imageView.setSoundEffectsEnabled(true);
            viewGroup.addView(imageView, this.c);
            return imageView;
        }

        @Override // com.tsf.extend.base.support.a
        public void a(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
            ThemeDetail.this.a.remove(obj);
        }

        @Override // com.tsf.extend.base.support.a
        public boolean a(View view, Object obj) {
            return view == obj;
        }
    }

    /* loaded from: classes.dex */
    class a implements a.InterfaceC0048a<Pair<String, Bitmap>> {
        int a = 0;
        int b = 0;

        a() {
        }

        @Override // com.tsf.extend.base.d.a.InterfaceC0048a
        public void a(JSONObject jSONObject, Pair<String, Bitmap> pair) {
            this.a++;
            a();
            if (pair != null) {
                String str = (String) pair.first;
                Bitmap bitmap = (Bitmap) pair.second;
                if (!TextUtils.isEmpty(str) && bitmap != null) {
                    for (ImageView imageView : ThemeDetail.this.a) {
                        b bVar = (b) imageView.getTag();
                        if (bVar.a.equals(str)) {
                            imageView.setImageBitmap(bitmap);
                            if (bVar.b == 1) {
                                ThemeDetail.this.setViewPagerBackgroundColor(bitmap);
                            }
                        }
                    }
                }
            }
        }

        @Override // com.tsf.extend.base.d.a.InterfaceC0048a
        public void a(JSONObject jSONObject, int i, Pair<String, Bitmap> pair) {
            this.b++;
            a();
        }

        private void a() {
            int min;
            if (ThemeDetail.this.r.getVisibility() != 0 && this.a + this.b >= (min = Math.min(ThemeDetail.this.C, 3))) {
                if (this.a >= min || ThemeDetail.this.l()) {
                    ThemeDetail.this.r.setVisibility(0);
                    ThemeDetail.this.ad.setVisibility(8);
                } else {
                    ThemeDetail.this.r.setVisibility(4);
                    ThemeDetail.this.ad.setVisibility(0);
                }
                this.a = 0;
                this.b = 0;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b {
        String a;
        int b;

        b() {
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.tsf.extend.base.j.b.a(this.h, this);
        h();
        this.af = this.V.getTop();
        this.ae = Math.abs(this.W.getTop() - this.af) - this.aa.getHeight();
        this.ae = Math.max(this.ae, 1);
    }

    public void h() {
        this.y = new c();
        this.h.setAdapter(this.y);
    }

    @Override // com.tsf.extend.wallpaper.PersonalizationActivity.n
    public void a(String str, PersonalizationActivity.n.a aVar) {
        if (!TextUtils.isEmpty(str)) {
            v.h().a(this);
            if (this.z != null && !TextUtils.isEmpty(str) && str.equals(this.z.g()) && aVar != null) {
                if (aVar == PersonalizationActivity.n.a.ADD) {
                    this.D = f.THEME_HASLOCAL;
                    setThemeControllText(this.D);
                    return;
                }
                this.m.onBackPressed();
            }
        }
    }

    public void setFromInlet(String str) {
        this.F = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        if (i == -1) {
            Context context = getContext();
            if (context instanceof PageActivity) {
                ((PageActivity) context).onBackPressed();
            }
        }
    }

    public void a(List<k> list, boolean z) {
        String str;
        if (!z) {
            this.R.clear();
        }
        if (this.R.size() == 0 && (list == null || list.size() == 0)) {
            this.O.notifyDataSetChanged();
            return;
        }
        if (this.m == null) {
            str = null;
        } else {
            str = ((PersonalizationActivity) this.m).f();
        }
        if (str != null && str.startsWith("DIY://")) {
            for (k kVar : list) {
                if (kVar instanceof aq) {
                    if (!TextUtils.isEmpty(str) && str.contains(((aq) kVar).I())) {
                        kVar.b(true);
                    } else {
                        kVar.b(false);
                    }
                }
            }
        } else {
            for (k kVar2 : list) {
                if (!TextUtils.isEmpty(str) && str.equals(kVar2.g())) {
                    kVar2.b(true);
                } else {
                    kVar2.b(false);
                }
            }
        }
        if (!this.U) {
            this.U = true;
            G();
        }
        this.O.a(this.R, list);
        this.O.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements a.InterfaceC0048a<com.tsf.extend.base.b.a> {
        private final a.b b;

        public d(a.b bVar) {
            this.b = bVar;
        }

        @Override // com.tsf.extend.base.d.a.InterfaceC0048a
        public void a(JSONObject jSONObject, final com.tsf.extend.base.b.a aVar) {
            com.tsf.extend.base.j.z.a(0, new Runnable() { // from class: com.tsf.extend.theme.ThemeDetail.d.1
                @Override // java.lang.Runnable
                public void run() {
                    ThemeDetail.this.a(aVar, d.this.b == a.b.LoadMore);
                }
            });
        }

        @Override // com.tsf.extend.base.d.a.InterfaceC0048a
        public void a(JSONObject jSONObject, int i, com.tsf.extend.base.b.a aVar) {
            com.tsf.extend.base.j.z.a(0, new Runnable() { // from class: com.tsf.extend.theme.ThemeDetail.d.2
                @Override // java.lang.Runnable
                public void run() {
                    if (ThemeDetail.this.R.size() > 0) {
                        ThemeDetail.this.y();
                    } else {
                        ThemeDetail.this.w();
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.tsf.extend.base.b.a aVar, boolean z) {
        p pVar = null;
        if (aVar instanceof p) {
            pVar = (p) aVar;
        }
        this.T = pVar.b();
        if (!this.T) {
            w();
        } else {
            x();
            this.r.b(false);
        }
        if ((this.R.size() == 0) && aVar.a() != null && aVar.a().size() > 0) {
            this.l.setVisibility(0);
        }
        a(aVar.a(), z);
        v.h().a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<k> list) {
        for (t.b bVar : this.R) {
            k kVar = bVar.a;
            k kVar2 = bVar.b;
            kVar.d(false);
            if (kVar2 != null) {
                kVar2.d(false);
            }
            for (k kVar3 : list) {
                if (kVar3 != null && !(kVar3 instanceof aq)) {
                    if (kVar3.g().equals(kVar.g())) {
                        kVar.d(true);
                    }
                    if (kVar2 != null && kVar3.g().equals(kVar2.g())) {
                        kVar2.d(true);
                    }
                }
            }
        }
        this.O.notifyDataSetChanged();
    }

    @Override // com.tsf.extend.base.d.a.InterfaceC0048a
    public void a(JSONObject jSONObject, final List<k> list) {
        if (list != null) {
            com.tsf.extend.base.j.z.a(0, new Runnable() { // from class: com.tsf.extend.theme.ThemeDetail.2
                @Override // java.lang.Runnable
                public void run() {
                    if (ThemeDetail.this.R != null) {
                        ThemeDetail.this.a(list);
                    }
                }
            });
        }
    }

    @Override // com.tsf.extend.base.d.a.InterfaceC0048a
    public void a(JSONObject jSONObject, int i, List<k> list) {
    }

    public void i() {
        this.o.setVisibility(0);
        this.e.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.tsf.extend.theme.ThemeDetail.3
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                ViewGroup.LayoutParams layoutParams = ThemeDetail.this.e.getLayoutParams();
                int c2 = ((com.tsf.extend.base.j.p.c() - ThemeDetail.this.getResources().getDimensionPixelSize(f.c.workspace_margin_top)) - ThemeDetail.this.getResources().getDimensionPixelSize(f.c.theme_detail_recommed_height)) + ThemeDetail.this.o.getHeight() + ThemeDetail.this.getResources().getDimensionPixelSize(f.c.theme_detail_theme_promotion_margin);
                if (layoutParams == null) {
                    layoutParams = new ViewGroup.LayoutParams(-1, c2);
                } else {
                    layoutParams.height = c2;
                }
                ThemeDetail.this.e.setLayoutParams(layoutParams);
                int height = ThemeDetail.this.e.getHeight() - c2;
                if (height > -3 && height < 3) {
                    ThemeDetail.this.h();
                    com.tsf.extend.base.j.b.a(ThemeDetail.this.e, this);
                }
            }
        });
    }

    private void c(String str) {
        if (this.z != null) {
            if (!"new".equals(this.I) && !"hot".equals(this.I) && !"banner".equals(this.I)) {
                String str2 = this.I;
            }
            Object a2 = com.tsf.extend.base.b.a.a.a().a(this.I);
            if (a2 instanceof com.tsf.extend.base.b.a) {
                com.tsf.extend.base.b.a aVar = (com.tsf.extend.base.b.a) a2;
            }
        }
    }

    private void E() {
        if (this.z != null) {
            if (!m.j[0].equals(this.I) && !m.j[1].equals(this.I) && m.j[3].equals(this.I)) {
            }
            Object a2 = com.tsf.extend.base.b.a.a.a().a(this.I);
            if (a2 instanceof com.tsf.extend.base.b.a) {
                com.tsf.extend.base.b.a aVar = (com.tsf.extend.base.b.a) a2;
            }
        }
    }

    private void F() {
        if (this.z != null) {
            Object a2 = com.tsf.extend.base.b.a.a.a().a(this.I);
            if (a2 instanceof com.tsf.extend.base.b.a) {
                com.tsf.extend.base.b.a aVar = (com.tsf.extend.base.b.a) a2;
            }
        }
    }

    private void G() {
        if (this.z != null) {
            Object a2 = com.tsf.extend.base.b.a.a.a().a(this.I);
            if (a2 instanceof com.tsf.extend.base.b.a) {
                com.tsf.extend.base.b.a aVar = (com.tsf.extend.base.b.a) a2;
            }
        }
    }

    private void H() {
        if (this.z != null) {
            Object a2 = com.tsf.extend.base.b.a.a.a().a(this.I);
            if (a2 instanceof com.tsf.extend.base.b.a) {
                com.tsf.extend.base.b.a aVar = (com.tsf.extend.base.b.a) a2;
            }
        }
    }

    public boolean a(long j) {
        return j == 713;
    }

    public boolean b(long j) {
        return j == 471;
    }

    public boolean c(long j) {
        return j == 1185;
    }

    public boolean d(long j) {
        return a(j) || b(j) || c(j);
    }

    @Override // com.tsf.extend.wallpaper.l.a
    public void a(k kVar) {
        if (kVar.h() == this.z.h()) {
            this.f.setVisibility(0);
            this.j.setText(getResources().getString(f.g.lp_theme_downloading));
        }
    }

    @Override // com.tsf.extend.wallpaper.l.a
    public void a(k kVar, float f2) {
        if (kVar.h() == this.z.h()) {
            this.f.setVisibility(0);
            this.j.setText(getResources().getString(f.g.lp_theme_downloading));
            a(f2 / 100.0f);
        }
    }

    @Override // com.tsf.extend.wallpaper.l.a
    public void a(k kVar, com.tsf.extend.theme.b bVar) {
        if (kVar.h() == this.z.h()) {
            this.j.setText(f.g.theme_detail_btn_apply);
            this.f.setVisibility(8);
            this.aj = bVar;
            o();
        }
    }

    @Override // com.tsf.extend.wallpaper.l.a
    public void b(k kVar) {
        if (kVar.h() == this.z.h()) {
            this.j.setText(getResources().getString(f.g.lp_theme_downloading_fail));
            a(0.0f);
            o();
        }
    }

    @Override // com.tsf.extend.wallpaper.l.a
    public void c(k kVar) {
        if (kVar.h() == this.z.h()) {
            setThemeControllText(this.D);
            a(0.0f);
            this.j.setClickable(true);
            o();
        }
    }

    private void a(float f2) {
        ViewGroup.LayoutParams layoutParams = this.f.getLayoutParams();
        layoutParams.width = Math.round(this.j.getWidth() * f2);
        this.f.setLayoutParams(layoutParams);
    }
}
