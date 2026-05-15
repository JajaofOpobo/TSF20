package com.tsf.extend.theme.cmclub;

import android.content.Context;
import android.webkit.JavascriptInterface;
import com.tsf.extend.base.j.z;
import com.tsf.extend.f;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class c {
    Context a;

    c(Context context) {
        this.a = context;
    }

    @JavascriptInterface
    public String getInterfaceName() {
        return "WebAppInterfaceThemeDetail";
    }

    @JavascriptInterface
    public void share(String str) {
        if (this.a instanceof ThemeCmClubActivity) {
            ((ThemeCmClubActivity) this.a).b(str);
        }
    }

    @JavascriptInterface
    public void applyTheme(final String str) {
        z.a(0, new Runnable() { // from class: com.tsf.extend.theme.cmclub.c.1
            @Override // java.lang.Runnable
            public void run() {
                if (c.this.a instanceof ThemeCmClubActivity) {
                    ((ThemeCmClubActivity) c.this.a).a(str);
                }
            }
        });
    }

    @JavascriptInterface
    public int getProgress() {
        if (this.a instanceof ThemeCmClubActivity) {
            return ((ThemeCmClubActivity) this.a).b();
        }
        return -1;
    }

    @JavascriptInterface
    public boolean isThemeDownloaded(String str) {
        if (this.a instanceof ThemeCmClubActivity) {
            return ((ThemeCmClubActivity) this.a).c(str);
        }
        return false;
    }

    @JavascriptInterface
    public void showToastReportTheme() {
        if (this.a != null) {
            ThemeCmClubActivity.a(this.a, this.a.getResources().getString(f.g.cm_club_dialog_report));
        }
    }
}
