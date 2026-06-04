package com.flurry.android;

import android.content.Context;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes.dex */
final class dk implements cc {
    private static final cc a;

    dk() {
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Admob".toUpperCase(Locale.US), new dn());
        hashMap.put("Millennial Media".toUpperCase(Locale.US), new cq());
        hashMap.put("InMobi".toUpperCase(Locale.US), new bl());
        hashMap.put("Mobclix".toUpperCase(Locale.US), new aw());
        hashMap.put("Jumptap".toUpperCase(Locale.US), new bq());
        a = new bn(Collections.unmodifiableMap(hashMap));
    }

    @Override // com.flurry.android.cc
    public final az a(Context context, s sVar, dl dlVar, j jVar) {
        return a.a(context, sVar, dlVar, jVar);
    }
}
