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
import com.tsf.extend.base.actstru.model.activi.PageActivity;
import com.tsf.extend.f;
import com.tsf.extend.wallpaper.a.a;
import java.io.File;
import java.io.FileOutputStream;
/* loaded from: classes.dex */
public class WallpaperClip extends FrameLayout implements View.OnClickListener, PageActivity.a, a.b {
    public Context a;
    private PersonalizationActivity b;
    private WallpaperClipImageView c;
    private ImageView d;
    private ImageView e;
    private WallpaperManager f;
    private TextView g;
    private TextView h;
    private TextView i;
    private CustomWallpaperShadowView j;
    private View k;
    private ProgressBar l;
    private View m;
    private boolean n;
    private x o;

    public WallpaperClip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = null;
        this.c = null;
        this.n = true;
        this.a = context;
    }

    public void a(x xVar, Bitmap bitmap) {
        this.o = xVar;
        this.c.a(this.o, bitmap);
        this.j.setWallpaperClipCalculateManager(this.o);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        findViewById(f.e.wp_clip_title).setOnClickListener(this);
        this.e = (ImageView) findViewById(f.e.wp_clip_preview_bt);
        this.e.setOnClickListener(this);
        this.h = (TextView) findViewById(f.e.wp_clip_set_wallpaper_bt);
        this.h.setText(getResources().getString(f.g.set_as_wallpaper).toUpperCase());
        this.h.setOnClickListener(this);
        this.d = (ImageView) findViewById(f.e.wp_clip_preview);
        this.d.setOnClickListener(this);
        this.c = (WallpaperClipImageView) findViewById(f.e.wp_clip_launcher_clip_preview);
        this.g = (TextView) findViewById(f.e.wp_clip_single_screen);
        this.i = (TextView) findViewById(f.e.wp_clip_muti_screen);
        this.i.setOnClickListener(this);
        this.g.setOnClickListener(this);
        this.k = findViewById(f.e.wp_clip_setting_wallpaper);
        this.l = (ProgressBar) findViewById(f.e.wp_clip_setting_wallpaper_progress);
        this.l.setIndeterminateDrawable(new com.tsf.extend.base.widget.pulltorefresh.d(getContext(), 3));
        this.m = findViewById(f.e.wp_clip_progress_text);
        this.j = (CustomWallpaperShadowView) findViewById(f.e.wallpaper_shadow);
        this.j.setOnTouchListener(this.c.getTouchListener());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == f.e.wp_clip_title) {
            this.b.onBackPressed();
        } else if (id == f.e.wp_clip_single_screen) {
            a(true);
        } else if (id == f.e.wp_clip_muti_screen) {
            a(false);
        } else if (id == f.e.wp_clip_preview_bt) {
            b(true);
        } else if (id == f.e.wp_clip_set_wallpaper_bt) {
            if (this.b.g()) {
                Toast.makeText(getContext(), f.g.theme_current_no_set_wallpaper, 0).show();
                this.b.finish();
                return;
            }
            h();
        } else if (id == f.e.wp_clip_preview) {
            b(false);
        }
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
        if (pageActivity instanceof PersonalizationActivity) {
            this.b = (PersonalizationActivity) pageActivity;
            setPadding(0, (int) getResources().getDimension(f.c.workspace_margin_top), 0, com.tsf.extend.base.j.p.c(getContext()));
            this.d.setPadding(0, 0, 0, com.tsf.extend.base.j.p.c(getContext()));
            this.f = WallpaperManager.getInstance(getContext());
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
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.a
    public Bundle getResult() {
        return null;
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.a
    public void c() {
        this.c.b();
        this.j.setOnTouchListener(null);
        removeAllViews();
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.a
    public void d() {
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.a
    public boolean e() {
        if (this.k.getVisibility() == 0) {
            return true;
        }
        if (this.d.getVisibility() == 0) {
            b(false);
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.tsf.extend.wallpaper.a.a.b(this);
    }

    private void a(boolean z) {
        if (this.n != z) {
            this.n = z;
            if (z) {
                Drawable drawable = getResources().getDrawable(f.d.wp_clip_fix_on_bt);
                drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
                Drawable drawable2 = getResources().getDrawable(f.d.wp_clip_scrollable_off_bt);
                drawable2.setBounds(0, 0, drawable2.getMinimumWidth(), drawable2.getMinimumHeight());
                this.g.setCompoundDrawables(null, drawable, null, null);
                this.i.setCompoundDrawables(null, drawable2, null, null);
            } else {
                Drawable drawable3 = getResources().getDrawable(f.d.wp_clip_fix_off_bt);
                drawable3.setBounds(0, 0, drawable3.getMinimumWidth(), drawable3.getMinimumHeight());
                Drawable drawable4 = getResources().getDrawable(f.d.wp_clip_scrollable_on_bt);
                drawable4.setBounds(0, 0, drawable4.getMinimumWidth(), drawable4.getMinimumHeight());
                this.g.setCompoundDrawables(null, drawable3, null, null);
                this.i.setCompoundDrawables(null, drawable4, null, null);
            }
            this.c.setSingleScreen(z);
            this.j.setSingleScreen(z);
        }
    }

    private void b(boolean z) {
        if (z) {
            this.b.b(true);
            e(false);
            com.tsf.extend.base.j.z.a(2, new Runnable() { // from class: com.tsf.extend.wallpaper.WallpaperClip.1
                @Override // java.lang.Runnable
                public void run() {
                    final Bitmap bitmap;
                    Bitmap bitmap2;
                    boolean z2 = true;
                    boolean z3 = false;
                    final Bitmap d = WallpaperClip.this.d(true);
                    if (d == null || d.isRecycled()) {
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
                        WallpaperClip.this.b.runOnUiThread(new Runnable() { // from class: com.tsf.extend.wallpaper.WallpaperClip.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                WallpaperClip.this.i();
                                if ((com.tsf.extend.base.j.p.b() - ((bitmap.getWidth() <= com.tsf.extend.base.j.p.b() / 2 ? 2 : 1) * bitmap.getWidth())) / 2 < 0) {
                                }
                                WallpaperClip.this.setPadding(0, 0, 0, 0);
                                WallpaperClip.this.d.setPadding(0, 0, 0, 0);
                                WallpaperClip.this.d.setVisibility(0);
                                com.tsf.extend.base.j.b.a(WallpaperClip.this.d, new BitmapDrawable(WallpaperClip.this.a.getResources(), d));
                                WallpaperClip.this.d.setImageBitmap(bitmap);
                            }
                        });
                    } else {
                        WallpaperClip.this.b.runOnUiThread(new Runnable() { // from class: com.tsf.extend.wallpaper.WallpaperClip.1.2
                            @Override // java.lang.Runnable
                            public void run() {
                                WallpaperClip.this.i();
                                Toast.makeText(WallpaperClip.this.b, f.g.load_fail_retry, 1).show();
                            }
                        });
                    }
                }
            });
            return;
        }
        this.b.b(false);
        setPadding(0, (int) getResources().getDimension(f.c.workspace_margin_top), 0, com.tsf.extend.base.j.p.c(getContext()));
        this.d.setVisibility(8);
        com.tsf.extend.base.j.b.a(this.d, (Drawable) null);
        this.d.setImageBitmap(null);
    }

    private void h() {
        com.tsf.extend.wallpaper.a.a.a(this);
        e(true);
        com.tsf.extend.base.j.z.a(2, new Runnable() { // from class: com.tsf.extend.wallpaper.WallpaperClip.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    Bitmap d = WallpaperClip.this.d(false);
                    if (d != null) {
                        aj.a(WallpaperClip.this.getContext(), d, WallpaperClip.this.o.g(), false, false);
                        if (x.a) {
                            d.compress(Bitmap.CompressFormat.PNG, 100, new FileOutputStream(new File(WallpaperClip.a(WallpaperClip.this.a), "test.png")));
                            WallpaperClip.this.setDrawingCacheEnabled(true);
                            WallpaperClip.this.getDrawingCache().compress(Bitmap.CompressFormat.PNG, 100, new FileOutputStream(new File(WallpaperClip.a(WallpaperClip.this.a), "test_cache.png")));
                            WallpaperClip.this.destroyDrawingCache();
                            WallpaperClip.this.setDrawingCacheEnabled(false);
                            Log.d("ClipWallpaper", "output page:" + new File(WallpaperClip.a(WallpaperClip.this.a), "test_cache.png").getAbsolutePath());
                        }
                        d.recycle();
                        return;
                    }
                    WallpaperClip.this.c(false);
                } catch (Throwable th) {
                    WallpaperClip.this.c(false);
                }
            }
        });
    }

    public static File a(Context context) {
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

    @Override // com.tsf.extend.wallpaper.a.a.b
    public void g() {
        c(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final boolean z) {
        com.tsf.extend.base.j.z.a(0, new Runnable() { // from class: com.tsf.extend.wallpaper.WallpaperClip.3
            @Override // java.lang.Runnable
            public void run() {
                Toast.makeText(WallpaperClip.this.b, z ? f.g.wallpaper_set_suc : f.g.wallpaper_set_fail, 1).show();
                if (z) {
                    WallpaperClip.this.b.finish();
                }
                WallpaperClip.this.i();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bitmap d(boolean z) {
        this.c.a();
        try {
            return this.o.a(this.c.getDisplayRect(), z);
        } catch (Throwable th) {
            return null;
        }
    }

    private void e(boolean z) {
        this.k.setVisibility(0);
        this.m.setVisibility(z ? 0 : 8);
        this.e.setClickable(false);
        this.h.setClickable(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        this.e.setClickable(true);
        this.h.setClickable(true);
        this.k.setVisibility(8);
    }
}
