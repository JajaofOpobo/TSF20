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
import com.tsf.extend.C1536f;
import com.tsf.extend.DialogInterfaceC1526e;
import com.tsf.extend.base.actstru.model.activi.CustomActivity;
import com.tsf.extend.base.p080j.C1421b;
import com.tsf.extend.base.p080j.C1429h;
import com.tsf.extend.base.p080j.C1436o;
import com.tsf.extend.base.p080j.C1455z;
import com.tsf.extend.base.view.C1476b;
import com.tsf.extend.theme.diy.C1821e;
import com.tsf.extend.theme.diy.ThemeDIYActivity;
import com.tsf.extend.wallpaper.C2055ag;
import com.tsf.extend.wallpaper.upload.UploadWallpaperService;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class ThemeSubmitActivity extends CustomActivity implements DialogInterface.OnClickListener, TextWatcher, View.OnClickListener {

    /* renamed from: d */
    private JSONObject f5276d;

    /* renamed from: e */
    private Bitmap f5277e = null;

    /* renamed from: f */
    private View f5278f = null;

    /* renamed from: g */
    private View f5279g = null;

    /* renamed from: h */
    private EditText f5280h = null;

    /* renamed from: i */
    private EditText f5281i = null;

    /* renamed from: j */
    private EditText f5282j = null;

    /* renamed from: k */
    private DialogInterfaceC1526e f5283k;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tsf.extend.base.actstru.model.EventBasedActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1536f.C1542f.activity_theme_sumbit);
        findViewById(C1536f.C1541e.btn_back).setOnClickListener(this);
        this.f5278f = findViewById(C1536f.C1541e.btn_commit);
        this.f5278f.setOnClickListener(this);
        this.f5279g = findViewById(C1536f.C1541e.background);
        this.f5280h = (EditText) findViewById(C1536f.C1541e.theme_name);
        this.f5281i = (EditText) findViewById(C1536f.C1541e.user_name);
        this.f5282j = (EditText) findViewById(C1536f.C1541e.user_email);
        m7944g();
        findViewById(C1536f.C1541e.delete_theme_name).setOnClickListener(this);
        findViewById(C1536f.C1541e.delete_user_name).setOnClickListener(this);
        findViewById(C1536f.C1541e.delete_user_email).setOnClickListener(this);
        this.f5280h.addTextChangedListener(this);
        this.f5281i.addTextChangedListener(this);
        this.f5282j.addTextChangedListener(this);
        m7942h();
        C1455z.m8564a(6, new Runnable() { // from class: com.tsf.extend.theme.ThemeSubmitActivity.1
            @Override // java.lang.Runnable
            public void run() {
                ThemeSubmitActivity.this.m7950d();
            }
        });
    }

    /* renamed from: a */
    public static String m7960a(long j) {
        return new DecimalFormat("0.00").format(j / 1048576.0d);
    }

    /* renamed from: a */
    private void m7961a() {
        if (this.f5283k != null) {
            try {
                this.f5283k.dismiss();
            } catch (Exception e) {
            }
            this.f5283k = null;
        }
    }

    /* renamed from: a */
    private long m7958a(Uri uri) {
        if ("content".equals(uri.getScheme()) || "file".equals(uri.getScheme())) {
            try {
                return getContentResolver().openInputStream(uri).available();
            } catch (IOException e) {
                return 0L;
            }
        }
        return new File(uri.getPath()).length();
    }

    /* renamed from: a */
    private void m7956a(String str) {
        long j;
        int i = 0;
        String str2 = "";
        if ("1".equals(str)) {
            str2 = getString(C1536f.C1543g.uplaod_wallpaper_dialog_no_network);
            i = C1536f.C1543g.uplaod_wallpaper_dialog_check_network;
        } else if ("2".equals(str)) {
            str2 = getString(C1536f.C1543g.uplaod_wallpaper_dialog_mobile_network);
            try {
                j = m7958a(Uri.parse(this.f5276d.getString("wallpaper_uri")));
            } catch (Exception e) {
                e.printStackTrace();
                j = 0;
            }
            if (j != -1) {
                str2 = String.format(str2, m7960a(j));
            }
            i = C1536f.C1543g.uplaod_wallpaper_dialog_ok;
        }
        m7961a();
        this.f5283k = new DialogInterfaceC1526e.C1532a(this).m8299a(str2).m8298b(C1536f.C1543g.uplaod_wallpaper_dialog_cancel, this).m8300a(i, this).m8302a();
        this.f5283k.m8315a(str);
        try {
            this.f5283k.m8314a(true);
        } catch (Exception e2) {
        }
    }

    /* renamed from: b */
    private void m7954b() {
        m7956a("2");
    }

    /* renamed from: c */
    private void m7952c() {
        m7956a("1");
    }

    /* renamed from: a */
    private void m7955a(final String str, final String str2, final String str3, final String str4, boolean z) {
        Runnable runnable = new Runnable() { // from class: com.tsf.extend.theme.ThemeSubmitActivity.2
            @Override // java.lang.Runnable
            public void run() {
                if (ThemeSubmitActivity.this.f5276d != null) {
                    try {
                        ThemeSubmitActivity.this.f5276d.put("diy_id", str);
                        ThemeSubmitActivity.this.f5276d.put("author_name", str2);
                        ThemeSubmitActivity.this.f5276d.put("theme_name", str3);
                        ThemeSubmitActivity.this.f5276d.put("email", str4);
                        UploadWallpaperService.EnumC2121a enumC2121a = TextUtils.isEmpty(str) ? UploadWallpaperService.EnumC2121a.ALL : UploadWallpaperService.EnumC2121a.SUBMIT;
                        C1821e.m7402a(ThemeSubmitActivity.this, (Bitmap) ThemeSubmitActivity.this.getIntent().getExtras().get("theme_icon"), Uri.parse(ThemeSubmitActivity.this.f5276d.getString("wallpaper_uri")), ThemeSubmitActivity.this.f5276d, enumC2121a, null);
                        ThemeSubmitActivity.this.m7946f();
                        C2055ag.m6572a().m6570a(ThemeSubmitActivity.this.f5281i.getText().toString().trim());
                        C2055ag.m6572a().m6567b(ThemeSubmitActivity.this.f5282j.getText().toString().trim());
                        ThemeSubmitActivity.this.finish();
                        return;
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
                ThemeSubmitActivity.this.m7948e();
            }
        };
        if (z) {
            runnable.run();
            return;
        }
        int m8626a = C1436o.m8626a(this);
        if (m8626a != 2 && m8626a != 0) {
            long j = 0;
            try {
                j = m7958a(Uri.parse(this.f5276d.getString("wallpaper_uri")));
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (j < 1048576) {
                runnable.run();
            } else {
                m7954b();
            }
        } else if (m8626a == 0) {
            m7952c();
        } else {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public void m7950d() {
        try {
            this.f5276d = new JSONObject(getIntent().getStringExtra("upload_wallpaper_data"));
            this.f5277e = ThemeDIYActivity.m7550a(this, Uri.parse(this.f5276d.getString("wallpaper_uri")), getResources().getDisplayMetrics().widthPixels, getResources().getDisplayMetrics().heightPixels, true);
            C1455z.m8564a(0, new Runnable() { // from class: com.tsf.extend.theme.ThemeSubmitActivity.3
                @Override // java.lang.Runnable
                public void run() {
                    if (!ThemeSubmitActivity.this.isFinishing()) {
                        C1421b.m8699a(ThemeSubmitActivity.this.f5279g, new C1476b(ThemeSubmitActivity.this.f5277e));
                        if (Build.VERSION.SDK_INT >= 12) {
                            ThemeSubmitActivity.this.f5279g.setAlpha(0.0f);
                            ThemeSubmitActivity.this.f5279g.animate().setInterpolator(new DecelerateInterpolator()).alpha(0.8f).setDuration(300L);
                        }
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public void m7948e() {
        Toast.makeText(this, C1536f.C1543g.upload_wallpaper_submit_failed, 0).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public void m7946f() {
        Toast.makeText(this, C1536f.C1543g.uplaod_wallpaper_submit_tip, 0).show();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == C1536f.C1541e.btn_commit) {
            String m7959a = m7959a(getIntent());
            String obj = this.f5281i.getText().toString();
            String obj2 = this.f5280h.getText().toString();
            String obj3 = this.f5282j.getText().toString();
            if (m7959a == null) {
                m7959a = "";
            }
            m7955a(m7959a, obj, obj2, obj3, false);
            sendBroadcast(new Intent("cml.intent.action.DIY_SUBMIT"));
        } else if (id == C1536f.C1541e.btn_back) {
            finish();
        } else if (id == C1536f.C1541e.delete_theme_name) {
            this.f5280h.setText("");
        } else if (id == C1536f.C1541e.delete_user_name) {
            this.f5281i.setText("");
        } else if (id == C1536f.C1541e.delete_user_email) {
            this.f5282j.setText("");
        }
    }

    /* renamed from: g */
    private void m7944g() {
        String m6568b = C2055ag.m6572a().m6568b();
        String m6564e = C2055ag.m6572a().m6564e();
        if (TextUtils.isEmpty(m6564e)) {
            m6564e = C1429h.m8661a(this);
        }
        if (TextUtils.isEmpty(m6568b)) {
            if (!TextUtils.isEmpty(m6564e)) {
                String trim = m6564e.trim();
                int indexOf = trim.indexOf("@");
                if (indexOf != -1) {
                    trim = trim.substring(0, indexOf);
                }
                this.f5281i.setText(trim);
            }
        } else {
            this.f5281i.setText(m6568b);
        }
        if (!TextUtils.isEmpty(m6564e)) {
            this.f5282j.setText(m6564e);
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.f5283k.dismiss();
        String m8307c = this.f5283k.m8307c();
        this.f5283k = null;
        if (!"1".equals(m8307c) && "2".equals(m8307c) && i == -1) {
            m7955a(m7959a(getIntent()), this.f5281i.getText().toString(), this.f5280h.getText().toString(), this.f5282j.getText().toString(), true);
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        m7942h();
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    /* renamed from: h */
    private void m7942h() {
        String trim = this.f5280h.getText().toString().trim();
        String trim2 = this.f5281i.getText().toString().trim();
        if (!TextUtils.isEmpty(trim) && !TextUtils.isEmpty(trim2)) {
            this.f5278f.setEnabled(true);
        } else {
            this.f5278f.setEnabled(false);
        }
    }

    /* renamed from: a */
    private String m7959a(Intent intent) {
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
