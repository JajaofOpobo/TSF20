package com.flurry.android;

import android.content.Context;
import android.text.TextUtils;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
final class bn implements cc {
    private static final String a = bn.class.getSimpleName();
    private final Map b;

    public bn(Map map) {
        this.b = map;
    }

    @Override // com.flurry.android.cc
    public final az a(Context context, s sVar, dl dlVar, j jVar) {
        if (context == null || sVar == null || dlVar == null || jVar == null) {
            return null;
        }
        List d = jVar.d();
        if (d == null || d.isEmpty()) {
            return null;
        }
        b bVar = (b) d.get(0);
        if (bVar == null) {
            return null;
        }
        String obj = bVar.d().toString();
        if (TextUtils.isEmpty(obj)) {
            return null;
        }
        cc ccVar = this.b != null ? (cc) this.b.get(obj.toUpperCase(Locale.US)) : null;
        if (ccVar == null) {
            return null;
        }
        String str = "Creating ad network takeover launcher: " + ccVar.getClass().getSimpleName() + " for type: " + obj;
        az a2 = ccVar.a(context, sVar, dlVar, jVar);
        if (a2 == null) {
            Cdo.b(a, "Cannot create ad network takeover launcher for type: " + obj);
            return a2;
        }
        return a2;
    }
}
