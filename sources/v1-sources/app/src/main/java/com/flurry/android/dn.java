package com.flurry.android;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes.dex */
class dn extends bk {
    private static final String a = dn.class.getSimpleName();

    dn() {
    }

    @Override // com.flurry.android.bk
    protected final bg a() {
        return new bg("GoogleAdMobAdsSdk", "6.2.1", "com.google.ads.InterstitialAd");
    }

    @Override // com.flurry.android.bk
    protected final bg b() {
        return new bg("GoogleAdMobAdsSdk", "6.2.1", "com.google.ads.AdView");
    }

    @Override // com.flurry.android.bk
    protected final Bundle a(Context context) {
        Bundle a2 = cb.a(context);
        if (TextUtils.isEmpty(a2.getString("com.flurry.admob.MY_AD_UNIT_ID"))) {
            Cdo.b(a, "The meta-data should include not empty value for com.flurry.admob.MY_AD_UNIT_ID key in AndroidManifest.xml");
            return null;
        }
        return a2;
    }

    @Override // com.flurry.android.bk
    protected final az a(Context context, s sVar, dl dlVar, j jVar, Bundle bundle) {
        if (context == null || sVar == null || dlVar == null || jVar == null || bundle == null) {
            return null;
        }
        return new av(context, sVar, dlVar, jVar, bundle);
    }

    @Override // com.flurry.android.bk
    protected final eb a(Context context, s sVar, dl dlVar, a aVar, Bundle bundle) {
        if (context == null || sVar == null || dlVar == null || aVar == null || bundle == null) {
            return null;
        }
        return new at(context, sVar, dlVar, aVar, bundle);
    }
}
