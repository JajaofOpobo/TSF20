package com.tsf.extend.theme.cmclub;

import android.content.Context;
import android.webkit.JavascriptInterface;
import com.tsf.extend.base.j.z;
import com.tsf.extend.theme.j;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class a {
    Context a;
    private j.a b = new j.a() { // from class: com.tsf.extend.theme.cmclub.a.2
        @Override // com.tsf.extend.theme.j.a
        public void a(String str) {
        }

        @Override // com.tsf.extend.theme.j.a
        public void a() {
        }
    };

    a(Context context) {
        this.a = context;
    }

    @JavascriptInterface
    public void showToast(String str) {
        ThemeCmClubActivity.a(this.a, str);
    }

    @JavascriptInterface
    public String getInterfaceName() {
        return "WebAppInterfaceActivity";
    }

    @JavascriptInterface
    public void finishPresentActivity() {
        if (this.a instanceof ThemeCmClubActivity) {
            ((ThemeCmClubActivity) this.a).d();
        }
    }

    @JavascriptInterface
    public void clearCache() {
        if (this.a instanceof ThemeCmClubActivity) {
            ((ThemeCmClubActivity) this.a).g();
        }
    }

    @JavascriptInterface
    public void setBackTag(String str) {
        if (this.a instanceof ThemeCmClubActivity) {
            ((ThemeCmClubActivity) this.a).d(str);
        }
    }

    @JavascriptInterface
    public void shareMessage(final String str, final String str2) {
        z.a(0, new Runnable() { // from class: com.tsf.extend.theme.cmclub.a.1
            @Override // java.lang.Runnable
            public void run() {
                j.a(a.this.a, str, str2, a.this.b);
            }
        });
    }

    @JavascriptInterface
    public void openImage(final String str, final int i) {
        z.a(0, new Runnable() { // from class: com.tsf.extend.theme.cmclub.a.3
            @Override // java.lang.Runnable
            public void run() {
                if (a.this.a instanceof ThemeCmClubActivity) {
                    ((ThemeCmClubActivity) a.this.a).a(str, i);
                }
            }
        });
    }

    @JavascriptInterface
    public void openCamera(final String str, final int i) {
        z.a(0, new Runnable() { // from class: com.tsf.extend.theme.cmclub.a.4
            @Override // java.lang.Runnable
            public void run() {
                if (a.this.a instanceof ThemeCmClubActivity) {
                    ((ThemeCmClubActivity) a.this.a).b(str, i);
                }
            }
        });
    }
}
