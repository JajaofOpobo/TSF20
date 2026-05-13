package com.flurry.sdk;

import android.os.Build;
import android.text.TextUtils;
/* loaded from: classes.dex */
public final class eq extends es {
    private final int a;

    public eq(String str, int i) {
        super(a(str, i));
        this.a = i;
    }

    private static et a(String str, int i) {
        if (!b(str, i)) {
            return null;
        }
        return er.a(str);
    }

    private static boolean b(String str, int i) {
        return !TextUtils.isEmpty(str) && Build.VERSION.SDK_INT >= i;
    }
}
