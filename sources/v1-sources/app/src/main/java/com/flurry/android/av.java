package com.flurry.android;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.ads.AdRequest;
import com.google.ads.InterstitialAd;

/* loaded from: classes.dex */
final class av extends dy {
    private static final String b = av.class.getSimpleName();
    private final String c;
    private final String d;
    private final boolean e;
    private final InterstitialAd f;

    public av(Context context, s sVar, dl dlVar, j jVar, Bundle bundle) {
        super(context, sVar, dlVar, jVar);
        this.c = bundle.getString("com.flurry.admob.MY_AD_UNIT_ID");
        this.d = bundle.getString("com.flurry.admob.MYTEST_AD_DEVICE_ID");
        this.e = bundle.getBoolean("com.flurry.admob.test");
        this.f = new InterstitialAd((Activity) b(), this.c);
        this.f.setAdListener(new cu(this, (byte) 0));
    }

    @Override // com.flurry.android.az
    public final void a() {
        AdRequest adRequest = new AdRequest();
        if (this.e) {
            Log.d(b, "Admob AdView set to Test Mode.");
            adRequest.addTestDevice(AdRequest.TEST_EMULATOR);
            if (!TextUtils.isEmpty(this.d)) {
                adRequest.addTestDevice(this.d);
            }
        }
        this.f.loadAd(adRequest);
    }
}
