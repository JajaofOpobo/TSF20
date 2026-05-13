package com.tsf.extend.wallpaper;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.collect.Lists;
import com.tsf.extend.C1536f;
import com.tsf.extend.C1547h;
import com.tsf.extend.base.InterfaceC1385d;
import com.tsf.extend.base.actstru.model.activi.PageActivity;
import com.tsf.extend.base.p078h.C1413a;
import com.tsf.extend.base.p080j.C1426e;
import com.tsf.extend.base.p080j.C1435n;
import com.tsf.extend.base.p080j.C1448t;
import com.tsf.extend.base.view.DialogInterface$OnCancelListenerC1477c;
import com.tsf.extend.keyboard.KeyboardPager;
import com.tsf.extend.theme.ThemePager;
import com.tsf.extend.wallpaper.upload.UploadWallpaperActivity;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
/* loaded from: classes.dex */
public class PersonalizationPager extends LinearLayout implements View.OnClickListener, PageActivity.InterfaceC1352a, DialogInterface$OnCancelListenerC1477c.InterfaceC1478a {

    /* renamed from: a */
    public static final int[] f6264a = {C1536f.C1541e.tab_wallpaper, C1536f.C1541e.tab_theme, C1536f.C1541e.tab_keyboard};

    /* renamed from: b */
    private PageActivity f6265b;

    /* renamed from: c */
    private View f6266c;

    /* renamed from: d */
    private View f6267d;

    /* renamed from: e */
    private View f6268e;

    /* renamed from: f */
    private ImageView f6269f;

    /* renamed from: g */
    private ImageView f6270g;

    /* renamed from: h */
    private ImageView f6271h;

    /* renamed from: i */
    private FrameLayout f6272i;

    /* renamed from: j */
    private Handler f6273j;

    /* renamed from: k */
    private int f6274k;

    /* renamed from: l */
    private int f6275l;

    /* renamed from: m */
    private WallpaperPager f6276m;

    /* renamed from: n */
    private ThemePager f6277n;

    /* renamed from: o */
    private KeyboardPager f6278o;

