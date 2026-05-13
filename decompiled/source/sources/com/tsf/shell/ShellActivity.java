package com.tsf.shell;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.tsf.shell.plugin.summary.ShellSummaryActivity;
/* loaded from: classes.dex */
public class ShellActivity extends Activity {
    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        startActivity(a(getPackageName()));
        finish();
    }

    public static Intent a(String str) {
        Intent intent = new Intent();
        if (!com.tsf.shell.manager.b.e.L()) {
            if (com.tsf.a.a.booleanValue()) {
                Log.v("TSF", "启动： GDPR没有开启 - 显示启动页");
            }
            intent.setClass(ShellApplication.a(), ShellSummaryActivity.class);
            intent.addCategory("android.intent.category.DEFAULT");
            intent.setPackage(str);
        } else {
            if (com.tsf.a.a.booleanValue()) {
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
