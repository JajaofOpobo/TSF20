package com.cm.a;

import android.content.Context;
import android.content.SharedPreferences;
import com.tsf.shell.ShellApplication;
/* loaded from: classes.dex */
public class k {
    private static Context b = null;
    private SharedPreferences a;
    private String c;

    /* loaded from: classes.dex */
    private static class a {
        private static final k a = new k(k.b);
    }

    private boolean h() {
        return true;
    }

    private k(Context context) {
        this.a = null;
        this.c = null;
        if (h()) {
            this.c = new String(context.getPackageName() + "_preferences");
            this.a = ShellApplication.a().getSharedPreferences(this.c, 4);
        }
    }

    public static k a(Context context) {
        b = context.getApplicationContext();
        return a.a;
    }

    public String a() {
        return b("InfocReportAvailable", "0-1");
    }

    public void a(long j, String str) {
        c("InfocReportAvailable", Long.toString(j) + "-" + str);
    }

    public boolean b() {
        return a("cm_infoc_ssl_exception", false);
    }

    public void a(boolean z) {
        b("cm_infoc_ssl_exception", z);
    }

    public long c() {
        return a("last_batch_report_time", 0L);
    }

    public void a(long j) {
        b("last_batch_report_time", j);
    }

    public boolean d() {
        return a("isAllowedReportInfo", true);
    }

    public void b(boolean z) {
        b("crash_so_reported", z);
    }

    public boolean e() {
        return a("crash_so_reported", false);
    }

    public void a(String str, String str2) {
        if (str != null && !str.equals("") && str2 != null && !str2.equals("")) {
            c("ifcpds_" + str, str2);
        }
    }

    public String a(String str) {
        return b("ifcpds_" + str, "");
    }

    public long a(String str, long j) {
        if (h()) {
            return i().getLong(str, j);
        }
        return 0L;
    }

    public boolean a(String str, boolean z) {
        if (h()) {
            return i().getBoolean(str, z);
        }
        return false;
    }

    public int a(String str, int i) {
        if (h()) {
            return i().getInt(str, i);
        }
        return 0;
    }

    public String b(String str, String str2) {
        return h() ? i().getString(str, str2) : "";
    }

    public void b(String str, boolean z) {
        if (h()) {
            SharedPreferences.Editor edit = i().edit();
            edit.putBoolean(str, z);
            l.a(edit);
        }
    }

    public void b(String str, long j) {
        if (h()) {
            SharedPreferences.Editor edit = i().edit();
            edit.putLong(str, j);
            l.a(edit);
        }
    }

    public void c(String str, String str2) {
        if (h()) {
            SharedPreferences.Editor edit = i().edit();
            edit.putString(str, str2);
            l.a(edit);
        }
    }

    private SharedPreferences i() {
        return this.a;
    }

    public int f() {
        return a("report_interval", 0);
    }
}
