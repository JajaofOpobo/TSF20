package com.tsf.shell.preference.widget;

import android.os.Bundle;
import android.support.p002v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.tsf.C1306b;
/* renamed from: com.tsf.shell.preference.widget.a */
/* loaded from: classes.dex */
public class C4088a extends Fragment {
    @Override // android.support.p002v4.app.Fragment
    /* renamed from: a */
    public void mo782a(Bundle bundle) {
        super.mo782a(bundle);
    }

    @Override // android.support.p002v4.app.Fragment
    /* renamed from: a */
    public View mo781a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = m13747h().getInt("index");
        WebView webView = (WebView) layoutInflater.inflate(C1306b.C1313g.webviewpage, viewGroup, false);
        switch (i) {
            case 0:
                webView.loadUrl("file:///android_asset/about/translations.html");
                break;
            case 1:
                webView.loadUrl("file:///android_asset/about/about.html");
                break;
        }
        return webView;
    }
}
