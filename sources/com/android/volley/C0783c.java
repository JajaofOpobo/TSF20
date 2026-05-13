package com.android.volley;

import android.os.Process;
import com.android.volley.InterfaceC0781b;
import java.util.concurrent.BlockingQueue;
/* renamed from: com.android.volley.c */
/* loaded from: classes.dex */
public class C0783c extends Thread {

    /* renamed from: a */
    private static final boolean f2257a = C0810t.f2327b;

    /* renamed from: b */
    private final BlockingQueue<AbstractC0795l<?>> f2258b;

    /* renamed from: c */
    private final BlockingQueue<AbstractC0795l<?>> f2259c;

    /* renamed from: d */
    private final InterfaceC0781b f2260d;

    /* renamed from: e */
    private final InterfaceC0805o f2261e;

    /* renamed from: f */
    private volatile boolean f2262f = false;

    public C0783c(BlockingQueue<AbstractC0795l<?>> blockingQueue, BlockingQueue<AbstractC0795l<?>> blockingQueue2, InterfaceC0781b interfaceC0781b, InterfaceC0805o interfaceC0805o) {
        this.f2258b = blockingQueue;
        this.f2259c = blockingQueue2;
        this.f2260d = interfaceC0781b;
        this.f2261e = interfaceC0805o;
    }

    /* renamed from: a */
    public void m11045a() {
        this.f2262f = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        if (f2257a) {
            C0810t.m10992a("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f2260d.mo8842a();
        while (true) {
            try {
                final AbstractC0795l<?> take = this.f2258b.take();
                take.mo6644a("cache-queue-take");
                if (take.m11021h()) {
                    take.m11028b("cache-discard-canceled");
                } else {
                    InterfaceC0781b.C0782a mo8836a = this.f2260d.mo8836a(take.m11024e());
                    if (mo8836a == null) {
                        take.mo6644a("cache-miss");
                        this.f2259c.put(take);
                    } else if (mo8836a.m11047a()) {
                        take.mo6644a("cache-hit-expired");
                        take.m11037a(mo8836a);
                        this.f2259c.put(take);
                    } else {
                        take.mo6644a("cache-hit");
                        C0802n<?> mo6646a = take.mo6646a(new C0792i(mo8836a.f2250a, mo8836a.f2256g));
                        take.mo6644a("cache-hit-parsed");
                        if (!mo8836a.m11046b()) {
                            this.f2261e.mo10999a(take, mo6646a);
                        } else {
                            take.mo6644a("cache-hit-refresh-needed");
                            take.m11037a(mo8836a);
                            mo6646a.f2323d = true;
                            this.f2261e.mo10998a(take, mo6646a, new Runnable() { // from class: com.android.volley.c.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    try {
                                        C0783c.this.f2259c.put(take);
                                    } catch (InterruptedException e) {
                                    }
                                }
                            });
                        }
                    }
                }
            } catch (InterruptedException e) {
                if (this.f2262f) {
                    return;
                }
            }
        }
    }
}
