package com.tsf.extend.theme;
/* loaded from: classes.dex */
public class ag extends com.tsf.extend.base.a.b {
    private String a;
    private boolean b;

    public ag(String str) {
        this.a = "tlist?";
        this.a = str;
        this.b = false;
    }

    public ag(String str, boolean z) {
        this.a = "tlist?";
        this.a = str;
        this.b = z;
    }

    @Override // com.tsf.extend.base.a.a
    protected String b() {
        return this.b ? "https://cml.ksmobile.com/ThemeApi/" : "https://cml.ksmobile.com/ThemeApi/";
    }

    @Override // com.tsf.extend.base.a.a
    protected String c() {
        return this.a;
    }

    protected void b(String str) {
        a("pos", str);
    }

    protected void c(String str) {
        a("theme_id", str);
    }

    protected void d(String str) {
        a("action", str);
    }

    protected void e(String str) {
        a("detail", str);
    }

    protected void f(String str) {
        a("count", str);
    }

    protected void g(String str) {
        a("offset", str);
    }

    protected void h(String str) {
        a("themev", str);
    }

    protected void i(String str) {
        a("pkgname", str);
    }

    protected void e() {
        a("vga", com.tsf.extend.base.j.p.e());
    }

    public void b(String str, String str2) {
        b(str);
        e("1");
        g(str2);
        a("3");
        h("5.0");
        f("21");
        e();
    }

    public void a(long j, String str) {
        b(str);
        a("1");
        c(String.valueOf(j));
        d("01");
        e();
    }

    public void a(String str, String str2, String str3) {
        c(str2);
        a("2");
        h("5.0");
        b(str, str3);
        e();
    }

    public void b(String str, String str2, String str3) {
        i(str2);
        a("2");
        h("5.0");
        b(str, str3);
        e();
        f("31");
    }
}
