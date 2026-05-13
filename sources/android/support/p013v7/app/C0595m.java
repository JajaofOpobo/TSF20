package android.support.p013v7.app;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.support.p002v4.content.C0159h;
import android.util.Log;
import java.util.Calendar;
/* renamed from: android.support.v7.app.m */
/* loaded from: classes.dex */
class C0595m {

    /* renamed from: a */
    private static final C0597a f1333a = new C0597a();

    /* renamed from: b */
    private final Context f1334b;

    /* renamed from: c */
    private final LocationManager f1335c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0595m(Context context) {
        this.f1334b = context;
        this.f1335c = (LocationManager) context.getSystemService("location");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean m11930a() {
        C0597a c0597a = f1333a;
        if (m11928a(c0597a)) {
            return c0597a.f1336a;
        }
        Location m11926b = m11926b();
        if (m11926b != null) {
            m11929a(m11926b);
            return c0597a.f1336a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i = Calendar.getInstance().get(11);
        return i < 6 || i >= 22;
    }

    /* renamed from: b */
    private Location m11926b() {
        Location m11927a = C0159h.m13381a(this.f1334b, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? m11927a("network") : null;
        Location m11927a2 = C0159h.m13381a(this.f1334b, "android.permission.ACCESS_FINE_LOCATION") == 0 ? m11927a("gps") : null;
        if (m11927a2 != null && m11927a != null) {
            return m11927a2.getTime() > m11927a.getTime() ? m11927a2 : m11927a;
        }
        if (m11927a2 == null) {
            m11927a2 = m11927a;
        }
        return m11927a2;
    }

    /* renamed from: a */
    private Location m11927a(String str) {
        if (this.f1335c != null) {
            try {
                if (this.f1335c.isProviderEnabled(str)) {
                    return this.f1335c.getLastKnownLocation(str);
                }
            } catch (Exception e) {
                Log.d("TwilightManager", "Failed to get last known location", e);
            }
        }
        return null;
    }

    /* renamed from: a */
    private boolean m11928a(C0597a c0597a) {
        return c0597a != null && c0597a.f1341f > System.currentTimeMillis();
    }

    /* renamed from: a */
    private void m11929a(Location location) {
        long j;
        long j2;
        C0597a c0597a = f1333a;
        long currentTimeMillis = System.currentTimeMillis();
        C0594l m11932a = C0594l.m11932a();
        m11932a.m11931a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j3 = m11932a.f1330a;
        m11932a.m11931a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = m11932a.f1332c == 1;
        long j4 = m11932a.f1331b;
        long j5 = m11932a.f1330a;
        m11932a.m11931a(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
        long j6 = m11932a.f1331b;
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
        c0597a.f1336a = z;
        c0597a.f1337b = j3;
        c0597a.f1338c = j4;
        c0597a.f1339d = j5;
        c0597a.f1340e = j6;
        c0597a.f1341f = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.app.m$a */
    /* loaded from: classes.dex */
    public static class C0597a {

        /* renamed from: a */
        boolean f1336a;

        /* renamed from: b */
        long f1337b;

        /* renamed from: c */
        long f1338c;

        /* renamed from: d */
        long f1339d;

        /* renamed from: e */
        long f1340e;

        /* renamed from: f */
        long f1341f;

        private C0597a() {
        }
    }
}
