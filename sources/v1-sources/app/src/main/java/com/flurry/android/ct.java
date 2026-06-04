package com.flurry.android;

import android.app.Activity;
import android.content.Context;
import com.mobclix.android.sdk.MobclixFullScreenAdView;

/* loaded from: classes.dex */
final class ct extends dy {
    private static final String b = ct.class.getSimpleName();

    public ct(Context context, s sVar, dl dlVar, j jVar) {
        super(context, sVar, dlVar, jVar);
    }

    @Override // com.flurry.android.az
    public final void a() {
        MobclixFullScreenAdView mobclixFullScreenAdView = new MobclixFullScreenAdView((Activity) b());
        mobclixFullScreenAdView.addMobclixAdViewListener(new bf(this));
        mobclixFullScreenAdView.requestAndDisplayAd();
    }
}
