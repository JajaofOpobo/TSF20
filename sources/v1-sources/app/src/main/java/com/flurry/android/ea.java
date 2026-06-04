package com.flurry.android;

import android.content.DialogInterface;
import android.view.View;
import android.webkit.WebChromeClient;

/* loaded from: classes.dex */
final class ea implements DialogInterface.OnDismissListener {
    private /* synthetic */ de a;

    ea(de deVar) {
        this.a = deVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        View view;
        WebChromeClient webChromeClient;
        WebChromeClient webChromeClient2;
        view = this.a.a.l;
        if (view != null) {
            webChromeClient = this.a.a.k;
            if (webChromeClient != null) {
                webChromeClient2 = this.a.a.k;
                webChromeClient2.onHideCustomView();
            }
        }
    }
}
