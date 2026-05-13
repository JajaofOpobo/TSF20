package com.flurry.sdk;

import android.content.Context;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import com.flurry.sdk.C1213dq;
import com.flurry.sdk.C1272fb;
/* renamed from: com.flurry.sdk.dz */
/* loaded from: classes.dex */
public class C1225dz implements C1213dq.InterfaceC1214a, C1272fb.InterfaceC1274a {

    /* renamed from: c */
    private static final String f3932c = C1225dz.class.getSimpleName();

    /* renamed from: q */
    private static C1225dz f3933q;

    /* renamed from: b */
    boolean f3935b;

    /* renamed from: i */
    private LocationManager f3941i;

    /* renamed from: j */
    private Criteria f3942j;

    /* renamed from: k */
    private Location f3943k;

    /* renamed from: m */
    private String f3945m;

    /* renamed from: p */
    private volatile Location f3948p;

    /* renamed from: d */
    private final int f3936d = 3;

    /* renamed from: e */
    private final long f3937e = 10000;

    /* renamed from: f */
    private final long f3938f = 90000;

    /* renamed from: g */
    private final long f3939g = 0;

    /* renamed from: h */
    private long f3940h = 0;

    /* renamed from: a */
    boolean f3934a = false;

    /* renamed from: n */
    private int f3946n = 0;

    /* renamed from: o */
    private int f3947o = 0;

    /* renamed from: l */
    private C1226a f3944l = new C1226a();

    /* renamed from: a */
    static /* synthetic */ int m9341a(C1225dz c1225dz) {
        int i = c1225dz.f3947o + 1;
        c1225dz.f3947o = i;
        return i;
    }

    private C1225dz() {
        C1213dq m9380a = C1212dp.m9380a();
        this.f3942j = (Criteria) m9380a.m9377a("LocationCriteria");
        m9380a.m9376a("LocationCriteria", (C1213dq.InterfaceC1214a) this);
        C1258eo.m9234a(4, f3932c, "initSettings, LocationCriteria = " + this.f3942j);
        this.f3935b = ((Boolean) m9380a.m9377a("ReportLocation")).booleanValue();
        m9380a.m9376a("ReportLocation", (C1213dq.InterfaceC1214a) this);
        C1258eo.m9234a(4, f3932c, "initSettings, ReportLocation = " + this.f3935b);
    }

    /* renamed from: a */
    public static synchronized C1225dz m9343a() {
        C1225dz c1225dz;
        synchronized (C1225dz.class) {
            if (f3933q == null) {
                f3933q = new C1225dz();
            }
            c1225dz = f3933q;
        }
        return c1225dz;
    }

    /* renamed from: b */
    public synchronized void m9337b() {
        if (this.f3941i == null) {
            this.f3941i = (LocationManager) C1211do.m9390a().m9386b().getSystemService("location");
        }
    }

    /* renamed from: c */
    public synchronized void m9334c() {
        C1258eo.m9234a(4, f3932c, "Location provider subscribed");
        this.f3946n++;
        if (!this.f3934a && this.f3947o < 3) {
            m9327j();
        }
    }

    /* renamed from: d */
    public synchronized void m9333d() {
        C1258eo.m9234a(4, f3932c, "Location provider unsubscribed");
        if (this.f3946n <= 0) {
            C1258eo.m9234a(6, f3932c, "Error! Unsubscribed too many times!");
        } else {
            this.f3946n--;
            if (this.f3946n == 0) {
                m9328i();
            }
        }
    }

    /* renamed from: a */
    public void m9342a(float f, float f2) {
        this.f3948p = new Location("Explicit");
        this.f3948p.setLatitude(f);
        this.f3948p.setLongitude(f2);
    }

