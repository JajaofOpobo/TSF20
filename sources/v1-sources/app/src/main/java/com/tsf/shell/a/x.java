package com.tsf.shell.a;

import android.content.SharedPreferences;

/* loaded from: classes.dex */
public final class x {
    private static SharedPreferences a;

    public static int a() {
        return d().getInt("setting_effect_version_code", 0);
    }

    public static int b() {
        return d().getInt("setting_theme_version_code", 0);
    }

    public static SharedPreferences.Editor c() {
        return d().edit();
    }

    private static SharedPreferences d() {
        if (a == null) {
            a = com.censivn.C3DEngine.a.c().getSharedPreferences("temporary_config", 0);
        }
        return a;
    }
}
