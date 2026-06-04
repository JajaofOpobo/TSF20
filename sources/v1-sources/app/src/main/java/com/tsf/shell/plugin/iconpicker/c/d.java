package com.tsf.shell.plugin.iconpicker.c;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;

/* loaded from: classes.dex */
final class d implements Runnable {
    final /* synthetic */ c a;
    private final /* synthetic */ ImageView b;
    private final /* synthetic */ int c;
    private final /* synthetic */ Bitmap d;
    private final /* synthetic */ View e;

    d(c cVar, ImageView imageView, int i, Bitmap bitmap, View view) {
        this.a = cVar;
        this.b = imageView;
        this.c = i;
        this.d = bitmap;
        this.e = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Integer num = (Integer) this.b.getTag();
        if (num != null && num.intValue() == this.c) {
            this.b.setImageBitmap(this.d);
            this.b.setVisibility(0);
            this.e.setVisibility(8);
        }
    }
}
