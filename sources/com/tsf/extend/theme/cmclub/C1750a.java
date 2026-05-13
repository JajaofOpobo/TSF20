package com.tsf.extend.theme.cmclub;

import android.content.Context;
import android.webkit.JavascriptInterface;
import com.tsf.extend.base.p080j.C1455z;
import com.tsf.extend.theme.C1846j;
/* renamed from: com.tsf.extend.theme.cmclub.a */
/* loaded from: classes.dex */
public class C1750a {

    /* renamed from: a */
    Context f5640a;

    /* renamed from: b */
    private C1846j.InterfaceC1847a f5641b = new C1846j.InterfaceC1847a() { // from class: com.tsf.extend.theme.cmclub.a.2
        @Override // com.tsf.extend.theme.C1846j.InterfaceC1847a
        /* renamed from: a */
        public void mo7332a(String str) {
        }

        @Override // com.tsf.extend.theme.C1846j.InterfaceC1847a
        /* renamed from: a */
        public void mo7333a() {
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1750a(Context context) {
        this.f5640a = context;
    }

    @JavascriptInterface
    public void showToast(String str) {
        ThemeCmClubActivity.m7630a(this.f5640a, str);
    }

    @JavascriptInterface
    public String getInterfaceName() {
        return "WebAppInterfaceActivity";
    }

    @JavascriptInterface
    public void finishPresentActivity() {
        if (this.f5640a instanceof ThemeCmClubActivity) {
            ((ThemeCmClubActivity) this.f5640a).m7598d();
        }
    }

    @JavascriptInterface
    public void clearCache() {
        if (this.f5640a instanceof ThemeCmClubActivity) {
            ((ThemeCmClubActivity) this.f5640a).m7587g();
        }
    }

    @JavascriptInterface
    public void setBackTag(String str) {
        if (this.f5640a instanceof ThemeCmClubActivity) {
            ((ThemeCmClubActivity) this.f5640a).m7595d(str);
        }
    }

    @JavascriptInterface
    public void shareMessage(final String str, final String str2) {
        C1455z.m8564a(0, new Runnable() { // from class: com.tsf.extend.theme.cmclub.a.1
            @Override // java.lang.Runnable
            public void run() {
                C1846j.m7334a(C1750a.this.f5640a, str, str2, C1750a.this.f5641b);
            }
        });
    }

    @JavascriptInterface
    public void openImage(final String str, final int i) {
        C1455z.m8564a(0, new Runnable() { // from class: com.tsf.extend.theme.cmclub.a.3
            @Override // java.lang.Runnable
            public void run() {
                if (C1750a.this.f5640a instanceof ThemeCmClubActivity) {
                    ((ThemeCmClubActivity) C1750a.this.f5640a).m7614a(str, i);
                }
            }
        });
    }

    @JavascriptInterface
    public void openCamera(final String str, final int i) {
        C1455z.m8564a(0, new Runnable() { // from class: com.tsf.extend.theme.cmclub.a.4
            @Override // java.lang.Runnable
            public void run() {
                if (C1750a.this.f5640a instanceof ThemeCmClubActivity) {
                    ((ThemeCmClubActivity) C1750a.this.f5640a).m7604b(str, i);
                }
            }
        });
    }
}
