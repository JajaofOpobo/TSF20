package com.flurry.android;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.inmobi.androidsdk.IMAdInterstitial;
import com.inmobi.androidsdk.IMAdRequest;

/* loaded from: classes.dex */
class eg extends dy {
    private static final String b = eg.class.getSimpleName();
    private final String c;
    private final boolean d;

    public eg(Context context, s sVar, dl dlVar, j jVar, Bundle bundle) {
        super(context, sVar, dlVar, jVar);
        this.c = bundle.getString("com.flurry.inmobi.MY_APP_ID");
        this.d = bundle.getBoolean("com.flurry.inmobi.test");
    }

    @Override // com.flurry.android.az
    public final void a() {
        IMAdInterstitial iMAdInterstitial = new IMAdInterstitial((Activity) b(), this.c);
        iMAdInterstitial.setImAdInterstitialListener(new cn(this));
        IMAdRequest iMAdRequest = new IMAdRequest();
        if (this.d) {
            Log.d(b, "InMobi Interstitial set to Test Mode.");
            iMAdRequest.setTestMode(true);
        }
        iMAdInterstitial.loadNewAd(iMAdRequest);
    }
}
