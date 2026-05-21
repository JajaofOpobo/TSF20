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
import com.tsf.extend.base.actstru.model.activi.PageActivity;
import com.tsf.extend.base.view.c;
import com.tsf.extend.f;
import com.tsf.extend.keyboard.KeyboardPager;
import com.tsf.extend.theme.ThemePager;
import com.tsf.extend.wallpaper.upload.UploadWallpaperActivity;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class PersonalizationPager extends LinearLayout implements View.OnClickListener, PageActivity.a, c.a {
    public static final int[] a = {f.e.tab_wallpaper, f.e.tab_theme, f.e.tab_keyboard};
    private PageActivity b;
    private View c;
    private View d;
    private View e;
    private ImageView f;
    private ImageView g;
    private ImageView h;
    private FrameLayout i;
    private Handler j;
    private int k;
    private int l;
    private WallpaperPager m;
    private ThemePager n;
    private KeyboardPager o;

    public PersonalizationPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.l = 2;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.c = findViewById(f.e.tab_wallpaper);
        this.d = findViewById(f.e.tab_theme);
        this.e = findViewById(f.e.tab_keyboard);
        this.f = (ImageView) findViewById(f.e.tab_wallpaper_icon);
        this.g = (ImageView) findViewById(f.e.tab_theme_icon);
        this.h = (ImageView) findViewById(f.e.tab_keyboard_icon);
        n nVar = new n(getResources().getDrawable(f.d.personal_tab_wallpaper_icon), -16334705);
        n nVar2 = new n(getResources().getDrawable(f.d.personal_tab_theme_icon), -16334705);
        new n(getResources().getDrawable(f.d.personal_tab_mine_icon), -16334705);
        new n(getResources().getDrawable(f.d.personal_tab_locker_icon), -16334705);
        n nVar3 = new n(getResources().getDrawable(f.d.personal_tab_keyboard_icon), -16334705);
        this.f.setImageDrawable(nVar);
        this.g.setImageDrawable(nVar2);
        this.h.setImageDrawable(nVar3);
        this.c.setOnClickListener(this);
        this.d.setOnClickListener(this);
        this.e.setOnClickListener(this);
        this.i = (FrameLayout) findViewById(f.e.container);
        this.m = (WallpaperPager) LayoutInflater.from(getContext()).inflate(f.C0052f.wallpaper_pager, (ViewGroup) null);
        this.m.setPagerActivity((PageActivity) getContext());
        this.m.setVisibility(8);
        this.i.addView(this.m, 0);
        this.n = (ThemePager) LayoutInflater.from(getContext()).inflate(f.C0052f.theme_pager, (ViewGroup) null);
        this.n.setPagerActivity((PageActivity) getContext());
        this.n.setVisibility(8);
        this.i.addView(this.n, 0);
        n();
        Context context = getContext();
        if (!(context instanceof PersonalizationActivity) || ((PersonalizationActivity) context).m()) {
        }
        HandlerThread handlerThread = new HandlerThread("");
        handlerThread.start();
        this.j = new Handler(handlerThread.getLooper());
    }

    public String getThemeSecondTab() {
        if (this.n != null) {
            return this.n.getSecondTab();
        }
        return null;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x000a. Please report as an issue. */
    public void setTabIndex(int i) {
        if (this.k != i) {
            this.k = i;
            setTabState(i);
            switch (i) {
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
        this.n.setVisibility(z ? 0 : 8);
        this.d.setSelected(z);
        if (Build.VERSION.SDK_INT >= 11) {
            this.d.setAlpha(z ? 1.0f : 0.6f);
        }
        this.g.setSelected(z);
        this.f.setSelected(z2);
        this.c.setSelected(z2);
        this.m.setVisibility(z2 ? 0 : 8);
        if (Build.VERSION.SDK_INT >= 11) {
            this.c.setAlpha(z2 ? 1.0f : 0.6f);
        }
        if (this.h != null && this.e != null && this.o != null) {
            this.e.setSelected(z3);
            this.h.setSelected(z3);
            if (Build.VERSION.SDK_INT >= 11) {
                this.e.setAlpha(z3 ? 1.0f : 0.6f);
            }
            this.o.setVisibility(z3 ? 0 : 8);
        }
    }

    private void k() {
        final com.tsf.extend.base.view.c cVar = new com.tsf.extend.base.view.c(this.b, -3);
        cVar.a(this);
        cVar.a(f.g.wallpaper_fb_title, f.g.wallpaper_fb_content, f.g.wallpaper_fb_subcribe, 0, BitmapFactory.decodeResource(getResources(), f.d.ic_facebook), new View.OnClickListener() { // from class: com.tsf.extend.wallpaper.PersonalizationPager.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                cVar.dismiss();
                PersonalizationPager.this.l();
            }
        }, null);
        cVar.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        com.tsf.extend.base.j.n.b(this.b);
    }

    private void a(Uri uri) {
        Intent intent = new Intent();
        intent.setClass(getContext(), UploadWallpaperActivity.class);
        intent.setFlags(268435456);
        intent.putExtra("UPLOAD_EXTRA_URI", uri);
        getContext().startActivity(intent);
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.a
    public boolean getPendingTransition() {
        return false;
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.a
    public View getContent() {
        return this;
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.a
    public void a(PageActivity pageActivity) {
        this.b = pageActivity;
        setTabIndex(this.l);
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.a
    public void a() {
        m();
        if (this.n != null) {
            this.n.f();
        }
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.a
    public void b() {
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.a
    public void f() {
        if (this.n != null) {
            this.n.b();
        }
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.a
    public Bundle getResult() {
        return null;
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.a
    public void c() {
        if (this.n != null) {
            this.n.b();
            this.n.c();
        }
        if (this.m != null) {
            this.m.b();
        }
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.a
    public void d() {
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.a
    public boolean e() {
        if (this.n != null) {
            this.n.b();
        }
        this.b.finish();
        return true;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void a(Intent intent) {
        if (intent != null) {
            WallpaperDetail wallpaperDetail = (WallpaperDetail) LayoutInflater.from(this.b).inflate(f.C0052f.wallpaper_detail, (ViewGroup) null);
            wallpaperDetail.setType(ai.BalloonType);
            m mVar = new m();
            String stringExtra = intent.getStringExtra("id");
            if (TextUtils.isEmpty(stringExtra)) {
                stringExtra = "0";
            }
            mVar.c(Integer.valueOf(stringExtra).intValue());
            String stringExtra2 = intent.getStringExtra("categoryid");
            if (TextUtils.isEmpty(stringExtra2)) {
                stringExtra2 = "0";
            }
            mVar.c(Integer.valueOf(stringExtra2).intValue());
            mVar.c(intent.getStringExtra("url"));
            mVar.b(intent.getStringExtra("ThumbUrl"));
            ArrayList arrayListNewArrayList = Lists.newArrayList();
            arrayListNewArrayList.add(mVar);
            wallpaperDetail.a((List<? extends s>) arrayListNewArrayList, (s) mVar, false);
            this.b.a(wallpaperDetail);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        com.tsf.extend.base.d dVarA = com.tsf.extend.h.a();
        int i = this.k;
        int id = view.getId();
        if (id == f.e.tab_wallpaper) {
            setTabIndex(2);
            if (dVarA != null) {
                dVarA.a(5);
            }
        } else if (id == f.e.tab_theme) {
            setTabIndex(1);
            if (dVarA != null) {
                dVarA.b(4);
            }
        } else if (id == f.e.tab_keyboard) {
            if (dVarA != null) {
                dVarA.c(1);
            }
            setTabIndex(7);
        }
        m();
    }

    public String getCurrentPageCode() {
        return b(this.k);
    }

    private String b(int i) {
        switch (i) {
            case 1:
                return this.n.getCurrentPageCode();
            case 2:
                return this.m.getCurrentPageCode();
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

    @Override // com.tsf.extend.base.view.c.a
    public void g() {
    }

    @Override // com.tsf.extend.base.view.c.a
    public void h() {
    }

    @Override // com.tsf.extend.base.view.c.a
    public void i() {
    }

    public boolean a(int i, int i2, Intent intent) {
        if (i == 1001 && i2 == -1) {
            final Uri data = intent.getData();
            if (data == null) {
                return true;
            }
            this.j.post(new Runnable() { // from class: com.tsf.extend.wallpaper.PersonalizationPager.2
                @Override // java.lang.Runnable
                public void run() throws Throwable {
                    try {
                        Uri uriC = com.tsf.extend.base.j.e.c(PersonalizationPager.this.b, data);
                        x xVar = new x(PersonalizationPager.this.b);
                        Bitmap bitmapA = xVar.a(uriC);
                        if (bitmapA != null) {
                            final WallpaperClip wallpaperClip = (WallpaperClip) LayoutInflater.from(PersonalizationPager.this.b).inflate(f.C0052f.wallpaper_clip, (ViewGroup) null);
                            wallpaperClip.a(xVar, bitmapA);
                            PersonalizationPager.this.b.runOnUiThread(new Runnable() { // from class: com.tsf.extend.wallpaper.PersonalizationPager.2.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    PersonalizationPager.this.b.a(wallpaperClip);
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
        if (i == 2 && i2 == -1 && intent != null) {
            a(intent.getData());
            return true;
        }
        if (i == 4) {
            com.tsf.extend.base.h.a aVarA = com.tsf.extend.base.h.a.a();
            if (!aVarA.d()) {
                aVarA.c();
                k();
            }
        }
        return false;
    }

    public void a(int i, String str) {
        if (TextUtils.isEmpty(str)) {
        }
    }

    public void a(int i) {
        switch (i) {
            case 1:
                this.l = 2;
                break;
            case 2:
            case 6:
                this.l = 1;
                break;
            case 3:
                this.l = 6;
                break;
            case 4:
                this.l = 1;
                break;
        }
    }

    private void m() {
        if (this.n != null && this.k == 1) {
            this.n.a();
        }
        if (this.m != null && this.k == 2) {
            this.m.a();
        }
    }

    public void j() {
        if (this.n != null) {
            this.n.e();
        }
    }

    public void setChildPagerDefIndex(int i) {
        if (this.m != null) {
            this.m.setDefTabIndex(i);
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

    private void n() {
        if (com.tsf.extend.base.j.t.a(com.tsf.extend.h.b())) {
            this.o = (KeyboardPager) LayoutInflater.from(getContext()).inflate(f.C0052f.keyboard_pager, (ViewGroup) null);
            this.o.setVisibility(8);
            this.e.setVisibility(0);
            this.i.addView(this.o, 0);
        }
    }
}
