package com.tsf.shell.plugin.widgetpicker;

import android.app.ProgressDialog;

/* loaded from: classes.dex */
final class c implements Runnable {
    final /* synthetic */ a a;
    private final /* synthetic */ ProgressDialog b;

    c(a aVar, ProgressDialog progressDialog) {
        this.a = aVar;
        this.b = progressDialog;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AppWidgetPicker appWidgetPicker;
        if (this.b.isShowing()) {
            this.b.dismiss();
        }
        try {
            appWidgetPicker = this.a.a;
            new g(appWidgetPicker).a((j) null);
        } catch (Exception e) {
        }
    }
}
