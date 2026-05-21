package com.tsf.shell.widget.alarm.d.b;

import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import com.tsf.shell.widget.alarm.i;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class a {
    public static double a;
    public static double b;
    public static String c;
    public static Location d;
    public static LocationManager e;
    public static C0175a f = new C0175a();

    public static void a(Context context) {
        e = (LocationManager) context.getSystemService("location");
        try {
            b(context);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static boolean b(Context context) throws IOException {
        if (!a(context, "android.permission.ACCESS_FINE_LOCATION")) {
            i.c("Permission miss, Skip Locate Weather");
            return false;
        }
        if (e.isProviderEnabled("gps")) {
            i.b("==GPS isProviderEnabled = true");
            d = e.getLastKnownLocation("gps");
            if (d != null) {
                a = d.getLatitude();
                b = d.getLongitude();
                i.c("GPS latitude:" + a + "  longitude:" + b);
                String strA = a(context, d);
                if (strA != null) {
                    c = strA;
                }
                return true;
            }
            i.a("GPS location = null");
        }
        d = e.getLastKnownLocation("network");
        if (d != null) {
            a = d.getLatitude();
            b = d.getLongitude();
            i.c("WIFI latitude:" + a + "  longitude:" + b);
            String strA2 = a(context, d);
            if (strA2 != null) {
                c = strA2;
            }
            return true;
        }
        i.b("WIFI location = null");
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

    /* JADX INFO: renamed from: com.tsf.shell.widget.alarm.d.b.a$a, reason: collision with other inner class name */
    static class C0175a implements LocationListener {
        C0175a() {
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(Location location) {
            if (location != null) {
                a.a = location.getLatitude();
                a.b = location.getLongitude();
                i.c("CustomListener latitude:" + location.getProvider() + "    " + a.a + "  longitude:" + a.b);
            }
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(String str) {
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(String str) {
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(String str, int i, Bundle bundle) {
        }
    }

    private static String a(Context context, Location location) throws IOException {
        double latitude;
        List<Address> fromLocation;
        double longitude = 0.0d;
        Geocoder geocoder = new Geocoder(context);
        String str = "";
        if (location != null) {
            latitude = location.getLatitude();
            longitude = location.getLongitude();
        } else {
            latitude = 0.0d;
        }
        try {
            fromLocation = geocoder.getFromLocation(latitude, longitude, 1);
        } catch (IOException e2) {
            e2.printStackTrace();
            fromLocation = null;
        }
        if (fromLocation != null && fromLocation.size() > 0) {
            String str2 = "";
            for (int i = 0; i < fromLocation.size(); i++) {
                str2 = str2 + fromLocation.get(i).getLocality();
                i.c("CCCCCCC:" + str2);
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
