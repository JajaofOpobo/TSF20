package com.tsf.extend.theme;
/* loaded from: classes.dex */
public class ak extends com.tsf.extend.base.a.b {
    public ak() {
        a("1");
        a("count", "60");
        a("themev", "5.0");
    }

    @Override // com.tsf.extend.base.a.a
    protected String b() {
        return "https://cml.ksmobile.com/";
    }

    @Override // com.tsf.extend.base.a.a
    protected String c() {
        return "ThemeApi/search_tags?";
    }
}
