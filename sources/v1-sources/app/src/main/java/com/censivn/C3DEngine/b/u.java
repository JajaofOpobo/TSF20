package com.censivn.C3DEngine.b;

/* loaded from: classes.dex */
final class u implements Runnable {
    final /* synthetic */ r a;

    u(r rVar) {
        this.a = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.ai();
    }
}
