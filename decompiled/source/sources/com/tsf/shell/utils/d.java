package com.tsf.shell.utils;

import android.graphics.Bitmap;
import java.lang.ref.SoftReference;
/* loaded from: classes.dex */
public class d {
    private SoftReference<Bitmap> a;
    private int b;
    private int c;

    public d(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    public Bitmap a() {
        if (this.a == null || this.a.get() == null || this.a.get().isRecycled()) {
            this.a = new SoftReference<>(b());
        }
        return this.a.get();
    }

    public Bitmap b() {
        return Bitmap.createBitmap(this.b, this.c, Bitmap.Config.ARGB_8888);
    }
}
