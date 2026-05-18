package com.android.volley;

import android.os.Process;
import com.android.volley.b;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
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
                final l<?> lVarTake = this.b.take();
                lVarTake.a("cache-queue-take");
                if (lVarTake.h()) {
                    lVarTake.b("cache-discard-canceled");
                } else {
                    b.a aVarA = this.d.a(lVarTake.e());
                    if (aVarA == null) {
                        lVarTake.a("cache-miss");
                        this.c.put(lVarTake);
                    } else if (aVarA.a()) {
                        lVarTake.a("cache-hit-expired");
                        lVarTake.a(aVarA);
                        this.c.put(lVarTake);
                    } else {
                        lVarTake.a("cache-hit");
                        n<?> nVarA = lVarTake.a(new i(aVarA.a, aVarA.g));
                        lVarTake.a("cache-hit-parsed");
                        if (!aVarA.b()) {
                            this.e.a(lVarTake, nVarA);
                        } else {
                            lVarTake.a("cache-hit-refresh-needed");
                            lVarTake.a(aVarA);
                            nVarA.d = true;
                            this.e.a(lVarTake, nVarA, new Runnable() { // from class: com.android.volley.c.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    try {
                                        c.this.c.put(lVarTake);
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
