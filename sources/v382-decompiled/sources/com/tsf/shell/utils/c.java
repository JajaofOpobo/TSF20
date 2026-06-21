package com.tsf.shell.utils;

import android.graphics.Bitmap;
import java.lang.ref.SoftReference;

/* loaded from: classes.dex */
public class c {
    private SoftReference a;

    public Bitmap a() {
        if (this.a == null || this.a.get() == null || ((Bitmap) this.a.get()).isRecycled()) {
            return null;
        }
        return (Bitmap) this.a.get();
    }

    public void a(Bitmap bitmap) {
        b();
        this.a = new SoftReference(bitmap);
    }

    public void b() {
        if (this.a != null && this.a.get() != null && !((Bitmap) this.a.get()).isRecycled()) {
            ((Bitmap) this.a.get()).recycle();
            this.a = null;
        }
    }
}
