package com.ksmobile.launcher.a.a;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.os.Build;
import com.ksmobile.launcher.cmbase.utils.e;
import com.tsf.shell.ShellApplication;
import java.util.Date;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class a {
    private static final SharedPreferences a = ShellApplication.a().getSharedPreferences("tsf_infoc_setting_pref", 0);

    public static void a() {
        a(false, "1");
    }

    public static void a(boolean z) {
        a(!z, "2");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(long j, long j2) {
        return 0 != j2 && j2 <= j && j - j2 < 3600000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long d() {
        return new Date().getTime();
    }

    private static void a(final boolean z, final String str) {
        e.a(2, new Runnable() { // from class: com.ksmobile.launcher.a.a.a.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    a(z, str);
                } catch (Exception e) {
                }
            }

            private void a(boolean z2, String str2) {
                long jD = a.d();
                if (!z2 || !a.b(jD, a.b())) {
                    b.a(str2);
                    if (z2) {
                        a.a(jD);
                    }
                }
            }
        });
    }

    @SuppressLint({"NewApi"})
    private static void a(String str, long j) {
        if (Build.VERSION.SDK_INT >= 9) {
            a.edit().putLong(str, j).apply();
        } else {
            a.edit().putLong(str, j).commit();
        }
    }

    private static long b(String str, long j) {
        return a.getLong(str, j);
    }

    public static long b() {
        try {
            return b("report_active_timestamp", 0L);
        } catch (Exception e) {
            a.edit().remove("report_active_timestamp");
            return 0L;
        }
    }

    public static void a(long j) {
        a("report_active_timestamp", j);
    }
}
