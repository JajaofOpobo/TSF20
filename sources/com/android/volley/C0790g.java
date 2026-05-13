package com.android.volley;

import android.annotation.TargetApi;
import android.net.TrafficStats;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;
/* renamed from: com.android.volley.g */
/* loaded from: classes.dex */
public class C0790g extends Thread {

    /* renamed from: a */
    private final BlockingQueue<AbstractC0795l<?>> f2275a;

    /* renamed from: b */
    private final InterfaceC0789f f2276b;

    /* renamed from: c */
    private final InterfaceC0781b f2277c;

    /* renamed from: d */
    private final InterfaceC0805o f2278d;

    /* renamed from: e */
    private volatile boolean f2279e = false;

    public C0790g(BlockingQueue<AbstractC0795l<?>> blockingQueue, InterfaceC0789f interfaceC0789f, InterfaceC0781b interfaceC0781b, InterfaceC0805o interfaceC0805o) {
        this.f2275a = blockingQueue;
        this.f2276b = interfaceC0789f;
        this.f2277c = interfaceC0781b;
        this.f2278d = interfaceC0805o;
    }

    /* renamed from: a */
    public void m11042a() {
        this.f2279e = true;
        interrupt();
    }

    @TargetApi(14)
    /* renamed from: a */
    private void m11041a(AbstractC0795l<?> abstractC0795l) {
        if (Build.VERSION.SDK_INT >= 14) {
            TrafficStats.setThreadStatsTag(abstractC0795l.m11027c());
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Process.setThreadPriority(10);
        while (true) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                AbstractC0795l<?> take = this.f2275a.take();
                try {
                    take.mo6644a("network-queue-take");
                    if (take.m11021h()) {
                        take.m11028b("network-discard-cancelled");
                    } else {
                        m11041a(take);
                        C0792i mo6419a = this.f2276b.mo6419a(take);
                        take.mo6644a("network-http-complete");
                        if (mo6419a.f2283d && take.m11012w()) {
                            take.m11028b("not-modified");
                        } else {
                            C0802n<?> mo6646a = take.mo6646a(mo6419a);
                            take.mo6644a("network-parse-complete");
                            if (take.m11016r() && mo6646a.f2321b != null) {
                                this.f2277c.mo8835a(take.m11024e(), mo6646a.f2321b);
                                take.mo6644a("network-cache-written");
                            }
                            take.m11013v();
                            this.f2278d.mo10999a(take, mo6646a);
                        }
                    }
                } catch (C0809s e) {
                    e.m10993a(SystemClock.elapsedRealtime() - elapsedRealtime);
                    m11040a(take, e);
                } catch (Exception e2) {
                    C0810t.m10991a(e2, "Unhandled exception %s", e2.toString());
                    C0809s c0809s = new C0809s(e2);
                    c0809s.m10993a(SystemClock.elapsedRealtime() - elapsedRealtime);
                    this.f2278d.mo10997a(take, c0809s);
                }
            } catch (InterruptedException e3) {
                if (this.f2279e) {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    private void m11040a(AbstractC0795l<?> abstractC0795l, C0809s c0809s) {
        this.f2278d.mo10997a(abstractC0795l, abstractC0795l.mo6645a(c0809s));
    }
}
