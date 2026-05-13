package com.tsf.extend.theme;

import com.tsf.extend.base.p069a.AbstractC1342b;
import com.tsf.extend.base.p080j.C1437p;
/* renamed from: com.tsf.extend.theme.ag */
/* loaded from: classes.dex */
public class C1672ag extends AbstractC1342b {

    /* renamed from: a */
    private String f5344a;

    /* renamed from: b */
    private boolean f5345b;

    public C1672ag(String str) {
        this.f5344a = "tlist?";
        this.f5344a = str;
        this.f5345b = false;
    }

    public C1672ag(String str, boolean z) {
        this.f5344a = "tlist?";
        this.f5344a = str;
        this.f5345b = z;
    }

    @Override // com.tsf.extend.base.p069a.AbstractC1341a
    /* renamed from: b */
    protected String mo7143b() {
        return this.f5345b ? "https://cml.ksmobile.com/ThemeApi/" : "https://cml.ksmobile.com/ThemeApi/";
    }

    @Override // com.tsf.extend.base.p069a.AbstractC1341a
    /* renamed from: c */
    protected String mo7142c() {
        return this.f5344a;
    }

    /* renamed from: b */
    protected void m7875b(String str) {
        m8951a("pos", str);
    }

    /* renamed from: c */
    protected void m7872c(String str) {
        m8951a("theme_id", str);
    }

    /* renamed from: d */
    protected void m7871d(String str) {
        m8951a("action", str);
    }

    /* renamed from: e */
    protected void m7869e(String str) {
        m8951a("detail", str);
    }

    /* renamed from: f */
    protected void m7868f(String str) {
        m8951a("count", str);
    }

    /* renamed from: g */
    protected void m7867g(String str) {
        m8951a("offset", str);
    }

    /* renamed from: h */
    protected void m7866h(String str) {
        m8951a("themev", str);
    }

    /* renamed from: i */
    protected void m7865i(String str) {
        m8951a("pkgname", str);
    }

    /* renamed from: e */
    protected void m7870e() {
        m8951a("vga", C1437p.m8612e());
    }

    /* renamed from: b */
    public void m7874b(String str, String str2) {
        m7875b(str);
        m7869e("1");
        m7867g(str2);
        m8946a("3");
        m7866h("5.0");
        m7868f("21");
        m7870e();
    }

    /* renamed from: a */
    public void m7877a(long j, String str) {
        m7875b(str);
        m8946a("1");
        m7872c(String.valueOf(j));
        m7871d("01");
        m7870e();
    }

    /* renamed from: a */
    public void m7876a(String str, String str2, String str3) {
        m7872c(str2);
        m8946a("2");
        m7866h("5.0");
        m7874b(str, str3);
        m7870e();
    }

    /* renamed from: b */
    public void m7873b(String str, String str2, String str3) {
        m7865i(str2);
        m8946a("2");
        m7866h("5.0");
        m7874b(str, str3);
        m7870e();
        m7868f("31");
    }
}
