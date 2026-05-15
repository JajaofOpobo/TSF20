package com.tsf.shell.plugin.themepicker.utils;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
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

    /* JADX WARN: Removed duplicated region for block: B:10:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized boolean b() {
        /*
            r1 = this;
            monitor-enter(r1)
            android.graphics.Bitmap r0 = r1.getBitmap()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L10
            boolean r0 = r0.isRecycled()     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto L10
            r0 = 1
        Le:
            monitor-exit(r1)
            return r0
        L10:
            r0 = 0
            goto Le
        L12:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.shell.plugin.themepicker.utils.g.b():boolean");
    }
}
