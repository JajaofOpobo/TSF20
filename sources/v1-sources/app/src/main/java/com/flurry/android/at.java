package com.flurry.android;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.google.ads.AdRequest;
import com.google.ads.AdSize;
import com.google.ads.AdView;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
final class at extends c {
    private static final String e = at.class.getSimpleName();
    private static final int f = AdSize.BANNER.getWidth();
    private static final Map g;
    private final String h;
    private final String i;
    private final boolean j;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(new AdSize(f, AdSize.IAB_LEADERBOARD.getHeight()), AdSize.IAB_LEADERBOARD);
        hashMap.put(new AdSize(f, AdSize.IAB_BANNER.getHeight()), AdSize.IAB_BANNER);
        hashMap.put(new AdSize(f, AdSize.BANNER.getHeight()), AdSize.BANNER);
        hashMap.put(new AdSize(f, AdSize.IAB_MRECT.getHeight()), AdSize.IAB_MRECT);
        g = Collections.unmodifiableMap(hashMap);
    }

    public at(Context context, s sVar, dl dlVar, a aVar, Bundle bundle) {
        super(context, sVar, dlVar, aVar);
        this.h = bundle.getString("com.flurry.admob.MY_AD_UNIT_ID");
        this.i = bundle.getString("com.flurry.admob.MYTEST_AD_DEVICE_ID");
        this.j = bundle.getBoolean("com.flurry.admob.test");
        setFocusable(true);
    }

    @Override // com.flurry.android.eb
    public final void a(Context context) {
        AdSize adSize;
        int b = a().b();
        int a = a().a();
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i = (int) (displayMetrics.heightPixels / displayMetrics.density);
        int i2 = (int) (displayMetrics.widthPixels / displayMetrics.density);
        if (b > 0 && b <= i2) {
            i2 = b;
        }
        if (a > 0 && a <= i) {
            i = a;
        }
        AdSize findBestSize = new AdSize(i2, i).findBestSize(new AdSize[]{AdSize.IAB_LEADERBOARD, AdSize.IAB_BANNER, AdSize.BANNER, AdSize.IAB_MRECT});
        if (findBestSize == null && b == 0 && a != 0) {
            findBestSize = a(a);
        }
        if (findBestSize == null) {
            Cdo.b(e, "Could not find Admob AdSize that matches {width = " + b + ", height " + a + "}");
            adSize = a(a);
        } else {
            adSize = findBestSize;
        }
        Cdo.a(e, "Determined Admob AdSize as " + adSize + " that best matches {width = " + b + ", height = " + a + "}");
        AdView adView = new AdView((Activity) context, adSize, this.h);
        adView.setAdListener(new ap(this, (byte) 0));
        setGravity(17);
        addView((View) adView, (ViewGroup.LayoutParams) new RelativeLayout.LayoutParams(adSize.getWidthInPixels(context), adSize.getHeightInPixels(context)));
        AdRequest adRequest = new AdRequest();
        if (this.j) {
            Cdo.a(e, "Admob AdView set to Test Mode.");
            adRequest.addTestDevice(AdRequest.TEST_EMULATOR);
            if (!TextUtils.isEmpty(this.i)) {
                adRequest.addTestDevice(this.i);
            }
        }
        adView.loadAd(adRequest);
    }

    private static AdSize a(int i) {
        Set keySet = g.keySet();
        return (AdSize) g.get(new AdSize(f, i).findBestSize((AdSize[]) keySet.toArray(new AdSize[keySet.size()])));
    }
}
