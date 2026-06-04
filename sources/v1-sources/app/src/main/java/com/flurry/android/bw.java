package com.flurry.android;

/* loaded from: classes.dex */
abstract class bw implements Runnable {
    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Throwable th) {
            th.printStackTrace();
            Cdo.b("FlurryAgent", "", th);
        }
    }
}
