package com.tsf.extend.theme;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.google.android.collect.Lists;
import com.tsf.extend.C1536f;
import com.tsf.extend.C1547h;
import com.tsf.extend.DialogInterfaceC1526e;
import com.tsf.extend.base.C1378c;
import com.tsf.extend.base.actstru.model.activi.PageActivity;
import com.tsf.extend.base.p073c.InterfaceC1380a;
import com.tsf.extend.base.p074d.AbstractC1386a;
import com.tsf.extend.base.p077g.C1409c;
import com.tsf.extend.base.p077g.C1411d;
import com.tsf.extend.base.p080j.C1419aa;
import com.tsf.extend.base.p080j.C1421b;
import com.tsf.extend.base.p080j.C1455z;
import com.tsf.extend.base.support.AbstractC1468a;
import com.tsf.extend.base.support.ViewPager;
import com.tsf.extend.base.view.PageIndicatorCompat;
import com.tsf.extend.base.view.TextProgressBar;
import com.tsf.extend.theme.C1846j;
import com.tsf.extend.theme.cmclub.ThemeCmClubActivity;
import com.tsf.extend.theme.diy.C1806c;
import com.tsf.extend.theme.diy.C1821e;
import com.tsf.extend.wallpaper.PersonalizationActivity;
import java.io.File;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class DIYThemeDetail extends FrameLayout implements DialogInterface.OnClickListener, View.OnClickListener, ViewTreeObserver.OnGlobalLayoutListener, PageActivity.InterfaceC1352a, PersonalizationActivity.InterfaceC1954n {

    /* renamed from: A */
    private ImageView f4943A;

    /* renamed from: B */
    private boolean f4944B;

    /* renamed from: C */
    private View f4945C;

    /* renamed from: D */
    private View f4946D;

    /* renamed from: E */
    private View f4947E;
    @SuppressLint({"HandlerLeak"})

    /* renamed from: F */
    private Handler f4948F;

    /* renamed from: G */
    private RunnableC1585c f4949G;

    /* renamed from: H */
    private C1703b f4950H;

    /* renamed from: a */
    protected float f4951a;

    /* renamed from: b */
    public List<ImageView> f4952b;

    /* renamed from: c */
    private TextView f4953c;

    /* renamed from: d */
    private View f4954d;

    /* renamed from: e */
    private ViewPager f4955e;

    /* renamed from: f */
    private TextView f4956f;

    /* renamed from: g */
    private PageActivity f4957g;

    /* renamed from: h */
    private ImageView f4958h;

    /* renamed from: i */
    private View f4959i;

    /* renamed from: j */
    private C1586d f4960j;

    /* renamed from: k */
    private C1848k f4961k;

    /* renamed from: l */
    private List<String> f4962l;

    /* renamed from: m */
    private List<Integer> f4963m;

    /* renamed from: n */
    private PageIndicatorCompat f4964n;

    /* renamed from: o */
    private int f4965o;

    /* renamed from: p */
    private DialogC1859o f4966p;

    /* renamed from: q */
    private String f4967q;

    /* renamed from: r */
    private String f4968r;

    /* renamed from: s */
    private String f4969s;

    /* renamed from: t */
    private Timer f4970t;

    /* renamed from: u */
    private FrameLayout f4971u;

    /* renamed from: v */
    private ProgressBar f4972v;

    /* renamed from: w */
    private boolean f4973w;

    /* renamed from: x */
    private boolean f4974x;

    /* renamed from: y */
    private boolean f4975y;

    /* renamed from: z */
    private TextProgressBar f4976z;

    public DIYThemeDetail(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4965o = 0;
        this.f4952b = Lists.newArrayList();
        this.f4968r = "0";
        this.f4969s = "0";
        this.f4971u = null;
        this.f4972v = null;
        this.f4974x = false;
        this.f4975y = false;
        this.f4944B = false;
        this.f4948F = new Handler() { // from class: com.tsf.extend.theme.DIYThemeDetail.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                switch (message.what) {
                    case 0:
                        if ((DIYThemeDetail.this.f4961k instanceof C1703b) && ((C1703b) DIYThemeDetail.this.f4961k).m7748e()) {
                            C1696ao.m7774b().m7767i();
                        }
                        DIYThemeDetail.this.f4957g.setResult(-1);
                        DIYThemeDetail.this.f4957g.finish();
                        DIYThemeDetail.this.m8216b("0");
                        return;
                    default:
                        DIYThemeDetail.this.m8207i();
                        Toast.makeText(DIYThemeDetail.this.f4957g, C1536f.C1543g.theme_changing_fail, 1).show();
                        DIYThemeDetail.this.m8216b("1");
                        return;
                }
            }
        };
    }

    /* renamed from: g */
    public void m8211g() {
        this.f4973w = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f4974x) {
            m8219a(Long.toString(this.f4961k.m7297h()), this.f4961k.m7289k(), this.f4961k.m7274t());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onFinishInflate() {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.extend.theme.DIYThemeDetail.onFinishInflate():void");
    }

    public void setIsDIYCMT(boolean z) {
        this.f4944B = z;
        if (this.f4944B) {
            this.f4943A.setVisibility(4);
            this.f4958h.setVisibility(4);
            this.f4956f.setText(C1536f.C1543g.theme_detail_btn_download);
        }
    }

    public void setTheme(C1848k c1848k) {
        m8223a(c1848k, false);
    }

    /* renamed from: a */
    private void m8223a(C1848k c1848k, boolean z) {
        int i;
        if (c1848k != null) {
            this.f4961k = c1848k;
            m8201l();
            if (!z) {
                m8222a("0");
            }
            this.f4953c.setText(this.f4961k.m7294i());
            int i2 = C1536f.C1543g.theme_detail_btn_apply;
            if (this.f4961k instanceof C1842f) {
                this.f4963m = ((C1842f) this.f4961k).m7349b();
                i = i2;
            } else if (this.f4961k instanceof AbstractC1700aq) {
                this.f4962l = this.f4961k.m7274t();
                i = i2;
            } else {
                i = C1536f.C1543g.theme_detail_btn_download;
                this.f4962l = this.f4961k.m7274t();
                this.f4954d.setVisibility(8);
            }
            this.f4956f.setText(i);
            if (this.f4961k.m7283n()) {
                this.f4954d.setVisibility(8);
            }
            if (this.f4962l != null && this.f4962l.size() > 1) {
                this.f4965o = this.f4962l.size();
            } else if (this.f4963m != null && this.f4963m.size() > 1) {
                this.f4965o = this.f4963m.size();
            } else if (this.f4962l != null && this.f4962l.size() >= 0 && (this.f4961k instanceof AbstractC1700aq)) {
                this.f4965o = this.f4962l.size();
            } else {
                this.f4964n.setVisibility(4);
            }
            if (this.f4965o > 1 && !z) {
                for (int i3 = 0; i3 < this.f4965o; i3++) {
                    this.f4964n.m8492a(i3, new PageIndicatorCompat.C1472a(C1536f.C1540d.ic_pageindicator_current_inverse, C1536f.C1540d.ic_pageindicator_default_inverse), true);
                }
                this.f4964n.setIgnoreBrightness(true);
                this.f4964n.setActiveMarker(0);
                this.f4964n.setVisibility(0);
            } else {
                this.f4964n.setVisibility(4);
            }
            if (this.f4973w) {
                this.f4954d.setVisibility(4);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f4955e != null) {
            C1421b.m8698a(this.f4955e, this);
        }
        m8207i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public void m8207i() {
        if (this.f4966p != null && this.f4966p.isShowing()) {
            try {
                this.f4966p.dismiss();
            } catch (Exception e) {
            }
            this.f4966p = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public void m8205j() {
        m8207i();
        this.f4966p = new DialogC1859o(this.f4957g);
        try {
            this.f4966p.show();
        } catch (Exception e) {
        }
    }

    public void setIsAutoDownload(boolean z) {
        this.f4974x = z;
    }

    public void setIsAutoApply(boolean z) {
        this.f4975y = z;
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
        this.f4957g = pageActivity;
        if (pageActivity instanceof PersonalizationActivity) {
            ((PersonalizationActivity) this.f4957g).m7003a((PersonalizationActivity.InterfaceC1954n) this);
        }
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.InterfaceC1352a
    /* renamed from: a */
    public void mo6536a() {
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.InterfaceC1352a
    /* renamed from: b */
    public void mo6532b() {
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.InterfaceC1352a
    /* renamed from: f */
    public void mo6528f() {
        if (this.f4969s.equals("0")) {
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
        if (this.f4957g != null && (this.f4957g instanceof PersonalizationActivity)) {
            ((PersonalizationActivity) this.f4957g).m6987b((PersonalizationActivity.InterfaceC1954n) this);
        }
        this.f4952b.clear();
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.InterfaceC1352a
    /* renamed from: e */
    public boolean mo6529e() {
        m8220a("51", this.f4969s, this.f4968r);
        if (m8187s()) {
            try {
                new DialogInterfaceC1526e.C1532a(getContext()).m8301a(C1536f.C1543g.exit_download_theme).m8298b(C1536f.C1543g.theme_diy_dialog_cancel, this).m8300a(C1536f.C1543g.theme_diy_dialog_exit, this).m8302a().m8314a(true);
                return true;
            } catch (Exception e) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r6v4, types: [com.tsf.extend.theme.DIYThemeDetail$13] */
    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == C1536f.C1541e.title) {
            this.f4957g.onBackPressed();
        } else if (id == C1536f.C1541e.delete) {
            if (this.f4961k instanceof AbstractC1700aq) {
                m8224a((AbstractC1700aq) this.f4961k);
            }
            m8222a("3");
        } else if (id == C1536f.C1541e.theme_controll) {
            if (this.f4961k != null) {
                this.f4957g.m8921a(false);
                if (this.f4971u == null || this.f4971u.getVisibility() != 0) {
                    if (this.f4971u == null || this.f4971u.getVisibility() != 0) {
                        if (getContext().getString(C1536f.C1543g.theme_detail_btn_apply).equals(this.f4956f.getText())) {
                            m8186t();
                        } else if (this.f4944B) {
                            m8222a("1");
                            m8219a(Long.toString(this.f4961k.m7297h()), this.f4961k.m7289k(), this.f4961k.m7274t());
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        } else if (id == C1536f.C1541e.share) {
            if (this.f4961k != null) {
                final String m7287l = this.f4961k.m7287l();
                final String string = getContext().getString(C1536f.C1543g.share_title);
                final String string2 = getContext().getString(C1536f.C1543g.share_theme_msg);
                final String valueOf = String.valueOf(this.f4961k.m7297h());
                this.f4957g.m8921a(false);
                final File file = new File(C1821e.m7404a(getContext()), this.f4961k.m7300g() + ".share.jpg");
                final C1846j.InterfaceC1847a interfaceC1847a = new C1846j.InterfaceC1847a() { // from class: com.tsf.extend.theme.DIYThemeDetail.12
                    @Override // com.tsf.extend.theme.C1846j.InterfaceC1847a
                    /* renamed from: a */
                    public void mo7332a(String str) {
                    }

                    @Override // com.tsf.extend.theme.C1846j.InterfaceC1847a
                    /* renamed from: a */
                    public void mo7333a() {
                    }
                };
                if (file.exists()) {
                    new C1409c(getContext(), C1411d.m8758a(m7287l, file.getAbsolutePath(), string, string2, "https://goo.gl/XGthJ0", valueOf), interfaceC1847a).mo8761a(getContext());
                } else {
                    m8203k();
                    new AsyncTask<Void, Void, Boolean>() { // from class: com.tsf.extend.theme.DIYThemeDetail.13
                        /* JADX INFO: Access modifiers changed from: protected */
                        @Override // android.os.AsyncTask
                        /* renamed from: a */
                        public Boolean doInBackground(Void... voidArr) {
                            return Boolean.valueOf(DIYThemeDetail.this.m8221a(file.getAbsolutePath(), DIYThemeDetail.this.f4961k.m7287l()));
                        }

                        /* JADX INFO: Access modifiers changed from: protected */
                        @Override // android.os.AsyncTask
                        /* renamed from: a */
                        public void onPostExecute(Boolean bool) {
                            boolean booleanValue = bool.booleanValue();
                            DIYThemeDetail.this.m8207i();
                            new C1409c(DIYThemeDetail.this.getContext(), C1411d.m8758a(m7287l, booleanValue ? file.getAbsolutePath() : null, string, string2, "https://goo.gl/XGthJ0", valueOf), interfaceC1847a).mo8761a(DIYThemeDetail.this.getContext());
                        }
                    }.execute(new Void[0]);
                }
                m8222a("9");
            } else {
                return;
            }
        } else if (id == C1536f.C1541e.favorite_theme) {
            boolean z = !this.f4958h.isSelected();
            this.f4958h.setSelected(z);
            if (z) {
                m8222a("10");
                m8195o();
                m8199m();
            } else {
                m8222a("11");
                m8197n();
            }
        } else if (id == C1536f.C1541e.more_diy_click) {
            ThemeCmClubActivity.m7629a(getContext(), "launch_host_club", "", 4);
        } else if (id == C1536f.C1541e.club_click) {
            getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.facebook.com/groups/DIYTheme/")));
        } else if (view instanceof ImageView) {
            m8231a(this.f4952b.indexOf(view));
        }
        try {
            if (this.f4957g != null && this.f4957g.mo6732c() != null) {
                this.f4957g.mo6732c().mo7562b();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: k */
    private void m8203k() {
        m8207i();
        this.f4966p = new DialogC1859o(this.f4957g);
        this.f4966p.m7232a("");
        this.f4966p.show();
    }

    /* renamed from: l */
    private void m8201l() {
        final C1848k c1848k = this.f4961k;
        final Context context = getContext();
        final ImageView imageView = this.f4958h;
        C1455z.m8564a(1, new Runnable() { // from class: com.tsf.extend.theme.DIYThemeDetail.14
            @Override // java.lang.Runnable
            public void run() {
                final boolean m7352c = C1840e.m7360a().m7352c(context, c1848k);
                C1455z.m8564a(0, new Runnable() { // from class: com.tsf.extend.theme.DIYThemeDetail.14.1
                    @Override // java.lang.Runnable
                    public void run() {
                        imageView.setSelected(m7352c);
                    }
                });
            }
        });
    }

    /* renamed from: m */
    private void m8199m() {
        C1840e.m7360a().m7358a(getContext(), this.f4961k);
        if (!(this.f4961k instanceof AbstractC1700aq)) {
            C1917w.m7055a(this.f4961k, getContext());
        }
    }

    /* renamed from: n */
    private void m8197n() {
        C1840e.m7360a().m7354b(getContext(), this.f4961k);
    }

    /* renamed from: o */
    private void m8195o() {
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), C1536f.C1537a.wallpaper_favorite_anim_in);
        final Animation loadAnimation2 = AnimationUtils.loadAnimation(getContext(), C1536f.C1537a.wallpaper_favorite_anim_out);
        loadAnimation2.setAnimationListener(new Animation.AnimationListener() { // from class: com.tsf.extend.theme.DIYThemeDetail.15
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                DIYThemeDetail.this.f4959i.setVisibility(8);
            }
        });
        final Runnable runnable = new Runnable() { // from class: com.tsf.extend.theme.DIYThemeDetail.16
            @Override // java.lang.Runnable
            public void run() {
                DIYThemeDetail.this.f4959i.startAnimation(loadAnimation2);
            }
        };
        loadAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.tsf.extend.theme.DIYThemeDetail.17
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
        this.f4959i.setVisibility(0);
        this.f4959i.startAnimation(loadAnimation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public boolean m8221a(String str, String str2) {
        return C1378c.m8817a(str2, str, null) == 0;
    }

    /* renamed from: a */
    private void m8224a(final AbstractC1700aq abstractC1700aq) {
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: com.tsf.extend.theme.DIYThemeDetail.2
            /* JADX WARN: Type inference failed for: r0v0, types: [com.tsf.extend.theme.DIYThemeDetail$2$1] */
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                switch (i) {
                    case ItemInfo.NO_ID /* -1 */:
                        new AsyncTask<Void, Void, Boolean>() { // from class: com.tsf.extend.theme.DIYThemeDetail.2.1
                            /* JADX INFO: Access modifiers changed from: protected */
                            @Override // android.os.AsyncTask
                            /* renamed from: a */
                            public Boolean doInBackground(Void... voidArr) {
                                return Boolean.valueOf(C1806c.m7429a().m7428a(C1547h.m8290b(), abstractC1700aq));
                            }

                            /* JADX INFO: Access modifiers changed from: protected */
                            @Override // android.os.AsyncTask
                            /* renamed from: a */
                            public void onPostExecute(Boolean bool) {
                                if (DIYThemeDetail.this.getContext() != null && bool.booleanValue()) {
                                    ((PersonalizationActivity) DIYThemeDetail.this.getContext()).m7004a(PersonalizationActivity.InterfaceC1954n.EnumC1955a.REMOVE);
                                    ((PersonalizationActivity) DIYThemeDetail.this.getContext()).onBackPressed();
                                }
                            }
                        }.execute(new Void[0]);
                        return;
                    default:
                        return;
                }
            }
        };
        int i = C1536f.C1543g.theme_diy_delete_msg;
        String g = abstractC1700aq.m7300g();
        if (!TextUtils.isEmpty(g) && g.contains("_LP")) {
            i = C1536f.C1543g.lp_theme_delete;
        }
        new DialogInterfaceC1526e.C1532a(getContext()).m8301a(i).m8298b(C1536f.C1543g.theme_change_cancel, onClickListener).m8300a(C1536f.C1543g.delete, onClickListener).m8302a().m8314a(true);
    }

    /* renamed from: a */
    private void m8231a(int i) {
        if (this.f4971u == null || this.f4971u.getVisibility() != 0) {
            View$OnClickListenerC1653ab view$OnClickListenerC1653ab = new View$OnClickListenerC1653ab(getContext());
            if (this.f4961k instanceof AbstractC1700aq) {
                view$OnClickListenerC1653ab.m7931a(this.f4961k.m7274t(), i);
            } else {
                view$OnClickListenerC1653ab.m7929b(this.f4961k.m7274t(), i);
            }
            this.f4957g.m8922a(view$OnClickListenerC1653ab);
            String str = this.f4969s;
            if (str.equals("0")) {
                str = "1010";
            }
            m8220a("4", str, "1011");
        }
    }

    /* renamed from: a */
    private void m8222a(String str) {
        m8220a(str, "0", "0");
    }

    /* renamed from: a */
    private void m8220a(String str, String str2, String str3) {
        if (this.f4961k == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m8216b(String str) {
        if (this.f4961k == null) {
        }
    }

    private BitmapDrawable getLikeUnselectDrawable() {
        Bitmap decodeResource = BitmapFactory.decodeResource(getResources(), C1536f.C1540d.wallpaper_favorite_btn);
        Paint paint = new Paint();
        paint.setColorFilter(new PorterDuffColorFilter(-16334705, PorterDuff.Mode.SRC_IN));
        Bitmap createBitmap = Bitmap.createBitmap(decodeResource.getWidth(), decodeResource.getHeight(), Bitmap.Config.ARGB_8888);
        new Canvas(createBitmap).drawBitmap(decodeResource, (Rect) null, new Rect(0, 0, decodeResource.getWidth(), decodeResource.getHeight()), paint);
        return new BitmapDrawable(getContext().getResources(), createBitmap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.extend.theme.DIYThemeDetail$d */
    /* loaded from: classes.dex */
    public class C1586d extends AbstractC1468a {

        /* renamed from: b */
        private C1583a f5021b;

        /* renamed from: c */
        private FrameLayout.LayoutParams f5022c = new FrameLayout.LayoutParams(-1, -1);

        public C1586d() {
            this.f5021b = new C1583a();
        }

        @Override // com.tsf.extend.base.support.AbstractC1468a
        /* renamed from: a */
        public float mo8176a(int i) {
            return DIYThemeDetail.this.f4951a;
        }

        @Override // com.tsf.extend.base.support.AbstractC1468a
        /* renamed from: a */
        public int mo6712a() {
            return DIYThemeDetail.this.f4965o;
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x00ef  */
        @Override // com.tsf.extend.base.support.AbstractC1468a
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object mo6710a(android.view.ViewGroup r9, int r10) {
            /*
                r8 = this;
                r6 = 0
                r4 = 1
                android.widget.ImageView r7 = new android.widget.ImageView
                android.content.Context r0 = r9.getContext()
                r7.<init>(r0)
                com.tsf.extend.theme.DIYThemeDetail r0 = com.tsf.extend.theme.DIYThemeDetail.this
                int r0 = com.tsf.extend.theme.DIYThemeDetail.m8212f(r0)
                if (r0 != r4) goto L7f
                android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.FIT_CENTER
                r7.setScaleType(r0)
                int r0 = com.tsf.extend.C1536f.C1538b.personal_list_item_bg
                r7.setImageResource(r0)
            L1d:
                com.tsf.extend.theme.DIYThemeDetail r0 = com.tsf.extend.theme.DIYThemeDetail.this
                java.util.List<android.widget.ImageView> r0 = r0.f4952b
                r0.add(r7)
                com.tsf.extend.theme.DIYThemeDetail$d$1 r3 = new com.tsf.extend.theme.DIYThemeDetail$d$1
                r3.<init>()
                com.tsf.extend.theme.DIYThemeDetail r0 = com.tsf.extend.theme.DIYThemeDetail.this
                com.tsf.extend.theme.k r0 = com.tsf.extend.theme.DIYThemeDetail.m8230a(r0)
                boolean r0 = r0 instanceof com.tsf.extend.theme.AbstractC1700aq
                if (r0 == 0) goto L8a
                com.tsf.extend.theme.v r0 = com.tsf.extend.theme.C1894v.m7069h()
                com.tsf.extend.theme.DIYThemeDetail r1 = com.tsf.extend.theme.DIYThemeDetail.this
                com.tsf.extend.theme.k r1 = com.tsf.extend.theme.DIYThemeDetail.m8230a(r1)
                java.lang.String r1 = r1.m7300g()
                com.tsf.extend.theme.DIYThemeDetail r2 = com.tsf.extend.theme.DIYThemeDetail.this
                com.tsf.extend.theme.k r2 = com.tsf.extend.theme.DIYThemeDetail.m8230a(r2)
                com.tsf.extend.theme.aq r2 = (com.tsf.extend.theme.AbstractC1700aq) r2
                r5 = r10
                r0.m7092a(r1, r2, r3, r4, r5)
            L4d:
                com.tsf.extend.theme.DIYThemeDetail r0 = com.tsf.extend.theme.DIYThemeDetail.this
                r7.setOnClickListener(r0)
                com.tsf.extend.theme.DIYThemeDetail r0 = com.tsf.extend.theme.DIYThemeDetail.this     // Catch: java.lang.Exception -> Le9
                com.tsf.extend.base.actstru.model.activi.PageActivity r0 = com.tsf.extend.theme.DIYThemeDetail.m8217b(r0)     // Catch: java.lang.Exception -> Le9
                if (r0 == 0) goto Led
                com.tsf.extend.theme.DIYThemeDetail r0 = com.tsf.extend.theme.DIYThemeDetail.this     // Catch: java.lang.Exception -> Le9
                com.tsf.extend.base.actstru.model.activi.PageActivity r0 = com.tsf.extend.theme.DIYThemeDetail.m8217b(r0)     // Catch: java.lang.Exception -> Le9
                com.tsf.extend.base.c.b r0 = r0.mo6732c()     // Catch: java.lang.Exception -> Le9
                if (r0 == 0) goto Led
                com.tsf.extend.theme.DIYThemeDetail r0 = com.tsf.extend.theme.DIYThemeDetail.this     // Catch: java.lang.Exception -> Le9
                com.tsf.extend.base.actstru.model.activi.PageActivity r0 = com.tsf.extend.theme.DIYThemeDetail.m8217b(r0)     // Catch: java.lang.Exception -> Le9
                com.tsf.extend.base.c.b r0 = r0.mo6732c()     // Catch: java.lang.Exception -> Le9
                boolean r0 = r0.mo7561c()     // Catch: java.lang.Exception -> Le9
            L74:
                if (r0 != 0) goto Lef
            L76:
                r7.setSoundEffectsEnabled(r4)
                android.widget.FrameLayout$LayoutParams r0 = r8.f5022c
                r9.addView(r7, r0)
                return r7
            L7f:
                android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.FIT_XY
                r7.setScaleType(r0)
                int r0 = com.tsf.extend.C1536f.C1538b.personal_list_item_bg
                r7.setBackgroundResource(r0)
                goto L1d
            L8a:
                com.tsf.extend.theme.DIYThemeDetail r0 = com.tsf.extend.theme.DIYThemeDetail.this
                com.tsf.extend.theme.k r0 = com.tsf.extend.theme.DIYThemeDetail.m8230a(r0)
                boolean r0 = r0 instanceof com.tsf.extend.theme.C1842f
                if (r0 == 0) goto Lc7
                com.tsf.extend.theme.DIYThemeDetail r0 = com.tsf.extend.theme.DIYThemeDetail.this
                java.util.List r0 = com.tsf.extend.theme.DIYThemeDetail.m8210g(r0)
                if (r0 == 0) goto L4d
                com.tsf.extend.theme.DIYThemeDetail r0 = com.tsf.extend.theme.DIYThemeDetail.this
                com.tsf.extend.theme.k r0 = com.tsf.extend.theme.DIYThemeDetail.m8230a(r0)
                if (r0 == 0) goto L4d
                com.tsf.extend.theme.DIYThemeDetail r0 = com.tsf.extend.theme.DIYThemeDetail.this
                java.util.List r0 = com.tsf.extend.theme.DIYThemeDetail.m8210g(r0)
                java.lang.Object r0 = r0.get(r10)
                java.lang.Integer r0 = (java.lang.Integer) r0
                int r0 = r0.intValue()
                com.tsf.extend.theme.v r1 = com.tsf.extend.theme.C1894v.m7069h()
                com.tsf.extend.theme.DIYThemeDetail r2 = com.tsf.extend.theme.DIYThemeDetail.this
                com.tsf.extend.theme.k r2 = com.tsf.extend.theme.DIYThemeDetail.m8230a(r2)
                java.lang.String r2 = r2.m7300g()
                r5 = 2
                r1.m7113a(r0, r2, r3, r5)
                goto L4d
            Lc7:
                com.tsf.extend.theme.DIYThemeDetail r0 = com.tsf.extend.theme.DIYThemeDetail.this
                java.util.List r0 = com.tsf.extend.theme.DIYThemeDetail.m8208h(r0)
                if (r0 == 0) goto L4d
                com.tsf.extend.theme.DIYThemeDetail r0 = com.tsf.extend.theme.DIYThemeDetail.this
                java.util.List r0 = com.tsf.extend.theme.DIYThemeDetail.m8208h(r0)
                java.lang.Object r0 = r0.get(r10)
                java.lang.String r0 = (java.lang.String) r0
                r7.setTag(r0)
                com.tsf.extend.theme.v r1 = com.tsf.extend.theme.C1894v.m7069h()
                com.tsf.extend.theme.DIYThemeDetail$a r2 = r8.f5021b
                r1.m7079c(r0, r2)
                goto L4d
            Le9:
                r0 = move-exception
                r0.printStackTrace()
            Led:
                r0 = r6
                goto L74
            Lef:
                r4 = r6
                goto L76
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tsf.extend.theme.DIYThemeDetail.C1586d.mo6710a(android.view.ViewGroup, int):java.lang.Object");
        }

        @Override // com.tsf.extend.base.support.AbstractC1468a
        /* renamed from: a */
        public void mo6709a(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
            DIYThemeDetail.this.f4952b.remove(obj);
        }

        @Override // com.tsf.extend.base.support.AbstractC1468a
        /* renamed from: a */
        public boolean mo6711a(View view, Object obj) {
            return view == obj;
        }
    }

    /* renamed from: com.tsf.extend.theme.DIYThemeDetail$a */
    /* loaded from: classes.dex */
    class C1583a implements AbstractC1386a.InterfaceC1396a<Pair<String, Bitmap>> {
        C1583a() {
        }

        @Override // com.tsf.extend.base.p074d.AbstractC1386a.InterfaceC1396a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo6245a(JSONObject jSONObject, Pair<String, Bitmap> pair) {
            if (pair != null) {
                String str = (String) pair.first;
                Bitmap bitmap = (Bitmap) pair.second;
                if (!TextUtils.isEmpty(str) && bitmap != null) {
                    for (ImageView imageView : DIYThemeDetail.this.f4952b) {
                        if (((String) imageView.getTag()).equals(str)) {
                            imageView.setImageBitmap(bitmap);
                        }
                    }
                }
            }
        }

        @Override // com.tsf.extend.base.p074d.AbstractC1386a.InterfaceC1396a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo6247a(JSONObject jSONObject, int i, Pair<String, Bitmap> pair) {
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        C1421b.m8698a(this.f4955e, this);
        m8209h();
    }

    /* renamed from: h */
    public void m8209h() {
        if (this.f4965o > 1) {
            this.f4951a = (0.5625f * this.f4955e.getHeight()) / (this.f4955e.getWidth() - PersonalizationActivity.m7012a(getContext(), 32.0f));
        } else {
            this.f4951a = 1.0f;
        }
        this.f4960j = new C1586d();
        this.f4955e.setAdapter(this.f4960j);
        this.f4955e.setClipToPadding(false);
        this.f4955e.setPageMargin(PersonalizationActivity.m7012a(getContext(), 16.0f));
    }

    @Override // com.tsf.extend.wallpaper.PersonalizationActivity.InterfaceC1954n
    /* renamed from: a */
    public void mo6940a(String str, PersonalizationActivity.InterfaceC1954n.EnumC1955a enumC1955a) {
        if ((PersonalizationActivity.InterfaceC1954n.EnumC1955a.REMOVE != enumC1955a || str == null || C1894v.m7069h().m7077d(str)) && this.f4961k != null && !TextUtils.isEmpty(str) && str.equals(this.f4961k.m7300g()) && enumC1955a != null && enumC1955a != PersonalizationActivity.InterfaceC1954n.EnumC1955a.ADD) {
            this.f4957g.onBackPressed();
        }
    }

    public void setFromInlet(String str) {
        this.f4967q = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.extend.theme.DIYThemeDetail$b */
    /* loaded from: classes.dex */
    public class C1584b implements C1821e.InterfaceC1828a {

        /* renamed from: a */
        public boolean f5012a = false;

        C1584b() {
        }

        @Override // com.tsf.extend.theme.diy.C1821e.InterfaceC1828a
        /* renamed from: a */
        public boolean mo7378a() {
            return this.f5012a;
        }

        @Override // com.tsf.extend.theme.diy.C1821e.InterfaceC1828a
        /* renamed from: b */
        public void mo7375b() {
            DIYThemeDetail.this.m8193p();
        }

        @Override // com.tsf.extend.theme.diy.C1821e.InterfaceC1828a
        /* renamed from: a */
        public void mo7377a(float f) {
            DIYThemeDetail.this.m8218b((int) f);
        }

        @Override // com.tsf.extend.theme.diy.C1821e.InterfaceC1828a
        /* renamed from: a */
        public void mo7376a(C1703b c1703b) {
            DIYThemeDetail.this.m8191q();
            DIYThemeDetail.this.f4950H = c1703b;
            if (DIYThemeDetail.this.f4975y) {
                DIYThemeDetail.this.m8186t();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public void m8193p() {
        C1419aa.m8707a(new Runnable() { // from class: com.tsf.extend.theme.DIYThemeDetail.3
            @Override // java.lang.Runnable
            public void run() {
                DIYThemeDetail.this.f4976z = (TextProgressBar) DIYThemeDetail.this.findViewById(C1536f.C1541e.cmt_download_pb);
                if (DIYThemeDetail.this.f4976z != null) {
                    DIYThemeDetail.this.f4976z.setProgressDrawable(DIYThemeDetail.this.getResources().getDrawable(C1536f.C1540d.green_progress));
                    DIYThemeDetail.this.f4976z.setVisibility(0);
                    DIYThemeDetail.this.f4956f.setVisibility(8);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public void m8191q() {
        C1419aa.m8707a(new Runnable() { // from class: com.tsf.extend.theme.DIYThemeDetail.4
            @Override // java.lang.Runnable
            public void run() {
                if (DIYThemeDetail.this.f4976z != null && DIYThemeDetail.this.f4976z.getVisibility() == 0) {
                    DIYThemeDetail.this.f4976z.setVisibility(8);
                    DIYThemeDetail.this.f4976z = null;
                    DIYThemeDetail.this.f4956f.setVisibility(0);
                    DIYThemeDetail.this.f4956f.setText(C1536f.C1543g.theme_detail_btn_apply);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m8218b(final int i) {
        C1419aa.m8707a(new Runnable() { // from class: com.tsf.extend.theme.DIYThemeDetail.5
            @Override // java.lang.Runnable
            public void run() {
                DIYThemeDetail.this.f4976z.setProgress(i);
                DIYThemeDetail.this.f4976z.setText(i + "%");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.tsf.extend.theme.DIYThemeDetail$c */
    /* loaded from: classes.dex */
    public class RunnableC1585c implements Runnable {

        /* renamed from: b */
        private boolean f5015b = false;

        /* renamed from: c */
        private C1584b f5016c;

        /* renamed from: d */
        private String f5017d;

        /* renamed from: e */
        private String f5018e;

        /* renamed from: f */
        private List<String> f5019f;

        RunnableC1585c(String str, String str2, List<String> list) {
            this.f5016c = new C1584b();
            this.f5017d = str;
            this.f5018e = str2;
            this.f5019f = list;
        }

        /* renamed from: a */
        public void m8178a() {
            this.f5016c.f5012a = true;
            this.f5015b = true;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1821e.m7397a(DIYThemeDetail.this.getContext(), this.f5017d, this.f5018e, this.f5019f, this.f5016c);
            this.f5015b = true;
        }
    }

    /* renamed from: a */
    private void m8219a(String str, String str2, List<String> list) {
        if (this.f4949G != null) {
            this.f4949G.m8178a();
        }
        this.f4949G = new RunnableC1585c(str, str2, list);
        new Thread(this.f4949G).start();
    }

    /* renamed from: r */
    private void m8189r() {
        if (this.f4949G != null) {
            this.f4949G.m8178a();
        }
    }

    /* renamed from: s */
    private boolean m8187s() {
        return (this.f4949G == null || this.f4949G.f5015b) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.tsf.extend.theme.DIYThemeDetail$8] */
    /* renamed from: t */
    public void m8186t() {
        final InterfaceC1380a interfaceC1380a = new InterfaceC1380a() { // from class: com.tsf.extend.theme.DIYThemeDetail.6
            @Override // com.tsf.extend.base.p073c.InterfaceC1380a
            /* renamed from: a */
            public void mo7464a(int i) {
                if (DIYThemeDetail.this.f4970t != null) {
                    DIYThemeDetail.this.f4970t.cancel();
                }
                DIYThemeDetail.this.f4948F.sendEmptyMessage(i);
            }
        };
        C1419aa.m8707a(new Runnable() { // from class: com.tsf.extend.theme.DIYThemeDetail.7
            @Override // java.lang.Runnable
            public void run() {
                DIYThemeDetail.this.m8205j();
            }
        });
        new AsyncTask<Void, Void, Void>() { // from class: com.tsf.extend.theme.DIYThemeDetail.8
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* renamed from: a */
            public Void doInBackground(Void... voidArr) {
                boolean m8016a;
                boolean z = false;
                try {
                    if (DIYThemeDetail.this.f4957g instanceof PersonalizationActivity) {
                        if (DIYThemeDetail.this.f4961k instanceof AbstractC1700aq) {
                            Object m7385b = C1821e.m7385b(((AbstractC1700aq) DIYThemeDetail.this.f4961k).m7753g(DIYThemeDetail.this.f4957g).getAbsolutePath() + File.separator + "diy.config", "isUsingOnLineWallpaper");
                            if (m7385b instanceof Boolean) {
                                z = ((Boolean) m7385b).booleanValue();
                            }
                        }
                        m8016a = ((PersonalizationActivity) DIYThemeDetail.this.f4957g).m6992a(DIYThemeDetail.this.f4961k.m7300g(), z, interfaceC1380a);
                    } else {
                        m8016a = (!(DIYThemeDetail.this.f4957g instanceof ThemeDetailActivity) || DIYThemeDetail.this.f4950H == null) ? false : ((ThemeDetailActivity) DIYThemeDetail.this.f4957g).m8016a(DIYThemeDetail.this.f4950H.m7300g(), false, interfaceC1380a);
                    }
                    if (!m8016a) {
                        DIYThemeDetail.this.f4948F.sendEmptyMessage(1);
                        return null;
                    }
                    return null;
                } catch (RemoteException e) {
                    DIYThemeDetail.this.f4948F.sendEmptyMessage(1);
                    return null;
                }
            }
        }.execute(new Void[0]);
        this.f4970t = new Timer();
        this.f4970t.schedule(new TimerTask() { // from class: com.tsf.extend.theme.DIYThemeDetail.9
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                DIYThemeDetail.this.f4948F.sendEmptyMessage(1);
            }
        }, 60000L);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        if (i == -1) {
            m8189r();
            Context context = getContext();
            if (context instanceof PageActivity) {
                ((PageActivity) context).onBackPressed();
            }
        }
    }
}
