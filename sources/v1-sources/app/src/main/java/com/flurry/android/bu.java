package com.flurry.android;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.millennialmedia.android.MMAdView;

/* loaded from: classes.dex */
final class bu extends c {
    private static final String e = bu.class.getSimpleName();
    private final String f;

    bu(Context context, s sVar, dl dlVar, a aVar, Bundle bundle) {
        super(context, sVar, dlVar, aVar);
        this.f = bundle.getString("com.flurry.millennial.MYAPID");
        setFocusable(true);
    }

    @Override // com.flurry.android.eb
    public final void a(Context context) {
        String str;
        int a = a().a();
        int b = a().b();
        if (b >= 320 && a >= 50) {
            Log.d(e, "Determined Millennial AdSize as MMBannerAdBottom");
            str = "MMBannerAdBottom";
        } else if (b < 300 || a < 250) {
            Log.d(e, "Could not find Millennial AdSize that matches size");
            str = null;
        } else {
            Log.d(e, "Determined Millennial AdSize as MMBannerAdRectangle");
            str = "MMBannerAdRectangle";
        }
        if (str != null) {
            MMAdView mMAdView = new MMAdView((Activity) context, this.f, str, 0);
            mMAdView.setId(1897808289);
            mMAdView.setHorizontalScrollBarEnabled(false);
            mMAdView.setVerticalScrollBarEnabled(false);
            setGravity(17);
            mMAdView.setListener(new bs(this));
            addView(mMAdView);
            return;
        }
        Log.d(e, "**********Could not load Millennial Ad");
    }
}
