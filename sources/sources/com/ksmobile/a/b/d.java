package com.ksmobile.a.b;

import android.util.Log;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class d {
    private static int a = 2;

    public static int a(String str, String str2) {
        if (a > 3) {
            return 0;
        }
        if (str2 == null) {
            str2 = "";
        }
        return Log.d("CMLTheme: " + str, str2);
    }

    public static int a(String str, String str2, Object... objArr) {
        if (a > 3) {
            return 0;
        }
        return Log.d("CMLTheme: " + str, String.format(str2, objArr));
    }
}