    /* renamed from: e */
    public void m9332e() {
        this.f3948p = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public void m9328i() {
        this.f3941i.removeUpdates(this.f3944l);
        this.f3934a = false;
        this.f3947o = 0;
        this.f3940h = 0L;
        m9324m();
        C1258eo.m9234a(4, f3932c, "LocationProvider stopped");
    }

    /* renamed from: j */
    private void m9327j() {
        if (this.f3935b && this.f3948p == null) {
            Context m9386b = C1211do.m9390a().m9386b();
            if (m9386b.checkCallingOrSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0 || m9386b.checkCallingOrSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0) {
                m9328i();
                String m9326k = m9326k();
                m9339a(m9326k);
                this.f3943k = m9335b(m9326k);
                this.f3940h = System.currentTimeMillis() + 90000;
                m9325l();
                this.f3934a = true;
                C1258eo.m9234a(4, f3932c, "LocationProvider started");
            }
        }
    }

    /* renamed from: k */
    private String m9326k() {
        String str;
        Criteria criteria = this.f3942j;
        if (criteria == null) {
            criteria = new Criteria();
        }
        if (TextUtils.isEmpty(this.f3945m)) {
            str = this.f3941i.getBestProvider(criteria, true);
        } else {
            str = this.f3945m;
        }
        C1258eo.m9234a(4, f3932c, "provider = " + str);
        return str;
    }

    /* renamed from: a */
    private void m9339a(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f3941i.requestLocationUpdates(str, 10000L, 0.0f, this.f3944l, Looper.getMainLooper());
        }
    }

    /* renamed from: b */
    private Location m9335b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f3941i.getLastKnownLocation(str);
    }

    /* renamed from: f */
    public Location m9331f() {
        Location location = null;
        if (this.f3948p != null) {
            return this.f3948p;
        }
        if (this.f3935b) {
            Location m9335b = m9335b(m9326k());
            if (m9335b != null) {
                this.f3943k = m9335b;
            }
            location = this.f3943k;
        }
        C1258eo.m9234a(4, f3932c, "getLocation() = " + location);
        return location;
    }

    /* renamed from: g */
    public void m9330g() {
        this.f3946n = 0;
        m9328i();
    }

    @Override // com.flurry.sdk.C1272fb.InterfaceC1274a
    /* renamed from: a */
    public void mo9174a(C1272fb c1272fb) {
        if (this.f3940h > 0 && this.f3940h < System.currentTimeMillis()) {
            C1258eo.m9234a(4, f3932c, "No location received in 90 seconds , stopping LocationManager");
            m9328i();
        }
    }

    /* renamed from: l */
    private void m9325l() {
        C1258eo.m9234a(4, f3932c, "Register location timer");
        C1271fa.m9192a().m9191a(this);
    }

    /* renamed from: m */
    private void m9324m() {
        C1258eo.m9234a(4, f3932c, "Unregister location timer");
        C1271fa.m9192a().m9190b(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.flurry.sdk.dz$a */
    /* loaded from: classes.dex */
    public class C1226a implements LocationListener {
        public C1226a() {
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(String str, int i, Bundle bundle) {
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(String str) {
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(String str) {
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(Location location) {
            if (location != null) {
                C1225dz.this.f3943k = location;
            }
            C1258eo.m9234a(4, C1225dz.f3932c, "Location received");
            if (C1225dz.m9341a(C1225dz.this) >= 3) {
                C1258eo.m9234a(4, C1225dz.f3932c, "Max location reports reached, stopping");
                C1225dz.this.m9328i();
            }
        }
    }

    @Override // com.flurry.sdk.C1213dq.InterfaceC1214a
    /* renamed from: a */
    public void mo9338a(String str, Object obj) {
        if (str.equals("LocationCriteria")) {
            this.f3942j = (Criteria) obj;
            C1258eo.m9234a(4, f3932c, "onSettingUpdate, LocationCriteria = " + this.f3942j);
            if (this.f3934a) {
                m9327j();
            }
        } else if (str.equals("ReportLocation")) {
            this.f3935b = ((Boolean) obj).booleanValue();
            C1258eo.m9234a(4, f3932c, "onSettingUpdate, ReportLocation = " + this.f3935b);
            if (this.f3935b) {
                if (!this.f3934a && this.f3946n > 0) {
                    m9327j();
                    return;
                }
                return;
            }
            m9328i();
        } else {
            C1258eo.m9234a(6, f3932c, "LocationProvider internal error! Had to be LocationCriteria or ReportLocation key.");
        }
    }
}
