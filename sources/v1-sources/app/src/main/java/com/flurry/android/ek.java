package com.flurry.android;

import android.content.Context;
import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
final class ek implements dw {
    private static final String a = ek.class.getSimpleName();
    private static final Map b;

    ek() {
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Admob".toUpperCase(Locale.US), new dn());
        hashMap.put("Millennial Media".toUpperCase(Locale.US), new cq());
        hashMap.put("InMobi".toUpperCase(Locale.US), new bl());
        hashMap.put("Mobclix".toUpperCase(Locale.US), new aw());
        hashMap.put("Jumptap".toUpperCase(Locale.US), new bq());
        b = Collections.unmodifiableMap(hashMap);
    }

    @Override // com.flurry.android.dw
    public final eb b(Context context, s sVar, dl dlVar, j jVar) {
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
        dw dwVar = (dw) b.get(obj.toUpperCase(Locale.US));
        if (dwVar == null) {
            Cdo.e(a, "Cannot create ad network view for type: " + obj);
            return null;
        }
        String str = "Creating ad network view for type: " + obj;
        eb b2 = dwVar.b(context, sVar, dlVar, jVar);
        if (b2 == null) {
            Cdo.b(a, "Cannot create ad network view for type: " + obj);
            return null;
        }
        if (b2 != null) {
            b2.c = jVar;
            return b2;
        }
        return b2;
    }
}
