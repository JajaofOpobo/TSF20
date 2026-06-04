package com.flurry.android;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import com.tsf.shell.theme.inside.ThemeShellDescription;

/* loaded from: classes.dex */
final class de extends WebChromeClient {
    final /* synthetic */ bz a;

    private de(bz bzVar) {
        this.a = bzVar;
    }

    /* synthetic */ de(bz bzVar, byte b) {
        this(bzVar);
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        Activity activity;
        Activity activity2;
        activity = this.a.B;
        if (activity != null) {
            activity2 = this.a.B;
            onShowCustomView(view, activity2.getRequestedOrientation(), customViewCallback);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        Activity activity;
        View view2;
        Activity activity2;
        Context context;
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        View view3;
        Activity activity3;
        FrameLayout frameLayout3;
        Dialog dialog;
        Activity activity4;
        Context context2;
        Dialog dialog2;
        Dialog dialog3;
        Dialog dialog4;
        Dialog dialog5;
        Dialog dialog6;
        WebChromeClient webChromeClient;
        WebChromeClient webChromeClient2;
        activity = this.a.B;
        if (activity != null) {
            view2 = this.a.l;
            if (view2 != null) {
                webChromeClient = this.a.k;
                if (webChromeClient != null) {
                    webChromeClient2 = this.a.k;
                    webChromeClient2.onHideCustomView();
                    return;
                }
            }
            this.a.l = view;
            bz bzVar = this.a;
            activity2 = this.a.B;
            bzVar.m = activity2.getRequestedOrientation();
            this.a.n = customViewCallback;
            bz bzVar2 = this.a;
            context = this.a.A;
            bzVar2.p = new FrameLayout(context);
            frameLayout = this.a.p;
            frameLayout.setBackgroundColor(-16777216);
            frameLayout2 = this.a.p;
            view3 = this.a.l;
            frameLayout2.addView(view3, new FrameLayout.LayoutParams(-1, -1, 17));
            activity3 = this.a.B;
            ViewGroup viewGroup = (ViewGroup) activity3.getWindow().getDecorView();
            frameLayout3 = this.a.p;
            viewGroup.addView(frameLayout3, -1, -1);
            dialog = this.a.o;
            if (dialog == null) {
                bz bzVar3 = this.a;
                context2 = this.a.A;
                bzVar3.o = new ed(this, context2);
                dialog2 = this.a.o;
                dialog2.getWindow().setType(ThemeShellDescription.PICKER_MENU);
                dialog3 = this.a.o;
                dialog3.setOnShowListener(new ec(this));
                dialog4 = this.a.o;
                dialog4.setOnDismissListener(new ea(this));
                dialog5 = this.a.o;
                dialog5.setCancelable(true);
                dialog6 = this.a.o;
                dialog6.show();
            }
            activity4 = this.a.B;
            bi.b(activity4, i);
            s sVar = this.a.a;
            this.a.c.b().toString();
            sVar.a(false);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        Activity activity;
        View view;
        Dialog dialog;
        Activity activity2;
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        View view2;
        Dialog dialog2;
        Activity activity3;
        int i;
        WebChromeClient.CustomViewCallback customViewCallback;
        Dialog dialog3;
        Dialog dialog4;
        Dialog dialog5;
        Dialog dialog6;
        Dialog dialog7;
        activity = this.a.B;
        if (activity != null) {
            view = this.a.l;
            if (view != null) {
                dialog = this.a.r;
                if (dialog != null) {
                    dialog7 = this.a.r;
                    dialog7.show();
                }
                activity2 = this.a.B;
                ViewGroup viewGroup = (ViewGroup) activity2.getWindow().getDecorView();
                frameLayout = this.a.p;
                viewGroup.removeView(frameLayout);
                frameLayout2 = this.a.p;
                view2 = this.a.l;
                frameLayout2.removeView(view2);
                dialog2 = this.a.o;
                if (dialog2 != null) {
                    dialog3 = this.a.o;
                    if (dialog3.isShowing()) {
                        dialog4 = this.a.o;
                        dialog4.hide();
                        dialog5 = this.a.o;
                        dialog5.setOnDismissListener(null);
                        dialog6 = this.a.o;
                        dialog6.dismiss();
                    }
                }
                this.a.o = null;
                activity3 = this.a.B;
                i = this.a.m;
                bi.a(activity3, i);
                customViewCallback = this.a.n;
                customViewCallback.onCustomViewHidden();
                this.a.n = null;
                this.a.p = null;
                this.a.l = null;
                s sVar = this.a.a;
                this.a.c.b().toString();
                sVar.d();
            }
        }
    }
}
