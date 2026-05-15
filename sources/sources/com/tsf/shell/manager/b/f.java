package com.tsf.shell.manager.b;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class f {
    private static SharedPreferences a;

    public static boolean a() {
        return f().getBoolean("startupError", false);
    }

    public static void a(boolean z) {
        SharedPreferences.Editor editorE = e();
        editorE.putBoolean("startupError", z);
        editorE.commit();
    }

    public static int b() {
        return f().getInt("startupErrorTimes", 0);
    }

    public static void a(int i) {
        SharedPreferences.Editor editorE = e();
        editorE.putInt("startupErrorTimes", i);
        editorE.commit();
    }

    public static void c() {
        SharedPreferences.Editor editorE = e();
        editorE.putBoolean("startupError", false);
        editorE.putInt("startupErrorTimes", 0);
        editorE.commit();
    }

    public static void b(boolean z) {
        SharedPreferences.Editor editorE = e();
        editorE.putBoolean("backup_reset_theme_state", z);
        editorE.commit();
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
