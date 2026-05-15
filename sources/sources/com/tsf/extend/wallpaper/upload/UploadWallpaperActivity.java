package com.tsf.extend.wallpaper.upload;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;
import com.tsf.extend.base.j.i;
import com.tsf.extend.base.j.z;
import com.tsf.extend.base.widget.pulltorefresh.e;
import com.tsf.extend.f;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class UploadWallpaperActivity extends Activity {
    private int a = -1;
    private long b = -1;
    private String c = null;
    private Uri d = null;
    private FrameLayout e = null;
    private FrameLayout f = null;
    private c g = null;

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.e = new FrameLayout(this);
        this.e.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        setContentView(this.e);
        c();
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (this.g == null) {
            finish();
            return;
        }
        int tabIndex = this.g.getTabIndex();
        if (tabIndex > 0 && !this.g.b()) {
            this.g.setTabIndex(tabIndex - 1);
        } else {
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        if (this.f != null && this.f.getBackground() != null) {
            com.tsf.extend.base.view.b bVar = (com.tsf.extend.base.view.b) this.f.getBackground();
            com.tsf.extend.base.j.b.a(this.f, (Drawable) null);
            if (bVar != null) {
                bVar.a().recycle();
                bVar.a(null);
            }
        }
        if (this.g != null) {
            this.g.c();
        }
    }

    private void c() {
        this.d = (Uri) getIntent().getParcelableExtra("UPLOAD_EXTRA_URI");
        if (this.d != null) {
            this.f = new FrameLayout(this);
            this.f.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.e.addView(this.f);
            FrameLayout frameLayout = new FrameLayout(this);
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            frameLayout.setBackgroundColor(Color.argb(51, 0, 0, 0));
            this.e.addView(frameLayout);
            this.g = new c(this);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.setMargins(0, i.a(49.0f), 0, 0);
            this.g.setLayoutParams(layoutParams);
            this.g.a(this, this.e);
            this.g.a();
            this.e.addView(this.g);
            ImageView imageView = new ImageView(this);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
            int iA = i.a(16.0f);
            imageView.setPadding(iA, iA, iA * 2, iA * 2);
            imageView.setLayoutParams(layoutParams2);
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.tsf.extend.wallpaper.upload.UploadWallpaperActivity.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    UploadWallpaperActivity.this.onBackPressed();
                }
            });
            imageView.setImageDrawable(new e(new BitmapDrawable(getResources(), BitmapFactory.decodeResource(getResources(), f.d.actionbar_back)), new int[]{-1, -7829368}, new PorterDuff.Mode[]{PorterDuff.Mode.SRC_IN, PorterDuff.Mode.SRC_IN}));
            this.e.addView(imageView);
            z.a(6, new Runnable() { // from class: com.tsf.extend.wallpaper.upload.UploadWallpaperActivity.2
                @Override // java.lang.Runnable
                public void run() throws Throwable {
                    UploadWallpaperActivity.this.e();
                }
            });
        }
    }

    private int[] d() throws Throwable {
        InputStream inputStreamF = f();
        if (inputStreamF == null) {
            return null;
        }
        try {
            this.b = inputStreamF.available();
        } catch (IOException e) {
        }
        if (this.b > 31457280) {
            g();
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(inputStreamF, null, options);
        a(inputStreamF);
        int iA = com.tsf.extend.base.j.e.a(this, this.d);
        return new int[]{iA, com.tsf.extend.base.j.e.a(options, iA, i.d() / 2, i.e() / 2)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() throws Throwable {
        int[] iArrD = d();
        if (iArrD != null) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = iArrD[1];
            InputStream inputStreamF = f();
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamF, null, options);
            a(inputStreamF);
            Bitmap bitmapA = com.tsf.extend.base.j.e.a(bitmapDecodeStream, i.d(), i.e(), iArrD[0], 17, Bitmap.Config.RGB_565, true);
            if (bitmapA != null && !bitmapA.isRecycled()) {
                a(new com.tsf.extend.base.view.b(bitmapA));
            }
        }
    }

    private InputStream f() {
        InputStream inputStreamOpenInputStream;
        try {
            this.d = com.tsf.extend.base.j.e.c(this, this.d);
            if (this.d.getScheme().contains("file")) {
                inputStreamOpenInputStream = new FileInputStream(new File(this.d.getPath()));
            } else if (!this.d.getScheme().contains("content")) {
                inputStreamOpenInputStream = null;
            } else {
                inputStreamOpenInputStream = getContentResolver().openInputStream(this.d);
            }
            return inputStreamOpenInputStream;
        } catch (FileNotFoundException e) {
            return null;
        }
    }

    private void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
            }
        }
    }

    private void g() {
        z.a(0, new Runnable() { // from class: com.tsf.extend.wallpaper.upload.UploadWallpaperActivity.3
            @Override // java.lang.Runnable
            public void run() {
                if (!UploadWallpaperActivity.this.isFinishing()) {
                    Toast.makeText(UploadWallpaperActivity.this, f.g.upload_wallpaper_too_large, 1).show();
                    UploadWallpaperActivity.this.finish();
                }
            }
        });
    }

    private void a(final Drawable drawable) {
        z.a(0, new Runnable() { // from class: com.tsf.extend.wallpaper.upload.UploadWallpaperActivity.4
            @Override // java.lang.Runnable
            public void run() {
                if (!UploadWallpaperActivity.this.isFinishing()) {
                    com.tsf.extend.base.j.b.a(UploadWallpaperActivity.this.f, drawable);
                    if (Build.VERSION.SDK_INT >= 12) {
                        UploadWallpaperActivity.this.f.setAlpha(0.0f);
                        UploadWallpaperActivity.this.f.animate().setInterpolator(new DecelerateInterpolator()).alpha(0.8f).setDuration(300L);
                    }
                }
            }
        });
    }

    public long a() {
        return this.b;
    }

    public void a(int i) {
        this.a = i;
    }

    public void a(String str) {
        this.c = str;
    }

    public void b() {
        final Intent intent = new Intent(this, (Class<?>) UploadWallpaperService.class);
        intent.setData(this.d);
        intent.putExtra("cid", String.valueOf(this.a));
        intent.putExtra("name", this.c);
        Drawable background = this.f.getBackground();
        if (background != null && (background instanceof com.tsf.extend.base.view.b)) {
            int iA = i.a(64.0f);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iA, iA, Bitmap.Config.RGB_565);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            Bitmap bitmapA = ((com.tsf.extend.base.view.b) background).a();
            canvas.drawBitmap(bitmapA, new Rect(0, (bitmapA.getHeight() - bitmapA.getWidth()) / 2, bitmapA.getWidth(), (bitmapA.getHeight() + bitmapA.getWidth()) / 2), new Rect(0, 0, iA, iA), (Paint) null);
            canvas.setBitmap(null);
            intent.putExtra("bitmap", bitmapCreateBitmap);
        }
        finish();
        overridePendingTransition(0, f.a.upload_wpp_exit);
        z.a(2, new Runnable() { // from class: com.tsf.extend.wallpaper.upload.UploadWallpaperActivity.5
            @Override // java.lang.Runnable
            public void run() {
                com.tsf.shell.component.a.a(UploadWallpaperActivity.this, intent);
            }
        });
    }
}
