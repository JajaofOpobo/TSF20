package com.tsf.shell;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

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
        intent.setAction("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        intent.setFlags(320864256);
        intent.setPackage(str);
        return intent;
    }
}
