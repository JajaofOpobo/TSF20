package com.tsf.extend.wallpaper;

import android.graphics.Bitmap;
import java.io.Serializable;
import java.lang.ref.SoftReference;
/* loaded from: classes.dex */
public class s implements Serializable {
    private transient SoftReference<Bitmap> a;
    private transient SoftReference<Bitmap> b;

    public Bitmap r() {
        if (this.a == null) {
            return null;
        }
        return this.a.get();
    }

    public void a(Bitmap bitmap) {
        this.a = new SoftReference<>(bitmap);
    }

    public Bitmap s() {
        if (this.b == null) {
            return null;
        }
        return this.b.get();
    }

    public void b(Bitmap bitmap) {
        this.b = new SoftReference<>(bitmap);
    }
}
