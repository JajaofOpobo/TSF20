package com.android.volley;

import android.os.Handler;
import java.util.concurrent.Executor;
/* renamed from: com.android.volley.e */
/* loaded from: classes.dex */
public class C0786e implements InterfaceC0805o {

    /* renamed from: a */
    private final Executor f2269a;

    public C0786e(final Handler handler) {
        this.f2269a = new Executor() { // from class: com.android.volley.e.1
            @Override // java.util.concurrent.Executor
            public void execute(Runnable runnable) {
                handler.post(runnable);
            }
        };
    }

    @Override // com.android.volley.InterfaceC0805o
    /* renamed from: a */
    public void mo10999a(AbstractC0795l<?> abstractC0795l, C0802n<?> c0802n) {
        mo10998a(abstractC0795l, c0802n, null);
    }

    @Override // com.android.volley.InterfaceC0805o
    /* renamed from: a */
    public void mo10998a(AbstractC0795l<?> abstractC0795l, C0802n<?> c0802n, Runnable runnable) {
        abstractC0795l.m11013v();
        abstractC0795l.mo6644a("post-response");
        this.f2269a.execute(new RunnableC0788a(abstractC0795l, c0802n, runnable));
    }

    @Override // com.android.volley.InterfaceC0805o
    /* renamed from: a */
    public void mo10997a(AbstractC0795l<?> abstractC0795l, C0809s c0809s) {
        abstractC0795l.mo6644a("post-error");
        this.f2269a.execute(new RunnableC0788a(abstractC0795l, C0802n.m11001a(c0809s), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.android.volley.e$a */
    /* loaded from: classes.dex */
    public static class RunnableC0788a implements Runnable {

        /* renamed from: a */
        private final AbstractC0795l f2272a;

        /* renamed from: b */
        private final C0802n f2273b;

        /* renamed from: c */
        private final Runnable f2274c;

        public RunnableC0788a(AbstractC0795l abstractC0795l, C0802n c0802n, Runnable runnable) {
            this.f2272a = abstractC0795l;
            this.f2273b = c0802n;
            this.f2274c = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f2272a.m11021h()) {
                this.f2272a.m11028b("canceled-at-delivery");
                return;
            }
            if (this.f2273b.m11002a()) {
                this.f2272a.mo7365a((AbstractC0795l) this.f2273b.f2320a);
            } else {
                this.f2272a.m11029b(this.f2273b.f2322c);
            }
            if (this.f2273b.f2323d) {
                this.f2272a.mo6644a("intermediate-response");
            } else {
                this.f2272a.m11028b("done");
            }
            if (this.f2274c != null) {
                this.f2274c.run();
            }
            this.f2273b.f2320a = null;
            this.f2273b.f2321b = null;
        }
    }
}
