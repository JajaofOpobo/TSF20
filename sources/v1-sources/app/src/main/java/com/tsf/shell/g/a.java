package com.tsf.shell.g;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;

/* loaded from: classes.dex */
public final class a {
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

    public static String a(com.tsf.shell.h.b bVar) {
        return String.valueOf(bVar.c.getPackageName()) + "/" + bVar.c.getClassName();
    }
}
