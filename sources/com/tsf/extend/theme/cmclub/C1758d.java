package com.tsf.extend.theme.cmclub;

import android.content.Context;
import android.webkit.JavascriptInterface;
/* renamed from: com.tsf.extend.theme.cmclub.d */
/* loaded from: classes.dex */
public class C1758d {

    /* renamed from: a */
    Context f5656a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1758d(Context context) {
        this.f5656a = context;
    }

    @JavascriptInterface
    public void showToast(String str) {
        ThemeCmClubActivity.m7630a(this.f5656a, str);
    }

    @JavascriptInterface
    public String getInterfaceName() {
        return "WebAppInterfaceWebView";
    }

    @JavascriptInterface
    public void clearHistory() {
        if (this.f5656a instanceof ThemeCmClubActivity) {
            ((ThemeCmClubActivity) this.f5656a).m7594e();
        }
    }

    @JavascriptInterface
    public void goBack() {
        if (this.f5656a instanceof ThemeCmClubActivity) {
            ((ThemeCmClubActivity) this.f5656a).m7602c();
        }
    }

    @JavascriptInterface
    public void CMJSEnabled() {
        if (this.f5656a instanceof ThemeCmClubActivity) {
            ((ThemeCmClubActivity) this.f5656a).m7590f();
        }
    }
}
