package com.p060cm.p061a;

import android.content.Context;
import android.content.SharedPreferences;
import com.tsf.shell.ShellApplication;
/* renamed from: com.cm.a.k */
/* loaded from: classes.dex */
public class C1121k {

    /* renamed from: b */
    private static Context f3582b = null;

    /* renamed from: a */
    private SharedPreferences f3583a;

    /* renamed from: c */
    private String f3584c;

    /* renamed from: com.cm.a.k$a */
    /* loaded from: classes.dex */
    private static class C1123a {

        /* renamed from: a */
        private static final C1121k f3585a = new C1121k(C1121k.f3582b);
    }

    /* renamed from: h */
    private boolean m9803h() {
        return true;
    }

    private C1121k(Context context) {
        this.f3583a = null;
        this.f3584c = null;
        if (m9803h()) {
            this.f3584c = new String(context.getPackageName() + "_preferences");
            this.f3583a = ShellApplication.m6152a().getSharedPreferences(this.f3584c, 4);
        }
    }

    /* renamed from: a */
    public static C1121k m9821a(Context context) {
        f3582b = context.getApplicationContext();
        return C1123a.f3585a;
    }

    /* renamed from: a */
    public String m9824a() {
        return m9812b("InfocReportAvailable", "0-1");
    }

    /* renamed from: a */
    public void m9822a(long j, String str) {
        m9808c("InfocReportAvailable", Long.toString(j) + "-" + str);
    }

    /* renamed from: b */
    public boolean m9814b() {
        return m9816a("cm_infoc_ssl_exception", false);
    }

    /* renamed from: a */
    public void m9815a(boolean z) {
        m9811b("cm_infoc_ssl_exception", z);
    }

    /* renamed from: c */
    public long m9809c() {
        return m9818a("last_batch_report_time", 0L);
    }

    /* renamed from: a */
    public void m9823a(long j) {
        m9813b("last_batch_report_time", j);
    }

    /* renamed from: d */
    public boolean m9807d() {
        return m9816a("isAllowedReportInfo", true);
    }

    /* renamed from: b */
    public void m9810b(boolean z) {
        m9811b("crash_so_reported", z);
    }

    /* renamed from: e */
    public boolean m9806e() {
        return m9816a("crash_so_reported", false);
    }

    /* renamed from: a */
    public void m9817a(String str, String str2) {
        if (str != null && !str.equals("") && str2 != null && !str2.equals("")) {
            m9808c("ifcpds_" + str, str2);
        }
    }

    /* renamed from: a */
    public String m9820a(String str) {
        return m9812b("ifcpds_" + str, "");
    }

    /* renamed from: a */
    public long m9818a(String str, long j) {
        if (m9803h()) {
            return m9802i().getLong(str, j);
        }
        return 0L;
    }

    /* renamed from: a */
    public boolean m9816a(String str, boolean z) {
        if (m9803h()) {
            return m9802i().getBoolean(str, z);
        }
        return false;
    }

    /* renamed from: a */
    public int m9819a(String str, int i) {
        if (m9803h()) {
            return m9802i().getInt(str, i);
        }
        return 0;
    }

    /* renamed from: b */
    public String m9812b(String str, String str2) {
        return m9803h() ? m9802i().getString(str, str2) : "";
    }

    /* renamed from: b */
    public void m9811b(String str, boolean z) {
        if (m9803h()) {
            SharedPreferences.Editor edit = m9802i().edit();
            edit.putBoolean(str, z);
            C1124l.m9800a(edit);
        }
    }

    /* renamed from: b */
    public void m9813b(String str, long j) {
        if (m9803h()) {
            SharedPreferences.Editor edit = m9802i().edit();
            edit.putLong(str, j);
            C1124l.m9800a(edit);
        }
    }

    /* renamed from: c */
    public void m9808c(String str, String str2) {
        if (m9803h()) {
            SharedPreferences.Editor edit = m9802i().edit();
            edit.putString(str, str2);
            C1124l.m9800a(edit);
        }
    }

    /* renamed from: i */
    private SharedPreferences m9802i() {
        return this.f3583a;
    }

    /* renamed from: f */
    public int m9805f() {
        return m9819a("report_interval", 0);
    }
}
