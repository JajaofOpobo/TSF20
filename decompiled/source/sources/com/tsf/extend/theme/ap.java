package com.tsf.extend.theme;
/* loaded from: classes.dex */
public class ap extends com.tsf.extend.base.a.b {
    public ap() {
        a("1");
    }

    @Override // com.tsf.extend.base.a.a
    protected String b() {
        return "https://cml.ksmobile.com/";
    }

    @Override // com.tsf.extend.base.a.a
    protected String c() {
        return "Album/getThemeListForRecomm?";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(String str, String str2, String str3) {
        a("pos", "108");
        a("detail", "1");
        a("count", "21");
        a("wp_cid", str);
        a("wp_id", str2);
        a("offset", str3);
    }
}
