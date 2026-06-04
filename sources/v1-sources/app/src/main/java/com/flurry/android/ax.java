package com.flurry.android;

import android.view.View;
import android.webkit.WebChromeClient;

/* loaded from: classes.dex */
final class ax extends WebChromeClient {
    private /* synthetic */ cy a;

    private ax(cy cyVar) {
        this.a = cyVar;
    }

    /* synthetic */ ax(cy cyVar, byte b) {
        this(cyVar);
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        bt btVar;
        bt btVar2;
        this.a.e = true;
        btVar = this.a.k;
        if (btVar != null) {
            btVar2 = this.a.k;
            cy cyVar = this.a;
            btVar2.a(view, btVar2.a.getRequestedOrientation(), new ck(customViewCallback));
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        bt btVar;
        bt btVar2;
        this.a.e = true;
        btVar = this.a.k;
        if (btVar != null) {
            btVar2 = this.a.k;
            cy cyVar = this.a;
            btVar2.a(view, i, new ck(customViewCallback));
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        bt btVar;
        bt btVar2;
        btVar = this.a.k;
        if (btVar != null) {
            btVar2 = this.a.k;
            btVar2.a();
        }
        this.a.e = false;
    }
}
