package com.tsf.shell.plugin.themepicker.utils;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
/* loaded from: classes.dex */
public class g extends BitmapDrawable {
    private int a;
    private int b;
    private boolean c;

    public g(Resources resources, Bitmap bitmap) {
        super(resources, bitmap);
        this.a = 0;
        this.b = 0;
    }

    public void a(boolean z) {
        synchronized (this) {
            if (z) {
                this.b++;
                this.c = true;
            } else {
                this.b--;
            }
        }
        a();
    }

    public void b(boolean z) {
        synchronized (this) {
            if (z) {
                this.a++;
            } else {
                this.a--;
            }
        }
        a();
    }

    private synchronized void a() {
        if (this.a <= 0 && this.b <= 0 && this.c && b()) {
            com.tsf.shell.plugin.themepicker.e.a("CountingBitmapDrawable", "No longer being used or cached so recycling. " + toString());
            getBitmap().recycle();
        }
    }

    private synchronized boolean b() {
        boolean z;
        Bitmap bitmap = getBitmap();
        if (bitmap != null) {
            z = bitmap.isRecycled() ? false : true;
        }
        return z;
    }
}
