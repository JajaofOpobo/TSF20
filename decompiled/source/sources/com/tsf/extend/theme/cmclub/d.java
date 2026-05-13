package com.tsf.extend.theme.cmclub;

import android.content.Context;
import android.webkit.JavascriptInterface;
/* loaded from: classes.dex */
public class d {
    Context a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(Context context) {
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
