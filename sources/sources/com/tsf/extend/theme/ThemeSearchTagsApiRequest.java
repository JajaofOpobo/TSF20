package com.tsf.extend.theme;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ThemeSearchTagsApiRequest extends com.tsf.extend.base.a.ApiRequestImpl {
    public ThemeSearchTagsApiRequest() {
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
