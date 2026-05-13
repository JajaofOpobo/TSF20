package com.flurry.sdk;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
/* loaded from: classes.dex */
public class eb {
    private static final String a = eb.class.getSimpleName();
    private static String b;
    private static String c;

    public static void a(String str) {
        b = str;
    }

    public static synchronized String a() {
        String str;
        synchronized (eb.class) {
            if (!TextUtils.isEmpty(b)) {
                str = b;
            } else if (!TextUtils.isEmpty(c)) {
                str = c;
            } else {
                c = b();
                str = c;
            }
        }
        return str;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0030 -> B:5:0x001b). Please submit an issue!!! */
    private static String b() {
        PackageInfo packageInfo;
        try {
            Context b2 = Cdo.a().b();
            packageInfo = b2.getPackageManager().getPackageInfo(b2.getPackageName(), 0);
        } catch (Throwable th) {
            eo.a(6, a, "", th);
        }
        if (packageInfo.versionName != null) {
            return packageInfo.versionName;
        }
        if (packageInfo.versionCode != 0) {
            return Integer.toString(packageInfo.versionCode);
        }
        return "Unknown";
    }
}
