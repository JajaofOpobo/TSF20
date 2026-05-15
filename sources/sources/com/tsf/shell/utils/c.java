package com.tsf.shell.utils;

import android.graphics.Bitmap;
import java.lang.ref.SoftReference;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class c {
    private SoftReference<Bitmap> a;

    public Bitmap a() {
        if (this.a == null || this.a.get() == null || this.a.get().isRecycled()) {
            return null;
        }
        return this.a.get();
    }

    public void a(Bitmap bitmap) {
        b();
        this.a = new SoftReference<>(bitmap);
    }

    public void b() {
        if (this.a != null && this.a.get() != null && !this.a.get().isRecycled()) {
            this.a.get().recycle();
            this.a = null;
        }
    }
}
