package com.tsf.shell.utils;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import com.tsf.shell.Home;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class a {
    public static void a(String str) {
        try {
            Home.b().startActivity(new Intent("android.intent.action.DELETE", Uri.parse("package:" + str)));
        } catch (Exception e) {
        }
    }

    public static void a(Context context, String str) {
        Intent intent = new Intent();
        int i = Build.VERSION.SDK_INT;
        if (i >= 9) {
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", str, null));
        } else {
            String str2 = i == 8 ? "pkg" : "com.android.settings.ApplicationPkgName";
            intent.setAction("android.intent.action.VIEW");
            intent.setClassName("com.android.settings", "com.android.settings.InstalledAppDetails");
            intent.putExtra(str2, str);
        }
        context.startActivity(intent);
    }

    public static boolean a(String str, int i) {
        try {
            return com.censivn.C3DEngine.a.d().getPackageManager().getPackageInfo(str, 64).versionCode >= i;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }
}
