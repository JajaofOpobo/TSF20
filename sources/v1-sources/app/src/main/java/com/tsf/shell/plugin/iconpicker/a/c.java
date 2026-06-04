package com.tsf.shell.plugin.iconpicker.a;

import android.graphics.Bitmap;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import java.util.List;

/* loaded from: classes.dex */
final class c implements Runnable {
    final /* synthetic */ a a;
    private final /* synthetic */ int b;
    private final /* synthetic */ ImageView c;
    private final /* synthetic */ View d;

    c(a aVar, int i, ImageView imageView, View view) {
        this.a = aVar;
        this.b = i;
        this.c = imageView;
        this.d = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bitmap a;
        Handler handler;
        List list;
        a = this.a.a(Integer.valueOf(this.b));
        if (a == null) {
            a aVar = this.a;
            list = this.a.j;
            a = aVar.a(((Integer) list.get(this.b)).intValue());
            if (a != null) {
                a = this.a.a(Integer.valueOf(this.b), a);
            }
        }
        handler = this.a.g;
        handler.post(new d(this, this.c, this.b, a, this.d));
    }
}
