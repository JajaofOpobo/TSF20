package com.flurry.sdk;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
/* renamed from: com.flurry.sdk.do */
/* loaded from: classes.dex */
public class C1211do {

    /* renamed from: a */
    private static C1211do f3887a;

    /* renamed from: b */
    private final Context f3888b;

    /* renamed from: c */
    private final Handler f3889c = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    private final Handler f3890d;

    /* renamed from: a */
    public static synchronized void m9389a(Context context) {
        synchronized (C1211do.class) {
            if (f3887a == null) {
                if (context == null) {
                    throw new IllegalArgumentException("Context cannot be null");
                }
                f3887a = new C1211do(context);
            }
        }
    }

    /* renamed from: a */
    public static C1211do m9390a() {
        return f3887a;
    }

    private C1211do(Context context) {
        this.f3888b = context.getApplicationContext();
        HandlerThread handlerThread = new HandlerThread("FlurryAgent");
        handlerThread.start();
        this.f3890d = new Handler(handlerThread.getLooper());
    }

    /* renamed from: b */
    public Context m9386b() {
        return this.f3888b;
    }

    /* renamed from: c */
    public PackageManager m9383c() {
        return this.f3888b.getPackageManager();
    }

    /* renamed from: a */
    public void m9388a(Runnable runnable) {
        if (runnable != null) {
            this.f3889c.post(runnable);
        }
    }

    /* renamed from: a */
    public void m9387a(Runnable runnable, long j) {
        if (runnable != null) {
            this.f3889c.postDelayed(runnable, j);
        }
    }

    /* renamed from: b */
    public void m9385b(Runnable runnable) {
        if (runnable != null) {
            this.f3889c.removeCallbacks(runnable);
        }
    }

    /* renamed from: c */
    public void m9382c(Runnable runnable) {
        if (runnable != null) {
            this.f3890d.post(runnable);
        }
    }

    /* renamed from: b */
    public void m9384b(Runnable runnable, long j) {
        if (runnable != null) {
            this.f3890d.postDelayed(runnable, j);
        }
    }

    /* renamed from: d */
    public void m9381d(Runnable runnable) {
        if (runnable != null) {
            this.f3890d.removeCallbacks(runnable);
        }
    }
}
