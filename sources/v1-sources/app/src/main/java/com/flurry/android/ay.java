package com.flurry.android;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.widget.LinearLayout;
import com.inmobi.androidsdk.IMAdRequest;
import com.inmobi.androidsdk.IMAdView;

/* loaded from: classes.dex */
final class ay extends c {
    private static final String e = ay.class.getSimpleName();
    private final String f;
    private final boolean g;

    ay(Context context, s sVar, dl dlVar, a aVar, Bundle bundle) {
        super(context, sVar, dlVar, aVar);
        this.f = bundle.getString("com.flurry.inmobi.MY_APP_ID");
        this.g = bundle.getBoolean("com.flurry.inmobi.test");
        setFocusable(true);
    }

    @Override // com.flurry.android.eb
    public final void a(Context context) {
        int i;
        int i2 = 320;
        int i3 = 50;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i4 = (int) (displayMetrics.heightPixels / displayMetrics.density);
        int i5 = (int) (displayMetrics.widthPixels / displayMetrics.density);
        if (i5 >= 728 && i4 >= 90) {
            Log.d(e, "Determined InMobi AdSize as 728x90");
            i = 11;
        } else if (i5 >= 468 && i4 >= 60) {
            Log.d(e, "Determined InMobi AdSize as 468x60");
            i = 12;
        } else if (i5 >= 320 && i4 >= 50) {
            Log.d(e, "Determined InMobi AdSize as 320x50");
            i = 15;
        } else if (i5 >= 300 && i4 >= 250) {
            Log.d(e, "Determined InMobi AdSize as 300x250");
            i = 10;
        } else if (i5 < 120 || i4 < 600) {
            Log.d(e, "Could not find InMobi AdSize that matches size");
            i = -1;
        } else {
            Log.d(e, "Determined InMobi AdSize as 120x600");
            i = 13;
        }
        if (i != -1) {
            IMAdView iMAdView = new IMAdView((Activity) context, i, this.f);
            if (i == 15) {
            }
            if (i == 11) {
                i2 = 728;
                i3 = 90;
            }
            if (i == 12) {
                i2 = 468;
                i3 = 60;
            }
            if (i == 10) {
                i2 = 300;
                i3 = 250;
            }
            if (i == 13) {
                i2 = 120;
                i3 = 600;
            }
            float f = getResources().getDisplayMetrics().density;
            iMAdView.setLayoutParams(new LinearLayout.LayoutParams((int) ((i2 * f) + 0.5f), (int) ((i3 * f) + 0.5f)));
            iMAdView.setIMAdListener(new bd(this));
            setGravity(17);
            addView(iMAdView);
            IMAdRequest iMAdRequest = new IMAdRequest();
            if (this.g) {
                Log.d(e, "InMobi AdView set to Test Mode.");
                iMAdRequest.setTestMode(true);
            }
            iMAdView.setIMAdRequest(iMAdRequest);
            iMAdView.setRefreshInterval(-1);
            iMAdView.loadNewAd();
            return;
        }
        Log.d(e, "**********Could not load InMobi Ad");
    }
}
