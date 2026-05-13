package com.flurry.sdk;
/* loaded from: classes.dex */
public enum dr {
    PhoneId(0, true),
    Sha1Imei(5, false),
    AndroidAdvertisingId(13, true);
    
    public final int d;
    public final boolean e;

    dr(int i, boolean z) {
        this.d = i;
        this.e = z;
    }
}
