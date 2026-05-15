package com.flurry.sdk;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.censivn.C3DEngine.api.element.info.ItemInfo;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public final class dx {
    private static final String a = dx.class.getSimpleName();

    public static PackageInfo a(Context context) {
        if (context == null) {
            return null;
        }
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 20815);
        } catch (PackageManager.NameNotFoundException e) {
            eo.a(a, "Cannot find package info for package: " + context.getPackageName());
            return null;
        }
    }

    public static ApplicationInfo b(Context context) {
        if (context == null) {
            return null;
        }
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), ItemInfo.APP_INTENT);
        } catch (PackageManager.NameNotFoundException e) {
            eo.a(a, "Cannot find application info for package: " + context.getPackageName());
            return null;
        }
    }

    public static String c(Context context) {
        PackageInfo packageInfoA = a(context);
        return (packageInfoA == null || packageInfoA.packageName == null) ? "" : packageInfoA.packageName;
    }

    public static Bundle d(Context context) {
        ApplicationInfo applicationInfoB = b(context);
        return (applicationInfoB == null || applicationInfoB.metaData == null) ? Bundle.EMPTY : applicationInfoB.metaData;
    }
}
