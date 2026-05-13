package com.tsf.shell.manager.p168b;

import android.content.SharedPreferences;
import com.censivn.C3DEngine.C0853a;
/* renamed from: com.tsf.shell.manager.b.f */
/* loaded from: classes.dex */
public class C3432f {

    /* renamed from: a */
    private static SharedPreferences f11359a;

    /* renamed from: a */
    public static boolean m2405a() {
        return m2397f().getBoolean("startupError", false);
    }

    /* renamed from: a */
    public static void m2403a(boolean z) {
        SharedPreferences.Editor m2398e = m2398e();
        m2398e.putBoolean("startupError", z);
        m2398e.commit();
    }

    /* renamed from: b */
    public static int m2402b() {
        return m2397f().getInt("startupErrorTimes", 0);
    }

    /* renamed from: a */
    public static void m2404a(int i) {
        SharedPreferences.Editor m2398e = m2398e();
        m2398e.putInt("startupErrorTimes", i);
        m2398e.commit();
    }

    /* renamed from: c */
    public static void m2400c() {
        SharedPreferences.Editor m2398e = m2398e();
        m2398e.putBoolean("startupError", false);
        m2398e.putInt("startupErrorTimes", 0);
        m2398e.commit();
    }

    /* renamed from: b */
    public static void m2401b(boolean z) {
        SharedPreferences.Editor m2398e = m2398e();
        m2398e.putBoolean("backup_reset_theme_state", z);
        m2398e.commit();
    }

    /* renamed from: d */
    public static boolean m2399d() {
        return m2397f().getBoolean("backup_reset_theme_state", false);
    }

    /* renamed from: e */
    public static SharedPreferences.Editor m2398e() {
        return m2397f().edit();
    }

    /* renamed from: f */
    public static SharedPreferences m2397f() {
        if (f11359a == null) {
            f11359a = C0853a.m10856d().getSharedPreferences("temp", 0);
        }
        return f11359a;
    }
}
