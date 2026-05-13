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
import com.tsf.extend.base.actstru.model.activi.PageActivity;
import com.tsf.extend.base.d.a;
import com.tsf.extend.base.support.ViewPager;
import com.tsf.extend.base.view.PageIndicatorCompat;
import com.tsf.extend.base.view.TextProgressBar;
import com.tsf.extend.e;
import com.tsf.extend.f;
import com.tsf.extend.theme.cmclub.ThemeCmClubActivity;
import com.tsf.extend.theme.diy.e;
import com.tsf.extend.theme.j;
import com.tsf.extend.wallpaper.PersonalizationActivity;
import java.io.File;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class DIYThemeDetail extends FrameLayout implements DialogInterface.OnClickListener, View.OnClickListener, ViewTreeObserver.OnGlobalLayoutListener, PageActivity.a, PersonalizationActivity.n {
    private ImageView A;
    private boolean B;
    private View C;
    private View D;
    private View E;
    @SuppressLint({"HandlerLeak"})
    private Handler F;
    private c G;
    private com.tsf.extend.theme.b H;
    protected float a;
    public List<ImageView> b;
    private TextView c;
    private View d;
    private ViewPager e;
    private TextView f;
    private PageActivity g;
    private ImageView h;
    private View i;
    private d j;
    private k k;
    private List<String> l;
    private List<Integer> m;
    private PageIndicatorCompat n;
    private int o;
    private o p;
    private String q;
    private String r;
    private String s;
    private Timer t;
    private FrameLayout u;
    private ProgressBar v;
    private boolean w;
    private boolean x;
    private boolean y;
    private TextProgressBar z;

    public DIYThemeDetail(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.o = 0;
        this.b = Lists.newArrayList();
        this.r = "0";
        this.s = "0";
        this.u = null;
        this.v = null;
        this.x = false;
        this.y = false;
        this.B = false;
        this.F = new Handler() { // from class: com.tsf.extend.theme.DIYThemeDetail.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                switch (message.what) {
                    case 0:
                        if ((DIYThemeDetail.this.k instanceof com.tsf.extend.theme.b) && ((com.tsf.extend.theme.b) DIYThemeDetail.this.k).e()) {
                            ao.b().i();
                        }
                        DIYThemeDetail.this.g.setResult(-1);
                        DIYThemeDetail.this.g.finish();
                        DIYThemeDetail.this.b("0");
                        return;
                    default:
                        DIYThemeDetail.this.i();
                        Toast.makeText(DIYThemeDetail.this.g, f.g.theme_changing_fail, 1).show();
                        DIYThemeDetail.this.b("1");
                        return;
                }
            }
        };
    }

    public void g() {
        this.w = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.x) {
            a(Long.toString(this.k.h()), this.k.k(), this.k.t());
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
        this.B = z;
        if (this.B) {
            this.A.setVisibility(4);
            this.h.setVisibility(4);
            this.f.setText(f.g.theme_detail_btn_download);
        }
    }

    public void setTheme(k kVar) {
        a(kVar, false);
    }

    private void a(k kVar, boolean z) {
        int i;
        if (kVar != null) {
            this.k = kVar;
            l();
            if (!z) {
                a("0");
            }
            this.c.setText(this.k.i());
            int i2 = f.g.theme_detail_btn_apply;
            if (this.k instanceof f) {
                this.m = ((f) this.k).b();
                i = i2;
            } else if (this.k instanceof aq) {
                this.l = this.k.t();
                i = i2;
            } else {
                i = f.g.theme_detail_btn_download;
                this.l = this.k.t();
                this.d.setVisibility(8);
            }
            this.f.setText(i);
            if (this.k.n()) {
                this.d.setVisibility(8);
            }
            if (this.l != null && this.l.size() > 1) {
                this.o = this.l.size();
            } else if (this.m != null && this.m.size() > 1) {
                this.o = this.m.size();
            } else if (this.l != null && this.l.size() >= 0 && (this.k instanceof aq)) {
                this.o = this.l.size();
            } else {
                this.n.setVisibility(4);
            }
            if (this.o > 1 && !z) {
                for (int i3 = 0; i3 < this.o; i3++) {
                    this.n.a(i3, new PageIndicatorCompat.a(f.d.ic_pageindicator_current_inverse, f.d.ic_pageindicator_default_inverse), true);
                }
                this.n.setIgnoreBrightness(true);
                this.n.setActiveMarker(0);
                this.n.setVisibility(0);
            } else {
                this.n.setVisibility(4);
            }
            if (this.w) {
                this.d.setVisibility(4);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.e != null) {
            com.tsf.extend.base.j.b.a(this.e, this);
        }
        i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        if (this.p != null && this.p.isShowing()) {
            try {
                this.p.dismiss();
            } catch (Exception e) {
            }
            this.p = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        i();
        this.p = new o(this.g);
        try {
            this.p.show();
        } catch (Exception e) {
        }
    }

    public void setIsAutoDownload(boolean z) {
        this.x = z;
    }

    public void setIsAutoApply(boolean z) {
        this.y = z;
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
        this.g = pageActivity;
        if (pageActivity instanceof PersonalizationActivity) {
            ((PersonalizationActivity) this.g).a((PersonalizationActivity.n) this);
        }
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.a
    public void a() {
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.a
    public void b() {
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.a
    public void f() {
        if (this.s.equals("0")) {
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
        if (this.g != null && (this.g instanceof PersonalizationActivity)) {
            ((PersonalizationActivity) this.g).b((PersonalizationActivity.n) this);
        }
        this.b.clear();
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.a
    public boolean e() {
        a("51", this.s, this.r);
        if (s()) {
            try {
                new e.a(getContext()).a(f.g.exit_download_theme).b(f.g.theme_diy_dialog_cancel, this).a(f.g.theme_diy_dialog_exit, this).a().a(true);
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
        if (id == f.e.title) {
            this.g.onBackPressed();
        } else if (id == f.e.delete) {
            if (this.k instanceof aq) {
                a((aq) this.k);
            }
            a("3");
        } else if (id == f.e.theme_controll) {
            if (this.k != null) {
                this.g.a(false);
                if (this.u == null || this.u.getVisibility() != 0) {
                    if (this.u == null || this.u.getVisibility() != 0) {
                        if (getContext().getString(f.g.theme_detail_btn_apply).equals(this.f.getText())) {
                            t();
                        } else if (this.B) {
                            a("1");
                            a(Long.toString(this.k.h()), this.k.k(), this.k.t());
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        } else if (id == f.e.share) {
            if (this.k != null) {
                final String l = this.k.l();
                final String string = getContext().getString(f.g.share_title);
                final String string2 = getContext().getString(f.g.share_theme_msg);
                final String valueOf = String.valueOf(this.k.h());
                this.g.a(false);
                final File file = new File(com.tsf.extend.theme.diy.e.a(getContext()), this.k.g() + ".share.jpg");
                final j.a aVar = new j.a() { // from class: com.tsf.extend.theme.DIYThemeDetail.12
                    @Override // com.tsf.extend.theme.j.a
                    public void a(String str) {
                    }

                    @Override // com.tsf.extend.theme.j.a
                    public void a() {
                    }
                };
                if (file.exists()) {
                    new com.tsf.extend.base.g.c(getContext(), com.tsf.extend.base.g.d.a(l, file.getAbsolutePath(), string, string2, "https://goo.gl/XGthJ0", valueOf), aVar).a(getContext());
                } else {
                    k();
                    new AsyncTask<Void, Void, Boolean>() { // from class: com.tsf.extend.theme.DIYThemeDetail.13
                        /* JADX INFO: Access modifiers changed from: protected */
                        @Override // android.os.AsyncTask
                        /* renamed from: a */
                        public Boolean doInBackground(Void... voidArr) {
                            return Boolean.valueOf(DIYThemeDetail.this.a(file.getAbsolutePath(), DIYThemeDetail.this.k.l()));
                        }

                        /* JADX INFO: Access modifiers changed from: protected */
                        @Override // android.os.AsyncTask
                        /* renamed from: a */
                        public void onPostExecute(Boolean bool) {
                            boolean booleanValue = bool.booleanValue();
                            DIYThemeDetail.this.i();
                            new com.tsf.extend.base.g.c(DIYThemeDetail.this.getContext(), com.tsf.extend.base.g.d.a(l, booleanValue ? file.getAbsolutePath() : null, string, string2, "https://goo.gl/XGthJ0", valueOf), aVar).a(DIYThemeDetail.this.getContext());
                        }
                    }.execute(new Void[0]);
                }
                a("9");
            } else {
                return;
            }
        } else if (id == f.e.favorite_theme) {
            boolean z = !this.h.isSelected();
            this.h.setSelected(z);
            if (z) {
                a("10");
                o();
                m();
            } else {
                a("11");
                n();
            }
        } else if (id == f.e.more_diy_click) {
            ThemeCmClubActivity.a(getContext(), "launch_host_club", "", 4);
        } else if (id == f.e.club_click) {
            getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.facebook.com/groups/DIYTheme/")));
        } else if (view instanceof ImageView) {
            a(this.b.indexOf(view));
        }
        try {
            if (this.g != null && this.g.c() != null) {
                this.g.c().b();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void k() {
        i();
        this.p = new o(this.g);
        this.p.a("");
        this.p.show();
    }

    private void l() {
        final k kVar = this.k;
        final Context context = getContext();
        final ImageView imageView = this.h;
        com.tsf.extend.base.j.z.a(1, new Runnable() { // from class: com.tsf.extend.theme.DIYThemeDetail.14
            @Override // java.lang.Runnable
            public void run() {
                final boolean c2 = e.a().c(context, kVar);
                com.tsf.extend.base.j.z.a(0, new Runnable() { // from class: com.tsf.extend.theme.DIYThemeDetail.14.1
                    @Override // java.lang.Runnable
                    public void run() {
                        imageView.setSelected(c2);
                    }
                });
            }
        });
    }

    private void m() {
        e.a().a(getContext(), this.k);
        if (!(this.k instanceof aq)) {
            w.a(this.k, getContext());
        }
    }

    private void n() {
        e.a().b(getContext(), this.k);
    }

    private void o() {
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), f.a.wallpaper_favorite_anim_in);
        final Animation loadAnimation2 = AnimationUtils.loadAnimation(getContext(), f.a.wallpaper_favorite_anim_out);
        loadAnimation2.setAnimationListener(new Animation.AnimationListener() { // from class: com.tsf.extend.theme.DIYThemeDetail.15
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                DIYThemeDetail.this.i.setVisibility(8);
            }
        });
        final Runnable runnable = new Runnable() { // from class: com.tsf.extend.theme.DIYThemeDetail.16
            @Override // java.lang.Runnable
            public void run() {
                DIYThemeDetail.this.i.startAnimation(loadAnimation2);
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
                com.tsf.extend.base.j.z.a(0, runnable, 1000L);
            }
        });
        this.i.setVisibility(0);
        this.i.startAnimation(loadAnimation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(String str, String str2) {
        return com.tsf.extend.base.c.a(str2, str, null) == 0;
    }

    private void a(final aq aqVar) {
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
                                return Boolean.valueOf(com.tsf.extend.theme.diy.c.a().a(com.tsf.extend.h.b(), aqVar));
                            }

                            /* JADX INFO: Access modifiers changed from: protected */
                            @Override // android.os.AsyncTask
                            /* renamed from: a */
                            public void onPostExecute(Boolean bool) {
                                if (DIYThemeDetail.this.getContext() != null && bool.booleanValue()) {
                                    ((PersonalizationActivity) DIYThemeDetail.this.getContext()).a(PersonalizationActivity.n.a.REMOVE);
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
        int i = f.g.theme_diy_delete_msg;
        String g = aqVar.g();
        if (!TextUtils.isEmpty(g) && g.contains("_LP")) {
            i = f.g.lp_theme_delete;
        }
        new e.a(getContext()).a(i).b(f.g.theme_change_cancel, onClickListener).a(f.g.delete, onClickListener).a().a(true);
    }

    private void a(int i) {
        if (this.u == null || this.u.getVisibility() != 0) {
            ab abVar = new ab(getContext());
            if (this.k instanceof aq) {
                abVar.a(this.k.t(), i);
            } else {
                abVar.b(this.k.t(), i);
            }
            this.g.a(abVar);
            String str = this.s;
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
        if (this.k == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        if (this.k == null) {
        }
    }

    private BitmapDrawable getLikeUnselectDrawable() {
        Bitmap decodeResource = BitmapFactory.decodeResource(getResources(), f.d.wallpaper_favorite_btn);
        Paint paint = new Paint();
        paint.setColorFilter(new PorterDuffColorFilter(-16334705, PorterDuff.Mode.SRC_IN));
        Bitmap createBitmap = Bitmap.createBitmap(decodeResource.getWidth(), decodeResource.getHeight(), Bitmap.Config.ARGB_8888);
        new Canvas(createBitmap).drawBitmap(decodeResource, (Rect) null, new Rect(0, 0, decodeResource.getWidth(), decodeResource.getHeight()), paint);
        return new BitmapDrawable(getContext().getResources(), createBitmap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d extends com.tsf.extend.base.support.a {
        private a b;
        private FrameLayout.LayoutParams c = new FrameLayout.LayoutParams(-1, -1);

        public d() {
            this.b = new a();
        }

        @Override // com.tsf.extend.base.support.a
        public float a(int i) {
            return DIYThemeDetail.this.a;
        }

        @Override // com.tsf.extend.base.support.a
        public int a() {
            return DIYThemeDetail.this.o;
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x00ef  */
        @Override // com.tsf.extend.base.support.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object a(android.view.ViewGroup r9, int r10) {
            /*
                r8 = this;
                r6 = 0
                r4 = 1
                android.widget.ImageView r7 = new android.widget.ImageView
                android.content.Context r0 = r9.getContext()
                r7.<init>(r0)
                com.tsf.extend.theme.DIYThemeDetail r0 = com.tsf.extend.theme.DIYThemeDetail.this
                int r0 = com.tsf.extend.theme.DIYThemeDetail.f(r0)
                if (r0 != r4) goto L7f
                android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.FIT_CENTER
                r7.setScaleType(r0)
                int r0 = com.tsf.extend.f.b.personal_list_item_bg
                r7.setImageResource(r0)
            L1d:
                com.tsf.extend.theme.DIYThemeDetail r0 = com.tsf.extend.theme.DIYThemeDetail.this
                java.util.List<android.widget.ImageView> r0 = r0.b
                r0.add(r7)
                com.tsf.extend.theme.DIYThemeDetail$d$1 r3 = new com.tsf.extend.theme.DIYThemeDetail$d$1
                r3.<init>()
                com.tsf.extend.theme.DIYThemeDetail r0 = com.tsf.extend.theme.DIYThemeDetail.this
                com.tsf.extend.theme.k r0 = com.tsf.extend.theme.DIYThemeDetail.a(r0)
                boolean r0 = r0 instanceof com.tsf.extend.theme.aq
                if (r0 == 0) goto L8a
                com.tsf.extend.theme.v r0 = com.tsf.extend.theme.v.h()
                com.tsf.extend.theme.DIYThemeDetail r1 = com.tsf.extend.theme.DIYThemeDetail.this
                com.tsf.extend.theme.k r1 = com.tsf.extend.theme.DIYThemeDetail.a(r1)
                java.lang.String r1 = r1.g()
                com.tsf.extend.theme.DIYThemeDetail r2 = com.tsf.extend.theme.DIYThemeDetail.this
                com.tsf.extend.theme.k r2 = com.tsf.extend.theme.DIYThemeDetail.a(r2)
                com.tsf.extend.theme.aq r2 = (com.tsf.extend.theme.aq) r2
                r5 = r10
                r0.a(r1, r2, r3, r4, r5)
            L4d:
                com.tsf.extend.theme.DIYThemeDetail r0 = com.tsf.extend.theme.DIYThemeDetail.this
                r7.setOnClickListener(r0)
                com.tsf.extend.theme.DIYThemeDetail r0 = com.tsf.extend.theme.DIYThemeDetail.this     // Catch: java.lang.Exception -> Le9
                com.tsf.extend.base.actstru.model.activi.PageActivity r0 = com.tsf.extend.theme.DIYThemeDetail.b(r0)     // Catch: java.lang.Exception -> Le9
                if (r0 == 0) goto Led
                com.tsf.extend.theme.DIYThemeDetail r0 = com.tsf.extend.theme.DIYThemeDetail.this     // Catch: java.lang.Exception -> Le9
                com.tsf.extend.base.actstru.model.activi.PageActivity r0 = com.tsf.extend.theme.DIYThemeDetail.b(r0)     // Catch: java.lang.Exception -> Le9
                com.tsf.extend.base.c.b r0 = r0.c()     // Catch: java.lang.Exception -> Le9
                if (r0 == 0) goto Led
                com.tsf.extend.theme.DIYThemeDetail r0 = com.tsf.extend.theme.DIYThemeDetail.this     // Catch: java.lang.Exception -> Le9
                com.tsf.extend.base.actstru.model.activi.PageActivity r0 = com.tsf.extend.theme.DIYThemeDetail.b(r0)     // Catch: java.lang.Exception -> Le9
                com.tsf.extend.base.c.b r0 = r0.c()     // Catch: java.lang.Exception -> Le9
                boolean r0 = r0.c()     // Catch: java.lang.Exception -> Le9
            L74:
                if (r0 != 0) goto Lef
            L76:
                r7.setSoundEffectsEnabled(r4)
                android.widget.FrameLayout$LayoutParams r0 = r8.c
                r9.addView(r7, r0)
                return r7
            L7f:
                android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.FIT_XY
                r7.setScaleType(r0)
                int r0 = com.tsf.extend.f.b.personal_list_item_bg
                r7.setBackgroundResource(r0)
                goto L1d
            L8a:
                com.tsf.extend.theme.DIYThemeDetail r0 = com.tsf.extend.theme.DIYThemeDetail.this
                com.tsf.extend.theme.k r0 = com.tsf.extend.theme.DIYThemeDetail.a(r0)
                boolean r0 = r0 instanceof com.tsf.extend.theme.f
                if (r0 == 0) goto Lc7
                com.tsf.extend.theme.DIYThemeDetail r0 = com.tsf.extend.theme.DIYThemeDetail.this
                java.util.List r0 = com.tsf.extend.theme.DIYThemeDetail.g(r0)
                if (r0 == 0) goto L4d
                com.tsf.extend.theme.DIYThemeDetail r0 = com.tsf.extend.theme.DIYThemeDetail.this
                com.tsf.extend.theme.k r0 = com.tsf.extend.theme.DIYThemeDetail.a(r0)
                if (r0 == 0) goto L4d
                com.tsf.extend.theme.DIYThemeDetail r0 = com.tsf.extend.theme.DIYThemeDetail.this
                java.util.List r0 = com.tsf.extend.theme.DIYThemeDetail.g(r0)
                java.lang.Object r0 = r0.get(r10)
                java.lang.Integer r0 = (java.lang.Integer) r0
                int r0 = r0.intValue()
                com.tsf.extend.theme.v r1 = com.tsf.extend.theme.v.h()
                com.tsf.extend.theme.DIYThemeDetail r2 = com.tsf.extend.theme.DIYThemeDetail.this
                com.tsf.extend.theme.k r2 = com.tsf.extend.theme.DIYThemeDetail.a(r2)
                java.lang.String r2 = r2.g()
                r5 = 2
                r1.a(r0, r2, r3, r5)
                goto L4d
            Lc7:
                com.tsf.extend.theme.DIYThemeDetail r0 = com.tsf.extend.theme.DIYThemeDetail.this
                java.util.List r0 = com.tsf.extend.theme.DIYThemeDetail.h(r0)
                if (r0 == 0) goto L4d
                com.tsf.extend.theme.DIYThemeDetail r0 = com.tsf.extend.theme.DIYThemeDetail.this
                java.util.List r0 = com.tsf.extend.theme.DIYThemeDetail.h(r0)
                java.lang.Object r0 = r0.get(r10)
                java.lang.String r0 = (java.lang.String) r0
                r7.setTag(r0)
                com.tsf.extend.theme.v r1 = com.tsf.extend.theme.v.h()
                com.tsf.extend.theme.DIYThemeDetail$a r2 = r8.b
                r1.c(r0, r2)
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
            throw new UnsupportedOperationException("Method not decompiled: com.tsf.extend.theme.DIYThemeDetail.d.a(android.view.ViewGroup, int):java.lang.Object");
        }

        @Override // com.tsf.extend.base.support.a
        public void a(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
            DIYThemeDetail.this.b.remove(obj);
        }

        @Override // com.tsf.extend.base.support.a
        public boolean a(View view, Object obj) {
            return view == obj;
        }
    }

    /* loaded from: classes.dex */
    class a implements a.InterfaceC0048a<Pair<String, Bitmap>> {
        a() {
        }

        @Override // com.tsf.extend.base.d.a.InterfaceC0048a
        public void a(JSONObject jSONObject, Pair<String, Bitmap> pair) {
            if (pair != null) {
                String str = (String) pair.first;
                Bitmap bitmap = (Bitmap) pair.second;
                if (!TextUtils.isEmpty(str) && bitmap != null) {
                    for (ImageView imageView : DIYThemeDetail.this.b) {
                        if (((String) imageView.getTag()).equals(str)) {
                            imageView.setImageBitmap(bitmap);
                        }
                    }
                }
            }
        }

        @Override // com.tsf.extend.base.d.a.InterfaceC0048a
        public void a(JSONObject jSONObject, int i, Pair<String, Bitmap> pair) {
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.tsf.extend.base.j.b.a(this.e, this);
        h();
    }

    public void h() {
        if (this.o > 1) {
            this.a = (0.5625f * this.e.getHeight()) / (this.e.getWidth() - PersonalizationActivity.a(getContext(), 32.0f));
        } else {
            this.a = 1.0f;
        }
        this.j = new d();
        this.e.setAdapter(this.j);
        this.e.setClipToPadding(false);
        this.e.setPageMargin(PersonalizationActivity.a(getContext(), 16.0f));
    }

    @Override // com.tsf.extend.wallpaper.PersonalizationActivity.n
    public void a(String str, PersonalizationActivity.n.a aVar) {
        if ((PersonalizationActivity.n.a.REMOVE != aVar || str == null || v.h().d(str)) && this.k != null && !TextUtils.isEmpty(str) && str.equals(this.k.g()) && aVar != null && aVar != PersonalizationActivity.n.a.ADD) {
            this.g.onBackPressed();
        }
    }

    public void setFromInlet(String str) {
        this.q = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements e.a {
        public boolean a = false;

        b() {
        }

        @Override // com.tsf.extend.theme.diy.e.a
        public boolean a() {
            return this.a;
        }

        @Override // com.tsf.extend.theme.diy.e.a
        public void b() {
            DIYThemeDetail.this.p();
        }

        @Override // com.tsf.extend.theme.diy.e.a
        public void a(float f) {
            DIYThemeDetail.this.b((int) f);
        }

        @Override // com.tsf.extend.theme.diy.e.a
        public void a(com.tsf.extend.theme.b bVar) {
            DIYThemeDetail.this.q();
            DIYThemeDetail.this.H = bVar;
            if (DIYThemeDetail.this.y) {
                DIYThemeDetail.this.t();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        com.tsf.extend.base.j.aa.a(new Runnable() { // from class: com.tsf.extend.theme.DIYThemeDetail.3
            @Override // java.lang.Runnable
            public void run() {
                DIYThemeDetail.this.z = (TextProgressBar) DIYThemeDetail.this.findViewById(f.e.cmt_download_pb);
                if (DIYThemeDetail.this.z != null) {
                    DIYThemeDetail.this.z.setProgressDrawable(DIYThemeDetail.this.getResources().getDrawable(f.d.green_progress));
                    DIYThemeDetail.this.z.setVisibility(0);
                    DIYThemeDetail.this.f.setVisibility(8);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        com.tsf.extend.base.j.aa.a(new Runnable() { // from class: com.tsf.extend.theme.DIYThemeDetail.4
            @Override // java.lang.Runnable
            public void run() {
                if (DIYThemeDetail.this.z != null && DIYThemeDetail.this.z.getVisibility() == 0) {
                    DIYThemeDetail.this.z.setVisibility(8);
                    DIYThemeDetail.this.z = null;
                    DIYThemeDetail.this.f.setVisibility(0);
                    DIYThemeDetail.this.f.setText(f.g.theme_detail_btn_apply);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final int i) {
        com.tsf.extend.base.j.aa.a(new Runnable() { // from class: com.tsf.extend.theme.DIYThemeDetail.5
            @Override // java.lang.Runnable
            public void run() {
                DIYThemeDetail.this.z.setProgress(i);
                DIYThemeDetail.this.z.setText(i + "%");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class c implements Runnable {
        private boolean b = false;
        private b c;
        private String d;
        private String e;
        private List<String> f;

        c(String str, String str2, List<String> list) {
            this.c = new b();
            this.d = str;
            this.e = str2;
            this.f = list;
        }

        public void a() {
            this.c.a = true;
            this.b = true;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.tsf.extend.theme.diy.e.a(DIYThemeDetail.this.getContext(), this.d, this.e, this.f, this.c);
            this.b = true;
        }
    }

    private void a(String str, String str2, List<String> list) {
        if (this.G != null) {
            this.G.a();
        }
        this.G = new c(str, str2, list);
        new Thread(this.G).start();
    }

    private void r() {
        if (this.G != null) {
            this.G.a();
        }
    }

    private boolean s() {
        return (this.G == null || this.G.b) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.tsf.extend.theme.DIYThemeDetail$8] */
    public void t() {
        final com.tsf.extend.base.c.a aVar = new com.tsf.extend.base.c.a() { // from class: com.tsf.extend.theme.DIYThemeDetail.6
            @Override // com.tsf.extend.base.c.a
            public void a(int i) {
                if (DIYThemeDetail.this.t != null) {
                    DIYThemeDetail.this.t.cancel();
                }
                DIYThemeDetail.this.F.sendEmptyMessage(i);
            }
        };
        com.tsf.extend.base.j.aa.a(new Runnable() { // from class: com.tsf.extend.theme.DIYThemeDetail.7
            @Override // java.lang.Runnable
            public void run() {
                DIYThemeDetail.this.j();
            }
        });
        new AsyncTask<Void, Void, Void>() { // from class: com.tsf.extend.theme.DIYThemeDetail.8
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* renamed from: a */
            public Void doInBackground(Void... voidArr) {
                boolean a2;
                boolean z = false;
                try {
                    if (DIYThemeDetail.this.g instanceof PersonalizationActivity) {
                        if (DIYThemeDetail.this.k instanceof aq) {
                            Object b2 = com.tsf.extend.theme.diy.e.b(((aq) DIYThemeDetail.this.k).g(DIYThemeDetail.this.g).getAbsolutePath() + File.separator + "diy.config", "isUsingOnLineWallpaper");
                            if (b2 instanceof Boolean) {
                                z = ((Boolean) b2).booleanValue();
                            }
                        }
                        a2 = ((PersonalizationActivity) DIYThemeDetail.this.g).a(DIYThemeDetail.this.k.g(), z, aVar);
                    } else {
                        a2 = (!(DIYThemeDetail.this.g instanceof ThemeDetailActivity) || DIYThemeDetail.this.H == null) ? false : ((ThemeDetailActivity) DIYThemeDetail.this.g).a(DIYThemeDetail.this.H.g(), false, aVar);
                    }
                    if (!a2) {
                        DIYThemeDetail.this.F.sendEmptyMessage(1);
                        return null;
                    }
                    return null;
                } catch (RemoteException e) {
                    DIYThemeDetail.this.F.sendEmptyMessage(1);
                    return null;
                }
            }
        }.execute(new Void[0]);
        this.t = new Timer();
        this.t.schedule(new TimerTask() { // from class: com.tsf.extend.theme.DIYThemeDetail.9
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                DIYThemeDetail.this.F.sendEmptyMessage(1);
            }
        }, 60000L);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        if (i == -1) {
            r();
            Context context = getContext();
            if (context instanceof PageActivity) {
                ((PageActivity) context).onBackPressed();
            }
        }
    }
}
