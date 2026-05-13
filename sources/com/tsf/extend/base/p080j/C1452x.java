package com.tsf.extend.base.p080j;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
/* renamed from: com.tsf.extend.base.j.x */
/* loaded from: classes.dex */
public class C1452x {
    /* renamed from: a */
    public static String m8580a(Context context) {
        try {
            return Settings.Secure.getString(context.getContentResolver(), "android_id");
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: b */
    public static String m8578b(Context context) {
        String networkOperator = ((TelephonyManager) context.getSystemService("phone")).getNetworkOperator();
        if (TextUtils.isEmpty(networkOperator) || networkOperator.length() < 5) {
            return "";
        }
        return networkOperator.substring(0, 3);
    }

    /* renamed from: c */
    public static String m8576c(Context context) {
        String networkOperator = ((TelephonyManager) context.getSystemService("phone")).getNetworkOperator();
        if (TextUtils.isEmpty(networkOperator) || networkOperator.length() < 5) {
            return "";
        }
        return networkOperator.substring(3);
    }

    /* renamed from: d */
    public static String m8574d(Context context) {
        String simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
        if (TextUtils.isEmpty(simOperator) || simOperator.length() < 5) {
            return "";
        }
        return simOperator.substring(0, 3);
    }

    /* renamed from: e */
    public static String m8573e(Context context) {
        String simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
        if (TextUtils.isEmpty(simOperator) || simOperator.length() < 5) {
            return "";
        }
        return simOperator.substring(3);
    }

    /* renamed from: a */
    public static String m8581a() {
        return Build.VERSION.RELEASE;
    }

    /* renamed from: b */
    public static String m8579b() {
        return String.valueOf(Build.VERSION.SDK_INT);
    }

    /* renamed from: c */
    public static String m8577c() {
        return Build.BRAND;
    }

    /* renamed from: d */
    public static String m8575d() {
        return Build.MODEL;
    }

    /* renamed from: f */
    public static String m8572f(Context context) {
        try {
            return context.getResources().getConfiguration().locale.toString();
        } catch (Exception e) {
            return "";
        }
    }

    /* renamed from: g */
    public static String m8571g(Context context) {
        String str;
        try {
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str != null ? str : "";
    }
}
