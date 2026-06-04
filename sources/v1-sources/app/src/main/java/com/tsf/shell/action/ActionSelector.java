package com.tsf.shell.action;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v4.view.bb;
import com.tsf.shell.R;

/* loaded from: classes.dex */
public class ActionSelector extends FragmentActivity {
    private static String[] n;
    private SwipeyTabs o;
    private ViewPager p;
    private Intent q;
    private boolean r = false;

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.action_selector);
        j.a((Context) this);
        String[] strArr = new String[3];
        n = strArr;
        strArr[0] = getString(R.string.group_applications);
        n[1] = "TSF";
        n[2] = getString(R.string.group_shortcuts);
        this.p = (ViewPager) findViewById(R.id.viewpager);
        this.o = (SwipeyTabs) findViewById(R.id.swipeytabs);
        h hVar = new h(this, this, d());
        this.p.a(hVar);
        this.o.a(hVar);
        this.p.a((bb) this.o);
        this.p.a(1);
        Intent intent = getIntent();
        Parcelable parcelableExtra = intent.getParcelableExtra("android.intent.extra.INTENT");
        this.r = intent.getBooleanExtra("EXTRA_NEED_ICON", false);
        if (parcelableExtra instanceof Intent) {
            this.q = (Intent) parcelableExtra;
        } else {
            this.q = new Intent("android.intent.action.MAIN", (Uri) null);
            this.q.addCategory("android.intent.category.DEFAULT");
        }
        j.a(this);
    }

    public final Intent e() {
        return this.q;
    }

    public final boolean f() {
        return this.r;
    }
}
