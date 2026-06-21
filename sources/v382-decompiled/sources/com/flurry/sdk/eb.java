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

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001b, code lost:
    
        r0 = "Unknown";
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String b() {
        String str;
        PackageInfo packageInfo;
        try {
            Context b2 = Cdo.a().b();
            packageInfo = b2.getPackageManager().getPackageInfo(b2.getPackageName(), 0);
        } catch (Throwable th) {
            eo.a(6, a, "", th);
            str = "Unknown";
        }
        if (packageInfo.versionName != null) {
            str = packageInfo.versionName;
        } else {
            if (packageInfo.versionCode != 0) {
                str = Integer.toString(packageInfo.versionCode);
            }
            str = "Unknown";
        }
        return str;
    }
}
