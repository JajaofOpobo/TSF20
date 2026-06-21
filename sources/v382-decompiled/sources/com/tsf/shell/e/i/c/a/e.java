package com.tsf.shell.e.i.c.a;

import android.annotation.TargetApi;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

@TargetApi(11)
/* loaded from: classes.dex */
class e implements Executor {
    final ArrayDeque a;
    Runnable b;

    private e() {
        this.a = new ArrayDeque();
    }

    /* synthetic */ e(e eVar) {
        this();
    }

    @Override // java.util.concurrent.Executor
    public synchronized void execute(final Runnable runnable) {
        this.a.offer(new Runnable() { // from class: com.tsf.shell.e.i.c.a.e.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    runnable.run();
                } finally {
                    e.this.a();
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
            d.a.execute(this.b);
        }
    }
}
