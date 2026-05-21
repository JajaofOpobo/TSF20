package com.tsf.extend.base.h;

import android.content.SharedPreferences;
import com.tsf.extend.h;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class c {
    private static c a;
    private SharedPreferences b = h.b().getApplicationContext().getSharedPreferences("cm_launcher_pref", 0);

    private c() {
    }

    public static c a() {
        synchronized (c.class) {
            if (a == null) {
                a = new c();
            }
        }
        return a;
    }

    public String a(String str, String str2, String str3) {
        return this.b.getString(str + "_" + str2, str3);
    }

    public String a(String str, String str2) {
        return a("default", str, str2);
    }

    public void b(String str, String str2, String str3) {
        a(str, str2, str3, false);
    }

    public void a(String str, String str2, String str3, boolean z) {
        if (str != null && str2 != null) {
            if (z) {
                this.b.edit().putString(str + "_" + str2, str3).commit();
            } else {
                this.b.edit().putString(str + "_" + str2, str3).apply();
            }
        }
    }

    public void b(String str, String str2) {
        b("default", str, str2);
    }

    public int a(String str, String str2, int i) {
        return this.b.getInt(str + "_" + str2, i);
    }

    public int a(String str, int i) {
        return a("default", str, i);
    }

    public void b(String str, String str2, int i) {
        a(str, str2, i, false);
    }

    public void a(String str, String str2, int i, boolean z) {
        if (str != null && str2 != null) {
            if (z) {
                this.b.edit().putInt(str + "_" + str2, i).commit();
            } else {
                this.b.edit().putInt(str + "_" + str2, i).apply();
            }
        }
    }

    public void b(String str, int i) {
        b("default", str, i);
    }

    public long a(String str, String str2, long j) {
        return this.b.getLong(str + "_" + str2, j);
    }

    public long a(String str, long j) {
        return a("default", str, j);
    }

    public boolean a(String str, String str2, boolean z) {
        return this.b.getBoolean(str + "_" + str2, z);
    }

    public boolean a(String str, boolean z) {
        return a("default", str, z);
    }

    public void b(String str, String str2, boolean z) {
        a(str, str2, z, false);
    }

    public void a(String str, String str2, boolean z, boolean z2) {
        if (str != null && str2 != null) {
            if (z2) {
                this.b.edit().putBoolean(str + "_" + str2, z).commit();
            } else {
                this.b.edit().putBoolean(str + "_" + str2, z).apply();
            }
        }
    }

    public void b(String str, boolean z) {
        b("default", str, z);
    }
}
