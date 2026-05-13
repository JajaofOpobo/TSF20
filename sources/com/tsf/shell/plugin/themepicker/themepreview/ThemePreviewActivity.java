package com.tsf.shell.plugin.themepicker.themepreview;

import android.content.Intent;
import android.os.Bundle;
import android.support.p002v4.app.Fragment;
import android.support.p002v4.app.FragmentActivity;
import android.support.p002v4.view.ViewPager;
import com.tsf.shell.plugin.themepicker.C3851e;
import com.tsf.shell.plugin.themepicker.C3852f;
import com.tsf.shell.plugin.themepicker.indicator.TabPageIndicator;
/* loaded from: classes.dex */
public class ThemePreviewActivity extends FragmentActivity implements ViewPager.InterfaceC0245e {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.p002v4.app.FragmentActivity, android.support.p002v4.app.AbstractActivityC0087h, android.app.Activity
    public void onCreate(Bundle bundle) {
        C3851e.m1317b("IconPickerActivity onCreate");
        m1199g();
        super.onCreate(bundle);
    }

    /* renamed from: g */
    private void m1199g() {
        setContentView(C3852f.C3860h.activity_theme_preview_main);
        ViewPager viewPager = (ViewPager) findViewById(C3852f.C3858f.pager);
        viewPager.setAdapter(new C3928e(m13715f(), this));
        viewPager.setOnPageChangeListener(this);
        ((TabPageIndicator) findViewById(C3852f.C3858f.indicator)).setViewPager(viewPager);
    }

    @Override // android.support.p002v4.view.ViewPager.InterfaceC0245e
    /* renamed from: c_ */
    public void mo936c_(int i) {
    }

    @Override // android.support.p002v4.view.ViewPager.InterfaceC0245e
    /* renamed from: a */
    public void mo940a(int i, float f, int i2) {
    }

    @Override // android.support.p002v4.view.ViewPager.InterfaceC0245e
    /* renamed from: b_ */
    public void mo937b_(int i) {
    }

    @Override // android.support.p002v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C3851e.m1317b("ThemePreviewActivity onActivityResult requestCode:" + i + "     resultCode:" + i2);
        for (Fragment fragment : m13715f().mo13526d()) {
            fragment.mo1168a(i, i2, intent);
        }
    }
}
