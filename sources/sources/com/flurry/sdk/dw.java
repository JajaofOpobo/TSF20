package com.flurry.sdk;

import android.os.Looper;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import java.io.IOException;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class dw {
    private static final String a = dw.class.getSimpleName();

    public static synchronized AdvertisingIdClient.Info a() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Must be called from a background thread!");
        }
        return !b() ? null : c();
    }

    public static boolean b() {
        try {
            int iIsGooglePlayServicesAvailable = GooglePlayServicesUtil.isGooglePlayServicesAvailable(Cdo.a().b());
            if (iIsGooglePlayServicesAvailable == 0) {
                return true;
            }
            eo.d(a, "Google Play Services not available - connection result: " + iIsGooglePlayServicesAvailable);
            return false;
        } catch (Exception e) {
            eo.d(a, "Google Play Services not available - " + e);
            return false;
        }
    }

    private static AdvertisingIdClient.Info c() {
        try {
            return AdvertisingIdClient.getAdvertisingIdInfo(Cdo.a().b());
        } catch (IOException e) {
            eo.a(6, a, "Exception in readAdvertisingInfo():" + e);
            return null;
        } catch (GooglePlayServicesRepairableException e2) {
            eo.a(6, a, "Exception in readAdvertisingInfo():" + e2);
            return null;
        } catch (GooglePlayServicesNotAvailableException e3) {
            eo.a(6, a, "Exception in readAdvertisingInfo():" + e3);
            return null;
        }
    }
}
