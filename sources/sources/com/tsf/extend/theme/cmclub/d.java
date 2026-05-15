package com.tsf.extend.theme.cmclub;

import android.content.Context;
import android.webkit.JavascriptInterface;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class d {
    Context a;

    d(Context context) {
        this.a = context;
    }

    @JavascriptInterface
    public void showToast(String str) {
        ThemeCmClubActivity.a(this.a, str);
    }

    @JavascriptInterface
    public String getInterfaceName() {
        return "WebAppInterfaceWebView";
    }

    @JavascriptInterface
    public void clearHistory() {
        if (this.a instanceof ThemeCmClubActivity) {
            ((ThemeCmClubActivity) this.a).e();
        }
    }

    @JavascriptInterface
    public void goBack() {
        if (this.a instanceof ThemeCmClubActivity) {
            ((ThemeCmClubActivity) this.a).c();
        }
    }

    @JavascriptInterface
    public void CMJSEnabled() {
        if (this.a instanceof ThemeCmClubActivity) {
            ((ThemeCmClubActivity) this.a).f();
        }
    }
}
