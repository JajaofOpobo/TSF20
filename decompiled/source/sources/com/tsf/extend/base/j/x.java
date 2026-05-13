package com.tsf.extend.base.j;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
/* loaded from: classes.dex */
public class x {
    public static String a(Context context) {
        try {
            return Settings.Secure.getString(context.getContentResolver(), "android_id");
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String b(Context context) {
        String networkOperator = ((TelephonyManager) context.getSystemService("phone")).getNetworkOperator();
        if (TextUtils.isEmpty(networkOperator) || networkOperator.length() < 5) {
            return "";
        }
        return networkOperator.substring(0, 3);
    }

    public static String c(Context context) {
        String networkOperator = ((TelephonyManager) context.getSystemService("phone")).getNetworkOperator();
        if (TextUtils.isEmpty(networkOperator) || networkOperator.length() < 5) {
            return "";
        }
        return networkOperator.substring(3);
    }

    public static String d(Context context) {
        String simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
        if (TextUtils.isEmpty(simOperator) || simOperator.length() < 5) {
            return "";
        }
        return simOperator.substring(0, 3);
    }

    public static String e(Context context) {
        String simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
        if (TextUtils.isEmpty(simOperator) || simOperator.length() < 5) {
            return "";
        }
        return simOperator.substring(3);
    }

    public static String a() {
        return Build.VERSION.RELEASE;
    }

    public static String b() {
        return String.valueOf(Build.VERSION.SDK_INT);
    }

    public static String c() {
        return Build.BRAND;
    }

    public static String d() {
        return Build.MODEL;
    }

    public static String f(Context context) {
        try {
            return context.getResources().getConfiguration().locale.toString();
        } catch (Exception e) {
            return "";
        }
    }

    public static String g(Context context) {
        String str;
        try {
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str != null ? str : "";
    }
}
