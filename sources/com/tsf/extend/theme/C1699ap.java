package com.tsf.extend.theme;

import com.tsf.extend.base.p069a.AbstractC1342b;
/* renamed from: com.tsf.extend.theme.ap */
/* loaded from: classes.dex */
public class C1699ap extends AbstractC1342b {
    public C1699ap() {
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
        return "Album/getThemeListForRecomm?";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m7765a(String str, String str2, String str3) {
        m8951a("pos", "108");
        m8951a("detail", "1");
        m8951a("count", "21");
        m8951a("wp_cid", str);
        m8951a("wp_id", str2);
        m8951a("offset", str3);
    }
}
