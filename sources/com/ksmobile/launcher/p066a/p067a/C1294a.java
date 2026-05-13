package com.ksmobile.launcher.p066a.p067a;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.os.Build;
import com.ksmobile.launcher.cmbase.utils.C1304e;
import com.tsf.shell.ShellApplication;
import java.util.Date;
/* renamed from: com.ksmobile.launcher.a.a.a */
/* loaded from: classes.dex */
public class C1294a {

    /* renamed from: a */
    private static final SharedPreferences f4089a = ShellApplication.m6152a().getSharedPreferences("tsf_infoc_setting_pref", 0);

    /* renamed from: c */
    static /* synthetic */ long m9083c() {
        return m9082d();
    }

    /* renamed from: a */
    public static void m9092a() {
        m9087a(false, "1");
    }

    /* renamed from: a */
    public static void m9088a(boolean z) {
        m9087a(!z, "2");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static boolean m9085b(long j, long j2) {
        return 0 != j2 && j2 <= j && j - j2 < 3600000;
    }

    /* renamed from: d */
    private static long m9082d() {
        return new Date().getTime();
    }

    /* renamed from: a */
    private static void m9087a(final boolean z, final String str) {
        C1304e.m9042a(2, new Runnable() { // from class: com.ksmobile.launcher.a.a.a.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    m9081a(z, str);
                } catch (Exception e) {
                }
            }

            /* renamed from: a */
            private void m9081a(boolean z2, String str2) {
                long m9083c = C1294a.m9083c();
                if (!z2 || !C1294a.m9085b(m9083c, C1294a.m9086b())) {
                    C1296b.m9075a(str2);
                    if (z2) {
                        C1294a.m9091a(m9083c);
                    }
                }
            }
        });
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    private static void m9089a(String str, long j) {
        if (Build.VERSION.SDK_INT >= 9) {
            f4089a.edit().putLong(str, j).apply();
        } else {
            f4089a.edit().putLong(str, j).commit();
        }
    }

    /* renamed from: b */
    private static long m9084b(String str, long j) {
        return f4089a.getLong(str, j);
    }

    /* renamed from: b */
    public static long m9086b() {
        try {
            return m9084b("report_active_timestamp", 0L);
        } catch (Exception e) {
            f4089a.edit().remove("report_active_timestamp");
            return 0L;
        }
    }

    /* renamed from: a */
    public static void m9091a(long j) {
        m9089a("report_active_timestamp", j);
    }
}
