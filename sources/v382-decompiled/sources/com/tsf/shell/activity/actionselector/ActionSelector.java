package com.tsf.shell.activity.actionselector;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import com.tsf.shell.R;
import com.tsf.shell.manager.action.f;

/* loaded from: classes.dex */
public class ActionSelector extends FragmentActivity {
    private String[] n;
    private SwipeyTabs o;
    private ViewPager p;
    private Intent q;
    private boolean r = false;
    private f s;

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.action_selector);
        this.s = new f(this);
        this.n = new String[4];
        this.n[0] = getString(R.string.group_applications);
        this.n[1] = getString(R.string.text_launcher);
        this.n[2] = getString(R.string.group_toggle);
        this.n[3] = getString(R.string.group_shortcuts);
        this.p = (ViewPager) findViewById(R.id.viewpager);
        this.o = (SwipeyTabs) findViewById(R.id.swipeytabs);
        b bVar = new b(this, this, f());
        this.p.setAdapter(bVar);
        this.o.setAdapter(bVar);
        this.p.setOnPageChangeListener(this.o);
        this.p.setCurrentItem(1);
        Intent intent = getIntent();
        Parcelable parcelableExtra = intent.getParcelableExtra("android.intent.extra.INTENT");
        this.r = intent.getBooleanExtra("EXTRA_NEED_ICON", false);
        if (parcelableExtra instanceof Intent) {
            this.q = (Intent) parcelableExtra;
        } else {
            this.q = new Intent("android.intent.action.MAIN", (Uri) null);
            this.q.addCategory("android.intent.category.DEFAULT");
        }
    }

    public Intent g() {
        return this.q;
    }

    public boolean h() {
        return this.r;
    }
}
