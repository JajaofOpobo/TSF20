package com.flurry.android;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class cl extends WebViewClient {
    private /* synthetic */ bz a;

    private cl(bz bzVar) {
        this.a = bzVar;
    }

    /* synthetic */ cl(bz bzVar, byte b) {
        this(bzVar);
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        WebView webView2;
        WebView webView3;
        boolean z;
        String lastPathSegment;
        boolean z2;
        String str2 = "onLoadResource: url = " + str;
        super.onLoadResource(webView, str);
        if (str != null && webView != null) {
            webView2 = this.a.h;
            if (webView == webView2) {
                webView3 = this.a.h;
                if (!str.equalsIgnoreCase(webView3.getUrl())) {
                    bz.c(this.a);
                }
                z = this.a.u;
                if (!z && (lastPathSegment = Uri.parse(str).getLastPathSegment()) != null && lastPathSegment.equalsIgnoreCase("mraid.js")) {
                    this.a.u = true;
                    z2 = this.a.t;
                    if (z2) {
                        bz.f(this.a);
                    }
                }
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        WebView webView2;
        String str2 = "onPageStarted: url = " + str;
        if (str != null && webView != null) {
            webView2 = this.a.h;
            if (webView == webView2) {
                this.a.i = false;
                this.a.t = false;
                this.a.u = false;
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        WebView webView2;
        WebView webView3;
        boolean z;
        WebView webView4;
        String str2 = "onPageFinished: url = " + str;
        if (str != null && webView != null) {
            webView2 = this.a.h;
            if (webView == webView2) {
                bz.c(this.a);
                bz.h(this.a);
                bz bzVar = this.a;
                webView3 = this.a.h;
                if (!bzVar.a(webView3) && (this.a.a() == 2 || this.a.a() == 1)) {
                    bz bzVar2 = this.a;
                    webView4 = this.a.h;
                    bzVar2.addView(webView4);
                }
                this.a.t = true;
                z = this.a.u;
                if (z) {
                    bz.f(this.a);
                }
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        WebView webView2;
        Context context;
        Context context2;
        String str2;
        Context context3;
        List list;
        j b;
        dl a;
        String str3 = "shouldOverrideUrlLoading: url = " + str;
        if (str != null && webView != null) {
            webView2 = this.a.h;
            if (webView == webView2) {
                Uri parse = Uri.parse(str);
                if (parse.getScheme() != null && parse.getScheme().equals("flurry")) {
                    String queryParameter = parse.getQueryParameter("event");
                    if (queryParameter != null) {
                        list = this.a.F;
                        list.add(queryParameter);
                        Map e = bp.e(parse.getEncodedQuery());
                        if (e.containsKey("guid")) {
                            b = this.a.b((String) e.get("guid"));
                            a = this.a.a((String) e.get("guid"));
                            if (b != null && a != null) {
                                this.a.a(queryParameter, e, b, a, 0, 0);
                            }
                        } else {
                            this.a.a(queryParameter, e, this.a.c, this.a.b, this.a.d, 0);
                        }
                    }
                    return true;
                }
                this.a.a("clicked", Collections.emptyMap());
                if (this.a.c()) {
                    return false;
                }
                String obj = this.a.c.b().toString();
                context = this.a.A;
                Intent intent = new Intent(context, (Class<?>) FlurryFullscreenTakeoverActivity.class);
                intent.putExtra("url", str);
                s sVar = this.a.a;
                context2 = this.a.A;
                if (!s.a(context2, intent, obj)) {
                    str2 = this.a.e;
                    Cdo.b(str2, "Unable to launch FlurryFullscreenTakeoverActivity, falling back to browser. Fix by declaring this Activity in your AndroidManifest.xml");
                    s sVar2 = this.a.a;
                    context3 = this.a.A;
                    s.b(context3, str, obj);
                }
                return true;
            }
        }
        return false;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        this.a.a("renderFailed", Collections.emptyMap(), this.a.c, this.a.b, this.a.d, 0);
    }
}
