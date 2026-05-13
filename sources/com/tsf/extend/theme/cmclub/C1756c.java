package com.tsf.extend.theme.cmclub;

import android.content.Context;
import android.webkit.JavascriptInterface;
import com.tsf.extend.C1536f;
import com.tsf.extend.base.p080j.C1455z;
/* renamed from: com.tsf.extend.theme.cmclub.c */
/* loaded from: classes.dex */
public class C1756c {

    /* renamed from: a */
    Context f5653a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1756c(Context context) {
        this.f5653a = context;
    }

    @JavascriptInterface
    public String getInterfaceName() {
        return "WebAppInterfaceThemeDetail";
    }

    @JavascriptInterface
    public void share(String str) {
        if (this.f5653a instanceof ThemeCmClubActivity) {
            ((ThemeCmClubActivity) this.f5653a).m7605b(str);
        }
    }

    @JavascriptInterface
    public void applyTheme(final String str) {
        C1455z.m8564a(0, new Runnable() { // from class: com.tsf.extend.theme.cmclub.c.1
            @Override // java.lang.Runnable
            public void run() {
                if (C1756c.this.f5653a instanceof ThemeCmClubActivity) {
                    ((ThemeCmClubActivity) C1756c.this.f5653a).m7615a(str);
                }
            }
        });
    }

    @JavascriptInterface
    public int getProgress() {
        if (this.f5653a instanceof ThemeCmClubActivity) {
            return ((ThemeCmClubActivity) this.f5653a).m7610b();
        }
        return -1;
    }

    @JavascriptInterface
    public boolean isThemeDownloaded(String str) {
        if (this.f5653a instanceof ThemeCmClubActivity) {
            return ((ThemeCmClubActivity) this.f5653a).m7599c(str);
        }
        return false;
    }

    @JavascriptInterface
    public void showToastReportTheme() {
        if (this.f5653a != null) {
            ThemeCmClubActivity.m7630a(this.f5653a, this.f5653a.getResources().getString(C1536f.C1543g.cm_club_dialog_report));
        }
    }
}
