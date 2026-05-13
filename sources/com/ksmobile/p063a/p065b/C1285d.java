package com.ksmobile.p063a.p065b;

import android.util.Log;
/* renamed from: com.ksmobile.a.b.d */
/* loaded from: classes.dex */
public class C1285d {

    /* renamed from: a */
    private static int f4069a = 2;

    /* renamed from: a */
    public static int m9120a(String str, String str2) {
        if (f4069a <= 3) {
            if (str2 == null) {
                str2 = "";
            }
            return Log.d("CMLTheme: " + str, str2);
        }
        return 0;
    }

    /* renamed from: a */
    public static int m9119a(String str, String str2, Object... objArr) {
        if (f4069a <= 3) {
            return Log.d("CMLTheme: " + str, String.format(str2, objArr));
        }
        return 0;
    }
}
