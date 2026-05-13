package android.support.v7.app;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import java.util.Calendar;
/* loaded from: classes.dex */
class m {
    private static final a a = new a();
    private final Context b;
    private final LocationManager c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(Context context) {
        this.b = context;
        this.c = (LocationManager) context.getSystemService("location");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a() {
        a aVar = a;
        if (a(aVar)) {
            return aVar.a;
        }
        Location b = b();
        if (b != null) {
            a(b);
            return aVar.a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i = Calendar.getInstance().get(11);
        return i < 6 || i >= 22;
    }

    private Location b() {
        Location a2 = android.support.v4.content.h.a(this.b, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? a("network") : null;
        Location a3 = android.support.v4.content.h.a(this.b, "android.permission.ACCESS_FINE_LOCATION") == 0 ? a("gps") : null;
        if (a3 != null && a2 != null) {
            return a3.getTime() > a2.getTime() ? a3 : a2;
        }
        if (a3 == null) {
            a3 = a2;
        }
        return a3;
    }

    private Location a(String str) {
        if (this.c != null) {
            try {
                if (this.c.isProviderEnabled(str)) {
                    return this.c.getLastKnownLocation(str);
                }
            } catch (Exception e) {
                Log.d("TwilightManager", "Failed to get last known location", e);
            }
        }
        return null;
    }

    private boolean a(a aVar) {
        return aVar != null && aVar.f > System.currentTimeMillis();
    }

    private void a(Location location) {
        long j;
        long j2;
        a aVar = a;
        long currentTimeMillis = System.currentTimeMillis();
        l a2 = l.a();
        a2.a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j3 = a2.a;
        a2.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = a2.c == 1;
        long j4 = a2.b;
        long j5 = a2.a;
        a2.a(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
        long j6 = a2.b;
        if (j4 == -1 || j5 == -1) {
            j = 43200000 + currentTimeMillis;
        } else {
            if (currentTimeMillis > j5) {
                j2 = 0 + j6;
            } else if (currentTimeMillis > j4) {
                j2 = 0 + j5;
            } else {
                j2 = 0 + j4;
            }
            j = j2 + 60000;
        }
        aVar.a = z;
        aVar.b = j3;
        aVar.c = j4;
        aVar.d = j5;
        aVar.e = j6;
        aVar.f = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a {
        boolean a;
        long b;
        long c;
        long d;
        long e;
        long f;

        private a() {
        }
    }
}
