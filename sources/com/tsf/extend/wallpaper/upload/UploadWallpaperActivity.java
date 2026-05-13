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
import com.tsf.extend.C1536f;
import com.tsf.extend.base.p080j.C1421b;
import com.tsf.extend.base.p080j.C1426e;
import com.tsf.extend.base.p080j.C1430i;
import com.tsf.extend.base.p080j.C1455z;
import com.tsf.extend.base.view.C1476b;
import com.tsf.extend.base.widget.pulltorefresh.C1519e;
import com.tsf.shell.component.C2233a;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes.dex */
public class UploadWallpaperActivity extends Activity {

    /* renamed from: a */
    private int f6920a = -1;

    /* renamed from: b */
    private long f6921b = -1;

    /* renamed from: c */
    private String f6922c = null;

    /* renamed from: d */
    private Uri f6923d = null;

    /* renamed from: e */
    private FrameLayout f6924e = null;

    /* renamed from: f */
    private FrameLayout f6925f = null;

    /* renamed from: g */
    private C2134c f6926g = null;

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f6924e = new FrameLayout(this);
        this.f6924e.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        setContentView(this.f6924e);
        m6365c();
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (this.f6926g == null) {
            finish();
            return;
        }
        int tabIndex = this.f6926g.getTabIndex();
        if (tabIndex > 0 && !this.f6926g.m6282b()) {
            this.f6926g.setTabIndex(tabIndex - 1);
        } else {
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        if (this.f6925f != null && this.f6925f.getBackground() != null) {
            C1476b c1476b = (C1476b) this.f6925f.getBackground();
            C1421b.m8699a(this.f6925f, (Drawable) null);
            if (c1476b != null) {
                c1476b.m8463a().recycle();
                c1476b.m8462a(null);
            }
        }
        if (this.f6926g != null) {
            this.f6926g.m6281c();
        }
    }

