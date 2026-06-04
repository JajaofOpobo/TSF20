package com.tsf.shell.plugin.iconpicker.a;

import android.content.Context;
import android.view.View;

/* loaded from: classes.dex */
final class b implements Runnable {
    final /* synthetic */ a a;
    private final /* synthetic */ String b;
    private final /* synthetic */ View c = null;

    b(a aVar, String str) {
        this.a = aVar;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        a aVar = this.a;
        a aVar2 = this.a;
        context = this.a.c;
        aVar.j = a.a(context, this.b);
        this.a.i = true;
        this.a.a(this.c);
    }
}
