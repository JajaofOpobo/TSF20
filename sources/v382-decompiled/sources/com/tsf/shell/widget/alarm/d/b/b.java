package com.tsf.shell.widget.alarm.d.b;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import com.tsf.shell.widget.alarm.u;

/* loaded from: classes.dex */
class b implements LocationListener {
    b() {
    }

    @Override // android.location.LocationListener
    public void onLocationChanged(Location location) {
        if (location != null) {
            a.a = location.getLatitude();
            a.b = location.getLongitude();
            u.c("CustomListener latitude:" + location.getProvider() + "    " + a.a + "  longitude:" + a.b);
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
