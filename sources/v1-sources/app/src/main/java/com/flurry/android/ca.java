package com.flurry.android;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.jumptap.adtag.JtAdInterstitial;
import com.jumptap.adtag.JtAdWidgetSettings;
import com.jumptap.adtag.JtAdWidgetSettingsFactory;
import com.jumptap.adtag.utils.JtException;

/* loaded from: classes.dex */
final class ca extends dy {
    private static final String b = ca.class.getSimpleName();
    private final String c;

    public ca(Context context, s sVar, dl dlVar, j jVar, Bundle bundle) {
        super(context, sVar, dlVar, jVar);
        this.c = bundle.getString("com.flurry.jumptap.PUBLISHER_ID");
    }

    @Override // com.flurry.android.az
    public final void a() {
        JtAdInterstitial jtAdInterstitial;
        JtAdWidgetSettings createWidgetSettings = JtAdWidgetSettingsFactory.createWidgetSettings();
        createWidgetSettings.setPublisherId(this.c);
        createWidgetSettings.setRefreshPeriod(0);
        createWidgetSettings.setShouldSendLocation(false);
        try {
            jtAdInterstitial = new JtAdInterstitial((Activity) b(), createWidgetSettings);
        } catch (JtException e) {
            Log.d(b, "Jumptap JtException when creating ad object.");
            jtAdInterstitial = null;
        }
        jtAdInterstitial.setAdViewListener(new as(this));
        jtAdInterstitial.showAsPopup();
    }
}
