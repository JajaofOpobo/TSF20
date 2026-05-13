package com.flurry.sdk;

import android.os.Build;
import android.text.TextUtils;
/* renamed from: com.flurry.sdk.eq */
/* loaded from: classes.dex */
public final class C1260eq extends C1262es {

    /* renamed from: a */
    private final int f4023a;

    public C1260eq(String str, int i) {
        super(m9215a(str, i));
        this.f4023a = i;
    }

    /* renamed from: a */
    private static InterfaceC1263et m9215a(String str, int i) {
        if (!m9214b(str, i)) {
            return null;
        }
        return C1261er.m9213a(str);
    }

    /* renamed from: b */
    private static boolean m9214b(String str, int i) {
        return !TextUtils.isEmpty(str) && Build.VERSION.SDK_INT >= i;
    }
}
