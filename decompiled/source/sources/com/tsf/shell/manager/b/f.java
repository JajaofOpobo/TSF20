package com.tsf.shell.manager.b;

import android.content.SharedPreferences;
/* loaded from: classes.dex */
public class f {
    private static SharedPreferences a;

    public static boolean a() {
        return f().getBoolean("startupError", false);
    }

    public static void a(boolean z) {
        SharedPreferences.Editor e = e();
        e.putBoolean("startupError", z);
        e.commit();
    }

    public static int b() {
        return f().getInt("startupErrorTimes", 0);
    }

    public static void a(int i) {
        SharedPreferences.Editor e = e();
        e.putInt("startupErrorTimes", i);
        e.commit();
    }

    public static void c() {
        SharedPreferences.Editor e = e();
        e.putBoolean("startupError", false);
        e.putInt("startupErrorTimes", 0);
        e.commit();
    }

    public static void b(boolean z) {
        SharedPreferences.Editor e = e();
        e.putBoolean("backup_reset_theme_state", z);
        e.commit();
    }

    public static boolean d() {
        return f().getBoolean("backup_reset_theme_state", false);
    }

    public static SharedPreferences.Editor e() {
        return f().edit();
    }

    public static SharedPreferences f() {
        if (a == null) {
            a = com.censivn.C3DEngine.a.d().getSharedPreferences("temp", 0);
        }
        return a;
    }
}
