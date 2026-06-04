package com.flurry.android;

import android.R;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.RelativeLayout;

/* loaded from: classes.dex */
final class cy extends RelativeLayout implements View.OnClickListener {
    private final String a;
    private WebView b;
    private WebViewClient c;
    private WebChromeClient d;
    private boolean e;
    private ImageView f;
    private ImageView g;
    private ImageView h;
    private dr i;
    private ej j;
    private bt k;
    private boolean l;

    public final void a(dr drVar) {
        this.i = drVar;
    }

    public final void a(ej ejVar) {
        this.j = ejVar;
    }

    public final void a(bt btVar) {
        this.k = btVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cy(Context context, String str) {
        super(context);
        byte b = 0;
        this.a = getClass().getSimpleName();
        this.b = new WebView(context);
        this.c = new cm(this, b);
        this.d = new ax(this, b);
        this.b.getSettings().setJavaScriptEnabled(true);
        this.b.getSettings().setUseWideViewPort(true);
        if (dx.a >= 7) {
            this.b.getSettings().setLoadWithOverviewMode(true);
        }
        this.b.getSettings().setBuiltInZoomControls(true);
        if (dx.a >= 11) {
            this.b.getSettings().setDisplayZoomControls(false);
        }
        this.b.setWebViewClient(this.c);
        this.b.setWebChromeClient(this.d);
        this.b.loadUrl(str);
        this.f = new ImageView(context);
        this.f.setId(0);
        this.f.setImageDrawable(getResources().getDrawable(R.drawable.ic_menu_close_clear_cancel));
        this.f.setOnClickListener(this);
        this.g = new ImageView(context);
        this.g.setId(1);
        this.g.setImageDrawable(getResources().getDrawable(R.drawable.ic_menu_revert));
        this.g.setOnClickListener(this);
        this.h = new ImageView(context);
        this.h.setId(2);
        this.h.setImageDrawable(getResources().getDrawable(R.drawable.ic_menu_directions));
        this.h.setOnClickListener(this);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        addView(this.b);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(14);
        addView(this.f, layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(9);
        addView(this.g, layoutParams2);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(11);
        addView(this.h, layoutParams3);
    }

    public final boolean a() {
        return this.e || (this.b != null && this.b.canGoBack());
    }

    public final void b() {
        if (this.e) {
            this.d.onHideCustomView();
        } else if (this.b != null) {
            this.b.goBack();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (view.getId()) {
            case 0:
                if (this.j != null) {
                    this.j.a.finish();
                    break;
                }
                break;
            case 1:
                if (this.b != null && this.b.canGoBack()) {
                    this.b.goBack();
                    break;
                } else if (this.j != null) {
                    this.j.a.finish();
                    break;
                }
                break;
            case 2:
                if (this.b != null && this.b.canGoForward()) {
                    this.b.goForward();
                    break;
                }
                break;
        }
    }

    public final void c() {
        if (this.b != null) {
            removeView(this.b);
            this.b.stopLoading();
            if (dx.a >= 11) {
                this.b.onPause();
            }
            this.b.destroy();
            this.b = null;
        }
    }
}
