package com.tsf.extend.wallpaper;

import android.app.WallpaperManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.tsf.extend.C1536f;
import com.tsf.extend.base.actstru.model.activi.PageActivity;
import com.tsf.extend.base.p080j.C1421b;
import com.tsf.extend.base.p080j.C1437p;
import com.tsf.extend.base.p080j.C1455z;
import com.tsf.extend.base.widget.pulltorefresh.C1518d;
import com.tsf.extend.wallpaper.p085a.C2021a;
import java.io.File;
import java.io.FileOutputStream;
/* loaded from: classes.dex */
public class WallpaperClip extends FrameLayout implements View.OnClickListener, PageActivity.InterfaceC1352a, C2021a.InterfaceC2024b {

    /* renamed from: a */
    public Context f6303a;

    /* renamed from: b */
    private PersonalizationActivity f6304b;

    /* renamed from: c */
    private WallpaperClipImageView f6305c;

    /* renamed from: d */
    private ImageView f6306d;

    /* renamed from: e */
    private ImageView f6307e;

    /* renamed from: f */
    private WallpaperManager f6308f;

    /* renamed from: g */
    private TextView f6309g;

    /* renamed from: h */
    private TextView f6310h;

    /* renamed from: i */
    private TextView f6311i;

    /* renamed from: j */
    private CustomWallpaperShadowView f6312j;

    /* renamed from: k */
    private View f6313k;

    /* renamed from: l */
    private ProgressBar f6314l;

    /* renamed from: m */
    private View f6315m;

    /* renamed from: n */
    private boolean f6316n;

    /* renamed from: o */
    private C2146x f6317o;

