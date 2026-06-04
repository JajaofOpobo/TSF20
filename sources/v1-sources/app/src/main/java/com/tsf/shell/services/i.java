package com.tsf.shell.services;

import android.os.Binder;

/* loaded from: classes.dex */
public final class i extends Binder {
    final /* synthetic */ ForegroundService a;

    public i(ForegroundService foregroundService) {
        this.a = foregroundService;
    }

    final ForegroundService a() {
        return this.a;
    }
}
