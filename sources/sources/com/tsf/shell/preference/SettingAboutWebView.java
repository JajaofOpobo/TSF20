package com.tsf.shell.preference;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import com.tsf.b;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class SettingAboutWebView extends Activity implements View.OnClickListener {
    private WebView a;

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent().getBooleanExtra("is_full_screen", false)) {
            getWindow().addFlags(1024);
        }
        setContentView(b.g.setting_about_privacy);
        a();
    }

    private void a() {
        String string;
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            extras.getString("title", null);
            string = extras.getString("url", null);
        } else {
            string = null;
        }
        this.a = (WebView) findViewById(b.e.setting_about_privacy);
        this.a.loadUrl(string);
        this.a.getSettings().setJavaScriptEnabled(true);
        this.a.getSettings().setCacheMode(2);
        findViewById(b.e.title_head).setOnClickListener(this);
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
        if (this.a.canGoBack()) {
            this.a.goBack();
        } else {
            super.onBackPressed();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == b.e.title_head) {
            finish();
        }
    }
}
