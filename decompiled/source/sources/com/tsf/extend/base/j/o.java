package com.tsf.extend.base.j;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public class o {
    private static List<Integer> a = Collections.synchronizedList(new ArrayList());

    static {
        a.add(234);
        a.add(235);
        a.add(505);
        a.add(302);
        a.add(272);
        a.add(530);
        a.add(454);
    }

    public static int a(Context context) {
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
                if (b(context)) {
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

    public static boolean b(Context context) {
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

    public static boolean c(Context context) {
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
}
