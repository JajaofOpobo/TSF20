package com.flurry.sdk;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
/* renamed from: com.flurry.sdk.dx */
/* loaded from: classes.dex */
public final class C1223dx {

    /* renamed from: a */
    private static final String f3929a = C1223dx.class.getSimpleName();

    /* renamed from: a */
    public static PackageInfo m9349a(Context context) {
        if (context == null) {
            return null;
        }
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 20815);
        } catch (PackageManager.NameNotFoundException e) {
            C1258eo.m9232a(f3929a, "Cannot find package info for package: " + context.getPackageName());
            return null;
        }
    }

    /* renamed from: b */
    public static ApplicationInfo m9348b(Context context) {
        if (context == null) {
            return null;
        }
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), ItemInfo.APP_INTENT);
        } catch (PackageManager.NameNotFoundException e) {
            C1258eo.m9232a(f3929a, "Cannot find application info for package: " + context.getPackageName());
            return null;
        }
    }

    /* renamed from: c */
    public static String m9347c(Context context) {
        PackageInfo m9349a = m9349a(context);
        return (m9349a == null || m9349a.packageName == null) ? "" : m9349a.packageName;
    }

    /* renamed from: d */
    public static Bundle m9346d(Context context) {
        ApplicationInfo m9348b = m9348b(context);
        return (m9348b == null || m9348b.metaData == null) ? Bundle.EMPTY : m9348b.metaData;
    }
}
