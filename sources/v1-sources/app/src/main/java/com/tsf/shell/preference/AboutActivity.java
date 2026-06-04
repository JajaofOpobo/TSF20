package com.tsf.shell.preference;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.widget.TabHost;
import com.tsf.shell.R;

/* loaded from: classes.dex */
public class AboutActivity extends FragmentActivity {
    TabHost n;
    ViewPager o;
    a p;

    public static void a(Context context) {
        try {
            Intent intent = new Intent();
            intent.setClass(com.censivn.C3DEngine.a.c(), AboutActivity.class);
            context.startActivity(intent);
        } catch (Exception e) {
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.fragment_tabs_pager);
        this.n = (TabHost) findViewById(android.R.id.tabhost);
        this.n.setup();
        this.o = (ViewPager) findViewById(R.id.pager);
        this.p = new a(this, this.n, this.o);
        this.p.a(this.n.newTabSpec("about").setIndicator("About"), com.tsf.shell.preference.widget.b.class);
        this.p.a(this.n.newTabSpec("translations").setIndicator("Translations"), com.tsf.shell.preference.widget.b.class);
        this.p.a(this.n.newTabSpec("licenses").setIndicator("Licenses"), com.tsf.shell.preference.widget.b.class);
        if (bundle != null) {
            this.n.setCurrentTabByTag(bundle.getString("tab"));
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        try {
            System.exit(0);
        } catch (Exception e) {
        }
        super.onDestroy();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("tab", this.n.getCurrentTabTag());
    }
}
