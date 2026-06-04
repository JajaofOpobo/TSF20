package com.flurry.android;

import java.lang.Thread;

/* loaded from: classes.dex */
public final class u implements Thread.UncaughtExceptionHandler {
    private Thread.UncaughtExceptionHandler a = Thread.getDefaultUncaughtExceptionHandler();

    u() {
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            t.a.a(th);
        } catch (Throwable th2) {
            Cdo.b("FlurryAgent", "", th2);
        }
        if (this.a != null) {
            this.a.uncaughtException(thread, th);
        }
    }
}
