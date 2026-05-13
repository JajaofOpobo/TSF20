package com.tsf.shell.plugin.themepicker.utils;

import android.os.Build;
/* loaded from: classes.dex */
public class h {
    public static boolean a() {
        return Build.VERSION.SDK_INT >= 8;
    }

    public static boolean b() {
        return Build.VERSION.SDK_INT >= 9;
    }

    public static boolean c() {
        return Build.VERSION.SDK_INT >= 11;
    }

    public static boolean d() {
        return Build.VERSION.SDK_INT >= 12;
    }

    public static boolean e() {
        return Build.VERSION.SDK_INT >= 16;
    }

    public static boolean f() {
        return Build.VERSION.SDK_INT >= 19;
    }
}
