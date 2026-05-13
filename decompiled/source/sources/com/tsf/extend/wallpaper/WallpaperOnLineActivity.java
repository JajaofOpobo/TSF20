package com.tsf.extend.wallpaper;

import android.app.Activity;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.android.volley.b;
import com.tsf.extend.base.actstru.model.activi.PageActivity;
import com.tsf.extend.f;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
/* loaded from: classes.dex */
public class WallpaperOnLineActivity extends PageActivity {
    public static final String[] e = {"1610", "1612", "1608", "1609"};
    private WallpaperOnLinePager f;
    private com.tsf.extend.theme.o g;
    private String h = null;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity, com.tsf.extend.base.actstru.model.EventBasedActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.h = getIntent().getStringExtra("DIY_PAGE_FROM");
        com.tsf.extend.base.j.p.a((Activity) this);
        z.h();
        super.onCreate(bundle);
        this.f = (WallpaperOnLinePager) LayoutInflater.from(this).inflate(f.C0052f.activity_wallpaper_online, (ViewGroup) null);
        this.f.findViewById(f.e.title).setOnClickListener(new View.OnClickListener() { // from class: com.tsf.extend.wallpaper.WallpaperOnLineActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                WallpaperOnLineActivity.this.onBackPressed();
            }
        });
        a(this.f);
        a().setBackgroundColor(-1118482);
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity
    protected void a(Bundle bundle) {
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity
    public com.tsf.extend.base.c.b c() {
        return null;
    }

    public void a(final String str, final m mVar) {
        e();
        com.tsf.extend.base.j.z.a(2, new Runnable() { // from class: com.tsf.extend.wallpaper.WallpaperOnLineActivity.2
            @Override // java.lang.Runnable
            public void run() {
                boolean z;
                boolean z2 = true;
                File b = com.tsf.extend.theme.diy.e.b(WallpaperOnLineActivity.this);
                if (b != null) {
                    File file = new File(b, "online_wallpaper");
                    if (file.isFile()) {
                        file.delete();
                    }
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    final File file2 = new File(file, com.tsf.extend.base.j.r.a(str));
                    if (!WallpaperOnLineActivity.this.a(file2)) {
                        b.a a = z.h().e().d().a(str);
                        if (a == null || !WallpaperOnLineActivity.this.a(a.a)) {
                            z = false;
                        } else {
                            com.tsf.extend.base.c.a(file2.getAbsolutePath(), a.a);
                            z = true;
                        }
                        if (z) {
                            z2 = z;
                        } else if (com.tsf.extend.base.c.a(str, file2.getAbsolutePath(), null) != 0) {
                            z2 = false;
                        }
                    }
                    if (z2) {
                        WallpaperOnLineActivity.this.runOnUiThread(new Runnable() { // from class: com.tsf.extend.wallpaper.WallpaperOnLineActivity.2.1
                            @Override // java.lang.Runnable
                            public void run() {
                                WallpaperOnLineActivity.this.f();
                                Intent intent = WallpaperOnLineActivity.this.getIntent();
                                intent.setData(Uri.parse(file2.getAbsolutePath()));
                                intent.putExtra("wallpaper_id", String.valueOf(mVar.h()));
                                intent.putExtra("wallpaper_categoryId", String.valueOf(mVar.k()));
                                intent.putExtra("wallpaper_name", "");
                                intent.putExtra("wallpaper_tag", "");
                                WallpaperOnLineActivity.this.setResult(-1, intent);
                                WallpaperOnLineActivity.this.a(false, WallpaperOnLineActivity.this.f.getCurrentTabIndex());
                                WallpaperOnLineActivity.this.finish();
                            }
                        });
                        return;
                    }
                }
                WallpaperOnLineActivity.this.runOnUiThread(new Runnable() { // from class: com.tsf.extend.wallpaper.WallpaperOnLineActivity.2.2
                    @Override // java.lang.Runnable
                    public void run() {
                        WallpaperOnLineActivity.this.f();
                        Toast.makeText(WallpaperOnLineActivity.this, f.g.changewallpaper_toast_text_error, 0).show();
                    }
                });
            }
        });
    }

    private void e() {
        f();
        this.g = new com.tsf.extend.theme.o(this);
        this.g.a("");
        try {
            this.g.show();
        } catch (Exception e2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        if (this.g != null) {
            try {
                this.g.dismiss();
            } catch (Exception e2) {
            }
            this.g = null;
        }
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity, android.app.Activity
    public void onBackPressed() {
        a(true, this.f.getCurrentTabIndex());
        super.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z, int i) {
        Log.d("WallpaperOnLineActivity", "reportOnlineActivityFinish backPressed:" + z + " tabIndex:" + i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(File file) {
        if (file != null && file.exists() && file.length() > 0) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            try {
                BitmapFactory.decodeStream(new FileInputStream(file), null, options);
                if (options.outWidth > 0) {
                    if (options.outHeight > 0) {
                        return true;
                    }
                }
            } catch (FileNotFoundException e2) {
                e2.printStackTrace();
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(byte[] bArr) {
        if (bArr != null) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            if (options.outWidth > 0 && options.outHeight > 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity, com.tsf.extend.base.actstru.model.EventBasedActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        z.i();
        com.tsf.extend.wallpaper.a.a.b(this);
    }
}
