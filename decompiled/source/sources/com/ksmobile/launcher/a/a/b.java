package com.ksmobile.launcher.a.a;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.cm.a.c;
import com.cm.kinfoc.a.d;
import com.cm.kinfoc.n;
import com.ksmobile.launcher.cmbase.utils.e;
import com.tsf.shell.ShellApplication;
/* loaded from: classes.dex */
public class b {
    private static b d;
    private boolean a = false;
    private boolean b = false;
    private boolean c = false;

    public static b a() {
        if (d != null) {
            return d;
        }
        synchronized (b.class) {
            d = new b();
        }
        return d;
    }

    public static void a(boolean z, String str, String... strArr) {
        a().b(z, str, strArr);
    }

    public static void a(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        a().b(true, "tsflauncher_active", str);
    }

    private static void a(Runnable runnable, long j) {
        if (0 == j) {
            e.a(6, runnable);
        } else {
            e.a(6, runnable, j);
        }
    }

    private void b() {
        com.cm.kinfoc.a.b.a(new com.cm.a.b());
        d.a(new c());
        SharedPreferences sharedPreferences = ShellApplication.a().getSharedPreferences("isFirstLauncher", 0);
        this.a = sharedPreferences.getBoolean("isFirstLauncher", true);
        if (this.a) {
            sharedPreferences.edit().putBoolean("isFirstLauncher", false).commit();
        }
        this.c = true;
    }

    private void b(final boolean z, final String str, final String... strArr) {
        if (!TextUtils.isEmpty(str)) {
            a(new Runnable() { // from class: com.ksmobile.launcher.a.a.b.1
                @Override // java.lang.Runnable
                public void run() {
                    b.this.c(z, str, strArr);
                }
            }, 0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final boolean z, final String str, final String[] strArr) {
        if (!this.c) {
            b();
        }
        if (this.a) {
            a(new Runnable() { // from class: com.ksmobile.launcher.a.a.b.2
                @Override // java.lang.Runnable
                public void run() {
                    if (!b.this.b) {
                        b.this.b = true;
                        com.ksmobile.launcher.cmbase.utils.a.a(ShellApplication.a());
                    }
                    b.this.d(z, str, strArr);
                }
            }, 30000L);
        } else {
            d(z, str, strArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(boolean z, String str, String[] strArr) {
        if (str.equals("tsflauncher_active")) {
            b(strArr[0]);
        } else {
            e(z, str, strArr);
        }
    }

    private void b(String str) {
        com.cm.kinfoc.a.b A = com.cm.kinfoc.a.b.A();
        String valueOf = String.valueOf(A.y());
        if (valueOf.length() > 20) {
            valueOf = valueOf.substring(0, 19);
        }
        String str2 = A.t() + "x" + A.u();
        if (str2.length() > 20) {
            str2 = str2.substring(0, 19);
        }
        e(true, "tsflauncher_active", "vga", str2, "dpi", valueOf, "cores", A.w(), "mem", A.x());
    }

    private void e(boolean z, String str, String... strArr) {
        if (strArr.length % 2 == 1) {
            throw new IllegalArgumentException("args should be even");
        }
        StringBuilder sb = new StringBuilder("");
        if (!z) {
            a(sb);
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
            n.a().b(str, sb.toString());
        } else {
            n.a().a(str, sb.toString());
        }
    }

    private static void a(StringBuilder sb) {
    }
}
