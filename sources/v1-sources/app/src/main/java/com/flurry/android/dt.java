package com.flurry.android;

import android.content.Context;
import android.util.Log;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class dt implements cc {
    private static String a = dt.class.getSimpleName();
    private static final Map b;

    dt() {
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("FLURRY", new bm((byte) 0));
        hashMap.put("THIRD_PARTY", new cd());
        b = Collections.unmodifiableMap(hashMap);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004f  */
    @Override // com.flurry.android.cc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final az a(Context context, s sVar, dl dlVar, j jVar) {
        String str;
        if (context == null || sVar == null || dlVar == null || jVar == null) {
            return null;
        }
        if (jVar != null) {
            List d = jVar.d();
            if (d == null || d.isEmpty()) {
                str = null;
            } else {
                b bVar = (b) d.get(0);
                if (bVar != null) {
                    int intValue = bVar.b().intValue();
                    if (jVar.e().intValue() == 1 || intValue == 2 || intValue == 1 || intValue == 3) {
                        str = "FLURRY";
                    } else if (intValue == 4) {
                        str = "THIRD_PARTY";
                    }
                }
            }
            if (str != null) {
                return null;
            }
            cc ccVar = (cc) b.get(str);
            if (ccVar == null) {
                Log.w(a, "Cannot create ad takeover for type: " + str);
                return null;
            }
            String str2 = "Creating ad takeover for type: " + str;
            return ccVar.a(context, sVar, dlVar, jVar);
        }
        str = null;
        if (str != null) {
        }
    }
}
