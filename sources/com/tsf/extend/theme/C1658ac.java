package com.tsf.extend.theme;

import com.tsf.extend.base.p069a.AbstractC1342b;
import com.tsf.extend.base.p080j.C1437p;
/* renamed from: com.tsf.extend.theme.ac */
/* loaded from: classes.dex */
public class C1658ac extends AbstractC1342b {

    /* renamed from: a */
    private String f5314a;

    public C1658ac(String str) {
        this.f5314a = str;
    }

    @Override // com.tsf.extend.base.p069a.AbstractC1341a
    /* renamed from: b */
    protected String mo7143b() {
        return "https://cml.ksmobile.com/";
    }

    @Override // com.tsf.extend.base.p069a.AbstractC1341a
    /* renamed from: c */
    protected String mo7142c() {
        return this.f5314a;
    }

    /* renamed from: e */
    public void m7915e() {
        m7917b("115");
        m7914f();
        m7916c("31");
    }

    /* renamed from: b */
    protected void m7917b(String str) {
        m8951a("pos", str);
    }

    /* renamed from: f */
    protected void m7914f() {
        m8951a("vga", C1437p.m8612e());
    }

    /* renamed from: c */
    protected void m7916c(String str) {
        m8951a("count", str);
    }
}
