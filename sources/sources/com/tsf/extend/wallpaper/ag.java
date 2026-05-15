package com.tsf.extend.wallpaper;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ag {
    private static ag a = null;
    private SharedPreferences b = com.tsf.extend.h.b().getApplicationContext().getSharedPreferences("personalization_shard", 0);

    private ag() {
    }

    public static synchronized ag a() {
        if (a == null) {
            a = new ag();
        }
        return a;
    }

    public void a(String str) {
        this.b.edit().putString("name", str).apply();
    }

    public String b() {
        return this.b.getString("name", null);
    }

    public void c() {
        this.b.edit().putBoolean("upload_wallpaper", true).apply();
    }

    public boolean d() {
        return this.b.getBoolean("upload_wallpaper", false);
    }

    public void b(String str) {
        this.b.edit().putString("key_upload_email", str).apply();
    }

    public String e() {
        return this.b.getString("key_upload_email", null);
    }

    public boolean f() {
        return this.b.getBoolean("is_first_open_theme_center", true);
    }

    public void a(boolean z) {
        this.b.edit().putBoolean("is_first_open_theme_center", z).apply();
    }

    public int g() {
        return this.b.getInt("search_tag_showing_index", -1);
    }

    public void a(int i) {
        this.b.edit().putInt("search_tag_showing_index", i).apply();
    }
}
