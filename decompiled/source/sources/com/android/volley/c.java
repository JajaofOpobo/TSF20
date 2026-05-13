package com.android.volley;

import android.os.Process;
import com.android.volley.b;
import java.util.concurrent.BlockingQueue;
/* loaded from: classes.dex */
public class c extends Thread {
    private static final boolean a = t.b;
    private final BlockingQueue<l<?>> b;
    private final BlockingQueue<l<?>> c;
    private final b d;
    private final o e;
    private volatile boolean f = false;

    public c(BlockingQueue<l<?>> blockingQueue, BlockingQueue<l<?>> blockingQueue2, b bVar, o oVar) {
        this.b = blockingQueue;
        this.c = blockingQueue2;
        this.d = bVar;
        this.e = oVar;
    }

    public void a() {
        this.f = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        if (a) {
            t.a("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.d.a();
        while (true) {
            try {
                final l<?> take = this.b.take();
                take.a("cache-queue-take");
                if (take.h()) {
                    take.b("cache-discard-canceled");
                } else {
                    b.a a2 = this.d.a(take.e());
                    if (a2 == null) {
                        take.a("cache-miss");
                        this.c.put(take);
                    } else if (a2.a()) {
                        take.a("cache-hit-expired");
                        take.a(a2);
                        this.c.put(take);
                    } else {
                        take.a("cache-hit");
                        n<?> a3 = take.a(new i(a2.a, a2.g));
                        take.a("cache-hit-parsed");
                        if (!a2.b()) {
                            this.e.a(take, a3);
                        } else {
                            take.a("cache-hit-refresh-needed");
                            take.a(a2);
                            a3.d = true;
                            this.e.a(take, a3, new Runnable() { // from class: com.android.volley.c.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    try {
                                        c.this.c.put(take);
                                    } catch (InterruptedException e) {
                                    }
                                }
                            });
                        }
                    }
                }
            } catch (InterruptedException e) {
                if (this.f) {
                    return;
                }
            }
        }
    }
}
