package com.tsf.extend.base.p078h;

import android.content.SharedPreferences;
import com.tsf.extend.C1547h;
/* renamed from: com.tsf.extend.base.h.c */
/* loaded from: classes.dex */
public class C1415c {

    /* renamed from: a */
    private static C1415c f4393a;

    /* renamed from: b */
    private SharedPreferences f4394b = C1547h.m8290b().getApplicationContext().getSharedPreferences("cm_launcher_pref", 0);

    private C1415c() {
    }

    /* renamed from: a */
    public static C1415c m8737a() {
        synchronized (C1415c.class) {
            if (f4393a == null) {
                f4393a = new C1415c();
            }
        }
        return f4393a;
    }

    /* renamed from: a */
    public String m8730a(String str, String str2, String str3) {
        return this.f4394b.getString(str + "_" + str2, str3);
    }

    /* renamed from: a */
    public String m8734a(String str, String str2) {
        return m8730a("default", str, str2);
    }

    /* renamed from: b */
    public void m8722b(String str, String str2, String str3) {
        m8729a(str, str2, str3, false);
    }

    /* renamed from: a */
    public void m8729a(String str, String str2, String str3, boolean z) {
        if (str != null && str2 != null) {
            if (z) {
                this.f4394b.edit().putString(str + "_" + str2, str3).commit();
            } else {
                this.f4394b.edit().putString(str + "_" + str2, str3).apply();
            }
        }
    }

    /* renamed from: b */
    public void m8724b(String str, String str2) {
        m8722b("default", str, str2);
    }

    /* renamed from: a */
    public int m8733a(String str, String str2, int i) {
        return this.f4394b.getInt(str + "_" + str2, i);
    }

    /* renamed from: a */
    public int m8736a(String str, int i) {
        return m8733a("default", str, i);
    }

    /* renamed from: b */
    public void m8723b(String str, String str2, int i) {
        m8732a(str, str2, i, false);
    }

    /* renamed from: a */
    public void m8732a(String str, String str2, int i, boolean z) {
        if (str != null && str2 != null) {
            if (z) {
                this.f4394b.edit().putInt(str + "_" + str2, i).commit();
            } else {
                this.f4394b.edit().putInt(str + "_" + str2, i).apply();
            }
        }
    }

    /* renamed from: b */
    public void m8725b(String str, int i) {
        m8723b("default", str, i);
    }

    /* renamed from: a */
    public long m8731a(String str, String str2, long j) {
        return this.f4394b.getLong(str + "_" + str2, j);
    }

    /* renamed from: a */
    public long m8735a(String str, long j) {
        return m8731a("default", str, j);
    }

    /* renamed from: a */
    public boolean m8728a(String str, String str2, boolean z) {
        return this.f4394b.getBoolean(str + "_" + str2, z);
    }

    /* renamed from: a */
    public boolean m8726a(String str, boolean z) {
        return m8728a("default", str, z);
    }

    /* renamed from: b */
    public void m8721b(String str, String str2, boolean z) {
        m8727a(str, str2, z, false);
    }

    /* renamed from: a */
    public void m8727a(String str, String str2, boolean z, boolean z2) {
        if (str != null && str2 != null) {
            if (z2) {
                this.f4394b.edit().putBoolean(str + "_" + str2, z).commit();
            } else {
                this.f4394b.edit().putBoolean(str + "_" + str2, z).apply();
            }
        }
    }

    /* renamed from: b */
    public void m8720b(String str, boolean z) {
        m8721b("default", str, z);
    }
}
