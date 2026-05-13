package com.tsf.extend.theme;

import com.tsf.extend.base.p069a.AbstractC1342b;
/* renamed from: com.tsf.extend.theme.aj */
/* loaded from: classes.dex */
public class C1686aj extends AbstractC1342b {
    public C1686aj() {
        m8946a("1");
    }

    @Override // com.tsf.extend.base.p069a.AbstractC1341a
    /* renamed from: b */
    protected String mo7143b() {
        return "https://cml.ksmobile.com/";
    }

    @Override // com.tsf.extend.base.p069a.AbstractC1341a
    /* renamed from: c */
    protected String mo7142c() {
        return "ThemeApi/search?";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public void m7801b(String str, String str2) {
        m8951a("pos", "118");
        m8951a("detail", "1");
        m8951a("count", "21");
        m8951a("k", str);
        m8951a("offset", str2);
        m8951a("themev", "5.0");
    }
}
