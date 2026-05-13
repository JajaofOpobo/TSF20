package com.flurry.sdk;

import android.text.TextUtils;
import android.util.Log;
/* renamed from: com.flurry.sdk.eo */
/* loaded from: classes.dex */
public final class C1258eo {

    /* renamed from: a */
    private static int f4017a = 4000;

    /* renamed from: b */
    private static boolean f4018b = false;

    /* renamed from: c */
    private static int f4019c = 5;

    /* renamed from: d */
    private static boolean f4020d = false;

    /* renamed from: a */
    public static void m9236a() {
        f4018b = true;
    }

    /* renamed from: b */
    public static void m9229b() {
        f4018b = false;
    }

    /* renamed from: c */
    public static int m9224c() {
        return f4019c;
    }

    /* renamed from: d */
    public static boolean m9220d() {
        return f4020d;
    }

    /* renamed from: a */
    public static void m9235a(int i) {
        f4019c = i;
    }

    /* renamed from: a */
    public static void m9230a(boolean z) {
        f4020d = z;
    }

    /* renamed from: a */
    public static void m9232a(String str, String str2) {
        m9228b(3, str, str2);
    }

    /* renamed from: a */
    public static void m9231a(String str, String str2, Throwable th) {
        m9227b(6, str, str2, th);
    }

    /* renamed from: b */
    public static void m9226b(String str, String str2) {
        m9228b(6, str, str2);
    }

    /* renamed from: c */
    public static void m9221c(String str, String str2) {
        m9228b(2, str, str2);
    }

    /* renamed from: b */
    public static void m9225b(String str, String str2, Throwable th) {
        m9227b(5, str, str2, th);
    }

    /* renamed from: d */
    public static void m9218d(String str, String str2) {
        m9228b(5, str, str2);
    }

    /* renamed from: a */
    public static void m9233a(int i, String str, String str2, Throwable th) {
        m9222c(i, str, str2, th);
    }

    /* renamed from: a */
    public static void m9234a(int i, String str, String str2) {
        m9223c(i, str, str2);
    }

    /* renamed from: b */
    private static void m9227b(int i, String str, String str2, Throwable th) {
        m9228b(i, str, str2 + '\n' + Log.getStackTraceString(th));
    }

    /* renamed from: b */
    private static void m9228b(int i, String str, String str2) {
        if (!f4018b && f4019c <= i) {
            m9219d(i, str, str2);
        }
    }

    /* renamed from: c */
    private static void m9222c(int i, String str, String str2, Throwable th) {
        m9223c(i, str, str2 + '\n' + Log.getStackTraceString(th));
    }

    /* renamed from: c */
    private static void m9223c(int i, String str, String str2) {
        if (f4020d) {
            m9219d(i, str, str2);
        }
    }

    /* renamed from: d */
    private static void m9219d(int i, String str, String str2) {
        if (!f4020d) {
            str = "FlurryAgent";
        }
        int length = TextUtils.isEmpty(str2) ? 0 : str2.length();
        int i2 = 0;
        while (i2 < length) {
            int i3 = f4017a > length - i2 ? length : f4017a + i2;
            if (Log.println(i, str, str2.substring(i2, i3)) <= 0) {
                return;
            }
            i2 = i3;
        }
    }
}
