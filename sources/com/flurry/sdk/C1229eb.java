package com.flurry.sdk;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
/* renamed from: com.flurry.sdk.eb */
/* loaded from: classes.dex */
public class C1229eb {

    /* renamed from: a */
    private static final String f3953a = C1229eb.class.getSimpleName();

    /* renamed from: b */
    private static String f3954b;

    /* renamed from: c */
    private static String f3955c;

    /* renamed from: a */
    public static void m9306a(String str) {
        f3954b = str;
    }

    /* renamed from: a */
    public static synchronized String m9307a() {
        String str;
        synchronized (C1229eb.class) {
            if (!TextUtils.isEmpty(f3954b)) {
                str = f3954b;
            } else if (!TextUtils.isEmpty(f3955c)) {
                str = f3955c;
            } else {
                f3955c = m9305b();
                str = f3955c;
            }
        }
        return str;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0030 -> B:5:0x001b). Please submit an issue!!! */
    /* renamed from: b */
    private static String m9305b() {
        PackageInfo packageInfo;
        try {
            Context m9386b = C1211do.m9390a().m9386b();
            packageInfo = m9386b.getPackageManager().getPackageInfo(m9386b.getPackageName(), 0);
        } catch (Throwable th) {
            C1258eo.m9233a(6, f3953a, "", th);
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
