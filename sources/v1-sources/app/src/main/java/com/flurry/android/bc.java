package com.flurry.android;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.millennialmedia.android.MMAdView;
import java.util.Hashtable;

/* loaded from: classes.dex */
final class bc extends dy {
    private static final String b = bc.class.getSimpleName();
    private boolean c;
    private final String d;

    public bc(Context context, s sVar, dl dlVar, j jVar, Bundle bundle) {
        super(context, sVar, dlVar, jVar);
        this.d = bundle.getString("com.flurry.millennial.MYAPID");
    }

    @Override // com.flurry.android.az
    public final void a() {
        MMAdView mMAdView = new MMAdView((Activity) b(), this.d, "MMFullScreenAdTransition", true, (Hashtable) null);
        mMAdView.setId(1897808290);
        mMAdView.setListener(new cp(this));
        mMAdView.fetch();
        this.c = mMAdView.display();
        if (this.c) {
            Log.d(b, "Millennial MMAdView Interstitial ad displayed immediately:" + System.currentTimeMillis() + " " + this.c);
        } else {
            Log.d(b, "Millennial MMAdView Interstitial ad did not display immediately:" + System.currentTimeMillis() + " " + this.c);
        }
    }
}
