package com.tsf.shell;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.tsf.C1305a;
import com.tsf.shell.manager.p168b.C3430e;
import com.tsf.shell.plugin.summary.ShellSummaryActivity;
/* loaded from: classes.dex */
public class ShellActivity extends Activity {
    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        startActivity(m6153a(getPackageName()));
        finish();
    }

    /* renamed from: a */
    public static Intent m6153a(String str) {
        Intent intent = new Intent();
        if (!C3430e.m2560L()) {
            if (C1305a.f4114a.booleanValue()) {
                Log.v("TSF", "启动： GDPR没有开启 - 显示启动页");
            }
            intent.setClass(ShellApplication.m6152a(), ShellSummaryActivity.class);
            intent.addCategory("android.intent.category.DEFAULT");
            intent.setPackage(str);
        } else {
            if (C1305a.f4114a.booleanValue()) {
                Log.v("TSF", "启动： GDPR已经开启 - 显示TSF主页面");
            }
            intent.setAction("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.HOME");
            intent.setFlags(320864256);
            intent.setPackage(str);
        }
        return intent;
    }
}
