package com.tsf.extend.wallpaper;

import android.content.SharedPreferences;
import com.tsf.extend.C1547h;
/* renamed from: com.tsf.extend.wallpaper.ag */
/* loaded from: classes.dex */
public class C2055ag {

    /* renamed from: a */
    private static C2055ag f6708a = null;

    /* renamed from: b */
    private SharedPreferences f6709b = C1547h.m8290b().getApplicationContext().getSharedPreferences("personalization_shard", 0);

    private C2055ag() {
    }

    /* renamed from: a */
    public static synchronized C2055ag m6572a() {
        C2055ag c2055ag;
        synchronized (C2055ag.class) {
            if (f6708a == null) {
                f6708a = new C2055ag();
            }
            c2055ag = f6708a;
        }
        return c2055ag;
    }

    /* renamed from: a */
    public void m6570a(String str) {
        this.f6709b.edit().putString("name", str).apply();
    }

    /* renamed from: b */
    public String m6568b() {
        return this.f6709b.getString("name", null);
    }

    /* renamed from: c */
    public void m6566c() {
        this.f6709b.edit().putBoolean("upload_wallpaper", true).apply();
    }

    /* renamed from: d */
    public boolean m6565d() {
        return this.f6709b.getBoolean("upload_wallpaper", false);
    }

    /* renamed from: b */
    public void m6567b(String str) {
        this.f6709b.edit().putString("key_upload_email", str).apply();
    }

    /* renamed from: e */
    public String m6564e() {
        return this.f6709b.getString("key_upload_email", null);
    }

    /* renamed from: f */
    public boolean m6563f() {
        return this.f6709b.getBoolean("is_first_open_theme_center", true);
    }

    /* renamed from: a */
    public void m6569a(boolean z) {
        this.f6709b.edit().putBoolean("is_first_open_theme_center", z).apply();
    }

    /* renamed from: g */
    public int m6562g() {
        return this.f6709b.getInt("search_tag_showing_index", -1);
    }

    /* renamed from: a */
    public void m6571a(int i) {
        this.f6709b.edit().putInt("search_tag_showing_index", i).apply();
    }
}
