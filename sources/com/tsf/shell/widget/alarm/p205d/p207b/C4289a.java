package com.tsf.shell.widget.alarm.p205d.p207b;

import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import com.tsf.shell.widget.alarm.C4305i;
import java.io.IOException;
import java.util.List;
/* renamed from: com.tsf.shell.widget.alarm.d.b.a */
/* loaded from: classes.dex */
public class C4289a {

    /* renamed from: a */
    public static double f13888a;

    /* renamed from: b */
    public static double f13889b;

    /* renamed from: c */
    public static String f13890c;

    /* renamed from: d */
    public static Location f13891d;

    /* renamed from: e */
    public static LocationManager f13892e;

    /* renamed from: f */
    public static C4290a f13893f = new C4290a();

    /* renamed from: a */
    public static void m304a(Context context) {
        f13892e = (LocationManager) context.getSystemService("location");
        try {
            m299b(context);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public static boolean m299b(Context context) {
        if (!m302a(context, "android.permission.ACCESS_FINE_LOCATION")) {
            C4305i.m259c("Permission miss, Skip Locate Weather");
            return false;
        }
        if (f13892e.isProviderEnabled("gps")) {
            C4305i.m260b("==GPS isProviderEnabled = true");
            f13891d = f13892e.getLastKnownLocation("gps");
            if (f13891d != null) {
                f13888a = f13891d.getLatitude();
                f13889b = f13891d.getLongitude();
                C4305i.m259c("GPS latitude:" + f13888a + "  longitude:" + f13889b);
                String m303a = m303a(context, f13891d);
                if (m303a != null) {
                    f13890c = m303a;
                }
                return true;
            }
            C4305i.m262a("GPS location = null");
        }
        f13891d = f13892e.getLastKnownLocation("network");
        if (f13891d != null) {
            f13888a = f13891d.getLatitude();
            f13889b = f13891d.getLongitude();
            C4305i.m259c("WIFI latitude:" + f13888a + "  longitude:" + f13889b);
            String m303a2 = m303a(context, f13891d);
            if (m303a2 != null) {
                f13890c = m303a2;
            }
            return true;
        }
        C4305i.m260b("WIFI location = null");
        return false;
    }

    /* renamed from: a */
    private static boolean m302a(Context context, String str) {
        try {
            for (String str2 : context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions) {
                if (str.equals(str2)) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: com.tsf.shell.widget.alarm.d.b.a$a */
    /* loaded from: classes.dex */
    static class C4290a implements LocationListener {
        C4290a() {
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(Location location) {
            if (location != null) {
                C4289a.f13888a = location.getLatitude();
                C4289a.f13889b = location.getLongitude();
                C4305i.m259c("CustomListener latitude:" + location.getProvider() + "    " + C4289a.f13888a + "  longitude:" + C4289a.f13889b);
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

    /* renamed from: a */
    private static String m303a(Context context, Location location) {
        double d;
        List<Address> list;
        double d2 = 0.0d;
        Geocoder geocoder = new Geocoder(context);
        String str = "";
        if (location != null) {
            d = location.getLatitude();
            d2 = location.getLongitude();
        } else {
            d = 0.0d;
        }
        try {
            list = geocoder.getFromLocation(d, d2, 1);
        } catch (IOException e) {
            e.printStackTrace();
            list = null;
        }
        if (list != null && list.size() > 0) {
            String str2 = "";
            for (int i = 0; i < list.size(); i++) {
                str2 = str2 + list.get(i).getLocality();
                C4305i.m259c("CCCCCCC:" + str2);
            }
            str = str2;
        }
        if (str.length() == 0 || str.equals("null")) {
            return null;
        }
        return str;
    }

    /* renamed from: a */
    public static String m301a(String str) {
        if (f13890c != null && f13890c.length() != 0) {
            return f13890c;
        }
        return str;
    }

    /* renamed from: a */
    public static double m305a() {
        return f13888a;
    }

    /* renamed from: b */
    public static double m300b() {
        return f13889b;
    }
}
