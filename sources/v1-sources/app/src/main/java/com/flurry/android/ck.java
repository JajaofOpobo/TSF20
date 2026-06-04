package com.flurry.android;

import android.webkit.WebChromeClient;

/* loaded from: classes.dex */
final class ck implements m {
    private WebChromeClient.CustomViewCallback a;

    public ck(WebChromeClient.CustomViewCallback customViewCallback) {
        this.a = customViewCallback;
    }

    @Override // com.flurry.android.m
    public final void a() {
        if (this.a != null) {
            this.a.onCustomViewHidden();
        }
    }
}
