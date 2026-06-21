package com.tsf.shell.plugin.themepicker;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

/* loaded from: classes.dex */
public class AppIconEditorActivity extends FragmentActivity {
    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle bundleExtra = getIntent().getBundleExtra("appInfo");
        b bVar = new b();
        bVar.g(bundleExtra);
        bVar.a(f().a(), "dialog");
    }
}
