package com.tsf.shell.widget.alarm.d.b;

import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationManager;
import com.tsf.shell.widget.alarm.u;
import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
public class a {
    public static double a;
    public static double b;
    public static String c;
    public static Location d;
    public static LocationManager e;
    public static b f = new b();

    public static void a(Context context) {
        e = (LocationManager) context.getSystemService("location");
        try {
            b(context);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static boolean b(Context context) {
        if (!a(context, "android.permission.ACCESS_FINE_LOCATION")) {
            u.c("Permission miss, Skip Locate Weather");
            return false;
        }
        if (e.isProviderEnabled("gps")) {
            u.b("==GPS isProviderEnabled = true");
            d = e.getLastKnownLocation("gps");
            if (d != null) {
                a = d.getLatitude();
                b = d.getLongitude();
                u.c("GPS latitude:" + a + "  longitude:" + b);
                String a2 = a(context, d);
                if (a2 != null) {
                    c = a2;
                }
                return true;
            }
            u.a("GPS location = null");
        }
        d = e.getLastKnownLocation("network");
        if (d != null) {
            a = d.getLatitude();
            b = d.getLongitude();
            u.c("WIFI latitude:" + a + "  longitude:" + b);
            String a3 = a(context, d);
            if (a3 != null) {
                c = a3;
            }
            return true;
        }
        u.b("WIFI location = null");
        return false;
    }

    private static boolean a(Context context, String str) {
        try {
            for (String str2 : context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions) {
                if (str.equals(str2)) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    private static String a(Context context, Location location) {
        double d2;
        List<Address> list;
        double d3 = 0.0d;
        Geocoder geocoder = new Geocoder(context);
        String str = "";
        if (location != null) {
            d2 = location.getLatitude();
            d3 = location.getLongitude();
        } else {
            d2 = 0.0d;
        }
        try {
            list = geocoder.getFromLocation(d2, d3, 1);
        } catch (IOException e2) {
            e2.printStackTrace();
            list = null;
        }
        if (list != null && list.size() > 0) {
            String str2 = "";
            for (int i = 0; i < list.size(); i++) {
                str2 = String.valueOf(str2) + list.get(i).getLocality();
                u.c("CCCCCCC:" + str2);
            }
            str = str2;
        }
        if (str.length() == 0 || str.equals("null")) {
            return null;
        }
        return str;
    }

    public static String a(String str) {
        if (c != null && c.length() != 0) {
            return c;
        }
        return str;
    }

    public static double a() {
        return a;
    }

    public static double b() {
        return b;
    }
}
