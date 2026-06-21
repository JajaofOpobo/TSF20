package com.tsf.shell.plugin.themepicker.themepreview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v4.view.bn;
import com.tsf.shell.plugin.themepicker.indicator.TabPageIndicator;
import com.tsf.shell.plugin.themepicker.n;
import com.tsf.shell.plugin.themepicker.p;
import java.util.Iterator;

/* loaded from: classes.dex */
public class ThemePreviewActivity extends FragmentActivity implements bn {
    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        com.tsf.shell.plugin.themepicker.g.b("IconPickerActivity onCreate");
        g();
        super.onCreate(bundle);
    }

    private void g() {
        setContentView(p.activity_theme_preview_main);
        ViewPager viewPager = (ViewPager) findViewById(n.pager);
        viewPager.setAdapter(new l(f(), this));
        viewPager.setOnPageChangeListener(this);
        ((TabPageIndicator) findViewById(n.indicator)).setViewPager(viewPager);
    }

    @Override // android.support.v4.view.bn
    public void b_(int i) {
    }

    @Override // android.support.v4.view.bn
    public void a(int i, float f, int i2) {
    }

    @Override // android.support.v4.view.bn
    public void a_(int i) {
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        com.tsf.shell.plugin.themepicker.g.b("ThemePreviewActivity onActivityResult requestCode:" + i + "     resultCode:" + i2);
        Iterator it = f().c().iterator();
        while (it.hasNext()) {
            ((Fragment) it.next()).a(i, i2, intent);
        }
    }
}
