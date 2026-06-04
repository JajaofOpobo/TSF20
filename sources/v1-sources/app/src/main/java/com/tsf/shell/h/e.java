package com.tsf.shell.h;

import android.graphics.Bitmap;
import java.lang.ref.SoftReference;

/* loaded from: classes.dex */
final class e implements Runnable {
    final /* synthetic */ d a;

    e(d dVar) {
        this.a = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        SoftReference softReference;
        SoftReference softReference2;
        if (!this.a.b.a) {
            obj = this.a.e;
            synchronized (obj) {
                softReference = this.a.f;
                if (softReference != null) {
                    softReference2 = this.a.f;
                    Bitmap bitmap = (Bitmap) softReference2.get();
                    if (bitmap != null) {
                        this.a.b.a(bitmap);
                    }
                }
            }
        }
    }
}
