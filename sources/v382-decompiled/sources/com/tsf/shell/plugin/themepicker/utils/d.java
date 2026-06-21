package com.tsf.shell.plugin.themepicker.utils;

import android.annotation.TargetApi;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

@TargetApi(11)
/* loaded from: classes.dex */
class d implements Executor {
    final ArrayDeque a;
    Runnable b;

    private d() {
        this.a = new ArrayDeque();
    }

    /* synthetic */ d(d dVar) {
        this();
    }

    @Override // java.util.concurrent.Executor
    public synchronized void execute(final Runnable runnable) {
        this.a.offer(new Runnable() { // from class: com.tsf.shell.plugin.themepicker.utils.d.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    runnable.run();
                } finally {
                    d.this.a();
                }
            }
        });
        if (this.b == null) {
            a();
        }
    }

    protected synchronized void a() {
        Runnable runnable = (Runnable) this.a.poll();
        this.b = runnable;
        if (runnable != null) {
            a.b.execute(this.b);
        }
    }
}
