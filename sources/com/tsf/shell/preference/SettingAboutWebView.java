package com.tsf.shell.preference;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import com.tsf.C1306b;
/* loaded from: classes.dex */
public class SettingAboutWebView extends Activity implements View.OnClickListener {

    /* renamed from: a */
    private WebView f13075a;

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent().getBooleanExtra("is_full_screen", false)) {
            getWindow().addFlags(1024);
        }
        setContentView(C1306b.C1313g.setting_about_privacy);
        m934a();
    }

    /* renamed from: a */
    private void m934a() {
        String str;
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            extras.getString("title", null);
            str = extras.getString("url", null);
        } else {
            str = null;
        }
        this.f13075a = (WebView) findViewById(C1306b.C1311e.setting_about_privacy);
        this.f13075a.loadUrl(str);
        this.f13075a.getSettings().setJavaScriptEnabled(true);
        this.f13075a.getSettings().setCacheMode(2);
        findViewById(C1306b.C1311e.title_head).setOnClickListener(this);
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (this.f13075a.canGoBack()) {
            this.f13075a.goBack();
        } else {
            super.onBackPressed();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == C1306b.C1311e.title_head) {
            finish();
        }
    }
}
