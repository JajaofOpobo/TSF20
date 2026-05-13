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
import com.android.volley.InterfaceC0781b;
import com.tsf.extend.C1536f;
import com.tsf.extend.base.C1378c;
import com.tsf.extend.base.actstru.model.activi.PageActivity;
import com.tsf.extend.base.p073c.AbstractBinderC1381b;
import com.tsf.extend.base.p080j.C1437p;
import com.tsf.extend.base.p080j.C1439r;
import com.tsf.extend.base.p080j.C1455z;
import com.tsf.extend.theme.DialogC1859o;
import com.tsf.extend.theme.diy.C1821e;
import com.tsf.extend.wallpaper.p085a.C2021a;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
/* loaded from: classes.dex */
public class WallpaperOnLineActivity extends PageActivity {

    /* renamed from: e */
    public static final String[] f6532e = {"1610", "1612", "1608", "1609"};

    /* renamed from: f */
    private WallpaperOnLinePager f6533f;

    /* renamed from: g */
    private DialogC1859o f6534g;

    /* renamed from: h */
    private String f6535h = null;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity, com.tsf.extend.base.actstru.model.EventBasedActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f6535h = getIntent().getStringExtra("DIY_PAGE_FROM");
        C1437p.m8622a((Activity) this);
        C2148z.m6199h();
        super.onCreate(bundle);
        this.f6533f = (WallpaperOnLinePager) LayoutInflater.from(this).inflate(C1536f.C1542f.activity_wallpaper_online, (ViewGroup) null);
        this.f6533f.findViewById(C1536f.C1541e.title).setOnClickListener(new View.OnClickListener() { // from class: com.tsf.extend.wallpaper.WallpaperOnLineActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                WallpaperOnLineActivity.this.onBackPressed();
            }
        });
        m8922a(this.f6533f);
        m8923a().setBackgroundColor(-1118482);
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity
    /* renamed from: a */
    protected void mo6742a(Bundle bundle) {
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity
    /* renamed from: c */
    public AbstractBinderC1381b mo6732c() {
        return null;
    }

    /* renamed from: a */
    public void m6736a(final String str, final C2094m c2094m) {
        m6731e();
        C1455z.m8564a(2, new Runnable() { // from class: com.tsf.extend.wallpaper.WallpaperOnLineActivity.2
            @Override // java.lang.Runnable
            public void run() {
                boolean z;
                boolean z2 = true;
                File m7387b = C1821e.m7387b(WallpaperOnLineActivity.this);
                if (m7387b != null) {
                    File file = new File(m7387b, "online_wallpaper");
                    if (file.isFile()) {
                        file.delete();
                    }
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    final File file2 = new File(file, C1439r.m8606a(str));
                    if (!WallpaperOnLineActivity.this.m6737a(file2)) {
                        InterfaceC0781b.C0782a mo8836a = C2148z.m6199h().m8791e().m11004d().mo8836a(str);
                        if (mo8836a == null || !WallpaperOnLineActivity.this.m6734a(mo8836a.f2250a)) {
                            z = false;
                        } else {
                            C1378c.m8816a(file2.getAbsolutePath(), mo8836a.f2250a);
                            z = true;
                        }
                        if (z) {
                            z2 = z;
                        } else if (C1378c.m8817a(str, file2.getAbsolutePath(), null) != 0) {
                            z2 = false;
                        }
                    }
                    if (z2) {
                        WallpaperOnLineActivity.this.runOnUiThread(new Runnable() { // from class: com.tsf.extend.wallpaper.WallpaperOnLineActivity.2.1
                            @Override // java.lang.Runnable
                            public void run() {
                                WallpaperOnLineActivity.this.m6730f();
                                Intent intent = WallpaperOnLineActivity.this.getIntent();
                                intent.setData(Uri.parse(file2.getAbsolutePath()));
                                intent.putExtra("wallpaper_id", String.valueOf(c2094m.m6431h()));
                                intent.putExtra("wallpaper_categoryId", String.valueOf(c2094m.m6428k()));
                                intent.putExtra("wallpaper_name", "");
                                intent.putExtra("wallpaper_tag", "");
                                WallpaperOnLineActivity.this.setResult(-1, intent);
                                WallpaperOnLineActivity.this.m6735a(false, WallpaperOnLineActivity.this.f6533f.getCurrentTabIndex());
                                WallpaperOnLineActivity.this.finish();
                            }
                        });
                        return;
                    }
                }
                WallpaperOnLineActivity.this.runOnUiThread(new Runnable() { // from class: com.tsf.extend.wallpaper.WallpaperOnLineActivity.2.2
                    @Override // java.lang.Runnable
                    public void run() {
                        WallpaperOnLineActivity.this.m6730f();
                        Toast.makeText(WallpaperOnLineActivity.this, C1536f.C1543g.changewallpaper_toast_text_error, 0).show();
                    }
                });
            }
        });
    }

    /* renamed from: e */
    private void m6731e() {
        m6730f();
        this.f6534g = new DialogC1859o(this);
        this.f6534g.m7232a("");
        try {
            this.f6534g.show();
        } catch (Exception e) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public void m6730f() {
        if (this.f6534g != null) {
            try {
                this.f6534g.dismiss();
            } catch (Exception e) {
            }
            this.f6534g = null;
        }
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity, android.app.Activity
    public void onBackPressed() {
        m6735a(true, this.f6533f.getCurrentTabIndex());
        super.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m6735a(boolean z, int i) {
        Log.d("WallpaperOnLineActivity", "reportOnlineActivityFinish backPressed:" + z + " tabIndex:" + i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public boolean m6737a(File file) {
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
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public boolean m6734a(byte[] bArr) {
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
        C2148z.m6198i();
        C2021a.m6702b(this);
    }
}
