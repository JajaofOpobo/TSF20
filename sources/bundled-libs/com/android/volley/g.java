package com.android.volley;

import android.annotation.TargetApi;
import android.net.TrafficStats;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class g extends Thread {
    private final BlockingQueue<l<?>> a;
    private final f b;
    private final b c;
    private final o d;
    private volatile boolean e = false;

    public g(BlockingQueue<l<?>> blockingQueue, f fVar, b bVar, o oVar) {
        this.a = blockingQueue;
        this.b = fVar;
        this.c = bVar;
        this.d = oVar;
    }

    public void a() {
        this.e = true;
        interrupt();
    }

    @TargetApi(14)
    private void a(l<?> lVar) {
        if (Build.VERSION.SDK_INT >= 14) {
            TrafficStats.setThreadStatsTag(lVar.c());
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Process.setThreadPriority(10);
        while (true) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            try {
                l<?> lVarTake = this.a.take();
                try {
                    lVarTake.a("network-queue-take");
                    if (lVarTake.h()) {
                        lVarTake.b("network-discard-cancelled");
                    } else {
                        a(lVarTake);
                        i iVarA = this.b.a(lVarTake);
                        lVarTake.a("network-http-complete");
                        if (iVarA.d && lVarTake.w()) {
                            lVarTake.b("not-modified");
                        } else {
                            n<?> nVarA = lVarTake.a(iVarA);
                            lVarTake.a("network-parse-complete");
                            if (lVarTake.r() && nVarA.b != null) {
                                this.c.a(lVarTake.e(), nVarA.b);
                                lVarTake.a("network-cache-written");
                            }
                            lVarTake.v();
                            this.d.a(lVarTake, nVarA);
                        }
                    }
                } catch (s e) {
                    e.a(SystemClock.elapsedRealtime() - jElapsedRealtime);
                    a(lVarTake, e);
                } catch (Exception e2) {
                    t.a(e2, "Unhandled exception %s", e2.toString());
                    s sVar = new s(e2);
                    sVar.a(SystemClock.elapsedRealtime() - jElapsedRealtime);
                    this.d.a(lVarTake, sVar);
                }
            } catch (InterruptedException e3) {
                if (this.e) {
                    return;
                }
            }
        }
    }

    private void a(l<?> lVar, s sVar) {
        this.d.a(lVar, lVar.a(sVar));
    }
}
