package com.tsf.shell.plugin.iconpicker.c;

import android.content.Context;
import android.view.View;

/* loaded from: classes.dex */
final class b implements Runnable {
    final /* synthetic */ a a;
    private final /* synthetic */ Context b;
    private final /* synthetic */ String c;
    private final /* synthetic */ View d = null;

    b(a aVar, Context context, String str) {
        this.a = aVar;
        this.b = context;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a aVar = this.a;
        Context context = this.b;
        a.a(aVar, this.c);
        this.a.i = true;
        this.a.a(this.d);
    }
}
