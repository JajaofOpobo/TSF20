package com.tsf.extend.theme;
/* loaded from: classes.dex */
public class aj extends com.tsf.extend.base.a.b {
    public aj() {
        a("1");
    }

    @Override // com.tsf.extend.base.a.a
    protected String b() {
        return "https://cml.ksmobile.com/";
    }

    @Override // com.tsf.extend.base.a.a
    protected String c() {
        return "ThemeApi/search?";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(String str, String str2) {
        a("pos", "118");
        a("detail", "1");
        a("count", "21");
        a("k", str);
        a("offset", str2);
        a("themev", "5.0");
    }
}
