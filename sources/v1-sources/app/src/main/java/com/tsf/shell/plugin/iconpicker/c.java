package com.tsf.shell.plugin.iconpicker;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class c extends ThreadPoolExecutor {
    public c() {
        super(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue());
    }

    public final void a() {
        synchronized (this) {
            getQueue().clear();
        }
    }
}