    public PersonalizationPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6275l = 2;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f6266c = findViewById(C1536f.C1541e.tab_wallpaper);
        this.f6267d = findViewById(C1536f.C1541e.tab_theme);
        this.f6268e = findViewById(C1536f.C1541e.tab_keyboard);
        this.f6269f = (ImageView) findViewById(C1536f.C1541e.tab_wallpaper_icon);
        this.f6270g = (ImageView) findViewById(C1536f.C1541e.tab_theme_icon);
        this.f6271h = (ImageView) findViewById(C1536f.C1541e.tab_keyboard_icon);
        C2096n c2096n = new C2096n(getResources().getDrawable(C1536f.C1540d.personal_tab_wallpaper_icon), -16334705);
        C2096n c2096n2 = new C2096n(getResources().getDrawable(C1536f.C1540d.personal_tab_theme_icon), -16334705);
        new C2096n(getResources().getDrawable(C1536f.C1540d.personal_tab_mine_icon), -16334705);
        new C2096n(getResources().getDrawable(C1536f.C1540d.personal_tab_locker_icon), -16334705);
        C2096n c2096n3 = new C2096n(getResources().getDrawable(C1536f.C1540d.personal_tab_keyboard_icon), -16334705);
        this.f6269f.setImageDrawable(c2096n);
        this.f6270g.setImageDrawable(c2096n2);
        this.f6271h.setImageDrawable(c2096n3);
        this.f6266c.setOnClickListener(this);
        this.f6267d.setOnClickListener(this);
        this.f6268e.setOnClickListener(this);
        this.f6272i = (FrameLayout) findViewById(C1536f.C1541e.container);
        this.f6276m = (WallpaperPager) LayoutInflater.from(getContext()).inflate(C1536f.C1542f.wallpaper_pager, (ViewGroup) null);
        this.f6276m.setPagerActivity((PageActivity) getContext());
        this.f6276m.setVisibility(8);
        this.f6272i.addView(this.f6276m, 0);
        this.f6277n = (ThemePager) LayoutInflater.from(getContext()).inflate(C1536f.C1542f.theme_pager, (ViewGroup) null);
        this.f6277n.setPagerActivity((PageActivity) getContext());
        this.f6277n.setVisibility(8);
        this.f6272i.addView(this.f6277n, 0);
        m6927n();
        Context context = getContext();
        if (!(context instanceof PersonalizationActivity) || ((PersonalizationActivity) context).m6965m()) {
        }
        HandlerThread handlerThread = new HandlerThread("");
        handlerThread.start();
        this.f6273j = new Handler(handlerThread.getLooper());
    }

    public String getThemeSecondTab() {
        if (this.f6277n != null) {
            return this.f6277n.getSecondTab();
        }
        return null;
    }

    public void setTabIndex(int i) {
        if (this.f6274k != i) {
            this.f6274k = i;
            setTabState(i);
            switch (i) {
                case 1:
                case 2:
                default:
                    return;
            }
        }
    }

    public void setTabState(int i) {
        boolean z = i == 1;
        if (i == 5) {
        }
        boolean z2 = i == 2;
        if (i == 6) {
        }
        boolean z3 = i == 7;
        this.f6277n.setVisibility(z ? 0 : 8);
        this.f6267d.setSelected(z);
        if (Build.VERSION.SDK_INT >= 11) {
            this.f6267d.setAlpha(z ? 1.0f : 0.6f);
        }
        this.f6270g.setSelected(z);
        this.f6269f.setSelected(z2);
        this.f6266c.setSelected(z2);
        this.f6276m.setVisibility(z2 ? 0 : 8);
        if (Build.VERSION.SDK_INT >= 11) {
            this.f6266c.setAlpha(z2 ? 1.0f : 0.6f);
        }
        if (this.f6271h != null && this.f6268e != null && this.f6278o != null) {
            this.f6268e.setSelected(z3);
            this.f6271h.setSelected(z3);
            if (Build.VERSION.SDK_INT >= 11) {
                this.f6268e.setAlpha(z3 ? 1.0f : 0.6f);
            }
            this.f6278o.setVisibility(z3 ? 0 : 8);
        }
    }

    /* renamed from: k */
    private void m6930k() {
        final DialogInterface$OnCancelListenerC1477c dialogInterface$OnCancelListenerC1477c = new DialogInterface$OnCancelListenerC1477c(this.f6265b, -3);
        dialogInterface$OnCancelListenerC1477c.m8459a(this);
        dialogInterface$OnCancelListenerC1477c.m8461a(C1536f.C1543g.wallpaper_fb_title, C1536f.C1543g.wallpaper_fb_content, C1536f.C1543g.wallpaper_fb_subcribe, 0, BitmapFactory.decodeResource(getResources(), C1536f.C1540d.ic_facebook), new View.OnClickListener() { // from class: com.tsf.extend.wallpaper.PersonalizationPager.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                dialogInterface$OnCancelListenerC1477c.dismiss();
                PersonalizationPager.this.m6929l();
            }
        }, null);
        dialogInterface$OnCancelListenerC1477c.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public void m6929l() {
        C1435n.m8628b(this.f6265b);
    }

    /* renamed from: a */
    private void m6935a(Uri uri) {
        Intent intent = new Intent();
        intent.setClass(getContext(), UploadWallpaperActivity.class);
        intent.setFlags(268435456);
        intent.putExtra("UPLOAD_EXTRA_URI", uri);
        getContext().startActivity(intent);
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.InterfaceC1352a
    public boolean getPendingTransition() {
        return false;
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.InterfaceC1352a
    public View getContent() {
        return this;
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.InterfaceC1352a
    /* renamed from: a */
    public void mo6535a(PageActivity pageActivity) {
        this.f6265b = pageActivity;
        setTabIndex(this.f6275l);
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.InterfaceC1352a
    /* renamed from: a */
    public void mo6536a() {
        m6928m();
        if (this.f6277n != null) {
            this.f6277n.m7993f();
        }
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.InterfaceC1352a
    /* renamed from: b */
    public void mo6532b() {
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.InterfaceC1352a
    /* renamed from: f */
    public void mo6528f() {
        if (this.f6277n != null) {
            this.f6277n.m7999b();
        }
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.InterfaceC1352a
    public Bundle getResult() {
        return null;
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.InterfaceC1352a
    /* renamed from: c */
    public void mo6531c() {
        if (this.f6277n != null) {
            this.f6277n.m7999b();
            this.f6277n.m7998c();
        }
        if (this.f6276m != null) {
            this.f6276m.m6724b();
        }
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.InterfaceC1352a
    /* renamed from: d */
    public void mo6530d() {
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.InterfaceC1352a
    /* renamed from: e */
    public boolean mo6529e() {
        if (this.f6277n != null) {
            this.f6277n.m7999b();
        }
        this.f6265b.finish();
        return true;
    }

    /* renamed from: a */
    public void m6936a(Intent intent) {
        if (intent != null) {
            WallpaperDetail wallpaperDetail = (WallpaperDetail) LayoutInflater.from(this.f6265b).inflate(C1536f.C1542f.wallpaper_detail, (ViewGroup) null);
            wallpaperDetail.setType(EnumC2057ai.BalloonType);
            C2094m c2094m = new C2094m();
            String stringExtra = intent.getStringExtra("id");
            if (TextUtils.isEmpty(stringExtra)) {
                stringExtra = "0";
            }
            c2094m.m6439c(Integer.valueOf(stringExtra).intValue());
            String stringExtra2 = intent.getStringExtra("categoryid");
            if (TextUtils.isEmpty(stringExtra2)) {
                stringExtra2 = "0";
            }
            c2094m.m6440c(Integer.valueOf(stringExtra2).intValue());
            c2094m.m6438c(intent.getStringExtra("url"));
            c2094m.m6442b(intent.getStringExtra("ThumbUrl"));
            ArrayList newArrayList = Lists.newArrayList();
            newArrayList.add(c2094m);
            wallpaperDetail.m6854a((List<? extends C2106s>) newArrayList, (C2106s) c2094m, false);
            this.f6265b.m8922a(wallpaperDetail);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        InterfaceC1385d m8293a = C1547h.m8293a();
        int i = this.f6274k;
        int id = view.getId();
        if (id == C1536f.C1541e.tab_wallpaper) {
            setTabIndex(2);
            if (m8293a != null) {
                m8293a.mo8815a(5);
            }
        } else if (id == C1536f.C1541e.tab_theme) {
            setTabIndex(1);
            if (m8293a != null) {
                m8293a.mo8813b(4);
            }
        } else if (id == C1536f.C1541e.tab_keyboard) {
            if (m8293a != null) {
                m8293a.mo8811c(1);
            }
            setTabIndex(7);
        }
        m6928m();
    }

    public String getCurrentPageCode() {
        return m6933b(this.f6274k);
    }

    /* renamed from: b */
    private String m6933b(int i) {
        switch (i) {
            case 1:
                return this.f6277n.getCurrentPageCode();
            case 2:
                return this.f6276m.getCurrentPageCode();
            case 3:
            case 4:
            default:
                return "0";
            case 5:
                return "1003";
            case 6:
                return "1002";
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

    /* renamed from: a */
    public boolean m6938a(int i, int i2, Intent intent) {
        if (i == 1001 && i2 == -1) {
            final Uri data = intent.getData();
            if (data != null) {
                this.f6273j.post(new Runnable() { // from class: com.tsf.extend.wallpaper.PersonalizationPager.2
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            Uri m8665c = C1426e.m8665c(PersonalizationPager.this.f6265b, data);
                            C2146x c2146x = new C2146x(PersonalizationPager.this.f6265b);
                            Bitmap m6234a = c2146x.m6234a(m8665c);
                            if (m6234a != null) {
                                final WallpaperClip wallpaperClip = (WallpaperClip) LayoutInflater.from(PersonalizationPager.this.f6265b).inflate(C1536f.C1542f.wallpaper_clip, (ViewGroup) null);
                                wallpaperClip.m6917a(c2146x, m6234a);
                                PersonalizationPager.this.f6265b.runOnUiThread(new Runnable() { // from class: com.tsf.extend.wallpaper.PersonalizationPager.2.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        PersonalizationPager.this.f6265b.m8922a(wallpaperClip);
                                    }
                                });
                            }
                        } catch (FileNotFoundException e) {
                        } catch (IOException e2) {
                        } catch (OutOfMemoryError e3) {
                        }
                    }
                });
                return true;
            }
            return true;
        } else if (i == 2 && i2 == -1 && intent != null) {
            m6935a(intent.getData());
            return true;
        } else {
            if (i == 4) {
                C1413a m8754a = C1413a.m8754a();
                if (!m8754a.m8743d()) {
                    m8754a.m8746c();
                    m6930k();
                }
            }
            return false;
        }
    }

    /* renamed from: a */
    public void m6937a(int i, String str) {
        if (TextUtils.isEmpty(str)) {
        }
    }

    /* renamed from: a */
    public void m6939a(int i) {
        switch (i) {
            case 1:
                this.f6275l = 2;
                return;
            case 2:
            case 6:
                this.f6275l = 1;
                return;
            case 3:
                this.f6275l = 6;
                return;
            case 4:
                this.f6275l = 1;
                return;
            case 5:
            default:
                return;
        }
    }

    /* renamed from: m */
    private void m6928m() {
        if (this.f6277n != null && this.f6274k == 1) {
            this.f6277n.m8004a();
        }
        if (this.f6276m != null && this.f6274k == 2) {
            this.f6276m.m6729a();
        }
    }

    /* renamed from: j */
    public void m6931j() {
        if (this.f6277n != null) {
            this.f6277n.m7995e();
        }
    }

    public void setChildPagerDefIndex(int i) {
        if (this.f6276m != null) {
            this.f6276m.setDefTabIndex(i);
        }
    }

    public static long getTimesmorning() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(13, 0);
        calendar.set(12, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    public static long getTimesnight() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 24);
        calendar.set(13, 0);
        calendar.set(12, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    /* renamed from: n */
    private void m6927n() {
        if (C1448t.m8591a(C1547h.m8290b())) {
            this.f6278o = (KeyboardPager) LayoutInflater.from(getContext()).inflate(C1536f.C1542f.keyboard_pager, (ViewGroup) null);
            this.f6278o.setVisibility(8);
            this.f6268e.setVisibility(0);
            this.f6272i.addView(this.f6278o, 0);
        }
    }
}
