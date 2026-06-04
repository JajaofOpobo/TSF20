package com.tsf.shell;

/* loaded from: classes.dex */
final class bs implements Runnable {
    final /* synthetic */ bq a;

    bs(bq bqVar) {
        this.a = bqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Home.d().onInitialzeDataComplete();
    }
}
