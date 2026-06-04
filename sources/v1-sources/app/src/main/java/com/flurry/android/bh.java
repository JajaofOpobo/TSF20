package com.flurry.android;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.widget.LinearLayout;
import com.mobclix.android.sdk.MobclixIABRectangleMAdView;
import com.mobclix.android.sdk.MobclixMMABannerXLAdView;

/* loaded from: classes.dex */
class bh extends c {
    private static final String e = bh.class.getSimpleName();

    bh(Context context, s sVar, dl dlVar, a aVar) {
        super(context, sVar, dlVar, aVar);
        setFocusable(true);
    }

    @Override // com.flurry.android.eb
    public final void a(Context context) {
        MobclixMMABannerXLAdView mobclixMMABannerXLAdView;
        int i;
        int i2 = 320;
        int a = a().a();
        int b = a().b();
        if (b >= 320 && a >= 50) {
            Log.d(e, "Determined Mobclix AdSize as BANNER");
            mobclixMMABannerXLAdView = new MobclixMMABannerXLAdView((Activity) context);
        } else if (b < 300 || a < 250) {
            Log.d(e, "Could not find Mobclix AdSize that matches size");
            mobclixMMABannerXLAdView = null;
        } else {
            Log.d(e, "Determined Mobclix AdSize as IAB_RECT");
            mobclixMMABannerXLAdView = new MobclixIABRectangleMAdView((Activity) context);
        }
        mobclixMMABannerXLAdView.addMobclixAdViewListener(new bv(this));
        if (mobclixMMABannerXLAdView instanceof MobclixMMABannerXLAdView) {
        }
        if (mobclixMMABannerXLAdView instanceof MobclixIABRectangleMAdView) {
            i = 250;
        } else {
            i2 = 300;
            i = 50;
        }
        float f = getResources().getDisplayMetrics().density;
        mobclixMMABannerXLAdView.setLayoutParams(new LinearLayout.LayoutParams((int) ((i2 * f) + 0.5f), (int) ((i * f) + 0.5f)));
        setGravity(17);
        addView(mobclixMMABannerXLAdView);
        mobclixMMABannerXLAdView.setRefreshTime(-1L);
    }
}
