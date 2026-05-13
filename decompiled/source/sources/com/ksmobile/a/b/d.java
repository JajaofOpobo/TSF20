package com.ksmobile.a.b;

import android.util.Log;
/* loaded from: classes.dex */
public class d {
    private static int a = 2;

    public static int a(String str, String str2) {
        if (a <= 3) {
            if (str2 == null) {
                str2 = "";
            }
            return Log.d("CMLTheme: " + str, str2);
        }
        return 0;
    }

    public static int a(String str, String str2, Object... objArr) {
        if (a <= 3) {
            return Log.d("CMLTheme: " + str, String.format(str2, objArr));
        }
        return 0;
    }
}
