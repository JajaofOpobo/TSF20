package com.tsf.shell.a;

import android.content.SharedPreferences;

/* loaded from: classes.dex */
public final class y {
    private static SharedPreferences a;

    public static void a(z zVar) {
        SharedPreferences.Editor edit = b().edit();
        edit.putString("theme_package", zVar.a);
        edit.putBoolean("theme_resetwallpaper", zVar.b);
        edit.putString("icon_upon_package", zVar.i);
        edit.putString("icon_upon_file", zVar.j);
        edit.putString("icon_back_package", zVar.k);
        edit.putString("icon_back_file", zVar.l);
        edit.putFloat("icon_scale", zVar.m);
        edit.putString("theme_mix_icon_package", zVar.c);
        edit.putString("theme_mix_contact_package", zVar.d);
        edit.putString("theme_mix_folder_package", zVar.e);
        edit.putString("theme_mix_menu_package", zVar.f);
        edit.putString("theme_mix_dock_package", zVar.g);
        edit.putString("theme_mix_page_package", zVar.h);
        edit.commit();
    }

    public static z a() {
        z zVar = new z();
        zVar.a = b().getString("theme_package", "");
        zVar.b = b().getBoolean("theme_resetwallpaper", true);
        zVar.i = b().getString("icon_upon_package", "");
        zVar.j = b().getString("icon_upon_file", "");
        zVar.k = b().getString("icon_back_package", "");
        zVar.l = b().getString("icon_back_file", "");
        zVar.m = b().getFloat("icon_scale", 1.0f);
        zVar.c = b().getString("theme_mix_icon_package", "");
        zVar.d = b().getString("theme_mix_contact_package", "");
        zVar.e = b().getString("theme_mix_folder_package", "");
        zVar.f = b().getString("theme_mix_menu_package", "");
        zVar.g = b().getString("theme_mix_dock_package", "");
        zVar.h = b().getString("theme_mix_page_package", "");
        return zVar;
    }

    private static SharedPreferences b() {
        if (a == null) {
            a = com.censivn.C3DEngine.a.c().getSharedPreferences("config", 0);
        }
        return a;
    }
}
