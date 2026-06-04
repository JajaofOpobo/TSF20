package com.flurry.android;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes.dex */
final class aw extends bk {
    private static final String a = bq.class.getSimpleName();

    aw() {
    }

    @Override // com.flurry.android.bk
    protected final bg a() {
        return new bg("mobclix", "3.2.0", "com.mobclix.android.sdk.MobclixFullScreenAdView");
    }

    @Override // com.flurry.android.bk
    protected final bg b() {
        return new bg("mobclix", "3.2.0", "com.mobclix.android.sdk.MobclixAdView");
    }

    @Override // com.flurry.android.bk
    protected final Bundle a(Context context) {
        Bundle a2 = cb.a(context);
        if (TextUtils.isEmpty(a2.getString("com.mobclix.APPLICATION_ID"))) {
            Cdo.b(a, "The meta-data should include not empty value for com.mobclix.APPLICATION_ID key in AndroidManifest.xml");
            return null;
        }
        return a2;
    }

    @Override // com.flurry.android.bk
    protected final az a(Context context, s sVar, dl dlVar, j jVar, Bundle bundle) {
        if (context == null || sVar == null || dlVar == null || jVar == null || bundle == null) {
            return null;
        }
        return new ct(context, sVar, dlVar, jVar);
    }

    @Override // com.flurry.android.bk
    protected final eb a(Context context, s sVar, dl dlVar, a aVar, Bundle bundle) {
        if (context == null || sVar == null || dlVar == null || aVar == null || bundle == null) {
            return null;
        }
        return new bh(context, sVar, dlVar, aVar);
    }
}
