package com.tsf.shell.plugin.iconpicker.c;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

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
        Resources resources;
        Context context;
        Bitmap a;
        Handler handler;
        Bitmap bitmap = null;
        if (!this.a.m) {
            resources = this.a.d;
            if (resources != null) {
                try {
                    context = this.a.c;
                    InputStream open = context.getAssets().open("theme/icon/" + this.a.j[this.b]);
                    bitmap = BitmapFactory.decodeStream(new BufferedInputStream(open));
                    open.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } else {
            bitmap = this.a.a((String) this.a.k.get(this.b));
        }
        a = this.a.a(Integer.valueOf(this.b), bitmap);
        handler = this.a.g;
        handler.post(new d(this, this.c, this.b, a, this.d));
    }
}
