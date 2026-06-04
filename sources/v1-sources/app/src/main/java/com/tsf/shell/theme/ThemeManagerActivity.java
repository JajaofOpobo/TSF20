package com.tsf.shell.theme;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewFlipper;
import com.tsf.shell.Home;
import com.tsf.shell.R;
import com.tsf.shell.theme.inside.ThemeManager;

/* loaded from: classes.dex */
public class ThemeManagerActivity extends Activity implements View.OnClickListener {
    private String a;
    private ViewFlipper b;
    private GridView c;
    private GridView d;
    private TextView e;
    private TextView f;
    private c g;

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.theme_main);
        this.a = getIntent().getStringExtra("currentTheme");
        this.b = (ViewFlipper) findViewById(R.id.viewflipper);
        this.c = (GridView) findViewById(R.id.local_theme_gridview);
        this.d = (GridView) findViewById(R.id.online_theme_gridview);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.theme_google_play);
        ((ImageView) findViewById(R.id.theme_market_icon)).setBackgroundResource(R.drawable.google_play_icon);
        linearLayout.setOnClickListener(this);
        this.g = new c(this, this.c, this.a);
        new j(this, this.d);
        this.e = (TextView) findViewById(R.id.theme_top_menu_local_text);
        this.f = (TextView) findViewById(R.id.theme_top_menu_online_text);
        this.e.setOnClickListener(this);
        this.f.setOnClickListener(this);
        this.e.setSelected(true);
        i iVar = new i(this);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
        intentFilter.addDataScheme("package");
        registerReceiver(iVar, intentFilter);
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addAction("android.intent.action.EXTERNAL_APPLICATIONS_AVAILABLE");
        intentFilter2.addAction("android.intent.action.EXTERNAL_APPLICATIONS_UNAVAILABLE");
        registerReceiver(iVar, intentFilter2);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        try {
            System.exit(0);
        } catch (Exception e) {
        }
        super.onDestroy();
    }

    public static void a() {
        Intent intent = new Intent();
        intent.setClass(com.censivn.C3DEngine.a.c(), ThemeManagerActivity.class);
        intent.setFlags(268435456);
        intent.putExtra("currentTheme", ThemeManager.getInstance().getCurrentThemeDescription().packagename);
        Home.d().startActivity(intent);
    }

    public final void a(String[] strArr) {
        if (strArr != null) {
            this.g.b(strArr);
        }
    }

    public final void b(String[] strArr) {
        if (strArr != null) {
            this.g.c(strArr);
        }
    }

    public final void c(String[] strArr) {
        if (strArr != null) {
            this.g.a(strArr);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.theme_top_menu_local_text /* 2131624003 */:
                this.b.setDisplayedChild(0);
                this.e.setSelected(true);
                this.f.setSelected(false);
                break;
            case R.id.theme_top_menu_online_text /* 2131624004 */:
                this.b.setDisplayedChild(1);
                this.e.setSelected(false);
                this.f.setSelected(true);
                break;
            case R.id.theme_google_play /* 2131624009 */:
                com.tsf.shell.g.d.b(this, "tsf shell theme");
                break;
        }
    }
}
