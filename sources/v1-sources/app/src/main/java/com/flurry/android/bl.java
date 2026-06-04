package com.flurry.android;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes.dex */
final class bl extends bk {
    private static final String a = bl.class.getSimpleName();

    bl() {
    }

    @Override // com.flurry.android.bk
    protected final bg a() {
        return new bg("InMobiAndroidSDK", "3.5.0", "com.inmobi.androidsdk.IMAdInterstitial");
    }

    @Override // com.flurry.android.bk
    protected final bg b() {
        return new bg("InMobiAndroidSDK", "3.5.0", "com.inmobi.androidsdk.IMAdView");
    }

    @Override // com.flurry.android.bk
    protected final Bundle a(Context context) {
        Bundle a2 = cb.a(context);
        if (TextUtils.isEmpty(a2.getString("com.flurry.inmobi.MY_APP_ID"))) {
            Cdo.b(a, "The meta-data should include not empty value for com.flurry.inmobi.MY_APP_ID key in AndroidManifest.xml");
            return null;
        }
        return a2;
    }

    @Override // com.flurry.android.bk
    protected final az a(Context context, s sVar, dl dlVar, j jVar, Bundle bundle) {
        if (context == null || sVar == null || dlVar == null || jVar == null || bundle == null) {
            return null;
        }
        return new eg(context, sVar, dlVar, jVar, bundle);
    }

    @Override // com.flurry.android.bk
    protected final eb a(Context context, s sVar, dl dlVar, a aVar, Bundle bundle) {
        if (context == null || sVar == null || dlVar == null || aVar == null || bundle == null) {
            return null;
        }
        return new ay(context, sVar, dlVar, aVar, bundle);
    }
}
