package com.tsf.shell.plugin.themepicker.themepreview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import com.tsf.shell.plugin.themepicker.f;
import com.tsf.shell.plugin.themepicker.indicator.TabPageIndicator;
/* loaded from: classes.dex */
public class ThemePreviewActivity extends FragmentActivity implements ViewPager.e {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v4.app.FragmentActivity, android.support.v4.app.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        com.tsf.shell.plugin.themepicker.e.b("IconPickerActivity onCreate");
        g();
        super.onCreate(bundle);
    }

    private void g() {
        setContentView(f.h.activity_theme_preview_main);
        ViewPager viewPager = (ViewPager) findViewById(f.C0155f.pager);
        viewPager.setAdapter(new e(f(), this));
        viewPager.setOnPageChangeListener(this);
        ((TabPageIndicator) findViewById(f.C0155f.indicator)).setViewPager(viewPager);
    }

    @Override // android.support.v4.view.ViewPager.e
    public void c_(int i) {
    }

    @Override // android.support.v4.view.ViewPager.e
    public void a(int i, float f, int i2) {
    }

    @Override // android.support.v4.view.ViewPager.e
    public void b_(int i) {
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        com.tsf.shell.plugin.themepicker.e.b("ThemePreviewActivity onActivityResult requestCode:" + i + "     resultCode:" + i2);
        for (Fragment fragment : f().d()) {
            fragment.a(i, i2, intent);
        }
    }
}
