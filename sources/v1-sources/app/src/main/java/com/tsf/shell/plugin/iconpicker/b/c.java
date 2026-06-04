package com.tsf.shell.plugin.iconpicker.b;

import android.graphics.Bitmap;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;

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

    /* JADX WARN: Code restructure failed: missing block: B:3:0x000e, code lost:
    
        r4 = r7.a.a(((java.lang.Integer) r7.a.j.get(r7.b)).intValue());
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Bitmap a;
        Handler handler;
        a = this.a.a(Integer.valueOf(this.b));
        if (a == null && a != null) {
            a = this.a.a(Integer.valueOf(this.b), a);
        }
        handler = this.a.g;
        handler.post(new d(this, this.c, this.b, a, this.d));
    }
}
