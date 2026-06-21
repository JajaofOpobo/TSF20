package com.tsf.shell.preference.widget;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.tsf.shell.R;

/* loaded from: classes.dex */
public class a extends Fragment {
    @Override // android.support.v4.app.Fragment
    public void a(Bundle bundle) {
        super.a(bundle);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x0016, code lost:
    
        return r0;
     */
    @Override // android.support.v4.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = h().getInt("index");
        WebView webView = (WebView) layoutInflater.inflate(R.layout.webviewpage, viewGroup, false);
        switch (i) {
            case 0:
                webView.loadUrl("file:///android_asset/about/translations.html");
                break;
            case 1:
                webView.loadUrl("file:///android_asset/about/about.html");
                break;
        }
    }
}