    public WallpaperClip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6303a = null;
        this.f6305c = null;
        this.f6316n = true;
        this.f6303a = context;
    }

    /* renamed from: a */
    public void m6917a(C2146x c2146x, Bitmap bitmap) {
        this.f6317o = c2146x;
        this.f6305c.m6892a(this.f6317o, bitmap);
        this.f6312j.setWallpaperClipCalculateManager(this.f6317o);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        findViewById(C1536f.C1541e.wp_clip_title).setOnClickListener(this);
        this.f6307e = (ImageView) findViewById(C1536f.C1541e.wp_clip_preview_bt);
        this.f6307e.setOnClickListener(this);
        this.f6310h = (TextView) findViewById(C1536f.C1541e.wp_clip_set_wallpaper_bt);
        this.f6310h.setText(getResources().getString(C1536f.C1543g.set_as_wallpaper).toUpperCase());
        this.f6310h.setOnClickListener(this);
        this.f6306d = (ImageView) findViewById(C1536f.C1541e.wp_clip_preview);
        this.f6306d.setOnClickListener(this);
        this.f6305c = (WallpaperClipImageView) findViewById(C1536f.C1541e.wp_clip_launcher_clip_preview);
        this.f6309g = (TextView) findViewById(C1536f.C1541e.wp_clip_single_screen);
        this.f6311i = (TextView) findViewById(C1536f.C1541e.wp_clip_muti_screen);
        this.f6311i.setOnClickListener(this);
        this.f6309g.setOnClickListener(this);
        this.f6313k = findViewById(C1536f.C1541e.wp_clip_setting_wallpaper);
        this.f6314l = (ProgressBar) findViewById(C1536f.C1541e.wp_clip_setting_wallpaper_progress);
        this.f6314l.setIndeterminateDrawable(new C1518d(getContext(), 3));
        this.f6315m = findViewById(C1536f.C1541e.wp_clip_progress_text);
        this.f6312j = (CustomWallpaperShadowView) findViewById(C1536f.C1541e.wallpaper_shadow);
        this.f6312j.setOnTouchListener(this.f6305c.getTouchListener());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == C1536f.C1541e.wp_clip_title) {
            this.f6304b.onBackPressed();
        } else if (id == C1536f.C1541e.wp_clip_single_screen) {
            m6916a(true);
        } else if (id == C1536f.C1541e.wp_clip_muti_screen) {
            m6916a(false);
        } else if (id == C1536f.C1541e.wp_clip_preview_bt) {
            m6913b(true);
        } else if (id == C1536f.C1541e.wp_clip_set_wallpaper_bt) {
            if (this.f6304b.m6974g()) {
                Toast.makeText(getContext(), C1536f.C1543g.theme_current_no_set_wallpaper, 0).show();
                this.f6304b.finish();
                return;
            }
            m6907h();
        } else if (id == C1536f.C1541e.wp_clip_preview) {
            m6913b(false);
        }
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
        if (pageActivity instanceof PersonalizationActivity) {
            this.f6304b = (PersonalizationActivity) pageActivity;
            setPadding(0, (int) getResources().getDimension(C1536f.C1539c.workspace_margin_top), 0, C1437p.m8615c(getContext()));
            this.f6306d.setPadding(0, 0, 0, C1437p.m8615c(getContext()));
            this.f6308f = WallpaperManager.getInstance(getContext());
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
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.InterfaceC1352a
    public Bundle getResult() {
        return null;
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.InterfaceC1352a
    /* renamed from: c */
    public void mo6531c() {
        this.f6305c.m6890b();
        this.f6312j.setOnTouchListener(null);
        removeAllViews();
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.InterfaceC1352a
    /* renamed from: d */
    public void mo6530d() {
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.InterfaceC1352a
    /* renamed from: e */
    public boolean mo6529e() {
        if (this.f6313k.getVisibility() == 0) {
            return true;
        }
        if (this.f6306d.getVisibility() == 0) {
            m6913b(false);
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C2021a.m6701b(this);
    }

    /* renamed from: a */
    private void m6916a(boolean z) {
        if (this.f6316n != z) {
            this.f6316n = z;
            if (z) {
                Drawable drawable = getResources().getDrawable(C1536f.C1540d.wp_clip_fix_on_bt);
                drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
                Drawable drawable2 = getResources().getDrawable(C1536f.C1540d.wp_clip_scrollable_off_bt);
                drawable2.setBounds(0, 0, drawable2.getMinimumWidth(), drawable2.getMinimumHeight());
                this.f6309g.setCompoundDrawables(null, drawable, null, null);
                this.f6311i.setCompoundDrawables(null, drawable2, null, null);
            } else {
                Drawable drawable3 = getResources().getDrawable(C1536f.C1540d.wp_clip_fix_off_bt);
                drawable3.setBounds(0, 0, drawable3.getMinimumWidth(), drawable3.getMinimumHeight());
                Drawable drawable4 = getResources().getDrawable(C1536f.C1540d.wp_clip_scrollable_on_bt);
                drawable4.setBounds(0, 0, drawable4.getMinimumWidth(), drawable4.getMinimumHeight());
                this.f6309g.setCompoundDrawables(null, drawable3, null, null);
                this.f6311i.setCompoundDrawables(null, drawable4, null, null);
            }
            this.f6305c.setSingleScreen(z);
            this.f6312j.setSingleScreen(z);
        }
    }

    /* renamed from: b */
    private void m6913b(boolean z) {
        if (z) {
            this.f6304b.m6983b(true);
            m6908e(false);
            C1455z.m8564a(2, new Runnable() { // from class: com.tsf.extend.wallpaper.WallpaperClip.1
                @Override // java.lang.Runnable
                public void run() {
                    final Bitmap bitmap;
                    Bitmap bitmap2;
                    boolean z2 = true;
                    boolean z3 = false;
                    final Bitmap m6909d = WallpaperClip.this.m6909d(true);
                    if (m6909d == null || m6909d.isRecycled()) {
                        z2 = false;
                    }
                    if (z2 && 0 == 0) {
                        File file = new File(WallpaperClip.this.getContext().getFilesDir(), "preview3d.wpp");
                        if (!file.exists()) {
                            z2 = false;
                        }
                        try {
                            bitmap2 = BitmapFactory.decodeFile(file.getAbsolutePath());
                        } catch (OutOfMemoryError e) {
                            try {
                                BitmapFactory.Options options = new BitmapFactory.Options();
                                options.inSampleSize = 2;
                                bitmap2 = BitmapFactory.decodeFile(file.getAbsolutePath(), options);
                            } catch (OutOfMemoryError e2) {
                                bitmap2 = null;
                            }
                        }
                        if (bitmap2 == null) {
                            bitmap = null;
                        } else {
                            z3 = z2;
                            bitmap = bitmap2;
                        }
                    } else {
                        z3 = z2;
                        bitmap = null;
                    }
                    if (z3) {
                        WallpaperClip.this.f6304b.runOnUiThread(new Runnable() { // from class: com.tsf.extend.wallpaper.WallpaperClip.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                WallpaperClip.this.m6906i();
                                if ((C1437p.m8619b() - ((bitmap.getWidth() <= C1437p.m8619b() / 2 ? 2 : 1) * bitmap.getWidth())) / 2 < 0) {
                                }
                                WallpaperClip.this.setPadding(0, 0, 0, 0);
                                WallpaperClip.this.f6306d.setPadding(0, 0, 0, 0);
                                WallpaperClip.this.f6306d.setVisibility(0);
                                C1421b.m8699a(WallpaperClip.this.f6306d, new BitmapDrawable(WallpaperClip.this.f6303a.getResources(), m6909d));
                                WallpaperClip.this.f6306d.setImageBitmap(bitmap);
                            }
                        });
                    } else {
                        WallpaperClip.this.f6304b.runOnUiThread(new Runnable() { // from class: com.tsf.extend.wallpaper.WallpaperClip.1.2
                            @Override // java.lang.Runnable
                            public void run() {
                                WallpaperClip.this.m6906i();
                                Toast.makeText(WallpaperClip.this.f6304b, C1536f.C1543g.load_fail_retry, 1).show();
                            }
                        });
                    }
                }
            });
            return;
        }
        this.f6304b.m6983b(false);
        setPadding(0, (int) getResources().getDimension(C1536f.C1539c.workspace_margin_top), 0, C1437p.m8615c(getContext()));
        this.f6306d.setVisibility(8);
        C1421b.m8699a(this.f6306d, (Drawable) null);
        this.f6306d.setImageBitmap(null);
    }

    /* renamed from: h */
    private void m6907h() {
        C2021a.m6704a(this);
        m6908e(true);
        C1455z.m8564a(2, new Runnable() { // from class: com.tsf.extend.wallpaper.WallpaperClip.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    Bitmap m6909d = WallpaperClip.this.m6909d(false);
                    if (m6909d != null) {
                        C2058aj.m6555a(WallpaperClip.this.getContext(), m6909d, WallpaperClip.this.f6317o.m6226g(), false, false);
                        if (C2146x.f7063a) {
                            m6909d.compress(Bitmap.CompressFormat.PNG, 100, new FileOutputStream(new File(WallpaperClip.m6920a(WallpaperClip.this.f6303a), "test.png")));
                            WallpaperClip.this.setDrawingCacheEnabled(true);
                            WallpaperClip.this.getDrawingCache().compress(Bitmap.CompressFormat.PNG, 100, new FileOutputStream(new File(WallpaperClip.m6920a(WallpaperClip.this.f6303a), "test_cache.png")));
                            WallpaperClip.this.destroyDrawingCache();
                            WallpaperClip.this.setDrawingCacheEnabled(false);
                            Log.d("ClipWallpaper", "output page:" + new File(WallpaperClip.m6920a(WallpaperClip.this.f6303a), "test_cache.png").getAbsolutePath());
                        }
                        m6909d.recycle();
                        return;
                    }
                    WallpaperClip.this.m6911c(false);
                } catch (Throwable th) {
                    WallpaperClip.this.m6911c(false);
                }
            }
        });
    }

    /* renamed from: a */
    public static File m6920a(Context context) {
        File file;
        try {
            if (Build.VERSION.SDK_INT > 7) {
                file = context.getExternalFilesDir(null);
            } else {
                file = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/Android/data/" + context.getPackageName() + "/files");
                if (!file.exists()) {
                    file.mkdirs();
                }
            }
            return file;
        } catch (NullPointerException e) {
            return null;
        }
    }

    @Override // com.tsf.extend.wallpaper.p085a.C2021a.InterfaceC2024b
    /* renamed from: g */
    public void mo6700g() {
        m6911c(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m6911c(final boolean z) {
        C1455z.m8564a(0, new Runnable() { // from class: com.tsf.extend.wallpaper.WallpaperClip.3
            @Override // java.lang.Runnable
            public void run() {
                Toast.makeText(WallpaperClip.this.f6304b, z ? C1536f.C1543g.wallpaper_set_suc : C1536f.C1543g.wallpaper_set_fail, 1).show();
                if (z) {
                    WallpaperClip.this.f6304b.finish();
                }
                WallpaperClip.this.m6906i();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public Bitmap m6909d(boolean z) {
        this.f6305c.m6905a();
        try {
            return this.f6317o.m6235a(this.f6305c.getDisplayRect(), z);
        } catch (Throwable th) {
            return null;
        }
    }

    /* renamed from: e */
    private void m6908e(boolean z) {
        this.f6313k.setVisibility(0);
        this.f6315m.setVisibility(z ? 0 : 8);
        this.f6307e.setClickable(false);
        this.f6310h.setClickable(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public void m6906i() {
        this.f6307e.setClickable(true);
        this.f6310h.setClickable(true);
        this.f6313k.setVisibility(8);
    }
}
