package com.p060cm.kinfoc;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import java.util.Locale;
/* renamed from: com.cm.kinfoc.o */
/* loaded from: classes.dex */
public class C1163o {
    /* renamed from: a */
    public static String m9651a() {
        return Build.BRAND;
    }

    /* renamed from: b */
    public static String m9649b() {
        return Build.MODEL;
    }

    /* renamed from: a */
    public static String m9650a(Context context) {
        if (context == null) {
            return null;
        }
        String simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
        if (simOperator == null || simOperator.length() < 3) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) simOperator, 0, 3);
        return sb.toString();
    }

    /* renamed from: b */
    public static String m9648b(Context context) {
        if (context == null) {
            return null;
        }
        String simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
        if (simOperator == null || simOperator.length() < 5) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) simOperator, 3, 5);
        return sb.toString();
    }

    /* renamed from: c */
    public static int m9646c(Context context) {
        int i;
        NetworkInfo activeNetworkInfo;
        if (context == null) {
            return 1;
        }
        try {
            activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (NullPointerException e) {
            i = 32;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            int type = activeNetworkInfo.getType();
            int subtype = activeNetworkInfo.getSubtype();
            if (type == 1) {
                if (m9645d(context)) {
                    i = 2;
                }
            } else if (type == 0) {
                switch (subtype) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                        i = 4;
                        break;
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                    case 15:
                        i = 8;
                        break;
                    case 13:
                        i = 16;
                        break;
                    default:
                        i = 1;
                        break;
                }
            } else {
                i = 1;
            }
            return i;
        }
        i = 0;
        return i;
    }

    /* renamed from: d */
    public static boolean m9645d(Context context) {
        if (context == null) {
            return false;
        }
        WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
        WifiInfo wifiInfo = null;
        try {
            wifiInfo = wifiManager.getConnectionInfo();
        } catch (Exception e) {
        }
        return wifiManager.isWifiEnabled() && (wifiInfo == null ? 0 : wifiInfo.getIpAddress()) != 0;
    }

    /* renamed from: e */
    public static boolean m9644e(Context context) {
        boolean z;
        NetworkInfo activeNetworkInfo;
        if (context == null) {
            return false;
        }
        try {
            activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (SecurityException e) {
            z = false;
        }
        if (activeNetworkInfo != null) {
            if (activeNetworkInfo.isConnected()) {
                z = true;
                return z;
            }
        }
        z = false;
        return z;
    }

    /* renamed from: c */
    public static String m9647c() {
        String m9676a;
        String country = Locale.getDefault().getCountry();
        String language = Locale.getDefault().getLanguage();
        if (country == null || country.equals("") || language == null || language.equals("")) {
            m9676a = C1155m.m9676a((String) null, "cl");
        } else {
            m9676a = C1155m.m9676a(country + "_" + language, "cl");
        }
        if (m9676a == null) {
            return "NONE";
        }
        return m9676a;
    }
}
