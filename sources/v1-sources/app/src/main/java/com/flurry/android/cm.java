package com.flurry.android;

import android.graphics.Bitmap;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* loaded from: classes.dex */
final class cm extends WebViewClient {
    private /* synthetic */ cy a;

    private cm(cy cyVar) {
        this.a = cyVar;
    }

    /* synthetic */ cm(cy cyVar, byte b) {
        this(cyVar);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        WebView webView2;
        dr drVar;
        boolean z;
        dr drVar2;
        boolean z2;
        String str2 = "shouldOverrideUrlLoading: url = " + str;
        if (str != null && webView != null) {
            webView2 = this.a.b;
            if (webView == webView2) {
                drVar = this.a.i;
                if (drVar != null) {
                    drVar2 = this.a.i;
                    z2 = this.a.l;
                    z = drVar2.a(str, z2);
                } else {
                    z = false;
                }
                this.a.l = false;
                return z;
            }
        }
        return false;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        WebView webView2;
        boolean z;
        dr drVar;
        dr drVar2;
        boolean z2;
        String str2 = "onPageStarted: url = " + str;
        if (str != null && webView != null) {
            webView2 = this.a.b;
            if (webView == webView2) {
                z = this.a.l;
                if (z) {
                    boolean z3 = false;
                    drVar = this.a.i;
                    if (drVar != null) {
                        drVar2 = this.a.i;
                        z2 = this.a.l;
                        z3 = drVar2.a(str, z2);
                    }
                    if (z3) {
                        webView.stopLoading();
                    }
                }
                this.a.l = true;
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        WebView webView2;
        String str2 = "onPageFinished: url = " + str;
        if (str != null && webView != null) {
            webView2 = this.a.b;
            if (webView == webView2) {
                this.a.l = false;
            }
        }
    }
}