    /* renamed from: c */
    private void m6365c() {
        this.f6923d = (Uri) getIntent().getParcelableExtra("UPLOAD_EXTRA_URI");
        if (this.f6923d != null) {
            this.f6925f = new FrameLayout(this);
            this.f6925f.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.f6924e.addView(this.f6925f);
            FrameLayout frameLayout = new FrameLayout(this);
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            frameLayout.setBackgroundColor(Color.argb(51, 0, 0, 0));
            this.f6924e.addView(frameLayout);
            this.f6926g = new C2134c(this);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.setMargins(0, C1430i.m8659a(49.0f), 0, 0);
            this.f6926g.setLayoutParams(layoutParams);
            this.f6926g.m6283a(this, this.f6924e);
            this.f6926g.m6284a();
            this.f6924e.addView(this.f6926g);
            ImageView imageView = new ImageView(this);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
            int m8659a = C1430i.m8659a(16.0f);
            imageView.setPadding(m8659a, m8659a, m8659a * 2, m8659a * 2);
            imageView.setLayoutParams(layoutParams2);
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.tsf.extend.wallpaper.upload.UploadWallpaperActivity.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    UploadWallpaperActivity.this.onBackPressed();
                }
            });
            imageView.setImageDrawable(new C1519e(new BitmapDrawable(getResources(), BitmapFactory.decodeResource(getResources(), C1536f.C1540d.actionbar_back)), new int[]{-1, -7829368}, new PorterDuff.Mode[]{PorterDuff.Mode.SRC_IN, PorterDuff.Mode.SRC_IN}));
            this.f6924e.addView(imageView);
            C1455z.m8564a(6, new Runnable() { // from class: com.tsf.extend.wallpaper.upload.UploadWallpaperActivity.2
                @Override // java.lang.Runnable
                public void run() {
                    UploadWallpaperActivity.this.m6363e();
                }
            });
        }
    }

    /* renamed from: d */
    private int[] m6364d() {
        InputStream m6362f = m6362f();
        if (m6362f == null) {
            return null;
        }
        try {
            this.f6921b = m6362f.available();
        } catch (IOException e) {
        }
        if (this.f6921b > 31457280) {
            m6361g();
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(m6362f, null, options);
        m6369a(m6362f);
        int m8675a = C1426e.m8675a(this, this.f6923d);
        return new int[]{m8675a, C1426e.m8668a(options, m8675a, C1430i.m8655d() / 2, C1430i.m8654e() / 2)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public void m6363e() {
        int[] m6364d = m6364d();
        if (m6364d != null) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = m6364d[1];
            InputStream m6362f = m6362f();
            Bitmap decodeStream = BitmapFactory.decodeStream(m6362f, null, options);
            m6369a(m6362f);
            Bitmap m8672a = C1426e.m8672a(decodeStream, C1430i.m8655d(), C1430i.m8654e(), m6364d[0], 17, Bitmap.Config.RGB_565, true);
            if (m8672a != null && !m8672a.isRecycled()) {
                m6371a(new C1476b(m8672a));
            }
        }
    }

    /* renamed from: f */
    private InputStream m6362f() {
        InputStream inputStream;
        try {
            this.f6923d = C1426e.m8665c(this, this.f6923d);
            if (this.f6923d.getScheme().contains("file")) {
                inputStream = new FileInputStream(new File(this.f6923d.getPath()));
            } else if (!this.f6923d.getScheme().contains("content")) {
                inputStream = null;
            } else {
                inputStream = getContentResolver().openInputStream(this.f6923d);
            }
            return inputStream;
        } catch (FileNotFoundException e) {
            return null;
        }
    }

    /* renamed from: a */
    private void m6369a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
            }
        }
    }

    /* renamed from: g */
    private void m6361g() {
        C1455z.m8564a(0, new Runnable() { // from class: com.tsf.extend.wallpaper.upload.UploadWallpaperActivity.3
            @Override // java.lang.Runnable
            public void run() {
                if (!UploadWallpaperActivity.this.isFinishing()) {
                    Toast.makeText(UploadWallpaperActivity.this, C1536f.C1543g.upload_wallpaper_too_large, 1).show();
                    UploadWallpaperActivity.this.finish();
                }
            }
        });
    }

    /* renamed from: a */
    private void m6371a(final Drawable drawable) {
        C1455z.m8564a(0, new Runnable() { // from class: com.tsf.extend.wallpaper.upload.UploadWallpaperActivity.4
            @Override // java.lang.Runnable
            public void run() {
                if (!UploadWallpaperActivity.this.isFinishing()) {
                    C1421b.m8699a(UploadWallpaperActivity.this.f6925f, drawable);
                    if (Build.VERSION.SDK_INT >= 12) {
                        UploadWallpaperActivity.this.f6925f.setAlpha(0.0f);
                        UploadWallpaperActivity.this.f6925f.animate().setInterpolator(new DecelerateInterpolator()).alpha(0.8f).setDuration(300L);
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public long m6373a() {
        return this.f6921b;
    }

    /* renamed from: a */
    public void m6372a(int i) {
        this.f6920a = i;
    }

    /* renamed from: a */
    public void m6368a(String str) {
        this.f6922c = str;
    }

    /* renamed from: b */
    public void m6367b() {
        final Intent intent = new Intent(this, UploadWallpaperService.class);
        intent.setData(this.f6923d);
        intent.putExtra("cid", String.valueOf(this.f6920a));
        intent.putExtra("name", this.f6922c);
        Drawable background = this.f6925f.getBackground();
        if (background != null && (background instanceof C1476b)) {
            int m8659a = C1430i.m8659a(64.0f);
            Bitmap createBitmap = Bitmap.createBitmap(m8659a, m8659a, Bitmap.Config.RGB_565);
            Canvas canvas = new Canvas(createBitmap);
            Bitmap m8463a = ((C1476b) background).m8463a();
            canvas.drawBitmap(m8463a, new Rect(0, (m8463a.getHeight() - m8463a.getWidth()) / 2, m8463a.getWidth(), (m8463a.getHeight() + m8463a.getWidth()) / 2), new Rect(0, 0, m8659a, m8659a), (Paint) null);
            canvas.setBitmap(null);
            intent.putExtra("bitmap", createBitmap);
        }
        finish();
        overridePendingTransition(0, C1536f.C1537a.upload_wpp_exit);
        C1455z.m8564a(2, new Runnable() { // from class: com.tsf.extend.wallpaper.upload.UploadWallpaperActivity.5
            @Override // java.lang.Runnable
            public void run() {
                C2233a.m6034a(UploadWallpaperActivity.this, intent);
            }
        });
    }
}
