package com.flurry.sdk;

import android.os.Looper;
import android.telephony.TelephonyManager;
import java.util.Arrays;
/* renamed from: com.flurry.sdk.dy */
/* loaded from: classes.dex */
public class C1224dy {

    /* renamed from: a */
    private static final String f3930a = C1224dy.class.getSimpleName();

    /* renamed from: b */
    private static byte[] f3931b;

    /* renamed from: a */
    public static synchronized byte[] m9345a() {
        byte[] bArr;
        synchronized (C1224dy.class) {
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                throw new IllegalStateException("Must be called from a background thread!");
            }
            if (f3931b != null) {
                bArr = f3931b;
            } else if (C1211do.m9390a().m9386b().checkCallingOrSelfPermission("android.permission.READ_PHONE_STATE") != 0) {
                bArr = null;
            } else {
                m9344b();
                bArr = f3931b;
            }
        }
        return bArr;
    }

    /* renamed from: b */
    private static void m9344b() {
        String deviceId;
        TelephonyManager telephonyManager = (TelephonyManager) C1211do.m9390a().m9386b().getSystemService("phone");
        if (telephonyManager != null && (deviceId = telephonyManager.getDeviceId()) != null && deviceId.trim().length() > 0) {
            try {
                byte[] m9144d = C1277fe.m9144d(deviceId);
                if (m9144d != null && m9144d.length == 20) {
                    f3931b = m9144d;
                } else {
                    C1258eo.m9234a(6, f3930a, "sha1 is not 20 bytes long: " + Arrays.toString(m9144d));
                }
            } catch (Exception e) {
                C1258eo.m9234a(6, f3930a, "Exception in generateHashedImei()");
            }
        }
    }
}
