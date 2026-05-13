package com.tsf.shell.utils;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import com.censivn.C3DEngine.C0853a;
import com.tsf.shell.Home;
/* renamed from: com.tsf.shell.utils.a */
/* loaded from: classes.dex */
public class C4164a {
    /* renamed from: a */
    public static void m709a(String str) {
        try {
            Home.m6177b().startActivity(new Intent("android.intent.action.DELETE", Uri.parse("package:" + str)));
        } catch (Exception e) {
        }
    }

    /* renamed from: a */
    public static void m710a(Context context, String str) {
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

    /* renamed from: a */
    public static boolean m708a(String str, int i) {
        try {
            return C0853a.m10856d().getPackageManager().getPackageInfo(str, 64).versionCode >= i;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }
}
