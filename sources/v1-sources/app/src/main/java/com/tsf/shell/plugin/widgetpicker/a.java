package com.tsf.shell.plugin.widgetpicker;

import android.app.ProgressDialog;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes.dex */
final class a extends Thread {
    final /* synthetic */ AppWidgetPicker a;
    private final /* synthetic */ ProgressDialog b;

    a(AppWidgetPicker appWidgetPicker, ProgressDialog progressDialog) {
        this.a = appWidgetPicker;
        this.b = progressDialog;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        ArrayList arrayList2;
        Handler handler;
        AppWidgetPicker.a(this.a);
        AppWidgetPicker.b(this.a);
        arrayList = this.a.d;
        Collections.sort(arrayList, new b(this));
        arrayList2 = this.a.d;
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            if (jVar instanceof d) {
                ((d) jVar).e();
            }
        }
        handler = this.a.f;
        handler.post(new c(this, this.b));
    }
}
