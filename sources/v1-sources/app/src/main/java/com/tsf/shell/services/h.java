package com.tsf.shell.services;

/* loaded from: classes.dex */
final class h extends Thread {
    final /* synthetic */ ForegroundService a;

    h(ForegroundService foregroundService) {
        this.a = foregroundService;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ForegroundService foregroundService = this.a;
        ForegroundService.a();
    }
}
