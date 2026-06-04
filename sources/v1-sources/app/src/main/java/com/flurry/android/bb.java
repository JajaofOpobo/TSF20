package com.flurry.android;

import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
final class bb extends az {
    public bb(Context context, s sVar, dl dlVar, j jVar) {
        super(context, sVar, dlVar, jVar);
    }

    @Override // com.flurry.android.az
    public final void a() {
        Intent intent = new Intent(b(), (Class<?>) FlurryFullscreenTakeoverActivity.class);
        c();
        if (!s.a(b(), intent, d().b().toString())) {
            Cdo.b(a, "Unable to launch FlurryFullscreenTakeoverActivity. Fix by declaring this Activity in your AndroidManifest.xml");
        }
    }
}
