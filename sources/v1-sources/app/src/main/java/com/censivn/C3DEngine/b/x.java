package com.censivn.C3DEngine.b;

import java.util.HashMap;

/* loaded from: classes.dex */
final class x implements Runnable {
    final /* synthetic */ w a;
    private final /* synthetic */ Runnable b;

    x(w wVar, Runnable runnable) {
        this.a = wVar;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap;
        hashMap = this.a.a;
        hashMap.remove(this.b);
        this.a.c(this.b);
    }
}
