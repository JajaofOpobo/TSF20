package com.ksmobile.launcher.p066a.p067a;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.ksmobile.launcher.cmbase.utils.C1299a;
import com.ksmobile.launcher.cmbase.utils.C1304e;
import com.p060cm.kinfoc.C1157n;
import com.p060cm.kinfoc.p062a.AbstractC1130b;
import com.p060cm.kinfoc.p062a.AbstractC1132d;
import com.p060cm.p061a.C1110b;
import com.p060cm.p061a.C1111c;
import com.tsf.shell.ShellApplication;
/* renamed from: com.ksmobile.launcher.a.a.b */
/* loaded from: classes.dex */
public class C1296b {

    /* renamed from: d */
    private static C1296b f4092d;

    /* renamed from: a */
    private boolean f4093a = false;

    /* renamed from: b */
    private boolean f4094b = false;

    /* renamed from: c */
    private boolean f4095c = false;

    /* renamed from: a */
    public static C1296b m9080a() {
        if (f4092d != null) {
            return f4092d;
        }
        synchronized (C1296b.class) {
            f4092d = new C1296b();
        }
        return f4092d;
    }

    /* renamed from: a */
    public static void m9073a(boolean z, String str, String... strArr) {
        m9080a().m9069b(z, str, strArr);
    }

    /* renamed from: a */
    public static void m9075a(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        m9080a().m9069b(true, "tsflauncher_active", str);
    }

    /* renamed from: a */
    private static void m9076a(Runnable runnable, long j) {
        if (0 == j) {
            C1304e.m9042a(6, runnable);
        } else {
            C1304e.m9041a(6, runnable, j);
        }
    }

    /* renamed from: b */
    private void m9072b() {
        AbstractC1130b.m9780a(new C1110b());
        AbstractC1132d.m9742a(new C1111c());
        SharedPreferences sharedPreferences = ShellApplication.m6152a().getSharedPreferences("isFirstLauncher", 0);
        this.f4093a = sharedPreferences.getBoolean("isFirstLauncher", true);
        if (this.f4093a) {
            sharedPreferences.edit().putBoolean("isFirstLauncher", false).commit();
        }
        this.f4095c = true;
    }

    /* renamed from: b */
    private void m9069b(final boolean z, final String str, final String... strArr) {
        if (!TextUtils.isEmpty(str)) {
            m9076a(new Runnable() { // from class: com.ksmobile.launcher.a.a.b.1
                @Override // java.lang.Runnable
                public void run() {
                    C1296b.this.m9068c(z, str, strArr);
                }
            }, 0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m9068c(final boolean z, final String str, final String[] strArr) {
        if (!this.f4095c) {
            m9072b();
        }
        if (this.f4093a) {
            m9076a(new Runnable() { // from class: com.ksmobile.launcher.a.a.b.2
                @Override // java.lang.Runnable
                public void run() {
                    if (!C1296b.this.f4094b) {
                        C1296b.this.f4094b = true;
                        C1299a.m9064a(ShellApplication.m6152a());
                    }
                    C1296b.this.m9067d(z, str, strArr);
                }
            }, 30000L);
        } else {
            m9067d(z, str, strArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public void m9067d(boolean z, String str, String[] strArr) {
        if (str.equals("tsflauncher_active")) {
            m9070b(strArr[0]);
        } else {
            m9066e(z, str, strArr);
        }
    }

    /* renamed from: b */
    private void m9070b(String str) {
        AbstractC1130b m9785A = AbstractC1130b.m9785A();
        String valueOf = String.valueOf(m9785A.mo9748y());
        if (valueOf.length() > 20) {
            valueOf = valueOf.substring(0, 19);
        }
        String str2 = m9785A.mo9753t() + "x" + m9785A.mo9752u();
        if (str2.length() > 20) {
            str2 = str2.substring(0, 19);
        }
        m9066e(true, "tsflauncher_active", "vga", str2, "dpi", valueOf, "cores", m9785A.mo9750w(), "mem", m9785A.mo9749x());
    }

    /* renamed from: e */
    private void m9066e(boolean z, String str, String... strArr) {
        if (strArr.length % 2 == 1) {
            throw new IllegalArgumentException("args should be even");
        }
        StringBuilder sb = new StringBuilder("");
        if (!z) {
            m9074a(sb);
        }
        int i = 0;
        while (i < strArr.length) {
            if (i % 2 == 0) {
                if (strArr[i] == null) {
                    throw new NullPointerException("key should not be null");
                }
                sb.append(((z && i == 0) ? "" : "&") + strArr[i]);
            } else {
                sb.append("=" + strArr[i]);
            }
            i++;
        }
        if (z) {
            C1157n.m9659a().m9655b(str, sb.toString());
        } else {
            C1157n.m9659a().m9656a(str, sb.toString());
        }
    }

    /* renamed from: a */
    private static void m9074a(StringBuilder sb) {
    }
}
