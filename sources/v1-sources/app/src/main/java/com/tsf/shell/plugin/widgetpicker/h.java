package com.tsf.shell.plugin.widgetpicker;

import android.content.DialogInterface;

/* loaded from: classes.dex */
final class h implements DialogInterface.OnCancelListener {
    final /* synthetic */ g a;
    private final boolean b;

    public h(g gVar, boolean z) {
        this.a = gVar;
        this.b = z;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        AppWidgetPicker appWidgetPicker;
        AppWidgetPicker appWidgetPicker2;
        if (this.b) {
            appWidgetPicker = this.a.c;
            appWidgetPicker.setResult(0);
            appWidgetPicker2 = this.a.c;
            appWidgetPicker2.finish();
            return;
        }
        this.a.a((j) null);
    }
}
