package com.flurry.sdk;

import android.os.Looper;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import java.io.IOException;
/* renamed from: com.flurry.sdk.dw */
/* loaded from: classes.dex */
public class C1222dw {

    /* renamed from: a */
    private static final String f3928a = C1222dw.class.getSimpleName();

    /* renamed from: a */
    public static synchronized AdvertisingIdClient.Info m9352a() {
        AdvertisingIdClient.Info m9350c;
        synchronized (C1222dw.class) {
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                throw new IllegalStateException("Must be called from a background thread!");
            }
            m9350c = !m9351b() ? null : m9350c();
        }
        return m9350c;
    }

    /* renamed from: b */
    public static boolean m9351b() {
        try {
            int isGooglePlayServicesAvailable = GooglePlayServicesUtil.isGooglePlayServicesAvailable(C1211do.m9390a().m9386b());
            if (isGooglePlayServicesAvailable == 0) {
                return true;
            }
            C1258eo.m9218d(f3928a, "Google Play Services not available - connection result: " + isGooglePlayServicesAvailable);
            return false;
        } catch (Exception e) {
            C1258eo.m9218d(f3928a, "Google Play Services not available - " + e);
            return false;
        }
    }

    /* renamed from: c */
    private static AdvertisingIdClient.Info m9350c() {
        try {
            return AdvertisingIdClient.getAdvertisingIdInfo(C1211do.m9390a().m9386b());
        } catch (IOException e) {
            C1258eo.m9234a(6, f3928a, "Exception in readAdvertisingInfo():" + e);
            return null;
        } catch (GooglePlayServicesRepairableException e2) {
            C1258eo.m9234a(6, f3928a, "Exception in readAdvertisingInfo():" + e2);
            return null;
        } catch (GooglePlayServicesNotAvailableException e3) {
            C1258eo.m9234a(6, f3928a, "Exception in readAdvertisingInfo():" + e3);
            return null;
        }
    }
}
