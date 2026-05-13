package com.flurry.sdk;

import java.io.PrintStream;
import java.io.PrintWriter;
/* renamed from: com.flurry.sdk.ff */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC1278ff implements Runnable {

    /* renamed from: a */
    private static final String f4050a = AbstractRunnableC1278ff.class.getSimpleName();

    /* renamed from: g */
    PrintStream f4051g;

    /* renamed from: h */
    PrintWriter f4052h;

    /* renamed from: a */
    public abstract void mo9140a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            mo9140a();
        } catch (Throwable th) {
            if (this.f4051g != null) {
                th.printStackTrace(this.f4051g);
            } else if (this.f4052h != null) {
                th.printStackTrace(this.f4052h);
            } else {
                th.printStackTrace();
            }
            C1258eo.m9233a(6, f4050a, "", th);
        }
    }
}
