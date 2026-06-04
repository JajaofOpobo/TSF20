package com.flurry.android;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.jumptap.adtag.JtAdView;
import com.jumptap.adtag.JtAdWidgetSettings;
import com.jumptap.adtag.JtAdWidgetSettingsFactory;
import com.jumptap.adtag.utils.JtException;

/* loaded from: classes.dex */
class dq extends c {
    private static final String e = dq.class.getSimpleName();
    private final String f;

    dq(Context context, s sVar, dl dlVar, a aVar, Bundle bundle) {
        super(context, sVar, dlVar, aVar);
        this.f = bundle.getString("com.flurry.jumptap.PUBLISHER_ID");
        setFocusable(true);
    }

    @Override // com.flurry.android.eb
    public final void a(Context context) {
        JtAdView jtAdView;
        JtAdWidgetSettings createWidgetSettings = JtAdWidgetSettingsFactory.createWidgetSettings();
        createWidgetSettings.setPublisherId(this.f);
        createWidgetSettings.setRefreshPeriod(0);
        createWidgetSettings.setShouldSendLocation(false);
        setGravity(17);
        try {
            jtAdView = new JtAdView((Activity) context, createWidgetSettings);
        } catch (JtException e2) {
            Log.d(e, "Jumptap JtException when creating ad object.");
            jtAdView = null;
        }
        jtAdView.setAdViewListener(new al(this));
        addView(jtAdView);
    }
}
