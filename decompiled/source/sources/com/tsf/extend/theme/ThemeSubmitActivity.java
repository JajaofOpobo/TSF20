package com.tsf.extend.theme;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.EditText;
import android.widget.Toast;
import com.tsf.extend.base.actstru.model.activi.CustomActivity;
import com.tsf.extend.e;
import com.tsf.extend.f;
import com.tsf.extend.theme.diy.ThemeDIYActivity;
import com.tsf.extend.wallpaper.upload.UploadWallpaperService;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class ThemeSubmitActivity extends CustomActivity implements DialogInterface.OnClickListener, TextWatcher, View.OnClickListener {
    private JSONObject d;
    private Bitmap e = null;
    private View f = null;
    private View g = null;
    private EditText h = null;
    private EditText i = null;
    private EditText j = null;
    private com.tsf.extend.e k;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tsf.extend.base.actstru.model.EventBasedActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(f.C0052f.activity_theme_sumbit);
        findViewById(f.e.btn_back).setOnClickListener(this);
        this.f = findViewById(f.e.btn_commit);
        this.f.setOnClickListener(this);
        this.g = findViewById(f.e.background);
        this.h = (EditText) findViewById(f.e.theme_name);
        this.i = (EditText) findViewById(f.e.user_name);
        this.j = (EditText) findViewById(f.e.user_email);
        g();
        findViewById(f.e.delete_theme_name).setOnClickListener(this);
        findViewById(f.e.delete_user_name).setOnClickListener(this);
        findViewById(f.e.delete_user_email).setOnClickListener(this);
        this.h.addTextChangedListener(this);
        this.i.addTextChangedListener(this);
        this.j.addTextChangedListener(this);
        h();
        com.tsf.extend.base.j.z.a(6, new Runnable() { // from class: com.tsf.extend.theme.ThemeSubmitActivity.1
            @Override // java.lang.Runnable
            public void run() {
                ThemeSubmitActivity.this.d();
            }
        });
    }

    public static String a(long j) {
        return new DecimalFormat("0.00").format(j / 1048576.0d);
    }

    private void a() {
        if (this.k != null) {
            try {
                this.k.dismiss();
            } catch (Exception e) {
            }
            this.k = null;
        }
    }

    private long a(Uri uri) {
        if ("content".equals(uri.getScheme()) || "file".equals(uri.getScheme())) {
            try {
                return getContentResolver().openInputStream(uri).available();
            } catch (IOException e) {
                return 0L;
            }
        }
        return new File(uri.getPath()).length();
    }

    private void a(String str) {
        long j;
        int i = 0;
        String str2 = "";
        if ("1".equals(str)) {
            str2 = getString(f.g.uplaod_wallpaper_dialog_no_network);
            i = f.g.uplaod_wallpaper_dialog_check_network;
        } else if ("2".equals(str)) {
            str2 = getString(f.g.uplaod_wallpaper_dialog_mobile_network);
            try {
                j = a(Uri.parse(this.d.getString("wallpaper_uri")));
            } catch (Exception e) {
                e.printStackTrace();
                j = 0;
            }
            if (j != -1) {
                str2 = String.format(str2, a(j));
            }
            i = f.g.uplaod_wallpaper_dialog_ok;
        }
        a();
        this.k = new e.a(this).a(str2).b(f.g.uplaod_wallpaper_dialog_cancel, this).a(i, this).a();
        this.k.a(str);
        try {
            this.k.a(true);
        } catch (Exception e2) {
        }
    }

    private void b() {
        a("2");
    }

    private void c() {
        a("1");
    }

    private void a(final String str, final String str2, final String str3, final String str4, boolean z) {
        Runnable runnable = new Runnable() { // from class: com.tsf.extend.theme.ThemeSubmitActivity.2
            @Override // java.lang.Runnable
            public void run() {
                if (ThemeSubmitActivity.this.d != null) {
                    try {
                        ThemeSubmitActivity.this.d.put("diy_id", str);
                        ThemeSubmitActivity.this.d.put("author_name", str2);
                        ThemeSubmitActivity.this.d.put("theme_name", str3);
                        ThemeSubmitActivity.this.d.put("email", str4);
                        UploadWallpaperService.a aVar = TextUtils.isEmpty(str) ? UploadWallpaperService.a.ALL : UploadWallpaperService.a.SUBMIT;
                        com.tsf.extend.theme.diy.e.a(ThemeSubmitActivity.this, (Bitmap) ThemeSubmitActivity.this.getIntent().getExtras().get("theme_icon"), Uri.parse(ThemeSubmitActivity.this.d.getString("wallpaper_uri")), ThemeSubmitActivity.this.d, aVar, null);
                        ThemeSubmitActivity.this.f();
                        com.tsf.extend.wallpaper.ag.a().a(ThemeSubmitActivity.this.i.getText().toString().trim());
                        com.tsf.extend.wallpaper.ag.a().b(ThemeSubmitActivity.this.j.getText().toString().trim());
                        ThemeSubmitActivity.this.finish();
                        return;
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
                ThemeSubmitActivity.this.e();
            }
        };
        if (z) {
            runnable.run();
            return;
        }
        int a = com.tsf.extend.base.j.o.a(this);
        if (a != 2 && a != 0) {
            long j = 0;
            try {
                j = a(Uri.parse(this.d.getString("wallpaper_uri")));
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (j < 1048576) {
                runnable.run();
            } else {
                b();
            }
        } else if (a == 0) {
            c();
        } else {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        try {
            this.d = new JSONObject(getIntent().getStringExtra("upload_wallpaper_data"));
            this.e = ThemeDIYActivity.a(this, Uri.parse(this.d.getString("wallpaper_uri")), getResources().getDisplayMetrics().widthPixels, getResources().getDisplayMetrics().heightPixels, true);
            com.tsf.extend.base.j.z.a(0, new Runnable() { // from class: com.tsf.extend.theme.ThemeSubmitActivity.3
                @Override // java.lang.Runnable
                public void run() {
                    if (!ThemeSubmitActivity.this.isFinishing()) {
                        com.tsf.extend.base.j.b.a(ThemeSubmitActivity.this.g, new com.tsf.extend.base.view.b(ThemeSubmitActivity.this.e));
                        if (Build.VERSION.SDK_INT >= 12) {
                            ThemeSubmitActivity.this.g.setAlpha(0.0f);
                            ThemeSubmitActivity.this.g.animate().setInterpolator(new DecelerateInterpolator()).alpha(0.8f).setDuration(300L);
                        }
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        Toast.makeText(this, f.g.upload_wallpaper_submit_failed, 0).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        Toast.makeText(this, f.g.uplaod_wallpaper_submit_tip, 0).show();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == f.e.btn_commit) {
            String a = a(getIntent());
            String obj = this.i.getText().toString();
            String obj2 = this.h.getText().toString();
            String obj3 = this.j.getText().toString();
            if (a == null) {
                a = "";
            }
            a(a, obj, obj2, obj3, false);
            sendBroadcast(new Intent("cml.intent.action.DIY_SUBMIT"));
        } else if (id == f.e.btn_back) {
            finish();
        } else if (id == f.e.delete_theme_name) {
            this.h.setText("");
        } else if (id == f.e.delete_user_name) {
            this.i.setText("");
        } else if (id == f.e.delete_user_email) {
            this.j.setText("");
        }
    }

    private void g() {
        String b = com.tsf.extend.wallpaper.ag.a().b();
        String e = com.tsf.extend.wallpaper.ag.a().e();
        if (TextUtils.isEmpty(e)) {
            e = com.tsf.extend.base.j.h.a(this);
        }
        if (TextUtils.isEmpty(b)) {
            if (!TextUtils.isEmpty(e)) {
                String trim = e.trim();
                int indexOf = trim.indexOf("@");
                if (indexOf != -1) {
                    trim = trim.substring(0, indexOf);
                }
                this.i.setText(trim);
            }
        } else {
            this.i.setText(b);
        }
        if (!TextUtils.isEmpty(e)) {
            this.j.setText(e);
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.k.dismiss();
        String c = this.k.c();
        this.k = null;
        if (!"1".equals(c) && "2".equals(c) && i == -1) {
            a(a(getIntent()), this.i.getText().toString(), this.h.getText().toString(), this.j.getText().toString(), true);
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        h();
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    private void h() {
        String trim = this.h.getText().toString().trim();
        String trim2 = this.i.getText().toString().trim();
        if (!TextUtils.isEmpty(trim) && !TextUtils.isEmpty(trim2)) {
            this.f.setEnabled(true);
        } else {
            this.f.setEnabled(false);
        }
    }

    private String a(Intent intent) {
        String stringExtra;
        if (intent == null || (stringExtra = intent.getStringExtra("UPLOAD_RESPONSE")) == null) {
            return null;
        }
        try {
            return new JSONObject(stringExtra).getJSONObject("data").getString("diyid");
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }
}
