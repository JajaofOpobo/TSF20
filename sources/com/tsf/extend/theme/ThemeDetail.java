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
import com.tsf.extend.C1536f;
import com.tsf.extend.base.actstru.model.activi.PageActivity;
import com.tsf.extend.base.p071b.C1368a;
import com.tsf.extend.base.p071b.p072a.C1369a;
import com.tsf.extend.base.p074d.AbstractC1386a;
import com.tsf.extend.base.p080j.C1421b;
import com.tsf.extend.base.p080j.C1426e;
import com.tsf.extend.base.p080j.C1427f;
import com.tsf.extend.base.p080j.C1434m;
import com.tsf.extend.base.p080j.C1436o;
import com.tsf.extend.base.p080j.C1437p;
import com.tsf.extend.base.p080j.C1455z;
import com.tsf.extend.base.support.AbstractC1468a;
import com.tsf.extend.base.support.ViewPager;
import com.tsf.extend.base.widget.pulltorefresh.C1518d;
import com.tsf.extend.base.widget.pulltorefresh.PullToRefreshAndLoadMoreListView;
import com.tsf.extend.theme.C1887t;
import com.tsf.extend.theme.C1894v;
import com.tsf.extend.theme.diy.C1821e;
import com.tsf.extend.theme.diy.ThemeDIYActivity;
import com.tsf.extend.theme.p082a.C1651f;
import com.tsf.extend.wallpaper.C2087l;
import com.tsf.extend.wallpaper.PersonalizationActivity;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class ThemeDetail extends FrameLayout implements DialogInterface.OnClickListener, View.OnClickListener, ViewTreeObserver.OnGlobalLayoutListener, PageActivity.InterfaceC1352a, AbstractC1386a.InterfaceC1396a<List<C1848k>>, PersonalizationActivity.InterfaceC1954n, C2087l.InterfaceC2093a {

    /* renamed from: b */
    public static final int[] f5071b = {C1536f.C1541e.title, C1536f.C1541e.favorite_theme, C1536f.C1541e.diy_btn, C1536f.C1541e.loadmore_tips, C1536f.C1541e.theme_controll};

    /* renamed from: A */
    private List<String> f5072A;

    /* renamed from: B */
    private List<Integer> f5073B;

    /* renamed from: C */
    private int f5074C;

    /* renamed from: D */
    private EnumC1619f f5075D;

    /* renamed from: E */
    private DialogC1859o f5076E;

    /* renamed from: F */
    private String f5077F;

    /* renamed from: G */
    private String f5078G;

    /* renamed from: H */
    private String f5079H;

    /* renamed from: I */
    private String f5080I;

    /* renamed from: J */
    private long f5081J;

    /* renamed from: K */
    private FrameLayout f5082K;

    /* renamed from: L */
    private ProgressBar f5083L;

    /* renamed from: M */
    private boolean f5084M;

    /* renamed from: N */
    private boolean f5085N;

    /* renamed from: O */
    private C1887t f5086O;

    /* renamed from: P */
    private C1615d f5087P;

    /* renamed from: Q */
    private C1615d f5088Q;

    /* renamed from: R */
    private List<C1887t.C1890b> f5089R;

    /* renamed from: S */
    private long f5090S;

    /* renamed from: T */
    private boolean f5091T;

    /* renamed from: U */
    private boolean f5092U;

    /* renamed from: V */
    private View f5093V;

    /* renamed from: W */
    private View f5094W;

    /* renamed from: a */
    public List<ImageView> f5095a;

    /* renamed from: aa */
    private View f5096aa;

    /* renamed from: ab */
    private int f5097ab;

    /* renamed from: ac */
    private int f5098ac;

    /* renamed from: ad */
    private View f5099ad;

    /* renamed from: ae */
    private int f5100ae;

    /* renamed from: af */
    private int f5101af;

    /* renamed from: ag */
    private String f5102ag;

    /* renamed from: ah */
    private boolean f5103ah;
    @SuppressLint({"HandlerLeak"})

    /* renamed from: ai */
    private Handler f5104ai;

    /* renamed from: aj */
    private C1703b f5105aj;

    /* renamed from: c */
    private ImageView f5106c;

    /* renamed from: d */
    private TextView f5107d;

    /* renamed from: e */
    private View f5108e;

    /* renamed from: f */
    private View f5109f;

    /* renamed from: g */
    private View f5110g;

    /* renamed from: h */
    private ViewPager f5111h;

    /* renamed from: i */
    private TextView f5112i;

    /* renamed from: j */
    private TextView f5113j;

    /* renamed from: k */
    private View f5114k;

    /* renamed from: l */
    private TextView f5115l;

    /* renamed from: m */
    private PageActivity f5116m;

    /* renamed from: n */
    private TextView f5117n;

    /* renamed from: o */
    private LinearLayout f5118o;

    /* renamed from: p */
    private ImageView f5119p;

    /* renamed from: q */
    private View f5120q;

    /* renamed from: r */
    private PullToRefreshAndLoadMoreListView f5121r;

    /* renamed from: s */
    private View f5122s;

    /* renamed from: t */
    private ProgressBar f5123t;

    /* renamed from: u */
    private TextView f5124u;

    /* renamed from: v */
    private View f5125v;

    /* renamed from: w */
    private View f5126w;

    /* renamed from: x */
    private TextView f5127x;

    /* renamed from: y */
    private C1613c f5128y;

    /* renamed from: z */
    private C1848k f5129z;

    /* renamed from: com.tsf.extend.theme.ThemeDetail$f */
    /* loaded from: classes.dex */
    public enum EnumC1619f {
        LOCAL_THEME,
        THEME_HASLOCAL,
        THEME_NETLOCAL
    }

    public ThemeDetail(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5074C = 0;
        this.f5095a = Lists.newArrayList();
        this.f5078G = "0";
        this.f5079H = "0";
        this.f5080I = "";
        this.f5081J = 0L;
        this.f5082K = null;
        this.f5083L = null;
        this.f5089R = new ArrayList();
        this.f5090S = 0L;
        this.f5091T = false;
        this.f5092U = false;
        this.f5097ab = -16334962;
        this.f5098ac = -1;
        this.f5104ai = new Handler() { // from class: com.tsf.extend.theme.ThemeDetail.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                switch (message.what) {
                    case 0:
                        if (ThemeDetail.this.f5116m != null) {
                            ThemeDetail.this.f5116m.setResult(-1);
                            ThemeDetail.this.f5116m.finish();
                        }
                        if ((ThemeDetail.this.f5129z instanceof C1703b) && ((C1703b) ThemeDetail.this.f5129z).m7748e()) {
                            C1696ao.m7774b().m7767i();
                        }
                        if (ThemeDetail.this.f5105aj != null) {
                            C1696ao.m7774b().m7767i();
                        }
                        ThemeDetail.this.m8082b("0");
                        return;
                    default:
                        ThemeDetail.this.m8034z();
                        if (ThemeDetail.this.f5116m != null) {
                            Toast.makeText(ThemeDetail.this.f5116m, C1536f.C1543g.theme_changing_fail, 1).show();
                        }
                        ThemeDetail.this.m8082b("1");
                        return;
                }
            }
        };
    }

    /* renamed from: g */
    public void m8072g() {
        this.f5084M = true;
    }

    private void setThemeControllText(EnumC1619f enumC1619f) {
        if (C1696ao.m7774b().m7770f() && m8078d(this.f5129z.m7297h())) {
            this.f5113j.setText(C1536f.C1543g.theme_detail_btn_apply);
        } else if (enumC1619f != null && (enumC1619f == EnumC1619f.THEME_HASLOCAL || enumC1619f == EnumC1619f.LOCAL_THEME)) {
            this.f5113j.setText(C1536f.C1543g.theme_detail_btn_apply);
        } else {
            this.f5113j.setText(C1536f.C1543g.detail_theme_download);
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

    /* renamed from: j */
    private void m8066j() {
        if (!m8062l()) {
            this.f5121r.setVisibility(4);
            this.f5099ad.setVisibility(8);
        }
    }

    /* renamed from: k */
    private void m8064k() {
        this.f5121r.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public boolean m8062l() {
        return C1436o.m8624c(getContext());
    }

    /* renamed from: m */
    private void m8060m() {
        int m7012a = PersonalizationActivity.m7012a(getContext(), 2.0f);
        C1845i c1845i = new C1845i(442511);
        c1845i.m7339a(m7012a);
        C1845i c1845i2 = new C1845i(-16405376);
        c1845i2.m7339a(m7012a);
        C1845i c1845i3 = new C1845i(-2565928);
        c1845i3.m7339a(m7012a);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842919}, c1845i2);
        stateListDrawable.addState(new int[]{-16842910}, c1845i3);
        stateListDrawable.addState(StateSet.WILD_CARD, c1845i);
        m8084b(this.f5113j, stateListDrawable);
    }

    /* renamed from: n */
    private void m8058n() {
        this.f5109f.setBackgroundResource(C1536f.C1540d.lp_theme_download_cover);
    }

    /* renamed from: o */
    private void m8056o() {
        int m7012a = PersonalizationActivity.m7012a(getContext(), 2.0f);
        C1845i c1845i = new C1845i(-16334705);
        c1845i.m7339a(m7012a);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(StateSet.WILD_CARD, c1845i);
        m8084b(this.f5114k, stateListDrawable);
    }

    /* renamed from: p */
    private void m8054p() {
        this.f5114k.setBackgroundResource(C1536f.C1540d.lp_theme_download_bg);
    }

    /* renamed from: q */
    private void m8052q() {
        this.f5099ad = findViewById(C1536f.C1541e.retry);
        this.f5099ad.setBackgroundColor(-1118482);
        ((TextView) this.f5099ad.findViewById(C1536f.C1541e.retry_text)).setTextColor(getResources().getColorStateList(C1536f.C1540d.wallpaper_list_retry_text_color));
        this.f5099ad.setOnClickListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public void m8050r() {
        int top = this.f5093V.getTop();
        if (top >= (-this.f5100ae) && top <= this.f5100ae) {
            float abs = Math.abs(top - this.f5101af) / this.f5100ae;
            int m8110a = m8110a(this.f5097ab, abs);
            int m8110a2 = m8110a(this.f5098ac, abs);
            this.f5107d.setBackgroundColor(m8110a);
            this.f5107d.setTextColor(m8110a2);
        }
    }

    /* renamed from: a */
    public int m8110a(int i, float f) {
        return Color.argb(Math.round(Color.alpha(i) * f), Color.red(i), Color.green(i), Color.blue(i));
    }

    /* renamed from: a */
    private void m8106a(View view, int i, int i2, int i3, int i4) {
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

    /* renamed from: s */
    private void m8048s() {
        View inflate = LayoutInflater.from(getContext()).inflate(C1651f.m7935a(), (ViewGroup) null);
        this.f5093V = inflate;
        this.f5108e = inflate.findViewById(C1536f.C1541e.theme_detail);
        this.f5110g = inflate.findViewById(C1536f.C1541e.pager_container);
        this.f5111h = (ViewPager) inflate.findViewById(C1536f.C1541e.theme_preview_pager);
        ((ThemeDetailViewPager) this.f5111h).setNestedParent((ViewGroup) this.f5110g);
        this.f5117n = (TextView) inflate.findViewById(C1536f.C1541e.theme_name);
        this.f5127x = (TextView) inflate.findViewById(C1536f.C1541e.theme_size);
        this.f5118o = (LinearLayout) inflate.findViewById(C1536f.C1541e.diy_theme_promotion);
        this.f5118o.setVisibility(8);
        this.f5112i = (TextView) inflate.findViewById(C1536f.C1541e.theme_author);
        this.f5115l = (TextView) inflate.findViewById(C1536f.C1541e.load_relevance_tips);
        this.f5094W = inflate.findViewById(C1536f.C1541e.theme_head_divider);
        m8046t();
        this.f5121r.getListView().addHeaderView(inflate);
    }

    /* renamed from: t */
    private void m8046t() {
        this.f5111h.setClipToPadding(false);
        this.f5111h.setPageMargin(PersonalizationActivity.m7012a(getContext(), 29.0f));
        int dimensionPixelSize = (getResources().getDisplayMetrics().widthPixels - getResources().getDimensionPixelSize(C1536f.C1539c.theme_detail_pager_image_width)) / 2;
        this.f5111h.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        this.f5111h.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.tsf.extend.theme.ThemeDetail$7] */
    public void setViewPagerBackgroundColor(final Bitmap bitmap) {
        final View view = this.f5110g;
        if (bitmap != null && view != null) {
            new Thread() { // from class: com.tsf.extend.theme.ThemeDetail.7
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    int width = bitmap.getWidth();
                    int i = width / 10;
                    try {
                        final BitmapDrawable bitmapDrawable = new BitmapDrawable(ThemeDetail.this.getResources(), C1426e.m8670a(Bitmap.createScaledBitmap(bitmap, i, (bitmap.getHeight() * i) / width, true), 15, true));
                        bitmapDrawable.setAlpha(VEasing.Back.easeIn);
                        C1455z.m8564a(0, new Runnable() { // from class: com.tsf.extend.theme.ThemeDetail.7.1
                            @Override // java.lang.Runnable
                            public void run() {
                                ThemeDetail.m8084b(view, bitmapDrawable);
                            }
                        });
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static void m8084b(View view, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setBackground(drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    /* renamed from: u */
    private void m8044u() {
        this.f5087P = new C1615d(AbstractC1386a.EnumC1397b.LoadCache);
        C1894v.m7069h().m7103a(this.f5087P, AbstractC1386a.EnumC1397b.LoadCache, this.f5129z.m7297h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public void m8042v() {
        if (this.f5089R != null && this.f5089R.size() > 0) {
            this.f5088Q = new C1615d(AbstractC1386a.EnumC1397b.LoadMore);
            C1894v.m7069h().m7103a(this.f5088Q, AbstractC1386a.EnumC1397b.LoadMore, this.f5129z.m7297h());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public void m8040w() {
        this.f5123t.setVisibility(8);
        this.f5124u.setVisibility(8);
        this.f5124u.setClickable(false);
        this.f5122s.setVisibility(0);
    }

    /* renamed from: x */
    private void m8038x() {
        this.f5123t.setVisibility(0);
        this.f5124u.setVisibility(8);
        this.f5124u.setClickable(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public void m8036y() {
        this.f5123t.setVisibility(8);
        this.f5124u.setVisibility(0);
        this.f5124u.setClickable(true);
        this.f5124u.setText(C1536f.C1543g.load_more_fail);
    }

    /* renamed from: a */
    public void m8108a(long j, String str, boolean z, String str2) {
        C1848k c1848k = new C1848k();
        c1848k.m7292i("");
        c1848k.m7295h("");
        c1848k.m7321a(0);
        c1848k.m7290j("");
        c1848k.m7310c("");
        this.f5085N = z;
        if (z) {
            setFromInlet("8");
        }
        this.f5080I = str;
        m8095a(c1848k, true);
        this.f5082K = (FrameLayout) findViewById(C1536f.C1541e.theme_detail_progress_view);
        this.f5083L = (ProgressBar) findViewById(C1536f.C1541e.theme_detail_progress);
        this.f5083L.setIndeterminateDrawable(new C1518d(getContext(), 3));
        this.f5082K.setVisibility(0);
        C1894v.m7069h().m7105a(new C1618e(), j, str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.tsf.extend.theme.ThemeDetail$e */
    /* loaded from: classes.dex */
    public class C1618e implements AbstractC1386a.InterfaceC1396a<C1848k> {
        private C1618e() {
        }

        @Override // com.tsf.extend.base.p074d.AbstractC1386a.InterfaceC1396a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo6245a(JSONObject jSONObject, C1848k c1848k) {
            m8024a();
            if (c1848k != null) {
                ThemeDetail.this.setTheme(c1848k);
                if (ThemeDetail.this.f5111h != null && ThemeDetail.this.f5128y != null) {
                    ThemeDetail.this.m8070h();
                }
            }
        }

        @Override // com.tsf.extend.base.p074d.AbstractC1386a.InterfaceC1396a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo6247a(JSONObject jSONObject, int i, C1848k c1848k) {
            m8024a();
            ThemeDetail.this.f5116m.onBackPressed();
            int i2 = C1536f.C1543g.theme_detail_data_fail;
            if (ThemeDetail.this.f5085N) {
                i2 = C1536f.C1543g.theme_detail_data_fail_from_wallpaper;
            }
            Toast.makeText(ThemeDetail.this.getContext(), i2, 1).show();
        }

        /* renamed from: a */
        private void m8024a() {
            if (ThemeDetail.this.f5082K != null && ThemeDetail.this.f5082K.getVisibility() == 0) {
                ThemeDetail.this.f5082K.setVisibility(8);
                ThemeDetail.this.f5082K = null;
                ThemeDetail.this.f5083L = null;
            }
        }
    }

    public void setTheme(C1848k c1848k) {
        m8095a(c1848k, false);
    }

    /* renamed from: a */
    public void m8092a(String str, String str2) {
        this.f5078G = str;
        this.f5079H = str2;
    }

    public void setFromTab(String str) {
        this.f5080I = str;
    }

    public void setNewEntry(String str) {
        this.f5102ag = C1434m.m8639a();
        this.f5103ah = true;
        C1434m.m8636a(str);
    }

    /* renamed from: a */
    private void m8095a(C1848k c1848k, boolean z) {
        AbstractC1700aq m7401a;
        if (c1848k != null) {
            if (C1696ao.m7774b().m7769g() && C2087l.m6470a().m6457e(c1848k) == null && (m7401a = C1821e.m7401a(getContext(), c1848k)) != null) {
                c1848k = m7401a;
            }
            if ((c1848k instanceof C1842f) || (c1848k instanceof AbstractC1700aq)) {
                this.f5075D = EnumC1619f.LOCAL_THEME;
                m8064k();
            } else {
                C1894v.m7069h();
                if (C1894v.m7080c(c1848k.m7300g()) != null) {
                    this.f5075D = EnumC1619f.THEME_HASLOCAL;
                } else {
                    this.f5075D = EnumC1619f.THEME_NETLOCAL;
                }
            }
            this.f5129z = c1848k;
            m8121A();
            if (!z) {
                m8094a("0");
            }
            if (!TextUtils.isEmpty(this.f5129z.m7294i())) {
                if (this.f5127x != null) {
                    this.f5117n.setText(this.f5129z.m7294i());
                    this.f5127x.setText(" (" + this.f5129z.m7279p() + ")");
                    this.f5107d.setText(this.f5129z.m7294i());
                } else {
                    this.f5117n.setText(this.f5129z.m7294i() + " (" + this.f5129z.m7279p() + ")");
                    this.f5107d.setText(this.f5129z.m7294i());
                }
            }
            if (this.f5075D == EnumC1619f.LOCAL_THEME) {
                this.f5115l.setVisibility(8);
                if (this.f5129z instanceof C1842f) {
                    this.f5073B = ((C1842f) this.f5129z).m7349b();
                } else if (this.f5129z instanceof AbstractC1700aq) {
                    this.f5072A = this.f5129z.m7274t();
                    if ((this.f5129z instanceof C1703b) && ((C1703b) this.f5129z).m7748e()) {
                        C1368a m7112a = C1894v.m7069h().m7112a(this.f5129z.m7297h());
                        if (m7112a != null && m7112a.m8875a() != null) {
                            m8103a(m7112a, false);
                        } else {
                            m8044u();
                        }
                    }
                }
            } else {
                this.f5072A = this.f5129z.m7274t();
                C1368a m7112a2 = C1894v.m7069h().m7112a(this.f5129z.m7297h());
                if (m7112a2 != null && m7112a2.m8875a() != null) {
                    m8103a(m7112a2, false);
                } else {
                    m8044u();
                }
            }
            this.f5112i.setText("by " + this.f5129z.m7277q());
            this.f5112i.setVisibility(0);
            setThemeControllText(this.f5075D);
            if (this.f5072A != null && this.f5072A.size() > 1) {
                this.f5074C = this.f5072A.size();
            } else if (this.f5073B != null && this.f5073B.size() > 1) {
                this.f5074C = this.f5073B.size();
            } else if (this.f5072A != null && this.f5072A.size() >= 0 && (this.f5129z instanceof AbstractC1700aq)) {
                this.f5074C = this.f5072A.size();
            }
            if (!z) {
                m8115F();
                this.f5081J = System.currentTimeMillis();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f5111h != null) {
            C1421b.m8698a(this.f5111h, this);
        }
        m8034z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public void m8034z() {
        if (this.f5076E != null && this.f5076E.isShowing()) {
            try {
                this.f5076E.dismiss();
            } catch (Exception e) {
            }
            this.f5076E = null;
        }
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.InterfaceC1352a
    public boolean getPendingTransition() {
        return true;
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.InterfaceC1352a
    public View getContent() {
        return this;
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.InterfaceC1352a
    /* renamed from: a */
    public void mo6535a(PageActivity pageActivity) {
        this.f5116m = pageActivity;
        if (pageActivity instanceof PersonalizationActivity) {
            ((PersonalizationActivity) this.f5116m).m7003a((PersonalizationActivity.InterfaceC1954n) this);
        }
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.InterfaceC1352a
    /* renamed from: a */
    public void mo6536a() {
        if (C1696ao.m7774b().m7769g()) {
            C2087l.m6470a().m6466a(this);
            C1848k m6457e = C2087l.m6470a().m6457e(this.f5129z);
            if (m6457e != null) {
                this.f5113j.setText(getResources().getString(C1536f.C1543g.lp_theme_downloading));
                m8112a(m6457e.m7325G() / 100.0f);
            }
        }
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.InterfaceC1352a
    /* renamed from: b */
    public void mo6532b() {
        if (C1696ao.m7774b().m7769g()) {
            C2087l.m6470a().m6462b(this);
        }
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.InterfaceC1352a
    /* renamed from: f */
    public void mo6528f() {
        if (this.f5079H.equals("0")) {
        }
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.InterfaceC1352a
    /* renamed from: d */
    public void mo6530d() {
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.InterfaceC1352a
    public Bundle getResult() {
        return null;
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.InterfaceC1352a
    /* renamed from: c */
    public void mo6531c() {
        if (this.f5116m != null && (this.f5116m instanceof PersonalizationActivity)) {
            ((PersonalizationActivity) this.f5116m).m6987b((PersonalizationActivity.InterfaceC1954n) this);
        }
        this.f5095a.clear();
        if (this.f5104ai != null) {
            this.f5104ai.removeMessages(0);
            this.f5104ai.removeMessages(1);
        }
        if (this.f5089R.size() > 0) {
            m8116E();
        }
        m8113H();
        if (this.f5103ah) {
            C1434m.m8636a(this.f5102ag);
        }
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.InterfaceC1352a
    /* renamed from: e */
    public boolean mo6529e() {
        m8091a("51", this.f5079H, this.f5078G);
        return false;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        m8107a(view);
        int id = view.getId();
        if (id == C1536f.C1541e.title) {
            this.f5116m.onBackPressed();
        } else if (id == C1536f.C1541e.theme_controll) {
            if (this.f5129z != null) {
                this.f5116m.m8921a(false);
                if (this.f5082K == null || this.f5082K.getVisibility() != 0) {
                    long m7297h = this.f5129z.m7297h();
                    if (this.f5075D == EnumC1619f.THEME_HASLOCAL || this.f5075D == EnumC1619f.LOCAL_THEME || ((C1696ao.m7774b().m7770f() && m8078d(m7297h)) || this.f5105aj != null)) {
                        if (C1427f.m8664a(getContext(), "com.ksmobile.launcher")) {
                            Intent intent = new Intent();
                            intent.setComponent(new ComponentName("com.ksmobile.launcher", "com.ksmobile.launcher.Launcher"));
                            getContext().startActivity(intent);
                        } else {
                            C1920x.m7048b(getContext(), "https://play.google.com/store/apps/details?id=com.ksmobile.launcher", "&referrer=utm_source%3Dtsf_theme_center_theme_cmlauncher" + m7297h);
                        }
                    } else if (!TextUtils.isEmpty(this.f5129z.m7327E()) && C1696ao.m7774b().m7769g()) {
                        C1848k m6457e = C2087l.m6470a().m6457e(this.f5129z);
                        if (m6457e != null && !m6457e.m7324H()) {
                            m6457e.m7303e(true);
                            this.f5113j.setClickable(false);
                            return;
                        } else if (TextUtils.isEmpty(this.f5129z.m7327E())) {
                            Toast.makeText(getContext(), getResources().getString(C1536f.C1543g.lp_theme_not_available), 0).show();
                        } else if (C2087l.m6470a().m6469a(this.f5129z)) {
                            this.f5113j.setText(getResources().getString(C1536f.C1543g.lp_theme_downloading));
                            m8054p();
                        } else {
                            Toast.makeText(getContext(), getResources().getString(C1536f.C1543g.lp_theme_downloading_full), 0).show();
                        }
                    } else {
                        m8094a("1");
                        C1920x.m7047b(getContext(), this.f5129z.m7289k(), "_bt", "tsf_theme_center_theme");
                        C1894v.m7069h().m7088b(this.f5129z.m7297h());
                        m8091a("1", "1010", "1012");
                    }
                    m8079c("12");
                }
            }
        } else if (id == C1536f.C1541e.favorite_theme) {
            boolean z = this.f5119p.isSelected() ? false : true;
            this.f5119p.setSelected(z);
            if (z) {
                m8094a("10");
                m8117D();
                m8119B();
            } else {
                m8094a("11");
                m8118C();
            }
            m8079c("16");
        } else if (id == C1536f.C1541e.loadmore_tips) {
            this.f5123t.setVisibility(0);
            this.f5124u.setVisibility(8);
            m8042v();
        } else if (id == C1536f.C1541e.diy_btn) {
            ThemeDIYActivity.m7549a(getContext(), "1001", 1);
        } else if (id == C1536f.C1541e.theme_item_download_layout_left) {
            m8104a(view.findViewById(C1536f.C1541e.theme_download_left), true);
        } else if (id == C1536f.C1541e.theme_item_download_layout_right) {
            m8104a(view.findViewById(C1536f.C1541e.theme_download_right), true);
        } else if (id == C1536f.C1541e.theme_item_download_layout_mid) {
            m8104a(view.findViewById(C1536f.C1541e.theme_download_mid), true);
        } else if (id == C1536f.C1541e.theme_item_left || id == C1536f.C1541e.theme_item_right || id == C1536f.C1541e.theme_item_mid) {
            m8104a(view, false);
        } else if (id == C1536f.C1541e.retry) {
            if (m8062l()) {
                this.f5121r.setVisibility(0);
                this.f5099ad.setVisibility(8);
                m8044u();
                m8070h();
            }
        } else if (view instanceof ImageView) {
            m8111a(this.f5095a.indexOf(view));
        }
    }

    /* renamed from: a */
    public void m8107a(View view) {
        boolean z = true;
        int id = view.getId();
        if (id != C1536f.C1541e.title && id != C1536f.C1541e.theme_controll && id != C1536f.C1541e.favorite_theme && id != C1536f.C1541e.loadmore_tips && id != C1536f.C1541e.diy_btn && id != C1536f.C1541e.theme_item_left && id != C1536f.C1541e.theme_item_right && id != C1536f.C1541e.theme_item_download_layout_left && id != C1536f.C1541e.theme_item_download_layout_right && !(view instanceof ImageView)) {
            z = false;
        }
        if (z) {
        }
    }

    /* renamed from: a */
    private void m8104a(View view, boolean z) {
        C1848k c1848k;
        if (Math.abs(this.f5090S - System.currentTimeMillis()) > 1000) {
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
                this.f5116m.m8921a(false);
                if (C1696ao.m7774b().m7769g()) {
                    ThemeDetail themeDetail = (ThemeDetail) LayoutInflater.from(getContext()).inflate(C1536f.C1542f.theme_detail, (ViewGroup) null);
                    themeDetail.setFromInlet(this.f5077F);
                    themeDetail.setFromTab("detail");
                    themeDetail.setTheme(c1848k);
                    themeDetail.m8092a("1010", "1010");
                    if (getContext() instanceof PageActivity) {
                        ((PageActivity) getContext()).m8919b(themeDetail);
                    }
                } else {
                    C1920x.m7052a(getContext(), c1848k.m7289k(), "tsf_theme_center_theme");
                }
                m8090a("14", "0", "0", c1848k.m7300g());
                this.f5090S = System.currentTimeMillis();
                if (z) {
                    m8076d(c1848k);
                } else {
                    m8074e(c1848k);
                }
            }
        }
    }

    /* renamed from: d */
    private void m8076d(C1848k c1848k) {
        m8093a("3", c1848k.m7297h(), c1848k.m7330B());
    }

    /* renamed from: e */
    private void m8074e(C1848k c1848k) {
        m8093a("2", c1848k.m7297h(), c1848k.m7330B());
    }

    /* renamed from: a */
    private void m8093a(String str, long j, String str2) {
    }

    /* renamed from: A */
    private void m8121A() {
        final C1848k c1848k = this.f5129z;
        final Context context = getContext();
        final ImageView imageView = this.f5119p;
        C1455z.m8564a(1, new Runnable() { // from class: com.tsf.extend.theme.ThemeDetail.8
            @Override // java.lang.Runnable
            public void run() {
                final boolean m7352c = C1840e.m7360a().m7352c(context, c1848k);
                C1455z.m8564a(0, new Runnable() { // from class: com.tsf.extend.theme.ThemeDetail.8.1
                    @Override // java.lang.Runnable
                    public void run() {
                        imageView.setSelected(m7352c);
                    }
                });
            }
        });
    }

    /* renamed from: B */
    private void m8119B() {
        C1840e.m7360a().m7358a(getContext(), this.f5129z);
        if (!(this.f5129z instanceof AbstractC1700aq)) {
            C1917w.m7055a(this.f5129z, getContext());
        }
    }

    /* renamed from: C */
    private void m8118C() {
        C1840e.m7360a().m7354b(getContext(), this.f5129z);
    }

    /* renamed from: D */
    private void m8117D() {
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), C1536f.C1537a.wallpaper_favorite_anim_in);
        final Animation loadAnimation2 = AnimationUtils.loadAnimation(getContext(), C1536f.C1537a.wallpaper_favorite_anim_out);
        loadAnimation2.setAnimationListener(new Animation.AnimationListener() { // from class: com.tsf.extend.theme.ThemeDetail.9
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                ThemeDetail.this.f5120q.setVisibility(8);
            }
        });
        final Runnable runnable = new Runnable() { // from class: com.tsf.extend.theme.ThemeDetail.10
            @Override // java.lang.Runnable
            public void run() {
                ThemeDetail.this.f5120q.startAnimation(loadAnimation2);
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
                C1455z.m8563a(0, runnable, 1000L);
            }
        });
        this.f5120q.setVisibility(0);
        this.f5120q.startAnimation(loadAnimation);
    }

    /* renamed from: a */
    private void m8111a(int i) {
        if (this.f5082K == null || this.f5082K.getVisibility() != 0) {
            View$OnClickListenerC1653ab view$OnClickListenerC1653ab = new View$OnClickListenerC1653ab(getContext());
            if (this.f5129z instanceof AbstractC1700aq) {
                view$OnClickListenerC1653ab.m7931a(this.f5129z.m7274t(), i);
            } else if (this.f5075D == EnumC1619f.LOCAL_THEME) {
                view$OnClickListenerC1653ab.m7932a(this.f5129z.m7300g(), this.f5073B, i);
            } else {
                view$OnClickListenerC1653ab.m7929b(this.f5072A, i);
            }
            this.f5116m.m8922a(view$OnClickListenerC1653ab);
            String str = this.f5079H;
            if (str.equals("0")) {
                str = "1010";
            }
            m8091a("4", str, "1011");
        }
    }

    /* renamed from: a */
    private void m8094a(String str) {
        m8091a(str, "0", "0");
    }

    /* renamed from: a */
    private void m8091a(String str, String str2, String str3) {
        m8090a(str, str2, str3, "0");
    }

    /* renamed from: a */
    private void m8090a(String str, String str2, String str3, String str4) {
        if (this.f5129z == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m8082b(String str) {
        if (this.f5129z == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.extend.theme.ThemeDetail$c */
    /* loaded from: classes.dex */
    public class C1613c extends AbstractC1468a {

        /* renamed from: b */
        private C1611a f5160b;

        /* renamed from: c */
        private FrameLayout.LayoutParams f5161c = new FrameLayout.LayoutParams(-1, -1);

        public C1613c() {
            this.f5160b = new C1611a();
        }

        @Override // com.tsf.extend.base.support.AbstractC1468a
        /* renamed from: a */
        public int mo6712a() {
            return ThemeDetail.this.f5074C;
        }

        @Override // com.tsf.extend.base.support.AbstractC1468a
        /* renamed from: a */
        public Object mo6710a(ViewGroup viewGroup, final int i) {
            final ImageView imageView = new ImageView(viewGroup.getContext());
            if (ThemeDetail.this.f5074C == 1) {
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setImageResource(C1536f.C1538b.personal_list_item_bg);
            } else {
                imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                imageView.setBackgroundResource(C1536f.C1538b.personal_list_item_bg);
            }
            ThemeDetail.this.f5095a.add(imageView);
            if (ThemeDetail.this.f5075D != EnumC1619f.LOCAL_THEME) {
                if (ThemeDetail.this.f5072A != null) {
                    String str = (String) ThemeDetail.this.f5072A.get(i);
                    C1612b c1612b = new C1612b();
                    c1612b.f5157a = str;
                    c1612b.f5158b = i;
                    imageView.setTag(c1612b);
                    C1894v.m7069h().m7079c(str, this.f5160b);
                }
            } else {
                AbstractC1386a.InterfaceC1396a<C1894v.C1916b> interfaceC1396a = new AbstractC1386a.InterfaceC1396a<C1894v.C1916b>() { // from class: com.tsf.extend.theme.ThemeDetail.c.1
                    @Override // com.tsf.extend.base.p074d.AbstractC1386a.InterfaceC1396a
                    /* renamed from: a  reason: avoid collision after fix types in other method */
                    public void mo6245a(JSONObject jSONObject, C1894v.C1916b c1916b) {
                        if (imageView != null && c1916b != null) {
                            imageView.setImageBitmap(c1916b.f6163b);
                            if (i == 1) {
                                ThemeDetail.this.setViewPagerBackgroundColor(c1916b.f6163b);
                            }
                        }
                    }

                    @Override // com.tsf.extend.base.p074d.AbstractC1386a.InterfaceC1396a
                    /* renamed from: a  reason: avoid collision after fix types in other method */
                    public void mo6247a(JSONObject jSONObject, int i2, C1894v.C1916b c1916b) {
                    }
                };
                if (!(ThemeDetail.this.f5129z instanceof AbstractC1700aq)) {
                    if (ThemeDetail.this.f5073B != null && ThemeDetail.this.f5129z != null) {
                        C1894v.m7069h().m7113a(((Integer) ThemeDetail.this.f5073B.get(i)).intValue(), ThemeDetail.this.f5129z.m7300g(), interfaceC1396a, 2);
                    }
                } else {
                    C1894v.m7069h().m7092a(ThemeDetail.this.f5129z.m7300g(), (AbstractC1700aq) ThemeDetail.this.f5129z, interfaceC1396a, 1, i);
                }
            }
            imageView.setOnClickListener(ThemeDetail.this);
            imageView.setSoundEffectsEnabled(true);
            viewGroup.addView(imageView, this.f5161c);
            return imageView;
        }

        @Override // com.tsf.extend.base.support.AbstractC1468a
        /* renamed from: a */
        public void mo6709a(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
            ThemeDetail.this.f5095a.remove(obj);
        }

        @Override // com.tsf.extend.base.support.AbstractC1468a
        /* renamed from: a */
        public boolean mo6711a(View view, Object obj) {
            return view == obj;
        }
    }

    /* renamed from: com.tsf.extend.theme.ThemeDetail$a */
    /* loaded from: classes.dex */
    class C1611a implements AbstractC1386a.InterfaceC1396a<Pair<String, Bitmap>> {

        /* renamed from: a */
        int f5154a = 0;

        /* renamed from: b */
        int f5155b = 0;

        C1611a() {
        }

        @Override // com.tsf.extend.base.p074d.AbstractC1386a.InterfaceC1396a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo6245a(JSONObject jSONObject, Pair<String, Bitmap> pair) {
            this.f5154a++;
            m8032a();
            if (pair != null) {
                String str = (String) pair.first;
                Bitmap bitmap = (Bitmap) pair.second;
                if (!TextUtils.isEmpty(str) && bitmap != null) {
                    for (ImageView imageView : ThemeDetail.this.f5095a) {
                        C1612b c1612b = (C1612b) imageView.getTag();
                        if (c1612b.f5157a.equals(str)) {
                            imageView.setImageBitmap(bitmap);
                            if (c1612b.f5158b == 1) {
                                ThemeDetail.this.setViewPagerBackgroundColor(bitmap);
                            }
                        }
                    }
                }
            }
        }

        @Override // com.tsf.extend.base.p074d.AbstractC1386a.InterfaceC1396a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo6247a(JSONObject jSONObject, int i, Pair<String, Bitmap> pair) {
            this.f5155b++;
            m8032a();
        }

        /* renamed from: a */
        private void m8032a() {
            int min;
            if (ThemeDetail.this.f5121r.getVisibility() != 0 && this.f5154a + this.f5155b >= (min = Math.min(ThemeDetail.this.f5074C, 3))) {
                if (this.f5154a >= min || ThemeDetail.this.m8062l()) {
                    ThemeDetail.this.f5121r.setVisibility(0);
                    ThemeDetail.this.f5099ad.setVisibility(8);
                } else {
                    ThemeDetail.this.f5121r.setVisibility(4);
                    ThemeDetail.this.f5099ad.setVisibility(0);
                }
                this.f5154a = 0;
                this.f5155b = 0;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.extend.theme.ThemeDetail$b */
    /* loaded from: classes.dex */
    public static class C1612b {

        /* renamed from: a */
        String f5157a;

        /* renamed from: b */
        int f5158b;

        C1612b() {
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        C1421b.m8698a(this.f5111h, this);
        m8070h();
        this.f5101af = this.f5093V.getTop();
        this.f5100ae = Math.abs(this.f5094W.getTop() - this.f5101af) - this.f5096aa.getHeight();
        this.f5100ae = Math.max(this.f5100ae, 1);
    }

    /* renamed from: h */
    public void m8070h() {
        this.f5128y = new C1613c();
        this.f5111h.setAdapter(this.f5128y);
    }

    @Override // com.tsf.extend.wallpaper.PersonalizationActivity.InterfaceC1954n
    /* renamed from: a */
    public void mo6940a(String str, PersonalizationActivity.InterfaceC1954n.EnumC1955a enumC1955a) {
        if (!TextUtils.isEmpty(str)) {
            C1894v.m7069h().m7106a(this);
            if (this.f5129z != null && !TextUtils.isEmpty(str) && str.equals(this.f5129z.m7300g()) && enumC1955a != null) {
                if (enumC1955a == PersonalizationActivity.InterfaceC1954n.EnumC1955a.ADD) {
                    this.f5075D = EnumC1619f.THEME_HASLOCAL;
                    setThemeControllText(this.f5075D);
                    return;
                }
                this.f5116m.onBackPressed();
            }
        }
    }

    public void setFromInlet(String str) {
        this.f5077F = str;
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

    /* renamed from: a */
    public void m8088a(List<C1848k> list, boolean z) {
        String str;
        if (!z) {
            this.f5089R.clear();
        }
        if (this.f5089R.size() == 0 && (list == null || list.size() == 0)) {
            this.f5086O.notifyDataSetChanged();
            return;
        }
        if (this.f5116m == null) {
            str = null;
        } else {
            str = ((PersonalizationActivity) this.f5116m).m6976f();
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
        if (!this.f5092U) {
            this.f5092U = true;
            m8114G();
        }
        this.f5086O.m7132a(this.f5089R, list);
        this.f5086O.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.extend.theme.ThemeDetail$d */
    /* loaded from: classes.dex */
    public class C1615d implements AbstractC1386a.InterfaceC1396a<C1368a> {

        /* renamed from: b */
        private final AbstractC1386a.EnumC1397b f5166b;

        public C1615d(AbstractC1386a.EnumC1397b enumC1397b) {
            this.f5166b = enumC1397b;
        }

        @Override // com.tsf.extend.base.p074d.AbstractC1386a.InterfaceC1396a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo6245a(JSONObject jSONObject, final C1368a c1368a) {
            C1455z.m8564a(0, new Runnable() { // from class: com.tsf.extend.theme.ThemeDetail.d.1
                @Override // java.lang.Runnable
                public void run() {
                    ThemeDetail.this.m8103a(c1368a, C1615d.this.f5166b == AbstractC1386a.EnumC1397b.LoadMore);
                }
            });
        }

        @Override // com.tsf.extend.base.p074d.AbstractC1386a.InterfaceC1396a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo6247a(JSONObject jSONObject, int i, C1368a c1368a) {
            C1455z.m8564a(0, new Runnable() { // from class: com.tsf.extend.theme.ThemeDetail.d.2
                @Override // java.lang.Runnable
                public void run() {
                    if (ThemeDetail.this.f5089R.size() > 0) {
                        ThemeDetail.this.m8036y();
                    } else {
                        ThemeDetail.this.m8040w();
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m8103a(C1368a c1368a, boolean z) {
        C1862p c1862p = null;
        if (c1368a instanceof C1862p) {
            c1862p = (C1862p) c1368a;
        }
        this.f5091T = c1862p.m8868b();
        if (!this.f5091T) {
            m8040w();
        } else {
            m8038x();
            this.f5121r.m8430b(false);
        }
        if ((this.f5089R.size() == 0) && c1368a.m8875a() != null && c1368a.m8875a().size() > 0) {
            this.f5115l.setVisibility(0);
        }
        m8088a(c1368a.m8875a(), z);
        C1894v.m7069h().m7106a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m8089a(List<C1848k> list) {
        for (C1887t.C1890b c1890b : this.f5089R) {
            C1848k c1848k = c1890b.f6082a;
            C1848k c1848k2 = c1890b.f6083b;
            c1848k.m7306d(false);
            if (c1848k2 != null) {
                c1848k2.m7306d(false);
            }
            for (C1848k c1848k3 : list) {
                if (c1848k3 != null && !(c1848k3 instanceof AbstractC1700aq)) {
                    if (c1848k3.m7300g().equals(c1848k.m7300g())) {
                        c1848k.m7306d(true);
                    }
                    if (c1848k2 != null && c1848k3.m7300g().equals(c1848k2.m7300g())) {
                        c1848k2.m7306d(true);
                    }
                }
            }
        }
        this.f5086O.notifyDataSetChanged();
    }

    @Override // com.tsf.extend.base.p074d.AbstractC1386a.InterfaceC1396a
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void mo6245a(JSONObject jSONObject, final List<C1848k> list) {
        if (list != null) {
            C1455z.m8564a(0, new Runnable() { // from class: com.tsf.extend.theme.ThemeDetail.2
                @Override // java.lang.Runnable
                public void run() {
                    if (ThemeDetail.this.f5089R != null) {
                        ThemeDetail.this.m8089a(list);
                    }
                }
            });
        }
    }

    @Override // com.tsf.extend.base.p074d.AbstractC1386a.InterfaceC1396a
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void mo6247a(JSONObject jSONObject, int i, List<C1848k> list) {
    }

    /* renamed from: i */
    public void m8068i() {
        this.f5118o.setVisibility(0);
        this.f5108e.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.tsf.extend.theme.ThemeDetail.3
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                ViewGroup.LayoutParams layoutParams = ThemeDetail.this.f5108e.getLayoutParams();
                int m8616c = ((C1437p.m8616c() - ThemeDetail.this.getResources().getDimensionPixelSize(C1536f.C1539c.workspace_margin_top)) - ThemeDetail.this.getResources().getDimensionPixelSize(C1536f.C1539c.theme_detail_recommed_height)) + ThemeDetail.this.f5118o.getHeight() + ThemeDetail.this.getResources().getDimensionPixelSize(C1536f.C1539c.theme_detail_theme_promotion_margin);
                if (layoutParams == null) {
                    layoutParams = new ViewGroup.LayoutParams(-1, m8616c);
                } else {
                    layoutParams.height = m8616c;
                }
                ThemeDetail.this.f5108e.setLayoutParams(layoutParams);
                int height = ThemeDetail.this.f5108e.getHeight() - m8616c;
                if (height > -3 && height < 3) {
                    ThemeDetail.this.m8070h();
                    C1421b.m8698a(ThemeDetail.this.f5108e, this);
                }
            }
        });
    }

    /* renamed from: c */
    private void m8079c(String str) {
        if (this.f5129z != null) {
            if (!"new".equals(this.f5080I) && !"hot".equals(this.f5080I) && !"banner".equals(this.f5080I)) {
                String str2 = this.f5080I;
            }
            Object m8853a = C1369a.m8855a().m8853a(this.f5080I);
            if (m8853a instanceof C1368a) {
                C1368a c1368a = (C1368a) m8853a;
            }
        }
    }

    /* renamed from: E */
    private void m8116E() {
        if (this.f5129z != null) {
            if (!View$OnClickListenerC1850m.f5946j[0].equals(this.f5080I) && !View$OnClickListenerC1850m.f5946j[1].equals(this.f5080I) && View$OnClickListenerC1850m.f5946j[3].equals(this.f5080I)) {
            }
            Object m8853a = C1369a.m8855a().m8853a(this.f5080I);
            if (m8853a instanceof C1368a) {
                C1368a c1368a = (C1368a) m8853a;
            }
        }
    }

    /* renamed from: F */
    private void m8115F() {
        if (this.f5129z != null) {
            Object m8853a = C1369a.m8855a().m8853a(this.f5080I);
            if (m8853a instanceof C1368a) {
                C1368a c1368a = (C1368a) m8853a;
            }
        }
    }

    /* renamed from: G */
    private void m8114G() {
        if (this.f5129z != null) {
            Object m8853a = C1369a.m8855a().m8853a(this.f5080I);
            if (m8853a instanceof C1368a) {
                C1368a c1368a = (C1368a) m8853a;
            }
        }
    }

    /* renamed from: H */
    private void m8113H() {
        if (this.f5129z != null) {
            Object m8853a = C1369a.m8855a().m8853a(this.f5080I);
            if (m8853a instanceof C1368a) {
                C1368a c1368a = (C1368a) m8853a;
            }
        }
    }

    /* renamed from: a */
    public boolean m8109a(long j) {
        return j == 713;
    }

    /* renamed from: b */
    public boolean m8085b(long j) {
        return j == 471;
    }

    /* renamed from: c */
    public boolean m8081c(long j) {
        return j == 1185;
    }

    /* renamed from: d */
    public boolean m8078d(long j) {
        return m8109a(j) || m8085b(j) || m8081c(j);
    }

    @Override // com.tsf.extend.wallpaper.C2087l.InterfaceC2093a
    /* renamed from: a */
    public void mo6456a(C1848k c1848k) {
        if (c1848k.m7297h() == this.f5129z.m7297h()) {
            this.f5109f.setVisibility(0);
            this.f5113j.setText(getResources().getString(C1536f.C1543g.lp_theme_downloading));
        }
    }

    @Override // com.tsf.extend.wallpaper.C2087l.InterfaceC2093a
    /* renamed from: a */
    public void mo6455a(C1848k c1848k, float f) {
        if (c1848k.m7297h() == this.f5129z.m7297h()) {
            this.f5109f.setVisibility(0);
            this.f5113j.setText(getResources().getString(C1536f.C1543g.lp_theme_downloading));
            m8112a(f / 100.0f);
        }
    }

    @Override // com.tsf.extend.wallpaper.C2087l.InterfaceC2093a
    /* renamed from: a */
    public void mo6454a(C1848k c1848k, C1703b c1703b) {
        if (c1848k.m7297h() == this.f5129z.m7297h()) {
            this.f5113j.setText(C1536f.C1543g.theme_detail_btn_apply);
            this.f5109f.setVisibility(8);
            this.f5105aj = c1703b;
            m8056o();
        }
    }

    @Override // com.tsf.extend.wallpaper.C2087l.InterfaceC2093a
    /* renamed from: b */
    public void mo6453b(C1848k c1848k) {
        if (c1848k.m7297h() == this.f5129z.m7297h()) {
            this.f5113j.setText(getResources().getString(C1536f.C1543g.lp_theme_downloading_fail));
            m8112a(0.0f);
            m8056o();
        }
    }

    @Override // com.tsf.extend.wallpaper.C2087l.InterfaceC2093a
    /* renamed from: c */
    public void mo6452c(C1848k c1848k) {
        if (c1848k.m7297h() == this.f5129z.m7297h()) {
            setThemeControllText(this.f5075D);
            m8112a(0.0f);
            this.f5113j.setClickable(true);
            m8056o();
        }
    }

    /* renamed from: a */
    private void m8112a(float f) {
        ViewGroup.LayoutParams layoutParams = this.f5109f.getLayoutParams();
        layoutParams.width = Math.round(this.f5113j.getWidth() * f);
        this.f5109f.setLayoutParams(layoutParams);
    }
}
