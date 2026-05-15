package com.tsf.shell.preference.widget;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.tsf.b;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class a extends Fragment {
    @Override // android.support.v4.app.Fragment
    public void a(Bundle bundle) {
        super.a(bundle);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.support.v4.app.Fragment
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = h().getInt("index");
        WebView webView = (WebView) layoutInflater.inflate(b.g.webviewpage, viewGroup, false);
        switch (i) {
            case 0:
                webView.loadUrl("file:///android_asset/about/translations.html");
                return webView;
            case 1:
                webView.loadUrl("file:///android_asset/about/about.html");
                return webView;
            default:
                return webView;
        }
    }
}
