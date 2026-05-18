package com.cm.kinfoc;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import java.util.Locale;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class o {
    public static String a() {
        return Build.BRAND;
    }

    public static String b() {
        return Build.MODEL;
    }

    public static String a(Context context) {
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

    public static String b(Context context) {
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

    /* JADX WARN: Removed duplicated region for block: B:27:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int c(android.content.Context r4) {
        /*
            r2 = 1
            if (r4 != 0) goto L4
        L3:
            return r2
        L4:
            r1 = 0
            java.lang.String r0 = "connectivity"
            java.lang.Object r0 = r4.getSystemService(r0)     // Catch: java.lang.NullPointerException -> L3d java.lang.Exception -> L41
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch: java.lang.NullPointerException -> L3d java.lang.Exception -> L41
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()     // Catch: java.lang.NullPointerException -> L3d java.lang.Exception -> L41
            if (r0 == 0) goto L45
            boolean r3 = r0.isConnected()     // Catch: java.lang.NullPointerException -> L3d java.lang.Exception -> L41
            if (r3 == 0) goto L45
            int r3 = r0.getType()     // Catch: java.lang.NullPointerException -> L3d java.lang.Exception -> L41
            int r0 = r0.getSubtype()     // Catch: java.lang.NullPointerException -> L3d java.lang.Exception -> L41
            if (r3 != r2) goto L2c
            boolean r0 = d(r4)     // Catch: java.lang.NullPointerException -> L3d java.lang.Exception -> L41
            if (r0 == 0) goto L45
            r0 = 2
        L2a:
            r2 = r0
            goto L3
        L2c:
            if (r3 != 0) goto L3b
            switch(r0) {
                case 1: goto L33;
                case 2: goto L33;
                case 3: goto L35;
                case 4: goto L33;
                case 5: goto L35;
                case 6: goto L35;
                case 7: goto L33;
                case 8: goto L35;
                case 9: goto L35;
                case 10: goto L35;
                case 11: goto L33;
                case 12: goto L35;
                case 13: goto L38;
                case 14: goto L35;
                case 15: goto L35;
                default: goto L31;
            }
        L31:
            r0 = r2
            goto L2a
        L33:
            r0 = 4
            goto L2a
        L35:
            r0 = 8
            goto L2a
        L38:
            r0 = 16
            goto L2a
        L3b:
            r0 = r2
            goto L2a
        L3d:
            r0 = move-exception
            r0 = 32
            goto L2a
        L41:
            r0 = move-exception
            r0.printStackTrace()
        L45:
            r0 = r1
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cm.kinfoc.o.c(android.content.Context):int");
    }

    public static boolean d(Context context) {
        if (context == null) {
            return false;
        }
        WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
        WifiInfo connectionInfo = null;
        try {
            connectionInfo = wifiManager.getConnectionInfo();
        } catch (Exception e) {
        }
        return wifiManager.isWifiEnabled() && (connectionInfo == null ? 0 : connectionInfo.getIpAddress()) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean e(android.content.Context r2) {
        /*
            r1 = 0
            if (r2 != 0) goto L4
        L3:
            return r1
        L4:
            java.lang.String r0 = "connectivity"
            java.lang.Object r0 = r2.getSystemService(r0)
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()     // Catch: java.lang.SecurityException -> L1b
            if (r0 == 0) goto L1e
            boolean r0 = r0.isConnected()     // Catch: java.lang.SecurityException -> L1b
            if (r0 == 0) goto L1e
            r0 = 1
        L19:
            r1 = r0
            goto L3
        L1b:
            r0 = move-exception
            r0 = r1
            goto L19
        L1e:
            r0 = r1
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cm.kinfoc.o.e(android.content.Context):boolean");
    }

    public static String c() {
        String strA;
        String country = Locale.getDefault().getCountry();
        String language = Locale.getDefault().getLanguage();
        if (country == null || country.equals("") || language == null || language.equals("")) {
            strA = m.a((String) null, "cl");
        } else {
            strA = m.a(country + "_" + language, "cl");
        }
        if (strA == null) {
            return "NONE";
        }
        return strA;
    }
}
