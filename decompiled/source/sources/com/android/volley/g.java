package com.android.volley;

import android.annotation.TargetApi;
import android.net.TrafficStats;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;
/* loaded from: classes.dex */
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
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                l<?> take = this.a.take();
                try {
                    take.a("network-queue-take");
                    if (take.h()) {
                        take.b("network-discard-cancelled");
                    } else {
                        a(take);
                        i a = this.b.a(take);
                        take.a("network-http-complete");
                        if (a.d && take.w()) {
                            take.b("not-modified");
                        } else {
                            n<?> a2 = take.a(a);
                            take.a("network-parse-complete");
                            if (take.r() && a2.b != null) {
                                this.c.a(take.e(), a2.b);
                                take.a("network-cache-written");
                            }
                            take.v();
                            this.d.a(take, a2);
                        }
                    }
                } catch (s e) {
                    e.a(SystemClock.elapsedRealtime() - elapsedRealtime);
                    a(take, e);
                } catch (Exception e2) {
                    t.a(e2, "Unhandled exception %s", e2.toString());
                    s sVar = new s(e2);
                    sVar.a(SystemClock.elapsedRealtime() - elapsedRealtime);
                    this.d.a(take, sVar);
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
