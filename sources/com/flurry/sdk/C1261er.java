package com.flurry.sdk;

import android.text.TextUtils;
/* renamed from: com.flurry.sdk.er */
/* loaded from: classes.dex */
public final class C1261er {

    /* renamed from: a */
    private static final String f4024a = C1261er.class.getSimpleName();

    /* renamed from: a */
    public static InterfaceC1263et m9213a(String str) {
        InterfaceC1263et interfaceC1263et;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            interfaceC1263et = (InterfaceC1263et) Class.forName(str).getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception e) {
            C1258eo.m9233a(5, f4024a, "FlurryModule " + str + " is not available:", e);
            interfaceC1263et = null;
        }
        return interfaceC1263et;
    }
}
