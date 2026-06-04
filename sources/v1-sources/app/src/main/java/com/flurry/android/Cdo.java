package com.flurry.android;

import android.text.TextUtils;
import android.util.Log;

/* renamed from: com.flurry.android.do, reason: invalid class name */
/* loaded from: classes.dex */
final class Cdo {
    private static int a = 4000;
    private static boolean b = false;
    private static int c = 5;

    static void a(String str, String str2, Throwable th) {
        a(3, str, str2, th);
    }

    static void a(String str, String str2) {
        a(3, str, str2);
    }

    static void b(String str, String str2, Throwable th) {
        a(6, str, str2, th);
    }

    static void b(String str, String str2) {
        a(6, str, str2);
    }

    static void c(String str, String str2) {
        a(4, str, str2);
    }

    static void d(String str, String str2) {
        a(2, str, str2);
    }

    static void e(String str, String str2) {
        a(5, str, str2);
    }

    static void a(String str, Throwable th) {
        String str2 = str + '\n' + Log.getStackTraceString(th);
    }

    private static void a(int i, String str, String str2, Throwable th) {
        a(i, str, str2 + '\n' + Log.getStackTraceString(th));
    }

    private static void a(int i, String str, String str2) {
        if (!b && c <= i) {
            int length = TextUtils.isEmpty(str2) ? 0 : str2.length();
            int i2 = 0;
            while (i2 < length) {
                int i3 = a > length - i2 ? length : a + i2;
                if (Log.println(i, str, str2.substring(i2, i3)) <= 0) {
                    return;
                } else {
                    i2 = i3;
                }
            }
        }
    }
}
