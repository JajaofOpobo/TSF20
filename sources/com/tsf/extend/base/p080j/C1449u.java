package com.tsf.extend.base.p080j;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
/* renamed from: com.tsf.extend.base.j.u */
/* loaded from: classes.dex */
public class C1449u {
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
        if (r3 == android.net.NetworkInfo.State.CONNECTING) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
        if (r0 == android.net.NetworkInfo.State.CONNECTING) goto L26;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m8589a(android.content.Context r5) {
        /*
            r2 = 1
            r1 = 0
            java.lang.String r0 = "connectivity"
            java.lang.Object r0 = r5.getSystemService(r0)
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            if (r0 != 0) goto Le
            r0 = r1
        Ld:
            return r0
        Le:
            r3 = 0
            android.net.NetworkInfo r3 = r0.getNetworkInfo(r3)     // Catch: java.lang.Exception -> L23
            if (r3 == 0) goto L24
            android.net.NetworkInfo$State r3 = r3.getState()     // Catch: java.lang.Exception -> L23
            android.net.NetworkInfo$State r4 = android.net.NetworkInfo.State.CONNECTED     // Catch: java.lang.Exception -> L23
            if (r3 == r4) goto L21
            android.net.NetworkInfo$State r4 = android.net.NetworkInfo.State.CONNECTING     // Catch: java.lang.Exception -> L23
            if (r3 != r4) goto L24
        L21:
            r0 = r2
            goto Ld
        L23:
            r3 = move-exception
        L24:
            r3 = 1
            android.net.NetworkInfo r0 = r0.getNetworkInfo(r3)     // Catch: java.lang.Exception -> L39
            if (r0 == 0) goto L3a
            android.net.NetworkInfo$State r0 = r0.getState()     // Catch: java.lang.Exception -> L39
            android.net.NetworkInfo$State r3 = android.net.NetworkInfo.State.CONNECTED     // Catch: java.lang.Exception -> L39
            if (r0 == r3) goto L37
            android.net.NetworkInfo$State r3 = android.net.NetworkInfo.State.CONNECTING     // Catch: java.lang.Exception -> L39
            if (r0 != r3) goto L3a
        L37:
            r0 = r2
            goto Ld
        L39:
            r0 = move-exception
        L3a:
            r0 = r1
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.extend.base.p080j.C1449u.m8589a(android.content.Context):boolean");
    }

    /* renamed from: b */
    public static boolean m8588b(Context context) {
        if (context == null) {
            return false;
        }
        WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
        WifiInfo connectionInfo = wifiManager.getConnectionInfo();
        return wifiManager.isWifiEnabled() && (connectionInfo == null ? 0 : connectionInfo.getIpAddress()) != 0;
    }

    /* renamed from: c */
    public static String m8587c(Context context) {
        return String.valueOf(m8586d(context));
    }

    /* renamed from: d */
    private static int m8586d(Context context) {
        int i;
        if (context == null) {
            return 0;
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                i = 0;
            } else {
                int type = activeNetworkInfo.getType();
                int subtype = activeNetworkInfo.getSubtype();
                if (type == 1) {
                    i = 1;
                } else if (type == 0) {
                    switch (subtype) {
                        case 1:
                        case 2:
                        case 4:
                        case 7:
                        case 11:
                            i = 2;
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
                            i = 3;
                            break;
                        case 13:
                            i = 4;
                            break;
                        default:
                            i = 0;
                            break;
                    }
                } else {
                    i = 0;
                }
            }
            return i;
        } catch (NullPointerException e) {
            return 0;
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0;
        }
    }
}
