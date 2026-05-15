package com.flurry.sdk;

import com.flurry.sdk.fb;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class fa {
    private static long a = 1000;
    private static fa b = null;
    private final fb c = new fb();

    public static synchronized fa a() {
        if (b == null) {
            b = new fa();
        }
        return b;
    }

    public fa() {
        this.c.a(a);
        this.c.a(true);
    }

    public synchronized void a(fb.a aVar) {
        this.c.a(aVar);
        if (!this.c.c() && this.c.d() > 0) {
            this.c.a();
        }
    }

    public synchronized boolean b(fb.a aVar) {
        boolean zB;
        zB = this.c.b(aVar);
        if (this.c.d() == 0) {
            this.c.b();
        }
        return zB;
    }
}
